// Generated from UnitGrammar.g4 by ANTLR 4.8

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UnitGrammarParser}.
 */
public interface UnitGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UnitGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(UnitGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnitGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(UnitGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnitGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(UnitGrammarParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnitGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(UnitGrammarParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnitGrammarParser#dim}.
	 * @param ctx the parse tree
	 */
	void enterDim(UnitGrammarParser.DimContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnitGrammarParser#dim}.
	 * @param ctx the parse tree
	 */
	void exitDim(UnitGrammarParser.DimContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnitGrammarParser#valueConvertion}.
	 * @param ctx the parse tree
	 */
	void enterValueConvertion(UnitGrammarParser.ValueConvertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnitGrammarParser#valueConvertion}.
	 * @param ctx the parse tree
	 */
	void exitValueConvertion(UnitGrammarParser.ValueConvertionContext ctx);
}