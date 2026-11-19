package androidx.compose.foundation.shape;

import androidx.compose.p014ui.geometry.CornerRadius;
import androidx.compose.p014ui.geometry.RoundRectKt;
import androidx.compose.p014ui.geometry.SizeKt;
import androidx.compose.p014ui.graphics.Outline;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class AbsoluteRoundedCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    public AbsoluteRoundedCornerShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    /* renamed from: toRadius-Bz7bX_o, reason: not valid java name */
    private final long m27742toRadiusBz7bX_o(float f10) {
        return CornerRadius.m30591constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* renamed from: createOutline-LjSzlW0 */
    public Outline mo27738createOutlineLjSzlW0(long j10, float f10, float f11, float f12, float f13, LayoutDirection layoutDirection) {
        if (f10 + f11 + f12 + f13 == 0.0f) {
            return new Outline.Rectangle(SizeKt.m30727toRectuvyYCjk(j10));
        }
        return new Outline.Rounded(RoundRectKt.m30689RoundRectZAM2FJo(SizeKt.m30727toRectuvyYCjk(j10), CornerRadius.m30591constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L)), CornerRadius.m30591constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)), CornerRadius.m30591constructorimpl((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L)), CornerRadius.m30591constructorimpl((Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32))));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsoluteRoundedCornerShape)) {
            return false;
        }
        AbsoluteRoundedCornerShape absoluteRoundedCornerShape = (AbsoluteRoundedCornerShape) obj;
        return AbstractC9979u.m20289b(getTopStart(), absoluteRoundedCornerShape.getTopStart()) && AbstractC9979u.m20289b(getTopEnd(), absoluteRoundedCornerShape.getTopEnd()) && AbstractC9979u.m20289b(getBottomEnd(), absoluteRoundedCornerShape.getBottomEnd()) && AbstractC9979u.m20289b(getBottomStart(), absoluteRoundedCornerShape.getBottomStart());
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    public String toString() {
        return "AbsoluteRoundedCornerShape(topLeft = " + getTopStart() + ", topRight = " + getTopEnd() + ", bottomRight = " + getBottomEnd() + ", bottomLeft = " + getBottomStart() + ')';
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public AbsoluteRoundedCornerShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new AbsoluteRoundedCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }
}
