package p194w7;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC5830k;
import p204y1.AbstractC6768a;

/* renamed from: w7.b */
/* loaded from: classes4.dex */
public final class C6724b extends AbstractC6768a {

    /* renamed from: b */
    public final X509TrustManager f11340b;

    /* renamed from: c */
    public final X509TrustManagerExtensions f11341c;

    public C6724b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f11340b = x509TrustManager;
        this.f11341c = x509TrustManagerExtensions;
    }

    @Override // p204y1.AbstractC6768a
    /* renamed from: e */
    public final List mo6413e(String hostname, List chain) throws CertificateException, SSLPeerUnverifiedException {
        AbstractC5830k.m5330g(chain, "chain");
        AbstractC5830k.m5330g(hostname, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f11341c.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            AbstractC5830k.m5329f(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C6724b) && ((C6724b) obj).f11340b == this.f11340b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f11340b);
    }
}
