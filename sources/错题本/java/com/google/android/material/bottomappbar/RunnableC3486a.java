package com.google.android.material.bottomappbar;

import android.view.View;
import com.google.android.material.internal.ViewUtils;

/* renamed from: com.google.android.material.bottomappbar.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3486a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2840a;

    /* renamed from: b */
    public final /* synthetic */ View f2841b;

    public /* synthetic */ RunnableC3486a(View view, int i) {
        this.f2840a = i;
        this.f2841b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2840a) {
            case 0:
                this.f2841b.requestLayout();
                break;
            default:
                ViewUtils.requestFocusAndShowKeyboard(this.f2841b, false);
                break;
        }
    }
}
