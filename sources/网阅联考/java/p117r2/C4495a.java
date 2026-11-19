package p117r2;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CertificatePinner;
import p117r2.C4517t;
import p121s2.AbstractC4550b;

/* renamed from: r2.a */
/* loaded from: classes2.dex */
public final class C4495a {

    /* renamed from: a */
    public final C4517t f5279a;

    /* renamed from: b */
    public final List f5280b;

    /* renamed from: c */
    public final List f5281c;

    /* renamed from: d */
    public final InterfaceC4513p f5282d;

    /* renamed from: e */
    public final SocketFactory f5283e;

    /* renamed from: f */
    public final SSLSocketFactory f5284f;

    /* renamed from: g */
    public final HostnameVerifier f5285g;

    /* renamed from: h */
    public final CertificatePinner f5286h;

    /* renamed from: i */
    public final InterfaceC4497b f5287i;

    /* renamed from: j */
    public final Proxy f5288j;

    /* renamed from: k */
    public final ProxySelector f5289k;

    public C4495a(String uriHost, int i4, InterfaceC4513p dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, InterfaceC4497b proxyAuthenticator, Proxy proxy, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f5282d = dns;
        this.f5283e = socketFactory;
        this.f5284f = sSLSocketFactory;
        this.f5285g = hostnameVerifier;
        this.f5286h = certificatePinner;
        this.f5287i = proxyAuthenticator;
        this.f5288j = proxy;
        this.f5289k = proxySelector;
        this.f5279a = new C4517t.a().m6016r(sSLSocketFactory != null ? "https" : "http").m6006h(uriHost).m6012n(i4).m6002d();
        this.f5280b = AbstractC4550b.m6211N(protocols);
        this.f5281c = AbstractC4550b.m6211N(connectionSpecs);
    }

    /* renamed from: a */
    public final CertificatePinner m5787a() {
        return this.f5286h;
    }

    /* renamed from: b */
    public final List m5788b() {
        return this.f5281c;
    }

    /* renamed from: c */
    public final InterfaceC4513p m5789c() {
        return this.f5282d;
    }

    /* renamed from: d */
    public final boolean m5790d(C4495a that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.areEqual(this.f5282d, that.f5282d) && Intrinsics.areEqual(this.f5287i, that.f5287i) && Intrinsics.areEqual(this.f5280b, that.f5280b) && Intrinsics.areEqual(this.f5281c, that.f5281c) && Intrinsics.areEqual(this.f5289k, that.f5289k) && Intrinsics.areEqual(this.f5288j, that.f5288j) && Intrinsics.areEqual(this.f5284f, that.f5284f) && Intrinsics.areEqual(this.f5285g, that.f5285g) && Intrinsics.areEqual(this.f5286h, that.f5286h) && this.f5279a.m5992n() == that.f5279a.m5992n();
    }

    /* renamed from: e */
    public final HostnameVerifier m5791e() {
        return this.f5285g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4495a) {
            C4495a c4495a = (C4495a) obj;
            if (Intrinsics.areEqual(this.f5279a, c4495a.f5279a) && m5790d(c4495a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final List m5792f() {
        return this.f5280b;
    }

    /* renamed from: g */
    public final Proxy m5793g() {
        return this.f5288j;
    }

    /* renamed from: h */
    public final InterfaceC4497b m5794h() {
        return this.f5287i;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f5279a.hashCode()) * 31) + this.f5282d.hashCode()) * 31) + this.f5287i.hashCode()) * 31) + this.f5280b.hashCode()) * 31) + this.f5281c.hashCode()) * 31) + this.f5289k.hashCode()) * 31) + Objects.hashCode(this.f5288j)) * 31) + Objects.hashCode(this.f5284f)) * 31) + Objects.hashCode(this.f5285g)) * 31) + Objects.hashCode(this.f5286h);
    }

    /* renamed from: i */
    public final ProxySelector m5795i() {
        return this.f5289k;
    }

    /* renamed from: j */
    public final SocketFactory m5796j() {
        return this.f5283e;
    }

    /* renamed from: k */
    public final SSLSocketFactory m5797k() {
        return this.f5284f;
    }

    /* renamed from: l */
    public final C4517t m5798l() {
        return this.f5279a;
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f5279a.m5987i());
        sb2.append(':');
        sb2.append(this.f5279a.m5992n());
        sb2.append(", ");
        if (this.f5288j != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.f5288j;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.f5289k;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append("}");
        return sb2.toString();
    }
}
