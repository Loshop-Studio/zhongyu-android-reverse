package p093k5;

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
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.C7526b;
import okhttp3.C7527c;
import okhttp3.Protocol;
import okhttp3.internal.platform.AbstractC7536c;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Timeout;
import p058f5.C6355a;
import p058f5.C6358b0;
import p058f5.C6362d0;
import p058f5.C6366f0;
import p058f5.C6369h;
import p065g5.AbstractC6427k;
import p086j5.C6601d;
import p093k5.InterfaceC6698u;
import p102l5.InterfaceC7350d;
import p109m5.C7407b;
import p165u5.AbstractC7777c;
import p165u5.C7778d;

/* renamed from: k5.e */
/* loaded from: classes4.dex */
public final class C6682e implements InterfaceC6698u.b, InterfaceC7350d.a {

    /* renamed from: y */
    public static final a f8832y = new a(null);

    /* renamed from: a */
    public final C6601d f8833a;

    /* renamed from: b */
    public final C6693p f8834b;

    /* renamed from: c */
    public final int f8835c;

    /* renamed from: d */
    public final int f8836d;

    /* renamed from: e */
    public final int f8837e;

    /* renamed from: f */
    public final int f8838f;

    /* renamed from: g */
    public final int f8839g;

    /* renamed from: h */
    public final boolean f8840h;

    /* renamed from: i */
    public final InterfaceC6684g f8841i;

    /* renamed from: j */
    public final C6694q f8842j;

    /* renamed from: k */
    public final C6366f0 f8843k;

    /* renamed from: l */
    public final List f8844l;

    /* renamed from: m */
    public final int f8845m;

    /* renamed from: n */
    public final C6358b0 f8846n;

    /* renamed from: o */
    public final int f8847o;

    /* renamed from: p */
    public final boolean f8848p;

    /* renamed from: q */
    public volatile boolean f8849q;

    /* renamed from: r */
    public Socket f8850r;

    /* renamed from: s */
    public Socket f8851s;

    /* renamed from: t */
    public C7527c f8852t;

    /* renamed from: u */
    public Protocol f8853u;

    /* renamed from: v */
    public BufferedSource f8854v;

    /* renamed from: w */
    public BufferedSink f8855w;

    /* renamed from: x */
    public C6692o f8856x;

    /* renamed from: k5.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: k5.e$b */
    public static final /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8857a;

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
            f8857a = iArr;
        }
    }

    public C6682e(C6601d taskRunner, C6693p connectionPool, int i6, int i7, int i8, int i9, int i10, boolean z6, InterfaceC6684g user, C6694q routePlanner, C6366f0 route, List list, int i11, C6358b0 c6358b0, int i12, boolean z7) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(routePlanner, "routePlanner");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f8833a = taskRunner;
        this.f8834b = connectionPool;
        this.f8835c = i6;
        this.f8836d = i7;
        this.f8837e = i8;
        this.f8838f = i9;
        this.f8839g = i10;
        this.f8840h = z6;
        this.f8841i = user;
        this.f8842j = routePlanner;
        this.f8843k = route;
        this.f8844l = list;
        this.f8845m = i11;
        this.f8846n = c6358b0;
        this.f8847o = i12;
        this.f8848p = z7;
    }

    /* renamed from: l */
    public static final List m7707l(C6369h c6369h, C7527c c7527c, C6355a c6355a) {
        AbstractC7777c abstractC7777cM6722f = c6369h.m6722f();
        Intrinsics.checkNotNull(abstractC7777cM6722f);
        return abstractC7777cM6722f.mo9086a(c7527c.m8721e(), c6355a.m6486l().m6823h());
    }

    /* renamed from: m */
    public static final List m7708m(C7527c c7527c) {
        List<Certificate> listM8721e = c7527c.m8721e();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM8721e, 10));
        for (Certificate certificate : listM8721e) {
            Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    /* renamed from: p */
    public static /* synthetic */ C6682e m7709p(C6682e c6682e, int i6, C6358b0 c6358b0, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i6 = c6682e.f8845m;
        }
        if ((i8 & 2) != 0) {
            c6358b0 = c6682e.f8846n;
        }
        if ((i8 & 4) != 0) {
            i7 = c6682e.f8847o;
        }
        if ((i8 & 8) != 0) {
            z6 = c6682e.f8848p;
        }
        return c6682e.m7720o(i6, c6358b0, i7, z6);
    }

    @Override // p093k5.InterfaceC6698u.b
    /* renamed from: a */
    public C6692o mo7710a() throws IOException {
        this.f8841i.mo7686f(mo7714e());
        C6692o c6692o = this.f8856x;
        Intrinsics.checkNotNull(c6692o);
        this.f8841i.mo7696p(c6692o, mo7714e());
        C6696s c6696sM7849l = this.f8842j.m7849l(this, this.f8844l);
        if (c6696sM7849l != null) {
            return c6696sM7849l.m7855g();
        }
        synchronized (c6692o) {
            this.f8834b.m7840g(c6692o);
            this.f8841i.mo7703w(c6692o);
            Unit unit = Unit.INSTANCE;
        }
        this.f8841i.mo7700t(c6692o);
        this.f8841i.mo7702v(c6692o);
        return c6692o;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0192  */
    @Override // p093k5.InterfaceC6698u.b
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p093k5.InterfaceC6698u.a mo7712c() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p093k5.C6682e.mo7712c():k5.u$a");
    }

    @Override // p093k5.InterfaceC6698u.b, p102l5.InterfaceC7350d.a
    public void cancel() throws IOException {
        this.f8849q = true;
        Socket socket = this.f8850r;
        if (socket != null) {
            AbstractC6427k.m7020h(socket);
        }
    }

    @Override // p102l5.InterfaceC7350d.a
    /* renamed from: d */
    public void mo7713d(C6691n call, IOException iOException) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    @Override // p102l5.InterfaceC7350d.a
    /* renamed from: e */
    public C6366f0 mo7714e() {
        return this.f8843k;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    @Override // p093k5.InterfaceC6698u.b
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p093k5.InterfaceC6698u.a mo7715f() throws java.lang.Throwable {
        /*
            r14 = this;
            java.net.Socket r0 = r14.f8850r
            if (r0 != 0) goto Laf
            k5.g r0 = r14.f8841i
            r0.mo7682b(r14)
            r1 = 0
            k5.g r0 = r14.f8841i     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            f5.f0 r2 = r14.mo7714e()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            r0.mo7688h(r2)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            r14.m7717j()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            r1 = 1
            k5.u$a r2 = new k5.u$a     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            r3 = r14
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            k5.g r0 = r3.f8841i
            r0.mo7690j(r14)
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
            f5.f0 r0 = r14.mo7714e()     // Catch: java.lang.Throwable -> L27
            f5.a r0 = r0.m6713a()     // Catch: java.lang.Throwable -> L27
            java.net.Proxy r0 = r0.m6481g()     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L7c
            f5.f0 r0 = r14.mo7714e()     // Catch: java.lang.Throwable -> L27
            java.net.Proxy r0 = r0.m6714b()     // Catch: java.lang.Throwable -> L27
            java.net.Proxy$Type r0 = r0.type()     // Catch: java.lang.Throwable -> L27
            java.net.Proxy$Type r2 = java.net.Proxy.Type.DIRECT     // Catch: java.lang.Throwable -> L27
            if (r0 == r2) goto L7c
            f5.f0 r0 = r14.mo7714e()     // Catch: java.lang.Throwable -> L27
            f5.a r0 = r0.m6713a()     // Catch: java.lang.Throwable -> L27
            java.net.ProxySelector r0 = r0.m6483i()     // Catch: java.lang.Throwable -> L27
            f5.f0 r2 = r14.mo7714e()     // Catch: java.lang.Throwable -> L27
            f5.a r2 = r2.m6713a()     // Catch: java.lang.Throwable -> L27
            f5.w r2 = r2.m6486l()     // Catch: java.lang.Throwable -> L27
            java.net.URI r2 = r2.m6833r()     // Catch: java.lang.Throwable -> L27
            f5.f0 r4 = r14.mo7714e()     // Catch: java.lang.Throwable -> L27
            java.net.Proxy r4 = r4.m6714b()     // Catch: java.lang.Throwable -> L27
            java.net.SocketAddress r4 = r4.address()     // Catch: java.lang.Throwable -> L27
            r0.connectFailed(r2, r4, r11)     // Catch: java.lang.Throwable -> L27
        L7c:
            k5.g r0 = r3.f8841i     // Catch: java.lang.Throwable -> L27
            f5.f0 r2 = r14.mo7714e()     // Catch: java.lang.Throwable -> L27
            r4 = 0
            r0.mo7684d(r2, r4, r11)     // Catch: java.lang.Throwable -> L27
            k5.u$a r8 = new k5.u$a     // Catch: java.lang.Throwable -> L27
            r12 = 2
            r13 = 0
            r10 = 0
            r9 = r3
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L9e
            k5.g r0 = r3.f8841i
            r0.mo7690j(r14)
            if (r1 != 0) goto L9d
            java.net.Socket r0 = r3.f8850r
            if (r0 == 0) goto L9d
            p065g5.AbstractC6427k.m7020h(r0)
        L9d:
            return r8
        L9e:
            r0 = move-exception
            r3 = r9
        La0:
            k5.g r2 = r3.f8841i
            r2.mo7690j(r14)
            if (r1 != 0) goto Lae
            java.net.Socket r1 = r3.f8850r
            if (r1 == 0) goto Lae
            p065g5.AbstractC6427k.m7020h(r1)
        Lae:
            throw r0
        Laf:
            r3 = r14
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "TCP already connected"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p093k5.C6682e.mo7715f():k5.u$a");
    }

    /* renamed from: i */
    public final void m7716i() {
        Socket socket = this.f8851s;
        if (socket != null) {
            AbstractC6427k.m7020h(socket);
        }
    }

    @Override // p093k5.InterfaceC6698u.b
    public boolean isReady() {
        return this.f8853u != null;
    }

    /* renamed from: j */
    public final void m7717j() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = mo7714e().m6714b().type();
        int i6 = type == null ? -1 : b.f8857a[type.ordinal()];
        if (i6 == 1 || i6 == 2) {
            socketCreateSocket = mo7714e().m6713a().m6484j().createSocket();
            Intrinsics.checkNotNull(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(mo7714e().m6714b());
        }
        this.f8850r = socketCreateSocket;
        if (this.f8849q) {
            throw new IOException("canceled");
        }
        socketCreateSocket.setSoTimeout(this.f8838f);
        try {
            AbstractC7536c.f9994a.m8931e().mo8918h(socketCreateSocket, mo7714e().m6716d(), this.f8837e);
            try {
                this.f8854v = Okio.buffer(Okio.source(socketCreateSocket));
                this.f8855w = Okio.buffer(Okio.sink(socketCreateSocket));
            } catch (NullPointerException e6) {
                if (Intrinsics.areEqual(e6.getMessage(), "throw with null exception")) {
                    throw new IOException(e6);
                }
            }
        } catch (ConnectException e7) {
            ConnectException connectException = new ConnectException("Failed to connect to " + mo7714e().m6716d());
            connectException.initCause(e7);
            throw connectException;
        }
    }

    /* renamed from: k */
    public final void m7718k(SSLSocket sSLSocket, C7526b c7526b) throws IOException {
        final C6355a c6355aM6713a = mo7714e().m6713a();
        try {
            if (c7526b.m8708h()) {
                AbstractC7536c.f9994a.m8931e().mo8909g(sSLSocket, c6355aM6713a.m6486l().m6823h(), c6355aM6713a.m6480f());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            C7527c.a aVar = C7527c.f9873e;
            Intrinsics.checkNotNull(session);
            final C7527c c7527cM8725b = aVar.m8725b(session);
            HostnameVerifier hostnameVerifierM6479e = c6355aM6713a.m6479e();
            Intrinsics.checkNotNull(hostnameVerifierM6479e);
            if (hostnameVerifierM6479e.verify(c6355aM6713a.m6486l().m6823h(), session)) {
                final C6369h c6369hM6475a = c6355aM6713a.m6475a();
                Intrinsics.checkNotNull(c6369hM6475a);
                final C7527c c7527c = new C7527c(c7527cM8725b.m8722g(), c7527cM8725b.m8718b(), c7527cM8725b.m8720d(), new Function0() { // from class: k5.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C6682e.m7707l(c6369hM6475a, c7527cM8725b, c6355aM6713a);
                    }
                });
                this.f8852t = c7527c;
                c6369hM6475a.m6720d(c6355aM6713a.m6486l().m6823h(), new Function0() { // from class: k5.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C6682e.m7708m(c7527c);
                    }
                });
                String strMo8910i = c7526b.m8708h() ? AbstractC7536c.f9994a.m8931e().mo8910i(sSLSocket) : null;
                this.f8851s = sSLSocket;
                this.f8854v = Okio.buffer(Okio.source(sSLSocket));
                this.f8855w = Okio.buffer(Okio.sink(sSLSocket));
                this.f8853u = strMo8910i != null ? Protocol.INSTANCE.m8688a(strMo8910i) : Protocol.f9717d;
                AbstractC7536c.f9994a.m8931e().m8924d(sSLSocket);
                return;
            }
            List listM8721e = c7527cM8725b.m8721e();
            if (listM8721e.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + c6355aM6713a.m6486l().m6823h() + " not verified (no certificates)");
            }
            Object obj = listM8721e.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            throw new SSLPeerUnverifiedException(StringsKt.trimMargin$default("\n            |Hostname " + c6355aM6713a.m6486l().m6823h() + " not verified:\n            |    certificate: " + C6369h.f7904c.m6725a(x509Certificate) + "\n            |    DN: " + x509Certificate.getSubjectDN().getName() + "\n            |    subjectAltNames: " + C7778d.f10303a.m9309a(x509Certificate) + "\n            ", null, 1, null));
        } catch (Throwable th) {
            AbstractC7536c.f9994a.m8931e().m8924d(sSLSocket);
            AbstractC6427k.m7020h(sSLSocket);
            throw th;
        }
    }

    /* renamed from: n */
    public final InterfaceC6698u.a m7719n() throws IOException {
        C6358b0 c6358b0M7721q = m7721q();
        if (c6358b0M7721q == null) {
            return new InterfaceC6698u.a(this, null, null, 6, null);
        }
        Socket socket = this.f8850r;
        if (socket != null) {
            AbstractC6427k.m7020h(socket);
        }
        int i6 = this.f8845m + 1;
        if (i6 < 21) {
            this.f8841i.mo7695o(mo7714e(), null);
            return new InterfaceC6698u.a(this, m7709p(this, i6, c6358b0M7721q, 0, false, 12, null), null, 4, null);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        this.f8841i.mo7684d(mo7714e(), null, protocolException);
        return new InterfaceC6698u.a(this, null, protocolException, 2, null);
    }

    /* renamed from: o */
    public final C6682e m7720o(int i6, C6358b0 c6358b0, int i7, boolean z6) {
        return new C6682e(this.f8833a, this.f8834b, this.f8835c, this.f8836d, this.f8837e, this.f8838f, this.f8839g, this.f8840h, this.f8841i, this.f8842j, mo7714e(), this.f8844l, i6, c6358b0, i7, z6);
    }

    /* renamed from: q */
    public final C6358b0 m7721q() throws IOException {
        C6358b0 c6358b0 = this.f8846n;
        Intrinsics.checkNotNull(c6358b0);
        String str = "CONNECT " + AbstractC6427k.m7032t(mo7714e().m6713a().m6486l(), true) + " HTTP/1.1";
        while (true) {
            BufferedSource bufferedSource = this.f8854v;
            if (bufferedSource == null) {
                Intrinsics.throwUninitializedPropertyAccessException("source");
                bufferedSource = null;
            }
            BufferedSink bufferedSink = this.f8855w;
            if (bufferedSink == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sink");
                bufferedSink = null;
            }
            C7407b c7407b = new C7407b(null, this, bufferedSource, bufferedSink);
            BufferedSource bufferedSource2 = this.f8854v;
            if (bufferedSource2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("source");
                bufferedSource2 = null;
            }
            Timeout timeout = bufferedSource2.getTimeout();
            long j6 = this.f8835c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            timeout.timeout(j6, timeUnit);
            BufferedSink bufferedSink2 = this.f8855w;
            if (bufferedSink2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sink");
                bufferedSink2 = null;
            }
            bufferedSink2.getTimeout().timeout(this.f8836d, timeUnit);
            c7407b.m8429B(c6358b0.m6582f(), str);
            c7407b.mo8322a();
            C6362d0.a aVarMo8327f = c7407b.mo8327f(false);
            Intrinsics.checkNotNull(aVarMo8327f);
            C6362d0 c6362d0M6682c = aVarMo8327f.m6696q(c6358b0).m6682c();
            c7407b.m8428A(c6362d0M6682c);
            int iM6665j = c6362d0M6682c.m6665j();
            if (iM6665j == 200) {
                return null;
            }
            if (iM6665j != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + c6362d0M6682c.m6665j());
            }
            C6358b0 c6358b0Mo6576a = mo7714e().m6713a().m6482h().mo6576a(mo7714e(), c6362d0M6682c);
            if (c6358b0Mo6576a == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (StringsKt.equals("close", C6362d0.m6660o(c6362d0M6682c, "Connection", null, 2, null), true)) {
                return c6358b0Mo6576a;
            }
            c6358b0 = c6358b0Mo6576a;
        }
    }

    /* renamed from: r */
    public final List m7722r() {
        return this.f8844l;
    }

    @Override // p093k5.InterfaceC6698u.b
    public InterfaceC6698u.b retry() {
        return new C6682e(this.f8833a, this.f8834b, this.f8835c, this.f8836d, this.f8837e, this.f8838f, this.f8839g, this.f8840h, this.f8841i, this.f8842j, mo7714e(), this.f8844l, this.f8845m, this.f8846n, this.f8847o, this.f8848p);
    }

    /* renamed from: s */
    public final C6682e m7723s(List connectionSpecs, SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i6 = this.f8847o + 1;
        int size = connectionSpecs.size();
        for (int i7 = i6; i7 < size; i7++) {
            if (((C7526b) connectionSpecs.get(i7)).m8705e(sslSocket)) {
                return m7709p(this, 0, null, i7, this.f8847o != -1, 3, null);
            }
        }
        return null;
    }

    /* renamed from: t */
    public final C6682e m7724t(List connectionSpecs, SSLSocket sslSocket) throws UnknownServiceException {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (this.f8847o != -1) {
            return this;
        }
        C6682e c6682eM7723s = m7723s(connectionSpecs, sslSocket);
        if (c6682eM7723s != null) {
            return c6682eM7723s;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f8848p);
        sb.append(", modes=");
        sb.append(connectionSpecs);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.checkNotNull(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // p102l5.InterfaceC7350d.a
    /* renamed from: b */
    public void mo7711b() {
    }
}
