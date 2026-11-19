package com.xuexiang.xui.widget.edittext.materialedittext.validation;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class RegexpValidator extends METValidator {
    private Pattern pattern;

    public RegexpValidator(String str, String str2) {
        super(str);
        this.pattern = Pattern.compile(str2);
    }

    @Override // com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator
    public boolean isValid(CharSequence charSequence, boolean z3) {
        return this.pattern.matcher(charSequence).matches();
    }

    public RegexpValidator(String str, Pattern pattern) {
        super(str);
        this.pattern = pattern;
    }
}
