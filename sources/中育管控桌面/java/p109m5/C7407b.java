package p109m5;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p058f5.AbstractC6360c0;
import p058f5.C6356a0;
import p058f5.C6358b0;
import p058f5.C6362d0;
import p058f5.C6383v;
import p058f5.C6384w;
import p058f5.InterfaceC6375n;
import p065g5.AbstractC6424h;
import p065g5.AbstractC6427k;
import p102l5.AbstractC7351e;
import p102l5.C7355i;
import p102l5.C7357k;
import p102l5.InterfaceC7350d;

/* renamed from: m5.b */
/* loaded from: classes4.dex */
public final class C7407b implements InterfaceC7350d {

    /* renamed from: h */
    public static final d f9444h = new d(null);

    /* renamed from: i */
    public static final C6383v f9445i = C6383v.f7961b.m6815a("OkHttp-Response-Body", "Truncated");

    /* renamed from: a */
    public final C6356a0 f9446a;

    /* renamed from: b */
    public final InterfaceC7350d.a f9447b;

    /* renamed from: c */
    public final BufferedSource f9448c;

    /* renamed from: d */
    public final BufferedSink f9449d;

    /* renamed from: e */
    public int f9450e;

    /* renamed from: f */
    public final C7406a f9451f;

    /* renamed from: g */
    public C6383v f9452g;

    /* renamed from: m5.b$a */
    public abstract class a implements Source {

        /* renamed from: a */
        public final C6384w f9453a;

        /* renamed from: b */
        public final ForwardingTimeout f9454b;

        /* renamed from: c */
        public boolean f9455c;

        /* renamed from: d */
        public final /* synthetic */ C7407b f9456d;

        public a(C7407b c7407b, C6384w url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f9456d = c7407b;
            this.f9453a = url;
            this.f9454b = new ForwardingTimeout(c7407b.f9448c.getTimeout());
        }

        /* renamed from: a */
        public final boolean m8438a() {
            return this.f9455c;
        }

        /* renamed from: c */
        public final void m8439c(C6383v trailers) {
            C6356a0 c6356a0;
            InterfaceC6375n interfaceC6375nM6514n;
            Intrinsics.checkNotNullParameter(trailers, "trailers");
            if (this.f9456d.f9450e == 6) {
                return;
            }
            if (this.f9456d.f9450e != 5) {
                throw new IllegalStateException("state: " + this.f9456d.f9450e);
            }
            this.f9456d.m8430s(this.f9454b);
            this.f9456d.f9452g = trailers;
            this.f9456d.f9450e = 6;
            if (trailers.size() <= 0 || (c6356a0 = this.f9456d.f9446a) == null || (interfaceC6375nM6514n = c6356a0.m6514n()) == null) {
                return;
            }
            AbstractC7351e.m8336f(interfaceC6375nM6514n, this.f9453a, trailers);
        }

        /* renamed from: g */
        public final void m8440g(boolean z6) {
            this.f9455c = z6;
        }

        @Override // okio.Source
        public long read(Buffer sink, long j6) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return this.f9456d.f9448c.read(sink, j6);
            } catch (IOException e6) {
                this.f9456d.mo8330i().mo7711b();
                m8439c(C7407b.f9445i);
                throw e6;
            }
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return this.f9454b;
        }
    }

    /* renamed from: m5.b$b */
    public final class b implements Sink {

        /* renamed from: a */
        public final ForwardingTimeout f9457a;

        /* renamed from: b */
        public boolean f9458b;

        public b() {
            this.f9457a = new ForwardingTimeout(C7407b.this.f9449d.getTimeout());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f9458b) {
                return;
            }
            this.f9458b = true;
            C7407b.this.f9449d.writeUtf8("0\r\n\r\n");
            C7407b.this.m8430s(this.f9457a);
            C7407b.this.f9450e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public synchronized void flush() {
            if (this.f9458b) {
                return;
            }
            C7407b.this.f9449d.flush();
        }

        @Override // okio.Sink
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return this.f9457a;
        }

        @Override // okio.Sink
        public void write(Buffer source, long j6) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f9458b) {
                throw new IllegalStateException("closed");
            }
            if (j6 == 0) {
                return;
            }
            C7407b.this.f9449d.writeHexadecimalUnsignedLong(j6);
            C7407b.this.f9449d.writeUtf8("\r\n");
            C7407b.this.f9449d.write(source, j6);
            C7407b.this.f9449d.writeUtf8("\r\n");
        }
    }

    /* renamed from: m5.b$c */
    public final class c extends a {

        /* renamed from: e */
        public long f9460e;

        /* renamed from: f */
        public boolean f9461f;

        /* renamed from: g */
        public final /* synthetic */ C7407b f9462g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C7407b c7407b, C6384w url) {
            super(c7407b, url);
            Intrinsics.checkNotNullParameter(url, "url");
            this.f9462g = c7407b;
            this.f9460e = -1L;
            this.f9461f = true;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m8438a()) {
                return;
            }
            if (this.f9461f && !AbstractC6427k.m7021i(this, 100, TimeUnit.MILLISECONDS)) {
                this.f9462g.mo8330i().mo7711b();
                m8439c(C7407b.f9445i);
            }
            m8440g(true);
        }

        /* renamed from: h */
        public final void m8441h() throws ProtocolException {
            if (this.f9460e != -1) {
                this.f9462g.f9448c.readUtf8LineStrict();
            }
            try {
                this.f9460e = this.f9462g.f9448c.readHexadecimalUnsignedLong();
                String string = StringsKt.trim((CharSequence) this.f9462g.f9448c.readUtf8LineStrict()).toString();
                if (this.f9460e >= 0 && (string.length() <= 0 || StringsKt.startsWith$default(string, ";", false, 2, (Object) null))) {
                    if (this.f9460e == 0) {
                        this.f9461f = false;
                        m8439c(this.f9462g.f9451f.m8417a());
                        return;
                    }
                    return;
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f9460e + string + Typography.quote);
            } catch (NumberFormatException e6) {
                throw new ProtocolException(e6.getMessage());
            }
        }

        @Override // p109m5.C7407b.a, okio.Source
        public long read(Buffer sink, long j6) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j6 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j6).toString());
            }
            if (m8438a()) {
                throw new IllegalStateException("closed");
            }
            if (!this.f9461f) {
                return -1L;
            }
            long j7 = this.f9460e;
            if (j7 == 0 || j7 == -1) {
                m8441h();
                if (!this.f9461f) {
                    return -1L;
                }
            }
            long j8 = super.read(sink, Math.min(j6, this.f9460e));
            if (j8 != -1) {
                this.f9460e -= j8;
                return j8;
            }
            this.f9462g.mo8330i().mo7711b();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m8439c(C7407b.f9445i);
            throw protocolException;
        }
    }

    /* renamed from: m5.b$d */
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public d() {
        }
    }

    /* renamed from: m5.b$e */
    public final class e extends a {

        /* renamed from: e */
        public long f9463e;

        /* renamed from: f */
        public final /* synthetic */ C7407b f9464f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C7407b c7407b, C6384w url, long j6) {
            super(c7407b, url);
            Intrinsics.checkNotNullParameter(url, "url");
            this.f9464f = c7407b;
            this.f9463e = j6;
            if (j6 == 0) {
                m8439c(C6383v.f7962c);
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m8438a()) {
                return;
            }
            if (this.f9463e != 0 && !AbstractC6427k.m7021i(this, 100, TimeUnit.MILLISECONDS)) {
                this.f9464f.mo8330i().mo7711b();
                m8439c(C7407b.f9445i);
            }
            m8440g(true);
        }

        @Override // p109m5.C7407b.a, okio.Source
        public long read(Buffer sink, long j6) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j6 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j6).toString());
            }
            if (m8438a()) {
                throw new IllegalStateException("closed");
            }
            long j7 = this.f9463e;
            if (j7 == 0) {
                return -1L;
            }
            long j8 = super.read(sink, Math.min(j7, j6));
            if (j8 == -1) {
                this.f9464f.mo8330i().mo7711b();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m8439c(C7407b.f9445i);
                throw protocolException;
            }
            long j9 = this.f9463e - j8;
            this.f9463e = j9;
            if (j9 == 0) {
                m8439c(C6383v.f7962c);
            }
            return j8;
        }
    }

    /* renamed from: m5.b$f */
    public final class f implements Sink {

        /* renamed from: a */
        public final ForwardingTimeout f9465a;

        /* renamed from: b */
        public boolean f9466b;

        public f() {
            this.f9465a = new ForwardingTimeout(C7407b.this.f9449d.getTimeout());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f9466b) {
                return;
            }
            this.f9466b = true;
            C7407b.this.m8430s(this.f9465a);
            C7407b.this.f9450e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
            if (this.f9466b) {
                return;
            }
            C7407b.this.f9449d.flush();
        }

        @Override // okio.Sink
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return this.f9465a;
        }

        @Override // okio.Sink
        public void write(Buffer source, long j6) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f9466b) {
                throw new IllegalStateException("closed");
            }
            AbstractC6424h.m6991e(source.size(), 0L, j6);
            C7407b.this.f9449d.write(source, j6);
        }
    }

    /* renamed from: m5.b$g */
    public final class g extends a {

        /* renamed from: e */
        public boolean f9468e;

        /* renamed from: f */
        public final /* synthetic */ C7407b f9469f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C7407b c7407b, C6384w url) {
            super(c7407b, url);
            Intrinsics.checkNotNullParameter(url, "url");
            this.f9469f = c7407b;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m8438a()) {
                return;
            }
            if (!this.f9468e) {
                m8439c(C7407b.f9445i);
            }
            m8440g(true);
        }

        @Override // p109m5.C7407b.a, okio.Source
        public long read(Buffer sink, long j6) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j6 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j6).toString());
            }
            if (m8438a()) {
                throw new IllegalStateException("closed");
            }
            if (this.f9468e) {
                return -1L;
            }
            long j7 = super.read(sink, j6);
            if (j7 != -1) {
                return j7;
            }
            this.f9468e = true;
            m8439c(C6383v.f7962c);
            return -1L;
        }
    }

    public C7407b(C6356a0 c6356a0, InterfaceC7350d.a carrier, BufferedSource source, BufferedSink sink) {
        Intrinsics.checkNotNullParameter(carrier, "carrier");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f9446a = c6356a0;
        this.f9447b = carrier;
        this.f9448c = source;
        this.f9449d = sink;
        this.f9451f = new C7406a(source);
    }

    /* renamed from: A */
    public final void m8428A(C6362d0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        long jM7023k = AbstractC6427k.m7023k(response);
        if (jM7023k == -1) {
            return;
        }
        Source sourceM8435x = m8435x(response.m6678x().m6588l(), jM7023k);
        AbstractC6427k.m7027o(sourceM8435x, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        sourceM8435x.close();
    }

    /* renamed from: B */
    public final void m8429B(C6383v headers, String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (this.f9450e != 0) {
            throw new IllegalStateException(("state: " + this.f9450e).toString());
        }
        this.f9449d.writeUtf8(requestLine).writeUtf8("\r\n");
        int size = headers.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f9449d.writeUtf8(headers.m6801c(i6)).writeUtf8(": ").writeUtf8(headers.m6804g(i6)).writeUtf8("\r\n");
        }
        this.f9449d.writeUtf8("\r\n");
        this.f9450e = 1;
    }

    @Override // p102l5.InterfaceC7350d
    /* renamed from: a */
    public void mo8322a() {
        this.f9449d.flush();
    }

    @Override // p102l5.InterfaceC7350d
    /* renamed from: b */
    public long mo8323b(C6362d0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!AbstractC7351e.m8332b(response)) {
            return 0L;
        }
        if (m8432u(response)) {
            return -1L;
        }
        return AbstractC6427k.m7023k(response);
    }

    @Override // p102l5.InterfaceC7350d
    /* renamed from: c */
    public Sink mo8324c(C6358b0 request, long j6) throws ProtocolException {
        Intrinsics.checkNotNullParameter(request, "request");
        AbstractC6360c0 abstractC6360c0M6577a = request.m6577a();
        if (abstractC6360c0M6577a != null && abstractC6360c0M6577a.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (m8431t(request)) {
            return m8433v();
        }
        if (j6 != -1) {
            return m8436y();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // p102l5.InterfaceC7350d
    public void cancel() {
        mo8330i().cancel();
    }

    @Override // p102l5.InterfaceC7350d
    /* renamed from: d */
    public boolean mo8325d() {
        return this.f9450e == 6;
    }

    @Override // p102l5.InterfaceC7350d
    /* renamed from: e */
    public void mo8326e(C6358b0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        C7355i c7355i = C7355i.f9343a;
        Proxy.Type type = mo8330i().mo7714e().m6714b().type();
        Intrinsics.checkNotNullExpressionValue(type, "type(...)");
        m8429B(request.m6582f(), c7355i.m8352a(request, type));
    }

    @Override // p102l5.InterfaceC7350d
    /* renamed from: f */
    public C6362d0.a mo8327f(boolean z6) throws IOException {
        int i6 = this.f9450e;
        if (i6 != 0 && i6 != 1 && i6 != 2 && i6 != 3) {
            throw new IllegalStateException(("state: " + this.f9450e).toString());
        }
        try {
            C7357k c7357kM8361a = C7357k.f9346d.m8361a(this.f9451f.m8418b());
            C6362d0.a aVarM6689j = new C6362d0.a().m6694o(c7357kM8361a.f9347a).m6685f(c7357kM8361a.f9348b).m6691l(c7357kM8361a.f9349c).m6689j(this.f9451f.m8417a());
            if (z6 && c7357kM8361a.f9348b == 100) {
                return null;
            }
            int i7 = c7357kM8361a.f9348b;
            if (i7 == 100) {
                this.f9450e = 3;
                return aVarM6689j;
            }
            if (102 > i7 || i7 >= 200) {
                this.f9450e = 4;
                return aVarM6689j;
            }
            this.f9450e = 3;
            return aVarM6689j;
        } catch (EOFException e6) {
            throw new IOException("unexpected end of stream on " + mo8330i().mo7714e().m6713a().m6486l().m6830o(), e6);
        }
    }

    @Override // p102l5.InterfaceC7350d
    /* renamed from: g */
    public Source mo8328g(C6362d0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!AbstractC7351e.m8332b(response)) {
            return m8435x(response.m6678x().m6588l(), 0L);
        }
        if (m8432u(response)) {
            return m8434w(response.m6678x().m6588l());
        }
        long jM7023k = AbstractC6427k.m7023k(response);
        return jM7023k != -1 ? m8435x(response.m6678x().m6588l(), jM7023k) : m8437z(response.m6678x().m6588l());
    }

    @Override // p102l5.InterfaceC7350d
    /* renamed from: h */
    public void mo8329h() {
        this.f9449d.flush();
    }

    @Override // p102l5.InterfaceC7350d
    /* renamed from: i */
    public InterfaceC7350d.a mo8330i() {
        return this.f9447b;
    }

    /* renamed from: s */
    public final void m8430s(ForwardingTimeout forwardingTimeout) {
        Timeout delegate = forwardingTimeout.getDelegate();
        forwardingTimeout.setDelegate(Timeout.NONE);
        delegate.clearDeadline();
        delegate.clearTimeout();
    }

    /* renamed from: t */
    public final boolean m8431t(C6358b0 c6358b0) {
        return StringsKt.equals("chunked", c6358b0.m6581e("Transfer-Encoding"), true);
    }

    /* renamed from: u */
    public final boolean m8432u(C6362d0 c6362d0) {
        return StringsKt.equals("chunked", C6362d0.m6660o(c6362d0, "Transfer-Encoding", null, 2, null), true);
    }

    /* renamed from: v */
    public final Sink m8433v() {
        if (this.f9450e == 1) {
            this.f9450e = 2;
            return new b();
        }
        throw new IllegalStateException(("state: " + this.f9450e).toString());
    }

    /* renamed from: w */
    public final Source m8434w(C6384w c6384w) {
        if (this.f9450e == 4) {
            this.f9450e = 5;
            return new c(this, c6384w);
        }
        throw new IllegalStateException(("state: " + this.f9450e).toString());
    }

    /* renamed from: x */
    public final Source m8435x(C6384w c6384w, long j6) {
        if (this.f9450e == 4) {
            this.f9450e = 5;
            return new e(this, c6384w, j6);
        }
        throw new IllegalStateException(("state: " + this.f9450e).toString());
    }

    /* renamed from: y */
    public final Sink m8436y() {
        if (this.f9450e == 1) {
            this.f9450e = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f9450e).toString());
    }

    /* renamed from: z */
    public final Source m8437z(C6384w c6384w) {
        if (this.f9450e == 4) {
            this.f9450e = 5;
            mo8330i().mo7711b();
            return new g(this, c6384w);
        }
        throw new IllegalStateException(("state: " + this.f9450e).toString());
    }
}
