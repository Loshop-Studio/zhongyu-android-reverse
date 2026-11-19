package com.xuexiang.xui.widget.edittext.materialedittext.validation;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class NotAllowEmptyValidator extends METValidator {
    public NotAllowEmptyValidator(@NonNull String str) {
        super(str);
    }

    @Override // com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator
    public boolean isValid(@NonNull CharSequence charSequence, boolean z10) {
        return !z10;
    }
}
