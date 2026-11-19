package okhttp3.internal.connection;

import com.efs.sdk.base.Constants;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Timeout;
import p004a3.C0021k;
import p050d3.AbstractC3709c;
import p050d3.C3710d;
import p117r2.AbstractC4514q;
import p117r2.C4495a;
import p117r2.C4496a0;
import p117r2.C4500c0;
import p117r2.C4508k;
import p117r2.C4517t;
import p117r2.C4521x;
import p117r2.C4522y;
import p117r2.InterfaceC4502e;
import p117r2.InterfaceC4506i;
import p121s2.AbstractC4550b;
import p133v2.C4635e;
import p137w2.AbstractC4646f;
import p137w2.C4642b;
import p137w2.C4645e;
import p137w2.C4647g;
import p141x2.C4670g;
import p141x2.InterfaceC4667d;
import p145y2.C4688b;
import p149z2.C4711d;
import p149z2.C4712e;
import p149z2.C4714g;
import p149z2.C4718k;

/* loaded from: classes2.dex */
public final class RealConnection extends C4711d.d implements InterfaceC4506i {

    /* renamed from: t */
    public static final C4430a f5058t = new C4430a(null);

    /* renamed from: c */
    public Socket f5059c;

    /* renamed from: d */
    public Socket f5060d;

    /* renamed from: e */
    public Handshake f5061e;

    /* renamed from: f */
    public Protocol f5062f;

    /* renamed from: g */
    public C4711d f5063g;

    /* renamed from: h */
    public BufferedSource f5064h;

    /* renamed from: i */
    public BufferedSink f5065i;

    /* renamed from: j */
    public boolean f5066j;

    /* renamed from: k */
    public boolean f5067k;

    /* renamed from: l */
    public int f5068l;

    /* renamed from: m */
    public int f5069m;

    /* renamed from: n */
    public int f5070n;

    /* renamed from: o */
    public int f5071o;

    /* renamed from: p */
    public final List f5072p;

    /* renamed from: q */
    public long f5073q;

    /* renamed from: r */
    public final C4647g f5074r;

    /* renamed from: s */
    public final C4500c0 f5075s;

    /* renamed from: okhttp3.internal.connection.RealConnection$a */
    public static final class C4430a {
        public C4430a() {
        }

        public /* synthetic */ C4430a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public RealConnection(C4647g connectionPool, C4500c0 route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f5074r = connectionPool;
        this.f5075s = route;
        this.f5071o = 1;
        this.f5072p = new ArrayList();
        this.f5073q = Long.MAX_VALUE;
    }

    /* renamed from: A */
    public final boolean m5586A(List list) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4500c0 c4500c0 = (C4500c0) it.next();
            if (c4500c0.m5848b().type() == Proxy.Type.DIRECT && this.f5075s.m5848b().type() == Proxy.Type.DIRECT && Intrinsics.areEqual(this.f5075s.m5850d(), c4500c0.m5850d())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public final void m5587B(long j4) {
        this.f5073q = j4;
    }

    /* renamed from: C */
    public final void m5588C(boolean z3) {
        this.f5066j = z3;
    }

    /* renamed from: D */
    public Socket m5589D() {
        Socket socket = this.f5060d;
        Intrinsics.checkNotNull(socket);
        return socket;
    }

    /* renamed from: E */
    public final void m5590E(int i4) throws SocketException {
        Socket socket = this.f5060d;
        Intrinsics.checkNotNull(socket);
        BufferedSource bufferedSource = this.f5064h;
        Intrinsics.checkNotNull(bufferedSource);
        BufferedSink bufferedSink = this.f5065i;
        Intrinsics.checkNotNull(bufferedSink);
        socket.setSoTimeout(0);
        C4711d c4711dM6796a = new C4711d.b(true, C4635e.f5849h).m6808m(socket, this.f5075s.m5847a().m5798l().m5987i(), bufferedSource, bufferedSink).m6806k(this).m6807l(i4).m6796a();
        this.f5063g = c4711dM6796a;
        this.f5071o = C4711d.f6104D.m6809a().m6918d();
        C4711d.m6743T(c4711dM6796a, false, null, 3, null);
    }

    /* renamed from: F */
    public final boolean m5591F(C4517t c4517t) {
        Handshake handshake;
        if (AbstractC4550b.f5708h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        C4517t c4517tM5798l = this.f5075s.m5847a().m5798l();
        if (c4517t.m5992n() != c4517tM5798l.m5992n()) {
            return false;
        }
        if (Intrinsics.areEqual(c4517t.m5987i(), c4517tM5798l.m5987i())) {
            return true;
        }
        if (this.f5067k || (handshake = this.f5061e) == null) {
            return false;
        }
        Intrinsics.checkNotNull(handshake);
        return m5596e(c4517t, handshake);
    }

    /* renamed from: G */
    public final synchronized void m5592G(C4645e call, IOException iOException) {
        Intrinsics.checkNotNullParameter(call, "call");
        if (iOException instanceof StreamResetException) {
            if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                int i4 = this.f5070n + 1;
                this.f5070n = i4;
                if (i4 > 1) {
                    this.f5066j = true;
                    this.f5068l++;
                }
            } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !call.mo5868T()) {
                this.f5066j = true;
                this.f5068l++;
            }
        } else if (!m5613v() || (iOException instanceof ConnectionShutdownException)) {
            this.f5066j = true;
            if (this.f5069m == 0) {
                if (iOException != null) {
                    m5598g(call.m6513k(), this.f5075s, iOException);
                }
                this.f5068l++;
            }
        }
    }

    @Override // p149z2.C4711d.d
    /* renamed from: a */
    public synchronized void mo5593a(C4711d connection, C4718k settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f5071o = settings.m6918d();
    }

    @Override // p149z2.C4711d.d
    /* renamed from: b */
    public void mo5594b(C4714g stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.m6857d(ErrorCode.REFUSED_STREAM, null);
    }

    /* renamed from: d */
    public final void m5595d() throws IOException {
        Socket socket = this.f5059c;
        if (socket != null) {
            AbstractC4550b.m6229k(socket);
        }
    }

    /* renamed from: e */
    public final boolean m5596e(C4517t c4517t, Handshake handshake) {
        List listM5575d = handshake.m5575d();
        if (!listM5575d.isEmpty()) {
            C3710d c3710d = C3710d.f4334a;
            String strM5987i = c4517t.m5987i();
            Object obj = listM5575d.get(0);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            if (c3710d.m4701c(strM5987i, (X509Certificate) obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014c A[SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5597f(int r17, int r18, int r19, int r20, boolean r21, p117r2.InterfaceC4502e r22, p117r2.AbstractC4514q r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.m5597f(int, int, int, int, boolean, r2.e, r2.q):void");
    }

    /* renamed from: g */
    public final void m5598g(C4521x client, C4500c0 failedRoute, IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.m5848b().type() != Proxy.Type.DIRECT) {
            C4495a c4495aM5847a = failedRoute.m5847a();
            c4495aM5847a.m5795i().connectFailed(c4495aM5847a.m5798l().m5997s(), failedRoute.m5848b().address(), failure);
        }
        client.m6086r().m6541b(failedRoute);
    }

    /* renamed from: h */
    public final void m5599h(int i4, int i5, InterfaceC4502e interfaceC4502e, AbstractC4514q abstractC4514q) throws IOException {
        Socket socket;
        int i6;
        Proxy proxyM5848b = this.f5075s.m5848b();
        C4495a c4495aM5847a = this.f5075s.m5847a();
        Proxy.Type type = proxyM5848b.type();
        if (type != null && ((i6 = AbstractC4646f.f5923a[type.ordinal()]) == 1 || i6 == 2)) {
            socket = c4495aM5847a.m5796j().createSocket();
            Intrinsics.checkNotNull(socket);
        } else {
            socket = new Socket(proxyM5848b);
        }
        this.f5059c = socket;
        abstractC4514q.m5935i(interfaceC4502e, this.f5075s.m5850d(), proxyM5848b);
        socket.setSoTimeout(i5);
        try {
            C0021k.f39c.m71g().mo34f(socket, this.f5075s.m5850d(), i4);
            try {
                this.f5064h = Okio.buffer(Okio.source(socket));
                this.f5065i = Okio.buffer(Okio.sink(socket));
            } catch (NullPointerException e4) {
                if (Intrinsics.areEqual(e4.getMessage(), "throw with null exception")) {
                    throw new IOException(e4);
                }
            }
        } catch (ConnectException e5) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f5075s.m5850d());
            connectException.initCause(e5);
            throw connectException;
        }
    }

    /* renamed from: i */
    public final void m5600i(C4642b c4642b) throws Throwable {
        final C4495a c4495aM5847a = this.f5075s.m5847a();
        SSLSocketFactory sSLSocketFactoryM5797k = c4495aM5847a.m5797k();
        SSLSocket sSLSocket = null;
        try {
            Intrinsics.checkNotNull(sSLSocketFactoryM5797k);
            Socket socketCreateSocket = sSLSocketFactoryM5797k.createSocket(this.f5059c, c4495aM5847a.m5798l().m5987i(), c4495aM5847a.m5798l().m5992n(), true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                C4508k c4508kM6470a = c4642b.m6470a(sSLSocket2);
                if (c4508kM6470a.m5891h()) {
                    C0021k.f39c.m71g().mo27e(sSLSocket2, c4495aM5847a.m5798l().m5987i(), c4495aM5847a.m5792f());
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                Handshake.Companion companion = Handshake.f5034e;
                Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
                final Handshake handshakeM5577a = companion.m5577a(sslSocketSession);
                HostnameVerifier hostnameVerifierM5791e = c4495aM5847a.m5791e();
                Intrinsics.checkNotNull(hostnameVerifierM5791e);
                if (hostnameVerifierM5791e.verify(c4495aM5847a.m5798l().m5987i(), sslSocketSession)) {
                    final CertificatePinner certificatePinnerM5787a = c4495aM5847a.m5787a();
                    Intrinsics.checkNotNull(certificatePinnerM5787a);
                    this.f5061e = new Handshake(handshakeM5577a.m5576e(), handshakeM5577a.m5572a(), handshakeM5577a.m5574c(), new Function0<List<? extends Certificate>>() { // from class: okhttp3.internal.connection.RealConnection$connectTls$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final List invoke() {
                            AbstractC3709c abstractC3709cM5566d = certificatePinnerM5787a.m5566d();
                            Intrinsics.checkNotNull(abstractC3709cM5566d);
                            return abstractC3709cM5566d.mo1513a(handshakeM5577a.m5575d(), c4495aM5847a.m5798l().m5987i());
                        }
                    });
                    certificatePinnerM5787a.m5564b(c4495aM5847a.m5798l().m5987i(), new Function0<List<? extends X509Certificate>>() { // from class: okhttp3.internal.connection.RealConnection$connectTls$2
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final List invoke() {
                            Handshake handshake = this.f5079a.f5061e;
                            Intrinsics.checkNotNull(handshake);
                            List<Certificate> listM5575d = handshake.m5575d();
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listM5575d, 10));
                            for (Certificate certificate : listM5575d) {
                                if (certificate == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                                }
                                arrayList.add((X509Certificate) certificate);
                            }
                            return arrayList;
                        }
                    });
                    String strMo28g = c4508kM6470a.m5891h() ? C0021k.f39c.m71g().mo28g(sSLSocket2) : null;
                    this.f5060d = sSLSocket2;
                    this.f5064h = Okio.buffer(Okio.source(sSLSocket2));
                    this.f5065i = Okio.buffer(Okio.sink(sSLSocket2));
                    this.f5062f = strMo28g != null ? Protocol.INSTANCE.m5582a(strMo28g) : Protocol.HTTP_1_1;
                    C0021k.f39c.m71g().mo50b(sSLSocket2);
                    return;
                }
                List listM5575d = handshakeM5577a.m5575d();
                if (!(!listM5575d.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + c4495aM5847a.m5798l().m5987i() + " not verified (no certificates)");
                }
                Object obj = listM5575d.get(0);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder();
                sb.append("\n              |Hostname ");
                sb.append(c4495aM5847a.m5798l().m5987i());
                sb.append(" not verified:\n              |    certificate: ");
                sb.append(CertificatePinner.f5027d.m5569a(x509Certificate));
                sb.append("\n              |    DN: ");
                Principal subjectDN = x509Certificate.getSubjectDN();
                Intrinsics.checkNotNullExpressionValue(subjectDN, "cert.subjectDN");
                sb.append(subjectDN.getName());
                sb.append("\n              |    subjectAltNames: ");
                sb.append(C3710d.f4334a.m4699a(x509Certificate));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(StringsKt__IndentKt.trimMargin$default(sb.toString(), null, 1, null));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    C0021k.f39c.m71g().mo50b(sSLSocket);
                }
                if (sSLSocket != null) {
                    AbstractC4550b.m6229k(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: j */
    public final void m5601j(int i4, int i5, int i6, InterfaceC4502e interfaceC4502e, AbstractC4514q abstractC4514q) throws IOException {
        C4522y c4522yM5603l = m5603l();
        C4517t c4517tM6141j = c4522yM5603l.m6141j();
        for (int i7 = 0; i7 < 21; i7++) {
            m5599h(i4, i5, interfaceC4502e, abstractC4514q);
            c4522yM5603l = m5602k(i5, i6, c4522yM5603l, c4517tM6141j);
            if (c4522yM5603l == null) {
                return;
            }
            Socket socket = this.f5059c;
            if (socket != null) {
                AbstractC4550b.m6229k(socket);
            }
            this.f5059c = null;
            this.f5065i = null;
            this.f5064h = null;
            abstractC4514q.m5933g(interfaceC4502e, this.f5075s.m5850d(), this.f5075s.m5848b(), null);
        }
    }

    /* renamed from: k */
    public final C4522y m5602k(int i4, int i5, C4522y c4522y, C4517t c4517t) throws IOException {
        String str = "CONNECT " + AbstractC4550b.m6209L(c4517t, true) + " HTTP/1.1";
        while (true) {
            BufferedSource bufferedSource = this.f5064h;
            Intrinsics.checkNotNull(bufferedSource);
            BufferedSink bufferedSink = this.f5065i;
            Intrinsics.checkNotNull(bufferedSink);
            C4688b c4688b = new C4688b(null, this, bufferedSource, bufferedSink);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            bufferedSource.getTimeout().timeout(i4, timeUnit);
            bufferedSink.getTimeout().timeout(i5, timeUnit);
            c4688b.m6639A(c4522y.m6136e(), str);
            c4688b.mo6567b();
            C4496a0.a aVarMo6570e = c4688b.mo6570e(false);
            Intrinsics.checkNotNull(aVarMo6570e);
            C4496a0 c4496a0M5820c = aVarMo6570e.m5835r(c4522y).m5820c();
            c4688b.m6648z(c4496a0M5820c);
            int iM5804e = c4496a0M5820c.m5804e();
            if (iM5804e == 200) {
                if (bufferedSource.getBuffer().exhausted() && bufferedSink.getBuffer().exhausted()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iM5804e != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + c4496a0M5820c.m5804e());
            }
            C4522y c4522yMo5837a = this.f5075s.m5847a().m5794h().mo5837a(this.f5075s, c4496a0M5820c);
            if (c4522yMo5837a == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (StringsKt__StringsJVMKt.equals("close", C4496a0.m5799i(c4496a0M5820c, "Connection", null, 2, null), true)) {
                return c4522yMo5837a;
            }
            c4522y = c4522yMo5837a;
        }
    }

    /* renamed from: l */
    public final C4522y m5603l() {
        C4522y c4522yM6143b = new C4522y.a().m6150i(this.f5075s.m5847a().m5798l()).m6146e("CONNECT", null).m6144c("Host", AbstractC4550b.m6209L(this.f5075s.m5847a().m5798l(), true)).m6144c("Proxy-Connection", "Keep-Alive").m6144c("User-Agent", "okhttp/4.9.0").m6143b();
        C4522y c4522yMo5837a = this.f5075s.m5847a().m5794h().mo5837a(this.f5075s, new C4496a0.a().m5835r(c4522yM6143b).m5833p(Protocol.HTTP_1_1).m5824g(407).m5830m("Preemptive Authenticate").m5819b(AbstractC4550b.f5703c).m5836s(-1L).m5834q(-1L).m5827j("Proxy-Authenticate", "OkHttp-Preemptive").m5820c());
        return c4522yMo5837a != null ? c4522yMo5837a : c4522yM6143b;
    }

    /* renamed from: m */
    public final void m5604m(C4642b c4642b, int i4, InterfaceC4502e interfaceC4502e, AbstractC4514q abstractC4514q) throws Throwable {
        if (this.f5075s.m5847a().m5797k() != null) {
            abstractC4514q.m5926B(interfaceC4502e);
            m5600i(c4642b);
            abstractC4514q.m5925A(interfaceC4502e, this.f5061e);
            if (this.f5062f == Protocol.HTTP_2) {
                m5590E(i4);
                return;
            }
            return;
        }
        List listM5792f = this.f5075s.m5847a().m5792f();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!listM5792f.contains(protocol)) {
            this.f5060d = this.f5059c;
            this.f5062f = Protocol.HTTP_1_1;
        } else {
            this.f5060d = this.f5059c;
            this.f5062f = protocol;
            m5590E(i4);
        }
    }

    /* renamed from: n */
    public final List m5605n() {
        return this.f5072p;
    }

    /* renamed from: o */
    public final long m5606o() {
        return this.f5073q;
    }

    /* renamed from: p */
    public final boolean m5607p() {
        return this.f5066j;
    }

    /* renamed from: q */
    public final int m5608q() {
        return this.f5068l;
    }

    /* renamed from: r */
    public Handshake m5609r() {
        return this.f5061e;
    }

    /* renamed from: s */
    public final synchronized void m5610s() {
        this.f5069m++;
    }

    /* renamed from: t */
    public final boolean m5611t(C4495a address, List list) {
        Intrinsics.checkNotNullParameter(address, "address");
        if (AbstractC4550b.f5708h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        if (this.f5072p.size() >= this.f5071o || this.f5066j || !this.f5075s.m5847a().m5790d(address)) {
            return false;
        }
        if (Intrinsics.areEqual(address.m5798l().m5987i(), m5617z().m5847a().m5798l().m5987i())) {
            return true;
        }
        if (this.f5063g == null || list == null || !m5586A(list) || address.m5791e() != C3710d.f4334a || !m5591F(address.m5798l())) {
            return false;
        }
        try {
            CertificatePinner certificatePinnerM5787a = address.m5787a();
            Intrinsics.checkNotNull(certificatePinnerM5787a);
            String strM5987i = address.m5798l().m5987i();
            Handshake handshakeM5609r = m5609r();
            Intrinsics.checkNotNull(handshakeM5609r);
            certificatePinnerM5787a.m5563a(strM5987i, handshakeM5609r.m5575d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public String toString() {
        Object objM5572a;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f5075s.m5847a().m5798l().m5987i());
        sb.append(':');
        sb.append(this.f5075s.m5847a().m5798l().m5992n());
        sb.append(',');
        sb.append(" proxy=");
        sb.append(this.f5075s.m5848b());
        sb.append(" hostAddress=");
        sb.append(this.f5075s.m5850d());
        sb.append(" cipherSuite=");
        Handshake handshake = this.f5061e;
        if (handshake == null || (objM5572a = handshake.m5572a()) == null) {
            objM5572a = Constants.CP_NONE;
        }
        sb.append(objM5572a);
        sb.append(" protocol=");
        sb.append(this.f5062f);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final boolean m5612u(boolean z3) {
        long j4;
        if (AbstractC4550b.f5708h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.f5059c;
        Intrinsics.checkNotNull(socket);
        Socket socket2 = this.f5060d;
        Intrinsics.checkNotNull(socket2);
        BufferedSource bufferedSource = this.f5064h;
        Intrinsics.checkNotNull(bufferedSource);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C4711d c4711d = this.f5063g;
        if (c4711d != null) {
            return c4711d.m6767F(jNanoTime);
        }
        synchronized (this) {
            j4 = jNanoTime - this.f5073q;
        }
        if (j4 < 10000000000L || !z3) {
            return true;
        }
        return AbstractC4550b.m6200C(socket2, bufferedSource);
    }

    /* renamed from: v */
    public final boolean m5613v() {
        return this.f5063g != null;
    }

    /* renamed from: w */
    public final InterfaceC4667d m5614w(C4521x client, C4670g chain) throws SocketException {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f5060d;
        Intrinsics.checkNotNull(socket);
        BufferedSource bufferedSource = this.f5064h;
        Intrinsics.checkNotNull(bufferedSource);
        BufferedSink bufferedSink = this.f5065i;
        Intrinsics.checkNotNull(bufferedSink);
        C4711d c4711d = this.f5063g;
        if (c4711d != null) {
            return new C4712e(client, this, chain, c4711d);
        }
        socket.setSoTimeout(chain.m6594j());
        Timeout timeout = bufferedSource.getTimeout();
        long jM6591g = chain.m6591g();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(jM6591g, timeUnit);
        bufferedSink.getTimeout().timeout(chain.m6593i(), timeUnit);
        return new C4688b(client, this, bufferedSource, bufferedSink);
    }

    /* renamed from: x */
    public final synchronized void m5615x() {
        this.f5067k = true;
    }

    /* renamed from: y */
    public final synchronized void m5616y() {
        this.f5066j = true;
    }

    /* renamed from: z */
    public C4500c0 m5617z() {
        return this.f5075s;
    }
}
