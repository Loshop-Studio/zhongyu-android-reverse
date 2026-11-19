package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", m17801f = "SnapFlingBehavior.kt", m17802l = {135, 151}, m17803m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SnapFlingBehavior$fling$result$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ InterfaceC10570l $onRemainingScrollOffsetUpdate;
    final /* synthetic */ ScrollScope $this_fling;
    Object L$0;
    int label;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$fling$result$1(SnapFlingBehavior snapFlingBehavior, float f10, InterfaceC10570l interfaceC10570l, ScrollScope scrollScope, InterfaceC9324c<? super SnapFlingBehavior$fling$result$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = snapFlingBehavior;
        this.$initialVelocity = f10;
        this.$onRemainingScrollOffsetUpdate = interfaceC10570l;
        this.$this_fling = scrollScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new SnapFlingBehavior$fling$result$1(this.this$0, this.$initialVelocity, this.$onRemainingScrollOffsetUpdate, this.$this_fling, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super AnimationResult<Float, AnimationVector1D>> interfaceC9324c) {
        return ((SnapFlingBehavior$fling$result$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final Ref$FloatRef ref$FloatRef;
        Object objTryApproach;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            float fCalculateApproachOffset = this.this$0.snapLayoutInfoProvider.calculateApproachOffset(this.$initialVelocity, DecayAnimationSpecKt.calculateTargetValue(this.this$0.decayAnimationSpec, 0.0f, this.$initialVelocity));
            if (Float.isNaN(fCalculateApproachOffset)) {
                InlineClassHelperKt.throwIllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            ref$FloatRef = new Ref$FloatRef();
            float fAbs = Math.abs(fCalculateApproachOffset) * Math.signum(this.$initialVelocity);
            ref$FloatRef.f17470a = fAbs;
            this.$onRemainingScrollOffsetUpdate.invoke(AbstractC9536a.m17797b(fAbs));
            SnapFlingBehavior snapFlingBehavior = this.this$0;
            ScrollScope scrollScope = this.$this_fling;
            float f10 = ref$FloatRef.f17470a;
            float f11 = this.$initialVelocity;
            final InterfaceC10570l interfaceC10570l = this.$onRemainingScrollOffsetUpdate;
            InterfaceC10570l interfaceC10570l2 = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1$animationState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke(((Number) obj2).floatValue());
                    return C8736p.f16368a;
                }

                public final void invoke(float f12) {
                    Ref$FloatRef ref$FloatRef2 = ref$FloatRef;
                    float f13 = ref$FloatRef2.f17470a - f12;
                    ref$FloatRef2.f17470a = f13;
                    interfaceC10570l.invoke(Float.valueOf(f13));
                }
            };
            this.L$0 = ref$FloatRef;
            this.label = 1;
            objTryApproach = snapFlingBehavior.tryApproach(scrollScope, f10, f11, interfaceC10570l2, this);
            if (objTryApproach != objM17291f) {
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return obj;
        }
        Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) this.L$0;
        AbstractC9079b.m15926b(obj);
        ref$FloatRef = ref$FloatRef2;
        objTryApproach = obj;
        AnimationState animationState = (AnimationState) objTryApproach;
        float fCalculateSnapOffset = this.this$0.snapLayoutInfoProvider.calculateSnapOffset(((Number) animationState.getVelocity()).floatValue());
        if (Float.isNaN(fCalculateSnapOffset)) {
            InlineClassHelperKt.throwIllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        ref$FloatRef.f17470a = fCalculateSnapOffset;
        ScrollScope scrollScope2 = this.$this_fling;
        AnimationState animationStateCopy$default = AnimationStateKt.copy$default(animationState, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
        AnimationSpec animationSpec = this.this$0.snapAnimationSpec;
        final InterfaceC10570l interfaceC10570l3 = this.$onRemainingScrollOffsetUpdate;
        InterfaceC10570l interfaceC10570l4 = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke(((Number) obj2).floatValue());
                return C8736p.f16368a;
            }

            public final void invoke(float f12) {
                Ref$FloatRef ref$FloatRef3 = ref$FloatRef;
                float f13 = ref$FloatRef3.f17470a - f12;
                ref$FloatRef3.f17470a = f13;
                interfaceC10570l3.invoke(Float.valueOf(f13));
            }
        };
        this.L$0 = null;
        this.label = 2;
        Object objAnimateWithTarget = SnapFlingBehaviorKt.animateWithTarget(scrollScope2, fCalculateSnapOffset, fCalculateSnapOffset, animationStateCopy$default, animationSpec, interfaceC10570l4, this);
        return objAnimateWithTarget == objM17291f ? objM17291f : objAnimateWithTarget;
    }
}
