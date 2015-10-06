// Generated from C:\Users\ministeren\Dropbox\Softwareteknologi - Fælles\3. Semester\Compilerteknik\Assignment 2\Assignment 2\MiniJava.g4 by ANTLR 4.1
package compiler.Frontend;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MINUS=1, AND=2, EQUALS=3, LESSTHAN=4, GREATERTHAN=5, PLUS=6, TIMES=7, 
		EXCLAMATION=8, SEMICOLON=9, COMMA=10, EQUAL=11, DOT=12, INCREMENT=13, 
		DECREMENT=14, PLUSEQUAL=15, ROUNDOPEN=16, ROUNDCLOSE=17, SQUAREOPEN=18, 
		SQUARECLOSE=19, CURLYOPEN=20, CURLYCLOSE=21, TRUE=22, FALSE=23, CLASS=24, 
		EXTENDS=25, TYPEBOOLEAN=26, TYPEVOID=27, TYPEINT=28, TYPEDOUBLE=29, TYPECHAR=30, 
		PUBLIC=31, PRIVATE=32, STATIC=33, THIS=34, IF=35, ELSE=36, WHILE=37, PRINT=38, 
		PRINTLN=39, RETURN=40, NEW=41, IDENT=42, INT=43, DOUBLE=44, CHAR=45, STRING=46, 
		LINE_COMMENT=47, MULTILINE_COMMENT=48, WHITESPACE=49;
	public static final String[] tokenNames = {
		"<INVALID>", "'-'", "'&&'", "'=='", "'<'", "'>'", "'+'", "'*'", "'!'", 
		"';'", "','", "'='", "'.'", "'++'", "'--'", "'+='", "'('", "')'", "'['", 
		"']'", "'{'", "'}'", "'true'", "'false'", "'class'", "'extends'", "'boolean'", 
		"'void'", "'int'", "'double'", "'char'", "'public'", "'private'", "'static'", 
		"'this'", "'if'", "'else'", "'while'", "'System.out.print'", "'System.out.println'", 
		"'return'", "'new'", "IDENT", "INT", "DOUBLE", "CHAR", "STRING", "LINE_COMMENT", 
		"MULTILINE_COMMENT", "WHITESPACE"
	};
	public static final int
		RULE_program = 0, RULE_classDeclaration = 1, RULE_mainClass = 2, RULE_block = 3, 
		RULE_varDeclaration = 4, RULE_variable = 5, RULE_type = 6, RULE_typeBasic = 7, 
		RULE_typeArray = 8, RULE_typeBoolean = 9, RULE_typeInt = 10, RULE_typeClass = 11, 
		RULE_typeDouble = 12, RULE_typeChar = 13, RULE_methodDeclaration = 14, 
		RULE_constructor = 15, RULE_procType = 16, RULE_typeVoid = 17, RULE_statement = 18, 
		RULE_statementIf = 19, RULE_statementWhile = 20, RULE_statementAssign = 21, 
		RULE_statementAssignArray = 22, RULE_statementPrint = 23, RULE_statementPrintln = 24, 
		RULE_statementMethod = 25, RULE_statementPostInc = 26, RULE_statementPostDec = 27, 
		RULE_statementPreInc = 28, RULE_statementPreDec = 29, RULE_statementPlusEqual = 30, 
		RULE_statementReturn = 31, RULE_expression = 32, RULE_level1 = 33, RULE_level2 = 34, 
		RULE_level3 = 35, RULE_level4 = 36, RULE_level5 = 37, RULE_expressionUnaryMinus = 38, 
		RULE_expressionNegation = 39, RULE_expressionNewObject = 40, RULE_expressionNewArray = 41, 
		RULE_expressionIdentifier = 42, RULE_expressionArrayAccess = 43, RULE_expressionParentheses = 44, 
		RULE_expressionConstantTrue = 45, RULE_expressionConstantFalse = 46, RULE_expressionConstantInteger = 47, 
		RULE_expressionConstantDouble = 48, RULE_expressionConstantString = 49, 
		RULE_expressionConstantChar = 50, RULE_expressionMethodCall = 51, RULE_expressionPostIncrement = 52, 
		RULE_expressionPostDecrement = 53, RULE_expressionPreIncrement = 54, RULE_expressionPreDecrement = 55, 
		RULE_expressionPlusEqual = 56, RULE_identifier = 57, RULE_identifierIdentifier = 58, 
		RULE_identifierId = 59, RULE_idThis = 60, RULE_idIDENT = 61;
	public static final String[] ruleNames = {
		"program", "classDeclaration", "mainClass", "block", "varDeclaration", 
		"variable", "type", "typeBasic", "typeArray", "typeBoolean", "typeInt", 
		"typeClass", "typeDouble", "typeChar", "methodDeclaration", "constructor", 
		"procType", "typeVoid", "statement", "statementIf", "statementWhile", 
		"statementAssign", "statementAssignArray", "statementPrint", "statementPrintln", 
		"statementMethod", "statementPostInc", "statementPostDec", "statementPreInc", 
		"statementPreDec", "statementPlusEqual", "statementReturn", "expression", 
		"level1", "level2", "level3", "level4", "level5", "expressionUnaryMinus", 
		"expressionNegation", "expressionNewObject", "expressionNewArray", "expressionIdentifier", 
		"expressionArrayAccess", "expressionParentheses", "expressionConstantTrue", 
		"expressionConstantFalse", "expressionConstantInteger", "expressionConstantDouble", 
		"expressionConstantString", "expressionConstantChar", "expressionMethodCall", 
		"expressionPostIncrement", "expressionPostDecrement", "expressionPreIncrement", 
		"expressionPreDecrement", "expressionPlusEqual", "identifier", "identifierIdentifier", 
		"identifierId", "idThis", "idIDENT"
	};

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(124); mainClass();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(125); classDeclaration();
				}
				}
				setState(130);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public Token className;
		public Token superClassName;
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TerminalNode CURLYOPEN() { return getToken(MiniJavaParser.CURLYOPEN, 0); }
		public TerminalNode IDENT(int i) {
			return getToken(MiniJavaParser.IDENT, i);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(MiniJavaParser.CLASS, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(MiniJavaParser.CURLYCLOSE, 0); }
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<TerminalNode> IDENT() { return getTokens(MiniJavaParser.IDENT); }
		public TerminalNode EXTENDS() { return getToken(MiniJavaParser.EXTENDS, 0); }
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131); match(CLASS);
			setState(132); ((ClassDeclarationContext)_localctx).className = match(IDENT);
			setState(135);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(133); match(EXTENDS);
				setState(134); ((ClassDeclarationContext)_localctx).superClassName = match(IDENT);
				}
			}

			setState(137); match(CURLYOPEN);
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(138); constructor();
				}
				break;
			}
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(141); varDeclaration();
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEBOOLEAN) | (1L << TYPEVOID) | (1L << TYPEINT) | (1L << TYPEDOUBLE) | (1L << TYPECHAR) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << STATIC) | (1L << IDENT))) != 0)) {
				{
				{
				setState(147); methodDeclaration();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153); match(CURLYCLOSE);
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

	public static class MainClassContext extends ParserRuleContext {
		public Token className;
		public MethodDeclarationContext method;
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TerminalNode CURLYOPEN() { return getToken(MiniJavaParser.CURLYOPEN, 0); }
		public TerminalNode CLASS() { return getToken(MiniJavaParser.CLASS, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(MiniJavaParser.CURLYCLOSE, 0); }
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(CLASS);
			setState(156); ((MainClassContext)_localctx).className = match(IDENT);
			setState(157); match(CURLYOPEN);
			setState(158); ((MainClassContext)_localctx).method = methodDeclaration();
			setState(159); match(CURLYCLOSE);
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

	public static class BlockContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TerminalNode CURLYOPEN() { return getToken(MiniJavaParser.CURLYOPEN, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode CURLYCLOSE() { return getToken(MiniJavaParser.CURLYCLOSE, 0); }
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161); match(CURLYOPEN);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(162); varDeclaration();
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INCREMENT) | (1L << DECREMENT) | (1L << CURLYOPEN) | (1L << THIS) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << PRINTLN) | (1L << RETURN) | (1L << IDENT))) != 0)) {
				{
				{
				setState(168); statement();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174); match(CURLYCLOSE);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public VariableContext var;
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); ((VarDeclarationContext)_localctx).var = variable();
			setState(177); match(SEMICOLON);
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

	public static class VariableContext extends ParserRuleContext {
		public Token variableName;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); type();
			setState(180); ((VariableContext)_localctx).variableName = match(IDENT);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeArrayContext typeArray() {
			return getRuleContext(TypeArrayContext.class,0);
		}
		public TypeBasicContext typeBasic() {
			return getRuleContext(TypeBasicContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(184);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182); typeBasic();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183); typeArray();
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

	public static class TypeBasicContext extends ParserRuleContext {
		public TypeIntContext typeInt() {
			return getRuleContext(TypeIntContext.class,0);
		}
		public TypeClassContext typeClass() {
			return getRuleContext(TypeClassContext.class,0);
		}
		public TypeBooleanContext typeBoolean() {
			return getRuleContext(TypeBooleanContext.class,0);
		}
		public TypeDoubleContext typeDouble() {
			return getRuleContext(TypeDoubleContext.class,0);
		}
		public TypeCharContext typeChar() {
			return getRuleContext(TypeCharContext.class,0);
		}
		public TypeBasicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBasic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeBasic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeBasic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeBasic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBasicContext typeBasic() throws RecognitionException {
		TypeBasicContext _localctx = new TypeBasicContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeBasic);
		try {
			setState(191);
			switch (_input.LA(1)) {
			case TYPEBOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(186); typeBoolean();
				}
				break;
			case TYPEINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(187); typeInt();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(188); typeClass();
				}
				break;
			case TYPEDOUBLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(189); typeDouble();
				}
				break;
			case TYPECHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(190); typeChar();
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

	public static class TypeArrayContext extends ParserRuleContext {
		public TypeBasicContext typeBasic() {
			return getRuleContext(TypeBasicContext.class,0);
		}
		public TerminalNode SQUARECLOSE() { return getToken(MiniJavaParser.SQUARECLOSE, 0); }
		public TerminalNode SQUAREOPEN() { return getToken(MiniJavaParser.SQUAREOPEN, 0); }
		public TypeArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArrayContext typeArray() throws RecognitionException {
		TypeArrayContext _localctx = new TypeArrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); typeBasic();
			setState(194); match(SQUAREOPEN);
			setState(195); match(SQUARECLOSE);
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

	public static class TypeBooleanContext extends ParserRuleContext {
		public TerminalNode TYPEBOOLEAN() { return getToken(MiniJavaParser.TYPEBOOLEAN, 0); }
		public TypeBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBoolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBooleanContext typeBoolean() throws RecognitionException {
		TypeBooleanContext _localctx = new TypeBooleanContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeBoolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(TYPEBOOLEAN);
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

	public static class TypeIntContext extends ParserRuleContext {
		public TerminalNode TYPEINT() { return getToken(MiniJavaParser.TYPEINT, 0); }
		public TypeIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIntContext typeInt() throws RecognitionException {
		TypeIntContext _localctx = new TypeIntContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); match(TYPEINT);
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

	public static class TypeClassContext extends ParserRuleContext {
		public Token className;
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public TypeClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeClassContext typeClass() throws RecognitionException {
		TypeClassContext _localctx = new TypeClassContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); ((TypeClassContext)_localctx).className = match(IDENT);
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

	public static class TypeDoubleContext extends ParserRuleContext {
		public TerminalNode TYPEDOUBLE() { return getToken(MiniJavaParser.TYPEDOUBLE, 0); }
		public TypeDoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDouble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDoubleContext typeDouble() throws RecognitionException {
		TypeDoubleContext _localctx = new TypeDoubleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeDouble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); match(TYPEDOUBLE);
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

	public static class TypeCharContext extends ParserRuleContext {
		public TerminalNode TYPECHAR() { return getToken(MiniJavaParser.TYPECHAR, 0); }
		public TypeCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeCharContext typeChar() throws RecognitionException {
		TypeCharContext _localctx = new TypeCharContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeChar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(TYPECHAR);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public Token isPublic;
		public Token isPrivate;
		public Token isStatic;
		public Token methodName;
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TerminalNode CURLYOPEN() { return getToken(MiniJavaParser.CURLYOPEN, 0); }
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementReturnContext statementReturn() {
			return getRuleContext(StatementReturnContext.class,0);
		}
		public TerminalNode CURLYCLOSE() { return getToken(MiniJavaParser.CURLYCLOSE, 0); }
		public ProcTypeContext procType() {
			return getRuleContext(ProcTypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniJavaParser.COMMA, i);
		}
		public TerminalNode PRIVATE() { return getToken(MiniJavaParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(MiniJavaParser.STATIC, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniJavaParser.COMMA); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public TerminalNode PUBLIC() { return getToken(MiniJavaParser.PUBLIC, 0); }
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			switch (_input.LA(1)) {
			case PUBLIC:
				{
				setState(207); ((MethodDeclarationContext)_localctx).isPublic = match(PUBLIC);
				}
				break;
			case PRIVATE:
				{
				setState(208); ((MethodDeclarationContext)_localctx).isPrivate = match(PRIVATE);
				}
				break;
			case TYPEBOOLEAN:
			case TYPEVOID:
			case TYPEINT:
			case TYPEDOUBLE:
			case TYPECHAR:
			case STATIC:
			case IDENT:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(212);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(211); ((MethodDeclarationContext)_localctx).isStatic = match(STATIC);
				}
			}

			setState(214); procType();
			setState(215); ((MethodDeclarationContext)_localctx).methodName = match(IDENT);
			setState(216); match(ROUNDOPEN);
			setState(225);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEBOOLEAN) | (1L << TYPEINT) | (1L << TYPEDOUBLE) | (1L << TYPECHAR) | (1L << IDENT))) != 0)) {
				{
				setState(217); variable();
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(218); match(COMMA);
					setState(219); variable();
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(227); match(ROUNDCLOSE);
			setState(228); match(CURLYOPEN);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(229); varDeclaration();
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(235); statement();
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(241); statementReturn();
			setState(242); match(CURLYCLOSE);
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

	public static class ConstructorContext extends ParserRuleContext {
		public Token isPublic;
		public Token methodName;
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TerminalNode CURLYOPEN() { return getToken(MiniJavaParser.CURLYOPEN, 0); }
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode CURLYCLOSE() { return getToken(MiniJavaParser.CURLYCLOSE, 0); }
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniJavaParser.COMMA, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniJavaParser.COMMA); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public TerminalNode PUBLIC() { return getToken(MiniJavaParser.PUBLIC, 0); }
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_constructor);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if (_la==PUBLIC) {
				{
				setState(244); ((ConstructorContext)_localctx).isPublic = match(PUBLIC);
				}
			}

			setState(247); ((ConstructorContext)_localctx).methodName = match(IDENT);
			setState(248); match(ROUNDOPEN);
			setState(257);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEBOOLEAN) | (1L << TYPEINT) | (1L << TYPEDOUBLE) | (1L << TYPECHAR) | (1L << IDENT))) != 0)) {
				{
				setState(249); variable();
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(250); match(COMMA);
					setState(251); variable();
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(259); match(ROUNDCLOSE);
			setState(260); match(CURLYOPEN);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(261); varDeclaration();
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INCREMENT) | (1L << DECREMENT) | (1L << CURLYOPEN) | (1L << THIS) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << PRINTLN) | (1L << RETURN) | (1L << IDENT))) != 0)) {
				{
				{
				setState(267); statement();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273); match(CURLYCLOSE);
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

	public static class ProcTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeVoidContext typeVoid() {
			return getRuleContext(TypeVoidContext.class,0);
		}
		public ProcTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterProcType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitProcType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitProcType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcTypeContext procType() throws RecognitionException {
		ProcTypeContext _localctx = new ProcTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_procType);
		try {
			setState(277);
			switch (_input.LA(1)) {
			case TYPEVOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(275); typeVoid();
				}
				break;
			case TYPEBOOLEAN:
			case TYPEINT:
			case TYPEDOUBLE:
			case TYPECHAR:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(276); type();
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

	public static class TypeVoidContext extends ParserRuleContext {
		public TerminalNode TYPEVOID() { return getToken(MiniJavaParser.TYPEVOID, 0); }
		public TypeVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVoidContext typeVoid() throws RecognitionException {
		TypeVoidContext _localctx = new TypeVoidContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeVoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279); match(TYPEVOID);
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
		public StatementPrintlnContext statementPrintln() {
			return getRuleContext(StatementPrintlnContext.class,0);
		}
		public StatementPlusEqualContext statementPlusEqual() {
			return getRuleContext(StatementPlusEqualContext.class,0);
		}
		public StatementMethodContext statementMethod() {
			return getRuleContext(StatementMethodContext.class,0);
		}
		public StatementAssignArrayContext statementAssignArray() {
			return getRuleContext(StatementAssignArrayContext.class,0);
		}
		public StatementReturnContext statementReturn() {
			return getRuleContext(StatementReturnContext.class,0);
		}
		public StatementIfContext statementIf() {
			return getRuleContext(StatementIfContext.class,0);
		}
		public StatementPostDecContext statementPostDec() {
			return getRuleContext(StatementPostDecContext.class,0);
		}
		public StatementAssignContext statementAssign() {
			return getRuleContext(StatementAssignContext.class,0);
		}
		public StatementPostIncContext statementPostInc() {
			return getRuleContext(StatementPostIncContext.class,0);
		}
		public StatementPreDecContext statementPreDec() {
			return getRuleContext(StatementPreDecContext.class,0);
		}
		public StatementPrintContext statementPrint() {
			return getRuleContext(StatementPrintContext.class,0);
		}
		public StatementPreIncContext statementPreInc() {
			return getRuleContext(StatementPreIncContext.class,0);
		}
		public StatementWhileContext statementWhile() {
			return getRuleContext(StatementWhileContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statement);
		try {
			setState(295);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281); block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282); statementIf();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(283); statementWhile();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(284); statementAssign();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(285); statementAssignArray();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(286); statementPrintln();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(287); statementPrint();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(288); statementMethod();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(289); statementReturn();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(290); statementPostInc();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(291); statementPostDec();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(292); statementPreInc();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(293); statementPreDec();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(294); statementPlusEqual();
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

	public static class StatementIfContext extends ParserRuleContext {
		public ExpressionContext condition;
		public BlockContext ifBlock;
		public BlockContext elseBlock;
		public TerminalNode ELSE() { return getToken(MiniJavaParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(MiniJavaParser.IF, 0); }
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public StatementIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementIfContext statementIf() throws RecognitionException {
		StatementIfContext _localctx = new StatementIfContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statementIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297); match(IF);
			setState(298); match(ROUNDOPEN);
			setState(299); ((StatementIfContext)_localctx).condition = expression();
			setState(300); match(ROUNDCLOSE);
			setState(301); ((StatementIfContext)_localctx).ifBlock = block();
			setState(304);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(302); match(ELSE);
				setState(303); ((StatementIfContext)_localctx).elseBlock = block();
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

	public static class StatementWhileContext extends ParserRuleContext {
		public ExpressionContext condition;
		public StatementContext whileBlock;
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(MiniJavaParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWhileContext statementWhile() throws RecognitionException {
		StatementWhileContext _localctx = new StatementWhileContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statementWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306); match(WHILE);
			setState(307); match(ROUNDOPEN);
			setState(308); ((StatementWhileContext)_localctx).condition = expression();
			setState(309); match(ROUNDCLOSE);
			setState(310); ((StatementWhileContext)_localctx).whileBlock = statement();
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

	public static class StatementAssignContext extends ParserRuleContext {
		public IdentifierContext lhs;
		public ExpressionContext rhs;
		public TerminalNode EQUAL() { return getToken(MiniJavaParser.EQUAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementAssignContext statementAssign() throws RecognitionException {
		StatementAssignContext _localctx = new StatementAssignContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statementAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312); ((StatementAssignContext)_localctx).lhs = identifier();
			setState(313); match(EQUAL);
			setState(314); ((StatementAssignContext)_localctx).rhs = expression();
			setState(315); match(SEMICOLON);
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

	public static class StatementAssignArrayContext extends ParserRuleContext {
		public IdentifierContext array;
		public ExpressionContext element;
		public ExpressionContext value;
		public TerminalNode SQUARECLOSE() { return getToken(MiniJavaParser.SQUARECLOSE, 0); }
		public TerminalNode EQUAL() { return getToken(MiniJavaParser.EQUAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SQUAREOPEN() { return getToken(MiniJavaParser.SQUAREOPEN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public StatementAssignArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssignArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementAssignArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementAssignArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementAssignArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementAssignArrayContext statementAssignArray() throws RecognitionException {
		StatementAssignArrayContext _localctx = new StatementAssignArrayContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statementAssignArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317); ((StatementAssignArrayContext)_localctx).array = identifier();
			setState(318); match(SQUAREOPEN);
			setState(319); ((StatementAssignArrayContext)_localctx).element = expression();
			setState(320); match(SQUARECLOSE);
			setState(321); match(EQUAL);
			setState(322); ((StatementAssignArrayContext)_localctx).value = expression();
			setState(323); match(SEMICOLON);
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

	public static class StatementPrintContext extends ParserRuleContext {
		public ExpressionContext argument;
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode PRINT() { return getToken(MiniJavaParser.PRINT, 0); }
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementPrint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementPrintContext statementPrint() throws RecognitionException {
		StatementPrintContext _localctx = new StatementPrintContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_statementPrint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325); match(PRINT);
			setState(326); match(ROUNDOPEN);
			setState(327); ((StatementPrintContext)_localctx).argument = expression();
			setState(328); match(ROUNDCLOSE);
			setState(329); match(SEMICOLON);
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

	public static class StatementPrintlnContext extends ParserRuleContext {
		public ExpressionContext argument;
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode PRINTLN() { return getToken(MiniJavaParser.PRINTLN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementPrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementPrintln; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementPrintlnContext statementPrintln() throws RecognitionException {
		StatementPrintlnContext _localctx = new StatementPrintlnContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statementPrintln);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331); match(PRINTLN);
			setState(332); match(ROUNDOPEN);
			setState(333); ((StatementPrintlnContext)_localctx).argument = expression();
			setState(334); match(ROUNDCLOSE);
			setState(335); match(SEMICOLON);
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

	public static class StatementMethodContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public ExpressionMethodCallContext expressionMethodCall() {
			return getRuleContext(ExpressionMethodCallContext.class,0);
		}
		public StatementMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementMethodContext statementMethod() throws RecognitionException {
		StatementMethodContext _localctx = new StatementMethodContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_statementMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337); expressionMethodCall();
			setState(338); match(SEMICOLON);
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

	public static class StatementPostIncContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public ExpressionPostIncrementContext expressionPostIncrement() {
			return getRuleContext(ExpressionPostIncrementContext.class,0);
		}
		public StatementPostIncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementPostInc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementPostInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementPostInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementPostInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementPostIncContext statementPostInc() throws RecognitionException {
		StatementPostIncContext _localctx = new StatementPostIncContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_statementPostInc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340); expressionPostIncrement();
			setState(341); match(SEMICOLON);
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

	public static class StatementPostDecContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public ExpressionPostDecrementContext expressionPostDecrement() {
			return getRuleContext(ExpressionPostDecrementContext.class,0);
		}
		public StatementPostDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementPostDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementPostDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementPostDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementPostDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementPostDecContext statementPostDec() throws RecognitionException {
		StatementPostDecContext _localctx = new StatementPostDecContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statementPostDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343); expressionPostDecrement();
			setState(344); match(SEMICOLON);
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

	public static class StatementPreIncContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public ExpressionPreIncrementContext expressionPreIncrement() {
			return getRuleContext(ExpressionPreIncrementContext.class,0);
		}
		public StatementPreIncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementPreInc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementPreInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementPreInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementPreInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementPreIncContext statementPreInc() throws RecognitionException {
		StatementPreIncContext _localctx = new StatementPreIncContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_statementPreInc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346); expressionPreIncrement();
			setState(347); match(SEMICOLON);
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

	public static class StatementPreDecContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public ExpressionPreDecrementContext expressionPreDecrement() {
			return getRuleContext(ExpressionPreDecrementContext.class,0);
		}
		public StatementPreDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementPreDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementPreDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementPreDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementPreDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementPreDecContext statementPreDec() throws RecognitionException {
		StatementPreDecContext _localctx = new StatementPreDecContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_statementPreDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349); expressionPreDecrement();
			setState(350); match(SEMICOLON);
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

	public static class StatementPlusEqualContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public ExpressionPlusEqualContext expressionPlusEqual() {
			return getRuleContext(ExpressionPlusEqualContext.class,0);
		}
		public StatementPlusEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementPlusEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementPlusEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementPlusEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementPlusEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementPlusEqualContext statementPlusEqual() throws RecognitionException {
		StatementPlusEqualContext _localctx = new StatementPlusEqualContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statementPlusEqual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352); expressionPlusEqual();
			setState(353); match(SEMICOLON);
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

	public static class StatementReturnContext extends ParserRuleContext {
		public ExpressionContext argument;
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode RETURN() { return getToken(MiniJavaParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementReturnContext statementReturn() throws RecognitionException {
		StatementReturnContext _localctx = new StatementReturnContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_statementReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355); match(RETURN);
			setState(357);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << EXCLAMATION) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << ROUNDOPEN) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << NEW) | (1L << IDENT) | (1L << INT) | (1L << DOUBLE) | (1L << CHAR) | (1L << STRING))) != 0)) {
				{
				setState(356); ((StatementReturnContext)_localctx).argument = expression();
				}
			}

			setState(359); match(SEMICOLON);
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
		public Level1Context head;
		public Level1Context level1;
		public List<Level1Context> tail = new ArrayList<Level1Context>();
		public TerminalNode AND(int i) {
			return getToken(MiniJavaParser.AND, i);
		}
		public Level1Context level1(int i) {
			return getRuleContext(Level1Context.class,i);
		}
		public List<Level1Context> level1() {
			return getRuleContexts(Level1Context.class);
		}
		public List<TerminalNode> AND() { return getTokens(MiniJavaParser.AND); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361); ((ExpressionContext)_localctx).head = level1();
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(362); match(AND);
				setState(363); ((ExpressionContext)_localctx).level1 = level1();
				((ExpressionContext)_localctx).tail.add(((ExpressionContext)_localctx).level1);
				}
				}
				setState(368);
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

	public static class Level1Context extends ParserRuleContext {
		public Level2Context head;
		public Level2Context level2;
		public List<Level2Context> tail = new ArrayList<Level2Context>();
		public List<TerminalNode> EQUALS() { return getTokens(MiniJavaParser.EQUALS); }
		public Level2Context level2(int i) {
			return getRuleContext(Level2Context.class,i);
		}
		public TerminalNode EQUALS(int i) {
			return getToken(MiniJavaParser.EQUALS, i);
		}
		public List<Level2Context> level2() {
			return getRuleContexts(Level2Context.class);
		}
		public Level1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level1Context level1() throws RecognitionException {
		Level1Context _localctx = new Level1Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_level1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369); ((Level1Context)_localctx).head = level2();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUALS) {
				{
				{
				setState(370); match(EQUALS);
				setState(371); ((Level1Context)_localctx).level2 = level2();
				((Level1Context)_localctx).tail.add(((Level1Context)_localctx).level2);
				}
				}
				setState(376);
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

	public static class Level2Context extends ParserRuleContext {
		public Level3Context head;
		public Token LESSTHAN;
		public List<Token> operator = new ArrayList<Token>();
		public Token GREATERTHAN;
		public Token _tset692;
		public Level3Context level3;
		public List<Level3Context> tail = new ArrayList<Level3Context>();
		public TerminalNode LESSTHAN(int i) {
			return getToken(MiniJavaParser.LESSTHAN, i);
		}
		public List<TerminalNode> GREATERTHAN() { return getTokens(MiniJavaParser.GREATERTHAN); }
		public List<Level3Context> level3() {
			return getRuleContexts(Level3Context.class);
		}
		public Level3Context level3(int i) {
			return getRuleContext(Level3Context.class,i);
		}
		public List<TerminalNode> LESSTHAN() { return getTokens(MiniJavaParser.LESSTHAN); }
		public TerminalNode GREATERTHAN(int i) {
			return getToken(MiniJavaParser.GREATERTHAN, i);
		}
		public Level2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level2Context level2() throws RecognitionException {
		Level2Context _localctx = new Level2Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_level2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377); ((Level2Context)_localctx).head = level3();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LESSTHAN || _la==GREATERTHAN) {
				{
				{
				setState(378);
				((Level2Context)_localctx)._tset692 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LESSTHAN || _la==GREATERTHAN) ) {
					((Level2Context)_localctx)._tset692 = (Token)_errHandler.recoverInline(this);
				}
				consume();
				((Level2Context)_localctx).operator.add(((Level2Context)_localctx)._tset692);
				setState(379); ((Level2Context)_localctx).level3 = level3();
				((Level2Context)_localctx).tail.add(((Level2Context)_localctx).level3);
				}
				}
				setState(384);
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

	public static class Level3Context extends ParserRuleContext {
		public Level4Context head;
		public Token PLUS;
		public List<Token> operator = new ArrayList<Token>();
		public Token MINUS;
		public Token _tset722;
		public Level4Context level4;
		public List<Level4Context> tail = new ArrayList<Level4Context>();
		public TerminalNode MINUS(int i) {
			return getToken(MiniJavaParser.MINUS, i);
		}
		public List<Level4Context> level4() {
			return getRuleContexts(Level4Context.class);
		}
		public Level4Context level4(int i) {
			return getRuleContext(Level4Context.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(MiniJavaParser.PLUS); }
		public List<TerminalNode> MINUS() { return getTokens(MiniJavaParser.MINUS); }
		public TerminalNode PLUS(int i) {
			return getToken(MiniJavaParser.PLUS, i);
		}
		public Level3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level3Context level3() throws RecognitionException {
		Level3Context _localctx = new Level3Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_level3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385); ((Level3Context)_localctx).head = level4();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS || _la==PLUS) {
				{
				{
				setState(386);
				((Level3Context)_localctx)._tset722 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==PLUS) ) {
					((Level3Context)_localctx)._tset722 = (Token)_errHandler.recoverInline(this);
				}
				consume();
				((Level3Context)_localctx).operator.add(((Level3Context)_localctx)._tset722);
				setState(387); ((Level3Context)_localctx).level4 = level4();
				((Level3Context)_localctx).tail.add(((Level3Context)_localctx).level4);
				}
				}
				setState(392);
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

	public static class Level4Context extends ParserRuleContext {
		public Level5Context head;
		public Level5Context level5;
		public List<Level5Context> tail = new ArrayList<Level5Context>();
		public List<Level5Context> level5() {
			return getRuleContexts(Level5Context.class);
		}
		public TerminalNode TIMES(int i) {
			return getToken(MiniJavaParser.TIMES, i);
		}
		public List<TerminalNode> TIMES() { return getTokens(MiniJavaParser.TIMES); }
		public Level5Context level5(int i) {
			return getRuleContext(Level5Context.class,i);
		}
		public Level4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level4Context level4() throws RecognitionException {
		Level4Context _localctx = new Level4Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_level4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393); ((Level4Context)_localctx).head = level5();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES) {
				{
				{
				setState(394); match(TIMES);
				setState(395); ((Level4Context)_localctx).level5 = level5();
				((Level4Context)_localctx).tail.add(((Level4Context)_localctx).level5);
				}
				}
				setState(400);
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

	public static class Level5Context extends ParserRuleContext {
		public ExpressionConstantFalseContext expressionConstantFalse() {
			return getRuleContext(ExpressionConstantFalseContext.class,0);
		}
		public ExpressionConstantStringContext expressionConstantString() {
			return getRuleContext(ExpressionConstantStringContext.class,0);
		}
		public ExpressionConstantIntegerContext expressionConstantInteger() {
			return getRuleContext(ExpressionConstantIntegerContext.class,0);
		}
		public ExpressionParenthesesContext expressionParentheses() {
			return getRuleContext(ExpressionParenthesesContext.class,0);
		}
		public ExpressionPostIncrementContext expressionPostIncrement() {
			return getRuleContext(ExpressionPostIncrementContext.class,0);
		}
		public ExpressionPreDecrementContext expressionPreDecrement() {
			return getRuleContext(ExpressionPreDecrementContext.class,0);
		}
		public ExpressionNewObjectContext expressionNewObject() {
			return getRuleContext(ExpressionNewObjectContext.class,0);
		}
		public ExpressionMethodCallContext expressionMethodCall() {
			return getRuleContext(ExpressionMethodCallContext.class,0);
		}
		public ExpressionConstantCharContext expressionConstantChar() {
			return getRuleContext(ExpressionConstantCharContext.class,0);
		}
		public ExpressionUnaryMinusContext expressionUnaryMinus() {
			return getRuleContext(ExpressionUnaryMinusContext.class,0);
		}
		public ExpressionNewArrayContext expressionNewArray() {
			return getRuleContext(ExpressionNewArrayContext.class,0);
		}
		public ExpressionConstantDoubleContext expressionConstantDouble() {
			return getRuleContext(ExpressionConstantDoubleContext.class,0);
		}
		public ExpressionArrayAccessContext expressionArrayAccess() {
			return getRuleContext(ExpressionArrayAccessContext.class,0);
		}
		public ExpressionPreIncrementContext expressionPreIncrement() {
			return getRuleContext(ExpressionPreIncrementContext.class,0);
		}
		public ExpressionNegationContext expressionNegation() {
			return getRuleContext(ExpressionNegationContext.class,0);
		}
		public ExpressionPostDecrementContext expressionPostDecrement() {
			return getRuleContext(ExpressionPostDecrementContext.class,0);
		}
		public ExpressionConstantTrueContext expressionConstantTrue() {
			return getRuleContext(ExpressionConstantTrueContext.class,0);
		}
		public ExpressionPlusEqualContext expressionPlusEqual() {
			return getRuleContext(ExpressionPlusEqualContext.class,0);
		}
		public ExpressionIdentifierContext expressionIdentifier() {
			return getRuleContext(ExpressionIdentifierContext.class,0);
		}
		public Level5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level5Context level5() throws RecognitionException {
		Level5Context _localctx = new Level5Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_level5);
		try {
			setState(420);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(401); expressionUnaryMinus();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402); expressionNegation();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(403); expressionNewObject();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(404); expressionNewArray();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(405); expressionIdentifier();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(406); expressionArrayAccess();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(407); expressionMethodCall();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(408); expressionParentheses();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(409); expressionConstantTrue();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(410); expressionConstantFalse();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(411); expressionConstantInteger();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(412); expressionConstantDouble();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(413); expressionConstantString();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(414); expressionPostIncrement();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(415); expressionPostDecrement();
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(416); expressionPreIncrement();
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(417); expressionPreDecrement();
				}
				break;

			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(418); expressionPlusEqual();
				}
				break;

			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(419); expressionConstantChar();
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

	public static class ExpressionUnaryMinusContext extends ParserRuleContext {
		public Level5Context argument;
		public Level5Context level5() {
			return getRuleContext(Level5Context.class,0);
		}
		public TerminalNode MINUS() { return getToken(MiniJavaParser.MINUS, 0); }
		public ExpressionUnaryMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionUnaryMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionUnaryMinusContext expressionUnaryMinus() throws RecognitionException {
		ExpressionUnaryMinusContext _localctx = new ExpressionUnaryMinusContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expressionUnaryMinus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422); match(MINUS);
			setState(423); ((ExpressionUnaryMinusContext)_localctx).argument = level5();
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

	public static class ExpressionNegationContext extends ParserRuleContext {
		public Level5Context argument;
		public Level5Context level5() {
			return getRuleContext(Level5Context.class,0);
		}
		public TerminalNode EXCLAMATION() { return getToken(MiniJavaParser.EXCLAMATION, 0); }
		public ExpressionNegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionNegation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNegationContext expressionNegation() throws RecognitionException {
		ExpressionNegationContext _localctx = new ExpressionNegationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expressionNegation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425); match(EXCLAMATION);
			setState(426); ((ExpressionNegationContext)_localctx).argument = level5();
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

	public static class ExpressionNewObjectContext extends ParserRuleContext {
		public Token classname;
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public TerminalNode NEW() { return getToken(MiniJavaParser.NEW, 0); }
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public ExpressionNewObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionNewObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionNewObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionNewObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionNewObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNewObjectContext expressionNewObject() throws RecognitionException {
		ExpressionNewObjectContext _localctx = new ExpressionNewObjectContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expressionNewObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428); match(NEW);
			setState(429); ((ExpressionNewObjectContext)_localctx).classname = match(IDENT);
			setState(430); match(ROUNDOPEN);
			setState(431); match(ROUNDCLOSE);
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

	public static class ExpressionNewArrayContext extends ParserRuleContext {
		public ExpressionContext size;
		public TerminalNode SQUARECLOSE() { return getToken(MiniJavaParser.SQUARECLOSE, 0); }
		public TerminalNode TYPEINT() { return getToken(MiniJavaParser.TYPEINT, 0); }
		public TerminalNode SQUAREOPEN() { return getToken(MiniJavaParser.SQUAREOPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEW() { return getToken(MiniJavaParser.NEW, 0); }
		public ExpressionNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionNewArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionNewArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionNewArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNewArrayContext expressionNewArray() throws RecognitionException {
		ExpressionNewArrayContext _localctx = new ExpressionNewArrayContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expressionNewArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433); match(NEW);
			setState(434); match(TYPEINT);
			setState(435); match(SQUAREOPEN);
			setState(436); ((ExpressionNewArrayContext)_localctx).size = expression();
			setState(437); match(SQUARECLOSE);
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

	public static class ExpressionIdentifierContext extends ParserRuleContext {
		public IdentifierContext ident;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionIdentifierContext expressionIdentifier() throws RecognitionException {
		ExpressionIdentifierContext _localctx = new ExpressionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expressionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439); ((ExpressionIdentifierContext)_localctx).ident = identifier();
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

	public static class ExpressionArrayAccessContext extends ParserRuleContext {
		public IdentifierContext ident;
		public ExpressionContext element;
		public TerminalNode SQUARECLOSE() { return getToken(MiniJavaParser.SQUARECLOSE, 0); }
		public TerminalNode SQUAREOPEN() { return getToken(MiniJavaParser.SQUAREOPEN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionArrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionArrayAccessContext expressionArrayAccess() throws RecognitionException {
		ExpressionArrayAccessContext _localctx = new ExpressionArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expressionArrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441); ((ExpressionArrayAccessContext)_localctx).ident = identifier();
			setState(442); match(SQUAREOPEN);
			setState(443); ((ExpressionArrayAccessContext)_localctx).element = expression();
			setState(444); match(SQUARECLOSE);
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

	public static class ExpressionParenthesesContext extends ParserRuleContext {
		public ExpressionContext argument;
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionParenthesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionParentheses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionParentheses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionParenthesesContext expressionParentheses() throws RecognitionException {
		ExpressionParenthesesContext _localctx = new ExpressionParenthesesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expressionParentheses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446); match(ROUNDOPEN);
			setState(447); ((ExpressionParenthesesContext)_localctx).argument = expression();
			setState(448); match(ROUNDCLOSE);
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

	public static class ExpressionConstantTrueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(MiniJavaParser.TRUE, 0); }
		public ExpressionConstantTrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantTrue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionConstantTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionConstantTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionConstantTrue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantTrueContext expressionConstantTrue() throws RecognitionException {
		ExpressionConstantTrueContext _localctx = new ExpressionConstantTrueContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expressionConstantTrue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450); match(TRUE);
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

	public static class ExpressionConstantFalseContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(MiniJavaParser.FALSE, 0); }
		public ExpressionConstantFalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantFalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionConstantFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionConstantFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionConstantFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantFalseContext expressionConstantFalse() throws RecognitionException {
		ExpressionConstantFalseContext _localctx = new ExpressionConstantFalseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expressionConstantFalse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452); match(FALSE);
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

	public static class ExpressionConstantIntegerContext extends ParserRuleContext {
		public Token value;
		public TerminalNode INT() { return getToken(MiniJavaParser.INT, 0); }
		public ExpressionConstantIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionConstantInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionConstantInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionConstantInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantIntegerContext expressionConstantInteger() throws RecognitionException {
		ExpressionConstantIntegerContext _localctx = new ExpressionConstantIntegerContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expressionConstantInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454); ((ExpressionConstantIntegerContext)_localctx).value = match(INT);
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

	public static class ExpressionConstantDoubleContext extends ParserRuleContext {
		public Token value;
		public TerminalNode DOUBLE() { return getToken(MiniJavaParser.DOUBLE, 0); }
		public ExpressionConstantDoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantDouble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionConstantDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionConstantDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionConstantDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantDoubleContext expressionConstantDouble() throws RecognitionException {
		ExpressionConstantDoubleContext _localctx = new ExpressionConstantDoubleContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_expressionConstantDouble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456); ((ExpressionConstantDoubleContext)_localctx).value = match(DOUBLE);
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

	public static class ExpressionConstantStringContext extends ParserRuleContext {
		public Token value;
		public TerminalNode STRING() { return getToken(MiniJavaParser.STRING, 0); }
		public ExpressionConstantStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionConstantString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionConstantString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionConstantString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantStringContext expressionConstantString() throws RecognitionException {
		ExpressionConstantStringContext _localctx = new ExpressionConstantStringContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_expressionConstantString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458); ((ExpressionConstantStringContext)_localctx).value = match(STRING);
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

	public static class ExpressionConstantCharContext extends ParserRuleContext {
		public Token value;
		public TerminalNode CHAR() { return getToken(MiniJavaParser.CHAR, 0); }
		public ExpressionConstantCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionConstantChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionConstantChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionConstantChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantCharContext expressionConstantChar() throws RecognitionException {
		ExpressionConstantCharContext _localctx = new ExpressionConstantCharContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_expressionConstantChar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460); ((ExpressionConstantCharContext)_localctx).value = match(CHAR);
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

	public static class ExpressionMethodCallContext extends ParserRuleContext {
		public IdentifierContext object;
		public Token method;
		public ExpressionContext expression;
		public List<ExpressionContext> arguments = new ArrayList<ExpressionContext>();
		public TerminalNode DOT() { return getToken(MiniJavaParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniJavaParser.COMMA); }
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniJavaParser.COMMA, i);
		}
		public ExpressionMethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMethodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionMethodCallContext expressionMethodCall() throws RecognitionException {
		ExpressionMethodCallContext _localctx = new ExpressionMethodCallContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_expressionMethodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(462); ((ExpressionMethodCallContext)_localctx).object = identifier();
				setState(463); match(DOT);
				}
				break;
			}
			setState(467); ((ExpressionMethodCallContext)_localctx).method = match(IDENT);
			setState(468); match(ROUNDOPEN);
			setState(477);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << EXCLAMATION) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << ROUNDOPEN) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << NEW) | (1L << IDENT) | (1L << INT) | (1L << DOUBLE) | (1L << CHAR) | (1L << STRING))) != 0)) {
				{
				setState(469); ((ExpressionMethodCallContext)_localctx).expression = expression();
				((ExpressionMethodCallContext)_localctx).arguments.add(((ExpressionMethodCallContext)_localctx).expression);
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(470); match(COMMA);
					setState(471); ((ExpressionMethodCallContext)_localctx).expression = expression();
					((ExpressionMethodCallContext)_localctx).arguments.add(((ExpressionMethodCallContext)_localctx).expression);
					}
					}
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(479); match(ROUNDCLOSE);
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

	public static class ExpressionPostIncrementContext extends ParserRuleContext {
		public IdentifierContext ident;
		public TerminalNode INCREMENT() { return getToken(MiniJavaParser.INCREMENT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionPostIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPostIncrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionPostIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionPostIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionPostIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionPostIncrementContext expressionPostIncrement() throws RecognitionException {
		ExpressionPostIncrementContext _localctx = new ExpressionPostIncrementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_expressionPostIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481); ((ExpressionPostIncrementContext)_localctx).ident = identifier();
			setState(482); match(INCREMENT);
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

	public static class ExpressionPostDecrementContext extends ParserRuleContext {
		public IdentifierContext ident;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DECREMENT() { return getToken(MiniJavaParser.DECREMENT, 0); }
		public ExpressionPostDecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPostDecrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionPostDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionPostDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionPostDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionPostDecrementContext expressionPostDecrement() throws RecognitionException {
		ExpressionPostDecrementContext _localctx = new ExpressionPostDecrementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_expressionPostDecrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484); ((ExpressionPostDecrementContext)_localctx).ident = identifier();
			setState(485); match(DECREMENT);
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

	public static class ExpressionPreIncrementContext extends ParserRuleContext {
		public IdentifierContext ident;
		public TerminalNode INCREMENT() { return getToken(MiniJavaParser.INCREMENT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionPreIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPreIncrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionPreIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionPreIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionPreIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionPreIncrementContext expressionPreIncrement() throws RecognitionException {
		ExpressionPreIncrementContext _localctx = new ExpressionPreIncrementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_expressionPreIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487); match(INCREMENT);
			setState(488); ((ExpressionPreIncrementContext)_localctx).ident = identifier();
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

	public static class ExpressionPreDecrementContext extends ParserRuleContext {
		public IdentifierContext ident;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DECREMENT() { return getToken(MiniJavaParser.DECREMENT, 0); }
		public ExpressionPreDecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPreDecrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionPreDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionPreDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionPreDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionPreDecrementContext expressionPreDecrement() throws RecognitionException {
		ExpressionPreDecrementContext _localctx = new ExpressionPreDecrementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_expressionPreDecrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490); match(DECREMENT);
			setState(491); ((ExpressionPreDecrementContext)_localctx).ident = identifier();
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

	public static class ExpressionPlusEqualContext extends ParserRuleContext {
		public IdentifierContext ident;
		public Token value;
		public TerminalNode PLUSEQUAL() { return getToken(MiniJavaParser.PLUSEQUAL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode INT() { return getToken(MiniJavaParser.INT, 0); }
		public ExpressionPlusEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPlusEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionPlusEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionPlusEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionPlusEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionPlusEqualContext expressionPlusEqual() throws RecognitionException {
		ExpressionPlusEqualContext _localctx = new ExpressionPlusEqualContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_expressionPlusEqual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493); ((ExpressionPlusEqualContext)_localctx).ident = identifier();
			setState(494); match(PLUSEQUAL);
			setState(495); ((ExpressionPlusEqualContext)_localctx).value = match(INT);
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

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierIdentifierContext identifierIdentifier() {
			return getRuleContext(IdentifierIdentifierContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497); identifierIdentifier();
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

	public static class IdentifierIdentifierContext extends ParserRuleContext {
		public Token IDENT;
		public List<Token> selectors = new ArrayList<Token>();
		public IdentifierIdContext identifierId() {
			return getRuleContext(IdentifierIdContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(MiniJavaParser.DOT); }
		public TerminalNode IDENT(int i) {
			return getToken(MiniJavaParser.IDENT, i);
		}
		public TerminalNode DOT(int i) {
			return getToken(MiniJavaParser.DOT, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(MiniJavaParser.IDENT); }
		public IdentifierIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdentifierIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdentifierIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdentifierIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierIdentifierContext identifierIdentifier() throws RecognitionException {
		IdentifierIdentifierContext _localctx = new IdentifierIdentifierContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_identifierIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(499); identifierId();
			setState(504);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(500); match(DOT);
					setState(501); ((IdentifierIdentifierContext)_localctx).IDENT = match(IDENT);
					((IdentifierIdentifierContext)_localctx).selectors.add(((IdentifierIdentifierContext)_localctx).IDENT);
					}
					} 
				}
				setState(506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class IdentifierIdContext extends ParserRuleContext {
		public IdIDENTContext idIDENT() {
			return getRuleContext(IdIDENTContext.class,0);
		}
		public IdThisContext idThis() {
			return getRuleContext(IdThisContext.class,0);
		}
		public IdentifierIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdentifierId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdentifierId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdentifierId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierIdContext identifierId() throws RecognitionException {
		IdentifierIdContext _localctx = new IdentifierIdContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_identifierId);
		try {
			setState(509);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(507); idThis();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(508); idIDENT();
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

	public static class IdThisContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(MiniJavaParser.THIS, 0); }
		public IdThisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idThis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdThis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdThis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdThisContext idThis() throws RecognitionException {
		IdThisContext _localctx = new IdThisContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_idThis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511); match(THIS);
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

	public static class IdIDENTContext extends ParserRuleContext {
		public Token name;
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public IdIDENTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idIDENT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdIDENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdIDENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdIDENT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdIDENTContext idIDENT() throws RecognitionException {
		IdIDENTContext _localctx = new IdIDENTContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_idIDENT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513); ((IdIDENTContext)_localctx).name = match(IDENT);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\63\u0206\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\7\2\u0081\n\2\f\2\16\2\u0084\13\2\3\3\3\3\3\3\3\3"+
		"\5\3\u008a\n\3\3\3\3\3\5\3\u008e\n\3\3\3\7\3\u0091\n\3\f\3\16\3\u0094"+
		"\13\3\3\3\7\3\u0097\n\3\f\3\16\3\u009a\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\7\5\u00a6\n\5\f\5\16\5\u00a9\13\5\3\5\7\5\u00ac\n\5\f\5"+
		"\16\5\u00af\13\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\5\b\u00bb\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u00c2\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\5\20\u00d4\n\20\3\20\5\20\u00d7\n"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00df\n\20\f\20\16\20\u00e2\13"+
		"\20\5\20\u00e4\n\20\3\20\3\20\3\20\7\20\u00e9\n\20\f\20\16\20\u00ec\13"+
		"\20\3\20\7\20\u00ef\n\20\f\20\16\20\u00f2\13\20\3\20\3\20\3\20\3\21\5"+
		"\21\u00f8\n\21\3\21\3\21\3\21\3\21\3\21\7\21\u00ff\n\21\f\21\16\21\u0102"+
		"\13\21\5\21\u0104\n\21\3\21\3\21\3\21\7\21\u0109\n\21\f\21\16\21\u010c"+
		"\13\21\3\21\7\21\u010f\n\21\f\21\16\21\u0112\13\21\3\21\3\21\3\22\3\22"+
		"\5\22\u0118\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u012a\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u0133\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\5!\u0168\n!\3"+
		"!\3!\3\"\3\"\3\"\7\"\u016f\n\"\f\"\16\"\u0172\13\"\3#\3#\3#\7#\u0177\n"+
		"#\f#\16#\u017a\13#\3$\3$\3$\7$\u017f\n$\f$\16$\u0182\13$\3%\3%\3%\7%\u0187"+
		"\n%\f%\16%\u018a\13%\3&\3&\3&\7&\u018f\n&\f&\16&\u0192\13&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01a7"+
		"\n\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3-\3-\3"+
		"-\3-\3-\3.\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64"+
		"\3\64\3\65\3\65\3\65\5\65\u01d4\n\65\3\65\3\65\3\65\3\65\3\65\7\65\u01db"+
		"\n\65\f\65\16\65\u01de\13\65\5\65\u01e0\n\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3:\3;\3;\3<\3<\3<\7<\u01f9"+
		"\n<\f<\16<\u01fc\13<\3=\3=\5=\u0200\n=\3>\3>\3?\3?\3?\2@\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|\2\4\3\2\6\7\4\2\3\3\b\b\u020b\2~\3\2\2\2\4\u0085\3\2\2\2"+
		"\6\u009d\3\2\2\2\b\u00a3\3\2\2\2\n\u00b2\3\2\2\2\f\u00b5\3\2\2\2\16\u00ba"+
		"\3\2\2\2\20\u00c1\3\2\2\2\22\u00c3\3\2\2\2\24\u00c7\3\2\2\2\26\u00c9\3"+
		"\2\2\2\30\u00cb\3\2\2\2\32\u00cd\3\2\2\2\34\u00cf\3\2\2\2\36\u00d3\3\2"+
		"\2\2 \u00f7\3\2\2\2\"\u0117\3\2\2\2$\u0119\3\2\2\2&\u0129\3\2\2\2(\u012b"+
		"\3\2\2\2*\u0134\3\2\2\2,\u013a\3\2\2\2.\u013f\3\2\2\2\60\u0147\3\2\2\2"+
		"\62\u014d\3\2\2\2\64\u0153\3\2\2\2\66\u0156\3\2\2\28\u0159\3\2\2\2:\u015c"+
		"\3\2\2\2<\u015f\3\2\2\2>\u0162\3\2\2\2@\u0165\3\2\2\2B\u016b\3\2\2\2D"+
		"\u0173\3\2\2\2F\u017b\3\2\2\2H\u0183\3\2\2\2J\u018b\3\2\2\2L\u01a6\3\2"+
		"\2\2N\u01a8\3\2\2\2P\u01ab\3\2\2\2R\u01ae\3\2\2\2T\u01b3\3\2\2\2V\u01b9"+
		"\3\2\2\2X\u01bb\3\2\2\2Z\u01c0\3\2\2\2\\\u01c4\3\2\2\2^\u01c6\3\2\2\2"+
		"`\u01c8\3\2\2\2b\u01ca\3\2\2\2d\u01cc\3\2\2\2f\u01ce\3\2\2\2h\u01d3\3"+
		"\2\2\2j\u01e3\3\2\2\2l\u01e6\3\2\2\2n\u01e9\3\2\2\2p\u01ec\3\2\2\2r\u01ef"+
		"\3\2\2\2t\u01f3\3\2\2\2v\u01f5\3\2\2\2x\u01ff\3\2\2\2z\u0201\3\2\2\2|"+
		"\u0203\3\2\2\2~\u0082\5\6\4\2\177\u0081\5\4\3\2\u0080\177\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\3\3\2\2\2"+
		"\u0084\u0082\3\2\2\2\u0085\u0086\7\32\2\2\u0086\u0089\7,\2\2\u0087\u0088"+
		"\7\33\2\2\u0088\u008a\7,\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008d\7\26\2\2\u008c\u008e\5 \21\2\u008d\u008c\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008e\u0092\3\2\2\2\u008f\u0091\5\n\6\2\u0090"+
		"\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0098\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\5\36\20\2\u0096"+
		"\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\27\2\2\u009c"+
		"\5\3\2\2\2\u009d\u009e\7\32\2\2\u009e\u009f\7,\2\2\u009f\u00a0\7\26\2"+
		"\2\u00a0\u00a1\5\36\20\2\u00a1\u00a2\7\27\2\2\u00a2\7\3\2\2\2\u00a3\u00a7"+
		"\7\26\2\2\u00a4\u00a6\5\n\6\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2"+
		"\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ad\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00aa\u00ac\5&\24\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00b0\u00b1\7\27\2\2\u00b1\t\3\2\2\2\u00b2\u00b3\5\f\7\2\u00b3\u00b4"+
		"\7\13\2\2\u00b4\13\3\2\2\2\u00b5\u00b6\5\16\b\2\u00b6\u00b7\7,\2\2\u00b7"+
		"\r\3\2\2\2\u00b8\u00bb\5\20\t\2\u00b9\u00bb\5\22\n\2\u00ba\u00b8\3\2\2"+
		"\2\u00ba\u00b9\3\2\2\2\u00bb\17\3\2\2\2\u00bc\u00c2\5\24\13\2\u00bd\u00c2"+
		"\5\26\f\2\u00be\u00c2\5\30\r\2\u00bf\u00c2\5\32\16\2\u00c0\u00c2\5\34"+
		"\17\2\u00c1\u00bc\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\21\3\2\2\2\u00c3\u00c4\5\20\t"+
		"\2\u00c4\u00c5\7\24\2\2\u00c5\u00c6\7\25\2\2\u00c6\23\3\2\2\2\u00c7\u00c8"+
		"\7\34\2\2\u00c8\25\3\2\2\2\u00c9\u00ca\7\36\2\2\u00ca\27\3\2\2\2\u00cb"+
		"\u00cc\7,\2\2\u00cc\31\3\2\2\2\u00cd\u00ce\7\37\2\2\u00ce\33\3\2\2\2\u00cf"+
		"\u00d0\7 \2\2\u00d0\35\3\2\2\2\u00d1\u00d4\7!\2\2\u00d2\u00d4\7\"\2\2"+
		"\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6"+
		"\3\2\2\2\u00d5\u00d7\7#\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d9\5\"\22\2\u00d9\u00da\7,\2\2\u00da\u00e3\7\22"+
		"\2\2\u00db\u00e0\5\f\7\2\u00dc\u00dd\7\f\2\2\u00dd\u00df\5\f\7\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00db\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7\23\2\2\u00e6\u00ea\7"+
		"\26\2\2\u00e7\u00e9\5\n\6\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00f0\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ed\u00ef\5&\24\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f3\u00f4\5@!\2\u00f4\u00f5\7\27\2\2\u00f5\37\3\2\2\2\u00f6\u00f8"+
		"\7!\2\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\7,\2\2\u00fa\u0103\7\22\2\2\u00fb\u0100\5\f\7\2\u00fc\u00fd\7\f"+
		"\2\2\u00fd\u00ff\5\f\7\2\u00fe\u00fc\3\2\2\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0103\u00fb\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\7\23\2\2\u0106\u010a\7\26\2\2\u0107\u0109\5\n\6\2\u0108\u0107\3"+
		"\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u0110\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010f\5&\24\2\u010e\u010d\3\2"+
		"\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7\27\2\2\u0114!\3\2\2\2"+
		"\u0115\u0118\5$\23\2\u0116\u0118\5\16\b\2\u0117\u0115\3\2\2\2\u0117\u0116"+
		"\3\2\2\2\u0118#\3\2\2\2\u0119\u011a\7\35\2\2\u011a%\3\2\2\2\u011b\u012a"+
		"\5\b\5\2\u011c\u012a\5(\25\2\u011d\u012a\5*\26\2\u011e\u012a\5,\27\2\u011f"+
		"\u012a\5.\30\2\u0120\u012a\5\62\32\2\u0121\u012a\5\60\31\2\u0122\u012a"+
		"\5\64\33\2\u0123\u012a\5@!\2\u0124\u012a\5\66\34\2\u0125\u012a\58\35\2"+
		"\u0126\u012a\5:\36\2\u0127\u012a\5<\37\2\u0128\u012a\5> \2\u0129\u011b"+
		"\3\2\2\2\u0129\u011c\3\2\2\2\u0129\u011d\3\2\2\2\u0129\u011e\3\2\2\2\u0129"+
		"\u011f\3\2\2\2\u0129\u0120\3\2\2\2\u0129\u0121\3\2\2\2\u0129\u0122\3\2"+
		"\2\2\u0129\u0123\3\2\2\2\u0129\u0124\3\2\2\2\u0129\u0125\3\2\2\2\u0129"+
		"\u0126\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a\'\3\2\2\2"+
		"\u012b\u012c\7%\2\2\u012c\u012d\7\22\2\2\u012d\u012e\5B\"\2\u012e\u012f"+
		"\7\23\2\2\u012f\u0132\5\b\5\2\u0130\u0131\7&\2\2\u0131\u0133\5\b\5\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133)\3\2\2\2\u0134\u0135\7\'\2\2"+
		"\u0135\u0136\7\22\2\2\u0136\u0137\5B\"\2\u0137\u0138\7\23\2\2\u0138\u0139"+
		"\5&\24\2\u0139+\3\2\2\2\u013a\u013b\5t;\2\u013b\u013c\7\r\2\2\u013c\u013d"+
		"\5B\"\2\u013d\u013e\7\13\2\2\u013e-\3\2\2\2\u013f\u0140\5t;\2\u0140\u0141"+
		"\7\24\2\2\u0141\u0142\5B\"\2\u0142\u0143\7\25\2\2\u0143\u0144\7\r\2\2"+
		"\u0144\u0145\5B\"\2\u0145\u0146\7\13\2\2\u0146/\3\2\2\2\u0147\u0148\7"+
		"(\2\2\u0148\u0149\7\22\2\2\u0149\u014a\5B\"\2\u014a\u014b\7\23\2\2\u014b"+
		"\u014c\7\13\2\2\u014c\61\3\2\2\2\u014d\u014e\7)\2\2\u014e\u014f\7\22\2"+
		"\2\u014f\u0150\5B\"\2\u0150\u0151\7\23\2\2\u0151\u0152\7\13\2\2\u0152"+
		"\63\3\2\2\2\u0153\u0154\5h\65\2\u0154\u0155\7\13\2\2\u0155\65\3\2\2\2"+
		"\u0156\u0157\5j\66\2\u0157\u0158\7\13\2\2\u0158\67\3\2\2\2\u0159\u015a"+
		"\5l\67\2\u015a\u015b\7\13\2\2\u015b9\3\2\2\2\u015c\u015d\5n8\2\u015d\u015e"+
		"\7\13\2\2\u015e;\3\2\2\2\u015f\u0160\5p9\2\u0160\u0161\7\13\2\2\u0161"+
		"=\3\2\2\2\u0162\u0163\5r:\2\u0163\u0164\7\13\2\2\u0164?\3\2\2\2\u0165"+
		"\u0167\7*\2\2\u0166\u0168\5B\"\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2"+
		"\2\u0168\u0169\3\2\2\2\u0169\u016a\7\13\2\2\u016aA\3\2\2\2\u016b\u0170"+
		"\5D#\2\u016c\u016d\7\4\2\2\u016d\u016f\5D#\2\u016e\u016c\3\2\2\2\u016f"+
		"\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171C\3\2\2\2"+
		"\u0172\u0170\3\2\2\2\u0173\u0178\5F$\2\u0174\u0175\7\5\2\2\u0175\u0177"+
		"\5F$\2\u0176\u0174\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179E\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u0180\5H%\2\u017c"+
		"\u017d\t\2\2\2\u017d\u017f\5H%\2\u017e\u017c\3\2\2\2\u017f\u0182\3\2\2"+
		"\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181G\3\2\2\2\u0182\u0180"+
		"\3\2\2\2\u0183\u0188\5J&\2\u0184\u0185\t\3\2\2\u0185\u0187\5J&\2\u0186"+
		"\u0184\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2"+
		"\2\2\u0189I\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u0190\5L\'\2\u018c\u018d"+
		"\7\t\2\2\u018d\u018f\5L\'\2\u018e\u018c\3\2\2\2\u018f\u0192\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191K\3\2\2\2\u0192\u0190\3\2\2\2"+
		"\u0193\u01a7\5N(\2\u0194\u01a7\5P)\2\u0195\u01a7\5R*\2\u0196\u01a7\5T"+
		"+\2\u0197\u01a7\5V,\2\u0198\u01a7\5X-\2\u0199\u01a7\5h\65\2\u019a\u01a7"+
		"\5Z.\2\u019b\u01a7\5\\/\2\u019c\u01a7\5^\60\2\u019d\u01a7\5`\61\2\u019e"+
		"\u01a7\5b\62\2\u019f\u01a7\5d\63\2\u01a0\u01a7\5j\66\2\u01a1\u01a7\5l"+
		"\67\2\u01a2\u01a7\5n8\2\u01a3\u01a7\5p9\2\u01a4\u01a7\5r:\2\u01a5\u01a7"+
		"\5f\64\2\u01a6\u0193\3\2\2\2\u01a6\u0194\3\2\2\2\u01a6\u0195\3\2\2\2\u01a6"+
		"\u0196\3\2\2\2\u01a6\u0197\3\2\2\2\u01a6\u0198\3\2\2\2\u01a6\u0199\3\2"+
		"\2\2\u01a6\u019a\3\2\2\2\u01a6\u019b\3\2\2\2\u01a6\u019c\3\2\2\2\u01a6"+
		"\u019d\3\2\2\2\u01a6\u019e\3\2\2\2\u01a6\u019f\3\2\2\2\u01a6\u01a0\3\2"+
		"\2\2\u01a6\u01a1\3\2\2\2\u01a6\u01a2\3\2\2\2\u01a6\u01a3\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7M\3\2\2\2\u01a8\u01a9\7\3\2\2"+
		"\u01a9\u01aa\5L\'\2\u01aaO\3\2\2\2\u01ab\u01ac\7\n\2\2\u01ac\u01ad\5L"+
		"\'\2\u01adQ\3\2\2\2\u01ae\u01af\7+\2\2\u01af\u01b0\7,\2\2\u01b0\u01b1"+
		"\7\22\2\2\u01b1\u01b2\7\23\2\2\u01b2S\3\2\2\2\u01b3\u01b4\7+\2\2\u01b4"+
		"\u01b5\7\36\2\2\u01b5\u01b6\7\24\2\2\u01b6\u01b7\5B\"\2\u01b7\u01b8\7"+
		"\25\2\2\u01b8U\3\2\2\2\u01b9\u01ba\5t;\2\u01baW\3\2\2\2\u01bb\u01bc\5"+
		"t;\2\u01bc\u01bd\7\24\2\2\u01bd\u01be\5B\"\2\u01be\u01bf\7\25\2\2\u01bf"+
		"Y\3\2\2\2\u01c0\u01c1\7\22\2\2\u01c1\u01c2\5B\"\2\u01c2\u01c3\7\23\2\2"+
		"\u01c3[\3\2\2\2\u01c4\u01c5\7\30\2\2\u01c5]\3\2\2\2\u01c6\u01c7\7\31\2"+
		"\2\u01c7_\3\2\2\2\u01c8\u01c9\7-\2\2\u01c9a\3\2\2\2\u01ca\u01cb\7.\2\2"+
		"\u01cbc\3\2\2\2\u01cc\u01cd\7\60\2\2\u01cde\3\2\2\2\u01ce\u01cf\7/\2\2"+
		"\u01cfg\3\2\2\2\u01d0\u01d1\5t;\2\u01d1\u01d2\7\16\2\2\u01d2\u01d4\3\2"+
		"\2\2\u01d3\u01d0\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"\u01d6\7,\2\2\u01d6\u01df\7\22\2\2\u01d7\u01dc\5B\"\2\u01d8\u01d9\7\f"+
		"\2\2\u01d9\u01db\5B\"\2\u01da\u01d8\3\2\2\2\u01db\u01de\3\2\2\2\u01dc"+
		"\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2"+
		"\2\2\u01df\u01d7\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"\u01e2\7\23\2\2\u01e2i\3\2\2\2\u01e3\u01e4\5t;\2\u01e4\u01e5\7\17\2\2"+
		"\u01e5k\3\2\2\2\u01e6\u01e7\5t;\2\u01e7\u01e8\7\20\2\2\u01e8m\3\2\2\2"+
		"\u01e9\u01ea\7\17\2\2\u01ea\u01eb\5t;\2\u01ebo\3\2\2\2\u01ec\u01ed\7\20"+
		"\2\2\u01ed\u01ee\5t;\2\u01eeq\3\2\2\2\u01ef\u01f0\5t;\2\u01f0\u01f1\7"+
		"\21\2\2\u01f1\u01f2\7-\2\2\u01f2s\3\2\2\2\u01f3\u01f4\5v<\2\u01f4u\3\2"+
		"\2\2\u01f5\u01fa\5x=\2\u01f6\u01f7\7\16\2\2\u01f7\u01f9\7,\2\2\u01f8\u01f6"+
		"\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"w\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u0200\5z>\2\u01fe\u0200\5|?\2\u01ff"+
		"\u01fd\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200y\3\2\2\2\u0201\u0202\7$\2\2\u0202"+
		"{\3\2\2\2\u0203\u0204\7,\2\2\u0204}\3\2\2\2%\u0082\u0089\u008d\u0092\u0098"+
		"\u00a7\u00ad\u00ba\u00c1\u00d3\u00d6\u00e0\u00e3\u00ea\u00f0\u00f7\u0100"+
		"\u0103\u010a\u0110\u0117\u0129\u0132\u0167\u0170\u0178\u0180\u0188\u0190"+
		"\u01a6\u01d3\u01dc\u01df\u01fa\u01ff";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}