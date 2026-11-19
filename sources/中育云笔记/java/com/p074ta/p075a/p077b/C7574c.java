package com.p074ta.p075a.p077b;

import android.annotation.TargetApi;
import com.p074ta.p075a.p078c.C7585f;
import java.net.Socket;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;

@TargetApi(24)
/* renamed from: com.ta.a.b.c */
/* loaded from: classes5.dex */
class C7574c extends X509ExtendedTrustManager {

    /* renamed from: a */
    private static TrustManager[] f12834a;

    public static synchronized TrustManager[] getTrustManagers() {
        try {
            if (f12834a == null) {
                f12834a = new TrustManager[]{new C7574c()};
            }
        } catch (Throwable th) {
            throw th;
        }
        return f12834a;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        C7585f.m9796a("UtExtendTrustManager", "checkClientTrusted1");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws NoSuchAlgorithmException, KeyStoreException, CertificateException {
        C7585f.m9796a("UtExtendTrustManager", "checkServerTrusted1");
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

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        C7585f.m9796a("UtExtendTrustManager", "checkClientTrusted2");
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            throw new IllegalArgumentException("parameter is not used");
        }
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("parameter is not used");
        }
        try {
            x509CertificateArr[0].checkValidity();
        } catch (Exception unused) {
            throw new CertificateException("Certificate not valid or trusted.");
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        C7585f.m9796a("UtExtendTrustManager", "checkClientTrusted3");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        C7585f.m9796a("UtExtendTrustManager", "checkServerTrusted2");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        C7585f.m9796a("UtExtendTrustManager", "checkServerTrusted3");
    }
}
