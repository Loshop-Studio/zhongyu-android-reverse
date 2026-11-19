package se;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory;

/* renamed from: se.d */
/* loaded from: classes6.dex */
public final class C11186d extends C11192j {

    /* renamed from: e */
    public static final a f26864e;

    /* renamed from: f */
    public static final boolean f26865f;

    /* renamed from: d */
    public final Provider f26866d;

    /* renamed from: se.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final boolean m24875a(int i10, int i11, int i12) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i10 ? version.major() > i10 : version.minor() != i11 ? version.minor() > i11 : version.patch() >= i12;
        }

        /* renamed from: b */
        public final C11186d m24876b() {
            AbstractC9972n abstractC9972n = null;
            if (m24877c()) {
                return new C11186d(abstractC9972n);
            }
            return null;
        }

        /* renamed from: c */
        public final boolean m24877c() {
            return C11186d.f26865f;
        }

        public a() {
        }
    }

    /* renamed from: se.d$b */
    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a */
        public static final b f26867a = new b();
    }

    static {
        a aVar = new a(null);
        f26864e = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (aVar.m24875a(2, 1, 0)) {
                    z10 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f26865f = z10;
    }

    public /* synthetic */ C11186d(AbstractC9972n abstractC9972n) {
        this();
    }

    @Override // se.C11192j
    /* renamed from: e */
    public void mo24855e(SSLSocket sslSocket, String str, List protocols) {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        AbstractC9979u.m20294g(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.mo24855e(sslSocket, str, protocols);
        } else {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) C11192j.f26882a.m24894b(protocols).toArray(new String[0]));
        }
    }

    @Override // se.C11192j
    /* renamed from: g */
    public String mo24856g(SSLSocket sslSocket) {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket) ? Conscrypt.getApplicationProtocol(sslSocket) : super.mo24856g(sslSocket);
    }

    @Override // se.C11192j
    /* renamed from: m */
    public SSLContext mo24869m() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance(SSLSocketFactoryFactory.DEFAULT_PROTOCOL, this.f26866d);
        AbstractC9979u.m20293f(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // se.C11192j
    /* renamed from: n */
    public SSLSocketFactory mo24874n(X509TrustManager trustManager) throws NoSuchAlgorithmException, KeyManagementException {
        AbstractC9979u.m20294g(trustManager, "trustManager");
        SSLContext sSLContextMo24869m = mo24869m();
        sSLContextMo24869m.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = sSLContextMo24869m.getSocketFactory();
        AbstractC9979u.m20293f(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // se.C11192j
    /* renamed from: o */
    public X509TrustManager mo24870o() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC9979u.m20291d(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC9979u.m20292e(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, b.f26867a);
                return x509TrustManager;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        AbstractC9979u.m20293f(string, "toString(this)");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public C11186d() {
        Provider providerNewProvider = Conscrypt.newProvider();
        AbstractC9979u.m20293f(providerNewProvider, "newProvider()");
        this.f26866d = providerNewProvider;
    }
}
