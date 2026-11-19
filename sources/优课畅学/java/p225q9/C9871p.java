package p225q9;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.internal.http2.C9565c;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Socket;
import okio.Source;
import okio.Timeout;
import p123h7.C8736p;
import p136i9.C8924v;
import p147j9.AbstractC9041k;
import p236r9.C9947a;

/* renamed from: q9.p */
/* loaded from: classes5.dex */
public final class C9871p implements Socket {

    /* renamed from: n */
    public static final a f19719n = new a(null);

    /* renamed from: a */
    public final int f19720a;

    /* renamed from: b */
    public final C9565c f19721b;

    /* renamed from: c */
    public final C9947a f19722c;

    /* renamed from: d */
    public long f19723d;

    /* renamed from: e */
    public long f19724e;

    /* renamed from: f */
    public final ArrayDeque f19725f;

    /* renamed from: g */
    public boolean f19726g;

    /* renamed from: h */
    public final c f19727h;

    /* renamed from: i */
    public final b f19728i;

    /* renamed from: j */
    public final d f19729j;

    /* renamed from: k */
    public final d f19730k;

    /* renamed from: l */
    public ErrorCode f19731l;

    /* renamed from: m */
    public IOException f19732m;

    /* renamed from: q9.p$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: q9.p$b */
    public final class b implements Sink {

        /* renamed from: a */
        public boolean f19733a;

        /* renamed from: b */
        public final Buffer f19734b = new Buffer();

        /* renamed from: c */
        public C8924v f19735c;

        /* renamed from: d */
        public boolean f19736d;

        public b(boolean z10) {
            this.f19733a = z10;
        }

        /* JADX WARN: Finally extract failed */
        /* renamed from: a */
        public final void m18414a(boolean z10) throws IOException {
            long jMin;
            boolean z11;
            C9871p c9871p = C9871p.this;
            synchronized (c9871p) {
                try {
                    c9871p.m18406s().enter();
                    while (c9871p.m18405r() >= c9871p.m18404q() && !this.f19733a && !this.f19736d && c9871p.m18397j() == null) {
                        try {
                            c9871p.m18387C();
                        } catch (Throwable th) {
                            c9871p.m18406s().m18424a();
                            throw th;
                        }
                    }
                    c9871p.m18406s().m18424a();
                    c9871p.m18391d();
                    jMin = Math.min(c9871p.m18404q() - c9871p.m18405r(), this.f19734b.size());
                    c9871p.m18385A(c9871p.m18405r() + jMin);
                    z11 = z10 && jMin == this.f19734b.size();
                    C8736p c8736p = C8736p.f16368a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C9871p.this.m18406s().enter();
            try {
                C9871p.this.m18396i().m17998g0(C9871p.this.m18399l(), z11, this.f19734b, jMin);
            } finally {
                C9871p.this.m18406s().m18424a();
            }
        }

        /* renamed from: b */
        public final boolean m18415b() {
            return this.f19736d;
        }

        /* renamed from: c */
        public final boolean m18416c() {
            return this.f19733a;
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C9871p c9871p = C9871p.this;
            if (AbstractC9041k.f17265b && Thread.holdsLock(c9871p)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c9871p);
            }
            C9871p c9871p2 = C9871p.this;
            synchronized (c9871p2) {
                if (this.f19736d) {
                    return;
                }
                boolean z10 = c9871p2.m18397j() == null;
                C8736p c8736p = C8736p.f16368a;
                if (!C9871p.this.getSink().f19733a) {
                    boolean z11 = this.f19734b.size() > 0;
                    if (this.f19735c != null) {
                        while (this.f19734b.size() > 0) {
                            m18414a(false);
                        }
                        C9565c c9565cM18396i = C9871p.this.m18396i();
                        int iM18399l = C9871p.this.m18399l();
                        C8924v c8924v = this.f19735c;
                        AbstractC9133u.m16130d(c8924v);
                        c9565cM18396i.m17999h0(iM18399l, z10, AbstractC9041k.m15788r(c8924v));
                    } else if (z11) {
                        while (this.f19734b.size() > 0) {
                            m18414a(true);
                        }
                    } else if (z10) {
                        C9871p.this.m18396i().m17998g0(C9871p.this.m18399l(), true, null, 0L);
                    }
                }
                C9871p c9871p3 = C9871p.this;
                synchronized (c9871p3) {
                    this.f19736d = true;
                    AbstractC9133u.m16131e(c9871p3, "null cannot be cast to non-null type java.lang.Object");
                    c9871p3.notifyAll();
                    C8736p c8736p2 = C8736p.f16368a;
                }
                C9871p.this.m18396i().flush();
                C9871p.this.m18390c();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            C9871p c9871p = C9871p.this;
            if (AbstractC9041k.f17265b && Thread.holdsLock(c9871p)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c9871p);
            }
            C9871p c9871p2 = C9871p.this;
            synchronized (c9871p2) {
                c9871p2.m18391d();
                C8736p c8736p = C8736p.f16368a;
            }
            while (this.f19734b.size() > 0) {
                m18414a(false);
                C9871p.this.m18396i().flush();
            }
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return C9871p.this.m18406s();
        }

        @Override // okio.Sink
        public void write(Buffer source, long j10) throws IOException {
            AbstractC9133u.m16133g(source, "source");
            C9871p c9871p = C9871p.this;
            if (!AbstractC9041k.f17265b || !Thread.holdsLock(c9871p)) {
                this.f19734b.write(source, j10);
                while (this.f19734b.size() >= 16384) {
                    m18414a(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c9871p);
            }
        }
    }

    /* renamed from: q9.p$c */
    public final class c implements Source {

        /* renamed from: a */
        public final long f19738a;

        /* renamed from: b */
        public boolean f19739b;

        /* renamed from: c */
        public final Buffer f19740c = new Buffer();

        /* renamed from: d */
        public final Buffer f19741d = new Buffer();

        /* renamed from: e */
        public C8924v f19742e;

        /* renamed from: f */
        public boolean f19743f;

        public c(long j10, boolean z10) {
            this.f19738a = j10;
            this.f19739b = z10;
        }

        /* renamed from: a */
        public final boolean m18417a() {
            return this.f19743f;
        }

        /* renamed from: b */
        public final boolean m18418b() {
            return this.f19739b;
        }

        /* renamed from: c */
        public final Buffer m18419c() {
            return this.f19741d;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            C9871p c9871p = C9871p.this;
            synchronized (c9871p) {
                this.f19743f = true;
                size = this.f19741d.size();
                this.f19741d.clear();
                AbstractC9133u.m16131e(c9871p, "null cannot be cast to non-null type java.lang.Object");
                c9871p.notifyAll();
                C8736p c8736p = C8736p.f16368a;
            }
            if (size > 0) {
                m18423g(size);
            }
            C9871p.this.m18390c();
        }

        /* renamed from: d */
        public final void m18420d(BufferedSource source, long j10) throws EOFException {
            boolean z10;
            boolean z11;
            AbstractC9133u.m16133g(source, "source");
            C9871p c9871p = C9871p.this;
            if (AbstractC9041k.f17265b && Thread.holdsLock(c9871p)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c9871p);
            }
            long j11 = j10;
            while (j11 > 0) {
                synchronized (C9871p.this) {
                    z10 = this.f19739b;
                    z11 = this.f19741d.size() + j11 > this.f19738a;
                    C8736p c8736p = C8736p.f16368a;
                }
                if (z11) {
                    source.skip(j11);
                    C9871p.this.m18394g(ErrorCode.f19104f);
                    return;
                }
                if (z10) {
                    source.skip(j11);
                    return;
                }
                long j12 = source.read(this.f19740c, j11);
                if (j12 == -1) {
                    throw new EOFException();
                }
                j11 -= j12;
                C9871p c9871p2 = C9871p.this;
                synchronized (c9871p2) {
                    try {
                        if (this.f19743f) {
                            this.f19740c.clear();
                        } else {
                            boolean z12 = this.f19741d.size() == 0;
                            this.f19741d.writeAll(this.f19740c);
                            if (z12) {
                                AbstractC9133u.m16131e(c9871p2, "null cannot be cast to non-null type java.lang.Object");
                                c9871p2.notifyAll();
                            }
                        }
                    } finally {
                    }
                }
            }
            m18423g(j10);
            C9871p.this.m18396i().m17973B().mo17911b(C9871p.this.m18399l(), C9871p.this.m18400m(), this.f19741d.size());
        }

        /* renamed from: e */
        public final void m18421e(boolean z10) {
            this.f19739b = z10;
        }

        /* renamed from: f */
        public final void m18422f(C8924v c8924v) {
            this.f19742e = c8924v;
        }

        /* renamed from: g */
        public final void m18423g(long j10) {
            C9871p c9871p = C9871p.this;
            if (!AbstractC9041k.f17265b || !Thread.holdsLock(c9871p)) {
                C9871p.this.m18396i().m17997f0(j10);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c9871p);
        }

        @Override // okio.Source
        public long read(Buffer sink, long j10) throws IOException {
            IOException iOExceptionM18398k;
            boolean z10;
            long j11;
            AbstractC9133u.m16133g(sink, "sink");
            long j12 = 0;
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            while (true) {
                C9871p c9871p = C9871p.this;
                synchronized (c9871p) {
                    boolean zM18395h = c9871p.m18395h();
                    if (zM18395h) {
                        c9871p.m18401n().enter();
                    }
                    try {
                        if (c9871p.m18397j() == null || this.f19739b) {
                            iOExceptionM18398k = null;
                        } else {
                            iOExceptionM18398k = c9871p.m18398k();
                            if (iOExceptionM18398k == null) {
                                ErrorCode errorCodeM18397j = c9871p.m18397j();
                                AbstractC9133u.m16130d(errorCodeM18397j);
                                iOExceptionM18398k = new StreamResetException(errorCodeM18397j);
                            }
                        }
                        if (this.f19743f) {
                            throw new IOException("stream closed");
                        }
                        z10 = false;
                        if (this.f19741d.size() > j12) {
                            Buffer buffer = this.f19741d;
                            j11 = buffer.read(sink, Math.min(j10, buffer.size()));
                            C9947a.m18585c(c9871p.m18400m(), j11, 0L, 2, null);
                            long jM18586a = c9871p.m18400m().m18586a();
                            if (iOExceptionM18398k == null && jM18586a >= c9871p.m18396i().m17977F().m18438c() / 2) {
                                c9871p.m18396i().m18003n0(c9871p.m18399l(), jM18586a);
                                C9947a.m18585c(c9871p.m18400m(), 0L, jM18586a, 1, null);
                            }
                        } else {
                            if (!this.f19739b && iOExceptionM18398k == null) {
                                c9871p.m18387C();
                                z10 = true;
                            }
                            j11 = -1;
                        }
                        if (zM18395h) {
                            c9871p.m18401n().m18424a();
                        }
                        C8736p c8736p = C8736p.f16368a;
                    } finally {
                    }
                }
                C9871p.this.m18396i().m17973B().mo17911b(C9871p.this.m18399l(), C9871p.this.m18400m(), this.f19741d.size());
                if (!z10) {
                    if (j11 != -1) {
                        return j11;
                    }
                    if (iOExceptionM18398k == null) {
                        return -1L;
                    }
                    throw iOExceptionM18398k;
                }
                j12 = 0;
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return C9871p.this.m18401n();
        }
    }

    /* renamed from: q9.p$d */
    public final class d extends AsyncTimeout {
        public d() {
        }

        /* renamed from: a */
        public final void m18424a() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // okio.AsyncTimeout
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // okio.AsyncTimeout
        public void timedOut() {
            C9871p.this.m18394g(ErrorCode.f19109k);
            C9871p.this.m18396i().m17992Z();
        }
    }

    public C9871p(int i10, C9565c connection, boolean z10, boolean z11, C8924v c8924v) {
        AbstractC9133u.m16133g(connection, "connection");
        this.f19720a = i10;
        this.f19721b = connection;
        this.f19722c = new C9947a(i10);
        this.f19724e = connection.m17978G().m18438c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f19725f = arrayDeque;
        this.f19727h = new c(connection.m17977F().m18438c(), z11);
        this.f19728i = new b(z10);
        this.f19729j = new d();
        this.f19730k = new d();
        if (c8924v == null) {
            if (!m18407t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (m18407t()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(c8924v);
        }
    }

    /* renamed from: A */
    public final void m18385A(long j10) {
        this.f19723d = j10;
    }

    /* renamed from: B */
    public final C8924v m18386B(boolean z10) {
        C8924v c8924v;
        synchronized (this) {
            while (this.f19725f.isEmpty() && m18397j() == null) {
                try {
                    boolean z11 = z10 || m18395h();
                    if (z11) {
                        this.f19729j.enter();
                    }
                    try {
                        m18387C();
                        if (z11) {
                            this.f19729j.m18424a();
                        }
                    } catch (Throwable th) {
                        if (z11) {
                            this.f19729j.m18424a();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f19725f.isEmpty()) {
                IOException iOException = this.f19732m;
                if (iOException != null) {
                    throw iOException;
                }
                ErrorCode errorCodeM18397j = m18397j();
                AbstractC9133u.m16130d(errorCodeM18397j);
                throw new StreamResetException(errorCodeM18397j);
            }
            Object objRemoveFirst = this.f19725f.removeFirst();
            AbstractC9133u.m16132f(objRemoveFirst, "removeFirst(...)");
            c8924v = (C8924v) objRemoveFirst;
        }
        return c8924v;
    }

    /* renamed from: C */
    public final void m18387C() throws InterruptedException, InterruptedIOException {
        try {
            AbstractC9133u.m16131e(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: D */
    public final Timeout m18388D() {
        return this.f19730k;
    }

    /* renamed from: b */
    public final void m18389b(long j10) {
        this.f19724e += j10;
        if (j10 > 0) {
            AbstractC9133u.m16131e(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* renamed from: c */
    public final void m18390c() {
        boolean z10;
        boolean zM18408u;
        if (AbstractC9041k.f17265b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z10 = !getSource().m18418b() && getSource().m18417a() && (getSink().m18416c() || getSink().m18415b());
                zM18408u = m18408u();
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            m18392e(ErrorCode.f19109k, null);
        } else {
            if (zM18408u) {
                return;
            }
            this.f19721b.m17991X(this.f19720a);
        }
    }

    @Override // okio.Socket
    public void cancel() {
        m18394g(ErrorCode.f19109k);
    }

    /* renamed from: d */
    public final void m18391d() throws IOException {
        if (getSink().m18415b()) {
            throw new IOException("stream closed");
        }
        if (getSink().m18416c()) {
            throw new IOException("stream finished");
        }
        if (m18397j() != null) {
            IOException iOException = this.f19732m;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCodeM18397j = m18397j();
            AbstractC9133u.m16130d(errorCodeM18397j);
            throw new StreamResetException(errorCodeM18397j);
        }
    }

    /* renamed from: e */
    public final void m18392e(ErrorCode rstStatusCode, IOException iOException) {
        AbstractC9133u.m16133g(rstStatusCode, "rstStatusCode");
        if (m18393f(rstStatusCode, iOException)) {
            this.f19721b.m18001j0(this.f19720a, rstStatusCode);
        }
    }

    /* renamed from: f */
    public final boolean m18393f(ErrorCode errorCode, IOException iOException) {
        if (AbstractC9041k.f17265b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (m18397j() != null) {
                return false;
            }
            this.f19731l = errorCode;
            this.f19732m = iOException;
            AbstractC9133u.m16131e(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (getSource().m18418b() && getSink().m18416c()) {
                return false;
            }
            C8736p c8736p = C8736p.f16368a;
            this.f19721b.m17991X(this.f19720a);
            return true;
        }
    }

    /* renamed from: g */
    public final void m18394g(ErrorCode errorCode) {
        AbstractC9133u.m16133g(errorCode, "errorCode");
        if (m18393f(errorCode, null)) {
            this.f19721b.m18002l0(this.f19720a, errorCode);
        }
    }

    /* renamed from: h */
    public final boolean m18395h() {
        return !this.f19721b.m18006z() || getSink().m18415b() || getSink().m18416c();
    }

    /* renamed from: i */
    public final C9565c m18396i() {
        return this.f19721b;
    }

    /* renamed from: j */
    public final ErrorCode m18397j() {
        ErrorCode errorCode;
        synchronized (this) {
            errorCode = this.f19731l;
        }
        return errorCode;
    }

    /* renamed from: k */
    public final IOException m18398k() {
        return this.f19732m;
    }

    /* renamed from: l */
    public final int m18399l() {
        return this.f19720a;
    }

    /* renamed from: m */
    public final C9947a m18400m() {
        return this.f19722c;
    }

    /* renamed from: n */
    public final d m18401n() {
        return this.f19729j;
    }

    @Override // okio.Socket
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public b getSink() {
        return this.f19728i;
    }

    @Override // okio.Socket
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public c getSource() {
        return this.f19727h;
    }

    /* renamed from: q */
    public final long m18404q() {
        return this.f19724e;
    }

    /* renamed from: r */
    public final long m18405r() {
        return this.f19723d;
    }

    /* renamed from: s */
    public final d m18406s() {
        return this.f19730k;
    }

    /* renamed from: t */
    public final boolean m18407t() {
        return this.f19721b.m18006z() == ((this.f19720a & 1) == 1);
    }

    /* renamed from: u */
    public final boolean m18408u() {
        synchronized (this) {
            try {
                if (m18397j() != null) {
                    return false;
                }
                if (getSource().m18418b() || getSource().m18417a()) {
                    if (getSink().m18416c() || getSink().m18415b()) {
                        if (this.f19726g) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m18409v() {
        /*
            r1 = this;
            monitor-enter(r1)
            q9.p$c r0 = r1.getSource()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.m18418b()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            q9.p$c r0 = r1.getSource()     // Catch: java.lang.Throwable -> L1b
            okio.Buffer r0 = r0.m18419c()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.exhausted()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            r0 = 1
            goto L1e
        L1b:
            r0 = move-exception
            goto L20
        L1d:
            r0 = 0
        L1e:
            monitor-exit(r1)
            return r0
        L20:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p225q9.C9871p.m18409v():boolean");
    }

    /* renamed from: w */
    public final Timeout m18410w() {
        return this.f19729j;
    }

    /* renamed from: x */
    public final void m18411x(BufferedSource source, int i10) {
        AbstractC9133u.m16133g(source, "source");
        if (!AbstractC9041k.f17265b || !Thread.holdsLock(this)) {
            getSource().m18420d(source, i10);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* renamed from: y */
    public final void m18412y(C8924v headers, boolean z10) {
        boolean zM18408u;
        AbstractC9133u.m16133g(headers, "headers");
        if (AbstractC9041k.f17265b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f19726g && headers.m15260a(":status") == null && headers.m15260a(":method") == null) {
                    getSource().m18422f(headers);
                } else {
                    this.f19726g = true;
                    this.f19725f.add(headers);
                }
                if (z10) {
                    getSource().m18421e(true);
                }
                zM18408u = m18408u();
                AbstractC9133u.m16131e(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM18408u) {
            return;
        }
        this.f19721b.m17991X(this.f19720a);
    }

    /* renamed from: z */
    public final void m18413z(ErrorCode errorCode) {
        AbstractC9133u.m16133g(errorCode, "errorCode");
        synchronized (this) {
            try {
                if (m18397j() == null) {
                    this.f19731l = errorCode;
                    AbstractC9133u.m16131e(this, "null cannot be cast to non-null type java.lang.Object");
                    notifyAll();
                }
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
