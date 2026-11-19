package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.p014ui.MotionDurationScale;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SnapFlingBehavior implements TargetedFlingBehavior {
    public static final int $stable = 0;
    private final DecayAnimationSpec<Float> decayAnimationSpec;
    private MotionDurationScale motionScaleDuration = ScrollableKt.getDefaultScrollMotionDurationScale();
    private final AnimationSpec<Float> snapAnimationSpec;
    private final SnapLayoutInfoProvider snapLayoutInfoProvider;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", m26211f = "SnapFlingBehavior.kt", m26212l = {115}, m26213m = "fling")
    /* renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 */
    public static final class C13771 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C13771(InterfaceC11588c<? super C13771> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.fling(null, 0.0f, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", m26211f = "SnapFlingBehavior.kt", m26212l = {101}, m26213m = "performFling")
    /* renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1 */
    public static final class C13791 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C13791(InterfaceC11588c<? super C13791> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.performFling(null, 0.0f, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", m26211f = "SnapFlingBehavior.kt", m26212l = {175}, m26213m = "tryApproach")
    /* renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1 */
    public static final class C13801 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C13801(InterfaceC11588c<? super C13801> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.tryApproach(null, 0.0f, 0.0f, null, this);
        }
    }

    public SnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec) {
        this.snapLayoutInfoProvider = snapLayoutInfoProvider;
        this.decayAnimationSpec = decayAnimationSpec;
        this.snapAnimationSpec = animationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fling(androidx.compose.foundation.gestures.ScrollScope r11, float r12, p181hd.InterfaceC9540l r13, vc.InterfaceC11588c<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.C13771
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.C13771) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r11 = r0.L$0
            r13 = r11
            hd.l r13 = (p181hd.InterfaceC9540l) r13
            kotlin.AbstractC9924b.m20071b(r14)
            goto L51
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            kotlin.AbstractC9924b.m20071b(r14)
            androidx.compose.ui.MotionDurationScale r14 = r10.motionScaleDuration
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1 r4 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1
            r9 = 0
            r5 = r10
            r8 = r11
            r6 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r14 = sd.AbstractC11109f.m24709g(r14, r4, r0)
            if (r14 != r1) goto L50
            return r1
        L50:
            r13 = r7
        L51:
            androidx.compose.foundation.gestures.snapping.AnimationResult r14 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r14
            r11 = 0
            java.lang.Float r11 = p409xc.AbstractC11826a.m26207b(r11)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.fling(androidx.compose.foundation.gestures.ScrollScope, float, hd.l, vc.c):java.lang.Object");
    }

    private final boolean isDecayApproachPossible(float f10, float f11) {
        return Math.abs(DecayAnimationSpecKt.calculateTargetValue(this.decayAnimationSpec, 0.0f, f11)) >= Math.abs(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runApproach(ScrollScope scrollScope, float f10, float f11, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super AnimationResult<Float, AnimationVector1D>> interfaceC11588c) {
        return SnapFlingBehaviorKt.approach(scrollScope, f10, f11, isDecayApproachPossible(f10, f11) ? new DecayApproachAnimation(this.decayAnimationSpec) : new TargetApproachAnimation(this.snapAnimationSpec), interfaceC9540l, interfaceC11588c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object tryApproach(androidx.compose.foundation.gestures.ScrollScope r18, float r19, float r20, p181hd.InterfaceC9540l r21, vc.InterfaceC11588c<? super androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r22) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r22
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.C13801
            if (r1 == 0) goto L18
            r1 = r0
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1 r1 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.C13801) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.label = r2
            r2 = r17
        L16:
            r7 = r1
            goto L20
        L18:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1 r1 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1
            r2 = r17
            r1.<init>(r0)
            goto L16
        L20:
            java.lang.Object r0 = r7.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r3 = r7.label
            r4 = 1
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            kotlin.AbstractC9924b.m20071b(r0)
            goto L71
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            kotlin.AbstractC9924b.m20071b(r0)
            float r0 = java.lang.Math.abs(r19)
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L46
            goto L4e
        L46:
            float r0 = java.lang.Math.abs(r20)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L60
        L4e:
            r15 = 28
            r16 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r8 = r19
            r9 = r20
            androidx.compose.animation.core.AnimationState r0 = androidx.compose.animation.core.AnimationStateKt.AnimationState$default(r8, r9, r10, r12, r14, r15, r16)
            return r0
        L60:
            r7.label = r4
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            java.lang.Object r0 = r2.runApproach(r3, r4, r5, r6, r7)
            if (r0 != r1) goto L71
            return r1
        L71:
            androidx.compose.foundation.gestures.snapping.AnimationResult r0 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r0
            androidx.compose.animation.core.AnimationState r0 = r0.getCurrentAnimationState()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.tryApproach(androidx.compose.foundation.gestures.ScrollScope, float, float, hd.l, vc.c):java.lang.Object");
    }

    public boolean equals(Object obj) {
        if (obj instanceof SnapFlingBehavior) {
            SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) obj;
            if (AbstractC9979u.m20289b(snapFlingBehavior.snapAnimationSpec, this.snapAnimationSpec) && AbstractC9979u.m20289b(snapFlingBehavior.decayAnimationSpec, this.decayAnimationSpec) && AbstractC9979u.m20289b(snapFlingBehavior.snapLayoutInfoProvider, this.snapLayoutInfoProvider)) {
                return true;
            }
        }
        return false;
    }

    public final MotionDurationScale getMotionScaleDuration$foundation_release() {
        return this.motionScaleDuration;
    }

    public int hashCode() {
        return (((this.snapAnimationSpec.hashCode() * 31) + this.decayAnimationSpec.hashCode()) * 31) + this.snapLayoutInfoProvider.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.TargetedFlingBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object performFling(androidx.compose.foundation.gestures.ScrollScope r5, float r6, p181hd.InterfaceC9540l r7, vc.InterfaceC11588c<? super java.lang.Float> r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.C13791
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.C13791) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9924b.m20071b(r8)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.AbstractC9924b.m20071b(r8)
            r0.label = r3
            java.lang.Object r8 = r4.fling(r5, r6, r7, r0)
            if (r8 != r1) goto L3d
            return r1
        L3d:
            androidx.compose.foundation.gestures.snapping.AnimationResult r8 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r8
            java.lang.Object r5 = r8.component1()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            androidx.compose.animation.core.AnimationState r6 = r8.component2()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L53
            goto L5d
        L53:
            java.lang.Object r5 = r6.getVelocity()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L5d:
            java.lang.Float r5 = p409xc.AbstractC11826a.m26207b(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.performFling(androidx.compose.foundation.gestures.ScrollScope, float, hd.l, vc.c):java.lang.Object");
    }

    public final void setMotionScaleDuration$foundation_release(MotionDurationScale motionDurationScale) {
        this.motionScaleDuration = motionDurationScale;
    }
}
