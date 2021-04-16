package com.mycompany.trabalho04;

import java.util.ArrayList;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author caiocesardemorais
 */

/* Analises semanticas realizadas:
    - declarações duplicadas (projetos, habilidades e informacoes pessoais)
    - declarações não utilizadas (projetos, habilidades e informacoes pessoais)
    - atribuição à informação pessoal não declarada  
    - uso de projeto não declarado
    - uso de habilidade não declarada
    - projeto sem habilidade relacionada
*/

public class Semantico extends gramaticaBaseVisitor<Void>{
    TabelaDeSimbolos tabela;
    ArrayList<String> declaracoesNaoUsadas;

    @Override
    public Void visitPrograma(gramaticaParser.ProgramaContext ctx) {
        /* Tabela de Simbolos para armazenar elementos declarados */
        this.tabela = new TabelaDeSimbolos();
        /* Lista para armazenar elementos que foram declarados, mas nunca
           utilizados no escopo do programa. */
        this.declaracoesNaoUsadas = new ArrayList<>();
        return super.visitPrograma(ctx);
    }
    
    /* Verificamos se as informações pessoais já foram declaradas anteriormente;
       caso sim, mostramos um erro; caso não, adicionamos na lista declaracoesNaoUsadas. */
    @Override
    public Void visitInformacoes(gramaticaParser.InformacoesContext ctx) {
        for(gramaticaParser.InfosPessoaisContext i : ctx.infos){
            if(tabela.existe(i.getText())){
                System.out.println("Informação pessoal '" + i.getText() + "' já declarada anteriormente! Linha: " + ctx.start.getLine());
            }else{
                tabela.adicionar(i.getText());
                declaracoesNaoUsadas.add(i.getText());
            }
        }
        return super.visitInformacoes(ctx);
    }
    
    /* Verificamos se as habilidades já foram declaradas anteriormente;
       caso sim, mostramos um erro; caso não, adicionamos na tabela de simbolos
       e na lista declaracoesNaoUsadas. */
    @Override
    public Void visitHabilidades(gramaticaParser.HabilidadesContext ctx) {
        for(Token h : ctx.habs){
            if(tabela.existe(h.getText())){
                System.out.println("Habilidade '" + h.getText() + "' já declarada anteriormente! Linha: " + h.getLine());
            }else{
                tabela.adicionar(h.getText());
                declaracoesNaoUsadas.add(h.getText());
            }
        }
        return super.visitHabilidades(ctx);
    }

    /* Verificamos se os projetos já foram declarados anteriormente;
       caso sim, mostramos um erro; caso não, adicionamos na tabela
       de simbolos e na lista declaracoesNaoUsadas. */
    @Override
    public Void visitProjetos(gramaticaParser.ProjetosContext ctx) {
        for(Token p : ctx.projs){
           if(tabela.existe(p.getText())){
               System.out.println("Projeto '" + p.getText() + "' já declarado anteriormente! Linha: " + p.getLine());
           }else{
                tabela.adicionar(p.getText());
                declaracoesNaoUsadas.add(p.getText());
            }
        }
        return super.visitProjetos(ctx);
    }

    /* Na atribuição com as informações pessoais, verificamos se a informação pessoal foi ou não declarada;
       caso não tenha sido declarada, geramos uma mensagem de erro; caso tenha sido declarada enteriormente,
       removemos da lista declaracoesNaoUsadas*/
    @Override
    public Void visitCmdAtribuicao(gramaticaParser.CmdAtribuicaoContext ctx) {
        if(!tabela.existe(ctx.infosPessoais().getText())){
            System.out.println("Informação pessoal '" + ctx.infosPessoais().getText() + "' não declarada! Linha: " + ctx.start.getLine());
        }else{
            declaracoesNaoUsadas.remove(ctx.infosPessoais().getText());
        }
        return super.visitCmdAtribuicao(ctx);
    }

    /* No cmdProjetos, verificamos se o projeto já foi declarado anteriormente, caso negativo,
       geramos um erro. Caso positivo, removemos da lista declaracoesNaoUsadas.
    
       Verificamos se o projeto possui habilidade vinculada, caso negativo, geramos erro.

       E tambem verificamos se as habilidades foram declaradas anteriormente, caso negativo, geramos erro;
       caso positivo, removemos da lista declaracoesNaoUsadas. */
    @Override
    public Void visitCmdProjetos(gramaticaParser.CmdProjetosContext ctx) {
        if(!tabela.existe(ctx.PROJETO().getText())){
            System.out.println("Projeto '" + ctx.PROJETO().getText() + "' não declarado! Linha: " + ctx.start.getLine());
        } else {
            declaracoesNaoUsadas.remove(ctx.PROJETO().getText());
        }
        
        if(ctx.HABILIDADE().isEmpty()){
            System.out.println("Projeto '" + ctx.PROJETO().getText() + "' não possui habilidade relacionada! Linha: " + ctx.start.getLine());
        }
        
        for (TerminalNode h : ctx.HABILIDADE()){
            if(!tabela.existe(h.getText())){
                System.out.println("Habilidade '" + h.getText() + "' não declarada! Linha: " + ctx.start.getLine());
            }else{
                declaracoesNaoUsadas.remove(h.getText());
            }
        }
        
        return super.visitCmdProjetos(ctx);
    }
    
}