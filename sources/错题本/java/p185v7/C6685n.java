package p185v7;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC5830k;
import p204y1.AbstractC6768a;
import p215z7.C6839a;
import p215z7.C6840b;
import p215z7.InterfaceC6842d;

/* renamed from: v7.n */
/* loaded from: classes4.dex */
public class C6685n {

    /* renamed from: a */
    public static volatile C6685n f11276a;

    /* renamed from: b */
    public static final Logger f11277b;

    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    static {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p185v7.C6685n.<clinit>():void");
    }

    /* renamed from: i */
    public static void m6380i(String message, int i, Throwable th) {
        AbstractC5830k.m5330g(message, "message");
        f11277b.log(i == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    /* renamed from: b */
    public AbstractC6768a mo6330b(X509TrustManager x509TrustManager) {
        return new C6839a(mo6335c(x509TrustManager));
    }

    /* renamed from: c */
    public InterfaceC6842d mo6335c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        AbstractC5830k.m5329f(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C6840b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: d */
    public void mo6331d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC5830k.m5330g(protocols, "protocols");
    }

    /* renamed from: e */
    public void mo6336e(Socket socket, InetSocketAddress address, int i) throws IOException {
        AbstractC5830k.m5330g(address, "address");
        socket.connect(address, i);
    }

    /* renamed from: f */
    public String mo6332f(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: g */
    public Object mo6337g() {
        if (f11277b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* renamed from: h */
    public boolean mo6333h(String hostname) {
        AbstractC5830k.m5330g(hostname, "hostname");
        return true;
    }

    /* renamed from: j */
    public void mo6338j(Object obj, String message) {
        AbstractC5830k.m5330g(message, "message");
        if (obj == null) {
            message = message.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m6380i(message, 5, (Throwable) obj);
    }

    /* renamed from: k */
    public SSLContext mo6356k() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        AbstractC5830k.m5329f(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    /* renamed from: l */
    public SSLSocketFactory mo6359l(X509TrustManager x509TrustManager) throws KeyManagementException {
        try {
            SSLContext sSLContextMo6356k = mo6356k();
            sSLContextMo6356k.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextMo6356k.getSocketFactory();
            AbstractC5830k.m5329f(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    /* renamed from: m */
    public X509TrustManager mo6357m() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public final String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: a */
    public void mo6360a(SSLSocket sSLSocket) {
    }
}
