package androidx.paging;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@InterfaceC9539d(m17800c = "androidx.paging.Pager$flow$2", m17801f = "Pager.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class Pager$flow$2 extends SuspendLambda implements InterfaceC10570l {
    final /* synthetic */ InterfaceC10559a $pagingSourceFactory;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pager$flow$2(InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super Pager$flow$2> interfaceC9324c) {
        super(1, interfaceC9324c);
        this.$pagingSourceFactory = interfaceC10559a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
        return new Pager$flow$2(this.$pagingSourceFactory, interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        return this.$pagingSourceFactory.invoke();
    }

    @Override // p300x7.InterfaceC10570l
    public final Object invoke(InterfaceC9324c<? super PagingSource<Key, Value>> interfaceC9324c) {
        return ((Pager$flow$2) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }
}
