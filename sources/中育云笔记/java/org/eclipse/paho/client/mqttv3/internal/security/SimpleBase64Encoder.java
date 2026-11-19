package org.eclipse.paho.client.mqttv3.internal.security;

import com.tendcloud.tenddata.C7863av;

/* loaded from: classes6.dex */
public class SimpleBase64Encoder {
    private static final String PWDCHARS_STRING = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final char[] PWDCHARS_ARRAY = PWDCHARS_STRING.toCharArray();

    public static byte[] decode(String str) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        byte[] bArr = new byte[(length * 3) / 4];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (length < 4) {
                break;
            }
            long jFrom64 = from64(bytes, i10, 4);
            length -= 4;
            i10 += 4;
            for (int i12 = 2; i12 >= 0; i12--) {
                bArr[i11 + i12] = (byte) (jFrom64 & 255);
                jFrom64 >>= 8;
            }
            i11 += 3;
        }
        if (length == 3) {
            long jFrom642 = from64(bytes, i10, 3);
            for (int i13 = 1; i13 >= 0; i13--) {
                bArr[i11 + i13] = (byte) (jFrom642 & 255);
                jFrom642 >>= 8;
            }
        }
        if (length == 2) {
            bArr[i11] = (byte) (from64(bytes, i10, 2) & 255);
        }
        return bArr;
    }

    public static String encode(byte[] bArr) {
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer(((length + 2) / 3) * 4);
        int i10 = 0;
        while (length >= 3) {
            stringBuffer.append(to64(((bArr[i10] & C7863av.f14384i) << 16) | ((bArr[i10 + 1] & C7863av.f14384i) << 8) | (bArr[i10 + 2] & C7863av.f14384i), 4));
            i10 += 3;
            length -= 3;
        }
        if (length == 2) {
            stringBuffer.append(to64(((bArr[i10] & C7863av.f14384i) << 8) | (bArr[i10 + 1] & C7863av.f14384i), 3));
        }
        if (length == 1) {
            stringBuffer.append(to64(bArr[i10] & C7863av.f14384i, 2));
        }
        return stringBuffer.toString();
    }

    private static final long from64(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        long j10 = 0;
        while (i11 > 0) {
            i11--;
            int i13 = i10 + 1;
            byte b10 = bArr[i10];
            long j11 = b10 == 47 ? 1L : 0L;
            if (b10 >= 48 && b10 <= 57) {
                j11 = b10 - 46;
            }
            if (b10 >= 65 && b10 <= 90) {
                j11 = b10 - 53;
            }
            if (b10 >= 97 && b10 <= 122) {
                j11 = b10 - 59;
            }
            j10 += j11 << i12;
            i12 += 6;
            i10 = i13;
        }
        return j10;
    }

    private static final String to64(long j10, int i10) {
        StringBuffer stringBuffer = new StringBuffer(i10);
        while (i10 > 0) {
            i10--;
            stringBuffer.append(PWDCHARS_ARRAY[(int) (63 & j10)]);
            j10 >>= 6;
        }
        return stringBuffer.toString();
    }
}
