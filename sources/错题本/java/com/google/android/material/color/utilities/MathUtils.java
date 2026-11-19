package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class MathUtils {
    private MathUtils() {
    }

    public static double clampDouble(double d9, double d10, double d11) {
        return d11 < d9 ? d9 : d11 > d10 ? d10 : d11;
    }

    public static int clampInt(int i, int i8, int i9) {
        return i9 < i ? i : i9 > i8 ? i8 : i9;
    }

    public static double differenceDegrees(double d9, double d10) {
        return 180.0d - Math.abs(Math.abs(d9 - d10) - 180.0d);
    }

    public static double lerp(double d9, double d10, double d11) {
        return (d11 * d10) + ((1.0d - d11) * d9);
    }

    public static double[] matrixMultiply(double[] dArr, double[][] dArr2) {
        double d9 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d10 = dArr3[0] * d9;
        double d11 = dArr[1];
        double d12 = (dArr3[1] * d11) + d10;
        double d13 = dArr[2];
        double d14 = (dArr3[2] * d13) + d12;
        double[] dArr4 = dArr2[1];
        double d15 = (dArr4[2] * d13) + (dArr4[1] * d11) + (dArr4[0] * d9);
        double[] dArr5 = dArr2[2];
        return new double[]{d14, d15, (d13 * dArr5[2]) + (d11 * dArr5[1]) + (d9 * dArr5[0])};
    }

    public static double rotationDirection(double d9, double d10) {
        return sanitizeDegreesDouble(d10 - d9) <= 180.0d ? 1.0d : -1.0d;
    }

    public static double sanitizeDegreesDouble(double d9) {
        double d10 = d9 % 360.0d;
        return d10 < AudioStats.AUDIO_AMPLITUDE_NONE ? d10 + 360.0d : d10;
    }

    public static int sanitizeDegreesInt(int i) {
        int i8 = i % 360;
        return i8 < 0 ? i8 + 360 : i8;
    }

    public static int signum(double d9) {
        if (d9 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            return -1;
        }
        return d9 == AudioStats.AUDIO_AMPLITUDE_NONE ? 0 : 1;
    }
}
