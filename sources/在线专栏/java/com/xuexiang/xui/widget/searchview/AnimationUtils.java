package com.xuexiang.xui.widget.searchview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.core.view.C0358u;
import androidx.core.view.InterfaceC0363z;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
class AnimationUtils {
    public static int ANIMATION_DURATION_LONG = 800;
    public static int ANIMATION_DURATION_MEDIUM = 400;
    public static int ANIMATION_DURATION_SHORT = 150;

    public interface AnimationListener {
        boolean onAnimationCancel(View view);

        boolean onAnimationEnd(View view);

        boolean onAnimationStart(View view);
    }

    private AnimationUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    static void crossFadeViews(View view, View view2) {
        crossFadeViews(view, view2, ANIMATION_DURATION_SHORT);
    }

    static void fadeInView(View view) {
        fadeInView(view, ANIMATION_DURATION_SHORT);
    }

    static void fadeOutView(View view) {
        fadeOutView(view, ANIMATION_DURATION_SHORT);
    }

    @TargetApi(21)
    static void reveal(final View view, final AnimationListener animationListener) {
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, view.getWidth() - ((int) TypedValue.applyDimension(1, 24.0f, view.getResources().getDisplayMetrics())), view.getHeight() / 2, IGoodView.DEFAULT_TO_ALPHA, Math.max(view.getWidth(), view.getHeight()));
        view.setVisibility(0);
        animatorCreateCircularReveal.addListener(new AnimatorListenerAdapter() { // from class: com.xuexiang.xui.widget.searchview.AnimationUtils.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                animationListener.onAnimationCancel(view);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                animationListener.onAnimationEnd(view);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                animationListener.onAnimationStart(view);
            }
        });
        animatorCreateCircularReveal.start();
    }

    static void crossFadeViews(View view, View view2, int i4) {
        fadeInView(view, i4);
        fadeOutView(view2, i4);
    }

    static void fadeInView(View view, int i4) {
        fadeInView(view, i4, null);
    }

    static void fadeOutView(View view, int i4) {
        fadeOutView(view, i4, null);
    }

    static void fadeInView(View view, int i4, final AnimationListener animationListener) {
        view.setVisibility(0);
        view.setAlpha(IGoodView.DEFAULT_TO_ALPHA);
        C0358u.m2022c(view).m2121a(1.0f).m2124d(i4).m2126f(animationListener != null ? new InterfaceC0363z() { // from class: com.xuexiang.xui.widget.searchview.AnimationUtils.1
            @Override // androidx.core.view.InterfaceC0363z
            public void onAnimationCancel(View view2) {
            }

            @Override // androidx.core.view.InterfaceC0363z
            public void onAnimationEnd(View view2) {
                if (animationListener.onAnimationEnd(view2)) {
                    return;
                }
                view2.setDrawingCacheEnabled(false);
            }

            @Override // androidx.core.view.InterfaceC0363z
            public void onAnimationStart(View view2) {
                if (animationListener.onAnimationStart(view2)) {
                    return;
                }
                view2.setDrawingCacheEnabled(true);
            }
        } : null);
    }

    static void fadeOutView(View view, int i4, final AnimationListener animationListener) {
        C0358u.m2022c(view).m2121a(IGoodView.DEFAULT_TO_ALPHA).m2124d(i4).m2126f(new InterfaceC0363z() { // from class: com.xuexiang.xui.widget.searchview.AnimationUtils.3
            @Override // androidx.core.view.InterfaceC0363z
            public void onAnimationCancel(View view2) {
            }

            @Override // androidx.core.view.InterfaceC0363z
            public void onAnimationEnd(View view2) {
                AnimationListener animationListener2 = animationListener;
                if (animationListener2 == null || !animationListener2.onAnimationEnd(view2)) {
                    view2.setVisibility(8);
                    view2.setDrawingCacheEnabled(false);
                }
            }

            @Override // androidx.core.view.InterfaceC0363z
            public void onAnimationStart(View view2) {
                AnimationListener animationListener2 = animationListener;
                if (animationListener2 == null || !animationListener2.onAnimationStart(view2)) {
                    view2.setDrawingCacheEnabled(true);
                }
            }
        });
    }
}
