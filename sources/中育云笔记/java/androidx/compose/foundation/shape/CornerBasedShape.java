package androidx.compose.foundation.shape;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.Outline;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
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
    public abstract Outline mo27738createOutlineLjSzlW0(long j10, float f10, float f11, float f12, float f13, LayoutDirection layoutDirection);

    @Override // androidx.compose.p014ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final Outline mo27009createOutlinePq9zytI(long j10, LayoutDirection layoutDirection, Density density) {
        float fMo27746toPxTmRCtEA = this.topStart.mo27746toPxTmRCtEA(j10, density);
        float fMo27746toPxTmRCtEA2 = this.topEnd.mo27746toPxTmRCtEA(j10, density);
        float fMo27746toPxTmRCtEA3 = this.bottomEnd.mo27746toPxTmRCtEA(j10, density);
        float fMo27746toPxTmRCtEA4 = this.bottomStart.mo27746toPxTmRCtEA(j10, density);
        float fM30705getMinDimensionimpl = Size.m30705getMinDimensionimpl(j10);
        float f10 = fMo27746toPxTmRCtEA + fMo27746toPxTmRCtEA4;
        if (f10 > fM30705getMinDimensionimpl) {
            float f11 = fM30705getMinDimensionimpl / f10;
            fMo27746toPxTmRCtEA *= f11;
            fMo27746toPxTmRCtEA4 *= f11;
        }
        float f12 = fMo27746toPxTmRCtEA2 + fMo27746toPxTmRCtEA3;
        if (f12 > fM30705getMinDimensionimpl) {
            float f13 = fM30705getMinDimensionimpl / f12;
            fMo27746toPxTmRCtEA2 *= f13;
            fMo27746toPxTmRCtEA3 *= f13;
        }
        if (!(fMo27746toPxTmRCtEA >= 0.0f && fMo27746toPxTmRCtEA2 >= 0.0f && fMo27746toPxTmRCtEA3 >= 0.0f && fMo27746toPxTmRCtEA4 >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Corner size in Px can't be negative(topStart = " + fMo27746toPxTmRCtEA + ", topEnd = " + fMo27746toPxTmRCtEA2 + ", bottomEnd = " + fMo27746toPxTmRCtEA3 + ", bottomStart = " + fMo27746toPxTmRCtEA4 + ")!");
        }
        return mo27738createOutlineLjSzlW0(j10, fMo27746toPxTmRCtEA, fMo27746toPxTmRCtEA2, fMo27746toPxTmRCtEA3, fMo27746toPxTmRCtEA4, layoutDirection);
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
