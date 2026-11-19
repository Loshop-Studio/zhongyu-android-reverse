package com.taobao.sophix.p099e;

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
/* loaded from: classes5.dex */
public class C7743d {

    /* renamed from: a */
    private static final char[] f13403a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m10389a(String str, String str2) {
        try {
            return m10390a(str.getBytes("utf-8"), str2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m10390a(byte[] bArr, String str) throws NoSuchAlgorithmException, InvalidKeyException {
        if (bArr != null && !TextUtils.isEmpty(str)) {
            try {
                Mac mac = Mac.getInstance("HmacSHA1");
                mac.init(new SecretKeySpec(str.getBytes("utf-8"), "HmacSHA1"));
                char[] cArrM10391a = m10391a(mac.doFinal(bArr));
                if (cArrM10391a != null) {
                    return new String(cArrM10391a);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* renamed from: a */
    public static String m10388a(File file, String str) throws Throwable {
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
                                int i10 = bufferedInputStream.read(bArr);
                                if (i10 <= -1) {
                                    break;
                                }
                                mac.update(bArr, 0, i10);
                            }
                            char[] cArrM10391a = m10391a(mac.doFinal());
                            if (cArrM10391a != null && cArrM10391a.length > 0) {
                                String str2 = new String(cArrM10391a);
                                C7742c.m10382a(bufferedInputStream);
                                return str2;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            e.printStackTrace();
                            C7742c.m10382a(bufferedInputStream);
                            return null;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        bufferedInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        C7742c.m10382a(closeable);
                        throw th;
                    }
                    C7742c.m10382a(bufferedInputStream);
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
    private static char[] m10391a(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f13403a;
            cArr[i10] = cArr2[(b10 & 240) >>> 4];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return cArr;
    }
}
