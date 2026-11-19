package com.zykj.view.board.board;

import android.view.View;

/* renamed from: com.zykj.view.board.board.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC5305c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f8226a;

    /* renamed from: b */
    public final /* synthetic */ BoardFragment f8227b;

    /* renamed from: c */
    public final /* synthetic */ int f8228c;

    public /* synthetic */ ViewOnClickListenerC5305c(BoardFragment boardFragment, int i, int i8) {
        this.f8226a = i8;
        this.f8227b = boardFragment;
        this.f8228c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f8226a) {
            case 0:
                BoardFragment.initBackgroundClickListener$lambda$45$lambda$44(this.f8227b, this.f8228c, view);
                break;
            case 1:
                BoardFragment.initPenClickListener$lambda$28$lambda$27(this.f8227b, this.f8228c, view);
                break;
            case 2:
                BoardFragment.initEraserClickListener$lambda$33$lambda$32(this.f8227b, this.f8228c, view);
                break;
            default:
                BoardFragment.initPenClickListener$lambda$30$lambda$29(this.f8227b, this.f8228c, view);
                break;
        }
    }
}
