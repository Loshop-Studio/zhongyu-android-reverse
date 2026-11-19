package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.InterfaceC9100d;
import p135i8.AbstractC8821b;
import p135i8.AbstractC8823b1;
import p135i8.AbstractC8870r0;
import p135i8.C8843i0;
import p135i8.C8846j0;
import p135i8.InterfaceC8845j;
import p135i8.InterfaceC8849k0;
import p135i8.RunnableC8862o1;
import p191n8.AbstractC9439c;

/* renamed from: kotlinx.coroutines.l */
/* loaded from: classes5.dex */
public final class C9210l extends ExecutorCoroutineDispatcher implements InterfaceC9203g {

    /* renamed from: b */
    public final Executor f18093b;

    public C9210l(Executor executor) {
        this.f18093b = executor;
        AbstractC9439c.m17303a(mo16230i());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorMo16230i = mo16230i();
        ExecutorService executorService = executorMo16230i instanceof ExecutorService ? (ExecutorService) executorMo16230i : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(InterfaceC9100d interfaceC9100d, Runnable runnable) {
        try {
            Executor executorMo16230i = mo16230i();
            AbstractC8821b.m14804a();
            executorMo16230i.execute(runnable);
        } catch (RejectedExecutionException e10) {
            AbstractC8821b.m14804a();
            m16775m(interfaceC9100d, e10);
            C8843i0.m14867b().dispatch(interfaceC9100d, runnable);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9210l) && ((C9210l) obj).mo16230i() == mo16230i();
    }

    @Override // kotlinx.coroutines.InterfaceC9203g
    /* renamed from: f */
    public InterfaceC8849k0 mo16335f(long j10, Runnable runnable, InterfaceC9100d interfaceC9100d) {
        long j11;
        Runnable runnable2;
        InterfaceC9100d interfaceC9100d2;
        Executor executorMo16230i = mo16230i();
        ScheduledFuture scheduledFutureM16776o = null;
        ScheduledExecutorService scheduledExecutorService = executorMo16230i instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorMo16230i : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            runnable2 = runnable;
            interfaceC9100d2 = interfaceC9100d;
            scheduledFutureM16776o = m16776o(scheduledExecutorService, runnable2, interfaceC9100d2, j11);
        } else {
            j11 = j10;
            runnable2 = runnable;
            interfaceC9100d2 = interfaceC9100d;
        }
        return scheduledFutureM16776o != null ? new C8846j0(scheduledFutureM16776o) : RunnableC9166f.f17681g.mo16335f(j11, runnable2, interfaceC9100d2);
    }

    @Override // kotlinx.coroutines.InterfaceC9203g
    /* renamed from: g */
    public void mo16336g(long j10, InterfaceC8845j interfaceC8845j) {
        long j11;
        Executor executorMo16230i = mo16230i();
        ScheduledFuture scheduledFutureM16776o = null;
        ScheduledExecutorService scheduledExecutorService = executorMo16230i instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorMo16230i : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            scheduledFutureM16776o = m16776o(scheduledExecutorService, new RunnableC8862o1(this, interfaceC8845j), interfaceC8845j.getContext(), j11);
        } else {
            j11 = j10;
        }
        if (scheduledFutureM16776o != null) {
            AbstractC8823b1.m14812h(interfaceC8845j, scheduledFutureM16776o);
        } else {
            RunnableC9166f.f17681g.mo16336g(j11, interfaceC8845j);
        }
    }

    public int hashCode() {
        return System.identityHashCode(mo16230i());
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    /* renamed from: i */
    public Executor mo16230i() {
        return this.f18093b;
    }

    /* renamed from: m */
    public final void m16775m(InterfaceC9100d interfaceC9100d, RejectedExecutionException rejectedExecutionException) {
        AbstractC8823b1.m14807c(interfaceC9100d, AbstractC8870r0.m14906a("The task was rejected", rejectedExecutionException));
    }

    /* renamed from: o */
    public final ScheduledFuture m16776o(ScheduledExecutorService scheduledExecutorService, Runnable runnable, InterfaceC9100d interfaceC9100d, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            m16775m(interfaceC9100d, e10);
            return null;
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return mo16230i().toString();
    }
}
