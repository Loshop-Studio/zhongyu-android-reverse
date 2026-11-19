package p147k9;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p171m9.AbstractC8573c;

/* renamed from: k9.d */
/* loaded from: classes5.dex */
public final class C7906d extends AbstractC8573c {

    /* renamed from: d */
    public static final a f13778d = new a(null);

    /* renamed from: b */
    public final X509TrustManager f13779b;

    /* renamed from: c */
    public final X509TrustManagerExtensions f13780c;

    /* renamed from: k9.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7906d m13532a(X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new C7906d(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        public a() {
        }
    }

    public C7906d(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f13779b = trustManager;
        this.f13780c = x509TrustManagerExtensions;
    }

    @Override // p171m9.AbstractC8573c
    /* renamed from: a */
    public List mo13531a(List chain, String hostname) throws CertificateException, SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f13780c.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            Intrinsics.checkNotNullExpressionValue(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C7906d) && ((C7906d) obj).f13779b == this.f13779b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f13779b);
    }
}
