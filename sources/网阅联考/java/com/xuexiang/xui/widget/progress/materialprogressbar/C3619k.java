package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.k */
/* loaded from: classes2.dex */
public class C3619k extends AbstractC3616h implements InterfaceC3630v {

    /* renamed from: m */
    public boolean f3901m;

    public C3619k(Context context) {
        super(context);
        this.f3901m = true;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3630v
    /* renamed from: a */
    public boolean mo4545a() {
        return this.f3901m;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3630v
    /* renamed from: b */
    public void mo4546b(boolean z3) {
        if (this.f3901m != z3) {
            this.f3901m = z3;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3610b, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f3901m) {
            super.draw(canvas);
        }
    }
}
