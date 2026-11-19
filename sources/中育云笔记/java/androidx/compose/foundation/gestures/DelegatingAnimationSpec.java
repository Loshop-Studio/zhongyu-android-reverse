package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.animation.core.VectorizedFiniteAnimationSpec;
import androidx.compose.p014ui.geometry.Offset;
import kotlin.jvm.internal.C9974p;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
final class DelegatingAnimationSpec implements AnimationSpec<AnimationData> {
    private final AnimationSpec<Offset> offsetAnimationSpec;
    private final AnimationSpec<Float> rotationAnimationSpec;
    private final AnimationSpec<Float> zoomAnimationSpec;

    public DelegatingAnimationSpec(AnimationSpec<Float> animationSpec, AnimationSpec<Offset> animationSpec2, AnimationSpec<Float> animationSpec3) {
        this.zoomAnimationSpec = animationSpec;
        this.offsetAnimationSpec = animationSpec2;
        this.rotationAnimationSpec = animationSpec3;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedAnimationSpec<V> vectorize(final TwoWayConverter<AnimationData, V> twoWayConverter) {
        AnimationSpec<Float> animationSpec = this.zoomAnimationSpec;
        C9974p c9974p = C9974p.f23424a;
        final VectorizedAnimationSpec<V> vectorizedAnimationSpecVectorize = animationSpec.vectorize(VectorConvertersKt.getVectorConverter(c9974p));
        final VectorizedAnimationSpec<V> vectorizedAnimationSpecVectorize2 = this.offsetAnimationSpec.vectorize(VectorConvertersKt.getVectorConverter(Offset.Companion));
        final VectorizedAnimationSpec<V> vectorizedAnimationSpecVectorize3 = this.rotationAnimationSpec.vectorize(VectorConvertersKt.getVectorConverter(c9974p));
        return new VectorizedFiniteAnimationSpec<V>() { // from class: androidx.compose.foundation.gestures.DelegatingAnimationSpec.vectorize.1
            private final AnimationVector1D degreesVector(AnimationData animationData) {
                return (AnimationVector1D) VectorConvertersKt.getVectorConverter(C9974p.f23424a).getConvertToVector().invoke(Float.valueOf(animationData.getDegrees()));
            }

            private final AnimationVector2D offsetVector(AnimationData animationData) {
                InterfaceC9540l convertToVector = VectorConvertersKt.getVectorConverter(Offset.Companion).getConvertToVector();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (animationData.m27125getOffsetF1C5BW0() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (animationData.m27125getOffsetF1C5BW0() & 4294967295L));
                return (AnimationVector2D) convertToVector.invoke(Offset.m30626boximpl(Offset.m30629constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L))));
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroidx/compose/animation/core/AnimationVector1D;Landroidx/compose/animation/core/AnimationVector2D;Landroidx/compose/animation/core/AnimationVector1D;)TV; */
            private final AnimationVector packToAnimationVector(AnimationVector1D animationVector1D, AnimationVector2D animationVector2D, AnimationVector1D animationVector1D2) {
                InterfaceC9540l convertToVector = twoWayConverter.getConvertToVector();
                float value = animationVector1D.getValue();
                float v12 = animationVector2D.getV1();
                float v22 = animationVector2D.getV2();
                return (AnimationVector) convertToVector.invoke(new AnimationData(value, Offset.m30629constructorimpl((Float.floatToRawIntBits(v22) & 4294967295L) | (Float.floatToRawIntBits(v12) << 32)), animationVector1D2.getValue(), null));
            }

            private final AnimationVector1D zoomVector(AnimationData animationData) {
                return (AnimationVector1D) VectorConvertersKt.getVectorConverter(C9974p.f23424a).getConvertToVector().invoke(Float.valueOf(animationData.getZoom()));
            }

            /* JADX WARN: Incorrect types in method signature: (TV;TV;TV;)J */
            @Override // androidx.compose.animation.core.VectorizedAnimationSpec
            public long getDurationNanos(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
                AnimationData animationData = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector);
                AnimationData animationData2 = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector2);
                AnimationData animationData3 = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector3);
                return Math.max(vectorizedAnimationSpecVectorize.getDurationNanos(zoomVector(animationData), zoomVector(animationData2), zoomVector(animationData3)), Math.max(vectorizedAnimationSpecVectorize2.getDurationNanos(offsetVector(animationData), offsetVector(animationData2), offsetVector(animationData3)), vectorizedAnimationSpecVectorize3.getDurationNanos(degreesVector(animationData), degreesVector(animationData2), degreesVector(animationData3))));
            }

            /* JADX WARN: Incorrect return type in method signature: (JTV;TV;TV;)TV; */
            @Override // androidx.compose.animation.core.VectorizedAnimationSpec
            public AnimationVector getValueFromNanos(long j10, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
                AnimationData animationData = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector);
                AnimationData animationData2 = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector2);
                AnimationData animationData3 = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector3);
                return packToAnimationVector((AnimationVector1D) vectorizedAnimationSpecVectorize.getValueFromNanos(j10, zoomVector(animationData), zoomVector(animationData2), zoomVector(animationData3)), (AnimationVector2D) vectorizedAnimationSpecVectorize2.getValueFromNanos(j10, offsetVector(animationData), offsetVector(animationData2), offsetVector(animationData3)), (AnimationVector1D) vectorizedAnimationSpecVectorize3.getValueFromNanos(j10, degreesVector(animationData), degreesVector(animationData2), degreesVector(animationData3)));
            }

            /* JADX WARN: Incorrect return type in method signature: (JTV;TV;TV;)TV; */
            @Override // androidx.compose.animation.core.VectorizedAnimationSpec
            public AnimationVector getVelocityFromNanos(long j10, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
                AnimationData animationData = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector);
                AnimationData animationData2 = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector2);
                AnimationData animationData3 = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector3);
                return packToAnimationVector((AnimationVector1D) vectorizedAnimationSpecVectorize.getVelocityFromNanos(j10, zoomVector(animationData), zoomVector(animationData2), zoomVector(animationData3)), (AnimationVector2D) vectorizedAnimationSpecVectorize2.getVelocityFromNanos(j10, offsetVector(animationData), offsetVector(animationData2), offsetVector(animationData3)), (AnimationVector1D) vectorizedAnimationSpecVectorize3.getVelocityFromNanos(j10, degreesVector(animationData), degreesVector(animationData2), degreesVector(animationData3)));
            }
        };
    }
}
