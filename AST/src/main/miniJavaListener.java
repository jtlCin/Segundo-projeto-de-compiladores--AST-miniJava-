// Generated from miniJava.g4 by ANTLR 4.4
package main;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniJavaParser}.
 */
public interface miniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull miniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull miniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(@NotNull miniJavaParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(@NotNull miniJavaParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull miniJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull miniJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(@NotNull miniJavaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(@NotNull miniJavaParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull miniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull miniJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull miniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull miniJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull miniJavaParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull miniJavaParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull miniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull miniJavaParser.ClassDeclarationContext ctx);
}