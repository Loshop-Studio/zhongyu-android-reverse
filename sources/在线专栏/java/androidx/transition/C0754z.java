package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.transition.Transition;

/* renamed from: androidx.transition.z */
/* loaded from: classes.dex */
class C0754z {

    /* renamed from: androidx.transition.z$a */
    private static class a extends AnimatorListenerAdapter implements Transition.InterfaceC0708g {

        /* renamed from: a */
        private final View f4489a;

        /* renamed from: b */
        private final View f4490b;

        /* renamed from: c */
        private final int f4491c;

        /* renamed from: d */
        private final int f4492d;

        /* renamed from: e */
        private int[] f4493e;

        /* renamed from: f */
        private float f4494f;

        /* renamed from: g */
        private float f4495g;

        /* renamed from: h */
        private final float f4496h;

        /* renamed from: i */
        private final float f4497i;

        a(View view, View view2, int i4, int i5, float f4, float f5) {
            this.f4490b = view;
            this.f4489a = view2;
            this.f4491c = i4 - Math.round(view.getTranslationX());
            this.f4492d = i5 - Math.round(view.getTranslationY());
            this.f4496h = f4;
            this.f4497i = f5;
            int i6 = C0742o.f4451f;
            int[] iArr = (int[]) view2.getTag(i6);
            this.f4493e = iArr;
            if (iArr != null) {
                view2.setTag(i6, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f4493e == null) {
                this.f4493e = new int[2];
            }
            this.f4493e[0] = Math.round(this.f4491c + this.f4490b.getTranslationX());
            this.f4493e[1] = Math.round(this.f4492d + this.f4490b.getTranslationY());
            this.f4489a.setTag(C0742o.f4451f, this.f4493e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f4494f = this.f4490b.getTranslationX();
            this.f4495g = this.f4490b.getTranslationY();
            this.f4490b.setTranslationX(this.f4496h);
            this.f4490b.setTranslationY(this.f4497i);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f4490b.setTranslationX(this.f4494f);
            this.f4490b.setTranslationY(this.f4495g);
        }

        @Override // androidx.transition.Transition.InterfaceC0708g
        public void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC0708g
        public void onTransitionEnd(Transition transition) {
            this.f4490b.setTranslationX(this.f4496h);
            this.f4490b.setTranslationY(this.f4497i);
            transition.removeListener(this);
        }

        @Override // androidx.transition.Transition.InterfaceC0708g
        public void onTransitionPause(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC0708g
        public void onTransitionResume(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC0708g
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: a */
    static Animator m3927a(View view, C0752x c0752x, int i4, int i5, float f4, float f5, float f6, float f7, TimeInterpolator timeInterpolator, Transition transition) {
        float f8;
        float f9;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) c0752x.f4483b.getTag(C0742o.f4451f)) != null) {
            f8 = (r4[0] - i4) + translationX;
            f9 = (r4[1] - i5) + translationY;
        } else {
            f8 = f4;
            f9 = f5;
        }
        int iRound = i4 + Math.round(f8 - translationX);
        int iRound2 = i5 + Math.round(f9 - translationY);
        view.setTranslationX(f8);
        view.setTranslationY(f9);
        if (f8 == f6 && f9 == f7) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f8, f6), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f9, f7));
        a aVar = new a(view, c0752x.f4483b, iRound, iRound2, translationX, translationY);
        transition.addListener(aVar);
        objectAnimatorOfPropertyValuesHolder.addListener(aVar);
        C0714a.m3842a(objectAnimatorOfPropertyValuesHolder, aVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }
}
