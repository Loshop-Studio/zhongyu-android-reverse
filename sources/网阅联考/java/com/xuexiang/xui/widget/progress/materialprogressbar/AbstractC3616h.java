package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.h */
/* loaded from: classes2.dex */
public abstract class AbstractC3616h extends AbstractC3613e {

    /* renamed from: k */
    public static final RectF f3896k = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);

    /* renamed from: l */
    public static final RectF f3897l = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);

    /* renamed from: i */
    public int f3898i;

    /* renamed from: j */
    public int f3899j;

    public AbstractC3616h(Context context) {
        float f4 = context.getResources().getDisplayMetrics().density;
        this.f3898i = Math.round(4.0f * f4);
        this.f3899j = Math.round(f4 * 16.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3888h ? this.f3899j : this.f3898i;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3612d
    /* renamed from: h */
    public void mo4538h(Canvas canvas, int i4, int i5, Paint paint) {
        if (this.f3888h) {
            RectF rectF = f3897l;
            canvas.scale(i4 / rectF.width(), i5 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f3896k;
            canvas.scale(i4 / rectF2.width(), i5 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        mo4568j(canvas, paint);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3612d
    /* renamed from: i */
    public void mo4539i(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    /* renamed from: j */
    public void mo4568j(Canvas canvas, Paint paint) {
        canvas.drawRect(f3896k, paint);
    }
}
