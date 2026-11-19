package p000a.p063q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;

/* renamed from: a.q.c */
/* loaded from: classes.dex */
public class C0411c extends AbstractC0408a0 {

    /* renamed from: a.q.c$a */
    public class a extends C0420k {

        /* renamed from: a */
        public final /* synthetic */ View f2396a;

        public a(C0411c c0411c, View view) {
            this.f2396a = view;
        }

        @Override // p000a.p063q.AbstractC0417h.d
        /* renamed from: c */
        public void mo1434c(AbstractC0417h abstractC0417h) {
            View view = this.f2396a;
            C0434y c0434y = C0428s.f2464a;
            c0434y.mo1482e(view, 1.0f);
            c0434y.mo1479a(this.f2396a);
            abstractC0417h.mo1467v(this);
        }
    }

    /* renamed from: a.q.c$b */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final View f2397a;

        /* renamed from: b */
        public boolean f2398b = false;

        public b(View view) {
            this.f2397a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0428s.f2464a.mo1482e(this.f2397a, 1.0f);
            if (this.f2398b) {
                this.f2397a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            View view = this.f2397a;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            if (view.hasOverlappingRendering() && this.f2397a.getLayerType() == 0) {
                this.f2398b = true;
                this.f2397a.setLayerType(2, null);
            }
        }
    }

    public C0411c(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f2362y = i;
    }

    @Override // p000a.p063q.AbstractC0408a0
    /* renamed from: J */
    public Animator mo1427J(ViewGroup viewGroup, View view, C0425p c0425p, C0425p c0425p2) {
        C0428s.f2464a.mo1481c(view);
        Float f2 = (Float) c0425p.f2456a.get("android:fade:transitionAlpha");
        return m1441K(view, f2 != null ? f2.floatValue() : 1.0f, 0.0f);
    }

    /* renamed from: K */
    public final Animator m1441K(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        C0428s.f2464a.mo1482e(view, f2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, C0428s.f2465b, f3);
        objectAnimatorOfFloat.addListener(new b(view));
        mo1454a(new a(this, view));
        return objectAnimatorOfFloat;
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: g */
    public void mo1440g(C0425p c0425p) {
        m1425H(c0425p);
        c0425p.f2456a.put("android:fade:transitionAlpha", Float.valueOf(C0428s.m1477a(c0425p.f2457b)));
    }
}
