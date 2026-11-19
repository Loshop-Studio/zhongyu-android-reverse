package p058f5;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import p058f5.C6384w;
import p065g5.AbstractC6427k;

/* renamed from: f5.a */
/* loaded from: classes4.dex */
public final class C6355a {

    /* renamed from: a */
    public final InterfaceC6378q f7725a;

    /* renamed from: b */
    public final SocketFactory f7726b;

    /* renamed from: c */
    public final SSLSocketFactory f7727c;

    /* renamed from: d */
    public final HostnameVerifier f7728d;

    /* renamed from: e */
    public final C6369h f7729e;

    /* renamed from: f */
    public final InterfaceC6357b f7730f;

    /* renamed from: g */
    public final Proxy f7731g;

    /* renamed from: h */
    public final ProxySelector f7732h;

    /* renamed from: i */
    public final C6384w f7733i;

    /* renamed from: j */
    public final List f7734j;

    /* renamed from: k */
    public final List f7735k;

    public C6355a(String uriHost, int i6, InterfaceC6378q dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C6369h c6369h, InterfaceC6357b proxyAuthenticator, Proxy proxy, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f7725a = dns;
        this.f7726b = socketFactory;
        this.f7727c = sSLSocketFactory;
        this.f7728d = hostnameVerifier;
        this.f7729e = c6369h;
        this.f7730f = proxyAuthenticator;
        this.f7731g = proxy;
        this.f7732h = proxySelector;
        this.f7733i = new C6384w.a().m6859t(sSLSocketFactory != null ? "https" : "http").m6847h(uriHost).m6854o(i6).m6843d();
        this.f7734j = AbstractC6427k.m7034v(protocols);
        this.f7735k = AbstractC6427k.m7034v(connectionSpecs);
    }

    /* renamed from: a */
    public final C6369h m6475a() {
        return this.f7729e;
    }

    /* renamed from: b */
    public final List m6476b() {
        return this.f7735k;
    }

    /* renamed from: c */
    public final InterfaceC6378q m6477c() {
        return this.f7725a;
    }

    /* renamed from: d */
    public final boolean m6478d(C6355a that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.areEqual(this.f7725a, that.f7725a) && Intrinsics.areEqual(this.f7730f, that.f7730f) && Intrinsics.areEqual(this.f7734j, that.f7734j) && Intrinsics.areEqual(this.f7735k, that.f7735k) && Intrinsics.areEqual(this.f7732h, that.f7732h) && Intrinsics.areEqual(this.f7731g, that.f7731g) && Intrinsics.areEqual(this.f7727c, that.f7727c) && Intrinsics.areEqual(this.f7728d, that.f7728d) && Intrinsics.areEqual(this.f7729e, that.f7729e) && this.f7733i.m6828m() == that.f7733i.m6828m();
    }

    /* renamed from: e */
    public final HostnameVerifier m6479e() {
        return this.f7728d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6355a)) {
            return false;
        }
        C6355a c6355a = (C6355a) obj;
        return Intrinsics.areEqual(this.f7733i, c6355a.f7733i) && m6478d(c6355a);
    }

    /* renamed from: f */
    public final List m6480f() {
        return this.f7734j;
    }

    /* renamed from: g */
    public final Proxy m6481g() {
        return this.f7731g;
    }

    /* renamed from: h */
    public final InterfaceC6357b m6482h() {
        return this.f7730f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f7733i.hashCode()) * 31) + this.f7725a.hashCode()) * 31) + this.f7730f.hashCode()) * 31) + this.f7734j.hashCode()) * 31) + this.f7735k.hashCode()) * 31) + this.f7732h.hashCode()) * 31) + Objects.hashCode(this.f7731g)) * 31) + Objects.hashCode(this.f7727c)) * 31) + Objects.hashCode(this.f7728d)) * 31) + Objects.hashCode(this.f7729e);
    }

    /* renamed from: i */
    public final ProxySelector m6483i() {
        return this.f7732h;
    }

    /* renamed from: j */
    public final SocketFactory m6484j() {
        return this.f7726b;
    }

    /* renamed from: k */
    public final SSLSocketFactory m6485k() {
        return this.f7727c;
    }

    /* renamed from: l */
    public final C6384w m6486l() {
        return this.f7733i;
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f7733i.m6823h());
        sb2.append(':');
        sb2.append(this.f7733i.m6828m());
        sb2.append(", ");
        if (this.f7731g != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.f7731g;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.f7732h;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append('}');
        return sb2.toString();
    }
}
