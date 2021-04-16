package com.mycompany.trabalho04;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author caiocesardemorais
 */

/* Codigo da nossa tabela de simbolos */
public class TabelaDeSimbolos {
   
    class EntradaTabelaDeSimbolos {
        String nome;
        TabelaDeSimbolos subTabela;

        private EntradaTabelaDeSimbolos(String nome) {
            this.nome = nome;
        }
    }
     
    private final Map<String, EntradaTabelaDeSimbolos> tabela;
    
    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }
    
    public void adicionar(String nome) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome));
    }
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
}
