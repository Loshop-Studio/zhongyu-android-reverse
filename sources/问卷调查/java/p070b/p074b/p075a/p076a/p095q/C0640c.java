package p070b.p074b.p075a.p076a.p095q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p070b.p074b.p075a.p076a.p095q.C0641d;

/* renamed from: b.b.a.a.q.c */
/* loaded from: classes.dex */
public class C0640c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ boolean f3832a;

    /* renamed from: b */
    public final /* synthetic */ C0641d.f f3833b;

    /* renamed from: c */
    public final /* synthetic */ C0641d f3834c;

    public C0640c(C0641d c0641d, boolean z, C0641d.f fVar) {
        this.f3834c = c0641d;
        this.f3832a = z;
        this.f3833b = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        C0641d c0641d = this.f3834c;
        c0641d.f3856o = 0;
        c0641d.f3851j = null;
        C0641d.f fVar = this.f3833b;
        if (fVar != null) {
            C0638a c0638a = (C0638a) fVar;
            c0638a.f3826a.mo2119b(c0638a.f3827b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f3834c.f3860s.m2270b(0, this.f3832a);
        C0641d c0641d = this.f3834c;
        c0641d.f3856o = 2;
        c0641d.f3851j = animator;
    }
}
