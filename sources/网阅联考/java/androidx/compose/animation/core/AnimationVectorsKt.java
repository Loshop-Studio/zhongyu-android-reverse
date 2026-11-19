package androidx.compose.animation.core;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a&\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003\u001a\u001b\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000bH\u0000¢\u0006\u0002\u0010\r\u001a#\u0010\u000e\u001a\u00020\u000f\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000b2\u0006\u0010\u0010\u001a\u0002H\u000bH\u0000¢\u0006\u0002\u0010\u0011\u001a\u001b\u0010\u0012\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000bH\u0000¢\u0006\u0002\u0010\r¨\u0006\u0013"}, m5175d2 = {"AnimationVector", "Landroidx/compose/animation/core/AnimationVector1D;", "v1", "", "Landroidx/compose/animation/core/AnimationVector2D;", "v2", "Landroidx/compose/animation/core/AnimationVector3D;", "v3", "Landroidx/compose/animation/core/AnimationVector4D;", "v4", "copy", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", "(Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "copyFrom", "", "source", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "newInstance", "animation-core_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AnimationVectorsKt {
    public static final AnimationVector1D AnimationVector(float f4) {
        return new AnimationVector1D(f4);
    }

    public static final <T extends AnimationVector> T copy(T t3) {
        Intrinsics.checkNotNullParameter(t3, "<this>");
        T t4 = (T) newInstance(t3);
        int size = t4.getSize();
        for (int i4 = 0; i4 < size; i4++) {
            t4.set$animation_core_release(i4, t3.get$animation_core_release(i4));
        }
        return t4;
    }

    public static final <T extends AnimationVector> void copyFrom(T t3, T source) {
        Intrinsics.checkNotNullParameter(t3, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int size = t3.getSize();
        for (int i4 = 0; i4 < size; i4++) {
            t3.set$animation_core_release(i4, source.get$animation_core_release(i4));
        }
    }

    public static final <T extends AnimationVector> T newInstance(T t3) {
        Intrinsics.checkNotNullParameter(t3, "<this>");
        T t4 = (T) t3.newVector$animation_core_release();
        Intrinsics.checkNotNull(t4, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return t4;
    }

    public static final AnimationVector2D AnimationVector(float f4, float f5) {
        return new AnimationVector2D(f4, f5);
    }

    public static final AnimationVector3D AnimationVector(float f4, float f5, float f6) {
        return new AnimationVector3D(f4, f5, f6);
    }

    public static final AnimationVector4D AnimationVector(float f4, float f5, float f6, float f7) {
        return new AnimationVector4D(f4, f5, f6, f7);
    }
}
