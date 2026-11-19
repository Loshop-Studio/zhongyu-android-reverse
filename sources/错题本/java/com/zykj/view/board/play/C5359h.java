package com.zykj.view.board.play;

import com.zykj.view.board.play.SketchPlayFragment;
import p045d6.InterfaceC5428d;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.view.board.play.h */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5359h implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f8299a;

    /* renamed from: b */
    public final /* synthetic */ boolean f8300b;

    /* renamed from: c */
    public final /* synthetic */ SketchPlayFragment f8301c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC5428d f8302d;

    public /* synthetic */ C5359h(boolean z8, SketchPlayFragment sketchPlayFragment, InterfaceC5428d interfaceC5428d, int i) {
        this.f8299a = i;
        this.f8300b = z8;
        this.f8301c = sketchPlayFragment;
        this.f8302d = interfaceC5428d;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        switch (this.f8299a) {
            case 0:
                return SketchPlayFragment$play$1$1.invokeSuspend$lambda$2(this.f8300b, this.f8301c, (InterfaceC6471c) this.f8302d, (Throwable) obj);
            default:
                return SketchPlayFragment.C53451.invokeSuspend$lambda$0(this.f8300b, this.f8301c, (InterfaceC6469a) this.f8302d, ((Integer) obj).intValue());
        }
    }
}
