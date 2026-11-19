package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.e */
/* loaded from: classes3.dex */
public abstract class AbstractC4188e extends AbstractC4187d {

    /* renamed from: i */
    public static final RectF f4743i = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);

    /* renamed from: j */
    public static final RectF f4744j = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);

    /* renamed from: k */
    public static final RectF f4745k = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC4187d
    /* renamed from: e */
    public final void mo3555e(Canvas canvas, Paint paint, int i, int i8) {
        if (this.f4742h) {
            RectF rectF = f4744j;
            canvas.scale(i / rectF.width(), i8 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f4743i;
            canvas.scale(i / rectF2.width(), i8 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        mo3558h(canvas, paint);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC4187d
    /* renamed from: f */
    public final void mo3556f(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
    }

    /* renamed from: h */
    public abstract void mo3558h(Canvas canvas, Paint paint);
}
