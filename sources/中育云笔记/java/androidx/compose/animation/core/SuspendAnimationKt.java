package androidx.compose.animation.core;

import androidx.compose.p014ui.MotionDurationScale;
import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C9974p;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class SuspendAnimationKt {

    @InterfaceC11829d(m26210c = "androidx.compose.animation.core.SuspendAnimationKt", m26211f = "SuspendAnimation.kt", m26212l = {231, 280}, m26213m = "animate")
    /* renamed from: androidx.compose.animation.core.SuspendAnimationKt$animate$4 */
    public static final class C11344<T, V extends AnimationVector> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C11344(InterfaceC11588c<? super C11344> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SuspendAnimationKt.animate(null, null, 0L, null, this);
        }
    }

    public static final Object animate(float f10, float f11, float f12, AnimationSpec<Float> animationSpec, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAnimate = animate(VectorConvertersKt.getVectorConverter(C9974p.f23424a), AbstractC11826a.m26207b(f10), AbstractC11826a.m26207b(f11), AbstractC11826a.m26207b(f12), animationSpec, interfaceC9544p, interfaceC11588c);
        return objAnimate == AbstractC11725a.m25952f() ? objAnimate : C10786q.f26013a;
    }

    public static /* synthetic */ Object animate$default(float f10, float f11, float f12, AnimationSpec animationSpec, InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(f10, f11, f12, animationSpec, interfaceC9544p, interfaceC11588c);
    }

    public static final Object animateDecay(float f10, float f11, FloatDecayAnimationSpec floatDecayAnimationSpec, final InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAnimate$default = animate$default(AnimationStateKt.AnimationState$default(f10, f11, 0L, 0L, false, 28, null), AnimationKt.DecayAnimation(floatDecayAnimationSpec, f10, f11), 0L, new InterfaceC9540l() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animateDecay.2
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AnimationScope<Float, AnimationVector1D>) obj);
                return C10786q.f26013a;
            }

            public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                interfaceC9544p.invoke(animationScope.getValue(), Float.valueOf(((AnimationVector1D) animationScope.getVelocityVector()).getValue()));
            }
        }, interfaceC11588c, 2, null);
        return objAnimate$default == AbstractC11725a.m25952f() ? objAnimate$default : C10786q.f26013a;
    }

    public static /* synthetic */ Object animateDecay$default(AnimationState animationState, DecayAnimationSpec decayAnimationSpec, boolean z10, InterfaceC9540l interfaceC9540l, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animateDecay.4
                public final void invoke(AnimationScope animationScope) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AnimationScope) obj2);
                    return C10786q.f26013a;
                }
            };
        }
        return animateDecay(animationState, decayAnimationSpec, z10, interfaceC9540l, (InterfaceC11588c<? super C10786q>) interfaceC11588c);
    }

    public static final <T, V extends AnimationVector> Object animateTo(AnimationState<T, V> animationState, T t10, AnimationSpec<T> animationSpec, boolean z10, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C10786q> interfaceC11588c) throws Throwable {
        Object objAnimate = animate(animationState, new TargetBasedAnimation(animationSpec, animationState.getTypeConverter(), animationState.getValue(), t10, animationState.getVelocityVector()), z10 ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, interfaceC9540l, interfaceC11588c);
        return objAnimate == AbstractC11725a.m25952f() ? objAnimate : C10786q.f26013a;
    }

    public static /* synthetic */ Object animateTo$default(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z10, InterfaceC9540l interfaceC9540l, InterfaceC11588c interfaceC11588c, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animateTo.2
                public final void invoke(AnimationScope animationScope) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((AnimationScope) obj3);
                    return C10786q.f26013a;
                }
            };
        }
        return animateTo(animationState, obj, animationSpec2, z11, interfaceC9540l, interfaceC11588c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R, T, V extends AnimationVector> Object callWithFrameNanos(Animation<T, V> animation, final InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c) {
        return animation.isInfinite() ? InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(interfaceC9540l, interfaceC11588c) : MonotonicFrameClockKt.withFrameNanos(new InterfaceC9540l() { // from class: androidx.compose.animation.core.SuspendAnimationKt.callWithFrameNanos.2
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [R, java.lang.Object] */
            public final R invoke(long j10) {
                return interfaceC9540l.invoke(Long.valueOf(j10));
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }
        }, interfaceC11588c);
    }

    private static final <T, V extends AnimationVector> void doAnimationFrame(AnimationScope<T, V> animationScope, long j10, long j11, Animation<T, V> animation, AnimationState<T, V> animationState, InterfaceC9540l interfaceC9540l) {
        animationScope.setLastFrameTimeNanos$animation_core_release(j10);
        animationScope.setValue$animation_core_release(animation.getValueFromNanos(j11));
        animationScope.setVelocityVector$animation_core_release(animation.getVelocityVectorFromNanos(j11));
        if (animation.isFinishedFromNanos(j11)) {
            animationScope.setFinishedTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
            animationScope.setRunning$animation_core_release(false);
        }
        updateState(animationScope, animationState);
        interfaceC9540l.invoke(animationScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AnimationVector> void doAnimationFrameWithScale(AnimationScope<T, V> animationScope, long j10, float f10, Animation<T, V> animation, AnimationState<T, V> animationState, InterfaceC9540l interfaceC9540l) {
        doAnimationFrame(animationScope, j10, f10 == 0.0f ? animation.getDurationNanos() : (long) ((j10 - animationScope.getStartTimeNanos()) / f10), animation, animationState, interfaceC9540l);
    }

    public static final float getDurationScale(InterfaceC9945d interfaceC9945d) {
        MotionDurationScale motionDurationScale = (MotionDurationScale) interfaceC9945d.get(MotionDurationScale.Key);
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

    public static final <T, V extends AnimationVector> Object animate(final TwoWayConverter<T, V> twoWayConverter, T t10, T t11, T t12, AnimationSpec<T> animationSpec, final InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        AnimationVector animationVectorNewInstance;
        if (t12 == null || (animationVectorNewInstance = (AnimationVector) twoWayConverter.getConvertToVector().invoke(t12)) == null) {
            animationVectorNewInstance = AnimationVectorsKt.newInstance((AnimationVector) twoWayConverter.getConvertToVector().invoke(t10));
        }
        AnimationVector animationVector = animationVectorNewInstance;
        Object objAnimate$default = animate$default(new AnimationState(twoWayConverter, t10, animationVector, 0L, 0L, false, 56, null), new TargetBasedAnimation(animationSpec, twoWayConverter, t10, t11, animationVector), 0L, new InterfaceC9540l() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animate.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AnimationScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(AnimationScope<T, V> animationScope) {
                interfaceC9544p.invoke(animationScope.getValue(), twoWayConverter.getConvertFromVector().invoke(animationScope.getVelocityVector()));
            }
        }, interfaceC11588c, 2, null);
        return objAnimate$default == AbstractC11725a.m25952f() ? objAnimate$default : C10786q.f26013a;
    }

    public static /* synthetic */ Object animate$default(TwoWayConverter twoWayConverter, Object obj, Object obj2, Object obj3, AnimationSpec animationSpec, InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c, int i10, Object obj4) {
        if ((i10 & 8) != 0) {
            obj3 = null;
        }
        if ((i10 & 16) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(twoWayConverter, obj, obj2, obj3, animationSpec, interfaceC9544p, interfaceC11588c);
    }

    public static final <T, V extends AnimationVector> Object animateDecay(AnimationState<T, V> animationState, DecayAnimationSpec<T> decayAnimationSpec, boolean z10, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C10786q> interfaceC11588c) throws Throwable {
        Object objAnimate = animate(animationState, new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter<T, AnimationVector>) animationState.getTypeConverter(), (Object) animationState.getValue(), animationState.getVelocityVector()), z10 ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, interfaceC9540l, interfaceC11588c);
        return objAnimate == AbstractC11725a.m25952f() ? objAnimate : C10786q.f26013a;
    }

    public static /* synthetic */ Object animate$default(AnimationState animationState, Animation animation, long j10, InterfaceC9540l interfaceC9540l, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MIN_VALUE;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animate.5
                public final void invoke(AnimationScope animationScope) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AnimationScope) obj2);
                    return C10786q.f26013a;
                }
            };
        }
        return animate(animationState, animation, j11, interfaceC9540l, interfaceC11588c);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, V extends androidx.compose.animation.core.AnimationVector> java.lang.Object animate(final androidx.compose.animation.core.AnimationState<T, V> r23, androidx.compose.animation.core.Animation<T, V> r24, long r25, final p181hd.InterfaceC9540l r27, vc.InterfaceC11588c<? super p309qc.C10786q> r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.animate(androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.Animation, long, hd.l, vc.c):java.lang.Object");
    }
}
