package androidx.compose.animation.core;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0007\u001a%\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\n\u001a-\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\r\u001a\u001d\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000f*\u00020\u000e*\u00028\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u000f*\u00020\u000e*\u00028\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a%\u0010\u0015\u001a\u00020\u0014\"\b\b\u0000\u0010\u000f*\u00020\u000e*\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m5110d2 = {"", "v1", "Landroidx/compose/animation/core/AnimationVector1D;", "AnimationVector", "(F)Landroidx/compose/animation/core/AnimationVector1D;", "v2", "Landroidx/compose/animation/core/AnimationVector2D;", "(FF)Landroidx/compose/animation/core/AnimationVector2D;", "v3", "Landroidx/compose/animation/core/AnimationVector3D;", "(FFF)Landroidx/compose/animation/core/AnimationVector3D;", "v4", "Landroidx/compose/animation/core/AnimationVector4D;", "(FFFF)Landroidx/compose/animation/core/AnimationVector4D;", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_DIRECTION_TRUE, "newInstance", "(Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "copy", "source", "Ld6/s;", "copyFrom", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "animation-core_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AnimationVectorsKt {
    @NotNull
    public static final AnimationVector1D AnimationVector(float f) {
        return new AnimationVector1D(f);
    }

    @NotNull
    public static final <T extends AnimationVector> T copy(@NotNull T t8) {
        T t9 = (T) newInstance(t8);
        int size = t9.getSize();
        for (int i = 0; i < size; i++) {
            t9.set$animation_core_release(i, t8.get$animation_core_release(i));
        }
        return t9;
    }

    public static final <T extends AnimationVector> void copyFrom(@NotNull T t8, @NotNull T t9) {
        int size = t8.getSize();
        for (int i = 0; i < size; i++) {
            t8.set$animation_core_release(i, t9.get$animation_core_release(i));
        }
    }

    @NotNull
    public static final <T extends AnimationVector> T newInstance(@NotNull T t8) {
        T t9 = (T) t8.newVector$animation_core_release();
        AbstractC5830k.m5328e(t9, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return t9;
    }

    @NotNull
    public static final AnimationVector2D AnimationVector(float f, float f7) {
        return new AnimationVector2D(f, f7);
    }

    @NotNull
    public static final AnimationVector3D AnimationVector(float f, float f7, float f8) {
        return new AnimationVector3D(f, f7, f8);
    }

    @NotNull
    public static final AnimationVector4D AnimationVector(float f, float f7, float f8, float f9) {
        return new AnimationVector4D(f, f7, f8, f9);
    }
}
