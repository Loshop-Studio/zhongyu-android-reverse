package androidx.activity;

import java.util.ArrayDeque;
import java.util.Iterator;
import p000a.p001a.AbstractC0001b;
import p000a.p001a.InterfaceC0000a;
import p000a.p057m.AbstractC0355d;
import p000a.p057m.C0359h;
import p000a.p057m.InterfaceC0356e;
import p000a.p057m.InterfaceC0358g;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    public final Runnable f2672a;

    /* renamed from: b */
    public final ArrayDeque<AbstractC0001b> f2673b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements InterfaceC0356e, InterfaceC0000a {

        /* renamed from: a */
        public final AbstractC0355d f2674a;

        /* renamed from: b */
        public final AbstractC0001b f2675b;

        /* renamed from: c */
        public InterfaceC0000a f2676c;

        public LifecycleOnBackPressedCancellable(AbstractC0355d abstractC0355d, AbstractC0001b abstractC0001b) {
            this.f2674a = abstractC0355d;
            this.f2675b = abstractC0001b;
            abstractC0355d.mo1275a(this);
        }

        @Override // p000a.p001a.InterfaceC0000a
        public void cancel() {
            C0359h c0359h = (C0359h) this.f2674a;
            c0359h.m1281c("removeObserver");
            c0359h.f2170a.mo464e(this);
            this.f2675b.f1b.remove(this);
            InterfaceC0000a interfaceC0000a = this.f2676c;
            if (interfaceC0000a != null) {
                interfaceC0000a.cancel();
                this.f2676c = null;
            }
        }

        @Override // p000a.p057m.InterfaceC0356e
        /* renamed from: g */
        public void mo1278g(InterfaceC0358g interfaceC0358g, AbstractC0355d.a aVar) {
            if (aVar == AbstractC0355d.a.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                AbstractC0001b abstractC0001b = this.f2675b;
                onBackPressedDispatcher.f2673b.add(abstractC0001b);
                C0455a c0455a = onBackPressedDispatcher.new C0455a(abstractC0001b);
                abstractC0001b.f1b.add(c0455a);
                this.f2676c = c0455a;
                return;
            }
            if (aVar != AbstractC0355d.a.ON_STOP) {
                if (aVar == AbstractC0355d.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC0000a interfaceC0000a = this.f2676c;
                if (interfaceC0000a != null) {
                    interfaceC0000a.cancel();
                }
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    public class C0455a implements InterfaceC0000a {

        /* renamed from: a */
        public final AbstractC0001b f2678a;

        public C0455a(AbstractC0001b abstractC0001b) {
            this.f2678a = abstractC0001b;
        }

        @Override // p000a.p001a.InterfaceC0000a
        public void cancel() {
            OnBackPressedDispatcher.this.f2673b.remove(this.f2678a);
            this.f2678a.f1b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f2672a = runnable;
    }

    /* renamed from: a */
    public void m1558a() {
        Iterator<AbstractC0001b> itDescendingIterator = this.f2673b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            AbstractC0001b next = itDescendingIterator.next();
            if (next.f0a) {
                next.mo0a();
                return;
            }
        }
        Runnable runnable = this.f2672a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
