package p070b.p074b.p075a.p076a.p079b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.material.transformation.FabTransformationBehavior;
import p070b.p074b.p075a.p076a.p089l.InterfaceC0604c;

/* renamed from: b.b.a.a.b0.b */
/* loaded from: classes.dex */
public class C0566b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC0604c f3531a;

    /* renamed from: b */
    public final /* synthetic */ Drawable f3532b;

    public C0566b(FabTransformationBehavior fabTransformationBehavior, InterfaceC0604c interfaceC0604c, Drawable drawable) {
        this.f3531a = interfaceC0604c;
        this.f3532b = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3531a.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f3531a.setCircularRevealOverlayDrawable(this.f3532b);
    }
}
