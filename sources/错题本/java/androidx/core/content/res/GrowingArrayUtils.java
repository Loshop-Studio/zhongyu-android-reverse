package androidx.core.content.res;

import java.lang.reflect.Array;

/* loaded from: classes2.dex */
final class GrowingArrayUtils {
    private GrowingArrayUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Object[]] */
    public static <T> T[] append(T[] tArr, int i, T t8) {
        if (i + 1 > tArr.length) {
            ?? r02 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), growSize(i));
            System.arraycopy(tArr, 0, r02, 0, i);
            tArr = r02;
        }
        tArr[i] = t8;
        return tArr;
    }

    public static int growSize(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    public static <T> T[] insert(T[] tArr, int i, int i8, T t8) {
        if (i + 1 <= tArr.length) {
            System.arraycopy(tArr, i8, tArr, i8 + 1, i - i8);
            tArr[i8] = t8;
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), growSize(i)));
        System.arraycopy(tArr, 0, tArr2, 0, i8);
        tArr2[i8] = t8;
        System.arraycopy(tArr, i8, tArr2, i8 + 1, tArr.length - i8);
        return tArr2;
    }

    public static int[] append(int[] iArr, int i, int i8) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[growSize(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i8;
        return iArr;
    }

    public static int[] insert(int[] iArr, int i, int i8, int i9) {
        if (i + 1 <= iArr.length) {
            System.arraycopy(iArr, i8, iArr, i8 + 1, i - i8);
            iArr[i8] = i9;
            return iArr;
        }
        int[] iArr2 = new int[growSize(i)];
        System.arraycopy(iArr, 0, iArr2, 0, i8);
        iArr2[i8] = i9;
        System.arraycopy(iArr, i8, iArr2, i8 + 1, iArr.length - i8);
        return iArr2;
    }

    public static long[] append(long[] jArr, int i, long j7) {
        if (i + 1 > jArr.length) {
            long[] jArr2 = new long[growSize(i)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            jArr = jArr2;
        }
        jArr[i] = j7;
        return jArr;
    }

    public static boolean[] append(boolean[] zArr, int i, boolean z8) {
        if (i + 1 > zArr.length) {
            boolean[] zArr2 = new boolean[growSize(i)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            zArr = zArr2;
        }
        zArr[i] = z8;
        return zArr;
    }

    public static long[] insert(long[] jArr, int i, int i8, long j7) {
        if (i + 1 <= jArr.length) {
            System.arraycopy(jArr, i8, jArr, i8 + 1, i - i8);
            jArr[i8] = j7;
            return jArr;
        }
        long[] jArr2 = new long[growSize(i)];
        System.arraycopy(jArr, 0, jArr2, 0, i8);
        jArr2[i8] = j7;
        System.arraycopy(jArr, i8, jArr2, i8 + 1, jArr.length - i8);
        return jArr2;
    }

    public static boolean[] insert(boolean[] zArr, int i, int i8, boolean z8) {
        if (i + 1 <= zArr.length) {
            System.arraycopy(zArr, i8, zArr, i8 + 1, i - i8);
            zArr[i8] = z8;
            return zArr;
        }
        boolean[] zArr2 = new boolean[growSize(i)];
        System.arraycopy(zArr, 0, zArr2, 0, i8);
        zArr2[i8] = z8;
        System.arraycopy(zArr, i8, zArr2, i8 + 1, zArr.length - i8);
        return zArr2;
    }
}
