package p147r0;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.C3420a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p155s0.InterfaceC6550i;
import p180v0.AbstractC6664k;

/* renamed from: r0.c */
/* loaded from: classes2.dex */
public final class FutureC6445c implements Future, InterfaceC6550i {

    /* renamed from: a */
    public Object f10580a;

    /* renamed from: b */
    public InterfaceC6444b f10581b;

    /* renamed from: c */
    public boolean f10582c;

    /* renamed from: d */
    public boolean f10583d;

    /* renamed from: e */
    public boolean f10584e;

    /* renamed from: f */
    public GlideException f10585f;

    @Override // p155s0.InterfaceC6550i
    /* renamed from: a */
    public final synchronized InterfaceC6444b mo6101a() {
        return this.f10581b;
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: c */
    public final synchronized void mo2380c(Object obj) {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f10582c = true;
                notifyAll();
                Object obj = null;
                if (z8) {
                    Object obj2 = this.f10581b;
                    this.f10581b = null;
                    obj = obj2;
                }
                if (obj != null) {
                    ((C3420a) obj).m2421c();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: d */
    public final void mo6103d(C3420a c3420a) throws Throwable {
        c3420a.m2431m(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: g */
    public final synchronized void mo6105g(C3420a c3420a) {
        this.f10581b = c3420a;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return m6106i(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: h */
    public final synchronized void mo2381h(Drawable drawable) {
    }

    /* renamed from: i */
    public final synchronized Object m6106i(Long l) {
        if (!isDone()) {
            char[] cArr = AbstractC6664k.f11243a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
        }
        if (this.f10582c) {
            throw new CancellationException();
        }
        if (this.f10584e) {
            throw new ExecutionException(this.f10585f);
        }
        if (this.f10583d) {
            return this.f10580a;
        }
        if (l == null) {
            wait(0L);
        } else if (l.longValue() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = l.longValue() + jCurrentTimeMillis;
            while (!isDone() && jCurrentTimeMillis < jLongValue) {
                wait(jLongValue - jCurrentTimeMillis);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.f10584e) {
            throw new ExecutionException(this.f10585f);
        }
        if (this.f10582c) {
            throw new CancellationException();
        }
        if (!this.f10583d) {
            throw new TimeoutException();
        }
        return this.f10580a;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.f10582c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0012  */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean isDone() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f10582c     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.f10583d     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.f10584e     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            goto L12
        Le:
            r0 = 0
            goto L13
        L10:
            r0 = move-exception
            goto L15
        L12:
            r0 = 1
        L13:
            monitor-exit(r1)
            return r0
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p147r0.FutureC6445c.isDone():boolean");
    }

    /* renamed from: j */
    public final synchronized boolean m6107j(GlideException glideException) {
        this.f10584e = true;
        this.f10585f = glideException;
        notifyAll();
        return false;
    }

    /* renamed from: k */
    public final synchronized boolean m6108k(Object obj) {
        this.f10583d = true;
        this.f10580a = obj;
        notifyAll();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) {
        return m6106i(Long.valueOf(timeUnit.toMillis(j7)));
    }

    @Override // p127o0.InterfaceC6260f
    public final void onDestroy() {
    }

    @Override // p127o0.InterfaceC6260f
    public final void onStart() {
    }

    @Override // p127o0.InterfaceC6260f
    public final void onStop() {
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: b */
    public final void mo6102b(C3420a c3420a) {
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: e */
    public final void mo6104e(Drawable drawable) {
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: f */
    public final void mo5786f(Drawable drawable) {
    }
}
