package p136j9;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
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
import org.openjsse.net.ssl.OpenJSSE;

/* renamed from: j9.i */
/* loaded from: classes5.dex */
public final class C7827i extends C7828j {

    /* renamed from: e */
    public static final a f13557e;

    /* renamed from: f */
    public static final boolean f13558f;

    /* renamed from: d */
    public final Provider f13559d;

    /* renamed from: j9.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7827i m13280a() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (m13281b()) {
                return new C7827i(defaultConstructorMarker);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m13281b() {
            return C7827i.f13558f;
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f13557e = aVar;
        boolean z9 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z9 = true;
        } catch (ClassNotFoundException unused) {
        }
        f13558f = z9;
    }

    public /* synthetic */ C7827i(DefaultConstructorMarker defaultConstructorMarker) {
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
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f13559d);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // p136j9.C7828j
    /* renamed from: o */
    public X509TrustManager mo13262o() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f13559d);
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

    public C7827i() {
        this.f13559d = new OpenJSSE();
    }
}
