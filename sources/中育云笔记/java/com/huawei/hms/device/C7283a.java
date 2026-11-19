package com.huawei.hms.device;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.request.Request;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.support.log.common.Base64;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.huawei.hms.device.a */
/* loaded from: classes5.dex */
public class C7283a {
    /* renamed from: a */
    public static boolean m8547a(X509Certificate x509Certificate, List<X509Certificate> list) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        if (list == null || list.size() == 0) {
            return false;
        }
        if (x509Certificate == null) {
            HMSLog.m8725e("X509CertUtil", "rootCert is null,verify failed ");
            return false;
        }
        PublicKey publicKey = x509Certificate.getPublicKey();
        for (X509Certificate x509Certificate2 : list) {
            if (x509Certificate2 != null) {
                try {
                    x509Certificate2.checkValidity();
                    x509Certificate2.verify(publicKey);
                    publicKey = x509Certificate2.getPublicKey();
                } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | SignatureException | CertificateException e10) {
                    HMSLog.m8725e("X509CertUtil", "verify failed " + e10.getMessage());
                }
            }
            return false;
        }
        return m8549a(list);
    }

    /* renamed from: b */
    public static List<X509Certificate> m8551b(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m8542a(it.next()));
        }
        return arrayList;
    }

    /* renamed from: c */
    public static List m8554c(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 1) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(jSONArray.getString(i10));
            }
            return arrayList;
        } catch (JSONException e10) {
            HMSLog.m8725e("X509CertUtil", "Failed to getCertChain: " + e10.getMessage());
            return Collections.EMPTY_LIST;
        }
    }

    /* renamed from: b */
    public static List<X509Certificate> m8550b(String str) {
        return m8551b((List<String>) m8554c(str));
    }

    /* renamed from: b */
    public static boolean m8553b(X509Certificate x509Certificate, String str, String str2) {
        if (x509Certificate == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str2.equals(m8539a(x509Certificate.getSubjectDN().getName(), str));
    }

    /* renamed from: b */
    public static boolean m8552b(X509Certificate x509Certificate, String str) {
        return m8553b(x509Certificate, "OU", str);
    }

    /* renamed from: a */
    public static X509Certificate m8542a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return m8543a(Base64.decode(str));
        } catch (IllegalArgumentException e10) {
            HMSLog.m8725e("X509CertUtil", "getCert failed : " + e10.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static X509Certificate m8543a(byte[] bArr) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
        } catch (CertificateException e10) {
            HMSLog.m8725e("X509CertUtil", "Failed to get cert: " + e10.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static String m8539a(String str, String str2) {
        int iIndexOf = str.toUpperCase(Locale.getDefault()).indexOf(str2 + ContainerUtils.KEY_VALUE_DELIMITER);
        if (iIndexOf == -1) {
            return null;
        }
        int iIndexOf2 = str.indexOf(",", iIndexOf);
        if (iIndexOf2 != -1) {
            return str.substring(iIndexOf + str2.length() + 1, iIndexOf2);
        }
        return str.substring(iIndexOf + str2.length() + 1);
    }

    /* renamed from: a */
    public static boolean m8544a(X509Certificate x509Certificate) {
        if (x509Certificate == null || x509Certificate.getBasicConstraints() == -1) {
            return false;
        }
        boolean[] keyUsage = x509Certificate.getKeyUsage();
        if (5 < keyUsage.length) {
            return keyUsage[5];
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m8549a(List<X509Certificate> list) {
        for (int i10 = 0; i10 < list.size() - 1; i10++) {
            if (!m8544a(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m8545a(X509Certificate x509Certificate, String str) {
        return m8553b(x509Certificate, "CN", str);
    }

    /* renamed from: a */
    public static boolean m8546a(X509Certificate x509Certificate, String str, String str2) {
        try {
            return m8548a(x509Certificate, str.getBytes(Request.DEFAULT_CHARSET), Base64.decode(str2));
        } catch (UnsupportedEncodingException | IllegalArgumentException e10) {
            HMSLog.m8725e("X509CertUtil", " plainText exception: " + e10.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m8548a(X509Certificate x509Certificate, byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        try {
            Signature signature = Signature.getInstance(x509Certificate.getSigAlgName());
            signature.initVerify(x509Certificate.getPublicKey());
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e10) {
            HMSLog.m8725e("X509CertUtil", "failed checkSignature : " + e10.getMessage());
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x004d: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:14:0x004d */
    /* renamed from: a */
    public static X509Certificate m8541a(Context context, String str) throws Throwable {
        InputStream inputStream;
        InputStream inputStreamOpen;
        KeyStore keyStore;
        InputStream inputStream2 = null;
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        keyStore = KeyStore.getInstance("bks");
                        inputStreamOpen = context.getAssets().open("hmsrootcas.bks");
                        try {
                            keyStore.load(inputStreamOpen, "".toCharArray());
                        } catch (IOException e10) {
                            e = e10;
                            HMSLog.m8725e("X509CertUtil", "exception:" + e.getMessage());
                            IOUtils.closeQuietly(inputStreamOpen);
                            return null;
                        } catch (KeyStoreException e11) {
                            e = e11;
                            HMSLog.m8725e("X509CertUtil", "exception:" + e.getMessage());
                            IOUtils.closeQuietly(inputStreamOpen);
                            return null;
                        } catch (NoSuchAlgorithmException e12) {
                            e = e12;
                            HMSLog.m8725e("X509CertUtil", "exception:" + e.getMessage());
                            IOUtils.closeQuietly(inputStreamOpen);
                            return null;
                        } catch (CertificateException e13) {
                            e = e13;
                            HMSLog.m8725e("X509CertUtil", "exception:" + e.getMessage());
                            IOUtils.closeQuietly(inputStreamOpen);
                            return null;
                        }
                    } catch (IOException e14) {
                        e = e14;
                        inputStreamOpen = null;
                        HMSLog.m8725e("X509CertUtil", "exception:" + e.getMessage());
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    } catch (KeyStoreException e15) {
                        e = e15;
                        inputStreamOpen = null;
                        HMSLog.m8725e("X509CertUtil", "exception:" + e.getMessage());
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    } catch (NoSuchAlgorithmException e16) {
                        e = e16;
                        inputStreamOpen = null;
                        HMSLog.m8725e("X509CertUtil", "exception:" + e.getMessage());
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    } catch (CertificateException e17) {
                        e = e17;
                        inputStreamOpen = null;
                        HMSLog.m8725e("X509CertUtil", "exception:" + e.getMessage());
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        IOUtils.closeQuietly(inputStream2);
                        throw th;
                    }
                    if (!keyStore.containsAlias(str)) {
                        HMSLog.m8725e("X509CertUtil", "Not include alias " + str);
                        HMSPackageManager.getInstance(context).setUseOldCertificate(true);
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    }
                    Certificate certificate = keyStore.getCertificate(str);
                    if (!(certificate instanceof X509Certificate)) {
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    }
                    X509Certificate x509Certificate = (X509Certificate) certificate;
                    x509Certificate.checkValidity();
                    IOUtils.closeQuietly(inputStreamOpen);
                    return x509Certificate;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
            }
        }
        HMSLog.m8725e("X509CertUtil", "args are error");
        return null;
    }

    /* renamed from: a */
    public static X509Certificate m8540a(Context context) {
        return m8541a(context, "052root");
    }
}
