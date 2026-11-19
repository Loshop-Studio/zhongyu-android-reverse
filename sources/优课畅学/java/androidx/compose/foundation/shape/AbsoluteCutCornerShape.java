package androidx.compose.foundation.shape;

import androidx.compose.p013ui.geometry.SizeKt;
import androidx.compose.p013ui.graphics.AndroidPath_androidKt;
import androidx.compose.p013ui.graphics.Outline;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class AbsoluteCutCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    public AbsoluteCutCornerShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* renamed from: createOutline-LjSzlW0, reason: not valid java name */
    public Outline mo21136createOutlineLjSzlW0(long j10, float f10, float f11, float f12, float f13, LayoutDirection layoutDirection) {
        if (f10 + f11 + f13 + f12 == 0.0f) {
            return new Outline.Rectangle(SizeKt.m24125toRectuvyYCjk(j10));
        }
        Path Path = AndroidPath_androidKt.Path();
        Path.moveTo(0.0f, f10);
        Path.lineTo(f10, 0.0f);
        int i10 = (int) (j10 >> 32);
        Path.lineTo(Float.intBitsToFloat(i10) - f11, 0.0f);
        Path.lineTo(Float.intBitsToFloat(i10), f11);
        int i11 = (int) (j10 & 4294967295L);
        Path.lineTo(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11) - f12);
        Path.lineTo(Float.intBitsToFloat(i10) - f12, Float.intBitsToFloat(i11));
        Path.lineTo(f13, Float.intBitsToFloat(i11));
        Path.lineTo(0.0f, Float.intBitsToFloat(i11) - f13);
        Path.close();
        return new Outline.Generic(Path);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsoluteCutCornerShape)) {
            return false;
        }
        AbsoluteCutCornerShape absoluteCutCornerShape = (AbsoluteCutCornerShape) obj;
        return AbstractC9133u.m16128b(getTopStart(), absoluteCutCornerShape.getTopStart()) && AbstractC9133u.m16128b(getTopEnd(), absoluteCutCornerShape.getTopEnd()) && AbstractC9133u.m16128b(getBottomEnd(), absoluteCutCornerShape.getBottomEnd()) && AbstractC9133u.m16128b(getBottomStart(), absoluteCutCornerShape.getBottomStart());
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    public String toString() {
        return "AbsoluteCutCornerShape(topLeft = " + getTopStart() + ", topRight = " + getTopEnd() + ", bottomRight = " + getBottomEnd() + ", bottomLeft = " + getBottomStart() + ')';
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public AbsoluteCutCornerShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new AbsoluteCutCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }
}
