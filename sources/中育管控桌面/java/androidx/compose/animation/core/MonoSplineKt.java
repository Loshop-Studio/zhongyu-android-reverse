package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\u001a8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0000\u001a8\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m7880d2 = {"MonoSplineIsExtrapolate", "", "hermiteDifferential", "", "h", "x", "y1", "y2", "t1", "t2", "hermiteInterpolate", "animation-core_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public final class MonoSplineKt {
    private static final boolean MonoSplineIsExtrapolate = true;

    public static final float hermiteDifferential(float f6, float f7, float f8, float f9, float f10, float f11) {
        float f12 = f7 * f7;
        float f13 = 2;
        return (f6 * ((f10 - ((f13 * f7) * ((f13 * f10) + f11))) + ((3 * (f10 + f11)) * f12))) - ((6 * (f7 - f12)) * (f8 - f9));
    }

    public static final float hermiteInterpolate(float f6, float f7, float f8, float f9, float f10, float f11) {
        float f12 = f7 * f7;
        float f13 = f12 * f7;
        float f14 = 2;
        return ((((f10 * f6) * ((f7 - (f14 * f12)) + f13)) + ((f6 * f11) * (f13 - f12))) + f8) - (((3 * f12) - (f14 * f13)) * (f8 - f9));
    }
}
