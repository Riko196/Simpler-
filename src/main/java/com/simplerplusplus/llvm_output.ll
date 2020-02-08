declare i32 @print_int(i32)
declare i32 @scanf_int()
declare i32 @print_char(i8)
declare i8  @scanf_char()
declare i32 @println()
declare i8* @malloc(i32)

define i32 @main() {
start:
    %reg1 = call i32 @scanf_int()

    %var0 = alloca i32
    store i32     %reg1, i32* %var0
    %reg3 = call i8 @scanf_char()

    %var2 = alloca i8
    store i8     %reg3, i8* %var2
    %var4 = load i32, i32* %var0
    %reg5 = add i32 256, 0
    %reg6 = mul nuw i32 %var4, %reg5
    %reg7 = call i8* @malloc(i32 %reg6)
    %reg8 = bitcast i8* %reg7 to i8*
    %reg9 = add i32 0, 0

    %var10 = load i32, i32* %var0

    %reg11 = add i32 1, 0

    %reg12 = sub i32 %var10, %reg11

    %reg13 = add i32 1, 0

    %i_memory_register14 = alloca i32
    store i32 %reg9, i32* %i_memory_register14
    br label %for_cycle_condition33

for_cycle_condition33:
    %i_value_register14 = load i32, i32* %i_memory_register14
    %condition_value_register14 = icmp sgt i32 %i_value_register14, %reg12
    br i1 %condition_value_register14, label %end_for_cycle33, label %for_cycle_body33

for_cycle_body33:
    %reg16 = add i8 32, 0

    %var15 = alloca i8
    store i8 %reg16, i8* %var15
    %reg17 = add i32 0, 0

    %reg18 = add i32 255, 0

    %reg19 = add i32 1, 0

    %i_memory_register20 = alloca i32
    store i32 %reg17, i32* %i_memory_register20
    br label %for_cycle_condition32

for_cycle_condition32:
    %i_value_register20 = load i32, i32* %i_memory_register20
    %condition_value_register20 = icmp sgt i32 %i_value_register20, %reg18
    br i1 %condition_value_register20, label %end_for_cycle32, label %for_cycle_body32

for_cycle_body32:
    %var21 = load i8, i8* %var15

    %reg22 = add i8 10, 0

    %reg23 = icmp ne i8 %var21, %reg22

    br i1 %reg23, label %if_true31, label %end_if31

if_true31:
    %reg24 = call i8 @scanf_char()

    store i8     %reg24, i8* %var15
    %var25 = load i32, i32* %i_memory_register14
    %var26 = load i32, i32* %i_memory_register20
    %reg28 = mul nuw i32 %reg5, %var25
    %reg29 = getelementptr inbounds i8, i8* %reg8, i32 %reg28
    %reg30 = getelementptr inbounds i8, i8* %reg29, i32 %var26
    %var27 = load i8, i8* %var15
    store i8 %var27, i8* %reg30

    br label %end_if31
end_if31:

    br label %for_cycle_iter32

for_cycle_iter32:
    %i_new_value_register20 = load i32, i32* %i_memory_register20
    %aux_register20 = add i32 %i_value_register20, %reg19
    store i32 %aux_register20, i32* %i_memory_register20
    br label %for_cycle_condition32

end_for_cycle32:

    br label %for_cycle_iter33

for_cycle_iter33:
    %i_new_value_register14 = load i32, i32* %i_memory_register14
    %aux_register14 = add i32 %i_value_register14, %reg13
    store i32 %aux_register14, i32* %i_memory_register14
    br label %for_cycle_condition33

end_for_cycle33:
    %reg34 = add i32 0, 0

    %var35 = load i32, i32* %var0

    %reg36 = add i32 1, 0

    %reg37 = sub i32 %var35, %reg36

    %reg38 = add i32 1, 0

    %i_memory_register39 = alloca i32
    store i32 %reg34, i32* %i_memory_register39
    br label %for_cycle_condition132

for_cycle_condition132:
    %i_value_register39 = load i32, i32* %i_memory_register39
    %condition_value_register39 = icmp sgt i32 %i_value_register39, %reg37
    br i1 %condition_value_register39, label %end_for_cycle132, label %for_cycle_body132

for_cycle_body132:
    %reg40 = add i32 1, 0

    %var41 = load i32, i32* %var0

    %reg42 = add i32 1, 0

    %reg43 = sub i32 %var41, %reg42

    %var44 = load i32, i32* %i_memory_register39

    %reg45 = sub i32 %reg43, %var44

    %reg46 = add i32 1, 0

    %i_memory_register47 = alloca i32
    store i32 %reg40, i32* %i_memory_register47
    br label %for_cycle_condition131

for_cycle_condition131:
    %i_value_register47 = load i32, i32* %i_memory_register47
    %condition_value_register47 = icmp sgt i32 %i_value_register47, %reg45
    br i1 %condition_value_register47, label %end_for_cycle131, label %for_cycle_body131

for_cycle_body131:
    %reg49 = add i32 0, 0

    %var48 = alloca i32
    store i32 %reg49, i32* %var48
    %reg50 = add i32 0, 0

    %reg51 = add i32 255, 0

    %reg52 = add i32 1, 0

    %i_memory_register53 = alloca i32
    store i32 %reg50, i32* %i_memory_register53
    br label %for_cycle_condition93

for_cycle_condition93:
    %i_value_register53 = load i32, i32* %i_memory_register53
    %condition_value_register53 = icmp sgt i32 %i_value_register53, %reg51
    br i1 %condition_value_register53, label %end_for_cycle93, label %for_cycle_body93

for_cycle_body93:
    %var54 = load i32, i32* %var48

    %reg55 = add i32 0, 0

    %reg56 = icmp eq i32 %var54, %reg55

    br i1 %reg56, label %if_true92, label %end_if92

if_true92:
    %var57 = load i32, i32* %i_memory_register47
    %var58 = load i32, i32* %i_memory_register53
    %reg59 = mul nuw i32 %reg5, %var57
    %reg60 = getelementptr inbounds i8, i8* %reg8, i32 %reg59
    %reg61 = getelementptr inbounds i8, i8* %reg60, i32 %var58
    %reg62 = load i8, i8* %reg61

    %var63 = load i32, i32* %i_memory_register47

    %reg64 = add i32 1, 0

    %reg65 = sub i32 %var63, %reg64
    %var66 = load i32, i32* %i_memory_register53
    %reg67 = mul nuw i32 %reg5, %reg65
    %reg68 = getelementptr inbounds i8, i8* %reg8, i32 %reg67
    %reg69 = getelementptr inbounds i8, i8* %reg68, i32 %var66
    %reg70 = load i8, i8* %reg69

    %reg71 = icmp slt i8     %reg62,     %reg70

    br i1 %reg71, label %if_true73, label %end_if73

if_true73:
    %reg72 = add i32 1, 0

    store i32 %reg72, i32* %var48

    br label %end_if73
end_if73:
    %var74 = load i32, i32* %i_memory_register47
    %var75 = load i32, i32* %i_memory_register53
    %reg76 = mul nuw i32 %reg5, %var74
    %reg77 = getelementptr inbounds i8, i8* %reg8, i32 %reg76
    %reg78 = getelementptr inbounds i8, i8* %reg77, i32 %var75
    %reg79 = load i8, i8* %reg78

    %var80 = load i32, i32* %i_memory_register47

    %reg81 = add i32 1, 0

    %reg82 = sub i32 %var80, %reg81
    %var83 = load i32, i32* %i_memory_register53
    %reg84 = mul nuw i32 %reg5, %reg82
    %reg85 = getelementptr inbounds i8, i8* %reg8, i32 %reg84
    %reg86 = getelementptr inbounds i8, i8* %reg85, i32 %var83
    %reg87 = load i8, i8* %reg86

    %reg88 = icmp sgt i8     %reg79,     %reg87

    br i1 %reg88, label %if_true91, label %end_if91

if_true91:
    %reg89 = add i32 1, 0

    %reg90 = mul i32 %reg89, -1

    store i32 %reg90, i32* %var48

    br label %end_if91
end_if91:

    br label %end_if92
end_if92:

    br label %for_cycle_iter93

for_cycle_iter93:
    %i_new_value_register53 = load i32, i32* %i_memory_register53
    %aux_register53 = add i32 %i_value_register53, %reg52
    store i32 %aux_register53, i32* %i_memory_register53
    br label %for_cycle_condition93

end_for_cycle93:
    %var94 = load i32, i32* %var48

    %reg95 = add i32 1, 0

    %reg96 = icmp eq i32 %var94, %reg95

    br i1 %reg96, label %if_true130, label %end_if130

if_true130:
    %reg97 = add i32 0, 0

    %reg98 = add i32 255, 0

    %reg99 = add i32 1, 0

    %i_memory_register100 = alloca i32
    store i32 %reg97, i32* %i_memory_register100
    br label %for_cycle_condition129

for_cycle_condition129:
    %i_value_register100 = load i32, i32* %i_memory_register100
    %condition_value_register100 = icmp sgt i32 %i_value_register100, %reg98
    br i1 %condition_value_register100, label %end_for_cycle129, label %for_cycle_body129

for_cycle_body129:
    %var102 = load i32, i32* %i_memory_register47
    %var103 = load i32, i32* %i_memory_register100
    %reg104 = mul nuw i32 %reg5, %var102
    %reg105 = getelementptr inbounds i8, i8* %reg8, i32 %reg104
    %reg106 = getelementptr inbounds i8, i8* %reg105, i32 %var103
    %reg107 = load i8, i8* %reg106

    %var101 = alloca i8
    store i8     %reg107, i8* %var101
    %var108 = load i32, i32* %i_memory_register47
    %var109 = load i32, i32* %i_memory_register100
    %reg118 = mul nuw i32 %reg5, %var108
    %reg119 = getelementptr inbounds i8, i8* %reg8, i32 %reg118
    %reg120 = getelementptr inbounds i8, i8* %reg119, i32 %var109
    %var110 = load i32, i32* %i_memory_register47

    %reg111 = add i32 1, 0

    %reg112 = sub i32 %var110, %reg111
    %var113 = load i32, i32* %i_memory_register100
    %reg114 = mul nuw i32 %reg5, %reg112
    %reg115 = getelementptr inbounds i8, i8* %reg8, i32 %reg114
    %reg116 = getelementptr inbounds i8, i8* %reg115, i32 %var113
    %reg117 = load i8, i8* %reg116
    store i8     %reg117, i8* %reg120
    %var121 = load i32, i32* %i_memory_register47

    %reg122 = add i32 1, 0

    %reg123 = sub i32 %var121, %reg122
    %var124 = load i32, i32* %i_memory_register100
    %reg126 = mul nuw i32 %reg5, %reg123
    %reg127 = getelementptr inbounds i8, i8* %reg8, i32 %reg126
    %reg128 = getelementptr inbounds i8, i8* %reg127, i32 %var124
    %var125 = load i8, i8* %var101
    store i8 %var125, i8* %reg128

    br label %for_cycle_iter129

for_cycle_iter129:
    %i_new_value_register100 = load i32, i32* %i_memory_register100
    %aux_register100 = add i32 %i_value_register100, %reg99
    store i32 %aux_register100, i32* %i_memory_register100
    br label %for_cycle_condition129

end_for_cycle129:

    br label %end_if130
end_if130:

    br label %for_cycle_iter131

for_cycle_iter131:
    %i_new_value_register47 = load i32, i32* %i_memory_register47
    %aux_register47 = add i32 %i_value_register47, %reg46
    store i32 %aux_register47, i32* %i_memory_register47
    br label %for_cycle_condition131

end_for_cycle131:

    br label %for_cycle_iter132

for_cycle_iter132:
    %i_new_value_register39 = load i32, i32* %i_memory_register39
    %aux_register39 = add i32 %i_value_register39, %reg38
    store i32 %aux_register39, i32* %i_memory_register39
    br label %for_cycle_condition132

end_for_cycle132:
    %reg133 = add i32 0, 0

    %var134 = load i32, i32* %var0

    %reg135 = add i32 1, 0

    %reg136 = sub i32 %var134, %reg135

    %reg137 = add i32 1, 0

    %i_memory_register138 = alloca i32
    store i32 %reg133, i32* %i_memory_register138
    br label %for_cycle_condition161

for_cycle_condition161:
    %i_value_register138 = load i32, i32* %i_memory_register138
    %condition_value_register138 = icmp sgt i32 %i_value_register138, %reg136
    br i1 %condition_value_register138, label %end_for_cycle161, label %for_cycle_body161

for_cycle_body161:
    %reg140 = add i32 0, 0

    %var139 = alloca i32
    store i32 %reg140, i32* %var139
    br label %while_cycle_condition159

while_cycle_condition159:
    %var141 = load i32, i32* %i_memory_register138
    %var142 = load i32, i32* %var139
    %reg143 = mul nuw i32 %reg5, %var141
    %reg144 = getelementptr inbounds i8, i8* %reg8, i32 %reg143
    %reg145 = getelementptr inbounds i8, i8* %reg144, i32 %var142
    %reg146 = load i8, i8* %reg145

    %reg147 = add i8 10, 0

    %reg148 = icmp ne i8     %reg146, %reg147

    br i1 %reg148, label %while_cycle_body159, label %end_while_cycle159

while_cycle_body159:
    %var149 = load i32, i32* %i_memory_register138
    %var150 = load i32, i32* %var139
    %reg151 = mul nuw i32 %reg5, %var149
    %reg152 = getelementptr inbounds i8, i8* %reg8, i32 %reg151
    %reg153 = getelementptr inbounds i8, i8* %reg152, i32 %var150
    %reg154 = load i8, i8* %reg153
    %reg155 = call i32 @print_char(i8     %reg154)
    %var156 = load i32, i32* %var139

    %reg157 = add i32 1, 0

    %reg158 = add i32 %var156, %reg157

    store i32 %reg158, i32* %var139

    br label %while_cycle_condition159

end_while_cycle159:
    %reg160 = call i32 @println()

    br label %for_cycle_iter161

for_cycle_iter161:
    %i_new_value_register138 = load i32, i32* %i_memory_register138
    %aux_register138 = add i32 %i_value_register138, %reg137
    store i32 %aux_register138, i32* %i_memory_register138
    br label %for_cycle_condition161

end_for_cycle161:
    %reg162 = add i32 0, 0

    ret i32 %reg162


ret i32 0
}

