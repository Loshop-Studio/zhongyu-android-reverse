package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.k */
/* loaded from: classes3.dex */
public class C5958k extends AbstractC5955h implements InterfaceC5969v {

    /* renamed from: m */
    public boolean f5422m;

    public C5958k(Context context) {
        super(context);
        this.f5422m = true;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC5969v
    /* renamed from: a */
    public boolean mo4923a() {
        return this.f5422m;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC5969v
    /* renamed from: b */
    public void mo4924b(boolean z6) {
        if (this.f5422m != z6) {
            this.f5422m = z6;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5949b, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f5422m) {
            super.draw(canvas);
        }
    }
}
