package p070b.p074b.p075a.p076a.p104z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: b.b.a.a.z.b */
/* loaded from: classes.dex */
public class C0690b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0689a f4127a;

    public C0690b(C0689a c0689a) {
        this.f4127a = c0689a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f4127a.f4160a.setEndIconVisible(true);
    }
}
