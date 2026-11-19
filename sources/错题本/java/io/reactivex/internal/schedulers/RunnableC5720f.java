package io.reactivex.internal.schedulers;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p145q5.AbstractC6438i;
import p159s5.C6558a;
import p159s5.InterfaceC6559b;

/* renamed from: io.reactivex.internal.schedulers.f */
/* loaded from: classes.dex */
public final class RunnableC5720f extends AbstractC6438i implements Runnable {

    /* renamed from: b */
    public final RunnableC5719e f9036b;

    /* renamed from: c */
    public final C5721g f9037c;

    /* renamed from: d */
    public final AtomicBoolean f9038d = new AtomicBoolean();

    /* renamed from: a */
    public final C6558a f9035a = new C6558a(0);

    public RunnableC5720f(RunnableC5719e runnableC5719e) {
        C5721g c5721g;
        C5721g c5721g2;
        this.f9036b = runnableC5719e;
        if (runnableC5719e.f9031c.f10961b) {
            c5721g2 = C5722h.f9044f;
        } else {
            while (true) {
                if (runnableC5719e.f9030b.isEmpty()) {
                    c5721g = new C5721g(runnableC5719e.f9034f);
                    runnableC5719e.f9031c.mo6200a(c5721g);
                    break;
                } else {
                    c5721g = (C5721g) runnableC5719e.f9030b.poll();
                    if (c5721g != null) {
                        break;
                    }
                }
            }
            c5721g2 = c5721g;
        }
        this.f9037c = c5721g2;
    }

    @Override // p145q5.AbstractC6438i
    /* renamed from: a */
    public final InterfaceC6559b mo5084a(Runnable runnable, TimeUnit timeUnit) {
        return this.f9035a.f10961b ? EmptyDisposable.INSTANCE : this.f9037c.m5088c(runnable, TimeUnit.NANOSECONDS, this.f9035a);
    }

    @Override // p159s5.InterfaceC6559b
    public final void dispose() {
        if (this.f9038d.compareAndSet(false, true)) {
            this.f9035a.dispose();
            boolean z8 = C5722h.f9045g;
            C5721g c5721g = this.f9037c;
            if (z8) {
                c5721g.m5088c(this, TimeUnit.NANOSECONDS, null);
                return;
            }
            RunnableC5719e runnableC5719e = this.f9036b;
            runnableC5719e.getClass();
            c5721g.f9039c = System.nanoTime() + runnableC5719e.f9029a;
            runnableC5719e.f9030b.offer(c5721g);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC5719e runnableC5719e = this.f9036b;
        runnableC5719e.getClass();
        long jNanoTime = System.nanoTime() + runnableC5719e.f9029a;
        C5721g c5721g = this.f9037c;
        c5721g.f9039c = jNanoTime;
        runnableC5719e.f9030b.offer(c5721g);
    }
}
