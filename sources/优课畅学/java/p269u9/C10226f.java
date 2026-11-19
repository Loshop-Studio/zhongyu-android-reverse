package p269u9;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p302x9.AbstractC10588c;

/* renamed from: u9.f */
/* loaded from: classes5.dex */
public final class C10226f extends AbstractC10588c {

    /* renamed from: d */
    public static final a f20400d = new a(null);

    /* renamed from: b */
    public final X509TrustManager f20401b;

    /* renamed from: c */
    public final X509TrustManagerExtensions f20402c;

    /* renamed from: u9.f$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final C10226f m19123a(X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            AbstractC9133u.m16133g(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new C10226f(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        public a() {
        }
    }

    public C10226f(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        AbstractC9133u.m16133g(trustManager, "trustManager");
        AbstractC9133u.m16133g(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f20401b = trustManager;
        this.f20402c = x509TrustManagerExtensions;
    }

    @Override // p302x9.AbstractC10588c
    /* renamed from: a */
    public List mo19122a(List chain, String hostname) throws CertificateException, SSLPeerUnverifiedException {
        AbstractC9133u.m16133g(chain, "chain");
        AbstractC9133u.m16133g(hostname, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f20402c.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            AbstractC9133u.m16132f(listCheckServerTrusted, "checkServerTrusted(...)");
            return listCheckServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10226f) && ((C10226f) obj).f20401b == this.f20401b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f20401b);
    }
}
