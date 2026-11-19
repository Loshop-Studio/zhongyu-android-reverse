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
import com.google.android.material.color.utilities.Contrast;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.AbstractC9165e;
import p077d8.AbstractC8323h;
import p077d8.C8321f;
import p123h7.C8736p;
import p134i7.AbstractC8797p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p135i8.InterfaceC8845j;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p235r8.AbstractC9943b;
import p235r8.InterfaceC9942a;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p322z7.AbstractC10729c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SeekableTransitionState<S> extends TransitionState<S> {
    private final InterfaceC10570l animateOneFrameLambda;
    private S composedTargetState;
    private InterfaceC8845j compositionContinuation;
    private final InterfaceC9942a compositionContinuationMutex;
    private SeekingAnimationState currentAnimation;
    private final MutableState currentState$delegate;
    private float durationScale;
    private final InterfaceC10570l firstFrameLambda;
    private final MutableFloatState fraction$delegate;
    private final MutableObjectList<SeekingAnimationState> initialValueAnimations;
    private long lastFrameTimeNanos;
    private final MutatorMutex mutatorMutex;
    private final InterfaceC10559a recalculateTotalDurationNanos;
    private final MutableState targetState$delegate;
    private long totalDurationNanos;
    private Transition<S> transition;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final AnimationVector1D ZeroVelocity = new AnimationVector1D(0.0f);
    private static final AnimationVector1D Target1 = new AnimationVector1D(1.0f);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
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

    @InterfaceC9539d(m17800c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", m17801f = "Transition.kt", m17802l = {599}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$animateTo$2 */
    public static final class C10972 extends SuspendLambda implements InterfaceC10570l {
        final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        @InterfaceC9539d(m17800c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", m17801f = "Transition.kt", m17802l = {2147, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, 614, 668, TbsListener.ErrorCode.STATIC_TBS_INSTALL_TMP_RENAME_ERR}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
            final /* synthetic */ S $targetState;
            final /* synthetic */ Transition<S> $transition;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SeekableTransitionState<S> seekableTransitionState, S s10, Transition<S> transition, FiniteAnimationSpec<Float> finiteAnimationSpec, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.this$0 = seekableTransitionState;
                this.$targetState = s10;
                this.$transition = transition;
                this.$animationSpec = finiteAnimationSpec;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass1(this.this$0, this.$targetState, this.$transition, this.$animationSpec, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.C10972.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10972(Transition<S> transition, SeekableTransitionState<S> seekableTransitionState, S s10, FiniteAnimationSpec<Float> finiteAnimationSpec, InterfaceC9324c<? super C10972> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.$transition = transition;
            this.this$0 = seekableTransitionState;
            this.$targetState = s10;
            this.$animationSpec = finiteAnimationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return new C10972(this.$transition, this.this$0, this.$targetState, this.$animationSpec, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$targetState, this.$transition, this.$animationSpec, null);
                this.label = 1;
                if (AbstractC9165e.m16556e(anonymousClass1, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            this.$transition.onTransitionEnd$animation_core_release();
            return C8736p.f16368a;
        }

        @Override // p300x7.InterfaceC10570l
        public final Object invoke(InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C10972) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.animation.core.SeekableTransitionState", m17801f = "Transition.kt", m17802l = {353, 356}, m17803m = "runAnimations")
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 */
    public static final class C10981 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10981(SeekableTransitionState<S> seekableTransitionState, InterfaceC9324c<? super C10981> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = seekableTransitionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.runAnimations(this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", m17801f = "Transition.kt", m17802l = {488}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3 */
    public static final class C10993 extends SuspendLambda implements InterfaceC10570l {
        final /* synthetic */ float $fraction;
        final /* synthetic */ S $oldTargetState;
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        @InterfaceC9539d(m17800c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", m17801f = "Transition.kt", m17802l = {510}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ float $fraction;
            final /* synthetic */ S $oldTargetState;
            final /* synthetic */ S $targetState;
            final /* synthetic */ Transition<S> $transition;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SeekableTransitionState<S> this$0;

            @InterfaceC9539d(m17800c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1", m17801f = "Transition.kt", m17802l = {506}, m17803m = "invokeSuspend")
            /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C107511 extends SuspendLambda implements InterfaceC10574p {
                int label;
                final /* synthetic */ SeekableTransitionState<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C107511(SeekableTransitionState<S> seekableTransitionState, InterfaceC9324c<? super C107511> interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.this$0 = seekableTransitionState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                    return new C107511(this.this$0, interfaceC9324c);
                }

                @Override // p300x7.InterfaceC10574p
                public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    return ((C107511) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM17291f = AbstractC9434a.m17291f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9079b.m15926b(obj);
                        SeekableTransitionState<S> seekableTransitionState = this.this$0;
                        this.label = 1;
                        if (seekableTransitionState.runAnimations(this) == objM17291f) {
                            return objM17291f;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9079b.m15926b(obj);
                    }
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(S s10, S s11, SeekableTransitionState<S> seekableTransitionState, Transition<S> transition, float f10, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.$targetState = s10;
                this.$oldTargetState = s11;
                this.this$0 = seekableTransitionState;
                this.$transition = transition;
                this.$fraction = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, interfaceC9324c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
                    if (AbstractC9133u.m16128b(this.$targetState, this.$oldTargetState)) {
                        ((SeekableTransitionState) this.this$0).currentAnimation = null;
                        if (AbstractC9133u.m16128b(this.this$0.getCurrentState(), this.$targetState)) {
                            return C8736p.f16368a;
                        }
                    } else {
                        this.this$0.moveAnimationToInitialState();
                    }
                    if (!AbstractC9133u.m16128b(this.$targetState, this.$oldTargetState)) {
                        this.$transition.updateTarget$animation_core_release(this.$targetState);
                        this.$transition.setPlayTimeNanos(0L);
                        this.this$0.setTargetState$animation_core_release(this.$targetState);
                        this.$transition.resetAnimationFraction$animation_core_release(this.$fraction);
                    }
                    this.this$0.setFraction(this.$fraction);
                    if (((SeekableTransitionState) this.this$0).initialValueAnimations.isNotEmpty()) {
                        AbstractC8839h.m14861d(interfaceC8822b0, null, null, new C107511(this.this$0, null), 3, null);
                    } else {
                        ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = Long.MIN_VALUE;
                    }
                    SeekableTransitionState<S> seekableTransitionState = this.this$0;
                    this.label = 1;
                    if (seekableTransitionState.waitForCompositionAfterTargetStateChange(this) == objM17291f) {
                        return objM17291f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                }
                this.this$0.seekToFraction();
                return C8736p.f16368a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10993(S s10, S s11, SeekableTransitionState<S> seekableTransitionState, Transition<S> transition, float f10, InterfaceC9324c<? super C10993> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.$targetState = s10;
            this.$oldTargetState = s11;
            this.this$0 = seekableTransitionState;
            this.$transition = transition;
            this.$fraction = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return new C10993(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, null);
                this.label = 1;
                if (AbstractC9165e.m16556e(anonymousClass1, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }

        @Override // p300x7.InterfaceC10570l
        public final Object invoke(InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C10993) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", m17801f = "Transition.kt", m17802l = {457}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$snapTo$2 */
    public static final class C11002 extends SuspendLambda implements InterfaceC10570l {
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11002(SeekableTransitionState<S> seekableTransitionState, S s10, Transition<S> transition, InterfaceC9324c<? super C11002> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.this$0 = seekableTransitionState;
            this.$targetState = s10;
            this.$transition = transition;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return new C11002(this.this$0, this.$targetState, this.$transition, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                this.this$0.endAllAnimations();
                ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = Long.MIN_VALUE;
                this.this$0.setFraction(0.0f);
                S s10 = this.$targetState;
                float f10 = AbstractC9133u.m16128b(s10, this.this$0.getCurrentState()) ? -4.0f : AbstractC9133u.m16128b(s10, this.this$0.getTargetState()) ? -5.0f : -3.0f;
                this.$transition.updateTarget$animation_core_release(this.$targetState);
                this.$transition.setPlayTimeNanos(0L);
                this.this$0.setTargetState$animation_core_release(this.$targetState);
                this.this$0.setFraction(0.0f);
                this.this$0.setCurrentState$animation_core_release(this.$targetState);
                this.$transition.resetAnimationFraction$animation_core_release(f10);
                if (f10 == -3.0f) {
                    SeekableTransitionState<S> seekableTransitionState = this.this$0;
                    this.label = 1;
                    if (seekableTransitionState.waitForCompositionAfterTargetStateChange(this) == objM17291f) {
                        return objM17291f;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            this.$transition.onTransitionEnd$animation_core_release();
            return C8736p.f16368a;
        }

        @Override // p300x7.InterfaceC10570l
        public final Object invoke(InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C11002) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.animation.core.SeekableTransitionState", m17801f = "Transition.kt", m17802l = {543, 2142}, m17803m = "waitForComposition")
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 */
    public static final class C11011 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11011(SeekableTransitionState<S> seekableTransitionState, InterfaceC9324c<? super C11011> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = seekableTransitionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.waitForComposition(this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.animation.core.SeekableTransitionState", m17801f = "Transition.kt", m17802l = {519, 2142}, m17803m = "waitForCompositionAfterTargetStateChange")
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 */
    public static final class C11021 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11021(SeekableTransitionState<S> seekableTransitionState, InterfaceC9324c<? super C11021> interfaceC9324c) {
            super(interfaceC9324c);
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
        this.recalculateTotalDurationNanos = new InterfaceC10559a(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$recalculateTotalDurationNanos$1
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m20274invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m20274invoke() {
                SeekableTransitionState<S> seekableTransitionState = this.this$0;
                Transition transition = ((SeekableTransitionState) seekableTransitionState).transition;
                seekableTransitionState.setTotalDurationNanos$animation_core_release(transition != null ? transition.getTotalDurationNanos() : 0L);
            }
        };
        this.fraction$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.compositionContinuationMutex = AbstractC9943b.m18571b(false, 1, null);
        this.mutatorMutex = new MutatorMutex();
        this.lastFrameTimeNanos = Long.MIN_VALUE;
        this.initialValueAnimations = new MutableObjectList<>(0, 1, null);
        this.firstFrameLambda = new InterfaceC10570l(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$firstFrameLambda$1
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return C8736p.f16368a;
            }

            public final void invoke(long j10) {
                ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = j10;
            }
        };
        this.animateOneFrameLambda = new InterfaceC10570l(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$animateOneFrameLambda$1
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return C8736p.f16368a;
            }

            public final void invoke(long j10) {
                long j11 = j10 - ((SeekableTransitionState) this.this$0).lastFrameTimeNanos;
                ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = j10;
                long jM20036e = AbstractC10729c.m20036e(j11 / ((SeekableTransitionState) this.this$0).durationScale);
                if (((SeekableTransitionState) this.this$0).initialValueAnimations.isNotEmpty()) {
                    MutableObjectList mutableObjectList = ((SeekableTransitionState) this.this$0).initialValueAnimations;
                    SeekableTransitionState<S> seekableTransitionState = this.this$0;
                    Object[] objArr = mutableObjectList.content;
                    int i10 = mutableObjectList._size;
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        SeekableTransitionState.SeekingAnimationState seekingAnimationState = (SeekableTransitionState.SeekingAnimationState) objArr[i12];
                        seekableTransitionState.recalculateAnimationValue(seekingAnimationState, jM20036e);
                        seekingAnimationState.setComplete(true);
                    }
                    Transition transition = ((SeekableTransitionState) this.this$0).transition;
                    if (transition != null) {
                        transition.updateInitialValues$animation_core_release();
                    }
                    MutableObjectList mutableObjectList2 = ((SeekableTransitionState) this.this$0).initialValueAnimations;
                    int i13 = mutableObjectList2._size;
                    Object[] objArr2 = mutableObjectList2.content;
                    C8321f c8321fM13525t = AbstractC8323h.m13525t(0, i13);
                    int iM13496b = c8321fM13525t.m13496b();
                    int iM13497c = c8321fM13525t.m13497c();
                    if (iM13496b <= iM13497c) {
                        while (true) {
                            objArr2[iM13496b - i11] = objArr2[iM13496b];
                            if (((SeekableTransitionState.SeekingAnimationState) objArr2[iM13496b]).isComplete()) {
                                i11++;
                            }
                            if (iM13496b == iM13497c) {
                                break;
                            } else {
                                iM13496b++;
                            }
                        }
                    }
                    AbstractC8797p.m14613C(objArr2, null, i13 - i11, i13);
                    mutableObjectList2._size -= i11;
                }
                SeekableTransitionState.SeekingAnimationState seekingAnimationState2 = ((SeekableTransitionState) this.this$0).currentAnimation;
                if (seekingAnimationState2 != null) {
                    seekingAnimationState2.setDurationNanos(this.this$0.getTotalDurationNanos$animation_core_release());
                    this.this$0.recalculateAnimationValue(seekingAnimationState2, jM20036e);
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
    public final Object animateOneFrame(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        float durationScale = SuspendAnimationKt.getDurationScale(interfaceC9324c.getContext());
        if (durationScale <= 0.0f) {
            endAllAnimations();
            return C8736p.f16368a;
        }
        this.durationScale = durationScale;
        Object objWithFrameNanos = MonotonicFrameClockKt.withFrameNanos(this.animateOneFrameLambda, interfaceC9324c);
        return objWithFrameNanos == AbstractC9434a.m17291f() ? objWithFrameNanos : C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(SeekableTransitionState seekableTransitionState, Object obj, FiniteAnimationSpec finiteAnimationSpec, InterfaceC9324c interfaceC9324c, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = seekableTransitionState.getTargetState();
        }
        if ((i10 & 2) != 0) {
            finiteAnimationSpec = null;
        }
        return seekableTransitionState.animateTo(obj, finiteAnimationSpec, interfaceC9324c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object doOneFrame(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        if (this.lastFrameTimeNanos == Long.MIN_VALUE) {
            Object objWithFrameNanos = MonotonicFrameClockKt.withFrameNanos(this.firstFrameLambda, interfaceC9324c);
            return objWithFrameNanos == AbstractC9434a.m17291f() ? objWithFrameNanos : C8736p.f16368a;
        }
        Object objAnimateOneFrame = animateOneFrame(interfaceC9324c);
        return objAnimateOneFrame == AbstractC9434a.m17291f() ? objAnimateOneFrame : C8736p.f16368a;
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
            if (this.totalDurationNanos <= 0 || getFraction() == 1.0f || AbstractC9133u.m16128b(getCurrentState(), getTargetState())) {
                seekingAnimationState = null;
            } else {
                seekingAnimationState = new SeekingAnimationState();
                seekingAnimationState.setValue(getFraction());
                long j10 = this.totalDurationNanos;
                seekingAnimationState.setDurationNanos(j10);
                seekingAnimationState.setAnimationSpecDuration(AbstractC10729c.m20036e(j10 * (1.0d - getFraction())));
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
            seekingAnimationState.setValue(AbstractC8323h.m13517l(((AnimationVector1D) animationSpec.getValueFromNanos(progressNanos, start, animationVector1D, initialVelocity)).get$animation_core_release(0), 0.0f, 1.0f));
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
    public final java.lang.Object runAnimations(p179m7.InterfaceC9324c<? super p123h7.C8736p> r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.compose.animation.core.SeekableTransitionState.C10981
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 r0 = (androidx.compose.animation.core.SeekableTransitionState.C10981) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
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
            kotlin.AbstractC9079b.m15926b(r10)
            goto L76
        L3b:
            kotlin.AbstractC9079b.m15926b(r10)
            androidx.collection.MutableObjectList<androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState> r10 = r9.initialValueAnimations
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L4d
            androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState r10 = r9.currentAnimation
            if (r10 != 0) goto L4d
            h7.p r10 = p123h7.C8736p.f16368a
            return r10
        L4d:
            kotlin.coroutines.d r10 = r0.getContext()
            float r10 = androidx.compose.animation.core.SuspendAnimationKt.getDurationScale(r10)
            r2 = 0
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 != 0) goto L62
            r9.endAllAnimations()
            r9.lastFrameTimeNanos = r5
            h7.p r10 = p123h7.C8736p.f16368a
            return r10
        L62:
            long r7 = r9.lastFrameTimeNanos
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 != 0) goto L75
            x7.l r10 = r9.firstFrameLambda
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
            h7.p r10 = p123h7.C8736p.f16368a
            return r10
        L88:
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r10 = r2.animateOneFrame(r0)
            if (r10 != r1) goto L76
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.runAnimations(m7.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object seekTo$default(SeekableTransitionState seekableTransitionState, float f10, Object obj, InterfaceC9324c interfaceC9324c, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = seekableTransitionState.getTargetState();
        }
        return seekableTransitionState.seekTo(f10, obj, interfaceC9324c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void seekToFraction() {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return;
        }
        transition.seekAnimations$animation_core_release(AbstractC10729c.m20036e(getFraction() * transition.getTotalDurationNanos()));
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
    public final java.lang.Object waitForComposition(p179m7.InterfaceC9324c<? super p123h7.C8736p> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.animation.core.SeekableTransitionState.C11011
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 r0 = (androidx.compose.animation.core.SeekableTransitionState.C11011) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
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
            kotlin.AbstractC9079b.m15926b(r8)
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
            kotlin.AbstractC9079b.m15926b(r8)
            r8 = r2
            goto L5d
        L46:
            kotlin.AbstractC9079b.m15926b(r8)
            java.lang.Object r8 = r7.getTargetState()
            r8.a r2 = r7.compositionContinuationMutex
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r2 = p235r8.InterfaceC9942a.a.m18567a(r2, r4, r0, r5, r4)
            if (r2 != r1) goto L5c
            goto L88
        L5c:
            r6 = r7
        L5d:
            r0.L$0 = r6
            r0.L$1 = r8
            r0.label = r3
            kotlinx.coroutines.c r2 = new kotlinx.coroutines.c
            m7.c r3 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m16079d(r0)
            r2.<init>(r3, r5)
            r2.m16343D()
            r6.setCompositionContinuation$animation_core_release(r2)
            r8.a r3 = r6.getCompositionContinuationMutex$animation_core_release()
            p235r8.InterfaceC9942a.a.m18569c(r3, r4, r5, r4)
            java.lang.Object r2 = r2.m16372x()
            java.lang.Object r3 = p190n7.AbstractC9434a.m17291f()
            if (r2 != r3) goto L86
            p201o7.AbstractC9541f.m17811c(r0)
        L86:
            if (r2 != r1) goto L89
        L88:
            return r1
        L89:
            r1 = r8
            r8 = r2
            r0 = r6
        L8c:
            boolean r8 = kotlin.jvm.internal.AbstractC9133u.m16128b(r8, r1)
            if (r8 == 0) goto L95
            h7.p r8 = p123h7.C8736p.f16368a
            return r8
        L95:
            r1 = -9223372036854775808
            r0.lastFrameTimeNanos = r1
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "targetState while waiting for composition"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.waitForComposition(m7.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitForCompositionAfterTargetStateChange(p179m7.InterfaceC9324c<? super p123h7.C8736p> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.animation.core.SeekableTransitionState.C11021
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 r0 = (androidx.compose.animation.core.SeekableTransitionState.C11021) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
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
            kotlin.AbstractC9079b.m15926b(r8)
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
            kotlin.AbstractC9079b.m15926b(r8)
            r8 = r2
            goto L5d
        L46:
            kotlin.AbstractC9079b.m15926b(r8)
            java.lang.Object r8 = r7.getTargetState()
            r8.a r2 = r7.compositionContinuationMutex
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r2 = p235r8.InterfaceC9942a.a.m18567a(r2, r4, r0, r5, r4)
            if (r2 != r1) goto L5c
            goto L96
        L5c:
            r6 = r7
        L5d:
            S r2 = r6.composedTargetState
            boolean r2 = kotlin.jvm.internal.AbstractC9133u.m16128b(r8, r2)
            if (r2 == 0) goto L6b
            r8.a r8 = r6.compositionContinuationMutex
            p235r8.InterfaceC9942a.a.m18569c(r8, r4, r5, r4)
            goto La0
        L6b:
            r0.L$0 = r6
            r0.L$1 = r8
            r0.label = r3
            kotlinx.coroutines.c r2 = new kotlinx.coroutines.c
            m7.c r3 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m16079d(r0)
            r2.<init>(r3, r5)
            r2.m16343D()
            r6.setCompositionContinuation$animation_core_release(r2)
            r8.a r3 = r6.getCompositionContinuationMutex$animation_core_release()
            p235r8.InterfaceC9942a.a.m18569c(r3, r4, r5, r4)
            java.lang.Object r2 = r2.m16372x()
            java.lang.Object r3 = p190n7.AbstractC9434a.m17291f()
            if (r2 != r3) goto L94
            p201o7.AbstractC9541f.m17811c(r0)
        L94:
            if (r2 != r1) goto L97
        L96:
            return r1
        L97:
            r1 = r8
            r8 = r2
            r0 = r6
        L9a:
            boolean r2 = kotlin.jvm.internal.AbstractC9133u.m16128b(r8, r1)
            if (r2 == 0) goto La3
        La0:
            h7.p r8 = p123h7.C8736p.f16368a
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.waitForCompositionAfterTargetStateChange(m7.c):java.lang.Object");
    }

    public final Object animateTo(S s10, FiniteAnimationSpec<Float> finiteAnimationSpec, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return C8736p.f16368a;
        }
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C10972(transition, this, s10, finiteAnimationSpec, null), interfaceC9324c, 1, null);
        return objMutate$default == AbstractC9434a.m17291f() ? objMutate$default : C8736p.f16368a;
    }

    public final S getComposedTargetState$animation_core_release() {
        return this.composedTargetState;
    }

    public final InterfaceC8845j getCompositionContinuation$animation_core_release() {
        return this.compositionContinuation;
    }

    public final InterfaceC9942a getCompositionContinuationMutex$animation_core_release() {
        return this.compositionContinuationMutex;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getCurrentState() {
        return (S) this.currentState$delegate.getValue();
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN)
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
                seekingAnimationState.setAnimationSpecDuration(AbstractC10729c.m20036e((1.0d - seekingAnimationState.getStart().get$animation_core_release(0)) * this.totalDurationNanos));
            }
        }
    }

    public final Object seekTo(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, S s10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        boolean z10 = false;
        if (0.0f <= f10 && f10 <= 1.0f) {
            z10 = true;
        }
        if (!z10) {
            PreconditionsKt.throwIllegalArgumentException("Expecting fraction between 0 and 1. Got " + f10);
        }
        Transition<S> transition = this.transition;
        if (transition == null) {
            return C8736p.f16368a;
        }
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C10993(s10, getTargetState(), this, transition, f10, null), interfaceC9324c, 1, null);
        return objMutate$default == AbstractC9434a.m17291f() ? objMutate$default : C8736p.f16368a;
    }

    public final void setComposedTargetState$animation_core_release(S s10) {
        this.composedTargetState = s10;
    }

    public final void setCompositionContinuation$animation_core_release(InterfaceC8845j interfaceC8845j) {
        this.compositionContinuation = interfaceC8845j;
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

    public final Object snapTo(S s10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return C8736p.f16368a;
        }
        if (AbstractC9133u.m16128b(getCurrentState(), s10) && AbstractC9133u.m16128b(getTargetState(), s10)) {
            return C8736p.f16368a;
        }
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C11002(this, s10, transition, null), interfaceC9324c, 1, null);
        return objMutate$default == AbstractC9434a.m17291f() ? objMutate$default : C8736p.f16368a;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionConfigured$animation_core_release(Transition<S> transition) {
        Transition<S> transition2 = this.transition;
        if (!(transition2 == null || AbstractC9133u.m16128b(transition, transition2))) {
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
