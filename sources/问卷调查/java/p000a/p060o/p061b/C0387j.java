package p000a.p060o.p061b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import p000a.p060o.p061b.C0388k;

/* renamed from: a.o.b.j */
/* loaded from: classes.dex */
public class C0387j extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0388k.a f2240a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f2241b;

    /* renamed from: c */
    public final /* synthetic */ View f2242c;

    /* renamed from: d */
    public final /* synthetic */ C0388k f2243d;

    public C0387j(C0388k c0388k, C0388k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2243d = c0388k;
        this.f2240a = aVar;
        this.f2241b = viewPropertyAnimator;
        this.f2242c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f2241b.setListener(null);
        this.f2242c.setAlpha(1.0f);
        this.f2242c.setTranslationX(0.0f);
        this.f2242c.setTranslationY(0.0f);
        this.f2243d.m1901c(this.f2240a.f2257b);
        this.f2243d.f2255r.remove(this.f2240a.f2257b);
        this.f2243d.m1359k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        C0388k c0388k = this.f2243d;
        RecyclerView.AbstractC0552z abstractC0552z = this.f2240a.f2257b;
        Objects.requireNonNull(c0388k);
    }
}
