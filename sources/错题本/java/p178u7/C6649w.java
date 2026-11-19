package p178u7;

import java.io.IOException;
import java.util.ArrayDeque;
import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.C6329q;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import p139p7.AbstractC6396c;

/* renamed from: u7.w */
/* loaded from: classes4.dex */
public final class C6649w {

    /* renamed from: a */
    public final int f11198a;

    /* renamed from: b */
    public final C6641o f11199b;

    /* renamed from: c */
    public long f11200c;

    /* renamed from: d */
    public long f11201d;

    /* renamed from: e */
    public long f11202e;

    /* renamed from: f */
    public long f11203f;

    /* renamed from: g */
    public final ArrayDeque f11204g;

    /* renamed from: h */
    public boolean f11205h;

    /* renamed from: i */
    public final C6647u f11206i;

    /* renamed from: j */
    public final C6646t f11207j;

    /* renamed from: k */
    public final C6648v f11208k;

    /* renamed from: l */
    public final C6648v f11209l;

    /* renamed from: m */
    public ErrorCode f11210m;

    /* renamed from: n */
    public IOException f11211n;

    public C6649w(int i, C6641o connection, boolean z8, boolean z9, C6329q c6329q) {
        AbstractC5830k.m5330g(connection, "connection");
        this.f11198a = i;
        this.f11199b = connection;
        this.f11203f = connection.f11160q.m6262a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f11204g = arrayDeque;
        this.f11206i = new C6647u(this, connection.f11159p.m6262a(), z9);
        this.f11207j = new C6646t(this, z8);
        this.f11208k = new C6648v(this);
        this.f11209l = new C6648v(this);
        if (c6329q == null) {
            if (!m6300g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (m6300g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(c6329q);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6294a() {
        /*
            r2 = this;
            byte[] r0 = p139p7.AbstractC6396c.f10486a
            monitor-enter(r2)
            u7.u r0 = r2.f11206i     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f11192b     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.f11195e     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            u7.t r0 = r2.f11207j     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f11187a     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.f11189c     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            goto L1a
        L18:
            r0 = move-exception
            goto L35
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r1 = r2.m6301h()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L2b
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL
            r1 = 0
            r2.m6296c(r0, r1)
            return
        L2b:
            if (r1 != 0) goto L34
            u7.o r0 = r2.f11199b
            int r1 = r2.f11198a
            r0.m6280d(r1)
        L34:
            return
        L35:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p178u7.C6649w.m6294a():void");
    }

    /* renamed from: b */
    public final void m6295b() throws IOException {
        C6646t c6646t = this.f11207j;
        if (c6646t.f11189c) {
            throw new IOException("stream closed");
        }
        if (c6646t.f11187a) {
            throw new IOException("stream finished");
        }
        if (this.f11210m != null) {
            IOException iOException = this.f11211n;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f11210m;
            AbstractC5830k.m5327d(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    /* renamed from: c */
    public final void m6296c(ErrorCode rstStatusCode, IOException iOException) {
        AbstractC5830k.m5330g(rstStatusCode, "rstStatusCode");
        if (m6297d(rstStatusCode, iOException)) {
            C6641o c6641o = this.f11199b;
            c6641o.getClass();
            c6641o.f11166w.m6310g(this.f11198a, rstStatusCode);
        }
    }

    /* renamed from: d */
    public final boolean m6297d(ErrorCode errorCode, IOException iOException) {
        byte[] bArr = AbstractC6396c.f10486a;
        synchronized (this) {
            if (this.f11210m != null) {
                return false;
            }
            this.f11210m = errorCode;
            this.f11211n = iOException;
            notifyAll();
            if (this.f11206i.f11192b) {
                if (this.f11207j.f11187a) {
                    return false;
                }
            }
            this.f11199b.m6280d(this.f11198a);
            return true;
        }
    }

    /* renamed from: e */
    public final void m6298e(ErrorCode errorCode) {
        AbstractC5830k.m5330g(errorCode, "errorCode");
        if (m6297d(errorCode, null)) {
            this.f11199b.m6284h(this.f11198a, errorCode);
        }
    }

    /* renamed from: f */
    public final C6646t m6299f() {
        synchronized (this) {
            if (!this.f11205h && !m6300g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f11207j;
    }

    /* renamed from: g */
    public final boolean m6300g() {
        boolean z8 = (this.f11198a & 1) == 1;
        this.f11199b.getClass();
        return true == z8;
    }

    /* renamed from: h */
    public final synchronized boolean m6301h() {
        try {
            if (this.f11210m != null) {
                return false;
            }
            C6647u c6647u = this.f11206i;
            if (c6647u.f11192b || c6647u.f11195e) {
                C6646t c6646t = this.f11207j;
                if (c6646t.f11187a || c6646t.f11189c) {
                    if (this.f11205h) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: i */
    public final void m6302i(C6329q headers, boolean z8) {
        boolean zM6301h;
        AbstractC5830k.m5330g(headers, "headers");
        byte[] bArr = AbstractC6396c.f10486a;
        synchronized (this) {
            try {
                if (this.f11205h && z8) {
                    this.f11206i.getClass();
                } else {
                    this.f11205h = true;
                    this.f11204g.add(headers);
                }
                if (z8) {
                    this.f11206i.f11192b = true;
                }
                zM6301h = m6301h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM6301h) {
            return;
        }
        this.f11199b.m6280d(this.f11198a);
    }

    /* renamed from: j */
    public final synchronized void m6303j(ErrorCode errorCode) {
        AbstractC5830k.m5330g(errorCode, "errorCode");
        if (this.f11210m == null) {
            this.f11210m = errorCode;
            notifyAll();
        }
    }
}
