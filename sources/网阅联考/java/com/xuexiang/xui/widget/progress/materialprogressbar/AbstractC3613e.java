package com.xuexiang.xui.widget.progress.materialprogressbar;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.e */
/* loaded from: classes2.dex */
public abstract class AbstractC3613e extends AbstractC3612d implements InterfaceC3628t {

    /* renamed from: h */
    public boolean f3888h = true;

    /* renamed from: c */
    public boolean mo4536c() {
        return this.f3888h;
    }

    /* renamed from: d */
    public void mo4537d(boolean z3) {
        if (this.f3888h != z3) {
            this.f3888h = z3;
            invalidateSelf();
        }
    }
}
