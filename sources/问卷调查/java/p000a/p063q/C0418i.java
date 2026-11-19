package p000a.p063q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p000a.p021e.C0129a;

/* renamed from: a.q.i */
/* loaded from: classes.dex */
public class C0418i extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0129a f2436a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0417h f2437b;

    public C0418i(AbstractC0417h abstractC0417h, C0129a c0129a) {
        this.f2437b = abstractC0417h;
        this.f2436a = c0129a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f2436a.remove(animator);
        this.f2437b.f2423n.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f2437b.f2423n.add(animator);
    }
}
