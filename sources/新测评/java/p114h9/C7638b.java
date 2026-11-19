package p114h9;

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
import p011a9.C0054q;
import p011a9.C0055r;
import p011a9.C0059v;
import p011a9.C0060w;
import p011a9.C0062y;
import p011a9.InterfaceC0048k;
import p028b9.AbstractC5070d;
import p103g9.AbstractC7604e;
import p103g9.C7608i;
import p103g9.C7610k;
import p103g9.InterfaceC7603d;

/* renamed from: h9.b */
/* loaded from: classes5.dex */
public final class C7638b implements InterfaceC7603d {

    /* renamed from: h */
    public static final d f12845h = new d(null);

    /* renamed from: a */
    public final C0059v f12846a;

    /* renamed from: b */
    public final RealConnection f12847b;

    /* renamed from: c */
    public final BufferedSource f12848c;

    /* renamed from: d */
    public final BufferedSink f12849d;

    /* renamed from: e */
    public int f12850e;

    /* renamed from: f */
    public final C7637a f12851f;

    /* renamed from: g */
    public C0054q f12852g;

    /* renamed from: h9.b$a */
    public abstract class a implements Source {

        /* renamed from: a */
        public final ForwardingTimeout f12853a;

        /* renamed from: b */
        public boolean f12854b;

        public a() {
            this.f12853a = new ForwardingTimeout(C7638b.this.f12848c.getTimeout());
        }

        /* renamed from: a */
        public final boolean m12642a() {
            return this.f12854b;
        }

        /* renamed from: f */
        public final void m12643f() {
            if (C7638b.this.f12850e == 6) {
                return;
            }
            if (C7638b.this.f12850e == 5) {
                C7638b.this.m12633r(this.f12853a);
                C7638b.this.f12850e = 6;
            } else {
                throw new IllegalStateException("state: " + C7638b.this.f12850e);
            }
        }

        /* renamed from: g */
        public final void m12644g(boolean z9) {
            this.f12854b = z9;
        }

        @Override // okio.Source
        public long read(Buffer sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return C7638b.this.f12848c.read(sink, j10);
            } catch (IOException e10) {
                C7638b.this.mo12496d().m14454y();
                m12643f();
                throw e10;
            }
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return this.f12853a;
        }
    }

    /* renamed from: h9.b$b */
    public final class b implements Sink {

        /* renamed from: a */
        public final ForwardingTimeout f12856a;

        /* renamed from: b */
        public boolean f12857b;

        public b() {
            this.f12856a = new ForwardingTimeout(C7638b.this.f12849d.getTimeout());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f12857b) {
                return;
            }
            this.f12857b = true;
            C7638b.this.f12849d.writeUtf8("0\r\n\r\n");
            C7638b.this.m12633r(this.f12856a);
            C7638b.this.f12850e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public synchronized void flush() {
            if (this.f12857b) {
                return;
            }
            C7638b.this.f12849d.flush();
        }

        @Override // okio.Sink
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return this.f12856a;
        }

        @Override // okio.Sink
        public void write(Buffer source, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f12857b) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            C7638b.this.f12849d.writeHexadecimalUnsignedLong(j10);
            C7638b.this.f12849d.writeUtf8("\r\n");
            C7638b.this.f12849d.write(source, j10);
            C7638b.this.f12849d.writeUtf8("\r\n");
        }
    }

    /* renamed from: h9.b$c */
    public final class c extends a {

        /* renamed from: d */
        public final C0055r f12859d;

        /* renamed from: e */
        public long f12860e;

        /* renamed from: f */
        public boolean f12861f;

        /* renamed from: g */
        public final /* synthetic */ C7638b f12862g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C7638b c7638b, C0055r url) {
            super();
            Intrinsics.checkNotNullParameter(url, "url");
            this.f12862g = c7638b;
            this.f12859d = url;
            this.f12860e = -1L;
            this.f12861f = true;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m12642a()) {
                return;
            }
            if (this.f12861f && !AbstractC5070d.m2654s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f12862g.mo12496d().m14454y();
                m12643f();
            }
            m12644g(true);
        }

        /* renamed from: h */
        public final void m12645h() throws IOException {
            if (this.f12860e != -1) {
                this.f12862g.f12848c.readUtf8LineStrict();
            }
            try {
                this.f12860e = this.f12862g.f12848c.readHexadecimalUnsignedLong();
                String string = StringsKt.trim((CharSequence) this.f12862g.f12848c.readUtf8LineStrict()).toString();
                if (this.f12860e < 0 || (string.length() > 0 && !StringsKt.startsWith$default(string, ";", false, 2, (Object) null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f12860e + string + Typography.quote);
                }
                if (this.f12860e == 0) {
                    this.f12861f = false;
                    C7638b c7638b = this.f12862g;
                    c7638b.f12852g = c7638b.f12851f.m12621a();
                    C0059v c0059v = this.f12862g.f12846a;
                    Intrinsics.checkNotNull(c0059v);
                    InterfaceC0048k interfaceC0048kM316p = c0059v.m316p();
                    C0055r c0055r = this.f12859d;
                    C0054q c0054q = this.f12862g.f12852g;
                    Intrinsics.checkNotNull(c0054q);
                    AbstractC7604e.m12506f(interfaceC0048kM316p, c0055r, c0054q);
                    m12643f();
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // p114h9.C7638b.a, okio.Source
        public long read(Buffer sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (m12642a()) {
                throw new IllegalStateException("closed");
            }
            if (!this.f12861f) {
                return -1L;
            }
            long j11 = this.f12860e;
            if (j11 == 0 || j11 == -1) {
                m12645h();
                if (!this.f12861f) {
                    return -1L;
                }
            }
            long j12 = super.read(sink, Math.min(j10, this.f12860e));
            if (j12 != -1) {
                this.f12860e -= j12;
                return j12;
            }
            this.f12862g.mo12496d().m14454y();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m12643f();
            throw protocolException;
        }
    }

    /* renamed from: h9.b$d */
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public d() {
        }
    }

    /* renamed from: h9.b$e */
    public final class e extends a {

        /* renamed from: d */
        public long f12863d;

        public e(long j10) {
            super();
            this.f12863d = j10;
            if (j10 == 0) {
                m12643f();
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m12642a()) {
                return;
            }
            if (this.f12863d != 0 && !AbstractC5070d.m2654s(this, 100, TimeUnit.MILLISECONDS)) {
                C7638b.this.mo12496d().m14454y();
                m12643f();
            }
            m12644g(true);
        }

        @Override // p114h9.C7638b.a, okio.Source
        public long read(Buffer sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (m12642a()) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f12863d;
            if (j11 == 0) {
                return -1L;
            }
            long j12 = super.read(sink, Math.min(j11, j10));
            if (j12 == -1) {
                C7638b.this.mo12496d().m14454y();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m12643f();
                throw protocolException;
            }
            long j13 = this.f12863d - j12;
            this.f12863d = j13;
            if (j13 == 0) {
                m12643f();
            }
            return j12;
        }
    }

    /* renamed from: h9.b$f */
    public final class f implements Sink {

        /* renamed from: a */
        public final ForwardingTimeout f12865a;

        /* renamed from: b */
        public boolean f12866b;

        public f() {
            this.f12865a = new ForwardingTimeout(C7638b.this.f12849d.getTimeout());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f12866b) {
                return;
            }
            this.f12866b = true;
            C7638b.this.m12633r(this.f12865a);
            C7638b.this.f12850e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            if (this.f12866b) {
                return;
            }
            C7638b.this.f12849d.flush();
        }

        @Override // okio.Sink
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return this.f12865a;
        }

        @Override // okio.Sink
        public void write(Buffer source, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f12866b) {
                throw new IllegalStateException("closed");
            }
            AbstractC5070d.m2647l(source.size(), 0L, j10);
            C7638b.this.f12849d.write(source, j10);
        }
    }

    /* renamed from: h9.b$g */
    public final class g extends a {

        /* renamed from: d */
        public boolean f12868d;

        public g() {
            super();
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m12642a()) {
                return;
            }
            if (!this.f12868d) {
                m12643f();
            }
            m12644g(true);
        }

        @Override // p114h9.C7638b.a, okio.Source
        public long read(Buffer sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (m12642a()) {
                throw new IllegalStateException("closed");
            }
            if (this.f12868d) {
                return -1L;
            }
            long j11 = super.read(sink, j10);
            if (j11 != -1) {
                return j11;
            }
            this.f12868d = true;
            m12643f();
            return -1L;
        }
    }

    public C7638b(C0059v c0059v, RealConnection connection, BufferedSource source, BufferedSink sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f12846a = c0059v;
        this.f12847b = connection;
        this.f12848c = source;
        this.f12849d = sink;
        this.f12851f = new C7637a(source);
    }

    /* renamed from: A */
    public final void m12632A(C0054q headers, String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (this.f12850e != 0) {
            throw new IllegalStateException(("state: " + this.f12850e).toString());
        }
        this.f12849d.writeUtf8(requestLine).writeUtf8("\r\n");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f12849d.writeUtf8(headers.m181b(i10)).writeUtf8(": ").writeUtf8(headers.m184f(i10)).writeUtf8("\r\n");
        }
        this.f12849d.writeUtf8("\r\n");
        this.f12850e = 1;
    }

    @Override // p103g9.InterfaceC7603d
    /* renamed from: a */
    public void mo12493a() {
        this.f12849d.flush();
    }

    @Override // p103g9.InterfaceC7603d
    /* renamed from: b */
    public void mo12494b(C0060w request) {
        Intrinsics.checkNotNullParameter(request, "request");
        C7608i c7608i = C7608i.f12761a;
        Proxy.Type type = mo12496d().m14455z().m87b().type();
        Intrinsics.checkNotNullExpressionValue(type, "connection.route().proxy.type()");
        m12632A(request.m376e(), c7608i.m12522a(request, type));
    }

    @Override // p103g9.InterfaceC7603d
    /* renamed from: c */
    public Sink mo12495c(C0060w request, long j10) throws ProtocolException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.m372a() != null && request.m372a().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (m12634s(request)) {
            return m12636u();
        }
        if (j10 != -1) {
            return m12639x();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // p103g9.InterfaceC7603d
    public void cancel() {
        mo12496d().m14433d();
    }

    @Override // p103g9.InterfaceC7603d
    /* renamed from: d */
    public RealConnection mo12496d() {
        return this.f12847b;
    }

    @Override // p103g9.InterfaceC7603d
    /* renamed from: e */
    public long mo12497e(C0062y response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!AbstractC7604e.m12502b(response)) {
            return 0L;
        }
        if (m12635t(response)) {
            return -1L;
        }
        return AbstractC5070d.m2657v(response);
    }

    @Override // p103g9.InterfaceC7603d
    /* renamed from: f */
    public C0062y.a mo12498f(boolean z9) {
        int i10 = this.f12850e;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.f12850e).toString());
        }
        try {
            C7610k c7610kM12531a = C7610k.f12764d.m12531a(this.f12851f.m12622b());
            C0062y.a aVarM443k = new C0062y.a().m448p(c7610kM12531a.f12765a).m439g(c7610kM12531a.f12766b).m445m(c7610kM12531a.f12767c).m443k(this.f12851f.m12621a());
            if (z9 && c7610kM12531a.f12766b == 100) {
                return null;
            }
            int i11 = c7610kM12531a.f12766b;
            if (i11 == 100) {
                this.f12850e = 3;
                return aVarM443k;
            }
            if (102 > i11 || i11 >= 200) {
                this.f12850e = 4;
                return aVarM443k;
            }
            this.f12850e = 3;
            return aVarM443k;
        } catch (EOFException e10) {
            throw new IOException("unexpected end of stream on " + mo12496d().m14455z().m86a().m85l().m217p(), e10);
        }
    }

    @Override // p103g9.InterfaceC7603d
    /* renamed from: g */
    public Source mo12499g(C0062y response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!AbstractC7604e.m12502b(response)) {
            return m12638w(0L);
        }
        if (m12635t(response)) {
            return m12637v(response.m431w().m381j());
        }
        long jM2657v = AbstractC5070d.m2657v(response);
        return jM2657v != -1 ? m12638w(jM2657v) : m12640y();
    }

    @Override // p103g9.InterfaceC7603d
    /* renamed from: h */
    public void mo12500h() throws IOException {
        this.f12849d.flush();
    }

    /* renamed from: r */
    public final void m12633r(ForwardingTimeout forwardingTimeout) {
        Timeout delegate = forwardingTimeout.getDelegate();
        forwardingTimeout.setDelegate(Timeout.NONE);
        delegate.clearDeadline();
        delegate.clearTimeout();
    }

    /* renamed from: s */
    public final boolean m12634s(C0060w c0060w) {
        return StringsKt.equals("chunked", c0060w.m375d("Transfer-Encoding"), true);
    }

    /* renamed from: t */
    public final boolean m12635t(C0062y c0062y) {
        return StringsKt.equals("chunked", C0062y.m413n(c0062y, "Transfer-Encoding", null, 2, null), true);
    }

    /* renamed from: u */
    public final Sink m12636u() {
        if (this.f12850e == 1) {
            this.f12850e = 2;
            return new b();
        }
        throw new IllegalStateException(("state: " + this.f12850e).toString());
    }

    /* renamed from: v */
    public final Source m12637v(C0055r c0055r) {
        if (this.f12850e == 4) {
            this.f12850e = 5;
            return new c(this, c0055r);
        }
        throw new IllegalStateException(("state: " + this.f12850e).toString());
    }

    /* renamed from: w */
    public final Source m12638w(long j10) {
        if (this.f12850e == 4) {
            this.f12850e = 5;
            return new e(j10);
        }
        throw new IllegalStateException(("state: " + this.f12850e).toString());
    }

    /* renamed from: x */
    public final Sink m12639x() {
        if (this.f12850e == 1) {
            this.f12850e = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f12850e).toString());
    }

    /* renamed from: y */
    public final Source m12640y() {
        if (this.f12850e == 4) {
            this.f12850e = 5;
            mo12496d().m14454y();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.f12850e).toString());
    }

    /* renamed from: z */
    public final void m12641z(C0062y response) {
        Intrinsics.checkNotNullParameter(response, "response");
        long jM2657v = AbstractC5070d.m2657v(response);
        if (jM2657v == -1) {
            return;
        }
        Source sourceM12638w = m12638w(jM2657v);
        AbstractC5070d.m2621L(sourceM12638w, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        sourceM12638w.close();
    }
}
