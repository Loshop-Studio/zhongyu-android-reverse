package sd;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.InterfaceC9945d;
import p410xd.AbstractC11834a;

/* renamed from: sd.f1 */
/* loaded from: classes6.dex */
public final class C11111f1 extends AbstractC11107e1 implements InterfaceC11146o0 {

    /* renamed from: d */
    public final Executor f26781d;

    public C11111f1(Executor executor) {
        this.f26781d = executor;
        AbstractC11834a.m26225a(mo24697i());
    }

    @Override // sd.InterfaceC11146o0
    /* renamed from: c */
    public InterfaceC11163t0 mo24710c(long j10, Runnable runnable, InterfaceC9945d interfaceC9945d) {
        long j11;
        Runnable runnable2;
        InterfaceC9945d interfaceC9945d2;
        Executor executorMo24697i = mo24697i();
        ScheduledFuture scheduledFutureM24713k = null;
        ScheduledExecutorService scheduledExecutorService = executorMo24697i instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorMo24697i : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            runnable2 = runnable;
            interfaceC9945d2 = interfaceC9945d;
            scheduledFutureM24713k = m24713k(scheduledExecutorService, runnable2, interfaceC9945d2, j11);
        } else {
            j11 = j10;
            runnable2 = runnable;
            interfaceC9945d2 = interfaceC9945d;
        }
        return scheduledFutureM24713k != null ? new C11160s0(scheduledFutureM24713k) : RunnableC11130k0.f26794i.mo24710c(j11, runnable2, interfaceC9945d2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorMo24697i = mo24697i();
        ExecutorService executorService = executorMo24697i instanceof ExecutorService ? (ExecutorService) executorMo24697i : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // sd.InterfaceC11146o0
    /* renamed from: d */
    public void mo24711d(long j10, InterfaceC11125j interfaceC11125j) {
        long j11;
        Executor executorMo24697i = mo24697i();
        ScheduledFuture scheduledFutureM24713k = null;
        ScheduledExecutorService scheduledExecutorService = executorMo24697i instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorMo24697i : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            scheduledFutureM24713k = m24713k(scheduledExecutorService, new RunnableC11092a2(this, interfaceC11125j), interfaceC11125j.getContext(), j11);
        } else {
            j11 = j10;
        }
        if (scheduledFutureM24713k != null) {
            AbstractC11137m.m24758c(interfaceC11125j, new C11121i(scheduledFutureM24713k));
        } else {
            RunnableC11130k0.f26794i.mo24711d(j11, interfaceC11125j);
        }
    }

    @Override // sd.AbstractC11106e0
    public void dispatch(InterfaceC9945d interfaceC9945d, Runnable runnable) {
        try {
            Executor executorMo24697i = mo24697i();
            AbstractC11093b.m24675a();
            executorMo24697i.execute(runnable);
        } catch (RejectedExecutionException e10) {
            AbstractC11093b.m24675a();
            m24712j(interfaceC9945d, e10);
            C11157r0.m24799b().dispatch(interfaceC9945d, runnable);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C11111f1) && ((C11111f1) obj).mo24697i() == mo24697i();
    }

    public int hashCode() {
        return System.identityHashCode(mo24697i());
    }

    @Override // sd.AbstractC11107e1
    /* renamed from: i */
    public Executor mo24697i() {
        return this.f26781d;
    }

    /* renamed from: j */
    public final void m24712j(InterfaceC9945d interfaceC9945d, RejectedExecutionException rejectedExecutionException) {
        AbstractC11147o1.m24769c(interfaceC9945d, AbstractC11099c1.m24692a("The task was rejected", rejectedExecutionException));
    }

    /* renamed from: k */
    public final ScheduledFuture m24713k(ScheduledExecutorService scheduledExecutorService, Runnable runnable, InterfaceC9945d interfaceC9945d, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            m24712j(interfaceC9945d, e10);
            return null;
        }
    }

    @Override // sd.AbstractC11106e0
    public String toString() {
        return mo24697i().toString();
    }
}
