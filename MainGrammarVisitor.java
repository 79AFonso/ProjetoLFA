// Generated from MainGrammar.g4 by ANTLR 4.8

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MainGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MainGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MainGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(MainGrammarParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MainGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#if_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_clause(MainGrammarParser.If_clauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forLoop}
	 * labeled alternative in {@link MainGrammarParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(MainGrammarParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link MainGrammarParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(MainGrammarParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doWhileLoop}
	 * labeled alternative in {@link MainGrammarParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileLoop(MainGrammarParser.DoWhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(MainGrammarParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(MainGrammarParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignments(MainGrammarParser.AssignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#prints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrints(MainGrammarParser.PrintsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(MainGrammarParser.IntExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(MainGrammarParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealExpr(MainGrammarParser.RealExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpr(MainGrammarParser.BooleanExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multDivExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivExpr(MainGrammarParser.MultDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unitVarExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitVarExpr(MainGrammarParser.UnitVarExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(MainGrammarParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incrementsExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementsExpr(MainGrammarParser.IncrementsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpr(MainGrammarParser.ConditionalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(MainGrammarParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link MainGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(MainGrammarParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RealType}
	 * labeled alternative in {@link MainGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealType(MainGrammarParser.RealTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnitType}
	 * labeled alternative in {@link MainGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitType(MainGrammarParser.UnitTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link MainGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(MainGrammarParser.BooleanTypeContext ctx);
}