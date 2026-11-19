package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import com.alibaba.fastjson.asm.Opcodes;
import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", m26211f = "SnapFlingBehavior.kt", m26212l = {PatchStatus.CODE_LOAD_LIB_UNZIP, Opcodes.DCMPL}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SnapFlingBehavior$fling$result$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ InterfaceC9540l $onRemainingScrollOffsetUpdate;
    final /* synthetic */ ScrollScope $this_fling;
    Object L$0;
    int label;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$fling$result$1(SnapFlingBehavior snapFlingBehavior, float f10, InterfaceC9540l interfaceC9540l, ScrollScope scrollScope, InterfaceC11588c<? super SnapFlingBehavior$fling$result$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = snapFlingBehavior;
        this.$initialVelocity = f10;
        this.$onRemainingScrollOffsetUpdate = interfaceC9540l;
        this.$this_fling = scrollScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new SnapFlingBehavior$fling$result$1(this.this$0, this.$initialVelocity, this.$onRemainingScrollOffsetUpdate, this.$this_fling, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final Ref$FloatRef ref$FloatRef;
        Object objTryApproach;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            float fCalculateApproachOffset = this.this$0.snapLayoutInfoProvider.calculateApproachOffset(this.$initialVelocity, DecayAnimationSpecKt.calculateTargetValue(this.this$0.decayAnimationSpec, 0.0f, this.$initialVelocity));
            if (Float.isNaN(fCalculateApproachOffset)) {
                InlineClassHelperKt.throwIllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            ref$FloatRef = new Ref$FloatRef();
            float fAbs = Math.abs(fCalculateApproachOffset) * Math.signum(this.$initialVelocity);
            ref$FloatRef.f23399c = fAbs;
            this.$onRemainingScrollOffsetUpdate.invoke(AbstractC11826a.m26207b(fAbs));
            SnapFlingBehavior snapFlingBehavior = this.this$0;
            ScrollScope scrollScope = this.$this_fling;
            float f10 = ref$FloatRef.f23399c;
            float f11 = this.$initialVelocity;
            final InterfaceC9540l interfaceC9540l = this.$onRemainingScrollOffsetUpdate;
            InterfaceC9540l interfaceC9540l2 = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1$animationState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke(((Number) obj2).floatValue());
                    return C10786q.f26013a;
                }

                public final void invoke(float f12) {
                    Ref$FloatRef ref$FloatRef2 = ref$FloatRef;
                    float f13 = ref$FloatRef2.f23399c - f12;
                    ref$FloatRef2.f23399c = f13;
                    interfaceC9540l.invoke(Float.valueOf(f13));
                }
            };
            this.L$0 = ref$FloatRef;
            this.label = 1;
            objTryApproach = snapFlingBehavior.tryApproach(scrollScope, f10, f11, interfaceC9540l2, this);
            if (objTryApproach != objM25952f) {
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return obj;
        }
        Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) this.L$0;
        AbstractC9924b.m20071b(obj);
        ref$FloatRef = ref$FloatRef2;
        objTryApproach = obj;
        AnimationState animationState = (AnimationState) objTryApproach;
        float fCalculateSnapOffset = this.this$0.snapLayoutInfoProvider.calculateSnapOffset(((Number) animationState.getVelocity()).floatValue());
        if (Float.isNaN(fCalculateSnapOffset)) {
            InlineClassHelperKt.throwIllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        ref$FloatRef.f23399c = fCalculateSnapOffset;
        ScrollScope scrollScope2 = this.$this_fling;
        AnimationState animationStateCopy$default = AnimationStateKt.copy$default(animationState, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
        AnimationSpec animationSpec = this.this$0.snapAnimationSpec;
        final InterfaceC9540l interfaceC9540l3 = this.$onRemainingScrollOffsetUpdate;
        InterfaceC9540l interfaceC9540l4 = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke(((Number) obj2).floatValue());
                return C10786q.f26013a;
            }

            public final void invoke(float f12) {
                Ref$FloatRef ref$FloatRef3 = ref$FloatRef;
                float f13 = ref$FloatRef3.f23399c - f12;
                ref$FloatRef3.f23399c = f13;
                interfaceC9540l3.invoke(Float.valueOf(f13));
            }
        };
        this.L$0 = null;
        this.label = 2;
        Object objAnimateWithTarget = SnapFlingBehaviorKt.animateWithTarget(scrollScope2, fCalculateSnapOffset, fCalculateSnapOffset, animationStateCopy$default, animationSpec, interfaceC9540l4, this);
        return objAnimateWithTarget == objM25952f ? objM25952f : objAnimateWithTarget;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super AnimationResult<Float, AnimationVector1D>> interfaceC11588c) {
        return ((SnapFlingBehavior$fling$result$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
