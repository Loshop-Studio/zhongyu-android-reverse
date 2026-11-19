package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* loaded from: classes3.dex */
class MaxInputValidator implements InputFilter {
    private int max;

    public MaxInputValidator(int i10) {
        this.max = i10;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i12, i13, charSequence.subSequence(i10, i11).toString());
            if (Integer.parseInt(sb.toString()) <= this.max) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }

    public int getMax() {
        return this.max;
    }

    public void setMax(int i10) {
        this.max = i10;
    }
}
