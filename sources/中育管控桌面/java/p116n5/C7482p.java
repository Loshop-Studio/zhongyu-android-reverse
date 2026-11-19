package p116n5;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.C7531c;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Socket;
import okio.Source;
import okio.Timeout;
import p058f5.C6383v;
import p065g5.AbstractC6427k;
import p123o5.C7522a;

/* renamed from: n5.p */
/* loaded from: classes4.dex */
public final class C7482p implements Socket {

    /* renamed from: n */
    public static final a f9625n = new a(null);

    /* renamed from: a */
    public final int f9626a;

    /* renamed from: b */
    public final C7531c f9627b;

    /* renamed from: c */
    public final C7522a f9628c;

    /* renamed from: d */
    public long f9629d;

    /* renamed from: e */
    public long f9630e;

    /* renamed from: f */
    public final ArrayDeque f9631f;

    /* renamed from: g */
    public boolean f9632g;

    /* renamed from: h */
    public final c f9633h;

    /* renamed from: i */
    public final b f9634i;

    /* renamed from: j */
    public final d f9635j;

    /* renamed from: k */
    public final d f9636k;

    /* renamed from: l */
    public ErrorCode f9637l;

    /* renamed from: m */
    public IOException f9638m;

    /* renamed from: n5.p$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: n5.p$b */
    public final class b implements Sink {

        /* renamed from: a */
        public boolean f9639a;

        /* renamed from: b */
        public final Buffer f9640b = new Buffer();

        /* renamed from: c */
        public C6383v f9641c;

        /* renamed from: d */
        public boolean f9642d;

        public b(boolean z6) {
            this.f9639a = z6;
        }

        /* JADX WARN: Finally extract failed */
        /* renamed from: a */
        public final void m8581a(boolean z6) throws IOException {
            long jMin;
            boolean z7;
            C7482p c7482p = C7482p.this;
            synchronized (c7482p) {
                try {
                    c7482p.m8573s().enter();
                    while (c7482p.m8572r() >= c7482p.m8571q() && !this.f9639a && !this.f9642d && c7482p.m8564j() == null) {
                        try {
                            c7482p.m8554C();
                        } catch (Throwable th) {
                            c7482p.m8573s().m8591a();
                            throw th;
                        }
                    }
                    c7482p.m8573s().m8591a();
                    c7482p.m8558d();
                    jMin = Math.min(c7482p.m8571q() - c7482p.m8572r(), this.f9640b.size());
                    c7482p.m8552A(c7482p.m8572r() + jMin);
                    z7 = z6 && jMin == this.f9640b.size();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C7482p.this.m8573s().enter();
            try {
                C7482p.this.m8563i().m8820k0(C7482p.this.m8566l(), z7, this.f9640b, jMin);
            } finally {
                C7482p.this.m8573s().m8591a();
            }
        }

        /* renamed from: c */
        public final boolean m8582c() {
            return this.f9642d;
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C7482p c7482p = C7482p.this;
            if (AbstractC6427k.f8100b && Thread.holdsLock(c7482p)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c7482p);
            }
            C7482p c7482p2 = C7482p.this;
            synchronized (c7482p2) {
                if (this.f9642d) {
                    return;
                }
                boolean z6 = c7482p2.m8564j() == null;
                Unit unit = Unit.INSTANCE;
                if (!C7482p.this.getSink().f9639a) {
                    boolean z7 = this.f9640b.size() > 0;
                    if (this.f9641c != null) {
                        while (this.f9640b.size() > 0) {
                            m8581a(false);
                        }
                        C7531c c7531cM8563i = C7482p.this.m8563i();
                        int iM8566l = C7482p.this.m8566l();
                        C6383v c6383v = this.f9641c;
                        Intrinsics.checkNotNull(c6383v);
                        c7531cM8563i.m8821l0(iM8566l, z6, AbstractC6427k.m7030r(c6383v));
                    } else if (z7) {
                        while (this.f9640b.size() > 0) {
                            m8581a(true);
                        }
                    } else if (z6) {
                        C7482p.this.m8563i().m8820k0(C7482p.this.m8566l(), true, null, 0L);
                    }
                }
                C7482p c7482p3 = C7482p.this;
                synchronized (c7482p3) {
                    this.f9642d = true;
                    Intrinsics.checkNotNull(c7482p3, "null cannot be cast to non-null type java.lang.Object");
                    c7482p3.notifyAll();
                    Unit unit2 = Unit.INSTANCE;
                }
                C7482p.this.m8563i().flush();
                C7482p.this.m8557c();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            C7482p c7482p = C7482p.this;
            if (AbstractC6427k.f8100b && Thread.holdsLock(c7482p)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c7482p);
            }
            C7482p c7482p2 = C7482p.this;
            synchronized (c7482p2) {
                c7482p2.m8558d();
                Unit unit = Unit.INSTANCE;
            }
            while (this.f9640b.size() > 0) {
                m8581a(false);
                C7482p.this.m8563i().flush();
            }
        }

        /* renamed from: g */
        public final boolean m8583g() {
            return this.f9639a;
        }

        @Override // okio.Sink
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return C7482p.this.m8573s();
        }

        @Override // okio.Sink
        public void write(Buffer source, long j6) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            C7482p c7482p = C7482p.this;
            if (!AbstractC6427k.f8100b || !Thread.holdsLock(c7482p)) {
                this.f9640b.write(source, j6);
                while (this.f9640b.size() >= PlaybackStateCompat.ACTION_PREPARE) {
                    m8581a(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c7482p);
            }
        }
    }

    /* renamed from: n5.p$c */
    public final class c implements Source {

        /* renamed from: a */
        public final long f9644a;

        /* renamed from: b */
        public boolean f9645b;

        /* renamed from: c */
        public final Buffer f9646c = new Buffer();

        /* renamed from: d */
        public final Buffer f9647d = new Buffer();

        /* renamed from: e */
        public C6383v f9648e;

        /* renamed from: f */
        public boolean f9649f;

        public c(long j6, boolean z6) {
            this.f9644a = j6;
            this.f9645b = z6;
        }

        /* renamed from: a */
        public final boolean m8584a() {
            return this.f9649f;
        }

        /* renamed from: c */
        public final boolean m8585c() {
            return this.f9645b;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            C7482p c7482p = C7482p.this;
            synchronized (c7482p) {
                this.f9649f = true;
                size = this.f9647d.size();
                this.f9647d.clear();
                Intrinsics.checkNotNull(c7482p, "null cannot be cast to non-null type java.lang.Object");
                c7482p.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
            if (size > 0) {
                m8590k(size);
            }
            C7482p.this.m8557c();
        }

        /* renamed from: g */
        public final Buffer m8586g() {
            return this.f9647d;
        }

        /* renamed from: h */
        public final void m8587h(BufferedSource source, long j6) throws EOFException {
            boolean z6;
            boolean z7;
            Intrinsics.checkNotNullParameter(source, "source");
            C7482p c7482p = C7482p.this;
            if (AbstractC6427k.f8100b && Thread.holdsLock(c7482p)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c7482p);
            }
            long j7 = j6;
            while (j7 > 0) {
                synchronized (C7482p.this) {
                    z6 = this.f9645b;
                    z7 = this.f9647d.size() + j7 > this.f9644a;
                    Unit unit = Unit.INSTANCE;
                }
                if (z7) {
                    source.skip(j7);
                    C7482p.this.m8561g(ErrorCode.f9882f);
                    return;
                }
                if (z6) {
                    source.skip(j7);
                    return;
                }
                long j8 = source.read(this.f9646c, j7);
                if (j8 == -1) {
                    throw new EOFException();
                }
                j7 -= j8;
                C7482p c7482p2 = C7482p.this;
                synchronized (c7482p2) {
                    try {
                        if (this.f9649f) {
                            this.f9646c.clear();
                        } else {
                            boolean z8 = this.f9647d.size() == 0;
                            this.f9647d.writeAll(this.f9646c);
                            if (z8) {
                                Intrinsics.checkNotNull(c7482p2, "null cannot be cast to non-null type java.lang.Object");
                                c7482p2.notifyAll();
                            }
                        }
                    } finally {
                    }
                }
            }
            m8590k(j6);
            C7482p.this.m8563i().m8795F().mo8729a(C7482p.this.m8566l(), C7482p.this.m8567m(), this.f9647d.size());
        }

        /* renamed from: i */
        public final void m8588i(boolean z6) {
            this.f9645b = z6;
        }

        /* renamed from: j */
        public final void m8589j(C6383v c6383v) {
            this.f9648e = c6383v;
        }

        /* renamed from: k */
        public final void m8590k(long j6) {
            C7482p c7482p = C7482p.this;
            if (!AbstractC6427k.f8100b || !Thread.holdsLock(c7482p)) {
                C7482p.this.m8563i().m8819j0(j6);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c7482p);
        }

        @Override // okio.Source
        public long read(Buffer sink, long j6) throws IOException {
            IOException iOExceptionM8565k;
            boolean z6;
            long j7;
            Intrinsics.checkNotNullParameter(sink, "sink");
            long j8 = 0;
            if (j6 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j6).toString());
            }
            while (true) {
                C7482p c7482p = C7482p.this;
                synchronized (c7482p) {
                    boolean zM8562h = c7482p.m8562h();
                    if (zM8562h) {
                        c7482p.m8568n().enter();
                    }
                    try {
                        if (c7482p.m8564j() == null || this.f9645b) {
                            iOExceptionM8565k = null;
                        } else {
                            iOExceptionM8565k = c7482p.m8565k();
                            if (iOExceptionM8565k == null) {
                                ErrorCode errorCodeM8564j = c7482p.m8564j();
                                Intrinsics.checkNotNull(errorCodeM8564j);
                                iOExceptionM8565k = new StreamResetException(errorCodeM8564j);
                            }
                        }
                        if (this.f9649f) {
                            throw new IOException("stream closed");
                        }
                        z6 = false;
                        if (this.f9647d.size() > j8) {
                            Buffer buffer = this.f9647d;
                            j7 = buffer.read(sink, Math.min(j6, buffer.size()));
                            C7522a.m8683c(c7482p.m8567m(), j7, 0L, 2, null);
                            long jM8684a = c7482p.m8567m().m8684a();
                            if (iOExceptionM8565k == null && jM8684a >= c7482p.m8563i().m8799J().m8605c() / 2) {
                                c7482p.m8563i().m8825r0(c7482p.m8566l(), jM8684a);
                                C7522a.m8683c(c7482p.m8567m(), 0L, jM8684a, 1, null);
                            }
                        } else {
                            if (!this.f9645b && iOExceptionM8565k == null) {
                                c7482p.m8554C();
                                z6 = true;
                            }
                            j7 = -1;
                        }
                        if (zM8562h) {
                            c7482p.m8568n().m8591a();
                        }
                        Unit unit = Unit.INSTANCE;
                    } finally {
                    }
                }
                C7482p.this.m8563i().m8795F().mo8729a(C7482p.this.m8566l(), C7482p.this.m8567m(), this.f9647d.size());
                if (!z6) {
                    if (j7 != -1) {
                        return j7;
                    }
                    if (iOExceptionM8565k == null) {
                        return -1L;
                    }
                    throw iOExceptionM8565k;
                }
                j8 = 0;
            }
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return C7482p.this.m8568n();
        }
    }

    /* renamed from: n5.p$d */
    public final class d extends AsyncTimeout {
        public d() {
        }

        /* renamed from: a */
        public final void m8591a() throws IOException {
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
            C7482p.this.m8561g(ErrorCode.f9887k);
            C7482p.this.m8563i().m8814d0();
        }
    }

    public C7482p(int i6, C7531c connection, boolean z6, boolean z7, C6383v c6383v) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f9626a = i6;
        this.f9627b = connection;
        this.f9628c = new C7522a(i6);
        this.f9630e = connection.m8800K().m8605c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f9631f = arrayDeque;
        this.f9633h = new c(connection.m8799J().m8605c(), z7);
        this.f9634i = new b(z6);
        this.f9635j = new d();
        this.f9636k = new d();
        if (c6383v == null) {
            if (!m8574t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (m8574t()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(c6383v);
        }
    }

    /* renamed from: A */
    public final void m8552A(long j6) {
        this.f9629d = j6;
    }

    /* renamed from: B */
    public final C6383v m8553B(boolean z6) {
        C6383v c6383v;
        synchronized (this) {
            while (this.f9631f.isEmpty() && m8564j() == null) {
                try {
                    boolean z7 = z6 || m8562h();
                    if (z7) {
                        this.f9635j.enter();
                    }
                    try {
                        m8554C();
                        if (z7) {
                            this.f9635j.m8591a();
                        }
                    } catch (Throwable th) {
                        if (z7) {
                            this.f9635j.m8591a();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f9631f.isEmpty()) {
                IOException iOException = this.f9638m;
                if (iOException != null) {
                    throw iOException;
                }
                ErrorCode errorCodeM8564j = m8564j();
                Intrinsics.checkNotNull(errorCodeM8564j);
                throw new StreamResetException(errorCodeM8564j);
            }
            Object objRemoveFirst = this.f9631f.removeFirst();
            Intrinsics.checkNotNullExpressionValue(objRemoveFirst, "removeFirst(...)");
            c6383v = (C6383v) objRemoveFirst;
        }
        return c6383v;
    }

    /* renamed from: C */
    public final void m8554C() throws InterruptedException, InterruptedIOException {
        try {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: D */
    public final Timeout m8555D() {
        return this.f9636k;
    }

    /* renamed from: b */
    public final void m8556b(long j6) {
        this.f9630e += j6;
        if (j6 > 0) {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* renamed from: c */
    public final void m8557c() {
        boolean z6;
        boolean zM8575u;
        if (AbstractC6427k.f8100b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z6 = !getSource().m8585c() && getSource().m8584a() && (getSink().m8583g() || getSink().m8582c());
                zM8575u = m8575u();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z6) {
            m8559e(ErrorCode.f9887k, null);
        } else {
            if (zM8575u) {
                return;
            }
            this.f9627b.m8813b0(this.f9626a);
        }
    }

    @Override // okio.Socket
    public void cancel() {
        m8561g(ErrorCode.f9887k);
    }

    /* renamed from: d */
    public final void m8558d() throws IOException {
        if (getSink().m8582c()) {
            throw new IOException("stream closed");
        }
        if (getSink().m8583g()) {
            throw new IOException("stream finished");
        }
        if (m8564j() != null) {
            IOException iOException = this.f9638m;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCodeM8564j = m8564j();
            Intrinsics.checkNotNull(errorCodeM8564j);
            throw new StreamResetException(errorCodeM8564j);
        }
    }

    /* renamed from: e */
    public final void m8559e(ErrorCode rstStatusCode, IOException iOException) {
        Intrinsics.checkNotNullParameter(rstStatusCode, "rstStatusCode");
        if (m8560f(rstStatusCode, iOException)) {
            this.f9627b.m8823n0(this.f9626a, rstStatusCode);
        }
    }

    /* renamed from: f */
    public final boolean m8560f(ErrorCode errorCode, IOException iOException) {
        if (AbstractC6427k.f8100b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (m8564j() != null) {
                return false;
            }
            this.f9637l = errorCode;
            this.f9638m = iOException;
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (getSource().m8585c() && getSink().m8583g()) {
                return false;
            }
            Unit unit = Unit.INSTANCE;
            this.f9627b.m8813b0(this.f9626a);
            return true;
        }
    }

    /* renamed from: g */
    public final void m8561g(ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (m8560f(errorCode, null)) {
            this.f9627b.m8824p0(this.f9626a, errorCode);
        }
    }

    /* renamed from: h */
    public final boolean m8562h() {
        return !this.f9627b.m8793D() || getSink().m8582c() || getSink().m8583g();
    }

    /* renamed from: i */
    public final C7531c m8563i() {
        return this.f9627b;
    }

    /* renamed from: j */
    public final ErrorCode m8564j() {
        ErrorCode errorCode;
        synchronized (this) {
            errorCode = this.f9637l;
        }
        return errorCode;
    }

    /* renamed from: k */
    public final IOException m8565k() {
        return this.f9638m;
    }

    /* renamed from: l */
    public final int m8566l() {
        return this.f9626a;
    }

    /* renamed from: m */
    public final C7522a m8567m() {
        return this.f9628c;
    }

    /* renamed from: n */
    public final d m8568n() {
        return this.f9635j;
    }

    @Override // okio.Socket
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public b getSink() {
        return this.f9634i;
    }

    @Override // okio.Socket
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public c getSource() {
        return this.f9633h;
    }

    /* renamed from: q */
    public final long m8571q() {
        return this.f9630e;
    }

    /* renamed from: r */
    public final long m8572r() {
        return this.f9629d;
    }

    /* renamed from: s */
    public final d m8573s() {
        return this.f9636k;
    }

    /* renamed from: t */
    public final boolean m8574t() {
        return this.f9627b.m8793D() == ((this.f9626a & 1) == 1);
    }

    /* renamed from: u */
    public final boolean m8575u() {
        synchronized (this) {
            try {
                if (m8564j() != null) {
                    return false;
                }
                if (getSource().m8585c() || getSource().m8584a()) {
                    if (getSink().m8583g() || getSink().m8582c()) {
                        if (this.f9632g) {
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
    public final boolean m8576v() {
        /*
            r1 = this;
            monitor-enter(r1)
            n5.p$c r0 = r1.getSource()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.m8585c()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            n5.p$c r0 = r1.getSource()     // Catch: java.lang.Throwable -> L1b
            okio.Buffer r0 = r0.m8586g()     // Catch: java.lang.Throwable -> L1b
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
        throw new UnsupportedOperationException("Method not decompiled: p116n5.C7482p.m8576v():boolean");
    }

    /* renamed from: w */
    public final Timeout m8577w() {
        return this.f9635j;
    }

    /* renamed from: x */
    public final void m8578x(BufferedSource source, int i6) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!AbstractC6427k.f8100b || !Thread.holdsLock(this)) {
            getSource().m8587h(source, i6);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* renamed from: y */
    public final void m8579y(C6383v headers, boolean z6) {
        boolean zM8575u;
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (AbstractC6427k.f8100b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f9632g && headers.m6799a(":status") == null && headers.m6799a(":method") == null) {
                    getSource().m8589j(headers);
                } else {
                    this.f9632g = true;
                    this.f9631f.add(headers);
                }
                if (z6) {
                    getSource().m8588i(true);
                }
                zM8575u = m8575u();
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM8575u) {
            return;
        }
        this.f9627b.m8813b0(this.f9626a);
    }

    /* renamed from: z */
    public final void m8580z(ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        synchronized (this) {
            try {
                if (m8564j() == null) {
                    this.f9637l = errorCode;
                    Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                    notifyAll();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
