package androidx.databinding;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.view.Choreographer;
import android.view.View;
import androidx.lifecycle.AbstractC0496f;
import androidx.lifecycle.InterfaceC0503k;
import androidx.lifecycle.InterfaceC0504l;
import androidx.lifecycle.InterfaceC0513u;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p089g0.C2628a;

/* loaded from: classes.dex */
public abstract class ViewDataBinding extends C0401a {

    /* renamed from: j */
    static int f2873j = Build.VERSION.SDK_INT;

    /* renamed from: k */
    private static final boolean f2874k = true;

    /* renamed from: l */
    private static final InterfaceC0400g f2875l = new C0394a();

    /* renamed from: m */
    private static final InterfaceC0400g f2876m = new C0395b();

    /* renamed from: n */
    private static final InterfaceC0400g f2877n = new C0396c();

    /* renamed from: o */
    private static final InterfaceC0400g f2878o = new C0397d();

    /* renamed from: p */
    private static final AbstractC0403c<Object, ViewDataBinding, Void> f2879p = new C0398e();

    /* renamed from: q */
    private static final ReferenceQueue<ViewDataBinding> f2880q = new ReferenceQueue<>();

    /* renamed from: r */
    private static final View.OnAttachStateChangeListener f2881r = new ViewOnAttachStateChangeListenerC0399f();

    /* renamed from: a */
    private final Runnable f2882a;

    /* renamed from: b */
    private boolean f2883b;

    /* renamed from: c */
    private boolean f2884c;

    /* renamed from: d */
    private boolean f2885d;

    /* renamed from: e */
    private Choreographer f2886e;

    /* renamed from: f */
    private final Choreographer.FrameCallback f2887f;

    /* renamed from: g */
    private Handler f2888g;

    /* renamed from: h */
    private ViewDataBinding f2889h;

    /* renamed from: i */
    private InterfaceC0504l f2890i;

    static class OnStartListener implements InterfaceC0503k {

        /* renamed from: a */
        final WeakReference<ViewDataBinding> f2891a;

        @InterfaceC0513u(AbstractC0496f.b.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = this.f2891a.get();
            if (viewDataBinding != null) {
                viewDataBinding.m2305d();
            }
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$a */
    static class C0394a implements InterfaceC0400g {
        C0394a() {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$b */
    static class C0395b implements InterfaceC0400g {
        C0395b() {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$c */
    static class C0396c implements InterfaceC0400g {
        C0396c() {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$d */
    static class C0397d implements InterfaceC0400g {
        C0397d() {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$e */
    static class C0398e extends AbstractC0403c<Object, ViewDataBinding, Void> {
        C0398e() {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$f */
    static class ViewOnAttachStateChangeListenerC0399f implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0399f() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            ViewDataBinding.m2303e(view).f2882a.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$g */
    private interface InterfaceC0400g {
    }

    /* renamed from: c */
    private void m2302c() {
        if (this.f2885d) {
            m2307g();
        } else if (m2306f()) {
            this.f2885d = true;
            this.f2884c = false;
            m2304b();
            this.f2885d = false;
        }
    }

    /* renamed from: e */
    static ViewDataBinding m2303e(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(C2628a.f10396a);
        }
        return null;
    }

    /* renamed from: b */
    protected abstract void m2304b();

    /* renamed from: d */
    public void m2305d() {
        ViewDataBinding viewDataBinding = this.f2889h;
        if (viewDataBinding == null) {
            m2302c();
        } else {
            viewDataBinding.m2305d();
        }
    }

    /* renamed from: f */
    public abstract boolean m2306f();

    /* renamed from: g */
    protected void m2307g() {
        ViewDataBinding viewDataBinding = this.f2889h;
        if (viewDataBinding != null) {
            viewDataBinding.m2307g();
            return;
        }
        InterfaceC0504l interfaceC0504l = this.f2890i;
        if (interfaceC0504l == null || interfaceC0504l.getLifecycle().mo2868b().m2874a(AbstractC0496f.c.STARTED)) {
            synchronized (this) {
                if (this.f2883b) {
                    return;
                }
                this.f2883b = true;
                if (f2874k) {
                    this.f2886e.postFrameCallback(this.f2887f);
                } else {
                    this.f2888g.post(this.f2882a);
                }
            }
        }
    }
}
