package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.view.ViewCompat;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.d */
/* loaded from: classes4.dex */
public abstract class AbstractC6893d extends AbstractC6891b {

    /* renamed from: g */
    public Paint f7957g;

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6891b
    /* renamed from: f */
    public final void mo7030f(Canvas canvas, int i9, int i10) {
        if (this.f7957g == null) {
            Paint paint = new Paint();
            this.f7957g = paint;
            paint.setAntiAlias(true);
            this.f7957g.setColor(ViewCompat.MEASURED_STATE_MASK);
            mo7006i(this.f7957g);
        }
        this.f7957g.setAlpha(this.f7949a);
        this.f7957g.setColorFilter(m7029e());
        mo7005h(canvas, i9, i10, this.f7957g);
    }

    /* renamed from: h */
    public abstract void mo7005h(Canvas canvas, int i9, int i10, Paint paint);

    /* renamed from: i */
    public abstract void mo7006i(Paint paint);
}
