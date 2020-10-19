// Generated from UnitGrammar.g4 by ANTLR 4.8

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UnitGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UnitGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UnitGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(UnitGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnitGrammarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(UnitGrammarParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnitGrammarParser#dim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDim(UnitGrammarParser.DimContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnitGrammarParser#valueConvertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueConvertion(UnitGrammarParser.ValueConvertionContext ctx);
}