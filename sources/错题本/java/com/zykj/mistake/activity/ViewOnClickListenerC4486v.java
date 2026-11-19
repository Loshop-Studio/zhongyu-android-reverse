package com.zykj.mistake.activity;

import android.view.View;
import com.zykj.view.board.simple.SimpleFragment;

/* renamed from: com.zykj.mistake.activity.v */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC4486v implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f5949a = 1;

    public /* synthetic */ ViewOnClickListenerC4486v() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5949a) {
            case 0:
                int i = MistakeDetailActivity.f5816s;
                break;
            default:
                SimpleFragment.initExtraClickListener$lambda$18(view);
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC4486v(MistakeDetailActivity mistakeDetailActivity) {
    }
}
