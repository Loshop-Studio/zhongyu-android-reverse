package com.zykj.view.board.play;

import com.zykj.view.board.play.SketchPlayFragment;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.view.board.play.k */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5362k implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f8310a;

    /* renamed from: b */
    public final /* synthetic */ Object f8311b;

    public /* synthetic */ C5362k(Object obj, int i) {
        this.f8310a = i;
        this.f8311b = obj;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        switch (this.f8310a) {
            case 0:
                return SketchPlayFragment.C53451.invokeSuspend$lambda$1((InterfaceC6469a) this.f8311b, (Throwable) obj);
            default:
                return PlaySpeedRatePopup.speedRateAdapter$lambda$0((PlaySpeedRatePopup) this.f8311b, (SpeedRate) obj);
        }
    }
}
