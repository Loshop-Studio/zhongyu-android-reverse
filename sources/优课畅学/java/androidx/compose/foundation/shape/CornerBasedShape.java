package androidx.compose.foundation.shape;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.Outline;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class CornerBasedShape implements Shape {
    public static final int $stable = 0;
    private final CornerSize bottomEnd;
    private final CornerSize bottomStart;
    private final CornerSize topEnd;
    private final CornerSize topStart;

    public CornerBasedShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        this.topStart = cornerSize;
        this.topEnd = cornerSize2;
        this.bottomEnd = cornerSize3;
        this.bottomStart = cornerSize4;
    }

    public static /* synthetic */ CornerBasedShape copy$default(CornerBasedShape cornerBasedShape, CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i10 & 1) != 0) {
            cornerSize = cornerBasedShape.topStart;
        }
        if ((i10 & 2) != 0) {
            cornerSize2 = cornerBasedShape.topEnd;
        }
        if ((i10 & 4) != 0) {
            cornerSize3 = cornerBasedShape.bottomEnd;
        }
        if ((i10 & 8) != 0) {
            cornerSize4 = cornerBasedShape.bottomStart;
        }
        return cornerBasedShape.copy(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    public final CornerBasedShape copy(CornerSize cornerSize) {
        return copy(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public abstract CornerBasedShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4);

    /* renamed from: createOutline-LjSzlW0 */
    public abstract Outline mo21136createOutlineLjSzlW0(long j10, float f10, float f11, float f12, float f13, LayoutDirection layoutDirection);

    @Override // androidx.compose.p013ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final Outline mo20407createOutlinePq9zytI(long j10, LayoutDirection layoutDirection, Density density) {
        float fMo21144toPxTmRCtEA = this.topStart.mo21144toPxTmRCtEA(j10, density);
        float fMo21144toPxTmRCtEA2 = this.topEnd.mo21144toPxTmRCtEA(j10, density);
        float fMo21144toPxTmRCtEA3 = this.bottomEnd.mo21144toPxTmRCtEA(j10, density);
        float fMo21144toPxTmRCtEA4 = this.bottomStart.mo21144toPxTmRCtEA(j10, density);
        float fM24103getMinDimensionimpl = Size.m24103getMinDimensionimpl(j10);
        float f10 = fMo21144toPxTmRCtEA + fMo21144toPxTmRCtEA4;
        if (f10 > fM24103getMinDimensionimpl) {
            float f11 = fM24103getMinDimensionimpl / f10;
            fMo21144toPxTmRCtEA *= f11;
            fMo21144toPxTmRCtEA4 *= f11;
        }
        float f12 = fMo21144toPxTmRCtEA2 + fMo21144toPxTmRCtEA3;
        if (f12 > fM24103getMinDimensionimpl) {
            float f13 = fM24103getMinDimensionimpl / f12;
            fMo21144toPxTmRCtEA2 *= f13;
            fMo21144toPxTmRCtEA3 *= f13;
        }
        if (!(fMo21144toPxTmRCtEA >= 0.0f && fMo21144toPxTmRCtEA2 >= 0.0f && fMo21144toPxTmRCtEA3 >= 0.0f && fMo21144toPxTmRCtEA4 >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Corner size in Px can't be negative(topStart = " + fMo21144toPxTmRCtEA + ", topEnd = " + fMo21144toPxTmRCtEA2 + ", bottomEnd = " + fMo21144toPxTmRCtEA3 + ", bottomStart = " + fMo21144toPxTmRCtEA4 + ")!");
        }
        return mo21136createOutlineLjSzlW0(j10, fMo21144toPxTmRCtEA, fMo21144toPxTmRCtEA2, fMo21144toPxTmRCtEA3, fMo21144toPxTmRCtEA4, layoutDirection);
    }

    public final CornerSize getBottomEnd() {
        return this.bottomEnd;
    }

    public final CornerSize getBottomStart() {
        return this.bottomStart;
    }

    public final CornerSize getTopEnd() {
        return this.topEnd;
    }

    public final CornerSize getTopStart() {
        return this.topStart;
    }
}
