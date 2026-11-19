package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.g */
/* loaded from: classes3.dex */
public abstract class AbstractC5954g extends AbstractC5952e {

    /* renamed from: i */
    public static final RectF f5414i = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);

    /* renamed from: j */
    public static final RectF f5415j = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);

    /* renamed from: k */
    public static final RectF f5416k = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5951d
    /* renamed from: h */
    public void mo4916h(Canvas canvas, int i6, int i7, Paint paint) {
        if (this.f5409h) {
            RectF rectF = f5415j;
            canvas.scale(i6 / rectF.width(), i7 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f5414i;
            canvas.scale(i6 / rectF2.width(), i7 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        mo4945k(canvas, paint);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5951d
    /* renamed from: i */
    public void mo4917i(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
    }

    /* renamed from: j */
    public void m4944j(Canvas canvas, Paint paint, float f6, float f7) {
        canvas.drawArc(f5416k, f6 - 90.0f, f7, false, paint);
    }

    /* renamed from: k */
    public abstract void mo4945k(Canvas canvas, Paint paint);
}
