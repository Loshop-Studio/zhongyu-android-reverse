package p136i9;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC9133u;
import p136i9.C8925w;
import p147j9.AbstractC9041k;

/* renamed from: i9.a */
/* loaded from: classes5.dex */
public final class C8896a {

    /* renamed from: a */
    public final InterfaceC8919q f16557a;

    /* renamed from: b */
    public final SocketFactory f16558b;

    /* renamed from: c */
    public final SSLSocketFactory f16559c;

    /* renamed from: d */
    public final HostnameVerifier f16560d;

    /* renamed from: e */
    public final C8910h f16561e;

    /* renamed from: f */
    public final InterfaceC8898b f16562f;

    /* renamed from: g */
    public final Proxy f16563g;

    /* renamed from: h */
    public final ProxySelector f16564h;

    /* renamed from: i */
    public final C8925w f16565i;

    /* renamed from: j */
    public final List f16566j;

    /* renamed from: k */
    public final List f16567k;

    public C8896a(String uriHost, int i10, InterfaceC8919q dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C8910h c8910h, InterfaceC8898b proxyAuthenticator, Proxy proxy, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        AbstractC9133u.m16133g(uriHost, "uriHost");
        AbstractC9133u.m16133g(dns, "dns");
        AbstractC9133u.m16133g(socketFactory, "socketFactory");
        AbstractC9133u.m16133g(proxyAuthenticator, "proxyAuthenticator");
        AbstractC9133u.m16133g(protocols, "protocols");
        AbstractC9133u.m16133g(connectionSpecs, "connectionSpecs");
        AbstractC9133u.m16133g(proxySelector, "proxySelector");
        this.f16557a = dns;
        this.f16558b = socketFactory;
        this.f16559c = sSLSocketFactory;
        this.f16560d = hostnameVerifier;
        this.f16561e = c8910h;
        this.f16562f = proxyAuthenticator;
        this.f16563g = proxy;
        this.f16564h = proxySelector;
        this.f16565i = new C8925w.a().m15320t(sSLSocketFactory != null ? "https" : "http").m15308h(uriHost).m15315o(i10).m15304d();
        this.f16566j = AbstractC9041k.m15792v(protocols);
        this.f16567k = AbstractC9041k.m15792v(connectionSpecs);
    }

    /* renamed from: a */
    public final C8910h m14939a() {
        return this.f16561e;
    }

    /* renamed from: b */
    public final List m14940b() {
        return this.f16567k;
    }

    /* renamed from: c */
    public final InterfaceC8919q m14941c() {
        return this.f16557a;
    }

    /* renamed from: d */
    public final boolean m14942d(C8896a that) {
        AbstractC9133u.m16133g(that, "that");
        return AbstractC9133u.m16128b(this.f16557a, that.f16557a) && AbstractC9133u.m16128b(this.f16562f, that.f16562f) && AbstractC9133u.m16128b(this.f16566j, that.f16566j) && AbstractC9133u.m16128b(this.f16567k, that.f16567k) && AbstractC9133u.m16128b(this.f16564h, that.f16564h) && AbstractC9133u.m16128b(this.f16563g, that.f16563g) && AbstractC9133u.m16128b(this.f16559c, that.f16559c) && AbstractC9133u.m16128b(this.f16560d, that.f16560d) && AbstractC9133u.m16128b(this.f16561e, that.f16561e) && this.f16565i.m15289m() == that.f16565i.m15289m();
    }

    /* renamed from: e */
    public final HostnameVerifier m14943e() {
        return this.f16560d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8896a)) {
            return false;
        }
        C8896a c8896a = (C8896a) obj;
        return AbstractC9133u.m16128b(this.f16565i, c8896a.f16565i) && m14942d(c8896a);
    }

    /* renamed from: f */
    public final List m14944f() {
        return this.f16566j;
    }

    /* renamed from: g */
    public final Proxy m14945g() {
        return this.f16563g;
    }

    /* renamed from: h */
    public final InterfaceC8898b m14946h() {
        return this.f16562f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f16565i.hashCode()) * 31) + this.f16557a.hashCode()) * 31) + this.f16562f.hashCode()) * 31) + this.f16566j.hashCode()) * 31) + this.f16567k.hashCode()) * 31) + this.f16564h.hashCode()) * 31) + Objects.hashCode(this.f16563g)) * 31) + Objects.hashCode(this.f16559c)) * 31) + Objects.hashCode(this.f16560d)) * 31) + Objects.hashCode(this.f16561e);
    }

    /* renamed from: i */
    public final ProxySelector m14947i() {
        return this.f16564h;
    }

    /* renamed from: j */
    public final SocketFactory m14948j() {
        return this.f16558b;
    }

    /* renamed from: k */
    public final SSLSocketFactory m14949k() {
        return this.f16559c;
    }

    /* renamed from: l */
    public final C8925w m14950l() {
        return this.f16565i;
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f16565i.m15284h());
        sb2.append(':');
        sb2.append(this.f16565i.m15289m());
        sb2.append(", ");
        if (this.f16563g != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.f16563g;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.f16564h;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append('}');
        return sb2.toString();
    }
}
