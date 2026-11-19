package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.i */
/* loaded from: classes3.dex */
public class C5956i extends AbstractC5954g implements InterfaceC5969v {

    /* renamed from: l */
    public boolean f5421l = true;

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC5969v
    /* renamed from: a */
    public boolean mo4923a() {
        return this.f5421l;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC5969v
    /* renamed from: b */
    public void mo4924b(boolean z6) {
        if (this.f5421l != z6) {
            this.f5421l = z6;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5949b, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f5421l) {
            super.draw(canvas);
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5954g
    /* renamed from: k */
    public void mo4945k(Canvas canvas, Paint paint) {
        m4944j(canvas, paint, 0.0f, 360.0f);
    }
}
