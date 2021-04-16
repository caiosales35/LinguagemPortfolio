// Generated from com\mycompany\trabalho04\gramatica.g4 by ANTLR 4.9.1
package com.mycompany.trabalho04;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(gramaticaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#informacoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInformacoes(gramaticaParser.InformacoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#infosPessoais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfosPessoais(gramaticaParser.InfosPessoaisContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#habilidades}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHabilidades(gramaticaParser.HabilidadesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#projetos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjetos(gramaticaParser.ProjetosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(gramaticaParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(gramaticaParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtribuicao(gramaticaParser.CmdAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cmdProjetos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdProjetos(gramaticaParser.CmdProjetosContext ctx);
}