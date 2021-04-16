package com.mycompany.trabalho04;

import com.mycompany.trabalho04.gramaticaLexer;
import com.mycompany.trabalho04.gramaticaParser;
import com.mycompany.trabalho04.gramaticaParser.ProgramaContext;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author caiocesardemorais
 */
public class Principal {
    public static void main(String args[]) throws IOException{      
        /* Recebemos o diretorio para salvar os arquivos do portfolio */
        try(PrintWriter pw = new PrintWriter(new File(args[1] + "/index.html"))) { 
            /* Pegamos o argumento na posição zero passado na linha 
               de comando, ou seja, o caminho para nosso arquivo de
               entrada que sera processado pela nossa gramatica e
               criamos nosso CharStream. */
            CharStream cs = CharStreams.fromFileName(args[0]);
            
            /* Instanciamos nosso analisador lexico passando nosso
               arquivo de entrada para o construtor. */
            gramaticaLexer lexer = new gramaticaLexer(cs);
                    
            /* Pegamos nossos tokens */
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            /* Criamos nosso parser */
            gramaticaParser parser = new gramaticaParser(tokens);
            
            /* Criamos nossa classe de erros e setamos ela para ser
               usada no nosso parser */
            MyCustomErrorListener mcel = new MyCustomErrorListener();
            parser.removeErrorListeners();
            parser.addErrorListener(mcel);
                      
            /* Iniciamos o parser e fazemos a verificação semantica */
            ProgramaContext arvore = parser.programa();
            Semantico as = new Semantico();
            as.visitPrograma(arvore);
            
            /* Vamos imprimir nossa lista de elementos declarados, mas nao utilizados */
            ArrayList<String> declaracoesNaoUsadas = as.declaracoesNaoUsadas;
            for(String elemento : declaracoesNaoUsadas){
                System.out.println("Declarado '" + elemento + "' mas não utilizado!");
            }
           
            /* Geração de código HTML + CSS */
            GeradorHTML gHTML = new GeradorHTML();
            gHTML.visitPrograma(arvore);
            pw.println(gHTML.saida.toString());
            
            System.out.println("Fim da geração.");                       
            
        }
    }
}
