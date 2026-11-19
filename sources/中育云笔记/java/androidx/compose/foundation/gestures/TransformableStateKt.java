package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class TransformableStateKt {
    private static final AnimationData ZeroAnimationVelocity = new AnimationData(0.0f, Offset.Companion.m30653getZeroF1C5BW0(), 0.0f, null);

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2", m26211f = "TransformableState.kt", m26212l = {Opcodes.IF_ICMPGE}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2 */
    public static final class C13662 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ float $degrees;
        final /* synthetic */ Ref$FloatRef $previous;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13662(Ref$FloatRef ref$FloatRef, float f10, AnimationSpec<Float> animationSpec, InterfaceC11588c<? super C13662> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$previous = ref$FloatRef;
            this.$degrees = f10;
            this.$animationSpec = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13662 c13662 = new C13662(this.$previous, this.$degrees, this.$animationSpec, interfaceC11588c);
            c13662.L$0 = obj;
            return c13662;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(TransformScope transformScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13662) create(transformScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final TransformScope transformScope = (TransformScope) this.L$0;
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(this.$previous.f23399c, 0.0f, 0L, 0L, false, 30, null);
                Float fM26207b = AbstractC11826a.m26207b(this.$degrees);
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                final Ref$FloatRef ref$FloatRef = this.$previous;
                InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.TransformableStateKt.animateRotateBy.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((AnimationScope<Float, AnimationVector1D>) obj2);
                        return C10786q.f26013a;
                    }

                    public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        TransformScope.m27259transformByd4ec7I$default(transformScope, 0.0f, 0L, animationScope.getValue().floatValue() - ref$FloatRef.f23399c, 3, null);
                        ref$FloatRef.f23399c = animationScope.getValue().floatValue();
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, fM26207b, animationSpec, false, interfaceC9540l, this, 4, null) == objM25952f) {
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
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3", m26211f = "TransformableState.kt", m26212l = {142}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3 */
    public static final class C13673 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ Ref$FloatRef $previous;
        final /* synthetic */ float $zoomFactor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13673(Ref$FloatRef ref$FloatRef, float f10, AnimationSpec<Float> animationSpec, InterfaceC11588c<? super C13673> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$previous = ref$FloatRef;
            this.$zoomFactor = f10;
            this.$animationSpec = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13673 c13673 = new C13673(this.$previous, this.$zoomFactor, this.$animationSpec, interfaceC11588c);
            c13673.L$0 = obj;
            return c13673;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(TransformScope transformScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13673) create(transformScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final TransformScope transformScope = (TransformScope) this.L$0;
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(this.$previous.f23399c, 0.0f, 0L, 0L, false, 30, null);
                Float fM26207b = AbstractC11826a.m26207b(this.$zoomFactor);
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                final Ref$FloatRef ref$FloatRef = this.$previous;
                InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.TransformableStateKt.animateZoomBy.3.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((AnimationScope<Float, AnimationVector1D>) obj2);
                        return C10786q.f26013a;
                    }

                    public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        TransformScope.m27259transformByd4ec7I$default(transformScope, ref$FloatRef.f23399c == 0.0f ? 1.0f : animationScope.getValue().floatValue() / ref$FloatRef.f23399c, 0L, 0.0f, 6, null);
                        ref$FloatRef.f23399c = animationScope.getValue().floatValue();
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, fM26207b, animationSpec, false, interfaceC9540l, this, 4, null) == objM25952f) {
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
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2", m26211f = "TransformableState.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2 */
    public static final class C13682 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ float $degrees;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13682(float f10, InterfaceC11588c<? super C13682> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$degrees = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13682 c13682 = new C13682(this.$degrees, interfaceC11588c);
            c13682.L$0 = obj;
            return c13682;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(TransformScope transformScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13682) create(transformScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            ((TransformScope) this.L$0).mo27136transformByd4ec7I(1.0f, Offset.Companion.m30653getZeroF1C5BW0(), this.$degrees);
            return C10786q.f26013a;
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2", m26211f = "TransformableState.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2 */
    public static final class C13692 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C13692(InterfaceC11588c<? super C13692> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C13692(interfaceC11588c);
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(TransformScope transformScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13692) create(transformScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return C10786q.f26013a;
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TransformableStateKt$zoomBy$2", m26211f = "TransformableState.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$zoomBy$2 */
    public static final class C13702 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ float $zoomFactor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13702(float f10, InterfaceC11588c<? super C13702> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$zoomFactor = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13702 c13702 = new C13702(this.$zoomFactor, interfaceC11588c);
            c13702.L$0 = obj;
            return c13702;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(TransformScope transformScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13702) create(transformScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            ((TransformScope) this.L$0).mo27136transformByd4ec7I(this.$zoomFactor, Offset.Companion.m30653getZeroF1C5BW0(), 0.0f);
            return C10786q.f26013a;
        }
    }

    public static final TransformableState TransformableState(InterfaceC9545q interfaceC9545q) {
        return new DefaultTransformableState(interfaceC9545q);
    }

    /* renamed from: animateBy-Su4bsnU, reason: not valid java name */
    public static final Object m27263animateBySu4bsnU(TransformableState transformableState, float f10, long j10, float f11, AnimationSpec<Float> animationSpec, AnimationSpec<Offset> animationSpec2, AnimationSpec<Float> animationSpec3, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        if (!(f10 > 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("zoom value should be greater than 0");
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f23402c = new AnimationData(1.0f, Offset.Companion.m30653getZeroF1C5BW0(), 0.0f, null);
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$animateBy$3(ref$ObjectRef, new AnimationData(f10, j10, f11, null), new DelegatingAnimationSpec(animationSpec, animationSpec2, animationSpec3), null), interfaceC11588c, 1, null);
        return objTransform$default == AbstractC11725a.m25952f() ? objTransform$default : C10786q.f26013a;
    }

    /* renamed from: animatePanBy-ubNVwUQ, reason: not valid java name */
    public static final Object m27265animatePanByubNVwUQ(TransformableState transformableState, long j10, AnimationSpec<Offset> animationSpec, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.f23401c = Offset.Companion.m30653getZeroF1C5BW0();
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$animatePanBy$2(ref$LongRef, j10, animationSpec, null), interfaceC11588c, 1, null);
        return objTransform$default == AbstractC11725a.m25952f() ? objTransform$default : C10786q.f26013a;
    }

    /* renamed from: animatePanBy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ Object m27266animatePanByubNVwUQ$default(TransformableState transformableState, long j10, AnimationSpec animationSpec, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return m27265animatePanByubNVwUQ(transformableState, j10, animationSpec, interfaceC11588c);
    }

    public static final Object animateRotateBy(TransformableState transformableState, float f10, AnimationSpec<Float> animationSpec, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new C13662(new Ref$FloatRef(), f10, animationSpec, null), interfaceC11588c, 1, null);
        return objTransform$default == AbstractC11725a.m25952f() ? objTransform$default : C10786q.f26013a;
    }

    public static /* synthetic */ Object animateRotateBy$default(TransformableState transformableState, float f10, AnimationSpec animationSpec, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateRotateBy(transformableState, f10, animationSpec, interfaceC11588c);
    }

    public static final Object animateZoomBy(TransformableState transformableState, float f10, AnimationSpec<Float> animationSpec, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        if (!(f10 > 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("zoom value should be greater than 0");
        }
        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        ref$FloatRef.f23399c = 1.0f;
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new C13673(ref$FloatRef, f10, animationSpec, null), interfaceC11588c, 1, null);
        return objTransform$default == AbstractC11725a.m25952f() ? objTransform$default : C10786q.f26013a;
    }

    public static /* synthetic */ Object animateZoomBy$default(TransformableState transformableState, float f10, AnimationSpec animationSpec, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateZoomBy(transformableState, f10, animationSpec, interfaceC11588c);
    }

    /* renamed from: panBy-d-4ec7I, reason: not valid java name */
    public static final Object m27267panByd4ec7I(TransformableState transformableState, long j10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$panBy$2(j10, null), interfaceC11588c, 1, null);
        return objTransform$default == AbstractC11725a.m25952f() ? objTransform$default : C10786q.f26013a;
    }

    @Composable
    public static final TransformableState rememberTransformableState(InterfaceC9545q interfaceC9545q, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1681419281, i10, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:122)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(interfaceC9545q, composer, i10 & 14);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = TransformableState(new InterfaceC9545q() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$rememberTransformableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // p181hd.InterfaceC9545q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    m27268invoked4ec7I(((Number) obj).floatValue(), ((Offset) obj2).m30647unboximpl(), ((Number) obj3).floatValue());
                    return C10786q.f26013a;
                }

                /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                public final void m27268invoked4ec7I(float f10, long j10, float f11) {
                    stateRememberUpdatedState.getValue().invoke(Float.valueOf(f10), Offset.m30626boximpl(j10), Float.valueOf(f11));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        TransformableState transformableState = (TransformableState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transformableState;
    }

    public static final Object rotateBy(TransformableState transformableState, float f10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new C13682(f10, null), interfaceC11588c, 1, null);
        return objTransform$default == AbstractC11725a.m25952f() ? objTransform$default : C10786q.f26013a;
    }

    public static final Object stopTransformation(TransformableState transformableState, MutatePriority mutatePriority, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objTransform = transformableState.transform(mutatePriority, new C13692(null), interfaceC11588c);
        return objTransform == AbstractC11725a.m25952f() ? objTransform : C10786q.f26013a;
    }

    public static /* synthetic */ Object stopTransformation$default(TransformableState transformableState, MutatePriority mutatePriority, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopTransformation(transformableState, mutatePriority, interfaceC11588c);
    }

    public static final Object zoomBy(TransformableState transformableState, float f10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new C13702(f10, null), interfaceC11588c, 1, null);
        return objTransform$default == AbstractC11725a.m25952f() ? objTransform$default : C10786q.f26013a;
    }
}
