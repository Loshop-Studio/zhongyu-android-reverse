package p266u8;

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

/* renamed from: u8.c */
/* loaded from: classes5.dex */
public final class C9727c extends C9734j {

    /* renamed from: e */
    public static final a f17179e;

    /* renamed from: f */
    public static final boolean f17180f;

    /* renamed from: d */
    public final Provider f17181d;

    /* renamed from: u8.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C9727c m16243a() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (m16244b()) {
                return new C9727c(defaultConstructorMarker);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m16244b() {
            return C9727c.f17180f;
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f17179e = aVar;
        boolean z9 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z9 = true;
        } catch (ClassNotFoundException unused) {
        }
        f17180f = z9;
    }

    public /* synthetic */ C9727c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // p266u8.C9734j
    /* renamed from: e */
    public void mo16227e(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        super.mo16227e(sslSocket, str, protocols);
    }

    @Override // p266u8.C9734j
    /* renamed from: g */
    public String mo16228g(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return super.mo16228g(sslSocket);
    }

    @Override // p266u8.C9734j
    /* renamed from: m */
    public SSLContext mo16241m() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f17181d);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p266u8.C9734j
    /* renamed from: o */
    public X509TrustManager mo16242o() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
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

    public C9727c() {
        this.f17181d = new BouncyCastleJsseProvider();
    }
}
