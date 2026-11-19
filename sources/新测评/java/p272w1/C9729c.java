package p272w1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;
import p218r1.AbstractC8999c;

/* renamed from: w1.c */
/* loaded from: classes4.dex */
public class C9729c {

    /* renamed from: c */
    public static final long f17066c = TimeUnit.MILLISECONDS.toNanos(100);

    /* renamed from: a */
    public final Map f17067a;

    /* renamed from: b */
    public final Map f17068b;

    public C9729c(Map map, Map map2) {
        this.f17067a = map;
        this.f17068b = map2;
    }

    /* renamed from: a */
    public void m16265a(String str) {
        AtomicInteger atomicInteger;
        Thread thread;
        synchronized (this.f17067a) {
            atomicInteger = (AtomicInteger) this.f17067a.get(str);
        }
        if (atomicInteger == null || atomicInteger.decrementAndGet() != 0) {
            return;
        }
        AbstractC8999c.m15125i("FileLock", "decreaseLock decrease lock-count to 0 " + str);
        synchronized (this.f17068b) {
            try {
                thread = (Thread) this.f17068b.get(str);
                if (thread != null) {
                    this.f17068b.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (thread != null) {
            AbstractC8999c.m15125i("FileLock", "decreaseLock " + str + " unpark locked thread " + atomicInteger);
            m16269e(thread);
        }
        synchronized (this.f17067a) {
            this.f17067a.remove(str);
        }
    }

    /* renamed from: b */
    public void m16266b(String str) {
        AtomicInteger atomicInteger;
        synchronized (this.f17067a) {
            atomicInteger = (AtomicInteger) this.f17067a.get(str);
        }
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
            synchronized (this.f17067a) {
                this.f17067a.put(str, atomicInteger);
            }
        }
        AbstractC8999c.m15125i("FileLock", "increaseLock increase lock-count to " + atomicInteger.incrementAndGet() + str);
    }

    /* renamed from: c */
    public boolean m16267c(AtomicInteger atomicInteger) {
        return atomicInteger.get() <= 0;
    }

    /* renamed from: d */
    public void m16268d() {
        LockSupport.park(Long.valueOf(f17066c));
    }

    /* renamed from: e */
    public void m16269e(Thread thread) {
        LockSupport.unpark(thread);
    }

    /* renamed from: f */
    public void m16270f(String str) {
        AtomicInteger atomicInteger;
        synchronized (this.f17067a) {
            atomicInteger = (AtomicInteger) this.f17067a.get(str);
        }
        if (atomicInteger == null || atomicInteger.get() <= 0) {
            return;
        }
        synchronized (this.f17068b) {
            this.f17068b.put(str, Thread.currentThread());
        }
        AbstractC8999c.m15125i("FileLock", "waitForRelease start " + str);
        while (!m16267c(atomicInteger)) {
            m16268d();
        }
        AbstractC8999c.m15125i("FileLock", "waitForRelease finish " + str);
    }

    public C9729c() {
        this(new HashMap(), new HashMap());
    }
}
