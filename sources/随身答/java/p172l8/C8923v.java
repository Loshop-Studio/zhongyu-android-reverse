package p172l8;

import android.support.v4.media.session.PlaybackStateCompat;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C9239b;
import okhttp3.CertificatePinner;
import okhttp3.Protocol;
import p172l8.AbstractC8916o;
import p172l8.InterfaceC8906e;
import p182m8.AbstractC9045d;
import p226q8.C9382e;
import p226q8.C9384g;
import p266u8.C9734j;
import p286w8.C9844a;
import p296x8.AbstractC9917c;
import p296x8.C9918d;

/* renamed from: l8.v */
/* loaded from: classes5.dex */
public class C8923v implements Cloneable, InterfaceC8906e.a {

    /* renamed from: D */
    public static final b f14844D = new b(null);

    /* renamed from: E */
    public static final List f14845E = AbstractC9045d.m14507w(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* renamed from: F */
    public static final List f14846F = AbstractC9045d.m14507w(C9239b.f15804i, C9239b.f15806k);

    /* renamed from: A */
    public final int f14847A;

    /* renamed from: B */
    public final long f14848B;

    /* renamed from: C */
    public final C9384g f14849C;

    /* renamed from: a */
    public final C8914m f14850a;

    /* renamed from: b */
    public final C8910i f14851b;

    /* renamed from: c */
    public final List f14852c;

    /* renamed from: d */
    public final List f14853d;

    /* renamed from: e */
    public final AbstractC8916o.c f14854e;

    /* renamed from: f */
    public final boolean f14855f;

    /* renamed from: g */
    public final InterfaceC8903b f14856g;

    /* renamed from: h */
    public final boolean f14857h;

    /* renamed from: i */
    public final boolean f14858i;

    /* renamed from: j */
    public final InterfaceC8912k f14859j;

    /* renamed from: k */
    public final InterfaceC8915n f14860k;

    /* renamed from: l */
    public final Proxy f14861l;

    /* renamed from: m */
    public final ProxySelector f14862m;

    /* renamed from: n */
    public final InterfaceC8903b f14863n;

    /* renamed from: o */
    public final SocketFactory f14864o;

    /* renamed from: p */
    public final SSLSocketFactory f14865p;

    /* renamed from: q */
    public final X509TrustManager f14866q;

    /* renamed from: r */
    public final List f14867r;

    /* renamed from: s */
    public final List f14868s;

    /* renamed from: t */
    public final HostnameVerifier f14869t;

    /* renamed from: u */
    public final CertificatePinner f14870u;

    /* renamed from: v */
    public final AbstractC9917c f14871v;

    /* renamed from: w */
    public final int f14872w;

    /* renamed from: x */
    public final int f14873x;

    /* renamed from: y */
    public final int f14874y;

    /* renamed from: z */
    public final int f14875z;

    /* renamed from: l8.v$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List m14126a() {
            return C8923v.f14846F;
        }

        /* renamed from: b */
        public final List m14127b() {
            return C8923v.f14845E;
        }

        public b() {
        }
    }

    public C8923v(a builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelectorM14087E;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f14850a = builder.m14117r();
        this.f14851b = builder.m14114o();
        this.f14852c = AbstractC9045d.m14477S(builder.m14123x());
        this.f14853d = AbstractC9045d.m14477S(builder.m14125z());
        this.f14854e = builder.m14119t();
        this.f14855f = builder.m14089G();
        this.f14856g = builder.m14108i();
        this.f14857h = builder.m14120u();
        this.f14858i = builder.m14121v();
        this.f14859j = builder.m14116q();
        builder.m14109j();
        this.f14860k = builder.m14118s();
        this.f14861l = builder.m14085C();
        if (builder.m14085C() != null) {
            proxySelectorM14087E = C9844a.f17575a;
        } else {
            proxySelectorM14087E = builder.m14087E();
            proxySelectorM14087E = proxySelectorM14087E == null ? ProxySelector.getDefault() : proxySelectorM14087E;
            if (proxySelectorM14087E == null) {
                proxySelectorM14087E = C9844a.f17575a;
            }
        }
        this.f14862m = proxySelectorM14087E;
        this.f14863n = builder.m14086D();
        this.f14864o = builder.m14091I();
        List listM14115p = builder.m14115p();
        this.f14867r = listM14115p;
        this.f14868s = builder.m14084B();
        this.f14869t = builder.m14122w();
        this.f14872w = builder.m14110k();
        this.f14873x = builder.m14113n();
        this.f14874y = builder.m14088F();
        this.f14875z = builder.m14093K();
        this.f14847A = builder.m14083A();
        this.f14848B = builder.m14124y();
        C9384g c9384gM14090H = builder.m14090H();
        this.f14849C = c9384gM14090H == null ? new C9384g() : c9384gM14090H;
        if (listM14115p == null || !listM14115p.isEmpty()) {
            Iterator it = listM14115p.iterator();
            while (it.hasNext()) {
                if (((C9239b) it.next()).m14847f()) {
                    if (builder.m14092J() != null) {
                        this.f14865p = builder.m14092J();
                        AbstractC9917c abstractC9917cM14111l = builder.m14111l();
                        Intrinsics.checkNotNull(abstractC9917cM14111l);
                        this.f14871v = abstractC9917cM14111l;
                        X509TrustManager x509TrustManagerM14094L = builder.m14094L();
                        Intrinsics.checkNotNull(x509TrustManagerM14094L);
                        this.f14866q = x509TrustManagerM14094L;
                        CertificatePinner certificatePinnerM14112m = builder.m14112m();
                        Intrinsics.checkNotNull(abstractC9917cM14111l);
                        this.f14870u = certificatePinnerM14112m.m14816e(abstractC9917cM14111l);
                    } else {
                        C9734j.a aVar = C9734j.f17200a;
                        X509TrustManager x509TrustManagerMo16242o = aVar.m16271g().mo16242o();
                        this.f14866q = x509TrustManagerMo16242o;
                        C9734j c9734jM16271g = aVar.m16271g();
                        Intrinsics.checkNotNull(x509TrustManagerMo16242o);
                        this.f14865p = c9734jM16271g.mo16246n(x509TrustManagerMo16242o);
                        AbstractC9917c.a aVar2 = AbstractC9917c.f17746a;
                        Intrinsics.checkNotNull(x509TrustManagerMo16242o);
                        AbstractC9917c abstractC9917cM16983a = aVar2.m16983a(x509TrustManagerMo16242o);
                        this.f14871v = abstractC9917cM16983a;
                        CertificatePinner certificatePinnerM14112m2 = builder.m14112m();
                        Intrinsics.checkNotNull(abstractC9917cM16983a);
                        this.f14870u = certificatePinnerM14112m2.m14816e(abstractC9917cM16983a);
                    }
                }
            }
            this.f14865p = null;
            this.f14871v = null;
            this.f14866q = null;
            this.f14870u = CertificatePinner.f15646d;
        } else {
            this.f14865p = null;
            this.f14871v = null;
            this.f14866q = null;
            this.f14870u = CertificatePinner.f15646d;
        }
        m14061K();
    }

    /* renamed from: A */
    public a m14051A() {
        return new a(this);
    }

    /* renamed from: B */
    public final int m14052B() {
        return this.f14847A;
    }

    /* renamed from: C */
    public final List m14053C() {
        return this.f14868s;
    }

    /* renamed from: D */
    public final Proxy m14054D() {
        return this.f14861l;
    }

    /* renamed from: E */
    public final InterfaceC8903b m14055E() {
        return this.f14863n;
    }

    /* renamed from: F */
    public final ProxySelector m14056F() {
        return this.f14862m;
    }

    /* renamed from: G */
    public final int m14057G() {
        return this.f14874y;
    }

    /* renamed from: H */
    public final boolean m14058H() {
        return this.f14855f;
    }

    /* renamed from: I */
    public final SocketFactory m14059I() {
        return this.f14864o;
    }

    /* renamed from: J */
    public final SSLSocketFactory m14060J() {
        SSLSocketFactory sSLSocketFactory = this.f14865p;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    /* renamed from: K */
    public final void m14061K() {
        List list = this.f14852c;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.f14852c).toString());
        }
        List list2 = this.f14853d;
        Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.f14853d).toString());
        }
        List list3 = this.f14867r;
        if (list3 == null || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((C9239b) it.next()).m14847f()) {
                    if (this.f14865p == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.f14871v == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.f14866q == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.f14865p != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f14871v != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f14866q != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!Intrinsics.areEqual(this.f14870u, CertificatePinner.f15646d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* renamed from: L */
    public final int m14062L() {
        return this.f14875z;
    }

    /* renamed from: M */
    public final X509TrustManager m14063M() {
        return this.f14866q;
    }

    @Override // p172l8.InterfaceC8906e.a
    /* renamed from: b */
    public InterfaceC8906e mo13868b(C8924w request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new C9382e(this, request, false);
    }

    public Object clone() {
        return super.clone();
    }

    /* renamed from: g */
    public final InterfaceC8903b m14064g() {
        return this.f14856g;
    }

    /* renamed from: h */
    public final AbstractC8904c m14065h() {
        return null;
    }

    /* renamed from: i */
    public final int m14066i() {
        return this.f14872w;
    }

    /* renamed from: j */
    public final AbstractC9917c m14067j() {
        return this.f14871v;
    }

    /* renamed from: l */
    public final CertificatePinner m14068l() {
        return this.f14870u;
    }

    /* renamed from: m */
    public final int m14069m() {
        return this.f14873x;
    }

    /* renamed from: n */
    public final C8910i m14070n() {
        return this.f14851b;
    }

    /* renamed from: o */
    public final List m14071o() {
        return this.f14867r;
    }

    /* renamed from: p */
    public final InterfaceC8912k m14072p() {
        return this.f14859j;
    }

    /* renamed from: q */
    public final C8914m m14073q() {
        return this.f14850a;
    }

    /* renamed from: r */
    public final InterfaceC8915n m14074r() {
        return this.f14860k;
    }

    /* renamed from: s */
    public final AbstractC8916o.c m14075s() {
        return this.f14854e;
    }

    /* renamed from: t */
    public final boolean m14076t() {
        return this.f14857h;
    }

    /* renamed from: u */
    public final boolean m14077u() {
        return this.f14858i;
    }

    /* renamed from: v */
    public final C9384g m14078v() {
        return this.f14849C;
    }

    /* renamed from: w */
    public final HostnameVerifier m14079w() {
        return this.f14869t;
    }

    /* renamed from: x */
    public final List m14080x() {
        return this.f14852c;
    }

    /* renamed from: y */
    public final long m14081y() {
        return this.f14848B;
    }

    /* renamed from: z */
    public final List m14082z() {
        return this.f14853d;
    }

    /* renamed from: l8.v$a */
    public static final class a {

        /* renamed from: A */
        public int f14876A;

        /* renamed from: B */
        public long f14877B;

        /* renamed from: C */
        public C9384g f14878C;

        /* renamed from: a */
        public C8914m f14879a;

        /* renamed from: b */
        public C8910i f14880b;

        /* renamed from: c */
        public final List f14881c;

        /* renamed from: d */
        public final List f14882d;

        /* renamed from: e */
        public AbstractC8916o.c f14883e;

        /* renamed from: f */
        public boolean f14884f;

        /* renamed from: g */
        public InterfaceC8903b f14885g;

        /* renamed from: h */
        public boolean f14886h;

        /* renamed from: i */
        public boolean f14887i;

        /* renamed from: j */
        public InterfaceC8912k f14888j;

        /* renamed from: k */
        public InterfaceC8915n f14889k;

        /* renamed from: l */
        public Proxy f14890l;

        /* renamed from: m */
        public ProxySelector f14891m;

        /* renamed from: n */
        public InterfaceC8903b f14892n;

        /* renamed from: o */
        public SocketFactory f14893o;

        /* renamed from: p */
        public SSLSocketFactory f14894p;

        /* renamed from: q */
        public X509TrustManager f14895q;

        /* renamed from: r */
        public List f14896r;

        /* renamed from: s */
        public List f14897s;

        /* renamed from: t */
        public HostnameVerifier f14898t;

        /* renamed from: u */
        public CertificatePinner f14899u;

        /* renamed from: v */
        public AbstractC9917c f14900v;

        /* renamed from: w */
        public int f14901w;

        /* renamed from: x */
        public int f14902x;

        /* renamed from: y */
        public int f14903y;

        /* renamed from: z */
        public int f14904z;

        public a() {
            this.f14879a = new C8914m();
            this.f14880b = new C8910i();
            this.f14881c = new ArrayList();
            this.f14882d = new ArrayList();
            this.f14883e = AbstractC9045d.m14491g(AbstractC8916o.f14785b);
            this.f14884f = true;
            InterfaceC8903b interfaceC8903b = InterfaceC8903b.f14726b;
            this.f14885g = interfaceC8903b;
            this.f14886h = true;
            this.f14887i = true;
            this.f14888j = InterfaceC8912k.f14771b;
            this.f14889k = InterfaceC8915n.f14782b;
            this.f14892n = interfaceC8903b;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
            this.f14893o = socketFactory;
            b bVar = C8923v.f14844D;
            this.f14896r = bVar.m14126a();
            this.f14897s = bVar.m14127b();
            this.f14898t = C9918d.f17747a;
            this.f14899u = CertificatePinner.f15646d;
            this.f14902x = 10000;
            this.f14903y = 10000;
            this.f14904z = 10000;
            this.f14877B = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }

        /* renamed from: A */
        public final int m14083A() {
            return this.f14876A;
        }

        /* renamed from: B */
        public final List m14084B() {
            return this.f14897s;
        }

        /* renamed from: C */
        public final Proxy m14085C() {
            return this.f14890l;
        }

        /* renamed from: D */
        public final InterfaceC8903b m14086D() {
            return this.f14892n;
        }

        /* renamed from: E */
        public final ProxySelector m14087E() {
            return this.f14891m;
        }

        /* renamed from: F */
        public final int m14088F() {
            return this.f14903y;
        }

        /* renamed from: G */
        public final boolean m14089G() {
            return this.f14884f;
        }

        /* renamed from: H */
        public final C9384g m14090H() {
            return this.f14878C;
        }

        /* renamed from: I */
        public final SocketFactory m14091I() {
            return this.f14893o;
        }

        /* renamed from: J */
        public final SSLSocketFactory m14092J() {
            return this.f14894p;
        }

        /* renamed from: K */
        public final int m14093K() {
            return this.f14904z;
        }

        /* renamed from: L */
        public final X509TrustManager m14094L() {
            return this.f14895q;
        }

        /* renamed from: M */
        public final a m14095M(HostnameVerifier hostnameVerifier) {
            Intrinsics.checkNotNullParameter(hostnameVerifier, "hostnameVerifier");
            if (!Intrinsics.areEqual(hostnameVerifier, this.f14898t)) {
                this.f14878C = null;
            }
            this.f14898t = hostnameVerifier;
            return this;
        }

        /* renamed from: N */
        public final a m14096N(Proxy proxy) {
            if (!Intrinsics.areEqual(proxy, this.f14890l)) {
                this.f14878C = null;
            }
            this.f14890l = proxy;
            return this;
        }

        /* renamed from: O */
        public final a m14097O(long j9, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f14903y = AbstractC9045d.m14495k("timeout", j9, unit);
            return this;
        }

        /* renamed from: P */
        public final a m14098P(boolean z9) {
            this.f14884f = z9;
            return this;
        }

        /* renamed from: Q */
        public final a m14099Q(long j9, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f14904z = AbstractC9045d.m14495k("timeout", j9, unit);
            return this;
        }

        /* renamed from: a */
        public final a m14100a(InterfaceC8920s interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.f14881c.add(interceptor);
            return this;
        }

        /* renamed from: b */
        public final a m14101b(InterfaceC8920s interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.f14882d.add(interceptor);
            return this;
        }

        /* renamed from: c */
        public final C8923v m14102c() {
            return new C8923v(this);
        }

        /* renamed from: e */
        public final a m14104e(long j9, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f14902x = AbstractC9045d.m14495k("timeout", j9, unit);
            return this;
        }

        /* renamed from: f */
        public final a m14105f(C8914m dispatcher) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            this.f14879a = dispatcher;
            return this;
        }

        /* renamed from: g */
        public final a m14106g(boolean z9) {
            this.f14886h = z9;
            return this;
        }

        /* renamed from: h */
        public final a m14107h(boolean z9) {
            this.f14887i = z9;
            return this;
        }

        /* renamed from: i */
        public final InterfaceC8903b m14108i() {
            return this.f14885g;
        }

        /* renamed from: j */
        public final AbstractC8904c m14109j() {
            return null;
        }

        /* renamed from: k */
        public final int m14110k() {
            return this.f14901w;
        }

        /* renamed from: l */
        public final AbstractC9917c m14111l() {
            return this.f14900v;
        }

        /* renamed from: m */
        public final CertificatePinner m14112m() {
            return this.f14899u;
        }

        /* renamed from: n */
        public final int m14113n() {
            return this.f14902x;
        }

        /* renamed from: o */
        public final C8910i m14114o() {
            return this.f14880b;
        }

        /* renamed from: p */
        public final List m14115p() {
            return this.f14896r;
        }

        /* renamed from: q */
        public final InterfaceC8912k m14116q() {
            return this.f14888j;
        }

        /* renamed from: r */
        public final C8914m m14117r() {
            return this.f14879a;
        }

        /* renamed from: s */
        public final InterfaceC8915n m14118s() {
            return this.f14889k;
        }

        /* renamed from: t */
        public final AbstractC8916o.c m14119t() {
            return this.f14883e;
        }

        /* renamed from: u */
        public final boolean m14120u() {
            return this.f14886h;
        }

        /* renamed from: v */
        public final boolean m14121v() {
            return this.f14887i;
        }

        /* renamed from: w */
        public final HostnameVerifier m14122w() {
            return this.f14898t;
        }

        /* renamed from: x */
        public final List m14123x() {
            return this.f14881c;
        }

        /* renamed from: y */
        public final long m14124y() {
            return this.f14877B;
        }

        /* renamed from: z */
        public final List m14125z() {
            return this.f14882d;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(C8923v okHttpClient) {
            this();
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            this.f14879a = okHttpClient.m14073q();
            this.f14880b = okHttpClient.m14070n();
            CollectionsKt.addAll(this.f14881c, okHttpClient.m14080x());
            CollectionsKt.addAll(this.f14882d, okHttpClient.m14082z());
            this.f14883e = okHttpClient.m14075s();
            this.f14884f = okHttpClient.m14058H();
            this.f14885g = okHttpClient.m14064g();
            this.f14886h = okHttpClient.m14076t();
            this.f14887i = okHttpClient.m14077u();
            this.f14888j = okHttpClient.m14072p();
            okHttpClient.m14065h();
            this.f14889k = okHttpClient.m14074r();
            this.f14890l = okHttpClient.m14054D();
            this.f14891m = okHttpClient.m14056F();
            this.f14892n = okHttpClient.m14055E();
            this.f14893o = okHttpClient.m14059I();
            this.f14894p = okHttpClient.f14865p;
            this.f14895q = okHttpClient.m14063M();
            this.f14896r = okHttpClient.m14071o();
            this.f14897s = okHttpClient.m14053C();
            this.f14898t = okHttpClient.m14079w();
            this.f14899u = okHttpClient.m14068l();
            this.f14900v = okHttpClient.m14067j();
            this.f14901w = okHttpClient.m14066i();
            this.f14902x = okHttpClient.m14069m();
            this.f14903y = okHttpClient.m14057G();
            this.f14904z = okHttpClient.m14062L();
            this.f14876A = okHttpClient.m14052B();
            this.f14877B = okHttpClient.m14081y();
            this.f14878C = okHttpClient.m14078v();
        }

        /* renamed from: d */
        public final a m14103d(AbstractC8904c abstractC8904c) {
            return this;
        }
    }

    public C8923v() {
        this(new a());
    }
}
