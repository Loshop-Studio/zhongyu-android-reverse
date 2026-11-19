package com.zykj.view.board.board;

import p152r6.InterfaceC6469a;

/* renamed from: com.zykj.view.board.board.f */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5308f implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f8234a;

    /* renamed from: b */
    public final /* synthetic */ BoardFragment f8235b;

    public /* synthetic */ C5308f(BoardFragment boardFragment, int i) {
        this.f8234a = i;
        this.f8235b = boardFragment;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        switch (this.f8234a) {
            case 0:
                return BoardFragment.initMainClickListener$lambda$19$lambda$18$lambda$17(this.f8235b);
            case 1:
                return BoardFragment.initGraphClickListener$lambda$43$lambda$37$lambda$36(this.f8235b);
            case 2:
                return BoardFragment.initDismissCustomColorPaletteOnSketchTouch$lambda$63(this.f8235b);
            case 3:
                return BoardFragment.initExtraClickListener$lambda$59$lambda$50$lambda$49(this.f8235b);
            case 4:
                return BoardFragment.initGraphClickListener$lambda$43$lambda$35$lambda$34(this.f8235b);
            case 5:
                return BoardFragment.initProgressBarTouchListener$lambda$64(this.f8235b);
            default:
                return BoardFragment.initProgressBarTouchListener$lambda$67(this.f8235b);
        }
    }
}
