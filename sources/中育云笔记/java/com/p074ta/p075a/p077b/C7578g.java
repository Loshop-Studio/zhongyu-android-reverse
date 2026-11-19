package com.p074ta.p075a.p077b;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.ta.a.b.g */
/* loaded from: classes5.dex */
class C7578g implements X509TrustManager {

    /* renamed from: a */
    private static TrustManager[] f12838a;

    public static synchronized TrustManager[] getTrustManagers() {
        try {
            if (f12838a == null) {
                f12838a = new TrustManager[]{new C7578g()};
            }
        } catch (Throwable th) {
            throw th;
        }
        return f12838a;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws NoSuchAlgorithmException, KeyStoreException, CertificateException {
        if (x509CertificateArr == null || x509CertificateArr.length <= 0) {
            throw new IllegalArgumentException("checkServerTrusted: X509Certificate array is null");
        }
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
            trustManagerFactory.init((KeyStore) null);
            if (trustManagerFactory.getTrustManagers() != null) {
                for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                    try {
                        ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, str);
                    } catch (CertificateException e10) {
                        for (Throwable cause = e10; cause != null; cause = cause.getCause()) {
                            if ((cause instanceof CertificateExpiredException) || (cause instanceof CertificateNotYetValidException)) {
                                return;
                            }
                        }
                        throw e10;
                    }
                }
            }
        } catch (KeyStoreException e11) {
            throw new CertificateException(e11);
        } catch (NoSuchAlgorithmException e12) {
            throw new CertificateException(e12);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
