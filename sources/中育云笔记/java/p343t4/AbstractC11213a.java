package p343t4;

/* renamed from: t4.a */
/* loaded from: classes5.dex */
public abstract class AbstractC11213a {

    /* renamed from: a */
    public static final char[] f26896a = "0123456789ABCDEF".toCharArray();

    /* renamed from: a */
    public static byte[] m24931a(char[] cArr) {
        if ((cArr.length & 1) != 0) {
            throw new IllegalArgumentException("Odd number of characters.");
        }
        byte[] bArr = new byte[cArr.length >> 1];
        int i10 = 0;
        int i11 = 0;
        while (i10 < cArr.length) {
            int iDigit = Character.digit(cArr[i10], 16);
            if (iDigit == -1) {
                throw new IllegalArgumentException("Illegal hexadecimal character at index " + i10);
            }
            int i12 = i10 + 1;
            int iDigit2 = Character.digit(cArr[i12], 16);
            if (iDigit2 == -1) {
                throw new IllegalArgumentException("Illegal hexadecimal character at index " + i12);
            }
            i10 += 2;
            bArr[i11] = (byte) (((iDigit << 4) | iDigit2) & 255);
            i11++;
        }
        return bArr;
    }

    /* renamed from: b */
    public static byte[] m24932b(String str) {
        return m24931a(str.toCharArray());
    }

    /* renamed from: c */
    public static String m24933c(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            char[] cArr = f26896a;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }
}
