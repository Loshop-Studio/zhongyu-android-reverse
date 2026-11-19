package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* renamed from: androidx.core.view.s */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0356s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    private final View f2745a;

    /* renamed from: b */
    private ViewTreeObserver f2746b;

    /* renamed from: c */
    private final Runnable f2747c;

    private ViewTreeObserverOnPreDrawListenerC0356s(View view, Runnable runnable) {
        this.f2745a = view;
        this.f2746b = view.getViewTreeObserver();
        this.f2747c = runnable;
    }

    /* renamed from: a */
    public static ViewTreeObserverOnPreDrawListenerC0356s m1974a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        ViewTreeObserverOnPreDrawListenerC0356s viewTreeObserverOnPreDrawListenerC0356s = new ViewTreeObserverOnPreDrawListenerC0356s(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0356s);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0356s);
        return viewTreeObserverOnPreDrawListenerC0356s;
    }

    /* renamed from: b */
    public void m1975b() {
        if (this.f2746b.isAlive()) {
            this.f2746b.removeOnPreDrawListener(this);
        } else {
            this.f2745a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f2745a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m1975b();
        this.f2747c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f2746b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m1975b();
    }
}
