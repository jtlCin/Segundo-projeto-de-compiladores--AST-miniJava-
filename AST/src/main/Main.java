package main;

import java.io.FileInputStream;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import ast.*;
//import symboltable.SymbolTable;
import visitor.*;

public class Main {
	public static void main(String[] args) throws IOException{
		FileInputStream stream = new FileInputStream("teste.txt");
        ANTLRInputStream input = new ANTLRInputStream(stream);
        miniJavaLexer lexer = new miniJavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        miniJavaParser parser = new miniJavaParser(tokens);
        //ParseTree tree = parser.goal();
        
        ASTBuilder builder = new ASTBuilder();
        
        Program prog = builder.visitGoal(parser.goal());
        //PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        //prog.accept(visitor);
        BuildSymbolTableVisitor visitorB = new BuildSymbolTableVisitor();
        prog.accept(visitorB);
        //SymbolTable t = visitorB.getSymbolTable();
        prog.accept(new TypeCheckVisitor(visitorB.getSymbolTable()));
	}
}