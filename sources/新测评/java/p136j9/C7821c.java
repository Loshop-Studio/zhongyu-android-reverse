package p136j9;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* renamed from: j9.c */
/* loaded from: classes5.dex */
public final class C7821c extends C7828j {

    /* renamed from: e */
    public static final a f13539e;

    /* renamed from: f */
    public static final boolean f13540f;

    /* renamed from: d */
    public final Provider f13541d;

    /* renamed from: j9.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7821c m13263a() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (m13264b()) {
                return new C7821c(defaultConstructorMarker);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m13264b() {
            return C7821c.f13540f;
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f13539e = aVar;
        boolean z9 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z9 = true;
        } catch (ClassNotFoundException unused) {
        }
        f13540f = z9;
    }

    public /* synthetic */ C7821c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // p136j9.C7828j
    /* renamed from: e */
    public void mo13247e(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        super.mo13247e(sslSocket, str, protocols);
    }

    @Override // p136j9.C7828j
    /* renamed from: g */
    public String mo13248g(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return super.mo13248g(sslSocket);
    }

    @Override // p136j9.C7828j
    /* renamed from: m */
    public SSLContext mo13261m() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f13541d);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p136j9.C7828j
    /* renamed from: o */
    public X509TrustManager mo13262o() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.checkNotNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    public C7821c() {
        this.f13541d = new BouncyCastleJsseProvider();
    }
}
