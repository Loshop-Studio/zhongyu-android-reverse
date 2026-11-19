package com.zykj.merge.sketch.view;

import com.zykj.blackboard.core.play.IPlayPageControl;
import com.zykj.merge.sketch.view.BlackBoardProxyView;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.merge.sketch.view.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4412a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5644a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6471c f5645b;

    /* renamed from: c */
    public final /* synthetic */ Object f5646c;

    public /* synthetic */ RunnableC4412a(InterfaceC6471c interfaceC6471c, Object obj, int i) {
        this.f5644a = i;
        this.f5645b = interfaceC6471c;
        this.f5646c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5644a) {
            case 0:
                BlackBoardProxyView.C44071.AnonymousClass1.C68741.m13824invoke$lambda1$lambda0(this.f5645b, (IPlayPageControl) this.f5646c);
                break;
            default:
                OldSketchProxyView.m13841seekTo$lambda9$lambda8$lambda7(this.f5645b, (Exception) this.f5646c);
                break;
        }
    }
}
