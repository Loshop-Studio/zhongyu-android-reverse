package com.zykj.sketch.core.graph;

/* renamed from: com.zykj.sketch.core.graph.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC5187a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8154a;

    /* renamed from: b */
    public final /* synthetic */ WebViewGraph f8155b;

    public /* synthetic */ RunnableC5187a(WebViewGraph webViewGraph, int i) {
        this.f8154a = i;
        this.f8155b = webViewGraph;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8154a) {
            case 0:
                WebViewGraph.m13852_init_$lambda1(this.f8155b);
                break;
            case 1:
                WebViewGraph.m13854startRefresh$lambda6(this.f8155b);
                break;
            default:
                WebViewGraph.m13853lambda1$lambda0(this.f8155b);
                break;
        }
    }
}
