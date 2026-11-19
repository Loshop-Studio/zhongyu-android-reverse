package com.xuexiang.xui.widget.progress.materialprogressbar;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.e */
/* loaded from: classes3.dex */
public abstract class AbstractC5952e extends AbstractC5951d implements InterfaceC5967t {

    /* renamed from: h */
    public boolean f5409h = true;

    /* renamed from: c */
    public void mo4914c(boolean z6) {
        if (this.f5409h != z6) {
            this.f5409h = z6;
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public boolean mo4915d() {
        return this.f5409h;
    }
}
