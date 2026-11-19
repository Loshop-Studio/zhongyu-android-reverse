package androidx.work.impl;

import androidx.work.impl.WorkerWrapper;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.work.impl.WorkerWrapper$launch$1$resolution$1", m26211f = "WorkerWrapper.kt", m26212l = {98}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class WorkerWrapper$launch$1$resolution$1 extends SuspendLambda implements InterfaceC9544p {
    int label;
    final /* synthetic */ WorkerWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerWrapper$launch$1$resolution$1(WorkerWrapper workerWrapper, InterfaceC11588c<? super WorkerWrapper$launch$1$resolution$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = workerWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new WorkerWrapper$launch$1$resolution$1(this.this$0, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return obj;
        }
        AbstractC9924b.m20071b(obj);
        WorkerWrapper workerWrapper = this.this$0;
        this.label = 1;
        Object objRunWorker = workerWrapper.runWorker(this);
        return objRunWorker == objM25952f ? objM25952f : objRunWorker;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super WorkerWrapper.Resolution> interfaceC11588c) {
        return ((WorkerWrapper$launch$1$resolution$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
