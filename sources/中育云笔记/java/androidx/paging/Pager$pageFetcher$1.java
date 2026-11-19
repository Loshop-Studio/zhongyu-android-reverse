package androidx.paging;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9540l;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final /* synthetic */ class Pager$pageFetcher$1 extends FunctionReferenceImpl implements InterfaceC9540l {
    public Pager$pageFetcher$1(Object obj) {
        super(1, obj, SuspendingPagingSourceFactory.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // p181hd.InterfaceC9540l
    public final Object invoke(InterfaceC11588c<? super PagingSource<Key, Value>> interfaceC11588c) {
        return ((SuspendingPagingSourceFactory) this.receiver).create(interfaceC11588c);
    }
}
