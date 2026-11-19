package androidx.compose.animation.core;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001aI\u0010\u0006\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0007*\u00020\b*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00070\n2\u0006\u0010\u000b\u001a\u0002H\u00022\u0006\u0010\f\u001a\u0002H\u0002¢\u0006\u0002\u0010\r\u001a \u0010\u0006\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004\u001a\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u000f¨\u0006\u0010"}, m5175d2 = {"exponentialDecay", "Landroidx/compose/animation/core/DecayAnimationSpec;", ExifInterface.GPS_DIRECTION_TRUE, "frictionMultiplier", "", "absVelocityThreshold", "calculateTargetValue", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "initialValue", "initialVelocity", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "generateDecayAnimationSpec", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "animation-core_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class DecayAnimationSpecKt {
    public static final <T, V extends AnimationVector> T calculateTargetValue(DecayAnimationSpec<T> decayAnimationSpec, TwoWayConverter<T, V> typeConverter, T t3, T t4) {
        Intrinsics.checkNotNullParameter(decayAnimationSpec, "<this>");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        return (T) typeConverter.getConvertFromVector().invoke(decayAnimationSpec.vectorize(typeConverter).getTargetValue(typeConverter.getConvertToVector().invoke(t3), typeConverter.getConvertToVector().invoke(t4)));
    }

    public static final <T> DecayAnimationSpec<T> exponentialDecay(float f4, float f5) {
        return generateDecayAnimationSpec(new FloatExponentialDecaySpec(f4, f5));
    }

    public static /* synthetic */ DecayAnimationSpec exponentialDecay$default(float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 1.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 0.1f;
        }
        return exponentialDecay(f4, f5);
    }

    public static final <T> DecayAnimationSpec<T> generateDecayAnimationSpec(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        Intrinsics.checkNotNullParameter(floatDecayAnimationSpec, "<this>");
        return new DecayAnimationSpecImpl(floatDecayAnimationSpec);
    }

    public static final float calculateTargetValue(DecayAnimationSpec<Float> decayAnimationSpec, float f4, float f5) {
        Intrinsics.checkNotNullParameter(decayAnimationSpec, "<this>");
        return ((AnimationVector1D) decayAnimationSpec.vectorize(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE)).getTargetValue(AnimationVectorsKt.AnimationVector(f4), AnimationVectorsKt.AnimationVector(f5))).getValue();
    }
}
