package androidx.core.math;

import androidx.collection.SieveCacheKt;

/* loaded from: classes2.dex */
public class MathUtils {
    private MathUtils() {
    }

    public static int addExact(int i, int i8) {
        int i9 = i + i8;
        if ((i >= 0) == (i8 >= 0)) {
            if ((i >= 0) != (i9 >= 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return i9;
    }

    public static double clamp(double d9, double d10, double d11) {
        return d9 < d10 ? d10 : d9 > d11 ? d11 : d9;
    }

    public static int decrementExact(int i) {
        if (i != Integer.MIN_VALUE) {
            return i - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int incrementExact(int i) {
        if (i != Integer.MAX_VALUE) {
            return i + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int multiplyExact(int i, int i8) {
        int i9 = i * i8;
        if (i == 0 || i8 == 0 || (i9 / i == i8 && i9 / i8 == i)) {
            return i9;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int negateExact(int i) {
        if (i != Integer.MIN_VALUE) {
            return -i;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int subtractExact(int i, int i8) {
        int i9 = i - i8;
        if ((i < 0) != (i8 < 0)) {
            if ((i < 0) != (i9 < 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return i9;
    }

    public static int toIntExact(long j7) {
        if (j7 > SieveCacheKt.NodeLinkMask || j7 < SieveCacheKt.NodeMetaAndPreviousMask) {
            throw new ArithmeticException("integer overflow");
        }
        return (int) j7;
    }

    public static long addExact(long j7, long j8) {
        long j9 = j7 + j8;
        if ((j7 >= 0) == (j8 >= 0)) {
            if ((j7 >= 0) != (j9 >= 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return j9;
    }

    public static float clamp(float f, float f7, float f8) {
        return f < f7 ? f7 : f > f8 ? f8 : f;
    }

    public static long decrementExact(long j7) {
        if (j7 != Long.MIN_VALUE) {
            return j7 - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long incrementExact(long j7) {
        if (j7 != Long.MAX_VALUE) {
            return j7 + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long negateExact(long j7) {
        if (j7 != Long.MIN_VALUE) {
            return -j7;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long subtractExact(long j7, long j8) {
        long j9 = j7 - j8;
        if ((j7 < 0) != (j8 < 0)) {
            if ((j7 < 0) != (j9 < 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return j9;
    }

    public static int clamp(int i, int i8, int i9) {
        return i < i8 ? i8 : i > i9 ? i9 : i;
    }

    public static long multiplyExact(long j7, long j8) {
        long j9 = j7 * j8;
        if (j7 == 0 || j8 == 0 || (j9 / j7 == j8 && j9 / j8 == j7)) {
            return j9;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long clamp(long j7, long j8, long j9) {
        return j7 < j8 ? j8 : j7 > j9 ? j9 : j7;
    }
}
