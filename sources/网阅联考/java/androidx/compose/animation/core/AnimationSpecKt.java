package androidx.compose.animation.core;

import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000v\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007\u001aC\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u00022\u001d\u0010\r\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011H\u0007\u001a4\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0013\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007\u001aK\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0013\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0019\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0015H\u0007\u001a9\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u001c\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u0001H\u0002H\u0007¢\u0006\u0002\u0010!\u001a2\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00020#\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010$\u001a\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u00152\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a9\u0010'\u001a\u0004\u0018\u0001H(\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010(*\u00020)*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H(0*2\b\u0010+\u001a\u0004\u0018\u0001H\u0002H\u0002¢\u0006\u0002\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, m5175d2 = {"infiniteRepeatable", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", ExifInterface.GPS_DIRECTION_TRUE, "animation", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "repeatMode", "Landroidx/compose/animation/core/RepeatMode;", "initialStartOffset", "Landroidx/compose/animation/core/StartOffset;", "infiniteRepeatable-9IiC70o", "(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;J)Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "keyframes", "Landroidx/compose/animation/core/KeyframesSpec;", "init", "Lkotlin/Function1;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "", "Lkotlin/ExtensionFunctionType;", "repeatable", "Landroidx/compose/animation/core/RepeatableSpec;", "iterations", "", "repeatable-91I0pcU", "(ILandroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;J)Landroidx/compose/animation/core/RepeatableSpec;", "snap", "Landroidx/compose/animation/core/SnapSpec;", "delayMillis", "spring", "Landroidx/compose/animation/core/SpringSpec;", "dampingRatio", "", "stiffness", "visibilityThreshold", "(FFLjava/lang/Object;)Landroidx/compose/animation/core/SpringSpec;", "tween", "Landroidx/compose/animation/core/TweenSpec;", "durationMillis", "easing", "Landroidx/compose/animation/core/Easing;", "convert", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/TwoWayConverter;", "data", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)Landroidx/compose/animation/core/AnimationVector;", "animation-core_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AnimationSpecKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AnimationVector> V convert(TwoWayConverter<T, V> twoWayConverter, T t3) {
        if (t3 == null) {
            return null;
        }
        return twoWayConverter.getConvertToVector().invoke(t3);
    }

    @Stable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the infinite repeatable function that accepts start offset.")
    public static final /* synthetic */ InfiniteRepeatableSpec infiniteRepeatable(DurationBasedAnimationSpec animation, RepeatMode repeatMode) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
        return new InfiniteRepeatableSpec(animation, repeatMode, StartOffset.m7028constructorimpl$default(0, 0, 2, null), (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ InfiniteRepeatableSpec infiniteRepeatable$default(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return infiniteRepeatable(durationBasedAnimationSpec, repeatMode);
    }

    @Stable
    /* renamed from: infiniteRepeatable-9IiC70o, reason: not valid java name */
    public static final <T> InfiniteRepeatableSpec<T> m7007infiniteRepeatable9IiC70o(DurationBasedAnimationSpec<T> animation, RepeatMode repeatMode, long j4) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
        return new InfiniteRepeatableSpec<>(animation, repeatMode, j4, (DefaultConstructorMarker) null);
    }

    /* renamed from: infiniteRepeatable-9IiC70o$default, reason: not valid java name */
    public static /* synthetic */ InfiniteRepeatableSpec m7008infiniteRepeatable9IiC70o$default(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i4 & 4) != 0) {
            j4 = StartOffset.m7028constructorimpl$default(0, 0, 2, null);
        }
        return m7007infiniteRepeatable9IiC70o(durationBasedAnimationSpec, repeatMode, j4);
    }

    @Stable
    public static final <T> KeyframesSpec<T> keyframes(Function1<? super KeyframesSpec.KeyframesSpecConfig<T>, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new KeyframesSpec.KeyframesSpecConfig();
        init.invoke(keyframesSpecConfig);
        return new KeyframesSpec<>(keyframesSpecConfig);
    }

    @Stable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the repeatable function that accepts start offset.")
    public static final /* synthetic */ RepeatableSpec repeatable(int i4, DurationBasedAnimationSpec animation, RepeatMode repeatMode) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
        return new RepeatableSpec(i4, animation, repeatMode, StartOffset.m7028constructorimpl$default(0, 0, 2, null), (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ RepeatableSpec repeatable$default(int i4, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return repeatable(i4, durationBasedAnimationSpec, repeatMode);
    }

    @Stable
    /* renamed from: repeatable-91I0pcU, reason: not valid java name */
    public static final <T> RepeatableSpec<T> m7009repeatable91I0pcU(int i4, DurationBasedAnimationSpec<T> animation, RepeatMode repeatMode, long j4) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
        return new RepeatableSpec<>(i4, animation, repeatMode, j4, (DefaultConstructorMarker) null);
    }

    /* renamed from: repeatable-91I0pcU$default, reason: not valid java name */
    public static /* synthetic */ RepeatableSpec m7010repeatable91I0pcU$default(int i4, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i5 & 8) != 0) {
            j4 = StartOffset.m7028constructorimpl$default(0, 0, 2, null);
        }
        return m7009repeatable91I0pcU(i4, durationBasedAnimationSpec, repeatMode, j4);
    }

    @Stable
    public static final <T> SnapSpec<T> snap(int i4) {
        return new SnapSpec<>(i4);
    }

    public static /* synthetic */ SnapSpec snap$default(int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        return snap(i4);
    }

    @Stable
    public static final <T> SpringSpec<T> spring(float f4, float f5, T t3) {
        return new SpringSpec<>(f4, f5, t3);
    }

    public static /* synthetic */ SpringSpec spring$default(float f4, float f5, Object obj, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            f4 = 1.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 1500.0f;
        }
        if ((i4 & 4) != 0) {
            obj = null;
        }
        return spring(f4, f5, obj);
    }

    @Stable
    public static final <T> TweenSpec<T> tween(int i4, int i5, Easing easing) {
        Intrinsics.checkNotNullParameter(easing, "easing");
        return new TweenSpec<>(i4, i5, easing);
    }

    public static /* synthetic */ TweenSpec tween$default(int i4, int i5, Easing easing, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = AnimationConstants.DefaultDurationMillis;
        }
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        if ((i6 & 4) != 0) {
            easing = EasingKt.getFastOutSlowInEasing();
        }
        return tween(i4, i5, easing);
    }
}
