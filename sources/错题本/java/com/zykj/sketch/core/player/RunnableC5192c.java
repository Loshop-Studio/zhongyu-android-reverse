package com.zykj.sketch.core.player;

import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.sketch.core.player.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC5192c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8158a;

    /* renamed from: b */
    public final /* synthetic */ SketchPlayerView f8159b;

    /* renamed from: c */
    public final /* synthetic */ String f8160c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC6471c f8161d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC6471c f8162e;

    public /* synthetic */ RunnableC5192c(SketchPlayerView sketchPlayerView, String str, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, int i) {
        this.f8158a = i;
        this.f8159b = sketchPlayerView;
        this.f8160c = str;
        this.f8161d = interfaceC6471c;
        this.f8162e = interfaceC6471c2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.f8158a) {
            case 0:
                SketchPlayerView.m13858loadData$lambda13(this.f8159b, this.f8160c, this.f8161d, this.f8162e);
                break;
            default:
                SketchPlayerView.m13859loadData$lambda13$lambda12(this.f8159b, this.f8160c, this.f8161d, this.f8162e);
                break;
        }
    }
}
