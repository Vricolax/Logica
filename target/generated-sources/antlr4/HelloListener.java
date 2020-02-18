// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#or_operation}.
	 * @param ctx the parse tree
	 */
	void enterOr_operation(@NotNull HelloParser.Or_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#or_operation}.
	 * @param ctx the parse tree
	 */
	void exitOr_operation(@NotNull HelloParser.Or_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(@NotNull HelloParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(@NotNull HelloParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#and_operation}.
	 * @param ctx the parse tree
	 */
	void enterAnd_operation(@NotNull HelloParser.And_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#and_operation}.
	 * @param ctx the parse tree
	 */
	void exitAnd_operation(@NotNull HelloParser.And_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#xor_operation}.
	 * @param ctx the parse tree
	 */
	void enterXor_operation(@NotNull HelloParser.Xor_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#xor_operation}.
	 * @param ctx the parse tree
	 */
	void exitXor_operation(@NotNull HelloParser.Xor_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull HelloParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull HelloParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#gate}.
	 * @param ctx the parse tree
	 */
	void enterGate(@NotNull HelloParser.GateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#gate}.
	 * @param ctx the parse tree
	 */
	void exitGate(@NotNull HelloParser.GateContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#not_operation}.
	 * @param ctx the parse tree
	 */
	void enterNot_operation(@NotNull HelloParser.Not_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#not_operation}.
	 * @param ctx the parse tree
	 */
	void exitNot_operation(@NotNull HelloParser.Not_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull HelloParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull HelloParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(@NotNull HelloParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(@NotNull HelloParser.OperationContext ctx);
}