package androidx.compose.foundation.shape;

import androidx.compose.p014ui.geometry.CornerRadius;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.RoundRectKt;
import androidx.compose.p014ui.geometry.SizeKt;
import androidx.compose.p014ui.graphics.Outline;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class RoundedCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    public RoundedCornerShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* renamed from: createOutline-LjSzlW0 */
    public Outline mo27738createOutlineLjSzlW0(long j10, float f10, float f11, float f12, float f13, LayoutDirection layoutDirection) {
        if (f10 + f11 + f12 + f13 == 0.0f) {
            return new Outline.Rectangle(SizeKt.m30727toRectuvyYCjk(j10));
        }
        Rect rectM30727toRectuvyYCjk = SizeKt.m30727toRectuvyYCjk(j10);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f14 = layoutDirection == layoutDirection2 ? f10 : f11;
        long jM30591constructorimpl = CornerRadius.m30591constructorimpl((Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L));
        float f15 = layoutDirection == layoutDirection2 ? f11 : f10;
        long jM30591constructorimpl2 = CornerRadius.m30591constructorimpl((Float.floatToRawIntBits(f15) & 4294967295L) | (Float.floatToRawIntBits(f15) << 32));
        float f16 = layoutDirection == layoutDirection2 ? f12 : f13;
        long jM30591constructorimpl3 = CornerRadius.m30591constructorimpl((Float.floatToRawIntBits(f16) << 32) | (Float.floatToRawIntBits(f16) & 4294967295L));
        float f17 = layoutDirection == layoutDirection2 ? f13 : f12;
        return new Outline.Rounded(RoundRectKt.m30689RoundRectZAM2FJo(rectM30727toRectuvyYCjk, jM30591constructorimpl, jM30591constructorimpl2, jM30591constructorimpl3, CornerRadius.m30591constructorimpl((Float.floatToRawIntBits(f17) & 4294967295L) | (Float.floatToRawIntBits(f17) << 32))));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundedCornerShape)) {
            return false;
        }
        RoundedCornerShape roundedCornerShape = (RoundedCornerShape) obj;
        return AbstractC9979u.m20289b(getTopStart(), roundedCornerShape.getTopStart()) && AbstractC9979u.m20289b(getTopEnd(), roundedCornerShape.getTopEnd()) && AbstractC9979u.m20289b(getBottomEnd(), roundedCornerShape.getBottomEnd()) && AbstractC9979u.m20289b(getBottomStart(), roundedCornerShape.getBottomStart());
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public RoundedCornerShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new RoundedCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }
}
