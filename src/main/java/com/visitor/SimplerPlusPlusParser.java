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
		RULE_root = 0, RULE_statement = 1, RULE_block_of_code = 2, RULE_declaration_list = 3, 
		RULE_init_declaration = 4, RULE_declaration = 5, RULE_value_declaration = 6, 
		RULE_more_dimension_value_declaration = 7, RULE_more_dimension_value = 8, 
		RULE_expression = 9, RULE_compared_expression = 10, RULE_binary_expression = 11, 
		RULE_logical_expression = 12, RULE_math_expression = 13, RULE_shift_expression = 14, 
		RULE_unary_expression = 15, RULE_call_expression = 16, RULE_identifier_expression = 17, 
		RULE_value = 18, RULE_if_condition = 19, RULE_elif_condition = 20, RULE_else_condition = 21, 
		RULE_while_loop = 22, RULE_for_loop = 23, RULE_for_condition = 24, RULE_jump = 25, 
		RULE_def_function = 26, RULE_def_parameters = 27, RULE_def_parameter = 28, 
		RULE_given_parameters = 29, RULE_variable_types = 30, RULE_function_types = 31, 
		RULE_number = 32, RULE_integer = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "statement", "block_of_code", "declaration_list", "init_declaration", 
			"declaration", "value_declaration", "more_dimension_value_declaration", 
			"more_dimension_value", "expression", "compared_expression", "binary_expression", 
			"logical_expression", "math_expression", "shift_expression", "unary_expression", 
			"call_expression", "identifier_expression", "value", "if_condition", 
			"elif_condition", "else_condition", "while_loop", "for_loop", "for_condition", 
			"jump", "def_function", "def_parameters", "def_parameter", "given_parameters", 
			"variable_types", "function_types", "number", "integer"
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
		public TerminalNode EOF() { return getToken(SimplerPlusPlusParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << RETURN) | (1L << ASSERT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << CONTINUE) | (1L << BREAK) | (1L << CONST) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << BOOLEAN) | (1L << STRING))) != 0) || _la==OPEN_PAREN || _la==NAME) {
				{
				{
				setState(68);
				statement();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
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

	public static class StatementContext extends ParserRuleContext {
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Def_functionContext def_function() {
			return getRuleContext(Def_functionContext.class,0);
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
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				if_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				while_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				for_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				def_function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				declaration_list();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				call_expression();
				setState(82);
				match(SEMI_COLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
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
		enterRule(_localctx, 4, RULE_block_of_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(OPEN_BRACE);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << RETURN) | (1L << ASSERT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << CONTINUE) | (1L << BREAK) | (1L << CONST) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << BOOLEAN) | (1L << STRING))) != 0) || _la==OPEN_PAREN || _la==NAME) {
				{
				{
				setState(88);
				statement();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
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

	public static class Declaration_listContext extends ParserRuleContext {
		public List<Init_declarationContext> init_declaration() {
			return getRuleContexts(Init_declarationContext.class);
		}
		public Init_declarationContext init_declaration(int i) {
			return getRuleContext(Init_declarationContext.class,i);
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
		enterRule(_localctx, 6, RULE_declaration_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			init_declaration();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(97);
				match(COMMA);
				setState(98);
				init_declaration();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
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

	public static class Init_declarationContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode CONST() { return getToken(SimplerPlusPlusParser.CONST, 0); }
		public Variable_typesContext variable_types() {
			return getRuleContext(Variable_typesContext.class,0);
		}
		public Init_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitInit_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_declarationContext init_declaration() throws RecognitionException {
		Init_declarationContext _localctx = new Init_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_init_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(106);
				match(CONST);
				}
			}

			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << BOOLEAN) | (1L << STRING))) != 0)) {
				{
				setState(109);
				variable_types();
				}
			}

			setState(112);
			declaration();
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
		public TerminalNode NAME() { return getToken(SimplerPlusPlusParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(SimplerPlusPlusParser.ASSIGN, 0); }
		public Value_declarationContext value_declaration() {
			return getRuleContext(Value_declarationContext.class,0);
		}
		public More_dimension_value_declarationContext more_dimension_value_declaration() {
			return getRuleContext(More_dimension_value_declarationContext.class,0);
		}
		public List<TerminalNode> OPEN_BRACKET() { return getTokens(SimplerPlusPlusParser.OPEN_BRACKET); }
		public TerminalNode OPEN_BRACKET(int i) {
			return getToken(SimplerPlusPlusParser.OPEN_BRACKET, i);
		}
		public List<TerminalNode> CLOSE_BRACKET() { return getTokens(SimplerPlusPlusParser.CLOSE_BRACKET); }
		public TerminalNode CLOSE_BRACKET(int i) {
			return getToken(SimplerPlusPlusParser.CLOSE_BRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 10, RULE_declaration);
		int _la;
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(NAME);
				setState(115);
				match(ASSIGN);
				setState(116);
				value_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(NAME);
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(118);
					match(OPEN_BRACKET);
					setState(119);
					match(CLOSE_BRACKET);
					}
					}
					setState(122); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OPEN_BRACKET );
				setState(124);
				match(ASSIGN);
				setState(125);
				more_dimension_value_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(NAME);
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(127);
					match(OPEN_BRACKET);
					setState(128);
					expression();
					setState(129);
					match(CLOSE_BRACKET);
					}
					}
					setState(133); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OPEN_BRACKET );
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(135);
					match(ASSIGN);
					setState(136);
					value_declaration();
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

	public static class Value_declarationContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QUERT() { return getToken(SimplerPlusPlusParser.QUERT, 0); }
		public TerminalNode COLON() { return getToken(SimplerPlusPlusParser.COLON, 0); }
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
		enterRule(_localctx, 12, RULE_value_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			expression();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUERT) {
				{
				setState(142);
				match(QUERT);
				setState(143);
				expression();
				setState(144);
				match(COLON);
				setState(145);
				expression();
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

	public static class More_dimension_value_declarationContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(SimplerPlusPlusParser.OPEN_BRACE, 0); }
		public List<More_dimension_valueContext> more_dimension_value() {
			return getRuleContexts(More_dimension_valueContext.class);
		}
		public More_dimension_valueContext more_dimension_value(int i) {
			return getRuleContext(More_dimension_valueContext.class,i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(SimplerPlusPlusParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SimplerPlusPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimplerPlusPlusParser.COMMA, i);
		}
		public More_dimension_value_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more_dimension_value_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitMore_dimension_value_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final More_dimension_value_declarationContext more_dimension_value_declaration() throws RecognitionException {
		More_dimension_value_declarationContext _localctx = new More_dimension_value_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_more_dimension_value_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(OPEN_BRACE);
			setState(150);
			more_dimension_value();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(151);
				match(COMMA);
				setState(152);
				more_dimension_value();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
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

	public static class More_dimension_valueContext extends ParserRuleContext {
		public More_dimension_value_declarationContext more_dimension_value_declaration() {
			return getRuleContext(More_dimension_value_declarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public More_dimension_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more_dimension_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitMore_dimension_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final More_dimension_valueContext more_dimension_value() throws RecognitionException {
		More_dimension_valueContext _localctx = new More_dimension_valueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_more_dimension_value);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				more_dimension_value_declaration();
				}
				break;
			case ASSERT:
			case NULL:
			case LOG_NOT:
			case ADD:
			case MINUS:
			case TILDE:
			case STRING_VALUE:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case IMAG_NUMBER:
			case FLOAT_NUMBER:
			case OPEN_PAREN:
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				expression();
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
		enterRule(_localctx, 18, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_compared_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(167);
			binary_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(187);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new Compared_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_compared_expression);
						setState(169);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(170);
						match(EQUALS);
						setState(171);
						compared_expression(8);
						}
						break;
					case 2:
						{
						_localctx = new Compared_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_compared_expression);
						setState(172);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(173);
						match(LESS_THAN);
						setState(174);
						compared_expression(7);
						}
						break;
					case 3:
						{
						_localctx = new Compared_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_compared_expression);
						setState(175);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(176);
						match(GREATER_THAN);
						setState(177);
						compared_expression(6);
						}
						break;
					case 4:
						{
						_localctx = new Compared_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_compared_expression);
						setState(178);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(179);
						match(LT_EQ);
						setState(180);
						compared_expression(5);
						}
						break;
					case 5:
						{
						_localctx = new Compared_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_compared_expression);
						setState(181);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(182);
						match(GT_EQ);
						setState(183);
						compared_expression(4);
						}
						break;
					case 6:
						{
						_localctx = new Compared_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_compared_expression);
						setState(184);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(185);
						match(NOT_EQ);
						setState(186);
						compared_expression(3);
						}
						break;
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_binary_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(193);
			logical_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(204);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new Binary_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binary_expression);
						setState(195);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(196);
						match(BIN_OR);
						setState(197);
						binary_expression(5);
						}
						break;
					case 2:
						{
						_localctx = new Binary_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binary_expression);
						setState(198);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(199);
						match(BIN_AND);
						setState(200);
						binary_expression(4);
						}
						break;
					case 3:
						{
						_localctx = new Binary_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binary_expression);
						setState(201);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(202);
						match(BIN_XOR);
						setState(203);
						binary_expression(3);
						}
						break;
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class Logical_expressionContext extends ParserRuleContext {
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public TerminalNode LOG_AND() { return getToken(SimplerPlusPlusParser.LOG_AND, 0); }
		public TerminalNode LOG_OR() { return getToken(SimplerPlusPlusParser.LOG_OR, 0); }
		public Logical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitLogical_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_expressionContext logical_expression() throws RecognitionException {
		return logical_expression(0);
	}

	private Logical_expressionContext logical_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_expressionContext _localctx = new Logical_expressionContext(_ctx, _parentState);
		Logical_expressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_logical_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(210);
			math_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(218);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new Logical_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(212);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(213);
						match(LOG_AND);
						setState(214);
						logical_expression(4);
						}
						break;
					case 2:
						{
						_localctx = new Logical_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(215);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(216);
						match(LOG_OR);
						setState(217);
						logical_expression(3);
						}
						break;
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public List<Math_expressionContext> math_expression() {
			return getRuleContexts(Math_expressionContext.class);
		}
		public Math_expressionContext math_expression(int i) {
			return getRuleContext(Math_expressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(SimplerPlusPlusParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(SimplerPlusPlusParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(SimplerPlusPlusParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SimplerPlusPlusParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SimplerPlusPlusParser.MOD, 0); }
		public TerminalNode POWER() { return getToken(SimplerPlusPlusParser.POWER, 0); }
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_math_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(224);
			shift_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(244);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new Math_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(226);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(227);
						match(ADD);
						setState(228);
						math_expression(8);
						}
						break;
					case 2:
						{
						_localctx = new Math_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(229);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(230);
						match(MINUS);
						setState(231);
						math_expression(7);
						}
						break;
					case 3:
						{
						_localctx = new Math_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(232);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(233);
						match(STAR);
						setState(234);
						math_expression(6);
						}
						break;
					case 4:
						{
						_localctx = new Math_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(235);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(236);
						match(DIV);
						setState(237);
						math_expression(5);
						}
						break;
					case 5:
						{
						_localctx = new Math_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(238);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(239);
						match(MOD);
						setState(240);
						math_expression(4);
						}
						break;
					case 6:
						{
						_localctx = new Math_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(241);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(242);
						match(POWER);
						setState(243);
						math_expression(3);
						}
						break;
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_shift_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(250);
			unary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(258);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new Shift_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shift_expression);
						setState(252);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(253);
						match(LEFT_SHIFT);
						setState(254);
						shift_expression(4);
						}
						break;
					case 2:
						{
						_localctx = new Shift_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shift_expression);
						setState(255);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(256);
						match(RIGHT_SHIFT);
						setState(257);
						shift_expression(3);
						}
						break;
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		public TerminalNode ADD() { return getToken(SimplerPlusPlusParser.ADD, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SimplerPlusPlusParser.MINUS, 0); }
		public TerminalNode LOG_NOT() { return getToken(SimplerPlusPlusParser.LOG_NOT, 0); }
		public TerminalNode TILDE() { return getToken(SimplerPlusPlusParser.TILDE, 0); }
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
		enterRule(_localctx, 30, RULE_unary_expression);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(ADD);
				setState(264);
				unary_expression();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(MINUS);
				setState(266);
				unary_expression();
				}
				break;
			case LOG_NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				match(LOG_NOT);
				setState(268);
				unary_expression();
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				match(TILDE);
				setState(270);
				unary_expression();
				}
				break;
			case ASSERT:
			case OPEN_PAREN:
			case NAME:
				enterOuterAlt(_localctx, 5);
				{
				setState(271);
				call_expression();
				}
				break;
			case NULL:
			case STRING_VALUE:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case IMAG_NUMBER:
			case FLOAT_NUMBER:
				enterOuterAlt(_localctx, 6);
				{
				setState(272);
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
		public Given_parametersContext given_parameters() {
			return getRuleContext(Given_parametersContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(SimplerPlusPlusParser.ASSERT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Identifier_expressionContext identifier_expression() {
			return getRuleContext(Identifier_expressionContext.class,0);
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
		enterRule(_localctx, 32, RULE_call_expression);
		int _la;
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(NAME);
				setState(276);
				match(OPEN_PAREN);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERT) | (1L << NULL) | (1L << LOG_NOT) | (1L << ADD) | (1L << MINUS) | (1L << TILDE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_VALUE - 64)) | (1L << (DECIMAL_INTEGER - 64)) | (1L << (OCT_INTEGER - 64)) | (1L << (HEX_INTEGER - 64)) | (1L << (BIN_INTEGER - 64)) | (1L << (IMAG_NUMBER - 64)) | (1L << (FLOAT_NUMBER - 64)) | (1L << (OPEN_PAREN - 64)) | (1L << (NAME - 64)))) != 0)) {
					{
					setState(277);
					given_parameters();
					}
				}

				setState(280);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(ASSERT);
				setState(282);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				identifier_expression();
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

	public static class Identifier_expressionContext extends ParserRuleContext {
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
		public TerminalNode OPEN_PAREN() { return getToken(SimplerPlusPlusParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(SimplerPlusPlusParser.CLOSE_PAREN, 0); }
		public Identifier_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitIdentifier_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_expressionContext identifier_expression() throws RecognitionException {
		Identifier_expressionContext _localctx = new Identifier_expressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_identifier_expression);
		try {
			int _alt;
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(NAME);
				setState(292); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(288);
						match(OPEN_BRACKET);
						setState(289);
						expression();
						setState(290);
						match(CLOSE_BRACKET);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(294); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				match(OPEN_PAREN);
				setState(297);
				expression();
				setState(298);
				match(CLOSE_PAREN);
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

	public static class ValueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public List<TerminalNode> STRING_VALUE() { return getTokens(SimplerPlusPlusParser.STRING_VALUE); }
		public TerminalNode STRING_VALUE(int i) {
			return getToken(SimplerPlusPlusParser.STRING_VALUE, i);
		}
		public TerminalNode NULL() { return getToken(SimplerPlusPlusParser.NULL, 0); }
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
		enterRule(_localctx, 36, RULE_value);
		try {
			int _alt;
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case IMAG_NUMBER:
			case FLOAT_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				number();
				}
				break;
			case STRING_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(304); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(303);
						match(STRING_VALUE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(306); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				match(NULL);
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

	public static class If_conditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SimplerPlusPlusParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Block_of_codeContext block_of_code() {
			return getRuleContext(Block_of_codeContext.class,0);
		}
		public List<Elif_conditionContext> elif_condition() {
			return getRuleContexts(Elif_conditionContext.class);
		}
		public Elif_conditionContext elif_condition(int i) {
			return getRuleContext(Elif_conditionContext.class,i);
		}
		public Else_conditionContext else_condition() {
			return getRuleContext(Else_conditionContext.class,0);
		}
		public If_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitIf_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_conditionContext if_condition() throws RecognitionException {
		If_conditionContext _localctx = new If_conditionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_if_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(IF);
			setState(312);
			expression();
			setState(313);
			block_of_code();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(314);
				elif_condition();
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(320);
				else_condition();
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

	public static class Elif_conditionContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(SimplerPlusPlusParser.ELIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Block_of_codeContext block_of_code() {
			return getRuleContext(Block_of_codeContext.class,0);
		}
		public Elif_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitElif_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_conditionContext elif_condition() throws RecognitionException {
		Elif_conditionContext _localctx = new Elif_conditionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elif_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(ELIF);
			setState(324);
			expression();
			setState(325);
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

	public static class Else_conditionContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(SimplerPlusPlusParser.ELSE, 0); }
		public Block_of_codeContext block_of_code() {
			return getRuleContext(Block_of_codeContext.class,0);
		}
		public Else_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitElse_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_conditionContext else_condition() throws RecognitionException {
		Else_conditionContext _localctx = new Else_conditionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_else_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(ELSE);
			setState(328);
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
		enterRule(_localctx, 44, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(WHILE);
			setState(331);
			expression();
			setState(332);
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
		public For_conditionContext for_condition() {
			return getRuleContext(For_conditionContext.class,0);
		}
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
		enterRule(_localctx, 46, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(FOR);
			setState(335);
			match(NAME);
			setState(336);
			match(IN);
			setState(337);
			for_condition();
			setState(338);
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

	public static class For_conditionContext extends ParserRuleContext {
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
		public For_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitFor_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_conditionContext for_condition() throws RecognitionException {
		For_conditionContext _localctx = new For_conditionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_for_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(OPEN_PAREN);
			setState(341);
			expression();
			setState(342);
			match(COMMA);
			setState(343);
			expression();
			setState(344);
			match(COMMA);
			setState(345);
			expression();
			setState(346);
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

	public static class JumpContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(SimplerPlusPlusParser.RETURN, 0); }
		public TerminalNode SEMI_COLON() { return getToken(SimplerPlusPlusParser.SEMI_COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(SimplerPlusPlusParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(SimplerPlusPlusParser.CONTINUE, 0); }
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
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				match(RETURN);
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERT) | (1L << NULL) | (1L << LOG_NOT) | (1L << ADD) | (1L << MINUS) | (1L << TILDE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_VALUE - 64)) | (1L << (DECIMAL_INTEGER - 64)) | (1L << (OCT_INTEGER - 64)) | (1L << (HEX_INTEGER - 64)) | (1L << (BIN_INTEGER - 64)) | (1L << (IMAG_NUMBER - 64)) | (1L << (FLOAT_NUMBER - 64)) | (1L << (OPEN_PAREN - 64)) | (1L << (NAME - 64)))) != 0)) {
					{
					setState(349);
					expression();
					}
				}

				setState(352);
				match(SEMI_COLON);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(BREAK);
				setState(354);
				match(SEMI_COLON);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				match(CONTINUE);
				setState(356);
				match(SEMI_COLON);
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
			setState(359);
			match(DEF);
			setState(360);
			match(NAME);
			setState(361);
			match(OPEN_PAREN);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << BOOLEAN) | (1L << STRING))) != 0)) {
				{
				setState(362);
				def_parameters();
				}
			}

			setState(365);
			match(CLOSE_PAREN);
			setState(366);
			match(ARROW);
			setState(367);
			function_types();
			setState(368);
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
			setState(370);
			def_parameter();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(371);
				match(COMMA);
				setState(372);
				def_parameter();
				}
				}
				setState(377);
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
		public List<TerminalNode> OPEN_BRACKET() { return getTokens(SimplerPlusPlusParser.OPEN_BRACKET); }
		public TerminalNode OPEN_BRACKET(int i) {
			return getToken(SimplerPlusPlusParser.OPEN_BRACKET, i);
		}
		public List<TerminalNode> CLOSE_BRACKET() { return getTokens(SimplerPlusPlusParser.CLOSE_BRACKET); }
		public TerminalNode CLOSE_BRACKET(int i) {
			return getToken(SimplerPlusPlusParser.CLOSE_BRACKET, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			variable_types();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_BRACKET) {
				{
				{
				setState(379);
				match(OPEN_BRACKET);
				setState(380);
				match(CLOSE_BRACKET);
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386);
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

	public static class Given_parametersContext extends ParserRuleContext {
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
		public Given_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_given_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitGiven_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Given_parametersContext given_parameters() throws RecognitionException {
		Given_parametersContext _localctx = new Given_parametersContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_given_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			expression();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(389);
				match(COMMA);
				setState(390);
				expression();
				}
				}
				setState(395);
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

	public static class Variable_typesContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(SimplerPlusPlusParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(SimplerPlusPlusParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(SimplerPlusPlusParser.INT, 0); }
		public TerminalNode LONG() { return getToken(SimplerPlusPlusParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(SimplerPlusPlusParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(SimplerPlusPlusParser.DOUBLE, 0); }
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
		enterRule(_localctx, 60, RULE_variable_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << BOOLEAN) | (1L << STRING))) != 0)) ) {
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
		enterRule(_localctx, 62, RULE_function_types);
		try {
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case BOOLEAN:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				variable_types();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
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

	public static class NumberContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode IMAG_NUMBER() { return getToken(SimplerPlusPlusParser.IMAG_NUMBER, 0); }
		public TerminalNode FLOAT_NUMBER() { return getToken(SimplerPlusPlusParser.FLOAT_NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplerPlusPlusParserVisitor ) return ((SimplerPlusPlusParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_number);
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				integer();
				}
				break;
			case IMAG_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				match(IMAG_NUMBER);
				}
				break;
			case FLOAT_NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				match(FLOAT_NUMBER);
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
		enterRule(_localctx, 66, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return compared_expression_sempred((Compared_expressionContext)_localctx, predIndex);
		case 11:
			return binary_expression_sempred((Binary_expressionContext)_localctx, predIndex);
		case 12:
			return logical_expression_sempred((Logical_expressionContext)_localctx, predIndex);
		case 13:
			return math_expression_sempred((Math_expressionContext)_localctx, predIndex);
		case 14:
			return shift_expression_sempred((Shift_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean compared_expression_sempred(Compared_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean binary_expression_sempred(Binary_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logical_expression_sempred(Logical_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean math_expression_sempred(Math_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 7);
		case 12:
			return precpred(_ctx, 6);
		case 13:
			return precpred(_ctx, 5);
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean shift_expression_sempred(Shift_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 3);
		case 18:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3S\u019c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3X\n\3\3\4\3\4\7\4\\\n\4\f\4\16\4_\13\4\3\4\3\4"+
		"\3\5\3\5\3\5\7\5f\n\5\f\5\16\5i\13\5\3\5\3\5\3\6\5\6n\n\6\3\6\5\6q\n\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\6\7{\n\7\r\7\16\7|\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\6\7\u0086\n\7\r\7\16\7\u0087\3\7\3\7\5\7\u008c\n\7\5\7\u008e"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0096\n\b\3\t\3\t\3\t\3\t\7\t\u009c\n"+
		"\t\f\t\16\t\u009f\13\t\3\t\3\t\3\n\3\n\5\n\u00a5\n\n\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\7\f\u00be\n\f\f\f\16\f\u00c1\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\7\r\u00cf\n\r\f\r\16\r\u00d2\13\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\7\16\u00dd\n\16\f\16\16\16\u00e0\13\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00f7\n\17\f\17\16\17\u00fa\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0105\n\20\f\20"+
		"\16\20\u0108\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u0114\n\21\3\22\3\22\3\22\5\22\u0119\n\22\3\22\3\22\3\22\3\22\5\22"+
		"\u011f\n\22\3\23\3\23\3\23\3\23\3\23\3\23\6\23\u0127\n\23\r\23\16\23\u0128"+
		"\3\23\3\23\3\23\3\23\5\23\u012f\n\23\3\24\3\24\6\24\u0133\n\24\r\24\16"+
		"\24\u0134\3\24\5\24\u0138\n\24\3\25\3\25\3\25\3\25\7\25\u013e\n\25\f\25"+
		"\16\25\u0141\13\25\3\25\5\25\u0144\n\25\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\5\33\u0161\n\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u0168\n\33\3\34\3\34\3\34\3\34\5\34\u016e\n\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\7\35\u0178\n\35\f\35\16\35\u017b\13\35\3"+
		"\36\3\36\3\36\7\36\u0180\n\36\f\36\16\36\u0183\13\36\3\36\3\36\3\37\3"+
		"\37\3\37\7\37\u018a\n\37\f\37\16\37\u018d\13\37\3 \3 \3!\3!\5!\u0193\n"+
		"!\3\"\3\"\3\"\5\"\u0198\n\"\3#\3#\3#\2\7\26\30\32\34\36$\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\4\4\2::<A\3\2C"+
		"F\2\u01b9\2I\3\2\2\2\4W\3\2\2\2\6Y\3\2\2\2\bb\3\2\2\2\nm\3\2\2\2\f\u008d"+
		"\3\2\2\2\16\u008f\3\2\2\2\20\u0097\3\2\2\2\22\u00a4\3\2\2\2\24\u00a6\3"+
		"\2\2\2\26\u00a8\3\2\2\2\30\u00c2\3\2\2\2\32\u00d3\3\2\2\2\34\u00e1\3\2"+
		"\2\2\36\u00fb\3\2\2\2 \u0113\3\2\2\2\"\u011e\3\2\2\2$\u012e\3\2\2\2&\u0137"+
		"\3\2\2\2(\u0139\3\2\2\2*\u0145\3\2\2\2,\u0149\3\2\2\2.\u014c\3\2\2\2\60"+
		"\u0150\3\2\2\2\62\u0156\3\2\2\2\64\u0167\3\2\2\2\66\u0169\3\2\2\28\u0174"+
		"\3\2\2\2:\u017c\3\2\2\2<\u0186\3\2\2\2>\u018e\3\2\2\2@\u0192\3\2\2\2B"+
		"\u0197\3\2\2\2D\u0199\3\2\2\2FH\5\4\3\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2"+
		"IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\2\2\3M\3\3\2\2\2NX\5(\25\2OX\5.\30"+
		"\2PX\5\60\31\2QX\5\66\34\2RX\5\b\5\2ST\5\"\22\2TU\7\66\2\2UX\3\2\2\2V"+
		"X\5\64\33\2WN\3\2\2\2WO\3\2\2\2WP\3\2\2\2WQ\3\2\2\2WR\3\2\2\2WS\3\2\2"+
		"\2WV\3\2\2\2X\5\3\2\2\2Y]\7K\2\2Z\\\5\4\3\2[Z\3\2\2\2\\_\3\2\2\2][\3\2"+
		"\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7L\2\2a\7\3\2\2\2bg\5\n\6\2cd\7\63"+
		"\2\2df\5\n\6\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2"+
		"\2\2jk\7\66\2\2k\t\3\2\2\2ln\7\21\2\2ml\3\2\2\2mn\3\2\2\2np\3\2\2\2oq"+
		"\5> \2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\5\f\7\2s\13\3\2\2\2tu\7O\2\2uv"+
		"\7&\2\2v\u008e\5\16\b\2wz\7O\2\2xy\7M\2\2y{\7N\2\2zx\3\2\2\2{|\3\2\2\2"+
		"|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7&\2\2\177\u008e\5\20\t\2\u0080\u0085"+
		"\7O\2\2\u0081\u0082\7M\2\2\u0082\u0083\5\24\13\2\u0083\u0084\7N\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0081\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u008a\7&\2\2\u008a"+
		"\u008c\5\16\b\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3"+
		"\2\2\2\u008dt\3\2\2\2\u008dw\3\2\2\2\u008d\u0080\3\2\2\2\u008e\r\3\2\2"+
		"\2\u008f\u0095\5\24\13\2\u0090\u0091\7\65\2\2\u0091\u0092\5\24\13\2\u0092"+
		"\u0093\7\64\2\2\u0093\u0094\5\24\13\2\u0094\u0096\3\2\2\2\u0095\u0090"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\17\3\2\2\2\u0097\u0098\7K\2\2\u0098"+
		"\u009d\5\22\n\2\u0099\u009a\7\63\2\2\u009a\u009c\5\22\n\2\u009b\u0099"+
		"\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7L\2\2\u00a1\21\3\2\2\2"+
		"\u00a2\u00a5\5\20\t\2\u00a3\u00a5\5\24\13\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\23\3\2\2\2\u00a6\u00a7\5\26\f\2\u00a7\25\3\2\2\2"+
		"\u00a8\u00a9\b\f\1\2\u00a9\u00aa\5\30\r\2\u00aa\u00bf\3\2\2\2\u00ab\u00ac"+
		"\f\t\2\2\u00ac\u00ad\7\24\2\2\u00ad\u00be\5\26\f\n\u00ae\u00af\f\b\2\2"+
		"\u00af\u00b0\7\22\2\2\u00b0\u00be\5\26\f\t\u00b1\u00b2\f\7\2\2\u00b2\u00b3"+
		"\7\23\2\2\u00b3\u00be\5\26\f\b\u00b4\u00b5\f\6\2\2\u00b5\u00b6\7\26\2"+
		"\2\u00b6\u00be\5\26\f\7\u00b7\u00b8\f\5\2\2\u00b8\u00b9\7\25\2\2\u00b9"+
		"\u00be\5\26\f\6\u00ba\u00bb\f\4\2\2\u00bb\u00bc\7\27\2\2\u00bc\u00be\5"+
		"\26\f\5\u00bd\u00ab\3\2\2\2\u00bd\u00ae\3\2\2\2\u00bd\u00b1\3\2\2\2\u00bd"+
		"\u00b4\3\2\2\2\u00bd\u00b7\3\2\2\2\u00bd\u00ba\3\2\2\2\u00be\u00c1\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\27\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c2\u00c3\b\r\1\2\u00c3\u00c4\5\32\16\2\u00c4\u00d0\3\2\2\2"+
		"\u00c5\u00c6\f\6\2\2\u00c6\u00c7\7\30\2\2\u00c7\u00cf\5\30\r\7\u00c8\u00c9"+
		"\f\5\2\2\u00c9\u00ca\7\32\2\2\u00ca\u00cf\5\30\r\6\u00cb\u00cc\f\4\2\2"+
		"\u00cc\u00cd\7\31\2\2\u00cd\u00cf\5\30\r\5\u00ce\u00c5\3\2\2\2\u00ce\u00c8"+
		"\3\2\2\2\u00ce\u00cb\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\31\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\b\16\1"+
		"\2\u00d4\u00d5\5\34\17\2\u00d5\u00de\3\2\2\2\u00d6\u00d7\f\5\2\2\u00d7"+
		"\u00d8\7\34\2\2\u00d8\u00dd\5\32\16\6\u00d9\u00da\f\4\2\2\u00da\u00db"+
		"\7\33\2\2\u00db\u00dd\5\32\16\5\u00dc\u00d6\3\2\2\2\u00dc\u00d9\3\2\2"+
		"\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\33"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\b\17\1\2\u00e2\u00e3\5\36\20"+
		"\2\u00e3\u00f8\3\2\2\2\u00e4\u00e5\f\t\2\2\u00e5\u00e6\7\36\2\2\u00e6"+
		"\u00f7\5\34\17\n\u00e7\u00e8\f\b\2\2\u00e8\u00e9\7\37\2\2\u00e9\u00f7"+
		"\5\34\17\t\u00ea\u00eb\f\7\2\2\u00eb\u00ec\7 \2\2\u00ec\u00f7\5\34\17"+
		"\b\u00ed\u00ee\f\6\2\2\u00ee\u00ef\7!\2\2\u00ef\u00f7\5\34\17\7\u00f0"+
		"\u00f1\f\5\2\2\u00f1\u00f2\7\"\2\2\u00f2\u00f7\5\34\17\6\u00f3\u00f4\f"+
		"\4\2\2\u00f4\u00f5\7#\2\2\u00f5\u00f7\5\34\17\5\u00f6\u00e4\3\2\2\2\u00f6"+
		"\u00e7\3\2\2\2\u00f6\u00ea\3\2\2\2\u00f6\u00ed\3\2\2\2\u00f6\u00f0\3\2"+
		"\2\2\u00f6\u00f3\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\35\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\b\20\1"+
		"\2\u00fc\u00fd\5 \21\2\u00fd\u0106\3\2\2\2\u00fe\u00ff\f\5\2\2\u00ff\u0100"+
		"\7$\2\2\u0100\u0105\5\36\20\6\u0101\u0102\f\4\2\2\u0102\u0103\7%\2\2\u0103"+
		"\u0105\5\36\20\5\u0104\u00fe\3\2\2\2\u0104\u0101\3\2\2\2\u0105\u0108\3"+
		"\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\37\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010a\7\36\2\2\u010a\u0114\5 \21\2\u010b\u010c\7"+
		"\37\2\2\u010c\u0114\5 \21\2\u010d\u010e\7\35\2\2\u010e\u0114\5 \21\2\u010f"+
		"\u0110\78\2\2\u0110\u0114\5 \21\2\u0111\u0114\5\"\22\2\u0112\u0114\5&"+
		"\24\2\u0113\u0109\3\2\2\2\u0113\u010b\3\2\2\2\u0113\u010d\3\2\2\2\u0113"+
		"\u010f\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114!\3\2\2\2"+
		"\u0115\u0116\7O\2\2\u0116\u0118\7I\2\2\u0117\u0119\5<\37\2\u0118\u0117"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011f\7J\2\2\u011b"+
		"\u011c\7\5\2\2\u011c\u011f\5\24\13\2\u011d\u011f\5$\23\2\u011e\u0115\3"+
		"\2\2\2\u011e\u011b\3\2\2\2\u011e\u011d\3\2\2\2\u011f#\3\2\2\2\u0120\u012f"+
		"\7O\2\2\u0121\u0126\7O\2\2\u0122\u0123\7M\2\2\u0123\u0124\5\24\13\2\u0124"+
		"\u0125\7N\2\2\u0125\u0127\3\2\2\2\u0126\u0122\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012f\3\2\2\2\u012a"+
		"\u012b\7I\2\2\u012b\u012c\5\24\13\2\u012c\u012d\7J\2\2\u012d\u012f\3\2"+
		"\2\2\u012e\u0120\3\2\2\2\u012e\u0121\3\2\2\2\u012e\u012a\3\2\2\2\u012f"+
		"%\3\2\2\2\u0130\u0138\5B\"\2\u0131\u0133\7B\2\2\u0132\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0138\3\2"+
		"\2\2\u0136\u0138\7\f\2\2\u0137\u0130\3\2\2\2\u0137\u0132\3\2\2\2\u0137"+
		"\u0136\3\2\2\2\u0138\'\3\2\2\2\u0139\u013a\7\6\2\2\u013a\u013b\5\24\13"+
		"\2\u013b\u013f\5\6\4\2\u013c\u013e\5*\26\2\u013d\u013c\3\2\2\2\u013e\u0141"+
		"\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0143\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0142\u0144\5,\27\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144)\3\2\2\2\u0145\u0146\7\7\2\2\u0146\u0147\5\24\13\2\u0147\u0148"+
		"\5\6\4\2\u0148+\3\2\2\2\u0149\u014a\7\b\2\2\u014a\u014b\5\6\4\2\u014b"+
		"-\3\2\2\2\u014c\u014d\7\t\2\2\u014d\u014e\5\24\13\2\u014e\u014f\5\6\4"+
		"\2\u014f/\3\2\2\2\u0150\u0151\7\n\2\2\u0151\u0152\7O\2\2\u0152\u0153\7"+
		"\13\2\2\u0153\u0154\5\62\32\2\u0154\u0155\5\6\4\2\u0155\61\3\2\2\2\u0156"+
		"\u0157\7I\2\2\u0157\u0158\5\24\13\2\u0158\u0159\7\63\2\2\u0159\u015a\5"+
		"\24\13\2\u015a\u015b\7\63\2\2\u015b\u015c\5\24\13\2\u015c\u015d\7J\2\2"+
		"\u015d\63\3\2\2\2\u015e\u0160\7\4\2\2\u015f\u0161\5\24\13\2\u0160\u015f"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0168\7\66\2\2"+
		"\u0163\u0164\7\16\2\2\u0164\u0168\7\66\2\2\u0165\u0166\7\r\2\2\u0166\u0168"+
		"\7\66\2\2\u0167\u015e\3\2\2\2\u0167\u0163\3\2\2\2\u0167\u0165\3\2\2\2"+
		"\u0168\65\3\2\2\2\u0169\u016a\7\3\2\2\u016a\u016b\7O\2\2\u016b\u016d\7"+
		"I\2\2\u016c\u016e\58\35\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0170\7J\2\2\u0170\u0171\7\67\2\2\u0171\u0172\5@"+
		"!\2\u0172\u0173\5\6\4\2\u0173\67\3\2\2\2\u0174\u0179\5:\36\2\u0175\u0176"+
		"\7\63\2\2\u0176\u0178\5:\36\2\u0177\u0175\3\2\2\2\u0178\u017b\3\2\2\2"+
		"\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a9\3\2\2\2\u017b\u0179\3"+
		"\2\2\2\u017c\u0181\5> \2\u017d\u017e\7M\2\2\u017e\u0180\7N\2\2\u017f\u017d"+
		"\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\7O\2\2\u0185;\3\2\2\2\u0186"+
		"\u018b\5\24\13\2\u0187\u0188\7\63\2\2\u0188\u018a\5\24\13\2\u0189\u0187"+
		"\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"=\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\t\2\2\2\u018f?\3\2\2\2\u0190"+
		"\u0193\5> \2\u0191\u0193\79\2\2\u0192\u0190\3\2\2\2\u0192\u0191\3\2\2"+
		"\2\u0193A\3\2\2\2\u0194\u0198\5D#\2\u0195\u0198\7G\2\2\u0196\u0198\7H"+
		"\2\2\u0197\u0194\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0196\3\2\2\2\u0198"+
		"C\3\2\2\2\u0199\u019a\t\3\2\2\u019aE\3\2\2\2*IW]gmp|\u0087\u008b\u008d"+
		"\u0095\u009d\u00a4\u00bd\u00bf\u00ce\u00d0\u00dc\u00de\u00f6\u00f8\u0104"+
		"\u0106\u0113\u0118\u011e\u0128\u012e\u0134\u0137\u013f\u0143\u0160\u0167"+
		"\u016d\u0179\u0181\u018b\u0192\u0197";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}