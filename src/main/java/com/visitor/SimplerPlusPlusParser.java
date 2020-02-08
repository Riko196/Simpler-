package com.visitor;
 // Generated from src/main/java/com/visitor/SimplerPlusPlusParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimplerPlusPlusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, RETURN=2, ASSERT=3, IF=4, ELIF=5, ELSE=6, WHILE=7, FOR=8, IN=9, 
		NULL=10, CONTINUE=11, BREAK=12, TRUE=13, FALSE=14, CONST=15, LESS_THAN=16, 
		GREATER_THAN=17, EQUALS=18, GT_EQ=19, LT_EQ=20, NOT_EQ=21, BIN_OR=22, 
		BIN_XOR=23, BIN_AND=24, LOG_OR=25, LOG_AND=26, LOG_NOT=27, ADD=28, MINUS=29, 
		STAR=30, DIV=31, MOD=32, POWER=33, LEFT_SHIFT=34, RIGHT_SHIFT=35, ASSIGN=36, 
		ADD_ASSIGN=37, SUB_ASSIGN=38, MULT_ASSIGN=39, DIV_ASSIGN=40, MOD_ASSIGN=41, 
		AND_ASSIGN=42, OR_ASSIGN=43, XOR_ASSIGN=44, LEFT_SHIFT_ASSIGN=45, RIGHT_SHIFT_ASSIGN=46, 
		POWER_ASSIGN=47, DOT=48, COMMA=49, COLON=50, QUERT=51, SEMI_COLON=52, 
		ARROW=53, TILDE=54, VOID=55, CHAR=56, SHORT=57, INT=58, LONG=59, FLOAT=60, 
		DOUBLE=61, BOOLEAN=62, STRING=63, STRING_VALUE=64, DECIMAL_INTEGER=65, 
		OCT_INTEGER=66, HEX_INTEGER=67, BIN_INTEGER=68, IMAG_NUMBER=69, FLOAT_NUMBER=70, 
		OPEN_PAREN=71, CLOSE_PAREN=72, OPEN_BRACE=73, CLOSE_BRACE=74, OPEN_BRACKET=75, 
		CLOSE_BRACKET=76, NAME=77, MORE_LINE_COMMENT=78, ONE_LINE_COMMENT=79, 
		NEWLINE=80, WHITESPACE=81;
	public static final int
		RULE_root = 0, RULE_functions = 1, RULE_statement = 2, RULE_block_of_code = 3, 
		RULE_declaration = 4, RULE_declaration_list = 5, RULE_declaration_variable = 6, 
		RULE_declaration_array = 7, RULE_declaration_existing_variable = 8, RULE_declaration_existing_array = 9, 
		RULE_value_declaration = 10, RULE_expression = 11, RULE_compared_expression = 12, 
		RULE_binary_expression = 13, RULE_math_expression = 14, RULE_shift_expression = 15, 
		RULE_unary_expression = 16, RULE_call_expression = 17, RULE_call_array = 18, 
		RULE_call_variable = 19, RULE_deep_expression = 20, RULE_value = 21, RULE_condition = 22, 
		RULE_while_loop = 23, RULE_for_loop = 24, RULE_jump = 25, RULE_def_function = 26, 
		RULE_def_parameters = 27, RULE_def_parameter = 28, RULE_variable_types = 29, 
		RULE_function_types = 30, RULE_integer = 31, RULE_boolean_value = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "functions", "statement", "block_of_code", "declaration", "declaration_list", 
			"declaration_variable", "declaration_array", "declaration_existing_variable", 
			"declaration_existing_array", "value_declaration", "expression", "compared_expression", 
			"binary_expression", "math_expression", "shift_expression", "unary_expression", 
			"call_expression", "call_array", "call_variable", "deep_expression", 
			"value", "condition", "while_loop", "for_loop", "jump", "def_function", 
			"def_parameters", "def_parameter", "variable_types", "function_types", 
			"integer", "boolean_value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'return'", "'assert'", "'if'", "'elif'", "'else'", "'while'", 
			"'for'", "'in'", "'null'", "'continue'", "'break'", "'True'", "'False'", 
			"'const'", "'<'", "'>'", "'='", "'>='", "'<='", "'!='", "'|'", "'^'", 
			"'&'", "'or'", "'and'", "'not'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", 
			"'<<'", "'>>'", "'<-'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", 
			"'|='", "'^='", "'<<='", "'>>='", "'**='", "'.'", "','", "':'", "'?'", 
			"';'", "'->'", "'~'", "'void'", "'char'", "'short'", "'int'", "'long'", 
			"'float'", "'double'", "'boolean'", "'string'", null, null, null, null, 
			null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "RETURN", "ASSERT", "IF", "ELIF", "ELSE", "WHILE", "FOR", 
			"IN", "NULL", "CONTINUE", "BREAK", "TRUE", "FALSE", "CONST", "LESS_THAN", 
			"GREATER_THAN", "EQUALS", "GT_EQ", "LT_EQ", "NOT_EQ", "BIN_OR", "BIN_XOR", 
			"BIN_AND", "LOG_OR", "LOG_AND", "LOG_NOT", "ADD", "MINUS", "STAR", "DIV", 
			"MOD", "POWER", "LEFT_SHIFT", "RIGHT_SHIFT", "ASSIGN", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "XOR_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", 
			"POWER_ASSIGN", "DOT", "COMMA", "COLON", "QUERT", "SEMI_COLON", "ARROW", 
			"TILDE", "VOID", "CHAR", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BOOLEAN", 
			"STRING", "STRING_VALUE", "DECIMAL_INTEGER", "OCT_INTEGER", "HEX_INTEGER", 
			"BIN_INTEGER", "IMAG_NUMBER", "FLOAT_NUMBER", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACE", "CLOSE_BRACE", "OPEN_BRACKET", "CLOSE_BRACKET", "NAME", 
			"MORE_LINE_COMMENT", "ONE_LINE_COMMENT", "NEWLINE", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "SimplerPlusPlusParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimplerPlusPlusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SimplerPlusPlusParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			functions();
			setState(67);
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

	public static class FunctionsContext extends ParserRuleContext {
		public List<Def_functionContext> def_function() {
			return getRuleContexts(Def_functionContext.class);
		}
		public Def_functionContext def_function(int i) {
			return getRuleContext(Def_functionContext.class,i);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				def_function();
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DEF );
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

	public static class StatementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Declaration_listContext declaration_list() {
			return getRuleContext(Declaration_listContext.class,0);
		}
		public Call_expressionContext call_expression() {
			return getRuleContext(Call_expressionContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(SimplerPlusPlusParser.SEMI_COLON, 0); }
		public JumpContext jump() {
			return getRuleContext(JumpContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				while_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				for_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				declaration_list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				call_expression();
				setState(79);
				match(SEMI_COLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				jump();
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

	public static class Block_of_codeContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(SimplerPlusPlusParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(SimplerPlusPlusParser.CLOSE_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Block_of_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_of_code; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitBlock_of_code(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_of_codeContext block_of_code() throws RecognitionException {
		Block_of_codeContext _localctx = new Block_of_codeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block_of_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(OPEN_BRACE);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << CHAR) | (1L << INT) | (1L << BOOLEAN) | (1L << STRING))) != 0) || _la==OPEN_PAREN || _la==NAME) {
				{
				{
				setState(85);
				statement();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(CLOSE_BRACE);
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

	public static class DeclarationContext extends ParserRuleContext {
		public Declaration_variableContext declaration_variable() {
			return getRuleContext(Declaration_variableContext.class,0);
		}
		public Declaration_existing_variableContext declaration_existing_variable() {
			return getRuleContext(Declaration_existing_variableContext.class,0);
		}
		public Declaration_arrayContext declaration_array() {
			return getRuleContext(Declaration_arrayContext.class,0);
		}
		public Declaration_existing_arrayContext declaration_existing_array() {
			return getRuleContext(Declaration_existing_arrayContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				declaration_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				declaration_existing_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				declaration_array();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				declaration_existing_array();
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

	public static class Declaration_listContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public TerminalNode SEMI_COLON() { return getToken(SimplerPlusPlusParser.SEMI_COLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SimplerPlusPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimplerPlusPlusParser.COMMA, i);
		}
		public Declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitDeclaration_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_listContext declaration_list() throws RecognitionException {
		Declaration_listContext _localctx = new Declaration_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			declaration();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(100);
				match(COMMA);
				setState(101);
				declaration();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(SEMI_COLON);
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

	public static class Declaration_variableContext extends ParserRuleContext {
		public Variable_typesContext variable_types() {
			return getRuleContext(Variable_typesContext.class,0);
		}
		public TerminalNode NAME() { return getToken(SimplerPlusPlusParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(SimplerPlusPlusParser.ASSIGN, 0); }
		public Value_declarationContext value_declaration() {
			return getRuleContext(Value_declarationContext.class,0);
		}
		public Declaration_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitDeclaration_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_variableContext declaration_variable() throws RecognitionException {
		Declaration_variableContext _localctx = new Declaration_variableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			variable_types();
			setState(110);
			match(NAME);
			setState(111);
			match(ASSIGN);
			setState(112);
			value_declaration();
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

	public static class Declaration_arrayContext extends ParserRuleContext {
		public Variable_typesContext variable_types() {
			return getRuleContext(Variable_typesContext.class,0);
		}
		public TerminalNode NAME() { return getToken(SimplerPlusPlusParser.NAME, 0); }
		public List<TerminalNode> OPEN_BRACKET() { return getTokens(SimplerPlusPlusParser.OPEN_BRACKET); }
		public TerminalNode OPEN_BRACKET(int i) {
			return getToken(SimplerPlusPlusParser.OPEN_BRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CLOSE_BRACKET() { return getTokens(SimplerPlusPlusParser.CLOSE_BRACKET); }
		public TerminalNode CLOSE_BRACKET(int i) {
			return getToken(SimplerPlusPlusParser.CLOSE_BRACKET, i);
		}
		public Declaration_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_array; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitDeclaration_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_arrayContext declaration_array() throws RecognitionException {
		Declaration_arrayContext _localctx = new Declaration_arrayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaration_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			variable_types();
			setState(115);
			match(NAME);
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				match(OPEN_BRACKET);
				setState(117);
				expression();
				setState(118);
				match(CLOSE_BRACKET);
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN_BRACKET );
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

	public static class Declaration_existing_variableContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SimplerPlusPlusParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(SimplerPlusPlusParser.ASSIGN, 0); }
		public Value_declarationContext value_declaration() {
			return getRuleContext(Value_declarationContext.class,0);
		}
		public Declaration_existing_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_existing_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitDeclaration_existing_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_existing_variableContext declaration_existing_variable() throws RecognitionException {
		Declaration_existing_variableContext _localctx = new Declaration_existing_variableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaration_existing_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(NAME);
			setState(125);
			match(ASSIGN);
			setState(126);
			value_declaration();
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

	public static class Declaration_existing_arrayContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SimplerPlusPlusParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(SimplerPlusPlusParser.ASSIGN, 0); }
		public Value_declarationContext value_declaration() {
			return getRuleContext(Value_declarationContext.class,0);
		}
		public List<TerminalNode> OPEN_BRACKET() { return getTokens(SimplerPlusPlusParser.OPEN_BRACKET); }
		public TerminalNode OPEN_BRACKET(int i) {
			return getToken(SimplerPlusPlusParser.OPEN_BRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CLOSE_BRACKET() { return getTokens(SimplerPlusPlusParser.CLOSE_BRACKET); }
		public TerminalNode CLOSE_BRACKET(int i) {
			return getToken(SimplerPlusPlusParser.CLOSE_BRACKET, i);
		}
		public Declaration_existing_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_existing_array; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitDeclaration_existing_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_existing_arrayContext declaration_existing_array() throws RecognitionException {
		Declaration_existing_arrayContext _localctx = new Declaration_existing_arrayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaration_existing_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(NAME);
			setState(133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129);
				match(OPEN_BRACKET);
				setState(130);
				expression();
				setState(131);
				match(CLOSE_BRACKET);
				}
				}
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN_BRACKET );
			setState(137);
			match(ASSIGN);
			setState(138);
			value_declaration();
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

	public static class Value_declarationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Value_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitValue_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_declarationContext value_declaration() throws RecognitionException {
		Value_declarationContext _localctx = new Value_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Compared_expressionContext compared_expression() {
			return getRuleContext(Compared_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			compared_expression(0);
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

	public static class Compared_expressionContext extends ParserRuleContext {
		public Token op;
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public List<Compared_expressionContext> compared_expression() {
			return getRuleContexts(Compared_expressionContext.class);
		}
		public Compared_expressionContext compared_expression(int i) {
			return getRuleContext(Compared_expressionContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(SimplerPlusPlusParser.EQUALS, 0); }
		public TerminalNode LESS_THAN() { return getToken(SimplerPlusPlusParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SimplerPlusPlusParser.GREATER_THAN, 0); }
		public TerminalNode LT_EQ() { return getToken(SimplerPlusPlusParser.LT_EQ, 0); }
		public TerminalNode GT_EQ() { return getToken(SimplerPlusPlusParser.GT_EQ, 0); }
		public TerminalNode NOT_EQ() { return getToken(SimplerPlusPlusParser.NOT_EQ, 0); }
		public Compared_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compared_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitCompared_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compared_expressionContext compared_expression() throws RecognitionException {
		return compared_expression(0);
	}

	private Compared_expressionContext compared_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Compared_expressionContext _localctx = new Compared_expressionContext(_ctx, _parentState);
		Compared_expressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_compared_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(145);
			binary_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Compared_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_compared_expression);
					setState(147);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(148);
					((Compared_expressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << EQUALS) | (1L << GT_EQ) | (1L << LT_EQ) | (1L << NOT_EQ))) != 0)) ) {
						((Compared_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(149);
					compared_expression(3);
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Binary_expressionContext extends ParserRuleContext {
		public Token op;
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public List<Binary_expressionContext> binary_expression() {
			return getRuleContexts(Binary_expressionContext.class);
		}
		public Binary_expressionContext binary_expression(int i) {
			return getRuleContext(Binary_expressionContext.class,i);
		}
		public TerminalNode BIN_OR() { return getToken(SimplerPlusPlusParser.BIN_OR, 0); }
		public TerminalNode BIN_AND() { return getToken(SimplerPlusPlusParser.BIN_AND, 0); }
		public TerminalNode BIN_XOR() { return getToken(SimplerPlusPlusParser.BIN_XOR, 0); }
		public TerminalNode LOG_OR() { return getToken(SimplerPlusPlusParser.LOG_OR, 0); }
		public TerminalNode LOG_AND() { return getToken(SimplerPlusPlusParser.LOG_AND, 0); }
		public Binary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitBinary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_expressionContext binary_expression() throws RecognitionException {
		return binary_expression(0);
	}

	private Binary_expressionContext binary_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Binary_expressionContext _localctx = new Binary_expressionContext(_ctx, _parentState);
		Binary_expressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_binary_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(156);
			math_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Binary_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_binary_expression);
					setState(158);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(159);
					((Binary_expressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIN_OR) | (1L << BIN_XOR) | (1L << BIN_AND) | (1L << LOG_OR) | (1L << LOG_AND))) != 0)) ) {
						((Binary_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(160);
					binary_expression(3);
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Math_expressionContext extends ParserRuleContext {
		public Token op;
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public List<Math_expressionContext> math_expression() {
			return getRuleContexts(Math_expressionContext.class);
		}
		public Math_expressionContext math_expression(int i) {
			return getRuleContext(Math_expressionContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SimplerPlusPlusParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SimplerPlusPlusParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SimplerPlusPlusParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(SimplerPlusPlusParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(SimplerPlusPlusParser.MINUS, 0); }
		public Math_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitMath_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_expressionContext math_expression() throws RecognitionException {
		return math_expression(0);
	}

	private Math_expressionContext math_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Math_expressionContext _localctx = new Math_expressionContext(_ctx, _parentState);
		Math_expressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_math_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(167);
			shift_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(175);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new Math_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(169);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(170);
						((Math_expressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Math_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(171);
						math_expression(4);
						}
						break;
					case 2:
						{
						_localctx = new Math_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(172);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(173);
						((Math_expressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==MINUS) ) {
							((Math_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(174);
						math_expression(3);
						}
						break;
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Shift_expressionContext extends ParserRuleContext {
		public Token op;
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public TerminalNode LEFT_SHIFT() { return getToken(SimplerPlusPlusParser.LEFT_SHIFT, 0); }
		public TerminalNode RIGHT_SHIFT() { return getToken(SimplerPlusPlusParser.RIGHT_SHIFT, 0); }
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitShift_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		return shift_expression(0);
	}

	private Shift_expressionContext shift_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, _parentState);
		Shift_expressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_shift_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(181);
			unary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Shift_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_shift_expression);
					setState(183);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(184);
					((Shift_expressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==LEFT_SHIFT || _la==RIGHT_SHIFT) ) {
						((Shift_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(185);
					shift_expression(3);
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public Token op;
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SimplerPlusPlusParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(SimplerPlusPlusParser.MINUS, 0); }
		public TerminalNode TILDE() { return getToken(SimplerPlusPlusParser.TILDE, 0); }
		public TerminalNode LOG_NOT() { return getToken(SimplerPlusPlusParser.LOG_NOT, 0); }
		public Call_expressionContext call_expression() {
			return getRuleContext(Call_expressionContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unary_expression);
		int _la;
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOG_NOT:
			case ADD:
			case MINUS:
			case TILDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				((Unary_expressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOG_NOT) | (1L << ADD) | (1L << MINUS) | (1L << TILDE))) != 0)) ) {
					((Unary_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(192);
				unary_expression();
				}
				break;
			case OPEN_PAREN:
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				call_expression();
				}
				break;
			case TRUE:
			case FALSE:
			case STRING_VALUE:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				value();
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

	public static class Call_expressionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SimplerPlusPlusParser.NAME, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(SimplerPlusPlusParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(SimplerPlusPlusParser.CLOSE_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimplerPlusPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimplerPlusPlusParser.COMMA, i);
		}
		public Call_arrayContext call_array() {
			return getRuleContext(Call_arrayContext.class,0);
		}
		public Call_variableContext call_variable() {
			return getRuleContext(Call_variableContext.class,0);
		}
		public Deep_expressionContext deep_expression() {
			return getRuleContext(Deep_expressionContext.class,0);
		}
		public Call_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitCall_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_expressionContext call_expression() throws RecognitionException {
		Call_expressionContext _localctx = new Call_expressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_call_expression);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(NAME);
				setState(198);
				match(OPEN_PAREN);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << LOG_NOT) | (1L << ADD) | (1L << MINUS) | (1L << TILDE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_VALUE - 64)) | (1L << (DECIMAL_INTEGER - 64)) | (1L << (OCT_INTEGER - 64)) | (1L << (HEX_INTEGER - 64)) | (1L << (BIN_INTEGER - 64)) | (1L << (OPEN_PAREN - 64)) | (1L << (NAME - 64)))) != 0)) {
					{
					setState(199);
					expression();
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(200);
						match(COMMA);
						setState(201);
						expression();
						}
						}
						setState(206);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(209);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				call_array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				call_variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				deep_expression();
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

	public static class Call_arrayContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SimplerPlusPlusParser.NAME, 0); }
		public List<TerminalNode> OPEN_BRACKET() { return getTokens(SimplerPlusPlusParser.OPEN_BRACKET); }
		public TerminalNode OPEN_BRACKET(int i) {
			return getToken(SimplerPlusPlusParser.OPEN_BRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CLOSE_BRACKET() { return getTokens(SimplerPlusPlusParser.CLOSE_BRACKET); }
		public TerminalNode CLOSE_BRACKET(int i) {
			return getToken(SimplerPlusPlusParser.CLOSE_BRACKET, i);
		}
		public Call_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_array; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitCall_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_arrayContext call_array() throws RecognitionException {
		Call_arrayContext _localctx = new Call_arrayContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_call_array);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(NAME);
			setState(220); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(216);
					match(OPEN_BRACKET);
					setState(217);
					expression();
					setState(218);
					match(CLOSE_BRACKET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(222); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Call_variableContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SimplerPlusPlusParser.NAME, 0); }
		public Call_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitCall_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_variableContext call_variable() throws RecognitionException {
		Call_variableContext _localctx = new Call_variableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_call_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(NAME);
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

	public static class Deep_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(SimplerPlusPlusParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(SimplerPlusPlusParser.CLOSE_PAREN, 0); }
		public Deep_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deep_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitDeep_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deep_expressionContext deep_expression() throws RecognitionException {
		Deep_expressionContext _localctx = new Deep_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_deep_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(OPEN_PAREN);
			setState(227);
			expression();
			setState(228);
			match(CLOSE_PAREN);
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

	public static class ValueContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Boolean_valueContext boolean_value() {
			return getRuleContext(Boolean_valueContext.class,0);
		}
		public TerminalNode STRING_VALUE() { return getToken(SimplerPlusPlusParser.STRING_VALUE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_value);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				integer();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				boolean_value();
				}
				break;
			case STRING_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(STRING_VALUE);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SimplerPlusPlusParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Block_of_codeContext> block_of_code() {
			return getRuleContexts(Block_of_codeContext.class);
		}
		public Block_of_codeContext block_of_code(int i) {
			return getRuleContext(Block_of_codeContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SimplerPlusPlusParser.ELSE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(IF);
			setState(236);
			expression();
			setState(237);
			block_of_code();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(238);
				match(ELSE);
				setState(239);
				block_of_code();
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SimplerPlusPlusParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Block_of_codeContext block_of_code() {
			return getRuleContext(Block_of_codeContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(WHILE);
			setState(243);
			expression();
			setState(244);
			block_of_code();
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SimplerPlusPlusParser.FOR, 0); }
		public TerminalNode NAME() { return getToken(SimplerPlusPlusParser.NAME, 0); }
		public TerminalNode IN() { return getToken(SimplerPlusPlusParser.IN, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(SimplerPlusPlusParser.OPEN_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimplerPlusPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimplerPlusPlusParser.COMMA, i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(SimplerPlusPlusParser.CLOSE_PAREN, 0); }
		public Block_of_codeContext block_of_code() {
			return getRuleContext(Block_of_codeContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(FOR);
			setState(247);
			match(NAME);
			setState(248);
			match(IN);
			setState(249);
			match(OPEN_PAREN);
			setState(250);
			expression();
			setState(251);
			match(COMMA);
			setState(252);
			expression();
			setState(253);
			match(COMMA);
			setState(254);
			expression();
			setState(255);
			match(CLOSE_PAREN);
			setState(256);
			block_of_code();
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

	public static class JumpContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(SimplerPlusPlusParser.RETURN, 0); }
		public TerminalNode SEMI_COLON() { return getToken(SimplerPlusPlusParser.SEMI_COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitJump(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpContext jump() throws RecognitionException {
		JumpContext _localctx = new JumpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_jump);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(RETURN);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << LOG_NOT) | (1L << ADD) | (1L << MINUS) | (1L << TILDE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_VALUE - 64)) | (1L << (DECIMAL_INTEGER - 64)) | (1L << (OCT_INTEGER - 64)) | (1L << (HEX_INTEGER - 64)) | (1L << (BIN_INTEGER - 64)) | (1L << (OPEN_PAREN - 64)) | (1L << (NAME - 64)))) != 0)) {
				{
				setState(259);
				expression();
				}
			}

			setState(262);
			match(SEMI_COLON);
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

	public static class Def_functionContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(SimplerPlusPlusParser.DEF, 0); }
		public TerminalNode NAME() { return getToken(SimplerPlusPlusParser.NAME, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(SimplerPlusPlusParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(SimplerPlusPlusParser.CLOSE_PAREN, 0); }
		public TerminalNode ARROW() { return getToken(SimplerPlusPlusParser.ARROW, 0); }
		public Function_typesContext function_types() {
			return getRuleContext(Function_typesContext.class,0);
		}
		public Block_of_codeContext block_of_code() {
			return getRuleContext(Block_of_codeContext.class,0);
		}
		public Def_parametersContext def_parameters() {
			return getRuleContext(Def_parametersContext.class,0);
		}
		public Def_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitDef_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_functionContext def_function() throws RecognitionException {
		Def_functionContext _localctx = new Def_functionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_def_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(DEF);
			setState(265);
			match(NAME);
			setState(266);
			match(OPEN_PAREN);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << INT) | (1L << BOOLEAN) | (1L << STRING))) != 0)) {
				{
				setState(267);
				def_parameters();
				}
			}

			setState(270);
			match(CLOSE_PAREN);
			setState(271);
			match(ARROW);
			setState(272);
			function_types();
			setState(273);
			block_of_code();
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

	public static class Def_parametersContext extends ParserRuleContext {
		public List<Def_parameterContext> def_parameter() {
			return getRuleContexts(Def_parameterContext.class);
		}
		public Def_parameterContext def_parameter(int i) {
			return getRuleContext(Def_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimplerPlusPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimplerPlusPlusParser.COMMA, i);
		}
		public Def_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitDef_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_parametersContext def_parameters() throws RecognitionException {
		Def_parametersContext _localctx = new Def_parametersContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_def_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			def_parameter();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(276);
				match(COMMA);
				setState(277);
				def_parameter();
				}
				}
				setState(282);
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

	public static class Def_parameterContext extends ParserRuleContext {
		public Variable_typesContext variable_types() {
			return getRuleContext(Variable_typesContext.class,0);
		}
		public TerminalNode NAME() { return getToken(SimplerPlusPlusParser.NAME, 0); }
		public Def_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitDef_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_parameterContext def_parameter() throws RecognitionException {
		Def_parameterContext _localctx = new Def_parameterContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_def_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			variable_types();
			setState(284);
			match(NAME);
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

	public static class Variable_typesContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(SimplerPlusPlusParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(SimplerPlusPlusParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(SimplerPlusPlusParser.INT, 0); }
		public TerminalNode STRING() { return getToken(SimplerPlusPlusParser.STRING, 0); }
		public Variable_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_types; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitVariable_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_typesContext variable_types() throws RecognitionException {
		Variable_typesContext _localctx = new Variable_typesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_variable_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << INT) | (1L << BOOLEAN) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Function_typesContext extends ParserRuleContext {
		public Variable_typesContext variable_types() {
			return getRuleContext(Variable_typesContext.class,0);
		}
		public TerminalNode VOID() { return getToken(SimplerPlusPlusParser.VOID, 0); }
		public Function_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_types; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitFunction_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_typesContext function_types() throws RecognitionException {
		Function_typesContext _localctx = new Function_typesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_function_types);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case INT:
			case BOOLEAN:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				variable_types();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(VOID);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode DECIMAL_INTEGER() { return getToken(SimplerPlusPlusParser.DECIMAL_INTEGER, 0); }
		public TerminalNode OCT_INTEGER() { return getToken(SimplerPlusPlusParser.OCT_INTEGER, 0); }
		public TerminalNode HEX_INTEGER() { return getToken(SimplerPlusPlusParser.HEX_INTEGER, 0); }
		public TerminalNode BIN_INTEGER() { return getToken(SimplerPlusPlusParser.BIN_INTEGER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DECIMAL_INTEGER - 65)) | (1L << (OCT_INTEGER - 65)) | (1L << (HEX_INTEGER - 65)) | (1L << (BIN_INTEGER - 65)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Boolean_valueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SimplerPlusPlusParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SimplerPlusPlusParser.FALSE, 0); }
		public Boolean_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitBoolean_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_valueContext boolean_value() throws RecognitionException {
		Boolean_valueContext _localctx = new Boolean_valueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_boolean_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return compared_expression_sempred((Compared_expressionContext)_localctx, predIndex);
		case 13:
			return binary_expression_sempred((Binary_expressionContext)_localctx, predIndex);
		case 14:
			return math_expression_sempred((Math_expressionContext)_localctx, predIndex);
		case 15:
			return shift_expression_sempred((Shift_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean compared_expression_sempred(Compared_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean binary_expression_sempred(Binary_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean math_expression_sempred(Math_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean shift_expression_sempred(Shift_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3S\u012b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\3\6\3I\n\3\r\3\16\3J\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4U\n\4\3\5\3\5\7\5Y\n\5\f\5\16\5\\\13\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\5\6d\n\6\3\7\3\7\3\7\7\7i\n\7\f\7\16\7l\13\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\6\t{\n\t\r\t\16\t|\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\6\13\u0088\n\13\r\13\16\13\u0089\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0099\n\16\f\16\16"+
		"\16\u009c\13\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00a4\n\17\f\17\16"+
		"\17\u00a7\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00b2"+
		"\n\20\f\20\16\20\u00b5\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00bd"+
		"\n\21\f\21\16\21\u00c0\13\21\3\22\3\22\3\22\3\22\5\22\u00c6\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u00cd\n\23\f\23\16\23\u00d0\13\23\5\23\u00d2"+
		"\n\23\3\23\3\23\3\23\3\23\5\23\u00d8\n\23\3\24\3\24\3\24\3\24\3\24\6\24"+
		"\u00df\n\24\r\24\16\24\u00e0\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\5\27\u00ec\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u00f3\n\30\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\5\33\u0107\n\33\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u010f\n"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\7\35\u0119\n\35\f\35\16\35"+
		"\u011c\13\35\3\36\3\36\3\36\3\37\3\37\3 \3 \5 \u0125\n \3!\3!\3\"\3\""+
		"\3\"\2\6\32\34\36 #\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@B\2\13\3\2\22\27\3\2\30\34\3\2 \"\3\2\36\37\3\2$%\4\2\35"+
		"\3788\5\2::<<@A\3\2CF\3\2\17\20\2\u012a\2D\3\2\2\2\4H\3\2\2\2\6T\3\2\2"+
		"\2\bV\3\2\2\2\nc\3\2\2\2\fe\3\2\2\2\16o\3\2\2\2\20t\3\2\2\2\22~\3\2\2"+
		"\2\24\u0082\3\2\2\2\26\u008e\3\2\2\2\30\u0090\3\2\2\2\32\u0092\3\2\2\2"+
		"\34\u009d\3\2\2\2\36\u00a8\3\2\2\2 \u00b6\3\2\2\2\"\u00c5\3\2\2\2$\u00d7"+
		"\3\2\2\2&\u00d9\3\2\2\2(\u00e2\3\2\2\2*\u00e4\3\2\2\2,\u00eb\3\2\2\2."+
		"\u00ed\3\2\2\2\60\u00f4\3\2\2\2\62\u00f8\3\2\2\2\64\u0104\3\2\2\2\66\u010a"+
		"\3\2\2\28\u0115\3\2\2\2:\u011d\3\2\2\2<\u0120\3\2\2\2>\u0124\3\2\2\2@"+
		"\u0126\3\2\2\2B\u0128\3\2\2\2DE\5\4\3\2EF\7\2\2\3F\3\3\2\2\2GI\5\66\34"+
		"\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\5\3\2\2\2LU\5.\30\2MU\5\60"+
		"\31\2NU\5\62\32\2OU\5\f\7\2PQ\5$\23\2QR\7\66\2\2RU\3\2\2\2SU\5\64\33\2"+
		"TL\3\2\2\2TM\3\2\2\2TN\3\2\2\2TO\3\2\2\2TP\3\2\2\2TS\3\2\2\2U\7\3\2\2"+
		"\2VZ\7K\2\2WY\5\6\4\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2"+
		"\2\\Z\3\2\2\2]^\7L\2\2^\t\3\2\2\2_d\5\16\b\2`d\5\22\n\2ad\5\20\t\2bd\5"+
		"\24\13\2c_\3\2\2\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2d\13\3\2\2\2ej\5\n\6\2"+
		"fg\7\63\2\2gi\5\n\6\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2"+
		"\2lj\3\2\2\2mn\7\66\2\2n\r\3\2\2\2op\5<\37\2pq\7O\2\2qr\7&\2\2rs\5\26"+
		"\f\2s\17\3\2\2\2tu\5<\37\2uz\7O\2\2vw\7M\2\2wx\5\30\r\2xy\7N\2\2y{\3\2"+
		"\2\2zv\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\21\3\2\2\2~\177\7O\2\2\177"+
		"\u0080\7&\2\2\u0080\u0081\5\26\f\2\u0081\23\3\2\2\2\u0082\u0087\7O\2\2"+
		"\u0083\u0084\7M\2\2\u0084\u0085\5\30\r\2\u0085\u0086\7N\2\2\u0086\u0088"+
		"\3\2\2\2\u0087\u0083\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7&\2\2\u008c\u008d\5\26"+
		"\f\2\u008d\25\3\2\2\2\u008e\u008f\5\30\r\2\u008f\27\3\2\2\2\u0090\u0091"+
		"\5\32\16\2\u0091\31\3\2\2\2\u0092\u0093\b\16\1\2\u0093\u0094\5\34\17\2"+
		"\u0094\u009a\3\2\2\2\u0095\u0096\f\4\2\2\u0096\u0097\t\2\2\2\u0097\u0099"+
		"\5\32\16\5\u0098\u0095\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2"+
		"\u009a\u009b\3\2\2\2\u009b\33\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e"+
		"\b\17\1\2\u009e\u009f\5\36\20\2\u009f\u00a5\3\2\2\2\u00a0\u00a1\f\4\2"+
		"\2\u00a1\u00a2\t\3\2\2\u00a2\u00a4\5\34\17\5\u00a3\u00a0\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\35\3\2\2"+
		"\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\b\20\1\2\u00a9\u00aa\5 \21\2\u00aa"+
		"\u00b3\3\2\2\2\u00ab\u00ac\f\5\2\2\u00ac\u00ad\t\4\2\2\u00ad\u00b2\5\36"+
		"\20\6\u00ae\u00af\f\4\2\2\u00af\u00b0\t\5\2\2\u00b0\u00b2\5\36\20\5\u00b1"+
		"\u00ab\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\37\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7"+
		"\b\21\1\2\u00b7\u00b8\5\"\22\2\u00b8\u00be\3\2\2\2\u00b9\u00ba\f\4\2\2"+
		"\u00ba\u00bb\t\6\2\2\u00bb\u00bd\5 \21\5\u00bc\u00b9\3\2\2\2\u00bd\u00c0"+
		"\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf!\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c2\t\7\2\2\u00c2\u00c6\5\"\22\2\u00c3\u00c6\5"+
		"$\23\2\u00c4\u00c6\5,\27\2\u00c5\u00c1\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c4\3\2\2\2\u00c6#\3\2\2\2\u00c7\u00c8\7O\2\2\u00c8\u00d1\7I\2\2\u00c9"+
		"\u00ce\5\30\r\2\u00ca\u00cb\7\63\2\2\u00cb\u00cd\5\30\r\2\u00cc\u00ca"+
		"\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00c9\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d8\7J\2\2\u00d4\u00d8\5&\24\2\u00d5"+
		"\u00d8\5(\25\2\u00d6\u00d8\5*\26\2\u00d7\u00c7\3\2\2\2\u00d7\u00d4\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8%\3\2\2\2\u00d9\u00de"+
		"\7O\2\2\u00da\u00db\7M\2\2\u00db\u00dc\5\30\r\2\u00dc\u00dd\7N\2\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00da\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1\'\3\2\2\2\u00e2\u00e3\7O\2\2\u00e3)\3\2"+
		"\2\2\u00e4\u00e5\7I\2\2\u00e5\u00e6\5\30\r\2\u00e6\u00e7\7J\2\2\u00e7"+
		"+\3\2\2\2\u00e8\u00ec\5@!\2\u00e9\u00ec\5B\"\2\u00ea\u00ec\7B\2\2\u00eb"+
		"\u00e8\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec-\3\2\2\2"+
		"\u00ed\u00ee\7\6\2\2\u00ee\u00ef\5\30\r\2\u00ef\u00f2\5\b\5\2\u00f0\u00f1"+
		"\7\b\2\2\u00f1\u00f3\5\b\5\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"/\3\2\2\2\u00f4\u00f5\7\t\2\2\u00f5\u00f6\5\30\r\2\u00f6\u00f7\5\b\5\2"+
		"\u00f7\61\3\2\2\2\u00f8\u00f9\7\n\2\2\u00f9\u00fa\7O\2\2\u00fa\u00fb\7"+
		"\13\2\2\u00fb\u00fc\7I\2\2\u00fc\u00fd\5\30\r\2\u00fd\u00fe\7\63\2\2\u00fe"+
		"\u00ff\5\30\r\2\u00ff\u0100\7\63\2\2\u0100\u0101\5\30\r\2\u0101\u0102"+
		"\7J\2\2\u0102\u0103\5\b\5\2\u0103\63\3\2\2\2\u0104\u0106\7\4\2\2\u0105"+
		"\u0107\5\30\r\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3"+
		"\2\2\2\u0108\u0109\7\66\2\2\u0109\65\3\2\2\2\u010a\u010b\7\3\2\2\u010b"+
		"\u010c\7O\2\2\u010c\u010e\7I\2\2\u010d\u010f\58\35\2\u010e\u010d\3\2\2"+
		"\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\7J\2\2\u0111\u0112"+
		"\7\67\2\2\u0112\u0113\5> \2\u0113\u0114\5\b\5\2\u0114\67\3\2\2\2\u0115"+
		"\u011a\5:\36\2\u0116\u0117\7\63\2\2\u0117\u0119\5:\36\2\u0118\u0116\3"+
		"\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"9\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\5<\37\2\u011e\u011f\7O\2\2\u011f"+
		";\3\2\2\2\u0120\u0121\t\b\2\2\u0121=\3\2\2\2\u0122\u0125\5<\37\2\u0123"+
		"\u0125\79\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125?\3\2\2\2\u0126"+
		"\u0127\t\t\2\2\u0127A\3\2\2\2\u0128\u0129\t\n\2\2\u0129C\3\2\2\2\31JT"+
		"Zcj|\u0089\u009a\u00a5\u00b1\u00b3\u00be\u00c5\u00ce\u00d1\u00d7\u00e0"+
		"\u00eb\u00f2\u0106\u010e\u011a\u0124";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}