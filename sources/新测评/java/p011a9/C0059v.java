package p011a9;

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
import okhttp3.C8736b;
import okhttp3.CertificatePinner;
import okhttp3.Protocol;
import p011a9.AbstractC0052o;
import p011a9.InterfaceC0042e;
import p028b9.AbstractC5070d;
import p092f9.C7501e;
import p092f9.C7503g;
import p136j9.C7828j;
import p160l9.C8524a;
import p171m9.AbstractC8573c;
import p171m9.C8574d;

/* renamed from: a9.v */
/* loaded from: classes5.dex */
public class C0059v implements Cloneable, InterfaceC0042e.a {

    /* renamed from: D */
    public static final b f216D = new b(null);

    /* renamed from: E */
    public static final List f217E = AbstractC5070d.m2658w(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* renamed from: F */
    public static final List f218F = AbstractC5070d.m2658w(C8736b.f14677i, C8736b.f14679k);

    /* renamed from: A */
    public final int f219A;

    /* renamed from: B */
    public final long f220B;

    /* renamed from: C */
    public final C7503g f221C;

    /* renamed from: a */
    public final C0050m f222a;

    /* renamed from: b */
    public final C0046i f223b;

    /* renamed from: c */
    public final List f224c;

    /* renamed from: d */
    public final List f225d;

    /* renamed from: e */
    public final AbstractC0052o.c f226e;

    /* renamed from: f */
    public final boolean f227f;

    /* renamed from: g */
    public final InterfaceC0039b f228g;

    /* renamed from: h */
    public final boolean f229h;

    /* renamed from: i */
    public final boolean f230i;

    /* renamed from: j */
    public final InterfaceC0048k f231j;

    /* renamed from: k */
    public final InterfaceC0051n f232k;

    /* renamed from: l */
    public final Proxy f233l;

    /* renamed from: m */
    public final ProxySelector f234m;

    /* renamed from: n */
    public final InterfaceC0039b f235n;

    /* renamed from: o */
    public final SocketFactory f236o;

    /* renamed from: p */
    public final SSLSocketFactory f237p;

    /* renamed from: q */
    public final X509TrustManager f238q;

    /* renamed from: r */
    public final List f239r;

    /* renamed from: s */
    public final List f240s;

    /* renamed from: t */
    public final HostnameVerifier f241t;

    /* renamed from: u */
    public final CertificatePinner f242u;

    /* renamed from: v */
    public final AbstractC8573c f243v;

    /* renamed from: w */
    public final int f244w;

    /* renamed from: x */
    public final int f245x;

    /* renamed from: y */
    public final int f246y;

    /* renamed from: z */
    public final int f247z;

    /* renamed from: a9.v$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List m370a() {
            return C0059v.f218F;
        }

        /* renamed from: b */
        public final List m371b() {
            return C0059v.f217E;
        }

        public b() {
        }
    }

    public C0059v(a builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelectorM331E;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f222a = builder.m361r();
        this.f223b = builder.m358o();
        this.f224c = AbstractC5070d.m2628S(builder.m367x());
        this.f225d = AbstractC5070d.m2628S(builder.m369z());
        this.f226e = builder.m363t();
        this.f227f = builder.m333G();
        this.f228g = builder.m352i();
        this.f229h = builder.m364u();
        this.f230i = builder.m365v();
        this.f231j = builder.m360q();
        builder.m353j();
        this.f232k = builder.m362s();
        this.f233l = builder.m329C();
        if (builder.m329C() != null) {
            proxySelectorM331E = C8524a.f14155a;
        } else {
            proxySelectorM331E = builder.m331E();
            proxySelectorM331E = proxySelectorM331E == null ? ProxySelector.getDefault() : proxySelectorM331E;
            if (proxySelectorM331E == null) {
                proxySelectorM331E = C8524a.f14155a;
            }
        }
        this.f234m = proxySelectorM331E;
        this.f235n = builder.m330D();
        this.f236o = builder.m335I();
        List listM359p = builder.m359p();
        this.f239r = listM359p;
        this.f240s = builder.m328B();
        this.f241t = builder.m366w();
        this.f244w = builder.m354k();
        this.f245x = builder.m357n();
        this.f246y = builder.m332F();
        this.f247z = builder.m337K();
        this.f219A = builder.m327A();
        this.f220B = builder.m368y();
        C7503g c7503gM334H = builder.m334H();
        this.f221C = c7503gM334H == null ? new C7503g() : c7503gM334H;
        if (listM359p == null || !listM359p.isEmpty()) {
            Iterator it = listM359p.iterator();
            while (it.hasNext()) {
                if (((C8736b) it.next()).m14413f()) {
                    if (builder.m336J() != null) {
                        this.f237p = builder.m336J();
                        AbstractC8573c abstractC8573cM355l = builder.m355l();
                        Intrinsics.checkNotNull(abstractC8573cM355l);
                        this.f243v = abstractC8573cM355l;
                        X509TrustManager x509TrustManagerM338L = builder.m338L();
                        Intrinsics.checkNotNull(x509TrustManagerM338L);
                        this.f238q = x509TrustManagerM338L;
                        CertificatePinner certificatePinnerM356m = builder.m356m();
                        Intrinsics.checkNotNull(abstractC8573cM355l);
                        this.f242u = certificatePinnerM356m.m14382e(abstractC8573cM355l);
                    } else {
                        C7828j.a aVar = C7828j.f13560a;
                        X509TrustManager x509TrustManagerMo13262o = aVar.m13291g().mo13262o();
                        this.f238q = x509TrustManagerMo13262o;
                        C7828j c7828jM13291g = aVar.m13291g();
                        Intrinsics.checkNotNull(x509TrustManagerMo13262o);
                        this.f237p = c7828jM13291g.mo13266n(x509TrustManagerMo13262o);
                        AbstractC8573c.a aVar2 = AbstractC8573c.f14215a;
                        Intrinsics.checkNotNull(x509TrustManagerMo13262o);
                        AbstractC8573c abstractC8573cM14112a = aVar2.m14112a(x509TrustManagerMo13262o);
                        this.f243v = abstractC8573cM14112a;
                        CertificatePinner certificatePinnerM356m2 = builder.m356m();
                        Intrinsics.checkNotNull(abstractC8573cM14112a);
                        this.f242u = certificatePinnerM356m2.m14382e(abstractC8573cM14112a);
                    }
                }
            }
            this.f237p = null;
            this.f243v = null;
            this.f238q = null;
            this.f242u = CertificatePinner.f14519d;
        } else {
            this.f237p = null;
            this.f243v = null;
            this.f238q = null;
            this.f242u = CertificatePinner.f14519d;
        }
        m305K();
    }

    /* renamed from: A */
    public a m295A() {
        return new a(this);
    }

    /* renamed from: B */
    public final int m296B() {
        return this.f219A;
    }

    /* renamed from: C */
    public final List m297C() {
        return this.f240s;
    }

    /* renamed from: D */
    public final Proxy m298D() {
        return this.f233l;
    }

    /* renamed from: E */
    public final InterfaceC0039b m299E() {
        return this.f235n;
    }

    /* renamed from: F */
    public final ProxySelector m300F() {
        return this.f234m;
    }

    /* renamed from: G */
    public final int m301G() {
        return this.f246y;
    }

    /* renamed from: H */
    public final boolean m302H() {
        return this.f227f;
    }

    /* renamed from: I */
    public final SocketFactory m303I() {
        return this.f236o;
    }

    /* renamed from: J */
    public final SSLSocketFactory m304J() {
        SSLSocketFactory sSLSocketFactory = this.f237p;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    /* renamed from: K */
    public final void m305K() {
        List list = this.f224c;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.f224c).toString());
        }
        List list2 = this.f225d;
        Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.f225d).toString());
        }
        List list3 = this.f239r;
        if (list3 == null || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((C8736b) it.next()).m14413f()) {
                    if (this.f237p == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.f243v == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.f238q == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.f237p != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f243v != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f238q != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!Intrinsics.areEqual(this.f242u, CertificatePinner.f14519d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* renamed from: L */
    public final int m306L() {
        return this.f247z;
    }

    /* renamed from: M */
    public final X509TrustManager m307M() {
        return this.f238q;
    }

    @Override // p011a9.InterfaceC0042e.a
    /* renamed from: b */
    public InterfaceC0042e mo109b(C0060w request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new C7501e(this, request, false);
    }

    public Object clone() {
        return super.clone();
    }

    /* renamed from: f */
    public final InterfaceC0039b m308f() {
        return this.f228g;
    }

    /* renamed from: g */
    public final AbstractC0040c m309g() {
        return null;
    }

    /* renamed from: h */
    public final int m310h() {
        return this.f244w;
    }

    /* renamed from: i */
    public final AbstractC8573c m311i() {
        return this.f243v;
    }

    /* renamed from: k */
    public final CertificatePinner m312k() {
        return this.f242u;
    }

    /* renamed from: l */
    public final int m313l() {
        return this.f245x;
    }

    /* renamed from: m */
    public final C0046i m314m() {
        return this.f223b;
    }

    /* renamed from: n */
    public final List m315n() {
        return this.f239r;
    }

    /* renamed from: p */
    public final InterfaceC0048k m316p() {
        return this.f231j;
    }

    /* renamed from: q */
    public final C0050m m317q() {
        return this.f222a;
    }

    /* renamed from: r */
    public final InterfaceC0051n m318r() {
        return this.f232k;
    }

    /* renamed from: s */
    public final AbstractC0052o.c m319s() {
        return this.f226e;
    }

    /* renamed from: t */
    public final boolean m320t() {
        return this.f229h;
    }

    /* renamed from: u */
    public final boolean m321u() {
        return this.f230i;
    }

    /* renamed from: v */
    public final C7503g m322v() {
        return this.f221C;
    }

    /* renamed from: w */
    public final HostnameVerifier m323w() {
        return this.f241t;
    }

    /* renamed from: x */
    public final List m324x() {
        return this.f224c;
    }

    /* renamed from: y */
    public final long m325y() {
        return this.f220B;
    }

    /* renamed from: z */
    public final List m326z() {
        return this.f225d;
    }

    /* renamed from: a9.v$a */
    public static final class a {

        /* renamed from: A */
        public int f248A;

        /* renamed from: B */
        public long f249B;

        /* renamed from: C */
        public C7503g f250C;

        /* renamed from: a */
        public C0050m f251a;

        /* renamed from: b */
        public C0046i f252b;

        /* renamed from: c */
        public final List f253c;

        /* renamed from: d */
        public final List f254d;

        /* renamed from: e */
        public AbstractC0052o.c f255e;

        /* renamed from: f */
        public boolean f256f;

        /* renamed from: g */
        public InterfaceC0039b f257g;

        /* renamed from: h */
        public boolean f258h;

        /* renamed from: i */
        public boolean f259i;

        /* renamed from: j */
        public InterfaceC0048k f260j;

        /* renamed from: k */
        public InterfaceC0051n f261k;

        /* renamed from: l */
        public Proxy f262l;

        /* renamed from: m */
        public ProxySelector f263m;

        /* renamed from: n */
        public InterfaceC0039b f264n;

        /* renamed from: o */
        public SocketFactory f265o;

        /* renamed from: p */
        public SSLSocketFactory f266p;

        /* renamed from: q */
        public X509TrustManager f267q;

        /* renamed from: r */
        public List f268r;

        /* renamed from: s */
        public List f269s;

        /* renamed from: t */
        public HostnameVerifier f270t;

        /* renamed from: u */
        public CertificatePinner f271u;

        /* renamed from: v */
        public AbstractC8573c f272v;

        /* renamed from: w */
        public int f273w;

        /* renamed from: x */
        public int f274x;

        /* renamed from: y */
        public int f275y;

        /* renamed from: z */
        public int f276z;

        public a() {
            this.f251a = new C0050m();
            this.f252b = new C0046i();
            this.f253c = new ArrayList();
            this.f254d = new ArrayList();
            this.f255e = AbstractC5070d.m2642g(AbstractC0052o.f157b);
            this.f256f = true;
            InterfaceC0039b interfaceC0039b = InterfaceC0039b.f98b;
            this.f257g = interfaceC0039b;
            this.f258h = true;
            this.f259i = true;
            this.f260j = InterfaceC0048k.f143b;
            this.f261k = InterfaceC0051n.f154b;
            this.f264n = interfaceC0039b;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
            this.f265o = socketFactory;
            b bVar = C0059v.f216D;
            this.f268r = bVar.m370a();
            this.f269s = bVar.m371b();
            this.f270t = C8574d.f14216a;
            this.f271u = CertificatePinner.f14519d;
            this.f274x = 10000;
            this.f275y = 10000;
            this.f276z = 10000;
            this.f249B = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }

        /* renamed from: A */
        public final int m327A() {
            return this.f248A;
        }

        /* renamed from: B */
        public final List m328B() {
            return this.f269s;
        }

        /* renamed from: C */
        public final Proxy m329C() {
            return this.f262l;
        }

        /* renamed from: D */
        public final InterfaceC0039b m330D() {
            return this.f264n;
        }

        /* renamed from: E */
        public final ProxySelector m331E() {
            return this.f263m;
        }

        /* renamed from: F */
        public final int m332F() {
            return this.f275y;
        }

        /* renamed from: G */
        public final boolean m333G() {
            return this.f256f;
        }

        /* renamed from: H */
        public final C7503g m334H() {
            return this.f250C;
        }

        /* renamed from: I */
        public final SocketFactory m335I() {
            return this.f265o;
        }

        /* renamed from: J */
        public final SSLSocketFactory m336J() {
            return this.f266p;
        }

        /* renamed from: K */
        public final int m337K() {
            return this.f276z;
        }

        /* renamed from: L */
        public final X509TrustManager m338L() {
            return this.f267q;
        }

        /* renamed from: M */
        public final a m339M(HostnameVerifier hostnameVerifier) {
            Intrinsics.checkNotNullParameter(hostnameVerifier, "hostnameVerifier");
            if (!Intrinsics.areEqual(hostnameVerifier, this.f270t)) {
                this.f250C = null;
            }
            this.f270t = hostnameVerifier;
            return this;
        }

        /* renamed from: N */
        public final a m340N(Proxy proxy) {
            if (!Intrinsics.areEqual(proxy, this.f262l)) {
                this.f250C = null;
            }
            this.f262l = proxy;
            return this;
        }

        /* renamed from: O */
        public final a m341O(long j10, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f275y = AbstractC5070d.m2646k("timeout", j10, unit);
            return this;
        }

        /* renamed from: P */
        public final a m342P(boolean z9) {
            this.f256f = z9;
            return this;
        }

        /* renamed from: Q */
        public final a m343Q(long j10, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f276z = AbstractC5070d.m2646k("timeout", j10, unit);
            return this;
        }

        /* renamed from: a */
        public final a m344a(InterfaceC0056s interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.f253c.add(interceptor);
            return this;
        }

        /* renamed from: b */
        public final a m345b(InterfaceC0056s interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.f254d.add(interceptor);
            return this;
        }

        /* renamed from: c */
        public final C0059v m346c() {
            return new C0059v(this);
        }

        /* renamed from: e */
        public final a m348e(long j10, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f274x = AbstractC5070d.m2646k("timeout", j10, unit);
            return this;
        }

        /* renamed from: f */
        public final a m349f(C0050m dispatcher) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            this.f251a = dispatcher;
            return this;
        }

        /* renamed from: g */
        public final a m350g(boolean z9) {
            this.f258h = z9;
            return this;
        }

        /* renamed from: h */
        public final a m351h(boolean z9) {
            this.f259i = z9;
            return this;
        }

        /* renamed from: i */
        public final InterfaceC0039b m352i() {
            return this.f257g;
        }

        /* renamed from: j */
        public final AbstractC0040c m353j() {
            return null;
        }

        /* renamed from: k */
        public final int m354k() {
            return this.f273w;
        }

        /* renamed from: l */
        public final AbstractC8573c m355l() {
            return this.f272v;
        }

        /* renamed from: m */
        public final CertificatePinner m356m() {
            return this.f271u;
        }

        /* renamed from: n */
        public final int m357n() {
            return this.f274x;
        }

        /* renamed from: o */
        public final C0046i m358o() {
            return this.f252b;
        }

        /* renamed from: p */
        public final List m359p() {
            return this.f268r;
        }

        /* renamed from: q */
        public final InterfaceC0048k m360q() {
            return this.f260j;
        }

        /* renamed from: r */
        public final C0050m m361r() {
            return this.f251a;
        }

        /* renamed from: s */
        public final InterfaceC0051n m362s() {
            return this.f261k;
        }

        /* renamed from: t */
        public final AbstractC0052o.c m363t() {
            return this.f255e;
        }

        /* renamed from: u */
        public final boolean m364u() {
            return this.f258h;
        }

        /* renamed from: v */
        public final boolean m365v() {
            return this.f259i;
        }

        /* renamed from: w */
        public final HostnameVerifier m366w() {
            return this.f270t;
        }

        /* renamed from: x */
        public final List m367x() {
            return this.f253c;
        }

        /* renamed from: y */
        public final long m368y() {
            return this.f249B;
        }

        /* renamed from: z */
        public final List m369z() {
            return this.f254d;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(C0059v okHttpClient) {
            this();
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            this.f251a = okHttpClient.m317q();
            this.f252b = okHttpClient.m314m();
            CollectionsKt.addAll(this.f253c, okHttpClient.m324x());
            CollectionsKt.addAll(this.f254d, okHttpClient.m326z());
            this.f255e = okHttpClient.m319s();
            this.f256f = okHttpClient.m302H();
            this.f257g = okHttpClient.m308f();
            this.f258h = okHttpClient.m320t();
            this.f259i = okHttpClient.m321u();
            this.f260j = okHttpClient.m316p();
            okHttpClient.m309g();
            this.f261k = okHttpClient.m318r();
            this.f262l = okHttpClient.m298D();
            this.f263m = okHttpClient.m300F();
            this.f264n = okHttpClient.m299E();
            this.f265o = okHttpClient.m303I();
            this.f266p = okHttpClient.f237p;
            this.f267q = okHttpClient.m307M();
            this.f268r = okHttpClient.m315n();
            this.f269s = okHttpClient.m297C();
            this.f270t = okHttpClient.m323w();
            this.f271u = okHttpClient.m312k();
            this.f272v = okHttpClient.m311i();
            this.f273w = okHttpClient.m310h();
            this.f274x = okHttpClient.m313l();
            this.f275y = okHttpClient.m301G();
            this.f276z = okHttpClient.m306L();
            this.f248A = okHttpClient.m296B();
            this.f249B = okHttpClient.m325y();
            this.f250C = okHttpClient.m322v();
        }

        /* renamed from: d */
        public final a m347d(AbstractC0040c abstractC0040c) {
            return this;
        }
    }

    public C0059v() {
        this(new a());
    }
}
