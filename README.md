# SimplerPlusPlus

My own compiler written in Java which compiles my own language.

Run project in Linux:

Installing dependencies:

1. Install ANTLR4
2. Install LLVM
3. Install Java
4. Install Maven

Now you can start to write your program in my language to the file:

`./src/main/java/com/simplerplusplus/input.txt`

After compiling you will find the result in the file:

`./src/main/java/com/simplerplusplus/llvm_output.ll`

For running you can use my Makefile:

1. make - to compile a grammar and install maven packages
2. make run - to start compiling your program
3. make llvm-run - to start your program in LLVM