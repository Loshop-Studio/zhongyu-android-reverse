package okhttp3;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import com.zykj.mistake.feature.notebook.detail.C4916z4;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import p139p7.AbstractC6396c;

/* renamed from: okhttp3.a */
/* loaded from: classes4.dex */
public final class C6284a {

    /* renamed from: a */
    public final C6286b f10042a;

    /* renamed from: b */
    public final SocketFactory f10043b;

    /* renamed from: c */
    public final SSLSocketFactory f10044c;

    /* renamed from: d */
    public final HostnameVerifier f10045d;

    /* renamed from: e */
    public final C6298h f10046e;

    /* renamed from: f */
    public final C6286b f10047f;

    /* renamed from: g */
    public final Proxy f10048g;

    /* renamed from: h */
    public final ProxySelector f10049h;

    /* renamed from: i */
    public final C6330r f10050i;

    /* renamed from: j */
    public final List f10051j;

    /* renamed from: k */
    public final List f10052k;

    public C6284a(String uriHost, int i, C6286b dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C6298h c6298h, C6286b proxyAuthenticator, Proxy proxy, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        AbstractC5830k.m5330g(uriHost, "uriHost");
        AbstractC5830k.m5330g(dns, "dns");
        AbstractC5830k.m5330g(socketFactory, "socketFactory");
        AbstractC5830k.m5330g(proxyAuthenticator, "proxyAuthenticator");
        AbstractC5830k.m5330g(protocols, "protocols");
        AbstractC5830k.m5330g(connectionSpecs, "connectionSpecs");
        AbstractC5830k.m5330g(proxySelector, "proxySelector");
        this.f10042a = dns;
        this.f10043b = socketFactory;
        this.f10044c = sSLSocketFactory;
        this.f10045d = hostnameVerifier;
        this.f10046e = c6298h;
        this.f10047f = proxyAuthenticator;
        this.f10048g = proxy;
        this.f10049h = proxySelector;
        C4916z4 c4916z4 = new C4916z4();
        String str = sSLSocketFactory != null ? "https" : "http";
        if (str.equalsIgnoreCase("http")) {
            c4916z4.f7436e = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            c4916z4.f7436e = "https";
        }
        String strM5259M = AbstractC5806u.m5259M(C6286b.m5880e(uriHost, 0, 0, 7));
        if (strM5259M == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(uriHost));
        }
        c4916z4.f7439h = strM5259M;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(AbstractC0037f.m81f(i, "unexpected port: ").toString());
        }
        c4916z4.f7433b = i;
        this.f10050i = c4916z4.m4285a();
        this.f10051j = AbstractC6396c.m6062v(protocols);
        this.f10052k = AbstractC6396c.m6062v(connectionSpecs);
    }

    /* renamed from: a */
    public final boolean m5875a(C6284a that) {
        AbstractC5830k.m5330g(that, "that");
        return AbstractC5830k.m5325b(this.f10042a, that.f10042a) && AbstractC5830k.m5325b(this.f10047f, that.f10047f) && AbstractC5830k.m5325b(this.f10051j, that.f10051j) && AbstractC5830k.m5325b(this.f10052k, that.f10052k) && AbstractC5830k.m5325b(this.f10049h, that.f10049h) && AbstractC5830k.m5325b(this.f10048g, that.f10048g) && AbstractC5830k.m5325b(this.f10044c, that.f10044c) && AbstractC5830k.m5325b(this.f10045d, that.f10045d) && AbstractC5830k.m5325b(this.f10046e, that.f10046e) && this.f10050i.f10269e == that.f10050i.f10269e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6284a)) {
            return false;
        }
        C6284a c6284a = (C6284a) obj;
        return AbstractC5830k.m5325b(this.f10050i, c6284a.f10050i) && m5875a(c6284a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f10046e) + ((Objects.hashCode(this.f10045d) + ((Objects.hashCode(this.f10044c) + ((Objects.hashCode(this.f10048g) + ((this.f10049h.hashCode() + AbstractC0584a.m907h(this.f10052k, AbstractC0584a.m907h(this.f10051j, (this.f10047f.hashCode() + ((this.f10042a.hashCode() + AbstractC0584a.m903d(527, 31, this.f10050i.f10273i)) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        C6330r c6330r = this.f10050i;
        sb.append(c6330r.f10268d);
        sb.append(':');
        sb.append(c6330r.f10269e);
        sb.append(", ");
        Proxy proxy = this.f10048g;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.f10049h;
        }
        return AbstractC0584a.m911l('}', str, sb);
    }
}
