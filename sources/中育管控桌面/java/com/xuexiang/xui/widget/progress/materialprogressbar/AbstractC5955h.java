package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.h */
/* loaded from: classes3.dex */
public abstract class AbstractC5955h extends AbstractC5952e {

    /* renamed from: k */
    public static final RectF f5417k = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);

    /* renamed from: l */
    public static final RectF f5418l = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);

    /* renamed from: i */
    public int f5419i;

    /* renamed from: j */
    public int f5420j;

    public AbstractC5955h(Context context) {
        float f6 = context.getResources().getDisplayMetrics().density;
        this.f5419i = Math.round(4.0f * f6);
        this.f5420j = Math.round(f6 * 16.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f5409h ? this.f5420j : this.f5419i;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5951d
    /* renamed from: h */
    public void mo4916h(Canvas canvas, int i6, int i7, Paint paint) {
        if (this.f5409h) {
            RectF rectF = f5418l;
            canvas.scale(i6 / rectF.width(), i7 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f5417k;
            canvas.scale(i6 / rectF2.width(), i7 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        mo4946j(canvas, paint);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5951d
    /* renamed from: i */
    public void mo4917i(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    /* renamed from: j */
    public void mo4946j(Canvas canvas, Paint paint) {
        canvas.drawRect(f5417k, paint);
    }
}
