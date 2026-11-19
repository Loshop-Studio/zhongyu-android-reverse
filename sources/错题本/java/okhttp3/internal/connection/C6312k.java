package okhttp3.internal.connection;

import android.support.v4.media.AbstractC0037f;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.canhub.cropper.C3433f;
import io.reactivex.annotations.SchedulerSupport;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.C5834o;
import kotlin.text.AbstractC5856q;
import okhttp3.AbstractC6296g;
import okhttp3.AbstractC6326o;
import okhttp3.C6284a;
import okhttp3.C6285a0;
import okhttp3.C6287b0;
import okhttp3.C6289c0;
import okhttp3.C6298h;
import okhttp3.C6299h0;
import okhttp3.C6301i0;
import okhttp3.C6320l;
import okhttp3.C6325n0;
import okhttp3.C6328p;
import okhttp3.C6330r;
import okhttp3.C6338z;
import okhttp3.InterfaceC6292e;
import okhttp3.Protocol;
import okhttp3.internal.http2.ErrorCode;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import p129o2.C6268a;
import p139p7.AbstractC6396c;
import p152r6.InterfaceC6469a;
import p153r7.C6481c;
import p161s7.C6570e;
import p161s7.InterfaceC6568c;
import p170t7.C6605e;
import p170t7.C6607g;
import p178u7.AbstractC6632f;
import p178u7.AbstractC6634h;
import p178u7.C6628b0;
import p178u7.C6641o;
import p178u7.C6642p;
import p178u7.C6649w;
import p178u7.C6650x;
import p185v7.C6685n;
import p204y1.AbstractC6768a;
import p215z7.C6841c;
import retrofit2.C6513p0;

/* renamed from: okhttp3.internal.connection.k */
/* loaded from: classes4.dex */
public final class C6312k extends AbstractC6634h {

    /* renamed from: b */
    public final C6325n0 f10166b;

    /* renamed from: c */
    public Socket f10167c;

    /* renamed from: d */
    public Socket f10168d;

    /* renamed from: e */
    public C6328p f10169e;

    /* renamed from: f */
    public Protocol f10170f;

    /* renamed from: g */
    public C6641o f10171g;

    /* renamed from: h */
    public BufferedSource f10172h;

    /* renamed from: i */
    public BufferedSink f10173i;

    /* renamed from: j */
    public boolean f10174j;

    /* renamed from: k */
    public boolean f10175k;

    /* renamed from: l */
    public int f10176l;

    /* renamed from: m */
    public int f10177m;

    /* renamed from: n */
    public int f10178n;

    /* renamed from: o */
    public int f10179o;

    /* renamed from: p */
    public final ArrayList f10180p;

    /* renamed from: q */
    public long f10181q;

    public C6312k(C6314m connectionPool, C6325n0 route) {
        AbstractC5830k.m5330g(connectionPool, "connectionPool");
        AbstractC5830k.m5330g(route, "route");
        this.f10166b = route;
        this.f10179o = 1;
        this.f10180p = new ArrayList();
        this.f10181q = Long.MAX_VALUE;
    }

    /* renamed from: d */
    public static void m5920d(C6338z c6338z, C6325n0 failedRoute, IOException failure) {
        AbstractC5830k.m5330g(failedRoute, "failedRoute");
        AbstractC5830k.m5330g(failure, "failure");
        if (failedRoute.f10257b.type() != Proxy.Type.DIRECT) {
            C6284a c6284a = failedRoute.f10256a;
            c6284a.f10049h.connectFailed(c6284a.f10050i.m5974h(), failedRoute.f10257b.address(), failure);
        }
        C6268a c6268a = c6338z.f10323A;
        synchronized (c6268a) {
            ((LinkedHashSet) c6268a.f10022b).add(failedRoute);
        }
    }

    @Override // p178u7.AbstractC6634h
    /* renamed from: a */
    public final synchronized void mo5921a(C6641o c6641o, C6628b0 settings) {
        AbstractC5830k.m5330g(settings, "settings");
        this.f10179o = (settings.f11100a & 16) != 0 ? settings.f11101b[4] : Integer.MAX_VALUE;
    }

    @Override // p178u7.AbstractC6634h
    /* renamed from: b */
    public final void mo5922b(C6649w c6649w) {
        c6649w.m6296c(ErrorCode.REFUSED_STREAM, null);
    }

    /* renamed from: c */
    public final void m5923c(int i, int i8, int i9, boolean z8, InterfaceC6292e interfaceC6292e) throws Throwable {
        C6325n0 c6325n0;
        if (this.f10170f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f10166b.f10256a.f10052k;
        C3433f c3433f = new C3433f(list);
        C6284a c6284a = this.f10166b.f10256a;
        if (c6284a.f10044c == null) {
            if (!list.contains(C6320l.f10235f)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f10166b.f10256a.f10050i.f10268d;
            C6685n c6685n = C6685n.f11276a;
            if (!C6685n.f11276a.mo6333h(str)) {
                throw new RouteException(new UnknownServiceException(AbstractC0037f.m86k("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c6284a.f10051j.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        do {
            try {
                C6325n0 c6325n02 = this.f10166b;
                if (c6325n02.f10256a.f10044c != null && c6325n02.f10257b.type() == Proxy.Type.HTTP) {
                    m5925f(i, i8, i9, interfaceC6292e);
                    if (this.f10167c == null) {
                    }
                    c6325n0 = this.f10166b;
                    if (c6325n0.f10256a.f10044c == null && c6325n0.f10257b.type() == Proxy.Type.HTTP && this.f10167c == null) {
                        throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
                    }
                    this.f10181q = System.nanoTime();
                    return;
                }
                m5924e(i, i8, interfaceC6292e);
                m5926g(c3433f, interfaceC6292e);
                InetSocketAddress inetSocketAddress = this.f10166b.f10258c;
                AbstractC5830k.m5330g(inetSocketAddress, "inetSocketAddress");
                c6325n0 = this.f10166b;
                if (c6325n0.f10256a.f10044c == null) {
                }
                this.f10181q = System.nanoTime();
                return;
            } catch (IOException e) {
                Socket socket = this.f10168d;
                if (socket != null) {
                    AbstractC6396c.m6044d(socket);
                }
                Socket socket2 = this.f10167c;
                if (socket2 != null) {
                    AbstractC6396c.m6044d(socket2);
                }
                this.f10168d = null;
                this.f10167c = null;
                this.f10172h = null;
                this.f10173i = null;
                this.f10169e = null;
                this.f10170f = null;
                this.f10171g = null;
                this.f10179o = 1;
                InetSocketAddress inetSocketAddress2 = this.f10166b.f10258c;
                AbstractC5830k.m5330g(inetSocketAddress2, "inetSocketAddress");
                if (routeException == null) {
                    routeException = new RouteException(e);
                } else {
                    routeException.addConnectException(e);
                }
                if (!z8) {
                    throw routeException;
                }
                c3433f.f2593c = true;
                if (!c3433f.f2592b) {
                    throw routeException;
                }
                if (e instanceof ProtocolException) {
                    throw routeException;
                }
                if (e instanceof InterruptedIOException) {
                    throw routeException;
                }
                if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                    throw routeException;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw routeException;
                }
            }
        } while (e instanceof SSLException);
        throw routeException;
    }

    /* renamed from: e */
    public final void m5924e(int i, int i8, InterfaceC6292e interfaceC6292e) throws IOException {
        Socket socketCreateSocket;
        C6325n0 c6325n0 = this.f10166b;
        Proxy proxy = c6325n0.f10257b;
        C6284a c6284a = c6325n0.f10256a;
        Proxy.Type type = proxy.type();
        int i9 = type == null ? -1 : AbstractC6311j.f10165a[type.ordinal()];
        if (i9 == 1 || i9 == 2) {
            socketCreateSocket = c6284a.f10043b.createSocket();
            AbstractC5830k.m5327d(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f10167c = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.f10166b.f10258c;
        AbstractC5830k.m5330g(inetSocketAddress, "inetSocketAddress");
        socketCreateSocket.setSoTimeout(i8);
        try {
            C6685n c6685n = C6685n.f11276a;
            C6685n.f11276a.mo6336e(socketCreateSocket, this.f10166b.f10258c, i);
            try {
                this.f10172h = Okio.buffer(Okio.source(socketCreateSocket));
                this.f10173i = Okio.buffer(Okio.sink(socketCreateSocket));
            } catch (NullPointerException e) {
                if (AbstractC5830k.m5325b(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e4) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f10166b.f10258c);
            connectException.initCause(e4);
            throw connectException;
        }
    }

    /* renamed from: f */
    public final void m5925f(int i, int i8, int i9, InterfaceC6292e interfaceC6292e) throws IOException {
        C6287b0 c6287b0 = new C6287b0();
        C6325n0 c6325n0 = this.f10166b;
        C6330r url = c6325n0.f10256a.f10050i;
        AbstractC5830k.m5330g(url, "url");
        c6287b0.f10056a = url;
        c6287b0.m5886d("CONNECT", null);
        C6284a c6284a = c6325n0.f10256a;
        c6287b0.m5885c(HttpHeaders.HOST, AbstractC6396c.m6061u(c6284a.f10050i, true));
        c6287b0.m5885c("Proxy-Connection", "Keep-Alive");
        c6287b0.m5885c(HttpHeaders.USER_AGENT, "okhttp/4.12.0");
        C6289c0 c6289c0M5884b = c6287b0.m5884b();
        C5834o c5834o = new C5834o(2, false);
        Protocol protocol = Protocol.HTTP_1_1;
        AbstractC5830k.m5330g(protocol, "protocol");
        AbstractC6326o.m5952b("Proxy-Authenticate");
        AbstractC6326o.m5953c("OkHttp-Preemptive", "Proxy-Authenticate");
        c5834o.m5351i("Proxy-Authenticate");
        c5834o.m5345c("Proxy-Authenticate", "OkHttp-Preemptive");
        c5834o.m5348f();
        c6284a.f10047f.getClass();
        C6330r c6330r = c6289c0M5884b.f10075a;
        m5924e(i, i8, interfaceC6292e);
        String str = "CONNECT " + AbstractC6396c.m6061u(c6330r, true) + " HTTP/1.1";
        BufferedSource bufferedSource = this.f10172h;
        AbstractC5830k.m5327d(bufferedSource);
        BufferedSink bufferedSink = this.f10173i;
        AbstractC5830k.m5327d(bufferedSink);
        C6607g c6607g = new C6607g(null, this, bufferedSource, bufferedSink);
        Timeout timeout = bufferedSource.getTimeout();
        long j7 = i8;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(j7, timeUnit);
        bufferedSink.getTimeout().timeout(i9, timeUnit);
        c6607g.m6253k(c6289c0M5884b.f10077c, str);
        c6607g.mo6203a();
        C6299h0 c6299h0Mo6209g = c6607g.mo6209g(false);
        AbstractC5830k.m5327d(c6299h0Mo6209g);
        c6299h0Mo6209g.f10091a = c6289c0M5884b;
        C6301i0 c6301i0M5897a = c6299h0Mo6209g.m5897a();
        int i10 = c6301i0M5897a.f10107d;
        long jM6049i = AbstractC6396c.m6049i(c6301i0M5897a);
        if (jM6049i != -1) {
            C6605e c6605eM6252j = c6607g.m6252j(jM6049i);
            AbstractC6396c.m6059s(c6605eM6252j, Integer.MAX_VALUE);
            c6605eM6252j.close();
        }
        if (i10 != 200) {
            if (i10 != 407) {
                throw new IOException(AbstractC0037f.m81f(i10, "Unexpected response code for CONNECT: "));
            }
            c6284a.f10047f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!bufferedSource.getBuffer().exhausted() || !bufferedSink.getBuffer().exhausted()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* renamed from: g */
    public final void m5926g(C3433f c3433f, InterfaceC6292e interfaceC6292e) throws Throwable {
        SSLSocket sSLSocket;
        Protocol protocolM5876a;
        final C6284a c6284a = this.f10166b.f10256a;
        SSLSocketFactory sSLSocketFactory = c6284a.f10044c;
        if (sSLSocketFactory == null) {
            List list = c6284a.f10051j;
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(protocol)) {
                this.f10168d = this.f10167c;
                this.f10170f = Protocol.HTTP_1_1;
                return;
            } else {
                this.f10168d = this.f10167c;
                this.f10170f = protocol;
                m5931l();
                return;
            }
        }
        SSLSocket sSLSocket2 = null;
        String strMo6332f = null;
        try {
            AbstractC5830k.m5327d(sSLSocketFactory);
            Socket socket = this.f10167c;
            C6330r c6330r = c6284a.f10050i;
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, c6330r.f10268d, c6330r.f10269e, true);
            AbstractC5830k.m5328e(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            sSLSocket = (SSLSocket) socketCreateSocket;
        } catch (Throwable th) {
            th = th;
        }
        try {
            C6320l c6320lM2463a = c3433f.m2463a(sSLSocket);
            if (c6320lM2463a.f10237b) {
                C6685n c6685n = C6685n.f11276a;
                C6685n.f11276a.mo6331d(sSLSocket, c6284a.f10050i.f10268d, c6284a.f10051j);
            }
            sSLSocket.startHandshake();
            SSLSession sslSocketSession = sSLSocket.getSession();
            AbstractC5830k.m5329f(sslSocketSession, "sslSocketSession");
            final C6328p c6328pM5955e = AbstractC6326o.m5955e(sslSocketSession);
            HostnameVerifier hostnameVerifier = c6284a.f10045d;
            AbstractC5830k.m5327d(hostnameVerifier);
            if (!hostnameVerifier.verify(c6284a.f10050i.f10268d, sslSocketSession)) {
                List listM5961a = c6328pM5955e.m5961a();
                if (listM5961a.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c6284a.f10050i.f10268d + " not verified (no certificates)");
                }
                Object obj = listM5961a.get(0);
                AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(c6284a.f10050i.f10268d);
                sb.append(" not verified:\n              |    certificate: ");
                C6298h c6298h = C6298h.f10088c;
                sb.append(AbstractC6296g.m5893a(x509Certificate));
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                sb.append(AbstractC5805t.m5240t0(C6841c.m6500a(x509Certificate, 7), C6841c.m6500a(x509Certificate, 2)));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(AbstractC5856q.m5405q(sb.toString()));
            }
            final C6298h c6298h2 = c6284a.f10046e;
            AbstractC5830k.m5327d(c6298h2);
            this.f10169e = new C6328p(c6328pM5955e.f10259a, c6328pM5955e.f10260b, c6328pM5955e.f10261c, new InterfaceC6469a() { // from class: okhttp3.internal.connection.RealConnection$connectTls$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                @NotNull
                public final List<Certificate> invoke() {
                    AbstractC6768a abstractC6768a = c6298h2.f10090b;
                    AbstractC5830k.m5327d(abstractC6768a);
                    return abstractC6768a.mo6413e(c6284a.f10050i.f10268d, c6328pM5955e.m5961a());
                }
            });
            c6298h2.m5895b(c6284a.f10050i.f10268d, new InterfaceC6469a() { // from class: okhttp3.internal.connection.RealConnection$connectTls$2
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                @NotNull
                public final List<X509Certificate> invoke() {
                    C6328p c6328p = this.this$0.f10169e;
                    AbstractC5830k.m5327d(c6328p);
                    List<Certificate> listM5961a2 = c6328p.m5961a();
                    ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(listM5961a2, 10));
                    for (Certificate certificate : listM5961a2) {
                        AbstractC5830k.m5328e(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                        arrayList.add((X509Certificate) certificate);
                    }
                    return arrayList;
                }
            });
            if (c6320lM2463a.f10237b) {
                C6685n c6685n2 = C6685n.f11276a;
                strMo6332f = C6685n.f11276a.mo6332f(sSLSocket);
            }
            this.f10168d = sSLSocket;
            this.f10172h = Okio.buffer(Okio.source(sSLSocket));
            this.f10173i = Okio.buffer(Okio.sink(sSLSocket));
            if (strMo6332f != null) {
                Protocol.Companion.getClass();
                protocolM5876a = C6285a0.m5876a(strMo6332f);
            } else {
                protocolM5876a = Protocol.HTTP_1_1;
            }
            this.f10170f = protocolM5876a;
            C6685n c6685n3 = C6685n.f11276a;
            C6685n.f11276a.mo6360a(sSLSocket);
            if (this.f10170f == Protocol.HTTP_2) {
                m5931l();
            }
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                C6685n c6685n4 = C6685n.f11276a;
                C6685n.f11276a.mo6360a(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                AbstractC6396c.m6044d(sSLSocket2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m5927h(okhttp3.C6284a r10, java.util.List r11) {
        /*
            r9 = this;
            okhttp3.r r0 = r10.f10050i
            byte[] r1 = p139p7.AbstractC6396c.f10486a
            java.util.ArrayList r1 = r9.f10180p
            int r1 = r1.size()
            int r2 = r9.f10179o
            r3 = 0
            if (r1 >= r2) goto Lbf
            boolean r1 = r9.f10174j
            if (r1 == 0) goto L15
            goto Lbf
        L15:
            okhttp3.n0 r1 = r9.f10166b
            okhttp3.a r2 = r1.f10256a
            okhttp3.a r4 = r1.f10256a
            boolean r2 = r2.m5875a(r10)
            if (r2 != 0) goto L23
            goto Lbf
        L23:
            java.lang.String r2 = r0.f10268d
            java.lang.String r5 = r0.f10268d
            okhttp3.r r6 = r4.f10050i
            java.lang.String r6 = r6.f10268d
            boolean r2 = kotlin.jvm.internal.AbstractC5830k.m5325b(r2, r6)
            r6 = 1
            if (r2 == 0) goto L33
            return r6
        L33:
            u7.o r2 = r9.f10171g
            if (r2 != 0) goto L39
            goto Lbf
        L39:
            if (r11 == 0) goto Lbf
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L43
            goto Lbf
        L43:
            java.util.Iterator r11 = r11.iterator()
        L47:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto Lbf
            java.lang.Object r2 = r11.next()
            okhttp3.n0 r2 = (okhttp3.C6325n0) r2
            java.net.Proxy r7 = r2.f10257b
            java.net.Proxy$Type r7 = r7.type()
            java.net.Proxy$Type r8 = java.net.Proxy.Type.DIRECT
            if (r7 != r8) goto L47
            java.net.Proxy r7 = r1.f10257b
            java.net.Proxy$Type r7 = r7.type()
            if (r7 != r8) goto L47
            java.net.InetSocketAddress r7 = r1.f10258c
            java.net.InetSocketAddress r2 = r2.f10258c
            boolean r2 = kotlin.jvm.internal.AbstractC5830k.m5325b(r7, r2)
            if (r2 == 0) goto L47
            javax.net.ssl.HostnameVerifier r11 = r10.f10045d
            z7.c r1 = p215z7.C6841c.f11594a
            if (r11 == r1) goto L76
            goto Lbf
        L76:
            byte[] r11 = p139p7.AbstractC6396c.f10486a
            okhttp3.r r11 = r4.f10050i
            int r0 = r0.f10269e
            int r1 = r11.f10269e
            if (r0 == r1) goto L81
            goto Lbf
        L81:
            java.lang.String r11 = r11.f10268d
            boolean r11 = kotlin.jvm.internal.AbstractC5830k.m5325b(r5, r11)
            if (r11 == 0) goto L8a
            goto Lad
        L8a:
            boolean r11 = r9.f10175k
            if (r11 != 0) goto Lbf
            okhttp3.p r11 = r9.f10169e
            if (r11 == 0) goto Lbf
            java.util.List r11 = r11.m5961a()
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto Lbf
            java.lang.Object r11 = r11.get(r3)
            java.lang.String r0 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.AbstractC5830k.m5328e(r11, r0)
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11
            boolean r11 = p215z7.C6841c.m6501b(r5, r11)
            if (r11 == 0) goto Lbf
        Lad:
            okhttp3.h r10 = r10.f10046e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lbf
            kotlin.jvm.internal.AbstractC5830k.m5327d(r10)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lbf
            okhttp3.p r11 = r9.f10169e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lbf
            kotlin.jvm.internal.AbstractC5830k.m5327d(r11)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lbf
            java.util.List r11 = r11.m5961a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lbf
            r10.m5894a(r5, r11)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lbf
            return r6
        Lbf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C6312k.m5927h(okhttp3.a, java.util.List):boolean");
    }

    /* renamed from: i */
    public final boolean m5928i(boolean z8) throws SocketException {
        long j7;
        byte[] bArr = AbstractC6396c.f10486a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f10167c;
        AbstractC5830k.m5327d(socket);
        Socket socket2 = this.f10168d;
        AbstractC5830k.m5327d(socket2);
        AbstractC5830k.m5327d(this.f10172h);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C6641o c6641o = this.f10171g;
        if (c6641o != null) {
            synchronized (c6641o) {
                if (c6641o.f11149f) {
                    return false;
                }
                if (c6641o.f11157n < c6641o.f11156m) {
                    if (jNanoTime >= c6641o.f11158o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j7 = jNanoTime - this.f10181q;
        }
        if (j7 < 10000000000L || !z8) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !r4.exhausted();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* renamed from: j */
    public final InterfaceC6568c m5929j(C6338z c6338z, C6570e c6570e) throws SocketException {
        int i = c6570e.f10971g;
        Socket socket = this.f10168d;
        AbstractC5830k.m5327d(socket);
        BufferedSource bufferedSource = this.f10172h;
        AbstractC5830k.m5327d(bufferedSource);
        BufferedSink bufferedSink = this.f10173i;
        AbstractC5830k.m5327d(bufferedSink);
        C6641o c6641o = this.f10171g;
        if (c6641o != null) {
            return new C6642p(c6338z, this, c6570e, c6641o);
        }
        socket.setSoTimeout(i);
        Timeout timeout = bufferedSource.getTimeout();
        long j7 = i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(j7, timeUnit);
        bufferedSink.getTimeout().timeout(c6570e.f10972h, timeUnit);
        return new C6607g(c6338z, this, bufferedSource, bufferedSink);
    }

    /* renamed from: k */
    public final synchronized void m5930k() {
        this.f10174j = true;
    }

    /* renamed from: l */
    public final void m5931l() throws SocketException {
        Socket socket = this.f10168d;
        AbstractC5830k.m5327d(socket);
        BufferedSource bufferedSource = this.f10172h;
        AbstractC5830k.m5327d(bufferedSource);
        BufferedSink bufferedSink = this.f10173i;
        AbstractC5830k.m5327d(bufferedSink);
        socket.setSoTimeout(0);
        C6481c c6481c = C6481c.f10656h;
        C6513p0 c6513p0 = new C6513p0(c6481c);
        String peerName = this.f10166b.f10256a.f10050i.f10268d;
        AbstractC5830k.m5330g(peerName, "peerName");
        c6513p0.f10771b = socket;
        String str = AbstractC6396c.f10493h + ' ' + peerName;
        AbstractC5830k.m5330g(str, "<set-?>");
        c6513p0.f10772c = str;
        c6513p0.f10773d = bufferedSource;
        c6513p0.f10774e = bufferedSink;
        c6513p0.f10775f = this;
        C6641o c6641o = new C6641o(c6513p0);
        this.f10171g = c6641o;
        C6628b0 c6628b0 = C6641o.f11143z;
        this.f10179o = (c6628b0.f11100a & 16) != 0 ? c6628b0.f11101b[4] : Integer.MAX_VALUE;
        C6650x c6650x = c6641o.f11166w;
        synchronized (c6650x) {
            try {
                if (c6650x.f11216d) {
                    throw new IOException("closed");
                }
                Logger logger = C6650x.f11212f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC6396c.m6047g(">> CONNECTION " + AbstractC6632f.f11119a.hex(), new Object[0]));
                }
                c6650x.f11213a.write(AbstractC6632f.f11119a);
                c6650x.f11213a.flush();
            } finally {
            }
        }
        C6650x c6650x2 = c6641o.f11166w;
        C6628b0 settings = c6641o.f11159p;
        synchronized (c6650x2) {
            try {
                AbstractC5830k.m5330g(settings, "settings");
                if (c6650x2.f11216d) {
                    throw new IOException("closed");
                }
                c6650x2.m6306c(0, Integer.bitCount(settings.f11100a) * 6, 4, 0);
                int i = 0;
                while (i < 10) {
                    boolean z8 = true;
                    if (((1 << i) & settings.f11100a) == 0) {
                        z8 = false;
                    }
                    if (z8) {
                        c6650x2.f11213a.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                        c6650x2.f11213a.writeInt(settings.f11101b[i]);
                    }
                    i++;
                }
                c6650x2.f11213a.flush();
            } finally {
            }
        }
        if (c6641o.f11159p.m6262a() != 65535) {
            c6641o.f11166w.m6311h(0, r1 - 65535);
        }
        c6481c.m6136e().m6129b(new C6313l(c6641o.f11167x, c6641o.f11146c, 1), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        C6325n0 c6325n0 = this.f10166b;
        sb.append(c6325n0.f10256a.f10050i.f10268d);
        sb.append(':');
        sb.append(c6325n0.f10256a.f10050i.f10269e);
        sb.append(", proxy=");
        sb.append(c6325n0.f10257b);
        sb.append(" hostAddress=");
        sb.append(c6325n0.f10258c);
        sb.append(" cipherSuite=");
        C6328p c6328p = this.f10169e;
        if (c6328p == null || (obj = c6328p.f10260b) == null) {
            obj = SchedulerSupport.NONE;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f10170f);
        sb.append('}');
        return sb.toString();
    }
}
