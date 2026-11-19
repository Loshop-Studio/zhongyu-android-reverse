package com.google.android.material.math;

/* loaded from: classes2.dex */
public final class MathUtils {
    public static final float DEFAULT_EPSILON = 1.0E-4f;

    private MathUtils() {
    }

    public static float dist(float f, float f7, float f8, float f9) {
        return (float) Math.hypot(f8 - f, f9 - f7);
    }

    public static float distanceToFurthestCorner(float f, float f7, float f8, float f9, float f10, float f11) {
        return max(dist(f, f7, f8, f9), dist(f, f7, f10, f9), dist(f, f7, f10, f11), dist(f, f7, f8, f11));
    }

    public static float floorMod(float f, int i) {
        float f7 = i;
        int i8 = (int) (f / f7);
        if (Math.signum(f) * f7 < 0.0f && i8 * i != f) {
            i8--;
        }
        return f - (i8 * i);
    }

    public static boolean geq(float f, float f7, float f8) {
        return f + f8 >= f7;
    }

    public static float lerp(float f, float f7, float f8) {
        return (f8 * f7) + ((1.0f - f8) * f);
    }

    private static float max(float f, float f7, float f8, float f9) {
        return (f <= f7 || f <= f8 || f <= f9) ? (f7 <= f8 || f7 <= f9) ? f8 > f9 ? f8 : f9 : f7 : f;
    }

    public static int floorMod(int i, int i8) {
        int i9 = i / i8;
        if ((i ^ i8) < 0 && i9 * i8 != i) {
            i9--;
        }
        return i - (i9 * i8);
    }
}
