package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.i */
/* loaded from: classes4.dex */
public class C6578i extends AbstractC6576g implements InterfaceC6591v {

    /* renamed from: l */
    public boolean f6712l = true;

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6591v
    /* renamed from: a */
    public boolean mo5914a() {
        return this.f6712l;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6591v
    /* renamed from: b */
    public void mo5915b(boolean z9) {
        if (this.f6712l != z9) {
            this.f6712l = z9;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6571b, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f6712l) {
            super.draw(canvas);
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6576g
    /* renamed from: k */
    public void mo5936k(Canvas canvas, Paint paint) {
        m5935j(canvas, paint, 0.0f, 360.0f);
    }
}
