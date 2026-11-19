package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.d */
/* loaded from: classes4.dex */
public abstract class AbstractC6979d extends AbstractC6977b {

    /* renamed from: g */
    public Paint f8121g;

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6977b
    /* renamed from: f */
    public final void mo7122f(Canvas canvas, int i10, int i11) {
        if (this.f8121g == null) {
            Paint paint = new Paint();
            this.f8121g = paint;
            paint.setAntiAlias(true);
            this.f8121g.setColor(-16777216);
            mo7098i(this.f8121g);
        }
        this.f8121g.setAlpha(this.f8113a);
        this.f8121g.setColorFilter(m7121e());
        mo7097h(canvas, i10, i11, this.f8121g);
    }

    /* renamed from: h */
    public abstract void mo7097h(Canvas canvas, int i10, int i11, Paint paint);

    /* renamed from: i */
    public abstract void mo7098i(Paint paint);
}
