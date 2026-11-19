package p093k5;

import io.reactivex.annotations.SchedulerSupport;
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
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C7527c;
import okhttp3.Protocol;
import okhttp3.internal.http2.C7531c;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.InterfaceC7529a;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Timeout;
import p058f5.C6355a;
import p058f5.C6356a0;
import p058f5.C6366f0;
import p058f5.C6369h;
import p058f5.C6384w;
import p058f5.InterfaceC6371j;
import p065g5.AbstractC6427k;
import p086j5.C6601d;
import p102l5.C7353g;
import p102l5.InterfaceC7350d;
import p109m5.C7407b;
import p116n5.C7481o;
import p116n5.C7482p;
import p116n5.C7485s;
import p165u5.C7778d;

/* renamed from: k5.o */
/* loaded from: classes4.dex */
public final class C6692o extends C7531c.c implements InterfaceC6371j, InterfaceC7350d.a {

    /* renamed from: w */
    public static final a f8911w = new a(null);

    /* renamed from: c */
    public final C6601d f8912c;

    /* renamed from: d */
    public final C6693p f8913d;

    /* renamed from: e */
    public final C6366f0 f8914e;

    /* renamed from: f */
    public final Socket f8915f;

    /* renamed from: g */
    public final Socket f8916g;

    /* renamed from: h */
    public final C7527c f8917h;

    /* renamed from: i */
    public final Protocol f8918i;

    /* renamed from: j */
    public final BufferedSource f8919j;

    /* renamed from: k */
    public final BufferedSink f8920k;

    /* renamed from: l */
    public final int f8921l;

    /* renamed from: m */
    public final AbstractC6683f f8922m;

    /* renamed from: n */
    public C7531c f8923n;

    /* renamed from: o */
    public boolean f8924o;

    /* renamed from: p */
    public boolean f8925p;

    /* renamed from: q */
    public int f8926q;

    /* renamed from: r */
    public int f8927r;

    /* renamed from: s */
    public int f8928s;

    /* renamed from: t */
    public int f8929t;

    /* renamed from: u */
    public final List f8930u;

    /* renamed from: v */
    public long f8931v;

    /* renamed from: k5.o$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C6692o(C6601d taskRunner, C6693p connectionPool, C6366f0 route, Socket rawSocket, Socket socket, C7527c c7527c, Protocol protocol, BufferedSource source, BufferedSink sink, int i6, AbstractC6683f connectionListener) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(rawSocket, "rawSocket");
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(connectionListener, "connectionListener");
        this.f8912c = taskRunner;
        this.f8913d = connectionPool;
        this.f8914e = route;
        this.f8915f = rawSocket;
        this.f8916g = socket;
        this.f8917h = c7527c;
        this.f8918i = protocol;
        this.f8919j = source;
        this.f8920k = sink;
        this.f8921l = i6;
        this.f8922m = connectionListener;
        this.f8929t = 1;
        this.f8930u = new ArrayList();
        this.f8931v = Long.MAX_VALUE;
    }

    /* renamed from: A */
    public final boolean m7810A(C6384w c6384w) {
        C7527c c7527c;
        if (!AbstractC6427k.f8100b || Thread.holdsLock(this)) {
            C6384w c6384wM6486l = mo7714e().m6713a().m6486l();
            if (c6384w.m6828m() != c6384wM6486l.m6828m()) {
                return false;
            }
            if (Intrinsics.areEqual(c6384w.m6823h(), c6384wM6486l.m6823h())) {
                return true;
            }
            return (this.f8925p || (c7527c = this.f8917h) == null || !m7813f(c6384w, c7527c)) ? false : true;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    @Override // okhttp3.internal.http2.C7531c.c
    /* renamed from: a */
    public void mo7811a(C7531c connection, C7485s settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        synchronized (this) {
            try {
                int i6 = this.f8929t;
                int iM8606d = settings.m8606d();
                this.f8929t = iM8606d;
                if (iM8606d < i6) {
                    this.f8913d.m7842i(mo7714e().m6713a());
                } else if (iM8606d > i6) {
                    this.f8913d.m7841h();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p102l5.InterfaceC7350d.a
    /* renamed from: b */
    public void mo7711b() {
        synchronized (this) {
            this.f8924o = true;
            Unit unit = Unit.INSTANCE;
        }
        this.f8922m.m7732h(this);
    }

    @Override // okhttp3.internal.http2.C7531c.c
    /* renamed from: c */
    public void mo7812c(C7482p stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.m8559e(ErrorCode.f9886j, null);
    }

    @Override // p102l5.InterfaceC7350d.a
    public void cancel() throws IOException {
        AbstractC6427k.m7020h(this.f8915f);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    @Override // p102l5.InterfaceC7350d.a
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo7713d(p093k5.C6691n r4, java.io.IOException r5) {
        /*
            r3 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            monitor-enter(r3)
            boolean r0 = r5 instanceof okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L26
            r1 = 1
            if (r0 == 0) goto L41
            r0 = r5
            okhttp3.internal.http2.StreamResetException r0 = (okhttp3.internal.http2.StreamResetException) r0     // Catch: java.lang.Throwable -> L26
            okhttp3.internal.http2.ErrorCode r0 = r0.errorCode     // Catch: java.lang.Throwable -> L26
            okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.f9886j     // Catch: java.lang.Throwable -> L26
            if (r0 != r2) goto L28
            int r4 = r3.f8928s     // Catch: java.lang.Throwable -> L26
            int r4 = r4 + r1
            r3.f8928s = r4     // Catch: java.lang.Throwable -> L26
            if (r4 <= r1) goto L4c
            boolean r4 = r3.f8924o     // Catch: java.lang.Throwable -> L26
            r4 = r4 ^ r1
            r3.f8924o = r1     // Catch: java.lang.Throwable -> L26
            int r5 = r3.f8926q     // Catch: java.lang.Throwable -> L26
            int r5 = r5 + r1
            r3.f8926q = r5     // Catch: java.lang.Throwable -> L26
            goto L6a
        L26:
            r4 = move-exception
            goto L75
        L28:
            okhttp3.internal.http2.StreamResetException r5 = (okhttp3.internal.http2.StreamResetException) r5     // Catch: java.lang.Throwable -> L26
            okhttp3.internal.http2.ErrorCode r5 = r5.errorCode     // Catch: java.lang.Throwable -> L26
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.f9887k     // Catch: java.lang.Throwable -> L26
            if (r5 != r0) goto L36
            boolean r4 = r4.isCanceled()     // Catch: java.lang.Throwable -> L26
            if (r4 != 0) goto L4c
        L36:
            boolean r4 = r3.f8924o     // Catch: java.lang.Throwable -> L26
            r4 = r4 ^ r1
            r3.f8924o = r1     // Catch: java.lang.Throwable -> L26
            int r5 = r3.f8926q     // Catch: java.lang.Throwable -> L26
            int r5 = r5 + r1
            r3.f8926q = r5     // Catch: java.lang.Throwable -> L26
            goto L6a
        L41:
            boolean r0 = r3.m7824q()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L4e
            boolean r0 = r5 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L4c
            goto L4e
        L4c:
            r4 = 0
            goto L6a
        L4e:
            boolean r0 = r3.f8924o     // Catch: java.lang.Throwable -> L26
            r0 = r0 ^ r1
            r3.f8924o = r1     // Catch: java.lang.Throwable -> L26
            int r2 = r3.f8927r     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L69
            if (r5 == 0) goto L64
            f5.a0 r4 = r4.m7788l()     // Catch: java.lang.Throwable -> L26
            f5.f0 r2 = r3.mo7714e()     // Catch: java.lang.Throwable -> L26
            r3.m7814g(r4, r2, r5)     // Catch: java.lang.Throwable -> L26
        L64:
            int r4 = r3.f8926q     // Catch: java.lang.Throwable -> L26
            int r4 = r4 + r1
            r3.f8926q = r4     // Catch: java.lang.Throwable -> L26
        L69:
            r4 = r0
        L6a:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L26
            monitor-exit(r3)
            if (r4 == 0) goto L74
            k5.f r4 = r3.f8922m
            r4.m7732h(r3)
        L74:
            return
        L75:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p093k5.C6692o.mo7713d(k5.n, java.io.IOException):void");
    }

    @Override // p102l5.InterfaceC7350d.a
    /* renamed from: e */
    public C6366f0 mo7714e() {
        return this.f8914e;
    }

    /* renamed from: f */
    public final boolean m7813f(C6384w c6384w, C7527c c7527c) {
        List listM8721e = c7527c.m8721e();
        if (!listM8721e.isEmpty()) {
            C7778d c7778d = C7778d.f10303a;
            String strM6823h = c6384w.m6823h();
            Object obj = listM8721e.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (c7778d.m9313e(strM6823h, (X509Certificate) obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final void m7814g(C6356a0 client, C6366f0 failedRoute, IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.m6714b().type() != Proxy.Type.DIRECT) {
            C6355a c6355aM6713a = failedRoute.m6713a();
            c6355aM6713a.m6483i().connectFailed(c6355aM6713a.m6486l().m6833r(), failedRoute.m6714b().address(), failure);
        }
        client.m6521u().m7858b(failedRoute);
    }

    /* renamed from: h */
    public final List m7815h() {
        return this.f8930u;
    }

    /* renamed from: i */
    public final AbstractC6683f m7816i() {
        return this.f8922m;
    }

    /* renamed from: j */
    public final long m7817j() {
        return this.f8931v;
    }

    /* renamed from: k */
    public final boolean m7818k() {
        return this.f8924o;
    }

    /* renamed from: l */
    public final int m7819l() {
        return this.f8926q;
    }

    /* renamed from: m */
    public C7527c m7820m() {
        return this.f8917h;
    }

    /* renamed from: n */
    public final void m7821n() {
        synchronized (this) {
            this.f8927r++;
        }
    }

    /* renamed from: o */
    public final boolean m7822o(C6355a address, List list) {
        Intrinsics.checkNotNullParameter(address, "address");
        if (AbstractC6427k.f8100b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f8930u.size() >= this.f8929t || this.f8924o || !mo7714e().m6713a().m6478d(address)) {
            return false;
        }
        if (Intrinsics.areEqual(address.m6486l().m6823h(), m7827t().m6713a().m6486l().m6823h())) {
            return true;
        }
        if (this.f8923n == null || list == null || !m7828u(list) || address.m6479e() != C7778d.f10303a || !m7810A(address.m6486l())) {
            return false;
        }
        try {
            C6369h c6369hM6475a = address.m6475a();
            Intrinsics.checkNotNull(c6369hM6475a);
            String strM6823h = address.m6486l().m6823h();
            C7527c c7527cM7820m = m7820m();
            Intrinsics.checkNotNull(c7527cM7820m);
            c6369hM6475a.m6719b(strM6823h, c7527cM7820m.m8721e());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* renamed from: p */
    public final boolean m7823p(boolean z6) {
        long j6;
        if (AbstractC6427k.f8100b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        if (this.f8915f.isClosed() || this.f8916g.isClosed() || this.f8916g.isInputShutdown() || this.f8916g.isOutputShutdown()) {
            return false;
        }
        C7531c c7531c = this.f8923n;
        if (c7531c != null) {
            return c7531c.m8805P(jNanoTime);
        }
        synchronized (this) {
            j6 = jNanoTime - this.f8931v;
        }
        if (j6 < 10000000000L || !z6) {
            return true;
        }
        return AbstractC6427k.m7025m(this.f8916g, this.f8919j);
    }

    /* renamed from: q */
    public final boolean m7824q() {
        return this.f8923n != null;
    }

    /* renamed from: r */
    public final InterfaceC7350d m7825r(C6356a0 client, C7353g chain) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f8916g;
        BufferedSource bufferedSource = this.f8919j;
        BufferedSink bufferedSink = this.f8920k;
        C7531c c7531c = this.f8923n;
        if (c7531c != null) {
            return new C7481o(client, this, chain, c7531c);
        }
        socket.setSoTimeout(chain.m8351k());
        Timeout timeout = bufferedSource.getTimeout();
        long jM8348h = chain.m8348h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(jM8348h, timeUnit);
        bufferedSink.getTimeout().timeout(chain.m8350j(), timeUnit);
        return new C7407b(client, this, bufferedSource, bufferedSink);
    }

    /* renamed from: s */
    public final void m7826s() {
        synchronized (this) {
            this.f8925p = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: t */
    public C6366f0 m7827t() {
        return mo7714e();
    }

    public String toString() {
        Object objM8718b;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(mo7714e().m6713a().m6486l().m6823h());
        sb.append(':');
        sb.append(mo7714e().m6713a().m6486l().m6828m());
        sb.append(", proxy=");
        sb.append(mo7714e().m6714b());
        sb.append(" hostAddress=");
        sb.append(mo7714e().m6716d());
        sb.append(" cipherSuite=");
        C7527c c7527c = this.f8917h;
        if (c7527c == null || (objM8718b = c7527c.m8718b()) == null) {
            objM8718b = SchedulerSupport.NONE;
        }
        sb.append(objM8718b);
        sb.append(" protocol=");
        sb.append(this.f8918i);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final boolean m7828u(List list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6366f0 c6366f0 = (C6366f0) it.next();
            Proxy.Type type = c6366f0.m6714b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && mo7714e().m6714b().type() == type2 && Intrinsics.areEqual(mo7714e().m6716d(), c6366f0.m6716d())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    public final void m7829v(long j6) {
        this.f8931v = j6;
    }

    /* renamed from: w */
    public final void m7830w(boolean z6) {
        this.f8924o = z6;
    }

    /* renamed from: x */
    public Socket m7831x() {
        return this.f8916g;
    }

    /* renamed from: y */
    public final void m7832y() throws SocketException {
        this.f8931v = System.nanoTime();
        Protocol protocol = this.f8918i;
        if (protocol == Protocol.f9719f || protocol == Protocol.f9720g) {
            m7833z();
        }
    }

    /* renamed from: z */
    public final void m7833z() throws SocketException {
        this.f8916g.setSoTimeout(0);
        Object obj = this.f8922m;
        InterfaceC7529a interfaceC7529a = obj instanceof InterfaceC7529a ? (InterfaceC7529a) obj : null;
        if (interfaceC7529a == null) {
            interfaceC7529a = InterfaceC7529a.a.f9897a;
        }
        C7531c c7531cM8826a = new C7531c.a(true, this.f8912c).m8844s(this.f8916g, mo7714e().m6713a().m6486l().m6823h(), this.f8919j, this.f8920k).m8838m(this).m8839n(this.f8921l).m8827b(interfaceC7529a).m8826a();
        this.f8923n = c7531cM8826a;
        this.f8929t = C7531c.f9919C.m8845a().m8606d();
        C7531c.m8771i0(c7531cM8826a, false, 1, null);
    }
}
