package androidx.paging;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1", m17801f = "AsyncPagingDataDiffer.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AsyncPagingDataDiffer$loadStateFlow$1$1 extends SuspendLambda implements InterfaceC10574p {
    /* synthetic */ boolean Z$0;
    int label;

    public AsyncPagingDataDiffer$loadStateFlow$1$1(InterfaceC9324c<? super AsyncPagingDataDiffer$loadStateFlow$1$1> interfaceC9324c) {
        super(2, interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        AsyncPagingDataDiffer$loadStateFlow$1$1 asyncPagingDataDiffer$loadStateFlow$1$1 = new AsyncPagingDataDiffer$loadStateFlow$1$1(interfaceC9324c);
        asyncPagingDataDiffer$loadStateFlow$1$1.Z$0 = ((Boolean) obj).booleanValue();
        return asyncPagingDataDiffer$loadStateFlow$1$1;
    }

    @Override // p300x7.InterfaceC10574p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (InterfaceC9324c<? super Boolean>) obj2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        return AbstractC9536a.m17796a(!this.Z$0);
    }

    public final Object invoke(boolean z10, InterfaceC9324c<? super Boolean> interfaceC9324c) {
        return ((AsyncPagingDataDiffer$loadStateFlow$1$1) create(Boolean.valueOf(z10), interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }
}
