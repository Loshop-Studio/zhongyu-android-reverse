package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.g */
/* loaded from: classes4.dex */
public abstract class AbstractC6896g extends AbstractC6894e {

    /* renamed from: i */
    public static final RectF f7963i = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);

    /* renamed from: j */
    public static final RectF f7964j = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);

    /* renamed from: k */
    public static final RectF f7965k = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6893d
    /* renamed from: h */
    public void mo7005h(Canvas canvas, int i9, int i10, Paint paint) {
        if (this.f7958h) {
            RectF rectF = f7964j;
            canvas.scale(i9 / rectF.width(), i10 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f7963i;
            canvas.scale(i9 / rectF2.width(), i10 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        mo7034k(canvas, paint);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6893d
    /* renamed from: i */
    public void mo7006i(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
    }

    /* renamed from: j */
    public void m7033j(Canvas canvas, Paint paint, float f10, float f11) {
        canvas.drawArc(f7965k, f10 - 90.0f, f11, false, paint);
    }

    /* renamed from: k */
    public abstract void mo7034k(Canvas canvas, Paint paint);
}
