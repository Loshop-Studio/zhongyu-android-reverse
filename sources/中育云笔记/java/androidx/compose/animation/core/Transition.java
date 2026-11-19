package androidx.compose.animation.core;

import androidx.annotation.RestrictTo;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.CoroutineStart;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p211jd.AbstractC9719c;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@Stable
/* loaded from: classes.dex */
public final class Transition<S> {
    public static final int $stable = 0;
    private final SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> _animations;
    private final MutableLongState _playTimeNanos$delegate;
    private final SnapshotStateList<Transition<?>> _transitions;
    private final MutableState isSeeking$delegate;
    private final String label;
    private long lastSeekedTimeNanos;
    private final Transition<?> parentTransition;
    private final MutableState segment$delegate;
    private final MutableLongState startTimeNanos$delegate;
    private final MutableState targetState$delegate;
    private final State totalDurationNanos$delegate;
    private final TransitionState<S> transitionState;
    private final MutableState updateChildrenNeeded$delegate;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final class DeferredAnimation<T, V extends AnimationVector> {
        private final MutableState data$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        private final String label;
        private final TwoWayConverter<T, V> typeConverter;

        public final class DeferredAnimationData<T, V extends AnimationVector> implements State<T> {
            private final Transition<S>.TransitionAnimationState<T, V> animation;
            private InterfaceC9540l targetValueByState;
            private InterfaceC9540l transitionSpec;

            public DeferredAnimationData(Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
                this.animation = transitionAnimationState;
                this.transitionSpec = interfaceC9540l;
                this.targetValueByState = interfaceC9540l2;
            }

            public final Transition<S>.TransitionAnimationState<T, V> getAnimation() {
                return this.animation;
            }

            public final InterfaceC9540l getTargetValueByState() {
                return this.targetValueByState;
            }

            public final InterfaceC9540l getTransitionSpec() {
                return this.transitionSpec;
            }

            @Override // androidx.compose.runtime.State
            public T getValue() {
                updateAnimationStates(Transition.this.getSegment());
                return this.animation.getValue();
            }

            public final void setTargetValueByState(InterfaceC9540l interfaceC9540l) {
                this.targetValueByState = interfaceC9540l;
            }

            public final void setTransitionSpec(InterfaceC9540l interfaceC9540l) {
                this.transitionSpec = interfaceC9540l;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void updateAnimationStates(Segment<S> segment) {
                Object objInvoke = this.targetValueByState.invoke(segment.getTargetState());
                if (!Transition.this.isSeeking()) {
                    this.animation.updateTargetValue$animation_core_release(objInvoke, (FiniteAnimationSpec) this.transitionSpec.invoke(segment));
                } else {
                    this.animation.updateInitialAndTargetValue$animation_core_release(this.targetValueByState.invoke(segment.getInitialState()), objInvoke, (FiniteAnimationSpec) this.transitionSpec.invoke(segment));
                }
            }
        }

        public DeferredAnimation(TwoWayConverter<T, V> twoWayConverter, String str) {
            this.typeConverter = twoWayConverter;
            this.label = str;
        }

        public final State<T> animate(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data$animation_core_release = getData$animation_core_release();
            if (data$animation_core_release == null) {
                Transition<S> transition = Transition.this;
                data$animation_core_release = new DeferredAnimationData<>(transition.new TransitionAnimationState(interfaceC9540l2.invoke(transition.getCurrentState()), AnimationStateKt.createZeroVectorFrom(this.typeConverter, interfaceC9540l2.invoke(Transition.this.getCurrentState())), this.typeConverter, this.label), interfaceC9540l, interfaceC9540l2);
                Transition<S> transition2 = Transition.this;
                setData$animation_core_release(data$animation_core_release);
                transition2.addAnimation$animation_core_release(data$animation_core_release.getAnimation());
            }
            Transition<S> transition3 = Transition.this;
            data$animation_core_release.setTargetValueByState(interfaceC9540l2);
            data$animation_core_release.setTransitionSpec(interfaceC9540l);
            data$animation_core_release.updateAnimationStates(transition3.getSegment());
            return data$animation_core_release;
        }

        public final Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> getData$animation_core_release() {
            return (DeferredAnimationData) this.data$delegate.getValue();
        }

        public final String getLabel() {
            return this.label;
        }

        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        public final void setData$animation_core_release(Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> deferredAnimationData) {
            this.data$delegate.setValue(deferredAnimationData);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void setupSeeking$animation_core_release() {
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data$animation_core_release = getData$animation_core_release();
            if (data$animation_core_release != null) {
                Transition<S> transition = Transition.this;
                data$animation_core_release.getAnimation().updateInitialAndTargetValue$animation_core_release(data$animation_core_release.getTargetValueByState().invoke(transition.getSegment().getInitialState()), data$animation_core_release.getTargetValueByState().invoke(transition.getSegment().getTargetState()), (FiniteAnimationSpec) data$animation_core_release.getTransitionSpec().invoke(transition.getSegment()));
            }
        }
    }

    public interface Segment<S> {

        public static final class DefaultImpls {
            @Deprecated
            public static <S> boolean isTransitioningTo(Segment<S> segment, S s10, S s11) {
                return Segment.super.isTransitioningTo(s10, s11);
            }
        }

        S getInitialState();

        S getTargetState();

        default boolean isTransitioningTo(S s10, S s11) {
            return AbstractC9979u.m20289b(s10, getInitialState()) && AbstractC9979u.m20289b(s11, getTargetState());
        }
    }

    public static final class SegmentImpl<S> implements Segment<S> {
        private final S initialState;
        private final S targetState;

        public SegmentImpl(S s10, S s11) {
            this.initialState = s10;
            this.targetState = s11;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Segment)) {
                return false;
            }
            Segment segment = (Segment) obj;
            return AbstractC9979u.m20289b(getInitialState(), segment.getInitialState()) && AbstractC9979u.m20289b(getTargetState(), segment.getTargetState());
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public S getInitialState() {
            return this.initialState;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public S getTargetState() {
            return this.targetState;
        }

        public int hashCode() {
            S initialState = getInitialState();
            int iHashCode = (initialState != null ? initialState.hashCode() : 0) * 31;
            S targetState = getTargetState();
            return iHashCode + (targetState != null ? targetState.hashCode() : 0);
        }
    }

    @Stable
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {
        private final MutableState animation$delegate;
        private final MutableState animationSpec$delegate;
        private final SpringSpec<T> defaultSpring;
        private final MutableLongState durationNanos$delegate;
        private TargetBasedAnimation<T, V> initialValueAnimation;
        private SeekableTransitionState.SeekingAnimationState initialValueState;
        private final FiniteAnimationSpec<T> interruptionSpec;
        private final MutableState isFinished$delegate;
        private boolean isSeeking;
        private final String label;
        private final MutableFloatState resetSnapValue$delegate;
        private final MutableState targetValue$delegate;
        private final TwoWayConverter<T, V> typeConverter;
        private boolean useOnlyInitialValue;
        private final MutableState value$delegate;
        private V velocityVector;

        public TransitionAnimationState(T t10, V v10, TwoWayConverter<T, V> twoWayConverter, String str) {
            Object objInvoke;
            this.typeConverter = twoWayConverter;
            this.label = str;
            this.targetValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
            SpringSpec<T> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            this.defaultSpring = springSpecSpring$default;
            this.animationSpec$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(springSpecSpring$default, null, 2, null);
            this.animation$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TargetBasedAnimation(getAnimationSpec(), twoWayConverter, t10, getTargetValue(), v10), null, 2, null);
            this.isFinished$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            this.resetSnapValue$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(-1.0f);
            this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
            this.velocityVector = v10;
            this.durationNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(getAnimation().getDurationNanos());
            Float f10 = VisibilityThresholdsKt.getVisibilityThresholdMap().get(twoWayConverter);
            if (f10 != null) {
                float fFloatValue = f10.floatValue();
                AnimationVector animationVector = (AnimationVector) twoWayConverter.getConvertToVector().invoke(t10);
                int size$animation_core_release = animationVector.getSize$animation_core_release();
                for (int i10 = 0; i10 < size$animation_core_release; i10++) {
                    animationVector.set$animation_core_release(i10, fFloatValue);
                }
                objInvoke = this.typeConverter.getConvertFromVector().invoke(animationVector);
            } else {
                objInvoke = null;
            }
            this.interruptionSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, objInvoke, 3, null);
        }

        private final T getTargetValue() {
            return this.targetValue$delegate.getValue();
        }

        private final void setAnimation(TargetBasedAnimation<T, V> targetBasedAnimation) {
            this.animation$delegate.setValue(targetBasedAnimation);
        }

        private final void setAnimationSpec(FiniteAnimationSpec<T> finiteAnimationSpec) {
            this.animationSpec$delegate.setValue(finiteAnimationSpec);
        }

        private final void setTargetValue(T t10) {
            this.targetValue$delegate.setValue(t10);
        }

        private final void updateAnimation(T t10, boolean z10) {
            TargetBasedAnimation<T, V> targetBasedAnimation = this.initialValueAnimation;
            if (AbstractC9979u.m20289b(targetBasedAnimation != null ? targetBasedAnimation.getTargetValue() : null, getTargetValue())) {
                setAnimation(new TargetBasedAnimation<>(this.interruptionSpec, this.typeConverter, t10, t10, AnimationVectorsKt.newInstance(this.velocityVector)));
                this.useOnlyInitialValue = true;
                setDurationNanos$animation_core_release(getAnimation().getDurationNanos());
                return;
            }
            AnimationSpec animationSpec = (!z10 || this.isSeeking || (getAnimationSpec() instanceof SpringSpec)) ? getAnimationSpec() : this.interruptionSpec;
            if (Transition.this.getPlayTimeNanos() > 0) {
                animationSpec = AnimationSpecKt.delayed(animationSpec, Transition.this.getPlayTimeNanos());
            }
            setAnimation(new TargetBasedAnimation<>(animationSpec, this.typeConverter, t10, getTargetValue(), this.velocityVector));
            setDurationNanos$animation_core_release(getAnimation().getDurationNanos());
            this.useOnlyInitialValue = false;
            Transition.this.onChildAnimationUpdated();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void updateAnimation$default(TransitionAnimationState transitionAnimationState, Object obj, boolean z10, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = transitionAnimationState.getValue();
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            transitionAnimationState.updateAnimation(obj, z10);
        }

        public final void clearInitialAnimation$animation_core_release() {
            this.initialValueAnimation = null;
            this.initialValueState = null;
            this.useOnlyInitialValue = false;
        }

        public final TargetBasedAnimation<T, V> getAnimation() {
            return (TargetBasedAnimation) this.animation$delegate.getValue();
        }

        public final FiniteAnimationSpec<T> getAnimationSpec() {
            return (FiniteAnimationSpec) this.animationSpec$delegate.getValue();
        }

        public final long getDurationNanos$animation_core_release() {
            return this.durationNanos$delegate.getLongValue();
        }

        public final SeekableTransitionState.SeekingAnimationState getInitialValueState$animation_core_release() {
            return this.initialValueState;
        }

        public final String getLabel() {
            return this.label;
        }

        public final float getResetSnapValue$animation_core_release() {
            return this.resetSnapValue$delegate.getFloatValue();
        }

        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            return this.value$delegate.getValue();
        }

        public final boolean isFinished$animation_core_release() {
            return ((Boolean) this.isFinished$delegate.getValue()).booleanValue();
        }

        public final void onPlayTimeChanged$animation_core_release(long j10, boolean z10) {
            if (z10) {
                j10 = getAnimation().getDurationNanos();
            }
            setValue$animation_core_release(getAnimation().getValueFromNanos(j10));
            this.velocityVector = (V) getAnimation().getVelocityVectorFromNanos(j10);
            if (getAnimation().isFinishedFromNanos(j10)) {
                setFinished$animation_core_release(true);
            }
        }

        public final void resetAnimation$animation_core_release() {
            setResetSnapValue$animation_core_release(-2.0f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void resetAnimationValue$animation_core_release(float f10) {
            if (f10 != -4.0f && f10 != -5.0f) {
                setResetSnapValue$animation_core_release(f10);
                return;
            }
            TargetBasedAnimation<T, V> targetBasedAnimation = this.initialValueAnimation;
            if (targetBasedAnimation != null) {
                getAnimation().setMutableInitialValue$animation_core_release(targetBasedAnimation.getTargetValue());
                this.initialValueState = null;
                this.initialValueAnimation = null;
            }
            Object initialValue = f10 == -4.0f ? getAnimation().getInitialValue() : getAnimation().getTargetValue();
            getAnimation().setMutableInitialValue$animation_core_release(initialValue);
            getAnimation().setMutableTargetValue$animation_core_release(initialValue);
            setValue$animation_core_release(initialValue);
            setDurationNanos$animation_core_release(getAnimation().getDurationNanos());
        }

        public final void seekTo$animation_core_release(long j10) {
            if (getResetSnapValue$animation_core_release() == -1.0f) {
                this.isSeeking = true;
                if (AbstractC9979u.m20289b(getAnimation().getTargetValue(), getAnimation().getInitialValue())) {
                    setValue$animation_core_release(getAnimation().getTargetValue());
                } else {
                    setValue$animation_core_release(getAnimation().getValueFromNanos(j10));
                    this.velocityVector = (V) getAnimation().getVelocityVectorFromNanos(j10);
                }
            }
        }

        public final void setDurationNanos$animation_core_release(long j10) {
            this.durationNanos$delegate.setLongValue(j10);
        }

        public final void setFinished$animation_core_release(boolean z10) {
            this.isFinished$delegate.setValue(Boolean.valueOf(z10));
        }

        public final void setInitialValueAnimation$animation_core_release(SeekableTransitionState.SeekingAnimationState seekingAnimationState) {
            if (!AbstractC9979u.m20289b(getAnimation().getTargetValue(), getAnimation().getInitialValue())) {
                this.initialValueAnimation = getAnimation();
                this.initialValueState = seekingAnimationState;
            }
            setAnimation(new TargetBasedAnimation<>(this.interruptionSpec, this.typeConverter, getValue(), getValue(), AnimationVectorsKt.newInstance(this.velocityVector)));
            setDurationNanos$animation_core_release(getAnimation().getDurationNanos());
            this.useOnlyInitialValue = true;
        }

        public final void setInitialValueState$animation_core_release(SeekableTransitionState.SeekingAnimationState seekingAnimationState) {
            this.initialValueState = seekingAnimationState;
        }

        public final void setResetSnapValue$animation_core_release(float f10) {
            this.resetSnapValue$delegate.setFloatValue(f10);
        }

        public void setValue$animation_core_release(T t10) {
            this.value$delegate.setValue(t10);
        }

        public String toString() {
            return "current value: " + getValue() + ", target: " + getTargetValue() + ", spec: " + getAnimationSpec();
        }

        public final void updateInitialAndTargetValue$animation_core_release(T t10, T t11, FiniteAnimationSpec<T> finiteAnimationSpec) {
            setTargetValue(t11);
            setAnimationSpec(finiteAnimationSpec);
            if (AbstractC9979u.m20289b(getAnimation().getInitialValue(), t10) && AbstractC9979u.m20289b(getAnimation().getTargetValue(), t11)) {
                return;
            }
            updateAnimation$default(this, t10, false, 2, null);
        }

        public final void updateInitialValue$animation_core_release() {
            TargetBasedAnimation<T, V> targetBasedAnimation;
            SeekableTransitionState.SeekingAnimationState seekingAnimationState = this.initialValueState;
            if (seekingAnimationState == null || (targetBasedAnimation = this.initialValueAnimation) == null) {
                return;
            }
            long jM19283e = AbstractC9719c.m19283e(seekingAnimationState.getDurationNanos() * seekingAnimationState.getValue());
            T valueFromNanos = targetBasedAnimation.getValueFromNanos(jM19283e);
            if (this.useOnlyInitialValue) {
                getAnimation().setMutableTargetValue$animation_core_release(valueFromNanos);
            }
            getAnimation().setMutableInitialValue$animation_core_release(valueFromNanos);
            setDurationNanos$animation_core_release(getAnimation().getDurationNanos());
            if (getResetSnapValue$animation_core_release() == -2.0f || this.useOnlyInitialValue) {
                setValue$animation_core_release(valueFromNanos);
            } else {
                seekTo$animation_core_release(Transition.this.getPlayTimeNanos());
            }
            if (jM19283e < seekingAnimationState.getDurationNanos()) {
                seekingAnimationState.setComplete(false);
            } else {
                this.initialValueState = null;
                this.initialValueAnimation = null;
            }
        }

        public final void updateTargetValue$animation_core_release(T t10, FiniteAnimationSpec<T> finiteAnimationSpec) {
            if (this.useOnlyInitialValue) {
                TargetBasedAnimation<T, V> targetBasedAnimation = this.initialValueAnimation;
                if (AbstractC9979u.m20289b(t10, targetBasedAnimation != null ? targetBasedAnimation.getTargetValue() : null)) {
                    return;
                }
            }
            if (AbstractC9979u.m20289b(getTargetValue(), t10) && getResetSnapValue$animation_core_release() == -1.0f) {
                return;
            }
            setTargetValue(t10);
            setAnimationSpec(finiteAnimationSpec);
            updateAnimation(getResetSnapValue$animation_core_release() == -3.0f ? t10 : getValue(), !isFinished$animation_core_release());
            setFinished$animation_core_release(getResetSnapValue$animation_core_release() == -3.0f);
            if (getResetSnapValue$animation_core_release() >= 0.0f) {
                setValue$animation_core_release(getAnimation().getValueFromNanos((long) (getAnimation().getDurationNanos() * getResetSnapValue$animation_core_release())));
            } else if (getResetSnapValue$animation_core_release() == -3.0f) {
                setValue$animation_core_release(t10);
            }
            this.useOnlyInitialValue = false;
            setResetSnapValue$animation_core_release(-1.0f);
        }
    }

    public Transition(TransitionState<S> transitionState, Transition<?> transition, String str) {
        this.transitionState = transitionState;
        this.parentTransition = transition;
        this.label = str;
        this.targetState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(getCurrentState(), null, 2, null);
        this.segment$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new SegmentImpl(getCurrentState(), getCurrentState()), null, 2, null);
        this._playTimeNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(0L);
        this.startTimeNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.updateChildrenNeeded$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this._animations = SnapshotStateKt.mutableStateListOf();
        this._transitions = SnapshotStateKt.mutableStateListOf();
        this.isSeeking$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.totalDurationNanos$delegate = SnapshotStateKt.derivedStateOf(new InterfaceC9529a(this) { // from class: androidx.compose.animation.core.Transition$totalDurationNanos$2
            final /* synthetic */ Transition<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p181hd.InterfaceC9529a
            public final Long invoke() {
                return Long.valueOf(this.this$0.calculateTotalDurationNanos());
            }
        });
        transitionState.transitionConfigured$animation_core_release(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long calculateTotalDurationNanos() {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            jMax = Math.max(jMax, snapshotStateList.get(i10).getDurationNanos$animation_core_release());
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            jMax = Math.max(jMax, snapshotStateList2.get(i11).calculateTotalDurationNanos());
        }
        return jMax;
    }

    @InternalAnimationApi
    public static /* synthetic */ void getHasInitialValueAnimations$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getUpdateChildrenNeeded() {
        return ((Boolean) this.updateChildrenNeeded$delegate.getValue()).booleanValue();
    }

    private final long get_playTimeNanos() {
        return this._playTimeNanos$delegate.getLongValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChildAnimationUpdated() {
        setUpdateChildrenNeeded(true);
        if (isSeeking()) {
            SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
            int size = snapshotStateList.size();
            long jMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState = snapshotStateList.get(i10);
                jMax = Math.max(jMax, transitionAnimationState.getDurationNanos$animation_core_release());
                transitionAnimationState.seekTo$animation_core_release(this.lastSeekedTimeNanos);
            }
            setUpdateChildrenNeeded(false);
        }
    }

    private final void setSegment(Segment<S> segment) {
        this.segment$delegate.setValue(segment);
    }

    private final void setUpdateChildrenNeeded(boolean z10) {
        this.updateChildrenNeeded$delegate.setValue(Boolean.valueOf(z10));
    }

    private final void set_playTimeNanos(long j10) {
        this._playTimeNanos$delegate.setLongValue(j10);
    }

    public final boolean addAnimation$animation_core_release(Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState) {
        return this._animations.add(transitionAnimationState);
    }

    public final boolean addTransition$animation_core_release(Transition<?> transition) {
        return this._transitions.add(transition);
    }

    @Composable
    public final void animateTo$animation_core_release(final S s10, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1493585151);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.changed(s10) : composerStartRestartGroup.changedInstance(s10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1493585151, i11, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1176)");
            }
            if (isSeeking()) {
                composerStartRestartGroup.startReplaceGroup(1824284987);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1822801203);
                updateTarget$animation_core_release(s10);
                if (!AbstractC9979u.m20289b(s10, getCurrentState()) || isRunning() || getUpdateChildrenNeeded()) {
                    composerStartRestartGroup.startReplaceGroup(1823032494);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f23351c, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) objRememberedValue;
                    int i12 = i11 & 112;
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(interfaceC11122i0) | (i12 == 32);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new InterfaceC9540l() { // from class: androidx.compose.animation.core.Transition$animateTo$1$1

                            @InterfaceC11829d(m26210c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", m26211f = "Transition.kt", m26212l = {1192}, m26213m = "invokeSuspend")
                            /* renamed from: androidx.compose.animation.core.Transition$animateTo$1$1$1 */
                            public static final class C11431 extends SuspendLambda implements InterfaceC9544p {
                                float F$0;
                                private /* synthetic */ Object L$0;
                                int label;
                                final /* synthetic */ Transition<S> this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C11431(Transition<S> transition, InterfaceC11588c<? super C11431> interfaceC11588c) {
                                    super(2, interfaceC11588c);
                                    this.this$0 = transition;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                                    C11431 c11431 = new C11431(this.this$0, interfaceC11588c);
                                    c11431.L$0 = obj;
                                    return c11431;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) throws Throwable {
                                    final float durationScale;
                                    InterfaceC11122i0 interfaceC11122i0;
                                    Object objM25952f = AbstractC11725a.m25952f();
                                    int i10 = this.label;
                                    if (i10 == 0) {
                                        AbstractC9924b.m20071b(obj);
                                        InterfaceC11122i0 interfaceC11122i02 = (InterfaceC11122i0) this.L$0;
                                        durationScale = SuspendAnimationKt.getDurationScale(interfaceC11122i02.getCoroutineContext());
                                        interfaceC11122i0 = interfaceC11122i02;
                                    } else {
                                        if (i10 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        durationScale = this.F$0;
                                        interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                                        AbstractC9924b.m20071b(obj);
                                    }
                                    while (AbstractC10006d.m20749f(interfaceC11122i0)) {
                                        final Transition<S> transition = this.this$0;
                                        InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.animation.core.Transition.animateTo.1.1.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // p181hd.InterfaceC9540l
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                invoke(((Number) obj2).longValue());
                                                return C10786q.f26013a;
                                            }

                                            public final void invoke(long j10) {
                                                if (transition.isSeeking()) {
                                                    return;
                                                }
                                                transition.onFrame$animation_core_release(j10, durationScale);
                                            }
                                        };
                                        this.L$0 = interfaceC11122i0;
                                        this.F$0 = durationScale;
                                        this.label = 1;
                                        if (MonotonicFrameClockKt.withFrameNanos(interfaceC9540l, this) == objM25952f) {
                                            return objM25952f;
                                        }
                                    }
                                    return C10786q.f26013a;
                                }

                                @Override // p181hd.InterfaceC9544p
                                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                                    return ((C11431) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                AbstractC11117h.m24726d(interfaceC11122i0, null, CoroutineStart.f23479f, new C11431(this, null), 1, null);
                                return new DisposableEffectResult() { // from class: androidx.compose.animation.core.Transition$animateTo$1$1$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    EffectsKt.DisposableEffect(interfaceC11122i0, this, (InterfaceC9540l) objRememberedValue2, composerStartRestartGroup, i12);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1824275067);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p(this) { // from class: androidx.compose.animation.core.Transition$animateTo$2
                final /* synthetic */ Transition<S> $tmp1_rcvr;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    this.$tmp1_rcvr = this;
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i13) {
                    this.$tmp1_rcvr.animateTo$animation_core_release(s10, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    public final void clearInitialAnimations$animation_core_release() {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).clearInitialAnimation$animation_core_release();
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            snapshotStateList2.get(i11).clearInitialAnimations$animation_core_release();
        }
    }

    public final List<Transition<S>.TransitionAnimationState<?, ?>> getAnimations() {
        return this._animations;
    }

    public final S getCurrentState() {
        return this.transitionState.getCurrentState();
    }

    @InternalAnimationApi
    public final boolean getHasInitialValueAnimations() {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (snapshotStateList.get(i10).getInitialValueState$animation_core_release() != null) {
                return true;
            }
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (snapshotStateList2.get(i11).getHasInitialValueAnimations()) {
                return true;
            }
        }
        return false;
    }

    public final String getLabel() {
        return this.label;
    }

    public final long getLastSeekedTimeNanos$animation_core_release() {
        return this.lastSeekedTimeNanos;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final Transition<?> getParentTransition() {
        return this.parentTransition;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final long getPlayTimeNanos() {
        Transition<?> transition = this.parentTransition;
        return transition != null ? transition.getPlayTimeNanos() : get_playTimeNanos();
    }

    public final Segment<S> getSegment() {
        return (Segment) this.segment$delegate.getValue();
    }

    public final long getStartTimeNanos$animation_core_release() {
        return this.startTimeNanos$delegate.getLongValue();
    }

    public final S getTargetState() {
        return (S) this.targetState$delegate.getValue();
    }

    public final long getTotalDurationNanos() {
        return ((Number) this.totalDurationNanos$delegate.getValue()).longValue();
    }

    public final List<Transition<?>> getTransitions() {
        return this._transitions;
    }

    public final boolean isRunning() {
        return getStartTimeNanos$animation_core_release() != Long.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean isSeeking() {
        return ((Boolean) this.isSeeking$delegate.getValue()).booleanValue();
    }

    public final void onDisposed$animation_core_release() {
        onTransitionEnd$animation_core_release();
        this.transitionState.transitionRemoved$animation_core_release();
    }

    public final void onFrame$animation_core_release(long j10, float f10) {
        if (getStartTimeNanos$animation_core_release() == Long.MIN_VALUE) {
            onTransitionStart$animation_core_release(j10);
        }
        long startTimeNanos$animation_core_release = j10 - getStartTimeNanos$animation_core_release();
        if (f10 != 0.0f) {
            startTimeNanos$animation_core_release = AbstractC9719c.m19283e(startTimeNanos$animation_core_release / f10);
        }
        setPlayTimeNanos(startTimeNanos$animation_core_release);
        onFrame$animation_core_release(startTimeNanos$animation_core_release, f10 == 0.0f);
    }

    public final void onTransitionEnd$animation_core_release() {
        setStartTimeNanos$animation_core_release(Long.MIN_VALUE);
        TransitionState<S> transitionState = this.transitionState;
        if (transitionState instanceof MutableTransitionState) {
            transitionState.setCurrentState$animation_core_release(getTargetState());
        }
        setPlayTimeNanos(0L);
        this.transitionState.setRunning$animation_core_release(false);
        SnapshotStateList<Transition<?>> snapshotStateList = this._transitions;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).onTransitionEnd$animation_core_release();
        }
    }

    public final void onTransitionStart$animation_core_release(long j10) {
        setStartTimeNanos$animation_core_release(j10);
        this.transitionState.setRunning$animation_core_release(true);
    }

    public final void removeAnimation$animation_core_release(Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState) {
        this._animations.remove(transitionAnimationState);
    }

    public final boolean removeTransition$animation_core_release(Transition<?> transition) {
        return this._transitions.remove(transition);
    }

    public final void resetAnimationFraction$animation_core_release(float f10) {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).resetAnimationValue$animation_core_release(f10);
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            snapshotStateList2.get(i11).resetAnimationFraction$animation_core_release(f10);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void seek(S s10, S s11, long j10) {
        setStartTimeNanos$animation_core_release(Long.MIN_VALUE);
        this.transitionState.setRunning$animation_core_release(false);
        if (!isSeeking() || !AbstractC9979u.m20289b(getCurrentState(), s10) || !AbstractC9979u.m20289b(getTargetState(), s11)) {
            if (!AbstractC9979u.m20289b(getCurrentState(), s10)) {
                TransitionState<S> transitionState = this.transitionState;
                if (transitionState instanceof MutableTransitionState) {
                    transitionState.setCurrentState$animation_core_release(s10);
                }
            }
            setTargetState$animation_core_release(s11);
            setSeeking$animation_core_release(true);
            setSegment(new SegmentImpl(s10, s11));
        }
        SnapshotStateList<Transition<?>> snapshotStateList = this._transitions;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Transition<?> transition = snapshotStateList.get(i10);
            AbstractC9979u.m20292e(transition, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (transition.isSeeking()) {
                transition.seek(transition.getCurrentState(), transition.getTargetState(), j10);
            }
        }
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList2 = this._animations;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            snapshotStateList2.get(i11).seekTo$animation_core_release(j10);
        }
        this.lastSeekedTimeNanos = j10;
    }

    public final void seekAnimations$animation_core_release(long j10) {
        if (getStartTimeNanos$animation_core_release() == Long.MIN_VALUE) {
            setStartTimeNanos$animation_core_release(j10);
        }
        setPlayTimeNanos(j10);
        setUpdateChildrenNeeded(false);
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).seekTo$animation_core_release(j10);
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Transition<?> transition = snapshotStateList2.get(i11);
            if (!AbstractC9979u.m20289b(transition.getTargetState(), transition.getCurrentState())) {
                transition.seekAnimations$animation_core_release(j10);
            }
        }
    }

    public final void setInitialAnimations$animation_core_release(SeekableTransitionState.SeekingAnimationState seekingAnimationState) {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).setInitialValueAnimation$animation_core_release(seekingAnimationState);
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            snapshotStateList2.get(i11).setInitialAnimations$animation_core_release(seekingAnimationState);
        }
    }

    public final void setLastSeekedTimeNanos$animation_core_release(long j10) {
        this.lastSeekedTimeNanos = j10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void setPlayTimeNanos(long j10) {
        if (this.parentTransition == null) {
            set_playTimeNanos(j10);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void setSeeking$animation_core_release(boolean z10) {
        this.isSeeking$delegate.setValue(Boolean.valueOf(z10));
    }

    public final void setStartTimeNanos$animation_core_release(long j10) {
        this.startTimeNanos$delegate.setLongValue(j10);
    }

    public final void setTargetState$animation_core_release(S s10) {
        this.targetState$delegate.setValue(s10);
    }

    public String toString() {
        List<Transition<S>.TransitionAnimationState<?, ?>> animations = getAnimations();
        int size = animations.size();
        String str = "Transition animation values: ";
        for (int i10 = 0; i10 < size; i10++) {
            str = str + animations.get(i10) + ", ";
        }
        return str;
    }

    public final void updateInitialValues$animation_core_release() {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).updateInitialValue$animation_core_release();
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            snapshotStateList2.get(i11).updateInitialValues$animation_core_release();
        }
    }

    public final void updateTarget$animation_core_release(S s10) {
        if (AbstractC9979u.m20289b(getTargetState(), s10)) {
            return;
        }
        setSegment(new SegmentImpl(getTargetState(), s10));
        if (!AbstractC9979u.m20289b(getCurrentState(), getTargetState())) {
            this.transitionState.setCurrentState$animation_core_release(getTargetState());
        }
        setTargetState$animation_core_release(s10);
        if (!isRunning()) {
            setUpdateChildrenNeeded(true);
        }
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).resetAnimation$animation_core_release();
        }
    }

    public final void removeAnimation$animation_core_release(Transition<S>.DeferredAnimation<?, ?> deferredAnimation) {
        Transition<S>.TransitionAnimationState<?, ?> animation;
        Transition<S>.DeferredAnimationData<?, ?>.DeferredAnimationData<?, V> data$animation_core_release = deferredAnimation.getData$animation_core_release();
        if (data$animation_core_release == 0 || (animation = data$animation_core_release.getAnimation()) == null) {
            return;
        }
        removeAnimation$animation_core_release(animation);
    }

    public final void onFrame$animation_core_release(long j10, boolean z10) {
        boolean z11 = true;
        if (getStartTimeNanos$animation_core_release() == Long.MIN_VALUE) {
            onTransitionStart$animation_core_release(j10);
        } else if (!this.transitionState.isRunning$animation_core_release()) {
            this.transitionState.setRunning$animation_core_release(true);
        }
        setUpdateChildrenNeeded(false);
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState = snapshotStateList.get(i10);
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                transitionAnimationState.onPlayTimeChanged$animation_core_release(j10, z10);
            }
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                z11 = false;
            }
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Transition<?> transition = snapshotStateList2.get(i11);
            if (!AbstractC9979u.m20289b(transition.getTargetState(), transition.getCurrentState())) {
                transition.onFrame$animation_core_release(j10, z10);
            }
            if (!AbstractC9979u.m20289b(transition.getTargetState(), transition.getCurrentState())) {
                z11 = false;
            }
        }
        if (z11) {
            onTransitionEnd$animation_core_release();
        }
    }

    public /* synthetic */ Transition(TransitionState transitionState, Transition transition, String str, int i10, AbstractC9972n abstractC9972n) {
        this(transitionState, transition, (i10 & 4) != 0 ? null : str);
    }

    public /* synthetic */ Transition(TransitionState transitionState, String str, int i10, AbstractC9972n abstractC9972n) {
        this(transitionState, (i10 & 2) != 0 ? null : str);
    }

    public Transition(TransitionState<S> transitionState, String str) {
        this(transitionState, null, str);
    }

    public Transition(S s10, String str) {
        this(new MutableTransitionState(s10), null, str);
    }

    public /* synthetic */ Transition(MutableTransitionState mutableTransitionState, String str, int i10, AbstractC9972n abstractC9972n) {
        this(mutableTransitionState, (i10 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Transition(MutableTransitionState<S> mutableTransitionState, String str) {
        this(mutableTransitionState, null, str);
        AbstractC9979u.m20292e(mutableTransitionState, "null cannot be cast to non-null type androidx.compose.animation.core.TransitionState<S of androidx.compose.animation.core.Transition>");
    }
}
