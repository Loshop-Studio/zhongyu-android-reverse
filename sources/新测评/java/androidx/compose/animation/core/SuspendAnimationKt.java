package androidx.compose.animation.core;

import androidx.autofill.HintConstants;
import androidx.compose.p013ui.MotionDurationScale;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a\u0096\u0001\u0010\u0005\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u000b2\u0006\u0010\f\u001a\u0002H\u00072\u0006\u0010\r\u001a\u0002H\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u0001H\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00070\u001026\u0010\u0011\u001a2\u0012\u0013\u0012\u0011H\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u0011H\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00060\u0012H\u0086@¢\u0006\u0002\u0010\u0017\u001ap\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u00012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u001026\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00060\u0012H\u0086@¢\u0006\u0002\u0010\u0018\u001a^\u0010\u0019\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u001a26\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00060\u0012H\u0086@¢\u0006\u0002\u0010\u001b\u001as\u0010\u0005\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\"\u0012\u0004\u0012\u00020\u00060!¢\u0006\u0002\b#H\u0080@¢\u0006\u0002\u0010$\u001am\u0010\u0019\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00070%2\b\b\u0002\u0010&\u001a\u00020'2%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\"\u0012\u0004\u0012\u00020\u00060!¢\u0006\u0002\b#H\u0086@¢\u0006\u0002\u0010(\u001aw\u0010)\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001c2\u0006\u0010\r\u001a\u0002H\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00102\b\b\u0002\u0010&\u001a\u00020'2%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\"\u0012\u0004\u0012\u00020\u00060!¢\u0006\u0002\b#H\u0086@¢\u0006\u0002\u0010*\u001aW\u0010+\u001a\u0002H,\"\u0004\b\u0000\u0010,\"\u0004\b\u0001\u0010\u0007\"\b\b\u0002\u0010\b*\u00020\t*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001e2!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(.\u0012\u0004\u0012\u0002H,0!H\u0082@¢\u0006\u0002\u0010/\u001a\u0085\u0001\u00100\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\"2\u0006\u0010.\u001a\u00020 2\u0006\u00101\u001a\u00020 2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001e2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001c2#\u0010\u0011\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\"\u0012\u0004\u0012\u00020\u00060!¢\u0006\u0002\b#H\u0002\u001a\u0085\u0001\u00104\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\"2\u0006\u0010.\u001a\u00020 2\u0006\u0010\u0000\u001a\u00020\u00012\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001e2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001c2#\u0010\u0011\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\"\u0012\u0004\u0012\u00020\u00060!¢\u0006\u0002\b#H\u0002\u001a<\u00105\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\"2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001cH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u00066"}, m13558d2 = {"durationScale", "", "Lkotlin/coroutines/CoroutineContext;", "getDurationScale", "(Lkotlin/coroutines/CoroutineContext;)F", "animate", "", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "initialValue", "targetValue", "initialVelocity", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "value", "velocity", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(FFFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateDecay", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "(FFLandroidx/compose/animation/core/FloatDecayAnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationState;", "animation", "Landroidx/compose/animation/core/Animation;", "startTimeNanos", "", "Lkotlin/Function1;", "Landroidx/compose/animation/core/AnimationScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/Animation;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "sequentialAnimation", "", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callWithFrameNanos", "R", "onFrame", "frameTimeNanos", "(Landroidx/compose/animation/core/Animation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doAnimationFrame", "playTimeNanos", "anim", "state", "doAnimationFrameWithScale", "updateState", "animation-core_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSuspendAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendAnimation.kt\nandroidx/compose/animation/core/SuspendAnimationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n*L\n1#1,363:1\n1#2:364\n52#3,5:365\n*S KotlinDebug\n*F\n+ 1 SuspendAnimation.kt\nandroidx/compose/animation/core/SuspendAnimationKt\n*L\n312#1:365,5\n*E\n"})
/* loaded from: classes.dex */
public final class SuspendAnimationKt {

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.animation.core.SuspendAnimationKt", m13596f = "SuspendAnimation.kt", m13597i = {0, 0, 0, 0, 1, 1, 1, 1}, m13598l = {231, 280}, m13599m = "animate", m13600n = {"$this$animate", "animation", "block", "lateInitScope", "$this$animate", "animation", "block", "lateInitScope"}, m13601s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: androidx.compose.animation.core.SuspendAnimationKt$animate$4 */
    public static final class C10754<T, V extends AnimationVector> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C10754(Continuation<? super C10754> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SuspendAnimationKt.animate(null, null, 0L, null, this);
        }
    }

    public static final Object animate(float f10, float f11, float f12, AnimationSpec<Float> animationSpec, Function2<? super Float, ? super Float, Unit> function2, Continuation<? super Unit> continuation) {
        Object objAnimate = animate(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Boxing.boxFloat(f10), Boxing.boxFloat(f11), Boxing.boxFloat(f12), animationSpec, function2, continuation);
        return objAnimate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimate : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animate$default(float f10, float f11, float f12, AnimationSpec animationSpec, Function2 function2, Continuation continuation, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(f10, f11, f12, animationSpec, function2, continuation);
    }

    public static final Object animateDecay(float f10, float f11, FloatDecayAnimationSpec floatDecayAnimationSpec, final Function2<? super Float, ? super Float, Unit> function2, Continuation<? super Unit> continuation) {
        Object objAnimate$default = animate$default(AnimationStateKt.AnimationState$default(f10, f11, 0L, 0L, false, 28, null), AnimationKt.DecayAnimation(floatDecayAnimationSpec, f10, f11), 0L, new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animateDecay.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                invoke2(animationScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                function2.invoke(animationScope.getValue(), Float.valueOf(((AnimationVector1D) animationScope.getVelocityVector()).getValue()));
            }
        }, continuation, 2, null);
        return objAnimate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimate$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateDecay$default(AnimationState animationState, DecayAnimationSpec decayAnimationSpec, boolean z9, Function1 function1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        if ((i10 & 4) != 0) {
            function1 = new Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animateDecay.4
                public final void invoke(AnimationScope animationScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AnimationScope) obj2);
                    return Unit.INSTANCE;
                }
            };
        }
        return animateDecay(animationState, decayAnimationSpec, z9, function1, (Continuation<? super Unit>) continuation);
    }

    public static final <T, V extends AnimationVector> Object animateTo(AnimationState<T, V> animationState, T t10, AnimationSpec<T> animationSpec, boolean z9, Function1<? super AnimationScope<T, V>, Unit> function1, Continuation<? super Unit> continuation) {
        Object objAnimate = animate(animationState, new TargetBasedAnimation(animationSpec, animationState.getTypeConverter(), animationState.getValue(), t10, animationState.getVelocityVector()), z9 ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, function1, continuation);
        return objAnimate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimate : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateTo$default(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z9, Function1 function1, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i10 & 4) != 0) {
            z9 = false;
        }
        boolean z10 = z9;
        if ((i10 & 8) != 0) {
            function1 = new Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animateTo.2
                public final void invoke(AnimationScope animationScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((AnimationScope) obj3);
                    return Unit.INSTANCE;
                }
            };
        }
        return animateTo(animationState, obj, animationSpec2, z10, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R, T, V extends AnimationVector> Object callWithFrameNanos(Animation<T, V> animation, final Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        return animation.getIsInfinite() ? InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(function1, continuation) : MonotonicFrameClockKt.withFrameNanos(new Function1<Long, R>() { // from class: androidx.compose.animation.core.SuspendAnimationKt.callWithFrameNanos.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final R invoke(long j10) {
                return function1.invoke(Long.valueOf(j10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Long l10) {
                return invoke(l10.longValue());
            }
        }, continuation);
    }

    private static final <T, V extends AnimationVector> void doAnimationFrame(AnimationScope<T, V> animationScope, long j10, long j11, Animation<T, V> animation, AnimationState<T, V> animationState, Function1<? super AnimationScope<T, V>, Unit> function1) {
        animationScope.setLastFrameTimeNanos$animation_core_release(j10);
        animationScope.setValue$animation_core_release(animation.getValueFromNanos(j11));
        animationScope.setVelocityVector$animation_core_release(animation.getVelocityVectorFromNanos(j11));
        if (animation.isFinishedFromNanos(j11)) {
            animationScope.setFinishedTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
            animationScope.setRunning$animation_core_release(false);
        }
        updateState(animationScope, animationState);
        function1.invoke(animationScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AnimationVector> void doAnimationFrameWithScale(AnimationScope<T, V> animationScope, long j10, float f10, Animation<T, V> animation, AnimationState<T, V> animationState, Function1<? super AnimationScope<T, V>, Unit> function1) {
        doAnimationFrame(animationScope, j10, f10 == 0.0f ? animation.getDurationNanos() : (long) ((j10 - animationScope.getStartTimeNanos()) / f10), animation, animationState, function1);
    }

    public static final float getDurationScale(CoroutineContext coroutineContext) {
        MotionDurationScale motionDurationScale = (MotionDurationScale) coroutineContext.get(MotionDurationScale.INSTANCE);
        float scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
        if (!(scaleFactor >= 0.0f)) {
            PreconditionsKt.throwIllegalStateException("negative scale factor");
        }
        return scaleFactor;
    }

    public static final <T, V extends AnimationVector> void updateState(AnimationScope<T, V> animationScope, AnimationState<T, V> animationState) {
        animationState.setValue$animation_core_release(animationScope.getValue());
        AnimationVectorsKt.copyFrom(animationState.getVelocityVector(), animationScope.getVelocityVector());
        animationState.setFinishedTimeNanos$animation_core_release(animationScope.getFinishedTimeNanos());
        animationState.setLastFrameTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
        animationState.setRunning$animation_core_release(animationScope.isRunning());
    }

    public static final <T, V extends AnimationVector> Object animate(final TwoWayConverter<T, V> twoWayConverter, T t10, T t11, T t12, AnimationSpec<T> animationSpec, final Function2<? super T, ? super T, Unit> function2, Continuation<? super Unit> continuation) {
        V vNewInstance;
        if (t12 == null || (vNewInstance = twoWayConverter.getConvertToVector().invoke(t12)) == null) {
            vNewInstance = AnimationVectorsKt.newInstance(twoWayConverter.getConvertToVector().invoke(t10));
        }
        AnimationVector animationVector = vNewInstance;
        Object objAnimate$default = animate$default(new AnimationState(twoWayConverter, t10, animationVector, 0L, 0L, false, 56, null), new TargetBasedAnimation(animationSpec, twoWayConverter, t10, t11, animationVector), 0L, new Function1<AnimationScope<T, V>, Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animate.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((AnimationScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(AnimationScope<T, V> animationScope) {
                function2.invoke(animationScope.getValue(), twoWayConverter.getConvertFromVector().invoke(animationScope.getVelocityVector()));
            }
        }, continuation, 2, null);
        return objAnimate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimate$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animate$default(TwoWayConverter twoWayConverter, Object obj, Object obj2, Object obj3, AnimationSpec animationSpec, Function2 function2, Continuation continuation, int i10, Object obj4) {
        if ((i10 & 8) != 0) {
            obj3 = null;
        }
        if ((i10 & 16) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(twoWayConverter, obj, obj2, obj3, animationSpec, function2, continuation);
    }

    public static final <T, V extends AnimationVector> Object animateDecay(AnimationState<T, V> animationState, DecayAnimationSpec<T> decayAnimationSpec, boolean z9, Function1<? super AnimationScope<T, V>, Unit> function1, Continuation<? super Unit> continuation) {
        Object objAnimate = animate(animationState, new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter<T, AnimationVector>) animationState.getTypeConverter(), (Object) animationState.getValue(), animationState.getVelocityVector()), z9 ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, function1, continuation);
        return objAnimate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimate : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animate$default(AnimationState animationState, Animation animation, long j10, Function1 function1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MIN_VALUE;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            function1 = new Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animate.5
                public final void invoke(AnimationScope animationScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AnimationScope) obj2);
                    return Unit.INSTANCE;
                }
            };
        }
        return animate(animationState, animation, j11, function1, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, androidx.compose.animation.core.AnimationScope] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, V extends androidx.compose.animation.core.AnimationVector> java.lang.Object animate(final androidx.compose.animation.core.AnimationState<T, V> r23, androidx.compose.animation.core.Animation<T, V> r24, long r25, final kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.AnimationScope<T, V>, kotlin.Unit> r27, kotlin.coroutines.Continuation<? super kotlin.Unit> r28) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.animate(androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.Animation, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
