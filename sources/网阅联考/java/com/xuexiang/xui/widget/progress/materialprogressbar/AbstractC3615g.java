package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.g */
/* loaded from: classes2.dex */
public abstract class AbstractC3615g extends AbstractC3613e {

    /* renamed from: i */
    public static final RectF f3893i = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);

    /* renamed from: j */
    public static final RectF f3894j = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);

    /* renamed from: k */
    public static final RectF f3895k = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3612d
    /* renamed from: h */
    public void mo4538h(Canvas canvas, int i4, int i5, Paint paint) {
        if (this.f3888h) {
            RectF rectF = f3894j;
            canvas.scale(i4 / rectF.width(), i5 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f3893i;
            canvas.scale(i4 / rectF2.width(), i5 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        mo4567k(canvas, paint);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3612d
    /* renamed from: i */
    public void mo4539i(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
    }

    /* renamed from: j */
    public void m4566j(Canvas canvas, Paint paint, float f4, float f5) {
        canvas.drawArc(f3895k, f4 - 90.0f, f5, false, paint);
    }

    /* renamed from: k */
    public abstract void mo4567k(Canvas canvas, Paint paint);
}
