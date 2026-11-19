package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.k */
/* loaded from: classes4.dex */
public class C6580k extends AbstractC6577h implements InterfaceC6591v {

    /* renamed from: m */
    public boolean f6713m;

    public C6580k(Context context) {
        super(context);
        this.f6713m = true;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6591v
    /* renamed from: a */
    public boolean mo5914a() {
        return this.f6713m;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6591v
    /* renamed from: b */
    public void mo5915b(boolean z9) {
        if (this.f6713m != z9) {
            this.f6713m = z9;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6571b, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f6713m) {
            super.draw(canvas);
        }
    }
}
