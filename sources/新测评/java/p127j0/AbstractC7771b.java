package p127j0;

import kotlin.UByte;

/* renamed from: j0.b */
/* loaded from: classes3.dex */
public abstract class AbstractC7771b {
    /* renamed from: a */
    public static int m13098a(byte[] bArr) {
        if (bArr == null || bArr.length > 4) {
            return 0;
        }
        int length = 0;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            length |= (bArr[i10] & UByte.MAX_VALUE) << (((bArr.length - i10) - 1) * 8);
        }
        return length;
    }

    /* renamed from: b */
    public static int m13099b(byte[] bArr, int i10, int i11) {
        if (bArr == null || i10 < 0 || i11 < 0 || bArr.length < i10 + i11) {
            return 0;
        }
        byte[] bArr2 = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr2[i12] = bArr[i10];
            i10++;
        }
        return m13098a(bArr2);
    }

    /* renamed from: c */
    public static byte[] m13100c(int i10) {
        return new byte[]{(byte) ((i10 >> 8) & 255), (byte) (i10 & 255)};
    }

    /* renamed from: d */
    public static byte[] m13101d(int i10) {
        return new byte[]{(byte) ((i10 >> 16) & 255), (byte) ((i10 >> 8) & 255), (byte) (i10 & 255)};
    }

    /* renamed from: e */
    public static byte[] m13102e(int i10) {
        return new byte[]{(byte) ((i10 >> 24) & 255), (byte) ((i10 >> 16) & 255), (byte) ((i10 >> 8) & 255), (byte) (i10 & 255)};
    }
}
