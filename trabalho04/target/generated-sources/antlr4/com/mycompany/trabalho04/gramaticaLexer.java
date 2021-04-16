// Generated from com\mycompany\trabalho04\gramatica.g4 by ANTLR 4.9.1
package com.mycompany.trabalho04;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "Letra", "LetraMinuscula", 
			"Digito", "INFORMACOES", "NOME", "TELEFONE", "EMAIL", "HABILIDADES", 
			"PROJETOS", "MONTA_PORTFOLIO", "FIM_PORTFOLIO", "NUM_INT", "NUM_REAL", 
			"HABILIDADE", "PROJETO", "CADEIA", "ErroCadeiaNaoFechada", "ESC_SEQ", 
			"ABREPAR", "FECHAPAR", "ABRECHAVE", "FECHACHAVE", "VIRGULA", "ATRIUICAO", 
			"ErroComent", "Coment", "WS", "ErroComentNaoFechado", "Erro"
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


	public gramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u0135\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\6\23\u00cd"+
		"\n\23\r\23\16\23\u00ce\3\24\6\24\u00d2\n\24\r\24\16\24\u00d3\3\24\3\24"+
		"\6\24\u00d8\n\24\r\24\16\24\u00d9\3\25\3\25\3\25\3\25\7\25\u00e0\n\25"+
		"\f\25\16\25\u00e3\13\25\3\26\3\26\3\26\7\26\u00e8\n\26\f\26\16\26\u00eb"+
		"\13\26\3\27\3\27\3\27\7\27\u00f0\n\27\f\27\16\27\u00f3\13\27\5\27\u00f5"+
		"\n\27\3\27\3\27\3\30\3\30\3\30\7\30\u00fc\n\30\f\30\16\30\u00ff\13\30"+
		"\3\30\5\30\u0102\n\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \7 \u0116\n \f \16 \u0119\13 \3 \3"+
		" \3 \3!\3!\7!\u0120\n!\f!\16!\u0123\13!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"#\3#\7#\u012f\n#\f#\16#\u0132\13#\3$\3$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\2\21\2\23\2\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+"+
		"\24-\25/\26\61\2\63\27\65\30\67\319\32;\33=\34?\35A\36C\37E G!\3\2\b\4"+
		"\2C\\c|\5\2\f\f$$^^\4\2$$^^\3\2\f\f\5\2\13\f\17\17\"\"\4\2\f\f\177\177"+
		"\2\u013f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5N\3\2\2\2\7W\3\2\2\2\t]\3\2"+
		"\2\2\13b\3\2\2\2\rk\3\2\2\2\17r\3\2\2\2\21t\3\2\2\2\23v\3\2\2\2\25x\3"+
		"\2\2\2\27\u0084\3\2\2\2\31\u0089\3\2\2\2\33\u0092\3\2\2\2\35\u0098\3\2"+
		"\2\2\37\u00a4\3\2\2\2!\u00ad\3\2\2\2#\u00bd\3\2\2\2%\u00cc\3\2\2\2\'\u00d1"+
		"\3\2\2\2)\u00db\3\2\2\2+\u00e4\3\2\2\2-\u00ec\3\2\2\2/\u00f8\3\2\2\2\61"+
		"\u0103\3\2\2\2\63\u0106\3\2\2\2\65\u0108\3\2\2\2\67\u010a\3\2\2\29\u010c"+
		"\3\2\2\2;\u010e\3\2\2\2=\u0110\3\2\2\2?\u0113\3\2\2\2A\u011d\3\2\2\2C"+
		"\u0128\3\2\2\2E\u012c\3\2\2\2G\u0133\3\2\2\2IJ\7P\2\2JK\7q\2\2KL\7o\2"+
		"\2LM\7g\2\2M\4\3\2\2\2NO\7V\2\2OP\7g\2\2PQ\7n\2\2QR\7g\2\2RS\7h\2\2ST"+
		"\7q\2\2TU\7p\2\2UV\7g\2\2V\6\3\2\2\2WX\7G\2\2XY\7o\2\2YZ\7c\2\2Z[\7k\2"+
		"\2[\\\7n\2\2\\\b\3\2\2\2]^\7U\2\2^_\7k\2\2_`\7v\2\2`a\7g\2\2a\n\3\2\2"+
		"\2bc\7N\2\2cd\7k\2\2de\7p\2\2ef\7m\2\2fg\7g\2\2gh\7f\2\2hi\7k\2\2ij\7"+
		"p\2\2j\f\3\2\2\2kl\7I\2\2lm\7k\2\2mn\7v\2\2no\7j\2\2op\7w\2\2pq\7d\2\2"+
		"q\16\3\2\2\2rs\t\2\2\2s\20\3\2\2\2tu\4c|\2u\22\3\2\2\2vw\4\62;\2w\24\3"+
		"\2\2\2xy\7k\2\2yz\7p\2\2z{\7h\2\2{|\7q\2\2|}\7t\2\2}~\7o\2\2~\177\7c\2"+
		"\2\177\u0080\7e\2\2\u0080\u0081\7q\2\2\u0081\u0082\7g\2\2\u0082\u0083"+
		"\7u\2\2\u0083\26\3\2\2\2\u0084\u0085\7p\2\2\u0085\u0086\7q\2\2\u0086\u0087"+
		"\7o\2\2\u0087\u0088\7g\2\2\u0088\30\3\2\2\2\u0089\u008a\7v\2\2\u008a\u008b"+
		"\7g\2\2\u008b\u008c\7n\2\2\u008c\u008d\7g\2\2\u008d\u008e\7h\2\2\u008e"+
		"\u008f\7q\2\2\u008f\u0090\7p\2\2\u0090\u0091\7g\2\2\u0091\32\3\2\2\2\u0092"+
		"\u0093\7g\2\2\u0093\u0094\7o\2\2\u0094\u0095\7c\2\2\u0095\u0096\7k\2\2"+
		"\u0096\u0097\7n\2\2\u0097\34\3\2\2\2\u0098\u0099\7j\2\2\u0099\u009a\7"+
		"c\2\2\u009a\u009b\7d\2\2\u009b\u009c\7k\2\2\u009c\u009d\7n\2\2\u009d\u009e"+
		"\7k\2\2\u009e\u009f\7f\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7f\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2\u00a3\7u\2\2\u00a3\36\3\2\2\2\u00a4\u00a5\7r\2\2\u00a5"+
		"\u00a6\7t\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7l\2\2\u00a8\u00a9\7g\2\2"+
		"\u00a9\u00aa\7v\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7u\2\2\u00ac \3\2\2"+
		"\2\u00ad\u00ae\7o\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1"+
		"\7v\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7a\2\2\u00b3\u00b4\7r\2\2\u00b4"+
		"\u00b5\7q\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7h\2\2"+
		"\u00b8\u00b9\7q\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc"+
		"\7q\2\2\u00bc\"\3\2\2\2\u00bd\u00be\7h\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0"+
		"\7o\2\2\u00c0\u00c1\7a\2\2\u00c1\u00c2\7r\2\2\u00c2\u00c3\7q\2\2\u00c3"+
		"\u00c4\7t\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7h\2\2\u00c6\u00c7\7q\2\2"+
		"\u00c7\u00c8\7n\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7q\2\2\u00ca$\3\2\2"+
		"\2\u00cb\u00cd\4\62;\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf&\3\2\2\2\u00d0\u00d2\4\62;\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\7\60\2\2\u00d6\u00d8\4\62;\2\u00d7"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da(\3\2\2\2\u00db\u00e1\5\21\t\2\u00dc\u00e0\7a\2\2\u00dd\u00e0"+
		"\5\17\b\2\u00de\u00e0\5\23\n\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2"+
		"\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2*\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e9\7a\2\2\u00e5\u00e8"+
		"\5\17\b\2\u00e6\u00e8\5\23\n\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2"+
		"\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea,\3"+
		"\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00f4\7$\2\2\u00ed\u00f5\5\61\31\2\u00ee"+
		"\u00f0\n\3\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00ed\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7$"+
		"\2\2\u00f7.\3\2\2\2\u00f8\u0101\7$\2\2\u00f9\u0102\5\61\31\2\u00fa\u00fc"+
		"\n\4\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0102\7\f"+
		"\2\2\u0101\u00f9\3\2\2\2\u0101\u00fd\3\2\2\2\u0102\60\3\2\2\2\u0103\u0104"+
		"\7^\2\2\u0104\u0105\7$\2\2\u0105\62\3\2\2\2\u0106\u0107\7*\2\2\u0107\64"+
		"\3\2\2\2\u0108\u0109\7+\2\2\u0109\66\3\2\2\2\u010a\u010b\7}\2\2\u010b"+
		"8\3\2\2\2\u010c\u010d\7\177\2\2\u010d:\3\2\2\2\u010e\u010f\7.\2\2\u010f"+
		"<\3\2\2\2\u0110\u0111\7>\2\2\u0111\u0112\7/\2\2\u0112>\3\2\2\2\u0113\u0117"+
		"\7}\2\2\u0114\u0116\n\5\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u011a\u011b\7\177\2\2\u011b\u011c\7\177\2\2\u011c@\3\2\2\2\u011d"+
		"\u0121\7}\2\2\u011e\u0120\n\5\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2"+
		"\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0124\u0125\7\177\2\2\u0125\u0126\3\2\2\2\u0126\u0127\b"+
		"!\2\2\u0127B\3\2\2\2\u0128\u0129\t\6\2\2\u0129\u012a\3\2\2\2\u012a\u012b"+
		"\b\"\2\2\u012bD\3\2\2\2\u012c\u0130\7}\2\2\u012d\u012f\n\7\2\2\u012e\u012d"+
		"\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"F\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\13\2\2\2\u0134H\3\2\2\2\21\2"+
		"\u00ce\u00d3\u00d9\u00df\u00e1\u00e7\u00e9\u00f1\u00f4\u00fd\u0101\u0117"+
		"\u0121\u0130\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}