package p121dd;

import p325rc.AbstractC10964p;

/* renamed from: dd.a */
/* loaded from: classes6.dex */
public abstract class AbstractC9024a {

    /* renamed from: a */
    public static final byte[] f21017a;

    /* renamed from: b */
    public static final int[] f21018b;

    /* renamed from: c */
    public static final byte[] f21019c;

    /* renamed from: d */
    public static final int[] f21020d;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f21017a = bArr;
        int[] iArr = new int[256];
        AbstractC10964p.m23989D(iArr, -1, 0, 0, 6, null);
        iArr[61] = -2;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            iArr[bArr[i11]] = i12;
            i11++;
            i12++;
        }
        f21018b = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        f21019c = bArr2;
        int[] iArr2 = new int[256];
        AbstractC10964p.m23989D(iArr2, -1, 0, 0, 6, null);
        iArr2[61] = -2;
        int length2 = bArr2.length;
        int i13 = 0;
        while (i10 < length2) {
            iArr2[bArr2[i10]] = i13;
            i10++;
            i13++;
        }
        f21020d = iArr2;
    }
}
