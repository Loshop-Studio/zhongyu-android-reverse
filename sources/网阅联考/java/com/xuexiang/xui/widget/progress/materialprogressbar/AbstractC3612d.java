package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.view.ViewCompat;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.d */
/* loaded from: classes2.dex */
public abstract class AbstractC3612d extends AbstractC3610b {

    /* renamed from: g */
    public Paint f3887g;

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3610b
    /* renamed from: f */
    public final void mo4563f(Canvas canvas, int i4, int i5) {
        if (this.f3887g == null) {
            Paint paint = new Paint();
            this.f3887g = paint;
            paint.setAntiAlias(true);
            this.f3887g.setColor(ViewCompat.MEASURED_STATE_MASK);
            mo4539i(this.f3887g);
        }
        this.f3887g.setAlpha(this.f3879a);
        this.f3887g.setColorFilter(m4562e());
        mo4538h(canvas, i4, i5, this.f3887g);
    }

    /* renamed from: h */
    public abstract void mo4538h(Canvas canvas, int i4, int i5, Paint paint);

    /* renamed from: i */
    public abstract void mo4539i(Paint paint);
}
