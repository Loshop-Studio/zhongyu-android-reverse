package p131e7;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory;
import p146f7.AbstractC9204c;

/* renamed from: e7.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9108a {

    /* renamed from: a */
    public static X509TrustManager f21274a = new a();

    /* renamed from: b */
    public static HostnameVerifier f21275b = new b();

    /* renamed from: e7.a$b */
    public static class b implements HostnameVerifier {
        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    /* renamed from: e7.a$c */
    public static class c {

        /* renamed from: a */
        public SSLSocketFactory f21276a;

        /* renamed from: b */
        public X509TrustManager f21277b;
    }

    /* renamed from: a */
    public static X509TrustManager m17906a(TrustManager[] trustManagerArr) {
        for (TrustManager trustManager : trustManagerArr) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static c m17907b() {
        return m17908c(null, null, null, new InputStream[0]);
    }

    /* renamed from: c */
    public static c m17908c(X509TrustManager x509TrustManager, InputStream inputStream, String str, InputStream... inputStreamArr) throws UnrecoverableKeyException, NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, KeyManagementException {
        c cVar = new c();
        try {
            KeyManager[] keyManagerArrM17909d = m17909d(inputStream, str);
            TrustManager[] trustManagerArrM17910e = m17910e(inputStreamArr);
            if (x509TrustManager == null) {
                x509TrustManager = trustManagerArrM17910e != null ? m17906a(trustManagerArrM17910e) : f21274a;
            }
            SSLContext sSLContext = SSLContext.getInstance(SSLSocketFactoryFactory.DEFAULT_PROTOCOL);
            sSLContext.init(keyManagerArrM17909d, new TrustManager[]{x509TrustManager}, null);
            cVar.f21276a = sSLContext.getSocketFactory();
            cVar.f21277b = x509TrustManager;
            return cVar;
        } catch (KeyManagementException e10) {
            throw new AssertionError(e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new AssertionError(e11);
        }
    }

    /* renamed from: d */
    public static KeyManager[] m17909d(InputStream inputStream, String str) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException {
        if (inputStream != null && str != null) {
            try {
                KeyStore keyStore = KeyStore.getInstance("BKS");
                keyStore.load(inputStream, str.toCharArray());
                KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                keyManagerFactory.init(keyStore, str.toCharArray());
                return keyManagerFactory.getKeyManagers();
            } catch (Exception e10) {
                AbstractC9204c.m18111a(e10);
            }
        }
        return null;
    }

    /* renamed from: e */
    public static TrustManager[] m17910e(InputStream... inputStreamArr) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
        if (inputStreamArr != null && inputStreamArr.length > 0) {
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                keyStore.load(null);
                int length = inputStreamArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    InputStream inputStream = inputStreamArr[i10];
                    int i12 = i11 + 1;
                    keyStore.setCertificateEntry(Integer.toString(i11), certificateFactory.generateCertificate(inputStream));
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e10) {
                            AbstractC9204c.m18111a(e10);
                        }
                    }
                    i10++;
                    i11 = i12;
                }
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);
                return trustManagerFactory.getTrustManagers();
            } catch (Exception e11) {
                AbstractC9204c.m18111a(e11);
            }
        }
        return null;
    }

    /* renamed from: e7.a$a */
    public static class a implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }
    }
}
