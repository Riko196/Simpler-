package com.simplerplusplus;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import com.visitor.SimplerPlusPlusLexer;
import com.visitor.SimplerPlusPlusParser;
import com.visitor.SimplerPlusPlusVisitor;

import com.code_fragment.*;

import java.io.*;

public class SimplerPlusPlus {
    public static void main(String[] args) throws IOException {
        CharStream in = CharStreams.fromFileName("./src/main/java/com/simplerplusplus/input.txt");

        SimplerPlusPlusLexer lexer = new SimplerPlusPlusLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimplerPlusPlusParser parser = new SimplerPlusPlusParser(tokens);

        ParseTree tree = parser.root();

        SimplerPlusPlusVisitor visitor = new SimplerPlusPlusVisitor();

        CodeFragment root = visitor.visit(tree);

        System.out.println(root);
        FileWriter llvmOutput = new FileWriter("./src/main/java/com/simplerplusplus/llvm_output.ll");
        llvmOutput.write(root.toString());
        llvmOutput.close();
    }
}
