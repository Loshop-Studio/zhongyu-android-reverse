package androidx.compose.animation.core;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.C5825f;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m5110d2 = {"negativeInfinityBounds1D", "Landroidx/compose/animation/core/AnimationVector1D;", "negativeInfinityBounds2D", "Landroidx/compose/animation/core/AnimationVector2D;", "negativeInfinityBounds3D", "Landroidx/compose/animation/core/AnimationVector3D;", "negativeInfinityBounds4D", "Landroidx/compose/animation/core/AnimationVector4D;", "positiveInfinityBounds1D", "positiveInfinityBounds2D", "positiveInfinityBounds3D", "positiveInfinityBounds4D", "Animatable", "Landroidx/compose/animation/core/Animatable;", "", "initialValue", "visibilityThreshold", "animation-core_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AnimatableKt {

    @NotNull
    private static final AnimationVector1D positiveInfinityBounds1D = AnimationVectorsKt.AnimationVector(Float.POSITIVE_INFINITY);

    @NotNull
    private static final AnimationVector2D positiveInfinityBounds2D = AnimationVectorsKt.AnimationVector(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    @NotNull
    private static final AnimationVector3D positiveInfinityBounds3D = AnimationVectorsKt.AnimationVector(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    @NotNull
    private static final AnimationVector4D positiveInfinityBounds4D = AnimationVectorsKt.AnimationVector(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    @NotNull
    private static final AnimationVector1D negativeInfinityBounds1D = AnimationVectorsKt.AnimationVector(Float.NEGATIVE_INFINITY);

    @NotNull
    private static final AnimationVector2D negativeInfinityBounds2D = AnimationVectorsKt.AnimationVector(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    @NotNull
    private static final AnimationVector3D negativeInfinityBounds3D = AnimationVectorsKt.AnimationVector(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    @NotNull
    private static final AnimationVector4D negativeInfinityBounds4D = AnimationVectorsKt.AnimationVector(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    @NotNull
    public static final Animatable<Float, AnimationVector1D> Animatable(float f, float f7) {
        return new Animatable<>(Float.valueOf(f), VectorConvertersKt.getVectorConverter(C5825f.f9219a), Float.valueOf(f7), null, 8, null);
    }

    public static /* synthetic */ Animatable Animatable$default(float f, float f7, int i, Object obj) {
        if ((i & 2) != 0) {
            f7 = 0.01f;
        }
        return Animatable(f, f7);
    }
}
