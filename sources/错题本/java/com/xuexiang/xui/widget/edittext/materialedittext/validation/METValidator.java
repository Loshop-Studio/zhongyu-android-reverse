package com.xuexiang.xui.widget.edittext.materialedittext.validation;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public abstract class METValidator {
    protected String errorMessage;

    public METValidator(@NonNull String str) {
        this.errorMessage = str;
    }

    @NonNull
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public abstract boolean isValid(@NonNull CharSequence charSequence, boolean z8);

    public void setErrorMessage(@NonNull String str) {
        this.errorMessage = str;
    }
}
