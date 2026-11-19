package androidx.compose.runtime;

import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import sd.InterfaceC11125j;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2", m26211f = "Recomposer.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ ControlledComposition $composition;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2(Recomposer recomposer, ControlledComposition controlledComposition, InterfaceC11588c<? super Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = recomposer;
        this.$composition = controlledComposition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2(this.this$0, this.$composition, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC11125j interfaceC11125jDeriveStateLocked;
        AbstractC11725a.m25952f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        ControlledComposition controlledCompositionPerformRecompose = this.this$0.performRecompose(this.$composition, null);
        Object obj2 = this.this$0.stateLock;
        Recomposer recomposer = this.this$0;
        synchronized (obj2) {
            if (controlledCompositionPerformRecompose != null) {
                try {
                    recomposer.compositionsAwaitingApply.add(controlledCompositionPerformRecompose);
                } catch (Throwable th) {
                    throw th;
                }
            }
            recomposer.concurrentCompositionsOutstanding--;
            interfaceC11125jDeriveStateLocked = recomposer.deriveStateLocked();
        }
        if (interfaceC11125jDeriveStateLocked != null) {
            Result.C9921a c9921a = Result.f23263d;
            interfaceC11125jDeriveStateLocked.resumeWith(Result.m20054c(C10786q.f26013a));
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
