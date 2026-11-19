package com.xuexiang.xui.widget.progress.materialprogressbar;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.e */
/* loaded from: classes4.dex */
public abstract class AbstractC6980e extends AbstractC6979d implements InterfaceC6995t {

    /* renamed from: h */
    public boolean f8122h = true;

    /* renamed from: c */
    public void mo7095c(boolean z10) {
        if (this.f8122h != z10) {
            this.f8122h = z10;
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public boolean mo7096d() {
        return this.f8122h;
    }
}
