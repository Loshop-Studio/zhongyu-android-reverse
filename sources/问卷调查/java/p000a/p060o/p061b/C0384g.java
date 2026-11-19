package p000a.p060o.p061b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* renamed from: a.o.b.g */
/* loaded from: classes.dex */
public class C0384g extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.AbstractC0552z f2226a;

    /* renamed from: b */
    public final /* synthetic */ View f2227b;

    /* renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f2228c;

    /* renamed from: d */
    public final /* synthetic */ C0388k f2229d;

    public C0384g(C0388k c0388k, RecyclerView.AbstractC0552z abstractC0552z, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2229d = c0388k;
        this.f2226a = abstractC0552z;
        this.f2227b = view;
        this.f2228c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f2227b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f2228c.setListener(null);
        this.f2229d.m1901c(this.f2226a);
        this.f2229d.f2252o.remove(this.f2226a);
        this.f2229d.m1359k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f2229d);
    }
}
