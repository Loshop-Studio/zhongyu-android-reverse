package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    public AnimatorSet f5075b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    public class C0950a extends AnimatorListenerAdapter {
        public C0950a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f5075b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: C */
    public boolean mo2716C(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f5075b;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetMo2717D = mo2717D(view, view2, z, z3);
        this.f5075b = animatorSetMo2717D;
        animatorSetMo2717D.addListener(new C0950a());
        this.f5075b.start();
        if (!z2) {
            this.f5075b.end();
        }
        return true;
    }

    /* renamed from: D */
    public abstract AnimatorSet mo2717D(View view, View view2, boolean z, boolean z2);
}
