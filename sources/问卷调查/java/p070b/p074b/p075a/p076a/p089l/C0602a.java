package p070b.p074b.p075a.p076a.p089l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: b.b.a.a.l.a */
/* loaded from: classes.dex */
public final class C0602a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC0604c f3694a;

    public C0602a(InterfaceC0604c interfaceC0604c) {
        this.f3694a = interfaceC0604c;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3694a.mo2174a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f3694a.mo2175b();
    }
}
