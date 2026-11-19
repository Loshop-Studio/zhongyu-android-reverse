package io.reactivex.internal.util;

/* loaded from: classes5.dex */
public final class Pow2 {
    private Pow2() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean isPowerOfTwo(int i9) {
        return (i9 & (i9 + (-1))) == 0;
    }

    public static int roundToPowerOfTwo(int i9) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i9 - 1));
    }
}
