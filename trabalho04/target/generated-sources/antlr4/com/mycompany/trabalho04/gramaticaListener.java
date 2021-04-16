// Generated from com\mycompany\trabalho04\gramatica.g4 by ANTLR 4.9.1
package com.mycompany.trabalho04;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(gramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(gramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#informacoes}.
	 * @param ctx the parse tree
	 */
	void enterInformacoes(gramaticaParser.InformacoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#informacoes}.
	 * @param ctx the parse tree
	 */
	void exitInformacoes(gramaticaParser.InformacoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#infosPessoais}.
	 * @param ctx the parse tree
	 */
	void enterInfosPessoais(gramaticaParser.InfosPessoaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#infosPessoais}.
	 * @param ctx the parse tree
	 */
	void exitInfosPessoais(gramaticaParser.InfosPessoaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#habilidades}.
	 * @param ctx the parse tree
	 */
	void enterHabilidades(gramaticaParser.HabilidadesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#habilidades}.
	 * @param ctx the parse tree
	 */
	void exitHabilidades(gramaticaParser.HabilidadesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#projetos}.
	 * @param ctx the parse tree
	 */
	void enterProjetos(gramaticaParser.ProjetosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#projetos}.
	 * @param ctx the parse tree
	 */
	void exitProjetos(gramaticaParser.ProjetosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(gramaticaParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(gramaticaParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(gramaticaParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(gramaticaParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(gramaticaParser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(gramaticaParser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cmdProjetos}.
	 * @param ctx the parse tree
	 */
	void enterCmdProjetos(gramaticaParser.CmdProjetosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cmdProjetos}.
	 * @param ctx the parse tree
	 */
	void exitCmdProjetos(gramaticaParser.CmdProjetosContext ctx);
}