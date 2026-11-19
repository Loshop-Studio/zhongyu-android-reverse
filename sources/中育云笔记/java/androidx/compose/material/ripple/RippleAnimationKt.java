package androidx.compose.material.ripple;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.OffsetKt;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;

/* loaded from: classes2.dex */
public final class RippleAnimationKt {
    private static final float BoundedRippleExtraRadius = C3186Dp.m33501constructorimpl(10);
    private static final int FadeInDuration = 75;
    private static final int FadeOutDuration = 150;
    private static final int RadiusDuration = 225;

    /* renamed from: getRippleEndRadius-cSwnlzA, reason: not valid java name */
    public static final float m28319getRippleEndRadiuscSwnlzA(Density density, boolean z10, long j10) {
        float fM30635getDistanceimpl = Offset.m30635getDistanceimpl(OffsetKt.Offset(Size.m30706getWidthimpl(j10), Size.m30703getHeightimpl(j10))) / 2.0f;
        return z10 ? fM30635getDistanceimpl + density.mo27099toPx0680j_4(BoundedRippleExtraRadius) : fM30635getDistanceimpl;
    }

    /* renamed from: getRippleStartRadius-uvyYCjk, reason: not valid java name */
    public static final float m28320getRippleStartRadiusuvyYCjk(long j10) {
        return Math.max(Size.m30706getWidthimpl(j10), Size.m30703getHeightimpl(j10)) * 0.3f;
    }
}
