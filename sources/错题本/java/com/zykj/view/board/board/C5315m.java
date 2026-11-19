package com.zykj.view.board.board;

import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.view.board.board.m */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5315m implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f8245a;

    /* renamed from: b */
    public final /* synthetic */ BoardViewModel f8246b;

    public /* synthetic */ C5315m(BoardViewModel boardViewModel, int i) {
        this.f8245a = i;
        this.f8246b = boardViewModel;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8245a) {
            case 0:
                return BoardViewModel.initAreaMoveListener$lambda$45(this.f8246b, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            default:
                return BoardViewModel.initRevokeListener$lambda$51(this.f8246b, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
        }
    }
}
