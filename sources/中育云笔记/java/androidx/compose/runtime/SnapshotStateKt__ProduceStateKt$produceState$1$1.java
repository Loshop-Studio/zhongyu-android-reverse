package androidx.compose.runtime;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1$1", m26211f = "ProduceState.kt", m26212l = {77}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SnapshotStateKt__ProduceStateKt$produceState$1$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ InterfaceC9544p $producer;
    final /* synthetic */ MutableState<T> $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__ProduceStateKt$produceState$1$1(InterfaceC9544p interfaceC9544p, MutableState<T> mutableState, InterfaceC11588c<? super SnapshotStateKt__ProduceStateKt$produceState$1$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$producer = interfaceC9544p;
        this.$result = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        SnapshotStateKt__ProduceStateKt$produceState$1$1 snapshotStateKt__ProduceStateKt$produceState$1$1 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(this.$producer, this.$result, interfaceC11588c);
        snapshotStateKt__ProduceStateKt$produceState$1$1.L$0 = obj;
        return snapshotStateKt__ProduceStateKt$produceState$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
            InterfaceC9544p interfaceC9544p = this.$producer;
            ProduceStateScopeImpl produceStateScopeImpl = new ProduceStateScopeImpl(this.$result, interfaceC11122i0.getCoroutineContext());
            this.label = 1;
            if (interfaceC9544p.invoke(produceStateScopeImpl, this) == objM25952f) {
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
        return ((SnapshotStateKt__ProduceStateKt$produceState$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
