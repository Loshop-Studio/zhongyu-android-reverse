package p000a.p060o.p061b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* renamed from: a.o.b.h */
/* loaded from: classes.dex */
public class C0385h extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.AbstractC0552z f2230a;

    /* renamed from: b */
    public final /* synthetic */ int f2231b;

    /* renamed from: c */
    public final /* synthetic */ View f2232c;

    /* renamed from: d */
    public final /* synthetic */ int f2233d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f2234e;

    /* renamed from: f */
    public final /* synthetic */ C0388k f2235f;

    public C0385h(C0388k c0388k, RecyclerView.AbstractC0552z abstractC0552z, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2235f = c0388k;
        this.f2230a = abstractC0552z;
        this.f2231b = i;
        this.f2232c = view;
        this.f2233d = i2;
        this.f2234e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        if (this.f2231b != 0) {
            this.f2232c.setTranslationX(0.0f);
        }
        if (this.f2233d != 0) {
            this.f2232c.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f2234e.setListener(null);
        this.f2235f.m1901c(this.f2230a);
        this.f2235f.f2253p.remove(this.f2230a);
        this.f2235f.m1359k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f2235f);
    }
}
