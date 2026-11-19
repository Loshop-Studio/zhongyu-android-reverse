package com.zykj.blackboard.core.canvas;

import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.blackboard.core.canvas.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4255b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5184a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6471c f5185b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f5186c;

    public /* synthetic */ RunnableC4255b(InterfaceC6471c interfaceC6471c, Throwable th, int i) {
        this.f5184a = i;
        this.f5185b = interfaceC6471c;
        this.f5186c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5184a) {
            case 0:
                SketchRecorderView$ready$1$1$2.m13753invoke$lambda0(this.f5185b, this.f5186c);
                break;
            default:
                SketchRecorderView$ready$2$1$2.m13755invoke$lambda0(this.f5185b, this.f5186c);
                break;
        }
    }
}
