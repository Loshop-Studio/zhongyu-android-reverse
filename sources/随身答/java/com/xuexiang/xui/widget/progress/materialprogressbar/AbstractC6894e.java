package com.xuexiang.xui.widget.progress.materialprogressbar;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.e */
/* loaded from: classes4.dex */
public abstract class AbstractC6894e extends AbstractC6893d implements InterfaceC6909t {

    /* renamed from: h */
    public boolean f7958h = true;

    /* renamed from: c */
    public void mo7003c(boolean z9) {
        if (this.f7958h != z9) {
            this.f7958h = z9;
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public boolean mo7004d() {
        return this.f7958h;
    }
}
