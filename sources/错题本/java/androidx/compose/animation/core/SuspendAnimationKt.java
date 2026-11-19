package androidx.compose.animation.core;

import androidx.autofill.HintConstants;
import androidx.compose.p011ui.MotionDurationScale;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C5825f;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ar\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u000426\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a`\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000f26\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0098\u0001\u0010\r\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000426\u0010\f\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@¢\u0006\u0004\b\r\u0010\u0017\u001ay\u0010\u001e\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00192%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c\u0012\u0004\u0012\u00020\u000b0\u001b¢\u0006\u0002\b\u001dH\u0086@¢\u0006\u0004\b\u001e\u0010\u001f\u001ao\u0010\u0010\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000 2\b\b\u0002\u0010\u001a\u001a\u00020\u00192%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c\u0012\u0004\u0012\u00020\u000b0\u001b¢\u0006\u0002\b\u001dH\u0086@¢\u0006\u0004\b\u0010\u0010!\u001au\u0010\r\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"2\b\b\u0002\u0010%\u001a\u00020$2%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c\u0012\u0004\u0012\u00020\u000b0\u001b¢\u0006\u0002\b\u001dH\u0080@¢\u0006\u0004\b\r\u0010&\u001aY\u0010*\u001a\u00028\u0000\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010\u0012\"\b\b\u0002\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\"2!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110$¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b((\u0012\u0004\u0012\u00028\u00000\u001bH\u0082@¢\u0006\u0004\b*\u0010+\u001aC\u0010-\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018H\u0000¢\u0006\u0004\b-\u0010.\u001a\u008c\u0001\u00101\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c2\u0006\u0010(\u001a\u00020$2\u0006\u0010/\u001a\u00020\u00002\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182#\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c\u0012\u0004\u0012\u00020\u000b0\u001b¢\u0006\u0002\b\u001dH\u0002¢\u0006\u0004\b1\u00102\u001a\u008c\u0001\u00104\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c2\u0006\u0010(\u001a\u00020$2\u0006\u00103\u001a\u00020$2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182#\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c\u0012\u0004\u0012\u00020\u000b0\u001b¢\u0006\u0002\b\u001dH\u0002¢\u0006\u0004\b4\u00105\"\u0018\u0010/\u001a\u00020\u0000*\u0002068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u00069"}, m5110d2 = {"", "initialValue", "targetValue", "initialVelocity", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "value", "velocity", "Ld6/s;", "block", "animate", "(FFFLandroidx/compose/animation/core/AnimationSpec;Lr6/e;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "animateDecay", "(FFLandroidx/compose/animation/core/FloatDecayAnimationSpec;Lr6/e;Lh6/c;)Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lr6/e;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationState;", "", "sequentialAnimation", "Lkotlin/Function1;", "Landroidx/compose/animation/core/AnimationScope;", "Lkotlin/ExtensionFunctionType;", "animateTo", "(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLr6/c;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;ZLr6/c;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/Animation;", "animation", "", "startTimeNanos", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/Animation;JLr6/c;Lh6/c;)Ljava/lang/Object;", "R", "frameTimeNanos", "onFrame", "callWithFrameNanos", "(Landroidx/compose/animation/core/Animation;Lr6/c;Lh6/c;)Ljava/lang/Object;", "state", "updateState", "(Landroidx/compose/animation/core/AnimationScope;Landroidx/compose/animation/core/AnimationState;)V", "durationScale", "anim", "doAnimationFrameWithScale", "(Landroidx/compose/animation/core/AnimationScope;JFLandroidx/compose/animation/core/Animation;Landroidx/compose/animation/core/AnimationState;Lr6/c;)V", "playTimeNanos", "doAnimationFrame", "(Landroidx/compose/animation/core/AnimationScope;JJLandroidx/compose/animation/core/Animation;Landroidx/compose/animation/core/AnimationState;Lr6/c;)V", "Lh6/h;", "getDurationScale", "(Lh6/h;)F", "animation-core_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSuspendAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendAnimation.kt\nandroidx/compose/animation/core/SuspendAnimationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n*L\n1#1,363:1\n1#2:364\n52#3,5:365\n*S KotlinDebug\n*F\n+ 1 SuspendAnimation.kt\nandroidx/compose/animation/core/SuspendAnimationKt\n*L\n312#1:365,5\n*E\n"})
/* loaded from: classes.dex */
public final class SuspendAnimationKt {

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.animation.core.SuspendAnimationKt", m5303f = "SuspendAnimation.kt", m5304i = {0, 0, 0, 0, 1, 1, 1, 1}, m5305l = {231, 280}, m5306m = "animate", m5307n = {"$this$animate", "animation", "block", "lateInitScope", "$this$animate", "animation", "block", "lateInitScope"}, m5308s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: androidx.compose.animation.core.SuspendAnimationKt$animate$4 */
    public static final class C07014<T, V extends AnimationVector> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C07014(InterfaceC5631c<? super C07014> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SuspendAnimationKt.animate(null, null, 0L, null, this);
        }
    }

    @Nullable
    public static final Object animate(float f, float f7, float f8, @NotNull AnimationSpec<Float> animationSpec, @NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAnimate = animate(VectorConvertersKt.getVectorConverter(C5825f.f9219a), new Float(f), new Float(f7), new Float(f8), animationSpec, interfaceC6473e, interfaceC5631c);
        return objAnimate == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimate : C5443s.f8405a;
    }

    public static /* synthetic */ Object animate$default(float f, float f7, float f8, AnimationSpec animationSpec, InterfaceC6473e interfaceC6473e, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 4) != 0) {
            f8 = 0.0f;
        }
        if ((i & 8) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(f, f7, f8, animationSpec, interfaceC6473e, interfaceC5631c);
    }

    @Nullable
    public static final Object animateDecay(float f, float f7, @NotNull FloatDecayAnimationSpec floatDecayAnimationSpec, @NotNull final InterfaceC6473e interfaceC6473e, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAnimate$default = animate$default(AnimationStateKt.AnimationState$default(f, f7, 0L, 0L, false, 28, null), AnimationKt.DecayAnimation(floatDecayAnimationSpec, f, f7), 0L, new InterfaceC6471c() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animateDecay.2
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AnimationScope<Float, AnimationVector1D>) obj);
                return C5443s.f8405a;
            }

            public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                interfaceC6473e.invoke(animationScope.getValue(), Float.valueOf(((AnimationVector1D) animationScope.getVelocityVector()).getValue()));
            }
        }, interfaceC5631c, 2, null);
        return objAnimate$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimate$default : C5443s.f8405a;
    }

    public static /* synthetic */ Object animateDecay$default(AnimationState animationState, DecayAnimationSpec decayAnimationSpec, boolean z8, InterfaceC6471c interfaceC6471c, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 2) != 0) {
            z8 = false;
        }
        if ((i & 4) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animateDecay.4
                public final void invoke(AnimationScope animationScope) {
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AnimationScope) obj2);
                    return C5443s.f8405a;
                }
            };
        }
        return animateDecay(animationState, decayAnimationSpec, z8, interfaceC6471c, (InterfaceC5631c<? super C5443s>) interfaceC5631c);
    }

    @Nullable
    public static final <T, V extends AnimationVector> Object animateTo(@NotNull AnimationState<T, V> animationState, T t8, @NotNull AnimationSpec<T> animationSpec, boolean z8, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAnimate = animate(animationState, new TargetBasedAnimation(animationSpec, animationState.getTypeConverter(), animationState.getValue(), t8, animationState.getVelocityVector()), z8 ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, interfaceC6471c, interfaceC5631c);
        return objAnimate == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimate : C5443s.f8405a;
    }

    public static /* synthetic */ Object animateTo$default(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z8, InterfaceC6471c interfaceC6471c, InterfaceC5631c interfaceC5631c, int i, Object obj2) {
        if ((i & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i & 4) != 0) {
            z8 = false;
        }
        boolean z9 = z8;
        if ((i & 8) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animateTo.2
                public final void invoke(AnimationScope animationScope) {
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((AnimationScope) obj3);
                    return C5443s.f8405a;
                }
            };
        }
        return animateTo(animationState, obj, animationSpec2, z9, interfaceC6471c, interfaceC5631c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R, T, V extends AnimationVector> Object callWithFrameNanos(Animation<T, V> animation, final InterfaceC6471c interfaceC6471c, InterfaceC5631c<? super R> interfaceC5631c) {
        return animation.getIsInfinite() ? InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(interfaceC6471c, interfaceC5631c) : MonotonicFrameClockKt.withFrameNanos(new InterfaceC6471c() { // from class: androidx.compose.animation.core.SuspendAnimationKt.callWithFrameNanos.2
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [R, java.lang.Object] */
            public final R invoke(long j7) {
                return interfaceC6471c.invoke(Long.valueOf(j7));
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }
        }, interfaceC5631c);
    }

    private static final <T, V extends AnimationVector> void doAnimationFrame(AnimationScope<T, V> animationScope, long j7, long j8, Animation<T, V> animation, AnimationState<T, V> animationState, InterfaceC6471c interfaceC6471c) {
        animationScope.setLastFrameTimeNanos$animation_core_release(j7);
        animationScope.setValue$animation_core_release(animation.getValueFromNanos(j8));
        animationScope.setVelocityVector$animation_core_release(animation.getVelocityVectorFromNanos(j8));
        if (animation.isFinishedFromNanos(j8)) {
            animationScope.setFinishedTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
            animationScope.setRunning$animation_core_release(false);
        }
        updateState(animationScope, animationState);
        interfaceC6471c.invoke(animationScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AnimationVector> void doAnimationFrameWithScale(AnimationScope<T, V> animationScope, long j7, float f, Animation<T, V> animation, AnimationState<T, V> animationState, InterfaceC6471c interfaceC6471c) {
        doAnimationFrame(animationScope, j7, f == 0.0f ? animation.getDurationNanos() : (long) ((j7 - animationScope.getStartTimeNanos()) / f), animation, animationState, interfaceC6471c);
    }

    public static final float getDurationScale(@NotNull InterfaceC5636h interfaceC5636h) {
        MotionDurationScale motionDurationScale = (MotionDurationScale) interfaceC5636h.get(MotionDurationScale.INSTANCE);
        float scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
        if (!(scaleFactor >= 0.0f)) {
            PreconditionsKt.throwIllegalStateException("negative scale factor");
        }
        return scaleFactor;
    }

    public static final <T, V extends AnimationVector> void updateState(@NotNull AnimationScope<T, V> animationScope, @NotNull AnimationState<T, V> animationState) {
        animationState.setValue$animation_core_release(animationScope.getValue());
        AnimationVectorsKt.copyFrom(animationState.getVelocityVector(), animationScope.getVelocityVector());
        animationState.setFinishedTimeNanos$animation_core_release(animationScope.getFinishedTimeNanos());
        animationState.setLastFrameTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
        animationState.setRunning$animation_core_release(animationScope.isRunning());
    }

    public static /* synthetic */ Object animate$default(TwoWayConverter twoWayConverter, Object obj, Object obj2, Object obj3, AnimationSpec animationSpec, InterfaceC6473e interfaceC6473e, InterfaceC5631c interfaceC5631c, int i, Object obj4) {
        if ((i & 8) != 0) {
            obj3 = null;
        }
        if ((i & 16) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(twoWayConverter, obj, obj2, obj3, animationSpec, interfaceC6473e, interfaceC5631c);
    }

    public static /* synthetic */ Object animate$default(AnimationState animationState, Animation animation, long j7, InterfaceC6471c interfaceC6471c, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 2) != 0) {
            j7 = Long.MIN_VALUE;
        }
        long j8 = j7;
        if ((i & 4) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animate.5
                public final void invoke(AnimationScope animationScope) {
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AnimationScope) obj2);
                    return C5443s.f8405a;
                }
            };
        }
        return animate(animationState, animation, j8, interfaceC6471c, interfaceC5631c);
    }

    @Nullable
    public static final <T, V extends AnimationVector> Object animateDecay(@NotNull AnimationState<T, V> animationState, @NotNull DecayAnimationSpec<T> decayAnimationSpec, boolean z8, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAnimate = animate(animationState, new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter<T, AnimationVector>) animationState.getTypeConverter(), (Object) animationState.getValue(), animationState.getVelocityVector()), z8 ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, interfaceC6471c, interfaceC5631c);
        return objAnimate == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimate : C5443s.f8405a;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, androidx.compose.animation.core.AnimationScope] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, V extends androidx.compose.animation.core.AnimationVector> java.lang.Object animate(@org.jetbrains.annotations.NotNull final androidx.compose.animation.core.AnimationState<T, V> r23, @org.jetbrains.annotations.NotNull androidx.compose.animation.core.Animation<T, V> r24, long r25, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r27, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super p045d6.C5443s> r28) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.animate(androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.Animation, long, r6.c, h6.c):java.lang.Object");
    }

    @Nullable
    public static final <T, V extends AnimationVector> Object animate(@NotNull final TwoWayConverter<T, V> twoWayConverter, T t8, T t9, @Nullable T t10, @NotNull AnimationSpec<T> animationSpec, @NotNull final InterfaceC6473e interfaceC6473e, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        AnimationVector animationVectorNewInstance;
        if (t10 == null || (animationVectorNewInstance = (AnimationVector) twoWayConverter.getConvertToVector().invoke(t10)) == null) {
            animationVectorNewInstance = AnimationVectorsKt.newInstance((AnimationVector) twoWayConverter.getConvertToVector().invoke(t8));
        }
        AnimationVector animationVector = animationVectorNewInstance;
        Object objAnimate$default = animate$default(new AnimationState(twoWayConverter, t8, animationVector, 0L, 0L, false, 56, null), new TargetBasedAnimation(animationSpec, twoWayConverter, t8, t9, animationVector), 0L, new InterfaceC6471c() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animate.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AnimationScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(AnimationScope<T, V> animationScope) {
                interfaceC6473e.invoke(animationScope.getValue(), twoWayConverter.getConvertFromVector().invoke(animationScope.getVelocityVector()));
            }
        }, interfaceC5631c, 2, null);
        return objAnimate$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimate$default : C5443s.f8405a;
    }
}
