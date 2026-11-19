package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\u001a8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0000\u001a8\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m13558d2 = {"MonoSplineIsExtrapolate", "", "hermiteDifferential", "", "h", "x", "y1", "y2", "t1", "t2", "hermiteInterpolate", "animation-core_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class MonoSplineKt {
    private static final boolean MonoSplineIsExtrapolate = true;

    public static final float hermiteDifferential(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f11 * f11;
        float f17 = 2;
        return (f10 * ((f14 - ((f17 * f11) * ((f17 * f14) + f15))) + ((3 * (f14 + f15)) * f16))) - ((6 * (f11 - f16)) * (f12 - f13));
    }

    public static final float hermiteInterpolate(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f11 * f11;
        float f17 = f16 * f11;
        float f18 = 2;
        return ((((f14 * f10) * ((f11 - (f18 * f16)) + f17)) + ((f10 * f15) * (f17 - f16))) + f12) - (((3 * f16) - (f18 * f17)) * (f12 - f13));
    }
}
