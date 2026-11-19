package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;

@StabilityInferred(parameters = 0)
@Metadata(m5174d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004B/\b\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\tB7\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\\\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010;2\u0006\u0010<\u001a\u00028\u00002\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000>2'\b\u0002\u0010?\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020A\u0018\u00010@¢\u0006\u0002\bBH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010CJh\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010;2\u0006\u0010)\u001a\u00028\u00002\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000E2\b\b\u0002\u0010<\u001a\u00028\u00002'\b\u0002\u0010?\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020A\u0018\u00010@¢\u0006\u0002\bBH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010FJ\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000HJ\u0015\u0010I\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010JJ\b\u0010K\u001a\u00020AH\u0002J`\u0010L\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010;2\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010N2\u0006\u0010<\u001a\u00028\u00002%\u0010?\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020A\u0018\u00010@¢\u0006\u0002\bBH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010OJ\u0019\u0010P\u001a\u00020A2\u0006\u0010)\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010QJ\u0011\u0010R\u001a\u00020AH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010SJ#\u0010T\u001a\u00020A2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u00100\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010UJ\u0019\u0010V\u001a\u00028\u0001*\u00028\u00002\u0006\u00103\u001a\u00020WH\u0002¢\u0006\u0002\u0010XR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u0004\u0018\u00018\u00002\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0010\u0010#\u001a\u00028\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010$R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u00028\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010$R\u0010\u0010(\u001a\u00028\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010$R+\u0010)\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010\u001c\u001a\u0004\b*\u0010!\"\u0004\b+\u0010,R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R$\u00100\u001a\u0004\u0018\u00018\u00002\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b1\u0010!R\u0010\u00102\u001a\u00028\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010$R\u0011\u00103\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b4\u0010!R\u0011\u00105\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b6\u0010!R\u0011\u00107\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0012\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Y"}, m5175d2 = {"Landroidx/compose/animation/core/Animatable;", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "", "initialValue", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "visibilityThreshold", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)V", "label", "", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/String;)V", "defaultSpringSpec", "Landroidx/compose/animation/core/SpringSpec;", "getDefaultSpringSpec$animation_core_release", "()Landroidx/compose/animation/core/SpringSpec;", "internalState", "Landroidx/compose/animation/core/AnimationState;", "getInternalState$animation_core_release", "()Landroidx/compose/animation/core/AnimationState;", "<set-?>", "", "isRunning", "()Z", "setRunning", "(Z)V", "isRunning$delegate", "Landroidx/compose/runtime/MutableState;", "getLabel", "()Ljava/lang/String;", "lowerBound", "getLowerBound", "()Ljava/lang/Object;", "Ljava/lang/Object;", "lowerBoundVector", "Landroidx/compose/animation/core/AnimationVector;", "mutatorMutex", "Landroidx/compose/animation/core/MutatorMutex;", "negativeInfinityBounds", "positiveInfinityBounds", "targetValue", "getTargetValue", "setTargetValue", "(Ljava/lang/Object;)V", "targetValue$delegate", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "upperBound", "getUpperBound", "upperBoundVector", "value", "getValue", "velocity", "getVelocity", "velocityVector", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "animateDecay", "Landroidx/compose/animation/core/AnimationResult;", "initialVelocity", "animationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "Landroidx/compose/animation/core/AnimationSpec;", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asState", "Landroidx/compose/runtime/State;", "clampToBounds", "(Ljava/lang/Object;)Ljava/lang/Object;", "endAnimation", "runAnimation", "animation", "Landroidx/compose/animation/core/Animation;", "(Landroidx/compose/animation/core/Animation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBounds", "(Ljava/lang/Object;Ljava/lang/Object;)V", "createVector", "", "(Ljava/lang/Object;F)Landroidx/compose/animation/core/AnimationVector;", "animation-core_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAnimatable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,477:1\n76#2:478\n102#2,2:479\n76#2:481\n102#2,2:482\n1#3:484\n*S KotlinDebug\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n*L\n96#1:478\n96#1:479,2\n103#1:481\n103#1:482,2\n*E\n"})
/* loaded from: classes.dex */
public final class Animatable<T, V extends AnimationVector> {
    public static final int $stable = 8;
    private final SpringSpec<T> defaultSpringSpec;
    private final AnimationState<T, V> internalState;

    /* renamed from: isRunning$delegate, reason: from kotlin metadata */
    private final MutableState isRunning;
    private final String label;
    private T lowerBound;
    private V lowerBoundVector;
    private final MutatorMutex mutatorMutex;
    private final V negativeInfinityBounds;
    private final V positiveInfinityBounds;

    /* renamed from: targetValue$delegate, reason: from kotlin metadata */
    private final MutableState targetValue;
    private final TwoWayConverter<T, V> typeConverter;
    private T upperBound;
    private V upperBoundVector;
    private final T visibilityThreshold;

    @Metadata(m5174d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@"}, m5175d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationResult;", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
    @DebugMetadata(m5191c = "androidx.compose.animation.core.Animatable$runAnimation$2", m5192f = "Animatable.kt", m5193i = {0, 0}, m5194l = {305}, m5195m = "invokeSuspend", m5196n = {"endState", "clampingNeeded"}, m5197s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.animation.core.Animatable$runAnimation$2 */
    public static final class C03222 extends SuspendLambda implements Function1<Continuation<? super AnimationResult<T, V>>, Object> {
        final /* synthetic */ Animation<T, V> $animation;
        final /* synthetic */ Function1<Animatable<T, V>, Unit> $block;
        final /* synthetic */ T $initialVelocity;
        final /* synthetic */ long $startTime;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C03222(Animatable<T, V> animatable, T t3, Animation<T, V> animation, long j4, Function1<? super Animatable<T, V>, Unit> function1, Continuation<? super C03222> continuation) {
            super(1, continuation);
            this.this$0 = animatable;
            this.$initialVelocity = t3;
            this.$animation = animation;
            this.$startTime = j4;
            this.$block = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C03222(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnimationState animationState;
            Ref.BooleanRef booleanRef;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.label;
            try {
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.getInternalState$animation_core_release().setVelocityVector$animation_core_release(this.this$0.getTypeConverter().getConvertToVector().invoke(this.$initialVelocity));
                    this.this$0.setTargetValue(this.$animation.getTargetValue());
                    this.this$0.setRunning(true);
                    final AnimationState animationStateCopy$default = AnimationStateKt.copy$default((AnimationState) this.this$0.getInternalState$animation_core_release(), (Object) null, (AnimationVector) null, 0L, Long.MIN_VALUE, false, 23, (Object) null);
                    final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    Animation<T, V> animation = this.$animation;
                    long j4 = this.$startTime;
                    final Animatable<T, V> animatable = this.this$0;
                    final Function1<Animatable<T, V>, Unit> function1 = this.$block;
                    Function1<AnimationScope<T, V>, Unit> function12 = new Function1<AnimationScope<T, V>, Unit>() { // from class: androidx.compose.animation.core.Animatable.runAnimation.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                            invoke((AnimationScope) obj2);
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public final void invoke(AnimationScope<T, V> animate) {
                            Intrinsics.checkNotNullParameter(animate, "$this$animate");
                            SuspendAnimationKt.updateState(animate, animatable.getInternalState$animation_core_release());
                            Object objClampToBounds = animatable.clampToBounds(animate.getValue());
                            if (Intrinsics.areEqual(objClampToBounds, animate.getValue())) {
                                Function1<Animatable<T, V>, Unit> function13 = function1;
                                if (function13 != null) {
                                    function13.invoke(animatable);
                                    return;
                                }
                                return;
                            }
                            animatable.getInternalState$animation_core_release().setValue$animation_core_release(objClampToBounds);
                            animationStateCopy$default.setValue$animation_core_release(objClampToBounds);
                            Function1<Animatable<T, V>, Unit> function14 = function1;
                            if (function14 != null) {
                                function14.invoke(animatable);
                            }
                            animate.cancelAnimation();
                            booleanRef2.element = true;
                        }
                    };
                    this.L$0 = animationStateCopy$default;
                    this.L$1 = booleanRef2;
                    this.label = 1;
                    if (SuspendAnimationKt.animate(animationStateCopy$default, animation, j4, function12, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    animationState = animationStateCopy$default;
                    booleanRef = booleanRef2;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = (Ref.BooleanRef) this.L$1;
                    animationState = (AnimationState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                AnimationEndReason animationEndReason = booleanRef.element ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
                this.this$0.endAnimation();
                return new AnimationResult(animationState, animationEndReason);
            } catch (CancellationException e4) {
                this.this$0.endAnimation();
                throw e4;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super AnimationResult<T, V>> continuation) {
            return ((C03222) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m5174d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@"}, m5175d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
    @DebugMetadata(m5191c = "androidx.compose.animation.core.Animatable$snapTo$2", m5192f = "Animatable.kt", m5193i = {}, m5194l = {}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    /* renamed from: androidx.compose.animation.core.Animatable$snapTo$2 */
    public static final class C03232 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03232(Animatable<T, V> animatable, T t3, Continuation<? super C03232> continuation) {
            super(1, continuation);
            this.this$0 = animatable;
            this.$targetValue = t3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C03232(this.this$0, this.$targetValue, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.endAnimation();
            Object objClampToBounds = this.this$0.clampToBounds(this.$targetValue);
            this.this$0.getInternalState$animation_core_release().setValue$animation_core_release(objClampToBounds);
            this.this$0.setTargetValue(objClampToBounds);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C03232) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m5174d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@"}, m5175d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
    @DebugMetadata(m5191c = "androidx.compose.animation.core.Animatable$stop$2", m5192f = "Animatable.kt", m5193i = {}, m5194l = {}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    /* renamed from: androidx.compose.animation.core.Animatable$stop$2 */
    public static final class C03242 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03242(Animatable<T, V> animatable, Continuation<? super C03242> continuation) {
            super(1, continuation);
            this.this$0 = animatable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C03242(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.endAnimation();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C03242) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public Animatable(T t3, TwoWayConverter<T, V> typeConverter, T t4, String label) {
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(label, "label");
        this.typeConverter = typeConverter;
        this.visibilityThreshold = t4;
        this.label = label;
        this.internalState = new AnimationState<>(typeConverter, t3, null, 0L, 0L, false, 60, null);
        this.isRunning = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.targetValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t3, null, 2, null);
        this.mutatorMutex = new MutatorMutex();
        this.defaultSpringSpec = new SpringSpec<>(0.0f, 0.0f, t4, 3, null);
        V v3 = (V) createVector(t3, Float.NEGATIVE_INFINITY);
        this.negativeInfinityBounds = v3;
        V v4 = (V) createVector(t3, Float.POSITIVE_INFINITY);
        this.positiveInfinityBounds = v4;
        this.lowerBoundVector = v3;
        this.upperBoundVector = v4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateDecay$default(Animatable animatable, Object obj, DecayAnimationSpec decayAnimationSpec, Function1 function1, Continuation continuation, int i4, Object obj2) {
        if ((i4 & 4) != 0) {
            function1 = null;
        }
        return animatable.animateDecay(obj, decayAnimationSpec, function1, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(Animatable animatable, Object obj, AnimationSpec animationSpec, Object obj2, Function1 function1, Continuation continuation, int i4, Object obj3) {
        if ((i4 & 2) != 0) {
            animationSpec = animatable.defaultSpringSpec;
        }
        AnimationSpec animationSpec2 = animationSpec;
        T velocity = obj2;
        if ((i4 & 4) != 0) {
            velocity = animatable.getVelocity();
        }
        T t3 = velocity;
        if ((i4 & 8) != 0) {
            function1 = null;
        }
        return animatable.animateTo(obj, animationSpec2, t3, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T clampToBounds(T value) {
        if (Intrinsics.areEqual(this.lowerBoundVector, this.negativeInfinityBounds) && Intrinsics.areEqual(this.upperBoundVector, this.positiveInfinityBounds)) {
            return value;
        }
        V vInvoke = this.typeConverter.getConvertToVector().invoke(value);
        int size = vInvoke.getSize();
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            if (vInvoke.get$animation_core_release(i4) < this.lowerBoundVector.get$animation_core_release(i4) || vInvoke.get$animation_core_release(i4) > this.upperBoundVector.get$animation_core_release(i4)) {
                vInvoke.set$animation_core_release(i4, RangesKt___RangesKt.coerceIn(vInvoke.get$animation_core_release(i4), this.lowerBoundVector.get$animation_core_release(i4), this.upperBoundVector.get$animation_core_release(i4)));
                z3 = true;
            }
        }
        return z3 ? this.typeConverter.getConvertFromVector().invoke(vInvoke) : value;
    }

    private final V createVector(T t3, float f4) {
        V vInvoke = this.typeConverter.getConvertToVector().invoke(t3);
        int size = vInvoke.getSize();
        for (int i4 = 0; i4 < size; i4++) {
            vInvoke.set$animation_core_release(i4, f4);
        }
        return vInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endAnimation() {
        AnimationState<T, V> animationState = this.internalState;
        animationState.getVelocityVector().reset$animation_core_release();
        animationState.setLastFrameTimeNanos$animation_core_release(Long.MIN_VALUE);
        setRunning(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runAnimation(Animation<T, V> animation, T t3, Function1<? super Animatable<T, V>, Unit> function1, Continuation<? super AnimationResult<T, V>> continuation) {
        return MutatorMutex.mutate$default(this.mutatorMutex, null, new C03222(this, t3, animation, this.internalState.getLastFrameTimeNanos(), function1, null), continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRunning(boolean z3) {
        this.isRunning.setValue(Boolean.valueOf(z3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTargetValue(T t3) {
        this.targetValue.setValue(t3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateBounds$default(Animatable animatable, Object obj, Object obj2, int i4, Object obj3) {
        if ((i4 & 1) != 0) {
            obj = animatable.lowerBound;
        }
        if ((i4 & 2) != 0) {
            obj2 = animatable.upperBound;
        }
        animatable.updateBounds(obj, obj2);
    }

    public final Object animateDecay(T t3, DecayAnimationSpec<T> decayAnimationSpec, Function1<? super Animatable<T, V>, Unit> function1, Continuation<? super AnimationResult<T, V>> continuation) {
        return runAnimation(new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter) this.typeConverter, (Object) getValue(), (AnimationVector) this.typeConverter.getConvertToVector().invoke(t3)), t3, function1, continuation);
    }

    public final Object animateTo(T t3, AnimationSpec<T> animationSpec, T t4, Function1<? super Animatable<T, V>, Unit> function1, Continuation<? super AnimationResult<T, V>> continuation) {
        return runAnimation(AnimationKt.TargetBasedAnimation(animationSpec, this.typeConverter, getValue(), t3, t4), t4, function1, continuation);
    }

    public final State<T> asState() {
        return this.internalState;
    }

    public final SpringSpec<T> getDefaultSpringSpec$animation_core_release() {
        return this.defaultSpringSpec;
    }

    public final AnimationState<T, V> getInternalState$animation_core_release() {
        return this.internalState;
    }

    public final String getLabel() {
        return this.label;
    }

    public final T getLowerBound() {
        return this.lowerBound;
    }

    public final T getTargetValue() {
        return this.targetValue.getValue();
    }

    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public final T getUpperBound() {
        return this.upperBound;
    }

    public final T getValue() {
        return this.internalState.getValue();
    }

    public final T getVelocity() {
        return (T) this.typeConverter.getConvertFromVector().invoke(getVelocityVector());
    }

    public final V getVelocityVector() {
        return (V) this.internalState.getVelocityVector();
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    public final Object snapTo(T t3, Continuation<? super Unit> continuation) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C03232(this, t3, null), continuation, 1, null);
        return objMutate$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate$default : Unit.INSTANCE;
    }

    public final Object stop(Continuation<? super Unit> continuation) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C03242(this, null), continuation, 1, null);
        return objMutate$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate$default : Unit.INSTANCE;
    }

    public final void updateBounds(T lowerBound, T upperBound) {
        V vInvoke;
        V vInvoke2;
        if (lowerBound == null || (vInvoke = this.typeConverter.getConvertToVector().invoke(lowerBound)) == null) {
            vInvoke = this.negativeInfinityBounds;
        }
        if (upperBound == null || (vInvoke2 = this.typeConverter.getConvertToVector().invoke(upperBound)) == null) {
            vInvoke2 = this.positiveInfinityBounds;
        }
        int size = vInvoke.getSize();
        for (int i4 = 0; i4 < size; i4++) {
            if (!(vInvoke.get$animation_core_release(i4) <= vInvoke2.get$animation_core_release(i4))) {
                throw new IllegalStateException(("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + vInvoke + " is greater than upper bound " + vInvoke2 + " on index " + i4).toString());
            }
        }
        this.lowerBoundVector = vInvoke;
        this.upperBoundVector = vInvoke2;
        this.upperBound = upperBound;
        this.lowerBound = lowerBound;
        if (isRunning()) {
            return;
        }
        T tClampToBounds = clampToBounds(getValue());
        if (Intrinsics.areEqual(tClampToBounds, getValue())) {
            return;
        }
        this.internalState.setValue$animation_core_release(tClampToBounds);
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, twoWayConverter, (i4 & 4) != 0 ? null : obj2, (i4 & 8) != 0 ? "Animatable" : str);
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, twoWayConverter, (i4 & 4) != 0 ? null : obj2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility", replaceWith = @ReplaceWith(expression = "Animatable(initialValue, typeConverter, visibilityThreshold, \"Animatable\")", imports = {}))
    public /* synthetic */ Animatable(Object obj, TwoWayConverter typeConverter, Object obj2) {
        this(obj, typeConverter, obj2, "Animatable");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
    }
}
