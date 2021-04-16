// Generated from com\mycompany\trabalho04\gramatica.g4 by ANTLR 4.9.1
package com.mycompany.trabalho04;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INFORMACOES=7, NOME=8, 
		TELEFONE=9, EMAIL=10, HABILIDADES=11, PROJETOS=12, MONTA_PORTFOLIO=13, 
		FIM_PORTFOLIO=14, NUM_INT=15, NUM_REAL=16, HABILIDADE=17, PROJETO=18, 
		CADEIA=19, ErroCadeiaNaoFechada=20, ABREPAR=21, FECHAPAR=22, ABRECHAVE=23, 
		FECHACHAVE=24, VIRGULA=25, ATRIUICAO=26, ErroComent=27, Coment=28, WS=29, 
		ErroComentNaoFechado=30, Erro=31;
	public static final int
		RULE_programa = 0, RULE_informacoes = 1, RULE_infosPessoais = 2, RULE_habilidades = 3, 
		RULE_projetos = 4, RULE_corpo = 5, RULE_cmd = 6, RULE_cmdAtribuicao = 7, 
		RULE_cmdProjetos = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "informacoes", "infosPessoais", "habilidades", "projetos", 
			"corpo", "cmd", "cmdAtribuicao", "cmdProjetos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Nome'", "'Telefone'", "'Email'", "'Site'", "'Linkedin'", "'Github'", 
			"'informacoes'", "'nome'", "'telefone'", "'email'", "'habilidades'", 
			"'projetos'", "'monta_portfolio'", "'fim_portfolio'", null, null, null, 
			null, null, null, "'('", "')'", "'{'", "'}'", "','", "'<-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "INFORMACOES", "NOME", "TELEFONE", 
			"EMAIL", "HABILIDADES", "PROJETOS", "MONTA_PORTFOLIO", "FIM_PORTFOLIO", 
			"NUM_INT", "NUM_REAL", "HABILIDADE", "PROJETO", "CADEIA", "ErroCadeiaNaoFechada", 
			"ABREPAR", "FECHAPAR", "ABRECHAVE", "FECHACHAVE", "VIRGULA", "ATRIUICAO", 
			"ErroComent", "Coment", "WS", "ErroComentNaoFechado", "Erro"
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
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public InformacoesContext informacoes() {
			return getRuleContext(InformacoesContext.class,0);
		}
		public TerminalNode MONTA_PORTFOLIO() { return getToken(gramaticaParser.MONTA_PORTFOLIO, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode FIM_PORTFOLIO() { return getToken(gramaticaParser.FIM_PORTFOLIO, 0); }
		public TerminalNode EOF() { return getToken(gramaticaParser.EOF, 0); }
		public HabilidadesContext habilidades() {
			return getRuleContext(HabilidadesContext.class,0);
		}
		public ProjetosContext projetos() {
			return getRuleContext(ProjetosContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			informacoes();
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HABILIDADES) {
				{
				setState(19);
				habilidades();
				setState(20);
				projetos();
				}
			}

			setState(24);
			match(MONTA_PORTFOLIO);
			setState(25);
			corpo();
			setState(26);
			match(FIM_PORTFOLIO);
			setState(27);
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

	public static class InformacoesContext extends ParserRuleContext {
		public InfosPessoaisContext infosPessoais;
		public List<InfosPessoaisContext> infos = new ArrayList<InfosPessoaisContext>();
		public TerminalNode INFORMACOES() { return getToken(gramaticaParser.INFORMACOES, 0); }
		public List<InfosPessoaisContext> infosPessoais() {
			return getRuleContexts(InfosPessoaisContext.class);
		}
		public InfosPessoaisContext infosPessoais(int i) {
			return getRuleContext(InfosPessoaisContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(gramaticaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(gramaticaParser.VIRGULA, i);
		}
		public InformacoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_informacoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterInformacoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitInformacoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitInformacoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InformacoesContext informacoes() throws RecognitionException {
		InformacoesContext _localctx = new InformacoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_informacoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(INFORMACOES);
			setState(30);
			((InformacoesContext)_localctx).infosPessoais = infosPessoais();
			((InformacoesContext)_localctx).infos.add(((InformacoesContext)_localctx).infosPessoais);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(31);
				match(VIRGULA);
				setState(32);
				((InformacoesContext)_localctx).infosPessoais = infosPessoais();
				((InformacoesContext)_localctx).infos.add(((InformacoesContext)_localctx).infosPessoais);
				}
				}
				setState(37);
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

	public static class InfosPessoaisContext extends ParserRuleContext {
		public InfosPessoaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infosPessoais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterInfosPessoais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitInfosPessoais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitInfosPessoais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfosPessoaisContext infosPessoais() throws RecognitionException {
		InfosPessoaisContext _localctx = new InfosPessoaisContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_infosPessoais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
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

	public static class HabilidadesContext extends ParserRuleContext {
		public Token HABILIDADE;
		public List<Token> habs = new ArrayList<Token>();
		public TerminalNode HABILIDADES() { return getToken(gramaticaParser.HABILIDADES, 0); }
		public List<TerminalNode> HABILIDADE() { return getTokens(gramaticaParser.HABILIDADE); }
		public TerminalNode HABILIDADE(int i) {
			return getToken(gramaticaParser.HABILIDADE, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(gramaticaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(gramaticaParser.VIRGULA, i);
		}
		public HabilidadesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_habilidades; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterHabilidades(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitHabilidades(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitHabilidades(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HabilidadesContext habilidades() throws RecognitionException {
		HabilidadesContext _localctx = new HabilidadesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_habilidades);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(HABILIDADES);
			setState(41);
			((HabilidadesContext)_localctx).HABILIDADE = match(HABILIDADE);
			((HabilidadesContext)_localctx).habs.add(((HabilidadesContext)_localctx).HABILIDADE);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(42);
				match(VIRGULA);
				setState(43);
				((HabilidadesContext)_localctx).HABILIDADE = match(HABILIDADE);
				((HabilidadesContext)_localctx).habs.add(((HabilidadesContext)_localctx).HABILIDADE);
				}
				}
				setState(48);
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

	public static class ProjetosContext extends ParserRuleContext {
		public Token PROJETO;
		public List<Token> projs = new ArrayList<Token>();
		public TerminalNode PROJETOS() { return getToken(gramaticaParser.PROJETOS, 0); }
		public List<TerminalNode> PROJETO() { return getTokens(gramaticaParser.PROJETO); }
		public TerminalNode PROJETO(int i) {
			return getToken(gramaticaParser.PROJETO, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(gramaticaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(gramaticaParser.VIRGULA, i);
		}
		public ProjetosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projetos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterProjetos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitProjetos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitProjetos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjetosContext projetos() throws RecognitionException {
		ProjetosContext _localctx = new ProjetosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_projetos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(PROJETOS);
			setState(50);
			((ProjetosContext)_localctx).PROJETO = match(PROJETO);
			((ProjetosContext)_localctx).projs.add(((ProjetosContext)_localctx).PROJETO);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(51);
				match(VIRGULA);
				setState(52);
				((ProjetosContext)_localctx).PROJETO = match(PROJETO);
				((ProjetosContext)_localctx).projs.add(((ProjetosContext)_localctx).PROJETO);
				}
				}
				setState(57);
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

	public static class CorpoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << PROJETO))) != 0)) {
				{
				{
				setState(58);
				cmd();
				}
				}
				setState(63);
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

	public static class CmdContext extends ParserRuleContext {
		public CmdAtribuicaoContext cmdAtribuicao() {
			return getRuleContext(CmdAtribuicaoContext.class,0);
		}
		public CmdProjetosContext cmdProjetos() {
			return getRuleContext(CmdProjetosContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmd);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				cmdAtribuicao();
				}
				break;
			case PROJETO:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				cmdProjetos();
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

	public static class CmdAtribuicaoContext extends ParserRuleContext {
		public InfosPessoaisContext infosPessoais() {
			return getRuleContext(InfosPessoaisContext.class,0);
		}
		public TerminalNode ATRIUICAO() { return getToken(gramaticaParser.ATRIUICAO, 0); }
		public TerminalNode CADEIA() { return getToken(gramaticaParser.CADEIA, 0); }
		public CmdAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCmdAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCmdAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCmdAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdAtribuicaoContext cmdAtribuicao() throws RecognitionException {
		CmdAtribuicaoContext _localctx = new CmdAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdAtribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			infosPessoais();
			setState(69);
			match(ATRIUICAO);
			setState(70);
			match(CADEIA);
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

	public static class CmdProjetosContext extends ParserRuleContext {
		public TerminalNode PROJETO() { return getToken(gramaticaParser.PROJETO, 0); }
		public TerminalNode ABREPAR() { return getToken(gramaticaParser.ABREPAR, 0); }
		public TerminalNode CADEIA() { return getToken(gramaticaParser.CADEIA, 0); }
		public TerminalNode FECHAPAR() { return getToken(gramaticaParser.FECHAPAR, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(gramaticaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(gramaticaParser.VIRGULA, i);
		}
		public List<TerminalNode> HABILIDADE() { return getTokens(gramaticaParser.HABILIDADE); }
		public TerminalNode HABILIDADE(int i) {
			return getToken(gramaticaParser.HABILIDADE, i);
		}
		public CmdProjetosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdProjetos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCmdProjetos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCmdProjetos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCmdProjetos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdProjetosContext cmdProjetos() throws RecognitionException {
		CmdProjetosContext _localctx = new CmdProjetosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdProjetos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(PROJETO);
			setState(73);
			match(ABREPAR);
			setState(74);
			match(CADEIA);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(75);
				match(VIRGULA);
				setState(76);
				match(HABILIDADE);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(FECHAPAR);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!W\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2\3"+
		"\2\5\2\31\n\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3$\n\3\f\3\16\3\'"+
		"\13\3\3\4\3\4\3\5\3\5\3\5\3\5\7\5/\n\5\f\5\16\5\62\13\5\3\6\3\6\3\6\3"+
		"\6\7\68\n\6\f\6\16\6;\13\6\3\7\7\7>\n\7\f\7\16\7A\13\7\3\b\3\b\5\bE\n"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\nP\n\n\f\n\16\nS\13\n\3\n\3\n"+
		"\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\3\3\2\3\b\2T\2\24\3\2\2\2\4\37\3\2"+
		"\2\2\6(\3\2\2\2\b*\3\2\2\2\n\63\3\2\2\2\f?\3\2\2\2\16D\3\2\2\2\20F\3\2"+
		"\2\2\22J\3\2\2\2\24\30\5\4\3\2\25\26\5\b\5\2\26\27\5\n\6\2\27\31\3\2\2"+
		"\2\30\25\3\2\2\2\30\31\3\2\2\2\31\32\3\2\2\2\32\33\7\17\2\2\33\34\5\f"+
		"\7\2\34\35\7\20\2\2\35\36\7\2\2\3\36\3\3\2\2\2\37 \7\t\2\2 %\5\6\4\2!"+
		"\"\7\33\2\2\"$\5\6\4\2#!\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\5\3\2"+
		"\2\2\'%\3\2\2\2()\t\2\2\2)\7\3\2\2\2*+\7\r\2\2+\60\7\23\2\2,-\7\33\2\2"+
		"-/\7\23\2\2.,\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\t\3\2\2"+
		"\2\62\60\3\2\2\2\63\64\7\16\2\2\649\7\24\2\2\65\66\7\33\2\2\668\7\24\2"+
		"\2\67\65\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\13\3\2\2\2;9\3\2\2\2"+
		"<>\5\16\b\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\r\3\2\2\2A?\3\2\2"+
		"\2BE\5\20\t\2CE\5\22\n\2DB\3\2\2\2DC\3\2\2\2E\17\3\2\2\2FG\5\6\4\2GH\7"+
		"\34\2\2HI\7\25\2\2I\21\3\2\2\2JK\7\24\2\2KL\7\27\2\2LQ\7\25\2\2MN\7\33"+
		"\2\2NP\7\23\2\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3"+
		"\2\2\2TU\7\30\2\2U\23\3\2\2\2\t\30%\609?DQ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}