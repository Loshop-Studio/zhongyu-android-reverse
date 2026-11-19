package androidx.compose.animation.core;

import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.C9128p;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class AnimationKt {
    public static final long MillisToNanos = 1000000;
    public static final long SecondsToMillis = 1000;

    public static final DecayAnimation<Float, AnimationVector1D> DecayAnimation(FloatDecayAnimationSpec floatDecayAnimationSpec, float f10, float f11) {
        return new DecayAnimation<>((DecayAnimationSpec<Float>) DecayAnimationSpecKt.generateDecayAnimationSpec(floatDecayAnimationSpec), VectorConvertersKt.getVectorConverter(C9128p.f17495a), Float.valueOf(f10), AnimationVectorsKt.AnimationVector(f11));
    }

    public static /* synthetic */ DecayAnimation DecayAnimation$default(FloatDecayAnimationSpec floatDecayAnimationSpec, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        return DecayAnimation(floatDecayAnimationSpec, f10, f11);
    }

    public static final <T, V extends AnimationVector> TargetBasedAnimation<T, V> TargetBasedAnimation(AnimationSpec<T> animationSpec, TwoWayConverter<T, V> twoWayConverter, T t10, T t11, T t12) {
        return new TargetBasedAnimation<>(animationSpec, twoWayConverter, t10, t11, (AnimationVector) twoWayConverter.getConvertToVector().invoke(t12));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final <V extends AnimationVector> TargetBasedAnimation<V, V> createAnimation(VectorizedAnimationSpec<V> vectorizedAnimationSpec, V v10, V v11, V v12) {
        return new TargetBasedAnimation<>(vectorizedAnimationSpec, (TwoWayConverter<V, V>) VectorConvertersKt.TwoWayConverter(new InterfaceC10570l() { // from class: androidx.compose.animation.core.AnimationKt.createAnimation.1
            /* JADX WARN: Incorrect return type in method signature: (TV;)TV; */
            @Override // p300x7.InterfaceC10570l
            public final AnimationVector invoke(AnimationVector animationVector) {
                return animationVector;
            }
        }, new InterfaceC10570l() { // from class: androidx.compose.animation.core.AnimationKt.createAnimation.2
            /* JADX WARN: Incorrect return type in method signature: (TV;)TV; */
            @Override // p300x7.InterfaceC10570l
            public final AnimationVector invoke(AnimationVector animationVector) {
                return animationVector;
            }
        }), v10, v11, v12);
    }

    public static final long getDurationMillis(Animation<?, ?> animation) {
        return animation.getDurationNanos() / MillisToNanos;
    }

    public static final <T, V extends AnimationVector> T getVelocityFromNanos(Animation<T, V> animation, long j10) {
        return (T) animation.getTypeConverter().getConvertFromVector().invoke(animation.getVelocityVectorFromNanos(j10));
    }
}
