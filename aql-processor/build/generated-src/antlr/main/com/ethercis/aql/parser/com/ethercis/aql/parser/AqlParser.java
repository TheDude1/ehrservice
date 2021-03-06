// Generated from com\ethercis\aql\parser\Aql.g4 by ANTLR 4.5.3
package com.ethercis.aql.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EHR=1, AND=2, OR=3, XOR=4, NOT=5, IN=6, MATCHES=7, LIKE=8, ILIKE=9, SIMILARTO=10, 
		SELECT=11, TOP=12, FORWARD=13, BACKWARD=14, AS=15, CONTAINS=16, WHERE=17, 
		ORDERBY=18, OFFSET=19, LIMIT=20, FROM=21, DESCENDING=22, ASCENDING=23, 
		DESC=24, ASC=25, EXISTS=26, VERSION=27, VERSIONED_OBJECT=28, ALL_VERSIONS=29, 
		LATEST_VERSION=30, DISTINCT=31, JOINON=32, PERSON=33, AGENT=34, ORGANISATION=35, 
		GROUP=36, FUNCTION_IDENTIFIER=37, EXTENSION_IDENTIFIER=38, BOOLEAN=39, 
		NODEID=40, ARCHETYPEID=41, IDENTIFIER=42, DEMOGRAPHIC=43, INTEGER=44, 
		FLOAT=45, DATE=46, PARAMETER=47, UNIQUEID=48, COMPARABLEOPERATOR=49, URIVALUE=50, 
		REGEXPATTERN=51, STRING=52, EXP_STRING=53, SLASH=54, COMMA=55, SEMICOLON=56, 
		OPEN_BRACKET=57, CLOSE_BRACKET=58, OPEN_PAR=59, CLOSE_PAR=60, OPEN_CURLY=61, 
		CLOSE_CURLY=62, ARITHMETIC_BINOP=63, COUNT=64, AVG=65, BOOL_AND=66, BOOL_OR=67, 
		EVERY=68, MAX=69, MIN=70, SUM=71, SUBSTR=72, STRPOS=73, SPLIT_PART=74, 
		BTRIM=75, CONCAT=76, CONCAT_WS=77, DECODE=78, ENCODE=79, FORMAT=80, INITCAP=81, 
		LEFT=82, LENGTH=83, LPAD=84, LTRIM=85, REGEXP_MATCH=86, REGEXP_REPLACE=87, 
		REGEXP_SPLIT_TO_ARRAY=88, REGEXP_SPLIT_TO_TABLE=89, REPEAT=90, REPLACE=91, 
		REVERSE=92, RIGHT=93, RPAD=94, RTRIM=95, TRANSLATE=96, CORR=97, COVAR_POP=98, 
		COVAR_SAMP=99, REGR_AVGX=100, REGR_AVGY=101, REGR_COUNT=102, REGR_INTERCEPT=103, 
		REGR_R2=104, REGR_SLOPE=105, REGR_SXX=106, REGR_SXY=107, REGR_SYY=108, 
		STDDEV=109, STDDEV_POP=110, STDDEV_SAMP=111, VARIANCE=112, VAR_POP=113, 
		VAR_SAMP=114, RAW_COMPOSITION_ENCODE=115, WS=116;
	public static final int
		RULE_query = 0, RULE_queryExpr = 1, RULE_select = 2, RULE_topExpr = 3, 
		RULE_function = 4, RULE_extension = 5, RULE_where = 6, RULE_orderBy = 7, 
		RULE_limit = 8, RULE_offset = 9, RULE_orderBySeq = 10, RULE_orderByExpr = 11, 
		RULE_selectExpr = 12, RULE_stdExpression = 13, RULE_from = 14, RULE_fromEHR = 15, 
		RULE_fromForeignData = 16, RULE_fromExpr = 17, RULE_containsExpression = 18, 
		RULE_containExpressionBool = 19, RULE_contains = 20, RULE_identifiedExpr = 21, 
		RULE_identifiedEquality = 22, RULE_identifiedOperand = 23, RULE_identifiedPath = 24, 
		RULE_predicate = 25, RULE_nodePredicateOr = 26, RULE_nodePredicateAnd = 27, 
		RULE_nodePredicateComparable = 28, RULE_nodePredicateRegEx = 29, RULE_matchesOperand = 30, 
		RULE_valueListItems = 31, RULE_versionpredicate = 32, RULE_versionpredicateOptions = 33, 
		RULE_standardPredicate = 34, RULE_joinPredicate = 35, RULE_predicateExpr = 36, 
		RULE_predicateAnd = 37, RULE_predicateEquality = 38, RULE_predicateOperand = 39, 
		RULE_operand = 40, RULE_objectPath = 41, RULE_pathPart = 42, RULE_classExpr = 43, 
		RULE_simpleClassExpr = 44, RULE_archetypedClassExpr = 45, RULE_versionedClassExpr = 46, 
		RULE_versionClassExpr = 47;
	public static final String[] ruleNames = {
		"query", "queryExpr", "select", "topExpr", "function", "extension", "where", 
		"orderBy", "limit", "offset", "orderBySeq", "orderByExpr", "selectExpr", 
		"stdExpression", "from", "fromEHR", "fromForeignData", "fromExpr", "containsExpression", 
		"containExpressionBool", "contains", "identifiedExpr", "identifiedEquality", 
		"identifiedOperand", "identifiedPath", "predicate", "nodePredicateOr", 
		"nodePredicateAnd", "nodePredicateComparable", "nodePredicateRegEx", "matchesOperand", 
		"valueListItems", "versionpredicate", "versionpredicateOptions", "standardPredicate", 
		"joinPredicate", "predicateExpr", "predicateAnd", "predicateEquality", 
		"predicateOperand", "operand", "objectPath", "pathPart", "classExpr", 
		"simpleClassExpr", "archetypedClassExpr", "versionedClassExpr", "versionClassExpr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "'/'", "','", "';'", "'['", "']'", 
		"'('", "')'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EHR", "AND", "OR", "XOR", "NOT", "IN", "MATCHES", "LIKE", "ILIKE", 
		"SIMILARTO", "SELECT", "TOP", "FORWARD", "BACKWARD", "AS", "CONTAINS", 
		"WHERE", "ORDERBY", "OFFSET", "LIMIT", "FROM", "DESCENDING", "ASCENDING", 
		"DESC", "ASC", "EXISTS", "VERSION", "VERSIONED_OBJECT", "ALL_VERSIONS", 
		"LATEST_VERSION", "DISTINCT", "JOINON", "PERSON", "AGENT", "ORGANISATION", 
		"GROUP", "FUNCTION_IDENTIFIER", "EXTENSION_IDENTIFIER", "BOOLEAN", "NODEID", 
		"ARCHETYPEID", "IDENTIFIER", "DEMOGRAPHIC", "INTEGER", "FLOAT", "DATE", 
		"PARAMETER", "UNIQUEID", "COMPARABLEOPERATOR", "URIVALUE", "REGEXPATTERN", 
		"STRING", "EXP_STRING", "SLASH", "COMMA", "SEMICOLON", "OPEN_BRACKET", 
		"CLOSE_BRACKET", "OPEN_PAR", "CLOSE_PAR", "OPEN_CURLY", "CLOSE_CURLY", 
		"ARITHMETIC_BINOP", "COUNT", "AVG", "BOOL_AND", "BOOL_OR", "EVERY", "MAX", 
		"MIN", "SUM", "SUBSTR", "STRPOS", "SPLIT_PART", "BTRIM", "CONCAT", "CONCAT_WS", 
		"DECODE", "ENCODE", "FORMAT", "INITCAP", "LEFT", "LENGTH", "LPAD", "LTRIM", 
		"REGEXP_MATCH", "REGEXP_REPLACE", "REGEXP_SPLIT_TO_ARRAY", "REGEXP_SPLIT_TO_TABLE", 
		"REPEAT", "REPLACE", "REVERSE", "RIGHT", "RPAD", "RTRIM", "TRANSLATE", 
		"CORR", "COVAR_POP", "COVAR_SAMP", "REGR_AVGX", "REGR_AVGY", "REGR_COUNT", 
		"REGR_INTERCEPT", "REGR_R2", "REGR_SLOPE", "REGR_SXX", "REGR_SXY", "REGR_SYY", 
		"STDDEV", "STDDEV_POP", "STDDEV_SAMP", "VARIANCE", "VAR_POP", "VAR_SAMP", 
		"RAW_COMPOSITION_ENCODE", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Aql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext {
		public QueryExprContext queryExpr() {
			return getRuleContext(QueryExprContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			queryExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryExprContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AqlParser.EOF, 0); }
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public LimitContext limit() {
			return getRuleContext(LimitContext.class,0);
		}
		public OffsetContext offset() {
			return getRuleContext(OffsetContext.class,0);
		}
		public OrderByContext orderBy() {
			return getRuleContext(OrderByContext.class,0);
		}
		public QueryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterQueryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitQueryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitQueryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryExprContext queryExpr() throws RecognitionException {
		QueryExprContext _localctx = new QueryExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_queryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			select();
			setState(99);
			from();
			setState(101);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(100);
				where();
				}
			}

			setState(104);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(103);
				limit();
				}
			}

			setState(107);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(106);
				offset();
				}
			}

			setState(110);
			_la = _input.LA(1);
			if (_la==ORDERBY) {
				{
				setState(109);
				orderBy();
				}
			}

			setState(112);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(AqlParser.SELECT, 0); }
		public SelectExprContext selectExpr() {
			return getRuleContext(SelectExprContext.class,0);
		}
		public TopExprContext topExpr() {
			return getRuleContext(TopExprContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_select);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(SELECT);
				setState(115);
				selectExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(SELECT);
				setState(117);
				topExpr();
				setState(118);
				selectExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopExprContext extends ParserRuleContext {
		public TerminalNode TOP() { return getToken(AqlParser.TOP, 0); }
		public TerminalNode INTEGER() { return getToken(AqlParser.INTEGER, 0); }
		public TerminalNode BACKWARD() { return getToken(AqlParser.BACKWARD, 0); }
		public TerminalNode FORWARD() { return getToken(AqlParser.FORWARD, 0); }
		public TopExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterTopExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitTopExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitTopExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopExprContext topExpr() throws RecognitionException {
		TopExprContext _localctx = new TopExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_topExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(TOP);
			setState(123);
			match(INTEGER);
			setState(125);
			_la = _input.LA(1);
			if (_la==FORWARD || _la==BACKWARD) {
				{
				setState(124);
				_la = _input.LA(1);
				if ( !(_la==FORWARD || _la==BACKWARD) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION_IDENTIFIER() { return getToken(AqlParser.FUNCTION_IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(AqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(AqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AqlParser.IDENTIFIER, i);
		}
		public List<IdentifiedPathContext> identifiedPath() {
			return getRuleContexts(IdentifiedPathContext.class);
		}
		public IdentifiedPathContext identifiedPath(int i) {
			return getRuleContext(IdentifiedPathContext.class,i);
		}
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AqlParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(FUNCTION_IDENTIFIER);
			setState(128);
			match(OPEN_PAR);
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(129);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(130);
				identifiedPath();
				}
				break;
			case 3:
				{
				setState(131);
				operand();
				}
				break;
			}
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(134);
				match(COMMA);
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(135);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(136);
					identifiedPath();
					}
					break;
				case 3:
					{
					setState(137);
					operand();
					}
					break;
				}
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionContext extends ParserRuleContext {
		public TerminalNode EXTENSION_IDENTIFIER() { return getToken(AqlParser.EXTENSION_IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(AqlParser.OPEN_PAR, 0); }
		public List<TerminalNode> STRING() { return getTokens(AqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AqlParser.STRING, i);
		}
		public TerminalNode COMMA() { return getToken(AqlParser.COMMA, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(AqlParser.CLOSE_PAR, 0); }
		public ExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitExtension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitExtension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtensionContext extension() throws RecognitionException {
		ExtensionContext _localctx = new ExtensionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_extension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(EXTENSION_IDENTIFIER);
			setState(148);
			match(OPEN_PAR);
			setState(149);
			match(STRING);
			setState(150);
			match(COMMA);
			setState(151);
			match(STRING);
			setState(152);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(AqlParser.WHERE, 0); }
		public IdentifiedExprContext identifiedExpr() {
			return getRuleContext(IdentifiedExprContext.class,0);
		}
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(WHERE);
			setState(155);
			identifiedExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByContext extends ParserRuleContext {
		public TerminalNode ORDERBY() { return getToken(AqlParser.ORDERBY, 0); }
		public OrderBySeqContext orderBySeq() {
			return getRuleContext(OrderBySeqContext.class,0);
		}
		public OrderByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterOrderBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitOrderBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitOrderBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByContext orderBy() throws RecognitionException {
		OrderByContext _localctx = new OrderByContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_orderBy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(ORDERBY);
			setState(158);
			orderBySeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(AqlParser.LIMIT, 0); }
		public TerminalNode INTEGER() { return getToken(AqlParser.INTEGER, 0); }
		public LimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterLimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitLimit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitLimit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitContext limit() throws RecognitionException {
		LimitContext _localctx = new LimitContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(LIMIT);
			setState(161);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode OFFSET() { return getToken(AqlParser.OFFSET, 0); }
		public TerminalNode INTEGER() { return getToken(AqlParser.INTEGER, 0); }
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitOffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(OFFSET);
			setState(164);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderBySeqContext extends ParserRuleContext {
		public OrderByExprContext orderByExpr() {
			return getRuleContext(OrderByExprContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(AqlParser.COMMA, 0); }
		public OrderBySeqContext orderBySeq() {
			return getRuleContext(OrderBySeqContext.class,0);
		}
		public OrderBySeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderBySeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterOrderBySeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitOrderBySeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitOrderBySeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderBySeqContext orderBySeq() throws RecognitionException {
		OrderBySeqContext _localctx = new OrderBySeqContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_orderBySeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			orderByExpr();
			setState(169);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(167);
				match(COMMA);
				setState(168);
				orderBySeq();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByExprContext extends ParserRuleContext {
		public IdentifiedPathContext identifiedPath() {
			return getRuleContext(IdentifiedPathContext.class,0);
		}
		public TerminalNode DESCENDING() { return getToken(AqlParser.DESCENDING, 0); }
		public TerminalNode ASCENDING() { return getToken(AqlParser.ASCENDING, 0); }
		public TerminalNode DESC() { return getToken(AqlParser.DESC, 0); }
		public TerminalNode ASC() { return getToken(AqlParser.ASC, 0); }
		public OrderByExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterOrderByExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitOrderByExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitOrderByExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByExprContext orderByExpr() throws RecognitionException {
		OrderByExprContext _localctx = new OrderByExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_orderByExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			identifiedPath();
			setState(172);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESCENDING) | (1L << ASCENDING) | (1L << DESC) | (1L << ASC))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectExprContext extends ParserRuleContext {
		public IdentifiedPathContext identifiedPath() {
			return getRuleContext(IdentifiedPathContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(AqlParser.DISTINCT, 0); }
		public TerminalNode AS() { return getToken(AqlParser.AS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AqlParser.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(AqlParser.COMMA, 0); }
		public SelectExprContext selectExpr() {
			return getRuleContext(SelectExprContext.class,0);
		}
		public StdExpressionContext stdExpression() {
			return getRuleContext(StdExpressionContext.class,0);
		}
		public SelectExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterSelectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitSelectExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitSelectExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectExprContext selectExpr() throws RecognitionException {
		SelectExprContext _localctx = new SelectExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selectExpr);
		int _la;
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(174);
					match(DISTINCT);
					}
				}

				setState(177);
				identifiedPath();
				setState(180);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(178);
					match(AS);
					setState(179);
					match(IDENTIFIER);
					}
				}

				setState(184);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(182);
					match(COMMA);
					setState(183);
					selectExpr();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(186);
					match(DISTINCT);
					}
				}

				setState(189);
				stdExpression();
				setState(192);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(190);
					match(AS);
					setState(191);
					match(IDENTIFIER);
					}
				}

				setState(196);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(194);
					match(COMMA);
					setState(195);
					selectExpr();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StdExpressionContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ExtensionContext extension() {
			return getRuleContext(ExtensionContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(AqlParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(AqlParser.STRING, 0); }
		public StdExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stdExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterStdExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitStdExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitStdExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StdExpressionContext stdExpression() throws RecognitionException {
		StdExpressionContext _localctx = new StdExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stdExpression);
		try {
			setState(204);
			switch (_input.LA(1)) {
			case FUNCTION_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				function();
				}
				break;
			case EXTENSION_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				extension();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				match(INTEGER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(AqlParser.FROM, 0); }
		public FromExprContext fromExpr() {
			return getRuleContext(FromExprContext.class,0);
		}
		public FromEHRContext fromEHR() {
			return getRuleContext(FromEHRContext.class,0);
		}
		public TerminalNode CONTAINS() { return getToken(AqlParser.CONTAINS, 0); }
		public ContainsExpressionContext containsExpression() {
			return getRuleContext(ContainsExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(AqlParser.COMMA, 0); }
		public List<FromForeignDataContext> fromForeignData() {
			return getRuleContexts(FromForeignDataContext.class);
		}
		public FromForeignDataContext fromForeignData(int i) {
			return getRuleContext(FromForeignDataContext.class,i);
		}
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_from);
		int _la;
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(FROM);
				setState(207);
				fromExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(FROM);
				setState(209);
				fromEHR();
				setState(212);
				_la = _input.LA(1);
				if (_la==CONTAINS) {
					{
					setState(210);
					match(CONTAINS);
					setState(211);
					containsExpression();
					}
				}

				setState(216);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(214);
					match(COMMA);
					setState(215);
					fromForeignData();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(FROM);
				setState(219);
				fromForeignData();
				setState(222);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(220);
					match(COMMA);
					setState(221);
					fromForeignData();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromEHRContext extends ParserRuleContext {
		public TerminalNode EHR() { return getToken(AqlParser.EHR, 0); }
		public StandardPredicateContext standardPredicate() {
			return getRuleContext(StandardPredicateContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AqlParser.IDENTIFIER, 0); }
		public FromEHRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromEHR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterFromEHR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitFromEHR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitFromEHR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromEHRContext fromEHR() throws RecognitionException {
		FromEHRContext _localctx = new FromEHRContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fromEHR);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(EHR);
				setState(227);
				standardPredicate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(EHR);
				setState(229);
				match(IDENTIFIER);
				setState(230);
				standardPredicate();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(EHR);
				setState(232);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromForeignDataContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AqlParser.IDENTIFIER, 0); }
		public JoinPredicateContext joinPredicate() {
			return getRuleContext(JoinPredicateContext.class,0);
		}
		public TerminalNode AGENT() { return getToken(AqlParser.AGENT, 0); }
		public TerminalNode GROUP() { return getToken(AqlParser.GROUP, 0); }
		public TerminalNode ORGANISATION() { return getToken(AqlParser.ORGANISATION, 0); }
		public TerminalNode PERSON() { return getToken(AqlParser.PERSON, 0); }
		public FromForeignDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromForeignData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterFromForeignData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitFromForeignData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitFromForeignData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromForeignDataContext fromForeignData() throws RecognitionException {
		FromForeignDataContext _localctx = new FromForeignDataContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fromForeignData);
		int _la;
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PERSON) | (1L << AGENT) | (1L << ORGANISATION) | (1L << GROUP))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(236);
				match(IDENTIFIER);
				setState(237);
				joinPredicate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PERSON) | (1L << AGENT) | (1L << ORGANISATION) | (1L << GROUP))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(239);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromExprContext extends ParserRuleContext {
		public ContainsExpressionContext containsExpression() {
			return getRuleContext(ContainsExpressionContext.class,0);
		}
		public FromExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterFromExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitFromExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitFromExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromExprContext fromExpr() throws RecognitionException {
		FromExprContext _localctx = new FromExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fromExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			containsExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContainsExpressionContext extends ParserRuleContext {
		public ContainExpressionBoolContext containExpressionBool() {
			return getRuleContext(ContainExpressionBoolContext.class,0);
		}
		public ContainsExpressionContext containsExpression() {
			return getRuleContext(ContainsExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(AqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(AqlParser.OR, 0); }
		public TerminalNode XOR() { return getToken(AqlParser.XOR, 0); }
		public ContainsExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containsExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterContainsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitContainsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitContainsExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainsExpressionContext containsExpression() throws RecognitionException {
		ContainsExpressionContext _localctx = new ContainsExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_containsExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			containExpressionBool();
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(245);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(246);
				containsExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContainExpressionBoolContext extends ParserRuleContext {
		public ContainsContext contains() {
			return getRuleContext(ContainsContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(AqlParser.OPEN_PAR, 0); }
		public ContainsExpressionContext containsExpression() {
			return getRuleContext(ContainsExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(AqlParser.CLOSE_PAR, 0); }
		public ContainExpressionBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containExpressionBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterContainExpressionBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitContainExpressionBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitContainExpressionBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainExpressionBoolContext containExpressionBool() throws RecognitionException {
		ContainExpressionBoolContext _localctx = new ContainExpressionBoolContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_containExpressionBool);
		try {
			setState(254);
			switch (_input.LA(1)) {
			case VERSION:
			case VERSIONED_OBJECT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				contains();
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(OPEN_PAR);
				setState(251);
				containsExpression();
				setState(252);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContainsContext extends ParserRuleContext {
		public SimpleClassExprContext simpleClassExpr() {
			return getRuleContext(SimpleClassExprContext.class,0);
		}
		public TerminalNode CONTAINS() { return getToken(AqlParser.CONTAINS, 0); }
		public ContainsExpressionContext containsExpression() {
			return getRuleContext(ContainsExpressionContext.class,0);
		}
		public ContainsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contains; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterContains(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitContains(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitContains(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainsContext contains() throws RecognitionException {
		ContainsContext _localctx = new ContainsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_contains);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			simpleClassExpr();
			setState(259);
			_la = _input.LA(1);
			if (_la==CONTAINS) {
				{
				setState(257);
				match(CONTAINS);
				setState(258);
				containsExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifiedExprContext extends ParserRuleContext {
		public List<IdentifiedEqualityContext> identifiedEquality() {
			return getRuleContexts(IdentifiedEqualityContext.class);
		}
		public IdentifiedEqualityContext identifiedEquality(int i) {
			return getRuleContext(IdentifiedEqualityContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(AqlParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(AqlParser.OR, i);
		}
		public List<TerminalNode> XOR() { return getTokens(AqlParser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(AqlParser.XOR, i);
		}
		public List<TerminalNode> AND() { return getTokens(AqlParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(AqlParser.AND, i);
		}
		public TerminalNode OPEN_PAR() { return getToken(AqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(AqlParser.CLOSE_PAR, 0); }
		public IdentifiedExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiedExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterIdentifiedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitIdentifiedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitIdentifiedExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifiedExprContext identifiedExpr() throws RecognitionException {
		IdentifiedExprContext _localctx = new IdentifiedExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_identifiedExpr);
		int _la;
		try {
			int _alt;
			setState(280);
			switch (_input.LA(1)) {
			case NOT:
			case IN:
			case EXISTS:
			case BOOLEAN:
			case IDENTIFIER:
			case INTEGER:
			case FLOAT:
			case DATE:
			case PARAMETER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				identifiedEquality();
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(262);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(263);
						identifiedEquality();
						}
						} 
					}
					setState(268);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(OPEN_PAR);
				setState(270);
				identifiedEquality();
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) {
					{
					{
					setState(271);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(272);
					identifiedEquality();
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(278);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifiedEqualityContext extends ParserRuleContext {
		public List<IdentifiedOperandContext> identifiedOperand() {
			return getRuleContexts(IdentifiedOperandContext.class);
		}
		public IdentifiedOperandContext identifiedOperand(int i) {
			return getRuleContext(IdentifiedOperandContext.class,i);
		}
		public TerminalNode COMPARABLEOPERATOR() { return getToken(AqlParser.COMPARABLEOPERATOR, 0); }
		public TerminalNode NOT() { return getToken(AqlParser.NOT, 0); }
		public TerminalNode MATCHES() { return getToken(AqlParser.MATCHES, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(AqlParser.OPEN_CURLY, 0); }
		public MatchesOperandContext matchesOperand() {
			return getRuleContext(MatchesOperandContext.class,0);
		}
		public TerminalNode CLOSE_CURLY() { return getToken(AqlParser.CLOSE_CURLY, 0); }
		public TerminalNode REGEXPATTERN() { return getToken(AqlParser.REGEXPATTERN, 0); }
		public TerminalNode LIKE() { return getToken(AqlParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(AqlParser.STRING, 0); }
		public TerminalNode ILIKE() { return getToken(AqlParser.ILIKE, 0); }
		public TerminalNode SIMILARTO() { return getToken(AqlParser.SIMILARTO, 0); }
		public TerminalNode IN() { return getToken(AqlParser.IN, 0); }
		public TerminalNode OPEN_PAR() { return getToken(AqlParser.OPEN_PAR, 0); }
		public QueryExprContext queryExpr() {
			return getRuleContext(QueryExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(AqlParser.CLOSE_PAR, 0); }
		public TerminalNode EXISTS() { return getToken(AqlParser.EXISTS, 0); }
		public IdentifiedPathContext identifiedPath() {
			return getRuleContext(IdentifiedPathContext.class,0);
		}
		public IdentifiedExprContext identifiedExpr() {
			return getRuleContext(IdentifiedExprContext.class,0);
		}
		public IdentifiedEqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiedEquality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterIdentifiedEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitIdentifiedEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitIdentifiedEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifiedEqualityContext identifiedEquality() throws RecognitionException {
		IdentifiedEqualityContext _localctx = new IdentifiedEqualityContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_identifiedEquality);
		int _la;
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(282);
					match(NOT);
					}
				}

				setState(285);
				identifiedOperand();
				setState(286);
				match(COMPARABLEOPERATOR);
				setState(287);
				identifiedOperand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(289);
					match(NOT);
					}
				}

				setState(292);
				identifiedOperand();
				setState(293);
				match(MATCHES);
				setState(294);
				match(OPEN_CURLY);
				setState(295);
				matchesOperand();
				setState(296);
				match(CLOSE_CURLY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(298);
					match(NOT);
					}
				}

				setState(301);
				identifiedOperand();
				setState(302);
				match(MATCHES);
				setState(303);
				match(REGEXPATTERN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(305);
					match(NOT);
					}
				}

				setState(308);
				identifiedOperand();
				setState(309);
				match(LIKE);
				setState(310);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(313);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(312);
					match(NOT);
					}
				}

				setState(315);
				identifiedOperand();
				setState(316);
				match(ILIKE);
				setState(317);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(320);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(319);
					match(NOT);
					}
				}

				setState(322);
				identifiedOperand();
				setState(323);
				match(SIMILARTO);
				setState(324);
				match(STRING);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(327);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(326);
					match(NOT);
					}
				}

				setState(329);
				match(IN);
				setState(330);
				match(OPEN_PAR);
				setState(331);
				queryExpr();
				setState(332);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(335);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(334);
					match(NOT);
					}
				}

				setState(337);
				match(EXISTS);
				setState(338);
				identifiedPath();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(340);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(339);
					match(NOT);
					}
				}

				setState(342);
				match(EXISTS);
				setState(343);
				identifiedExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifiedOperandContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public IdentifiedPathContext identifiedPath() {
			return getRuleContext(IdentifiedPathContext.class,0);
		}
		public IdentifiedOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiedOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterIdentifiedOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitIdentifiedOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitIdentifiedOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifiedOperandContext identifiedOperand() throws RecognitionException {
		IdentifiedOperandContext _localctx = new IdentifiedOperandContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_identifiedOperand);
		try {
			setState(348);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INTEGER:
			case FLOAT:
			case DATE:
			case PARAMETER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				operand();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				identifiedPath();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifiedPathContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AqlParser.IDENTIFIER, 0); }
		public TerminalNode SLASH() { return getToken(AqlParser.SLASH, 0); }
		public ObjectPathContext objectPath() {
			return getRuleContext(ObjectPathContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public IdentifiedPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiedPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterIdentifiedPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitIdentifiedPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitIdentifiedPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifiedPathContext identifiedPath() throws RecognitionException {
		IdentifiedPathContext _localctx = new IdentifiedPathContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_identifiedPath);
		int _la;
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(IDENTIFIER);
				setState(353);
				_la = _input.LA(1);
				if (_la==SLASH) {
					{
					setState(351);
					match(SLASH);
					setState(352);
					objectPath();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(IDENTIFIER);
				setState(356);
				predicate();
				setState(359);
				_la = _input.LA(1);
				if (_la==SLASH) {
					{
					setState(357);
					match(SLASH);
					setState(358);
					objectPath();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(AqlParser.OPEN_BRACKET, 0); }
		public NodePredicateOrContext nodePredicateOr() {
			return getRuleContext(NodePredicateOrContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AqlParser.CLOSE_BRACKET, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(OPEN_BRACKET);
			setState(364);
			nodePredicateOr();
			setState(365);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodePredicateOrContext extends ParserRuleContext {
		public List<NodePredicateAndContext> nodePredicateAnd() {
			return getRuleContexts(NodePredicateAndContext.class);
		}
		public NodePredicateAndContext nodePredicateAnd(int i) {
			return getRuleContext(NodePredicateAndContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(AqlParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(AqlParser.OR, i);
		}
		public NodePredicateOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodePredicateOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterNodePredicateOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitNodePredicateOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitNodePredicateOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodePredicateOrContext nodePredicateOr() throws RecognitionException {
		NodePredicateOrContext _localctx = new NodePredicateOrContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_nodePredicateOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			nodePredicateAnd();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(368);
				match(OR);
				setState(369);
				nodePredicateAnd();
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodePredicateAndContext extends ParserRuleContext {
		public List<NodePredicateComparableContext> nodePredicateComparable() {
			return getRuleContexts(NodePredicateComparableContext.class);
		}
		public NodePredicateComparableContext nodePredicateComparable(int i) {
			return getRuleContext(NodePredicateComparableContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(AqlParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(AqlParser.AND, i);
		}
		public NodePredicateAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodePredicateAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterNodePredicateAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitNodePredicateAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitNodePredicateAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodePredicateAndContext nodePredicateAnd() throws RecognitionException {
		NodePredicateAndContext _localctx = new NodePredicateAndContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_nodePredicateAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			nodePredicateComparable();
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(376);
				match(AND);
				setState(377);
				nodePredicateComparable();
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodePredicateComparableContext extends ParserRuleContext {
		public TerminalNode NODEID() { return getToken(AqlParser.NODEID, 0); }
		public TerminalNode COMMA() { return getToken(AqlParser.COMMA, 0); }
		public TerminalNode STRING() { return getToken(AqlParser.STRING, 0); }
		public TerminalNode PARAMETER() { return getToken(AqlParser.PARAMETER, 0); }
		public TerminalNode ARCHETYPEID() { return getToken(AqlParser.ARCHETYPEID, 0); }
		public List<PredicateOperandContext> predicateOperand() {
			return getRuleContexts(PredicateOperandContext.class);
		}
		public PredicateOperandContext predicateOperand(int i) {
			return getRuleContext(PredicateOperandContext.class,i);
		}
		public TerminalNode COMPARABLEOPERATOR() { return getToken(AqlParser.COMPARABLEOPERATOR, 0); }
		public TerminalNode MATCHES() { return getToken(AqlParser.MATCHES, 0); }
		public TerminalNode REGEXPATTERN() { return getToken(AqlParser.REGEXPATTERN, 0); }
		public NodePredicateComparableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodePredicateComparable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterNodePredicateComparable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitNodePredicateComparable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitNodePredicateComparable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodePredicateComparableContext nodePredicateComparable() throws RecognitionException {
		NodePredicateComparableContext _localctx = new NodePredicateComparableContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_nodePredicateComparable);
		int _la;
		try {
			setState(401);
			switch (_input.LA(1)) {
			case NODEID:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				match(NODEID);
				setState(386);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(384);
					match(COMMA);
					setState(385);
					_la = _input.LA(1);
					if ( !(_la==PARAMETER || _la==STRING) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				}
				break;
			case ARCHETYPEID:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				match(ARCHETYPEID);
				setState(391);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(389);
					match(COMMA);
					setState(390);
					_la = _input.LA(1);
					if ( !(_la==PARAMETER || _la==STRING) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				}
				break;
			case BOOLEAN:
			case IDENTIFIER:
			case INTEGER:
			case FLOAT:
			case DATE:
			case PARAMETER:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				predicateOperand();
				setState(398);
				switch (_input.LA(1)) {
				case COMPARABLEOPERATOR:
					{
					{
					setState(394);
					match(COMPARABLEOPERATOR);
					setState(395);
					predicateOperand();
					}
					}
					break;
				case MATCHES:
					{
					{
					setState(396);
					match(MATCHES);
					setState(397);
					match(REGEXPATTERN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case REGEXPATTERN:
				enterOuterAlt(_localctx, 4);
				{
				setState(400);
				match(REGEXPATTERN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodePredicateRegExContext extends ParserRuleContext {
		public TerminalNode REGEXPATTERN() { return getToken(AqlParser.REGEXPATTERN, 0); }
		public PredicateOperandContext predicateOperand() {
			return getRuleContext(PredicateOperandContext.class,0);
		}
		public TerminalNode MATCHES() { return getToken(AqlParser.MATCHES, 0); }
		public NodePredicateRegExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodePredicateRegEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterNodePredicateRegEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitNodePredicateRegEx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitNodePredicateRegEx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodePredicateRegExContext nodePredicateRegEx() throws RecognitionException {
		NodePredicateRegExContext _localctx = new NodePredicateRegExContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_nodePredicateRegEx);
		try {
			setState(408);
			switch (_input.LA(1)) {
			case REGEXPATTERN:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(REGEXPATTERN);
				}
				break;
			case BOOLEAN:
			case IDENTIFIER:
			case INTEGER:
			case FLOAT:
			case DATE:
			case PARAMETER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				predicateOperand();
				setState(405);
				match(MATCHES);
				setState(406);
				match(REGEXPATTERN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchesOperandContext extends ParserRuleContext {
		public ValueListItemsContext valueListItems() {
			return getRuleContext(ValueListItemsContext.class,0);
		}
		public TerminalNode URIVALUE() { return getToken(AqlParser.URIVALUE, 0); }
		public MatchesOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchesOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterMatchesOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitMatchesOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitMatchesOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchesOperandContext matchesOperand() throws RecognitionException {
		MatchesOperandContext _localctx = new MatchesOperandContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_matchesOperand);
		try {
			setState(412);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INTEGER:
			case FLOAT:
			case DATE:
			case PARAMETER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				valueListItems();
				}
				break;
			case URIVALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(URIVALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueListItemsContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(AqlParser.COMMA, 0); }
		public ValueListItemsContext valueListItems() {
			return getRuleContext(ValueListItemsContext.class,0);
		}
		public ValueListItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueListItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterValueListItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitValueListItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitValueListItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListItemsContext valueListItems() throws RecognitionException {
		ValueListItemsContext _localctx = new ValueListItemsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_valueListItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			operand();
			setState(417);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(415);
				match(COMMA);
				setState(416);
				valueListItems();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionpredicateContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(AqlParser.OPEN_BRACKET, 0); }
		public VersionpredicateOptionsContext versionpredicateOptions() {
			return getRuleContext(VersionpredicateOptionsContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AqlParser.CLOSE_BRACKET, 0); }
		public VersionpredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionpredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterVersionpredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitVersionpredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitVersionpredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionpredicateContext versionpredicate() throws RecognitionException {
		VersionpredicateContext _localctx = new VersionpredicateContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_versionpredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(OPEN_BRACKET);
			setState(420);
			versionpredicateOptions();
			setState(421);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionpredicateOptionsContext extends ParserRuleContext {
		public TerminalNode LATEST_VERSION() { return getToken(AqlParser.LATEST_VERSION, 0); }
		public TerminalNode ALL_VERSIONS() { return getToken(AqlParser.ALL_VERSIONS, 0); }
		public VersionpredicateOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionpredicateOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterVersionpredicateOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitVersionpredicateOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitVersionpredicateOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionpredicateOptionsContext versionpredicateOptions() throws RecognitionException {
		VersionpredicateOptionsContext _localctx = new VersionpredicateOptionsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_versionpredicateOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_la = _input.LA(1);
			if ( !(_la==ALL_VERSIONS || _la==LATEST_VERSION) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StandardPredicateContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(AqlParser.OPEN_BRACKET, 0); }
		public PredicateExprContext predicateExpr() {
			return getRuleContext(PredicateExprContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AqlParser.CLOSE_BRACKET, 0); }
		public StandardPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterStandardPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitStandardPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitStandardPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandardPredicateContext standardPredicate() throws RecognitionException {
		StandardPredicateContext _localctx = new StandardPredicateContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_standardPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(OPEN_BRACKET);
			setState(426);
			predicateExpr();
			setState(427);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinPredicateContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(AqlParser.OPEN_BRACKET, 0); }
		public TerminalNode JOINON() { return getToken(AqlParser.JOINON, 0); }
		public PredicateEqualityContext predicateEquality() {
			return getRuleContext(PredicateEqualityContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AqlParser.CLOSE_BRACKET, 0); }
		public JoinPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterJoinPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitJoinPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitJoinPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinPredicateContext joinPredicate() throws RecognitionException {
		JoinPredicateContext _localctx = new JoinPredicateContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_joinPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(OPEN_BRACKET);
			setState(430);
			match(JOINON);
			setState(431);
			predicateEquality();
			setState(432);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateExprContext extends ParserRuleContext {
		public List<PredicateAndContext> predicateAnd() {
			return getRuleContexts(PredicateAndContext.class);
		}
		public PredicateAndContext predicateAnd(int i) {
			return getRuleContext(PredicateAndContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(AqlParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(AqlParser.OR, i);
		}
		public PredicateExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterPredicateExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitPredicateExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitPredicateExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateExprContext predicateExpr() throws RecognitionException {
		PredicateExprContext _localctx = new PredicateExprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_predicateExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			predicateAnd();
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(435);
				match(OR);
				setState(436);
				predicateAnd();
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateAndContext extends ParserRuleContext {
		public List<PredicateEqualityContext> predicateEquality() {
			return getRuleContexts(PredicateEqualityContext.class);
		}
		public PredicateEqualityContext predicateEquality(int i) {
			return getRuleContext(PredicateEqualityContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(AqlParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(AqlParser.AND, i);
		}
		public PredicateAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterPredicateAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitPredicateAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitPredicateAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateAndContext predicateAnd() throws RecognitionException {
		PredicateAndContext _localctx = new PredicateAndContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_predicateAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			predicateEquality();
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(443);
				match(AND);
				setState(444);
				predicateEquality();
				}
				}
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateEqualityContext extends ParserRuleContext {
		public List<PredicateOperandContext> predicateOperand() {
			return getRuleContexts(PredicateOperandContext.class);
		}
		public PredicateOperandContext predicateOperand(int i) {
			return getRuleContext(PredicateOperandContext.class,i);
		}
		public TerminalNode COMPARABLEOPERATOR() { return getToken(AqlParser.COMPARABLEOPERATOR, 0); }
		public PredicateEqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateEquality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterPredicateEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitPredicateEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitPredicateEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateEqualityContext predicateEquality() throws RecognitionException {
		PredicateEqualityContext _localctx = new PredicateEqualityContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_predicateEquality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			predicateOperand();
			setState(451);
			match(COMPARABLEOPERATOR);
			setState(452);
			predicateOperand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateOperandContext extends ParserRuleContext {
		public ObjectPathContext objectPath() {
			return getRuleContext(ObjectPathContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public PredicateOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterPredicateOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitPredicateOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitPredicateOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperandContext predicateOperand() throws RecognitionException {
		PredicateOperandContext _localctx = new PredicateOperandContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_predicateOperand);
		try {
			setState(456);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				objectPath();
				}
				break;
			case BOOLEAN:
			case INTEGER:
			case FLOAT:
			case DATE:
			case PARAMETER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				operand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AqlParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(AqlParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(AqlParser.FLOAT, 0); }
		public TerminalNode DATE() { return getToken(AqlParser.DATE, 0); }
		public TerminalNode PARAMETER() { return getToken(AqlParser.PARAMETER, 0); }
		public TerminalNode BOOLEAN() { return getToken(AqlParser.BOOLEAN, 0); }
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INTEGER) | (1L << FLOAT) | (1L << DATE) | (1L << PARAMETER) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectPathContext extends ParserRuleContext {
		public List<PathPartContext> pathPart() {
			return getRuleContexts(PathPartContext.class);
		}
		public PathPartContext pathPart(int i) {
			return getRuleContext(PathPartContext.class,i);
		}
		public List<TerminalNode> SLASH() { return getTokens(AqlParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(AqlParser.SLASH, i);
		}
		public ObjectPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterObjectPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitObjectPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitObjectPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPathContext objectPath() throws RecognitionException {
		ObjectPathContext _localctx = new ObjectPathContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_objectPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			pathPart();
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH) {
				{
				{
				setState(461);
				match(SLASH);
				setState(462);
				pathPart();
				}
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathPartContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AqlParser.IDENTIFIER, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PathPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterPathPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitPathPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitPathPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathPartContext pathPart() throws RecognitionException {
		PathPartContext _localctx = new PathPartContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_pathPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(IDENTIFIER);
			setState(470);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(469);
				predicate();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassExprContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(AqlParser.OPEN_PAR, 0); }
		public SimpleClassExprContext simpleClassExpr() {
			return getRuleContext(SimpleClassExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(AqlParser.CLOSE_PAR, 0); }
		public ClassExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterClassExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitClassExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitClassExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassExprContext classExpr() throws RecognitionException {
		ClassExprContext _localctx = new ClassExprContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_classExpr);
		try {
			setState(477);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(OPEN_PAR);
				setState(473);
				simpleClassExpr();
				setState(474);
				match(CLOSE_PAR);
				}
				break;
			case VERSION:
			case VERSIONED_OBJECT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				simpleClassExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleClassExprContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AqlParser.IDENTIFIER, i);
		}
		public ArchetypedClassExprContext archetypedClassExpr() {
			return getRuleContext(ArchetypedClassExprContext.class,0);
		}
		public VersionedClassExprContext versionedClassExpr() {
			return getRuleContext(VersionedClassExprContext.class,0);
		}
		public VersionClassExprContext versionClassExpr() {
			return getRuleContext(VersionClassExprContext.class,0);
		}
		public SimpleClassExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleClassExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterSimpleClassExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitSimpleClassExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitSimpleClassExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleClassExprContext simpleClassExpr() throws RecognitionException {
		SimpleClassExprContext _localctx = new SimpleClassExprContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_simpleClassExpr);
		int _la;
		try {
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				match(IDENTIFIER);
				setState(481);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(480);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				archetypedClassExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(484);
				versionedClassExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(485);
				versionClassExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArchetypedClassExprContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AqlParser.IDENTIFIER, i);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(AqlParser.OPEN_BRACKET, 0); }
		public TerminalNode ARCHETYPEID() { return getToken(AqlParser.ARCHETYPEID, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(AqlParser.CLOSE_BRACKET, 0); }
		public ArchetypedClassExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_archetypedClassExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterArchetypedClassExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitArchetypedClassExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitArchetypedClassExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArchetypedClassExprContext archetypedClassExpr() throws RecognitionException {
		ArchetypedClassExprContext _localctx = new ArchetypedClassExprContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_archetypedClassExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(IDENTIFIER);
			setState(490);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(489);
				match(IDENTIFIER);
				}
			}

			setState(495);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(492);
				match(OPEN_BRACKET);
				setState(493);
				match(ARCHETYPEID);
				setState(494);
				match(CLOSE_BRACKET);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionedClassExprContext extends ParserRuleContext {
		public TerminalNode VERSIONED_OBJECT() { return getToken(AqlParser.VERSIONED_OBJECT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AqlParser.IDENTIFIER, 0); }
		public StandardPredicateContext standardPredicate() {
			return getRuleContext(StandardPredicateContext.class,0);
		}
		public VersionedClassExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionedClassExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterVersionedClassExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitVersionedClassExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitVersionedClassExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionedClassExprContext versionedClassExpr() throws RecognitionException {
		VersionedClassExprContext _localctx = new VersionedClassExprContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_versionedClassExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(VERSIONED_OBJECT);
			setState(499);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(498);
				match(IDENTIFIER);
				}
			}

			setState(502);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(501);
				standardPredicate();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionClassExprContext extends ParserRuleContext {
		public TerminalNode VERSION() { return getToken(AqlParser.VERSION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AqlParser.IDENTIFIER, 0); }
		public StandardPredicateContext standardPredicate() {
			return getRuleContext(StandardPredicateContext.class,0);
		}
		public VersionpredicateContext versionpredicate() {
			return getRuleContext(VersionpredicateContext.class,0);
		}
		public VersionClassExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionClassExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterVersionClassExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitVersionClassExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitVersionClassExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionClassExprContext versionClassExpr() throws RecognitionException {
		VersionClassExprContext _localctx = new VersionClassExprContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_versionClassExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(VERSION);
			setState(506);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(505);
				match(IDENTIFIER);
				}
			}

			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(508);
				standardPredicate();
				}
				break;
			case 2:
				{
				setState(509);
				versionpredicate();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3v\u0203\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\3\5\3h\n"+
		"\3\3\3\5\3k\n\3\3\3\5\3n\n\3\3\3\5\3q\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4{\n\4\3\5\3\5\3\5\5\5\u0080\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u0087"+
		"\n\6\3\6\3\6\3\6\3\6\5\6\u008d\n\6\7\6\u008f\n\6\f\6\16\6\u0092\13\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u00ac\n\f\3\r\3\r\3\r\3\16\5\16\u00b2"+
		"\n\16\3\16\3\16\3\16\5\16\u00b7\n\16\3\16\3\16\5\16\u00bb\n\16\3\16\5"+
		"\16\u00be\n\16\3\16\3\16\3\16\5\16\u00c3\n\16\3\16\3\16\5\16\u00c7\n\16"+
		"\5\16\u00c9\n\16\3\17\3\17\3\17\3\17\5\17\u00cf\n\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u00d7\n\20\3\20\3\20\5\20\u00db\n\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00e1\n\20\5\20\u00e3\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u00ec\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00f3\n\22\3\23\3\23"+
		"\3\24\3\24\3\24\5\24\u00fa\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u0101\n"+
		"\25\3\26\3\26\3\26\5\26\u0106\n\26\3\27\3\27\3\27\7\27\u010b\n\27\f\27"+
		"\16\27\u010e\13\27\3\27\3\27\3\27\3\27\7\27\u0114\n\27\f\27\16\27\u0117"+
		"\13\27\3\27\3\27\5\27\u011b\n\27\3\30\5\30\u011e\n\30\3\30\3\30\3\30\3"+
		"\30\3\30\5\30\u0125\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u012e"+
		"\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u0135\n\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u013c\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u0143\n\30\3\30\3\30\3"+
		"\30\3\30\3\30\5\30\u014a\n\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0152"+
		"\n\30\3\30\3\30\3\30\5\30\u0157\n\30\3\30\3\30\5\30\u015b\n\30\3\31\3"+
		"\31\5\31\u015f\n\31\3\32\3\32\3\32\5\32\u0164\n\32\3\32\3\32\3\32\3\32"+
		"\5\32\u016a\n\32\5\32\u016c\n\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\7"+
		"\34\u0175\n\34\f\34\16\34\u0178\13\34\3\35\3\35\3\35\7\35\u017d\n\35\f"+
		"\35\16\35\u0180\13\35\3\36\3\36\3\36\5\36\u0185\n\36\3\36\3\36\3\36\5"+
		"\36\u018a\n\36\3\36\3\36\3\36\3\36\3\36\5\36\u0191\n\36\3\36\5\36\u0194"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\5\37\u019b\n\37\3 \3 \5 \u019f\n \3!\3"+
		"!\3!\5!\u01a4\n!\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3"+
		"&\3&\7&\u01b8\n&\f&\16&\u01bb\13&\3\'\3\'\3\'\7\'\u01c0\n\'\f\'\16\'\u01c3"+
		"\13\'\3(\3(\3(\3(\3)\3)\5)\u01cb\n)\3*\3*\3+\3+\3+\7+\u01d2\n+\f+\16+"+
		"\u01d5\13+\3,\3,\5,\u01d9\n,\3-\3-\3-\3-\3-\5-\u01e0\n-\3.\3.\5.\u01e4"+
		"\n.\3.\3.\3.\5.\u01e9\n.\3/\3/\5/\u01ed\n/\3/\3/\3/\5/\u01f2\n/\3\60\3"+
		"\60\5\60\u01f6\n\60\3\60\5\60\u01f9\n\60\3\61\3\61\5\61\u01fd\n\61\3\61"+
		"\3\61\5\61\u0201\n\61\3\61\2\2\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2\t\3\2\17\20\3\2\30\33"+
		"\3\2#&\3\2\4\6\4\2\61\61\66\66\3\2\37 \5\2)).\61\66\66\u0227\2b\3\2\2"+
		"\2\4d\3\2\2\2\6z\3\2\2\2\b|\3\2\2\2\n\u0081\3\2\2\2\f\u0095\3\2\2\2\16"+
		"\u009c\3\2\2\2\20\u009f\3\2\2\2\22\u00a2\3\2\2\2\24\u00a5\3\2\2\2\26\u00a8"+
		"\3\2\2\2\30\u00ad\3\2\2\2\32\u00c8\3\2\2\2\34\u00ce\3\2\2\2\36\u00e2\3"+
		"\2\2\2 \u00eb\3\2\2\2\"\u00f2\3\2\2\2$\u00f4\3\2\2\2&\u00f6\3\2\2\2(\u0100"+
		"\3\2\2\2*\u0102\3\2\2\2,\u011a\3\2\2\2.\u015a\3\2\2\2\60\u015e\3\2\2\2"+
		"\62\u016b\3\2\2\2\64\u016d\3\2\2\2\66\u0171\3\2\2\28\u0179\3\2\2\2:\u0193"+
		"\3\2\2\2<\u019a\3\2\2\2>\u019e\3\2\2\2@\u01a0\3\2\2\2B\u01a5\3\2\2\2D"+
		"\u01a9\3\2\2\2F\u01ab\3\2\2\2H\u01af\3\2\2\2J\u01b4\3\2\2\2L\u01bc\3\2"+
		"\2\2N\u01c4\3\2\2\2P\u01ca\3\2\2\2R\u01cc\3\2\2\2T\u01ce\3\2\2\2V\u01d6"+
		"\3\2\2\2X\u01df\3\2\2\2Z\u01e8\3\2\2\2\\\u01ea\3\2\2\2^\u01f3\3\2\2\2"+
		"`\u01fa\3\2\2\2bc\5\4\3\2c\3\3\2\2\2de\5\6\4\2eg\5\36\20\2fh\5\16\b\2"+
		"gf\3\2\2\2gh\3\2\2\2hj\3\2\2\2ik\5\22\n\2ji\3\2\2\2jk\3\2\2\2km\3\2\2"+
		"\2ln\5\24\13\2ml\3\2\2\2mn\3\2\2\2np\3\2\2\2oq\5\20\t\2po\3\2\2\2pq\3"+
		"\2\2\2qr\3\2\2\2rs\7\2\2\3s\5\3\2\2\2tu\7\r\2\2u{\5\32\16\2vw\7\r\2\2"+
		"wx\5\b\5\2xy\5\32\16\2y{\3\2\2\2zt\3\2\2\2zv\3\2\2\2{\7\3\2\2\2|}\7\16"+
		"\2\2}\177\7.\2\2~\u0080\t\2\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\t"+
		"\3\2\2\2\u0081\u0082\7\'\2\2\u0082\u0086\7=\2\2\u0083\u0087\7,\2\2\u0084"+
		"\u0087\5\62\32\2\u0085\u0087\5R*\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0085\3\2\2\2\u0087\u0090\3\2\2\2\u0088\u008c\79\2\2\u0089"+
		"\u008d\7,\2\2\u008a\u008d\5\62\32\2\u008b\u008d\5R*\2\u008c\u0089\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\u008f\3\2\2\2\u008e"+
		"\u0088\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7>\2\2\u0094"+
		"\13\3\2\2\2\u0095\u0096\7(\2\2\u0096\u0097\7=\2\2\u0097\u0098\7\66\2\2"+
		"\u0098\u0099\79\2\2\u0099\u009a\7\66\2\2\u009a\u009b\7>\2\2\u009b\r\3"+
		"\2\2\2\u009c\u009d\7\23\2\2\u009d\u009e\5,\27\2\u009e\17\3\2\2\2\u009f"+
		"\u00a0\7\24\2\2\u00a0\u00a1\5\26\f\2\u00a1\21\3\2\2\2\u00a2\u00a3\7\26"+
		"\2\2\u00a3\u00a4\7.\2\2\u00a4\23\3\2\2\2\u00a5\u00a6\7\25\2\2\u00a6\u00a7"+
		"\7.\2\2\u00a7\25\3\2\2\2\u00a8\u00ab\5\30\r\2\u00a9\u00aa\79\2\2\u00aa"+
		"\u00ac\5\26\f\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\27\3\2\2"+
		"\2\u00ad\u00ae\5\62\32\2\u00ae\u00af\t\3\2\2\u00af\31\3\2\2\2\u00b0\u00b2"+
		"\7!\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b6\5\62\32\2\u00b4\u00b5\7\21\2\2\u00b5\u00b7\7,\2\2\u00b6\u00b4\3"+
		"\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b9\79\2\2\u00b9"+
		"\u00bb\5\32\16\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c9\3"+
		"\2\2\2\u00bc\u00be\7!\2\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c2\5\34\17\2\u00c0\u00c1\7\21\2\2\u00c1\u00c3"+
		"\7,\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c5\79\2\2\u00c5\u00c7\5\32\16\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3"+
		"\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00b1\3\2\2\2\u00c8\u00bd\3\2\2\2\u00c9"+
		"\33\3\2\2\2\u00ca\u00cf\5\n\6\2\u00cb\u00cf\5\f\7\2\u00cc\u00cf\7.\2\2"+
		"\u00cd\u00cf\7\66\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\35\3\2\2\2\u00d0\u00d1\7\27\2\2\u00d1"+
		"\u00e3\5$\23\2\u00d2\u00d3\7\27\2\2\u00d3\u00d6\5 \21\2\u00d4\u00d5\7"+
		"\22\2\2\u00d5\u00d7\5&\24\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d9\79\2\2\u00d9\u00db\5\"\22\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00e3\3\2\2\2\u00dc\u00dd\7\27\2\2\u00dd"+
		"\u00e0\5\"\22\2\u00de\u00df\79\2\2\u00df\u00e1\5\"\22\2\u00e0\u00de\3"+
		"\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00d0\3\2\2\2\u00e2"+
		"\u00d2\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e3\37\3\2\2\2\u00e4\u00e5\7\3\2"+
		"\2\u00e5\u00ec\5F$\2\u00e6\u00e7\7\3\2\2\u00e7\u00e8\7,\2\2\u00e8\u00ec"+
		"\5F$\2\u00e9\u00ea\7\3\2\2\u00ea\u00ec\7,\2\2\u00eb\u00e4\3\2\2\2\u00eb"+
		"\u00e6\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec!\3\2\2\2\u00ed\u00ee\t\4\2\2"+
		"\u00ee\u00ef\7,\2\2\u00ef\u00f3\5H%\2\u00f0\u00f1\t\4\2\2\u00f1\u00f3"+
		"\7,\2\2\u00f2\u00ed\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3#\3\2\2\2\u00f4\u00f5"+
		"\5&\24\2\u00f5%\3\2\2\2\u00f6\u00f9\5(\25\2\u00f7\u00f8\t\5\2\2\u00f8"+
		"\u00fa\5&\24\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\'\3\2\2\2"+
		"\u00fb\u0101\5*\26\2\u00fc\u00fd\7=\2\2\u00fd\u00fe\5&\24\2\u00fe\u00ff"+
		"\7>\2\2\u00ff\u0101\3\2\2\2\u0100\u00fb\3\2\2\2\u0100\u00fc\3\2\2\2\u0101"+
		")\3\2\2\2\u0102\u0105\5Z.\2\u0103\u0104\7\22\2\2\u0104\u0106\5&\24\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106+\3\2\2\2\u0107\u010c\5.\30\2"+
		"\u0108\u0109\t\5\2\2\u0109\u010b\5.\30\2\u010a\u0108\3\2\2\2\u010b\u010e"+
		"\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u011b\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010f\u0110\7=\2\2\u0110\u0115\5.\30\2\u0111\u0112\t\5"+
		"\2\2\u0112\u0114\5.\30\2\u0113\u0111\3\2\2\2\u0114\u0117\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0118\u0119\7>\2\2\u0119\u011b\3\2\2\2\u011a\u0107\3\2\2\2\u011a"+
		"\u010f\3\2\2\2\u011b-\3\2\2\2\u011c\u011e\7\7\2\2\u011d\u011c\3\2\2\2"+
		"\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\5\60\31\2\u0120\u0121"+
		"\7\63\2\2\u0121\u0122\5\60\31\2\u0122\u015b\3\2\2\2\u0123\u0125\7\7\2"+
		"\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127"+
		"\5\60\31\2\u0127\u0128\7\t\2\2\u0128\u0129\7?\2\2\u0129\u012a\5> \2\u012a"+
		"\u012b\7@\2\2\u012b\u015b\3\2\2\2\u012c\u012e\7\7\2\2\u012d\u012c\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\5\60\31\2\u0130"+
		"\u0131\7\t\2\2\u0131\u0132\7\65\2\2\u0132\u015b\3\2\2\2\u0133\u0135\7"+
		"\7\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\5\60\31\2\u0137\u0138\7\n\2\2\u0138\u0139\7\66\2\2\u0139\u015b"+
		"\3\2\2\2\u013a\u013c\7\7\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\5\60\31\2\u013e\u013f\7\13\2\2\u013f\u0140"+
		"\7\66\2\2\u0140\u015b\3\2\2\2\u0141\u0143\7\7\2\2\u0142\u0141\3\2\2\2"+
		"\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\5\60\31\2\u0145\u0146"+
		"\7\f\2\2\u0146\u0147\7\66\2\2\u0147\u015b\3\2\2\2\u0148\u014a\7\7\2\2"+
		"\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c"+
		"\7\b\2\2\u014c\u014d\7=\2\2\u014d\u014e\5\4\3\2\u014e\u014f\7>\2\2\u014f"+
		"\u015b\3\2\2\2\u0150\u0152\7\7\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0153\3\2\2\2\u0153\u0154\7\34\2\2\u0154\u015b\5\62\32\2\u0155"+
		"\u0157\7\7\2\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u0159\7\34\2\2\u0159\u015b\5,\27\2\u015a\u011d\3\2\2\2\u015a"+
		"\u0124\3\2\2\2\u015a\u012d\3\2\2\2\u015a\u0134\3\2\2\2\u015a\u013b\3\2"+
		"\2\2\u015a\u0142\3\2\2\2\u015a\u0149\3\2\2\2\u015a\u0151\3\2\2\2\u015a"+
		"\u0156\3\2\2\2\u015b/\3\2\2\2\u015c\u015f\5R*\2\u015d\u015f\5\62\32\2"+
		"\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f\61\3\2\2\2\u0160\u0163"+
		"\7,\2\2\u0161\u0162\78\2\2\u0162\u0164\5T+\2\u0163\u0161\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u016c\3\2\2\2\u0165\u0166\7,\2\2\u0166\u0169\5\64"+
		"\33\2\u0167\u0168\78\2\2\u0168\u016a\5T+\2\u0169\u0167\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0160\3\2\2\2\u016b\u0165\3\2\2\2\u016c"+
		"\63\3\2\2\2\u016d\u016e\7;\2\2\u016e\u016f\5\66\34\2\u016f\u0170\7<\2"+
		"\2\u0170\65\3\2\2\2\u0171\u0176\58\35\2\u0172\u0173\7\5\2\2\u0173\u0175"+
		"\58\35\2\u0174\u0172\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\67\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017e\5:\36"+
		"\2\u017a\u017b\7\4\2\2\u017b\u017d\5:\36\2\u017c\u017a\3\2\2\2\u017d\u0180"+
		"\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f9\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0181\u0184\7*\2\2\u0182\u0183\79\2\2\u0183\u0185\t\6\2"+
		"\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0194\3\2\2\2\u0186\u0189"+
		"\7+\2\2\u0187\u0188\79\2\2\u0188\u018a\t\6\2\2\u0189\u0187\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u0194\3\2\2\2\u018b\u0190\5P)\2\u018c\u018d\7\63"+
		"\2\2\u018d\u0191\5P)\2\u018e\u018f\7\t\2\2\u018f\u0191\7\65\2\2\u0190"+
		"\u018c\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0194\7\65"+
		"\2\2\u0193\u0181\3\2\2\2\u0193\u0186\3\2\2\2\u0193\u018b\3\2\2\2\u0193"+
		"\u0192\3\2\2\2\u0194;\3\2\2\2\u0195\u019b\7\65\2\2\u0196\u0197\5P)\2\u0197"+
		"\u0198\7\t\2\2\u0198\u0199\7\65\2\2\u0199\u019b\3\2\2\2\u019a\u0195\3"+
		"\2\2\2\u019a\u0196\3\2\2\2\u019b=\3\2\2\2\u019c\u019f\5@!\2\u019d\u019f"+
		"\7\64\2\2\u019e\u019c\3\2\2\2\u019e\u019d\3\2\2\2\u019f?\3\2\2\2\u01a0"+
		"\u01a3\5R*\2\u01a1\u01a2\79\2\2\u01a2\u01a4\5@!\2\u01a3\u01a1\3\2\2\2"+
		"\u01a3\u01a4\3\2\2\2\u01a4A\3\2\2\2\u01a5\u01a6\7;\2\2\u01a6\u01a7\5D"+
		"#\2\u01a7\u01a8\7<\2\2\u01a8C\3\2\2\2\u01a9\u01aa\t\7\2\2\u01aaE\3\2\2"+
		"\2\u01ab\u01ac\7;\2\2\u01ac\u01ad\5J&\2\u01ad\u01ae\7<\2\2\u01aeG\3\2"+
		"\2\2\u01af\u01b0\7;\2\2\u01b0\u01b1\7\"\2\2\u01b1\u01b2\5N(\2\u01b2\u01b3"+
		"\7<\2\2\u01b3I\3\2\2\2\u01b4\u01b9\5L\'\2\u01b5\u01b6\7\5\2\2\u01b6\u01b8"+
		"\5L\'\2\u01b7\u01b5\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01baK\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01c1\5N(\2\u01bd"+
		"\u01be\7\4\2\2\u01be\u01c0\5N(\2\u01bf\u01bd\3\2\2\2\u01c0\u01c3\3\2\2"+
		"\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2M\3\2\2\2\u01c3\u01c1"+
		"\3\2\2\2\u01c4\u01c5\5P)\2\u01c5\u01c6\7\63\2\2\u01c6\u01c7\5P)\2\u01c7"+
		"O\3\2\2\2\u01c8\u01cb\5T+\2\u01c9\u01cb\5R*\2\u01ca\u01c8\3\2\2\2\u01ca"+
		"\u01c9\3\2\2\2\u01cbQ\3\2\2\2\u01cc\u01cd\t\b\2\2\u01cdS\3\2\2\2\u01ce"+
		"\u01d3\5V,\2\u01cf\u01d0\78\2\2\u01d0\u01d2\5V,\2\u01d1\u01cf\3\2\2\2"+
		"\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4U\3"+
		"\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d8\7,\2\2\u01d7\u01d9\5\64\33\2\u01d8"+
		"\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9W\3\2\2\2\u01da\u01db\7=\2\2\u01db"+
		"\u01dc\5Z.\2\u01dc\u01dd\7>\2\2\u01dd\u01e0\3\2\2\2\u01de\u01e0\5Z.\2"+
		"\u01df\u01da\3\2\2\2\u01df\u01de\3\2\2\2\u01e0Y\3\2\2\2\u01e1\u01e3\7"+
		",\2\2\u01e2\u01e4\7,\2\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e9\3\2\2\2\u01e5\u01e9\5\\/\2\u01e6\u01e9\5^\60\2\u01e7\u01e9\5`\61"+
		"\2\u01e8\u01e1\3\2\2\2\u01e8\u01e5\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e7"+
		"\3\2\2\2\u01e9[\3\2\2\2\u01ea\u01ec\7,\2\2\u01eb\u01ed\7,\2\2\u01ec\u01eb"+
		"\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f1\3\2\2\2\u01ee\u01ef\7;\2\2\u01ef"+
		"\u01f0\7+\2\2\u01f0\u01f2\7<\2\2\u01f1\u01ee\3\2\2\2\u01f1\u01f2\3\2\2"+
		"\2\u01f2]\3\2\2\2\u01f3\u01f5\7\36\2\2\u01f4\u01f6\7,\2\2\u01f5\u01f4"+
		"\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f9\5F$\2\u01f8"+
		"\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9_\3\2\2\2\u01fa\u01fc\7\35\2\2"+
		"\u01fb\u01fd\7,\2\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0200"+
		"\3\2\2\2\u01fe\u0201\5F$\2\u01ff\u0201\5B\"\2\u0200\u01fe\3\2\2\2\u0200"+
		"\u01ff\3\2\2\2\u0200\u0201\3\2\2\2\u0201a\3\2\2\2Egjmpz\177\u0086\u008c"+
		"\u0090\u00ab\u00b1\u00b6\u00ba\u00bd\u00c2\u00c6\u00c8\u00ce\u00d6\u00da"+
		"\u00e0\u00e2\u00eb\u00f2\u00f9\u0100\u0105\u010c\u0115\u011a\u011d\u0124"+
		"\u012d\u0134\u013b\u0142\u0149\u0151\u0156\u015a\u015e\u0163\u0169\u016b"+
		"\u0176\u017e\u0184\u0189\u0190\u0193\u019a\u019e\u01a3\u01b9\u01c1\u01ca"+
		"\u01d3\u01d8\u01df\u01e3\u01e8\u01ec\u01f1\u01f5\u01f8\u01fc\u0200";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}