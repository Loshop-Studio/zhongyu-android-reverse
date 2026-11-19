package p170t7;

import coil3.disk.C3289g;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.json.internal.C6031l;
import okhttp3.AbstractC6297g0;
import okhttp3.C6289c0;
import okhttp3.C6299h0;
import okhttp3.C6301i0;
import okhttp3.C6329q;
import okhttp3.C6330r;
import okhttp3.C6338z;
import okhttp3.Protocol;
import okhttp3.internal.connection.C6312k;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p073h4.AbstractC5625a;
import p139p7.AbstractC6396c;
import p161s7.AbstractC6569d;
import p161s7.InterfaceC6568c;

/* renamed from: t7.g */
/* loaded from: classes4.dex */
public final class C6607g implements InterfaceC6568c {

    /* renamed from: a */
    public final C6338z f11032a;

    /* renamed from: b */
    public final C6312k f11033b;

    /* renamed from: c */
    public final BufferedSource f11034c;

    /* renamed from: d */
    public final BufferedSink f11035d;

    /* renamed from: e */
    public int f11036e;

    /* renamed from: f */
    public final C6601a f11037f;

    /* renamed from: g */
    public C6329q f11038g;

    public C6607g(C6338z c6338z, C6312k c6312k, BufferedSource source, BufferedSink sink) {
        AbstractC5830k.m5330g(source, "source");
        AbstractC5830k.m5330g(sink, "sink");
        this.f11032a = c6338z;
        this.f11033b = c6312k;
        this.f11034c = source;
        this.f11035d = sink;
        this.f11037f = new C6601a(source);
    }

    /* renamed from: i */
    public static final void m6251i(C6607g c6607g, ForwardingTimeout forwardingTimeout) {
        Timeout delegate = forwardingTimeout.getDelegate();
        forwardingTimeout.setDelegate(Timeout.NONE);
        delegate.clearDeadline();
        delegate.clearTimeout();
    }

    @Override // p161s7.InterfaceC6568c
    /* renamed from: a */
    public final void mo6203a() {
        this.f11035d.flush();
    }

    @Override // p161s7.InterfaceC6568c
    /* renamed from: b */
    public final Source mo6204b(C6301i0 c6301i0) {
        if (!AbstractC6569d.m6211a(c6301i0)) {
            return m6252j(0L);
        }
        if ("chunked".equalsIgnoreCase(C6301i0.m5898a("Transfer-Encoding", c6301i0))) {
            C6330r c6330r = c6301i0.f10104a.f10075a;
            if (this.f11036e == 4) {
                this.f11036e = 5;
                return new C6604d(this, c6330r);
            }
            throw new IllegalStateException(("state: " + this.f11036e).toString());
        }
        long jM6049i = AbstractC6396c.m6049i(c6301i0);
        if (jM6049i != -1) {
            return m6252j(jM6049i);
        }
        if (this.f11036e == 4) {
            this.f11036e = 5;
            this.f11033b.m5930k();
            return new C6606f(this);
        }
        throw new IllegalStateException(("state: " + this.f11036e).toString());
    }

    @Override // p161s7.InterfaceC6568c
    /* renamed from: c */
    public final C6312k mo6205c() {
        return this.f11033b;
    }

    @Override // p161s7.InterfaceC6568c
    public final void cancel() throws IOException {
        Socket socket = this.f11033b.f10167c;
        if (socket != null) {
            AbstractC6396c.m6044d(socket);
        }
    }

    @Override // p161s7.InterfaceC6568c
    /* renamed from: d */
    public final long mo6206d(C6301i0 c6301i0) {
        if (!AbstractC6569d.m6211a(c6301i0)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(C6301i0.m5898a("Transfer-Encoding", c6301i0))) {
            return -1L;
        }
        return AbstractC6396c.m6049i(c6301i0);
    }

    @Override // p161s7.InterfaceC6568c
    /* renamed from: e */
    public final Sink mo6207e(C6289c0 request, long j7) throws ProtocolException {
        AbstractC5830k.m5330g(request, "request");
        AbstractC6297g0 abstractC6297g0 = request.f10078d;
        if (abstractC6297g0 != null && abstractC6297g0.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(request.f10077c.m5962a("Transfer-Encoding"))) {
            if (this.f11036e == 1) {
                this.f11036e = 2;
                return new C6603c(this);
            }
            throw new IllegalStateException(("state: " + this.f11036e).toString());
        }
        if (j7 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f11036e == 1) {
            this.f11036e = 2;
            return new C3289g(this);
        }
        throw new IllegalStateException(("state: " + this.f11036e).toString());
    }

    @Override // p161s7.InterfaceC6568c
    /* renamed from: f */
    public final void mo6208f(C6289c0 request) {
        AbstractC5830k.m5330g(request, "request");
        Proxy.Type type = this.f11033b.f10166b.f10257b.type();
        AbstractC5830k.m5329f(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append(request.f10076b);
        sb.append(' ');
        C6330r c6330r = request.f10075a;
        if (c6330r.f10274j || type != Proxy.Type.HTTP) {
            String strM5968b = c6330r.m5968b();
            String strM5970d = c6330r.m5970d();
            if (strM5970d != null) {
                strM5968b = strM5968b + '?' + strM5970d;
            }
            sb.append(strM5968b);
        } else {
            sb.append(c6330r);
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "StringBuilder().apply(builderAction).toString()");
        m6253k(request.f10077c, string);
    }

    @Override // p161s7.InterfaceC6568c
    /* renamed from: g */
    public final C6299h0 mo6209g(boolean z8) {
        C6601a c6601a = this.f11037f;
        int i = this.f11036e;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f11036e).toString());
        }
        try {
            String utf8LineStrict = c6601a.f11017a.readUtf8LineStrict(c6601a.f11018b);
            c6601a.f11018b -= utf8LineStrict.length();
            C6031l c6031lM4952l = AbstractC5625a.m4952l(utf8LineStrict);
            int i8 = c6031lM4952l.f9559b;
            C6299h0 c6299h0 = new C6299h0();
            Protocol protocol = (Protocol) c6031lM4952l.f9560c;
            AbstractC5830k.m5330g(protocol, "protocol");
            c6299h0.f10092b = protocol;
            c6299h0.f10093c = i8;
            c6299h0.f10094d = (String) c6031lM4952l.f9561d;
            c6299h0.f10096f = c6601a.m6249a().m5964c();
            if (z8 && i8 == 100) {
                return null;
            }
            if (i8 == 100) {
                this.f11036e = 3;
                return c6299h0;
            }
            if (102 > i8 || i8 >= 200) {
                this.f11036e = 4;
                return c6299h0;
            }
            this.f11036e = 3;
            return c6299h0;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.f11033b.f10166b.f10256a.f10050i.m5973g()), e);
        }
    }

    @Override // p161s7.InterfaceC6568c
    /* renamed from: h */
    public final void mo6210h() throws IOException {
        this.f11035d.flush();
    }

    /* renamed from: j */
    public final C6605e m6252j(long j7) {
        if (this.f11036e == 4) {
            this.f11036e = 5;
            return new C6605e(this, j7);
        }
        throw new IllegalStateException(("state: " + this.f11036e).toString());
    }

    /* renamed from: k */
    public final void m6253k(C6329q c6329q, String requestLine) {
        AbstractC5830k.m5330g(requestLine, "requestLine");
        if (this.f11036e != 0) {
            throw new IllegalStateException(("state: " + this.f11036e).toString());
        }
        BufferedSink bufferedSink = this.f11035d;
        bufferedSink.writeUtf8(requestLine).writeUtf8("\r\n");
        int size = c6329q.size();
        for (int i = 0; i < size; i++) {
            bufferedSink.writeUtf8(c6329q.m5963b(i)).writeUtf8(": ").writeUtf8(c6329q.m5966e(i)).writeUtf8("\r\n");
        }
        bufferedSink.writeUtf8("\r\n");
        this.f11036e = 1;
    }
}
