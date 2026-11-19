package je;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import je.AbstractC9735o;
import je.InterfaceC9725e;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okhttp3.C10496b;
import okhttp3.CertificatePinner;
import okhttp3.Protocol;
import p281oe.C10487e;
import p281oe.C10489g;
import p325rc.AbstractC10937b0;
import p366ue.C11399a;
import se.C11192j;
import ve.AbstractC11618c;
import ve.C11619d;

/* renamed from: je.v */
/* loaded from: classes6.dex */
public class C9742v implements Cloneable, InterfaceC9725e.a {

    /* renamed from: F */
    public static final b f22797F = new b(null);

    /* renamed from: G */
    public static final List f22798G = AbstractC9920d.m20041w(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* renamed from: H */
    public static final List f22799H = AbstractC9920d.m20041w(C10496b.f25101i, C10496b.f25103k);

    /* renamed from: A */
    public final int f22800A;

    /* renamed from: B */
    public final int f22801B;

    /* renamed from: C */
    public final int f22802C;

    /* renamed from: D */
    public final long f22803D;

    /* renamed from: E */
    public final C10489g f22804E;

    /* renamed from: c */
    public final C9733m f22805c;

    /* renamed from: d */
    public final C9729i f22806d;

    /* renamed from: e */
    public final List f22807e;

    /* renamed from: f */
    public final List f22808f;

    /* renamed from: g */
    public final AbstractC9735o.c f22809g;

    /* renamed from: h */
    public final boolean f22810h;

    /* renamed from: i */
    public final InterfaceC9722b f22811i;

    /* renamed from: j */
    public final boolean f22812j;

    /* renamed from: k */
    public final boolean f22813k;

    /* renamed from: l */
    public final InterfaceC9731k f22814l;

    /* renamed from: m */
    public final InterfaceC9734n f22815m;

    /* renamed from: n */
    public final Proxy f22816n;

    /* renamed from: o */
    public final ProxySelector f22817o;

    /* renamed from: p */
    public final InterfaceC9722b f22818p;

    /* renamed from: q */
    public final SocketFactory f22819q;

    /* renamed from: r */
    public final SSLSocketFactory f22820r;

    /* renamed from: s */
    public final X509TrustManager f22821s;

    /* renamed from: t */
    public final List f22822t;

    /* renamed from: u */
    public final List f22823u;

    /* renamed from: v */
    public final HostnameVerifier f22824v;

    /* renamed from: w */
    public final CertificatePinner f22825w;

    /* renamed from: x */
    public final AbstractC11618c f22826x;

    /* renamed from: y */
    public final int f22827y;

    /* renamed from: z */
    public final int f22828z;

    /* renamed from: je.v$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final List m19581a() {
            return C9742v.f22799H;
        }

        /* renamed from: b */
        public final List m19582b() {
            return C9742v.f22798G;
        }

        public b() {
        }
    }

    public C9742v(a builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelectorM19541E;
        AbstractC9979u.m20294g(builder, "builder");
        this.f22805c = builder.m19572r();
        this.f22806d = builder.m19569o();
        this.f22807e = AbstractC9920d.m20011S(builder.m19578x());
        this.f22808f = AbstractC9920d.m20011S(builder.m19580z());
        this.f22809g = builder.m19574t();
        this.f22810h = builder.m19543G();
        this.f22811i = builder.m19563i();
        this.f22812j = builder.m19575u();
        this.f22813k = builder.m19576v();
        this.f22814l = builder.m19571q();
        builder.m19564j();
        this.f22815m = builder.m19573s();
        this.f22816n = builder.m19539C();
        if (builder.m19539C() != null) {
            proxySelectorM19541E = C11399a.f27220a;
        } else {
            proxySelectorM19541E = builder.m19541E();
            proxySelectorM19541E = proxySelectorM19541E == null ? ProxySelector.getDefault() : proxySelectorM19541E;
            if (proxySelectorM19541E == null) {
                proxySelectorM19541E = C11399a.f27220a;
            }
        }
        this.f22817o = proxySelectorM19541E;
        this.f22818p = builder.m19540D();
        this.f22819q = builder.m19545I();
        List listM19570p = builder.m19570p();
        this.f22822t = listM19570p;
        this.f22823u = builder.m19538B();
        this.f22824v = builder.m19577w();
        this.f22827y = builder.m19565k();
        this.f22828z = builder.m19568n();
        this.f22800A = builder.m19542F();
        this.f22801B = builder.m19547K();
        this.f22802C = builder.m19537A();
        this.f22803D = builder.m19579y();
        C10489g c10489gM19544H = builder.m19544H();
        this.f22804E = c10489gM19544H == null ? new C10489g() : c10489gM19544H;
        List list = listM19570p;
        if ((list instanceof Collection) && list.isEmpty()) {
            this.f22820r = null;
            this.f22826x = null;
            this.f22821s = null;
            this.f22825w = CertificatePinner.f24943d;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C10496b) it.next()).m21973f()) {
                    if (builder.m19546J() != null) {
                        this.f22820r = builder.m19546J();
                        AbstractC11618c abstractC11618cM19566l = builder.m19566l();
                        AbstractC9979u.m20291d(abstractC11618cM19566l);
                        this.f22826x = abstractC11618cM19566l;
                        X509TrustManager x509TrustManagerM19548L = builder.m19548L();
                        AbstractC9979u.m20291d(x509TrustManagerM19548L);
                        this.f22821s = x509TrustManagerM19548L;
                        CertificatePinner certificatePinnerM19567m = builder.m19567m();
                        AbstractC9979u.m20291d(abstractC11618cM19566l);
                        this.f22825w = certificatePinnerM19567m.m21942e(abstractC11618cM19566l);
                    } else {
                        C11192j.a aVar = C11192j.f26882a;
                        X509TrustManager x509TrustManagerMo24870o = aVar.m24899g().mo24870o();
                        this.f22821s = x509TrustManagerMo24870o;
                        C11192j c11192jM24899g = aVar.m24899g();
                        AbstractC9979u.m20291d(x509TrustManagerMo24870o);
                        this.f22820r = c11192jM24899g.mo24874n(x509TrustManagerMo24870o);
                        AbstractC11618c.a aVar2 = AbstractC11618c.f27520a;
                        AbstractC9979u.m20291d(x509TrustManagerMo24870o);
                        AbstractC11618c abstractC11618cM25613a = aVar2.m25613a(x509TrustManagerMo24870o);
                        this.f22826x = abstractC11618cM25613a;
                        CertificatePinner certificatePinnerM19567m2 = builder.m19567m();
                        AbstractC9979u.m20291d(abstractC11618cM25613a);
                        this.f22825w = certificatePinnerM19567m2.m21942e(abstractC11618cM25613a);
                    }
                }
            }
            this.f22820r = null;
            this.f22826x = null;
            this.f22821s = null;
            this.f22825w = CertificatePinner.f24943d;
        }
        m19514J();
    }

    /* renamed from: A */
    public final int m19505A() {
        return this.f22802C;
    }

    /* renamed from: B */
    public final List m19506B() {
        return this.f22823u;
    }

    /* renamed from: C */
    public final Proxy m19507C() {
        return this.f22816n;
    }

    /* renamed from: D */
    public final InterfaceC9722b m19508D() {
        return this.f22818p;
    }

    /* renamed from: E */
    public final ProxySelector m19509E() {
        return this.f22817o;
    }

    /* renamed from: F */
    public final int m19510F() {
        return this.f22800A;
    }

    /* renamed from: G */
    public final boolean m19511G() {
        return this.f22810h;
    }

    /* renamed from: H */
    public final SocketFactory m19512H() {
        return this.f22819q;
    }

    /* renamed from: I */
    public final SSLSocketFactory m19513I() {
        SSLSocketFactory sSLSocketFactory = this.f22820r;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    /* renamed from: J */
    public final void m19514J() {
        List list = this.f22807e;
        AbstractC9979u.m20292e(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.f22807e).toString());
        }
        List list2 = this.f22808f;
        AbstractC9979u.m20292e(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.f22808f).toString());
        }
        List list3 = this.f22822t;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((C10496b) it.next()).m21973f()) {
                    if (this.f22820r == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.f22826x == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.f22821s == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.f22820r != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f22826x != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f22821s != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!AbstractC9979u.m20289b(this.f22825w, CertificatePinner.f24943d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* renamed from: K */
    public final int m19515K() {
        return this.f22801B;
    }

    /* renamed from: L */
    public final X509TrustManager m19516L() {
        return this.f22821s;
    }

    @Override // je.InterfaceC9725e.a
    /* renamed from: b */
    public InterfaceC9725e mo19319b(C9743w request) {
        AbstractC9979u.m20294g(request, "request");
        return new C10487e(this, request, false);
    }

    public Object clone() {
        return super.clone();
    }

    /* renamed from: g */
    public final InterfaceC9722b m19517g() {
        return this.f22811i;
    }

    /* renamed from: h */
    public final AbstractC9723c m19518h() {
        return null;
    }

    /* renamed from: i */
    public final int m19519i() {
        return this.f22827y;
    }

    /* renamed from: j */
    public final AbstractC11618c m19520j() {
        return this.f22826x;
    }

    /* renamed from: k */
    public final CertificatePinner m19521k() {
        return this.f22825w;
    }

    /* renamed from: l */
    public final int m19522l() {
        return this.f22828z;
    }

    /* renamed from: m */
    public final C9729i m19523m() {
        return this.f22806d;
    }

    /* renamed from: n */
    public final List m19524n() {
        return this.f22822t;
    }

    /* renamed from: o */
    public final InterfaceC9731k m19525o() {
        return this.f22814l;
    }

    /* renamed from: p */
    public final C9733m m19526p() {
        return this.f22805c;
    }

    /* renamed from: q */
    public final InterfaceC9734n m19527q() {
        return this.f22815m;
    }

    /* renamed from: r */
    public final AbstractC9735o.c m19528r() {
        return this.f22809g;
    }

    /* renamed from: s */
    public final boolean m19529s() {
        return this.f22812j;
    }

    /* renamed from: t */
    public final boolean m19530t() {
        return this.f22813k;
    }

    /* renamed from: u */
    public final C10489g m19531u() {
        return this.f22804E;
    }

    /* renamed from: v */
    public final HostnameVerifier m19532v() {
        return this.f22824v;
    }

    /* renamed from: w */
    public final List m19533w() {
        return this.f22807e;
    }

    /* renamed from: x */
    public final long m19534x() {
        return this.f22803D;
    }

    /* renamed from: y */
    public final List m19535y() {
        return this.f22808f;
    }

    /* renamed from: z */
    public a m19536z() {
        return new a(this);
    }

    /* renamed from: je.v$a */
    public static final class a {

        /* renamed from: A */
        public int f22829A;

        /* renamed from: B */
        public long f22830B;

        /* renamed from: C */
        public C10489g f22831C;

        /* renamed from: a */
        public C9733m f22832a;

        /* renamed from: b */
        public C9729i f22833b;

        /* renamed from: c */
        public final List f22834c;

        /* renamed from: d */
        public final List f22835d;

        /* renamed from: e */
        public AbstractC9735o.c f22836e;

        /* renamed from: f */
        public boolean f22837f;

        /* renamed from: g */
        public InterfaceC9722b f22838g;

        /* renamed from: h */
        public boolean f22839h;

        /* renamed from: i */
        public boolean f22840i;

        /* renamed from: j */
        public InterfaceC9731k f22841j;

        /* renamed from: k */
        public InterfaceC9734n f22842k;

        /* renamed from: l */
        public Proxy f22843l;

        /* renamed from: m */
        public ProxySelector f22844m;

        /* renamed from: n */
        public InterfaceC9722b f22845n;

        /* renamed from: o */
        public SocketFactory f22846o;

        /* renamed from: p */
        public SSLSocketFactory f22847p;

        /* renamed from: q */
        public X509TrustManager f22848q;

        /* renamed from: r */
        public List f22849r;

        /* renamed from: s */
        public List f22850s;

        /* renamed from: t */
        public HostnameVerifier f22851t;

        /* renamed from: u */
        public CertificatePinner f22852u;

        /* renamed from: v */
        public AbstractC11618c f22853v;

        /* renamed from: w */
        public int f22854w;

        /* renamed from: x */
        public int f22855x;

        /* renamed from: y */
        public int f22856y;

        /* renamed from: z */
        public int f22857z;

        public a() {
            this.f22832a = new C9733m();
            this.f22833b = new C9729i();
            this.f22834c = new ArrayList();
            this.f22835d = new ArrayList();
            this.f22836e = AbstractC9920d.m20025g(AbstractC9735o.f22738b);
            this.f22837f = true;
            InterfaceC9722b interfaceC9722b = InterfaceC9722b.f22679b;
            this.f22838g = interfaceC9722b;
            this.f22839h = true;
            this.f22840i = true;
            this.f22841j = InterfaceC9731k.f22724b;
            this.f22842k = InterfaceC9734n.f22735b;
            this.f22845n = interfaceC9722b;
            SocketFactory socketFactory = SocketFactory.getDefault();
            AbstractC9979u.m20293f(socketFactory, "getDefault()");
            this.f22846o = socketFactory;
            b bVar = C9742v.f22797F;
            this.f22849r = bVar.m19581a();
            this.f22850s = bVar.m19582b();
            this.f22851t = C11619d.f27521a;
            this.f22852u = CertificatePinner.f24943d;
            this.f22855x = 10000;
            this.f22856y = 10000;
            this.f22857z = 10000;
            this.f22830B = 1024L;
        }

        /* renamed from: A */
        public final int m19537A() {
            return this.f22829A;
        }

        /* renamed from: B */
        public final List m19538B() {
            return this.f22850s;
        }

        /* renamed from: C */
        public final Proxy m19539C() {
            return this.f22843l;
        }

        /* renamed from: D */
        public final InterfaceC9722b m19540D() {
            return this.f22845n;
        }

        /* renamed from: E */
        public final ProxySelector m19541E() {
            return this.f22844m;
        }

        /* renamed from: F */
        public final int m19542F() {
            return this.f22856y;
        }

        /* renamed from: G */
        public final boolean m19543G() {
            return this.f22837f;
        }

        /* renamed from: H */
        public final C10489g m19544H() {
            return this.f22831C;
        }

        /* renamed from: I */
        public final SocketFactory m19545I() {
            return this.f22846o;
        }

        /* renamed from: J */
        public final SSLSocketFactory m19546J() {
            return this.f22847p;
        }

        /* renamed from: K */
        public final int m19547K() {
            return this.f22857z;
        }

        /* renamed from: L */
        public final X509TrustManager m19548L() {
            return this.f22848q;
        }

        /* renamed from: M */
        public final a m19549M(HostnameVerifier hostnameVerifier) {
            AbstractC9979u.m20294g(hostnameVerifier, "hostnameVerifier");
            if (!AbstractC9979u.m20289b(hostnameVerifier, this.f22851t)) {
                this.f22831C = null;
            }
            this.f22851t = hostnameVerifier;
            return this;
        }

        /* renamed from: N */
        public final a m19550N(Proxy proxy) {
            if (!AbstractC9979u.m20289b(proxy, this.f22843l)) {
                this.f22831C = null;
            }
            this.f22843l = proxy;
            return this;
        }

        /* renamed from: O */
        public final a m19551O(long j10, TimeUnit unit) {
            AbstractC9979u.m20294g(unit, "unit");
            this.f22856y = AbstractC9920d.m20029k("timeout", j10, unit);
            return this;
        }

        /* renamed from: P */
        public final a m19552P(boolean z10) {
            this.f22837f = z10;
            return this;
        }

        /* renamed from: Q */
        public final a m19553Q(SSLSocketFactory sslSocketFactory, X509TrustManager trustManager) {
            AbstractC9979u.m20294g(sslSocketFactory, "sslSocketFactory");
            AbstractC9979u.m20294g(trustManager, "trustManager");
            if (!AbstractC9979u.m20289b(sslSocketFactory, this.f22847p) || !AbstractC9979u.m20289b(trustManager, this.f22848q)) {
                this.f22831C = null;
            }
            this.f22847p = sslSocketFactory;
            this.f22853v = AbstractC11618c.f27520a.m25613a(trustManager);
            this.f22848q = trustManager;
            return this;
        }

        /* renamed from: R */
        public final a m19554R(long j10, TimeUnit unit) {
            AbstractC9979u.m20294g(unit, "unit");
            this.f22857z = AbstractC9920d.m20029k("timeout", j10, unit);
            return this;
        }

        /* renamed from: a */
        public final a m19555a(InterfaceC9739s interceptor) {
            AbstractC9979u.m20294g(interceptor, "interceptor");
            this.f22834c.add(interceptor);
            return this;
        }

        /* renamed from: b */
        public final a m19556b(InterfaceC9739s interceptor) {
            AbstractC9979u.m20294g(interceptor, "interceptor");
            this.f22835d.add(interceptor);
            return this;
        }

        /* renamed from: c */
        public final C9742v m19557c() {
            return new C9742v(this);
        }

        /* renamed from: e */
        public final a m19559e(long j10, TimeUnit unit) {
            AbstractC9979u.m20294g(unit, "unit");
            this.f22855x = AbstractC9920d.m20029k("timeout", j10, unit);
            return this;
        }

        /* renamed from: f */
        public final a m19560f(C9733m dispatcher) {
            AbstractC9979u.m20294g(dispatcher, "dispatcher");
            this.f22832a = dispatcher;
            return this;
        }

        /* renamed from: g */
        public final a m19561g(boolean z10) {
            this.f22839h = z10;
            return this;
        }

        /* renamed from: h */
        public final a m19562h(boolean z10) {
            this.f22840i = z10;
            return this;
        }

        /* renamed from: i */
        public final InterfaceC9722b m19563i() {
            return this.f22838g;
        }

        /* renamed from: j */
        public final AbstractC9723c m19564j() {
            return null;
        }

        /* renamed from: k */
        public final int m19565k() {
            return this.f22854w;
        }

        /* renamed from: l */
        public final AbstractC11618c m19566l() {
            return this.f22853v;
        }

        /* renamed from: m */
        public final CertificatePinner m19567m() {
            return this.f22852u;
        }

        /* renamed from: n */
        public final int m19568n() {
            return this.f22855x;
        }

        /* renamed from: o */
        public final C9729i m19569o() {
            return this.f22833b;
        }

        /* renamed from: p */
        public final List m19570p() {
            return this.f22849r;
        }

        /* renamed from: q */
        public final InterfaceC9731k m19571q() {
            return this.f22841j;
        }

        /* renamed from: r */
        public final C9733m m19572r() {
            return this.f22832a;
        }

        /* renamed from: s */
        public final InterfaceC9734n m19573s() {
            return this.f22842k;
        }

        /* renamed from: t */
        public final AbstractC9735o.c m19574t() {
            return this.f22836e;
        }

        /* renamed from: u */
        public final boolean m19575u() {
            return this.f22839h;
        }

        /* renamed from: v */
        public final boolean m19576v() {
            return this.f22840i;
        }

        /* renamed from: w */
        public final HostnameVerifier m19577w() {
            return this.f22851t;
        }

        /* renamed from: x */
        public final List m19578x() {
            return this.f22834c;
        }

        /* renamed from: y */
        public final long m19579y() {
            return this.f22830B;
        }

        /* renamed from: z */
        public final List m19580z() {
            return this.f22835d;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(C9742v okHttpClient) {
            this();
            AbstractC9979u.m20294g(okHttpClient, "okHttpClient");
            this.f22832a = okHttpClient.m19526p();
            this.f22833b = okHttpClient.m19523m();
            AbstractC10937b0.m23857B(this.f22834c, okHttpClient.m19533w());
            AbstractC10937b0.m23857B(this.f22835d, okHttpClient.m19535y());
            this.f22836e = okHttpClient.m19528r();
            this.f22837f = okHttpClient.m19511G();
            this.f22838g = okHttpClient.m19517g();
            this.f22839h = okHttpClient.m19529s();
            this.f22840i = okHttpClient.m19530t();
            this.f22841j = okHttpClient.m19525o();
            okHttpClient.m19518h();
            this.f22842k = okHttpClient.m19527q();
            this.f22843l = okHttpClient.m19507C();
            this.f22844m = okHttpClient.m19509E();
            this.f22845n = okHttpClient.m19508D();
            this.f22846o = okHttpClient.m19512H();
            this.f22847p = okHttpClient.f22820r;
            this.f22848q = okHttpClient.m19516L();
            this.f22849r = okHttpClient.m19524n();
            this.f22850s = okHttpClient.m19506B();
            this.f22851t = okHttpClient.m19532v();
            this.f22852u = okHttpClient.m19521k();
            this.f22853v = okHttpClient.m19520j();
            this.f22854w = okHttpClient.m19519i();
            this.f22855x = okHttpClient.m19522l();
            this.f22856y = okHttpClient.m19510F();
            this.f22857z = okHttpClient.m19515K();
            this.f22829A = okHttpClient.m19505A();
            this.f22830B = okHttpClient.m19534x();
            this.f22831C = okHttpClient.m19531u();
        }

        /* renamed from: d */
        public final a m19558d(AbstractC9723c abstractC9723c) {
            return this;
        }
    }

    public C9742v() {
        this(new a());
    }
}
