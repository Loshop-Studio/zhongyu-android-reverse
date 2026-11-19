package p246s8;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import okhttp3.internal.connection.RealConnection;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p172l8.C8918q;
import p172l8.C8919r;
import p172l8.C8923v;
import p172l8.C8924w;
import p172l8.C8926y;
import p172l8.InterfaceC8912k;
import p182m8.AbstractC9045d;
import p236r8.AbstractC9443e;
import p236r8.C9447i;
import p236r8.C9449k;
import p236r8.InterfaceC9442d;

/* renamed from: s8.b */
/* loaded from: classes5.dex */
public final class C9591b implements InterfaceC9442d {

    /* renamed from: h */
    public static final d f16767h = new d(null);

    /* renamed from: a */
    public final C8923v f16768a;

    /* renamed from: b */
    public final RealConnection f16769b;

    /* renamed from: c */
    public final BufferedSource f16770c;

    /* renamed from: d */
    public final BufferedSink f16771d;

    /* renamed from: e */
    public int f16772e;

    /* renamed from: f */
    public final C9590a f16773f;

    /* renamed from: g */
    public C8918q f16774g;

    /* renamed from: s8.b$a */
    public abstract class a implements Source {

        /* renamed from: a */
        public final ForwardingTimeout f16775a;

        /* renamed from: b */
        public boolean f16776b;

        public a() {
            this.f16775a = new ForwardingTimeout(C9591b.this.f16770c.getTimeout());
        }

        /* renamed from: a */
        public final boolean m15783a() {
            return this.f16776b;
        }

        /* renamed from: c */
        public final void m15784c() {
            if (C9591b.this.f16772e == 6) {
                return;
            }
            if (C9591b.this.f16772e == 5) {
                C9591b.this.m15774r(this.f16775a);
                C9591b.this.f16772e = 6;
            } else {
                throw new IllegalStateException("state: " + C9591b.this.f16772e);
            }
        }

        /* renamed from: g */
        public final void m15785g(boolean z9) {
            this.f16776b = z9;
        }

        @Override // okio.Source
        public long read(Buffer sink, long j9) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return C9591b.this.f16770c.read(sink, j9);
            } catch (IOException e10) {
                C9591b.this.mo15581b().m14888y();
                m15784c();
                throw e10;
            }
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return this.f16775a;
        }
    }

    /* renamed from: s8.b$b */
    public final class b implements Sink {

        /* renamed from: a */
        public final ForwardingTimeout f16778a;

        /* renamed from: b */
        public boolean f16779b;

        public b() {
            this.f16778a = new ForwardingTimeout(C9591b.this.f16771d.getTimeout());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f16779b) {
                return;
            }
            this.f16779b = true;
            C9591b.this.f16771d.writeUtf8("0\r\n\r\n");
            C9591b.this.m15774r(this.f16778a);
            C9591b.this.f16772e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public synchronized void flush() {
            if (this.f16779b) {
                return;
            }
            C9591b.this.f16771d.flush();
        }

        @Override // okio.Sink
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return this.f16778a;
        }

        @Override // okio.Sink
        public void write(Buffer source, long j9) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f16779b) {
                throw new IllegalStateException("closed");
            }
            if (j9 == 0) {
                return;
            }
            C9591b.this.f16771d.writeHexadecimalUnsignedLong(j9);
            C9591b.this.f16771d.writeUtf8("\r\n");
            C9591b.this.f16771d.write(source, j9);
            C9591b.this.f16771d.writeUtf8("\r\n");
        }
    }

    /* renamed from: s8.b$c */
    public final class c extends a {

        /* renamed from: d */
        public final C8919r f16781d;

        /* renamed from: e */
        public long f16782e;

        /* renamed from: f */
        public boolean f16783f;

        /* renamed from: g */
        public final /* synthetic */ C9591b f16784g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C9591b c9591b, C8919r url) {
            super();
            Intrinsics.checkNotNullParameter(url, "url");
            this.f16784g = c9591b;
            this.f16781d = url;
            this.f16782e = -1L;
            this.f16783f = true;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m15783a()) {
                return;
            }
            if (this.f16783f && !AbstractC9045d.m14503s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f16784g.mo15581b().m14888y();
                m15784c();
            }
            m15785g(true);
        }

        /* renamed from: h */
        public final void m15786h() throws IOException {
            if (this.f16782e != -1) {
                this.f16784g.f16770c.readUtf8LineStrict();
            }
            try {
                this.f16782e = this.f16784g.f16770c.readHexadecimalUnsignedLong();
                String string = StringsKt.trim((CharSequence) this.f16784g.f16770c.readUtf8LineStrict()).toString();
                if (this.f16782e < 0 || (string.length() > 0 && !StringsKt.startsWith$default(string, ";", false, 2, (Object) null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f16782e + string + Typography.quote);
                }
                if (this.f16782e == 0) {
                    this.f16783f = false;
                    C9591b c9591b = this.f16784g;
                    c9591b.f16774g = c9591b.f16773f.m15762a();
                    C8923v c8923v = this.f16784g.f16768a;
                    Intrinsics.checkNotNull(c8923v);
                    InterfaceC8912k interfaceC8912kM14072p = c8923v.m14072p();
                    C8919r c8919r = this.f16781d;
                    C8918q c8918q = this.f16784g.f16774g;
                    Intrinsics.checkNotNull(c8918q);
                    AbstractC9443e.m15593f(interfaceC8912kM14072p, c8919r, c8918q);
                    m15784c();
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // p246s8.C9591b.a, okio.Source
        public long read(Buffer sink, long j9) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j9 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
            }
            if (m15783a()) {
                throw new IllegalStateException("closed");
            }
            if (!this.f16783f) {
                return -1L;
            }
            long j10 = this.f16782e;
            if (j10 == 0 || j10 == -1) {
                m15786h();
                if (!this.f16783f) {
                    return -1L;
                }
            }
            long j11 = super.read(sink, Math.min(j9, this.f16782e));
            if (j11 != -1) {
                this.f16782e -= j11;
                return j11;
            }
            this.f16784g.mo15581b().m14888y();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m15784c();
            throw protocolException;
        }
    }

    /* renamed from: s8.b$d */
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public d() {
        }
    }

    /* renamed from: s8.b$e */
    public final class e extends a {

        /* renamed from: d */
        public long f16785d;

        public e(long j9) {
            super();
            this.f16785d = j9;
            if (j9 == 0) {
                m15784c();
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m15783a()) {
                return;
            }
            if (this.f16785d != 0 && !AbstractC9045d.m14503s(this, 100, TimeUnit.MILLISECONDS)) {
                C9591b.this.mo15581b().m14888y();
                m15784c();
            }
            m15785g(true);
        }

        @Override // p246s8.C9591b.a, okio.Source
        public long read(Buffer sink, long j9) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j9 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
            }
            if (m15783a()) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.f16785d;
            if (j10 == 0) {
                return -1L;
            }
            long j11 = super.read(sink, Math.min(j10, j9));
            if (j11 == -1) {
                C9591b.this.mo15581b().m14888y();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m15784c();
                throw protocolException;
            }
            long j12 = this.f16785d - j11;
            this.f16785d = j12;
            if (j12 == 0) {
                m15784c();
            }
            return j11;
        }
    }

    /* renamed from: s8.b$f */
    public final class f implements Sink {

        /* renamed from: a */
        public final ForwardingTimeout f16787a;

        /* renamed from: b */
        public boolean f16788b;

        public f() {
            this.f16787a = new ForwardingTimeout(C9591b.this.f16771d.getTimeout());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f16788b) {
                return;
            }
            this.f16788b = true;
            C9591b.this.m15774r(this.f16787a);
            C9591b.this.f16772e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            if (this.f16788b) {
                return;
            }
            C9591b.this.f16771d.flush();
        }

        @Override // okio.Sink
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return this.f16787a;
        }

        @Override // okio.Sink
        public void write(Buffer source, long j9) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f16788b) {
                throw new IllegalStateException("closed");
            }
            AbstractC9045d.m14496l(source.size(), 0L, j9);
            C9591b.this.f16771d.write(source, j9);
        }
    }

    /* renamed from: s8.b$g */
    public final class g extends a {

        /* renamed from: d */
        public boolean f16790d;

        public g() {
            super();
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m15783a()) {
                return;
            }
            if (!this.f16790d) {
                m15784c();
            }
            m15785g(true);
        }

        @Override // p246s8.C9591b.a, okio.Source
        public long read(Buffer sink, long j9) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j9 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
            }
            if (m15783a()) {
                throw new IllegalStateException("closed");
            }
            if (this.f16790d) {
                return -1L;
            }
            long j10 = super.read(sink, j9);
            if (j10 != -1) {
                return j10;
            }
            this.f16790d = true;
            m15784c();
            return -1L;
        }
    }

    public C9591b(C8923v c8923v, RealConnection connection, BufferedSource source, BufferedSink sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f16768a = c8923v;
        this.f16769b = connection;
        this.f16770c = source;
        this.f16771d = sink;
        this.f16773f = new C9590a(source);
    }

    /* renamed from: A */
    public final void m15773A(C8918q headers, String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (this.f16772e != 0) {
            throw new IllegalStateException(("state: " + this.f16772e).toString());
        }
        this.f16771d.writeUtf8(requestLine).writeUtf8("\r\n");
        int size = headers.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.f16771d.writeUtf8(headers.m13937b(i9)).writeUtf8(": ").writeUtf8(headers.m13940f(i9)).writeUtf8("\r\n");
        }
        this.f16771d.writeUtf8("\r\n");
        this.f16772e = 1;
    }

    @Override // p236r8.InterfaceC9442d
    /* renamed from: a */
    public void mo15580a() {
        this.f16771d.flush();
    }

    @Override // p236r8.InterfaceC9442d
    /* renamed from: b */
    public RealConnection mo15581b() {
        return this.f16769b;
    }

    @Override // p236r8.InterfaceC9442d
    /* renamed from: c */
    public Sink mo15582c(C8924w request, long j9) throws ProtocolException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.m14128a() != null && request.m14128a().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (m15775s(request)) {
            return m15777u();
        }
        if (j9 != -1) {
            return m15780x();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // p236r8.InterfaceC9442d
    public void cancel() throws IOException {
        mo15581b().m14867d();
    }

    @Override // p236r8.InterfaceC9442d
    /* renamed from: d */
    public long mo15583d(C8926y response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!AbstractC9443e.m15589b(response)) {
            return 0L;
        }
        if (m15776t(response)) {
            return -1L;
        }
        return AbstractC9045d.m14506v(response);
    }

    @Override // p236r8.InterfaceC9442d
    /* renamed from: e */
    public Source mo15584e(C8926y response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!AbstractC9443e.m15589b(response)) {
            return m15779w(0L);
        }
        if (m15776t(response)) {
            return m15778v(response.m14187w().m14137j());
        }
        long jM14506v = AbstractC9045d.m14506v(response);
        return jM14506v != -1 ? m15779w(jM14506v) : m15781y();
    }

    @Override // p236r8.InterfaceC9442d
    /* renamed from: f */
    public C8926y.a mo15585f(boolean z9) {
        int i9 = this.f16772e;
        if (i9 != 1 && i9 != 2 && i9 != 3) {
            throw new IllegalStateException(("state: " + this.f16772e).toString());
        }
        try {
            C9449k c9449kM15618a = C9449k.f16476d.m15618a(this.f16773f.m15763b());
            C8926y.a aVarM14199k = new C8926y.a().m14204p(c9449kM15618a.f16477a).m14195g(c9449kM15618a.f16478b).m14201m(c9449kM15618a.f16479c).m14199k(this.f16773f.m15762a());
            if (z9 && c9449kM15618a.f16478b == 100) {
                return null;
            }
            int i10 = c9449kM15618a.f16478b;
            if (i10 == 100) {
                this.f16772e = 3;
                return aVarM14199k;
            }
            if (102 > i10 || i10 >= 200) {
                this.f16772e = 4;
                return aVarM14199k;
            }
            this.f16772e = 3;
            return aVarM14199k;
        } catch (EOFException e10) {
            throw new IOException("unexpected end of stream on " + mo15581b().m14889z().m13845a().m13844l().m13973p(), e10);
        }
    }

    @Override // p236r8.InterfaceC9442d
    /* renamed from: g */
    public void mo15586g(C8924w request) {
        Intrinsics.checkNotNullParameter(request, "request");
        C9447i c9447i = C9447i.f16473a;
        Proxy.Type type = mo15581b().m14889z().m13846b().type();
        Intrinsics.checkNotNullExpressionValue(type, "connection.route().proxy.type()");
        m15773A(request.m14132e(), c9447i.m15609a(request, type));
    }

    @Override // p236r8.InterfaceC9442d
    /* renamed from: h */
    public void mo15587h() throws IOException {
        this.f16771d.flush();
    }

    /* renamed from: r */
    public final void m15774r(ForwardingTimeout forwardingTimeout) {
        Timeout delegate = forwardingTimeout.getDelegate();
        forwardingTimeout.setDelegate(Timeout.NONE);
        delegate.clearDeadline();
        delegate.clearTimeout();
    }

    /* renamed from: s */
    public final boolean m15775s(C8924w c8924w) {
        return StringsKt.equals("chunked", c8924w.m14131d("Transfer-Encoding"), true);
    }

    /* renamed from: t */
    public final boolean m15776t(C8926y c8926y) {
        return StringsKt.equals("chunked", C8926y.m14169n(c8926y, "Transfer-Encoding", null, 2, null), true);
    }

    /* renamed from: u */
    public final Sink m15777u() {
        if (this.f16772e == 1) {
            this.f16772e = 2;
            return new b();
        }
        throw new IllegalStateException(("state: " + this.f16772e).toString());
    }

    /* renamed from: v */
    public final Source m15778v(C8919r c8919r) {
        if (this.f16772e == 4) {
            this.f16772e = 5;
            return new c(this, c8919r);
        }
        throw new IllegalStateException(("state: " + this.f16772e).toString());
    }

    /* renamed from: w */
    public final Source m15779w(long j9) {
        if (this.f16772e == 4) {
            this.f16772e = 5;
            return new e(j9);
        }
        throw new IllegalStateException(("state: " + this.f16772e).toString());
    }

    /* renamed from: x */
    public final Sink m15780x() {
        if (this.f16772e == 1) {
            this.f16772e = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f16772e).toString());
    }

    /* renamed from: y */
    public final Source m15781y() {
        if (this.f16772e == 4) {
            this.f16772e = 5;
            mo15581b().m14888y();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.f16772e).toString());
    }

    /* renamed from: z */
    public final void m15782z(C8926y response) {
        Intrinsics.checkNotNullParameter(response, "response");
        long jM14506v = AbstractC9045d.m14506v(response);
        if (jM14506v == -1) {
            return;
        }
        Source sourceM15779w = m15779w(jM14506v);
        AbstractC9045d.m14470L(sourceM15779w, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        sourceM15779w.close();
    }
}
