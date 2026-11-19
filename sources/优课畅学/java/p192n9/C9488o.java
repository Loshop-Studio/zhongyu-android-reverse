package p192n9;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.C9561c;
import okhttp3.Protocol;
import okhttp3.internal.http2.C9565c;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.InterfaceC9563a;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Timeout;
import p123h7.C8736p;
import p136i9.C8896a;
import p136i9.C8897a0;
import p136i9.C8907f0;
import p136i9.C8910h;
import p136i9.C8925w;
import p136i9.InterfaceC8912j;
import p147j9.AbstractC9041k;
import p181m9.C9346d;
import p203o9.C9552g;
import p203o9.InterfaceC9549d;
import p214p9.C9775b;
import p225q9.C9870o;
import p225q9.C9871p;
import p225q9.C9874s;
import p302x9.C10589d;

/* renamed from: n9.o */
/* loaded from: classes5.dex */
public final class C9488o extends C9565c.c implements InterfaceC8912j, InterfaceC9549d.a {

    /* renamed from: w */
    public static final a f18781w = new a(null);

    /* renamed from: c */
    public final C9346d f18782c;

    /* renamed from: d */
    public final C9489p f18783d;

    /* renamed from: e */
    public final C8907f0 f18784e;

    /* renamed from: f */
    public final Socket f18785f;

    /* renamed from: g */
    public final Socket f18786g;

    /* renamed from: h */
    public final C9561c f18787h;

    /* renamed from: i */
    public final Protocol f18788i;

    /* renamed from: j */
    public final BufferedSource f18789j;

    /* renamed from: k */
    public final BufferedSink f18790k;

    /* renamed from: l */
    public final int f18791l;

    /* renamed from: m */
    public final AbstractC9479f f18792m;

    /* renamed from: n */
    public C9565c f18793n;

    /* renamed from: o */
    public boolean f18794o;

    /* renamed from: p */
    public boolean f18795p;

    /* renamed from: q */
    public int f18796q;

    /* renamed from: r */
    public int f18797r;

    /* renamed from: s */
    public int f18798s;

    /* renamed from: t */
    public int f18799t;

    /* renamed from: u */
    public final List f18800u;

    /* renamed from: v */
    public long f18801v;

    /* renamed from: n9.o$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        public a() {
        }
    }

    public C9488o(C9346d taskRunner, C9489p connectionPool, C8907f0 route, Socket rawSocket, Socket socket, C9561c c9561c, Protocol protocol, BufferedSource source, BufferedSink sink, int i10, AbstractC9479f connectionListener) {
        AbstractC9133u.m16133g(taskRunner, "taskRunner");
        AbstractC9133u.m16133g(connectionPool, "connectionPool");
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(rawSocket, "rawSocket");
        AbstractC9133u.m16133g(socket, "socket");
        AbstractC9133u.m16133g(protocol, "protocol");
        AbstractC9133u.m16133g(source, "source");
        AbstractC9133u.m16133g(sink, "sink");
        AbstractC9133u.m16133g(connectionListener, "connectionListener");
        this.f18782c = taskRunner;
        this.f18783d = connectionPool;
        this.f18784e = route;
        this.f18785f = rawSocket;
        this.f18786g = socket;
        this.f18787h = c9561c;
        this.f18788i = protocol;
        this.f18789j = source;
        this.f18790k = sink;
        this.f18791l = i10;
        this.f18792m = connectionListener;
        this.f18799t = 1;
        this.f18800u = new ArrayList();
        this.f18801v = Long.MAX_VALUE;
    }

    /* renamed from: A */
    public final boolean m17543A(C8925w c8925w) {
        C9561c c9561c;
        if (!AbstractC9041k.f17265b || Thread.holdsLock(this)) {
            C8925w c8925wM14950l = mo17446d().m15174a().m14950l();
            if (c8925w.m15289m() != c8925wM14950l.m15289m()) {
                return false;
            }
            if (AbstractC9133u.m16128b(c8925w.m15284h(), c8925wM14950l.m15284h())) {
                return true;
            }
            return (this.f18795p || (c9561c = this.f18787h) == null || !m17546e(c8925w, c9561c)) ? false : true;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    @Override // okhttp3.internal.http2.C9565c.c
    /* renamed from: a */
    public void mo17544a(C9565c connection, C9874s settings) {
        AbstractC9133u.m16133g(connection, "connection");
        AbstractC9133u.m16133g(settings, "settings");
        synchronized (this) {
            try {
                int i10 = this.f18799t;
                int iM18439d = settings.m18439d();
                this.f18799t = iM18439d;
                if (iM18439d < i10) {
                    this.f18783d.m17575i(mo17446d().m15174a());
                } else if (iM18439d > i10) {
                    this.f18783d.m17574h();
                }
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p203o9.InterfaceC9549d.a
    /* renamed from: b */
    public void mo17444b() {
        synchronized (this) {
            this.f18794o = true;
            C8736p c8736p = C8736p.f16368a;
        }
        this.f18792m.m17465h(this);
    }

    @Override // okhttp3.internal.http2.C9565c.c
    /* renamed from: c */
    public void mo17545c(C9871p stream) {
        AbstractC9133u.m16133g(stream, "stream");
        stream.m18392e(ErrorCode.f19108j, null);
    }

    @Override // p203o9.InterfaceC9549d.a
    public void cancel() throws IOException {
        AbstractC9041k.m15778h(this.f18785f);
    }

    @Override // p203o9.InterfaceC9549d.a
    /* renamed from: d */
    public C8907f0 mo17446d() {
        return this.f18784e;
    }

    /* renamed from: e */
    public final boolean m17546e(C8925w c8925w, C9561c c9561c) {
        List listM17902e = c9561c.m17902e();
        if (!listM17902e.isEmpty()) {
            C10589d c10589d = C10589d.f20983a;
            String strM15284h = c8925w.m15284h();
            Object obj = listM17902e.get(0);
            AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (c10589d.m19749e(strM15284h, (X509Certificate) obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    @Override // p203o9.InterfaceC9549d.a
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo17448f(p192n9.C9487n r4, java.io.IOException r5) {
        /*
            r3 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.AbstractC9133u.m16133g(r4, r0)
            monitor-enter(r3)
            boolean r0 = r5 instanceof okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L26
            r1 = 1
            if (r0 == 0) goto L41
            r0 = r5
            okhttp3.internal.http2.StreamResetException r0 = (okhttp3.internal.http2.StreamResetException) r0     // Catch: java.lang.Throwable -> L26
            okhttp3.internal.http2.ErrorCode r0 = r0.f19118a     // Catch: java.lang.Throwable -> L26
            okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.f19108j     // Catch: java.lang.Throwable -> L26
            if (r0 != r2) goto L28
            int r4 = r3.f18798s     // Catch: java.lang.Throwable -> L26
            int r4 = r4 + r1
            r3.f18798s = r4     // Catch: java.lang.Throwable -> L26
            if (r4 <= r1) goto L4c
            boolean r4 = r3.f18794o     // Catch: java.lang.Throwable -> L26
            r4 = r4 ^ r1
            r3.f18794o = r1     // Catch: java.lang.Throwable -> L26
            int r5 = r3.f18796q     // Catch: java.lang.Throwable -> L26
            int r5 = r5 + r1
            r3.f18796q = r5     // Catch: java.lang.Throwable -> L26
            goto L6a
        L26:
            r4 = move-exception
            goto L75
        L28:
            okhttp3.internal.http2.StreamResetException r5 = (okhttp3.internal.http2.StreamResetException) r5     // Catch: java.lang.Throwable -> L26
            okhttp3.internal.http2.ErrorCode r5 = r5.f19118a     // Catch: java.lang.Throwable -> L26
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.f19109k     // Catch: java.lang.Throwable -> L26
            if (r5 != r0) goto L36
            boolean r4 = r4.isCanceled()     // Catch: java.lang.Throwable -> L26
            if (r4 != 0) goto L4c
        L36:
            boolean r4 = r3.f18794o     // Catch: java.lang.Throwable -> L26
            r4 = r4 ^ r1
            r3.f18794o = r1     // Catch: java.lang.Throwable -> L26
            int r5 = r3.f18796q     // Catch: java.lang.Throwable -> L26
            int r5 = r5 + r1
            r3.f18796q = r5     // Catch: java.lang.Throwable -> L26
            goto L6a
        L41:
            boolean r0 = r3.m17557q()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L4e
            boolean r0 = r5 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L4c
            goto L4e
        L4c:
            r4 = 0
            goto L6a
        L4e:
            boolean r0 = r3.f18794o     // Catch: java.lang.Throwable -> L26
            r0 = r0 ^ r1
            r3.f18794o = r1     // Catch: java.lang.Throwable -> L26
            int r2 = r3.f18797r     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L69
            if (r5 == 0) goto L64
            i9.a0 r4 = r4.m17521l()     // Catch: java.lang.Throwable -> L26
            i9.f0 r2 = r3.mo17446d()     // Catch: java.lang.Throwable -> L26
            r3.m17547g(r4, r2, r5)     // Catch: java.lang.Throwable -> L26
        L64:
            int r4 = r3.f18796q     // Catch: java.lang.Throwable -> L26
            int r4 = r4 + r1
            r3.f18796q = r4     // Catch: java.lang.Throwable -> L26
        L69:
            r4 = r0
        L6a:
            h7.p r5 = p123h7.C8736p.f16368a     // Catch: java.lang.Throwable -> L26
            monitor-exit(r3)
            if (r4 == 0) goto L74
            n9.f r4 = r3.f18792m
            r4.m17465h(r3)
        L74:
            return
        L75:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p192n9.C9488o.mo17448f(n9.n, java.io.IOException):void");
    }

    /* renamed from: g */
    public final void m17547g(C8897a0 client, C8907f0 failedRoute, IOException failure) {
        AbstractC9133u.m16133g(client, "client");
        AbstractC9133u.m16133g(failedRoute, "failedRoute");
        AbstractC9133u.m16133g(failure, "failure");
        if (failedRoute.m15175b().type() != Proxy.Type.DIRECT) {
            C8896a c8896aM15174a = failedRoute.m15174a();
            c8896aM15174a.m14947i().connectFailed(c8896aM15174a.m14950l().m15294r(), failedRoute.m15175b().address(), failure);
        }
        client.m14985u().m17591b(failedRoute);
    }

    /* renamed from: h */
    public final List m17548h() {
        return this.f18800u;
    }

    /* renamed from: i */
    public final AbstractC9479f m17549i() {
        return this.f18792m;
    }

    /* renamed from: j */
    public final long m17550j() {
        return this.f18801v;
    }

    /* renamed from: k */
    public final boolean m17551k() {
        return this.f18794o;
    }

    /* renamed from: l */
    public final int m17552l() {
        return this.f18796q;
    }

    /* renamed from: m */
    public C9561c m17553m() {
        return this.f18787h;
    }

    /* renamed from: n */
    public final void m17554n() {
        synchronized (this) {
            this.f18797r++;
        }
    }

    /* renamed from: o */
    public final boolean m17555o(C8896a address, List list) {
        AbstractC9133u.m16133g(address, "address");
        if (AbstractC9041k.f17265b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f18800u.size() >= this.f18799t || this.f18794o || !mo17446d().m15174a().m14942d(address)) {
            return false;
        }
        if (AbstractC9133u.m16128b(address.m14950l().m15284h(), m17560t().m15174a().m14950l().m15284h())) {
            return true;
        }
        if (this.f18793n == null || list == null || !m17561u(list) || address.m14943e() != C10589d.f20983a || !m17543A(address.m14950l())) {
            return false;
        }
        try {
            C8910h c8910hM14939a = address.m14939a();
            AbstractC9133u.m16130d(c8910hM14939a);
            String strM15284h = address.m14950l().m15284h();
            C9561c c9561cM17553m = m17553m();
            AbstractC9133u.m16130d(c9561cM17553m);
            c8910hM14939a.m15180b(strM15284h, c9561cM17553m.m17902e());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* renamed from: p */
    public final boolean m17556p(boolean z10) {
        long j10;
        if (AbstractC9041k.f17265b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        if (this.f18785f.isClosed() || this.f18786g.isClosed() || this.f18786g.isInputShutdown() || this.f18786g.isOutputShutdown()) {
            return false;
        }
        C9565c c9565c = this.f18793n;
        if (c9565c != null) {
            return c9565c.m17983L(jNanoTime);
        }
        synchronized (this) {
            j10 = jNanoTime - this.f18801v;
        }
        if (j10 < 10000000000L || !z10) {
            return true;
        }
        return AbstractC9041k.m15783m(this.f18786g, this.f18789j);
    }

    /* renamed from: q */
    public final boolean m17557q() {
        return this.f18793n != null;
    }

    /* renamed from: r */
    public final InterfaceC9549d m17558r(C8897a0 client, C9552g chain) {
        AbstractC9133u.m16133g(client, "client");
        AbstractC9133u.m16133g(chain, "chain");
        Socket socket = this.f18786g;
        BufferedSource bufferedSource = this.f18789j;
        BufferedSink bufferedSink = this.f18790k;
        C9565c c9565c = this.f18793n;
        if (c9565c != null) {
            return new C9870o(client, this, chain, c9565c);
        }
        socket.setSoTimeout(chain.m17856k());
        Timeout timeout = bufferedSource.timeout();
        long jM17853h = chain.m17853h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(jM17853h, timeUnit);
        bufferedSink.timeout().timeout(chain.m17855j(), timeUnit);
        return new C9775b(client, this, bufferedSource, bufferedSink);
    }

    /* renamed from: s */
    public final void m17559s() {
        synchronized (this) {
            this.f18795p = true;
            C8736p c8736p = C8736p.f16368a;
        }
    }

    /* renamed from: t */
    public C8907f0 m17560t() {
        return mo17446d();
    }

    public String toString() {
        Object objM17899b;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(mo17446d().m15174a().m14950l().m15284h());
        sb.append(':');
        sb.append(mo17446d().m15174a().m14950l().m15289m());
        sb.append(", proxy=");
        sb.append(mo17446d().m15175b());
        sb.append(" hostAddress=");
        sb.append(mo17446d().m15177d());
        sb.append(" cipherSuite=");
        C9561c c9561c = this.f18787h;
        if (c9561c == null || (objM17899b = c9561c.m17899b()) == null) {
            objM17899b = "none";
        }
        sb.append(objM17899b);
        sb.append(" protocol=");
        sb.append(this.f18788i);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final boolean m17561u(List list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8907f0 c8907f0 = (C8907f0) it.next();
            Proxy.Type type = c8907f0.m15175b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && mo17446d().m15175b().type() == type2 && AbstractC9133u.m16128b(mo17446d().m15177d(), c8907f0.m15177d())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    public final void m17562v(long j10) {
        this.f18801v = j10;
    }

    /* renamed from: w */
    public final void m17563w(boolean z10) {
        this.f18794o = z10;
    }

    /* renamed from: x */
    public Socket m17564x() {
        return this.f18786g;
    }

    /* renamed from: y */
    public final void m17565y() throws SocketException {
        this.f18801v = System.nanoTime();
        Protocol protocol = this.f18788i;
        if (protocol == Protocol.f18941f || protocol == Protocol.f18942g) {
            m17566z();
        }
    }

    /* renamed from: z */
    public final void m17566z() throws SocketException {
        this.f18786g.setSoTimeout(0);
        Object obj = this.f18792m;
        InterfaceC9563a interfaceC9563a = obj instanceof InterfaceC9563a ? (InterfaceC9563a) obj : null;
        if (interfaceC9563a == null) {
            interfaceC9563a = InterfaceC9563a.a.f19119a;
        }
        C9565c c9565cM18007a = new C9565c.a(true, this.f18782c).m18025s(this.f18786g, mo17446d().m15174a().m14950l().m15284h(), this.f18789j, this.f18790k).m18019m(this).m18020n(this.f18791l).m18008b(interfaceC9563a).m18007a();
        this.f18793n = c9565cM18007a;
        this.f18799t = C9565c.f19141C.m18026a().m18439d();
        C9565c.m17951e0(c9565cM18007a, false, 1, null);
    }
}
