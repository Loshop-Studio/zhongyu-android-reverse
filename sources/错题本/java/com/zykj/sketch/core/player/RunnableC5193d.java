package com.zykj.sketch.core.player;

import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.sketch.core.player.d */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC5193d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8163a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6471c f8164b;

    /* renamed from: c */
    public final /* synthetic */ int f8165c;

    public /* synthetic */ RunnableC5193d(int i, int i8, InterfaceC6471c interfaceC6471c) {
        this.f8163a = i8;
        this.f8164b = interfaceC6471c;
        this.f8165c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8163a) {
            case 0:
                SketchPlayerView$loadData$1$1$1.m13875invoke$lambda1$lambda0(this.f8164b, this.f8165c);
                break;
            default:
                SketchPlayerView.m13871seekTo$lambda22$lambda18$lambda17$lambda16(this.f8164b, this.f8165c);
                break;
        }
    }
}
