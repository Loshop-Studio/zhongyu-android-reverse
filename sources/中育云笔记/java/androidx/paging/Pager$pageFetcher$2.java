package androidx.paging;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.Pager$pageFetcher$2", m26211f = "Pager.kt", m26212l = {}, m26213m = "invokeSuspend", m26214v = 1)
/* loaded from: classes3.dex */
public final class Pager$pageFetcher$2 extends SuspendLambda implements InterfaceC9540l {
    final /* synthetic */ InterfaceC9529a $pagingSourceFactory;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pager$pageFetcher$2(InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super Pager$pageFetcher$2> interfaceC11588c) {
        super(1, interfaceC11588c);
        this.$pagingSourceFactory = interfaceC9529a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(InterfaceC11588c<?> interfaceC11588c) {
        return new Pager$pageFetcher$2(this.$pagingSourceFactory, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        return this.$pagingSourceFactory.invoke();
    }

    @Override // p181hd.InterfaceC9540l
    public final Object invoke(InterfaceC11588c<? super PagingSource<Key, Value>> interfaceC11588c) {
        return ((Pager$pageFetcher$2) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
