package androidx.compose.animation.core;

import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.C5825f;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000J\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a,\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t\u001aa\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u00120\u0010\"\u0004\b\u0000\u0010\u0011\"\b\b\u0001\u0010\u0012*\u00020\u00132\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u00120\u00162\u0006\u0010\r\u001a\u0002H\u00112\u0006\u0010\u0017\u001a\u0002H\u00112\u0006\u0010\u000e\u001a\u0002H\u0011¢\u0006\u0002\u0010\u0018\u001aE\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u00120\u0010\"\b\b\u0000\u0010\u0012*\u00020\u0013*\b\u0012\u0004\u0012\u0002H\u00120\u001a2\u0006\u0010\r\u001a\u0002H\u00122\u0006\u0010\u0017\u001a\u0002H\u00122\u0006\u0010\u000e\u001a\u0002H\u0012H\u0007¢\u0006\u0002\u0010\u001b\u001a3\u0010\u001c\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u0011\"\b\b\u0001\u0010\u0012*\u00020\u0013*\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u00120\u00042\u0006\u0010\u001d\u001a\u00020\u0001¢\u0006\u0002\u0010\u001e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\" \u0010\u0003\u001a\u00020\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001f"}, m5110d2 = {"MillisToNanos", "", "SecondsToMillis", "durationMillis", "Landroidx/compose/animation/core/Animation;", "getDurationMillis", "(Landroidx/compose/animation/core/Animation;)J", "DecayAnimation", "Landroidx/compose/animation/core/DecayAnimation;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "animationSpec", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "initialValue", "initialVelocity", "TargetBasedAnimation", "Landroidx/compose/animation/core/TargetBasedAnimation;", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/AnimationSpec;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "targetValue", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/animation/core/TargetBasedAnimation;", "createAnimation", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/TargetBasedAnimation;", "getVelocityFromNanos", "playTimeNanos", "(Landroidx/compose/animation/core/Animation;J)Ljava/lang/Object;", "animation-core_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AnimationKt {
    public static final long MillisToNanos = 1000000;
    public static final long SecondsToMillis = 1000;

    @NotNull
    public static final DecayAnimation<Float, AnimationVector1D> DecayAnimation(@NotNull FloatDecayAnimationSpec floatDecayAnimationSpec, float f, float f7) {
        return new DecayAnimation<>((DecayAnimationSpec<Float>) DecayAnimationSpecKt.generateDecayAnimationSpec(floatDecayAnimationSpec), VectorConvertersKt.getVectorConverter(C5825f.f9219a), Float.valueOf(f), AnimationVectorsKt.AnimationVector(f7));
    }

    public static /* synthetic */ DecayAnimation DecayAnimation$default(FloatDecayAnimationSpec floatDecayAnimationSpec, float f, float f7, int i, Object obj) {
        if ((i & 4) != 0) {
            f7 = 0.0f;
        }
        return DecayAnimation(floatDecayAnimationSpec, f, f7);
    }

    @NotNull
    public static final <T, V extends AnimationVector> TargetBasedAnimation<T, V> TargetBasedAnimation(@NotNull AnimationSpec<T> animationSpec, @NotNull TwoWayConverter<T, V> twoWayConverter, T t8, T t9, T t10) {
        return new TargetBasedAnimation<>(animationSpec, twoWayConverter, t8, t9, (AnimationVector) twoWayConverter.getConvertToVector().invoke(t10));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final <V extends AnimationVector> TargetBasedAnimation<V, V> createAnimation(@NotNull VectorizedAnimationSpec<V> vectorizedAnimationSpec, @NotNull V v2, @NotNull V v4, @NotNull V v8) {
        return new TargetBasedAnimation<>(vectorizedAnimationSpec, (TwoWayConverter<V, V>) VectorConvertersKt.TwoWayConverter(new InterfaceC6471c() { // from class: androidx.compose.animation.core.AnimationKt.createAnimation.1
            /* JADX WARN: Incorrect return type in method signature: (TV;)TV; */
            @Override // p152r6.InterfaceC6471c
            public final AnimationVector invoke(AnimationVector animationVector) {
                return animationVector;
            }
        }, new InterfaceC6471c() { // from class: androidx.compose.animation.core.AnimationKt.createAnimation.2
            /* JADX WARN: Incorrect return type in method signature: (TV;)TV; */
            @Override // p152r6.InterfaceC6471c
            public final AnimationVector invoke(AnimationVector animationVector) {
                return animationVector;
            }
        }), v2, v4, v8);
    }

    public static final long getDurationMillis(@NotNull Animation<?, ?> animation) {
        return animation.getDurationNanos() / MillisToNanos;
    }

    public static final <T, V extends AnimationVector> T getVelocityFromNanos(@NotNull Animation<T, V> animation, long j7) {
        return (T) animation.getTypeConverter().getConvertFromVector().invoke(animation.getVelocityVectorFromNanos(j7));
    }
}
