package p011a9;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CertificatePinner;
import p011a9.C0055r;
import p028b9.AbstractC5070d;

/* renamed from: a9.a */
/* loaded from: classes5.dex */
public final class C0037a {

    /* renamed from: a */
    public final InterfaceC0051n f83a;

    /* renamed from: b */
    public final SocketFactory f84b;

    /* renamed from: c */
    public final SSLSocketFactory f85c;

    /* renamed from: d */
    public final HostnameVerifier f86d;

    /* renamed from: e */
    public final CertificatePinner f87e;

    /* renamed from: f */
    public final InterfaceC0039b f88f;

    /* renamed from: g */
    public final Proxy f89g;

    /* renamed from: h */
    public final ProxySelector f90h;

    /* renamed from: i */
    public final C0055r f91i;

    /* renamed from: j */
    public final List f92j;

    /* renamed from: k */
    public final List f93k;

    public C0037a(String uriHost, int i10, InterfaceC0051n dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, InterfaceC0039b proxyAuthenticator, Proxy proxy, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f83a = dns;
        this.f84b = socketFactory;
        this.f85c = sSLSocketFactory;
        this.f86d = hostnameVerifier;
        this.f87e = certificatePinner;
        this.f88f = proxyAuthenticator;
        this.f89g = proxy;
        this.f90h = proxySelector;
        this.f91i = new C0055r.a().m239r(sSLSocketFactory != null ? "https" : "http").m229h(uriHost).m235n(i10).m225d();
        this.f92j = AbstractC5070d.m2628S(protocols);
        this.f93k = AbstractC5070d.m2628S(connectionSpecs);
    }

    /* renamed from: a */
    public final CertificatePinner m74a() {
        return this.f87e;
    }

    /* renamed from: b */
    public final List m75b() {
        return this.f93k;
    }

    /* renamed from: c */
    public final InterfaceC0051n m76c() {
        return this.f83a;
    }

    /* renamed from: d */
    public final boolean m77d(C0037a that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.areEqual(this.f83a, that.f83a) && Intrinsics.areEqual(this.f88f, that.f88f) && Intrinsics.areEqual(this.f92j, that.f92j) && Intrinsics.areEqual(this.f93k, that.f93k) && Intrinsics.areEqual(this.f90h, that.f90h) && Intrinsics.areEqual(this.f89g, that.f89g) && Intrinsics.areEqual(this.f85c, that.f85c) && Intrinsics.areEqual(this.f86d, that.f86d) && Intrinsics.areEqual(this.f87e, that.f87e) && this.f91i.m215n() == that.f91i.m215n();
    }

    /* renamed from: e */
    public final HostnameVerifier m78e() {
        return this.f86d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0037a)) {
            return false;
        }
        C0037a c0037a = (C0037a) obj;
        return Intrinsics.areEqual(this.f91i, c0037a.f91i) && m77d(c0037a);
    }

    /* renamed from: f */
    public final List m79f() {
        return this.f92j;
    }

    /* renamed from: g */
    public final Proxy m80g() {
        return this.f89g;
    }

    /* renamed from: h */
    public final InterfaceC0039b m81h() {
        return this.f88f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f91i.hashCode()) * 31) + this.f83a.hashCode()) * 31) + this.f88f.hashCode()) * 31) + this.f92j.hashCode()) * 31) + this.f93k.hashCode()) * 31) + this.f90h.hashCode()) * 31) + Objects.hashCode(this.f89g)) * 31) + Objects.hashCode(this.f85c)) * 31) + Objects.hashCode(this.f86d)) * 31) + Objects.hashCode(this.f87e);
    }

    /* renamed from: i */
    public final ProxySelector m82i() {
        return this.f90h;
    }

    /* renamed from: j */
    public final SocketFactory m83j() {
        return this.f84b;
    }

    /* renamed from: k */
    public final SSLSocketFactory m84k() {
        return this.f85c;
    }

    /* renamed from: l */
    public final C0055r m85l() {
        return this.f91i;
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f91i.m210i());
        sb2.append(':');
        sb2.append(this.f91i.m215n());
        sb2.append(", ");
        if (this.f89g != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.f89g;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.f90h;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append('}');
        return sb2.toString();
    }
}
