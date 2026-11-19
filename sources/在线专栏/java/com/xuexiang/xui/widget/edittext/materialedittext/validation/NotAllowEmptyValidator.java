package com.xuexiang.xui.widget.edittext.materialedittext.validation;

/* loaded from: classes.dex */
public class NotAllowEmptyValidator extends METValidator {
    public NotAllowEmptyValidator(String str) {
        super(str);
    }

    @Override // com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator
    public boolean isValid(CharSequence charSequence, boolean z3) {
        return !z3;
    }
}
