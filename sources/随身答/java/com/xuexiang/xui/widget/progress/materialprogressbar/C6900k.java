package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.k */
/* loaded from: classes4.dex */
public class C6900k extends AbstractC6897h implements InterfaceC6911v {

    /* renamed from: m */
    public boolean f7971m;

    public C6900k(Context context) {
        super(context);
        this.f7971m = true;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6911v
    /* renamed from: a */
    public boolean mo7012a() {
        return this.f7971m;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6911v
    /* renamed from: b */
    public void mo7013b(boolean z9) {
        if (this.f7971m != z9) {
            this.f7971m = z9;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6891b, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f7971m) {
            super.draw(canvas);
        }
    }
}
