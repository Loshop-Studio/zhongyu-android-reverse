package androidx.compose.foundation.shape;

import androidx.compose.p014ui.geometry.SizeKt;
import androidx.compose.p014ui.graphics.AndroidPath_androidKt;
import androidx.compose.p014ui.graphics.Outline;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class CutCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    public CutCornerShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* renamed from: createOutline-LjSzlW0 */
    public Outline mo27738createOutlineLjSzlW0(long j10, float f10, float f11, float f12, float f13, LayoutDirection layoutDirection) {
        if (f10 + f11 + f13 + f12 == 0.0f) {
            return new Outline.Rectangle(SizeKt.m30727toRectuvyYCjk(j10));
        }
        Path Path = AndroidPath_androidKt.Path();
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f14 = layoutDirection == layoutDirection2 ? f10 : f11;
        Path.moveTo(0.0f, f14);
        Path.lineTo(f14, 0.0f);
        if (layoutDirection == layoutDirection2) {
            f10 = f11;
        }
        int i10 = (int) (j10 >> 32);
        Path.lineTo(Float.intBitsToFloat(i10) - f10, 0.0f);
        Path.lineTo(Float.intBitsToFloat(i10), f10);
        float f15 = layoutDirection == layoutDirection2 ? f12 : f13;
        int i11 = (int) (j10 & 4294967295L);
        Path.lineTo(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11) - f15);
        Path.lineTo(Float.intBitsToFloat(i10) - f15, Float.intBitsToFloat(i11));
        if (layoutDirection == layoutDirection2) {
            f12 = f13;
        }
        Path.lineTo(f12, Float.intBitsToFloat(i11));
        Path.lineTo(0.0f, Float.intBitsToFloat(i11) - f12);
        Path.close();
        return new Outline.Generic(Path);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutCornerShape)) {
            return false;
        }
        CutCornerShape cutCornerShape = (CutCornerShape) obj;
        return AbstractC9979u.m20289b(getTopStart(), cutCornerShape.getTopStart()) && AbstractC9979u.m20289b(getTopEnd(), cutCornerShape.getTopEnd()) && AbstractC9979u.m20289b(getBottomEnd(), cutCornerShape.getBottomEnd()) && AbstractC9979u.m20289b(getBottomStart(), cutCornerShape.getBottomStart());
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    public String toString() {
        return "CutCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public CutCornerShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new CutCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }
}
