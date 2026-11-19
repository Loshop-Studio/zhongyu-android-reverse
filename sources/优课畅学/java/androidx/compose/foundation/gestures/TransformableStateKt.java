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
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes.dex */
public final class TransformableStateKt {
    private static final AnimationData ZeroAnimationVelocity = new AnimationData(0.0f, Offset.Companion.m24051getZeroF1C5BW0(), 0.0f, null);

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2", m17801f = "TransformableState.kt", m17802l = {162}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2 */
    public static final class C13362 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ float $degrees;
        final /* synthetic */ Ref$FloatRef $previous;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13362(Ref$FloatRef ref$FloatRef, float f10, AnimationSpec<Float> animationSpec, InterfaceC9324c<? super C13362> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$previous = ref$FloatRef;
            this.$degrees = f10;
            this.$animationSpec = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C13362 c13362 = new C13362(this.$previous, this.$degrees, this.$animationSpec, interfaceC9324c);
            c13362.L$0 = obj;
            return c13362;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(TransformScope transformScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C13362) create(transformScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                final TransformScope transformScope = (TransformScope) this.L$0;
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(this.$previous.f17470a, 0.0f, 0L, 0L, false, 30, null);
                Float fM17797b = AbstractC9536a.m17797b(this.$degrees);
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                final Ref$FloatRef ref$FloatRef = this.$previous;
                InterfaceC10570l interfaceC10570l = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.TransformableStateKt.animateRotateBy.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((AnimationScope<Float, AnimationVector1D>) obj2);
                        return C8736p.f16368a;
                    }

                    public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        TransformScope.m20657transformByd4ec7I$default(transformScope, 0.0f, 0L, animationScope.getValue().floatValue() - ref$FloatRef.f17470a, 3, null);
                        ref$FloatRef.f17470a = animationScope.getValue().floatValue();
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, fM17797b, animationSpec, false, interfaceC10570l, this, 4, null) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3", m17801f = "TransformableState.kt", m17802l = {142}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3 */
    public static final class C13373 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ Ref$FloatRef $previous;
        final /* synthetic */ float $zoomFactor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13373(Ref$FloatRef ref$FloatRef, float f10, AnimationSpec<Float> animationSpec, InterfaceC9324c<? super C13373> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$previous = ref$FloatRef;
            this.$zoomFactor = f10;
            this.$animationSpec = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C13373 c13373 = new C13373(this.$previous, this.$zoomFactor, this.$animationSpec, interfaceC9324c);
            c13373.L$0 = obj;
            return c13373;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(TransformScope transformScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C13373) create(transformScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                final TransformScope transformScope = (TransformScope) this.L$0;
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(this.$previous.f17470a, 0.0f, 0L, 0L, false, 30, null);
                Float fM17797b = AbstractC9536a.m17797b(this.$zoomFactor);
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                final Ref$FloatRef ref$FloatRef = this.$previous;
                InterfaceC10570l interfaceC10570l = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.TransformableStateKt.animateZoomBy.3.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((AnimationScope<Float, AnimationVector1D>) obj2);
                        return C8736p.f16368a;
                    }

                    public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        TransformScope.m20657transformByd4ec7I$default(transformScope, ref$FloatRef.f17470a == 0.0f ? 1.0f : animationScope.getValue().floatValue() / ref$FloatRef.f17470a, 0L, 0.0f, 6, null);
                        ref$FloatRef.f17470a = animationScope.getValue().floatValue();
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, fM17797b, animationSpec, false, interfaceC10570l, this, 4, null) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2", m17801f = "TransformableState.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2 */
    public static final class C13382 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ float $degrees;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13382(float f10, InterfaceC9324c<? super C13382> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$degrees = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C13382 c13382 = new C13382(this.$degrees, interfaceC9324c);
            c13382.L$0 = obj;
            return c13382;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(TransformScope transformScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C13382) create(transformScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            ((TransformScope) this.L$0).mo20534transformByd4ec7I(1.0f, Offset.Companion.m24051getZeroF1C5BW0(), this.$degrees);
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2", m17801f = "TransformableState.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2 */
    public static final class C13392 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C13392(InterfaceC9324c<? super C13392> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C13392(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(TransformScope transformScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C13392) create(transformScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TransformableStateKt$zoomBy$2", m17801f = "TransformableState.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$zoomBy$2 */
    public static final class C13402 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ float $zoomFactor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13402(float f10, InterfaceC9324c<? super C13402> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$zoomFactor = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C13402 c13402 = new C13402(this.$zoomFactor, interfaceC9324c);
            c13402.L$0 = obj;
            return c13402;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(TransformScope transformScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C13402) create(transformScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            ((TransformScope) this.L$0).mo20534transformByd4ec7I(this.$zoomFactor, Offset.Companion.m24051getZeroF1C5BW0(), 0.0f);
            return C8736p.f16368a;
        }
    }

    public static final TransformableState TransformableState(InterfaceC10575q interfaceC10575q) {
        return new DefaultTransformableState(interfaceC10575q);
    }

    /* renamed from: animateBy-Su4bsnU, reason: not valid java name */
    public static final Object m20661animateBySu4bsnU(TransformableState transformableState, float f10, long j10, float f11, AnimationSpec<Float> animationSpec, AnimationSpec<Offset> animationSpec2, AnimationSpec<Float> animationSpec3, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        if (!(f10 > 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("zoom value should be greater than 0");
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f17473a = new AnimationData(1.0f, Offset.Companion.m24051getZeroF1C5BW0(), 0.0f, null);
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$animateBy$3(ref$ObjectRef, new AnimationData(f10, j10, f11, null), new DelegatingAnimationSpec(animationSpec, animationSpec2, animationSpec3), null), interfaceC9324c, 1, null);
        return objTransform$default == AbstractC9434a.m17291f() ? objTransform$default : C8736p.f16368a;
    }

    /* renamed from: animatePanBy-ubNVwUQ, reason: not valid java name */
    public static final Object m20663animatePanByubNVwUQ(TransformableState transformableState, long j10, AnimationSpec<Offset> animationSpec, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.f17472a = Offset.Companion.m24051getZeroF1C5BW0();
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$animatePanBy$2(ref$LongRef, j10, animationSpec, null), interfaceC9324c, 1, null);
        return objTransform$default == AbstractC9434a.m17291f() ? objTransform$default : C8736p.f16368a;
    }

    /* renamed from: animatePanBy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ Object m20664animatePanByubNVwUQ$default(TransformableState transformableState, long j10, AnimationSpec animationSpec, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return m20663animatePanByubNVwUQ(transformableState, j10, animationSpec, interfaceC9324c);
    }

    public static final Object animateRotateBy(TransformableState transformableState, float f10, AnimationSpec<Float> animationSpec, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new C13362(new Ref$FloatRef(), f10, animationSpec, null), interfaceC9324c, 1, null);
        return objTransform$default == AbstractC9434a.m17291f() ? objTransform$default : C8736p.f16368a;
    }

    public static /* synthetic */ Object animateRotateBy$default(TransformableState transformableState, float f10, AnimationSpec animationSpec, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateRotateBy(transformableState, f10, animationSpec, interfaceC9324c);
    }

    public static final Object animateZoomBy(TransformableState transformableState, float f10, AnimationSpec<Float> animationSpec, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        if (!(f10 > 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("zoom value should be greater than 0");
        }
        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        ref$FloatRef.f17470a = 1.0f;
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new C13373(ref$FloatRef, f10, animationSpec, null), interfaceC9324c, 1, null);
        return objTransform$default == AbstractC9434a.m17291f() ? objTransform$default : C8736p.f16368a;
    }

    public static /* synthetic */ Object animateZoomBy$default(TransformableState transformableState, float f10, AnimationSpec animationSpec, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateZoomBy(transformableState, f10, animationSpec, interfaceC9324c);
    }

    /* renamed from: panBy-d-4ec7I, reason: not valid java name */
    public static final Object m20665panByd4ec7I(TransformableState transformableState, long j10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$panBy$2(j10, null), interfaceC9324c, 1, null);
        return objTransform$default == AbstractC9434a.m17291f() ? objTransform$default : C8736p.f16368a;
    }

    @Composable
    public static final TransformableState rememberTransformableState(InterfaceC10575q interfaceC10575q, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1681419281, i10, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:122)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(interfaceC10575q, composer, i10 & 14);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = TransformableState(new InterfaceC10575q() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$rememberTransformableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // p300x7.InterfaceC10575q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    m20666invoked4ec7I(((Number) obj).floatValue(), ((Offset) obj2).m24045unboximpl(), ((Number) obj3).floatValue());
                    return C8736p.f16368a;
                }

                /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                public final void m20666invoked4ec7I(float f10, long j10, float f11) {
                    stateRememberUpdatedState.getValue().invoke(Float.valueOf(f10), Offset.m24024boximpl(j10), Float.valueOf(f11));
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

    public static final Object rotateBy(TransformableState transformableState, float f10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new C13382(f10, null), interfaceC9324c, 1, null);
        return objTransform$default == AbstractC9434a.m17291f() ? objTransform$default : C8736p.f16368a;
    }

    public static final Object stopTransformation(TransformableState transformableState, MutatePriority mutatePriority, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objTransform = transformableState.transform(mutatePriority, new C13392(null), interfaceC9324c);
        return objTransform == AbstractC9434a.m17291f() ? objTransform : C8736p.f16368a;
    }

    public static /* synthetic */ Object stopTransformation$default(TransformableState transformableState, MutatePriority mutatePriority, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopTransformation(transformableState, mutatePriority, interfaceC9324c);
    }

    public static final Object zoomBy(TransformableState transformableState, float f10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new C13402(f10, null), interfaceC9324c, 1, null);
        return objTransform$default == AbstractC9434a.m17291f() ? objTransform$default : C8736p.f16368a;
    }
}
