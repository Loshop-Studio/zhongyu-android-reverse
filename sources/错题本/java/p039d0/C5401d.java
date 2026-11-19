package p039d0;

import android.support.v4.media.C0039h;
import android.util.Log;
import coil3.disk.C3284b;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import p016b0.C3071g;
import p140q.C6400d;
import p186w.AbstractC6692g;
import p186w.C6689d;
import p202y.C6763f;
import p202y.InterfaceC6758a;
import p202y.InterfaceC6760c;

/* renamed from: d0.d */
/* loaded from: classes2.dex */
public final class C5401d implements InterfaceC5398a {

    /* renamed from: b */
    public final File f8349b;

    /* renamed from: e */
    public C6689d f8352e;

    /* renamed from: d */
    public final C0039h f8351d = new C0039h(10);

    /* renamed from: c */
    public final long f8350c = 262144000;

    /* renamed from: a */
    public final C5407j f8348a = new C5407j();

    public C5401d(File file) {
        this.f8349b = file;
    }

    @Override // p039d0.InterfaceC5398a
    /* renamed from: a */
    public final File mo4793a(InterfaceC6760c interfaceC6760c) {
        String strM4799a = this.f8348a.m4799a(interfaceC6760c);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strM4799a + " for for Key: " + interfaceC6760c);
        }
        try {
            C6400d c6400dM6389f = m4796b().m6389f(strM4799a);
            if (c6400dM6389f != null) {
                return ((File[]) c6400dM6389f.f10500a)[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    /* renamed from: b */
    public final synchronized C6689d m4796b() {
        try {
            if (this.f8352e == null) {
                this.f8352e = C6689d.m6386h(this.f8349b, this.f8350c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8352e;
    }

    @Override // p039d0.InterfaceC5398a
    /* renamed from: c */
    public final void mo4794c(InterfaceC6760c interfaceC6760c, C3071g c3071g) {
        C5399b c5399b;
        boolean z8;
        String strM4799a = this.f8348a.m4799a(interfaceC6760c);
        C0039h c0039h = this.f8351d;
        synchronized (c0039h) {
            c5399b = (C5399b) ((HashMap) c0039h.f96b).get(strM4799a);
            if (c5399b == null) {
                C5400c c5400c = (C5400c) c0039h.f97c;
                synchronized (c5400c.f8347a) {
                    c5399b = (C5399b) c5400c.f8347a.poll();
                }
                if (c5399b == null) {
                    c5399b = new C5399b();
                }
                ((HashMap) c0039h.f96b).put(strM4799a, c5399b);
            }
            c5399b.f8346b++;
        }
        c5399b.f8345a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strM4799a + " for for Key: " + interfaceC6760c);
            }
            try {
                C6689d c6689dM4796b = m4796b();
                if (c6689dM4796b.m6389f(strM4799a) == null) {
                    C3284b c3284bM6388d = c6689dM4796b.m6388d(strM4799a);
                    if (c3284bM6388d == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strM4799a));
                    }
                    try {
                        if (((InterfaceC6758a) c3071g.f1420b).mo124s(c3071g.f1421c, c3284bM6388d.m2212d(), (C6763f) c3071g.f1422d)) {
                            C6689d.m6382a((C6689d) c3284bM6388d.f1936d, c3284bM6388d, true);
                            c3284bM6388d.f1934b = true;
                        }
                        if (!z8) {
                            try {
                                c3284bM6388d.m2209a();
                            } catch (IOException unused) {
                            }
                        }
                    } finally {
                        if (!c3284bM6388d.f1934b) {
                            try {
                                c3284bM6388d.m2209a();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            this.f8351d.m103A(strM4799a);
        }
    }

    @Override // p039d0.InterfaceC5398a
    public final synchronized void clear() {
        try {
            try {
                C6689d c6689dM4796b = m4796b();
                c6689dM4796b.close();
                AbstractC6692g.m6397a(c6689dM4796b.f11286a);
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e);
                }
                synchronized (this) {
                    this.f8352e = null;
                }
            }
            synchronized (this) {
                this.f8352e = null;
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.f8352e = null;
                throw th;
            }
        }
    }
}
