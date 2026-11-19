package com.zykj.sketch.core.player;

import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.sketch.core.player.e */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC5194e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8166a;

    /* renamed from: b */
    public final /* synthetic */ SketchPlayerView f8167b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC6471c f8168c;

    /* renamed from: d */
    public final /* synthetic */ int f8169d;

    public /* synthetic */ RunnableC5194e(SketchPlayerView sketchPlayerView, InterfaceC6471c interfaceC6471c, int i, int i8) {
        this.f8166a = i8;
        this.f8167b = sketchPlayerView;
        this.f8168c = interfaceC6471c;
        this.f8169d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8166a) {
            case 0:
                SketchPlayerView$loadData$1$1$1.m13874invoke$lambda1(this.f8167b, this.f8168c, this.f8169d);
                break;
            default:
                SketchPlayerView.m13870seekTo$lambda22$lambda18$lambda17(this.f8167b, this.f8168c, this.f8169d);
                break;
        }
    }
}
