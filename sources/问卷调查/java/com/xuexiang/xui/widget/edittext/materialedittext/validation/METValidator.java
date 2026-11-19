package com.xuexiang.xui.widget.edittext.materialedittext.validation;

/* loaded from: classes.dex */
public abstract class METValidator {
    public String errorMessage;

    public METValidator(String str) {
        this.errorMessage = str;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public abstract boolean isValid(CharSequence charSequence, boolean z);

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }
}
