package androidx.compose.p013ui.unit.fontscaling;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public final class MathUtils {
    public static final int $stable = 0;
    public static final MathUtils INSTANCE = new MathUtils();

    private MathUtils() {
    }

    public final float constrainedMap(float f10, float f11, float f12, float f13, float f14) {
        return lerp(f10, f11, Math.max(0.0f, Math.min(1.0f, lerpInv(f12, f13, f14))));
    }

    public final float lerp(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    public final float lerpInv(float f10, float f11, float f12) {
        if (f10 == f11) {
            return 0.0f;
        }
        return (f12 - f10) / (f11 - f10);
    }
}
