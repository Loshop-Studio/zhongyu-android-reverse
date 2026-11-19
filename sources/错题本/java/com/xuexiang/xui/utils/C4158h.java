package com.xuexiang.xui.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: com.xuexiang.xui.utils.h */
/* loaded from: classes3.dex */
public final class C4158h extends ReplacementSpan {

    /* renamed from: a */
    public final int f3943a;

    public C4158h(int i) {
        this.f3943a = i;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i8, float f, int i9, int i10, int i11, Paint paint) {
        Paint.Style style = paint.getStyle();
        int color = paint.getColor();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(0);
        canvas.drawRect(f, i9, f + this.f3943a, i11, paint);
        paint.setStyle(style);
        paint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i8, Paint.FontMetricsInt fontMetricsInt) {
        return this.f3943a;
    }
}
