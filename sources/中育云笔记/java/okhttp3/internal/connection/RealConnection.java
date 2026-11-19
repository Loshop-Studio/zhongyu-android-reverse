package okhttp3.internal.connection;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import je.AbstractC9735o;
import je.C9720a;
import je.C9721a0;
import je.C9738r;
import je.C9742v;
import je.C9743w;
import je.C9745y;
import je.InterfaceC9725e;
import je.InterfaceC9728h;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import ne.C10415e;
import okhttp3.C10496b;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.internal.http2.C10501b;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Timeout;
import p181hd.InterfaceC9529a;
import p281oe.C10484b;
import p281oe.C10487e;
import p281oe.C10488f;
import p310qd.AbstractC10812s;
import p310qd.AbstractC10819z;
import p311qe.C10821b;
import p325rc.AbstractC10980x;
import pe.C10680g;
import pe.InterfaceC10677d;
import re.C10996c;
import re.C10997d;
import re.C11000g;
import se.C11192j;
import ve.AbstractC11618c;
import ve.C11619d;

/* loaded from: classes6.dex */
public final class RealConnection extends C10501b.c implements InterfaceC9728h {

    /* renamed from: t */
    public static final C10497a f25112t = new C10497a(null);

    /* renamed from: c */
    public final C10488f f25113c;

    /* renamed from: d */
    public final C9721a0 f25114d;

    /* renamed from: e */
    public Socket f25115e;

    /* renamed from: f */
    public Socket f25116f;

    /* renamed from: g */
    public Handshake f25117g;

    /* renamed from: h */
    public Protocol f25118h;

    /* renamed from: i */
    public C10501b f25119i;

    /* renamed from: j */
    public BufferedSource f25120j;

    /* renamed from: k */
    public BufferedSink f25121k;

    /* renamed from: l */
    public boolean f25122l;

    /* renamed from: m */
    public boolean f25123m;

    /* renamed from: n */
    public int f25124n;

    /* renamed from: o */
    public int f25125o;

    /* renamed from: p */
    public int f25126p;

    /* renamed from: q */
    public int f25127q;

    /* renamed from: r */
    public final List f25128r;

    /* renamed from: s */
    public long f25129s;

    /* renamed from: okhttp3.internal.connection.RealConnection$a */
    public static final class C10497a {
        public /* synthetic */ C10497a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C10497a() {
        }
    }

    /* renamed from: okhttp3.internal.connection.RealConnection$b */
    public /* synthetic */ class C10498b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25130a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25130a = iArr;
        }
    }

    public RealConnection(C10488f connectionPool, C9721a0 route) {
        AbstractC9979u.m20294g(connectionPool, "connectionPool");
        AbstractC9979u.m20294g(route, "route");
        this.f25113c = connectionPool;
        this.f25114d = route;
        this.f25127q = 1;
        this.f25128r = new ArrayList();
        this.f25129s = Long.MAX_VALUE;
    }

    /* renamed from: A */
    public C9721a0 m21984A() {
        return this.f25114d;
    }

    /* renamed from: B */
    public final boolean m21985B(List list) {
        List<C9721a0> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (C9721a0 c9721a0 : list2) {
            Proxy.Type type = c9721a0.m19298b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f25114d.m19298b().type() == type2 && AbstractC9979u.m20289b(this.f25114d.m19300d(), c9721a0.m19300d())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    public final void m21986C(long j10) {
        this.f25129s = j10;
    }

    /* renamed from: D */
    public final void m21987D(boolean z10) {
        this.f25122l = z10;
    }

    /* renamed from: E */
    public Socket m21988E() {
        Socket socket = this.f25116f;
        AbstractC9979u.m20291d(socket);
        return socket;
    }

    /* renamed from: F */
    public final void m21989F(int i10) throws SocketException {
        Socket socket = this.f25116f;
        AbstractC9979u.m20291d(socket);
        BufferedSource bufferedSource = this.f25120j;
        AbstractC9979u.m20291d(bufferedSource);
        BufferedSink bufferedSink = this.f25121k;
        AbstractC9979u.m20291d(bufferedSink);
        socket.setSoTimeout(0);
        C10501b c10501bM22104a = new C10501b.a(true, C10415e.f24784i).m22120q(socket, this.f25114d.m19297a().m19296l().m19419i(), bufferedSource, bufferedSink).m22114k(this).m22115l(i10).m22104a();
        this.f25119i = c10501bM22104a;
        this.f25127q = C10501b.f25176E.m22121a().m24309d();
        C10501b.m22051X(c10501bM22104a, false, null, 3, null);
    }

    /* renamed from: G */
    public final boolean m21990G(C9738r c9738r) {
        Handshake handshake;
        if (AbstractC9920d.f23248h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        C9738r c9738rM19296l = this.f25114d.m19297a().m19296l();
        if (c9738r.m19424n() != c9738rM19296l.m19424n()) {
            return false;
        }
        if (AbstractC9979u.m20289b(c9738r.m19419i(), c9738rM19296l.m19419i())) {
            return true;
        }
        if (!this.f25123m && (handshake = this.f25117g) != null) {
            AbstractC9979u.m20291d(handshake);
            if (m21995f(c9738r, handshake)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: H */
    public final synchronized void m21991H(C10487e call, IOException iOException) {
        try {
            AbstractC9979u.m20294g(call, "call");
            if (iOException instanceof StreamResetException) {
                if (((StreamResetException) iOException).f25154c == ErrorCode.REFUSED_STREAM) {
                    int i10 = this.f25126p + 1;
                    this.f25126p = i10;
                    if (i10 > 1) {
                        this.f25122l = true;
                        this.f25124n++;
                    }
                } else if (((StreamResetException) iOException).f25154c != ErrorCode.CANCEL || !call.isCanceled()) {
                    this.f25122l = true;
                    this.f25124n++;
                }
            } else if (!m22012w() || (iOException instanceof ConnectionShutdownException)) {
                this.f25122l = true;
                if (this.f25125o == 0) {
                    if (iOException != null) {
                        m21997h(call.m21898l(), this.f25114d, iOException);
                    }
                    this.f25124n++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // je.InterfaceC9728h
    /* renamed from: a */
    public Protocol mo19323a() {
        Protocol protocol = this.f25118h;
        AbstractC9979u.m20291d(protocol);
        return protocol;
    }

    @Override // okhttp3.internal.http2.C10501b.c
    /* renamed from: b */
    public synchronized void mo21992b(C10501b connection, C11000g settings) {
        AbstractC9979u.m20294g(connection, "connection");
        AbstractC9979u.m20294g(settings, "settings");
        this.f25127q = settings.m24309d();
    }

    @Override // okhttp3.internal.http2.C10501b.c
    /* renamed from: c */
    public void mo21993c(C10997d stream) {
        AbstractC9979u.m20294g(stream, "stream");
        stream.m24262d(ErrorCode.REFUSED_STREAM, null);
    }

    /* renamed from: e */
    public final void m21994e() {
        Socket socket = this.f25115e;
        if (socket != null) {
            AbstractC9920d.m20032n(socket);
        }
    }

    /* renamed from: f */
    public final boolean m21995f(C9738r c9738r, Handshake handshake) {
        List listM21949d = handshake.m21949d();
        if (!listM21949d.isEmpty()) {
            C11619d c11619d = C11619d.f27521a;
            String strM19419i = c9738r.m19419i();
            Object obj = listM21949d.get(0);
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (c11619d.m25618e(strM19419i, (X509Certificate) obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d7, code lost:
    
        if (r12.f25114d.m19299c() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00db, code lost:
    
        if (r12.f25115e == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ea, code lost:
    
        throw new okhttp3.internal.connection.RouteException(new java.net.ProtocolException("Too many tunnel connections attempted: 21"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
    
        r12.f25129s = java.lang.System.nanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f1, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013f A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m21996g(int r13, int r14, int r15, int r16, boolean r17, je.InterfaceC9725e r18, je.AbstractC9735o r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.m21996g(int, int, int, int, boolean, je.e, je.o):void");
    }

    /* renamed from: h */
    public final void m21997h(C9742v client, C9721a0 failedRoute, IOException failure) {
        AbstractC9979u.m20294g(client, "client");
        AbstractC9979u.m20294g(failedRoute, "failedRoute");
        AbstractC9979u.m20294g(failure, "failure");
        if (failedRoute.m19298b().type() != Proxy.Type.DIRECT) {
            C9720a c9720aM19297a = failedRoute.m19297a();
            c9720aM19297a.m19293i().connectFailed(c9720aM19297a.m19296l().m19429s(), failedRoute.m19298b().address(), failure);
        }
        client.m19531u().m21925b(failedRoute);
    }

    /* renamed from: i */
    public final void m21998i(int i10, int i11, InterfaceC9725e interfaceC9725e, AbstractC9735o abstractC9735o) throws IOException {
        Socket socketCreateSocket;
        Proxy proxyM19298b = this.f25114d.m19298b();
        C9720a c9720aM19297a = this.f25114d.m19297a();
        Proxy.Type type = proxyM19298b.type();
        int i12 = type == null ? -1 : C10498b.f25130a[type.ordinal()];
        if (i12 == 1 || i12 == 2) {
            socketCreateSocket = c9720aM19297a.m19294j().createSocket();
            AbstractC9979u.m20291d(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxyM19298b);
        }
        this.f25115e = socketCreateSocket;
        abstractC9735o.m19365i(interfaceC9725e, this.f25114d.m19300d(), proxyM19298b);
        socketCreateSocket.setSoTimeout(i11);
        try {
            C11192j.f26882a.m24899g().mo24862f(socketCreateSocket, this.f25114d.m19300d(), i10);
            try {
                this.f25120j = Okio.buffer(Okio.source(socketCreateSocket));
                this.f25121k = Okio.buffer(Okio.sink(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (AbstractC9979u.m20289b(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f25114d.m19300d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    /* renamed from: j */
    public final void m21999j(C10484b c10484b) throws Throwable {
        SSLSocket sSLSocket;
        final C9720a c9720aM19297a = this.f25114d.m19297a();
        SSLSocketFactory sSLSocketFactoryM19295k = c9720aM19297a.m19295k();
        SSLSocket sSLSocket2 = null;
        try {
            AbstractC9979u.m20291d(sSLSocketFactoryM19295k);
            Socket socketCreateSocket = sSLSocketFactoryM19295k.createSocket(this.f25115e, c9720aM19297a.m19296l().m19419i(), c9720aM19297a.m19296l().m19424n(), true);
            AbstractC9979u.m20292e(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            sSLSocket = (SSLSocket) socketCreateSocket;
        } catch (Throwable th) {
            th = th;
        }
        try {
            C10496b c10496bM21853a = c10484b.m21853a(sSLSocket);
            if (c10496bM21853a.m21975h()) {
                C11192j.f26882a.m24899g().mo24855e(sSLSocket, c9720aM19297a.m19296l().m19419i(), c9720aM19297a.m19290f());
            }
            sSLSocket.startHandshake();
            SSLSession sslSocketSession = sSLSocket.getSession();
            Handshake.Companion companion = Handshake.f24950e;
            AbstractC9979u.m20293f(sslSocketSession, "sslSocketSession");
            final Handshake handshakeM21951a = companion.m21951a(sslSocketSession);
            HostnameVerifier hostnameVerifierM19289e = c9720aM19297a.m19289e();
            AbstractC9979u.m20291d(hostnameVerifierM19289e);
            if (hostnameVerifierM19289e.verify(c9720aM19297a.m19296l().m19419i(), sslSocketSession)) {
                final CertificatePinner certificatePinnerM19285a = c9720aM19297a.m19285a();
                AbstractC9979u.m20291d(certificatePinnerM19285a);
                this.f25117g = new Handshake(handshakeM21951a.m21950e(), handshakeM21951a.m21946a(), handshakeM21951a.m21948c(), new InterfaceC9529a() { // from class: okhttp3.internal.connection.RealConnection$connectTls$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public final List invoke() {
                        AbstractC11618c abstractC11618cM21941d = certificatePinnerM19285a.m21941d();
                        AbstractC9979u.m20291d(abstractC11618cM21941d);
                        return abstractC11618cM21941d.mo25221a(handshakeM21951a.m21949d(), c9720aM19297a.m19296l().m19419i());
                    }
                });
                certificatePinnerM19285a.m21939b(c9720aM19297a.m19296l().m19419i(), new InterfaceC9529a() { // from class: okhttp3.internal.connection.RealConnection$connectTls$2
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public final List invoke() {
                        Handshake handshake = this.f25134c.f25117g;
                        AbstractC9979u.m20291d(handshake);
                        List<Certificate> listM21949d = handshake.m21949d();
                        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(listM21949d, 10));
                        for (Certificate certificate : listM21949d) {
                            AbstractC9979u.m20292e(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                            arrayList.add((X509Certificate) certificate);
                        }
                        return arrayList;
                    }
                });
                String strMo24856g = c10496bM21853a.m21975h() ? C11192j.f26882a.m24899g().mo24856g(sSLSocket) : null;
                this.f25116f = sSLSocket;
                this.f25120j = Okio.buffer(Okio.source(sSLSocket));
                this.f25121k = Okio.buffer(Okio.sink(sSLSocket));
                this.f25118h = strMo24856g != null ? Protocol.f24957d.m21955a(strMo24856g) : Protocol.HTTP_1_1;
                C11192j.f26882a.m24899g().mo24878b(sSLSocket);
                return;
            }
            List listM21949d = handshakeM21951a.m21949d();
            if (listM21949d.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + c9720aM19297a.m19296l().m19419i() + " not verified (no certificates)");
            }
            Object obj = listM21949d.get(0);
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            throw new SSLPeerUnverifiedException(AbstractC10812s.m23223p("\n              |Hostname " + c9720aM19297a.m19296l().m19419i() + " not verified:\n              |    certificate: " + CertificatePinner.f24942c.m21944a(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + C11619d.f27521a.m25614a(x509Certificate) + "\n              ", null, 1, null));
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                C11192j.f26882a.m24899g().mo24878b(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                AbstractC9920d.m20032n(sSLSocket2);
            }
            throw th;
        }
    }

    /* renamed from: k */
    public final void m22000k(int i10, int i11, int i12, InterfaceC9725e interfaceC9725e, AbstractC9735o abstractC9735o) throws IOException {
        C9743w c9743wM22002m = m22002m();
        C9738r c9738rM19592j = c9743wM22002m.m19592j();
        for (int i13 = 0; i13 < 21; i13++) {
            m21998i(i10, i11, interfaceC9725e, abstractC9735o);
            c9743wM22002m = m22001l(i11, i12, c9743wM22002m, c9738rM19592j);
            if (c9743wM22002m == null) {
                return;
            }
            Socket socket = this.f25115e;
            if (socket != null) {
                AbstractC9920d.m20032n(socket);
            }
            this.f25115e = null;
            this.f25121k = null;
            this.f25120j = null;
            abstractC9735o.m19363g(interfaceC9725e, this.f25114d.m19300d(), this.f25114d.m19298b(), null);
        }
    }

    /* renamed from: l */
    public final C9743w m22001l(int i10, int i11, C9743w c9743w, C9738r c9738r) throws IOException {
        String str = "CONNECT " + AbstractC9920d.m20009Q(c9738r, true) + " HTTP/1.1";
        while (true) {
            BufferedSource bufferedSource = this.f25120j;
            AbstractC9979u.m20291d(bufferedSource);
            BufferedSink bufferedSink = this.f25121k;
            AbstractC9979u.m20291d(bufferedSink);
            C10821b c10821b = new C10821b(null, this, bufferedSource, bufferedSink);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            bufferedSource.timeout().timeout(i10, timeUnit);
            bufferedSink.timeout().timeout(i11, timeUnit);
            c10821b.m23269z(c9743w.m19587e(), str);
            c10821b.mo22606a();
            C9745y.a aVarMo22611f = c10821b.mo22611f(false);
            AbstractC9979u.m20291d(aVarMo22611f);
            C9745y c9745yM19648c = aVarMo22611f.m19663r(c9743w).m19648c();
            c10821b.m23268y(c9745yM19648c);
            int iM19632j = c9745yM19648c.m19632j();
            if (iM19632j == 200) {
                if (bufferedSource.getBuffer().exhausted() && bufferedSink.getBuffer().exhausted()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iM19632j != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + c9745yM19648c.m19632j());
            }
            C9743w c9743wMo19301a = this.f25114d.m19297a().m19292h().mo19301a(this.f25114d, c9745yM19648c);
            if (c9743wMo19301a == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (AbstractC10819z.m23230C("close", C9745y.m19626p(c9745yM19648c, "Connection", null, 2, null), true)) {
                return c9743wMo19301a;
            }
            c9743w = c9743wMo19301a;
        }
    }

    /* renamed from: m */
    public final C9743w m22002m() {
        C9743w c9743wM19595b = new C9743w.a().m19609q(this.f25114d.m19297a().m19296l()).m19602j("CONNECT", null).m19600h("Host", AbstractC9920d.m20009Q(this.f25114d.m19297a().m19296l(), true)).m19600h("Proxy-Connection", "Keep-Alive").m19600h(HttpHeaders.USER_AGENT, "okhttp/4.12.0").m19595b();
        C9743w c9743wMo19301a = this.f25114d.m19297a().m19292h().mo19301a(this.f25114d, new C9745y.a().m19663r(c9743wM19595b).m19661p(Protocol.HTTP_1_1).m19652g(407).m19658m("Preemptive Authenticate").m19647b(AbstractC9920d.f23243c).m19664s(-1L).m19662q(-1L).m19655j("Proxy-Authenticate", "OkHttp-Preemptive").m19648c());
        return c9743wMo19301a == null ? c9743wM19595b : c9743wMo19301a;
    }

    /* renamed from: n */
    public final void m22003n(C10484b c10484b, int i10, InterfaceC9725e interfaceC9725e, AbstractC9735o abstractC9735o) throws Throwable {
        if (this.f25114d.m19297a().m19295k() != null) {
            abstractC9735o.m19356B(interfaceC9725e);
            m21999j(c10484b);
            abstractC9735o.m19355A(interfaceC9725e, this.f25117g);
            if (this.f25118h == Protocol.HTTP_2) {
                m21989F(i10);
                return;
            }
            return;
        }
        List listM19290f = this.f25114d.m19297a().m19290f();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!listM19290f.contains(protocol)) {
            this.f25116f = this.f25115e;
            this.f25118h = Protocol.HTTP_1_1;
        } else {
            this.f25116f = this.f25115e;
            this.f25118h = protocol;
            m21989F(i10);
        }
    }

    /* renamed from: o */
    public final List m22004o() {
        return this.f25128r;
    }

    /* renamed from: p */
    public final long m22005p() {
        return this.f25129s;
    }

    /* renamed from: q */
    public final boolean m22006q() {
        return this.f25122l;
    }

    /* renamed from: r */
    public final int m22007r() {
        return this.f25124n;
    }

    /* renamed from: s */
    public Handshake m22008s() {
        return this.f25117g;
    }

    /* renamed from: t */
    public final synchronized void m22009t() {
        this.f25125o++;
    }

    public String toString() {
        Object objM21946a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f25114d.m19297a().m19296l().m19419i());
        sb2.append(':');
        sb2.append(this.f25114d.m19297a().m19296l().m19424n());
        sb2.append(", proxy=");
        sb2.append(this.f25114d.m19298b());
        sb2.append(" hostAddress=");
        sb2.append(this.f25114d.m19300d());
        sb2.append(" cipherSuite=");
        Handshake handshake = this.f25117g;
        if (handshake == null || (objM21946a = handshake.m21946a()) == null) {
            objM21946a = "none";
        }
        sb2.append(objM21946a);
        sb2.append(" protocol=");
        sb2.append(this.f25118h);
        sb2.append('}');
        return sb2.toString();
    }

    /* renamed from: u */
    public final boolean m22010u(C9720a address, List list) {
        AbstractC9979u.m20294g(address, "address");
        if (AbstractC9920d.f23248h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f25128r.size() >= this.f25127q || this.f25122l || !this.f25114d.m19297a().m19288d(address)) {
            return false;
        }
        if (AbstractC9979u.m20289b(address.m19296l().m19419i(), m21984A().m19297a().m19296l().m19419i())) {
            return true;
        }
        if (this.f25119i == null || list == null || !m21985B(list) || address.m19289e() != C11619d.f27521a || !m21990G(address.m19296l())) {
            return false;
        }
        try {
            CertificatePinner certificatePinnerM19285a = address.m19285a();
            AbstractC9979u.m20291d(certificatePinnerM19285a);
            String strM19419i = address.m19296l().m19419i();
            Handshake handshakeM22008s = m22008s();
            AbstractC9979u.m20291d(handshakeM22008s);
            certificatePinnerM19285a.m21938a(strM19419i, handshakeM22008s.m21949d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* renamed from: v */
    public final boolean m22011v(boolean z10) {
        long j10;
        if (AbstractC9920d.f23248h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.f25115e;
        AbstractC9979u.m20291d(socket);
        Socket socket2 = this.f25116f;
        AbstractC9979u.m20291d(socket2);
        BufferedSource bufferedSource = this.f25120j;
        AbstractC9979u.m20291d(bufferedSource);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C10501b c10501b = this.f25119i;
        if (c10501b != null) {
            return c10501b.m22079J(jNanoTime);
        }
        synchronized (this) {
            j10 = jNanoTime - this.f25129s;
        }
        if (j10 < 10000000000L || !z10) {
            return true;
        }
        return AbstractC9920d.m19998F(socket2, bufferedSource);
    }

    /* renamed from: w */
    public final boolean m22012w() {
        return this.f25119i != null;
    }

    /* renamed from: x */
    public final InterfaceC10677d m22013x(C9742v client, C10680g chain) throws SocketException {
        AbstractC9979u.m20294g(client, "client");
        AbstractC9979u.m20294g(chain, "chain");
        Socket socket = this.f25116f;
        AbstractC9979u.m20291d(socket);
        BufferedSource bufferedSource = this.f25120j;
        AbstractC9979u.m20291d(bufferedSource);
        BufferedSink bufferedSink = this.f25121k;
        AbstractC9979u.m20291d(bufferedSink);
        C10501b c10501b = this.f25119i;
        if (c10501b != null) {
            return new C10996c(client, this, chain, c10501b);
        }
        socket.setSoTimeout(chain.m22634k());
        Timeout timeout = bufferedSource.timeout();
        long jM22631h = chain.m22631h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(jM22631h, timeUnit);
        bufferedSink.timeout().timeout(chain.m22633j(), timeUnit);
        return new C10821b(client, this, bufferedSource, bufferedSink);
    }

    /* renamed from: y */
    public final synchronized void m22014y() {
        this.f25123m = true;
    }

    /* renamed from: z */
    public final synchronized void m22015z() {
        this.f25122l = true;
    }
}
