package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.h */
/* loaded from: classes5.dex */
public abstract class AbstractC8216h extends AbstractC8213e {

    /* renamed from: m */
    public static final RectF f16842m = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);

    /* renamed from: n */
    public static final RectF f16843n = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);

    /* renamed from: k */
    public int f16844k;

    /* renamed from: l */
    public int f16845l;

    public AbstractC8216h(Context context) {
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f16844k = Math.round(4.0f * f10);
        this.f16845l = Math.round(f10 * 16.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f16834j ? this.f16845l : this.f16844k;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8212d
    /* renamed from: h */
    public void mo13122h(Canvas canvas, int i10, int i11, Paint paint) {
        if (this.f16834j) {
            RectF rectF = f16843n;
            canvas.scale(i10 / rectF.width(), i11 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f16842m;
            canvas.scale(i10 / rectF2.width(), i11 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        mo13152j(canvas, paint);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8212d
    /* renamed from: i */
    public void mo13123i(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    /* renamed from: j */
    public void mo13152j(Canvas canvas, Paint paint) {
        canvas.drawRect(f16842m, paint);
    }
}
