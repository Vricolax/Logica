// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, NOT=3, XOR=4, INTNUM=5, SKIP=6, CHAR=7, LPAREN=8, RPAREN=9, 
		SEMI=10, COMMA=11, EMPTY=12, PRINT=13;
	public static final String[] tokenNames = {
		"<INVALID>", "'AND'", "'OR'", "'NOT'", "'XOR'", "INTNUM", "SKIP", "CHAR", 
		"'('", "')'", "';'", "','", "'null'", "'print'"
	};
	public static final int
		RULE_declaration = 0, RULE_statements = 1, RULE_r = 2, RULE_gate = 3, 
		RULE_operation = 4, RULE_and_operation = 5, RULE_or_operation = 6, RULE_not_operation = 7, 
		RULE_xor_operation = 8;
	public static final String[] ruleNames = {
		"declaration", "statements", "r", "gate", "operation", "and_operation", 
		"or_operation", "not_operation", "xor_operation"
	};

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HelloParser.EOF, 0); }
		public TerminalNode SKIP() { return getToken(HelloParser.SKIP, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public TerminalNode CHAR() { return getToken(HelloParser.CHAR, 0); }
		public TerminalNode INTNUM() { return getToken(HelloParser.INTNUM, 0); }
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_declaration);
		int _la;
		try {
			setState(28);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18); match(INTNUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19); match(CHAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(20); match(SKIP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIP) | (1L << SEMI) | (1L << EMPTY))) != 0)) {
					{
					{
					setState(21); statements();
					}
					}
					setState(26);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(27); match(EOF);
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

	public static class StatementsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(HelloParser.SEMI, 0); }
		public TerminalNode SKIP() { return getToken(HelloParser.SKIP, 0); }
		public TerminalNode EMPTY() { return getToken(HelloParser.EMPTY, 0); }
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIP) | (1L << SEMI) | (1L << EMPTY))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class RContext extends ParserRuleContext {
		public TerminalNode SKIP(int i) {
			return getToken(HelloParser.SKIP, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(HelloParser.SEMI); }
		public List<TerminalNode> SKIP() { return getTokens(HelloParser.SKIP); }
		public TerminalNode SEMI(int i) {
			return getToken(HelloParser.SEMI, i);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_r);
		int _la;
		try {
			setState(53);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32); declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(33); operation();
					}
					}
					setState(36); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << XOR))) != 0) );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(38); operation();
					setState(39); match(SEMI);
					}
					}
					setState(43); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << XOR))) != 0) );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(45); operation();
					setState(46); match(SEMI);
					setState(47); match(SKIP);
					}
					}
					setState(51); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << XOR))) != 0) );
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

	public static class GateContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(HelloParser.NOT, 0); }
		public TerminalNode XOR() { return getToken(HelloParser.XOR, 0); }
		public TerminalNode AND() { return getToken(HelloParser.AND, 0); }
		public TerminalNode OR() { return getToken(HelloParser.OR, 0); }
		public GateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterGate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitGate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitGate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GateContext gate() throws RecognitionException {
		GateContext _localctx = new GateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_gate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << XOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class OperationContext extends ParserRuleContext {
		public List<RContext> r() {
			return getRuleContexts(RContext.class);
		}
		public TerminalNode LPAREN() { return getToken(HelloParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(HelloParser.COMMA, 0); }
		public GateContext gate() {
			return getRuleContext(GateContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HelloParser.RPAREN, 0); }
		public RContext r(int i) {
			return getRuleContext(RContext.class,i);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operation);
		try {
			setState(69);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57); gate();
				setState(58); match(LPAREN);
				setState(59); r();
				setState(60); match(COMMA);
				setState(61); r();
				setState(62); match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64); gate();
				setState(65); match(LPAREN);
				setState(66); r();
				setState(67); match(RPAREN);
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

	public static class And_operationContext extends ParserRuleContext {
		public List<RContext> r() {
			return getRuleContexts(RContext.class);
		}
		public TerminalNode LPAREN() { return getToken(HelloParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(HelloParser.COMMA, 0); }
		public TerminalNode AND() { return getToken(HelloParser.AND, 0); }
		public TerminalNode RPAREN() { return getToken(HelloParser.RPAREN, 0); }
		public RContext r(int i) {
			return getRuleContext(RContext.class,i);
		}
		public And_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAnd_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAnd_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAnd_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_operationContext and_operation() throws RecognitionException {
		And_operationContext _localctx = new And_operationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_and_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(AND);
			setState(72); match(LPAREN);
			setState(73); r();
			setState(74); match(COMMA);
			setState(75); r();
			setState(76); match(RPAREN);
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

	public static class Or_operationContext extends ParserRuleContext {
		public List<RContext> r() {
			return getRuleContexts(RContext.class);
		}
		public TerminalNode LPAREN() { return getToken(HelloParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(HelloParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(HelloParser.RPAREN, 0); }
		public TerminalNode OR() { return getToken(HelloParser.OR, 0); }
		public RContext r(int i) {
			return getRuleContext(RContext.class,i);
		}
		public Or_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterOr_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitOr_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitOr_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_operationContext or_operation() throws RecognitionException {
		Or_operationContext _localctx = new Or_operationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_or_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(OR);
			setState(79); match(LPAREN);
			setState(80); r();
			setState(81); match(COMMA);
			setState(82); r();
			setState(83); match(RPAREN);
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

	public static class Not_operationContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(HelloParser.NOT, 0); }
		public RContext r() {
			return getRuleContext(RContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HelloParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HelloParser.RPAREN, 0); }
		public Not_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNot_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNot_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitNot_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_operationContext not_operation() throws RecognitionException {
		Not_operationContext _localctx = new Not_operationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_not_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(NOT);
			setState(86); match(LPAREN);
			setState(87); r();
			setState(88); match(RPAREN);
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

	public static class Xor_operationContext extends ParserRuleContext {
		public List<RContext> r() {
			return getRuleContexts(RContext.class);
		}
		public TerminalNode XOR() { return getToken(HelloParser.XOR, 0); }
		public TerminalNode LPAREN() { return getToken(HelloParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(HelloParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(HelloParser.RPAREN, 0); }
		public RContext r(int i) {
			return getRuleContext(RContext.class,i);
		}
		public Xor_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterXor_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitXor_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitXor_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xor_operationContext xor_operation() throws RecognitionException {
		Xor_operationContext _localctx = new Xor_operationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_xor_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(XOR);
			setState(91); match(LPAREN);
			setState(92); r();
			setState(93); match(COMMA);
			setState(94); r();
			setState(95); match(RPAREN);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17d\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\5\2\37\n\2\3\3\3\3\3\4\3\4\6\4%\n"+
		"\4\r\4\16\4&\3\4\3\4\3\4\6\4,\n\4\r\4\16\4-\3\4\3\4\3\4\3\4\6\4\64\n\4"+
		"\r\4\16\4\65\5\48\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6H\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\2\2\13\2\4\6"+
		"\b\n\f\16\20\22\2\4\5\2\b\b\f\f\16\16\3\2\3\6e\2\36\3\2\2\2\4 \3\2\2\2"+
		"\6\67\3\2\2\2\b9\3\2\2\2\nG\3\2\2\2\fI\3\2\2\2\16P\3\2\2\2\20W\3\2\2\2"+
		"\22\\\3\2\2\2\24\37\7\7\2\2\25\37\7\t\2\2\26\37\7\b\2\2\27\31\5\4\3\2"+
		"\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2\2"+
		"\34\32\3\2\2\2\35\37\7\2\2\3\36\24\3\2\2\2\36\25\3\2\2\2\36\26\3\2\2\2"+
		"\36\32\3\2\2\2\37\3\3\2\2\2 !\t\2\2\2!\5\3\2\2\2\"8\5\2\2\2#%\5\n\6\2"+
		"$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'8\3\2\2\2()\5\n\6\2)*\7\f\2"+
		"\2*,\3\2\2\2+(\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.8\3\2\2\2/\60\5\n"+
		"\6\2\60\61\7\f\2\2\61\62\7\b\2\2\62\64\3\2\2\2\63/\3\2\2\2\64\65\3\2\2"+
		"\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\"\3\2\2\2\67$\3\2\2\2\67"+
		"+\3\2\2\2\67\63\3\2\2\28\7\3\2\2\29:\t\3\2\2:\t\3\2\2\2;<\5\b\5\2<=\7"+
		"\n\2\2=>\5\6\4\2>?\7\r\2\2?@\5\6\4\2@A\7\13\2\2AH\3\2\2\2BC\5\b\5\2CD"+
		"\7\n\2\2DE\5\6\4\2EF\7\13\2\2FH\3\2\2\2G;\3\2\2\2GB\3\2\2\2H\13\3\2\2"+
		"\2IJ\7\3\2\2JK\7\n\2\2KL\5\6\4\2LM\7\r\2\2MN\5\6\4\2NO\7\13\2\2O\r\3\2"+
		"\2\2PQ\7\4\2\2QR\7\n\2\2RS\5\6\4\2ST\7\r\2\2TU\5\6\4\2UV\7\13\2\2V\17"+
		"\3\2\2\2WX\7\5\2\2XY\7\n\2\2YZ\5\6\4\2Z[\7\13\2\2[\21\3\2\2\2\\]\7\6\2"+
		"\2]^\7\n\2\2^_\5\6\4\2_`\7\r\2\2`a\5\6\4\2ab\7\13\2\2b\23\3\2\2\2\t\32"+
		"\36&-\65\67G";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}