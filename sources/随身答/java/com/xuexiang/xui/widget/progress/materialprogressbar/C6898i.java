package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.i */
/* loaded from: classes4.dex */
public class C6898i extends AbstractC6896g implements InterfaceC6911v {

    /* renamed from: l */
    public boolean f7970l = true;

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6911v
    /* renamed from: a */
    public boolean mo7012a() {
        return this.f7970l;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6911v
    /* renamed from: b */
    public void mo7013b(boolean z9) {
        if (this.f7970l != z9) {
            this.f7970l = z9;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6891b, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f7970l) {
            super.draw(canvas);
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6896g
    /* renamed from: k */
    public void mo7034k(Canvas canvas, Paint paint) {
        m7033j(canvas, paint, 0.0f, 360.0f);
    }
}
