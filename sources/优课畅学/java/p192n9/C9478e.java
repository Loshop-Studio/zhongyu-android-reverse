package p192n9;

import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.C9560b;
import okhttp3.C9561c;
import okhttp3.Protocol;
import okhttp3.internal.platform.AbstractC9570c;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Timeout;
import p113g8.AbstractC8680s;
import p113g8.AbstractC8687z;
import p123h7.C8736p;
import p134i7.AbstractC8811w;
import p136i9.C8896a;
import p136i9.C8899b0;
import p136i9.C8903d0;
import p136i9.C8907f0;
import p136i9.C8910h;
import p147j9.AbstractC9041k;
import p181m9.C9346d;
import p192n9.InterfaceC9494u;
import p203o9.InterfaceC9549d;
import p214p9.C9775b;
import p300x7.InterfaceC10559a;
import p302x9.AbstractC10588c;
import p302x9.C10589d;

/* renamed from: n9.e */
/* loaded from: classes5.dex */
public final class C9478e implements InterfaceC9494u.b, InterfaceC9549d.a {

    /* renamed from: y */
    public static final a f18702y = new a(null);

    /* renamed from: a */
    public final C9346d f18703a;

    /* renamed from: b */
    public final C9489p f18704b;

    /* renamed from: c */
    public final int f18705c;

    /* renamed from: d */
    public final int f18706d;

    /* renamed from: e */
    public final int f18707e;

    /* renamed from: f */
    public final int f18708f;

    /* renamed from: g */
    public final int f18709g;

    /* renamed from: h */
    public final boolean f18710h;

    /* renamed from: i */
    public final InterfaceC9480g f18711i;

    /* renamed from: j */
    public final C9490q f18712j;

    /* renamed from: k */
    public final C8907f0 f18713k;

    /* renamed from: l */
    public final List f18714l;

    /* renamed from: m */
    public final int f18715m;

    /* renamed from: n */
    public final C8899b0 f18716n;

    /* renamed from: o */
    public final int f18717o;

    /* renamed from: p */
    public final boolean f18718p;

    /* renamed from: q */
    public volatile boolean f18719q;

    /* renamed from: r */
    public Socket f18720r;

    /* renamed from: s */
    public Socket f18721s;

    /* renamed from: t */
    public C9561c f18722t;

    /* renamed from: u */
    public Protocol f18723u;

    /* renamed from: v */
    public BufferedSource f18724v;

    /* renamed from: w */
    public BufferedSink f18725w;

    /* renamed from: x */
    public C9488o f18726x;

    /* renamed from: n9.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: n9.e$b */
    public static final /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18727a;

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
            f18727a = iArr;
        }
    }

    public C9478e(C9346d taskRunner, C9489p connectionPool, int i10, int i11, int i12, int i13, int i14, boolean z10, InterfaceC9480g user, C9490q routePlanner, C8907f0 route, List list, int i15, C8899b0 c8899b0, int i16, boolean z11) {
        AbstractC9133u.m16133g(taskRunner, "taskRunner");
        AbstractC9133u.m16133g(connectionPool, "connectionPool");
        AbstractC9133u.m16133g(user, "user");
        AbstractC9133u.m16133g(routePlanner, "routePlanner");
        AbstractC9133u.m16133g(route, "route");
        this.f18703a = taskRunner;
        this.f18704b = connectionPool;
        this.f18705c = i10;
        this.f18706d = i11;
        this.f18707e = i12;
        this.f18708f = i13;
        this.f18709g = i14;
        this.f18710h = z10;
        this.f18711i = user;
        this.f18712j = routePlanner;
        this.f18713k = route;
        this.f18714l = list;
        this.f18715m = i15;
        this.f18716n = c8899b0;
        this.f18717o = i16;
        this.f18718p = z11;
    }

    /* renamed from: l */
    public static final List m17440l(C8910h c8910h, C9561c c9561c, C8896a c8896a) {
        AbstractC10588c abstractC10588cM15183f = c8910h.m15183f();
        AbstractC9133u.m16130d(abstractC10588cM15183f);
        return abstractC10588cM15183f.mo19122a(c9561c.m17902e(), c8896a.m14950l().m15284h());
    }

    /* renamed from: m */
    public static final List m17441m(C9561c c9561c) {
        List<Certificate> listM17902e = c9561c.m17902e();
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(listM17902e, 10));
        for (Certificate certificate : listM17902e) {
            AbstractC9133u.m16131e(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    /* renamed from: p */
    public static /* synthetic */ C9478e m17442p(C9478e c9478e, int i10, C8899b0 c8899b0, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = c9478e.f18715m;
        }
        if ((i12 & 2) != 0) {
            c8899b0 = c9478e.f18716n;
        }
        if ((i12 & 4) != 0) {
            i11 = c9478e.f18717o;
        }
        if ((i12 & 8) != 0) {
            z10 = c9478e.f18718p;
        }
        return c9478e.m17453o(i10, c8899b0, i11, z10);
    }

    @Override // p192n9.InterfaceC9494u.b
    /* renamed from: a */
    public C9488o mo17443a() throws IOException {
        this.f18711i.mo17420g(mo17446d());
        C9488o c9488o = this.f18726x;
        AbstractC9133u.m16130d(c9488o);
        this.f18711i.mo17418e(c9488o, mo17446d());
        C9492s c9492sM17582l = this.f18712j.m17582l(this, this.f18714l);
        if (c9492sM17582l != null) {
            return c9492sM17582l.m17588g();
        }
        synchronized (c9488o) {
            this.f18704b.m17573g(c9488o);
            this.f18711i.mo17422i(c9488o);
            C8736p c8736p = C8736p.f16368a;
        }
        this.f18711i.mo17436w(c9488o);
        this.f18711i.mo17423j(c9488o);
        return c9488o;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0192  */
    @Override // p192n9.InterfaceC9494u.b
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p192n9.InterfaceC9494u.a mo17445c() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p192n9.C9478e.mo17445c():n9.u$a");
    }

    @Override // p192n9.InterfaceC9494u.b, p203o9.InterfaceC9549d.a
    public void cancel() throws IOException {
        this.f18719q = true;
        Socket socket = this.f18720r;
        if (socket != null) {
            AbstractC9041k.m15778h(socket);
        }
    }

    @Override // p203o9.InterfaceC9549d.a
    /* renamed from: d */
    public C8907f0 mo17446d() {
        return this.f18713k;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    @Override // p192n9.InterfaceC9494u.b
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p192n9.InterfaceC9494u.a mo17447e() throws java.lang.Throwable {
        /*
            r14 = this;
            java.net.Socket r0 = r14.f18720r
            if (r0 != 0) goto Laf
            n9.g r0 = r14.f18711i
            r0.mo17419f(r14)
            r1 = 0
            n9.g r0 = r14.f18711i     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            i9.f0 r2 = r14.mo17446d()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            r0.mo17424k(r2)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            r14.m17450j()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            r1 = 1
            n9.u$a r2 = new n9.u$a     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            r3 = r14
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            n9.g r0 = r3.f18711i
            r0.mo17426m(r14)
            return r2
        L27:
            r0 = move-exception
            goto La0
        L2a:
            r0 = move-exception
        L2b:
            r11 = r0
            goto L33
        L2d:
            r0 = move-exception
            r3 = r14
            goto La0
        L30:
            r0 = move-exception
            r3 = r14
            goto L2b
        L33:
            i9.f0 r0 = r14.mo17446d()     // Catch: java.lang.Throwable -> L27
            i9.a r0 = r0.m15174a()     // Catch: java.lang.Throwable -> L27
            java.net.Proxy r0 = r0.m14945g()     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L7c
            i9.f0 r0 = r14.mo17446d()     // Catch: java.lang.Throwable -> L27
            java.net.Proxy r0 = r0.m15175b()     // Catch: java.lang.Throwable -> L27
            java.net.Proxy$Type r0 = r0.type()     // Catch: java.lang.Throwable -> L27
            java.net.Proxy$Type r2 = java.net.Proxy.Type.DIRECT     // Catch: java.lang.Throwable -> L27
            if (r0 == r2) goto L7c
            i9.f0 r0 = r14.mo17446d()     // Catch: java.lang.Throwable -> L27
            i9.a r0 = r0.m15174a()     // Catch: java.lang.Throwable -> L27
            java.net.ProxySelector r0 = r0.m14947i()     // Catch: java.lang.Throwable -> L27
            i9.f0 r2 = r14.mo17446d()     // Catch: java.lang.Throwable -> L27
            i9.a r2 = r2.m15174a()     // Catch: java.lang.Throwable -> L27
            i9.w r2 = r2.m14950l()     // Catch: java.lang.Throwable -> L27
            java.net.URI r2 = r2.m15294r()     // Catch: java.lang.Throwable -> L27
            i9.f0 r4 = r14.mo17446d()     // Catch: java.lang.Throwable -> L27
            java.net.Proxy r4 = r4.m15175b()     // Catch: java.lang.Throwable -> L27
            java.net.SocketAddress r4 = r4.address()     // Catch: java.lang.Throwable -> L27
            r0.connectFailed(r2, r4, r11)     // Catch: java.lang.Throwable -> L27
        L7c:
            n9.g r0 = r3.f18711i     // Catch: java.lang.Throwable -> L27
            i9.f0 r2 = r14.mo17446d()     // Catch: java.lang.Throwable -> L27
            r4 = 0
            r0.mo17430q(r2, r4, r11)     // Catch: java.lang.Throwable -> L27
            n9.u$a r8 = new n9.u$a     // Catch: java.lang.Throwable -> L27
            r12 = 2
            r13 = 0
            r10 = 0
            r9 = r3
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L9e
            n9.g r0 = r3.f18711i
            r0.mo17426m(r14)
            if (r1 != 0) goto L9d
            java.net.Socket r0 = r3.f18720r
            if (r0 == 0) goto L9d
            p147j9.AbstractC9041k.m15778h(r0)
        L9d:
            return r8
        L9e:
            r0 = move-exception
            r3 = r9
        La0:
            n9.g r2 = r3.f18711i
            r2.mo17426m(r14)
            if (r1 != 0) goto Lae
            java.net.Socket r1 = r3.f18720r
            if (r1 == 0) goto Lae
            p147j9.AbstractC9041k.m15778h(r1)
        Lae:
            throw r0
        Laf:
            r3 = r14
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "TCP already connected"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p192n9.C9478e.mo17447e():n9.u$a");
    }

    @Override // p203o9.InterfaceC9549d.a
    /* renamed from: f */
    public void mo17448f(C9487n call, IOException iOException) {
        AbstractC9133u.m16133g(call, "call");
    }

    /* renamed from: i */
    public final void m17449i() {
        Socket socket = this.f18721s;
        if (socket != null) {
            AbstractC9041k.m15778h(socket);
        }
    }

    @Override // p192n9.InterfaceC9494u.b
    public boolean isReady() {
        return this.f18723u != null;
    }

    /* renamed from: j */
    public final void m17450j() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = mo17446d().m15175b().type();
        int i10 = type == null ? -1 : b.f18727a[type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            socketCreateSocket = mo17446d().m15174a().m14948j().createSocket();
            AbstractC9133u.m16130d(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(mo17446d().m15175b());
        }
        this.f18720r = socketCreateSocket;
        if (this.f18719q) {
            throw new IOException("canceled");
        }
        socketCreateSocket.setSoTimeout(this.f18708f);
        try {
            AbstractC9570c.f19216a.m18112e().mo18099h(socketCreateSocket, mo17446d().m15177d(), this.f18707e);
            try {
                this.f18724v = Okio.buffer(Okio.source(socketCreateSocket));
                this.f18725w = Okio.buffer(Okio.sink(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (AbstractC9133u.m16128b(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + mo17446d().m15177d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    /* renamed from: k */
    public final void m17451k(SSLSocket sSLSocket, C9560b c9560b) throws IOException {
        final C8896a c8896aM15174a = mo17446d().m15174a();
        try {
            if (c9560b.m17889h()) {
                AbstractC9570c.f19216a.m18112e().mo18090g(sSLSocket, c8896aM15174a.m14950l().m15284h(), c8896aM15174a.m14944f());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            C9561c.a aVar = C9561c.f19095e;
            AbstractC9133u.m16130d(session);
            final C9561c c9561cM17906b = aVar.m17906b(session);
            HostnameVerifier hostnameVerifierM14943e = c8896aM15174a.m14943e();
            AbstractC9133u.m16130d(hostnameVerifierM14943e);
            if (hostnameVerifierM14943e.verify(c8896aM15174a.m14950l().m15284h(), session)) {
                final C8910h c8910hM14939a = c8896aM15174a.m14939a();
                AbstractC9133u.m16130d(c8910hM14939a);
                final C9561c c9561c = new C9561c(c9561cM17906b.m17903g(), c9561cM17906b.m17899b(), c9561cM17906b.m17901d(), new InterfaceC10559a() { // from class: n9.c
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return C9478e.m17440l(c8910hM14939a, c9561cM17906b, c8896aM15174a);
                    }
                });
                this.f18722t = c9561c;
                c8910hM14939a.m15181d(c8896aM15174a.m14950l().m15284h(), new InterfaceC10559a() { // from class: n9.d
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return C9478e.m17441m(c9561c);
                    }
                });
                String strMo18091i = c9560b.m17889h() ? AbstractC9570c.f19216a.m18112e().mo18091i(sSLSocket) : null;
                this.f18721s = sSLSocket;
                this.f18724v = Okio.buffer(Okio.source(sSLSocket));
                this.f18725w = Okio.buffer(Okio.sink(sSLSocket));
                this.f18723u = strMo18091i != null ? Protocol.f18937b.m17869a(strMo18091i) : Protocol.f18939d;
                AbstractC9570c.f19216a.m18112e().m18105d(sSLSocket);
                return;
            }
            List listM17902e = c9561cM17906b.m17902e();
            if (listM17902e.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + c8896aM15174a.m14950l().m15284h() + " not verified (no certificates)");
            }
            Object obj = listM17902e.get(0);
            AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            throw new SSLPeerUnverifiedException(AbstractC8680s.m14088p("\n            |Hostname " + c8896aM15174a.m14950l().m15284h() + " not verified:\n            |    certificate: " + C8910h.f16736c.m15186a(x509Certificate) + "\n            |    DN: " + x509Certificate.getSubjectDN().getName() + "\n            |    subjectAltNames: " + C10589d.f20983a.m19745a(x509Certificate) + "\n            ", null, 1, null));
        } catch (Throwable th) {
            AbstractC9570c.f19216a.m18112e().m18105d(sSLSocket);
            AbstractC9041k.m15778h(sSLSocket);
            throw th;
        }
    }

    /* renamed from: n */
    public final InterfaceC9494u.a m17452n() throws IOException {
        C8899b0 c8899b0M17454q = m17454q();
        if (c8899b0M17454q == null) {
            return new InterfaceC9494u.a(this, null, null, 6, null);
        }
        Socket socket = this.f18720r;
        if (socket != null) {
            AbstractC9041k.m15778h(socket);
        }
        int i10 = this.f18715m + 1;
        if (i10 < 21) {
            this.f18711i.mo17414a(mo17446d(), null);
            return new InterfaceC9494u.a(this, m17442p(this, i10, c8899b0M17454q, 0, false, 12, null), null, 4, null);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        this.f18711i.mo17430q(mo17446d(), null, protocolException);
        return new InterfaceC9494u.a(this, null, protocolException, 2, null);
    }

    /* renamed from: o */
    public final C9478e m17453o(int i10, C8899b0 c8899b0, int i11, boolean z10) {
        return new C9478e(this.f18703a, this.f18704b, this.f18705c, this.f18706d, this.f18707e, this.f18708f, this.f18709g, this.f18710h, this.f18711i, this.f18712j, mo17446d(), this.f18714l, i10, c8899b0, i11, z10);
    }

    /* renamed from: q */
    public final C8899b0 m17454q() throws IOException {
        C8899b0 c8899b0 = this.f18716n;
        AbstractC9133u.m16130d(c8899b0);
        String str = "CONNECT " + AbstractC9041k.m15790t(mo17446d().m15174a().m14950l(), true) + " HTTP/1.1";
        while (true) {
            BufferedSource bufferedSource = this.f18724v;
            if (bufferedSource == null) {
                AbstractC9133u.m16151y("source");
                bufferedSource = null;
            }
            BufferedSink bufferedSink = this.f18725w;
            if (bufferedSink == null) {
                AbstractC9133u.m16151y("sink");
                bufferedSink = null;
            }
            C9775b c9775b = new C9775b(null, this, bufferedSource, bufferedSink);
            BufferedSource bufferedSource2 = this.f18724v;
            if (bufferedSource2 == null) {
                AbstractC9133u.m16151y("source");
                bufferedSource2 = null;
            }
            Timeout timeout = bufferedSource2.timeout();
            long j10 = this.f18705c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            timeout.timeout(j10, timeUnit);
            BufferedSink bufferedSink2 = this.f18725w;
            if (bufferedSink2 == null) {
                AbstractC9133u.m16151y("sink");
                bufferedSink2 = null;
            }
            bufferedSink2.timeout().timeout(this.f18706d, timeUnit);
            c9775b.m18314B(c8899b0.m15046f(), str);
            c9775b.mo17827a();
            C8903d0.a aVarMo17831e = c9775b.mo17831e(false);
            AbstractC9133u.m16130d(aVarMo17831e);
            C8903d0 c8903d0M15145c = aVarMo17831e.m15159q(c8899b0).m15145c();
            c9775b.m18313A(c8903d0M15145c);
            int iM15128f = c8903d0M15145c.m15128f();
            if (iM15128f == 200) {
                return null;
            }
            if (iM15128f != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + c8903d0M15145c.m15128f());
            }
            C8899b0 c8899b0Mo15040a = mo17446d().m15174a().m14946h().mo15040a(mo17446d(), c8903d0M15145c);
            if (c8899b0Mo15040a == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (AbstractC8687z.m14093A("close", C8903d0.m15123k(c8903d0M15145c, "Connection", null, 2, null), true)) {
                return c8899b0Mo15040a;
            }
            c8899b0 = c8899b0Mo15040a;
        }
    }

    /* renamed from: r */
    public final List m17455r() {
        return this.f18714l;
    }

    @Override // p192n9.InterfaceC9494u.b
    public InterfaceC9494u.b retry() {
        return new C9478e(this.f18703a, this.f18704b, this.f18705c, this.f18706d, this.f18707e, this.f18708f, this.f18709g, this.f18710h, this.f18711i, this.f18712j, mo17446d(), this.f18714l, this.f18715m, this.f18716n, this.f18717o, this.f18718p);
    }

    /* renamed from: s */
    public final C9478e m17456s(List connectionSpecs, SSLSocket sslSocket) {
        AbstractC9133u.m16133g(connectionSpecs, "connectionSpecs");
        AbstractC9133u.m16133g(sslSocket, "sslSocket");
        int i10 = this.f18717o + 1;
        int size = connectionSpecs.size();
        for (int i11 = i10; i11 < size; i11++) {
            if (((C9560b) connectionSpecs.get(i11)).m17886e(sslSocket)) {
                return m17442p(this, 0, null, i11, this.f18717o != -1, 3, null);
            }
        }
        return null;
    }

    /* renamed from: t */
    public final C9478e m17457t(List connectionSpecs, SSLSocket sslSocket) throws UnknownServiceException {
        AbstractC9133u.m16133g(connectionSpecs, "connectionSpecs");
        AbstractC9133u.m16133g(sslSocket, "sslSocket");
        if (this.f18717o != -1) {
            return this;
        }
        C9478e c9478eM17456s = m17456s(connectionSpecs, sslSocket);
        if (c9478eM17456s != null) {
            return c9478eM17456s;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f18718p);
        sb.append(", modes=");
        sb.append(connectionSpecs);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        AbstractC9133u.m16130d(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        AbstractC9133u.m16132f(string, "toString(...)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // p203o9.InterfaceC9549d.a
    /* renamed from: b */
    public void mo17444b() {
    }
}
