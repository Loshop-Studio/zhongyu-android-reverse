package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$BooleanRef;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class Animatable<T, V extends AnimationVector> {
    public static final int $stable = 8;
    private final SpringSpec<T> defaultSpringSpec;
    private final AnimationState<T, V> internalState;
    private final MutableState isRunning$delegate;
    private final String label;
    private T lowerBound;
    private V lowerBoundVector;
    private final MutatorMutex mutatorMutex;
    private final V negativeInfinityBounds;
    private final V positiveInfinityBounds;
    private final MutableState targetValue$delegate;
    private final TwoWayConverter<T, V> typeConverter;
    private T upperBound;
    private V upperBoundVector;
    private final T visibilityThreshold;

    @InterfaceC11829d(m26210c = "androidx.compose.animation.core.Animatable$runAnimation$2", m26211f = "Animatable.kt", m26212l = {305}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.Animatable$runAnimation$2 */
    public static final class C11112 extends SuspendLambda implements InterfaceC9540l {
        final /* synthetic */ Animation<T, V> $animation;
        final /* synthetic */ InterfaceC9540l $block;
        final /* synthetic */ T $initialVelocity;
        final /* synthetic */ long $startTime;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11112(Animatable<T, V> animatable, T t10, Animation<T, V> animation, long j10, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C11112> interfaceC11588c) {
            super(1, interfaceC11588c);
            this.this$0 = animatable;
            this.$initialVelocity = t10;
            this.$animation = animation;
            this.$startTime = j10;
            this.$block = interfaceC9540l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(InterfaceC11588c<?> interfaceC11588c) {
            return new C11112(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AnimationState animationState;
            Ref$BooleanRef ref$BooleanRef;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    this.this$0.getInternalState$animation_core_release().setVelocityVector$animation_core_release((AnimationVector) this.this$0.getTypeConverter().getConvertToVector().invoke(this.$initialVelocity));
                    this.this$0.setTargetValue(this.$animation.getTargetValue());
                    this.this$0.setRunning(true);
                    final AnimationState animationStateCopy$default = AnimationStateKt.copy$default((AnimationState) this.this$0.getInternalState$animation_core_release(), (Object) null, (AnimationVector) null, 0L, Long.MIN_VALUE, false, 23, (Object) null);
                    final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                    Animation<T, V> animation = this.$animation;
                    long j10 = this.$startTime;
                    final Animatable<T, V> animatable = this.this$0;
                    final InterfaceC9540l interfaceC9540l = this.$block;
                    InterfaceC9540l interfaceC9540l2 = new InterfaceC9540l() { // from class: androidx.compose.animation.core.Animatable.runAnimation.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p181hd.InterfaceC9540l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke((AnimationScope) obj2);
                            return C10786q.f26013a;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public final void invoke(AnimationScope<T, V> animationScope) {
                            SuspendAnimationKt.updateState(animationScope, animatable.getInternalState$animation_core_release());
                            Object objClampToBounds = animatable.clampToBounds(animationScope.getValue());
                            if (AbstractC9979u.m20289b(objClampToBounds, animationScope.getValue())) {
                                InterfaceC9540l interfaceC9540l3 = interfaceC9540l;
                                if (interfaceC9540l3 != null) {
                                    interfaceC9540l3.invoke(animatable);
                                    return;
                                }
                                return;
                            }
                            animatable.getInternalState$animation_core_release().setValue$animation_core_release(objClampToBounds);
                            animationStateCopy$default.setValue$animation_core_release(objClampToBounds);
                            InterfaceC9540l interfaceC9540l4 = interfaceC9540l;
                            if (interfaceC9540l4 != null) {
                                interfaceC9540l4.invoke(animatable);
                            }
                            animationScope.cancelAnimation();
                            ref$BooleanRef2.f23398c = true;
                        }
                    };
                    this.L$0 = animationStateCopy$default;
                    this.L$1 = ref$BooleanRef2;
                    this.label = 1;
                    if (SuspendAnimationKt.animate(animationStateCopy$default, animation, j10, interfaceC9540l2, this) == objM25952f) {
                        return objM25952f;
                    }
                    animationState = animationStateCopy$default;
                    ref$BooleanRef = ref$BooleanRef2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$BooleanRef = (Ref$BooleanRef) this.L$1;
                    animationState = (AnimationState) this.L$0;
                    AbstractC9924b.m20071b(obj);
                }
                AnimationEndReason animationEndReason = ref$BooleanRef.f23398c ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
                this.this$0.endAnimation();
                return new AnimationResult(animationState, animationEndReason);
            } catch (CancellationException e10) {
                this.this$0.endAnimation();
                throw e10;
            }
        }

        @Override // p181hd.InterfaceC9540l
        public final Object invoke(InterfaceC11588c<? super AnimationResult<T, V>> interfaceC11588c) {
            return ((C11112) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.animation.core.Animatable$snapTo$2", m26211f = "Animatable.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.Animatable$snapTo$2 */
    public static final class C11122 extends SuspendLambda implements InterfaceC9540l {
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11122(Animatable<T, V> animatable, T t10, InterfaceC11588c<? super C11122> interfaceC11588c) {
            super(1, interfaceC11588c);
            this.this$0 = animatable;
            this.$targetValue = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(InterfaceC11588c<?> interfaceC11588c) {
            return new C11122(this.this$0, this.$targetValue, interfaceC11588c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            this.this$0.endAnimation();
            Object objClampToBounds = this.this$0.clampToBounds(this.$targetValue);
            this.this$0.getInternalState$animation_core_release().setValue$animation_core_release(objClampToBounds);
            this.this$0.setTargetValue(objClampToBounds);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9540l
        public final Object invoke(InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C11122) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.animation.core.Animatable$stop$2", m26211f = "Animatable.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.Animatable$stop$2 */
    public static final class C11132 extends SuspendLambda implements InterfaceC9540l {
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11132(Animatable<T, V> animatable, InterfaceC11588c<? super C11132> interfaceC11588c) {
            super(1, interfaceC11588c);
            this.this$0 = animatable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(InterfaceC11588c<?> interfaceC11588c) {
            return new C11132(this.this$0, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            this.this$0.endAnimation();
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9540l
        public final Object invoke(InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C11132) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public Animatable(T t10, TwoWayConverter<T, V> twoWayConverter, T t11, String str) {
        this.typeConverter = twoWayConverter;
        this.visibilityThreshold = t11;
        this.label = str;
        this.internalState = new AnimationState<>(twoWayConverter, t10, null, 0L, 0L, false, 60, null);
        this.isRunning$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.targetValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
        this.mutatorMutex = new MutatorMutex();
        this.defaultSpringSpec = new SpringSpec<>(0.0f, 0.0f, t11, 3, null);
        AnimationVector velocityVector = getVelocityVector();
        V v10 = velocityVector instanceof AnimationVector1D ? AnimatableKt.negativeInfinityBounds1D : velocityVector instanceof AnimationVector2D ? AnimatableKt.negativeInfinityBounds2D : velocityVector instanceof AnimationVector3D ? AnimatableKt.negativeInfinityBounds3D : AnimatableKt.negativeInfinityBounds4D;
        AbstractC9979u.m20292e(v10, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.negativeInfinityBounds = v10;
        AnimationVector velocityVector2 = getVelocityVector();
        V v11 = velocityVector2 instanceof AnimationVector1D ? AnimatableKt.positiveInfinityBounds1D : velocityVector2 instanceof AnimationVector2D ? AnimatableKt.positiveInfinityBounds2D : velocityVector2 instanceof AnimationVector3D ? AnimatableKt.positiveInfinityBounds3D : AnimatableKt.positiveInfinityBounds4D;
        AbstractC9979u.m20292e(v11, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.positiveInfinityBounds = v11;
        this.lowerBoundVector = v10;
        this.upperBoundVector = v11;
    }

    public static /* synthetic */ Object animateDecay$default(Animatable animatable, Object obj, DecayAnimationSpec decayAnimationSpec, InterfaceC9540l interfaceC9540l, InterfaceC11588c interfaceC11588c, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            interfaceC9540l = null;
        }
        return animatable.animateDecay(obj, decayAnimationSpec, interfaceC9540l, interfaceC11588c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(Animatable animatable, Object obj, AnimationSpec animationSpec, Object obj2, InterfaceC9540l interfaceC9540l, InterfaceC11588c interfaceC11588c, int i10, Object obj3) {
        if ((i10 & 2) != 0) {
            animationSpec = animatable.defaultSpringSpec;
        }
        AnimationSpec animationSpec2 = animationSpec;
        T velocity = obj2;
        if ((i10 & 4) != 0) {
            velocity = animatable.getVelocity();
        }
        T t10 = velocity;
        if ((i10 & 8) != 0) {
            interfaceC9540l = null;
        }
        return animatable.animateTo(obj, animationSpec2, t10, interfaceC9540l, interfaceC11588c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T clampToBounds(T t10) {
        if (AbstractC9979u.m20289b(this.lowerBoundVector, this.negativeInfinityBounds) && AbstractC9979u.m20289b(this.upperBoundVector, this.positiveInfinityBounds)) {
            return t10;
        }
        AnimationVector animationVector = (AnimationVector) this.typeConverter.getConvertToVector().invoke(t10);
        int size$animation_core_release = animationVector.getSize$animation_core_release();
        boolean z10 = false;
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            if (animationVector.get$animation_core_release(i10) < this.lowerBoundVector.get$animation_core_release(i10) || animationVector.get$animation_core_release(i10) > this.upperBoundVector.get$animation_core_release(i10)) {
                animationVector.set$animation_core_release(i10, AbstractC10410o.m21760m(animationVector.get$animation_core_release(i10), this.lowerBoundVector.get$animation_core_release(i10), this.upperBoundVector.get$animation_core_release(i10)));
                z10 = true;
            }
        }
        return z10 ? (T) this.typeConverter.getConvertFromVector().invoke(animationVector) : t10;
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
    public final Object runAnimation(Animation<T, V> animation, T t10, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super AnimationResult<T, V>> interfaceC11588c) {
        return MutatorMutex.mutate$default(this.mutatorMutex, null, new C11112(this, t10, animation, this.internalState.getLastFrameTimeNanos(), interfaceC9540l, null), interfaceC11588c, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRunning(boolean z10) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTargetValue(T t10) {
        this.targetValue$delegate.setValue(t10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateBounds$default(Animatable animatable, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = animatable.lowerBound;
        }
        if ((i10 & 2) != 0) {
            obj2 = animatable.upperBound;
        }
        animatable.updateBounds(obj, obj2);
    }

    public final Object animateDecay(T t10, DecayAnimationSpec<T> decayAnimationSpec, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super AnimationResult<T, V>> interfaceC11588c) {
        return runAnimation(new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter<T, AnimationVector>) this.typeConverter, (Object) getValue(), (AnimationVector) this.typeConverter.getConvertToVector().invoke(t10)), t10, interfaceC9540l, interfaceC11588c);
    }

    public final Object animateTo(T t10, AnimationSpec<T> animationSpec, T t11, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super AnimationResult<T, V>> interfaceC11588c) {
        return runAnimation(AnimationKt.TargetBasedAnimation(animationSpec, this.typeConverter, getValue(), t10, t11), t11, interfaceC9540l, interfaceC11588c);
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
        return this.targetValue$delegate.getValue();
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
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    public final Object snapTo(T t10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C11122(this, t10, null), interfaceC11588c, 1, null);
        return objMutate$default == AbstractC11725a.m25952f() ? objMutate$default : C10786q.f26013a;
    }

    public final Object stop(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C11132(this, null), interfaceC11588c, 1, null);
        return objMutate$default == AbstractC11725a.m25952f() ? objMutate$default : C10786q.f26013a;
    }

    public final void updateBounds(T t10, T t11) {
        V v10;
        V v11;
        if (t10 == null || (v10 = (V) this.typeConverter.getConvertToVector().invoke(t10)) == null) {
            v10 = this.negativeInfinityBounds;
        }
        if (t11 == null || (v11 = (V) this.typeConverter.getConvertToVector().invoke(t11)) == null) {
            v11 = this.positiveInfinityBounds;
        }
        int size$animation_core_release = v10.getSize$animation_core_release();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            if (!(v10.get$animation_core_release(i10) <= v11.get$animation_core_release(i10))) {
                PreconditionsKt.throwIllegalStateException("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + v10 + " is greater than upper bound " + v11 + " on index " + i10);
            }
        }
        this.lowerBoundVector = v10;
        this.upperBoundVector = v11;
        this.upperBound = t11;
        this.lowerBound = t10;
        if (isRunning()) {
            return;
        }
        T tClampToBounds = clampToBounds(getValue());
        if (AbstractC9979u.m20289b(tClampToBounds, getValue())) {
            return;
        }
        this.internalState.setValue$animation_core_release(tClampToBounds);
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, String str, int i10, AbstractC9972n abstractC9972n) {
        this(obj, twoWayConverter, (i10 & 4) != 0 ? null : obj2, (i10 & 8) != 0 ? "Animatable" : str);
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, int i10, AbstractC9972n abstractC9972n) {
        this(obj, twoWayConverter, (i10 & 4) != 0 ? null : obj2);
    }

    @InterfaceC10770a
    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2) {
        this(obj, twoWayConverter, obj2, "Animatable");
    }
}
