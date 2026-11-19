package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.AbstractC9208j;
import p077d8.AbstractC8323h;
import p135i8.AbstractC8821b;
import p135i8.AbstractC8861o0;
import p135i8.C8883v1;
import p135i8.InterfaceC8849k0;

/* renamed from: kotlinx.coroutines.f */
/* loaded from: classes5.dex */
public final class RunnableC9166f extends AbstractC9208j implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: g */
    public static final RunnableC9166f f17681g;

    /* renamed from: h */
    public static final long f17682h;

    static {
        Long l10;
        RunnableC9166f runnableC9166f = new RunnableC9166f();
        f17681g = runnableC9166f;
        AbstractC8861o0.m14886v(runnableC9166f, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f17682h = timeUnit.toNanos(l10.longValue());
    }

    @Override // kotlinx.coroutines.AbstractC9209k
    /* renamed from: B */
    public Thread mo14831B() {
        Thread thread = _thread;
        return thread == null ? m16563V() : thread;
    }

    @Override // kotlinx.coroutines.AbstractC9209k
    /* renamed from: C */
    public void mo16560C(long j10, AbstractC9208j.c cVar) {
        m16567Z();
    }

    @Override // kotlinx.coroutines.AbstractC9208j
    /* renamed from: H */
    public void mo16561H(Runnable runnable) {
        if (m16564W()) {
            m16567Z();
        }
        super.mo16561H(runnable);
    }

    /* renamed from: U */
    public final synchronized void m16562U() {
        if (m16565X()) {
            debugStatus = 3;
            m16763O();
            AbstractC9133u.m16131e(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* renamed from: V */
    public final synchronized Thread m16563V() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(RunnableC9166f.class.getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: W */
    public final boolean m16564W() {
        return debugStatus == 4;
    }

    /* renamed from: X */
    public final boolean m16565X() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    /* renamed from: Y */
    public final synchronized boolean m16566Y() {
        if (m16565X()) {
            return false;
        }
        debugStatus = 1;
        AbstractC9133u.m16131e(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    /* renamed from: Z */
    public final void m16567Z() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.AbstractC9208j, kotlinx.coroutines.InterfaceC9203g
    /* renamed from: f */
    public InterfaceC8849k0 mo16335f(long j10, Runnable runnable, InterfaceC9100d interfaceC9100d) {
        return m16766R(j10, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zM16761M;
        C8883v1.f16542a.m14925d(this);
        AbstractC8821b.m14804a();
        try {
            if (!m16566Y()) {
                if (zM16761M) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jMo14895y = mo14895y();
                if (jMo14895y == Long.MAX_VALUE) {
                    AbstractC8821b.m14804a();
                    long jNanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f17682h + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        m16562U();
                        AbstractC8821b.m14804a();
                        if (m16761M()) {
                            return;
                        }
                        mo14831B();
                        return;
                    }
                    jMo14895y = AbstractC8323h.m13514i(jMo14895y, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jMo14895y > 0) {
                    if (m16565X()) {
                        _thread = null;
                        m16562U();
                        AbstractC8821b.m14804a();
                        if (m16761M()) {
                            return;
                        }
                        mo14831B();
                        return;
                    }
                    AbstractC8821b.m14804a();
                    LockSupport.parkNanos(this, jMo14895y);
                }
            }
        } finally {
            _thread = null;
            m16562U();
            AbstractC8821b.m14804a();
            if (!m16761M()) {
                mo14831B();
            }
        }
    }

    @Override // kotlinx.coroutines.AbstractC9208j, p135i8.AbstractC8861o0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
