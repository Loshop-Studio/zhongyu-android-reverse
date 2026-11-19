package p168e.p169q.p174g;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import p070b.p071a.p072a.p073a.C0561a;
import p160d.p162f.p164b.C1010c;
import p160d.p162f.p164b.C1011d;

/* renamed from: e.q.g.c */
/* loaded from: classes.dex */
public final class C1054c extends C1059h {

    /* renamed from: e */
    public static final boolean f5614e;

    /* renamed from: f */
    public static final a f5615f;

    /* renamed from: d */
    public final Provider f5616d = new BouncyCastleJsseProvider();

    /* renamed from: e.q.g.c$a */
    public static final class a {
        public a(C1010c c1010c) {
        }
    }

    static {
        a aVar = new a(null);
        f5615f = aVar;
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f5614e = z;
    }

    @Override // p168e.p169q.p174g.C1059h
    /* renamed from: d */
    public SSLContext mo2852d() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f5616d);
        C1011d.m2808d(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p168e.p169q.p174g.C1059h
    /* renamed from: f */
    public X509TrustManager mo2853f() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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
