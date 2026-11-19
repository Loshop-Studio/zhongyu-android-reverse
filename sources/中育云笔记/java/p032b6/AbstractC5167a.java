package p032b6;

import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import p114d6.AbstractC8996f;

/* renamed from: b6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC5167a {

    /* renamed from: a */
    public static final String[] f2997a = {"TLS_DHE_DSS_WITH_AES_128_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA"};

    /* renamed from: b */
    public static final String[] f2998b = {"TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"};

    /* renamed from: c */
    public static final String[] f2999c = {"TLS_RSA", "CBC", "TEA", "SHA0", "MD2", "MD4", "RIPEMD", "NULL", "RC4", "DES", "DESX", "DES40", "RC2", "MD5", "ANON", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"};

    /* renamed from: a */
    public static boolean m2674a(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return false;
        }
        return m2675b(sSLSocket, f2999c);
    }

    /* renamed from: b */
    public static boolean m2675b(SSLSocket sSLSocket, String[] strArr) {
        if (sSLSocket == null) {
            return false;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        ArrayList arrayList = new ArrayList();
        for (String str : enabledCipherSuites) {
            String upperCase = str.toUpperCase(Locale.ENGLISH);
            int length = strArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    arrayList.add(str);
                    break;
                }
                if (upperCase.contains(strArr[i10].toUpperCase(Locale.ENGLISH))) {
                    break;
                }
                i10++;
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
        return true;
    }

    /* renamed from: c */
    public static void m2676c(SSLSocket sSLSocket) {
        if (sSLSocket == null || m2680g(sSLSocket)) {
            return;
        }
        m2674a(sSLSocket);
    }

    /* renamed from: d */
    public static void m2677d(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            sSLSocket.setEnabledProtocols(new String[]{"TLSv1.3", "TLSv1.2"});
        }
        if (i10 < 29) {
            sSLSocket.setEnabledProtocols(new String[]{"TLSv1.2"});
        }
    }

    /* renamed from: e */
    public static boolean m2678e(SSLSocket sSLSocket, String[] strArr) {
        if (sSLSocket != null && strArr != null) {
            try {
                sSLSocket.setEnabledProtocols(strArr);
                return true;
            } catch (Exception e10) {
                AbstractC8996f.m17563d("SSLUtil", "setEnabledProtocols: exception : " + e10.getMessage());
            }
        }
        return false;
    }

    /* renamed from: f */
    public static SSLContext m2679f() {
        return Build.VERSION.SDK_INT >= 29 ? SSLContext.getInstance("TLSv1.3") : SSLContext.getInstance("TLSv1.2");
    }

    /* renamed from: g */
    public static boolean m2680g(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return false;
        }
        return m2681h(sSLSocket, f2998b);
    }

    /* renamed from: h */
    public static boolean m2681h(SSLSocket sSLSocket, String[] strArr) {
        if (sSLSocket == null) {
            return false;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList(strArr);
        for (String str : enabledCipherSuites) {
            if (listAsList.contains(str.toUpperCase(Locale.ENGLISH))) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
        return true;
    }
}
