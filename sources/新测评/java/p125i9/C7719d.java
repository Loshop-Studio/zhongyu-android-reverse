package p125i9;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.C8741b;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p011a9.C0054q;
import p028b9.AbstractC5070d;

/* renamed from: i9.d */
/* loaded from: classes5.dex */
public final class C7719d {

    /* renamed from: o */
    public static final a f13113o = new a(null);

    /* renamed from: a */
    public final int f13114a;

    /* renamed from: b */
    public final C8741b f13115b;

    /* renamed from: c */
    public long f13116c;

    /* renamed from: d */
    public long f13117d;

    /* renamed from: e */
    public long f13118e;

    /* renamed from: f */
    public long f13119f;

    /* renamed from: g */
    public final ArrayDeque f13120g;

    /* renamed from: h */
    public boolean f13121h;

    /* renamed from: i */
    public final c f13122i;

    /* renamed from: j */
    public final b f13123j;

    /* renamed from: k */
    public final d f13124k;

    /* renamed from: l */
    public final d f13125l;

    /* renamed from: m */
    public ErrorCode f13126m;

    /* renamed from: n */
    public IOException f13127n;

    /* renamed from: i9.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: i9.d$b */
    public final class b implements Sink {

        /* renamed from: a */
        public boolean f13128a;

        /* renamed from: b */
        public final Buffer f13129b = new Buffer();

        /* renamed from: c */
        public C0054q f13130c;

        /* renamed from: d */
        public boolean f13131d;

        public b(boolean z9) {
            this.f13128a = z9;
        }

        /* JADX WARN: Finally extract failed */
        /* renamed from: a */
        public final void m12931a(boolean z9) throws IOException {
            long jMin;
            boolean z10;
            C7719d c7719d = C7719d.this;
            synchronized (c7719d) {
                try {
                    c7719d.m12923s().enter();
                    while (c7719d.m12922r() >= c7719d.m12921q() && !this.f13128a && !this.f13131d && c7719d.m12912h() == null) {
                        try {
                            c7719d.m12903D();
                        } catch (Throwable th) {
                            c7719d.m12923s().m12940a();
                            throw th;
                        }
                    }
                    c7719d.m12923s().m12940a();
                    c7719d.m12907c();
                    jMin = Math.min(c7719d.m12921q() - c7719d.m12922r(), this.f13129b.size());
                    c7719d.m12901B(c7719d.m12922r() + jMin);
                    z10 = z9 && jMin == this.f13129b.size();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C7719d.this.m12923s().enter();
            try {
                C7719d.this.m12911g().m14534Z(C7719d.this.m12914j(), z10, this.f13129b, jMin);
            } finally {
                C7719d.this.m12923s().m12940a();
            }
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C7719d c7719d = C7719d.this;
            if (AbstractC5070d.f2640h && Thread.holdsLock(c7719d)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c7719d);
            }
            C7719d c7719d2 = C7719d.this;
            synchronized (c7719d2) {
                if (this.f13131d) {
                    return;
                }
                boolean z9 = c7719d2.m12912h() == null;
                Unit unit = Unit.INSTANCE;
                if (!C7719d.this.m12919o().f13128a) {
                    boolean z10 = this.f13129b.size() > 0;
                    if (this.f13130c != null) {
                        while (this.f13129b.size() > 0) {
                            m12931a(false);
                        }
                        C8741b c8741bM12911g = C7719d.this.m12911g();
                        int iM12914j = C7719d.this.m12914j();
                        C0054q c0054q = this.f13130c;
                        Intrinsics.checkNotNull(c0054q);
                        c8741bM12911g.m14535a0(iM12914j, z9, AbstractC5070d.m2624O(c0054q));
                    } else if (z10) {
                        while (this.f13129b.size() > 0) {
                            m12931a(true);
                        }
                    } else if (z9) {
                        C7719d.this.m12911g().m14534Z(C7719d.this.m12914j(), true, null, 0L);
                    }
                }
                synchronized (C7719d.this) {
                    this.f13131d = true;
                    Unit unit2 = Unit.INSTANCE;
                }
                C7719d.this.m12911g().flush();
                C7719d.this.m12906b();
            }
        }

        /* renamed from: f */
        public final boolean m12932f() {
            return this.f13131d;
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            C7719d c7719d = C7719d.this;
            if (AbstractC5070d.f2640h && Thread.holdsLock(c7719d)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c7719d);
            }
            C7719d c7719d2 = C7719d.this;
            synchronized (c7719d2) {
                c7719d2.m12907c();
                Unit unit = Unit.INSTANCE;
            }
            while (this.f13129b.size() > 0) {
                m12931a(false);
                C7719d.this.m12911g().flush();
            }
        }

        /* renamed from: g */
        public final boolean m12933g() {
            return this.f13128a;
        }

        @Override // okio.Sink
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return C7719d.this.m12923s();
        }

        @Override // okio.Sink
        public void write(Buffer source, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            C7719d c7719d = C7719d.this;
            if (!AbstractC5070d.f2640h || !Thread.holdsLock(c7719d)) {
                this.f13129b.write(source, j10);
                while (this.f13129b.size() >= PlaybackStateCompat.ACTION_PREPARE) {
                    m12931a(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c7719d);
            }
        }
    }

    /* renamed from: i9.d$c */
    public final class c implements Source {

        /* renamed from: a */
        public final long f13133a;

        /* renamed from: b */
        public boolean f13134b;

        /* renamed from: c */
        public final Buffer f13135c = new Buffer();

        /* renamed from: d */
        public final Buffer f13136d = new Buffer();

        /* renamed from: e */
        public C0054q f13137e;

        /* renamed from: f */
        public boolean f13138f;

        public c(long j10, boolean z9) {
            this.f13133a = j10;
            this.f13134b = z9;
        }

        /* renamed from: a */
        public final boolean m12934a() {
            return this.f13138f;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            C7719d c7719d = C7719d.this;
            synchronized (c7719d) {
                this.f13138f = true;
                size = this.f13136d.size();
                this.f13136d.clear();
                Intrinsics.checkNotNull(c7719d, "null cannot be cast to non-null type java.lang.Object");
                c7719d.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
            if (size > 0) {
                m12939j(size);
            }
            C7719d.this.m12906b();
        }

        /* renamed from: f */
        public final boolean m12935f() {
            return this.f13134b;
        }

        /* renamed from: g */
        public final void m12936g(BufferedSource source, long j10) throws IOException {
            boolean z9;
            boolean z10;
            Intrinsics.checkNotNullParameter(source, "source");
            C7719d c7719d = C7719d.this;
            if (AbstractC5070d.f2640h && Thread.holdsLock(c7719d)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c7719d);
            }
            long j11 = j10;
            while (j11 > 0) {
                synchronized (C7719d.this) {
                    z9 = this.f13134b;
                    z10 = this.f13136d.size() + j11 > this.f13133a;
                    Unit unit = Unit.INSTANCE;
                }
                if (z10) {
                    source.skip(j11);
                    C7719d.this.m12910f(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z9) {
                    source.skip(j11);
                    return;
                }
                long j12 = source.read(this.f13135c, j11);
                if (j12 == -1) {
                    throw new EOFException();
                }
                j11 -= j12;
                C7719d c7719d2 = C7719d.this;
                synchronized (c7719d2) {
                    try {
                        if (this.f13138f) {
                            this.f13135c.clear();
                        } else {
                            boolean z11 = this.f13136d.size() == 0;
                            this.f13136d.writeAll(this.f13135c);
                            if (z11) {
                                Intrinsics.checkNotNull(c7719d2, "null cannot be cast to non-null type java.lang.Object");
                                c7719d2.notifyAll();
                            }
                        }
                    } finally {
                    }
                }
            }
            m12939j(j10);
        }

        /* renamed from: h */
        public final void m12937h(boolean z9) {
            this.f13134b = z9;
        }

        /* renamed from: i */
        public final void m12938i(C0054q c0054q) {
            this.f13137e = c0054q;
        }

        /* renamed from: j */
        public final void m12939j(long j10) {
            C7719d c7719d = C7719d.this;
            if (!AbstractC5070d.f2640h || !Thread.holdsLock(c7719d)) {
                C7719d.this.m12911g().m14533Y(j10);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c7719d);
        }

        @Override // okio.Source
        public long read(Buffer sink, long j10) throws IOException {
            IOException iOExceptionM12913i;
            boolean z9;
            long j11;
            Intrinsics.checkNotNullParameter(sink, "sink");
            long j12 = 0;
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            while (true) {
                C7719d c7719d = C7719d.this;
                synchronized (c7719d) {
                    c7719d.m12917m().enter();
                    try {
                        if (c7719d.m12912h() == null || this.f13134b) {
                            iOExceptionM12913i = null;
                        } else {
                            iOExceptionM12913i = c7719d.m12913i();
                            if (iOExceptionM12913i == null) {
                                ErrorCode errorCodeM12912h = c7719d.m12912h();
                                Intrinsics.checkNotNull(errorCodeM12912h);
                                iOExceptionM12913i = new StreamResetException(errorCodeM12912h);
                            }
                        }
                        if (this.f13138f) {
                            throw new IOException("stream closed");
                        }
                        z9 = false;
                        if (this.f13136d.size() > j12) {
                            Buffer buffer = this.f13136d;
                            j11 = buffer.read(sink, Math.min(j10, buffer.size()));
                            c7719d.m12900A(c7719d.m12916l() + j11);
                            long jM12916l = c7719d.m12916l() - c7719d.m12915k();
                            if (iOExceptionM12913i == null && jM12916l >= c7719d.m12911g().m14513D().m12954c() / 2) {
                                c7719d.m12911g().m14539e0(c7719d.m12914j(), jM12916l);
                                c7719d.m12930z(c7719d.m12916l());
                            }
                        } else {
                            if (!this.f13134b && iOExceptionM12913i == null) {
                                c7719d.m12903D();
                                z9 = true;
                            }
                            j11 = -1;
                        }
                        c7719d.m12917m().m12940a();
                        Unit unit = Unit.INSTANCE;
                    } finally {
                    }
                }
                if (!z9) {
                    if (j11 != -1) {
                        return j11;
                    }
                    if (iOExceptionM12913i == null) {
                        return -1L;
                    }
                    throw iOExceptionM12913i;
                }
                j12 = 0;
            }
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return C7719d.this.m12917m();
        }
    }

    /* renamed from: i9.d$d */
    public final class d extends AsyncTimeout {
        public d() {
        }

        /* renamed from: a */
        public final void m12940a() throws IOException {
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
            C7719d.this.m12910f(ErrorCode.CANCEL);
            C7719d.this.m12911g().m14528S();
        }
    }

    public C7719d(int i10, C8741b connection, boolean z9, boolean z10, C0054q c0054q) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f13114a = i10;
        this.f13115b = connection;
        this.f13119f = connection.m14514E().m12954c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f13120g = arrayDeque;
        this.f13122i = new c(connection.m14513D().m12954c(), z10);
        this.f13123j = new b(z9);
        this.f13124k = new d();
        this.f13125l = new d();
        if (c0054q == null) {
            if (!m12924t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (m12924t()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(c0054q);
        }
    }

    /* renamed from: A */
    public final void m12900A(long j10) {
        this.f13116c = j10;
    }

    /* renamed from: B */
    public final void m12901B(long j10) {
        this.f13118e = j10;
    }

    /* renamed from: C */
    public final synchronized C0054q m12902C() {
        Object objRemoveFirst;
        this.f13124k.enter();
        while (this.f13120g.isEmpty() && this.f13126m == null) {
            try {
                m12903D();
            } catch (Throwable th) {
                this.f13124k.m12940a();
                throw th;
            }
        }
        this.f13124k.m12940a();
        if (this.f13120g.isEmpty()) {
            IOException iOException = this.f13127n;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f13126m;
            Intrinsics.checkNotNull(errorCode);
            throw new StreamResetException(errorCode);
        }
        objRemoveFirst = this.f13120g.removeFirst();
        Intrinsics.checkNotNullExpressionValue(objRemoveFirst, "headersQueue.removeFirst()");
        return (C0054q) objRemoveFirst;
    }

    /* renamed from: D */
    public final void m12903D() throws InterruptedException, InterruptedIOException {
        try {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: E */
    public final Timeout m12904E() {
        return this.f13125l;
    }

    /* renamed from: a */
    public final void m12905a(long j10) {
        this.f13119f += j10;
        if (j10 > 0) {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* renamed from: b */
    public final void m12906b() {
        boolean z9;
        boolean zM12925u;
        if (AbstractC5070d.f2640h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z9 = !this.f13122i.m12935f() && this.f13122i.m12934a() && (this.f13123j.m12933g() || this.f13123j.m12932f());
                zM12925u = m12925u();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z9) {
            m12908d(ErrorCode.CANCEL, null);
        } else {
            if (zM12925u) {
                return;
            }
            this.f13115b.m14527R(this.f13114a);
        }
    }

    /* renamed from: c */
    public final void m12907c() throws IOException {
        if (this.f13123j.m12932f()) {
            throw new IOException("stream closed");
        }
        if (this.f13123j.m12933g()) {
            throw new IOException("stream finished");
        }
        if (this.f13126m != null) {
            IOException iOException = this.f13127n;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f13126m;
            Intrinsics.checkNotNull(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    /* renamed from: d */
    public final void m12908d(ErrorCode rstStatusCode, IOException iOException) {
        Intrinsics.checkNotNullParameter(rstStatusCode, "rstStatusCode");
        if (m12909e(rstStatusCode, iOException)) {
            this.f13115b.m14537c0(this.f13114a, rstStatusCode);
        }
    }

    /* renamed from: e */
    public final boolean m12909e(ErrorCode errorCode, IOException iOException) {
        if (AbstractC5070d.f2640h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.f13126m != null) {
                return false;
            }
            this.f13126m = errorCode;
            this.f13127n = iOException;
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.f13122i.m12935f() && this.f13123j.m12933g()) {
                return false;
            }
            Unit unit = Unit.INSTANCE;
            this.f13115b.m14527R(this.f13114a);
            return true;
        }
    }

    /* renamed from: f */
    public final void m12910f(ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (m12909e(errorCode, null)) {
            this.f13115b.m14538d0(this.f13114a, errorCode);
        }
    }

    /* renamed from: g */
    public final C8741b m12911g() {
        return this.f13115b;
    }

    /* renamed from: h */
    public final synchronized ErrorCode m12912h() {
        return this.f13126m;
    }

    /* renamed from: i */
    public final IOException m12913i() {
        return this.f13127n;
    }

    /* renamed from: j */
    public final int m12914j() {
        return this.f13114a;
    }

    /* renamed from: k */
    public final long m12915k() {
        return this.f13117d;
    }

    /* renamed from: l */
    public final long m12916l() {
        return this.f13116c;
    }

    /* renamed from: m */
    public final d m12917m() {
        return this.f13124k;
    }

    /* renamed from: n */
    public final Sink m12918n() {
        synchronized (this) {
            try {
                if (!this.f13121h && !m12924t()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f13123j;
    }

    /* renamed from: o */
    public final b m12919o() {
        return this.f13123j;
    }

    /* renamed from: p */
    public final c m12920p() {
        return this.f13122i;
    }

    /* renamed from: q */
    public final long m12921q() {
        return this.f13119f;
    }

    /* renamed from: r */
    public final long m12922r() {
        return this.f13118e;
    }

    /* renamed from: s */
    public final d m12923s() {
        return this.f13125l;
    }

    /* renamed from: t */
    public final boolean m12924t() {
        return this.f13115b.m14542y() == ((this.f13114a & 1) == 1);
    }

    /* renamed from: u */
    public final synchronized boolean m12925u() {
        try {
            if (this.f13126m != null) {
                return false;
            }
            if (this.f13122i.m12935f() || this.f13122i.m12934a()) {
                if (this.f13123j.m12933g() || this.f13123j.m12932f()) {
                    if (this.f13121h) {
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
    public final Timeout m12926v() {
        return this.f13124k;
    }

    /* renamed from: w */
    public final void m12927w(BufferedSource source, int i10) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!AbstractC5070d.f2640h || !Thread.holdsLock(this)) {
            this.f13122i.m12936g(source, i10);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* renamed from: x */
    public final void m12928x(C0054q headers, boolean z9) {
        boolean zM12925u;
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (AbstractC5070d.f2640h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f13121h && z9) {
                    this.f13122i.m12938i(headers);
                } else {
                    this.f13121h = true;
                    this.f13120g.add(headers);
                }
                if (z9) {
                    this.f13122i.m12937h(true);
                }
                zM12925u = m12925u();
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM12925u) {
            return;
        }
        this.f13115b.m14527R(this.f13114a);
    }

    /* renamed from: y */
    public final synchronized void m12929y(ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f13126m == null) {
            this.f13126m = errorCode;
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* renamed from: z */
    public final void m12930z(long j10) {
        this.f13117d = j10;
    }
}
