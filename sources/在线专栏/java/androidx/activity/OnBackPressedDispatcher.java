package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.AbstractC0496f;
import androidx.lifecycle.InterfaceC0501i;
import androidx.lifecycle.InterfaceC0504l;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f76a;

    /* renamed from: b */
    final ArrayDeque<AbstractC0055b> f77b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements InterfaceC0501i, InterfaceC0054a {

        /* renamed from: a */
        private final AbstractC0496f f78a;

        /* renamed from: b */
        private final AbstractC0055b f79b;

        /* renamed from: c */
        private InterfaceC0054a f80c;

        LifecycleOnBackPressedCancellable(AbstractC0496f abstractC0496f, AbstractC0055b abstractC0055b) {
            this.f78a = abstractC0496f;
            this.f79b = abstractC0055b;
            abstractC0496f.mo2867a(this);
        }

        @Override // androidx.activity.InterfaceC0054a
        public void cancel() {
            this.f78a.mo2869c(this);
            this.f79b.m74e(this);
            InterfaceC0054a interfaceC0054a = this.f80c;
            if (interfaceC0054a != null) {
                interfaceC0054a.cancel();
                this.f80c = null;
            }
        }

        @Override // androidx.lifecycle.InterfaceC0501i
        /* renamed from: d */
        public void mo63d(InterfaceC0504l interfaceC0504l, AbstractC0496f.b bVar) {
            if (bVar == AbstractC0496f.b.ON_START) {
                this.f80c = OnBackPressedDispatcher.this.m68b(this.f79b);
                return;
            }
            if (bVar != AbstractC0496f.b.ON_STOP) {
                if (bVar == AbstractC0496f.b.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC0054a interfaceC0054a = this.f80c;
                if (interfaceC0054a != null) {
                    interfaceC0054a.cancel();
                }
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    private class C0053a implements InterfaceC0054a {

        /* renamed from: a */
        private final AbstractC0055b f82a;

        C0053a(AbstractC0055b abstractC0055b) {
            this.f82a = abstractC0055b;
        }

        @Override // androidx.activity.InterfaceC0054a
        public void cancel() {
            OnBackPressedDispatcher.this.f77b.remove(this.f82a);
            this.f82a.m74e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f76a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public void m67a(InterfaceC0504l interfaceC0504l, AbstractC0055b abstractC0055b) {
        AbstractC0496f lifecycle = interfaceC0504l.getLifecycle();
        if (lifecycle.mo2868b() == AbstractC0496f.c.DESTROYED) {
            return;
        }
        abstractC0055b.m70a(new LifecycleOnBackPressedCancellable(lifecycle, abstractC0055b));
    }

    /* renamed from: b */
    InterfaceC0054a m68b(AbstractC0055b abstractC0055b) {
        this.f77b.add(abstractC0055b);
        C0053a c0053a = new C0053a(abstractC0055b);
        abstractC0055b.m70a(c0053a);
        return c0053a;
    }

    /* renamed from: c */
    public void m69c() {
        Iterator<AbstractC0055b> itDescendingIterator = this.f77b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            AbstractC0055b next = itDescendingIterator.next();
            if (next.m72c()) {
                next.mo71b();
                return;
            }
        }
        Runnable runnable = this.f76a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
