package com.xuexiang.xui.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* renamed from: com.xuexiang.xui.utils.c */
/* loaded from: classes3.dex */
public final class C4153c implements LeadingMarginSpan {

    /* renamed from: a */
    public final int f3934a;

    /* renamed from: b */
    public Path f3935b = null;

    public C4153c(int i) {
        this.f3934a = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i8, int i9, int i10, int i11, CharSequence charSequence, int i12, int i13, boolean z8, Layout layout) {
        if (((Spanned) charSequence).getSpanStart(this) == i12) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setColor(this.f3934a);
            paint.setStyle(Paint.Style.FILL);
            if (canvas.isHardwareAccelerated()) {
                if (this.f3935b == null) {
                    Path path = new Path();
                    this.f3935b = path;
                    path.addCircle(0.0f, 0.0f, 0, Path.Direction.CW);
                }
                canvas.save();
                canvas.translate(i, (i9 + i11) / 2.0f);
                canvas.drawPath(this.f3935b, paint);
                canvas.restore();
            } else {
                canvas.drawCircle(i, (i9 + i11) / 2.0f, 0, paint);
            }
            paint.setColor(color);
            paint.setStyle(style);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z8) {
        return 0;
    }
}
