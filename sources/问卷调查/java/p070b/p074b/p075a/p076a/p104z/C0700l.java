package p070b.p074b.p075a.p076a.p104z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: b.b.a.a.z.l */
/* loaded from: classes.dex */
public class C0700l extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0696h f4159a;

    public C0700l(C0696h c0696h) {
        this.f4159a = c0696h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        C0696h c0696h = this.f4159a;
        c0696h.f4162c.setChecked(c0696h.f4140j);
        this.f4159a.f4146p.start();
    }
}
