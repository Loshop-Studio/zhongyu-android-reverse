package p087f3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p014b3.C1037f;

/* renamed from: f3.m0 */
/* loaded from: classes.dex */
public final class RunnableC2577m0 extends AbstractC2530a1 implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: g */
    @NotNull
    public static final RunnableC2577m0 f10266g;

    /* renamed from: h */
    private static final long f10267h;

    static {
        Long l3;
        RunnableC2577m0 runnableC2577m0 = new RunnableC2577m0();
        f10266g = runnableC2577m0;
        AbstractC2617z0.m8763R(runnableC2577m0, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l3 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l3 = 1000L;
        }
        f10267h = timeUnit.toNanos(l3.longValue());
    }

    private RunnableC2577m0() {
    }

    /* renamed from: n0 */
    private final synchronized void m8625n0() {
        if (m8627p0()) {
            debugStatus = 3;
            m8516i0();
            notifyAll();
        }
    }

    /* renamed from: o0 */
    private final synchronized Thread m8626o0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: p0 */
    private final boolean m8627p0() {
        int i4 = debugStatus;
        return i4 == 2 || i4 == 3;
    }

    /* renamed from: q0 */
    private final synchronized boolean m8628q0() {
        if (m8627p0()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    @Override // p087f3.AbstractC2534b1
    @NotNull
    /* renamed from: X */
    protected Thread mo8526X() {
        Thread thread = _thread;
        return thread == null ? m8626o0() : thread;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zM8515g0;
        C2563i2.f10245a.m8581d(this);
        C2536c.m8530a();
        try {
            if (!m8628q0()) {
                if (zM8515g0) {
                    return;
                } else {
                    return;
                }
            }
            long j4 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jMo8513U = mo8513U();
                if (jMo8513U == Long.MAX_VALUE) {
                    C2536c.m8530a();
                    long jNanoTime = System.nanoTime();
                    if (j4 == Long.MAX_VALUE) {
                        j4 = f10267h + jNanoTime;
                    }
                    long j5 = j4 - jNanoTime;
                    if (j5 <= 0) {
                        _thread = null;
                        m8625n0();
                        C2536c.m8530a();
                        if (m8515g0()) {
                            return;
                        }
                        mo8526X();
                        return;
                    }
                    jMo8513U = C1037f.m4824e(jMo8513U, j5);
                } else {
                    j4 = Long.MAX_VALUE;
                }
                if (jMo8513U > 0) {
                    if (m8627p0()) {
                        _thread = null;
                        m8625n0();
                        C2536c.m8530a();
                        if (m8515g0()) {
                            return;
                        }
                        mo8526X();
                        return;
                    }
                    C2536c.m8530a();
                    LockSupport.parkNanos(this, jMo8513U);
                }
            }
        } finally {
            _thread = null;
            m8625n0();
            C2536c.m8530a();
            if (!m8515g0()) {
                mo8526X();
            }
        }
    }
}
