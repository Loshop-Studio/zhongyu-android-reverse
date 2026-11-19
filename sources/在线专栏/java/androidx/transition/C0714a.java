package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: androidx.transition.a */
/* loaded from: classes.dex */
class C0714a {
    /* renamed from: a */
    static void m3842a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* renamed from: b */
    static void m3843b(Animator animator) {
        animator.pause();
    }

    /* renamed from: c */
    static void m3844c(Animator animator) {
        animator.resume();
    }
}
