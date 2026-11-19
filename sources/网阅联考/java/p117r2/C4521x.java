package p117r2;

import android.support.v4.media.session.PlaybackStateCompat;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CertificatePinner;
import okhttp3.Protocol;
import p004a3.C0021k;
import p019c3.C2757a;
import p050d3.AbstractC3709c;
import p050d3.C3710d;
import p117r2.AbstractC4514q;
import p117r2.InterfaceC4502e;
import p121s2.AbstractC4550b;
import p137w2.C4645e;
import p137w2.C4648h;

/* renamed from: r2.x */
/* loaded from: classes2.dex */
public class C4521x implements Cloneable, InterfaceC4502e.a {

    /* renamed from: A */
    public final int f5586A;

    /* renamed from: B */
    public final long f5587B;

    /* renamed from: C */
    public final C4648h f5588C;

    /* renamed from: a */
    public final C4512o f5589a;

    /* renamed from: b */
    public final C4507j f5590b;

    /* renamed from: c */
    public final List f5591c;

    /* renamed from: d */
    public final List f5592d;

    /* renamed from: e */
    public final AbstractC4514q.c f5593e;

    /* renamed from: f */
    public final boolean f5594f;

    /* renamed from: g */
    public final InterfaceC4497b f5595g;

    /* renamed from: h */
    public final boolean f5596h;

    /* renamed from: i */
    public final boolean f5597i;

    /* renamed from: j */
    public final InterfaceC4510m f5598j;

    /* renamed from: k */
    public final InterfaceC4513p f5599k;

    /* renamed from: l */
    public final Proxy f5600l;

    /* renamed from: m */
    public final ProxySelector f5601m;

    /* renamed from: n */
    public final InterfaceC4497b f5602n;

    /* renamed from: o */
    public final SocketFactory f5603o;

    /* renamed from: p */
    public final SSLSocketFactory f5604p;

    /* renamed from: q */
    public final X509TrustManager f5605q;

    /* renamed from: r */
    public final List f5606r;

    /* renamed from: s */
    public final List f5607s;

    /* renamed from: t */
    public final HostnameVerifier f5608t;

    /* renamed from: u */
    public final CertificatePinner f5609u;

    /* renamed from: v */
    public final AbstractC3709c f5610v;

    /* renamed from: w */
    public final int f5611w;

    /* renamed from: x */
    public final int f5612x;

    /* renamed from: y */
    public final int f5613y;

    /* renamed from: z */
    public final int f5614z;

    /* renamed from: F */
    public static final b f5585F = new b(null);

    /* renamed from: D */
    public static final List f5583D = AbstractC4550b.m6238t(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* renamed from: E */
    public static final List f5584E = AbstractC4550b.m6238t(C4508k.f5485h, C4508k.f5487j);

    /* renamed from: r2.x$a */
    public static final class a {

        /* renamed from: A */
        public int f5615A;

        /* renamed from: B */
        public long f5616B;

        /* renamed from: C */
        public C4648h f5617C;

        /* renamed from: a */
        public C4512o f5618a = new C4512o();

        /* renamed from: b */
        public C4507j f5619b = new C4507j();

        /* renamed from: c */
        public final List f5620c = new ArrayList();

        /* renamed from: d */
        public final List f5621d = new ArrayList();

        /* renamed from: e */
        public AbstractC4514q.c f5622e = AbstractC4550b.m6223e(AbstractC4514q.f5523a);

        /* renamed from: f */
        public boolean f5623f = true;

        /* renamed from: g */
        public InterfaceC4497b f5624g;

        /* renamed from: h */
        public boolean f5625h;

        /* renamed from: i */
        public boolean f5626i;

        /* renamed from: j */
        public InterfaceC4510m f5627j;

        /* renamed from: k */
        public InterfaceC4513p f5628k;

        /* renamed from: l */
        public Proxy f5629l;

        /* renamed from: m */
        public ProxySelector f5630m;

        /* renamed from: n */
        public InterfaceC4497b f5631n;

        /* renamed from: o */
        public SocketFactory f5632o;

        /* renamed from: p */
        public SSLSocketFactory f5633p;

        /* renamed from: q */
        public X509TrustManager f5634q;

        /* renamed from: r */
        public List f5635r;

        /* renamed from: s */
        public List f5636s;

        /* renamed from: t */
        public HostnameVerifier f5637t;

        /* renamed from: u */
        public CertificatePinner f5638u;

        /* renamed from: v */
        public AbstractC3709c f5639v;

        /* renamed from: w */
        public int f5640w;

        /* renamed from: x */
        public int f5641x;

        /* renamed from: y */
        public int f5642y;

        /* renamed from: z */
        public int f5643z;

        public a() {
            InterfaceC4497b interfaceC4497b = InterfaceC4497b.f5317a;
            this.f5624g = interfaceC4497b;
            this.f5625h = true;
            this.f5626i = true;
            this.f5627j = InterfaceC4510m.f5511a;
            this.f5628k = InterfaceC4513p.f5521a;
            this.f5631n = interfaceC4497b;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "SocketFactory.getDefault()");
            this.f5632o = socketFactory;
            b bVar = C4521x.f5585F;
            this.f5635r = bVar.m6130a();
            this.f5636s = bVar.m6131b();
            this.f5637t = C3710d.f4334a;
            this.f5638u = CertificatePinner.f5026c;
            this.f5641x = 10000;
            this.f5642y = 10000;
            this.f5643z = 10000;
            this.f5616B = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }

        /* renamed from: A */
        public final int m6095A() {
            return this.f5642y;
        }

        /* renamed from: B */
        public final boolean m6096B() {
            return this.f5623f;
        }

        /* renamed from: C */
        public final C4648h m6097C() {
            return this.f5617C;
        }

        /* renamed from: D */
        public final SocketFactory m6098D() {
            return this.f5632o;
        }

        /* renamed from: E */
        public final SSLSocketFactory m6099E() {
            return this.f5633p;
        }

        /* renamed from: F */
        public final int m6100F() {
            return this.f5643z;
        }

        /* renamed from: G */
        public final X509TrustManager m6101G() {
            return this.f5634q;
        }

        /* renamed from: H */
        public final a m6102H(long j4, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f5642y = AbstractC4550b.m6226h("timeout", j4, unit);
            return this;
        }

        /* renamed from: I */
        public final a m6103I(long j4, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f5643z = AbstractC4550b.m6226h("timeout", j4, unit);
            return this;
        }

        /* renamed from: a */
        public final a m6104a(InterfaceC4518u interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.f5620c.add(interceptor);
            return this;
        }

        /* renamed from: b */
        public final C4521x m6105b() {
            return new C4521x(this);
        }

        /* renamed from: c */
        public final a m6106c(long j4, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f5641x = AbstractC4550b.m6226h("timeout", j4, unit);
            return this;
        }

        /* renamed from: d */
        public final InterfaceC4497b m6107d() {
            return this.f5624g;
        }

        /* renamed from: e */
        public final AbstractC4499c m6108e() {
            return null;
        }

        /* renamed from: f */
        public final int m6109f() {
            return this.f5640w;
        }

        /* renamed from: g */
        public final AbstractC3709c m6110g() {
            return this.f5639v;
        }

        /* renamed from: h */
        public final CertificatePinner m6111h() {
            return this.f5638u;
        }

        /* renamed from: i */
        public final int m6112i() {
            return this.f5641x;
        }

        /* renamed from: j */
        public final C4507j m6113j() {
            return this.f5619b;
        }

        /* renamed from: k */
        public final List m6114k() {
            return this.f5635r;
        }

        /* renamed from: l */
        public final InterfaceC4510m m6115l() {
            return this.f5627j;
        }

        /* renamed from: m */
        public final C4512o m6116m() {
            return this.f5618a;
        }

        /* renamed from: n */
        public final InterfaceC4513p m6117n() {
            return this.f5628k;
        }

        /* renamed from: o */
        public final AbstractC4514q.c m6118o() {
            return this.f5622e;
        }

        /* renamed from: p */
        public final boolean m6119p() {
            return this.f5625h;
        }

        /* renamed from: q */
        public final boolean m6120q() {
            return this.f5626i;
        }

        /* renamed from: r */
        public final HostnameVerifier m6121r() {
            return this.f5637t;
        }

        /* renamed from: s */
        public final List m6122s() {
            return this.f5620c;
        }

        /* renamed from: t */
        public final long m6123t() {
            return this.f5616B;
        }

        /* renamed from: u */
        public final List m6124u() {
            return this.f5621d;
        }

        /* renamed from: v */
        public final int m6125v() {
            return this.f5615A;
        }

        /* renamed from: w */
        public final List m6126w() {
            return this.f5636s;
        }

        /* renamed from: x */
        public final Proxy m6127x() {
            return this.f5629l;
        }

        /* renamed from: y */
        public final InterfaceC4497b m6128y() {
            return this.f5631n;
        }

        /* renamed from: z */
        public final ProxySelector m6129z() {
            return this.f5630m;
        }
    }

    /* renamed from: r2.x$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List m6130a() {
            return C4521x.f5584E;
        }

        /* renamed from: b */
        public final List m6131b() {
            return C4521x.f5583D;
        }
    }

    public C4521x(a builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelectorM6129z;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f5589a = builder.m6116m();
        this.f5590b = builder.m6113j();
        this.f5591c = AbstractC4550b.m6211N(builder.m6122s());
        this.f5592d = AbstractC4550b.m6211N(builder.m6124u());
        this.f5593e = builder.m6118o();
        this.f5594f = builder.m6096B();
        this.f5595g = builder.m6107d();
        this.f5596h = builder.m6119p();
        this.f5597i = builder.m6120q();
        this.f5598j = builder.m6115l();
        builder.m6108e();
        this.f5599k = builder.m6117n();
        this.f5600l = builder.m6127x();
        if (builder.m6127x() != null) {
            proxySelectorM6129z = C2757a.f521a;
        } else {
            proxySelectorM6129z = builder.m6129z();
            proxySelectorM6129z = proxySelectorM6129z == null ? ProxySelector.getDefault() : proxySelectorM6129z;
            if (proxySelectorM6129z == null) {
                proxySelectorM6129z = C2757a.f521a;
            }
        }
        this.f5601m = proxySelectorM6129z;
        this.f5602n = builder.m6128y();
        this.f5603o = builder.m6098D();
        List listM6114k = builder.m6114k();
        this.f5606r = listM6114k;
        this.f5607s = builder.m6126w();
        this.f5608t = builder.m6121r();
        this.f5611w = builder.m6109f();
        this.f5612x = builder.m6112i();
        this.f5613y = builder.m6095A();
        this.f5614z = builder.m6100F();
        this.f5586A = builder.m6125v();
        this.f5587B = builder.m6123t();
        C4648h c4648hM6097C = builder.m6097C();
        this.f5588C = c4648hM6097C == null ? new C4648h() : c4648hM6097C;
        boolean z3 = true;
        if (!(listM6114k instanceof Collection) || !listM6114k.isEmpty()) {
            Iterator it = listM6114k.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C4508k) it.next()).m5889f()) {
                    z3 = false;
                    break;
                }
            }
        }
        if (z3) {
            this.f5604p = null;
            this.f5610v = null;
            this.f5605q = null;
            this.f5609u = CertificatePinner.f5026c;
        } else if (builder.m6099E() != null) {
            this.f5604p = builder.m6099E();
            AbstractC3709c abstractC3709cM6110g = builder.m6110g();
            Intrinsics.checkNotNull(abstractC3709cM6110g);
            this.f5610v = abstractC3709cM6110g;
            X509TrustManager x509TrustManagerM6101G = builder.m6101G();
            Intrinsics.checkNotNull(x509TrustManagerM6101G);
            this.f5605q = x509TrustManagerM6101G;
            CertificatePinner certificatePinnerM6111h = builder.m6111h();
            Intrinsics.checkNotNull(abstractC3709cM6110g);
            this.f5609u = certificatePinnerM6111h.m5567e(abstractC3709cM6110g);
        } else {
            C0021k.a aVar = C0021k.f39c;
            X509TrustManager x509TrustManagerMo42o = aVar.m71g().mo42o();
            this.f5605q = x509TrustManagerMo42o;
            C0021k c0021kM71g = aVar.m71g();
            Intrinsics.checkNotNull(x509TrustManagerMo42o);
            this.f5604p = c0021kM71g.mo46n(x509TrustManagerMo42o);
            AbstractC3709c.a aVar2 = AbstractC3709c.f4333a;
            Intrinsics.checkNotNull(x509TrustManagerMo42o);
            AbstractC3709c abstractC3709cM4698a = aVar2.m4698a(x509TrustManagerMo42o);
            this.f5610v = abstractC3709cM4698a;
            CertificatePinner certificatePinnerM6111h2 = builder.m6111h();
            Intrinsics.checkNotNull(abstractC3709cM4698a);
            this.f5609u = certificatePinnerM6111h2.m5567e(abstractC3709cM4698a);
        }
        m6071E();
    }

    /* renamed from: A */
    public final int m6067A() {
        return this.f5613y;
    }

    /* renamed from: B */
    public final boolean m6068B() {
        return this.f5594f;
    }

    /* renamed from: C */
    public final SocketFactory m6069C() {
        return this.f5603o;
    }

    /* renamed from: D */
    public final SSLSocketFactory m6070D() {
        SSLSocketFactory sSLSocketFactory = this.f5604p;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    /* renamed from: E */
    public final void m6071E() {
        boolean z3;
        if (this.f5591c == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (!(!r0.contains(null))) {
            throw new IllegalStateException(("Null interceptor: " + this.f5591c).toString());
        }
        if (this.f5592d == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (!(!r0.contains(null))) {
            throw new IllegalStateException(("Null network interceptor: " + this.f5592d).toString());
        }
        List list = this.f5606r;
        if ((list instanceof Collection) && list.isEmpty()) {
            z3 = true;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C4508k) it.next()).m5889f()) {
                    z3 = false;
                    break;
                }
            }
            z3 = true;
        }
        if (!z3) {
            if (this.f5604p == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            if (this.f5610v == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            }
            if (this.f5605q == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
            return;
        }
        if (!(this.f5604p == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f5610v == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f5605q == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!Intrinsics.areEqual(this.f5609u, CertificatePinner.f5026c)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: F */
    public final int m6072F() {
        return this.f5614z;
    }

    @Override // p117r2.InterfaceC4502e.a
    /* renamed from: a */
    public InterfaceC4502e mo5870a(C4522y request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new C4645e(this, request, false);
    }

    public Object clone() {
        return super.clone();
    }

    /* renamed from: e */
    public final InterfaceC4497b m6073e() {
        return this.f5595g;
    }

    /* renamed from: f */
    public final AbstractC4499c m6074f() {
        return null;
    }

    /* renamed from: g */
    public final int m6075g() {
        return this.f5611w;
    }

    /* renamed from: h */
    public final CertificatePinner m6076h() {
        return this.f5609u;
    }

    /* renamed from: i */
    public final int m6077i() {
        return this.f5612x;
    }

    /* renamed from: j */
    public final C4507j m6078j() {
        return this.f5590b;
    }

    /* renamed from: k */
    public final List m6079k() {
        return this.f5606r;
    }

    /* renamed from: l */
    public final InterfaceC4510m m6080l() {
        return this.f5598j;
    }

    /* renamed from: m */
    public final C4512o m6081m() {
        return this.f5589a;
    }

    /* renamed from: n */
    public final InterfaceC4513p m6082n() {
        return this.f5599k;
    }

    /* renamed from: o */
    public final AbstractC4514q.c m6083o() {
        return this.f5593e;
    }

    /* renamed from: p */
    public final boolean m6084p() {
        return this.f5596h;
    }

    /* renamed from: q */
    public final boolean m6085q() {
        return this.f5597i;
    }

    /* renamed from: r */
    public final C4648h m6086r() {
        return this.f5588C;
    }

    /* renamed from: s */
    public final HostnameVerifier m6087s() {
        return this.f5608t;
    }

    /* renamed from: t */
    public final List m6088t() {
        return this.f5591c;
    }

    /* renamed from: u */
    public final List m6089u() {
        return this.f5592d;
    }

    /* renamed from: v */
    public final int m6090v() {
        return this.f5586A;
    }

    /* renamed from: w */
    public final List m6091w() {
        return this.f5607s;
    }

    /* renamed from: x */
    public final Proxy m6092x() {
        return this.f5600l;
    }

    /* renamed from: y */
    public final InterfaceC4497b m6093y() {
        return this.f5602n;
    }

    /* renamed from: z */
    public final ProxySelector m6094z() {
        return this.f5601m;
    }

    public C4521x() {
        this(new a());
    }
}
