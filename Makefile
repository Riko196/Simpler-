SHELL=/bin/bash
FILE_PATH=com.simplerplusplus.SimplerPlusPlus
ANTLR=java -jar /usr/local/lib/antlr-4.7.2-complete.jar
CLASSPATH=.:/usr/local/lib/antlr-4.7.2-complete.jar:$CLASSPATH
GRAMMAR_FILE=src/main/java/com/grammar
VISITOR_FILE=src/main/java/com/visitor

default: grammar-visitor install run

grammar-visitor:
	mv $(GRAMMAR_FILE)/*.g4 $(VISITOR_FILE); \
	$(ANTLR) -visitor -no-listener $(VISITOR_FILE)/SimplerPlusPlusLexer.g4; \
	$(ANTLR) -visitor -no-listener $(VISITOR_FILE)/SimplerPlusPlusParser.g4; \
	mv $(VISITOR_FILE)/*.g4 $(GRAMMAR_FILE);
	sed -i '1s/^/package com.visitor;\n /' $(VISITOR_FILE)/SimplerPlusPlusLexer*.java
	sed -i '1s/^/package com.visitor;\n /' $(VISITOR_FILE)/SimplerPlusPlusParser*.java

install:
	mvn package

clean:
	rm $(VISITOR_FILE)/SimplerPlusPlusLexer*; \
	rm $(VISITOR_FILE)/SimplerPlusPlusParser*;

grun:
	grun SimplerPlusPlus compilationUnit -gui

run:
	mvn exec:java -Dexec.mainClass=$(FILE_PATH)

run_llvm:
	gcc -fPIC -shared -o library.so ./src/main/java/com/utils/library.c
	llvm-as-9 ./src/main/java/com/simplerplusplus/llvm_output.ll
	lli-9 -load=./library.so ./src/main/java/com/simplerplusplus/llvm_output.bc
