package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p070b.p074b.p075a.p076a.C0562a;
import p070b.p074b.p075a.p076a.p080c.C0577h;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final C0577h f5088c;

    /* renamed from: d */
    public final C0577h f5089d;

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    public class C0953a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f5090a;

        /* renamed from: b */
        public final /* synthetic */ View f5091b;

        public C0953a(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
            this.f5090a = z;
            this.f5091b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f5090a) {
                return;
            }
            this.f5091b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f5090a) {
                this.f5091b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f5088c = new C0577h(75L, 150L);
        this.f5089d = new C0577h(0L, 150L);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5088c = new C0577h(75L, 150L);
        this.f5089d = new C0577h(0L, 150L);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: A */
    public boolean mo1663A(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: D */
    public AnimatorSet mo2717D(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        m2729E(view2, z, z2, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        C0562a.m2093n(animatorSet, arrayList);
        animatorSet.addListener(new C0953a(this, z, view2));
        return animatorSet;
    }

    /* renamed from: E */
    public final void m2729E(View view, boolean z, boolean z2, List list) {
        ObjectAnimator objectAnimatorOfFloat;
        C0577h c0577h = z ? this.f5088c : this.f5089d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        c0577h.m2105a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: d */
    public boolean mo1667d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }
}
