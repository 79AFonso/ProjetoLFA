import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.*;
import java.io.*;
import java.util.*;


public class MainGrammarMain {
   public static void main(String[] args) throws Exception {
      // create a CharStream that reads from standard input:
      CharStream input = CharStreams.fromStream(System.in);
      // create a lexer that feeds off of input CharStream:
      MainGrammarLexer lexer = new MainGrammarLexer(input);
      // create a buffer of tokens pulled from the lexer:
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      // create a parser that feeds off the tokens buffer:
      MainGrammarParser parser = new MainGrammarParser(tokens);
      // replace error listener:
      parser.removeErrorListeners(); // remove ConsoleErrorListener
      parser.addErrorListener(new ErrorHandlingListener());
      // begin parsing at program rule:
      ParseTree tree = parser.program();
      if (parser.getNumberOfSyntaxErrors() == 0) {
         // print LISP-style tree:
         // System.out.println(tree.toStringTree(parser));
         MainSemCheck visitor0 = new MainSemCheck();
         MainCompiler visitor1 = new MainCompiler();
         visitor0.visit(tree);
         if(!ErrorHandling.error()){
            ST code = visitor1.visit(tree);
            code.add("name","Output");
            PrintWriter pw = new PrintWriter(new File("Output.java"));
            pw.print(code.render());
            pw.close();
         }
      }
   }
}
