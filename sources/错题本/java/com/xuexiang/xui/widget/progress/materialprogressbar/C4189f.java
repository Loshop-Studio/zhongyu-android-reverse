package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.f */
/* loaded from: classes3.dex */
public final class C4189f extends AbstractC4188e implements InterfaceC4204u {

    /* renamed from: l */
    public boolean f4746l;

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC4204u
    /* renamed from: a */
    public final boolean mo3559a() {
        return this.f4746l;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC4204u
    /* renamed from: b */
    public final void mo3560b(boolean z8) {
        if (this.f4746l != z8) {
            this.f4746l = z8;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC4187d, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f4746l) {
            super.draw(canvas);
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC4188e
    /* renamed from: h */
    public final void mo3558h(Canvas canvas, Paint paint) {
        canvas.drawArc(AbstractC4188e.f4745k, -90.0f, 360.0f, false, paint);
    }
}
