package p266u8;

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

/* renamed from: u8.d */
/* loaded from: classes5.dex */
public final class C9728d extends C9734j {

    /* renamed from: e */
    public static final a f17182e;

    /* renamed from: f */
    public static final boolean f17183f;

    /* renamed from: d */
    public final Provider f17184d;

    /* renamed from: u8.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean m16247a(int i9, int i10, int i11) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i9 ? version.major() > i9 : version.minor() != i10 ? version.minor() > i10 : version.patch() >= i11;
        }

        /* renamed from: b */
        public final C9728d m16248b() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (m16249c()) {
                return new C9728d(defaultConstructorMarker);
            }
            return null;
        }

        /* renamed from: c */
        public final boolean m16249c() {
            return C9728d.f17183f;
        }

        public a() {
        }
    }

    /* renamed from: u8.d$b */
    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a */
        public static final b f17185a = new b();
    }

    static {
        a aVar = new a(null);
        f17182e = aVar;
        boolean z9 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (aVar.m16247a(2, 1, 0)) {
                    z9 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f17183f = z9;
    }

    public /* synthetic */ C9728d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // p266u8.C9734j
    /* renamed from: e */
    public void mo16227e(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.mo16227e(sslSocket, str, protocols);
        } else {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) C9734j.f17200a.m16266b(protocols).toArray(new String[0]));
        }
    }

    @Override // p266u8.C9734j
    /* renamed from: g */
    public String mo16228g(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket) ? Conscrypt.getApplicationProtocol(sslSocket) : super.mo16228g(sslSocket);
    }

    @Override // p266u8.C9734j
    /* renamed from: m */
    public SSLContext mo16241m() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f17184d);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p266u8.C9734j
    /* renamed from: n */
    public SSLSocketFactory mo16246n(X509TrustManager trustManager) throws NoSuchAlgorithmException, KeyManagementException {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        SSLContext sSLContextMo16241m = mo16241m();
        sSLContextMo16241m.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = sSLContextMo16241m.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // p266u8.C9734j
    /* renamed from: o */
    public X509TrustManager mo16242o() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.checkNotNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, b.f17185a);
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

    public C9728d() {
        Provider providerNewProvider = Conscrypt.newProvider();
        Intrinsics.checkNotNullExpressionValue(providerNewProvider, "newProvider()");
        this.f17184d = providerNewProvider;
    }
}
