package p000a.p031h.p043j;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;
import p000a.p005b.p006c.C0033s;

/* renamed from: a.h.j.v */
/* loaded from: classes.dex */
public final class C0273v {

    /* renamed from: a */
    public WeakReference<View> f1632a;

    /* renamed from: b */
    public int f1633b = -1;

    /* renamed from: a.h.j.v$a */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC0274w f1634a;

        /* renamed from: b */
        public final /* synthetic */ View f1635b;

        public a(C0273v c0273v, InterfaceC0274w interfaceC0274w, View view) {
            this.f1634a = interfaceC0274w;
            this.f1635b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1634a.mo257c(this.f1635b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1634a.mo88a(this.f1635b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f1634a.mo97b(this.f1635b);
        }
    }

    /* renamed from: a.h.j.v$b */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC0276y f1636a;

        /* renamed from: b */
        public final /* synthetic */ View f1637b;

        public b(C0273v c0273v, InterfaceC0276y interfaceC0276y, View view) {
            this.f1636a = interfaceC0276y;
            this.f1637b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((View) C0033s.this.f181d.getParent()).invalidate();
        }
    }

    public C0273v(View view) {
        this.f1632a = new WeakReference<>(view);
    }

    /* renamed from: a */
    public C0273v m886a(float f2) {
        View view = this.f1632a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    /* renamed from: b */
    public void m887b() {
        View view = this.f1632a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public C0273v m888c(long j) {
        View view = this.f1632a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: d */
    public C0273v m889d(InterfaceC0274w interfaceC0274w) {
        View view = this.f1632a.get();
        if (view != null) {
            m890e(view, interfaceC0274w);
        }
        return this;
    }

    /* renamed from: e */
    public final void m890e(View view, InterfaceC0274w interfaceC0274w) {
        if (interfaceC0274w != null) {
            view.animate().setListener(new a(this, interfaceC0274w, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: f */
    public C0273v m891f(InterfaceC0276y interfaceC0276y) {
        View view = this.f1632a.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC0276y != null ? new b(this, interfaceC0276y, view) : null);
        }
        return this;
    }

    /* renamed from: g */
    public C0273v m892g(float f2) {
        View view = this.f1632a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}
