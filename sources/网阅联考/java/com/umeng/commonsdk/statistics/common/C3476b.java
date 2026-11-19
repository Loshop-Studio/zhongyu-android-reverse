package com.umeng.commonsdk.statistics.common;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/* renamed from: com.umeng.commonsdk.statistics.common.b */
/* loaded from: classes2.dex */
public class C3476b {

    /* renamed from: a */
    public static int f2765a;

    /* renamed from: a */
    public static byte[] m3711a(String str, String str2) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m3712a(str.getBytes(str2));
    }

    /* renamed from: b */
    public static byte[] m3713b(byte[] bArr) throws DataFormatException, UnsupportedEncodingException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        Inflater inflater = new Inflater();
        int i4 = 0;
        inflater.setInput(bArr, 0, bArr.length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        while (!inflater.needsInput()) {
            int iInflate = inflater.inflate(bArr2);
            byteArrayOutputStream.write(bArr2, i4, iInflate);
            i4 += iInflate;
        }
        inflater.end();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static byte[] m3712a(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[8192];
        f2765a = 0;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            while (!deflater.finished()) {
                try {
                    int iDeflate = deflater.deflate(bArr2);
                    f2765a += iDeflate;
                    byteArrayOutputStream2.write(bArr2, 0, iDeflate);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    throw th;
                }
            }
            deflater.end();
            byteArrayOutputStream2.close();
            return byteArrayOutputStream2.toByteArray();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public static String m3710a(byte[] bArr, String str) throws DataFormatException, UnsupportedEncodingException {
        byte[] bArrM3713b = m3713b(bArr);
        if (bArrM3713b != null) {
            return new String(bArrM3713b, str);
        }
        return null;
    }
}
