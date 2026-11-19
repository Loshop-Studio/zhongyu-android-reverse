package p149z2;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p117r2.C4516s;
import p121s2.AbstractC4550b;

/* renamed from: z2.g */
/* loaded from: classes2.dex */
public final class C4714g {

    /* renamed from: o */
    public static final a f6232o = new a(null);

    /* renamed from: a */
    public long f6233a;

    /* renamed from: b */
    public long f6234b;

    /* renamed from: c */
    public long f6235c;

    /* renamed from: d */
    public long f6236d;

    /* renamed from: e */
    public final ArrayDeque f6237e;

    /* renamed from: f */
    public boolean f6238f;

    /* renamed from: g */
    public final c f6239g;

    /* renamed from: h */
    public final b f6240h;

    /* renamed from: i */
    public final d f6241i;

    /* renamed from: j */
    public final d f6242j;

    /* renamed from: k */
    public ErrorCode f6243k;

    /* renamed from: l */
    public IOException f6244l;

    /* renamed from: m */
    public final int f6245m;

    /* renamed from: n */
    public final C4711d f6246n;

    /* renamed from: z2.g$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: z2.g$b */
    public final class b implements Sink {

        /* renamed from: a */
        public final Buffer f6247a = new Buffer();

        /* renamed from: b */
        public C4516s f6248b;

        /* renamed from: c */
        public boolean f6249c;

        /* renamed from: d */
        public boolean f6250d;

        public b(boolean z3) {
            this.f6250d = z3;
        }

        /* renamed from: a */
        public final void m6880a(boolean z3) throws IOException {
            long jMin;
            boolean z4;
            synchronized (C4714g.this) {
                C4714g.this.m6872s().enter();
                while (C4714g.this.m6871r() >= C4714g.this.m6870q() && !this.f6250d && !this.f6249c && C4714g.this.m6861h() == null) {
                    try {
                        C4714g.this.m6852D();
                    } finally {
                    }
                }
                C4714g.this.m6872s().m6889a();
                C4714g.this.m6856c();
                jMin = Math.min(C4714g.this.m6870q() - C4714g.this.m6871r(), this.f6247a.size());
                C4714g c4714g = C4714g.this;
                c4714g.m6850B(c4714g.m6871r() + jMin);
                z4 = z3 && jMin == this.f6247a.size() && C4714g.this.m6861h() == null;
                Unit unit = Unit.INSTANCE;
            }
            C4714g.this.m6872s().enter();
            try {
                C4714g.this.m6860g().m6782V(C4714g.this.m6863j(), z4, this.f6247a, jMin);
            } finally {
            }
        }

        /* renamed from: b */
        public final boolean m6881b() {
            return this.f6249c;
        }

        /* renamed from: c */
        public final boolean m6882c() {
            return this.f6250d;
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C4714g c4714g = C4714g.this;
            if (AbstractC4550b.f5708h && Thread.holdsLock(c4714g)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
                sb.append(threadCurrentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(c4714g);
                throw new AssertionError(sb.toString());
            }
            synchronized (C4714g.this) {
                if (this.f6249c) {
                    return;
                }
                boolean z3 = C4714g.this.m6861h() == null;
                Unit unit = Unit.INSTANCE;
                if (!C4714g.this.m6868o().f6250d) {
                    boolean z4 = this.f6247a.size() > 0;
                    if (this.f6248b != null) {
                        while (this.f6247a.size() > 0) {
                            m6880a(false);
                        }
                        C4711d c4711dM6860g = C4714g.this.m6860g();
                        int iM6863j = C4714g.this.m6863j();
                        C4516s c4516s = this.f6248b;
                        Intrinsics.checkNotNull(c4516s);
                        c4711dM6860g.m6783W(iM6863j, z3, AbstractC4550b.m6207J(c4516s));
                    } else if (z4) {
                        while (this.f6247a.size() > 0) {
                            m6880a(true);
                        }
                    } else if (z3) {
                        C4714g.this.m6860g().m6782V(C4714g.this.m6863j(), true, null, 0L);
                    }
                }
                synchronized (C4714g.this) {
                    this.f6249c = true;
                    Unit unit2 = Unit.INSTANCE;
                }
                C4714g.this.m6860g().flush();
                C4714g.this.m6855b();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            C4714g c4714g = C4714g.this;
            if (AbstractC4550b.f5708h && Thread.holdsLock(c4714g)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
                sb.append(threadCurrentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(c4714g);
                throw new AssertionError(sb.toString());
            }
            synchronized (C4714g.this) {
                C4714g.this.m6856c();
                Unit unit = Unit.INSTANCE;
            }
            while (this.f6247a.size() > 0) {
                m6880a(false);
                C4714g.this.m6860g().flush();
            }
        }

        @Override // okio.Sink
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return C4714g.this.m6872s();
        }

        @Override // okio.Sink
        public void write(Buffer source, long j4) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            C4714g c4714g = C4714g.this;
            if (!AbstractC4550b.f5708h || !Thread.holdsLock(c4714g)) {
                this.f6247a.write(source, j4);
                while (this.f6247a.size() >= PlaybackStateCompat.ACTION_PREPARE) {
                    m6880a(false);
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(c4714g);
            throw new AssertionError(sb.toString());
        }
    }

    /* renamed from: z2.g$c */
    public final class c implements Source {

        /* renamed from: a */
        public final Buffer f6252a = new Buffer();

        /* renamed from: b */
        public final Buffer f6253b = new Buffer();

        /* renamed from: c */
        public C4516s f6254c;

        /* renamed from: d */
        public boolean f6255d;

        /* renamed from: e */
        public final long f6256e;

        /* renamed from: f */
        public boolean f6257f;

        public c(long j4, boolean z3) {
            this.f6256e = j4;
            this.f6257f = z3;
        }

        /* renamed from: a */
        public final boolean m6883a() {
            return this.f6255d;
        }

        /* renamed from: b */
        public final boolean m6884b() {
            return this.f6257f;
        }

        /* renamed from: c */
        public final void m6885c(BufferedSource source, long j4) throws IOException {
            boolean z3;
            boolean z4;
            boolean z5;
            long size;
            Intrinsics.checkNotNullParameter(source, "source");
            C4714g c4714g = C4714g.this;
            if (AbstractC4550b.f5708h && Thread.holdsLock(c4714g)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
                sb.append(threadCurrentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(c4714g);
                throw new AssertionError(sb.toString());
            }
            while (j4 > 0) {
                synchronized (C4714g.this) {
                    z3 = this.f6257f;
                    z4 = true;
                    z5 = this.f6253b.size() + j4 > this.f6256e;
                    Unit unit = Unit.INSTANCE;
                }
                if (z5) {
                    source.skip(j4);
                    C4714g.this.m6859f(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z3) {
                    source.skip(j4);
                    return;
                }
                long j5 = source.read(this.f6252a, j4);
                if (j5 == -1) {
                    throw new EOFException();
                }
                j4 -= j5;
                synchronized (C4714g.this) {
                    if (this.f6255d) {
                        size = this.f6252a.size();
                        this.f6252a.clear();
                    } else {
                        if (this.f6253b.size() != 0) {
                            z4 = false;
                        }
                        this.f6253b.writeAll(this.f6252a);
                        if (z4) {
                            C4714g c4714g2 = C4714g.this;
                            if (c4714g2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                            }
                            c4714g2.notifyAll();
                        }
                        size = 0;
                    }
                }
                if (size > 0) {
                    m6888f(size);
                }
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            synchronized (C4714g.this) {
                this.f6255d = true;
                size = this.f6253b.size();
                this.f6253b.clear();
                C4714g c4714g = C4714g.this;
                if (c4714g == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                c4714g.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
            if (size > 0) {
                m6888f(size);
            }
            C4714g.this.m6855b();
        }

        /* renamed from: d */
        public final void m6886d(boolean z3) {
            this.f6257f = z3;
        }

        /* renamed from: e */
        public final void m6887e(C4516s c4516s) {
            this.f6254c = c4516s;
        }

        /* renamed from: f */
        public final void m6888f(long j4) {
            C4714g c4714g = C4714g.this;
            if (!AbstractC4550b.f5708h || !Thread.holdsLock(c4714g)) {
                C4714g.this.m6860g().m6781U(j4);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(c4714g);
            throw new AssertionError(sb.toString());
        }

        @Override // okio.Source
        public long read(Buffer sink, long j4) throws IOException {
            IOException iOExceptionM6862i;
            long j5;
            boolean z3;
            Intrinsics.checkNotNullParameter(sink, "sink");
            long j6 = 0;
            if (!(j4 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
            }
            while (true) {
                synchronized (C4714g.this) {
                    C4714g.this.m6866m().enter();
                    try {
                        if (C4714g.this.m6861h() != null) {
                            iOExceptionM6862i = C4714g.this.m6862i();
                            if (iOExceptionM6862i == null) {
                                ErrorCode errorCodeM6861h = C4714g.this.m6861h();
                                Intrinsics.checkNotNull(errorCodeM6861h);
                                iOExceptionM6862i = new StreamResetException(errorCodeM6861h);
                            }
                        } else {
                            iOExceptionM6862i = null;
                        }
                        if (this.f6255d) {
                            throw new IOException("stream closed");
                        }
                        if (this.f6253b.size() > j6) {
                            Buffer buffer = this.f6253b;
                            j5 = buffer.read(sink, Math.min(j4, buffer.size()));
                            C4714g c4714g = C4714g.this;
                            c4714g.m6849A(c4714g.m6865l() + j5);
                            long jM6865l = C4714g.this.m6865l() - C4714g.this.m6864k();
                            if (iOExceptionM6862i == null && jM6865l >= C4714g.this.m6860g().m6795z().m6917c() / 2) {
                                C4714g.this.m6860g().m6787a0(C4714g.this.m6863j(), jM6865l);
                                C4714g c4714g2 = C4714g.this;
                                c4714g2.m6879z(c4714g2.m6865l());
                            }
                        } else if (this.f6257f || iOExceptionM6862i != null) {
                            j5 = -1;
                        } else {
                            C4714g.this.m6852D();
                            j5 = -1;
                            z3 = true;
                            C4714g.this.m6866m().m6889a();
                            Unit unit = Unit.INSTANCE;
                        }
                        z3 = false;
                        C4714g.this.m6866m().m6889a();
                        Unit unit2 = Unit.INSTANCE;
                    } finally {
                    }
                }
                if (!z3) {
                    if (j5 != -1) {
                        m6888f(j5);
                        return j5;
                    }
                    if (iOExceptionM6862i == null) {
                        return -1L;
                    }
                    Intrinsics.checkNotNull(iOExceptionM6862i);
                    throw iOExceptionM6862i;
                }
                j6 = 0;
            }
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return C4714g.this.m6866m();
        }
    }

    /* renamed from: z2.g$d */
    public final class d extends AsyncTimeout {
        public d() {
        }

        /* renamed from: a */
        public final void m6889a() throws IOException {
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
            C4714g.this.m6859f(ErrorCode.CANCEL);
            C4714g.this.m6860g().m6776O();
        }
    }

    public C4714g(int i4, C4711d connection, boolean z3, boolean z4, C4516s c4516s) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f6245m = i4;
        this.f6246n = connection;
        this.f6236d = connection.m6762A().m6917c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f6237e = arrayDeque;
        this.f6239g = new c(connection.m6795z().m6917c(), z4);
        this.f6240h = new b(z3);
        this.f6241i = new d();
        this.f6242j = new d();
        if (c4516s == null) {
            if (!m6873t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!m6873t())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(c4516s);
        }
    }

    /* renamed from: A */
    public final void m6849A(long j4) {
        this.f6233a = j4;
    }

    /* renamed from: B */
    public final void m6850B(long j4) {
        this.f6235c = j4;
    }

    /* renamed from: C */
    public final synchronized C4516s m6851C() {
        Object objRemoveFirst;
        this.f6241i.enter();
        while (this.f6237e.isEmpty() && this.f6243k == null) {
            try {
                m6852D();
            } catch (Throwable th) {
                this.f6241i.m6889a();
                throw th;
            }
        }
        this.f6241i.m6889a();
        if (!(!this.f6237e.isEmpty())) {
            IOException iOException = this.f6244l;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f6243k;
            Intrinsics.checkNotNull(errorCode);
            throw new StreamResetException(errorCode);
        }
        objRemoveFirst = this.f6237e.removeFirst();
        Intrinsics.checkNotNullExpressionValue(objRemoveFirst, "headersQueue.removeFirst()");
        return (C4516s) objRemoveFirst;
    }

    /* renamed from: D */
    public final void m6852D() throws InterruptedException, InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: E */
    public final Timeout m6853E() {
        return this.f6242j;
    }

    /* renamed from: a */
    public final void m6854a(long j4) {
        this.f6236d += j4;
        if (j4 > 0) {
            notifyAll();
        }
    }

    /* renamed from: b */
    public final void m6855b() {
        boolean z3;
        boolean zM6874u;
        if (AbstractC4550b.f5708h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            z3 = !this.f6239g.m6884b() && this.f6239g.m6883a() && (this.f6240h.m6882c() || this.f6240h.m6881b());
            zM6874u = m6874u();
            Unit unit = Unit.INSTANCE;
        }
        if (z3) {
            m6857d(ErrorCode.CANCEL, null);
        } else {
            if (zM6874u) {
                return;
            }
            this.f6246n.m6775N(this.f6245m);
        }
    }

    /* renamed from: c */
    public final void m6856c() throws IOException {
        if (this.f6240h.m6881b()) {
            throw new IOException("stream closed");
        }
        if (this.f6240h.m6882c()) {
            throw new IOException("stream finished");
        }
        if (this.f6243k != null) {
            IOException iOException = this.f6244l;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f6243k;
            Intrinsics.checkNotNull(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    /* renamed from: d */
    public final void m6857d(ErrorCode rstStatusCode, IOException iOException) {
        Intrinsics.checkNotNullParameter(rstStatusCode, "rstStatusCode");
        if (m6858e(rstStatusCode, iOException)) {
            this.f6246n.m6785Y(this.f6245m, rstStatusCode);
        }
    }

    /* renamed from: e */
    public final boolean m6858e(ErrorCode errorCode, IOException iOException) {
        if (AbstractC4550b.f5708h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            if (this.f6243k != null) {
                return false;
            }
            if (this.f6239g.m6884b() && this.f6240h.m6882c()) {
                return false;
            }
            this.f6243k = errorCode;
            this.f6244l = iOException;
            notifyAll();
            Unit unit = Unit.INSTANCE;
            this.f6246n.m6775N(this.f6245m);
            return true;
        }
    }

    /* renamed from: f */
    public final void m6859f(ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (m6858e(errorCode, null)) {
            this.f6246n.m6786Z(this.f6245m, errorCode);
        }
    }

    /* renamed from: g */
    public final C4711d m6860g() {
        return this.f6246n;
    }

    /* renamed from: h */
    public final synchronized ErrorCode m6861h() {
        return this.f6243k;
    }

    /* renamed from: i */
    public final IOException m6862i() {
        return this.f6244l;
    }

    /* renamed from: j */
    public final int m6863j() {
        return this.f6245m;
    }

    /* renamed from: k */
    public final long m6864k() {
        return this.f6234b;
    }

    /* renamed from: l */
    public final long m6865l() {
        return this.f6233a;
    }

    /* renamed from: m */
    public final d m6866m() {
        return this.f6241i;
    }

    /* renamed from: n */
    public final Sink m6867n() {
        synchronized (this) {
            if (!(this.f6238f || m6873t())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        return this.f6240h;
    }

    /* renamed from: o */
    public final b m6868o() {
        return this.f6240h;
    }

    /* renamed from: p */
    public final c m6869p() {
        return this.f6239g;
    }

    /* renamed from: q */
    public final long m6870q() {
        return this.f6236d;
    }

    /* renamed from: r */
    public final long m6871r() {
        return this.f6235c;
    }

    /* renamed from: s */
    public final d m6872s() {
        return this.f6242j;
    }

    /* renamed from: t */
    public final boolean m6873t() {
        return this.f6246n.m6790u() == ((this.f6245m & 1) == 1);
    }

    /* renamed from: u */
    public final synchronized boolean m6874u() {
        if (this.f6243k != null) {
            return false;
        }
        if ((this.f6239g.m6884b() || this.f6239g.m6883a()) && (this.f6240h.m6882c() || this.f6240h.m6881b())) {
            if (this.f6238f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: v */
    public final Timeout m6875v() {
        return this.f6241i;
    }

    /* renamed from: w */
    public final void m6876w(BufferedSource source, int i4) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!AbstractC4550b.f5708h || !Thread.holdsLock(this)) {
            this.f6239g.m6885c(source, i4);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: x */
    public final void m6877x(C4516s headers, boolean z3) {
        boolean zM6874u;
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (AbstractC4550b.f5708h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            if (this.f6238f && z3) {
                this.f6239g.m6887e(headers);
            } else {
                this.f6238f = true;
                this.f6237e.add(headers);
            }
            if (z3) {
                this.f6239g.m6886d(true);
            }
            zM6874u = m6874u();
            notifyAll();
            Unit unit = Unit.INSTANCE;
        }
        if (zM6874u) {
            return;
        }
        this.f6246n.m6775N(this.f6245m);
    }

    /* renamed from: y */
    public final synchronized void m6878y(ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f6243k == null) {
            this.f6243k = errorCode;
            notifyAll();
        }
    }

    /* renamed from: z */
    public final void m6879z(long j4) {
        this.f6234b = j4;
    }
}
