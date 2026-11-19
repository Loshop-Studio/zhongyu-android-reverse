package androidx.collection;

/* renamed from: androidx.collection.c */
/* loaded from: classes.dex */
class C0249c {

    /* renamed from: a */
    static final int[] f1292a = new int[0];

    /* renamed from: b */
    static final long[] f1293b = new long[0];

    /* renamed from: c */
    static final Object[] f1294c = new Object[0];

    /* renamed from: a */
    static int m1103a(int[] iArr, int i4, int i5) {
        int i6 = i4 - 1;
        int i7 = 0;
        while (i7 <= i6) {
            int i8 = (i7 + i6) >>> 1;
            int i9 = iArr[i8];
            if (i9 < i5) {
                i7 = i8 + 1;
            } else {
                if (i9 <= i5) {
                    return i8;
                }
                i6 = i8 - 1;
            }
        }
        return ~i7;
    }

    /* renamed from: b */
    static int m1104b(long[] jArr, int i4, long j4) {
        int i5 = i4 - 1;
        int i6 = 0;
        while (i6 <= i5) {
            int i7 = (i6 + i5) >>> 1;
            long j5 = jArr[i7];
            if (j5 < j4) {
                i6 = i7 + 1;
            } else {
                if (j5 <= j4) {
                    return i7;
                }
                i5 = i7 - 1;
            }
        }
        return ~i6;
    }

    /* renamed from: c */
    public static boolean m1105c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: d */
    public static int m1106d(int i4) {
        for (int i5 = 4; i5 < 32; i5++) {
            int i6 = (1 << i5) - 12;
            if (i4 <= i6) {
                return i6;
            }
        }
        return i4;
    }

    /* renamed from: e */
    public static int m1107e(int i4) {
        return m1106d(i4 * 4) / 4;
    }

    /* renamed from: f */
    public static int m1108f(int i4) {
        return m1106d(i4 * 8) / 8;
    }
}
