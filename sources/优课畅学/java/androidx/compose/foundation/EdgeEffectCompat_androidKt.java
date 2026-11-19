package androidx.compose.foundation;

import android.view.ViewConfiguration;
import androidx.compose.p013ui.unit.Density;

/* loaded from: classes.dex */
public final class EdgeEffectCompat_androidKt {
    private static final double DecelMinusOne;
    private static final double DecelerationRate;
    private static final float GravityEarth = 9.80665f;
    private static final float InchesPerMeter = 39.37f;
    private static final float Inflection = 0.35f;
    private static final float PlatformFlingScrollFriction = ViewConfiguration.getScrollFriction();

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        DecelerationRate = dLog;
        DecelMinusOne = dLog - 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float flingDistance(Density density, float f10) {
        double density2 = density.getDensity() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f10) * Inflection;
        float f11 = PlatformFlingScrollFriction;
        return (float) (f11 * density2 * Math.exp((DecelerationRate / DecelMinusOne) * Math.log(dAbs / (f11 * density2))));
    }
}
