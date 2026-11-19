package p168e.p169q.p174g;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.openjsse.net.ssl.OpenJSSE;
import p070b.p071a.p072a.p073a.C0561a;
import p160d.p162f.p164b.C1010c;
import p160d.p162f.p164b.C1011d;

/* renamed from: e.q.g.g */
/* loaded from: classes.dex */
public final class C1058g extends C1059h {

    /* renamed from: e */
    public static final boolean f5623e;

    /* renamed from: f */
    public static final a f5624f;

    /* renamed from: d */
    public final Provider f5625d = new OpenJSSE();

    /* renamed from: e.q.g.g$a */
    public static final class a {
        public a(C1010c c1010c) {
        }
    }

    static {
        a aVar = new a(null);
        f5624f = aVar;
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f5623e = z;
    }

    @Override // p168e.p169q.p174g.C1059h
    /* renamed from: d */
    public SSLContext mo2852d() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f5625d);
        C1011d.m2808d(sSLContext, "SSLContext.getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // p168e.p169q.p174g.C1059h
    /* renamed from: f */
    public X509TrustManager mo2853f() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f5625d);
        trustManagerFactory.init((KeyStore) null);
        C1011d.m2808d(trustManagerFactory, "factory");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        C1011d.m2807c(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        StringBuilder sbM2079g = C0561a.m2079g("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        C1011d.m2808d(string, "java.util.Arrays.toString(this)");
        sbM2079g.append(string);
        throw new IllegalStateException(sbM2079g.toString().toString());
    }
}
