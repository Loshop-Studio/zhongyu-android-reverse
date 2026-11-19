package com.taobao.sophix.p069e;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.taobao.sophix.e.d */
/* loaded from: classes4.dex */
public class C6637d {

    /* renamed from: a */
    private static final char[] f5538a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m4877a(String str, String str2) {
        try {
            return m4878a(str.getBytes("utf-8"), str2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m4878a(byte[] bArr, String str) throws NoSuchAlgorithmException, InvalidKeyException {
        if (bArr != null && !TextUtils.isEmpty(str)) {
            try {
                Mac mac = Mac.getInstance("HmacSHA1");
                mac.init(new SecretKeySpec(str.getBytes("utf-8"), "HmacSHA1"));
                char[] cArrM4879a = m4879a(mac.doFinal(bArr));
                if (cArrM4879a != null) {
                    return new String(cArrM4879a);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* renamed from: a */
    public static String m4876a(File file, String str) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Closeable closeable = null;
        if (file != null && file.exists()) {
            ?? IsEmpty = TextUtils.isEmpty(str);
            try {
                if (IsEmpty == 0) {
                    try {
                        bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                        try {
                            Mac mac = Mac.getInstance("HmacSHA1");
                            mac.init(new SecretKeySpec(str.getBytes("utf-8"), "HmacSHA1"));
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int i9 = bufferedInputStream.read(bArr);
                                if (i9 <= -1) {
                                    break;
                                }
                                mac.update(bArr, 0, i9);
                            }
                            char[] cArrM4879a = m4879a(mac.doFinal());
                            if (cArrM4879a != null && cArrM4879a.length > 0) {
                                String str2 = new String(cArrM4879a);
                                C6636c.m4870a(bufferedInputStream);
                                return str2;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            e.printStackTrace();
                            C6636c.m4870a(bufferedInputStream);
                            return null;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        bufferedInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        C6636c.m4870a(closeable);
                        throw th;
                    }
                    C6636c.m4870a(bufferedInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = IsEmpty;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static char[] m4879a(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i9 = 0;
        for (byte b10 : bArr) {
            int i10 = i9 + 1;
            char[] cArr2 = f5538a;
            cArr[i9] = cArr2[(b10 & 240) >>> 4];
            i9 += 2;
            cArr[i10] = cArr2[b10 & 15];
        }
        return cArr;
    }
}
