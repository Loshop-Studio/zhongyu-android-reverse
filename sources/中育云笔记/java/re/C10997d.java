package re;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import je.C9737q;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okhttp3.internal.http2.C10501b;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p309qc.C10786q;

/* renamed from: re.d */
/* loaded from: classes6.dex */
public final class C10997d {

    /* renamed from: o */
    public static final a f26525o = new a(null);

    /* renamed from: a */
    public final int f26526a;

    /* renamed from: b */
    public final C10501b f26527b;

    /* renamed from: c */
    public long f26528c;

    /* renamed from: d */
    public long f26529d;

    /* renamed from: e */
    public long f26530e;

    /* renamed from: f */
    public long f26531f;

    /* renamed from: g */
    public final ArrayDeque f26532g;

    /* renamed from: h */
    public boolean f26533h;

    /* renamed from: i */
    public final c f26534i;

    /* renamed from: j */
    public final b f26535j;

    /* renamed from: k */
    public final d f26536k;

    /* renamed from: l */
    public final d f26537l;

    /* renamed from: m */
    public ErrorCode f26538m;

    /* renamed from: n */
    public IOException f26539n;

    /* renamed from: re.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: re.d$b */
    public final class b implements Sink {

        /* renamed from: c */
        public boolean f26540c;

        /* renamed from: d */
        public final Buffer f26541d = new Buffer();

        /* renamed from: e */
        public C9737q f26542e;

        /* renamed from: f */
        public boolean f26543f;

        public b(boolean z10) {
            this.f26540c = z10;
        }

        /* JADX WARN: Finally extract failed */
        /* renamed from: a */
        public final void m24285a(boolean z10) throws IOException {
            long jMin;
            boolean z11;
            C10997d c10997d = C10997d.this;
            synchronized (c10997d) {
                try {
                    c10997d.m24277s().enter();
                    while (c10997d.m24276r() >= c10997d.m24275q() && !this.f26540c && !this.f26543f && c10997d.m24266h() == null) {
                        try {
                            c10997d.m24257D();
                        } catch (Throwable th) {
                            c10997d.m24277s().m24294a();
                            throw th;
                        }
                    }
                    c10997d.m24277s().m24294a();
                    c10997d.m24261c();
                    jMin = Math.min(c10997d.m24275q() - c10997d.m24276r(), this.f26541d.size());
                    c10997d.m24255B(c10997d.m24276r() + jMin);
                    z11 = z10 && jMin == this.f26541d.size();
                    C10786q c10786q = C10786q.f26013a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C10997d.this.m24277s().enter();
            try {
                C10997d.this.m24265g().m22094Z(C10997d.this.m24268j(), z11, this.f26541d, jMin);
            } finally {
                C10997d.this.m24277s().m24294a();
            }
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C10997d c10997d = C10997d.this;
            if (AbstractC9920d.f23248h && Thread.holdsLock(c10997d)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c10997d);
            }
            C10997d c10997d2 = C10997d.this;
            synchronized (c10997d2) {
                if (this.f26543f) {
                    return;
                }
                boolean z10 = c10997d2.m24266h() == null;
                C10786q c10786q = C10786q.f26013a;
                if (!C10997d.this.m24273o().f26540c) {
                    boolean z11 = this.f26541d.size() > 0;
                    if (this.f26542e != null) {
                        while (this.f26541d.size() > 0) {
                            m24285a(false);
                        }
                        C10501b c10501bM24265g = C10997d.this.m24265g();
                        int iM24268j = C10997d.this.m24268j();
                        C9737q c9737q = this.f26542e;
                        AbstractC9979u.m20291d(c9737q);
                        c10501bM24265g.m22095a0(iM24268j, z10, AbstractC9920d.m20007O(c9737q));
                    } else if (z11) {
                        while (this.f26541d.size() > 0) {
                            m24285a(true);
                        }
                    } else if (z10) {
                        C10997d.this.m24265g().m22094Z(C10997d.this.m24268j(), true, null, 0L);
                    }
                }
                synchronized (C10997d.this) {
                    this.f26543f = true;
                    C10786q c10786q2 = C10786q.f26013a;
                }
                C10997d.this.m24265g().flush();
                C10997d.this.m24260b();
            }
        }

        /* renamed from: e */
        public final boolean m24286e() {
            return this.f26543f;
        }

        /* renamed from: f */
        public final boolean m24287f() {
            return this.f26540c;
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            C10997d c10997d = C10997d.this;
            if (AbstractC9920d.f23248h && Thread.holdsLock(c10997d)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c10997d);
            }
            C10997d c10997d2 = C10997d.this;
            synchronized (c10997d2) {
                c10997d2.m24261c();
                C10786q c10786q = C10786q.f26013a;
            }
            while (this.f26541d.size() > 0) {
                m24285a(false);
                C10997d.this.m24265g().flush();
            }
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return C10997d.this.m24277s();
        }

        @Override // okio.Sink
        public void write(Buffer source, long j10) throws IOException {
            AbstractC9979u.m20294g(source, "source");
            C10997d c10997d = C10997d.this;
            if (!AbstractC9920d.f23248h || !Thread.holdsLock(c10997d)) {
                this.f26541d.write(source, j10);
                while (this.f26541d.size() >= 16384) {
                    m24285a(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c10997d);
            }
        }
    }

    /* renamed from: re.d$c */
    public final class c implements Source {

        /* renamed from: c */
        public final long f26545c;

        /* renamed from: d */
        public boolean f26546d;

        /* renamed from: e */
        public final Buffer f26547e = new Buffer();

        /* renamed from: f */
        public final Buffer f26548f = new Buffer();

        /* renamed from: g */
        public C9737q f26549g;

        /* renamed from: h */
        public boolean f26550h;

        public c(long j10, boolean z10) {
            this.f26545c = j10;
            this.f26546d = z10;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            C10997d c10997d = C10997d.this;
            synchronized (c10997d) {
                this.f26550h = true;
                size = this.f26548f.size();
                this.f26548f.clear();
                AbstractC9979u.m20292e(c10997d, "null cannot be cast to non-null type java.lang.Object");
                c10997d.notifyAll();
                C10786q c10786q = C10786q.f26013a;
            }
            if (size > 0) {
                m24293k(size);
            }
            C10997d.this.m24260b();
        }

        /* renamed from: e */
        public final boolean m24288e() {
            return this.f26550h;
        }

        /* renamed from: f */
        public final boolean m24289f() {
            return this.f26546d;
        }

        /* renamed from: g */
        public final void m24290g(BufferedSource source, long j10) throws EOFException {
            boolean z10;
            boolean z11;
            AbstractC9979u.m20294g(source, "source");
            C10997d c10997d = C10997d.this;
            if (AbstractC9920d.f23248h && Thread.holdsLock(c10997d)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c10997d);
            }
            long j11 = j10;
            while (j11 > 0) {
                synchronized (C10997d.this) {
                    z10 = this.f26546d;
                    z11 = this.f26548f.size() + j11 > this.f26545c;
                    C10786q c10786q = C10786q.f26013a;
                }
                if (z11) {
                    source.skip(j11);
                    C10997d.this.m24264f(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    source.skip(j11);
                    return;
                }
                long j12 = source.read(this.f26547e, j11);
                if (j12 == -1) {
                    throw new EOFException();
                }
                j11 -= j12;
                C10997d c10997d2 = C10997d.this;
                synchronized (c10997d2) {
                    try {
                        if (this.f26550h) {
                            this.f26547e.clear();
                        } else {
                            boolean z12 = this.f26548f.size() == 0;
                            this.f26548f.writeAll(this.f26547e);
                            if (z12) {
                                AbstractC9979u.m20292e(c10997d2, "null cannot be cast to non-null type java.lang.Object");
                                c10997d2.notifyAll();
                            }
                        }
                    } finally {
                    }
                }
            }
            m24293k(j10);
        }

        /* renamed from: i */
        public final void m24291i(boolean z10) {
            this.f26546d = z10;
        }

        /* renamed from: j */
        public final void m24292j(C9737q c9737q) {
            this.f26549g = c9737q;
        }

        /* renamed from: k */
        public final void m24293k(long j10) {
            C10997d c10997d = C10997d.this;
            if (!AbstractC9920d.f23248h || !Thread.holdsLock(c10997d)) {
                C10997d.this.m24265g().m22093Y(j10);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c10997d);
        }

        @Override // okio.Source
        public long read(Buffer sink, long j10) throws IOException {
            IOException iOExceptionM24267i;
            boolean z10;
            long j11;
            AbstractC9979u.m20294g(sink, "sink");
            long j12 = 0;
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            while (true) {
                C10997d c10997d = C10997d.this;
                synchronized (c10997d) {
                    c10997d.m24271m().enter();
                    try {
                        if (c10997d.m24266h() == null || this.f26546d) {
                            iOExceptionM24267i = null;
                        } else {
                            iOExceptionM24267i = c10997d.m24267i();
                            if (iOExceptionM24267i == null) {
                                ErrorCode errorCodeM24266h = c10997d.m24266h();
                                AbstractC9979u.m20291d(errorCodeM24266h);
                                iOExceptionM24267i = new StreamResetException(errorCodeM24266h);
                            }
                        }
                        if (this.f26550h) {
                            throw new IOException("stream closed");
                        }
                        z10 = false;
                        if (this.f26548f.size() > j12) {
                            Buffer buffer = this.f26548f;
                            j11 = buffer.read(sink, Math.min(j10, buffer.size()));
                            c10997d.m24254A(c10997d.m24270l() + j11);
                            long jM24270l = c10997d.m24270l() - c10997d.m24269k();
                            if (iOExceptionM24267i == null && jM24270l >= c10997d.m24265g().m22073D().m24308c() / 2) {
                                c10997d.m24265g().m22099e0(c10997d.m24268j(), jM24270l);
                                c10997d.m24284z(c10997d.m24270l());
                            }
                        } else {
                            if (!this.f26546d && iOExceptionM24267i == null) {
                                c10997d.m24257D();
                                z10 = true;
                            }
                            j11 = -1;
                        }
                        c10997d.m24271m().m24294a();
                        C10786q c10786q = C10786q.f26013a;
                    } finally {
                    }
                }
                if (!z10) {
                    if (j11 != -1) {
                        return j11;
                    }
                    if (iOExceptionM24267i == null) {
                        return -1L;
                    }
                    throw iOExceptionM24267i;
                }
                j12 = 0;
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return C10997d.this.m24271m();
        }
    }

    /* renamed from: re.d$d */
    public final class d extends AsyncTimeout {
        public d() {
        }

        /* renamed from: a */
        public final void m24294a() throws IOException {
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
            C10997d.this.m24264f(ErrorCode.CANCEL);
            C10997d.this.m24265g().m22088S();
        }
    }

    public C10997d(int i10, C10501b connection, boolean z10, boolean z11, C9737q c9737q) {
        AbstractC9979u.m20294g(connection, "connection");
        this.f26526a = i10;
        this.f26527b = connection;
        this.f26531f = connection.m22074E().m24308c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f26532g = arrayDeque;
        this.f26534i = new c(connection.m22073D().m24308c(), z11);
        this.f26535j = new b(z10);
        this.f26536k = new d();
        this.f26537l = new d();
        if (c9737q == null) {
            if (!m24278t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (m24278t()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(c9737q);
        }
    }

    /* renamed from: A */
    public final void m24254A(long j10) {
        this.f26528c = j10;
    }

    /* renamed from: B */
    public final void m24255B(long j10) {
        this.f26530e = j10;
    }

    /* renamed from: C */
    public final synchronized C9737q m24256C() {
        Object objRemoveFirst;
        this.f26536k.enter();
        while (this.f26532g.isEmpty() && this.f26538m == null) {
            try {
                m24257D();
            } catch (Throwable th) {
                this.f26536k.m24294a();
                throw th;
            }
        }
        this.f26536k.m24294a();
        if (this.f26532g.isEmpty()) {
            IOException iOException = this.f26539n;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f26538m;
            AbstractC9979u.m20291d(errorCode);
            throw new StreamResetException(errorCode);
        }
        objRemoveFirst = this.f26532g.removeFirst();
        AbstractC9979u.m20293f(objRemoveFirst, "headersQueue.removeFirst()");
        return (C9737q) objRemoveFirst;
    }

    /* renamed from: D */
    public final void m24257D() throws InterruptedException, InterruptedIOException {
        try {
            AbstractC9979u.m20292e(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: E */
    public final Timeout m24258E() {
        return this.f26537l;
    }

    /* renamed from: a */
    public final void m24259a(long j10) {
        this.f26531f += j10;
        if (j10 > 0) {
            AbstractC9979u.m20292e(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* renamed from: b */
    public final void m24260b() {
        boolean z10;
        boolean zM24279u;
        if (AbstractC9920d.f23248h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z10 = !this.f26534i.m24289f() && this.f26534i.m24288e() && (this.f26535j.m24287f() || this.f26535j.m24286e());
                zM24279u = m24279u();
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            m24262d(ErrorCode.CANCEL, null);
        } else {
            if (zM24279u) {
                return;
            }
            this.f26527b.m22087R(this.f26526a);
        }
    }

    /* renamed from: c */
    public final void m24261c() throws IOException {
        if (this.f26535j.m24286e()) {
            throw new IOException("stream closed");
        }
        if (this.f26535j.m24287f()) {
            throw new IOException("stream finished");
        }
        if (this.f26538m != null) {
            IOException iOException = this.f26539n;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f26538m;
            AbstractC9979u.m20291d(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    /* renamed from: d */
    public final void m24262d(ErrorCode rstStatusCode, IOException iOException) {
        AbstractC9979u.m20294g(rstStatusCode, "rstStatusCode");
        if (m24263e(rstStatusCode, iOException)) {
            this.f26527b.m22097c0(this.f26526a, rstStatusCode);
        }
    }

    /* renamed from: e */
    public final boolean m24263e(ErrorCode errorCode, IOException iOException) {
        if (AbstractC9920d.f23248h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.f26538m != null) {
                return false;
            }
            this.f26538m = errorCode;
            this.f26539n = iOException;
            AbstractC9979u.m20292e(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.f26534i.m24289f() && this.f26535j.m24287f()) {
                return false;
            }
            C10786q c10786q = C10786q.f26013a;
            this.f26527b.m22087R(this.f26526a);
            return true;
        }
    }

    /* renamed from: f */
    public final void m24264f(ErrorCode errorCode) {
        AbstractC9979u.m20294g(errorCode, "errorCode");
        if (m24263e(errorCode, null)) {
            this.f26527b.m22098d0(this.f26526a, errorCode);
        }
    }

    /* renamed from: g */
    public final C10501b m24265g() {
        return this.f26527b;
    }

    /* renamed from: h */
    public final synchronized ErrorCode m24266h() {
        return this.f26538m;
    }

    /* renamed from: i */
    public final IOException m24267i() {
        return this.f26539n;
    }

    /* renamed from: j */
    public final int m24268j() {
        return this.f26526a;
    }

    /* renamed from: k */
    public final long m24269k() {
        return this.f26529d;
    }

    /* renamed from: l */
    public final long m24270l() {
        return this.f26528c;
    }

    /* renamed from: m */
    public final d m24271m() {
        return this.f26536k;
    }

    /* renamed from: n */
    public final Sink m24272n() {
        synchronized (this) {
            try {
                if (!this.f26533h && !m24278t()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f26535j;
    }

    /* renamed from: o */
    public final b m24273o() {
        return this.f26535j;
    }

    /* renamed from: p */
    public final c m24274p() {
        return this.f26534i;
    }

    /* renamed from: q */
    public final long m24275q() {
        return this.f26531f;
    }

    /* renamed from: r */
    public final long m24276r() {
        return this.f26530e;
    }

    /* renamed from: s */
    public final d m24277s() {
        return this.f26537l;
    }

    /* renamed from: t */
    public final boolean m24278t() {
        return this.f26527b.m22102y() == ((this.f26526a & 1) == 1);
    }

    /* renamed from: u */
    public final synchronized boolean m24279u() {
        try {
            if (this.f26538m != null) {
                return false;
            }
            if (this.f26534i.m24289f() || this.f26534i.m24288e()) {
                if (this.f26535j.m24287f() || this.f26535j.m24286e()) {
                    if (this.f26533h) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: v */
    public final Timeout m24280v() {
        return this.f26536k;
    }

    /* renamed from: w */
    public final void m24281w(BufferedSource source, int i10) {
        AbstractC9979u.m20294g(source, "source");
        if (!AbstractC9920d.f23248h || !Thread.holdsLock(this)) {
            this.f26534i.m24290g(source, i10);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* renamed from: x */
    public final void m24282x(C9737q headers, boolean z10) {
        boolean zM24279u;
        AbstractC9979u.m20294g(headers, "headers");
        if (AbstractC9920d.f23248h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f26533h && z10) {
                    this.f26534i.m24292j(headers);
                } else {
                    this.f26533h = true;
                    this.f26532g.add(headers);
                }
                if (z10) {
                    this.f26534i.m24291i(true);
                }
                zM24279u = m24279u();
                AbstractC9979u.m20292e(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM24279u) {
            return;
        }
        this.f26527b.m22087R(this.f26526a);
    }

    /* renamed from: y */
    public final synchronized void m24283y(ErrorCode errorCode) {
        AbstractC9979u.m20294g(errorCode, "errorCode");
        if (this.f26538m == null) {
            this.f26538m = errorCode;
            AbstractC9979u.m20292e(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* renamed from: z */
    public final void m24284z(long j10) {
        this.f26529d = j10;
    }
}
