package p329s1;

import com.danikula.videocache.InterruptedProxyCacheException;
import com.danikula.videocache.ProxyCacheException;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: s1.m */
/* loaded from: classes3.dex */
public abstract class AbstractC11046m {

    /* renamed from: a */
    public final InterfaceC11048o f26666a;

    /* renamed from: b */
    public final InterfaceC11034a f26667b;

    /* renamed from: f */
    public volatile Thread f26671f;

    /* renamed from: g */
    public volatile boolean f26672g;

    /* renamed from: c */
    public final Object f26668c = new Object();

    /* renamed from: d */
    public final Object f26669d = new Object();

    /* renamed from: h */
    public volatile int f26673h = -1;

    /* renamed from: e */
    public final AtomicInteger f26670e = new AtomicInteger();

    /* renamed from: s1.m$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC11046m.this.m24478k();
        }
    }

    public AbstractC11046m(InterfaceC11048o interfaceC11048o, InterfaceC11034a interfaceC11034a) {
        this.f26666a = (InterfaceC11048o) AbstractC11045l.m24467d(interfaceC11048o);
        this.f26667b = (InterfaceC11034a) AbstractC11045l.m24467d(interfaceC11034a);
    }

    /* renamed from: b */
    public final void m24470b() throws ProxyCacheException {
        int i10 = this.f26670e.get();
        if (i10 < 1) {
            return;
        }
        this.f26670e.set(0);
        throw new ProxyCacheException("Error reading source " + i10 + " times");
    }

    /* renamed from: c */
    public final void m24471c() {
        try {
            this.f26666a.close();
        } catch (ProxyCacheException e10) {
            m24475h(new ProxyCacheException("Error closing source " + this.f26666a, e10));
        }
    }

    /* renamed from: d */
    public final boolean m24472d() {
        return Thread.currentThread().isInterrupted() || this.f26672g;
    }

    /* renamed from: e */
    public final void m24473e(long j10, long j11) {
        m24474f(j10, j11);
        synchronized (this.f26668c) {
            this.f26668c.notifyAll();
        }
    }

    /* renamed from: f */
    public void m24474f(long j10, long j11) {
        int i10 = j11 == 0 ? 100 : (int) ((j10 / j11) * 100.0f);
        boolean z10 = i10 != this.f26673h;
        if (j11 >= 0 && z10) {
            mo24393g(i10);
        }
        this.f26673h = i10;
    }

    /* renamed from: g */
    public abstract void mo24393g(int i10);

    /* renamed from: h */
    public final void m24475h(Throwable th) {
        if (th instanceof InterruptedProxyCacheException) {
            AbstractC11039f.m24404d("ProxyCache is interrupted");
        } else {
            AbstractC11039f.m24403c("ProxyCache error", th.getMessage());
        }
    }

    /* renamed from: i */
    public final void m24476i() {
        this.f26673h = 100;
        mo24393g(this.f26673h);
    }

    /* renamed from: j */
    public int m24477j(byte[] bArr, long j10, int i10) throws ProxyCacheException {
        AbstractC11047n.m24483a(bArr, j10, i10);
        while (!this.f26667b.isCompleted() && this.f26667b.available() < i10 + j10 && !this.f26672g) {
            m24479l();
            m24482o();
            m24470b();
        }
        int iMo24388b = this.f26667b.mo24388b(bArr, j10, i10);
        if (this.f26667b.isCompleted() && this.f26673h != 100) {
            this.f26673h = 100;
            mo24393g(100);
        }
        return iMo24388b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        r2 = r2 + r5;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m24478k() {
        /*
            r8 = this;
            r0 = -1
            r2 = 0
            s1.a r4 = r8.f26667b     // Catch: java.lang.Throwable -> L41
            long r2 = r4.available()     // Catch: java.lang.Throwable -> L41
            s1.o r4 = r8.f26666a     // Catch: java.lang.Throwable -> L41
            r4.mo24447a(r2)     // Catch: java.lang.Throwable -> L41
            s1.o r4 = r8.f26666a     // Catch: java.lang.Throwable -> L41
            long r0 = r4.length()     // Catch: java.lang.Throwable -> L41
            r4 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L41
        L19:
            s1.o r5 = r8.f26666a     // Catch: java.lang.Throwable -> L41
            int r5 = r5.read(r4)     // Catch: java.lang.Throwable -> L41
            r6 = -1
            if (r5 == r6) goto L45
            java.lang.Object r6 = r8.f26669d     // Catch: java.lang.Throwable -> L41
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L41
            boolean r7 = r8.m24472d()     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L35
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L33
        L2c:
            r8.m24471c()
            r8.m24473e(r2, r0)
            return
        L33:
            r4 = move-exception
            goto L43
        L35:
            s1.a r7 = r8.f26667b     // Catch: java.lang.Throwable -> L33
            r7.mo24387a(r4, r5)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L33
            long r5 = (long) r5
            long r2 = r2 + r5
            r8.m24473e(r2, r0)     // Catch: java.lang.Throwable -> L41
            goto L19
        L41:
            r4 = move-exception
            goto L4c
        L43:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L33
            throw r4     // Catch: java.lang.Throwable -> L41
        L45:
            r8.m24481n()     // Catch: java.lang.Throwable -> L41
            r8.m24476i()     // Catch: java.lang.Throwable -> L41
            goto L2c
        L4c:
            java.util.concurrent.atomic.AtomicInteger r5 = r8.f26670e     // Catch: java.lang.Throwable -> L55
            r5.incrementAndGet()     // Catch: java.lang.Throwable -> L55
            r8.m24475h(r4)     // Catch: java.lang.Throwable -> L55
            goto L2c
        L55:
            r4 = move-exception
            r8.m24471c()
            r8.m24473e(r2, r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p329s1.AbstractC11046m.m24478k():void");
    }

    /* renamed from: l */
    public final synchronized void m24479l() {
        try {
            boolean z10 = (this.f26671f == null || this.f26671f.getState() == Thread.State.TERMINATED) ? false : true;
            if (!this.f26672g && !this.f26667b.isCompleted() && !z10) {
                this.f26671f = new Thread(new b(), "Source reader for " + this.f26666a);
                this.f26671f.start();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: m */
    public void m24480m() {
        synchronized (this.f26669d) {
            try {
                try {
                    this.f26672g = true;
                    if (this.f26671f != null) {
                        this.f26671f.interrupt();
                    }
                    this.f26667b.close();
                } catch (ProxyCacheException e10) {
                    m24475h(e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: n */
    public final void m24481n() {
        synchronized (this.f26669d) {
            try {
                if (!m24472d() && this.f26667b.available() == this.f26666a.length()) {
                    this.f26667b.complete();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: o */
    public final void m24482o() {
        synchronized (this.f26668c) {
            try {
                try {
                    this.f26668c.wait(1000L);
                } catch (InterruptedException e10) {
                    throw new ProxyCacheException("Waiting source data is interrupted!", e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
