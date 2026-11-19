package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.g */
/* loaded from: classes4.dex */
public abstract class AbstractC6576g extends AbstractC6574e {

    /* renamed from: i */
    public static final RectF f6705i = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);

    /* renamed from: j */
    public static final RectF f6706j = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);

    /* renamed from: k */
    public static final RectF f6707k = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6573d
    /* renamed from: h */
    public void mo5907h(Canvas canvas, int i10, int i11, Paint paint) {
        if (this.f6700h) {
            RectF rectF = f6706j;
            canvas.scale(i10 / rectF.width(), i11 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f6705i;
            canvas.scale(i10 / rectF2.width(), i11 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        mo5936k(canvas, paint);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6573d
    /* renamed from: i */
    public void mo5908i(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
    }

    /* renamed from: j */
    public void m5935j(Canvas canvas, Paint paint, float f10, float f11) {
        canvas.drawArc(f6707k, f10 - 90.0f, f11, false, paint);
    }

    /* renamed from: k */
    public abstract void mo5936k(Canvas canvas, Paint paint);
}
