package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class PointProviderLab implements PointProvider {
    @Override // com.google.android.material.color.utilities.PointProvider
    public double distance(double[] dArr, double[] dArr2) {
        double d9 = dArr[0] - dArr2[0];
        double d10 = dArr[1] - dArr2[1];
        double d11 = dArr[2] - dArr2[2];
        return (d11 * d11) + (d10 * d10) + (d9 * d9);
    }

    @Override // com.google.android.material.color.utilities.PointProvider
    public double[] fromInt(int i) {
        double[] dArrLabFromArgb = ColorUtils.labFromArgb(i);
        return new double[]{dArrLabFromArgb[0], dArrLabFromArgb[1], dArrLabFromArgb[2]};
    }

    @Override // com.google.android.material.color.utilities.PointProvider
    public int toInt(double[] dArr) {
        return ColorUtils.argbFromLab(dArr[0], dArr[1], dArr[2]);
    }
}
