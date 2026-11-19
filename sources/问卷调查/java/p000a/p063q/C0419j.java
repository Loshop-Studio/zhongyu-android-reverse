package p000a.p063q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: a.q.j */
/* loaded from: classes.dex */
public class C0419j extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0417h f2438a;

    public C0419j(AbstractC0417h abstractC0417h) {
        this.f2438a = abstractC0417h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f2438a.m1462m();
        animator.removeListener(this);
    }
}
