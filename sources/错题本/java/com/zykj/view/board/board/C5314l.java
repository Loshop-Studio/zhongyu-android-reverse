package com.zykj.view.board.board;

import p152r6.InterfaceC6469a;

/* renamed from: com.zykj.view.board.board.l */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5314l implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f8243a;

    /* renamed from: b */
    public final /* synthetic */ BoardViewModel f8244b;

    public /* synthetic */ C5314l(BoardViewModel boardViewModel, int i) {
        this.f8243a = i;
        this.f8244b = boardViewModel;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        switch (this.f8243a) {
            case 0:
                return BoardViewModel.initAreaMoveListener$lambda$43(this.f8244b);
            case 1:
                return BoardViewModel.initAreaMoveListener$lambda$47(this.f8244b);
            case 2:
                return BoardViewModel.initRecordListener$lambda$32(this.f8244b);
            case 3:
                return BoardViewModel.initRecordListener$lambda$36(this.f8244b);
            default:
                return BoardViewModel.dropDraftCache$lambda$104(this.f8244b);
        }
    }
}
