package p000a.p060o.p061b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* renamed from: a.o.b.f */
/* loaded from: classes.dex */
public class C0383f extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.AbstractC0552z f2222a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f2223b;

    /* renamed from: c */
    public final /* synthetic */ View f2224c;

    /* renamed from: d */
    public final /* synthetic */ C0388k f2225d;

    public C0383f(C0388k c0388k, RecyclerView.AbstractC0552z abstractC0552z, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2225d = c0388k;
        this.f2222a = abstractC0552z;
        this.f2223b = viewPropertyAnimator;
        this.f2224c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f2223b.setListener(null);
        this.f2224c.setAlpha(1.0f);
        this.f2225d.m1901c(this.f2222a);
        this.f2225d.f2254q.remove(this.f2222a);
        this.f2225d.m1359k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f2225d);
    }
}
