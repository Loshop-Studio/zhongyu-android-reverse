package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.view.ViewCompat;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.d */
/* loaded from: classes5.dex */
public abstract class AbstractC8212d extends AbstractC8210b {

    /* renamed from: i */
    public Paint f16833i;

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8210b
    /* renamed from: f */
    public final void mo13147f(Canvas canvas, int i10, int i11) {
        if (this.f16833i == null) {
            Paint paint = new Paint();
            this.f16833i = paint;
            paint.setAntiAlias(true);
            this.f16833i.setColor(ViewCompat.MEASURED_STATE_MASK);
            mo13123i(this.f16833i);
        }
        this.f16833i.setAlpha(this.f16825c);
        this.f16833i.setColorFilter(m13146e());
        mo13122h(canvas, i10, i11, this.f16833i);
    }

    /* renamed from: h */
    public abstract void mo13122h(Canvas canvas, int i10, int i11, Paint paint);

    /* renamed from: i */
    public abstract void mo13123i(Paint paint);
}
