package p214p9;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8687z;
import p136i9.AbstractC8901c0;
import p136i9.C8897a0;
import p136i9.C8899b0;
import p136i9.C8903d0;
import p136i9.C8924v;
import p136i9.C8925w;
import p136i9.InterfaceC8916n;
import p147j9.AbstractC9038h;
import p147j9.AbstractC9041k;
import p203o9.AbstractC9550e;
import p203o9.C9554i;
import p203o9.C9556k;
import p203o9.InterfaceC9549d;

/* renamed from: p9.b */
/* loaded from: classes5.dex */
public final class C9775b implements InterfaceC9549d {

    /* renamed from: h */
    public static final d f19512h = new d(null);

    /* renamed from: i */
    public static final C8924v f19513i = C8924v.f16793b.m15276a("OkHttp-Response-Body", "Truncated");

    /* renamed from: a */
    public final C8897a0 f19514a;

    /* renamed from: b */
    public final InterfaceC9549d.a f19515b;

    /* renamed from: c */
    public final BufferedSource f19516c;

    /* renamed from: d */
    public final BufferedSink f19517d;

    /* renamed from: e */
    public int f19518e;

    /* renamed from: f */
    public final C9774a f19519f;

    /* renamed from: g */
    public C8924v f19520g;

    /* renamed from: p9.b$a */
    public abstract class a implements Source {

        /* renamed from: a */
        public final C8925w f19521a;

        /* renamed from: b */
        public final ForwardingTimeout f19522b;

        /* renamed from: c */
        public boolean f19523c;

        /* renamed from: d */
        public final /* synthetic */ C9775b f19524d;

        public a(C9775b c9775b, C8925w url) {
            AbstractC9133u.m16133g(url, "url");
            this.f19524d = c9775b;
            this.f19521a = url;
            this.f19522b = new ForwardingTimeout(c9775b.f19516c.timeout());
        }

        /* renamed from: a */
        public final boolean m18323a() {
            return this.f19523c;
        }

        /* renamed from: b */
        public final void m18324b(C8924v trailers) {
            C8897a0 c8897a0;
            InterfaceC8916n interfaceC8916nM14978n;
            AbstractC9133u.m16133g(trailers, "trailers");
            if (this.f19524d.f19518e == 6) {
                return;
            }
            if (this.f19524d.f19518e != 5) {
                throw new IllegalStateException("state: " + this.f19524d.f19518e);
            }
            this.f19524d.m18315s(this.f19522b);
            this.f19524d.f19520g = trailers;
            this.f19524d.f19518e = 6;
            if (trailers.size() <= 0 || (c8897a0 = this.f19524d.f19514a) == null || (interfaceC8916nM14978n = c8897a0.m14978n()) == null) {
                return;
            }
            AbstractC9550e.m17841f(interfaceC8916nM14978n, this.f19521a, trailers);
        }

        /* renamed from: c */
        public final void m18325c(boolean z10) {
            this.f19523c = z10;
        }

        @Override // okio.Source
        public long read(Buffer sink, long j10) throws IOException {
            AbstractC9133u.m16133g(sink, "sink");
            try {
                return this.f19524d.f19516c.read(sink, j10);
            } catch (IOException e10) {
                this.f19524d.mo17834h().mo17444b();
                m18324b(C9775b.f19513i);
                throw e10;
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.f19522b;
        }
    }

    /* renamed from: p9.b$b */
    public final class b implements Sink {

        /* renamed from: a */
        public final ForwardingTimeout f19525a;

        /* renamed from: b */
        public boolean f19526b;

        public b() {
            this.f19525a = new ForwardingTimeout(C9775b.this.f19517d.timeout());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f19526b) {
                return;
            }
            this.f19526b = true;
            C9775b.this.f19517d.writeUtf8("0\r\n\r\n");
            C9775b.this.m18315s(this.f19525a);
            C9775b.this.f19518e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public synchronized void flush() {
            if (this.f19526b) {
                return;
            }
            C9775b.this.f19517d.flush();
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return this.f19525a;
        }

        @Override // okio.Sink
        public void write(Buffer source, long j10) {
            AbstractC9133u.m16133g(source, "source");
            if (this.f19526b) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            C9775b.this.f19517d.writeHexadecimalUnsignedLong(j10);
            C9775b.this.f19517d.writeUtf8("\r\n");
            C9775b.this.f19517d.write(source, j10);
            C9775b.this.f19517d.writeUtf8("\r\n");
        }
    }

    /* renamed from: p9.b$c */
    public final class c extends a {

        /* renamed from: e */
        public long f19528e;

        /* renamed from: f */
        public boolean f19529f;

        /* renamed from: g */
        public final /* synthetic */ C9775b f19530g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C9775b c9775b, C8925w url) {
            super(c9775b, url);
            AbstractC9133u.m16133g(url, "url");
            this.f19530g = c9775b;
            this.f19528e = -1L;
            this.f19529f = true;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m18323a()) {
                return;
            }
            if (this.f19529f && !AbstractC9041k.m15779i(this, 100, TimeUnit.MILLISECONDS)) {
                this.f19530g.mo17834h().mo17444b();
                m18324b(C9775b.f19513i);
            }
            m18325c(true);
        }

        /* renamed from: d */
        public final void m18326d() throws ProtocolException {
            if (this.f19528e != -1) {
                this.f19530g.f19516c.readUtf8LineStrict();
            }
            try {
                this.f19528e = this.f19530g.f19516c.readHexadecimalUnsignedLong();
                String string = AbstractC8661c0.m13982W0(this.f19530g.f19516c.readUtf8LineStrict()).toString();
                if (this.f19528e >= 0 && (string.length() <= 0 || AbstractC8687z.m14105M(string, ";", false, 2, null))) {
                    if (this.f19528e == 0) {
                        this.f19529f = false;
                        m18324b(this.f19530g.f19519f.m18302a());
                        return;
                    }
                    return;
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f19528e + string + '\"');
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // p214p9.C9775b.a, okio.Source
        public long read(Buffer sink, long j10) throws IOException {
            AbstractC9133u.m16133g(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (m18323a()) {
                throw new IllegalStateException("closed");
            }
            if (!this.f19529f) {
                return -1L;
            }
            long j11 = this.f19528e;
            if (j11 == 0 || j11 == -1) {
                m18326d();
                if (!this.f19529f) {
                    return -1L;
                }
            }
            long j12 = super.read(sink, Math.min(j10, this.f19528e));
            if (j12 != -1) {
                this.f19528e -= j12;
                return j12;
            }
            this.f19530g.mo17834h().mo17444b();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m18324b(C9775b.f19513i);
            throw protocolException;
        }
    }

    /* renamed from: p9.b$d */
    public static final class d {
        public /* synthetic */ d(AbstractC9126n abstractC9126n) {
            this();
        }

        public d() {
        }
    }

    /* renamed from: p9.b$e */
    public final class e extends a {

        /* renamed from: e */
        public long f19531e;

        /* renamed from: f */
        public final /* synthetic */ C9775b f19532f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C9775b c9775b, C8925w url, long j10) {
            super(c9775b, url);
            AbstractC9133u.m16133g(url, "url");
            this.f19532f = c9775b;
            this.f19531e = j10;
            if (j10 == 0) {
                m18324b(C8924v.f16794c);
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m18323a()) {
                return;
            }
            if (this.f19531e != 0 && !AbstractC9041k.m15779i(this, 100, TimeUnit.MILLISECONDS)) {
                this.f19532f.mo17834h().mo17444b();
                m18324b(C9775b.f19513i);
            }
            m18325c(true);
        }

        @Override // p214p9.C9775b.a, okio.Source
        public long read(Buffer sink, long j10) throws IOException {
            AbstractC9133u.m16133g(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (m18323a()) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f19531e;
            if (j11 == 0) {
                return -1L;
            }
            long j12 = super.read(sink, Math.min(j11, j10));
            if (j12 == -1) {
                this.f19532f.mo17834h().mo17444b();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m18324b(C9775b.f19513i);
                throw protocolException;
            }
            long j13 = this.f19531e - j12;
            this.f19531e = j13;
            if (j13 == 0) {
                m18324b(C8924v.f16794c);
            }
            return j12;
        }
    }

    /* renamed from: p9.b$f */
    public final class f implements Sink {

        /* renamed from: a */
        public final ForwardingTimeout f19533a;

        /* renamed from: b */
        public boolean f19534b;

        public f() {
            this.f19533a = new ForwardingTimeout(C9775b.this.f19517d.timeout());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f19534b) {
                return;
            }
            this.f19534b = true;
            C9775b.this.m18315s(this.f19533a);
            C9775b.this.f19518e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
            if (this.f19534b) {
                return;
            }
            C9775b.this.f19517d.flush();
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return this.f19533a;
        }

        @Override // okio.Sink
        public void write(Buffer source, long j10) {
            AbstractC9133u.m16133g(source, "source");
            if (this.f19534b) {
                throw new IllegalStateException("closed");
            }
            AbstractC9038h.m15749e(source.size(), 0L, j10);
            C9775b.this.f19517d.write(source, j10);
        }
    }

    /* renamed from: p9.b$g */
    public final class g extends a {

        /* renamed from: e */
        public boolean f19536e;

        /* renamed from: f */
        public final /* synthetic */ C9775b f19537f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C9775b c9775b, C8925w url) {
            super(c9775b, url);
            AbstractC9133u.m16133g(url, "url");
            this.f19537f = c9775b;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m18323a()) {
                return;
            }
            if (!this.f19536e) {
                m18324b(C9775b.f19513i);
            }
            m18325c(true);
        }

        @Override // p214p9.C9775b.a, okio.Source
        public long read(Buffer sink, long j10) throws IOException {
            AbstractC9133u.m16133g(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (m18323a()) {
                throw new IllegalStateException("closed");
            }
            if (this.f19536e) {
                return -1L;
            }
            long j11 = super.read(sink, j10);
            if (j11 != -1) {
                return j11;
            }
            this.f19536e = true;
            m18324b(C8924v.f16794c);
            return -1L;
        }
    }

    public C9775b(C8897a0 c8897a0, InterfaceC9549d.a carrier, BufferedSource source, BufferedSink sink) {
        AbstractC9133u.m16133g(carrier, "carrier");
        AbstractC9133u.m16133g(source, "source");
        AbstractC9133u.m16133g(sink, "sink");
        this.f19514a = c8897a0;
        this.f19515b = carrier;
        this.f19516c = source;
        this.f19517d = sink;
        this.f19519f = new C9774a(source);
    }

    /* renamed from: A */
    public final void m18313A(C8903d0 response) {
        AbstractC9133u.m16133g(response, "response");
        long jM15781k = AbstractC9041k.m15781k(response);
        if (jM15781k == -1) {
            return;
        }
        Source sourceM18320x = m18320x(response.m15141t().m15052l(), jM15781k);
        AbstractC9041k.m15785o(sourceM18320x, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        sourceM18320x.close();
    }

    /* renamed from: B */
    public final void m18314B(C8924v headers, String requestLine) {
        AbstractC9133u.m16133g(headers, "headers");
        AbstractC9133u.m16133g(requestLine, "requestLine");
        if (this.f19518e != 0) {
            throw new IllegalStateException(("state: " + this.f19518e).toString());
        }
        this.f19517d.writeUtf8(requestLine).writeUtf8("\r\n");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f19517d.writeUtf8(headers.m15262c(i10)).writeUtf8(": ").writeUtf8(headers.m15265g(i10)).writeUtf8("\r\n");
        }
        this.f19517d.writeUtf8("\r\n");
        this.f19518e = 1;
    }

    @Override // p203o9.InterfaceC9549d
    /* renamed from: a */
    public void mo17827a() {
        this.f19517d.flush();
    }

    @Override // p203o9.InterfaceC9549d
    /* renamed from: b */
    public Sink mo17828b(C8899b0 request, long j10) throws ProtocolException {
        AbstractC9133u.m16133g(request, "request");
        AbstractC8901c0 abstractC8901c0M15041a = request.m15041a();
        if (abstractC8901c0M15041a != null && abstractC8901c0M15041a.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (m18316t(request)) {
            return m18318v();
        }
        if (j10 != -1) {
            return m18321y();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // p203o9.InterfaceC9549d
    /* renamed from: c */
    public Source mo17829c(C8903d0 response) {
        AbstractC9133u.m16133g(response, "response");
        if (!AbstractC9550e.m17837b(response)) {
            return m18320x(response.m15141t().m15052l(), 0L);
        }
        if (m18317u(response)) {
            return m18319w(response.m15141t().m15052l());
        }
        long jM15781k = AbstractC9041k.m15781k(response);
        return jM15781k != -1 ? m18320x(response.m15141t().m15052l(), jM15781k) : m18322z(response.m15141t().m15052l());
    }

    @Override // p203o9.InterfaceC9549d
    public void cancel() {
        mo17834h().cancel();
    }

    @Override // p203o9.InterfaceC9549d
    /* renamed from: d */
    public boolean mo17830d() {
        return this.f19518e == 6;
    }

    @Override // p203o9.InterfaceC9549d
    /* renamed from: e */
    public C8903d0.a mo17831e(boolean z10) throws IOException {
        int i10 = this.f19518e;
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.f19518e).toString());
        }
        try {
            C9556k c9556kM17866a = C9556k.f18933d.m17866a(this.f19519f.m18303b());
            C8903d0.a aVarM15152j = new C8903d0.a().m15157o(c9556kM17866a.f18934a).m15148f(c9556kM17866a.f18935b).m15154l(c9556kM17866a.f18936c).m15152j(this.f19519f.m18302a());
            if (z10 && c9556kM17866a.f18935b == 100) {
                return null;
            }
            int i11 = c9556kM17866a.f18935b;
            if (i11 == 100) {
                this.f19518e = 3;
                return aVarM15152j;
            }
            if (102 > i11 || i11 >= 200) {
                this.f19518e = 4;
                return aVarM15152j;
            }
            this.f19518e = 3;
            return aVarM15152j;
        } catch (EOFException e10) {
            throw new IOException("unexpected end of stream on " + mo17834h().mo17446d().m15174a().m14950l().m15291o(), e10);
        }
    }

    @Override // p203o9.InterfaceC9549d
    /* renamed from: f */
    public void mo17832f(C8899b0 request) {
        AbstractC9133u.m16133g(request, "request");
        C9554i c9554i = C9554i.f18930a;
        Proxy.Type type = mo17834h().mo17446d().m15175b().type();
        AbstractC9133u.m16132f(type, "type(...)");
        m18314B(request.m15046f(), c9554i.m17857a(request, type));
    }

    @Override // p203o9.InterfaceC9549d
    /* renamed from: g */
    public void mo17833g() {
        this.f19517d.flush();
    }

    @Override // p203o9.InterfaceC9549d
    /* renamed from: h */
    public InterfaceC9549d.a mo17834h() {
        return this.f19515b;
    }

    @Override // p203o9.InterfaceC9549d
    /* renamed from: i */
    public long mo17835i(C8903d0 response) {
        AbstractC9133u.m16133g(response, "response");
        if (!AbstractC9550e.m17837b(response)) {
            return 0L;
        }
        if (m18317u(response)) {
            return -1L;
        }
        return AbstractC9041k.m15781k(response);
    }

    /* renamed from: s */
    public final void m18315s(ForwardingTimeout forwardingTimeout) {
        Timeout timeoutDelegate = forwardingTimeout.delegate();
        forwardingTimeout.setDelegate(Timeout.NONE);
        timeoutDelegate.clearDeadline();
        timeoutDelegate.clearTimeout();
    }

    /* renamed from: t */
    public final boolean m18316t(C8899b0 c8899b0) {
        return AbstractC8687z.m14093A("chunked", c8899b0.m15045e("Transfer-Encoding"), true);
    }

    /* renamed from: u */
    public final boolean m18317u(C8903d0 c8903d0) {
        return AbstractC8687z.m14093A("chunked", C8903d0.m15123k(c8903d0, "Transfer-Encoding", null, 2, null), true);
    }

    /* renamed from: v */
    public final Sink m18318v() {
        if (this.f19518e == 1) {
            this.f19518e = 2;
            return new b();
        }
        throw new IllegalStateException(("state: " + this.f19518e).toString());
    }

    /* renamed from: w */
    public final Source m18319w(C8925w c8925w) {
        if (this.f19518e == 4) {
            this.f19518e = 5;
            return new c(this, c8925w);
        }
        throw new IllegalStateException(("state: " + this.f19518e).toString());
    }

    /* renamed from: x */
    public final Source m18320x(C8925w c8925w, long j10) {
        if (this.f19518e == 4) {
            this.f19518e = 5;
            return new e(this, c8925w, j10);
        }
        throw new IllegalStateException(("state: " + this.f19518e).toString());
    }

    /* renamed from: y */
    public final Sink m18321y() {
        if (this.f19518e == 1) {
            this.f19518e = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f19518e).toString());
    }

    /* renamed from: z */
    public final Source m18322z(C8925w c8925w) {
        if (this.f19518e == 4) {
            this.f19518e = 5;
            mo17834h().mo17444b();
            return new g(this, c8925w);
        }
        throw new IllegalStateException(("state: " + this.f19518e).toString());
    }
}
