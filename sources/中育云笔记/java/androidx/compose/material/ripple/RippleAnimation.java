package androidx.compose.material.ripple;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.material3.MenuKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.OffsetKt;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.ClipOp;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.drawscope.DrawContext;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.util.MathHelpersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.taobao.sophix.PatchStatus;
import com.tendcloud.tenddata.C7843ab;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.AbstractC11165u;
import sd.InterfaceC11122i0;
import sd.InterfaceC11159s;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class RippleAnimation {
    public static final int $stable = 8;
    private final Animatable<Float, AnimationVector1D> animatedAlpha;
    private final Animatable<Float, AnimationVector1D> animatedCenterPercent;
    private final Animatable<Float, AnimationVector1D> animatedRadiusPercent;
    private final boolean bounded;
    private final MutableState finishRequested$delegate;
    private final InterfaceC11159s finishSignalDeferred;
    private final MutableState finishedFadingIn$delegate;
    private Offset origin;
    private final float radius;
    private Float startRadius;
    private Offset targetCenter;

    @InterfaceC11829d(m26210c = "androidx.compose.material.ripple.RippleAnimation", m26211f = "RippleAnimation.kt", m26212l = {77, 79, 80}, m26213m = "animate")
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$animate$1 */
    public static final class C20251 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C20251(InterfaceC11588c<? super C20251> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RippleAnimation.this.animate(this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", m26211f = "RippleAnimation.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2 */
    public static final class C20262 extends SuspendLambda implements InterfaceC9544p {
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", m26211f = "RippleAnimation.kt", m26212l = {PatchStatus.CODE_LOAD_ILLEGAL_ACCESS}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            int label;
            final /* synthetic */ RippleAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RippleAnimation rippleAnimation, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.this$0 = rippleAnimation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass1(this.this$0, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    Animatable animatable = this.this$0.animatedAlpha;
                    Float fM26207b = AbstractC11826a.m26207b(1.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(75, 0, EasingKt.getLinearEasing(), 2, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, fM26207b, tweenSpecTween$default, null, null, this, 12, null) == objM25952f) {
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
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        @InterfaceC11829d(m26210c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", m26211f = "RippleAnimation.kt", m26212l = {C7843ab.b.API_MYNA_STOP}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {
            int label;
            final /* synthetic */ RippleAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(RippleAnimation rippleAnimation, InterfaceC11588c<? super AnonymousClass2> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.this$0 = rippleAnimation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass2(this.this$0, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    Animatable animatable = this.this$0.animatedRadiusPercent;
                    Float fM26207b = AbstractC11826a.m26207b(1.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(225, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, fM26207b, tweenSpecTween$default, null, null, this, 12, null) == objM25952f) {
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
                return ((AnonymousClass2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        @InterfaceC11829d(m26210c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", m26211f = "RippleAnimation.kt", m26212l = {98}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC9544p {
            int label;
            final /* synthetic */ RippleAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(RippleAnimation rippleAnimation, InterfaceC11588c<? super AnonymousClass3> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.this$0 = rippleAnimation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass3(this.this$0, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    Animatable animatable = this.this$0.animatedCenterPercent;
                    Float fM26207b = AbstractC11826a.m26207b(1.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(225, 0, EasingKt.getLinearEasing(), 2, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, fM26207b, tweenSpecTween$default, null, null, this, 12, null) == objM25952f) {
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
                return ((AnonymousClass3) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C20262(InterfaceC11588c<? super C20262> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C20262 c20262 = RippleAnimation.this.new C20262(interfaceC11588c);
            c20262.L$0 = obj;
            return c20262;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
            AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass1(RippleAnimation.this, null), 3, null);
            AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass2(RippleAnimation.this, null), 3, null);
            return AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass3(RippleAnimation.this, null), 3, null);
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super InterfaceC10045g> interfaceC11588c) {
            return ((C20262) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", m26211f = "RippleAnimation.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeOut$2 */
    public static final class C20272 extends SuspendLambda implements InterfaceC9544p {
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", m26211f = "RippleAnimation.kt", m26212l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            int label;
            final /* synthetic */ RippleAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RippleAnimation rippleAnimation, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.this$0 = rippleAnimation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass1(this.this$0, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    Animatable animatable = this.this$0.animatedAlpha;
                    Float fM26207b = AbstractC11826a.m26207b(0.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, EasingKt.getLinearEasing(), 2, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, fM26207b, tweenSpecTween$default, null, null, this, 12, null) == objM25952f) {
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
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C20272(InterfaceC11588c<? super C20272> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C20272 c20272 = RippleAnimation.this.new C20272(interfaceC11588c);
            c20272.L$0 = obj;
            return c20272;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return AbstractC11117h.m24726d((InterfaceC11122i0) this.L$0, null, null, new AnonymousClass1(RippleAnimation.this, null), 3, null);
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super InterfaceC10045g> interfaceC11588c) {
            return ((C20272) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public /* synthetic */ RippleAnimation(Offset offset, float f10, boolean z10, AbstractC9972n abstractC9972n) {
        this(offset, f10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fadeIn(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objM20748e = AbstractC10006d.m20748e(new C20262(null), interfaceC11588c);
        return objM20748e == AbstractC11725a.m25952f() ? objM20748e : C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fadeOut(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objM20748e = AbstractC10006d.m20748e(new C20272(null), interfaceC11588c);
        return objM20748e == AbstractC11725a.m25952f() ? objM20748e : C10786q.f26013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getFinishRequested() {
        return ((Boolean) this.finishRequested$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getFinishedFadingIn() {
        return ((Boolean) this.finishedFadingIn$delegate.getValue()).booleanValue();
    }

    private final void setFinishRequested(boolean z10) {
        this.finishRequested$delegate.setValue(Boolean.valueOf(z10));
    }

    private final void setFinishedFadingIn(boolean z10) {
        this.finishedFadingIn$delegate.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r2.fadeOut(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animate(vc.InterfaceC11588c<? super p309qc.C10786q> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.material.ripple.RippleAnimation.C20251
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = (androidx.compose.material.ripple.RippleAnimation.C20251) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = new androidx.compose.material.ripple.RippleAnimation$animate$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.AbstractC9924b.m20071b(r7)
            goto L72
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            kotlin.AbstractC9924b.m20071b(r7)
            goto L66
        L3f:
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            kotlin.AbstractC9924b.m20071b(r7)
            goto L56
        L47:
            kotlin.AbstractC9924b.m20071b(r7)
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.fadeIn(r0)
            if (r7 != r1) goto L55
            goto L71
        L55:
            r2 = r6
        L56:
            r2.setFinishedFadingIn(r5)
            sd.s r7 = r2.finishSignalDeferred
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r7.mo24760z(r0)
            if (r7 != r1) goto L66
            goto L71
        L66:
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r7 = r2.fadeOut(r0)
            if (r7 != r1) goto L72
        L71:
            return r1
        L72:
            qc.q r7 = p309qc.C10786q.f26013a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.RippleAnimation.animate(vc.c):java.lang.Object");
    }

    /* renamed from: draw-4WTKRHQ, reason: not valid java name */
    public final void m28318draw4WTKRHQ(DrawScope drawScope, long j10) {
        if (this.startRadius == null) {
            this.startRadius = Float.valueOf(RippleAnimationKt.m28320getRippleStartRadiusuvyYCjk(drawScope.mo31429getSizeNHjbRc()));
        }
        if (this.origin == null) {
            this.origin = Offset.m30626boximpl(drawScope.mo31428getCenterF1C5BW0());
        }
        if (this.targetCenter == null) {
            this.targetCenter = Offset.m30626boximpl(OffsetKt.Offset(Size.m30706getWidthimpl(drawScope.mo31429getSizeNHjbRc()) / 2.0f, Size.m30703getHeightimpl(drawScope.mo31429getSizeNHjbRc()) / 2.0f));
        }
        float fFloatValue = (!getFinishRequested() || getFinishedFadingIn()) ? this.animatedAlpha.getValue().floatValue() : 1.0f;
        Float f10 = this.startRadius;
        AbstractC9979u.m20291d(f10);
        float fLerp = MathHelpersKt.lerp(f10.floatValue(), this.radius, this.animatedRadiusPercent.getValue().floatValue());
        Offset offset = this.origin;
        AbstractC9979u.m20291d(offset);
        float fM30637getXimpl = Offset.m30637getXimpl(offset.m30647unboximpl());
        Offset offset2 = this.targetCenter;
        AbstractC9979u.m20291d(offset2);
        float fLerp2 = MathHelpersKt.lerp(fM30637getXimpl, Offset.m30637getXimpl(offset2.m30647unboximpl()), this.animatedCenterPercent.getValue().floatValue());
        Offset offset3 = this.origin;
        AbstractC9979u.m20291d(offset3);
        float fM30638getYimpl = Offset.m30638getYimpl(offset3.m30647unboximpl());
        Offset offset4 = this.targetCenter;
        AbstractC9979u.m20291d(offset4);
        long jOffset = OffsetKt.Offset(fLerp2, MathHelpersKt.lerp(fM30638getYimpl, Offset.m30638getYimpl(offset4.m30647unboximpl()), this.animatedCenterPercent.getValue().floatValue()));
        long jM30877copywmQWz5c$default = Color.m30877copywmQWz5c$default(j10, Color.m30880getAlphaimpl(j10) * fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.bounded) {
            DrawScope.m31410drawCircleVaOC9Bg$default(drawScope, jM30877copywmQWz5c$default, fLerp, jOffset, 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
            return;
        }
        float fM30706getWidthimpl = Size.m30706getWidthimpl(drawScope.mo31429getSizeNHjbRc());
        float fM30703getHeightimpl = Size.m30703getHeightimpl(drawScope.mo31429getSizeNHjbRc());
        int iM30867getIntersectrtfAjoo = ClipOp.Companion.m30867getIntersectrtfAjoo();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31353clipRectN_I0leg(0.0f, 0.0f, fM30706getWidthimpl, fM30703getHeightimpl, iM30867getIntersectrtfAjoo);
            DrawScope.m31410drawCircleVaOC9Bg$default(drawScope, jM30877copywmQWz5c$default, fLerp, jOffset, 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
        }
    }

    public final void finish() {
        setFinishRequested(true);
        this.finishSignalDeferred.mo24803n(C10786q.f26013a);
    }

    private RippleAnimation(Offset offset, float f10, boolean z10) {
        this.origin = offset;
        this.radius = f10;
        this.bounded = z10;
        this.animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedRadiusPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedCenterPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.finishSignalDeferred = AbstractC11165u.m24806a(null);
        Boolean bool = Boolean.FALSE;
        this.finishedFadingIn$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.finishRequested$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }
}
