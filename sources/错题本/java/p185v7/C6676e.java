package p185v7;

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
import kotlin.jvm.internal.AbstractC5830k;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* renamed from: v7.e */
/* loaded from: classes4.dex */
public final class C6676e extends C6685n {

    /* renamed from: d */
    public static final boolean f11260d;

    /* renamed from: c */
    public final Provider f11261c = new BouncyCastleJsseProvider();

    static {
        boolean z8 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, AbstractC6675d.class.getClassLoader());
            z8 = true;
        } catch (ClassNotFoundException unused) {
        }
        f11260d = z8;
    }

    @Override // p185v7.C6685n
    /* renamed from: d */
    public final void mo6331d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC5830k.m5330g(protocols, "protocols");
    }

    @Override // p185v7.C6685n
    /* renamed from: f */
    public final String mo6332f(SSLSocket sSLSocket) {
        return null;
    }

    @Override // p185v7.C6685n
    /* renamed from: k */
    public final SSLContext mo6356k() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f11261c);
        AbstractC5830k.m5329f(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p185v7.C6685n
    /* renamed from: m */
    public final X509TrustManager mo6357m() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC5830k.m5327d(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC5830k.m5328e(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        AbstractC5830k.m5329f(string, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }
}
