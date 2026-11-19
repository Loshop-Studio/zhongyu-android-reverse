package androidx.compose.animation.core;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.collection.MutableObjectList;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import be.AbstractC5194f;
import be.InterfaceC5189a;
import com.google.android.material.color.utilities.Contrast;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10006d;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p211jd.AbstractC9719c;
import p265nd.AbstractC10410o;
import p265nd.C10405j;
import p309qc.C10786q;
import p325rc.AbstractC10964p;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import sd.InterfaceC11125j;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SeekableTransitionState<S> extends TransitionState<S> {
    private final InterfaceC9540l animateOneFrameLambda;
    private S composedTargetState;
    private InterfaceC11125j compositionContinuation;
    private final InterfaceC5189a compositionContinuationMutex;
    private SeekingAnimationState currentAnimation;
    private final MutableState currentState$delegate;
    private float durationScale;
    private final InterfaceC9540l firstFrameLambda;
    private final MutableFloatState fraction$delegate;
    private final MutableObjectList<SeekingAnimationState> initialValueAnimations;
    private long lastFrameTimeNanos;
    private final MutatorMutex mutatorMutex;
    private final InterfaceC9529a recalculateTotalDurationNanos;
    private final MutableState targetState$delegate;
    private long totalDurationNanos;
    private Transition<S> transition;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final AnimationVector1D ZeroVelocity = new AnimationVector1D(0.0f);
    private static final AnimationVector1D Target1 = new AnimationVector1D(1.0f);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final AnimationVector1D getTarget1() {
            return SeekableTransitionState.Target1;
        }

        public final AnimationVector1D getZeroVelocity() {
            return SeekableTransitionState.ZeroVelocity;
        }

        private Companion() {
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class SeekingAnimationState {
        public static final int $stable = 8;
        private VectorizedAnimationSpec<AnimationVector1D> animationSpec;
        private long animationSpecDuration;
        private long durationNanos;
        private AnimationVector1D initialVelocity;
        private boolean isComplete;
        private long progressNanos;
        private AnimationVector1D start = new AnimationVector1D(0.0f);
        private float value;

        public final VectorizedAnimationSpec<AnimationVector1D> getAnimationSpec() {
            return this.animationSpec;
        }

        public final long getAnimationSpecDuration() {
            return this.animationSpecDuration;
        }

        public final long getDurationNanos() {
            return this.durationNanos;
        }

        public final AnimationVector1D getInitialVelocity() {
            return this.initialVelocity;
        }

        public final long getProgressNanos() {
            return this.progressNanos;
        }

        public final AnimationVector1D getStart() {
            return this.start;
        }

        public final float getValue() {
            return this.value;
        }

        public final boolean isComplete() {
            return this.isComplete;
        }

        public final void setAnimationSpec(VectorizedAnimationSpec<AnimationVector1D> vectorizedAnimationSpec) {
            this.animationSpec = vectorizedAnimationSpec;
        }

        public final void setAnimationSpecDuration(long j10) {
            this.animationSpecDuration = j10;
        }

        public final void setComplete(boolean z10) {
            this.isComplete = z10;
        }

        public final void setDurationNanos(long j10) {
            this.durationNanos = j10;
        }

        public final void setInitialVelocity(AnimationVector1D animationVector1D) {
            this.initialVelocity = animationVector1D;
        }

        public final void setProgressNanos(long j10) {
            this.progressNanos = j10;
        }

        public final void setStart(AnimationVector1D animationVector1D) {
            this.start = animationVector1D;
        }

        public final void setValue(float f10) {
            this.value = f10;
        }

        public String toString() {
            return "progress nanos: " + this.progressNanos + ", animationSpec: " + this.animationSpec + ", isComplete: " + this.isComplete + ", value: " + this.value + ", start: " + this.start + ", initialVelocity: " + this.initialVelocity + ", durationNanos: " + this.durationNanos + ", animationSpecDuration: " + this.animationSpecDuration;
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", m26211f = "Transition.kt", m26212l = {599}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$animateTo$2 */
    public static final class C11272 extends SuspendLambda implements InterfaceC9540l {
        final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        @InterfaceC11829d(m26210c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", m26211f = "Transition.kt", m26212l = {2147, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, 614, 668, 670}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
            final /* synthetic */ S $targetState;
            final /* synthetic */ Transition<S> $transition;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SeekableTransitionState<S> seekableTransitionState, S s10, Transition<S> transition, FiniteAnimationSpec<Float> finiteAnimationSpec, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.this$0 = seekableTransitionState;
                this.$targetState = s10;
                this.$transition = transition;
                this.$animationSpec = finiteAnimationSpec;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass1(this.this$0, this.$targetState, this.$transition, this.$animationSpec, interfaceC11588c);
            }

            /* JADX WARN: Code restructure failed: missing block: B:74:0x01e8, code lost:
            
                if (r2.waitForComposition(r18) != r0) goto L76;
             */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 504
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.C11272.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11272(Transition<S> transition, SeekableTransitionState<S> seekableTransitionState, S s10, FiniteAnimationSpec<Float> finiteAnimationSpec, InterfaceC11588c<? super C11272> interfaceC11588c) {
            super(1, interfaceC11588c);
            this.$transition = transition;
            this.this$0 = seekableTransitionState;
            this.$targetState = s10;
            this.$animationSpec = finiteAnimationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(InterfaceC11588c<?> interfaceC11588c) {
            return new C11272(this.$transition, this.this$0, this.$targetState, this.$animationSpec, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$targetState, this.$transition, this.$animationSpec, null);
                this.label = 1;
                if (AbstractC10006d.m20748e(anonymousClass1, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            this.$transition.onTransitionEnd$animation_core_release();
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9540l
        public final Object invoke(InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C11272) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.animation.core.SeekableTransitionState", m26211f = "Transition.kt", m26212l = {353, 356}, m26213m = "runAnimations")
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 */
    public static final class C11281 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11281(SeekableTransitionState<S> seekableTransitionState, InterfaceC11588c<? super C11281> interfaceC11588c) {
            super(interfaceC11588c);
            this.this$0 = seekableTransitionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.runAnimations(this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", m26211f = "Transition.kt", m26212l = {488}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3 */
    public static final class C11293 extends SuspendLambda implements InterfaceC9540l {
        final /* synthetic */ float $fraction;
        final /* synthetic */ S $oldTargetState;
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        @InterfaceC11829d(m26210c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", m26211f = "Transition.kt", m26212l = {TypedValues.PositionType.TYPE_POSITION_TYPE}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ float $fraction;
            final /* synthetic */ S $oldTargetState;
            final /* synthetic */ S $targetState;
            final /* synthetic */ Transition<S> $transition;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SeekableTransitionState<S> this$0;

            @InterfaceC11829d(m26210c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1", m26211f = "Transition.kt", m26212l = {TypedValues.PositionType.TYPE_PERCENT_X}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C120591 extends SuspendLambda implements InterfaceC9544p {
                int label;
                final /* synthetic */ SeekableTransitionState<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C120591(SeekableTransitionState<S> seekableTransitionState, InterfaceC11588c<? super C120591> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.this$0 = seekableTransitionState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new C120591(this.this$0, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        SeekableTransitionState<S> seekableTransitionState = this.this$0;
                        this.label = 1;
                        if (seekableTransitionState.runAnimations(this) == objM25952f) {
                            return objM25952f;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                    }
                    return C10786q.f26013a;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((C120591) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(S s10, S s11, SeekableTransitionState<S> seekableTransitionState, Transition<S> transition, float f10, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$targetState = s10;
                this.$oldTargetState = s11;
                this.this$0 = seekableTransitionState;
                this.$transition = transition;
                this.$fraction = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, interfaceC11588c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                    if (AbstractC9979u.m20289b(this.$targetState, this.$oldTargetState)) {
                        ((SeekableTransitionState) this.this$0).currentAnimation = null;
                        if (AbstractC9979u.m20289b(this.this$0.getCurrentState(), this.$targetState)) {
                            return C10786q.f26013a;
                        }
                    } else {
                        this.this$0.moveAnimationToInitialState();
                    }
                    if (!AbstractC9979u.m20289b(this.$targetState, this.$oldTargetState)) {
                        this.$transition.updateTarget$animation_core_release(this.$targetState);
                        this.$transition.setPlayTimeNanos(0L);
                        this.this$0.setTargetState$animation_core_release(this.$targetState);
                        this.$transition.resetAnimationFraction$animation_core_release(this.$fraction);
                    }
                    this.this$0.setFraction(this.$fraction);
                    if (((SeekableTransitionState) this.this$0).initialValueAnimations.isNotEmpty()) {
                        AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C120591(this.this$0, null), 3, null);
                    } else {
                        ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = Long.MIN_VALUE;
                    }
                    SeekableTransitionState<S> seekableTransitionState = this.this$0;
                    this.label = 1;
                    if (seekableTransitionState.waitForCompositionAfterTargetStateChange(this) == objM25952f) {
                        return objM25952f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                }
                this.this$0.seekToFraction();
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11293(S s10, S s11, SeekableTransitionState<S> seekableTransitionState, Transition<S> transition, float f10, InterfaceC11588c<? super C11293> interfaceC11588c) {
            super(1, interfaceC11588c);
            this.$targetState = s10;
            this.$oldTargetState = s11;
            this.this$0 = seekableTransitionState;
            this.$transition = transition;
            this.$fraction = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(InterfaceC11588c<?> interfaceC11588c) {
            return new C11293(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, null);
                this.label = 1;
                if (AbstractC10006d.m20748e(anonymousClass1, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9540l
        public final Object invoke(InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C11293) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", m26211f = "Transition.kt", m26212l = {457}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$snapTo$2 */
    public static final class C11302 extends SuspendLambda implements InterfaceC9540l {
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11302(SeekableTransitionState<S> seekableTransitionState, S s10, Transition<S> transition, InterfaceC11588c<? super C11302> interfaceC11588c) {
            super(1, interfaceC11588c);
            this.this$0 = seekableTransitionState;
            this.$targetState = s10;
            this.$transition = transition;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(InterfaceC11588c<?> interfaceC11588c) {
            return new C11302(this.this$0, this.$targetState, this.$transition, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                this.this$0.endAllAnimations();
                ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = Long.MIN_VALUE;
                this.this$0.setFraction(0.0f);
                S s10 = this.$targetState;
                float f10 = AbstractC9979u.m20289b(s10, this.this$0.getCurrentState()) ? -4.0f : AbstractC9979u.m20289b(s10, this.this$0.getTargetState()) ? -5.0f : -3.0f;
                this.$transition.updateTarget$animation_core_release(this.$targetState);
                this.$transition.setPlayTimeNanos(0L);
                this.this$0.setTargetState$animation_core_release(this.$targetState);
                this.this$0.setFraction(0.0f);
                this.this$0.setCurrentState$animation_core_release(this.$targetState);
                this.$transition.resetAnimationFraction$animation_core_release(f10);
                if (f10 == -3.0f) {
                    SeekableTransitionState<S> seekableTransitionState = this.this$0;
                    this.label = 1;
                    if (seekableTransitionState.waitForCompositionAfterTargetStateChange(this) == objM25952f) {
                        return objM25952f;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            this.$transition.onTransitionEnd$animation_core_release();
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9540l
        public final Object invoke(InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C11302) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.animation.core.SeekableTransitionState", m26211f = "Transition.kt", m26212l = {543, 2142}, m26213m = "waitForComposition")
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 */
    public static final class C11311 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11311(SeekableTransitionState<S> seekableTransitionState, InterfaceC11588c<? super C11311> interfaceC11588c) {
            super(interfaceC11588c);
            this.this$0 = seekableTransitionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.waitForComposition(this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.animation.core.SeekableTransitionState", m26211f = "Transition.kt", m26212l = {519, 2142}, m26213m = "waitForCompositionAfterTargetStateChange")
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 */
    public static final class C11321 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11321(SeekableTransitionState<S> seekableTransitionState, InterfaceC11588c<? super C11321> interfaceC11588c) {
            super(interfaceC11588c);
            this.this$0 = seekableTransitionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.waitForCompositionAfterTargetStateChange(this);
        }
    }

    public SeekableTransitionState(S s10) {
        super(null);
        this.targetState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s10, null, 2, null);
        this.currentState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s10, null, 2, null);
        this.composedTargetState = s10;
        this.recalculateTotalDurationNanos = new InterfaceC9529a(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$recalculateTotalDurationNanos$1
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m26876invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m26876invoke() {
                SeekableTransitionState<S> seekableTransitionState = this.this$0;
                Transition transition = ((SeekableTransitionState) seekableTransitionState).transition;
                seekableTransitionState.setTotalDurationNanos$animation_core_release(transition != null ? transition.getTotalDurationNanos() : 0L);
            }
        };
        this.fraction$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.compositionContinuationMutex = AbstractC5194f.m2745b(false, 1, null);
        this.mutatorMutex = new MutatorMutex();
        this.lastFrameTimeNanos = Long.MIN_VALUE;
        this.initialValueAnimations = new MutableObjectList<>(0, 1, null);
        this.firstFrameLambda = new InterfaceC9540l(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$firstFrameLambda$1
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return C10786q.f26013a;
            }

            public final void invoke(long j10) {
                ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = j10;
            }
        };
        this.animateOneFrameLambda = new InterfaceC9540l(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$animateOneFrameLambda$1
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return C10786q.f26013a;
            }

            public final void invoke(long j10) {
                long j11 = j10 - ((SeekableTransitionState) this.this$0).lastFrameTimeNanos;
                ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = j10;
                long jM19283e = AbstractC9719c.m19283e(j11 / ((SeekableTransitionState) this.this$0).durationScale);
                if (((SeekableTransitionState) this.this$0).initialValueAnimations.isNotEmpty()) {
                    MutableObjectList mutableObjectList = ((SeekableTransitionState) this.this$0).initialValueAnimations;
                    SeekableTransitionState<S> seekableTransitionState = this.this$0;
                    Object[] objArr = mutableObjectList.content;
                    int i10 = mutableObjectList._size;
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        SeekableTransitionState.SeekingAnimationState seekingAnimationState = (SeekableTransitionState.SeekingAnimationState) objArr[i12];
                        seekableTransitionState.recalculateAnimationValue(seekingAnimationState, jM19283e);
                        seekingAnimationState.setComplete(true);
                    }
                    Transition transition = ((SeekableTransitionState) this.this$0).transition;
                    if (transition != null) {
                        transition.updateInitialValues$animation_core_release();
                    }
                    MutableObjectList mutableObjectList2 = ((SeekableTransitionState) this.this$0).initialValueAnimations;
                    int i13 = mutableObjectList2._size;
                    Object[] objArr2 = mutableObjectList2.content;
                    C10405j c10405jM21768u = AbstractC10410o.m21768u(0, i13);
                    int iM21733b = c10405jM21768u.m21733b();
                    int iM21734c = c10405jM21768u.m21734c();
                    if (iM21733b <= iM21734c) {
                        while (true) {
                            objArr2[iM21733b - i11] = objArr2[iM21733b];
                            if (((SeekableTransitionState.SeekingAnimationState) objArr2[iM21733b]).isComplete()) {
                                i11++;
                            }
                            if (iM21733b == iM21734c) {
                                break;
                            } else {
                                iM21733b++;
                            }
                        }
                    }
                    AbstractC10964p.m23987B(objArr2, null, i13 - i11, i13);
                    mutableObjectList2._size -= i11;
                }
                SeekableTransitionState.SeekingAnimationState seekingAnimationState2 = ((SeekableTransitionState) this.this$0).currentAnimation;
                if (seekingAnimationState2 != null) {
                    seekingAnimationState2.setDurationNanos(this.this$0.getTotalDurationNanos$animation_core_release());
                    this.this$0.recalculateAnimationValue(seekingAnimationState2, jM19283e);
                    this.this$0.setFraction(seekingAnimationState2.getValue());
                    if (seekingAnimationState2.getValue() == 1.0f) {
                        ((SeekableTransitionState) this.this$0).currentAnimation = null;
                    }
                    this.this$0.seekToFraction();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateOneFrame(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        float durationScale = SuspendAnimationKt.getDurationScale(interfaceC11588c.getContext());
        if (durationScale <= 0.0f) {
            endAllAnimations();
            return C10786q.f26013a;
        }
        this.durationScale = durationScale;
        Object objWithFrameNanos = MonotonicFrameClockKt.withFrameNanos(this.animateOneFrameLambda, interfaceC11588c);
        return objWithFrameNanos == AbstractC11725a.m25952f() ? objWithFrameNanos : C10786q.f26013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(SeekableTransitionState seekableTransitionState, Object obj, FiniteAnimationSpec finiteAnimationSpec, InterfaceC11588c interfaceC11588c, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = seekableTransitionState.getTargetState();
        }
        if ((i10 & 2) != 0) {
            finiteAnimationSpec = null;
        }
        return seekableTransitionState.animateTo(obj, finiteAnimationSpec, interfaceC11588c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object doOneFrame(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        if (this.lastFrameTimeNanos == Long.MIN_VALUE) {
            Object objWithFrameNanos = MonotonicFrameClockKt.withFrameNanos(this.firstFrameLambda, interfaceC11588c);
            return objWithFrameNanos == AbstractC11725a.m25952f() ? objWithFrameNanos : C10786q.f26013a;
        }
        Object objAnimateOneFrame = animateOneFrame(interfaceC11588c);
        return objAnimateOneFrame == AbstractC11725a.m25952f() ? objAnimateOneFrame : C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endAllAnimations() {
        Transition<S> transition = this.transition;
        if (transition != null) {
            transition.clearInitialAnimations$animation_core_release();
        }
        this.initialValueAnimations.clear();
        if (this.currentAnimation != null) {
            this.currentAnimation = null;
            setFraction(1.0f);
            seekToFraction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveAnimationToInitialState() {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return;
        }
        SeekingAnimationState seekingAnimationState = this.currentAnimation;
        if (seekingAnimationState == null) {
            if (this.totalDurationNanos <= 0 || getFraction() == 1.0f || AbstractC9979u.m20289b(getCurrentState(), getTargetState())) {
                seekingAnimationState = null;
            } else {
                seekingAnimationState = new SeekingAnimationState();
                seekingAnimationState.setValue(getFraction());
                long j10 = this.totalDurationNanos;
                seekingAnimationState.setDurationNanos(j10);
                seekingAnimationState.setAnimationSpecDuration(AbstractC9719c.m19283e(j10 * (1.0d - getFraction())));
                seekingAnimationState.getStart().set$animation_core_release(0, getFraction());
            }
        }
        if (seekingAnimationState != null) {
            seekingAnimationState.setDurationNanos(this.totalDurationNanos);
            this.initialValueAnimations.add(seekingAnimationState);
            transition.setInitialAnimations$animation_core_release(seekingAnimationState);
        }
        this.currentAnimation = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recalculateAnimationValue(SeekingAnimationState seekingAnimationState, long j10) {
        long progressNanos = seekingAnimationState.getProgressNanos() + j10;
        seekingAnimationState.setProgressNanos(progressNanos);
        long animationSpecDuration = seekingAnimationState.getAnimationSpecDuration();
        if (progressNanos >= animationSpecDuration) {
            seekingAnimationState.setValue(1.0f);
            return;
        }
        VectorizedAnimationSpec<AnimationVector1D> animationSpec = seekingAnimationState.getAnimationSpec();
        if (animationSpec == null) {
            float f10 = progressNanos / animationSpecDuration;
            seekingAnimationState.setValue((seekingAnimationState.getStart().get$animation_core_release(0) * (1 - f10)) + (f10 * 1.0f));
        } else {
            AnimationVector1D start = seekingAnimationState.getStart();
            AnimationVector1D animationVector1D = Target1;
            AnimationVector1D initialVelocity = seekingAnimationState.getInitialVelocity();
            if (initialVelocity == null) {
                initialVelocity = ZeroVelocity;
            }
            seekingAnimationState.setValue(AbstractC10410o.m21760m(((AnimationVector1D) animationSpec.getValueFromNanos(progressNanos, start, animationVector1D, initialVelocity)).get$animation_core_release(0), 0.0f, 1.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r10, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runAnimations(vc.InterfaceC11588c<? super p309qc.C10786q> r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.compose.animation.core.SeekableTransitionState.C11281
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 r0 = (androidx.compose.animation.core.SeekableTransitionState.C11281) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$runAnimations$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = -9223372036854775808
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            goto L33
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            java.lang.Object r2 = r0.L$0
            androidx.compose.animation.core.SeekableTransitionState r2 = (androidx.compose.animation.core.SeekableTransitionState) r2
            kotlin.AbstractC9924b.m20071b(r10)
            goto L76
        L3b:
            kotlin.AbstractC9924b.m20071b(r10)
            androidx.collection.MutableObjectList<androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState> r10 = r9.initialValueAnimations
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L4d
            androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState r10 = r9.currentAnimation
            if (r10 != 0) goto L4d
            qc.q r10 = p309qc.C10786q.f26013a
            return r10
        L4d:
            kotlin.coroutines.d r10 = r0.getContext()
            float r10 = androidx.compose.animation.core.SuspendAnimationKt.getDurationScale(r10)
            r2 = 0
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 != 0) goto L62
            r9.endAllAnimations()
            r9.lastFrameTimeNanos = r5
            qc.q r10 = p309qc.C10786q.f26013a
            return r10
        L62:
            long r7 = r9.lastFrameTimeNanos
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 != 0) goto L75
            hd.l r10 = r9.firstFrameLambda
            r0.L$0 = r9
            r0.label = r4
            java.lang.Object r10 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r10, r0)
            if (r10 != r1) goto L75
            goto L92
        L75:
            r2 = r9
        L76:
            androidx.collection.MutableObjectList<androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState> r10 = r2.initialValueAnimations
            boolean r10 = r10.isNotEmpty()
            if (r10 != 0) goto L88
            androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState r10 = r2.currentAnimation
            if (r10 == 0) goto L83
            goto L88
        L83:
            r2.lastFrameTimeNanos = r5
            qc.q r10 = p309qc.C10786q.f26013a
            return r10
        L88:
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r10 = r2.animateOneFrame(r0)
            if (r10 != r1) goto L76
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.runAnimations(vc.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object seekTo$default(SeekableTransitionState seekableTransitionState, float f10, Object obj, InterfaceC11588c interfaceC11588c, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = seekableTransitionState.getTargetState();
        }
        return seekableTransitionState.seekTo(f10, obj, interfaceC11588c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void seekToFraction() {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return;
        }
        transition.seekAnimations$animation_core_release(AbstractC9719c.m19283e(getFraction() * transition.getTotalDurationNanos()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFraction(float f10) {
        this.fraction$delegate.setFloatValue(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitForComposition(vc.InterfaceC11588c<? super p309qc.C10786q> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.animation.core.SeekableTransitionState.C11311
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 r0 = (androidx.compose.animation.core.SeekableTransitionState.C11311) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r1 = r0.L$1
            java.lang.Object r0 = r0.L$0
            androidx.compose.animation.core.SeekableTransitionState r0 = (androidx.compose.animation.core.SeekableTransitionState) r0
            kotlin.AbstractC9924b.m20071b(r8)
            goto L8c
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            java.lang.Object r2 = r0.L$1
            java.lang.Object r6 = r0.L$0
            androidx.compose.animation.core.SeekableTransitionState r6 = (androidx.compose.animation.core.SeekableTransitionState) r6
            kotlin.AbstractC9924b.m20071b(r8)
            r8 = r2
            goto L5d
        L46:
            kotlin.AbstractC9924b.m20071b(r8)
            java.lang.Object r8 = r7.getTargetState()
            be.a r2 = r7.compositionContinuationMutex
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r2 = be.InterfaceC5189a.a.m2741a(r2, r4, r0, r5, r4)
            if (r2 != r1) goto L5c
            goto L88
        L5c:
            r6 = r7
        L5d:
            r0.L$0 = r6
            r0.L$1 = r8
            r0.label = r3
            kotlinx.coroutines.c r2 = new kotlinx.coroutines.c
            vc.c r3 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m20224d(r0)
            r2.<init>(r3, r5)
            r2.m20503F()
            r6.setCompositionContinuation$animation_core_release(r2)
            be.a r3 = r6.getCompositionContinuationMutex$animation_core_release()
            be.InterfaceC5189a.a.m2743c(r3, r4, r5, r4)
            java.lang.Object r2 = r2.m20538x()
            java.lang.Object r3 = p393wc.AbstractC11725a.m25952f()
            if (r2 != r3) goto L86
            p409xc.AbstractC11831f.m26221c(r0)
        L86:
            if (r2 != r1) goto L89
        L88:
            return r1
        L89:
            r1 = r8
            r8 = r2
            r0 = r6
        L8c:
            boolean r8 = kotlin.jvm.internal.AbstractC9979u.m20289b(r8, r1)
            if (r8 == 0) goto L95
            qc.q r8 = p309qc.C10786q.f26013a
            return r8
        L95:
            r1 = -9223372036854775808
            r0.lastFrameTimeNanos = r1
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "targetState while waiting for composition"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.waitForComposition(vc.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitForCompositionAfterTargetStateChange(vc.InterfaceC11588c<? super p309qc.C10786q> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.animation.core.SeekableTransitionState.C11321
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 r0 = (androidx.compose.animation.core.SeekableTransitionState.C11321) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r1 = r0.L$1
            java.lang.Object r0 = r0.L$0
            androidx.compose.animation.core.SeekableTransitionState r0 = (androidx.compose.animation.core.SeekableTransitionState) r0
            kotlin.AbstractC9924b.m20071b(r8)
            goto L9a
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            java.lang.Object r2 = r0.L$1
            java.lang.Object r6 = r0.L$0
            androidx.compose.animation.core.SeekableTransitionState r6 = (androidx.compose.animation.core.SeekableTransitionState) r6
            kotlin.AbstractC9924b.m20071b(r8)
            r8 = r2
            goto L5d
        L46:
            kotlin.AbstractC9924b.m20071b(r8)
            java.lang.Object r8 = r7.getTargetState()
            be.a r2 = r7.compositionContinuationMutex
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r2 = be.InterfaceC5189a.a.m2741a(r2, r4, r0, r5, r4)
            if (r2 != r1) goto L5c
            goto L96
        L5c:
            r6 = r7
        L5d:
            S r2 = r6.composedTargetState
            boolean r2 = kotlin.jvm.internal.AbstractC9979u.m20289b(r8, r2)
            if (r2 == 0) goto L6b
            be.a r8 = r6.compositionContinuationMutex
            be.InterfaceC5189a.a.m2743c(r8, r4, r5, r4)
            goto La0
        L6b:
            r0.L$0 = r6
            r0.L$1 = r8
            r0.label = r3
            kotlinx.coroutines.c r2 = new kotlinx.coroutines.c
            vc.c r3 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m20224d(r0)
            r2.<init>(r3, r5)
            r2.m20503F()
            r6.setCompositionContinuation$animation_core_release(r2)
            be.a r3 = r6.getCompositionContinuationMutex$animation_core_release()
            be.InterfaceC5189a.a.m2743c(r3, r4, r5, r4)
            java.lang.Object r2 = r2.m20538x()
            java.lang.Object r3 = p393wc.AbstractC11725a.m25952f()
            if (r2 != r3) goto L94
            p409xc.AbstractC11831f.m26221c(r0)
        L94:
            if (r2 != r1) goto L97
        L96:
            return r1
        L97:
            r1 = r8
            r8 = r2
            r0 = r6
        L9a:
            boolean r2 = kotlin.jvm.internal.AbstractC9979u.m20289b(r8, r1)
            if (r2 == 0) goto La3
        La0:
            qc.q r8 = p309qc.C10786q.f26013a
            return r8
        La3:
            r2 = -9223372036854775808
            r0.lastFrameTimeNanos = r2
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "snapTo() was canceled because state was changed to "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = " instead of "
            r2.append(r8)
            r2.append(r1)
            java.lang.String r8 = r2.toString()
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.waitForCompositionAfterTargetStateChange(vc.c):java.lang.Object");
    }

    public final Object animateTo(S s10, FiniteAnimationSpec<Float> finiteAnimationSpec, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return C10786q.f26013a;
        }
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C11272(transition, this, s10, finiteAnimationSpec, null), interfaceC11588c, 1, null);
        return objMutate$default == AbstractC11725a.m25952f() ? objMutate$default : C10786q.f26013a;
    }

    public final S getComposedTargetState$animation_core_release() {
        return this.composedTargetState;
    }

    public final InterfaceC11125j getCompositionContinuation$animation_core_release() {
        return this.compositionContinuation;
    }

    public final InterfaceC5189a getCompositionContinuationMutex$animation_core_release() {
        return this.compositionContinuationMutex;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getCurrentState() {
        return (S) this.currentState$delegate.getValue();
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN)
    public final float getFraction() {
        return this.fraction$delegate.getFloatValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getTargetState() {
        return (S) this.targetState$delegate.getValue();
    }

    public final long getTotalDurationNanos$animation_core_release() {
        return this.totalDurationNanos;
    }

    public final void observeTotalDuration$animation_core_release() {
        TransitionKt.getSeekableStateObserver().observeReads(this, TransitionKt.SeekableTransitionStateTotalDurationChanged, this.recalculateTotalDurationNanos);
    }

    public final void onTotalDurationChanged$animation_core_release() {
        long j10 = this.totalDurationNanos;
        observeTotalDuration$animation_core_release();
        long j11 = this.totalDurationNanos;
        if (j10 != j11) {
            SeekingAnimationState seekingAnimationState = this.currentAnimation;
            if (seekingAnimationState == null) {
                if (j11 != 0) {
                    seekToFraction();
                    return;
                }
                return;
            }
            long progressNanos = seekingAnimationState.getProgressNanos();
            long j12 = this.totalDurationNanos;
            if (progressNanos > j12) {
                endAllAnimations();
                return;
            }
            seekingAnimationState.setDurationNanos(j12);
            if (seekingAnimationState.getAnimationSpec() == null) {
                seekingAnimationState.setAnimationSpecDuration(AbstractC9719c.m19283e((1.0d - seekingAnimationState.getStart().get$animation_core_release(0)) * this.totalDurationNanos));
            }
        }
    }

    public final Object seekTo(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, S s10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        boolean z10 = false;
        if (0.0f <= f10 && f10 <= 1.0f) {
            z10 = true;
        }
        if (!z10) {
            PreconditionsKt.throwIllegalArgumentException("Expecting fraction between 0 and 1. Got " + f10);
        }
        Transition<S> transition = this.transition;
        if (transition == null) {
            return C10786q.f26013a;
        }
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C11293(s10, getTargetState(), this, transition, f10, null), interfaceC11588c, 1, null);
        return objMutate$default == AbstractC11725a.m25952f() ? objMutate$default : C10786q.f26013a;
    }

    public final void setComposedTargetState$animation_core_release(S s10) {
        this.composedTargetState = s10;
    }

    public final void setCompositionContinuation$animation_core_release(InterfaceC11125j interfaceC11125j) {
        this.compositionContinuation = interfaceC11125j;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void setCurrentState$animation_core_release(S s10) {
        this.currentState$delegate.setValue(s10);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void setTargetState$animation_core_release(S s10) {
        this.targetState$delegate.setValue(s10);
    }

    public final void setTotalDurationNanos$animation_core_release(long j10) {
        this.totalDurationNanos = j10;
    }

    public final Object snapTo(S s10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return C10786q.f26013a;
        }
        if (AbstractC9979u.m20289b(getCurrentState(), s10) && AbstractC9979u.m20289b(getTargetState(), s10)) {
            return C10786q.f26013a;
        }
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C11302(this, s10, transition, null), interfaceC11588c, 1, null);
        return objMutate$default == AbstractC11725a.m25952f() ? objMutate$default : C10786q.f26013a;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionConfigured$animation_core_release(Transition<S> transition) {
        Transition<S> transition2 = this.transition;
        if (!(transition2 == null || AbstractC9979u.m20289b(transition, transition2))) {
            PreconditionsKt.throwIllegalStateException("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.transition + ", new instance: " + transition);
        }
        this.transition = transition;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionRemoved$animation_core_release() {
        this.transition = null;
        TransitionKt.getSeekableStateObserver().clear(this);
    }
}
