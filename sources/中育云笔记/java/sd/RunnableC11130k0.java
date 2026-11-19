package sd;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;
import sd.AbstractC11178y0;

/* renamed from: sd.k0 */
/* loaded from: classes6.dex */
public final class RunnableC11130k0 extends AbstractC11178y0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: i */
    public static final RunnableC11130k0 f26794i;

    /* renamed from: j */
    public static final long f26795j;

    static {
        Long l10;
        RunnableC11130k0 runnableC11130k0 = new RunnableC11130k0();
        f26794i = runnableC11130k0;
        AbstractC11175x0.m24817u(runnableC11130k0, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f26795j = timeUnit.toNanos(l10.longValue());
    }

    @Override // sd.AbstractC11181z0
    /* renamed from: E */
    public Thread mo24694E() {
        Thread thread = _thread;
        return thread == null ? m24744Z() : thread;
    }

    @Override // sd.AbstractC11181z0
    /* renamed from: F */
    public void mo24741F(long j10, AbstractC11178y0.c cVar) {
        m24748d0();
    }

    @Override // sd.AbstractC11178y0
    /* renamed from: K */
    public void mo24742K(Runnable runnable) {
        if (m24745a0()) {
            m24748d0();
        }
        super.mo24742K(runnable);
    }

    /* renamed from: Y */
    public final synchronized void m24743Y() {
        if (m24746b0()) {
            debugStatus = 3;
            m24841S();
            AbstractC9979u.m20292e(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* renamed from: Z */
    public final synchronized Thread m24744Z() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f26794i.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: a0 */
    public final boolean m24745a0() {
        return debugStatus == 4;
    }

    /* renamed from: b0 */
    public final boolean m24746b0() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    @Override // sd.AbstractC11178y0, sd.InterfaceC11146o0
    /* renamed from: c */
    public InterfaceC11163t0 mo24710c(long j10, Runnable runnable, InterfaceC9945d interfaceC9945d) {
        return m24844V(j10, runnable);
    }

    /* renamed from: c0 */
    public final synchronized boolean m24747c0() {
        if (m24746b0()) {
            return false;
        }
        debugStatus = 1;
        AbstractC9979u.m20292e(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    /* renamed from: d0 */
    public final void m24748d0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zM24839Q;
        C11120h2.f26785a.m24732d(this);
        AbstractC11093b.m24675a();
        try {
            if (!m24747c0()) {
                if (zM24839Q) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jMo24818B = mo24818B();
                if (jMo24818B == Long.MAX_VALUE) {
                    AbstractC11093b.m24675a();
                    long jNanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f26795j + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        m24743Y();
                        AbstractC11093b.m24675a();
                        if (m24839Q()) {
                            return;
                        }
                        mo24694E();
                        return;
                    }
                    jMo24818B = AbstractC10410o.m21757j(jMo24818B, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jMo24818B > 0) {
                    if (m24746b0()) {
                        _thread = null;
                        m24743Y();
                        AbstractC11093b.m24675a();
                        if (m24839Q()) {
                            return;
                        }
                        mo24694E();
                        return;
                    }
                    AbstractC11093b.m24675a();
                    LockSupport.parkNanos(this, jMo24818B);
                }
            }
        } finally {
            _thread = null;
            m24743Y();
            AbstractC11093b.m24675a();
            if (!m24839Q()) {
                mo24694E();
            }
        }
    }

    @Override // sd.AbstractC11178y0, sd.AbstractC11175x0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // sd.AbstractC11106e0
    public String toString() {
        return "DefaultExecutor";
    }
}
