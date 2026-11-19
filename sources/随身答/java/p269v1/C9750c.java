package p269v1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;
import p219q1.AbstractC9353c;

/* renamed from: v1.c */
/* loaded from: classes4.dex */
public class C9750c {

    /* renamed from: c */
    public static final long f17227c = TimeUnit.MILLISECONDS.toNanos(100);

    /* renamed from: a */
    public final Map f17228a;

    /* renamed from: b */
    public final Map f17229b;

    public C9750c(Map map, Map map2) {
        this.f17228a = map;
        this.f17229b = map2;
    }

    /* renamed from: a */
    public void m16298a(String str) {
        AtomicInteger atomicInteger;
        Thread thread;
        synchronized (this.f17228a) {
            atomicInteger = (AtomicInteger) this.f17228a.get(str);
        }
        if (atomicInteger == null || atomicInteger.decrementAndGet() != 0) {
            return;
        }
        AbstractC9353c.m15306i("FileLock", "decreaseLock decrease lock-count to 0 " + str);
        synchronized (this.f17229b) {
            try {
                thread = (Thread) this.f17229b.get(str);
                if (thread != null) {
                    this.f17229b.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (thread != null) {
            AbstractC9353c.m15306i("FileLock", "decreaseLock " + str + " unpark locked thread " + atomicInteger);
            m16302e(thread);
        }
        synchronized (this.f17228a) {
            this.f17228a.remove(str);
        }
    }

    /* renamed from: b */
    public void m16299b(String str) {
        AtomicInteger atomicInteger;
        synchronized (this.f17228a) {
            atomicInteger = (AtomicInteger) this.f17228a.get(str);
        }
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
            synchronized (this.f17228a) {
                this.f17228a.put(str, atomicInteger);
            }
        }
        AbstractC9353c.m15306i("FileLock", "increaseLock increase lock-count to " + atomicInteger.incrementAndGet() + str);
    }

    /* renamed from: c */
    public boolean m16300c(AtomicInteger atomicInteger) {
        return atomicInteger.get() <= 0;
    }

    /* renamed from: d */
    public void m16301d() {
        LockSupport.park(Long.valueOf(f17227c));
    }

    /* renamed from: e */
    public void m16302e(Thread thread) {
        LockSupport.unpark(thread);
    }

    /* renamed from: f */
    public void m16303f(String str) {
        AtomicInteger atomicInteger;
        synchronized (this.f17228a) {
            atomicInteger = (AtomicInteger) this.f17228a.get(str);
        }
        if (atomicInteger == null || atomicInteger.get() <= 0) {
            return;
        }
        synchronized (this.f17229b) {
            this.f17229b.put(str, Thread.currentThread());
        }
        AbstractC9353c.m15306i("FileLock", "waitForRelease start " + str);
        while (!m16300c(atomicInteger)) {
            m16301d();
        }
        AbstractC9353c.m15306i("FileLock", "waitForRelease finish " + str);
    }

    public C9750c() {
        this(new HashMap(), new HashMap());
    }
}
