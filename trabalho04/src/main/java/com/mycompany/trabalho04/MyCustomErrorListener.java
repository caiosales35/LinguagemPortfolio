package com.mycompany.trabalho04;

import java.util.BitSet;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

/* Fazemos o tratamento de erros de forma customizada */
public class MyCustomErrorListener implements ANTLRErrorListener {
    String message1;
    
    public MyCustomErrorListener() {
    }
    
    @Override
    public void	reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
    }
    
    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
    }
    
    /* Tratamento de erro customizado */
    @Override
    public void	syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        Token t = (Token) offendingSymbol;
        /* Vamos imprimir nossos erros relacionados a gramatica no terminal, exibindo a linha do erro. */
        System.out.println("Erro inexperado! Linha " + line + ": '" + t.getText() + "'");
    }
}