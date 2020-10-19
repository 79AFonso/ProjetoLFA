// Generated from UnitGrammar.g4 by ANTLR 4.8

import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UnitGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, WS=6, ID=7, INT=8, REAL=9, COMMENT=10, 
		COMMENTMULTILINE=11, ERROR=12;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_dim = 2, RULE_valueConvertion = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "dim", "valueConvertion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'dim'", "'->'", "'-'", "'\u00BB'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "WS", "ID", "INT", "REAL", "COMMENT", 
			"COMMENTMULTILINE", "ERROR"
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
	public String getGrammarFileName() { return "UnitGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public static HashMap<String, HashMap<String, SymbolConv>> dimensionsMap = new HashMap<>();

	public UnitGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(UnitGrammarParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitGrammarListener ) ((UnitGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitGrammarListener ) ((UnitGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitGrammarVisitor ) return ((UnitGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==ID) {
				{
				{
				setState(8);
				stat();
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(14);
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

	public static class StatContext extends ParserRuleContext {
		public ValueConvertionContext valueConvertion() {
			return getRuleContext(ValueConvertionContext.class,0);
		}
		public DimContext dim() {
			return getRuleContext(DimContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitGrammarListener ) ((UnitGrammarListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitGrammarListener ) ((UnitGrammarListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitGrammarVisitor ) return ((UnitGrammarVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				valueConvertion();
				setState(17);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				dim();
				setState(20);
				match(T__0);
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

	public static class DimContext extends ParserRuleContext {
		public Token dimension;
		public Token unit;
		public Token symbol;
		public List<TerminalNode> ID() { return getTokens(UnitGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(UnitGrammarParser.ID, i);
		}
		public DimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitGrammarListener ) ((UnitGrammarListener)listener).enterDim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitGrammarListener ) ((UnitGrammarListener)listener).exitDim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitGrammarVisitor ) return ((UnitGrammarVisitor<? extends T>)visitor).visitDim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimContext dim() throws RecognitionException {
		DimContext _localctx = new DimContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__1);
			setState(25);
			((DimContext)_localctx).dimension = match(ID);
			setState(26);
			match(T__2);
			setState(27);
			((DimContext)_localctx).unit = match(ID);
			setState(28);
			match(T__2);
			setState(29);
			((DimContext)_localctx).symbol = match(ID);
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

	public static class ValueConvertionContext extends ParserRuleContext {
		public Token fullName;
		public Token dest;
		public Token value;
		public Token src;
		public List<TerminalNode> ID() { return getTokens(UnitGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(UnitGrammarParser.ID, i);
		}
		public TerminalNode INT() { return getToken(UnitGrammarParser.INT, 0); }
		public TerminalNode REAL() { return getToken(UnitGrammarParser.REAL, 0); }
		public ValueConvertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueConvertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitGrammarListener ) ((UnitGrammarListener)listener).enterValueConvertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitGrammarListener ) ((UnitGrammarListener)listener).exitValueConvertion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitGrammarVisitor ) return ((UnitGrammarVisitor<? extends T>)visitor).visitValueConvertion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueConvertionContext valueConvertion() throws RecognitionException {
		ValueConvertionContext _localctx = new ValueConvertionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_valueConvertion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			((ValueConvertionContext)_localctx).fullName = match(ID);
			setState(32);
			match(T__3);
			setState(33);
			((ValueConvertionContext)_localctx).dest = match(ID);
			setState(34);
			match(T__4);
			setState(35);
			((ValueConvertionContext)_localctx).value = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==REAL) ) {
				((ValueConvertionContext)_localctx).value = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(36);
			((ValueConvertionContext)_localctx).src = match(ID);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16)\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\31\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\2\2\6\2\4\6\b\2\3\3\2\n\13\2&\2\r\3\2\2\2\4\30\3\2\2\2"+
		"\6\32\3\2\2\2\b!\3\2\2\2\n\f\5\4\3\2\13\n\3\2\2\2\f\17\3\2\2\2\r\13\3"+
		"\2\2\2\r\16\3\2\2\2\16\20\3\2\2\2\17\r\3\2\2\2\20\21\7\2\2\3\21\3\3\2"+
		"\2\2\22\23\5\b\5\2\23\24\7\3\2\2\24\31\3\2\2\2\25\26\5\6\4\2\26\27\7\3"+
		"\2\2\27\31\3\2\2\2\30\22\3\2\2\2\30\25\3\2\2\2\31\5\3\2\2\2\32\33\7\4"+
		"\2\2\33\34\7\t\2\2\34\35\7\5\2\2\35\36\7\t\2\2\36\37\7\5\2\2\37 \7\t\2"+
		"\2 \7\3\2\2\2!\"\7\t\2\2\"#\7\6\2\2#$\7\t\2\2$%\7\7\2\2%&\t\2\2\2&\'\7"+
		"\t\2\2\'\t\3\2\2\2\4\r\30";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}