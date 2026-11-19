package com.zykj.view.board.simple;

import android.view.View;

/* renamed from: com.zykj.view.board.simple.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC5375b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f8314a;

    /* renamed from: b */
    public final /* synthetic */ SimpleFragment f8315b;

    /* renamed from: c */
    public final /* synthetic */ int f8316c;

    public /* synthetic */ ViewOnClickListenerC5375b(SimpleFragment simpleFragment, int i, int i8) {
        this.f8314a = i8;
        this.f8315b = simpleFragment;
        this.f8316c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f8314a) {
            case 0:
                SimpleFragment.initPenClickListener$lambda$13$lambda$12(this.f8315b, this.f8316c, view);
                break;
            case 1:
                SimpleFragment.initPenClickListener$lambda$15$lambda$14(this.f8315b, this.f8316c, view);
                break;
            default:
                SimpleFragment.initEraserClickListener$lambda$17$lambda$16(this.f8315b, this.f8316c, view);
                break;
        }
    }
}
