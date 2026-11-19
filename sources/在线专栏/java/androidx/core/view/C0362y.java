package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.view.y */
/* loaded from: classes.dex */
public final class C0362y {

    /* renamed from: a */
    private WeakReference<View> f2770a;

    /* renamed from: b */
    Runnable f2771b = null;

    /* renamed from: c */
    Runnable f2772c = null;

    /* renamed from: d */
    int f2773d = -1;

    /* renamed from: androidx.core.view.y$a */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC0363z f2774a;

        /* renamed from: b */
        final /* synthetic */ View f2775b;

        a(InterfaceC0363z interfaceC0363z, View view) {
            this.f2774a = interfaceC0363z;
            this.f2775b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2774a.onAnimationCancel(this.f2775b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2774a.onAnimationEnd(this.f2775b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f2774a.onAnimationStart(this.f2775b);
        }
    }

    /* renamed from: androidx.core.view.y$b */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ InterfaceC0338b0 f2777a;

        /* renamed from: b */
        final /* synthetic */ View f2778b;

        b(InterfaceC0338b0 interfaceC0338b0, View view) {
            this.f2777a = interfaceC0338b0;
            this.f2778b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f2777a.mo326a(this.f2778b);
        }
    }

    C0362y(View view) {
        this.f2770a = new WeakReference<>(view);
    }

    /* renamed from: g */
    private void m2120g(View view, InterfaceC0363z interfaceC0363z) {
        if (interfaceC0363z != null) {
            view.animate().setListener(new a(interfaceC0363z, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a */
    public C0362y m2121a(float f4) {
        View view = this.f2770a.get();
        if (view != null) {
            view.animate().alpha(f4);
        }
        return this;
    }

    /* renamed from: b */
    public void m2122b() {
        View view = this.f2770a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public long m2123c() {
        View view = this.f2770a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* renamed from: d */
    public C0362y m2124d(long j4) {
        View view = this.f2770a.get();
        if (view != null) {
            view.animate().setDuration(j4);
        }
        return this;
    }

    /* renamed from: e */
    public C0362y m2125e(Interpolator interpolator) {
        View view = this.f2770a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: f */
    public C0362y m2126f(InterfaceC0363z interfaceC0363z) {
        View view = this.f2770a.get();
        if (view != null) {
            m2120g(view, interfaceC0363z);
        }
        return this;
    }

    /* renamed from: h */
    public C0362y m2127h(long j4) {
        View view = this.f2770a.get();
        if (view != null) {
            view.animate().setStartDelay(j4);
        }
        return this;
    }

    /* renamed from: i */
    public C0362y m2128i(InterfaceC0338b0 interfaceC0338b0) {
        View view = this.f2770a.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC0338b0 != null ? new b(interfaceC0338b0, view) : null);
        }
        return this;
    }

    /* renamed from: j */
    public void m2129j() {
        View view = this.f2770a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: k */
    public C0362y m2130k(float f4) {
        View view = this.f2770a.get();
        if (view != null) {
            view.animate().translationY(f4);
        }
        return this;
    }
}
