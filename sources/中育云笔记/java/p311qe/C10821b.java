package p311qe;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import je.C9737q;
import je.C9738r;
import je.C9742v;
import je.C9743w;
import je.C9745y;
import je.InterfaceC9731k;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okhttp3.internal.connection.RealConnection;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10819z;
import pe.AbstractC10678e;
import pe.C10682i;
import pe.C10684k;
import pe.InterfaceC10677d;

/* renamed from: qe.b */
/* loaded from: classes6.dex */
public final class C10821b implements InterfaceC10677d {

    /* renamed from: h */
    public static final d f26086h = new d(null);

    /* renamed from: a */
    public final C9742v f26087a;

    /* renamed from: b */
    public final RealConnection f26088b;

    /* renamed from: c */
    public final BufferedSource f26089c;

    /* renamed from: d */
    public final BufferedSink f26090d;

    /* renamed from: e */
    public int f26091e;

    /* renamed from: f */
    public final C10820a f26092f;

    /* renamed from: g */
    public C9737q f26093g;

    /* renamed from: qe.b$a */
    public abstract class a implements Source {

        /* renamed from: c */
        public final ForwardingTimeout f26094c;

        /* renamed from: d */
        public boolean f26095d;

        public a() {
            this.f26094c = new ForwardingTimeout(C10821b.this.f26089c.timeout());
        }

        /* renamed from: e */
        public final boolean m23270e() {
            return this.f26095d;
        }

        /* renamed from: f */
        public final void m23271f() {
            if (C10821b.this.f26091e == 6) {
                return;
            }
            if (C10821b.this.f26091e == 5) {
                C10821b.this.m23260q(this.f26094c);
                C10821b.this.f26091e = 6;
            } else {
                throw new IllegalStateException("state: " + C10821b.this.f26091e);
            }
        }

        /* renamed from: g */
        public final void m23272g(boolean z10) {
            this.f26095d = z10;
        }

        @Override // okio.Source
        public long read(Buffer sink, long j10) throws IOException {
            AbstractC9979u.m20294g(sink, "sink");
            try {
                return C10821b.this.f26089c.read(sink, j10);
            } catch (IOException e10) {
                C10821b.this.getConnection().m22015z();
                m23271f();
                throw e10;
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.f26094c;
        }
    }

    /* renamed from: qe.b$b */
    public final class b implements Sink {

        /* renamed from: c */
        public final ForwardingTimeout f26097c;

        /* renamed from: d */
        public boolean f26098d;

        public b() {
            this.f26097c = new ForwardingTimeout(C10821b.this.f26090d.timeout());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f26098d) {
                return;
            }
            this.f26098d = true;
            C10821b.this.f26090d.writeUtf8("0\r\n\r\n");
            C10821b.this.m23260q(this.f26097c);
            C10821b.this.f26091e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public synchronized void flush() {
            if (this.f26098d) {
                return;
            }
            C10821b.this.f26090d.flush();
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return this.f26097c;
        }

        @Override // okio.Sink
        public void write(Buffer source, long j10) {
            AbstractC9979u.m20294g(source, "source");
            if (this.f26098d) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            C10821b.this.f26090d.writeHexadecimalUnsignedLong(j10);
            C10821b.this.f26090d.writeUtf8("\r\n");
            C10821b.this.f26090d.write(source, j10);
            C10821b.this.f26090d.writeUtf8("\r\n");
        }
    }

    /* renamed from: qe.b$c */
    public final class c extends a {

        /* renamed from: f */
        public final C9738r f26100f;

        /* renamed from: g */
        public long f26101g;

        /* renamed from: h */
        public boolean f26102h;

        /* renamed from: i */
        public final /* synthetic */ C10821b f26103i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C10821b c10821b, C9738r url) {
            super();
            AbstractC9979u.m20294g(url, "url");
            this.f26103i = c10821b;
            this.f26100f = url;
            this.f26101g = -1L;
            this.f26102h = true;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m23270e()) {
                return;
            }
            if (this.f26102h && !AbstractC9920d.m20037s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f26103i.getConnection().m22015z();
                m23271f();
            }
            m23272g(true);
        }

        /* renamed from: i */
        public final void m23273i() throws ProtocolException {
            if (this.f26101g != -1) {
                this.f26103i.f26089c.readUtf8LineStrict();
            }
            try {
                this.f26101g = this.f26103i.f26089c.readHexadecimalUnsignedLong();
                String string = AbstractC10793c0.m23129e1(this.f26103i.f26089c.readUtf8LineStrict()).toString();
                if (this.f26101g < 0 || (string.length() > 0 && !AbstractC10819z.m23242O(string, ";", false, 2, null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f26101g + string + '\"');
                }
                if (this.f26101g == 0) {
                    this.f26102h = false;
                    C10821b c10821b = this.f26103i;
                    c10821b.f26093g = c10821b.f26092f.m23249a();
                    C9742v c9742v = this.f26103i.f26087a;
                    AbstractC9979u.m20291d(c9742v);
                    InterfaceC9731k interfaceC9731kM19525o = c9742v.m19525o();
                    C9738r c9738r = this.f26100f;
                    C9737q c9737q = this.f26103i.f26093g;
                    AbstractC9979u.m20291d(c9737q);
                    AbstractC10678e.m22619g(interfaceC9731kM19525o, c9738r, c9737q);
                    m23271f();
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // p311qe.C10821b.a, okio.Source
        public long read(Buffer sink, long j10) throws IOException {
            AbstractC9979u.m20294g(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (m23270e()) {
                throw new IllegalStateException("closed");
            }
            if (!this.f26102h) {
                return -1L;
            }
            long j11 = this.f26101g;
            if (j11 == 0 || j11 == -1) {
                m23273i();
                if (!this.f26102h) {
                    return -1L;
                }
            }
            long j12 = super.read(sink, Math.min(j10, this.f26101g));
            if (j12 != -1) {
                this.f26101g -= j12;
                return j12;
            }
            this.f26103i.getConnection().m22015z();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m23271f();
            throw protocolException;
        }
    }

    /* renamed from: qe.b$d */
    public static final class d {
        public /* synthetic */ d(AbstractC9972n abstractC9972n) {
            this();
        }

        public d() {
        }
    }

    /* renamed from: qe.b$e */
    public final class e extends a {

        /* renamed from: f */
        public long f26104f;

        public e(long j10) {
            super();
            this.f26104f = j10;
            if (j10 == 0) {
                m23271f();
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m23270e()) {
                return;
            }
            if (this.f26104f != 0 && !AbstractC9920d.m20037s(this, 100, TimeUnit.MILLISECONDS)) {
                C10821b.this.getConnection().m22015z();
                m23271f();
            }
            m23272g(true);
        }

        @Override // p311qe.C10821b.a, okio.Source
        public long read(Buffer sink, long j10) throws IOException {
            AbstractC9979u.m20294g(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (m23270e()) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f26104f;
            if (j11 == 0) {
                return -1L;
            }
            long j12 = super.read(sink, Math.min(j11, j10));
            if (j12 == -1) {
                C10821b.this.getConnection().m22015z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m23271f();
                throw protocolException;
            }
            long j13 = this.f26104f - j12;
            this.f26104f = j13;
            if (j13 == 0) {
                m23271f();
            }
            return j12;
        }
    }

    /* renamed from: qe.b$f */
    public final class f implements Sink {

        /* renamed from: c */
        public final ForwardingTimeout f26106c;

        /* renamed from: d */
        public boolean f26107d;

        public f() {
            this.f26106c = new ForwardingTimeout(C10821b.this.f26090d.timeout());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f26107d) {
                return;
            }
            this.f26107d = true;
            C10821b.this.m23260q(this.f26106c);
            C10821b.this.f26091e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
            if (this.f26107d) {
                return;
            }
            C10821b.this.f26090d.flush();
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return this.f26106c;
        }

        @Override // okio.Sink
        public void write(Buffer source, long j10) {
            AbstractC9979u.m20294g(source, "source");
            if (this.f26107d) {
                throw new IllegalStateException("closed");
            }
            AbstractC9920d.m20030l(source.size(), 0L, j10);
            C10821b.this.f26090d.write(source, j10);
        }
    }

    /* renamed from: qe.b$g */
    public final class g extends a {

        /* renamed from: f */
        public boolean f26109f;

        public g() {
            super();
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m23270e()) {
                return;
            }
            if (!this.f26109f) {
                m23271f();
            }
            m23272g(true);
        }

        @Override // p311qe.C10821b.a, okio.Source
        public long read(Buffer sink, long j10) throws IOException {
            AbstractC9979u.m20294g(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (m23270e()) {
                throw new IllegalStateException("closed");
            }
            if (this.f26109f) {
                return -1L;
            }
            long j11 = super.read(sink, j10);
            if (j11 != -1) {
                return j11;
            }
            this.f26109f = true;
            m23271f();
            return -1L;
        }
    }

    public C10821b(C9742v c9742v, RealConnection connection, BufferedSource source, BufferedSink sink) {
        AbstractC9979u.m20294g(connection, "connection");
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(sink, "sink");
        this.f26087a = c9742v;
        this.f26088b = connection;
        this.f26089c = source;
        this.f26090d = sink;
        this.f26092f = new C10820a(source);
    }

    @Override // pe.InterfaceC10677d
    /* renamed from: a */
    public void mo22606a() {
        this.f26090d.flush();
    }

    @Override // pe.InterfaceC10677d
    /* renamed from: b */
    public Sink mo22607b(C9743w request, long j10) throws ProtocolException {
        AbstractC9979u.m20294g(request, "request");
        if (request.m19583a() != null && request.m19583a().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (m23261r(request)) {
            return m23263t();
        }
        if (j10 != -1) {
            return m23266w();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // pe.InterfaceC10677d
    /* renamed from: c */
    public void mo22608c(C9743w request) {
        AbstractC9979u.m20294g(request, "request");
        C10682i c10682i = C10682i.f25746a;
        Proxy.Type type = getConnection().m21984A().m19298b().type();
        AbstractC9979u.m20293f(type, "connection.route().proxy.type()");
        m23269z(request.m19587e(), c10682i.m22635a(request, type));
    }

    @Override // pe.InterfaceC10677d
    public void cancel() {
        getConnection().m21994e();
    }

    @Override // pe.InterfaceC10677d
    /* renamed from: d */
    public long mo22609d(C9745y response) {
        AbstractC9979u.m20294g(response, "response");
        if (!AbstractC10678e.m22615c(response)) {
            return 0L;
        }
        if (m23262s(response)) {
            return -1L;
        }
        return AbstractC9920d.m20040v(response);
    }

    @Override // pe.InterfaceC10677d
    /* renamed from: e */
    public Source mo22610e(C9745y response) {
        AbstractC9979u.m20294g(response, "response");
        if (!AbstractC10678e.m22615c(response)) {
            return m23265v(0L);
        }
        if (m23262s(response)) {
            return m23264u(response.m19645z().m19592j());
        }
        long jM20040v = AbstractC9920d.m20040v(response);
        return jM20040v != -1 ? m23265v(jM20040v) : m23267x();
    }

    @Override // pe.InterfaceC10677d
    /* renamed from: f */
    public C9745y.a mo22611f(boolean z10) {
        int i10 = this.f26091e;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.f26091e).toString());
        }
        try {
            C10684k c10684kM22644a = C10684k.f25749d.m22644a(this.f26092f.m23250b());
            C9745y.a aVarM19656k = new C9745y.a().m19661p(c10684kM22644a.f25750a).m19652g(c10684kM22644a.f25751b).m19658m(c10684kM22644a.f25752c).m19656k(this.f26092f.m23249a());
            if (z10 && c10684kM22644a.f25751b == 100) {
                return null;
            }
            int i11 = c10684kM22644a.f25751b;
            if (i11 == 100) {
                this.f26091e = 3;
                return aVarM19656k;
            }
            if (102 > i11 || i11 >= 200) {
                this.f26091e = 4;
                return aVarM19656k;
            }
            this.f26091e = 3;
            return aVarM19656k;
        } catch (EOFException e10) {
            throw new IOException("unexpected end of stream on " + getConnection().m21984A().m19297a().m19296l().m19426p(), e10);
        }
    }

    @Override // pe.InterfaceC10677d
    /* renamed from: g */
    public void mo22612g() {
        this.f26090d.flush();
    }

    @Override // pe.InterfaceC10677d
    public RealConnection getConnection() {
        return this.f26088b;
    }

    /* renamed from: q */
    public final void m23260q(ForwardingTimeout forwardingTimeout) {
        Timeout timeoutDelegate = forwardingTimeout.delegate();
        forwardingTimeout.setDelegate(Timeout.NONE);
        timeoutDelegate.clearDeadline();
        timeoutDelegate.clearTimeout();
    }

    /* renamed from: r */
    public final boolean m23261r(C9743w c9743w) {
        return AbstractC10819z.m23230C("chunked", c9743w.m19586d("Transfer-Encoding"), true);
    }

    /* renamed from: s */
    public final boolean m23262s(C9745y c9745y) {
        return AbstractC10819z.m23230C("chunked", C9745y.m19626p(c9745y, "Transfer-Encoding", null, 2, null), true);
    }

    /* renamed from: t */
    public final Sink m23263t() {
        if (this.f26091e == 1) {
            this.f26091e = 2;
            return new b();
        }
        throw new IllegalStateException(("state: " + this.f26091e).toString());
    }

    /* renamed from: u */
    public final Source m23264u(C9738r c9738r) {
        if (this.f26091e == 4) {
            this.f26091e = 5;
            return new c(this, c9738r);
        }
        throw new IllegalStateException(("state: " + this.f26091e).toString());
    }

    /* renamed from: v */
    public final Source m23265v(long j10) {
        if (this.f26091e == 4) {
            this.f26091e = 5;
            return new e(j10);
        }
        throw new IllegalStateException(("state: " + this.f26091e).toString());
    }

    /* renamed from: w */
    public final Sink m23266w() {
        if (this.f26091e == 1) {
            this.f26091e = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f26091e).toString());
    }

    /* renamed from: x */
    public final Source m23267x() {
        if (this.f26091e == 4) {
            this.f26091e = 5;
            getConnection().m22015z();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.f26091e).toString());
    }

    /* renamed from: y */
    public final void m23268y(C9745y response) {
        AbstractC9979u.m20294g(response, "response");
        long jM20040v = AbstractC9920d.m20040v(response);
        if (jM20040v == -1) {
            return;
        }
        Source sourceM23265v = m23265v(jM20040v);
        AbstractC9920d.m20004L(sourceM23265v, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        sourceM23265v.close();
    }

    /* renamed from: z */
    public final void m23269z(C9737q headers, String requestLine) {
        AbstractC9979u.m20294g(headers, "headers");
        AbstractC9979u.m20294g(requestLine, "requestLine");
        if (this.f26091e != 0) {
            throw new IllegalStateException(("state: " + this.f26091e).toString());
        }
        this.f26090d.writeUtf8(requestLine).writeUtf8("\r\n");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f26090d.writeUtf8(headers.m19390b(i10)).writeUtf8(": ").writeUtf8(headers.m19393f(i10)).writeUtf8("\r\n");
        }
        this.f26090d.writeUtf8("\r\n");
        this.f26091e = 1;
    }
}
