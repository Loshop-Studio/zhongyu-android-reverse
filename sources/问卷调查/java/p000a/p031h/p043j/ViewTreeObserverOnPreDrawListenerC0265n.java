package p000a.p031h.p043j;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* renamed from: a.h.j.n */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0265n implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final View f1613b;

    /* renamed from: c */
    public ViewTreeObserver f1614c;

    /* renamed from: d */
    public final Runnable f1615d;

    public ViewTreeObserverOnPreDrawListenerC0265n(View view, Runnable runnable) {
        this.f1613b = view;
        this.f1614c = view.getViewTreeObserver();
        this.f1615d = runnable;
    }

    /* renamed from: a */
    public static ViewTreeObserverOnPreDrawListenerC0265n m860a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        ViewTreeObserverOnPreDrawListenerC0265n viewTreeObserverOnPreDrawListenerC0265n = new ViewTreeObserverOnPreDrawListenerC0265n(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0265n);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0265n);
        return viewTreeObserverOnPreDrawListenerC0265n;
    }

    /* renamed from: b */
    public void m861b() {
        (this.f1614c.isAlive() ? this.f1614c : this.f1613b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f1613b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m861b();
        this.f1615d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f1614c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m861b();
    }
}
