package p172l8;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CertificatePinner;
import p172l8.C8919r;
import p182m8.AbstractC9045d;

/* renamed from: l8.a */
/* loaded from: classes5.dex */
public final class C8901a {

    /* renamed from: a */
    public final InterfaceC8915n f14711a;

    /* renamed from: b */
    public final SocketFactory f14712b;

    /* renamed from: c */
    public final SSLSocketFactory f14713c;

    /* renamed from: d */
    public final HostnameVerifier f14714d;

    /* renamed from: e */
    public final CertificatePinner f14715e;

    /* renamed from: f */
    public final InterfaceC8903b f14716f;

    /* renamed from: g */
    public final Proxy f14717g;

    /* renamed from: h */
    public final ProxySelector f14718h;

    /* renamed from: i */
    public final C8919r f14719i;

    /* renamed from: j */
    public final List f14720j;

    /* renamed from: k */
    public final List f14721k;

    public C8901a(String uriHost, int i9, InterfaceC8915n dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, InterfaceC8903b proxyAuthenticator, Proxy proxy, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f14711a = dns;
        this.f14712b = socketFactory;
        this.f14713c = sSLSocketFactory;
        this.f14714d = hostnameVerifier;
        this.f14715e = certificatePinner;
        this.f14716f = proxyAuthenticator;
        this.f14717g = proxy;
        this.f14718h = proxySelector;
        this.f14719i = new C8919r.a().m13995r(sSLSocketFactory != null ? "https" : "http").m13985h(uriHost).m13991n(i9).m13981d();
        this.f14720j = AbstractC9045d.m14477S(protocols);
        this.f14721k = AbstractC9045d.m14477S(connectionSpecs);
    }

    /* renamed from: a */
    public final CertificatePinner m13833a() {
        return this.f14715e;
    }

    /* renamed from: b */
    public final List m13834b() {
        return this.f14721k;
    }

    /* renamed from: c */
    public final InterfaceC8915n m13835c() {
        return this.f14711a;
    }

    /* renamed from: d */
    public final boolean m13836d(C8901a that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.areEqual(this.f14711a, that.f14711a) && Intrinsics.areEqual(this.f14716f, that.f14716f) && Intrinsics.areEqual(this.f14720j, that.f14720j) && Intrinsics.areEqual(this.f14721k, that.f14721k) && Intrinsics.areEqual(this.f14718h, that.f14718h) && Intrinsics.areEqual(this.f14717g, that.f14717g) && Intrinsics.areEqual(this.f14713c, that.f14713c) && Intrinsics.areEqual(this.f14714d, that.f14714d) && Intrinsics.areEqual(this.f14715e, that.f14715e) && this.f14719i.m13971n() == that.f14719i.m13971n();
    }

    /* renamed from: e */
    public final HostnameVerifier m13837e() {
        return this.f14714d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8901a)) {
            return false;
        }
        C8901a c8901a = (C8901a) obj;
        return Intrinsics.areEqual(this.f14719i, c8901a.f14719i) && m13836d(c8901a);
    }

    /* renamed from: f */
    public final List m13838f() {
        return this.f14720j;
    }

    /* renamed from: g */
    public final Proxy m13839g() {
        return this.f14717g;
    }

    /* renamed from: h */
    public final InterfaceC8903b m13840h() {
        return this.f14716f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f14719i.hashCode()) * 31) + this.f14711a.hashCode()) * 31) + this.f14716f.hashCode()) * 31) + this.f14720j.hashCode()) * 31) + this.f14721k.hashCode()) * 31) + this.f14718h.hashCode()) * 31) + Objects.hashCode(this.f14717g)) * 31) + Objects.hashCode(this.f14713c)) * 31) + Objects.hashCode(this.f14714d)) * 31) + Objects.hashCode(this.f14715e);
    }

    /* renamed from: i */
    public final ProxySelector m13841i() {
        return this.f14718h;
    }

    /* renamed from: j */
    public final SocketFactory m13842j() {
        return this.f14712b;
    }

    /* renamed from: k */
    public final SSLSocketFactory m13843k() {
        return this.f14713c;
    }

    /* renamed from: l */
    public final C8919r m13844l() {
        return this.f14719i;
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f14719i.m13966i());
        sb2.append(':');
        sb2.append(this.f14719i.m13971n());
        sb2.append(", ");
        if (this.f14717g != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.f14717g;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.f14718h;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append('}');
        return sb2.toString();
    }
}
