package p136j9;

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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* renamed from: j9.d */
/* loaded from: classes5.dex */
public final class C7822d extends C7828j {

    /* renamed from: e */
    public static final a f13542e;

    /* renamed from: f */
    public static final boolean f13543f;

    /* renamed from: d */
    public final Provider f13544d;

    /* renamed from: j9.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean m13267a(int i10, int i11, int i12) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i10 ? version.major() > i10 : version.minor() != i11 ? version.minor() > i11 : version.patch() >= i12;
        }

        /* renamed from: b */
        public final C7822d m13268b() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (m13269c()) {
                return new C7822d(defaultConstructorMarker);
            }
            return null;
        }

        /* renamed from: c */
        public final boolean m13269c() {
            return C7822d.f13543f;
        }

        public a() {
        }
    }

    /* renamed from: j9.d$b */
    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a */
        public static final b f13545a = new b();
    }

    static {
        a aVar = new a(null);
        f13542e = aVar;
        boolean z9 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (aVar.m13267a(2, 1, 0)) {
                    z9 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f13543f = z9;
    }

    public /* synthetic */ C7822d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // p136j9.C7828j
    /* renamed from: e */
    public void mo13247e(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.mo13247e(sslSocket, str, protocols);
        } else {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) C7828j.f13560a.m13286b(protocols).toArray(new String[0]));
        }
    }

    @Override // p136j9.C7828j
    /* renamed from: g */
    public String mo13248g(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket) ? Conscrypt.getApplicationProtocol(sslSocket) : super.mo13248g(sslSocket);
    }

    @Override // p136j9.C7828j
    /* renamed from: m */
    public SSLContext mo13261m() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f13544d);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p136j9.C7828j
    /* renamed from: n */
    public SSLSocketFactory mo13266n(X509TrustManager trustManager) throws NoSuchAlgorithmException, KeyManagementException {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        SSLContext sSLContextMo13261m = mo13261m();
        sSLContextMo13261m.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = sSLContextMo13261m.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // p136j9.C7828j
    /* renamed from: o */
    public X509TrustManager mo13262o() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.checkNotNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, b.f13545a);
                return x509TrustManager;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    public C7822d() {
        Provider providerNewProvider = Conscrypt.newProvider();
        Intrinsics.checkNotNullExpressionValue(providerNewProvider, "newProvider()");
        this.f13544d = providerNewProvider;
    }
}
