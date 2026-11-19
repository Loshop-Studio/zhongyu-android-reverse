package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.i */
/* loaded from: classes2.dex */
public class C3617i extends AbstractC3615g implements InterfaceC3630v {

    /* renamed from: l */
    public boolean f3900l = true;

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3630v
    /* renamed from: a */
    public boolean mo4545a() {
        return this.f3900l;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3630v
    /* renamed from: b */
    public void mo4546b(boolean z3) {
        if (this.f3900l != z3) {
            this.f3900l = z3;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3610b, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f3900l) {
            super.draw(canvas);
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3615g
    /* renamed from: k */
    public void mo4567k(Canvas canvas, Paint paint) {
        m4566j(canvas, paint, 0.0f, 360.0f);
    }
}
