package p004a3;

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

/* renamed from: a3.e */
/* loaded from: classes2.dex */
public final class C0015e extends C0021k {

    /* renamed from: e */
    public static final boolean f19e;

    /* renamed from: f */
    public static final a f20f;

    /* renamed from: d */
    public final Provider f21d;

    /* renamed from: a3.e$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean m47a(int i4, int i5, int i6) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i4 ? version.major() > i4 : version.minor() != i5 ? version.minor() > i5 : version.patch() >= i6;
        }

        /* renamed from: b */
        public final C0015e m48b() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (m49c()) {
                return new C0015e(defaultConstructorMarker);
            }
            return null;
        }

        /* renamed from: c */
        public final boolean m49c() {
            return C0015e.f19e;
        }
    }

    /* renamed from: a3.e$b */
    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a */
        public static final b f22a = new b();
    }

    static {
        a aVar = new a(null);
        f20f = aVar;
        boolean z3 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (aVar.m47a(2, 1, 0)) {
                    z3 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f19e = z3;
    }

    public C0015e() {
        Provider providerNewProvider = Conscrypt.newProvider();
        Intrinsics.checkNotNullExpressionValue(providerNewProvider, "Conscrypt.newProvider()");
        this.f21d = providerNewProvider;
    }

    @Override // p004a3.C0021k
    /* renamed from: e */
    public void mo27e(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.mo27e(sslSocket, str, protocols);
            return;
        }
        Conscrypt.setUseSessionTickets(sslSocket, true);
        Object[] array = C0021k.f39c.m66b(protocols).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
    }

    @Override // p004a3.C0021k
    /* renamed from: g */
    public String mo28g(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket) ? Conscrypt.getApplicationProtocol(sslSocket) : super.mo28g(sslSocket);
    }

    @Override // p004a3.C0021k
    /* renamed from: m */
    public SSLContext mo41m() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f21d);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p004a3.C0021k
    /* renamed from: n */
    public SSLSocketFactory mo46n(X509TrustManager trustManager) throws NoSuchAlgorithmException, KeyManagementException {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        SSLContext sSLContextMo41m = mo41m();
        sSLContextMo41m.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = sSLContextMo41m.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // p004a3.C0021k
    /* renamed from: o */
    public X509TrustManager mo42o() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        Intrinsics.checkNotNullExpressionValue(trustManagerFactory, "TrustManagerFactory.getI…(null as KeyStore?)\n    }");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
            Conscrypt.setHostnameVerifier(x509TrustManager, b.f22a);
            return x509TrustManager;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "java.util.Arrays.toString(this)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    public /* synthetic */ C0015e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
