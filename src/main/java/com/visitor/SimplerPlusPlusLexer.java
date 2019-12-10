package com.visitor;
 // Generated from src/main/java/com/visitor/SimplerPlusPlusLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimplerPlusPlusLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DEF", "RETURN", "ASSERT", "IF", "ELIF", "ELSE", "WHILE", "FOR", "IN", 
			"NULL", "CONTINUE", "BREAK", "TRUE", "FALSE", "CONST", "LESS_THAN", "GREATER_THAN", 
			"EQUALS", "GT_EQ", "LT_EQ", "NOT_EQ", "BIN_OR", "BIN_XOR", "BIN_AND", 
			"LOG_OR", "LOG_AND", "LOG_NOT", "ADD", "MINUS", "STAR", "DIV", "MOD", 
			"POWER", "LEFT_SHIFT", "RIGHT_SHIFT", "ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", 
			"XOR_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "POWER_ASSIGN", 
			"DOT", "COMMA", "COLON", "QUERT", "SEMI_COLON", "ARROW", "TILDE", "VOID", 
			"CHAR", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BOOLEAN", "STRING", 
			"STRING_VALUE", "DECIMAL_INTEGER", "OCT_INTEGER", "HEX_INTEGER", "BIN_INTEGER", 
			"IMAG_NUMBER", "FLOAT_NUMBER", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACE", 
			"CLOSE_BRACE", "OPEN_BRACKET", "CLOSE_BRACKET", "NAME", "ID_CONTINUE", 
			"ID_START", "SHORT_STRING", "LONG_STRING", "LONG_STRING_ITEM", "RN", 
			"EXPONENT_OR_POINT_FLOAT", "POINT_FLOAT", "SHORT_BYTES", "LONG_BYTES", 
			"LONG_BYTES_ITEM", "SHORT_BYTES_CHAR_NO_SINGLE_QUOTE", "SHORT_BYTES_CHAR_NO_DOUBLE_QUOTE", 
			"LONG_BYTES_CHAR", "BYTES_ESCAPE_SEQ", "MORE_LINE_COMMENT", "ONE_LINE_COMMENT", 
			"NEWLINE", "WHITESPACE"
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


	public SimplerPlusPlusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimplerPlusPlusLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2S\u02ee\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3"+
		")\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3"+
		"\66\3\66\3\66\3\67\3\67\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3"+
		":\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\5A\u01b6\nA\3A\3"+
		"A\5A\u01ba\nA\5A\u01bc\nA\3A\3A\5A\u01c0\nA\3A\3A\5A\u01c4\nA\3A\3A\5"+
		"A\u01c8\nA\3A\3A\5A\u01cc\nA\5A\u01ce\nA\3B\3B\7B\u01d2\nB\fB\16B\u01d5"+
		"\13B\3B\6B\u01d8\nB\rB\16B\u01d9\5B\u01dc\nB\3C\3C\3C\6C\u01e1\nC\rC\16"+
		"C\u01e2\3D\3D\3D\6D\u01e8\nD\rD\16D\u01e9\3E\3E\3E\6E\u01ef\nE\rE\16E"+
		"\u01f0\3F\3F\6F\u01f5\nF\rF\16F\u01f6\5F\u01f9\nF\3F\3F\3G\3G\3H\3H\3"+
		"I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\7N\u020d\nN\fN\16N\u0210\13N\3O\3O"+
		"\5O\u0214\nO\3P\5P\u0217\nP\3Q\3Q\3Q\3Q\5Q\u021d\nQ\3Q\7Q\u0220\nQ\fQ"+
		"\16Q\u0223\13Q\3Q\3Q\3Q\3Q\3Q\5Q\u022a\nQ\3Q\7Q\u022d\nQ\fQ\16Q\u0230"+
		"\13Q\3Q\5Q\u0233\nQ\3R\3R\3R\3R\3R\7R\u023a\nR\fR\16R\u023d\13R\3R\3R"+
		"\3R\3R\3R\3R\3R\3R\7R\u0247\nR\fR\16R\u024a\13R\3R\3R\3R\5R\u024f\nR\3"+
		"S\3S\3S\3S\5S\u0255\nS\5S\u0257\nS\3T\5T\u025a\nT\3T\3T\3U\6U\u025f\n"+
		"U\rU\16U\u0260\3U\5U\u0264\nU\3U\3U\5U\u0268\nU\3U\6U\u026b\nU\rU\16U"+
		"\u026c\3U\5U\u0270\nU\3V\7V\u0273\nV\fV\16V\u0276\13V\3V\3V\6V\u027a\n"+
		"V\rV\16V\u027b\3V\6V\u027f\nV\rV\16V\u0280\3V\5V\u0284\nV\3W\3W\3W\7W"+
		"\u0289\nW\fW\16W\u028c\13W\3W\3W\3W\3W\7W\u0292\nW\fW\16W\u0295\13W\3"+
		"W\5W\u0298\nW\3X\3X\3X\3X\3X\7X\u029f\nX\fX\16X\u02a2\13X\3X\3X\3X\3X"+
		"\3X\3X\3X\3X\7X\u02ac\nX\fX\16X\u02af\13X\3X\3X\3X\5X\u02b4\nX\3Y\3Y\5"+
		"Y\u02b8\nY\3Z\5Z\u02bb\nZ\3[\5[\u02be\n[\3\\\5\\\u02c1\n\\\3]\3]\3]\3"+
		"^\3^\3^\3^\7^\u02ca\n^\f^\16^\u02cd\13^\3^\3^\3^\3^\3^\3_\3_\3_\3_\7_"+
		"\u02d8\n_\f_\16_\u02db\13_\3_\3_\3`\3`\5`\u02e1\n`\3`\5`\u02e4\n`\3`\3"+
		"`\3a\6a\u02e9\na\ra\16a\u02ea\3a\3a\7\u023b\u0248\u02a0\u02ad\u02cb\2"+
		"b\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH"+
		"\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d\2\u009f\2\u00a1"+
		"\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1\2\u00b3"+
		"\2\u00b5\2\u00b7\2\u00b9\2\u00bbP\u00bdQ\u00bfR\u00c1S\3\2\32\4\2WWww"+
		"\4\2HHhh\4\2TTtt\4\2DDdd\3\2\63;\3\2\62;\4\2QQqq\3\2\629\4\2ZZzz\5\2\62"+
		";CHch\3\2\62\63\4\2LLll\5\2C\\aac|\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^"+
		"^\3\2^^\4\2GGgg\4\2--//\7\2\2\13\r\16\20(*]_\u0081\7\2\2\13\r\16\20#%"+
		"]_\u0081\4\2\2]_\u0081\3\2\2\u0081\4\2\f\f\17\17\4\2\13\13\"\"\2\u0316"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2"+
		"\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\3\u00c3\3\2\2\2\5\u00c7\3\2\2\2\7\u00ce"+
		"\3\2\2\2\t\u00d5\3\2\2\2\13\u00d8\3\2\2\2\r\u00dd\3\2\2\2\17\u00e2\3\2"+
		"\2\2\21\u00e8\3\2\2\2\23\u00ec\3\2\2\2\25\u00ef\3\2\2\2\27\u00f4\3\2\2"+
		"\2\31\u00fd\3\2\2\2\33\u0103\3\2\2\2\35\u0108\3\2\2\2\37\u010e\3\2\2\2"+
		"!\u0114\3\2\2\2#\u0116\3\2\2\2%\u0118\3\2\2\2\'\u011a\3\2\2\2)\u011d\3"+
		"\2\2\2+\u0120\3\2\2\2-\u0123\3\2\2\2/\u0125\3\2\2\2\61\u0127\3\2\2\2\63"+
		"\u0129\3\2\2\2\65\u012c\3\2\2\2\67\u0130\3\2\2\29\u0134\3\2\2\2;\u0136"+
		"\3\2\2\2=\u0138\3\2\2\2?\u013a\3\2\2\2A\u013c\3\2\2\2C\u013e\3\2\2\2E"+
		"\u0141\3\2\2\2G\u0144\3\2\2\2I\u0147\3\2\2\2K\u014a\3\2\2\2M\u014d\3\2"+
		"\2\2O\u0150\3\2\2\2Q\u0153\3\2\2\2S\u0156\3\2\2\2U\u0159\3\2\2\2W\u015c"+
		"\3\2\2\2Y\u015f\3\2\2\2[\u0162\3\2\2\2]\u0166\3\2\2\2_\u016a\3\2\2\2a"+
		"\u016e\3\2\2\2c\u0170\3\2\2\2e\u0172\3\2\2\2g\u0174\3\2\2\2i\u0176\3\2"+
		"\2\2k\u0178\3\2\2\2m\u017b\3\2\2\2o\u017d\3\2\2\2q\u0182\3\2\2\2s\u0187"+
		"\3\2\2\2u\u018d\3\2\2\2w\u0191\3\2\2\2y\u0196\3\2\2\2{\u019c\3\2\2\2}"+
		"\u01a3\3\2\2\2\177\u01ab\3\2\2\2\u0081\u01cd\3\2\2\2\u0083\u01db\3\2\2"+
		"\2\u0085\u01dd\3\2\2\2\u0087\u01e4\3\2\2\2\u0089\u01eb\3\2\2\2\u008b\u01f8"+
		"\3\2\2\2\u008d\u01fc\3\2\2\2\u008f\u01fe\3\2\2\2\u0091\u0200\3\2\2\2\u0093"+
		"\u0202\3\2\2\2\u0095\u0204\3\2\2\2\u0097\u0206\3\2\2\2\u0099\u0208\3\2"+
		"\2\2\u009b\u020a\3\2\2\2\u009d\u0213\3\2\2\2\u009f\u0216\3\2\2\2\u00a1"+
		"\u0232\3\2\2\2\u00a3\u024e\3\2\2\2\u00a5\u0256\3\2\2\2\u00a7\u0259\3\2"+
		"\2\2\u00a9\u026f\3\2\2\2\u00ab\u0283\3\2\2\2\u00ad\u0297\3\2\2\2\u00af"+
		"\u02b3\3\2\2\2\u00b1\u02b7\3\2\2\2\u00b3\u02ba\3\2\2\2\u00b5\u02bd\3\2"+
		"\2\2\u00b7\u02c0\3\2\2\2\u00b9\u02c2\3\2\2\2\u00bb\u02c5\3\2\2\2\u00bd"+
		"\u02d3\3\2\2\2\u00bf\u02e3\3\2\2\2\u00c1\u02e8\3\2\2\2\u00c3\u00c4\7f"+
		"\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7h\2\2\u00c6\4\3\2\2\2\u00c7\u00c8"+
		"\7t\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7w\2\2\u00cb"+
		"\u00cc\7t\2\2\u00cc\u00cd\7p\2\2\u00cd\6\3\2\2\2\u00ce\u00cf\7c\2\2\u00cf"+
		"\u00d0\7u\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7t\2\2"+
		"\u00d3\u00d4\7v\2\2\u00d4\b\3\2\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7h"+
		"\2\2\u00d7\n\3\2\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7n\2\2\u00da\u00db"+
		"\7k\2\2\u00db\u00dc\7h\2\2\u00dc\f\3\2\2\2\u00dd\u00de\7g\2\2\u00de\u00df"+
		"\7n\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7g\2\2\u00e1\16\3\2\2\2\u00e2\u00e3"+
		"\7y\2\2\u00e3\u00e4\7j\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7n\2\2\u00e6"+
		"\u00e7\7g\2\2\u00e7\20\3\2\2\2\u00e8\u00e9\7h\2\2\u00e9\u00ea\7q\2\2\u00ea"+
		"\u00eb\7t\2\2\u00eb\22\3\2\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7p\2\2\u00ee"+
		"\24\3\2\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7w\2\2\u00f1\u00f2\7n\2\2\u00f2"+
		"\u00f3\7n\2\2\u00f3\26\3\2\2\2\u00f4\u00f5\7e\2\2\u00f5\u00f6\7q\2\2\u00f6"+
		"\u00f7\7p\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7p\2\2"+
		"\u00fa\u00fb\7w\2\2\u00fb\u00fc\7g\2\2\u00fc\30\3\2\2\2\u00fd\u00fe\7"+
		"d\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7c\2\2\u0101\u0102"+
		"\7m\2\2\u0102\32\3\2\2\2\u0103\u0104\7V\2\2\u0104\u0105\7t\2\2\u0105\u0106"+
		"\7w\2\2\u0106\u0107\7g\2\2\u0107\34\3\2\2\2\u0108\u0109\7H\2\2\u0109\u010a"+
		"\7c\2\2\u010a\u010b\7n\2\2\u010b\u010c\7u\2\2\u010c\u010d\7g\2\2\u010d"+
		"\36\3\2\2\2\u010e\u010f\7e\2\2\u010f\u0110\7q\2\2\u0110\u0111\7p\2\2\u0111"+
		"\u0112\7u\2\2\u0112\u0113\7v\2\2\u0113 \3\2\2\2\u0114\u0115\7>\2\2\u0115"+
		"\"\3\2\2\2\u0116\u0117\7@\2\2\u0117$\3\2\2\2\u0118\u0119\7?\2\2\u0119"+
		"&\3\2\2\2\u011a\u011b\7@\2\2\u011b\u011c\7?\2\2\u011c(\3\2\2\2\u011d\u011e"+
		"\7>\2\2\u011e\u011f\7?\2\2\u011f*\3\2\2\2\u0120\u0121\7#\2\2\u0121\u0122"+
		"\7?\2\2\u0122,\3\2\2\2\u0123\u0124\7~\2\2\u0124.\3\2\2\2\u0125\u0126\7"+
		"`\2\2\u0126\60\3\2\2\2\u0127\u0128\7(\2\2\u0128\62\3\2\2\2\u0129\u012a"+
		"\7q\2\2\u012a\u012b\7t\2\2\u012b\64\3\2\2\2\u012c\u012d\7c\2\2\u012d\u012e"+
		"\7p\2\2\u012e\u012f\7f\2\2\u012f\66\3\2\2\2\u0130\u0131\7p\2\2\u0131\u0132"+
		"\7q\2\2\u0132\u0133\7v\2\2\u01338\3\2\2\2\u0134\u0135\7-\2\2\u0135:\3"+
		"\2\2\2\u0136\u0137\7/\2\2\u0137<\3\2\2\2\u0138\u0139\7,\2\2\u0139>\3\2"+
		"\2\2\u013a\u013b\7\61\2\2\u013b@\3\2\2\2\u013c\u013d\7\'\2\2\u013dB\3"+
		"\2\2\2\u013e\u013f\7,\2\2\u013f\u0140\7,\2\2\u0140D\3\2\2\2\u0141\u0142"+
		"\7>\2\2\u0142\u0143\7>\2\2\u0143F\3\2\2\2\u0144\u0145\7@\2\2\u0145\u0146"+
		"\7@\2\2\u0146H\3\2\2\2\u0147\u0148\7>\2\2\u0148\u0149\7/\2\2\u0149J\3"+
		"\2\2\2\u014a\u014b\7-\2\2\u014b\u014c\7?\2\2\u014cL\3\2\2\2\u014d\u014e"+
		"\7/\2\2\u014e\u014f\7?\2\2\u014fN\3\2\2\2\u0150\u0151\7,\2\2\u0151\u0152"+
		"\7?\2\2\u0152P\3\2\2\2\u0153\u0154\7\61\2\2\u0154\u0155\7?\2\2\u0155R"+
		"\3\2\2\2\u0156\u0157\7\'\2\2\u0157\u0158\7?\2\2\u0158T\3\2\2\2\u0159\u015a"+
		"\7(\2\2\u015a\u015b\7?\2\2\u015bV\3\2\2\2\u015c\u015d\7~\2\2\u015d\u015e"+
		"\7?\2\2\u015eX\3\2\2\2\u015f\u0160\7`\2\2\u0160\u0161\7?\2\2\u0161Z\3"+
		"\2\2\2\u0162\u0163\7>\2\2\u0163\u0164\7>\2\2\u0164\u0165\7?\2\2\u0165"+
		"\\\3\2\2\2\u0166\u0167\7@\2\2\u0167\u0168\7@\2\2\u0168\u0169\7?\2\2\u0169"+
		"^\3\2\2\2\u016a\u016b\7,\2\2\u016b\u016c\7,\2\2\u016c\u016d\7?\2\2\u016d"+
		"`\3\2\2\2\u016e\u016f\7\60\2\2\u016fb\3\2\2\2\u0170\u0171\7.\2\2\u0171"+
		"d\3\2\2\2\u0172\u0173\7<\2\2\u0173f\3\2\2\2\u0174\u0175\7A\2\2\u0175h"+
		"\3\2\2\2\u0176\u0177\7=\2\2\u0177j\3\2\2\2\u0178\u0179\7/\2\2\u0179\u017a"+
		"\7@\2\2\u017al\3\2\2\2\u017b\u017c\7\u0080\2\2\u017cn\3\2\2\2\u017d\u017e"+
		"\7x\2\2\u017e\u017f\7q\2\2\u017f\u0180\7k\2\2\u0180\u0181\7f\2\2\u0181"+
		"p\3\2\2\2\u0182\u0183\7e\2\2\u0183\u0184\7j\2\2\u0184\u0185\7c\2\2\u0185"+
		"\u0186\7t\2\2\u0186r\3\2\2\2\u0187\u0188\7u\2\2\u0188\u0189\7j\2\2\u0189"+
		"\u018a\7q\2\2\u018a\u018b\7t\2\2\u018b\u018c\7v\2\2\u018ct\3\2\2\2\u018d"+
		"\u018e\7k\2\2\u018e\u018f\7p\2\2\u018f\u0190\7v\2\2\u0190v\3\2\2\2\u0191"+
		"\u0192\7n\2\2\u0192\u0193\7q\2\2\u0193\u0194\7p\2\2\u0194\u0195\7i\2\2"+
		"\u0195x\3\2\2\2\u0196\u0197\7h\2\2\u0197\u0198\7n\2\2\u0198\u0199\7q\2"+
		"\2\u0199\u019a\7c\2\2\u019a\u019b\7v\2\2\u019bz\3\2\2\2\u019c\u019d\7"+
		"f\2\2\u019d\u019e\7q\2\2\u019e\u019f\7w\2\2\u019f\u01a0\7d\2\2\u01a0\u01a1"+
		"\7n\2\2\u01a1\u01a2\7g\2\2\u01a2|\3\2\2\2\u01a3\u01a4\7d\2\2\u01a4\u01a5"+
		"\7q\2\2\u01a5\u01a6\7q\2\2\u01a6\u01a7\7n\2\2\u01a7\u01a8\7g\2\2\u01a8"+
		"\u01a9\7c\2\2\u01a9\u01aa\7p\2\2\u01aa~\3\2\2\2\u01ab\u01ac\7u\2\2\u01ac"+
		"\u01ad\7v\2\2\u01ad\u01ae\7t\2\2\u01ae\u01af\7k\2\2\u01af\u01b0\7p\2\2"+
		"\u01b0\u01b1\7i\2\2\u01b1\u0080\3\2\2\2\u01b2\u01bc\t\2\2\2\u01b3\u01b5"+
		"\t\3\2\2\u01b4\u01b6\t\4\2\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01bc\3\2\2\2\u01b7\u01b9\t\4\2\2\u01b8\u01ba\t\3\2\2\u01b9\u01b8\3\2"+
		"\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01b2\3\2\2\2\u01bb"+
		"\u01b3\3\2\2\2\u01bb\u01b7\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bf\3\2"+
		"\2\2\u01bd\u01c0\5\u00a1Q\2\u01be\u01c0\5\u00a3R\2\u01bf\u01bd\3\2\2\2"+
		"\u01bf\u01be\3\2\2\2\u01c0\u01ce\3\2\2\2\u01c1\u01c3\t\5\2\2\u01c2\u01c4"+
		"\t\4\2\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c8\3\2\2\2\u01c5"+
		"\u01c6\t\4\2\2\u01c6\u01c8\t\5\2\2\u01c7\u01c1\3\2\2\2\u01c7\u01c5\3\2"+
		"\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01cc\5\u00adW\2\u01ca\u01cc\5\u00afX\2"+
		"\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01bb"+
		"\3\2\2\2\u01cd\u01c7\3\2\2\2\u01ce\u0082\3\2\2\2\u01cf\u01d3\t\6\2\2\u01d0"+
		"\u01d2\t\7\2\2\u01d1\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2"+
		"\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01dc\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6"+
		"\u01d8\7\62\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01d7\3"+
		"\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01cf\3\2\2\2\u01db"+
		"\u01d7\3\2\2\2\u01dc\u0084\3\2\2\2\u01dd\u01de\7\62\2\2\u01de\u01e0\t"+
		"\b\2\2\u01df\u01e1\t\t\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u0086\3\2\2\2\u01e4\u01e5\7\62"+
		"\2\2\u01e5\u01e7\t\n\2\2\u01e6\u01e8\t\13\2\2\u01e7\u01e6\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u0088\3\2"+
		"\2\2\u01eb\u01ec\7\62\2\2\u01ec\u01ee\t\5\2\2\u01ed\u01ef\t\f\2\2\u01ee"+
		"\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2"+
		"\2\2\u01f1\u008a\3\2\2\2\u01f2\u01f9\5\u00a9U\2\u01f3\u01f5\t\7\2\2\u01f4"+
		"\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2"+
		"\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f2\3\2\2\2\u01f8\u01f4\3\2\2\2\u01f9"+
		"\u01fa\3\2\2\2\u01fa\u01fb\t\r\2\2\u01fb\u008c\3\2\2\2\u01fc\u01fd\5\u00a9"+
		"U\2\u01fd\u008e\3\2\2\2\u01fe\u01ff\7*\2\2\u01ff\u0090\3\2\2\2\u0200\u0201"+
		"\7+\2\2\u0201\u0092\3\2\2\2\u0202\u0203\7}\2\2\u0203\u0094\3\2\2\2\u0204"+
		"\u0205\7\177\2\2\u0205\u0096\3\2\2\2\u0206\u0207\7]\2\2\u0207\u0098\3"+
		"\2\2\2\u0208\u0209\7_\2\2\u0209\u009a\3\2\2\2\u020a\u020e\5\u009fP\2\u020b"+
		"\u020d\5\u009dO\2\u020c\u020b\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c"+
		"\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u009c\3\2\2\2\u0210\u020e\3\2\2\2\u0211"+
		"\u0214\5\u009fP\2\u0212\u0214\t\7\2\2\u0213\u0211\3\2\2\2\u0213\u0212"+
		"\3\2\2\2\u0214\u009e\3\2\2\2\u0215\u0217\t\16\2\2\u0216\u0215\3\2\2\2"+
		"\u0217\u00a0\3\2\2\2\u0218\u0221\7)\2\2\u0219\u021c\7^\2\2\u021a\u021d"+
		"\5\u00a7T\2\u021b\u021d\13\2\2\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2\2"+
		"\2\u021d\u0220\3\2\2\2\u021e\u0220\n\17\2\2\u021f\u0219\3\2\2\2\u021f"+
		"\u021e\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2"+
		"\2\2\u0222\u0224\3\2\2\2\u0223\u0221\3\2\2\2\u0224\u0233\7)\2\2\u0225"+
		"\u022e\7$\2\2\u0226\u0229\7^\2\2\u0227\u022a\5\u00a7T\2\u0228\u022a\13"+
		"\2\2\2\u0229\u0227\3\2\2\2\u0229\u0228\3\2\2\2\u022a\u022d\3\2\2\2\u022b"+
		"\u022d\n\20\2\2\u022c\u0226\3\2\2\2\u022c\u022b\3\2\2\2\u022d\u0230\3"+
		"\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2\2\2\u0230"+
		"\u022e\3\2\2\2\u0231\u0233\7$\2\2\u0232\u0218\3\2\2\2\u0232\u0225\3\2"+
		"\2\2\u0233\u00a2\3\2\2\2\u0234\u0235\7)\2\2\u0235\u0236\7)\2\2\u0236\u0237"+
		"\7)\2\2\u0237\u023b\3\2\2\2\u0238\u023a\5\u00a5S\2\u0239\u0238\3\2\2\2"+
		"\u023a\u023d\3\2\2\2\u023b\u023c\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u023e"+
		"\3\2\2\2\u023d\u023b\3\2\2\2\u023e\u023f\7)\2\2\u023f\u0240\7)\2\2\u0240"+
		"\u024f\7)\2\2\u0241\u0242\7$\2\2\u0242\u0243\7$\2\2\u0243\u0244\7$\2\2"+
		"\u0244\u0248\3\2\2\2\u0245\u0247\5\u00a5S\2\u0246\u0245\3\2\2\2\u0247"+
		"\u024a\3\2\2\2\u0248\u0249\3\2\2\2\u0248\u0246\3\2\2\2\u0249\u024b\3\2"+
		"\2\2\u024a\u0248\3\2\2\2\u024b\u024c\7$\2\2\u024c\u024d\7$\2\2\u024d\u024f"+
		"\7$\2\2\u024e\u0234\3\2\2\2\u024e\u0241\3\2\2\2\u024f\u00a4\3\2\2\2\u0250"+
		"\u0257\n\21\2\2\u0251\u0254\7^\2\2\u0252\u0255\5\u00a7T\2\u0253\u0255"+
		"\13\2\2\2\u0254\u0252\3\2\2\2\u0254\u0253\3\2\2\2\u0255\u0257\3\2\2\2"+
		"\u0256\u0250\3\2\2\2\u0256\u0251\3\2\2\2\u0257\u00a6\3\2\2\2\u0258\u025a"+
		"\7\17\2\2\u0259\u0258\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\3\2\2\2"+
		"\u025b\u025c\7\f\2\2\u025c\u00a8\3\2\2\2\u025d\u025f\t\7\2\2\u025e\u025d"+
		"\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261"+
		"\u0264\3\2\2\2\u0262\u0264\5\u00abV\2\u0263\u025e\3\2\2\2\u0263\u0262"+
		"\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0267\t\22\2\2\u0266\u0268\t\23\2\2"+
		"\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026a\3\2\2\2\u0269\u026b"+
		"\t\7\2\2\u026a\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026a\3\2\2\2\u026c"+
		"\u026d\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u0270\5\u00abV\2\u026f\u0263"+
		"\3\2\2\2\u026f\u026e\3\2\2\2\u0270\u00aa\3\2\2\2\u0271\u0273\t\7\2\2\u0272"+
		"\u0271\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2"+
		"\2\2\u0275\u0277\3\2\2\2\u0276\u0274\3\2\2\2\u0277\u0279\7\60\2\2\u0278"+
		"\u027a\t\7\2\2\u0279\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u0279\3\2"+
		"\2\2\u027b\u027c\3\2\2\2\u027c\u0284\3\2\2\2\u027d\u027f\t\7\2\2\u027e"+
		"\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2"+
		"\2\2\u0281\u0282\3\2\2\2\u0282\u0284\7\60\2\2\u0283\u0274\3\2\2\2\u0283"+
		"\u027e\3\2\2\2\u0284\u00ac\3\2\2\2\u0285\u028a\7)\2\2\u0286\u0289\5\u00b3"+
		"Z\2\u0287\u0289\5\u00b9]\2\u0288\u0286\3\2\2\2\u0288\u0287\3\2\2\2\u0289"+
		"\u028c\3\2\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028d\3\2"+
		"\2\2\u028c\u028a\3\2\2\2\u028d\u0298\7)\2\2\u028e\u0293\7$\2\2\u028f\u0292"+
		"\5\u00b5[\2\u0290\u0292\5\u00b9]\2\u0291\u028f\3\2\2\2\u0291\u0290\3\2"+
		"\2\2\u0292\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
		"\u0296\3\2\2\2\u0295\u0293\3\2\2\2\u0296\u0298\7$\2\2\u0297\u0285\3\2"+
		"\2\2\u0297\u028e\3\2\2\2\u0298\u00ae\3\2\2\2\u0299\u029a\7)\2\2\u029a"+
		"\u029b\7)\2\2\u029b\u029c\7)\2\2\u029c\u02a0\3\2\2\2\u029d\u029f\5\u00b1"+
		"Y\2\u029e\u029d\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a0"+
		"\u029e\3\2\2\2\u02a1\u02a3\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a4\7)"+
		"\2\2\u02a4\u02a5\7)\2\2\u02a5\u02b4\7)\2\2\u02a6\u02a7\7$\2\2\u02a7\u02a8"+
		"\7$\2\2\u02a8\u02a9\7$\2\2\u02a9\u02ad\3\2\2\2\u02aa\u02ac\5\u00b1Y\2"+
		"\u02ab\u02aa\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ad\u02ab"+
		"\3\2\2\2\u02ae\u02b0\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0\u02b1\7$\2\2\u02b1"+
		"\u02b2\7$\2\2\u02b2\u02b4\7$\2\2\u02b3\u0299\3\2\2\2\u02b3\u02a6\3\2\2"+
		"\2\u02b4\u00b0\3\2\2\2\u02b5\u02b8\5\u00b7\\\2\u02b6\u02b8\5\u00b9]\2"+
		"\u02b7\u02b5\3\2\2\2\u02b7\u02b6\3\2\2\2\u02b8\u00b2\3\2\2\2\u02b9\u02bb"+
		"\t\24\2\2\u02ba\u02b9\3\2\2\2\u02bb\u00b4\3\2\2\2\u02bc\u02be\t\25\2\2"+
		"\u02bd\u02bc\3\2\2\2\u02be\u00b6\3\2\2\2\u02bf\u02c1\t\26\2\2\u02c0\u02bf"+
		"\3\2\2\2\u02c1\u00b8\3\2\2\2\u02c2\u02c3\7^\2\2\u02c3\u02c4\t\27\2\2\u02c4"+
		"\u00ba\3\2\2\2\u02c5\u02c6\7\61\2\2\u02c6\u02c7\7,\2\2\u02c7\u02cb\3\2"+
		"\2\2\u02c8\u02ca\13\2\2\2\u02c9\u02c8\3\2\2\2\u02ca\u02cd\3\2\2\2\u02cb"+
		"\u02cc\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cc\u02ce\3\2\2\2\u02cd\u02cb\3\2"+
		"\2\2\u02ce\u02cf\7,\2\2\u02cf\u02d0\7\61\2\2\u02d0\u02d1\3\2\2\2\u02d1"+
		"\u02d2\b^\2\2\u02d2\u00bc\3\2\2\2\u02d3\u02d4\7\61\2\2\u02d4\u02d5\7\61"+
		"\2\2\u02d5\u02d9\3\2\2\2\u02d6\u02d8\n\30\2\2\u02d7\u02d6\3\2\2\2\u02d8"+
		"\u02db\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dc\3\2"+
		"\2\2\u02db\u02d9\3\2\2\2\u02dc\u02dd\b_\2\2\u02dd\u00be\3\2\2\2\u02de"+
		"\u02e0\7\17\2\2\u02df\u02e1\7\f\2\2\u02e0\u02df\3\2\2\2\u02e0\u02e1\3"+
		"\2\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e4\7\f\2\2\u02e3\u02de\3\2\2\2\u02e3"+
		"\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\b`\2\2\u02e6\u00c0\3\2"+
		"\2\2\u02e7\u02e9\t\31\2\2\u02e8\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\ba"+
		"\2\2\u02ed\u00c2\3\2\2\2=\2\u01b5\u01b9\u01bb\u01bf\u01c3\u01c7\u01cb"+
		"\u01cd\u01d3\u01d9\u01db\u01e2\u01e9\u01f0\u01f6\u01f8\u020e\u0213\u0216"+
		"\u021c\u021f\u0221\u0229\u022c\u022e\u0232\u023b\u0248\u024e\u0254\u0256"+
		"\u0259\u0260\u0263\u0267\u026c\u026f\u0274\u027b\u0280\u0283\u0288\u028a"+
		"\u0291\u0293\u0297\u02a0\u02ad\u02b3\u02b7\u02ba\u02bd\u02c0\u02cb\u02d9"+
		"\u02e0\u02e3\u02ea\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}