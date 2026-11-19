package p256t8;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.C9244b;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p172l8.C8918q;
import p182m8.AbstractC9045d;

/* renamed from: t8.d */
/* loaded from: classes5.dex */
public final class C9639d {

    /* renamed from: o */
    public static final a f16943o = new a(null);

    /* renamed from: a */
    public final int f16944a;

    /* renamed from: b */
    public final C9244b f16945b;

    /* renamed from: c */
    public long f16946c;

    /* renamed from: d */
    public long f16947d;

    /* renamed from: e */
    public long f16948e;

    /* renamed from: f */
    public long f16949f;

    /* renamed from: g */
    public final ArrayDeque f16950g;

    /* renamed from: h */
    public boolean f16951h;

    /* renamed from: i */
    public final c f16952i;

    /* renamed from: j */
    public final b f16953j;

    /* renamed from: k */
    public final d f16954k;

    /* renamed from: l */
    public final d f16955l;

    /* renamed from: m */
    public ErrorCode f16956m;

    /* renamed from: n */
    public IOException f16957n;

    /* renamed from: t8.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: t8.d$b */
    public final class b implements Sink {

        /* renamed from: a */
        public boolean f16958a;

        /* renamed from: b */
        public final Buffer f16959b = new Buffer();

        /* renamed from: c */
        public C8918q f16960c;

        /* renamed from: d */
        public boolean f16961d;

        public b(boolean z9) {
            this.f16958a = z9;
        }

        /* JADX WARN: Finally extract failed */
        /* renamed from: a */
        public final void m15950a(boolean z9) throws IOException {
            long jMin;
            boolean z10;
            C9639d c9639d = C9639d.this;
            synchronized (c9639d) {
                try {
                    c9639d.m15942s().enter();
                    while (c9639d.m15941r() >= c9639d.m15940q() && !this.f16958a && !this.f16961d && c9639d.m15931h() == null) {
                        try {
                            c9639d.m15922D();
                        } catch (Throwable th) {
                            c9639d.m15942s().m15959a();
                            throw th;
                        }
                    }
                    c9639d.m15942s().m15959a();
                    c9639d.m15926c();
                    jMin = Math.min(c9639d.m15940q() - c9639d.m15941r(), this.f16959b.size());
                    c9639d.m15920B(c9639d.m15941r() + jMin);
                    z10 = z9 && jMin == this.f16959b.size();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C9639d.this.m15942s().enter();
            try {
                C9639d.this.m15930g().m14968Z(C9639d.this.m15933j(), z10, this.f16959b, jMin);
            } finally {
                C9639d.this.m15942s().m15959a();
            }
        }

        /* renamed from: c */
        public final boolean m15951c() {
            return this.f16961d;
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C9639d c9639d = C9639d.this;
            if (AbstractC9045d.f15231h && Thread.holdsLock(c9639d)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c9639d);
            }
            C9639d c9639d2 = C9639d.this;
            synchronized (c9639d2) {
                if (this.f16961d) {
                    return;
                }
                boolean z9 = c9639d2.m15931h() == null;
                Unit unit = Unit.INSTANCE;
                if (!C9639d.this.m15938o().f16958a) {
                    boolean z10 = this.f16959b.size() > 0;
                    if (this.f16960c != null) {
                        while (this.f16959b.size() > 0) {
                            m15950a(false);
                        }
                        C9244b c9244bM15930g = C9639d.this.m15930g();
                        int iM15933j = C9639d.this.m15933j();
                        C8918q c8918q = this.f16960c;
                        Intrinsics.checkNotNull(c8918q);
                        c9244bM15930g.m14969a0(iM15933j, z9, AbstractC9045d.m14473O(c8918q));
                    } else if (z10) {
                        while (this.f16959b.size() > 0) {
                            m15950a(true);
                        }
                    } else if (z9) {
                        C9639d.this.m15930g().m14968Z(C9639d.this.m15933j(), true, null, 0L);
                    }
                }
                synchronized (C9639d.this) {
                    this.f16961d = true;
                    Unit unit2 = Unit.INSTANCE;
                }
                C9639d.this.m15930g().flush();
                C9639d.this.m15925b();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            C9639d c9639d = C9639d.this;
            if (AbstractC9045d.f15231h && Thread.holdsLock(c9639d)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c9639d);
            }
            C9639d c9639d2 = C9639d.this;
            synchronized (c9639d2) {
                c9639d2.m15926c();
                Unit unit = Unit.INSTANCE;
            }
            while (this.f16959b.size() > 0) {
                m15950a(false);
                C9639d.this.m15930g().flush();
            }
        }

        /* renamed from: g */
        public final boolean m15952g() {
            return this.f16958a;
        }

        @Override // okio.Sink
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return C9639d.this.m15942s();
        }

        @Override // okio.Sink
        public void write(Buffer source, long j9) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            C9639d c9639d = C9639d.this;
            if (!AbstractC9045d.f15231h || !Thread.holdsLock(c9639d)) {
                this.f16959b.write(source, j9);
                while (this.f16959b.size() >= PlaybackStateCompat.ACTION_PREPARE) {
                    m15950a(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c9639d);
            }
        }
    }

    /* renamed from: t8.d$c */
    public final class c implements Source {

        /* renamed from: a */
        public final long f16963a;

        /* renamed from: b */
        public boolean f16964b;

        /* renamed from: c */
        public final Buffer f16965c = new Buffer();

        /* renamed from: d */
        public final Buffer f16966d = new Buffer();

        /* renamed from: e */
        public C8918q f16967e;

        /* renamed from: f */
        public boolean f16968f;

        public c(long j9, boolean z9) {
            this.f16963a = j9;
            this.f16964b = z9;
        }

        /* renamed from: a */
        public final boolean m15953a() {
            return this.f16968f;
        }

        /* renamed from: c */
        public final boolean m15954c() {
            return this.f16964b;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            C9639d c9639d = C9639d.this;
            synchronized (c9639d) {
                this.f16968f = true;
                size = this.f16966d.size();
                this.f16966d.clear();
                Intrinsics.checkNotNull(c9639d, "null cannot be cast to non-null type java.lang.Object");
                c9639d.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
            if (size > 0) {
                m15958j(size);
            }
            C9639d.this.m15925b();
        }

        /* renamed from: g */
        public final void m15955g(BufferedSource source, long j9) throws IOException {
            boolean z9;
            boolean z10;
            Intrinsics.checkNotNullParameter(source, "source");
            C9639d c9639d = C9639d.this;
            if (AbstractC9045d.f15231h && Thread.holdsLock(c9639d)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c9639d);
            }
            long j10 = j9;
            while (j10 > 0) {
                synchronized (C9639d.this) {
                    z9 = this.f16964b;
                    z10 = this.f16966d.size() + j10 > this.f16963a;
                    Unit unit = Unit.INSTANCE;
                }
                if (z10) {
                    source.skip(j10);
                    C9639d.this.m15929f(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z9) {
                    source.skip(j10);
                    return;
                }
                long j11 = source.read(this.f16965c, j10);
                if (j11 == -1) {
                    throw new EOFException();
                }
                j10 -= j11;
                C9639d c9639d2 = C9639d.this;
                synchronized (c9639d2) {
                    try {
                        if (this.f16968f) {
                            this.f16965c.clear();
                        } else {
                            boolean z11 = this.f16966d.size() == 0;
                            this.f16966d.writeAll(this.f16965c);
                            if (z11) {
                                Intrinsics.checkNotNull(c9639d2, "null cannot be cast to non-null type java.lang.Object");
                                c9639d2.notifyAll();
                            }
                        }
                    } finally {
                    }
                }
            }
            m15958j(j9);
        }

        /* renamed from: h */
        public final void m15956h(boolean z9) {
            this.f16964b = z9;
        }

        /* renamed from: i */
        public final void m15957i(C8918q c8918q) {
            this.f16967e = c8918q;
        }

        /* renamed from: j */
        public final void m15958j(long j9) {
            C9639d c9639d = C9639d.this;
            if (!AbstractC9045d.f15231h || !Thread.holdsLock(c9639d)) {
                C9639d.this.m15930g().m14967Y(j9);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c9639d);
        }

        @Override // okio.Source
        public long read(Buffer sink, long j9) throws IOException {
            IOException iOExceptionM15932i;
            boolean z9;
            long j10;
            Intrinsics.checkNotNullParameter(sink, "sink");
            long j11 = 0;
            if (j9 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
            }
            while (true) {
                C9639d c9639d = C9639d.this;
                synchronized (c9639d) {
                    c9639d.m15936m().enter();
                    try {
                        if (c9639d.m15931h() == null || this.f16964b) {
                            iOExceptionM15932i = null;
                        } else {
                            iOExceptionM15932i = c9639d.m15932i();
                            if (iOExceptionM15932i == null) {
                                ErrorCode errorCodeM15931h = c9639d.m15931h();
                                Intrinsics.checkNotNull(errorCodeM15931h);
                                iOExceptionM15932i = new StreamResetException(errorCodeM15931h);
                            }
                        }
                        if (this.f16968f) {
                            throw new IOException("stream closed");
                        }
                        z9 = false;
                        if (this.f16966d.size() > j11) {
                            Buffer buffer = this.f16966d;
                            j10 = buffer.read(sink, Math.min(j9, buffer.size()));
                            c9639d.m15919A(c9639d.m15935l() + j10);
                            long jM15935l = c9639d.m15935l() - c9639d.m15934k();
                            if (iOExceptionM15932i == null && jM15935l >= c9639d.m15930g().m14947D().m15973c() / 2) {
                                c9639d.m15930g().m14973e0(c9639d.m15933j(), jM15935l);
                                c9639d.m15949z(c9639d.m15935l());
                            }
                        } else {
                            if (!this.f16964b && iOExceptionM15932i == null) {
                                c9639d.m15922D();
                                z9 = true;
                            }
                            j10 = -1;
                        }
                        c9639d.m15936m().m15959a();
                        Unit unit = Unit.INSTANCE;
                    } finally {
                    }
                }
                if (!z9) {
                    if (j10 != -1) {
                        return j10;
                    }
                    if (iOExceptionM15932i == null) {
                        return -1L;
                    }
                    throw iOExceptionM15932i;
                }
                j11 = 0;
            }
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return C9639d.this.m15936m();
        }
    }

    /* renamed from: t8.d$d */
    public final class d extends AsyncTimeout {
        public d() {
        }

        /* renamed from: a */
        public final void m15959a() throws IOException {
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
            C9639d.this.m15929f(ErrorCode.CANCEL);
            C9639d.this.m15930g().m14962S();
        }
    }

    public C9639d(int i9, C9244b connection, boolean z9, boolean z10, C8918q c8918q) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f16944a = i9;
        this.f16945b = connection;
        this.f16949f = connection.m14948E().m15973c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f16950g = arrayDeque;
        this.f16952i = new c(connection.m14947D().m15973c(), z10);
        this.f16953j = new b(z9);
        this.f16954k = new d();
        this.f16955l = new d();
        if (c8918q == null) {
            if (!m15943t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (m15943t()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(c8918q);
        }
    }

    /* renamed from: A */
    public final void m15919A(long j9) {
        this.f16946c = j9;
    }

    /* renamed from: B */
    public final void m15920B(long j9) {
        this.f16948e = j9;
    }

    /* renamed from: C */
    public final synchronized C8918q m15921C() {
        Object objRemoveFirst;
        this.f16954k.enter();
        while (this.f16950g.isEmpty() && this.f16956m == null) {
            try {
                m15922D();
            } catch (Throwable th) {
                this.f16954k.m15959a();
                throw th;
            }
        }
        this.f16954k.m15959a();
        if (this.f16950g.isEmpty()) {
            IOException iOException = this.f16957n;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f16956m;
            Intrinsics.checkNotNull(errorCode);
            throw new StreamResetException(errorCode);
        }
        objRemoveFirst = this.f16950g.removeFirst();
        Intrinsics.checkNotNullExpressionValue(objRemoveFirst, "headersQueue.removeFirst()");
        return (C8918q) objRemoveFirst;
    }

    /* renamed from: D */
    public final void m15922D() throws InterruptedException, InterruptedIOException {
        try {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: E */
    public final Timeout m15923E() {
        return this.f16955l;
    }

    /* renamed from: a */
    public final void m15924a(long j9) {
        this.f16949f += j9;
        if (j9 > 0) {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* renamed from: b */
    public final void m15925b() {
        boolean z9;
        boolean zM15944u;
        if (AbstractC9045d.f15231h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z9 = !this.f16952i.m15954c() && this.f16952i.m15953a() && (this.f16953j.m15952g() || this.f16953j.m15951c());
                zM15944u = m15944u();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z9) {
            m15927d(ErrorCode.CANCEL, null);
        } else {
            if (zM15944u) {
                return;
            }
            this.f16945b.m14961R(this.f16944a);
        }
    }

    /* renamed from: c */
    public final void m15926c() throws IOException {
        if (this.f16953j.m15951c()) {
            throw new IOException("stream closed");
        }
        if (this.f16953j.m15952g()) {
            throw new IOException("stream finished");
        }
        if (this.f16956m != null) {
            IOException iOException = this.f16957n;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f16956m;
            Intrinsics.checkNotNull(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    /* renamed from: d */
    public final void m15927d(ErrorCode rstStatusCode, IOException iOException) {
        Intrinsics.checkNotNullParameter(rstStatusCode, "rstStatusCode");
        if (m15928e(rstStatusCode, iOException)) {
            this.f16945b.m14971c0(this.f16944a, rstStatusCode);
        }
    }

    /* renamed from: e */
    public final boolean m15928e(ErrorCode errorCode, IOException iOException) {
        if (AbstractC9045d.f15231h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.f16956m != null) {
                return false;
            }
            this.f16956m = errorCode;
            this.f16957n = iOException;
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.f16952i.m15954c() && this.f16953j.m15952g()) {
                return false;
            }
            Unit unit = Unit.INSTANCE;
            this.f16945b.m14961R(this.f16944a);
            return true;
        }
    }

    /* renamed from: f */
    public final void m15929f(ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (m15928e(errorCode, null)) {
            this.f16945b.m14972d0(this.f16944a, errorCode);
        }
    }

    /* renamed from: g */
    public final C9244b m15930g() {
        return this.f16945b;
    }

    /* renamed from: h */
    public final synchronized ErrorCode m15931h() {
        return this.f16956m;
    }

    /* renamed from: i */
    public final IOException m15932i() {
        return this.f16957n;
    }

    /* renamed from: j */
    public final int m15933j() {
        return this.f16944a;
    }

    /* renamed from: k */
    public final long m15934k() {
        return this.f16947d;
    }

    /* renamed from: l */
    public final long m15935l() {
        return this.f16946c;
    }

    /* renamed from: m */
    public final d m15936m() {
        return this.f16954k;
    }

    /* renamed from: n */
    public final Sink m15937n() {
        synchronized (this) {
            try {
                if (!this.f16951h && !m15943t()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f16953j;
    }

    /* renamed from: o */
    public final b m15938o() {
        return this.f16953j;
    }

    /* renamed from: p */
    public final c m15939p() {
        return this.f16952i;
    }

    /* renamed from: q */
    public final long m15940q() {
        return this.f16949f;
    }

    /* renamed from: r */
    public final long m15941r() {
        return this.f16948e;
    }

    /* renamed from: s */
    public final d m15942s() {
        return this.f16955l;
    }

    /* renamed from: t */
    public final boolean m15943t() {
        return this.f16945b.m14976y() == ((this.f16944a & 1) == 1);
    }

    /* renamed from: u */
    public final synchronized boolean m15944u() {
        try {
            if (this.f16956m != null) {
                return false;
            }
            if (this.f16952i.m15954c() || this.f16952i.m15953a()) {
                if (this.f16953j.m15952g() || this.f16953j.m15951c()) {
                    if (this.f16951h) {
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
    public final Timeout m15945v() {
        return this.f16954k;
    }

    /* renamed from: w */
    public final void m15946w(BufferedSource source, int i9) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!AbstractC9045d.f15231h || !Thread.holdsLock(this)) {
            this.f16952i.m15955g(source, i9);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* renamed from: x */
    public final void m15947x(C8918q headers, boolean z9) {
        boolean zM15944u;
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (AbstractC9045d.f15231h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f16951h && z9) {
                    this.f16952i.m15957i(headers);
                } else {
                    this.f16951h = true;
                    this.f16950g.add(headers);
                }
                if (z9) {
                    this.f16952i.m15956h(true);
                }
                zM15944u = m15944u();
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM15944u) {
            return;
        }
        this.f16945b.m14961R(this.f16944a);
    }

    /* renamed from: y */
    public final synchronized void m15948y(ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f16956m == null) {
            this.f16956m = errorCode;
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* renamed from: z */
    public final void m15949z(long j9) {
        this.f16947d = j9;
    }
}
