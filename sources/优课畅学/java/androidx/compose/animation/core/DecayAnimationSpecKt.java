package androidx.compose.animation.core;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.C9128p;

/* loaded from: classes.dex */
public final class DecayAnimationSpecKt {
    public static final <T, V extends AnimationVector> T calculateTargetValue(DecayAnimationSpec<T> decayAnimationSpec, TwoWayConverter<T, V> twoWayConverter, T t10, T t11) {
        return (T) twoWayConverter.getConvertFromVector().invoke(decayAnimationSpec.vectorize(twoWayConverter).getTargetValue((AnimationVector) twoWayConverter.getConvertToVector().invoke(t10), (AnimationVector) twoWayConverter.getConvertToVector().invoke(t11)));
    }

    public static final <T> DecayAnimationSpec<T> exponentialDecay(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f11) {
        return generateDecayAnimationSpec(new FloatExponentialDecaySpec(f10, f11));
    }

    public static /* synthetic */ DecayAnimationSpec exponentialDecay$default(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.1f;
        }
        return exponentialDecay(f10, f11);
    }

    public static final <T> DecayAnimationSpec<T> generateDecayAnimationSpec(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        return new DecayAnimationSpecImpl(floatDecayAnimationSpec);
    }

    public static final float calculateTargetValue(DecayAnimationSpec<Float> decayAnimationSpec, float f10, float f11) {
        return ((AnimationVector1D) decayAnimationSpec.vectorize(VectorConvertersKt.getVectorConverter(C9128p.f17495a)).getTargetValue(AnimationVectorsKt.AnimationVector(f10), AnimationVectorsKt.AnimationVector(f11))).getValue();
    }
}
