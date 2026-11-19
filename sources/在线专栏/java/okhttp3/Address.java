package okhttp3;

import anet.channel.util.HttpConstant;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.C2769l;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class Address {

    @Nullable
    private final CertificatePinner certificatePinner;

    @NotNull
    private final List<ConnectionSpec> connectionSpecs;

    @NotNull
    private final Dns dns;

    @Nullable
    private final HostnameVerifier hostnameVerifier;

    @NotNull
    private final List<Protocol> protocols;

    @Nullable
    private final Proxy proxy;

    @NotNull
    private final Authenticator proxyAuthenticator;

    @NotNull
    private final ProxySelector proxySelector;

    @NotNull
    private final SocketFactory socketFactory;

    @Nullable
    private final SSLSocketFactory sslSocketFactory;

    @NotNull
    private final HttpUrl url;

    public Address(@NotNull String uriHost, int i4, @NotNull Dns dns, @NotNull SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable CertificatePinner certificatePinner, @NotNull Authenticator proxyAuthenticator, @Nullable Proxy proxy, @NotNull List<? extends Protocol> protocols, @NotNull List<ConnectionSpec> connectionSpecs, @NotNull ProxySelector proxySelector) {
        C2769l.m9241e(uriHost, "uriHost");
        C2769l.m9241e(dns, "dns");
        C2769l.m9241e(socketFactory, "socketFactory");
        C2769l.m9241e(proxyAuthenticator, "proxyAuthenticator");
        C2769l.m9241e(protocols, "protocols");
        C2769l.m9241e(connectionSpecs, "connectionSpecs");
        C2769l.m9241e(proxySelector, "proxySelector");
        this.dns = dns;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = certificatePinner;
        this.proxyAuthenticator = proxyAuthenticator;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new HttpUrl.Builder().scheme(sSLSocketFactory != null ? HttpConstant.HTTPS : HttpConstant.HTTP).host(uriHost).port(i4).build();
        this.protocols = Util.toImmutableList(protocols);
        this.connectionSpecs = Util.toImmutableList(connectionSpecs);
    }

    @Nullable
    /* renamed from: -deprecated_certificatePinner, reason: not valid java name */
    public final CertificatePinner m10739deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    @NotNull
    /* renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<ConnectionSpec> m10740deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @NotNull
    /* renamed from: -deprecated_dns, reason: not valid java name */
    public final Dns m10741deprecated_dns() {
        return this.dns;
    }

    @Nullable
    /* renamed from: -deprecated_hostnameVerifier, reason: not valid java name */
    public final HostnameVerifier m10742deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @NotNull
    /* renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<Protocol> m10743deprecated_protocols() {
        return this.protocols;
    }

    @Nullable
    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m10744deprecated_proxy() {
        return this.proxy;
    }

    @NotNull
    /* renamed from: -deprecated_proxyAuthenticator, reason: not valid java name */
    public final Authenticator m10745deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @NotNull
    /* renamed from: -deprecated_proxySelector, reason: not valid java name */
    public final ProxySelector m10746deprecated_proxySelector() {
        return this.proxySelector;
    }

    @NotNull
    /* renamed from: -deprecated_socketFactory, reason: not valid java name */
    public final SocketFactory m10747deprecated_socketFactory() {
        return this.socketFactory;
    }

    @Nullable
    /* renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m10748deprecated_sslSocketFactory() {
        return this.sslSocketFactory;
    }

    @NotNull
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final HttpUrl m10749deprecated_url() {
        return this.url;
    }

    @Nullable
    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    @NotNull
    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    @NotNull
    public final Dns dns() {
        return this.dns;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            if (C2769l.m9237a(this.url, address.url) && equalsNonHost$okhttp(address)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equalsNonHost$okhttp(@NotNull Address that) {
        C2769l.m9241e(that, "that");
        return C2769l.m9237a(this.dns, that.dns) && C2769l.m9237a(this.proxyAuthenticator, that.proxyAuthenticator) && C2769l.m9237a(this.protocols, that.protocols) && C2769l.m9237a(this.connectionSpecs, that.connectionSpecs) && C2769l.m9237a(this.proxySelector, that.proxySelector) && C2769l.m9237a(this.proxy, that.proxy) && C2769l.m9237a(this.sslSocketFactory, that.sslSocketFactory) && C2769l.m9237a(this.hostnameVerifier, that.hostnameVerifier) && C2769l.m9237a(this.certificatePinner, that.certificatePinner) && this.url.port() == that.url.port();
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.url.hashCode()) * 31) + this.dns.hashCode()) * 31) + this.proxyAuthenticator.hashCode()) * 31) + this.protocols.hashCode()) * 31) + this.connectionSpecs.hashCode()) * 31) + this.proxySelector.hashCode()) * 31) + Objects.hashCode(this.proxy)) * 31) + Objects.hashCode(this.sslSocketFactory)) * 31) + Objects.hashCode(this.hostnameVerifier)) * 31) + Objects.hashCode(this.certificatePinner);
    }

    @Nullable
    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @NotNull
    public final List<Protocol> protocols() {
        return this.protocols;
    }

    @Nullable
    public final Proxy proxy() {
        return this.proxy;
    }

    @NotNull
    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @NotNull
    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    @NotNull
    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    @Nullable
    public final SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.url.host());
        sb2.append(':');
        sb2.append(this.url.port());
        sb2.append(", ");
        if (this.proxy != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.proxy;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.proxySelector;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append("}");
        return sb2.toString();
    }

    @NotNull
    public final HttpUrl url() {
        return this.url;
    }
}
