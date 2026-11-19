package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.animation.core.VectorizedFiniteAnimationSpec;
import androidx.compose.p011ui.geometry.Offset;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.C5825f;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\u0010\bJ,\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\b\b\u0000\u0010\u000b*\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u000b0\u000eH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m5110d2 = {"Landroidx/compose/foundation/gestures/DelegatingAnimationSpec;", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/foundation/gestures/AnimationData;", "zoomAnimationSpec", "", "offsetAnimationSpec", "Landroidx/compose/ui/geometry/Offset;", "rotationAnimationSpec", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;)V", "vectorize", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "converter", "Landroidx/compose/animation/core/TwoWayConverter;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class DelegatingAnimationSpec implements AnimationSpec<AnimationData> {

    @NotNull
    private final AnimationSpec<Offset> offsetAnimationSpec;

    @NotNull
    private final AnimationSpec<Float> rotationAnimationSpec;

    @NotNull
    private final AnimationSpec<Float> zoomAnimationSpec;

    public DelegatingAnimationSpec(@NotNull AnimationSpec<Float> animationSpec, @NotNull AnimationSpec<Offset> animationSpec2, @NotNull AnimationSpec<Float> animationSpec3) {
        this.zoomAnimationSpec = animationSpec;
        this.offsetAnimationSpec = animationSpec2;
        this.rotationAnimationSpec = animationSpec3;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    @NotNull
    public <V extends AnimationVector> VectorizedAnimationSpec<V> vectorize(@NotNull final TwoWayConverter<AnimationData, V> converter) {
        AnimationSpec<Float> animationSpec = this.zoomAnimationSpec;
        C5825f c5825f = C5825f.f9219a;
        final VectorizedAnimationSpec<V> vectorizedAnimationSpecVectorize = animationSpec.vectorize(VectorConvertersKt.getVectorConverter(c5825f));
        final VectorizedAnimationSpec<V> vectorizedAnimationSpecVectorize2 = this.offsetAnimationSpec.vectorize(VectorConvertersKt.getVectorConverter(Offset.INSTANCE));
        final VectorizedAnimationSpec<V> vectorizedAnimationSpecVectorize3 = this.rotationAnimationSpec.vectorize(VectorConvertersKt.getVectorConverter(c5825f));
        return new VectorizedFiniteAnimationSpec<V>() { // from class: androidx.compose.foundation.gestures.DelegatingAnimationSpec.vectorize.1
            private final AnimationVector1D degreesVector(AnimationData animationData) {
                return (AnimationVector1D) VectorConvertersKt.getVectorConverter(C5825f.f9219a).getConvertToVector().invoke(Float.valueOf(animationData.getDegrees()));
            }

            private final AnimationVector2D offsetVector(AnimationData animationData) {
                InterfaceC6471c convertToVector = VectorConvertersKt.getVectorConverter(Offset.INSTANCE).getConvertToVector();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (animationData.m6929getOffsetF1C5BW0() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (animationData.m6929getOffsetF1C5BW0() & 4294967295L));
                return (AnimationVector2D) convertToVector.invoke(Offset.m10430boximpl(Offset.m10433constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L))));
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroidx/compose/animation/core/AnimationVector1D;Landroidx/compose/animation/core/AnimationVector2D;Landroidx/compose/animation/core/AnimationVector1D;)TV; */
            private final AnimationVector packToAnimationVector(AnimationVector1D zoom, AnimationVector2D offset, AnimationVector1D rotation) {
                InterfaceC6471c convertToVector = converter.getConvertToVector();
                float value = zoom.getValue();
                float v12 = offset.getV1();
                float v2 = offset.getV2();
                return (AnimationVector) convertToVector.invoke(new AnimationData(value, Offset.m10433constructorimpl((Float.floatToRawIntBits(v2) & 4294967295L) | (Float.floatToRawIntBits(v12) << 32)), rotation.getValue(), null));
            }

            private final AnimationVector1D zoomVector(AnimationData animationData) {
                return (AnimationVector1D) VectorConvertersKt.getVectorConverter(C5825f.f9219a).getConvertToVector().invoke(Float.valueOf(animationData.getZoom()));
            }

            /* JADX WARN: Incorrect types in method signature: (TV;TV;TV;)J */
            @Override // androidx.compose.animation.core.VectorizedAnimationSpec
            public long getDurationNanos(AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
                AnimationData animationData = (AnimationData) converter.getConvertFromVector().invoke(initialValue);
                AnimationData animationData2 = (AnimationData) converter.getConvertFromVector().invoke(targetValue);
                AnimationData animationData3 = (AnimationData) converter.getConvertFromVector().invoke(initialVelocity);
                return Math.max(vectorizedAnimationSpecVectorize.getDurationNanos(zoomVector(animationData), zoomVector(animationData2), zoomVector(animationData3)), Math.max(vectorizedAnimationSpecVectorize2.getDurationNanos(offsetVector(animationData), offsetVector(animationData2), offsetVector(animationData3)), vectorizedAnimationSpecVectorize3.getDurationNanos(degreesVector(animationData), degreesVector(animationData2), degreesVector(animationData3))));
            }

            /* JADX WARN: Incorrect return type in method signature: (JTV;TV;TV;)TV; */
            @Override // androidx.compose.animation.core.VectorizedAnimationSpec
            public AnimationVector getValueFromNanos(long playTimeNanos, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
                AnimationData animationData = (AnimationData) converter.getConvertFromVector().invoke(initialValue);
                AnimationData animationData2 = (AnimationData) converter.getConvertFromVector().invoke(targetValue);
                AnimationData animationData3 = (AnimationData) converter.getConvertFromVector().invoke(initialVelocity);
                return packToAnimationVector((AnimationVector1D) vectorizedAnimationSpecVectorize.getValueFromNanos(playTimeNanos, zoomVector(animationData), zoomVector(animationData2), zoomVector(animationData3)), (AnimationVector2D) vectorizedAnimationSpecVectorize2.getValueFromNanos(playTimeNanos, offsetVector(animationData), offsetVector(animationData2), offsetVector(animationData3)), (AnimationVector1D) vectorizedAnimationSpecVectorize3.getValueFromNanos(playTimeNanos, degreesVector(animationData), degreesVector(animationData2), degreesVector(animationData3)));
            }

            /* JADX WARN: Incorrect return type in method signature: (JTV;TV;TV;)TV; */
            @Override // androidx.compose.animation.core.VectorizedAnimationSpec
            public AnimationVector getVelocityFromNanos(long playTimeNanos, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
                AnimationData animationData = (AnimationData) converter.getConvertFromVector().invoke(initialValue);
                AnimationData animationData2 = (AnimationData) converter.getConvertFromVector().invoke(targetValue);
                AnimationData animationData3 = (AnimationData) converter.getConvertFromVector().invoke(initialVelocity);
                return packToAnimationVector((AnimationVector1D) vectorizedAnimationSpecVectorize.getVelocityFromNanos(playTimeNanos, zoomVector(animationData), zoomVector(animationData2), zoomVector(animationData3)), (AnimationVector2D) vectorizedAnimationSpecVectorize2.getVelocityFromNanos(playTimeNanos, offsetVector(animationData), offsetVector(animationData2), offsetVector(animationData3)), (AnimationVector1D) vectorizedAnimationSpecVectorize3.getVelocityFromNanos(playTimeNanos, degreesVector(animationData), degreesVector(animationData2), degreesVector(animationData3)));
            }
        };
    }
}
