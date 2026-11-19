package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

@SuppressLint({"ParcelCreator"})
/* loaded from: classes2.dex */
class SpanUtils$CustomTypefaceSpan extends TypefaceSpan {
    /* renamed from: a */
    public static void m2292a(TextPaint textPaint) {
        Typeface typeface = textPaint.getTypeface();
        if (typeface != null) {
            typeface.getStyle();
        }
        throw null;
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        m2292a(textPaint);
        throw null;
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        m2292a(textPaint);
        throw null;
    }
}
