package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.internal.connection.C6310i;
import p024c0.C3210g;
import p129o2.C6268a;
import p139p7.AbstractC6396c;
import p139p7.C6394a;
import p185v7.C6685n;
import p201x7.C6757a;
import p204y1.AbstractC6768a;

/* renamed from: okhttp3.z */
/* loaded from: classes4.dex */
public final class C6338z implements Cloneable, InterfaceC6290d {

    /* renamed from: B */
    public static final List f10321B = AbstractC6396c.m6050j(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* renamed from: C */
    public static final List f10322C = AbstractC6396c.m6050j(C6320l.f10234e, C6320l.f10235f);

    /* renamed from: A */
    public final C6268a f10323A;

    /* renamed from: a */
    public final C3210g f10324a;

    /* renamed from: b */
    public final C6268a f10325b;

    /* renamed from: c */
    public final List f10326c;

    /* renamed from: d */
    public final List f10327d;

    /* renamed from: e */
    public final C6394a f10328e;

    /* renamed from: f */
    public final boolean f10329f;

    /* renamed from: g */
    public final C6286b f10330g;

    /* renamed from: h */
    public final boolean f10331h;

    /* renamed from: i */
    public final boolean f10332i;

    /* renamed from: j */
    public final C6286b f10333j;

    /* renamed from: k */
    public final C6286b f10334k;

    /* renamed from: l */
    public final Proxy f10335l;

    /* renamed from: m */
    public final ProxySelector f10336m;

    /* renamed from: n */
    public final C6286b f10337n;

    /* renamed from: o */
    public final SocketFactory f10338o;

    /* renamed from: p */
    public final SSLSocketFactory f10339p;

    /* renamed from: q */
    public final X509TrustManager f10340q;

    /* renamed from: r */
    public final List f10341r;

    /* renamed from: s */
    public final List f10342s;

    /* renamed from: t */
    public final HostnameVerifier f10343t;

    /* renamed from: u */
    public final C6298h f10344u;

    /* renamed from: v */
    public final AbstractC6768a f10345v;

    /* renamed from: w */
    public final int f10346w;

    /* renamed from: x */
    public final int f10347x;

    /* renamed from: y */
    public final int f10348y;

    /* renamed from: z */
    public final long f10349z;

    public C6338z(C6337y c6337y) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
        this.f10324a = c6337y.f10295a;
        this.f10325b = c6337y.f10296b;
        this.f10326c = AbstractC6396c.m6062v(c6337y.f10297c);
        this.f10327d = AbstractC6396c.m6062v(c6337y.f10298d);
        this.f10328e = c6337y.f10299e;
        this.f10329f = c6337y.f10300f;
        this.f10330g = c6337y.f10301g;
        this.f10331h = c6337y.f10302h;
        this.f10332i = c6337y.f10303i;
        this.f10333j = c6337y.f10304j;
        this.f10334k = c6337y.f10305k;
        Proxy proxy = c6337y.f10306l;
        this.f10335l = proxy;
        if (proxy != null) {
            proxySelector = C6757a.f11428a;
        } else {
            proxySelector = c6337y.f10307m;
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = C6757a.f11428a;
            }
        }
        this.f10336m = proxySelector;
        this.f10337n = c6337y.f10308n;
        this.f10338o = c6337y.f10309o;
        List list = c6337y.f10312r;
        this.f10341r = list;
        this.f10342s = c6337y.f10313s;
        this.f10343t = c6337y.f10314t;
        this.f10346w = c6337y.f10317w;
        this.f10347x = c6337y.f10318x;
        this.f10348y = c6337y.f10319y;
        this.f10349z = c6337y.f10320z;
        C6268a c6268a = c6337y.f10294A;
        this.f10323A = c6268a == null ? new C6268a(28) : c6268a;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C6320l) it.next()).f10236a) {
                    SSLSocketFactory sSLSocketFactory = c6337y.f10310p;
                    if (sSLSocketFactory != null) {
                        this.f10339p = sSLSocketFactory;
                        AbstractC6768a abstractC6768a = c6337y.f10316v;
                        AbstractC5830k.m5327d(abstractC6768a);
                        this.f10345v = abstractC6768a;
                        X509TrustManager x509TrustManager = c6337y.f10311q;
                        AbstractC5830k.m5327d(x509TrustManager);
                        this.f10340q = x509TrustManager;
                        C6298h c6298h = c6337y.f10315u;
                        c6298h.getClass();
                        this.f10344u = AbstractC5830k.m5325b(c6298h.f10090b, abstractC6768a) ? c6298h : new C6298h(c6298h.f10089a, abstractC6768a);
                    } else {
                        C6685n c6685n = C6685n.f11276a;
                        X509TrustManager x509TrustManagerMo6357m = C6685n.f11276a.mo6357m();
                        this.f10340q = x509TrustManagerMo6357m;
                        this.f10339p = C6685n.f11276a.mo6359l(x509TrustManagerMo6357m);
                        AbstractC6768a abstractC6768aMo6330b = C6685n.f11276a.mo6330b(x509TrustManagerMo6357m);
                        this.f10345v = abstractC6768aMo6330b;
                        C6298h c6298h2 = c6337y.f10315u;
                        c6298h2.getClass();
                        this.f10344u = AbstractC5830k.m5325b(c6298h2.f10090b, abstractC6768aMo6330b) ? c6298h2 : new C6298h(c6298h2.f10089a, abstractC6768aMo6330b);
                    }
                }
            }
            this.f10339p = null;
            this.f10345v = null;
            this.f10340q = null;
            this.f10344u = C6298h.f10088c;
        } else {
            this.f10339p = null;
            this.f10345v = null;
            this.f10340q = null;
            this.f10344u = C6298h.f10088c;
        }
        X509TrustManager x509TrustManager2 = this.f10340q;
        AbstractC6768a abstractC6768a2 = this.f10345v;
        SSLSocketFactory sSLSocketFactory2 = this.f10339p;
        List list2 = this.f10327d;
        List list3 = this.f10326c;
        AbstractC5830k.m5328e(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        AbstractC5830k.m5328e(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list2).toString());
        }
        List list4 = this.f10341r;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((C6320l) it2.next()).f10236a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (abstractC6768a2 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (abstractC6768a2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!AbstractC5830k.m5325b(this.f10344u, C6298h.f10088c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* renamed from: c */
    public final C6310i m5983c(C6289c0 request) {
        AbstractC5830k.m5330g(request, "request");
        return new C6310i(this, request);
    }

    public final Object clone() {
        return super.clone();
    }

    public C6338z() {
        this(new C6337y());
    }
}
