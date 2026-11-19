package je;

import anet.channel.util.HttpConstant;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import je.C9738r;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9979u;
import okhttp3.CertificatePinner;

/* renamed from: je.a */
/* loaded from: classes6.dex */
public final class C9720a {

    /* renamed from: a */
    public final InterfaceC9734n f22664a;

    /* renamed from: b */
    public final SocketFactory f22665b;

    /* renamed from: c */
    public final SSLSocketFactory f22666c;

    /* renamed from: d */
    public final HostnameVerifier f22667d;

    /* renamed from: e */
    public final CertificatePinner f22668e;

    /* renamed from: f */
    public final InterfaceC9722b f22669f;

    /* renamed from: g */
    public final Proxy f22670g;

    /* renamed from: h */
    public final ProxySelector f22671h;

    /* renamed from: i */
    public final C9738r f22672i;

    /* renamed from: j */
    public final List f22673j;

    /* renamed from: k */
    public final List f22674k;

    public C9720a(String uriHost, int i10, InterfaceC9734n dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, InterfaceC9722b proxyAuthenticator, Proxy proxy, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        AbstractC9979u.m20294g(uriHost, "uriHost");
        AbstractC9979u.m20294g(dns, "dns");
        AbstractC9979u.m20294g(socketFactory, "socketFactory");
        AbstractC9979u.m20294g(proxyAuthenticator, "proxyAuthenticator");
        AbstractC9979u.m20294g(protocols, "protocols");
        AbstractC9979u.m20294g(connectionSpecs, "connectionSpecs");
        AbstractC9979u.m20294g(proxySelector, "proxySelector");
        this.f22664a = dns;
        this.f22665b = socketFactory;
        this.f22666c = sSLSocketFactory;
        this.f22667d = hostnameVerifier;
        this.f22668e = certificatePinner;
        this.f22669f = proxyAuthenticator;
        this.f22670g = proxy;
        this.f22671h = proxySelector;
        this.f22672i = new C9738r.a().m19448r(sSLSocketFactory != null ? "https" : HttpConstant.HTTP).m19438h(uriHost).m19444n(i10).m19434d();
        this.f22673j = AbstractC9920d.m20011S(protocols);
        this.f22674k = AbstractC9920d.m20011S(connectionSpecs);
    }

    /* renamed from: a */
    public final CertificatePinner m19285a() {
        return this.f22668e;
    }

    /* renamed from: b */
    public final List m19286b() {
        return this.f22674k;
    }

    /* renamed from: c */
    public final InterfaceC9734n m19287c() {
        return this.f22664a;
    }

    /* renamed from: d */
    public final boolean m19288d(C9720a that) {
        AbstractC9979u.m20294g(that, "that");
        return AbstractC9979u.m20289b(this.f22664a, that.f22664a) && AbstractC9979u.m20289b(this.f22669f, that.f22669f) && AbstractC9979u.m20289b(this.f22673j, that.f22673j) && AbstractC9979u.m20289b(this.f22674k, that.f22674k) && AbstractC9979u.m20289b(this.f22671h, that.f22671h) && AbstractC9979u.m20289b(this.f22670g, that.f22670g) && AbstractC9979u.m20289b(this.f22666c, that.f22666c) && AbstractC9979u.m20289b(this.f22667d, that.f22667d) && AbstractC9979u.m20289b(this.f22668e, that.f22668e) && this.f22672i.m19424n() == that.f22672i.m19424n();
    }

    /* renamed from: e */
    public final HostnameVerifier m19289e() {
        return this.f22667d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9720a)) {
            return false;
        }
        C9720a c9720a = (C9720a) obj;
        return AbstractC9979u.m20289b(this.f22672i, c9720a.f22672i) && m19288d(c9720a);
    }

    /* renamed from: f */
    public final List m19290f() {
        return this.f22673j;
    }

    /* renamed from: g */
    public final Proxy m19291g() {
        return this.f22670g;
    }

    /* renamed from: h */
    public final InterfaceC9722b m19292h() {
        return this.f22669f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f22672i.hashCode()) * 31) + this.f22664a.hashCode()) * 31) + this.f22669f.hashCode()) * 31) + this.f22673j.hashCode()) * 31) + this.f22674k.hashCode()) * 31) + this.f22671h.hashCode()) * 31) + Objects.hashCode(this.f22670g)) * 31) + Objects.hashCode(this.f22666c)) * 31) + Objects.hashCode(this.f22667d)) * 31) + Objects.hashCode(this.f22668e);
    }

    /* renamed from: i */
    public final ProxySelector m19293i() {
        return this.f22671h;
    }

    /* renamed from: j */
    public final SocketFactory m19294j() {
        return this.f22665b;
    }

    /* renamed from: k */
    public final SSLSocketFactory m19295k() {
        return this.f22666c;
    }

    /* renamed from: l */
    public final C9738r m19296l() {
        return this.f22672i;
    }

    public String toString() {
        StringBuilder sb2;
        Object obj;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Address{");
        sb3.append(this.f22672i.m19419i());
        sb3.append(':');
        sb3.append(this.f22672i.m19424n());
        sb3.append(", ");
        if (this.f22670g != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.f22670g;
        } else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.f22671h;
        }
        sb2.append(obj);
        sb3.append(sb2.toString());
        sb3.append('}');
        return sb3.toString();
    }
}
