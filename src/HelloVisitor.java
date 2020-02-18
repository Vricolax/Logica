// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#or_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_operation(@NotNull HelloParser.Or_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(@NotNull HelloParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#and_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_operation(@NotNull HelloParser.And_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#xor_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_operation(@NotNull HelloParser.Xor_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull HelloParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#gate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGate(@NotNull HelloParser.GateContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#not_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_operation(@NotNull HelloParser.Not_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull HelloParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(@NotNull HelloParser.OperationContext ctx);
}