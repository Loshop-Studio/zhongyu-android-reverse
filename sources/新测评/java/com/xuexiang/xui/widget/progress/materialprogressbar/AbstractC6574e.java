package com.xuexiang.xui.widget.progress.materialprogressbar;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.e */
/* loaded from: classes4.dex */
public abstract class AbstractC6574e extends AbstractC6573d implements InterfaceC6589t {

    /* renamed from: h */
    public boolean f6700h = true;

    /* renamed from: c */
    public void mo5905c(boolean z9) {
        if (this.f6700h != z9) {
            this.f6700h = z9;
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public boolean mo5906d() {
        return this.f6700h;
    }
}
