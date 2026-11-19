package se;

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
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import org.openjsse.net.ssl.OpenJSSE;

/* renamed from: se.i */
/* loaded from: classes6.dex */
public final class C11191i extends C11192j {

    /* renamed from: e */
    public static final a f26879e;

    /* renamed from: f */
    public static final boolean f26880f;

    /* renamed from: d */
    public final Provider f26881d;

    /* renamed from: se.i$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final C11191i m24888a() {
            AbstractC9972n abstractC9972n = null;
            if (m24889b()) {
                return new C11191i(abstractC9972n);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m24889b() {
            return C11191i.f26880f;
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f26879e = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f26880f = z10;
    }

    public /* synthetic */ C11191i(AbstractC9972n abstractC9972n) {
        this();
    }

    @Override // se.C11192j
    /* renamed from: e */
    public void mo24855e(SSLSocket sslSocket, String str, List protocols) {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        AbstractC9979u.m20294g(protocols, "protocols");
        super.mo24855e(sslSocket, str, protocols);
    }

    @Override // se.C11192j
    /* renamed from: g */
    public String mo24856g(SSLSocket sslSocket) {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        return super.mo24856g(sslSocket);
    }

    @Override // se.C11192j
    /* renamed from: m */
    public SSLContext mo24869m() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f26881d);
        AbstractC9979u.m20293f(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // se.C11192j
    /* renamed from: o */
    public X509TrustManager mo24870o() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f26881d);
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC9979u.m20291d(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC9979u.m20292e(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        AbstractC9979u.m20293f(string, "toString(this)");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public C11191i() {
        this.f26881d = new OpenJSSE();
    }
}
