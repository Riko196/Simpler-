package com.code_fragment;

public class CodeFragment {
    private String llvmCode;
    private String registerName;
    private String registerType;

    public CodeFragment(String llvmCode) {
        this.llvmCode = llvmCode;
    }

    public CodeFragment(String llvmCode, String registerName, String registerType) {
        this.llvmCode = llvmCode;
        this.registerName = registerName;
        this.registerType = registerType;
    }

    public String toString() {
        return this.llvmCode;
    }

    public void addCode(String code) {
        this.llvmCode += llvmCode;
    }

    public void addCode(CodeFragment fragment) {
        this.llvmCode += fragment.toString();
    }

    public void setRegisterName(String registerName) {
        this.registerName = registerName;
    }

    public String getRegisterName() {
        return this.registerName;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType;
    }

    public String getRegisterType() {
        return this.registerType;
    }
}