package com.xuexiang.xui.utils;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.LineHeightSpan;

/* renamed from: com.xuexiang.xui.utils.e */
/* loaded from: classes3.dex */
public final class C4155e extends CharacterStyle implements LineHeightSpan {

    /* renamed from: a */
    public final int f3940a;

    public C4155e(int i) {
        this.f3940a = i;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i8, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        int i11 = fontMetricsInt.descent + i10;
        int i12 = fontMetricsInt.ascent;
        int i13 = this.f3940a;
        int i14 = i13 - ((i11 - i12) - i9);
        if (i14 > 0) {
            fontMetricsInt.ascent = i12 - i14;
        }
        int i15 = i10 + fontMetricsInt.bottom;
        int i16 = fontMetricsInt.top;
        int i17 = i13 - ((i15 - i16) - i9);
        if (i17 > 0) {
            fontMetricsInt.top = i16 - i17;
        }
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }
}
