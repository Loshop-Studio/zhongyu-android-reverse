package com.zykj.merge.sketch.view;

import com.zykj.merge.sketch.view.BlackBoardProxyView;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.merge.sketch.view.d */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4415d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5652a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6471c f5653b;

    /* renamed from: c */
    public final /* synthetic */ int f5654c;

    public /* synthetic */ RunnableC4415d(int i, int i8, InterfaceC6471c interfaceC6471c) {
        this.f5652a = i8;
        this.f5653b = interfaceC6471c;
        this.f5654c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5652a) {
            case 0:
                BlackBoardProxyView.C44081.m13829invoke$lambda0(this.f5653b, this.f5654c);
                break;
            default:
                OldSketchProxyView.m13839seekTo$lambda9$lambda6$lambda5(this.f5653b, this.f5654c);
                break;
        }
    }
}
