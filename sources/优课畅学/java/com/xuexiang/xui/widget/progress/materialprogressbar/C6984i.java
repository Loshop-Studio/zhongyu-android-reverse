package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.i */
/* loaded from: classes4.dex */
public class C6984i extends AbstractC6982g implements InterfaceC6997v {

    /* renamed from: l */
    public boolean f8134l = true;

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6997v
    /* renamed from: a */
    public boolean mo7104a() {
        return this.f8134l;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6997v
    /* renamed from: b */
    public void mo7105b(boolean z10) {
        if (this.f8134l != z10) {
            this.f8134l = z10;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6977b, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f8134l) {
            super.draw(canvas);
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6982g
    /* renamed from: k */
    public void mo7126k(Canvas canvas, Paint paint) {
        m7125j(canvas, paint, 0.0f, 360.0f);
    }
}
