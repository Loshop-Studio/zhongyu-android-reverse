package p070b.p074b.p075a.p076a.p095q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import p070b.p074b.p075a.p076a.p095q.C0641d;

/* renamed from: b.b.a.a.q.b */
/* loaded from: classes.dex */
public class C0639b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f3828a;

    /* renamed from: b */
    public final /* synthetic */ boolean f3829b;

    /* renamed from: c */
    public final /* synthetic */ C0641d.f f3830c;

    /* renamed from: d */
    public final /* synthetic */ C0641d f3831d;

    public C0639b(C0641d c0641d, boolean z, C0641d.f fVar) {
        this.f3831d = c0641d;
        this.f3829b = z;
        this.f3830c = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f3828a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        C0641d c0641d = this.f3831d;
        c0641d.f3856o = 0;
        c0641d.f3851j = null;
        if (this.f3828a) {
            return;
        }
        FloatingActionButton floatingActionButton = c0641d.f3860s;
        boolean z = this.f3829b;
        floatingActionButton.m2270b(z ? 8 : 4, z);
        C0641d.f fVar = this.f3830c;
        if (fVar != null) {
            C0638a c0638a = (C0638a) fVar;
            c0638a.f3826a.mo2118a(c0638a.f3827b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f3831d.f3860s.m2270b(0, this.f3829b);
        C0641d c0641d = this.f3831d;
        c0641d.f3856o = 1;
        c0641d.f3851j = animator;
        this.f3828a = false;
    }
}
