package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.OffsetKt;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.ClipOp;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.drawscope.DrawContext;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.util.MathHelpersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.AbstractC9165e;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.AbstractC8875t;
import p135i8.InterfaceC8822b0;
import p135i8.InterfaceC8869r;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class RippleAnimation {
    public static final int $stable = 8;
    private final Animatable<Float, AnimationVector1D> animatedAlpha;
    private final Animatable<Float, AnimationVector1D> animatedCenterPercent;
    private final Animatable<Float, AnimationVector1D> animatedRadiusPercent;
    private final boolean bounded;
    private final MutableState finishRequested$delegate;
    private final InterfaceC8869r finishSignalDeferred;
    private final MutableState finishedFadingIn$delegate;
    private Offset origin;
    private final float radius;
    private Float startRadius;
    private Offset targetCenter;

    @InterfaceC9539d(m17800c = "androidx.compose.material.ripple.RippleAnimation", m17801f = "RippleAnimation.kt", m17802l = {IjkMediaMeta.FF_PROFILE_H264_MAIN, 79, 80}, m17803m = "animate")
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$animate$1 */
    public static final class C19951 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C19951(InterfaceC9324c<? super C19951> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RippleAnimation.this.animate(this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", m17801f = "RippleAnimation.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2 */
    public static final class C19962 extends SuspendLambda implements InterfaceC10574p {
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC9539d(m17800c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", m17801f = "RippleAnimation.kt", m17802l = {86}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
            int label;
            final /* synthetic */ RippleAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RippleAnimation rippleAnimation, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.this$0 = rippleAnimation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass1(this.this$0, interfaceC9324c);
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
                    Animatable animatable = this.this$0.animatedAlpha;
                    Float fM17797b = AbstractC9536a.m17797b(1.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(75, 0, EasingKt.getLinearEasing(), 2, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, fM17797b, tweenSpecTween$default, null, null, this, 12, null) == objM17291f) {
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

        @InterfaceC9539d(m17800c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", m17801f = "RippleAnimation.kt", m17802l = {92}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {
            int label;
            final /* synthetic */ RippleAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(RippleAnimation rippleAnimation, InterfaceC9324c<? super AnonymousClass2> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.this$0 = rippleAnimation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass2(this.this$0, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    Animatable animatable = this.this$0.animatedRadiusPercent;
                    Float fM17797b = AbstractC9536a.m17797b(1.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, fM17797b, tweenSpecTween$default, null, null, this, 12, null) == objM17291f) {
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

        @InterfaceC9539d(m17800c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", m17801f = "RippleAnimation.kt", m17802l = {98}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC10574p {
            int label;
            final /* synthetic */ RippleAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(RippleAnimation rippleAnimation, InterfaceC9324c<? super AnonymousClass3> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.this$0 = rippleAnimation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass3(this.this$0, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass3) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    Animatable animatable = this.this$0.animatedCenterPercent;
                    Float fM17797b = AbstractC9536a.m17797b(1.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, 0, EasingKt.getLinearEasing(), 2, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, fM17797b, tweenSpecTween$default, null, null, this, 12, null) == objM17291f) {
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

        public C19962(InterfaceC9324c<? super C19962> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C19962 c19962 = RippleAnimation.this.new C19962(interfaceC9324c);
            c19962.L$0 = obj;
            return c19962;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super InterfaceC9212n> interfaceC9324c) {
            return ((C19962) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass1(RippleAnimation.this, null), 3, null);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass2(RippleAnimation.this, null), 3, null);
            return AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass3(RippleAnimation.this, null), 3, null);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", m17801f = "RippleAnimation.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeOut$2 */
    public static final class C19972 extends SuspendLambda implements InterfaceC10574p {
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC9539d(m17800c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", m17801f = "RippleAnimation.kt", m17802l = {109}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
            int label;
            final /* synthetic */ RippleAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RippleAnimation rippleAnimation, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.this$0 = rippleAnimation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass1(this.this$0, interfaceC9324c);
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
                    Animatable animatable = this.this$0.animatedAlpha;
                    Float fM17797b = AbstractC9536a.m17797b(0.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, EasingKt.getLinearEasing(), 2, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, fM17797b, tweenSpecTween$default, null, null, this, 12, null) == objM17291f) {
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

        public C19972(InterfaceC9324c<? super C19972> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C19972 c19972 = RippleAnimation.this.new C19972(interfaceC9324c);
            c19972.L$0 = obj;
            return c19972;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super InterfaceC9212n> interfaceC9324c) {
            return ((C19972) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return AbstractC8839h.m14861d((InterfaceC8822b0) this.L$0, null, null, new AnonymousClass1(RippleAnimation.this, null), 3, null);
        }
    }

    public /* synthetic */ RippleAnimation(Offset offset, float f10, boolean z10, AbstractC9126n abstractC9126n) {
        this(offset, f10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fadeIn(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objM16556e = AbstractC9165e.m16556e(new C19962(null), interfaceC9324c);
        return objM16556e == AbstractC9434a.m17291f() ? objM16556e : C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fadeOut(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objM16556e = AbstractC9165e.m16556e(new C19972(null), interfaceC9324c);
        return objM16556e == AbstractC9434a.m17291f() ? objM16556e : C8736p.f16368a;
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
    public final java.lang.Object animate(p179m7.InterfaceC9324c<? super p123h7.C8736p> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.material.ripple.RippleAnimation.C19951
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = (androidx.compose.material.ripple.RippleAnimation.C19951) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.AbstractC9079b.m15926b(r7)
            goto L72
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            kotlin.AbstractC9079b.m15926b(r7)
            goto L66
        L3f:
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            kotlin.AbstractC9079b.m15926b(r7)
            goto L56
        L47:
            kotlin.AbstractC9079b.m15926b(r7)
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.fadeIn(r0)
            if (r7 != r1) goto L55
            goto L71
        L55:
            r2 = r6
        L56:
            r2.setFinishedFadingIn(r5)
            i8.r r7 = r2.finishSignalDeferred
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r7.mo14833u(r0)
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
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.RippleAnimation.animate(m7.c):java.lang.Object");
    }

    /* renamed from: draw-4WTKRHQ, reason: not valid java name */
    public final void m21716draw4WTKRHQ(DrawScope drawScope, long j10) {
        if (this.startRadius == null) {
            this.startRadius = Float.valueOf(RippleAnimationKt.m21718getRippleStartRadiusuvyYCjk(drawScope.mo24827getSizeNHjbRc()));
        }
        if (this.origin == null) {
            this.origin = Offset.m24024boximpl(drawScope.mo24826getCenterF1C5BW0());
        }
        if (this.targetCenter == null) {
            this.targetCenter = Offset.m24024boximpl(OffsetKt.Offset(Size.m24104getWidthimpl(drawScope.mo24827getSizeNHjbRc()) / 2.0f, Size.m24101getHeightimpl(drawScope.mo24827getSizeNHjbRc()) / 2.0f));
        }
        float fFloatValue = (!getFinishRequested() || getFinishedFadingIn()) ? this.animatedAlpha.getValue().floatValue() : 1.0f;
        Float f10 = this.startRadius;
        AbstractC9133u.m16130d(f10);
        float fLerp = MathHelpersKt.lerp(f10.floatValue(), this.radius, this.animatedRadiusPercent.getValue().floatValue());
        Offset offset = this.origin;
        AbstractC9133u.m16130d(offset);
        float fM24035getXimpl = Offset.m24035getXimpl(offset.m24045unboximpl());
        Offset offset2 = this.targetCenter;
        AbstractC9133u.m16130d(offset2);
        float fLerp2 = MathHelpersKt.lerp(fM24035getXimpl, Offset.m24035getXimpl(offset2.m24045unboximpl()), this.animatedCenterPercent.getValue().floatValue());
        Offset offset3 = this.origin;
        AbstractC9133u.m16130d(offset3);
        float fM24036getYimpl = Offset.m24036getYimpl(offset3.m24045unboximpl());
        Offset offset4 = this.targetCenter;
        AbstractC9133u.m16130d(offset4);
        long jOffset = OffsetKt.Offset(fLerp2, MathHelpersKt.lerp(fM24036getYimpl, Offset.m24036getYimpl(offset4.m24045unboximpl()), this.animatedCenterPercent.getValue().floatValue()));
        long jM24275copywmQWz5c$default = Color.m24275copywmQWz5c$default(j10, Color.m24278getAlphaimpl(j10) * fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.bounded) {
            DrawScope.m24808drawCircleVaOC9Bg$default(drawScope, jM24275copywmQWz5c$default, fLerp, jOffset, 0.0f, null, null, 0, 120, null);
            return;
        }
        float fM24104getWidthimpl = Size.m24104getWidthimpl(drawScope.mo24827getSizeNHjbRc());
        float fM24101getHeightimpl = Size.m24101getHeightimpl(drawScope.mo24827getSizeNHjbRc());
        int iM24265getIntersectrtfAjoo = ClipOp.Companion.m24265getIntersectrtfAjoo();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo24748getSizeNHjbRc = drawContext.mo24748getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo24751clipRectN_I0leg(0.0f, 0.0f, fM24104getWidthimpl, fM24101getHeightimpl, iM24265getIntersectrtfAjoo);
            DrawScope.m24808drawCircleVaOC9Bg$default(drawScope, jM24275copywmQWz5c$default, fLerp, jOffset, 0.0f, null, null, 0, 120, null);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
        }
    }

    public final void finish() {
        setFinishRequested(true);
        this.finishSignalDeferred.mo14905h(C8736p.f16368a);
    }

    private RippleAnimation(Offset offset, float f10, boolean z10) {
        this.origin = offset;
        this.radius = f10;
        this.bounded = z10;
        this.animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedRadiusPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedCenterPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.finishSignalDeferred = AbstractC8875t.m14912a(null);
        Boolean bool = Boolean.FALSE;
        this.finishedFadingIn$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.finishRequested$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }
}
