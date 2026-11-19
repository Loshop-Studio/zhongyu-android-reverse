package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.view.ViewCompat;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.d */
/* loaded from: classes4.dex */
public abstract class AbstractC6573d extends AbstractC6571b {

    /* renamed from: g */
    public Paint f6699g;

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6571b
    /* renamed from: f */
    public final void mo5932f(Canvas canvas, int i10, int i11) {
        if (this.f6699g == null) {
            Paint paint = new Paint();
            this.f6699g = paint;
            paint.setAntiAlias(true);
            this.f6699g.setColor(ViewCompat.MEASURED_STATE_MASK);
            mo5908i(this.f6699g);
        }
        this.f6699g.setAlpha(this.f6691a);
        this.f6699g.setColorFilter(m5931e());
        mo5907h(canvas, i10, i11, this.f6699g);
    }

    /* renamed from: h */
    public abstract void mo5907h(Canvas canvas, int i10, int i11, Paint paint);

    /* renamed from: i */
    public abstract void mo5908i(Paint paint);
}
