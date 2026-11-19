package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.k */
/* loaded from: classes5.dex */
public class C8219k extends AbstractC8216h implements InterfaceC8230v {

    /* renamed from: o */
    public boolean f16847o;

    public C8219k(Context context) {
        super(context);
        this.f16847o = true;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8230v
    /* renamed from: a */
    public boolean mo13129a() {
        return this.f16847o;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8230v
    /* renamed from: b */
    public void mo13130b(boolean z10) {
        if (this.f16847o != z10) {
            this.f16847o = z10;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8210b, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f16847o) {
            super.draw(canvas);
        }
    }
}
