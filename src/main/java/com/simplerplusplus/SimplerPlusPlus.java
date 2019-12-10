package com.simplerplusplus;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import com.visitor.SimplerPlusPlusLexer;
import com.visitor.SimplerPlusPlusParser;
import com.visitor.SimplerPlusPlusVisitor;

import java.io.IOException;


public class SimplerPlusPlus {
    public static void main(String[] args) throws IOException {
        CharStream in = CharStreams.fromFileName("input.txt");
        SimplerPlusPlusLexer lexer = new SimplerPlusPlusLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimplerPlusPlusParser parser = new SimplerPlusPlusParser(tokens);

        ParseTree tree = parser.root();

        SimplerPlusPlusVisitor visitor = new SimplerPlusPlusVisitor();
        visitor.visit(tree);
    }
}
