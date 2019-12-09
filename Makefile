SHELL=/bin/bash
FILE_PATH=com.simplerplusplus.SimplerPlusPlus
ANTLR=java -jar /usr/local/lib/antlr-4.7.2-complete.jar
CLASSPATH=.:/usr/local/lib/antlr-4.7.2-complete.jar:$CLASSPATH
GRAMMAR_FILE=src/main/java/com/grammar
VISITOR_FILE=src/main/java/com/visitor

grammar:
	mv $(GRAMMAR_FILE)/*.g4 $(VISITOR_FILE); \
	$(ANTLR) -visitor -no-listener $(VISITOR_FILE)/SimplerPlusPlusLexer.g4; \
	$(ANTLR) -visitor -no-listener $(VISITOR_FILE)/SimplerPlusPlusParser.g4; \
	mv $(VISITOR_FILE)/*.g4 $(GRAMMAR_FILE);

install:
	mvn package

clean:
	rm $(VISITOR_FILE)/*.java; \
	rm $(VISITOR_FILE)/*.tokens; \
	rm $(VISITOR_FILE)/*.interp;

grun:
	grun SimplerPlusPlus compilationUnit -gui

run:
	mvn exec:java -Dexec.mainClass=$(FILE_PATH)
