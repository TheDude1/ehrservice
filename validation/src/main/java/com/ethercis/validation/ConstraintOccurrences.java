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

package com.ethercis.validation;

import org.openehr.am.archetype.constraintmodel.CAttribute;
import org.openehr.rm.support.basic.Interval;
import org.openehr.schemas.v1.IntervalOfInteger;

/**
 * Container for IntervalOfInteger
 * <v1:occurrences>
 *      <v1:lower_included>true</v1:lower_included>
 *      <v1:upper_included>true</v1:upper_included>
 *      <v1:lower_unbounded>false</v1:lower_unbounded>
 *      <v1:upper_unbounded>false</v1:upper_unbounded>
 *      <v1:lower>1</v1:lower>
 *      <v1:upper>1</v1:upper>
 * </v1:occurrences>
 * Created by christian on 7/14/2016.
 */
public class ConstraintOccurrences {
    Boolean lowerIncluded;
    Boolean upperIncluded;
    Boolean lowerUnbounded;
    Boolean upperUnbounded;
    Integer lower;
    Integer upper;

    public ConstraintOccurrences(IntervalOfInteger intervalOfInteger){
        lowerIncluded = intervalOfInteger.getLowerIncluded();
        upperIncluded = intervalOfInteger.getUpperIncluded();
        lowerUnbounded = intervalOfInteger.getLowerUnbounded();
        upperUnbounded = intervalOfInteger.getUpperUnbounded();
        if (intervalOfInteger.isSetLower())
            lower = intervalOfInteger.getLower();
        else
            lower = Integer.MIN_VALUE;
        if (intervalOfInteger.isSetUpper())
            upper = intervalOfInteger.getUpper();
        else
            upper = Integer.MAX_VALUE;
    }

    public Boolean getLowerIncluded() {
        return lowerIncluded;
    }

    public Boolean getUpperIncluded() {
        return upperIncluded;
    }

    public Boolean getLowerUnbounded() {
        return lowerUnbounded;
    }

    public Boolean getUpperUnbounded() {
        return upperUnbounded;
    }

    public Integer getLower() {
        return lower;
    }

    public Integer getUpper() {
        return upper;
    }

    public CAttribute.Existence getExistence(){
        if (lowerIncluded && upperIncluded && lower == 0 && upper == 0)
            return CAttribute.Existence.NOT_ALLOWED;
        else if (lower == 0)
            return CAttribute.Existence.OPTIONAL;
        else if (lower > 0)
            return CAttribute.Existence.REQUIRED;

        throw new IllegalArgumentException("Could not determine attribute existence from constraint (lower="+lower+", upper="+upper+")");
    }

    public Interval<Integer> asInterval() {
        return new Interval<>(getLower(), getUpper(), getLowerIncluded(), getUpperIncluded());
    }

    public boolean isOptional() {
        return lower == 0;
    }
}
