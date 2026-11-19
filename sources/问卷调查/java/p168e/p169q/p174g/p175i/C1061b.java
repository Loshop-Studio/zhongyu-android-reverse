package p168e.p169q.p174g.p175i;

import android.net.http.X509TrustManagerExtensions;
import javax.net.ssl.X509TrustManager;
import p160d.p162f.p164b.C1011d;
import p168e.p169q.p177i.AbstractC1075c;

/* renamed from: e.q.g.i.b */
/* loaded from: classes.dex */
public final class C1061b extends AbstractC1075c {

    /* renamed from: a */
    public final X509TrustManager f5629a;

    public C1061b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        C1011d.m2809e(x509TrustManager, "trustManager");
        C1011d.m2809e(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f5629a = x509TrustManager;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1061b) && ((C1061b) obj).f5629a == this.f5629a;
    }

    public int hashCode() {
        return System.identityHashCode(this.f5629a);
    }
}
