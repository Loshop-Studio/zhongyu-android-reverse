package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p070b.p074b.p075a.p076a.p080c.C0570a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC0503c<V> {

    /* renamed from: a */
    public int f4797a;

    /* renamed from: b */
    public int f4798b;

    /* renamed from: c */
    public int f4799c;

    /* renamed from: d */
    public ViewPropertyAnimator f4800d;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    public class C0913a extends AnimatorListenerAdapter {
        public C0913a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f4800d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f4797a = 0;
        this.f4798b = 2;
        this.f4799c = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4797a = 0;
        this.f4798b = 2;
        this.f4799c = 0;
    }

    /* renamed from: B */
    public final void m2610B(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f4800d = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C0913a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: k */
    public boolean mo1674k(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f4797a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: r */
    public void mo1681r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            if (this.f4798b == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f4800d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f4798b = 1;
            m2610B(v, this.f4797a + this.f4799c, 175L, C0570a.f3536c);
            return;
        }
        if (i2 >= 0 || this.f4798b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f4800d;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            v.clearAnimation();
        }
        this.f4798b = 2;
        m2610B(v, 0, 225L, C0570a.f3537d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: x */
    public boolean mo1687x(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }
}
