package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.i */
/* loaded from: classes5.dex */
public class C8217i extends AbstractC8215g implements InterfaceC8230v {

    /* renamed from: n */
    public boolean f16846n = true;

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8230v
    /* renamed from: a */
    public boolean mo13129a() {
        return this.f16846n;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8230v
    /* renamed from: b */
    public void mo13130b(boolean z10) {
        if (this.f16846n != z10) {
            this.f16846n = z10;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8210b, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f16846n) {
            super.draw(canvas);
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8215g
    /* renamed from: k */
    public void mo13151k(Canvas canvas, Paint paint) {
        m13150j(canvas, paint, 0.0f, 360.0f);
    }
}
