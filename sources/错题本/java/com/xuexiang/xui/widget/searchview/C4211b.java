package com.xuexiang.xui.widget.searchview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import p032c8.C3238c;

/* renamed from: com.xuexiang.xui.widget.searchview.b */
/* loaded from: classes3.dex */
public final class C4211b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C3238c f4855a;

    /* renamed from: b */
    public final /* synthetic */ View f4856b;

    public C4211b(C3238c c3238c, View view) {
        this.f4855a = c3238c;
        this.f4856b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f4855a.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = MaterialSearchView.f4831t;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f4855a.getClass();
    }
}
