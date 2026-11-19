package com.zykj.merge.sketch.view;

import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.merge.sketch.view.e */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4416e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5655a;

    /* renamed from: b */
    public final /* synthetic */ OldSketchProxyView f5656b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC6471c f5657c;

    public /* synthetic */ RunnableC4416e(OldSketchProxyView oldSketchProxyView, InterfaceC6471c interfaceC6471c) {
        this.f5655a = 0;
        this.f5657c = interfaceC6471c;
        this.f5656b = oldSketchProxyView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5655a) {
            case 0:
                OldSketchProxyView.m13836loadData$lambda4$lambda3$lambda2(this.f5657c, this.f5656b);
                break;
            case 1:
                OldSketchProxyView.m13833loadData$lambda4$lambda1(this.f5656b, this.f5657c);
                break;
            default:
                OldSketchProxyView.m13835loadData$lambda4$lambda3(this.f5656b, this.f5657c);
                break;
        }
    }

    public /* synthetic */ RunnableC4416e(OldSketchProxyView oldSketchProxyView, InterfaceC6471c interfaceC6471c, int i) {
        this.f5655a = i;
        this.f5656b = oldSketchProxyView;
        this.f5657c = interfaceC6471c;
    }
}
