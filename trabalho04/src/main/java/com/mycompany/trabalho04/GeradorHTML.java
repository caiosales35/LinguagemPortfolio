package com.mycompany.trabalho04;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author caiocesardemorais
 */
public class GeradorHTML extends gramaticaBaseVisitor<Void> {
    StringBuilder saida;
    String infosPessoais;
    String nome;
    List<String> projetos = new ArrayList<String>();  
    
    public GeradorHTML(){
        saida = new StringBuilder();
        infosPessoais = " | ";
    }

    @Override
    public Void visitPrograma(gramaticaParser.ProgramaContext ctx) {
        /* Gera o inicio do documento HTML */
        gerarInicioDoc();
                        
        if(ctx.corpo().cmd() != null){
            for(gramaticaParser.CmdContext c : ctx.corpo().cmd()){
                if(c.cmdAtribuicao() != null){
                    /* Preenche a variavel 'infosPessoais' com as informações pessoais */
                    visitCmdAtribuicao(c.cmdAtribuicao());
                } else if(c.cmdProjetos() != null){
                    /* Preenche a lista 'projetos' com os dados dos projetos */
                    visitCmdProjetos(c.cmdProjetos());
                }
            }
        }
        
        /* Gera a parte das informações pessoais no HTML */
        gerarInfosPessoais();
        gerarPosInfosPessoais();
        
        /* Gera a parte do portfolio dos projetos no HTML */
        gerarPortfolio();
        
        /* Gera o fim do documento HTML */
        gerarFimDoc();
        return null;
    }

    /* Quando visitamoso o cmdAtribuicao, montamos o HTML dos dados pessoais; uma vez que
       o cmdAtribuicao só deve ser chamad o para atribuição a informações pessoais. */
    @Override
    public Void visitCmdAtribuicao(gramaticaParser.CmdAtribuicaoContext ctx) {
        if (ctx.infosPessoais().getText().equals("Nome")){
            nome = ctx.CADEIA().getText().replace("\"", " ");
        } else {
            infosPessoais += ctx.infosPessoais().getText() + ": " + ctx.CADEIA().getText().replace("\"", " ") + " | ";
        }
        return super.visitCmdAtribuicao(ctx);
    }

    /* Sempre que visitams o comando cmdProjetos, vamos montar o HTML do projeto especifico. */
    @Override
    public Void visitCmdProjetos(gramaticaParser.CmdProjetosContext ctx) {
        String descProjeto = ctx.CADEIA().getText().replace("\"", " ");
        String habilidades = "<strong>Habilidades utilizadas: </strong>";
        
        for (TerminalNode h : ctx.HABILIDADE()){
            habilidades += h.getText() + ", ";
        }
        
        String projeto = "<div class='col-md-5 col-lg-3 border border-success mb-3 ml-3 mr-3'>\n" +
        "                     <h4 class='text-secondary mb-0 mt-2'><strong>Projeto: </strong>" + descProjeto + "</h4>\n" +
        "       	      <p class='mb-3 mt-2 justify-content-center'>" + habilidades + "</p>\n" +
        "		    </div>\n";

        projetos.add(projeto);
        return super.visitCmdProjetos(ctx);
    }
    
    /* Gera o inicio do documento HTML */
    private void gerarInicioDoc(){
        saida.append("<!DOCTYPE html>\n" +
        "    <html lang='pt-br'>\n" +
        "    <head>\n" +
        "        <meta charset='utf-8' />\n" +
        "        <meta name='viewport' content='width=device-width, initial-scale=1, shrink-to-fit=no' />\n" +
        "        <title>Meu portfolio</title>\n" +
        "        \n" +
        "        <script src='https://use.fontawesome.com/releases/v5.15.1/js/all.js' crossorigin='anonymous'></script>\n" +
        "        <link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css' />\n" +
        "        <link href='https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic' rel='stylesheet' type='text/css' />\n" +
        "        <link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css' integrity='sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO' crossorigin='anonymous'>\n" +
        "    </head>\n" +
        "    <body id='page-top'>");
    }

    /* Gera a parte das informações pessoais no HTML */
    private void gerarInfosPessoais(){
        saida.append("<!-- Incio visit informacoes pessoais -->\n" +
        "        <header class='bg-success text-white text-center d-flex align-items-center' style='height:400px;'>\n" +
        "            <div class='container d-flex align-items-center flex-column'>\n" +
        "                <h1 class='text-uppercase mb-0'>" + nome + "</h1>\n" +
        "                <div class='divider-custom divider-light mt-3 mb-3'>\n" +
        "                    <div class='divider-custom-icon'><i class='fas fa-star'></i></div>\n" +
        "                </div>\n" +
        "                <p class=' font-weight-light mb-0'>" + infosPessoais + "</p>\n" +
        "            </div>\n" +
        "        </header>");
    }
    
    /* Gera a parte das apos as informações pessoais no HTML */
    private void gerarPosInfosPessoais() {
        saida.append("<section class='page-section mt-5'>\n" +
        "                <div class='container'>\n" +
        "                   <h2 class='page-section-heading text-center text-uppercase text-secondary mb-0'>\n" +
        "                       <i class='fas fa-star'></i>Portfolio<i class='fas fa-star'></i>\n" +
        "                   </h2>\n");
    }
   
    /* Gera a parte do portfolio dos projetos no HTML */
    private void gerarPortfolio() {
        saida.append("<div class='row justify-content-center mt-5'>\n");
        for(String projeto : projetos){
            saida.append(projeto);
        }
        saida.append("</div>");
    }
 
    /* Gera o fim do documento HTML */
    private void gerarFimDoc() {
        saida.append("</div>\n" +
        "        </section>\n" +
        "        <div class='copyright py-4 text-center text-white'>\n" +
        "            <div class='container'><small>Copyright © Caio Cesar de Morais Sales 2021</small></div>\n" +
        "        </div>\n" +
        "        <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js'></script>\n" +
        "        <script src='https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js'></script>\n" +
        "        <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js'></script>\n" +
        "    </body>\n" +
        "    </html>");
    }
}