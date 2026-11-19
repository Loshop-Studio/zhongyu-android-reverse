package com.xuexiang.xui.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* renamed from: com.xuexiang.xui.utils.f */
/* loaded from: classes3.dex */
public final class C4156f implements LeadingMarginSpan {

    /* renamed from: a */
    public final int f3941a;

    public C4156f(int i) {
        this.f3941a = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i8, int i9, int i10, int i11, CharSequence charSequence, int i12, int i13, boolean z8, Layout layout) {
        Paint.Style style = paint.getStyle();
        int color = paint.getColor();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f3941a);
        canvas.drawRect(i, i9, i, i11, paint);
        paint.setStyle(style);
        paint.setColor(color);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z8) {
        return 0;
    }
}
