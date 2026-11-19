package androidx.paging;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public /* synthetic */ class Pager$flow$1 extends FunctionReferenceImpl implements InterfaceC10570l {
    public Pager$flow$1(Object obj) {
        super(1, obj, SuspendingPagingSourceFactory.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // p300x7.InterfaceC10570l
    public final Object invoke(InterfaceC9324c<? super PagingSource<Key, Value>> interfaceC9324c) {
        return ((SuspendingPagingSourceFactory) this.receiver).create(interfaceC9324c);
    }
}
