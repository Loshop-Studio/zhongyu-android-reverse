package p004a3;

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
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* renamed from: a3.d */
/* loaded from: classes2.dex */
public final class C0014d extends C0021k {

    /* renamed from: e */
    public static final boolean f16e;

    /* renamed from: f */
    public static final a f17f;

    /* renamed from: d */
    public final Provider f18d;

    /* renamed from: a3.d$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C0014d m43a() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (m44b()) {
                return new C0014d(defaultConstructorMarker);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m44b() {
            return C0014d.f16e;
        }
    }

    static {
        a aVar = new a(null);
        f17f = aVar;
        boolean z3 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z3 = true;
        } catch (ClassNotFoundException unused) {
        }
        f16e = z3;
    }

    public C0014d() {
        this.f18d = new BouncyCastleJsseProvider();
    }

    @Override // p004a3.C0021k
    /* renamed from: e */
    public void mo27e(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (!(sslSocket instanceof BCSSLSocket)) {
            super.mo27e(sslSocket, str, protocols);
            return;
        }
        BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
        BCSSLParameters sslParameters = bCSSLSocket.getParameters();
        List listM66b = C0021k.f39c.m66b(protocols);
        Intrinsics.checkNotNullExpressionValue(sslParameters, "sslParameters");
        Object[] array = listM66b.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        sslParameters.setApplicationProtocols((String[]) array);
        bCSSLSocket.setParameters(sslParameters);
    }

    @Override // p004a3.C0021k
    /* renamed from: g */
    public String mo28g(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!(sslSocket instanceof BCSSLSocket)) {
            return super.mo28g(sslSocket);
        }
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p004a3.C0021k
    /* renamed from: m */
    public SSLContext mo41m() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f18d);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p004a3.C0021k
    /* renamed from: o */
    public X509TrustManager mo42o() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory factory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        factory.init((KeyStore) null);
        Intrinsics.checkNotNullExpressionValue(factory, "factory");
        TrustManager[] trustManagers = factory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "java.util.Arrays.toString(this)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    public /* synthetic */ C0014d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
