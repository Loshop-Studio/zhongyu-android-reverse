package com.zykj.merge.sketch.view;

import com.zykj.merge.sketch.view.BlackBoardProxyView;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.merge.sketch.view.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4414c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5649a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6471c f5650b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f5651c;

    public /* synthetic */ RunnableC4414c(InterfaceC6471c interfaceC6471c, Throwable th, int i) {
        this.f5649a = i;
        this.f5650b = interfaceC6471c;
        this.f5651c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5649a) {
            case 0:
                BlackBoardProxyView.C44071.AnonymousClass2.m13828invoke$lambda0(this.f5650b, this.f5651c);
                break;
            default:
                BlackBoardProxyView.C44092.m13831invoke$lambda0(this.f5650b, this.f5651c);
                break;
        }
    }
}
