import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class MyCompiler {

	public static void main(String[] args) throws IOException {
        HelloLexer lexer = new HelloLexer(new ANTLRFileStream("input.txt"));        
        HelloParser parser = new HelloParser(new CommonTokenStream(lexer));        
        ParseTree tree = parser.r();       
        myVisitor visitor = new myVisitor();        
        visitor.visit(tree);


	}

}
