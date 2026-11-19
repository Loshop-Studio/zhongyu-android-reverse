package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.view.ViewCompat;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.d */
/* loaded from: classes3.dex */
public abstract class AbstractC5951d extends AbstractC5949b {

    /* renamed from: g */
    public Paint f5408g;

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5949b
    /* renamed from: f */
    public final void mo4941f(Canvas canvas, int i6, int i7) {
        if (this.f5408g == null) {
            Paint paint = new Paint();
            this.f5408g = paint;
            paint.setAntiAlias(true);
            this.f5408g.setColor(ViewCompat.MEASURED_STATE_MASK);
            mo4917i(this.f5408g);
        }
        this.f5408g.setAlpha(this.f5400a);
        this.f5408g.setColorFilter(m4940e());
        mo4916h(canvas, i6, i7, this.f5408g);
    }

    /* renamed from: h */
    public abstract void mo4916h(Canvas canvas, int i6, int i7, Paint paint);

    /* renamed from: i */
    public abstract void mo4917i(Paint paint);
}
