package p000a.p060o.p061b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import p000a.p060o.p061b.C0388k;

/* renamed from: a.o.b.i */
/* loaded from: classes.dex */
public class C0386i extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0388k.a f2236a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f2237b;

    /* renamed from: c */
    public final /* synthetic */ View f2238c;

    /* renamed from: d */
    public final /* synthetic */ C0388k f2239d;

    public C0386i(C0388k c0388k, C0388k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2239d = c0388k;
        this.f2236a = aVar;
        this.f2237b = viewPropertyAnimator;
        this.f2238c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f2237b.setListener(null);
        this.f2238c.setAlpha(1.0f);
        this.f2238c.setTranslationX(0.0f);
        this.f2238c.setTranslationY(0.0f);
        this.f2239d.m1901c(this.f2236a.f2256a);
        this.f2239d.f2255r.remove(this.f2236a.f2256a);
        this.f2239d.m1359k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        C0388k c0388k = this.f2239d;
        RecyclerView.AbstractC0552z abstractC0552z = this.f2236a.f2256a;
        Objects.requireNonNull(c0388k);
    }
}
