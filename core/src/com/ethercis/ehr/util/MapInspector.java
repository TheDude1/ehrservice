/*
 * Copyright (c) 2015 Christian Chevalley
 * This file is part of Project Ethercis
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ethercis.ehr.util;

import com.ethercis.ehr.encode.CompositionSerializer;
import com.ethercis.ehr.encode.DvDateAdapter;
import com.ethercis.ehr.encode.DvDateTimeAdapter;
import com.ethercis.ehr.encode.VBeanUtil;
import com.ethercis.ehr.encode.wrappers.ParticipationVBean;
import com.ethercis.ehr.keyvalues.I_PathValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;
import org.openehr.rm.common.generic.Participation;
import org.openehr.rm.common.generic.PartyIdentified;
import org.openehr.rm.datatypes.basic.DataValue;
import org.openehr.rm.datatypes.encapsulated.DvParsable;
import org.openehr.rm.datatypes.quantity.DvInterval;
import org.openehr.rm.datatypes.quantity.datetime.DvDate;
import org.openehr.rm.datatypes.quantity.datetime.DvDateTime;

import java.io.Reader;
import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by Christian Chevalley on 4/4/2015.
 */
public class MapInspector {

    private Deque<Map<String, Object>> stack;
    static Logger log = Logger.getLogger(MapInspector.class);
    public static final String TAG_OBJECT =  "$OBJECT$";

    public MapInspector(){
        this.stack = new ArrayDeque<>();
    }

    public void inspect(Map<String, Object> map) throws Exception {
        mapInspect(map);

        //recursion termination
        if (!(stack.isEmpty())){ //build object for the preceding class...
            Map<String, Object> current = stack.getFirst();
            log.debug("Building object for class " + current.get(CompositionSerializer.TAG_CLASS));
            generateObject(current);
        }
    }

    public void inspect(Map<String, Object> map, boolean clear) throws Exception {
        if (clear)
            stack.clear();
        inspect(map);
    }

    public void inspect(Reader jsonReader) throws Exception {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(DvDateTime.class, new DvDateTimeAdapter());
        builder.registerTypeAdapter(DvDate.class, new DvDateAdapter());
        Gson gson = builder.setPrettyPrinting().create();

        Map<String, Object> retmap = gson.fromJson(jsonReader, TreeMap.class);

        inspect(retmap);
    }

    public void inspect(Reader jsonReader, boolean clear) throws Exception {
        if (clear)
            stack.clear();
        inspect(jsonReader);
    }

    public Deque<Map<String, Object>> getStack(){
        return stack;
    }

    public Map<String, String> getStackFlatten(){
        Map<String, String> retMap = new TreeMap<>();

        for (Object o : stack) {
            Map<String, Object> map = (Map) o;
            String path = (String) map.get(CompositionSerializer.TAG_PATH);
            Object object = map.get(CompositionSerializer.TAG_VALUE);
            if (object instanceof Participation) {
                Participation participation = (Participation) object;
                retMap.put(path + I_PathValue.PARTICIPATION_FUNCTION_SUBTAG, participation.getFunction().getValue());
                PartyIdentified performer = (PartyIdentified) participation.getPerformer();
                retMap.put(path + I_PathValue.IDENTIFIER_PARTY_NAME_SUBTAG, performer.getName());
                retMap.put(path + I_PathValue.IDENTIFIER_PARTY_ID_SUBTAG, performer.getExternalRef().getId().getValue());
                retMap.put(path + I_PathValue.PARTICIPATION_MODE_SUBTAG, participation.getMode().toString());

            }
            else if (object instanceof DvParsable)
                retMap.put(path, ((DvParsable) object).getValue());
            else if (object instanceof DvInterval) {
                DvInterval interval = (DvInterval) object;
                String lowerValue = (interval.getLower() != null ? interval.getLower().toString() : "[null]");
                String upperValue = (interval.getUpper() != null ? interval.getUpper().toString() : "[null]");
                retMap.put(path, lowerValue +"::"+upperValue);
            }
            else if (object != null)
                retMap.put(path, object.toString());
            else
                log.error("no mapping for object map:" + map);
        }
        return retMap;
    }

    private void generateObject(Map<String, Object> attributes) throws Exception {

        if (attributes.containsKey(TAG_OBJECT) && attributes.get(TAG_OBJECT) != null) //the object may have been supplied depending on the context
            //make sure the created object is a DataValue, otherwise create a new one...
            if (attributes.get(TAG_OBJECT) instanceof DataValue)
                return;

        String className = (String)attributes.get(CompositionSerializer.TAG_CLASS);

        if (className == null){
            log.error("NULL className found for " + attributes);
            throw new IllegalArgumentException("NULL class name found for attributes:"+attributes);
        }

        className += "VBean";

        Class clazz = Class.forName("com.ethercis.ehr.encode.wrappers."+className);
        Method method = clazz.getDeclaredMethod("getInstance", Map.class);

        Object object;

        try {
            object = method.invoke(null, attributes); //static call of method
        } catch (Exception e){
            throw new IllegalArgumentException("Could not invoke constructor for class:"+clazz+ " attributes:"+attributes+" exception:"+e);
        }

        try {
            attributes.put(TAG_OBJECT, object);
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException("Could not add object:"+object);
        }

    }

    private void addObjectAttributesOnStack(String key, Object value) throws IllegalArgumentException {
        if (stack.isEmpty()) {
            Map<String, Object> objectAttributes = new HashMap<>();
            stack.push(objectAttributes);
//            throw new IllegalArgumentException("Inconsistent entry PATH in JSON structure " + value);
        }
        Map<String, Object> current = stack.getFirst();
        current.put(key, value);
    }

    private void mapInspect(Map<String, Object> map) throws Exception {
        for (Map.Entry<String, Object> node: map.entrySet()){
            String key = node.getKey();
            Object value = node.getValue();

            if (key.equals(VBeanUtil.TAG_VALUE_AS_STRING)){
                log.debug("VALUE AS STRING ------->");
                //it is expected to have a DataValue object here...
                if (value instanceof Map){ //build object for the preceding class...
                    Map<String, Object> current = stack.getFirst();
//                    log.debug("Building object for class" + current.get(CompWalker.TAG_CLASS));
                    current.put(TAG_OBJECT, ((Map) value).get("value"));
                }
//                continue;
            }
            else if (key.equals(CompositionSerializer.TAG_CLASS)) { //new map object, trigger to add a new entry on stack
                //if there is a value as string don't create an instance
//                if (map.containsKey(VBeanUtil.TAG_VALUE_AS_STRING))
//                    continue;

                if (!(stack.isEmpty())){ //build object for the preceding class...
                    Map<String, Object> current = stack.getFirst();
                    log.debug("Building object for class " + current.get(CompositionSerializer.TAG_CLASS));
                    generateObject(current);
                }

//                Map<String, Object> objectAttributes = new HashMap<>();
//                objectAttributes.put(key, value);
//                stack.push(objectAttributes);
            }
//            else if (key.equals(CompositionSerializer.TAG_PATH)) {
//                addObjectAttributesOnStack(key, value);
//            }


            if (!isElementMetaData(key) && value instanceof String){
                addObjectAttributesOnStack(key, value);
                log.debug(key + "=" + value);
            }
            else if (value instanceof Map){
                if (key.equals(CompositionSerializer.TAG_VALUE)){ //a map of values...
                    if (!((Map) value).containsKey(CompositionSerializer.TAG_CLASS)){
                        //ensure the object can be rebuilt...
                        ((Map) value).put(CompositionSerializer.TAG_CLASS, map.get(CompositionSerializer.TAG_CLASS));
                    }
                    if (!((Map) value).containsKey(CompositionSerializer.TAG_PATH)){
                        //and interpreted.
                        ((Map) value).put(CompositionSerializer.TAG_PATH, map.get(CompositionSerializer.TAG_PATH));
                    }
                    if (!((Map) value).containsKey(CompositionSerializer.TAG_NAME)){
                        //and interpreted.
                        ((Map) value).put(CompositionSerializer.TAG_NAME, map.get(CompositionSerializer.TAG_NAME));
                    }
                    generateObject((Map<String, Object>) value);
                    stack.push((Map<String, Object>) value);
//                    return;
//                    Map<String, Object> current = stack.getFirst();
////                    log.debug("Building object for class" + current.get(CompWalker.TAG_CLASS));
//
//                    current.put(TAG_OBJECT, ((Map) value).get(CompWalker.TAG_VALUE));
//                    //remove the /value entry if any
//                    if (current.containsKey(CompWalker.TAG_VALUE))
//                        current.remove(CompWalker.TAG_VALUE);
                }
                else {
                    if (((Map) value).containsKey(CompositionSerializer.TAG_CLASS)){
                        generateObject((Map<String, Object>) value);
                        stack.push((Map<String, Object>) value);
//                        return;
                    }
                    else {
                        Map<String, Object> submap = (Map<String, Object>) value;
                        mapInspect(submap);
                    }
                }
            }
            else if (value instanceof List){
                if (CompositionSerializer.TAG_OTHER_PARTICIPATIONS.equals(key)){
                    int index = 0;
                    for (Map participation: (List<Map>)value){
                        Map<String, Object> participationMap = new HashMap<>();
                        participationMap.putAll(participation);
//                        participationMap.remove(CompositionSerializer.TAG_VALUE);
                        participationMap.put(CompositionSerializer.TAG_VALUE, participation.get(CompositionSerializer.TAG_VALUE));
//                        participationMap.remove(CompositionSerializer.TAG_PATH);
                        participationMap.put(CompositionSerializer.TAG_PATH, participation.get(CompositionSerializer.TAG_PATH)+"/participation:"+index++);

                        Object taggedValue = participationMap.get(CompositionSerializer.TAG_VALUE);
                        if (taggedValue instanceof Participation)
                            participationMap.put(TAG_OBJECT, taggedValue);
                        else if (taggedValue instanceof Map) {
                            Map<String, Object> valueMap = new HashMap<>();
                            valueMap.put(CompositionSerializer.TAG_VALUE, taggedValue);
                            participationMap.put(TAG_OBJECT, ParticipationVBean.getInstance(valueMap));
                        }
                        else
                            throw new IllegalArgumentException("Participation could not be parsed properly...");

                        stack.push(participationMap);
                    }
                }
                else
                    listInspect((List<Object>) value);
            }
            else if (value instanceof Double){
                addObjectAttributesOnStack(key, value);
                log.debug(key + "=" + value);
            }
            else if (value instanceof Boolean){
                addObjectAttributesOnStack(key, value);
                log.debug(key + "=" + value);
            }
            else if (value instanceof DataValue){
                Map<String, Object> current = stack.getFirst();
                log.debug("Building object for class" + current.get(CompositionSerializer.TAG_CLASS));
                current.put(TAG_OBJECT, value);
            }
            else {
                if (!isElementMetaData(key) && !(value instanceof Participation))
                    throw new IllegalArgumentException("Invalid entry detected in map:" + String.valueOf(value));
            }

        }
    }

    private boolean isElementMetaData(String key){
        return key.equals(CompositionSerializer.TAG_NAME ) || key.equals(CompositionSerializer.TAG_PATH) || key.equals(CompositionSerializer.TAG_CLASS);
    }

    private void listInspect(List<Object> list) throws Exception {
        for (Object node: list){
            if (node instanceof Map){
                mapInspect((Map<String, Object>) node);
            }
            else if (node instanceof List){
                listInspect((List<Object>) node);
            }
            else
                ; //TODO: quick fix, ignore as this may come from complex types such as Joda Time
                // throw new IllegalArgumentException("Invalid entry detected in list:"+String.valueOf(node));

        }
    }

    public void resetStack(){
        stack.clear();
    }

}