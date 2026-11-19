package com.xuexiang.xui.widget.dialog.strategy;

/* loaded from: classes.dex */
public class InputInfo {
    private boolean mAllowEmptyInput;
    private String mHint;
    private int mInputType;
    private String mPreFill;

    public InputInfo(int i4) {
        this.mInputType = i4;
        this.mHint = "";
        this.mPreFill = "";
        this.mAllowEmptyInput = false;
    }

    public String getHint() {
        return this.mHint;
    }

    public int getInputType() {
        return this.mInputType;
    }

    public String getPreFill() {
        return this.mPreFill;
    }

    public boolean isAllowEmptyInput() {
        return this.mAllowEmptyInput;
    }

    public InputInfo setAllowEmptyInput(boolean z3) {
        this.mAllowEmptyInput = z3;
        return this;
    }

    public InputInfo setHint(String str) {
        this.mHint = str;
        return this;
    }

    public InputInfo setInputType(int i4) {
        this.mInputType = i4;
        return this;
    }

    public InputInfo setPreFill(String str) {
        this.mPreFill = str;
        return this;
    }

    public String toString() {
        return "InputInfo{mInputType=" + this.mInputType + ", mHint='" + this.mHint + "', mPreFill='" + this.mPreFill + "', mAllowEmptyInput=" + this.mAllowEmptyInput + '}';
    }

    public InputInfo(int i4, String str) {
        this.mInputType = i4;
        this.mHint = str;
        this.mPreFill = "";
        this.mAllowEmptyInput = false;
    }

    public InputInfo(int i4, String str, String str2, boolean z3) {
        this.mInputType = i4;
        this.mHint = str;
        this.mPreFill = str2;
        this.mAllowEmptyInput = z3;
    }
}
