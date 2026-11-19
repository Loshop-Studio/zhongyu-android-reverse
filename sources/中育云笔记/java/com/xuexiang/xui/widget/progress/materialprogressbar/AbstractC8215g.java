package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.g */
/* loaded from: classes5.dex */
public abstract class AbstractC8215g extends AbstractC8213e {

    /* renamed from: k */
    public static final RectF f16839k = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);

    /* renamed from: l */
    public static final RectF f16840l = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);

    /* renamed from: m */
    public static final RectF f16841m = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8212d
    /* renamed from: h */
    public void mo13122h(Canvas canvas, int i10, int i11, Paint paint) {
        if (this.f16834j) {
            RectF rectF = f16840l;
            canvas.scale(i10 / rectF.width(), i11 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f16839k;
            canvas.scale(i10 / rectF2.width(), i11 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        mo13151k(canvas, paint);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8212d
    /* renamed from: i */
    public void mo13123i(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
    }

    /* renamed from: j */
    public void m13150j(Canvas canvas, Paint paint, float f10, float f11) {
        canvas.drawArc(f16841m, f10 - 90.0f, f11, false, paint);
    }

    /* renamed from: k */
    public abstract void mo13151k(Canvas canvas, Paint paint);
}
