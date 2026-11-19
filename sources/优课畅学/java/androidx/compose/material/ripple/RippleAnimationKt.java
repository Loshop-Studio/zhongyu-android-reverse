package androidx.compose.material.ripple;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.OffsetKt;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Density;

/* loaded from: classes2.dex */
public final class RippleAnimationKt {
    private static final float BoundedRippleExtraRadius = C3156Dp.m26899constructorimpl(10);
    private static final int FadeInDuration = 75;
    private static final int FadeOutDuration = 150;
    private static final int RadiusDuration = 225;

    /* renamed from: getRippleEndRadius-cSwnlzA, reason: not valid java name */
    public static final float m21717getRippleEndRadiuscSwnlzA(Density density, boolean z10, long j10) {
        float fM24033getDistanceimpl = Offset.m24033getDistanceimpl(OffsetKt.Offset(Size.m24104getWidthimpl(j10), Size.m24101getHeightimpl(j10))) / 2.0f;
        return z10 ? fM24033getDistanceimpl + density.mo20497toPx0680j_4(BoundedRippleExtraRadius) : fM24033getDistanceimpl;
    }

    /* renamed from: getRippleStartRadius-uvyYCjk, reason: not valid java name */
    public static final float m21718getRippleStartRadiusuvyYCjk(long j10) {
        return Math.max(Size.m24104getWidthimpl(j10), Size.m24101getHeightimpl(j10)) * 0.3f;
    }
}
