package com.xuexiang.xui.widget.searchview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewAnimationUtils;

/* renamed from: com.xuexiang.xui.widget.searchview.b */
/* loaded from: classes5.dex */
public abstract class AbstractC8250b {

    /* renamed from: a */
    public static int f16933a = 400;

    /* renamed from: com.xuexiang.xui.widget.searchview.b$a */
    public static class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ b f16934a;

        /* renamed from: b */
        public final /* synthetic */ View f16935b;

        public a(b bVar, View view) {
            this.f16934a = bVar;
            this.f16935b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f16934a.onAnimationCancel(this.f16935b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f16934a.onAnimationEnd(this.f16935b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f16934a.onAnimationStart(this.f16935b);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.searchview.b$b */
    public interface b {
        boolean onAnimationCancel(View view);

        boolean onAnimationEnd(View view);

        boolean onAnimationStart(View view);
    }

    /* renamed from: a */
    public static void m13220a(View view, b bVar) {
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, view.getWidth() - ((int) TypedValue.applyDimension(1, 24.0f, view.getResources().getDisplayMetrics())), view.getHeight() / 2, 0.0f, Math.max(view.getWidth(), view.getHeight()));
        view.setVisibility(0);
        animatorCreateCircularReveal.addListener(new a(bVar, view));
        animatorCreateCircularReveal.start();
    }
}
