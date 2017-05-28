package main;

import java.io.FileInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import ast.Program;
import symboltable.SymbolTable;
import visitor.BuildSymbolTableVisitor;
import visitor.PrettyPrintVisitor;
import visitor.TypeCheckVisitor;

public class Main {
	public static void main(String[] args) {
		
		InputStream stream;
		try {
			stream = new FileInputStream("teste.txt");
			ANTLRInputStream input = new ANTLRInputStream(stream);
			miniJavaLexer lexer = new miniJavaLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			
			miniJavaParser parser = new miniJavaParser(tokens);
			//ParseTree tree = parser.goal();
			
			ASTBuilder builder = new ASTBuilder();
			
			
			Program prog = builder.visitGoal(parser.goal());
			PrettyPrintVisitor ptv = new PrettyPrintVisitor();
			prog.accept(ptv);
			
			BuildSymbolTableVisitor sbv = new BuildSymbolTableVisitor();
			prog.accept(sbv);
			TypeCheckVisitor test = new TypeCheckVisitor(sbv.getSymbolTable());
			prog.accept(test);
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
	}
}