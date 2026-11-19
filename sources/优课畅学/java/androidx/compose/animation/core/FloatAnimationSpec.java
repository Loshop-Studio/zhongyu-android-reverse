package androidx.compose.animation.core;

/* loaded from: classes.dex */
public interface FloatAnimationSpec extends AnimationSpec<Float> {

    public static final class DefaultImpls {
        @Deprecated
        public static float getEndVelocity(FloatAnimationSpec floatAnimationSpec, float f10, float f11, float f12) {
            return FloatAnimationSpec.super.getEndVelocity(f10, f11, f12);
        }

        @Deprecated
        public static <V extends AnimationVector> VectorizedFloatAnimationSpec<V> vectorize(FloatAnimationSpec floatAnimationSpec, TwoWayConverter<Float, V> twoWayConverter) {
            return FloatAnimationSpec.super.vectorize((TwoWayConverter) twoWayConverter);
        }
    }

    long getDurationNanos(float f10, float f11, float f12);

    default float getEndVelocity(float f10, float f11, float f12) {
        return getVelocityFromNanos(getDurationNanos(f10, f11, f12), f10, f11, f12);
    }

    float getValueFromNanos(long j10, float f10, float f11, float f12);

    float getVelocityFromNanos(long j10, float f10, float f11, float f12);

    @Override // androidx.compose.animation.core.AnimationSpec
    default <V extends AnimationVector> VectorizedFloatAnimationSpec<V> vectorize(TwoWayConverter<Float, V> twoWayConverter) {
        return new VectorizedFloatAnimationSpec<>(this);
    }
}
