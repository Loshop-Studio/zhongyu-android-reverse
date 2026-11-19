package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.h */
/* loaded from: classes4.dex */
public abstract class AbstractC6577h extends AbstractC6574e {

    /* renamed from: k */
    public static final RectF f6708k = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);

    /* renamed from: l */
    public static final RectF f6709l = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);

    /* renamed from: i */
    public int f6710i;

    /* renamed from: j */
    public int f6711j;

    public AbstractC6577h(Context context) {
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f6710i = Math.round(4.0f * f10);
        this.f6711j = Math.round(f10 * 16.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f6700h ? this.f6711j : this.f6710i;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6573d
    /* renamed from: h */
    public void mo5907h(Canvas canvas, int i10, int i11, Paint paint) {
        if (this.f6700h) {
            RectF rectF = f6709l;
            canvas.scale(i10 / rectF.width(), i11 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f6708k;
            canvas.scale(i10 / rectF2.width(), i11 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        mo5937j(canvas, paint);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6573d
    /* renamed from: i */
    public void mo5908i(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    /* renamed from: j */
    public void mo5937j(Canvas canvas, Paint paint) {
        canvas.drawRect(f6708k, paint);
    }
}
