package com.xuexiang.xui.widget.edittext.materialedittext.validation;

import androidx.annotation.NonNull;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class RegexpValidator extends METValidator {
    private Pattern pattern;

    public RegexpValidator(@NonNull String str, @NonNull String str2) {
        super(str);
        this.pattern = Pattern.compile(str2);
    }

    @Override // com.xuexiang.xui.widget.edittext.materialedittext.validation.METValidator
    public boolean isValid(@NonNull CharSequence charSequence, boolean z10) {
        return this.pattern.matcher(charSequence).matches();
    }

    public RegexpValidator(@NonNull String str, @NonNull Pattern pattern) {
        super(str);
        this.pattern = pattern;
    }
}
