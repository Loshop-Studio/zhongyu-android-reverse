package okhttp3.internal.connection;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import io.reactivex.annotations.SchedulerSupport;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.C8736b;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.internal.http2.C8741b;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Timeout;
import p011a9.AbstractC0052o;
import p011a9.C0037a;
import p011a9.C0038a0;
import p011a9.C0055r;
import p011a9.C0059v;
import p011a9.C0060w;
import p011a9.C0062y;
import p011a9.InterfaceC0042e;
import p011a9.InterfaceC0045h;
import p028b9.AbstractC5070d;
import p081e9.C7420e;
import p092f9.C7498b;
import p092f9.C7501e;
import p092f9.C7502f;
import p103g9.C7606g;
import p103g9.InterfaceC7603d;
import p114h9.C7638b;
import p125i9.C7718c;
import p125i9.C7719d;
import p125i9.C7722g;
import p136j9.C7828j;
import p171m9.AbstractC8573c;
import p171m9.C8574d;

/* loaded from: classes5.dex */
public final class RealConnection extends C8741b.c implements InterfaceC0045h {

    /* renamed from: t */
    public static final C8737a f14688t = new C8737a(null);

    /* renamed from: c */
    public final C7502f f14689c;

    /* renamed from: d */
    public final C0038a0 f14690d;

    /* renamed from: e */
    public Socket f14691e;

    /* renamed from: f */
    public Socket f14692f;

    /* renamed from: g */
    public Handshake f14693g;

    /* renamed from: h */
    public Protocol f14694h;

    /* renamed from: i */
    public C8741b f14695i;

    /* renamed from: j */
    public BufferedSource f14696j;

    /* renamed from: k */
    public BufferedSink f14697k;

    /* renamed from: l */
    public boolean f14698l;

    /* renamed from: m */
    public boolean f14699m;

    /* renamed from: n */
    public int f14700n;

    /* renamed from: o */
    public int f14701o;

    /* renamed from: p */
    public int f14702p;

    /* renamed from: q */
    public int f14703q;

    /* renamed from: r */
    public final List f14704r;

    /* renamed from: s */
    public long f14705s;

    /* renamed from: okhttp3.internal.connection.RealConnection$a */
    public static final class C8737a {
        public /* synthetic */ C8737a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C8737a() {
        }
    }

    /* renamed from: okhttp3.internal.connection.RealConnection$b */
    public /* synthetic */ class C8738b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14706a;

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
            f14706a = iArr;
        }
    }

    public RealConnection(C7502f connectionPool, C0038a0 route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f14689c = connectionPool;
        this.f14690d = route;
        this.f14703q = 1;
        this.f14704r = new ArrayList();
        this.f14705s = Long.MAX_VALUE;
    }

    /* renamed from: A */
    public final boolean m14424A(List list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0038a0 c0038a0 = (C0038a0) it.next();
            Proxy.Type type = c0038a0.m87b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f14690d.m87b().type() == type2 && Intrinsics.areEqual(this.f14690d.m89d(), c0038a0.m89d())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public final void m14425B(long j10) {
        this.f14705s = j10;
    }

    /* renamed from: C */
    public final void m14426C(boolean z9) {
        this.f14698l = z9;
    }

    /* renamed from: D */
    public Socket m14427D() {
        Socket socket = this.f14692f;
        Intrinsics.checkNotNull(socket);
        return socket;
    }

    /* renamed from: E */
    public final void m14428E(int i10) throws SocketException {
        Socket socket = this.f14692f;
        Intrinsics.checkNotNull(socket);
        BufferedSource bufferedSource = this.f14696j;
        Intrinsics.checkNotNull(bufferedSource);
        BufferedSink bufferedSink = this.f14697k;
        Intrinsics.checkNotNull(bufferedSink);
        socket.setSoTimeout(0);
        C8741b c8741bM14544a = new C8741b.a(true, C7420e.f12105i).m14560q(socket, this.f14690d.m86a().m85l().m210i(), bufferedSource, bufferedSink).m14554k(this).m14555l(i10).m14544a();
        this.f14695i = c8741bM14544a;
        this.f14703q = C8741b.f14752C.m14561a().m12955d();
        C8741b.m14491X(c8741bM14544a, false, null, 3, null);
    }

    /* renamed from: F */
    public final boolean m14429F(C0055r c0055r) {
        Handshake handshake;
        if (AbstractC5070d.f2640h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        C0055r c0055rM85l = this.f14690d.m86a().m85l();
        if (c0055r.m215n() != c0055rM85l.m215n()) {
            return false;
        }
        if (Intrinsics.areEqual(c0055r.m210i(), c0055rM85l.m210i())) {
            return true;
        }
        if (!this.f14699m && (handshake = this.f14693g) != null) {
            Intrinsics.checkNotNull(handshake);
            if (m14434e(c0055r, handshake)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    public final synchronized void m14430G(C7501e call, IOException iOException) {
        try {
            Intrinsics.checkNotNullParameter(call, "call");
            if (iOException instanceof StreamResetException) {
                if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i10 = this.f14702p + 1;
                    this.f14702p = i10;
                    if (i10 > 1) {
                        this.f14698l = true;
                        this.f14700n++;
                    }
                } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !call.isCanceled()) {
                    this.f14698l = true;
                    this.f14700n++;
                }
            } else if (!m14451v() || (iOException instanceof ConnectionShutdownException)) {
                this.f14698l = true;
                if (this.f14701o == 0) {
                    if (iOException != null) {
                        m14436g(call.m12173l(), this.f14690d, iOException);
                    }
                    this.f14700n++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // okhttp3.internal.http2.C8741b.c
    /* renamed from: a */
    public synchronized void mo14431a(C8741b connection, C7722g settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f14703q = settings.m12955d();
    }

    @Override // okhttp3.internal.http2.C8741b.c
    /* renamed from: b */
    public void mo14432b(C7719d stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.m12908d(ErrorCode.REFUSED_STREAM, null);
    }

    /* renamed from: d */
    public final void m14433d() {
        Socket socket = this.f14691e;
        if (socket != null) {
            AbstractC5070d.m2649n(socket);
        }
    }

    /* renamed from: e */
    public final boolean m14434e(C0055r c0055r, Handshake handshake) {
        List listM14389d = handshake.m14389d();
        if (!listM14389d.isEmpty()) {
            C8574d c8574d = C8574d.f14216a;
            String strM210i = c0055r.m210i();
            Object obj = listM14389d.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (c8574d.m14117e(strM210i, (X509Certificate) obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d7, code lost:
    
        if (r12.f14690d.m88c() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00db, code lost:
    
        if (r12.f14691e == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ea, code lost:
    
        throw new okhttp3.internal.connection.RouteException(new java.net.ProtocolException("Too many tunnel connections attempted: 21"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
    
        r12.f14705s = java.lang.System.nanoTime();
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
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14435f(int r13, int r14, int r15, int r16, boolean r17, p011a9.InterfaceC0042e r18, p011a9.AbstractC0052o r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.m14435f(int, int, int, int, boolean, a9.e, a9.o):void");
    }

    /* renamed from: g */
    public final void m14436g(C0059v client, C0038a0 failedRoute, IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.m87b().type() != Proxy.Type.DIRECT) {
            C0037a c0037aM86a = failedRoute.m86a();
            c0037aM86a.m82i().connectFailed(c0037aM86a.m85l().m220s(), failedRoute.m87b().address(), failure);
        }
        client.m322v().m12199b(failedRoute);
    }

    /* renamed from: h */
    public final void m14437h(int i10, int i11, InterfaceC0042e interfaceC0042e, AbstractC0052o abstractC0052o) throws IOException {
        Socket socketCreateSocket;
        Proxy proxyM87b = this.f14690d.m87b();
        C0037a c0037aM86a = this.f14690d.m86a();
        Proxy.Type type = proxyM87b.type();
        int i12 = type == null ? -1 : C8738b.f14706a[type.ordinal()];
        if (i12 == 1 || i12 == 2) {
            socketCreateSocket = c0037aM86a.m83j().createSocket();
            Intrinsics.checkNotNull(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxyM87b);
        }
        this.f14691e = socketCreateSocket;
        abstractC0052o.m156i(interfaceC0042e, this.f14690d.m89d(), proxyM87b);
        socketCreateSocket.setSoTimeout(i11);
        try {
            C7828j.f13560a.m13291g().mo13254f(socketCreateSocket, this.f14690d.m89d(), i10);
            try {
                this.f14696j = Okio.buffer(Okio.source(socketCreateSocket));
                this.f14697k = Okio.buffer(Okio.sink(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (Intrinsics.areEqual(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f14690d.m89d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    /* renamed from: i */
    public final void m14438i(C7498b c7498b) throws Throwable {
        SSLSocket sSLSocket;
        final C0037a c0037aM86a = this.f14690d.m86a();
        SSLSocketFactory sSLSocketFactoryM84k = c0037aM86a.m84k();
        SSLSocket sSLSocket2 = null;
        try {
            Intrinsics.checkNotNull(sSLSocketFactoryM84k);
            Socket socketCreateSocket = sSLSocketFactoryM84k.createSocket(this.f14691e, c0037aM86a.m85l().m210i(), c0037aM86a.m85l().m215n(), true);
            Intrinsics.checkNotNull(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            sSLSocket = (SSLSocket) socketCreateSocket;
        } catch (Throwable th) {
            th = th;
        }
        try {
            C8736b c8736bM12127a = c7498b.m12127a(sSLSocket);
            if (c8736bM12127a.m14415h()) {
                C7828j.f13560a.m13291g().mo13247e(sSLSocket, c0037aM86a.m85l().m210i(), c0037aM86a.m79f());
            }
            sSLSocket.startHandshake();
            SSLSession sslSocketSession = sSLSocket.getSession();
            Handshake.Companion companion = Handshake.f14526e;
            Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
            final Handshake handshakeM14391a = companion.m14391a(sslSocketSession);
            HostnameVerifier hostnameVerifierM78e = c0037aM86a.m78e();
            Intrinsics.checkNotNull(hostnameVerifierM78e);
            if (hostnameVerifierM78e.verify(c0037aM86a.m85l().m210i(), sslSocketSession)) {
                final CertificatePinner certificatePinnerM74a = c0037aM86a.m74a();
                Intrinsics.checkNotNull(certificatePinnerM74a);
                this.f14693g = new Handshake(handshakeM14391a.m14390e(), handshakeM14391a.m14386a(), handshakeM14391a.m14388c(), new Function0<List<? extends Certificate>>() { // from class: okhttp3.internal.connection.RealConnection$connectTls$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final List<? extends Certificate> invoke() {
                        AbstractC8573c abstractC8573cM14381d = certificatePinnerM74a.m14381d();
                        Intrinsics.checkNotNull(abstractC8573cM14381d);
                        return abstractC8573cM14381d.mo13531a(handshakeM14391a.m14389d(), c0037aM86a.m85l().m210i());
                    }
                });
                certificatePinnerM74a.m14379b(c0037aM86a.m85l().m210i(), new Function0<List<? extends X509Certificate>>() { // from class: okhttp3.internal.connection.RealConnection$connectTls$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final List<? extends X509Certificate> invoke() {
                        Handshake handshake = this.f14710a.f14693g;
                        Intrinsics.checkNotNull(handshake);
                        List<Certificate> listM14389d = handshake.m14389d();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM14389d, 10));
                        for (Certificate certificate : listM14389d) {
                            Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                            arrayList.add((X509Certificate) certificate);
                        }
                        return arrayList;
                    }
                });
                String strMo13248g = c8736bM12127a.m14415h() ? C7828j.f13560a.m13291g().mo13248g(sSLSocket) : null;
                this.f14692f = sSLSocket;
                this.f14696j = Okio.buffer(Okio.source(sSLSocket));
                this.f14697k = Okio.buffer(Okio.sink(sSLSocket));
                this.f14694h = strMo13248g != null ? Protocol.INSTANCE.m14395a(strMo13248g) : Protocol.HTTP_1_1;
                C7828j.f13560a.m13291g().mo13270b(sSLSocket);
                return;
            }
            List listM14389d = handshakeM14391a.m14389d();
            if (listM14389d.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + c0037aM86a.m85l().m210i() + " not verified (no certificates)");
            }
            Object obj = listM14389d.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            throw new SSLPeerUnverifiedException(StringsKt.trimMargin$default("\n              |Hostname " + c0037aM86a.m85l().m210i() + " not verified:\n              |    certificate: " + CertificatePinner.f14518c.m14384a(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + C8574d.f14216a.m14113a(x509Certificate) + "\n              ", null, 1, null));
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                C7828j.f13560a.m13291g().mo13270b(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                AbstractC5070d.m2649n(sSLSocket2);
            }
            throw th;
        }
    }

    /* renamed from: j */
    public final void m14439j(int i10, int i11, int i12, InterfaceC0042e interfaceC0042e, AbstractC0052o abstractC0052o) throws IOException {
        C0060w c0060wM14441l = m14441l();
        C0055r c0055rM381j = c0060wM14441l.m381j();
        for (int i13 = 0; i13 < 21; i13++) {
            m14437h(i10, i11, interfaceC0042e, abstractC0052o);
            c0060wM14441l = m14440k(i11, i12, c0060wM14441l, c0055rM381j);
            if (c0060wM14441l == null) {
                return;
            }
            Socket socket = this.f14691e;
            if (socket != null) {
                AbstractC5070d.m2649n(socket);
            }
            this.f14691e = null;
            this.f14697k = null;
            this.f14696j = null;
            abstractC0052o.m154g(interfaceC0042e, this.f14690d.m89d(), this.f14690d.m87b(), null);
        }
    }

    /* renamed from: k */
    public final C0060w m14440k(int i10, int i11, C0060w c0060w, C0055r c0055r) throws IOException {
        String str = "CONNECT " + AbstractC5070d.m2626Q(c0055r, true) + " HTTP/1.1";
        while (true) {
            BufferedSource bufferedSource = this.f14696j;
            Intrinsics.checkNotNull(bufferedSource);
            BufferedSink bufferedSink = this.f14697k;
            Intrinsics.checkNotNull(bufferedSink);
            C7638b c7638b = new C7638b(null, this, bufferedSource, bufferedSink);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            bufferedSource.getTimeout().timeout(i10, timeUnit);
            bufferedSink.getTimeout().timeout(i11, timeUnit);
            c7638b.m12632A(c0060w.m376e(), str);
            c7638b.mo12493a();
            C0062y.a aVarMo12498f = c7638b.mo12498f(false);
            Intrinsics.checkNotNull(aVarMo12498f);
            C0062y c0062yM435c = aVarMo12498f.m450r(c0060w).m435c();
            c7638b.m12641z(c0062yM435c);
            int iM418i = c0062yM435c.m418i();
            if (iM418i == 200) {
                if (bufferedSource.getBuffer().exhausted() && bufferedSink.getBuffer().exhausted()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iM418i != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + c0062yM435c.m418i());
            }
            C0060w c0060wMo90a = this.f14690d.m86a().m81h().mo90a(this.f14690d, c0062yM435c);
            if (c0060wMo90a == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (StringsKt.equals("close", C0062y.m413n(c0062yM435c, "Connection", null, 2, null), true)) {
                return c0060wMo90a;
            }
            c0060w = c0060wMo90a;
        }
    }

    /* renamed from: l */
    public final C0060w m14441l() {
        C0060w c0060wM384b = new C0060w.a().m395n(this.f14690d.m86a().m85l()).m391j("CONNECT", null).m389h(HttpHeaders.HOST, AbstractC5070d.m2626Q(this.f14690d.m86a().m85l(), true)).m389h("Proxy-Connection", "Keep-Alive").m389h(HttpHeaders.USER_AGENT, "okhttp/4.12.0").m384b();
        C0060w c0060wMo90a = this.f14690d.m86a().m81h().mo90a(this.f14690d, new C0062y.a().m450r(c0060wM384b).m448p(Protocol.HTTP_1_1).m439g(407).m445m("Preemptive Authenticate").m434b(AbstractC5070d.f2635c).m451s(-1L).m449q(-1L).m442j("Proxy-Authenticate", "OkHttp-Preemptive").m435c());
        return c0060wMo90a == null ? c0060wM384b : c0060wMo90a;
    }

    /* renamed from: m */
    public final void m14442m(C7498b c7498b, int i10, InterfaceC0042e interfaceC0042e, AbstractC0052o abstractC0052o) throws Throwable {
        if (this.f14690d.m86a().m84k() != null) {
            abstractC0052o.m147B(interfaceC0042e);
            m14438i(c7498b);
            abstractC0052o.m146A(interfaceC0042e, this.f14693g);
            if (this.f14694h == Protocol.HTTP_2) {
                m14428E(i10);
                return;
            }
            return;
        }
        List listM79f = this.f14690d.m86a().m79f();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!listM79f.contains(protocol)) {
            this.f14692f = this.f14691e;
            this.f14694h = Protocol.HTTP_1_1;
        } else {
            this.f14692f = this.f14691e;
            this.f14694h = protocol;
            m14428E(i10);
        }
    }

    /* renamed from: n */
    public final List m14443n() {
        return this.f14704r;
    }

    /* renamed from: o */
    public final long m14444o() {
        return this.f14705s;
    }

    /* renamed from: p */
    public final boolean m14445p() {
        return this.f14698l;
    }

    /* renamed from: q */
    public final int m14446q() {
        return this.f14700n;
    }

    /* renamed from: r */
    public Handshake m14447r() {
        return this.f14693g;
    }

    /* renamed from: s */
    public final synchronized void m14448s() {
        this.f14701o++;
    }

    /* renamed from: t */
    public final boolean m14449t(C0037a address, List list) {
        Intrinsics.checkNotNullParameter(address, "address");
        if (AbstractC5070d.f2640h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f14704r.size() >= this.f14703q || this.f14698l || !this.f14690d.m86a().m77d(address)) {
            return false;
        }
        if (Intrinsics.areEqual(address.m85l().m210i(), m14455z().m86a().m85l().m210i())) {
            return true;
        }
        if (this.f14695i == null || list == null || !m14424A(list) || address.m78e() != C8574d.f14216a || !m14429F(address.m85l())) {
            return false;
        }
        try {
            CertificatePinner certificatePinnerM74a = address.m74a();
            Intrinsics.checkNotNull(certificatePinnerM74a);
            String strM210i = address.m85l().m210i();
            Handshake handshakeM14447r = m14447r();
            Intrinsics.checkNotNull(handshakeM14447r);
            certificatePinnerM74a.m14378a(strM210i, handshakeM14447r.m14389d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public String toString() {
        Object objM14386a;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f14690d.m86a().m85l().m210i());
        sb.append(':');
        sb.append(this.f14690d.m86a().m85l().m215n());
        sb.append(", proxy=");
        sb.append(this.f14690d.m87b());
        sb.append(" hostAddress=");
        sb.append(this.f14690d.m89d());
        sb.append(" cipherSuite=");
        Handshake handshake = this.f14693g;
        if (handshake == null || (objM14386a = handshake.m14386a()) == null) {
            objM14386a = SchedulerSupport.NONE;
        }
        sb.append(objM14386a);
        sb.append(" protocol=");
        sb.append(this.f14694h);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final boolean m14450u(boolean z9) {
        long j10;
        if (AbstractC5070d.f2640h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.f14691e;
        Intrinsics.checkNotNull(socket);
        Socket socket2 = this.f14692f;
        Intrinsics.checkNotNull(socket2);
        BufferedSource bufferedSource = this.f14696j;
        Intrinsics.checkNotNull(bufferedSource);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C8741b c8741b = this.f14695i;
        if (c8741b != null) {
            return c8741b.m14519J(jNanoTime);
        }
        synchronized (this) {
            j10 = jNanoTime - this.f14705s;
        }
        if (j10 < 10000000000L || !z9) {
            return true;
        }
        return AbstractC5070d.m2615F(socket2, bufferedSource);
    }

    /* renamed from: v */
    public final boolean m14451v() {
        return this.f14695i != null;
    }

    /* renamed from: w */
    public final InterfaceC7603d m14452w(C0059v client, C7606g chain) throws SocketException {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f14692f;
        Intrinsics.checkNotNull(socket);
        BufferedSource bufferedSource = this.f14696j;
        Intrinsics.checkNotNull(bufferedSource);
        BufferedSink bufferedSink = this.f14697k;
        Intrinsics.checkNotNull(bufferedSink);
        C8741b c8741b = this.f14695i;
        if (c8741b != null) {
            return new C7718c(client, this, chain, c8741b);
        }
        socket.setSoTimeout(chain.m12521k());
        Timeout timeout = bufferedSource.getTimeout();
        long jM12518h = chain.m12518h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(jM12518h, timeUnit);
        bufferedSink.getTimeout().timeout(chain.m12520j(), timeUnit);
        return new C7638b(client, this, bufferedSource, bufferedSink);
    }

    /* renamed from: x */
    public final synchronized void m14453x() {
        this.f14699m = true;
    }

    /* renamed from: y */
    public final synchronized void m14454y() {
        this.f14698l = true;
    }

    /* renamed from: z */
    public C0038a0 m14455z() {
        return this.f14690d;
    }
}
