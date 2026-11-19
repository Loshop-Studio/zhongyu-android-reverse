package com.tendcloud.tenddata;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* renamed from: com.tendcloud.tenddata.fv */
/* loaded from: classes5.dex */
class C7998fv {

    /* renamed from: com.tendcloud.tenddata.fv$a */
    public static class a {
        public static String encode(byte[] bArr) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            StringBuilder sb2 = new StringBuilder(bArr.length * 2);
            for (int i10 = 0; i10 < bArr.length; i10++) {
                sb2.append(cArr[(bArr[i10] & 240) >> 4]);
                sb2.append(cArr[bArr[i10] & 15]);
            }
            return sb2.toString();
        }
    }

    /* renamed from: a */
    public static String m12007a(Context context) {
        String packageName = context.getPackageName();
        return m12008a(context, packageName) + packageName;
    }

    /* renamed from: a */
    public static String m12008a(Context context, String str) {
        String strM12009a;
        try {
            strM12009a = m12009a((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray())));
        } catch (PackageManager.NameNotFoundException | CertificateException unused) {
            strM12009a = "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < strM12009a.length(); i10++) {
            stringBuffer.append(strM12009a.charAt(i10));
            if (i10 > 0 && i10 % 2 == 1 && i10 < strM12009a.length() - 1) {
                stringBuffer.append(":");
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m12009a(X509Certificate x509Certificate) {
        try {
            return a.encode(m12010a(x509Certificate.getEncoded()));
        } catch (CertificateEncodingException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m12010a(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA1").digest(bArr);
        } catch (NoSuchAlgorithmException unused) {
            return new byte[0];
        }
    }
}
