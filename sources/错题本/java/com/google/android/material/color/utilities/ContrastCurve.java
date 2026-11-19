package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class ContrastCurve {
    private final double high;
    private final double low;
    private final double medium;
    private final double normal;

    public ContrastCurve(double d9, double d10, double d11, double d12) {
        this.low = d9;
        this.normal = d10;
        this.medium = d11;
        this.high = d12;
    }

    public double getContrast(double d9) {
        return d9 <= -1.0d ? this.low : d9 < AudioStats.AUDIO_AMPLITUDE_NONE ? MathUtils.lerp(this.low, this.normal, (d9 - (-1.0d)) / 1.0d) : d9 < 0.5d ? MathUtils.lerp(this.normal, this.medium, (d9 - AudioStats.AUDIO_AMPLITUDE_NONE) / 0.5d) : d9 < 1.0d ? MathUtils.lerp(this.medium, this.high, (d9 - 0.5d) / 0.5d) : this.high;
    }
}
