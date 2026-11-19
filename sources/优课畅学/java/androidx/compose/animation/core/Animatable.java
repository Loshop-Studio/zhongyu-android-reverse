package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$BooleanRef;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;

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

    @InterfaceC9539d(m17800c = "androidx.compose.animation.core.Animatable$runAnimation$2", m17801f = "Animatable.kt", m17802l = {305}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.Animatable$runAnimation$2 */
    public static final class C10812 extends SuspendLambda implements InterfaceC10570l {
        final /* synthetic */ Animation<T, V> $animation;
        final /* synthetic */ InterfaceC10570l $block;
        final /* synthetic */ T $initialVelocity;
        final /* synthetic */ long $startTime;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10812(Animatable<T, V> animatable, T t10, Animation<T, V> animation, long j10, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super C10812> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.this$0 = animatable;
            this.$initialVelocity = t10;
            this.$animation = animation;
            this.$startTime = j10;
            this.$block = interfaceC10570l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return new C10812(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AnimationState animationState;
            Ref$BooleanRef ref$BooleanRef;
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    this.this$0.getInternalState$animation_core_release().setVelocityVector$animation_core_release((AnimationVector) this.this$0.getTypeConverter().getConvertToVector().invoke(this.$initialVelocity));
                    this.this$0.setTargetValue(this.$animation.getTargetValue());
                    this.this$0.setRunning(true);
                    final AnimationState animationStateCopy$default = AnimationStateKt.copy$default((AnimationState) this.this$0.getInternalState$animation_core_release(), (Object) null, (AnimationVector) null, 0L, Long.MIN_VALUE, false, 23, (Object) null);
                    final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                    Animation<T, V> animation = this.$animation;
                    long j10 = this.$startTime;
                    final Animatable<T, V> animatable = this.this$0;
                    final InterfaceC10570l interfaceC10570l = this.$block;
                    InterfaceC10570l interfaceC10570l2 = new InterfaceC10570l() { // from class: androidx.compose.animation.core.Animatable.runAnimation.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p300x7.InterfaceC10570l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke((AnimationScope) obj2);
                            return C8736p.f16368a;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public final void invoke(AnimationScope<T, V> animationScope) {
                            SuspendAnimationKt.updateState(animationScope, animatable.getInternalState$animation_core_release());
                            Object objClampToBounds = animatable.clampToBounds(animationScope.getValue());
                            if (AbstractC9133u.m16128b(objClampToBounds, animationScope.getValue())) {
                                InterfaceC10570l interfaceC10570l3 = interfaceC10570l;
                                if (interfaceC10570l3 != null) {
                                    interfaceC10570l3.invoke(animatable);
                                    return;
                                }
                                return;
                            }
                            animatable.getInternalState$animation_core_release().setValue$animation_core_release(objClampToBounds);
                            animationStateCopy$default.setValue$animation_core_release(objClampToBounds);
                            InterfaceC10570l interfaceC10570l4 = interfaceC10570l;
                            if (interfaceC10570l4 != null) {
                                interfaceC10570l4.invoke(animatable);
                            }
                            animationScope.cancelAnimation();
                            ref$BooleanRef2.f17469a = true;
                        }
                    };
                    this.L$0 = animationStateCopy$default;
                    this.L$1 = ref$BooleanRef2;
                    this.label = 1;
                    if (SuspendAnimationKt.animate(animationStateCopy$default, animation, j10, interfaceC10570l2, this) == objM17291f) {
                        return objM17291f;
                    }
                    animationState = animationStateCopy$default;
                    ref$BooleanRef = ref$BooleanRef2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$BooleanRef = (Ref$BooleanRef) this.L$1;
                    animationState = (AnimationState) this.L$0;
                    AbstractC9079b.m15926b(obj);
                }
                AnimationEndReason animationEndReason = ref$BooleanRef.f17469a ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
                this.this$0.endAnimation();
                return new AnimationResult(animationState, animationEndReason);
            } catch (CancellationException e10) {
                this.this$0.endAnimation();
                throw e10;
            }
        }

        @Override // p300x7.InterfaceC10570l
        public final Object invoke(InterfaceC9324c<? super AnimationResult<T, V>> interfaceC9324c) {
            return ((C10812) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.animation.core.Animatable$snapTo$2", m17801f = "Animatable.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.Animatable$snapTo$2 */
    public static final class C10822 extends SuspendLambda implements InterfaceC10570l {
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10822(Animatable<T, V> animatable, T t10, InterfaceC9324c<? super C10822> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.this$0 = animatable;
            this.$targetValue = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return new C10822(this.this$0, this.$targetValue, interfaceC9324c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            this.this$0.endAnimation();
            Object objClampToBounds = this.this$0.clampToBounds(this.$targetValue);
            this.this$0.getInternalState$animation_core_release().setValue$animation_core_release(objClampToBounds);
            this.this$0.setTargetValue(objClampToBounds);
            return C8736p.f16368a;
        }

        @Override // p300x7.InterfaceC10570l
        public final Object invoke(InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C10822) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.animation.core.Animatable$stop$2", m17801f = "Animatable.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.Animatable$stop$2 */
    public static final class C10832 extends SuspendLambda implements InterfaceC10570l {
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10832(Animatable<T, V> animatable, InterfaceC9324c<? super C10832> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.this$0 = animatable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return new C10832(this.this$0, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            this.this$0.endAnimation();
            return C8736p.f16368a;
        }

        @Override // p300x7.InterfaceC10570l
        public final Object invoke(InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C10832) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
        AbstractC9133u.m16131e(v10, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.negativeInfinityBounds = v10;
        AnimationVector velocityVector2 = getVelocityVector();
        V v11 = velocityVector2 instanceof AnimationVector1D ? AnimatableKt.positiveInfinityBounds1D : velocityVector2 instanceof AnimationVector2D ? AnimatableKt.positiveInfinityBounds2D : velocityVector2 instanceof AnimationVector3D ? AnimatableKt.positiveInfinityBounds3D : AnimatableKt.positiveInfinityBounds4D;
        AbstractC9133u.m16131e(v11, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.positiveInfinityBounds = v11;
        this.lowerBoundVector = v10;
        this.upperBoundVector = v11;
    }

    public static /* synthetic */ Object animateDecay$default(Animatable animatable, Object obj, DecayAnimationSpec decayAnimationSpec, InterfaceC10570l interfaceC10570l, InterfaceC9324c interfaceC9324c, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            interfaceC10570l = null;
        }
        return animatable.animateDecay(obj, decayAnimationSpec, interfaceC10570l, interfaceC9324c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(Animatable animatable, Object obj, AnimationSpec animationSpec, Object obj2, InterfaceC10570l interfaceC10570l, InterfaceC9324c interfaceC9324c, int i10, Object obj3) {
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
            interfaceC10570l = null;
        }
        return animatable.animateTo(obj, animationSpec2, t10, interfaceC10570l, interfaceC9324c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T clampToBounds(T t10) {
        if (AbstractC9133u.m16128b(this.lowerBoundVector, this.negativeInfinityBounds) && AbstractC9133u.m16128b(this.upperBoundVector, this.positiveInfinityBounds)) {
            return t10;
        }
        AnimationVector animationVector = (AnimationVector) this.typeConverter.getConvertToVector().invoke(t10);
        int size$animation_core_release = animationVector.getSize$animation_core_release();
        boolean z10 = false;
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            if (animationVector.get$animation_core_release(i10) < this.lowerBoundVector.get$animation_core_release(i10) || animationVector.get$animation_core_release(i10) > this.upperBoundVector.get$animation_core_release(i10)) {
                animationVector.set$animation_core_release(i10, AbstractC8323h.m13517l(animationVector.get$animation_core_release(i10), this.lowerBoundVector.get$animation_core_release(i10), this.upperBoundVector.get$animation_core_release(i10)));
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
    public final Object runAnimation(Animation<T, V> animation, T t10, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super AnimationResult<T, V>> interfaceC9324c) {
        return MutatorMutex.mutate$default(this.mutatorMutex, null, new C10812(this, t10, animation, this.internalState.getLastFrameTimeNanos(), interfaceC10570l, null), interfaceC9324c, 1, null);
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

    public final Object animateDecay(T t10, DecayAnimationSpec<T> decayAnimationSpec, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super AnimationResult<T, V>> interfaceC9324c) {
        return runAnimation(new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter<T, AnimationVector>) this.typeConverter, (Object) getValue(), (AnimationVector) this.typeConverter.getConvertToVector().invoke(t10)), t10, interfaceC10570l, interfaceC9324c);
    }

    public final Object animateTo(T t10, AnimationSpec<T> animationSpec, T t11, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super AnimationResult<T, V>> interfaceC9324c) {
        return runAnimation(AnimationKt.TargetBasedAnimation(animationSpec, this.typeConverter, getValue(), t10, t11), t11, interfaceC10570l, interfaceC9324c);
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

    public final Object snapTo(T t10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C10822(this, t10, null), interfaceC9324c, 1, null);
        return objMutate$default == AbstractC9434a.m17291f() ? objMutate$default : C8736p.f16368a;
    }

    public final Object stop(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C10832(this, null), interfaceC9324c, 1, null);
        return objMutate$default == AbstractC9434a.m17291f() ? objMutate$default : C8736p.f16368a;
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
        if (AbstractC9133u.m16128b(tClampToBounds, getValue())) {
            return;
        }
        this.internalState.setValue$animation_core_release(tClampToBounds);
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, String str, int i10, AbstractC9126n abstractC9126n) {
        this(obj, twoWayConverter, (i10 & 4) != 0 ? null : obj2, (i10 & 8) != 0 ? "Animatable" : str);
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, int i10, AbstractC9126n abstractC9126n) {
        this(obj, twoWayConverter, (i10 & 4) != 0 ? null : obj2);
    }

    @InterfaceC8721a
    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2) {
        this(obj, twoWayConverter, obj2, "Animatable");
    }
}
