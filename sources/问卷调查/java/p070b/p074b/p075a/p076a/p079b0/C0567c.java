package p070b.p074b.p075a.p076a.p079b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.FabTransformationBehavior;
import p070b.p074b.p075a.p076a.p089l.InterfaceC0604c;

/* renamed from: b.b.a.a.b0.c */
/* loaded from: classes.dex */
public class C0567c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC0604c f3533a;

    public C0567c(FabTransformationBehavior fabTransformationBehavior, InterfaceC0604c interfaceC0604c) {
        this.f3533a = interfaceC0604c;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        InterfaceC0604c.e revealInfo = this.f3533a.getRevealInfo();
        revealInfo.f3701c = Float.MAX_VALUE;
        this.f3533a.setRevealInfo(revealInfo);
    }
}
