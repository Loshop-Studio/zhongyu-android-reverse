package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.h */
/* loaded from: classes4.dex */
public abstract class AbstractC6983h extends AbstractC6980e {

    /* renamed from: k */
    public static final RectF f8130k = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);

    /* renamed from: l */
    public static final RectF f8131l = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);

    /* renamed from: i */
    public int f8132i;

    /* renamed from: j */
    public int f8133j;

    public AbstractC6983h(Context context) {
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f8132i = Math.round(4.0f * f10);
        this.f8133j = Math.round(f10 * 16.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f8122h ? this.f8133j : this.f8132i;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6979d
    /* renamed from: h */
    public void mo7097h(Canvas canvas, int i10, int i11, Paint paint) {
        if (this.f8122h) {
            RectF rectF = f8131l;
            canvas.scale(i10 / rectF.width(), i11 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f8130k;
            canvas.scale(i10 / rectF2.width(), i11 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        mo7127j(canvas, paint);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6979d
    /* renamed from: i */
    public void mo7098i(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    /* renamed from: j */
    public void mo7127j(Canvas canvas, Paint paint) {
        canvas.drawRect(f8130k, paint);
    }
}
