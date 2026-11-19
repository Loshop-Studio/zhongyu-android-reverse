package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.h */
/* loaded from: classes4.dex */
public abstract class AbstractC6897h extends AbstractC6894e {

    /* renamed from: k */
    public static final RectF f7966k = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);

    /* renamed from: l */
    public static final RectF f7967l = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);

    /* renamed from: i */
    public int f7968i;

    /* renamed from: j */
    public int f7969j;

    public AbstractC6897h(Context context) {
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f7968i = Math.round(4.0f * f10);
        this.f7969j = Math.round(f10 * 16.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f7958h ? this.f7969j : this.f7968i;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6893d
    /* renamed from: h */
    public void mo7005h(Canvas canvas, int i9, int i10, Paint paint) {
        if (this.f7958h) {
            RectF rectF = f7967l;
            canvas.scale(i9 / rectF.width(), i10 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f7966k;
            canvas.scale(i9 / rectF2.width(), i10 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        mo7035j(canvas, paint);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6893d
    /* renamed from: i */
    public void mo7006i(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    /* renamed from: j */
    public void mo7035j(Canvas canvas, Paint paint) {
        canvas.drawRect(f7966k, paint);
    }
}
