package kotlinx.coroutines;

import androidx.compose.animation.core.AnimationKt;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5636h;

/* renamed from: kotlinx.coroutines.y */
/* loaded from: classes4.dex */
public final class RunnableC6016y extends AbstractC5984n0 implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: h */
    public static final RunnableC6016y f9528h;

    /* renamed from: i */
    public static final long f9529i;

    static {
        Long l;
        RunnableC6016y runnableC6016y = new RunnableC6016y();
        f9528h = runnableC6016y;
        runnableC6016y.m5605m(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f9529i = timeUnit.toNanos(l.longValue());
    }

    @Override // kotlinx.coroutines.AbstractC5984n0, kotlinx.coroutines.InterfaceC5870c0
    /* renamed from: a */
    public final InterfaceC5962g0 mo4815a(long j7, RunnableC5994q1 runnableC5994q1, InterfaceC5636h interfaceC5636h) {
        long j8 = j7 > 0 ? j7 >= 9223372036854L ? Long.MAX_VALUE : AnimationKt.MillisToNanos * j7 : 0L;
        if (j8 >= 4611686018427387903L) {
            return C5966h1.f9456a;
        }
        long jNanoTime = System.nanoTime();
        C5975k0 c5975k0 = new C5975k0(j8 + jNanoTime, runnableC5994q1);
        m5601v(jNanoTime, c5975k0);
        return c5975k0;
    }

    @Override // kotlinx.coroutines.AbstractC5987o0
    /* renamed from: l */
    public final Thread mo5514l() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f9528h.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // kotlinx.coroutines.AbstractC5987o0
    /* renamed from: q */
    public final void mo5607q(long j7, AbstractRunnableC5978l0 abstractRunnableC5978l0) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.AbstractC5984n0
    /* renamed from: r */
    public final void mo5597r(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo5597r(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM5600u;
        AbstractC5988o1.f9484a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zM5600u) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j7 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jMo5596n = mo5596n();
                    if (jMo5596n == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j7 == Long.MAX_VALUE) {
                            j7 = f9529i + jNanoTime;
                        }
                        long j8 = j7 - jNanoTime;
                        if (j8 <= 0) {
                            _thread = null;
                            m5656w();
                            if (m5600u()) {
                                return;
                            }
                            mo5514l();
                            return;
                        }
                        if (jMo5596n > j8) {
                            jMo5596n = j8;
                        }
                    } else {
                        j7 = Long.MAX_VALUE;
                    }
                    if (jMo5596n > 0) {
                        int i8 = debugStatus;
                        if (i8 == 2 || i8 == 3) {
                            _thread = null;
                            m5656w();
                            if (m5600u()) {
                                return;
                            }
                            mo5514l();
                            return;
                        }
                        LockSupport.parkNanos(this, jMo5596n);
                    }
                }
            }
        } finally {
            _thread = null;
            m5656w();
            if (!m5600u()) {
                mo5514l();
            }
        }
    }

    @Override // kotlinx.coroutines.AbstractC5984n0, kotlinx.coroutines.AbstractC5987o0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final String toString() {
        return "DefaultExecutor";
    }

    /* renamed from: w */
    public final synchronized void m5656w() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            AbstractC5984n0.f9472e.set(this, null);
            AbstractC5984n0.f9473f.set(this, null);
            notifyAll();
        }
    }
}
