// Generated from MainGrammar.g4 by ANTLR 4.8

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MainGrammarParser}.
 */
public interface MainGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MainGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MainGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(MainGrammarParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(MainGrammarParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MainGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MainGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#if_clause}.
	 * @param ctx the parse tree
	 */
	void enterIf_clause(MainGrammarParser.If_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#if_clause}.
	 * @param ctx the parse tree
	 */
	void exitIf_clause(MainGrammarParser.If_clauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forLoop}
	 * labeled alternative in {@link MainGrammarParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(MainGrammarParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forLoop}
	 * labeled alternative in {@link MainGrammarParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(MainGrammarParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link MainGrammarParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(MainGrammarParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link MainGrammarParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(MainGrammarParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doWhileLoop}
	 * labeled alternative in {@link MainGrammarParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileLoop(MainGrammarParser.DoWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doWhileLoop}
	 * labeled alternative in {@link MainGrammarParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileLoop(MainGrammarParser.DoWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(MainGrammarParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(MainGrammarParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(MainGrammarParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(MainGrammarParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#assignments}.
	 * @param ctx the parse tree
	 */
	void enterAssignments(MainGrammarParser.AssignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#assignments}.
	 * @param ctx the parse tree
	 */
	void exitAssignments(MainGrammarParser.AssignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#prints}.
	 * @param ctx the parse tree
	 */
	void enterPrints(MainGrammarParser.PrintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#prints}.
	 * @param ctx the parse tree
	 */
	void exitPrints(MainGrammarParser.PrintsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(MainGrammarParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(MainGrammarParser.IntExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(MainGrammarParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(MainGrammarParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRealExpr(MainGrammarParser.RealExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRealExpr(MainGrammarParser.RealExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(MainGrammarParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(MainGrammarParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multDivExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultDivExpr(MainGrammarParser.MultDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multDivExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultDivExpr(MainGrammarParser.MultDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unitVarExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnitVarExpr(MainGrammarParser.UnitVarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unitVarExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnitVarExpr(MainGrammarParser.UnitVarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(MainGrammarParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(MainGrammarParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incrementsExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIncrementsExpr(MainGrammarParser.IncrementsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incrementsExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIncrementsExpr(MainGrammarParser.IncrementsExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpr(MainGrammarParser.ConditionalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpr(MainGrammarParser.ConditionalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(MainGrammarParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(MainGrammarParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link MainGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(MainGrammarParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link MainGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(MainGrammarParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealType}
	 * labeled alternative in {@link MainGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterRealType(MainGrammarParser.RealTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealType}
	 * labeled alternative in {@link MainGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitRealType(MainGrammarParser.RealTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnitType}
	 * labeled alternative in {@link MainGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterUnitType(MainGrammarParser.UnitTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnitType}
	 * labeled alternative in {@link MainGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitUnitType(MainGrammarParser.UnitTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link MainGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(MainGrammarParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link MainGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(MainGrammarParser.BooleanTypeContext ctx);
}