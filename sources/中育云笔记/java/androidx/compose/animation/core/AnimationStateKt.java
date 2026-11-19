package androidx.compose.animation.core;

import kotlin.jvm.internal.C9974p;

/* loaded from: classes.dex */
public final class AnimationStateKt {
    public static final AnimationState<Float, AnimationVector1D> AnimationState(float f10, float f11, long j10, long j11, boolean z10) {
        return new AnimationState<>(VectorConvertersKt.getVectorConverter(C9974p.f23424a), Float.valueOf(f10), AnimationVectorsKt.AnimationVector(f11), j10, j11, z10);
    }

    public static /* synthetic */ AnimationState AnimationState$default(float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = Long.MIN_VALUE;
        }
        if ((i10 & 8) != 0) {
            j11 = Long.MIN_VALUE;
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return AnimationState(f10, f11, j10, j11, z10);
    }

    public static final <T, V extends AnimationVector> AnimationState<T, V> copy(AnimationState<T, V> animationState, T t10, V v10, long j10, long j11, boolean z10) {
        return new AnimationState<>(animationState.getTypeConverter(), t10, v10, j10, j11, z10);
    }

    public static /* synthetic */ AnimationState copy$default(AnimationState animationState, Object obj, AnimationVector animationVector, long j10, long j11, boolean z10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = animationState.getValue();
        }
        if ((i10 & 2) != 0) {
            animationVector = AnimationVectorsKt.copy(animationState.getVelocityVector());
        }
        if ((i10 & 4) != 0) {
            j10 = animationState.getLastFrameTimeNanos();
        }
        if ((i10 & 8) != 0) {
            j11 = animationState.getFinishedTimeNanos();
        }
        if ((i10 & 16) != 0) {
            z10 = animationState.isRunning();
        }
        boolean z11 = z10;
        long j12 = j11;
        return copy((AnimationState<Object, AnimationVector>) animationState, obj, animationVector, j10, j12, z11);
    }

    public static final <T, V extends AnimationVector> V createZeroVectorFrom(TwoWayConverter<T, V> twoWayConverter, T t10) {
        V v10 = (V) twoWayConverter.getConvertToVector().invoke(t10);
        v10.reset$animation_core_release();
        return v10;
    }

    public static final boolean isFinished(AnimationState<?, ?> animationState) {
        return animationState.getFinishedTimeNanos() != Long.MIN_VALUE;
    }

    public static /* synthetic */ AnimationState AnimationState$default(TwoWayConverter twoWayConverter, Object obj, Object obj2, long j10, long j11, boolean z10, int i10, Object obj3) {
        if ((i10 & 8) != 0) {
            j10 = Long.MIN_VALUE;
        }
        if ((i10 & 16) != 0) {
            j11 = Long.MIN_VALUE;
        }
        if ((i10 & 32) != 0) {
            z10 = false;
        }
        return AnimationState(twoWayConverter, obj, obj2, j10, j11, z10);
    }

    public static final AnimationState<Float, AnimationVector1D> copy(AnimationState<Float, AnimationVector1D> animationState, float f10, float f11, long j10, long j11, boolean z10) {
        return new AnimationState<>(animationState.getTypeConverter(), Float.valueOf(f10), AnimationVectorsKt.AnimationVector(f11), j10, j11, z10);
    }

    public static final <T, V extends AnimationVector> AnimationState<T, V> AnimationState(TwoWayConverter<T, V> twoWayConverter, T t10, T t11, long j10, long j11, boolean z10) {
        return new AnimationState<>(twoWayConverter, t10, (AnimationVector) twoWayConverter.getConvertToVector().invoke(t11), j10, j11, z10);
    }

    public static /* synthetic */ AnimationState copy$default(AnimationState animationState, float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = ((Number) animationState.getValue()).floatValue();
        }
        if ((i10 & 2) != 0) {
            f11 = ((AnimationVector1D) animationState.getVelocityVector()).getValue();
        }
        if ((i10 & 4) != 0) {
            j10 = animationState.getLastFrameTimeNanos();
        }
        if ((i10 & 8) != 0) {
            j11 = animationState.getFinishedTimeNanos();
        }
        if ((i10 & 16) != 0) {
            z10 = animationState.isRunning();
        }
        boolean z11 = z10;
        long j12 = j11;
        return copy((AnimationState<Float, AnimationVector1D>) animationState, f10, f11, j10, j12, z11);
    }
}
