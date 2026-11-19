package com.zykj.view.board.simple;

import android.view.View;

/* renamed from: com.zykj.view.board.simple.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC5374a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f8312a;

    /* renamed from: b */
    public final /* synthetic */ SimpleFragment f8313b;

    public /* synthetic */ ViewOnClickListenerC5374a(SimpleFragment simpleFragment, int i) {
        this.f8312a = i;
        this.f8313b = simpleFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f8312a) {
            case 0:
                SimpleFragment.initExtraClickListener$lambda$19(this.f8313b, view);
                break;
            case 1:
                SimpleFragment.initPenClickListener$lambda$11$lambda$10(this.f8313b, view);
                break;
            case 2:
                SimpleFragment.initMainClickListener$lambda$9$lambda$4(this.f8313b, view);
                break;
            case 3:
                SimpleFragment.initMainClickListener$lambda$9$lambda$5(this.f8313b, view);
                break;
            case 4:
                SimpleFragment.initMainClickListener$lambda$9$lambda$6(this.f8313b, view);
                break;
            default:
                SimpleFragment.initMainClickListener$lambda$9$lambda$8(this.f8313b, view);
                break;
        }
    }
}
