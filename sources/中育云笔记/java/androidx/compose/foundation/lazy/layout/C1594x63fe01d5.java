package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$2", m26211f = "LazyLayoutScrollDeltaBetweenPasses.kt", m26212l = {77}, m26213m = "invokeSuspend")
/* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$2 */
/* loaded from: classes.dex */
public final class C1594x63fe01d5 extends SuspendLambda implements InterfaceC9544p {
    int label;
    final /* synthetic */ LazyLayoutScrollDeltaBetweenPasses this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1594x63fe01d5(LazyLayoutScrollDeltaBetweenPasses lazyLayoutScrollDeltaBetweenPasses, InterfaceC11588c<? super C1594x63fe01d5> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = lazyLayoutScrollDeltaBetweenPasses;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new C1594x63fe01d5(this.this$0, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            AnimationState animationState = this.this$0._scrollDeltaBetweenPasses;
            Float fM26207b = AbstractC11826a.m26207b(0.0f);
            SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 400.0f, AbstractC11826a.m26207b(0.5f), 1, null);
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(animationState, fM26207b, springSpecSpring$default, true, null, this, 8, null) == objM25952f) {
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
        return ((C1594x63fe01d5) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
