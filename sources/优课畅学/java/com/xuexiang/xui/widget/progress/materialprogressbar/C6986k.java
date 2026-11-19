package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.k */
/* loaded from: classes4.dex */
public class C6986k extends AbstractC6983h implements InterfaceC6997v {

    /* renamed from: m */
    public boolean f8135m;

    public C6986k(Context context) {
        super(context);
        this.f8135m = true;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6997v
    /* renamed from: a */
    public boolean mo7104a() {
        return this.f8135m;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6997v
    /* renamed from: b */
    public void mo7105b(boolean z10) {
        if (this.f8135m != z10) {
            this.f8135m = z10;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6977b, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f8135m) {
            super.draw(canvas);
        }
    }
}
