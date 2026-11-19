package com.tendcloud.tenddata;

import androidx.camera.video.AudioStats;
import java.text.DecimalFormat;

/* renamed from: com.tendcloud.tenddata.dg */
/* loaded from: classes5.dex */
final class C7929dg {
    /* renamed from: a */
    public static int m11693a(int[][] iArr) {
        if (iArr != null) {
            try {
                if (iArr.length >= 4) {
                    try {
                        return m11692a(new double[][]{new double[]{r4 * r4 * r4, r4 * r4, iArr[0][0], 1.0d, r2[1]}, new double[]{r10 * r10 * r10, r10 * r10, iArr[1][0], 1.0d, r9[1]}, new double[]{r4 * r4 * r4, r4 * r4, iArr[2][0], 1.0d, r3[1]}, new double[]{r3 * r3 * r3, r3 * r3, iArr[3][0], 1.0d, r0[1]}});
                    } catch (Throwable unused) {
                        return 0;
                    }
                }
            } catch (Throwable unused2) {
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: b */
    private static double m11694b(double[][] dArr) {
        double[] dArr2 = dArr[1];
        double d10 = dArr2[1];
        double d11 = dArr2[2];
        double d12 = dArr2[3];
        double[] dArr3 = dArr[2];
        double d13 = dArr3[1];
        double d14 = dArr3[2];
        double d15 = dArr3[3];
        double[] dArr4 = dArr[3];
        double d16 = dArr4[1];
        double d17 = dArr4[2];
        double d18 = dArr4[3];
        double[][] dArr5 = {new double[]{d10, d11, d12}, new double[]{d13, d14, d15}, new double[]{d16, d17, d18}};
        double d19 = dArr2[0];
        double d20 = dArr3[0];
        double d21 = dArr4[0];
        return (Math.pow(-1.0d, AudioStats.AUDIO_AMPLITUDE_NONE) * dArr[0][0] * m11695c(dArr5)) + (Math.pow(-1.0d, 1.0d) * dArr[0][1] * m11695c(new double[][]{new double[]{d19, d11, d12}, new double[]{d20, d14, d15}, new double[]{d21, d17, d18}})) + (Math.pow(-1.0d, 2.0d) * dArr[0][2] * m11695c(new double[][]{new double[]{d19, d10, d12}, new double[]{d20, d13, d15}, new double[]{d21, d16, d18}})) + (Math.pow(-1.0d, 3.0d) * dArr[0][3] * m11695c(new double[][]{new double[]{d19, d10, d11}, new double[]{d20, d13, d14}, new double[]{d21, d16, d17}}));
    }

    /* renamed from: c */
    private static double m11695c(double[][] dArr) {
        double[] dArr2 = dArr[0];
        double d10 = dArr2[0];
        double[] dArr3 = dArr[1];
        double d11 = dArr3[1];
        double[] dArr4 = dArr[2];
        double d12 = dArr4[2];
        double d13 = dArr2[1];
        double d14 = dArr3[2];
        double d15 = dArr4[0];
        double d16 = (d10 * d11 * d12) + (d13 * d14 * d15);
        double d17 = dArr2[2];
        double d18 = dArr3[0];
        double d19 = dArr4[1];
        return (((d16 + ((d17 * d18) * d19)) + (((-d17) * d11) * d15)) - ((d13 * d18) * d12)) - ((d10 * d19) * d14);
    }

    /* renamed from: a */
    private static int m11692a(double[][] dArr) {
        double[] dArr2 = dArr[0];
        double d10 = dArr2[0];
        double d11 = dArr2[1];
        double d12 = dArr2[2];
        double[] dArr3 = {d10, d11, d12, dArr2[3]};
        double[] dArr4 = dArr[1];
        double d13 = dArr4[0];
        double d14 = dArr4[1];
        double d15 = dArr4[2];
        double[] dArr5 = {d13, d14, d15, dArr4[3]};
        double[] dArr6 = dArr[2];
        double d16 = dArr6[0];
        double d17 = dArr6[1];
        double d18 = dArr6[2];
        double[] dArr7 = {d16, d17, d18, dArr6[3]};
        double[] dArr8 = dArr[3];
        double d19 = dArr8[0];
        double d20 = dArr8[1];
        double d21 = dArr8[2];
        double[][] dArr9 = {dArr3, dArr5, dArr7, new double[]{d19, d20, d21, dArr8[3]}};
        double[][] dArr10 = {new double[]{d10, d11, d12, dArr2[4]}, new double[]{d13, d14, d15, dArr4[4]}, new double[]{d16, d17, d18, dArr6[4]}, new double[]{d19, d20, d21, dArr8[4]}};
        double dM11694b = m11694b(dArr9);
        if (dM11694b == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return 0;
        }
        return m11691a(m11694b(dArr10) / dM11694b);
    }

    /* renamed from: a */
    private static int m11691a(double d10) {
        try {
            return Integer.parseInt(new DecimalFormat("######0").format(d10));
        } catch (Throwable unused) {
            return 0;
        }
    }
}
