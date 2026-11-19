package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class ContrastCurve {
    private final double high;
    private final double low;
    private final double medium;
    private final double normal;

    public ContrastCurve(double d6, double d7, double d8, double d9) {
        this.low = d6;
        this.normal = d7;
        this.medium = d8;
        this.high = d9;
    }

    public double getContrast(double d6) {
        return d6 <= -1.0d ? this.low : d6 < 0.0d ? MathUtils.lerp(this.low, this.normal, (d6 - (-1.0d)) / 1.0d) : d6 < 0.5d ? MathUtils.lerp(this.normal, this.medium, (d6 - 0.0d) / 0.5d) : d6 < 1.0d ? MathUtils.lerp(this.medium, this.high, (d6 - 0.5d) / 0.5d) : this.high;
    }
}
