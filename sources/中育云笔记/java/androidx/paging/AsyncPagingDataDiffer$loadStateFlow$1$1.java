package androidx.paging;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1", m26211f = "AsyncPagingDataDiffer.kt", m26212l = {}, m26213m = "invokeSuspend", m26214v = 1)
/* loaded from: classes3.dex */
public final class AsyncPagingDataDiffer$loadStateFlow$1$1 extends SuspendLambda implements InterfaceC9544p {
    /* synthetic */ boolean Z$0;
    int label;

    public AsyncPagingDataDiffer$loadStateFlow$1$1(InterfaceC11588c<? super AsyncPagingDataDiffer$loadStateFlow$1$1> interfaceC11588c) {
        super(2, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        AsyncPagingDataDiffer$loadStateFlow$1$1 asyncPagingDataDiffer$loadStateFlow$1$1 = new AsyncPagingDataDiffer$loadStateFlow$1$1(interfaceC11588c);
        asyncPagingDataDiffer$loadStateFlow$1$1.Z$0 = ((Boolean) obj).booleanValue();
        return asyncPagingDataDiffer$loadStateFlow$1$1;
    }

    @Override // p181hd.InterfaceC9544p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (InterfaceC11588c<? super Boolean>) obj2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        return AbstractC11826a.m26206a(!this.Z$0);
    }

    public final Object invoke(boolean z10, InterfaceC11588c<? super Boolean> interfaceC11588c) {
        return ((AsyncPagingDataDiffer$loadStateFlow$1$1) create(Boolean.valueOf(z10), interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
