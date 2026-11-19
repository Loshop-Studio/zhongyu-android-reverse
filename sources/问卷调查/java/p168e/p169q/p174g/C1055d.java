package p168e.p169q.p174g;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import p070b.p071a.p072a.p073a.C0561a;
import p160d.p162f.p164b.C1010c;
import p160d.p162f.p164b.C1011d;

/* renamed from: e.q.g.d */
/* loaded from: classes.dex */
public final class C1055d extends C1059h {

    /* renamed from: e */
    public static final boolean f5617e;

    /* renamed from: f */
    public static final a f5618f;

    /* renamed from: d */
    public final Provider f5619d;

    /* renamed from: e.q.g.d$a */
    public static final class a {
        public a(C1010c c1010c) {
        }

        /* renamed from: a */
        public final boolean m2855a(int i, int i2, int i3) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i ? version.major() > i : version.minor() != i2 ? version.minor() > i2 : version.patch() >= i3;
        }
    }

    /* renamed from: e.q.g.d$b */
    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a */
        public static final b f5620a = new b();
    }

    static {
        a aVar = new a(null);
        f5618f = aVar;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (aVar.m2855a(2, 1, 0)) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f5617e = z;
    }

    public C1055d() {
        Provider providerNewProvider = Conscrypt.newProvider();
        C1011d.m2808d(providerNewProvider, "Conscrypt.newProvider()");
        this.f5619d = providerNewProvider;
    }

    @Override // p168e.p169q.p174g.C1059h
    /* renamed from: d */
    public SSLContext mo2852d() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f5619d);
        C1011d.m2808d(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p168e.p169q.p174g.C1059h
    /* renamed from: e */
    public SSLSocketFactory mo2854e(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException {
        C1011d.m2809e(x509TrustManager, "trustManager");
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f5619d);
        C1011d.m2808d(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        C1011d.m2808d(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // p168e.p169q.p174g.C1059h
    /* renamed from: f */
    public X509TrustManager mo2853f() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        C1011d.m2808d(trustManagerFactory, "TrustManagerFactory.getI…(null as KeyStore?)\n    }");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        C1011d.m2807c(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
            Conscrypt.setHostnameVerifier(x509TrustManager, b.f5620a);
            return x509TrustManager;
        }
        StringBuilder sbM2079g = C0561a.m2079g("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        C1011d.m2808d(string, "java.util.Arrays.toString(this)");
        sbM2079g.append(string);
        throw new IllegalStateException(sbM2079g.toString().toString());
    }
}
