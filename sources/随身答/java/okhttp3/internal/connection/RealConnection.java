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
import okhttp3.C9239b;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.internal.http2.C9244b;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Timeout;
import p172l8.AbstractC8916o;
import p172l8.C8901a;
import p172l8.C8902a0;
import p172l8.C8919r;
import p172l8.C8923v;
import p172l8.C8924w;
import p172l8.C8926y;
import p172l8.InterfaceC8906e;
import p172l8.InterfaceC8909h;
import p182m8.AbstractC9045d;
import p216p8.C9342e;
import p226q8.C9379b;
import p226q8.C9382e;
import p226q8.C9383f;
import p236r8.C9445g;
import p236r8.InterfaceC9442d;
import p246s8.C9591b;
import p256t8.C9638c;
import p256t8.C9639d;
import p256t8.C9642g;
import p266u8.C9734j;
import p296x8.AbstractC9917c;
import p296x8.C9918d;

/* loaded from: classes5.dex */
public final class RealConnection extends C9244b.c implements InterfaceC8909h {

    /* renamed from: t */
    public static final C9240a f15815t = new C9240a(null);

    /* renamed from: c */
    public final C9383f f15816c;

    /* renamed from: d */
    public final C8902a0 f15817d;

    /* renamed from: e */
    public Socket f15818e;

    /* renamed from: f */
    public Socket f15819f;

    /* renamed from: g */
    public Handshake f15820g;

    /* renamed from: h */
    public Protocol f15821h;

    /* renamed from: i */
    public C9244b f15822i;

    /* renamed from: j */
    public BufferedSource f15823j;

    /* renamed from: k */
    public BufferedSink f15824k;

    /* renamed from: l */
    public boolean f15825l;

    /* renamed from: m */
    public boolean f15826m;

    /* renamed from: n */
    public int f15827n;

    /* renamed from: o */
    public int f15828o;

    /* renamed from: p */
    public int f15829p;

    /* renamed from: q */
    public int f15830q;

    /* renamed from: r */
    public final List f15831r;

    /* renamed from: s */
    public long f15832s;

    /* renamed from: okhttp3.internal.connection.RealConnection$a */
    public static final class C9240a {
        public /* synthetic */ C9240a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C9240a() {
        }
    }

    /* renamed from: okhttp3.internal.connection.RealConnection$b */
    public /* synthetic */ class C9241b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15833a;

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
            f15833a = iArr;
        }
    }

    public RealConnection(C9383f connectionPool, C8902a0 route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f15816c = connectionPool;
        this.f15817d = route;
        this.f15830q = 1;
        this.f15831r = new ArrayList();
        this.f15832s = Long.MAX_VALUE;
    }

    /* renamed from: A */
    public final boolean m14858A(List list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8902a0 c8902a0 = (C8902a0) it.next();
            Proxy.Type type = c8902a0.m13846b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f15817d.m13846b().type() == type2 && Intrinsics.areEqual(this.f15817d.m13848d(), c8902a0.m13848d())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public final void m14859B(long j9) {
        this.f15832s = j9;
    }

    /* renamed from: C */
    public final void m14860C(boolean z9) {
        this.f15825l = z9;
    }

    /* renamed from: D */
    public Socket m14861D() {
        Socket socket = this.f15819f;
        Intrinsics.checkNotNull(socket);
        return socket;
    }

    /* renamed from: E */
    public final void m14862E(int i9) throws SocketException {
        Socket socket = this.f15819f;
        Intrinsics.checkNotNull(socket);
        BufferedSource bufferedSource = this.f15823j;
        Intrinsics.checkNotNull(bufferedSource);
        BufferedSink bufferedSink = this.f15824k;
        Intrinsics.checkNotNull(bufferedSink);
        socket.setSoTimeout(0);
        C9244b c9244bM14978a = new C9244b.a(true, C9342e.f16227i).m14994q(socket, this.f15817d.m13845a().m13844l().m13966i(), bufferedSource, bufferedSink).m14988k(this).m14989l(i9).m14978a();
        this.f15822i = c9244bM14978a;
        this.f15830q = C9244b.f15879C.m14995a().m15974d();
        C9244b.m14925X(c9244bM14978a, false, null, 3, null);
    }

    /* renamed from: F */
    public final boolean m14863F(C8919r c8919r) {
        Handshake handshake;
        if (AbstractC9045d.f15231h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        C8919r c8919rM13844l = this.f15817d.m13845a().m13844l();
        if (c8919r.m13971n() != c8919rM13844l.m13971n()) {
            return false;
        }
        if (Intrinsics.areEqual(c8919r.m13966i(), c8919rM13844l.m13966i())) {
            return true;
        }
        if (!this.f15826m && (handshake = this.f15820g) != null) {
            Intrinsics.checkNotNull(handshake);
            if (m14868e(c8919r, handshake)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    public final synchronized void m14864G(C9382e call, IOException iOException) {
        try {
            Intrinsics.checkNotNullParameter(call, "call");
            if (iOException instanceof StreamResetException) {
                if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i9 = this.f15829p + 1;
                    this.f15829p = i9;
                    if (i9 > 1) {
                        this.f15825l = true;
                        this.f15827n++;
                    }
                } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !call.isCanceled()) {
                    this.f15825l = true;
                    this.f15827n++;
                }
            } else if (!m14885v() || (iOException instanceof ConnectionShutdownException)) {
                this.f15825l = true;
                if (this.f15828o == 0) {
                    if (iOException != null) {
                        m14870g(call.m15405m(), this.f15817d, iOException);
                    }
                    this.f15827n++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // okhttp3.internal.http2.C9244b.c
    /* renamed from: a */
    public synchronized void mo14865a(C9244b connection, C9642g settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f15830q = settings.m15974d();
    }

    @Override // okhttp3.internal.http2.C9244b.c
    /* renamed from: b */
    public void mo14866b(C9639d stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.m15927d(ErrorCode.REFUSED_STREAM, null);
    }

    /* renamed from: d */
    public final void m14867d() throws IOException {
        Socket socket = this.f15818e;
        if (socket != null) {
            AbstractC9045d.m14498n(socket);
        }
    }

    /* renamed from: e */
    public final boolean m14868e(C8919r c8919r, Handshake handshake) {
        List listM14823d = handshake.m14823d();
        if (!listM14823d.isEmpty()) {
            C9918d c9918d = C9918d.f17747a;
            String strM13966i = c8919r.m13966i();
            Object obj = listM14823d.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (c9918d.m16988e(strM13966i, (X509Certificate) obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d7, code lost:
    
        if (r12.f15817d.m13847c() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00db, code lost:
    
        if (r12.f15818e == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ea, code lost:
    
        throw new okhttp3.internal.connection.RouteException(new java.net.ProtocolException("Too many tunnel connections attempted: 21"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
    
        r12.f15832s = java.lang.System.nanoTime();
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
    public final void m14869f(int r13, int r14, int r15, int r16, boolean r17, p172l8.InterfaceC8906e r18, p172l8.AbstractC8916o r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.m14869f(int, int, int, int, boolean, l8.e, l8.o):void");
    }

    /* renamed from: g */
    public final void m14870g(C8923v client, C8902a0 failedRoute, IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.m13846b().type() != Proxy.Type.DIRECT) {
            C8901a c8901aM13845a = failedRoute.m13845a();
            c8901aM13845a.m13841i().connectFailed(c8901aM13845a.m13844l().m13976s(), failedRoute.m13846b().address(), failure);
        }
        client.m14078v().m15431b(failedRoute);
    }

    /* renamed from: h */
    public final void m14871h(int i9, int i10, InterfaceC8906e interfaceC8906e, AbstractC8916o abstractC8916o) throws IOException {
        Socket socketCreateSocket;
        Proxy proxyM13846b = this.f15817d.m13846b();
        C8901a c8901aM13845a = this.f15817d.m13845a();
        Proxy.Type type = proxyM13846b.type();
        int i11 = type == null ? -1 : C9241b.f15833a[type.ordinal()];
        if (i11 == 1 || i11 == 2) {
            socketCreateSocket = c8901aM13845a.m13842j().createSocket();
            Intrinsics.checkNotNull(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxyM13846b);
        }
        this.f15818e = socketCreateSocket;
        abstractC8916o.m13912i(interfaceC8906e, this.f15817d.m13848d(), proxyM13846b);
        socketCreateSocket.setSoTimeout(i10);
        try {
            C9734j.f17200a.m16271g().mo16234f(socketCreateSocket, this.f15817d.m13848d(), i9);
            try {
                this.f15823j = Okio.buffer(Okio.source(socketCreateSocket));
                this.f15824k = Okio.buffer(Okio.sink(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (Intrinsics.areEqual(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f15817d.m13848d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    /* renamed from: i */
    public final void m14872i(C9379b c9379b) throws Throwable {
        SSLSocket sSLSocket;
        final C8901a c8901aM13845a = this.f15817d.m13845a();
        SSLSocketFactory sSLSocketFactoryM13843k = c8901aM13845a.m13843k();
        SSLSocket sSLSocket2 = null;
        try {
            Intrinsics.checkNotNull(sSLSocketFactoryM13843k);
            Socket socketCreateSocket = sSLSocketFactoryM13843k.createSocket(this.f15818e, c8901aM13845a.m13844l().m13966i(), c8901aM13845a.m13844l().m13971n(), true);
            Intrinsics.checkNotNull(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            sSLSocket = (SSLSocket) socketCreateSocket;
        } catch (Throwable th) {
            th = th;
        }
        try {
            C9239b c9239bM15359a = c9379b.m15359a(sSLSocket);
            if (c9239bM15359a.m14849h()) {
                C9734j.f17200a.m16271g().mo16227e(sSLSocket, c8901aM13845a.m13844l().m13966i(), c8901aM13845a.m13838f());
            }
            sSLSocket.startHandshake();
            SSLSession sslSocketSession = sSLSocket.getSession();
            Handshake.Companion companion = Handshake.f15653e;
            Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
            final Handshake handshakeM14825a = companion.m14825a(sslSocketSession);
            HostnameVerifier hostnameVerifierM13837e = c8901aM13845a.m13837e();
            Intrinsics.checkNotNull(hostnameVerifierM13837e);
            if (hostnameVerifierM13837e.verify(c8901aM13845a.m13844l().m13966i(), sslSocketSession)) {
                final CertificatePinner certificatePinnerM13833a = c8901aM13845a.m13833a();
                Intrinsics.checkNotNull(certificatePinnerM13833a);
                this.f15820g = new Handshake(handshakeM14825a.m14824e(), handshakeM14825a.m14820a(), handshakeM14825a.m14822c(), new Function0<List<? extends Certificate>>() { // from class: okhttp3.internal.connection.RealConnection$connectTls$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final List<? extends Certificate> invoke() {
                        AbstractC9917c abstractC9917cM14815d = certificatePinnerM13833a.m14815d();
                        Intrinsics.checkNotNull(abstractC9917cM14815d);
                        return abstractC9917cM14815d.mo16564a(handshakeM14825a.m14823d(), c8901aM13845a.m13844l().m13966i());
                    }
                });
                certificatePinnerM13833a.m14813b(c8901aM13845a.m13844l().m13966i(), new Function0<List<? extends X509Certificate>>() { // from class: okhttp3.internal.connection.RealConnection$connectTls$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final List<? extends X509Certificate> invoke() {
                        Handshake handshake = this.f15837a.f15820g;
                        Intrinsics.checkNotNull(handshake);
                        List<Certificate> listM14823d = handshake.m14823d();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM14823d, 10));
                        for (Certificate certificate : listM14823d) {
                            Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                            arrayList.add((X509Certificate) certificate);
                        }
                        return arrayList;
                    }
                });
                String strMo16228g = c9239bM15359a.m14849h() ? C9734j.f17200a.m16271g().mo16228g(sSLSocket) : null;
                this.f15819f = sSLSocket;
                this.f15823j = Okio.buffer(Okio.source(sSLSocket));
                this.f15824k = Okio.buffer(Okio.sink(sSLSocket));
                this.f15821h = strMo16228g != null ? Protocol.INSTANCE.m14829a(strMo16228g) : Protocol.HTTP_1_1;
                C9734j.f17200a.m16271g().mo16250b(sSLSocket);
                return;
            }
            List listM14823d = handshakeM14825a.m14823d();
            if (listM14823d.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + c8901aM13845a.m13844l().m13966i() + " not verified (no certificates)");
            }
            Object obj = listM14823d.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            throw new SSLPeerUnverifiedException(StringsKt.trimMargin$default("\n              |Hostname " + c8901aM13845a.m13844l().m13966i() + " not verified:\n              |    certificate: " + CertificatePinner.f15645c.m14818a(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + C9918d.f17747a.m16984a(x509Certificate) + "\n              ", null, 1, null));
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                C9734j.f17200a.m16271g().mo16250b(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                AbstractC9045d.m14498n(sSLSocket2);
            }
            throw th;
        }
    }

    /* renamed from: j */
    public final void m14873j(int i9, int i10, int i11, InterfaceC8906e interfaceC8906e, AbstractC8916o abstractC8916o) throws IOException {
        C8924w c8924wM14875l = m14875l();
        C8919r c8919rM14137j = c8924wM14875l.m14137j();
        for (int i12 = 0; i12 < 21; i12++) {
            m14871h(i9, i10, interfaceC8906e, abstractC8916o);
            c8924wM14875l = m14874k(i10, i11, c8924wM14875l, c8919rM14137j);
            if (c8924wM14875l == null) {
                return;
            }
            Socket socket = this.f15818e;
            if (socket != null) {
                AbstractC9045d.m14498n(socket);
            }
            this.f15818e = null;
            this.f15824k = null;
            this.f15823j = null;
            abstractC8916o.m13910g(interfaceC8906e, this.f15817d.m13848d(), this.f15817d.m13846b(), null);
        }
    }

    /* renamed from: k */
    public final C8924w m14874k(int i9, int i10, C8924w c8924w, C8919r c8919r) throws IOException {
        String str = "CONNECT " + AbstractC9045d.m14475Q(c8919r, true) + " HTTP/1.1";
        while (true) {
            BufferedSource bufferedSource = this.f15823j;
            Intrinsics.checkNotNull(bufferedSource);
            BufferedSink bufferedSink = this.f15824k;
            Intrinsics.checkNotNull(bufferedSink);
            C9591b c9591b = new C9591b(null, this, bufferedSource, bufferedSink);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            bufferedSource.getTimeout().timeout(i9, timeUnit);
            bufferedSink.getTimeout().timeout(i10, timeUnit);
            c9591b.m15773A(c8924w.m14132e(), str);
            c9591b.mo15580a();
            C8926y.a aVarMo15585f = c9591b.mo15585f(false);
            Intrinsics.checkNotNull(aVarMo15585f);
            C8926y c8926yM14191c = aVarMo15585f.m14206r(c8924w).m14191c();
            c9591b.m15782z(c8926yM14191c);
            int iM14174i = c8926yM14191c.m14174i();
            if (iM14174i == 200) {
                if (bufferedSource.getBuffer().exhausted() && bufferedSink.getBuffer().exhausted()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iM14174i != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + c8926yM14191c.m14174i());
            }
            C8924w c8924wMo13849a = this.f15817d.m13845a().m13840h().mo13849a(this.f15817d, c8926yM14191c);
            if (c8924wMo13849a == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (StringsKt.equals("close", C8926y.m14169n(c8926yM14191c, "Connection", null, 2, null), true)) {
                return c8924wMo13849a;
            }
            c8924w = c8924wMo13849a;
        }
    }

    /* renamed from: l */
    public final C8924w m14875l() {
        C8924w c8924wM14140b = new C8924w.a().m14152o(this.f15817d.m13845a().m13844l()).m14147j("CONNECT", null).m14145h(HttpHeaders.HOST, AbstractC9045d.m14475Q(this.f15817d.m13845a().m13844l(), true)).m14145h("Proxy-Connection", "Keep-Alive").m14145h(HttpHeaders.USER_AGENT, "okhttp/4.12.0").m14140b();
        C8924w c8924wMo13849a = this.f15817d.m13845a().m13840h().mo13849a(this.f15817d, new C8926y.a().m14206r(c8924wM14140b).m14204p(Protocol.HTTP_1_1).m14195g(407).m14201m("Preemptive Authenticate").m14190b(AbstractC9045d.f15226c).m14207s(-1L).m14205q(-1L).m14198j("Proxy-Authenticate", "OkHttp-Preemptive").m14191c());
        return c8924wMo13849a == null ? c8924wM14140b : c8924wMo13849a;
    }

    /* renamed from: m */
    public final void m14876m(C9379b c9379b, int i9, InterfaceC8906e interfaceC8906e, AbstractC8916o abstractC8916o) throws Throwable {
        if (this.f15817d.m13845a().m13843k() != null) {
            abstractC8916o.m13903B(interfaceC8906e);
            m14872i(c9379b);
            abstractC8916o.m13902A(interfaceC8906e, this.f15820g);
            if (this.f15821h == Protocol.HTTP_2) {
                m14862E(i9);
                return;
            }
            return;
        }
        List listM13838f = this.f15817d.m13845a().m13838f();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!listM13838f.contains(protocol)) {
            this.f15819f = this.f15818e;
            this.f15821h = Protocol.HTTP_1_1;
        } else {
            this.f15819f = this.f15818e;
            this.f15821h = protocol;
            m14862E(i9);
        }
    }

    /* renamed from: n */
    public final List m14877n() {
        return this.f15831r;
    }

    /* renamed from: o */
    public final long m14878o() {
        return this.f15832s;
    }

    /* renamed from: p */
    public final boolean m14879p() {
        return this.f15825l;
    }

    /* renamed from: q */
    public final int m14880q() {
        return this.f15827n;
    }

    /* renamed from: r */
    public Handshake m14881r() {
        return this.f15820g;
    }

    /* renamed from: s */
    public final synchronized void m14882s() {
        this.f15828o++;
    }

    /* renamed from: t */
    public final boolean m14883t(C8901a address, List list) {
        Intrinsics.checkNotNullParameter(address, "address");
        if (AbstractC9045d.f15231h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f15831r.size() >= this.f15830q || this.f15825l || !this.f15817d.m13845a().m13836d(address)) {
            return false;
        }
        if (Intrinsics.areEqual(address.m13844l().m13966i(), m14889z().m13845a().m13844l().m13966i())) {
            return true;
        }
        if (this.f15822i == null || list == null || !m14858A(list) || address.m13837e() != C9918d.f17747a || !m14863F(address.m13844l())) {
            return false;
        }
        try {
            CertificatePinner certificatePinnerM13833a = address.m13833a();
            Intrinsics.checkNotNull(certificatePinnerM13833a);
            String strM13966i = address.m13844l().m13966i();
            Handshake handshakeM14881r = m14881r();
            Intrinsics.checkNotNull(handshakeM14881r);
            certificatePinnerM13833a.m14812a(strM13966i, handshakeM14881r.m14823d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public String toString() {
        Object objM14820a;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f15817d.m13845a().m13844l().m13966i());
        sb.append(':');
        sb.append(this.f15817d.m13845a().m13844l().m13971n());
        sb.append(", proxy=");
        sb.append(this.f15817d.m13846b());
        sb.append(" hostAddress=");
        sb.append(this.f15817d.m13848d());
        sb.append(" cipherSuite=");
        Handshake handshake = this.f15820g;
        if (handshake == null || (objM14820a = handshake.m14820a()) == null) {
            objM14820a = "none";
        }
        sb.append(objM14820a);
        sb.append(" protocol=");
        sb.append(this.f15821h);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final boolean m14884u(boolean z9) {
        long j9;
        if (AbstractC9045d.f15231h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.f15818e;
        Intrinsics.checkNotNull(socket);
        Socket socket2 = this.f15819f;
        Intrinsics.checkNotNull(socket2);
        BufferedSource bufferedSource = this.f15823j;
        Intrinsics.checkNotNull(bufferedSource);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C9244b c9244b = this.f15822i;
        if (c9244b != null) {
            return c9244b.m14953J(jNanoTime);
        }
        synchronized (this) {
            j9 = jNanoTime - this.f15832s;
        }
        if (j9 < 10000000000L || !z9) {
            return true;
        }
        return AbstractC9045d.m14464F(socket2, bufferedSource);
    }

    /* renamed from: v */
    public final boolean m14885v() {
        return this.f15822i != null;
    }

    /* renamed from: w */
    public final InterfaceC9442d m14886w(C8923v client, C9445g chain) throws SocketException {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f15819f;
        Intrinsics.checkNotNull(socket);
        BufferedSource bufferedSource = this.f15823j;
        Intrinsics.checkNotNull(bufferedSource);
        BufferedSink bufferedSink = this.f15824k;
        Intrinsics.checkNotNull(bufferedSink);
        C9244b c9244b = this.f15822i;
        if (c9244b != null) {
            return new C9638c(client, this, chain, c9244b);
        }
        socket.setSoTimeout(chain.m15608k());
        Timeout timeout = bufferedSource.getTimeout();
        long jM15605h = chain.m15605h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(jM15605h, timeUnit);
        bufferedSink.getTimeout().timeout(chain.m15607j(), timeUnit);
        return new C9591b(client, this, bufferedSource, bufferedSink);
    }

    /* renamed from: x */
    public final synchronized void m14887x() {
        this.f15826m = true;
    }

    /* renamed from: y */
    public final synchronized void m14888y() {
        this.f15825l = true;
    }

    /* renamed from: z */
    public C8902a0 m14889z() {
        return this.f15817d;
    }
}
