package com.xuexiang.xui.widget.progress.materialprogressbar;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.e */
/* loaded from: classes5.dex */
public abstract class AbstractC8213e extends AbstractC8212d implements InterfaceC8228t {

    /* renamed from: j */
    public boolean f16834j = true;

    /* renamed from: c */
    public void mo13120c(boolean z10) {
        if (this.f16834j != z10) {
            this.f16834j = z10;
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public boolean mo13121d() {
        return this.f16834j;
    }
}
