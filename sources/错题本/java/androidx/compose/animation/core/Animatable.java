package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5774b;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B9\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB1\b\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000b\u0010\rJ%\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0011\u0010\u0012Jg\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a2\u0006\u0010\u0013\u001a\u00028\u00002\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\b\b\u0002\u0010\u0016\u001a\u00028\u00002'\b\u0002\u0010\u0019\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0017¢\u0006\u0002\b\u0018H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ[\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a2\u0006\u0010\u0016\u001a\u00028\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2'\b\u0002\u0010\u0019\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0017¢\u0006\u0002\b\u0018H\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$¢\u0006\u0004\b%\u0010&J_\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'2\u0006\u0010\u0016\u001a\u00028\u00002%\u0010\u0019\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0017¢\u0006\u0002\b\u0018H\u0082@¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00028\u00002\u0006\u0010+\u001a\u00028\u0000H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0010H\u0002¢\u0006\u0004\b.\u0010/R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u00102R\u0016\u0010\b\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00103R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u00106R&\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R+\u0010@\u001a\u00020<2\u0006\u0010=\u001a\u00020<8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR+\u0010\u0013\u001a\u00028\u00002\u0006\u0010=\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010?\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR(\u0010\u000e\u001a\u0004\u0018\u00018\u00002\b\u0010=\u001a\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\bI\u0010FR(\u0010\u000f\u001a\u0004\u0018\u00018\u00002\b\u0010=\u001a\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\bJ\u0010FR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR \u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000N8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010S\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\f\n\u0004\bS\u0010T\u0012\u0004\bU\u0010/R\u001a\u0010V\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\f\n\u0004\bV\u0010T\u0012\u0004\bW\u0010/R\u0016\u0010X\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010TR\u0016\u0010Y\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010TR\u0011\u0010+\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bZ\u0010FR\u0011\u0010]\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0011\u0010_\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b^\u0010F¨\u0006`"}, m5110d2 = {"Landroidx/compose/animation/core/Animatable;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "initialValue", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "visibilityThreshold", "", "label", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/String;)V", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)V", "lowerBound", "upperBound", "Ld6/s;", "updateBounds", "(Ljava/lang/Object;Ljava/lang/Object;)V", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "initialVelocity", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "Landroidx/compose/animation/core/AnimationResult;", "animateTo", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lr6/c;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "animateDecay", "(Ljava/lang/Object;Landroidx/compose/animation/core/DecayAnimationSpec;Lr6/c;Lh6/c;)Ljava/lang/Object;", "snapTo", "(Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;", "stop", "(Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/runtime/State;", "asState", "()Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/Animation;", "animation", "runAnimation", "(Landroidx/compose/animation/core/Animation;Ljava/lang/Object;Lr6/c;Lh6/c;)Ljava/lang/Object;", "value", "clampToBounds", "(Ljava/lang/Object;)Ljava/lang/Object;", "endAnimation", "()V", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "Ljava/lang/Object;", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/animation/core/AnimationState;", "internalState", "Landroidx/compose/animation/core/AnimationState;", "getInternalState$animation_core_release", "()Landroidx/compose/animation/core/AnimationState;", "", "<set-?>", "isRunning$delegate", "Landroidx/compose/runtime/MutableState;", "isRunning", "()Z", "setRunning", "(Z)V", "targetValue$delegate", "getTargetValue", "()Ljava/lang/Object;", "setTargetValue", "(Ljava/lang/Object;)V", "getLowerBound", "getUpperBound", "Landroidx/compose/animation/core/MutatorMutex;", "mutatorMutex", "Landroidx/compose/animation/core/MutatorMutex;", "Landroidx/compose/animation/core/SpringSpec;", "defaultSpringSpec", "Landroidx/compose/animation/core/SpringSpec;", "getDefaultSpringSpec$animation_core_release", "()Landroidx/compose/animation/core/SpringSpec;", "negativeInfinityBounds", "Landroidx/compose/animation/core/AnimationVector;", "getNegativeInfinityBounds$annotations", "positiveInfinityBounds", "getPositiveInfinityBounds$annotations", "lowerBoundVector", "upperBoundVector", "getValue", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "velocityVector", "getVelocity", "velocity", "animation-core_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAnimatable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n*L\n1#1,492:1\n85#2:493\n113#2,2:494\n85#2:496\n113#2,2:497\n1#3:499\n52#4,5:500\n*S KotlinDebug\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n*L\n86#1:493\n86#1:494,2\n93#1:496\n93#1:497,2\n171#1:500,5\n*E\n"})
/* loaded from: classes.dex */
public final class Animatable<T, V extends AnimationVector> {
    public static final int $stable = 8;

    @NotNull
    private final SpringSpec<T> defaultSpringSpec;

    @NotNull
    private final AnimationState<T, V> internalState;

    /* renamed from: isRunning$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isRunning;

    @NotNull
    private final String label;

    @Nullable
    private T lowerBound;

    @NotNull
    private V lowerBoundVector;

    @NotNull
    private final MutatorMutex mutatorMutex;

    @NotNull
    private final V negativeInfinityBounds;

    @NotNull
    private final V positiveInfinityBounds;

    /* renamed from: targetValue$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState targetValue;

    @NotNull
    private final TwoWayConverter<T, V> typeConverter;

    @Nullable
    private T upperBound;

    @NotNull
    private V upperBoundVector;

    @Nullable
    private final T visibilityThreshold;

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, m5110d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationResult;", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.animation.core.Animatable$runAnimation$2", m5303f = "Animatable.kt", m5304i = {0, 0}, m5305l = {305}, m5306m = "invokeSuspend", m5307n = {"endState", "clampingNeeded"}, m5308s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.animation.core.Animatable$runAnimation$2 */
    public static final class C06782 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ Animation<T, V> $animation;
        final /* synthetic */ InterfaceC6471c $block;
        final /* synthetic */ T $initialVelocity;
        final /* synthetic */ long $startTime;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06782(Animatable<T, V> animatable, T t8, Animation<T, V> animation, long j7, InterfaceC6471c interfaceC6471c, InterfaceC5631c<? super C06782> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = animatable;
            this.$initialVelocity = t8;
            this.$animation = animation;
            this.$startTime = j7;
            this.$block = interfaceC6471c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C06782(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super AnimationResult<T, V>> interfaceC5631c) {
            return ((C06782) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnimationState animationState;
            Ref$BooleanRef ref$BooleanRef;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    this.this$0.getInternalState$animation_core_release().setVelocityVector$animation_core_release((AnimationVector) this.this$0.getTypeConverter().getConvertToVector().invoke(this.$initialVelocity));
                    this.this$0.setTargetValue(this.$animation.getTargetValue());
                    this.this$0.setRunning(true);
                    final AnimationState animationStateCopy$default = AnimationStateKt.copy$default((AnimationState) this.this$0.getInternalState$animation_core_release(), (Object) null, (AnimationVector) null, 0L, Long.MIN_VALUE, false, 23, (Object) null);
                    final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                    Animation<T, V> animation = this.$animation;
                    long j7 = this.$startTime;
                    final Animatable<T, V> animatable = this.this$0;
                    final InterfaceC6471c interfaceC6471c = this.$block;
                    InterfaceC6471c interfaceC6471c2 = new InterfaceC6471c() { // from class: androidx.compose.animation.core.Animatable.runAnimation.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p152r6.InterfaceC6471c
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke((AnimationScope) obj2);
                            return C5443s.f8405a;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public final void invoke(AnimationScope<T, V> animationScope) {
                            SuspendAnimationKt.updateState(animationScope, animatable.getInternalState$animation_core_release());
                            Object objClampToBounds = animatable.clampToBounds(animationScope.getValue());
                            if (AbstractC5830k.m5325b(objClampToBounds, animationScope.getValue())) {
                                InterfaceC6471c interfaceC6471c3 = interfaceC6471c;
                                if (interfaceC6471c3 != null) {
                                    interfaceC6471c3.invoke(animatable);
                                    return;
                                }
                                return;
                            }
                            animatable.getInternalState$animation_core_release().setValue$animation_core_release(objClampToBounds);
                            animationStateCopy$default.setValue$animation_core_release(objClampToBounds);
                            InterfaceC6471c interfaceC6471c4 = interfaceC6471c;
                            if (interfaceC6471c4 != null) {
                                interfaceC6471c4.invoke(animatable);
                            }
                            animationScope.cancelAnimation();
                            ref$BooleanRef2.element = true;
                        }
                    };
                    this.L$0 = animationStateCopy$default;
                    this.L$1 = ref$BooleanRef2;
                    this.label = 1;
                    if (SuspendAnimationKt.animate(animationStateCopy$default, animation, j7, interfaceC6471c2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    animationState = animationStateCopy$default;
                    ref$BooleanRef = ref$BooleanRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$BooleanRef = (Ref$BooleanRef) this.L$1;
                    animationState = (AnimationState) this.L$0;
                    AbstractC5774b.m5119b(obj);
                }
                AnimationEndReason animationEndReason = ref$BooleanRef.element ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
                this.this$0.endAnimation();
                return new AnimationResult(animationState, animationEndReason);
            } catch (CancellationException e) {
                this.this$0.endAnimation();
                throw e;
            }
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ld6/s;", "<anonymous>", "()V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.animation.core.Animatable$snapTo$2", m5303f = "Animatable.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.animation.core.Animatable$snapTo$2 */
    public static final class C06792 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06792(Animatable<T, V> animatable, T t8, InterfaceC5631c<? super C06792> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = animatable;
            this.$targetValue = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C06792(this.this$0, this.$targetValue, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C06792) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            this.this$0.endAnimation();
            Object objClampToBounds = this.this$0.clampToBounds(this.$targetValue);
            this.this$0.getInternalState$animation_core_release().setValue$animation_core_release(objClampToBounds);
            this.this$0.setTargetValue(objClampToBounds);
            return C5443s.f8405a;
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ld6/s;", "<anonymous>", "()V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.animation.core.Animatable$stop$2", m5303f = "Animatable.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.animation.core.Animatable$stop$2 */
    public static final class C06802 extends SuspendLambda implements InterfaceC6471c {
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06802(Animatable<T, V> animatable, InterfaceC5631c<? super C06802> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = animatable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C06802(this.this$0, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C06802) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            this.this$0.endAnimation();
            return C5443s.f8405a;
        }
    }

    public Animatable(T t8, @NotNull TwoWayConverter<T, V> twoWayConverter, @Nullable T t9, @NotNull String str) {
        this.typeConverter = twoWayConverter;
        this.visibilityThreshold = t9;
        this.label = str;
        this.internalState = new AnimationState<>(twoWayConverter, t8, null, 0L, 0L, false, 60, null);
        this.isRunning = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.targetValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t8, null, 2, null);
        this.mutatorMutex = new MutatorMutex();
        this.defaultSpringSpec = new SpringSpec<>(0.0f, 0.0f, t9, 3, null);
        AnimationVector velocityVector = getVelocityVector();
        V v2 = velocityVector instanceof AnimationVector1D ? AnimatableKt.negativeInfinityBounds1D : velocityVector instanceof AnimationVector2D ? AnimatableKt.negativeInfinityBounds2D : velocityVector instanceof AnimationVector3D ? AnimatableKt.negativeInfinityBounds3D : AnimatableKt.negativeInfinityBounds4D;
        AbstractC5830k.m5328e(v2, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.negativeInfinityBounds = v2;
        AnimationVector velocityVector2 = getVelocityVector();
        V v4 = velocityVector2 instanceof AnimationVector1D ? AnimatableKt.positiveInfinityBounds1D : velocityVector2 instanceof AnimationVector2D ? AnimatableKt.positiveInfinityBounds2D : velocityVector2 instanceof AnimationVector3D ? AnimatableKt.positiveInfinityBounds3D : AnimatableKt.positiveInfinityBounds4D;
        AbstractC5830k.m5328e(v4, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.positiveInfinityBounds = v4;
        this.lowerBoundVector = v2;
        this.upperBoundVector = v4;
    }

    public static /* synthetic */ Object animateDecay$default(Animatable animatable, Object obj, DecayAnimationSpec decayAnimationSpec, InterfaceC6471c interfaceC6471c, InterfaceC5631c interfaceC5631c, int i, Object obj2) {
        if ((i & 4) != 0) {
            interfaceC6471c = null;
        }
        return animatable.animateDecay(obj, decayAnimationSpec, interfaceC6471c, interfaceC5631c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(Animatable animatable, Object obj, AnimationSpec animationSpec, Object obj2, InterfaceC6471c interfaceC6471c, InterfaceC5631c interfaceC5631c, int i, Object obj3) {
        if ((i & 2) != 0) {
            animationSpec = animatable.defaultSpringSpec;
        }
        AnimationSpec animationSpec2 = animationSpec;
        T velocity = obj2;
        if ((i & 4) != 0) {
            velocity = animatable.getVelocity();
        }
        T t8 = velocity;
        if ((i & 8) != 0) {
            interfaceC6471c = null;
        }
        return animatable.animateTo(obj, animationSpec2, t8, interfaceC6471c, interfaceC5631c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T clampToBounds(T value) {
        if (AbstractC5830k.m5325b(this.lowerBoundVector, this.negativeInfinityBounds) && AbstractC5830k.m5325b(this.upperBoundVector, this.positiveInfinityBounds)) {
            return value;
        }
        AnimationVector animationVector = (AnimationVector) this.typeConverter.getConvertToVector().invoke(value);
        int size = animationVector.getSize();
        boolean z8 = false;
        for (int i = 0; i < size; i++) {
            if (animationVector.get$animation_core_release(i) < this.lowerBoundVector.get$animation_core_release(i) || animationVector.get$animation_core_release(i) > this.upperBoundVector.get$animation_core_release(i)) {
                animationVector.set$animation_core_release(i, AbstractC5806u.m5273l(animationVector.get$animation_core_release(i), this.lowerBoundVector.get$animation_core_release(i), this.upperBoundVector.get$animation_core_release(i)));
                z8 = true;
            }
        }
        return z8 ? (T) this.typeConverter.getConvertFromVector().invoke(animationVector) : value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endAnimation() {
        AnimationState<T, V> animationState = this.internalState;
        animationState.getVelocityVector().reset$animation_core_release();
        animationState.setLastFrameTimeNanos$animation_core_release(Long.MIN_VALUE);
        setRunning(false);
    }

    private static /* synthetic */ void getNegativeInfinityBounds$annotations() {
    }

    private static /* synthetic */ void getPositiveInfinityBounds$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runAnimation(Animation<T, V> animation, T t8, InterfaceC6471c interfaceC6471c, InterfaceC5631c<? super AnimationResult<T, V>> interfaceC5631c) {
        return MutatorMutex.mutate$default(this.mutatorMutex, null, new C06782(this, t8, animation, this.internalState.getLastFrameTimeNanos(), interfaceC6471c, null), interfaceC5631c, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRunning(boolean z8) {
        this.isRunning.setValue(Boolean.valueOf(z8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTargetValue(T t8) {
        this.targetValue.setValue(t8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateBounds$default(Animatable animatable, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = animatable.lowerBound;
        }
        if ((i & 2) != 0) {
            obj2 = animatable.upperBound;
        }
        animatable.updateBounds(obj, obj2);
    }

    @Nullable
    public final Object animateDecay(T t8, @NotNull DecayAnimationSpec<T> decayAnimationSpec, @Nullable InterfaceC6471c interfaceC6471c, @NotNull InterfaceC5631c<? super AnimationResult<T, V>> interfaceC5631c) {
        return runAnimation(new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter<T, AnimationVector>) this.typeConverter, (Object) getValue(), (AnimationVector) this.typeConverter.getConvertToVector().invoke(t8)), t8, interfaceC6471c, interfaceC5631c);
    }

    @Nullable
    public final Object animateTo(T t8, @NotNull AnimationSpec<T> animationSpec, T t9, @Nullable InterfaceC6471c interfaceC6471c, @NotNull InterfaceC5631c<? super AnimationResult<T, V>> interfaceC5631c) {
        return runAnimation(AnimationKt.TargetBasedAnimation(animationSpec, this.typeConverter, getValue(), t8, t9), t9, interfaceC6471c, interfaceC5631c);
    }

    @NotNull
    public final State<T> asState() {
        return this.internalState;
    }

    @NotNull
    public final SpringSpec<T> getDefaultSpringSpec$animation_core_release() {
        return this.defaultSpringSpec;
    }

    @NotNull
    public final AnimationState<T, V> getInternalState$animation_core_release() {
        return this.internalState;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final T getLowerBound() {
        return this.lowerBound;
    }

    public final T getTargetValue() {
        return this.targetValue.getValue();
    }

    @NotNull
    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    @Nullable
    public final T getUpperBound() {
        return this.upperBound;
    }

    public final T getValue() {
        return this.internalState.getValue();
    }

    public final T getVelocity() {
        return (T) this.typeConverter.getConvertFromVector().invoke(getVelocityVector());
    }

    @NotNull
    public final V getVelocityVector() {
        return (V) this.internalState.getVelocityVector();
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    @Nullable
    public final Object snapTo(T t8, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C06792(this, t8, null), interfaceC5631c, 1, null);
        return objMutate$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objMutate$default : C5443s.f8405a;
    }

    @Nullable
    public final Object stop(@NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C06802(this, null), interfaceC5631c, 1, null);
        return objMutate$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objMutate$default : C5443s.f8405a;
    }

    public final void updateBounds(@Nullable T lowerBound, @Nullable T upperBound) {
        V v2;
        V v4;
        if (lowerBound == null || (v2 = (V) this.typeConverter.getConvertToVector().invoke(lowerBound)) == null) {
            v2 = this.negativeInfinityBounds;
        }
        if (upperBound == null || (v4 = (V) this.typeConverter.getConvertToVector().invoke(upperBound)) == null) {
            v4 = this.positiveInfinityBounds;
        }
        int size = v2.getSize();
        for (int i = 0; i < size; i++) {
            if (!(v2.get$animation_core_release(i) <= v4.get$animation_core_release(i))) {
                PreconditionsKt.throwIllegalStateException("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + v2 + " is greater than upper bound " + v4 + " on index " + i);
            }
        }
        this.lowerBoundVector = v2;
        this.upperBoundVector = v4;
        this.upperBound = upperBound;
        this.lowerBound = lowerBound;
        if (isRunning()) {
            return;
        }
        T tClampToBounds = clampToBounds(getValue());
        if (AbstractC5830k.m5325b(tClampToBounds, getValue())) {
            return;
        }
        this.internalState.setValue$animation_core_release(tClampToBounds);
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, String str, int i, AbstractC5824e abstractC5824e) {
        this(obj, twoWayConverter, (i & 4) != 0 ? null : obj2, (i & 8) != 0 ? "Animatable" : str);
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, int i, AbstractC5824e abstractC5824e) {
        this(obj, twoWayConverter, (i & 4) != 0 ? null : obj2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility", replaceWith = @ReplaceWith(expression = "Animatable(initialValue, typeConverter, visibilityThreshold, \"Animatable\")", imports = {}))
    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2) {
        this(obj, twoWayConverter, obj2, "Animatable");
    }
}
