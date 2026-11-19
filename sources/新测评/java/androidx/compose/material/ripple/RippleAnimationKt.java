package androidx.compose.material.ripple;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.OffsetKt;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a&\u0010\r\u001a\u00020\b*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, m13558d2 = {"BoundedRippleExtraRadius", "Landroidx/compose/ui/unit/Dp;", "F", "FadeInDuration", "", "FadeOutDuration", "RadiusDuration", "getRippleStartRadius", "", "size", "Landroidx/compose/ui/geometry/Size;", "getRippleStartRadius-uvyYCjk", "(J)F", "getRippleEndRadius", "Landroidx/compose/ui/unit/Density;", "bounded", "", "getRippleEndRadius-cSwnlzA", "(Landroidx/compose/ui/unit/Density;ZJ)F", "material-ripple_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nRippleAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimationKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,182:1\n149#2:183\n*S KotlinDebug\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimationKt\n*L\n177#1:183\n*E\n"})
/* loaded from: classes2.dex */
public final class RippleAnimationKt {
    private static final float BoundedRippleExtraRadius = C3127Dp.m23561constructorimpl(10);
    private static final int FadeInDuration = 75;
    private static final int FadeOutDuration = 150;
    private static final int RadiusDuration = 225;

    /* renamed from: getRippleEndRadius-cSwnlzA, reason: not valid java name */
    public static final float m18477getRippleEndRadiuscSwnlzA(Density density, boolean z9, long j10) {
        float fM20733getDistanceimpl = Offset.m20733getDistanceimpl(OffsetKt.Offset(Size.m20804getWidthimpl(j10), Size.m20801getHeightimpl(j10))) / 2.0f;
        return z9 ? fM20733getDistanceimpl + density.mo17332toPx0680j_4(BoundedRippleExtraRadius) : fM20733getDistanceimpl;
    }

    /* renamed from: getRippleStartRadius-uvyYCjk, reason: not valid java name */
    public static final float m18478getRippleStartRadiusuvyYCjk(long j10) {
        return Math.max(Size.m20804getWidthimpl(j10), Size.m20801getHeightimpl(j10)) * 0.3f;
    }
}
