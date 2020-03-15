declare i32 @print_int(i32)
declare i32 @scanf_int()
declare i32 @print_char(i8)
declare i8  @scanf_char()
declare i32 @println()
declare i8* @malloc(i32)
declare i8 @free(i8*)

define i32 @main() {
start:
    %reg0 = add i32 10, 0
    %reg1 = call i8* @malloc(i32 %reg0)
    %reg2 = bitcast i8* %reg1 to i32*
    %reg3 = add i32 4, 0
    %reg5 = getelementptr inbounds i32, i32* %reg2, i32 %reg3
    %reg4 = add i32 5, 0
    store i32 %reg4, i32* %reg5
    %reg7 = add i32 4, 0
    %reg8 = getelementptr inbounds i32, i32* %reg2, i32 %reg7
    %reg9 = load i32, i32* %reg8

    %var6 = alloca i32
    store i32     %reg9, i32* %var6
    %reg0 = add i32 10, 0
    %reg1 = call i8* @malloc(i32 %reg0)
    %reg2 = bitcast i8* %reg1 to i32*
    %reg3 = add i32 4, 0
    %reg5 = getelementptr inbounds i32, i32* %reg2, i32 %reg3
    %reg4 = add i32 5, 0
    store i32 %reg4, i32* %reg5
    %reg7 = add i32 4, 0
    %reg8 = getelementptr inbounds i32, i32* %reg2, i32 %reg7
    %reg9 = load i32, i32* %reg8

    %var6 = alloca i32
    store i32     %reg9, i32* %var6


ret i32 0
}

