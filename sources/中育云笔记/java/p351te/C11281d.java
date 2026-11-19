package p351te;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import ve.AbstractC11618c;

/* renamed from: te.d */
/* loaded from: classes6.dex */
public final class C11281d extends AbstractC11618c {

    /* renamed from: d */
    public static final a f27089d = new a(null);

    /* renamed from: b */
    public final X509TrustManager f27090b;

    /* renamed from: c */
    public final X509TrustManagerExtensions f27091c;

    /* renamed from: te.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final C11281d m25222a(X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            AbstractC9979u.m20294g(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new C11281d(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        public a() {
        }
    }

    public C11281d(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        AbstractC9979u.m20294g(trustManager, "trustManager");
        AbstractC9979u.m20294g(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f27090b = trustManager;
        this.f27091c = x509TrustManagerExtensions;
    }

    @Override // ve.AbstractC11618c
    /* renamed from: a */
    public List mo25221a(List chain, String hostname) throws CertificateException, SSLPeerUnverifiedException {
        AbstractC9979u.m20294g(chain, "chain");
        AbstractC9979u.m20294g(hostname, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f27091c.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            AbstractC9979u.m20293f(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C11281d) && ((C11281d) obj).f27090b == this.f27090b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f27090b);
    }
}
