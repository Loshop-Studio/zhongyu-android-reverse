package p185v7;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;

/* renamed from: v7.h */
/* loaded from: classes4.dex */
public final class C6679h extends C6685n {

    /* renamed from: d */
    public static final boolean f11263d;

    /* renamed from: c */
    public final Provider f11264c;

    static {
        boolean z8 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, AbstractC6677f.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (AbstractC6677f.m6358a()) {
                    z8 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f11263d = z8;
    }

    public C6679h() {
        Provider providerNewProvider = Conscrypt.newProvider();
        AbstractC5830k.m5329f(providerNewProvider, "newProvider()");
        this.f11264c = providerNewProvider;
    }

    @Override // p185v7.C6685n
    /* renamed from: d */
    public final void mo6331d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC5830k.m5330g(protocols, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                arrayList2.add(((Protocol) obj2).getProtocol());
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) arrayList2.toArray(new String[0]));
        }
    }

    @Override // p185v7.C6685n
    /* renamed from: f */
    public final String mo6332f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p185v7.C6685n
    /* renamed from: k */
    public final SSLContext mo6356k() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f11264c);
        AbstractC5830k.m5329f(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p185v7.C6685n
    /* renamed from: l */
    public final SSLSocketFactory mo6359l(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContextMo6356k = mo6356k();
        sSLContextMo6356k.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = sSLContextMo6356k.getSocketFactory();
        AbstractC5830k.m5329f(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // p185v7.C6685n
    /* renamed from: m */
    public final X509TrustManager mo6357m() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC5830k.m5327d(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC5830k.m5328e(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, C6678g.f11262a);
                return x509TrustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        AbstractC5830k.m5329f(string, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }
}
