package p148s;

import java.lang.reflect.Array;

/* renamed from: s.e */
/* loaded from: classes.dex */
final class C3367e {
    /* renamed from: a */
    public static int[] m10227a(int[] iArr, int i4, int i5) {
        if (i4 + 1 > iArr.length) {
            int[] iArr2 = new int[m10229c(i4)];
            System.arraycopy(iArr, 0, iArr2, 0, i4);
            iArr = iArr2;
        }
        iArr[i4] = i5;
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Object[]] */
    /* renamed from: b */
    public static <T> T[] m10228b(T[] tArr, int i4, T t3) {
        if (i4 + 1 > tArr.length) {
            ?? r02 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m10229c(i4));
            System.arraycopy(tArr, 0, r02, 0, i4);
            tArr = r02;
        }
        tArr[i4] = t3;
        return tArr;
    }

    /* renamed from: c */
    public static int m10229c(int i4) {
        if (i4 <= 4) {
            return 8;
        }
        return i4 * 2;
    }
}
