package com.tendcloud.tenddata;

import com.alibaba.android.arouter.utils.Consts;
import java.io.ByteArrayInputStream;
import java.net.URLConnection;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory;

/* renamed from: com.tendcloud.tenddata.cv */
/* loaded from: classes5.dex */
public final class C7917cv {

    /* renamed from: a */
    public static volatile HashMap<Long, String> f14639a = new HashMap<>();

    /* renamed from: b */
    private static final Pattern f14640b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: c */
    private static final int f14641c = 2;

    /* renamed from: d */
    private static final int f14642d = 7;

    /* renamed from: com.tendcloud.tenddata.cv$a */
    public static class a implements X509TrustManager {
        X509Certificate cert;

        public a(X509Certificate x509Certificate) {
            this.cert = x509Certificate;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            int iIndexOf;
            int length = x509CertificateArr.length;
            x509CertificateArr[0].getIssuerDN().equals(this.cert.getSubjectDN());
            try {
                String name = x509CertificateArr[0].getSubjectDN().getName();
                int iIndexOf2 = name.indexOf("CN=");
                if (iIndexOf2 >= 0 && (iIndexOf = (name = name.substring(iIndexOf2 + 3)).indexOf(",")) >= 0) {
                    name = name.substring(0, iIndexOf);
                }
                String[] strArrSplit = name.split("\\.");
                if (strArrSplit.length >= 2) {
                    name = strArrSplit[strArrSplit.length - 2] + Consts.DOT + strArrSplit[strArrSplit.length - 1];
                }
                if (!C7917cv.f14639a.containsKey(Long.valueOf(Thread.currentThread().getId()))) {
                    throw new CertificateException("No valid host provided!");
                }
                if (!C7917cv.f14639a.get(Long.valueOf(Thread.currentThread().getId())).endsWith(name)) {
                    throw new CertificateException("Server certificate has incorrect host name!");
                }
                x509CertificateArr[0].verify(this.cert.getPublicKey());
                x509CertificateArr[0].checkValidity();
            } catch (Throwable unused) {
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }

    /* renamed from: a */
    private static void m11640a(HttpsURLConnection httpsURLConnection) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m11646b(String str, SSLSession sSLSession) {
        try {
            return m11642a(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m11647c(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        List<String> listM11637a = m11637a(x509Certificate, 2);
        int size = listM11637a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (m11641a(lowerCase, listM11637a.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public static void setHostNameVerifyAllowAll(URLConnection uRLConnection) {
        final HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
        httpsURLConnection.setHostnameVerifier(new HostnameVerifier() { // from class: com.tendcloud.tenddata.cv.1
            @Override // javax.net.ssl.HostnameVerifier
            public boolean verify(String str, SSLSession sSLSession) {
                try {
                    if (C7917cv.m11646b(str, sSLSession)) {
                        return true;
                    }
                    return str.equals(httpsURLConnection.getURL().getHost());
                } catch (Throwable unused) {
                    return false;
                }
            }
        });
    }

    /* renamed from: a */
    public static SSLSocketFactory m11638a(X509Certificate x509Certificate) {
        try {
            SSLContext sSLContext = SSLContext.getInstance(SSLSocketFactoryFactory.DEFAULT_PROTOCOL);
            if (x509Certificate != null) {
                sSLContext.init(null, new TrustManager[]{new a(x509Certificate)}, null);
            } else {
                sSLContext.init(null, null, null);
            }
            return sSLContext.getSocketFactory();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static boolean m11644b(String str) {
        return f14640b.matcher(str).matches();
    }

    /* renamed from: b */
    private static boolean m11645b(String str, X509Certificate x509Certificate) {
        List<String> listM11637a = m11637a(x509Certificate, 7);
        int size = listM11637a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (str.equalsIgnoreCase(listM11637a.get(i10))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m11639a(URLConnection uRLConnection, String str) {
        SSLContext sSLContext;
        try {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
            if (C7912cq.m11595a(16)) {
                sSLContext = SSLContext.getInstance("TLSv1.2");
            } else {
                sSLContext = SSLContext.getInstance("TLSv1");
            }
            sSLContext.init(null, new TrustManager[]{new a(m11636a(str))}, null);
            httpsURLConnection.getHostnameVerifier();
            httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            m11640a(httpsURLConnection);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static boolean m11642a(String str, X509Certificate x509Certificate) {
        return m11644b(str) ? m11645b(str, x509Certificate) : m11647c(str, x509Certificate);
    }

    /* renamed from: a */
    private static boolean m11641a(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(Consts.DOT) && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(Consts.DOT) && !str2.endsWith("..")) {
            if (!str.endsWith(Consts.DOT)) {
                str = str + '.';
            }
            if (!str2.endsWith(Consts.DOT)) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String strSubstring = lowerCase.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    /* renamed from: a */
    private static List<String> m11637a(X509Certificate x509Certificate, int i10) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i10 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return Collections.EMPTY_LIST;
        }
    }

    /* renamed from: a */
    public static X509Certificate m11636a(String str) {
        if (C7912cq.m11608b(str)) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        try {
            try {
                X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(byteArrayInputStream);
                try {
                    byteArrayInputStream.close();
                } catch (Throwable unused) {
                }
                return x509Certificate;
            } catch (Throwable unused2) {
                byteArrayInputStream.close();
                return null;
            }
        } catch (Throwable unused3) {
            return null;
        }
    }
}
