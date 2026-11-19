package p145y2;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import okhttp3.internal.connection.RealConnection;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p117r2.C4496a0;
import p117r2.C4516s;
import p117r2.C4517t;
import p117r2.C4521x;
import p117r2.C4522y;
import p117r2.InterfaceC4510m;
import p121s2.AbstractC4550b;
import p141x2.AbstractC4668e;
import p141x2.C4672i;
import p141x2.C4674k;
import p141x2.InterfaceC4667d;

/* renamed from: y2.b */
/* loaded from: classes2.dex */
public final class C4688b implements InterfaceC4667d {

    /* renamed from: h */
    public static final d f6010h = new d(null);

    /* renamed from: a */
    public int f6011a;

    /* renamed from: b */
    public final C4687a f6012b;

    /* renamed from: c */
    public C4516s f6013c;

    /* renamed from: d */
    public final C4521x f6014d;

    /* renamed from: e */
    public final RealConnection f6015e;

    /* renamed from: f */
    public final BufferedSource f6016f;

    /* renamed from: g */
    public final BufferedSink f6017g;

    /* renamed from: y2.b$a */
    public abstract class a implements Source {

        /* renamed from: a */
        public final ForwardingTimeout f6018a;

        /* renamed from: b */
        public boolean f6019b;

        public a() {
            this.f6018a = new ForwardingTimeout(C4688b.this.f6016f.getTimeout());
        }

        /* renamed from: a */
        public final boolean m6649a() {
            return this.f6019b;
        }

        /* renamed from: b */
        public final void m6650b() {
            if (C4688b.this.f6011a == 6) {
                return;
            }
            if (C4688b.this.f6011a == 5) {
                C4688b.this.m6640r(this.f6018a);
                C4688b.this.f6011a = 6;
            } else {
                throw new IllegalStateException("state: " + C4688b.this.f6011a);
            }
        }

        /* renamed from: c */
        public final void m6651c(boolean z3) {
            this.f6019b = z3;
        }

        @Override // okio.Source
        public long read(Buffer sink, long j4) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return C4688b.this.f6016f.read(sink, j4);
            } catch (IOException e4) {
                C4688b.this.mo6571f().m5616y();
                m6650b();
                throw e4;
            }
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return this.f6018a;
        }
    }

    /* renamed from: y2.b$b */
    public final class b implements Sink {

        /* renamed from: a */
        public final ForwardingTimeout f6021a;

        /* renamed from: b */
        public boolean f6022b;

        public b() {
            this.f6021a = new ForwardingTimeout(C4688b.this.f6017g.getTimeout());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f6022b) {
                return;
            }
            this.f6022b = true;
            C4688b.this.f6017g.writeUtf8("0\r\n\r\n");
            C4688b.this.m6640r(this.f6021a);
            C4688b.this.f6011a = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public synchronized void flush() {
            if (this.f6022b) {
                return;
            }
            C4688b.this.f6017g.flush();
        }

        @Override // okio.Sink
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return this.f6021a;
        }

        @Override // okio.Sink
        public void write(Buffer source, long j4) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f6022b)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j4 == 0) {
                return;
            }
            C4688b.this.f6017g.writeHexadecimalUnsignedLong(j4);
            C4688b.this.f6017g.writeUtf8("\r\n");
            C4688b.this.f6017g.write(source, j4);
            C4688b.this.f6017g.writeUtf8("\r\n");
        }
    }

    /* renamed from: y2.b$c */
    public final class c extends a {

        /* renamed from: d */
        public long f6024d;

        /* renamed from: e */
        public boolean f6025e;

        /* renamed from: f */
        public final C4517t f6026f;

        /* renamed from: g */
        public final /* synthetic */ C4688b f6027g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C4688b c4688b, C4517t url) {
            super();
            Intrinsics.checkNotNullParameter(url, "url");
            this.f6027g = c4688b;
            this.f6026f = url;
            this.f6024d = -1L;
            this.f6025e = true;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m6649a()) {
                return;
            }
            if (this.f6025e && !AbstractC4550b.m6234p(this, 100, TimeUnit.MILLISECONDS)) {
                this.f6027g.mo6571f().m5616y();
                m6650b();
            }
            m6651c(true);
        }

        /* renamed from: d */
        public final void m6652d() throws IOException {
            if (this.f6024d != -1) {
                this.f6027g.f6016f.readUtf8LineStrict();
            }
            try {
                this.f6024d = this.f6027g.f6016f.readHexadecimalUnsignedLong();
                String utf8LineStrict = this.f6027g.f6016f.readUtf8LineStrict();
                if (utf8LineStrict == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String string = StringsKt__StringsKt.trim((CharSequence) utf8LineStrict).toString();
                if (this.f6024d >= 0) {
                    if (!(string.length() > 0) || StringsKt__StringsJVMKt.startsWith$default(string, ";", false, 2, null)) {
                        if (this.f6024d == 0) {
                            this.f6025e = false;
                            C4688b c4688b = this.f6027g;
                            c4688b.f6013c = c4688b.f6012b.m6628a();
                            C4521x c4521x = this.f6027g.f6014d;
                            Intrinsics.checkNotNull(c4521x);
                            InterfaceC4510m interfaceC4510mM6080l = c4521x.m6080l();
                            C4517t c4517t = this.f6026f;
                            C4516s c4516s = this.f6027g.f6013c;
                            Intrinsics.checkNotNull(c4516s);
                            AbstractC4668e.m6579f(interfaceC4510mM6080l, c4517t, c4516s);
                            m6650b();
                            return;
                        }
                        return;
                    }
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f6024d + string + Typography.quote);
            } catch (NumberFormatException e4) {
                throw new ProtocolException(e4.getMessage());
            }
        }

        @Override // p145y2.C4688b.a, okio.Source
        public long read(Buffer sink, long j4) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(j4 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
            }
            if (!(!m6649a())) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.f6025e) {
                return -1L;
            }
            long j5 = this.f6024d;
            if (j5 == 0 || j5 == -1) {
                m6652d();
                if (!this.f6025e) {
                    return -1L;
                }
            }
            long j6 = super.read(sink, Math.min(j4, this.f6024d));
            if (j6 != -1) {
                this.f6024d -= j6;
                return j6;
            }
            this.f6027g.mo6571f().m5616y();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m6650b();
            throw protocolException;
        }
    }

    /* renamed from: y2.b$d */
    public static final class d {
        public d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: y2.b$e */
    public final class e extends a {

        /* renamed from: d */
        public long f6028d;

        public e(long j4) {
            super();
            this.f6028d = j4;
            if (j4 == 0) {
                m6650b();
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m6649a()) {
                return;
            }
            if (this.f6028d != 0 && !AbstractC4550b.m6234p(this, 100, TimeUnit.MILLISECONDS)) {
                C4688b.this.mo6571f().m5616y();
                m6650b();
            }
            m6651c(true);
        }

        @Override // p145y2.C4688b.a, okio.Source
        public long read(Buffer sink, long j4) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(j4 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
            }
            if (!(!m6649a())) {
                throw new IllegalStateException("closed".toString());
            }
            long j5 = this.f6028d;
            if (j5 == 0) {
                return -1L;
            }
            long j6 = super.read(sink, Math.min(j5, j4));
            if (j6 == -1) {
                C4688b.this.mo6571f().m5616y();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m6650b();
                throw protocolException;
            }
            long j7 = this.f6028d - j6;
            this.f6028d = j7;
            if (j7 == 0) {
                m6650b();
            }
            return j6;
        }
    }

    /* renamed from: y2.b$f */
    public final class f implements Sink {

        /* renamed from: a */
        public final ForwardingTimeout f6030a;

        /* renamed from: b */
        public boolean f6031b;

        public f() {
            this.f6030a = new ForwardingTimeout(C4688b.this.f6017g.getTimeout());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f6031b) {
                return;
            }
            this.f6031b = true;
            C4688b.this.m6640r(this.f6030a);
            C4688b.this.f6011a = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            if (this.f6031b) {
                return;
            }
            C4688b.this.f6017g.flush();
        }

        @Override // okio.Sink
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return this.f6030a;
        }

        @Override // okio.Sink
        public void write(Buffer source, long j4) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f6031b)) {
                throw new IllegalStateException("closed".toString());
            }
            AbstractC4550b.m6227i(source.size(), 0L, j4);
            C4688b.this.f6017g.write(source, j4);
        }
    }

    /* renamed from: y2.b$g */
    public final class g extends a {

        /* renamed from: d */
        public boolean f6033d;

        public g() {
            super();
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m6649a()) {
                return;
            }
            if (!this.f6033d) {
                m6650b();
            }
            m6651c(true);
        }

        @Override // p145y2.C4688b.a, okio.Source
        public long read(Buffer sink, long j4) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(j4 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
            }
            if (!(!m6649a())) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f6033d) {
                return -1L;
            }
            long j5 = super.read(sink, j4);
            if (j5 != -1) {
                return j5;
            }
            this.f6033d = true;
            m6650b();
            return -1L;
        }
    }

    public C4688b(C4521x c4521x, RealConnection connection, BufferedSource source, BufferedSink sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f6014d = c4521x;
        this.f6015e = connection;
        this.f6016f = source;
        this.f6017g = sink;
        this.f6012b = new C4687a(source);
    }

    /* renamed from: A */
    public final void m6639A(C4516s headers, String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (!(this.f6011a == 0)) {
            throw new IllegalStateException(("state: " + this.f6011a).toString());
        }
        this.f6017g.writeUtf8(requestLine).writeUtf8("\r\n");
        int size = headers.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f6017g.writeUtf8(headers.m5960b(i4)).writeUtf8(": ").writeUtf8(headers.m5962e(i4)).writeUtf8("\r\n");
        }
        this.f6017g.writeUtf8("\r\n");
        this.f6011a = 1;
    }

    @Override // p141x2.InterfaceC4667d
    /* renamed from: a */
    public long mo6566a(C4496a0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!AbstractC4668e.m6575b(response)) {
            return 0L;
        }
        if (m6642t(response)) {
            return -1L;
        }
        return AbstractC4550b.m6237s(response);
    }

    @Override // p141x2.InterfaceC4667d
    /* renamed from: b */
    public void mo6567b() {
        this.f6017g.flush();
    }

    @Override // p141x2.InterfaceC4667d
    /* renamed from: c */
    public Sink mo6568c(C4522y request, long j4) throws ProtocolException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.m6132a() != null && request.m6132a().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (m6641s(request)) {
            return m6643u();
        }
        if (j4 != -1) {
            return m6646x();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // p141x2.InterfaceC4667d
    public void cancel() throws IOException {
        mo6571f().m5595d();
    }

    @Override // p141x2.InterfaceC4667d
    /* renamed from: d */
    public void mo6569d(C4522y request) {
        Intrinsics.checkNotNullParameter(request, "request");
        C4672i c4672i = C4672i.f5981a;
        Proxy.Type type = mo6571f().m5617z().m5848b().type();
        Intrinsics.checkNotNullExpressionValue(type, "connection.route().proxy.type()");
        m6639A(request.m6136e(), c4672i.m6595a(request, type));
    }

    @Override // p141x2.InterfaceC4667d
    /* renamed from: e */
    public C4496a0.a mo6570e(boolean z3) {
        int i4 = this.f6011a;
        boolean z4 = true;
        if (i4 != 1 && i4 != 3) {
            z4 = false;
        }
        if (!z4) {
            throw new IllegalStateException(("state: " + this.f6011a).toString());
        }
        try {
            C4674k c4674kM6604a = C4674k.f5984d.m6604a(this.f6012b.m6629b());
            C4496a0.a aVarM5828k = new C4496a0.a().m5833p(c4674kM6604a.f5985a).m5824g(c4674kM6604a.f5986b).m5830m(c4674kM6604a.f5987c).m5828k(this.f6012b.m6628a());
            if (z3 && c4674kM6604a.f5986b == 100) {
                return null;
            }
            if (c4674kM6604a.f5986b == 100) {
                this.f6011a = 3;
                return aVarM5828k;
            }
            this.f6011a = 4;
            return aVarM5828k;
        } catch (EOFException e4) {
            throw new IOException("unexpected end of stream on " + mo6571f().m5617z().m5847a().m5798l().m5994p(), e4);
        }
    }

    @Override // p141x2.InterfaceC4667d
    /* renamed from: f */
    public RealConnection mo6571f() {
        return this.f6015e;
    }

    @Override // p141x2.InterfaceC4667d
    /* renamed from: g */
    public void mo6572g() throws IOException {
        this.f6017g.flush();
    }

    @Override // p141x2.InterfaceC4667d
    /* renamed from: h */
    public Source mo6573h(C4496a0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!AbstractC4668e.m6575b(response)) {
            return m6645w(0L);
        }
        if (m6642t(response)) {
            return m6644v(response.m5816r().m6141j());
        }
        long jM6237s = AbstractC4550b.m6237s(response);
        return jM6237s != -1 ? m6645w(jM6237s) : m6647y();
    }

    /* renamed from: r */
    public final void m6640r(ForwardingTimeout forwardingTimeout) {
        Timeout delegate = forwardingTimeout.getDelegate();
        forwardingTimeout.setDelegate(Timeout.NONE);
        delegate.clearDeadline();
        delegate.clearTimeout();
    }

    /* renamed from: s */
    public final boolean m6641s(C4522y c4522y) {
        return StringsKt__StringsJVMKt.equals("chunked", c4522y.m6135d("Transfer-Encoding"), true);
    }

    /* renamed from: t */
    public final boolean m6642t(C4496a0 c4496a0) {
        return StringsKt__StringsJVMKt.equals("chunked", C4496a0.m5799i(c4496a0, "Transfer-Encoding", null, 2, null), true);
    }

    /* renamed from: u */
    public final Sink m6643u() {
        if (this.f6011a == 1) {
            this.f6011a = 2;
            return new b();
        }
        throw new IllegalStateException(("state: " + this.f6011a).toString());
    }

    /* renamed from: v */
    public final Source m6644v(C4517t c4517t) {
        if (this.f6011a == 4) {
            this.f6011a = 5;
            return new c(this, c4517t);
        }
        throw new IllegalStateException(("state: " + this.f6011a).toString());
    }

    /* renamed from: w */
    public final Source m6645w(long j4) {
        if (this.f6011a == 4) {
            this.f6011a = 5;
            return new e(j4);
        }
        throw new IllegalStateException(("state: " + this.f6011a).toString());
    }

    /* renamed from: x */
    public final Sink m6646x() {
        if (this.f6011a == 1) {
            this.f6011a = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f6011a).toString());
    }

    /* renamed from: y */
    public final Source m6647y() {
        if (this.f6011a == 4) {
            this.f6011a = 5;
            mo6571f().m5616y();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.f6011a).toString());
    }

    /* renamed from: z */
    public final void m6648z(C4496a0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        long jM6237s = AbstractC4550b.m6237s(response);
        if (jM6237s == -1) {
            return;
        }
        Source sourceM6645w = m6645w(jM6237s);
        AbstractC4550b.m6205H(sourceM6645w, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        sourceM6645w.close();
    }
}
