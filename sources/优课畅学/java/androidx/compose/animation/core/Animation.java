package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* loaded from: classes.dex */
public interface Animation<T, V extends AnimationVector> {

    public static final class DefaultImpls {
        @Deprecated
        public static <T, V extends AnimationVector> boolean isFinishedFromNanos(Animation<T, V> animation, long j10) {
            return Animation.super.isFinishedFromNanos(j10);
        }
    }

    long getDurationNanos();

    T getTargetValue();

    TwoWayConverter<T, V> getTypeConverter();

    T getValueFromNanos(long j10);

    V getVelocityVectorFromNanos(long j10);

    default boolean isFinishedFromNanos(long j10) {
        return j10 >= getDurationNanos();
    }

    boolean isInfinite();
}
