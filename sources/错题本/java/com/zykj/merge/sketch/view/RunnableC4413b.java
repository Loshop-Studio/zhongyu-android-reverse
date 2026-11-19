package com.zykj.merge.sketch.view;

import com.zykj.merge.sketch.view.BlackBoardProxyView;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.merge.sketch.view.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4413b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5647a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6471c f5648b;

    public /* synthetic */ RunnableC4413b(InterfaceC6471c interfaceC6471c, int i) {
        this.f5647a = i;
        this.f5648b = interfaceC6471c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5647a) {
            case 0:
                BlackBoardProxyView.C44071.AnonymousClass1.AnonymousClass2.m13826invoke$lambda0(this.f5648b);
                break;
            case 1:
                BlackBoardProxyView.m13823seekTo$lambda0(this.f5648b);
                break;
            default:
                OldSketchProxyView.m13834loadData$lambda4$lambda1$lambda0(this.f5648b);
                break;
        }
    }
}
