package io.reactivex.internal.util;

/* loaded from: classes4.dex */
public final class Pow2 {
    private Pow2() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean isPowerOfTwo(int i6) {
        return (i6 & (i6 + (-1))) == 0;
    }

    public static int roundToPowerOfTwo(int i6) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i6 - 1));
    }
}
