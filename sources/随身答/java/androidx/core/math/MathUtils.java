package androidx.core.math;

import androidx.collection.SieveCacheKt;

/* loaded from: classes2.dex */
public class MathUtils {
    private MathUtils() {
    }

    public static int addExact(int i9, int i10) {
        int i11 = i9 + i10;
        if ((i9 >= 0) == (i10 >= 0)) {
            if ((i9 >= 0) != (i11 >= 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return i11;
    }

    public static double clamp(double d10, double d11, double d12) {
        return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
    }

    public static int decrementExact(int i9) {
        if (i9 != Integer.MIN_VALUE) {
            return i9 - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int incrementExact(int i9) {
        if (i9 != Integer.MAX_VALUE) {
            return i9 + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int multiplyExact(int i9, int i10) {
        int i11 = i9 * i10;
        if (i9 == 0 || i10 == 0 || (i11 / i9 == i10 && i11 / i10 == i9)) {
            return i11;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int negateExact(int i9) {
        if (i9 != Integer.MIN_VALUE) {
            return -i9;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int subtractExact(int i9, int i10) {
        int i11 = i9 - i10;
        if ((i9 < 0) != (i10 < 0)) {
            if ((i9 < 0) != (i11 < 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return i11;
    }

    public static int toIntExact(long j9) {
        if (j9 > SieveCacheKt.NodeLinkMask || j9 < SieveCacheKt.NodeMetaAndPreviousMask) {
            throw new ArithmeticException("integer overflow");
        }
        return (int) j9;
    }

    public static long addExact(long j9, long j10) {
        long j11 = j9 + j10;
        if ((j9 >= 0) == (j10 >= 0)) {
            if ((j9 >= 0) != (j11 >= 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return j11;
    }

    public static float clamp(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    public static long decrementExact(long j9) {
        if (j9 != Long.MIN_VALUE) {
            return j9 - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long incrementExact(long j9) {
        if (j9 != Long.MAX_VALUE) {
            return j9 + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long negateExact(long j9) {
        if (j9 != Long.MIN_VALUE) {
            return -j9;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long subtractExact(long j9, long j10) {
        long j11 = j9 - j10;
        if ((j9 < 0) != (j10 < 0)) {
            if ((j9 < 0) != (j11 < 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return j11;
    }

    public static int clamp(int i9, int i10, int i11) {
        return i9 < i10 ? i10 : i9 > i11 ? i11 : i9;
    }

    public static long multiplyExact(long j9, long j10) {
        long j11 = j9 * j10;
        if (j9 == 0 || j10 == 0 || (j11 / j9 == j10 && j11 / j10 == j9)) {
            return j11;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long clamp(long j9, long j10, long j11) {
        return j9 < j10 ? j10 : j9 > j11 ? j11 : j9;
    }
}
