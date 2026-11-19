package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p265nd.InterfaceC10401f;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class SnapFlingBehaviorKt {
    private static final boolean DEBUG = false;
    private static final float MinFlingVelocityDp = C3186Dp.m33501constructorimpl(400);
    public static final float NoDistance = 0.0f;
    public static final float NoVelocity = 0.0f;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", m26211f = "SnapFlingBehavior.kt", m26212l = {313}, m26213m = "animateDecay")
    /* renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 */
    public static final class C13811 extends ContinuationImpl {
        float F$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C13811(InterfaceC11588c<? super C13811> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehaviorKt.animateDecay(null, 0.0f, null, null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", m26211f = "SnapFlingBehavior.kt", m26212l = {354}, m26213m = "animateWithTarget")
    /* renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 */
    public static final class C13831 extends ContinuationImpl {
        float F$0;
        float F$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C13831(InterfaceC11588c<? super C13831> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehaviorKt.animateWithTarget(null, 0.0f, 0.0f, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object animateDecay(final androidx.compose.foundation.gestures.ScrollScope r5, final float r6, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r7, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r8, final p181hd.InterfaceC9540l r9, vc.InterfaceC11588c<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.C13811
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.C13811) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            float r6 = r0.F$0
            java.lang.Object r5 = r0.L$1
            kotlin.jvm.internal.Ref$FloatRef r5 = (kotlin.jvm.internal.Ref$FloatRef) r5
            java.lang.Object r7 = r0.L$0
            androidx.compose.animation.core.AnimationState r7 = (androidx.compose.animation.core.AnimationState) r7
            kotlin.AbstractC9924b.m20071b(r10)
            goto L6b
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.AbstractC9924b.m20071b(r10)
            kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
            r10.<init>()
            java.lang.Object r2 = r7.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L54
            r2 = r3
            goto L55
        L54:
            r2 = 0
        L55:
            r2 = r2 ^ r3
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2 r4 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2
            r4.<init>()
            r0.L$0 = r7
            r0.L$1 = r10
            r0.F$0 = r6
            r0.label = r3
            java.lang.Object r5 = androidx.compose.animation.core.SuspendAnimationKt.animateDecay(r7, r8, r2, r4, r0)
            if (r5 != r1) goto L6a
            return r1
        L6a:
            r5 = r10
        L6b:
            androidx.compose.foundation.gestures.snapping.AnimationResult r8 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            float r5 = r5.f23399c
            float r6 = r6 - r5
            java.lang.Float r5 = p409xc.AbstractC11826a.m26207b(r6)
            r8.<init>(r5, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateDecay(androidx.compose.foundation.gestures.ScrollScope, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.DecayAnimationSpec, hd.l, vc.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDecay$consumeDelta(AnimationScope<Float, AnimationVector1D> animationScope, ScrollScope scrollScope, InterfaceC9540l interfaceC9540l, float f10) {
        float fScrollBy;
        if (ComposeFoundationFlags.NewNestedFlingPropagationEnabled) {
            try {
                fScrollBy = scrollScope.scrollBy(f10);
            } catch (CancellationException unused) {
                animationScope.cancelAnimation();
                fScrollBy = 0.0f;
            }
        } else {
            fScrollBy = scrollScope.scrollBy(f10);
        }
        interfaceC9540l.invoke(Float.valueOf(fScrollBy));
        if (Math.abs(f10 - fScrollBy) > 0.5f) {
            animationScope.cancelAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object animateWithTarget(final androidx.compose.foundation.gestures.ScrollScope r20, float r21, final float r22, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r23, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r24, final p181hd.InterfaceC9540l r25, vc.InterfaceC11588c<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r26) throws java.lang.Throwable {
        /*
            r0 = r26
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.C13831
            if (r1 == 0) goto L16
            r1 = r0
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 r1 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.C13831) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 r1 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r7.label
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            float r1 = r7.F$1
            float r2 = r7.F$0
            java.lang.Object r3 = r7.L$1
            kotlin.jvm.internal.Ref$FloatRef r3 = (kotlin.jvm.internal.Ref$FloatRef) r3
            java.lang.Object r4 = r7.L$0
            androidx.compose.animation.core.AnimationState r4 = (androidx.compose.animation.core.AnimationState) r4
            kotlin.AbstractC9924b.m20071b(r0)
            r9 = r2
            r10 = r4
            goto L95
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L43:
            kotlin.AbstractC9924b.m20071b(r0)
            kotlin.jvm.internal.Ref$FloatRef r0 = new kotlin.jvm.internal.Ref$FloatRef
            r0.<init>()
            java.lang.Object r2 = r23.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r8 = r2.floatValue()
            java.lang.Float r2 = p409xc.AbstractC11826a.m26207b(r21)
            java.lang.Object r4 = r23.getVelocity()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L6a
            r4 = r3
            goto L6b
        L6a:
            r4 = 0
        L6b:
            r5 = r4 ^ 1
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$2 r6 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$2
            r4 = r20
            r9 = r22
            r10 = r25
            r6.<init>()
            r4 = r23
            r7.L$0 = r4
            r7.L$1 = r0
            r9 = r21
            r7.F$0 = r9
            r7.F$1 = r8
            r7.label = r3
            r3 = r2
            r2 = r4
            r4 = r24
            java.lang.Object r3 = androidx.compose.animation.core.SuspendAnimationKt.animateTo(r2, r3, r4, r5, r6, r7)
            if (r3 != r1) goto L91
            return r1
        L91:
            r10 = r23
            r3 = r0
            r1 = r8
        L95:
            java.lang.Object r0 = r10.getVelocity()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r12 = coerceToTarget(r0, r1)
            androidx.compose.foundation.gestures.snapping.AnimationResult r0 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            float r1 = r3.f23399c
            float r9 = r9 - r1
            java.lang.Float r1 = p409xc.AbstractC11826a.m26207b(r9)
            r18 = 29
            r19 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            androidx.compose.animation.core.AnimationState r2 = androidx.compose.animation.core.AnimationStateKt.copy$default(r10, r11, r12, r13, r15, r17, r18, r19)
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateWithTarget(androidx.compose.foundation.gestures.ScrollScope, float, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.AnimationSpec, hd.l, vc.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object approach(ScrollScope scrollScope, float f10, float f11, ApproachAnimation<Float, AnimationVector1D> approachAnimation, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super AnimationResult<Float, AnimationVector1D>> interfaceC11588c) {
        return approachAnimation.approachAnimation(scrollScope, AbstractC11826a.m26207b(f10), AbstractC11826a.m26207b(f11), interfaceC9540l, interfaceC11588c);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: calculateFinalOffset-Fhqu1e0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float m27279calculateFinalOffsetFhqu1e0(int r3, float r4, float r5) {
        /*
            androidx.compose.foundation.gestures.snapping.FinalSnappingItem$Companion r0 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.Companion
            int r1 = r0.m27276getClosestItembbeMdSM()
            boolean r1 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m27272equalsimpl0(r3, r1)
            r2 = 0
            if (r1 == 0) goto L1a
            float r3 = java.lang.Math.abs(r5)
            float r0 = java.lang.Math.abs(r4)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L32
            goto L24
        L1a:
            int r1 = r0.m27277getNextItembbeMdSM()
            boolean r1 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m27272equalsimpl0(r3, r1)
            if (r1 == 0) goto L26
        L24:
            r4 = r5
            goto L32
        L26:
            int r5 = r0.m27278getPreviousItembbeMdSM()
            boolean r3 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m27272equalsimpl0(r3, r5)
            if (r3 == 0) goto L31
            goto L32
        L31:
            r4 = r2
        L32:
            boolean r3 = calculateFinalOffset_Fhqu1e0$isValidDistance(r4)
            if (r3 == 0) goto L39
            return r4
        L39:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.m27279calculateFinalOffsetFhqu1e0(int, float, float):float");
    }

    private static final boolean calculateFinalOffset_Fhqu1e0$isValidDistance(float f10) {
        return (f10 == Float.POSITIVE_INFINITY || f10 == Float.NEGATIVE_INFINITY) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float coerceToTarget(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return f11 > 0.0f ? AbstractC10410o.m21755h(f10, f11) : AbstractC10410o.m21751d(f10, f11);
    }

    private static final <T extends Comparable<? super T>> T component1(InterfaceC10401f interfaceC10401f) {
        return (T) interfaceC10401f.getStart();
    }

    private static final <T extends Comparable<? super T>> T component2(InterfaceC10401f interfaceC10401f) {
        return (T) interfaceC10401f.getEndInclusive();
    }

    public static final float getMinFlingVelocityDp() {
        return MinFlingVelocityDp;
    }

    @Composable
    public static final TargetedFlingBehavior rememberSnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1921733134, i10, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:231)");
        }
        Object obj = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        DecayAnimationSpec decayAnimationSpecRememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        boolean zChanged = composer.changed(decayAnimationSpecRememberSplineBasedDecay) | ((((i10 & 14) ^ 6) > 4 && composer.changed(snapLayoutInfoProvider)) || (i10 & 6) == 4) | composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = snapFlingBehavior(snapLayoutInfoProvider, decayAnimationSpecRememberSplineBasedDecay, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null));
            composer.updateRememberedValue(objRememberedValue);
        }
        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior;
    }

    public static final TargetedFlingBehavior snapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec) {
        return new SnapFlingBehavior(snapLayoutInfoProvider, decayAnimationSpec, animationSpec);
    }

    private static final void debugLog(InterfaceC9529a interfaceC9529a) {
    }
}
