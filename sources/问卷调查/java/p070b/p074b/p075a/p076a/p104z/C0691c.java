package p070b.p074b.p075a.p076a.p104z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: b.b.a.a.z.c */
/* loaded from: classes.dex */
public class C0691c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0689a f4128a;

    public C0691c(C0689a c0689a) {
        this.f4128a = c0689a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f4128a.f4160a.setEndIconVisible(false);
    }
}
