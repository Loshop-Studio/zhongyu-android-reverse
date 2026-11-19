package androidx.paging;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineDispatcher;
import p123h7.C8736p;
import p135i8.AbstractC8833f;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class SuspendingPagingSourceFactory<Key, Value> implements InterfaceC10559a {
    private final InterfaceC10559a delegate;
    private final CoroutineDispatcher dispatcher;

    @InterfaceC9539d(m17800c = "androidx.paging.SuspendingPagingSourceFactory$create$2", m17801f = "SuspendingPagingSourceFactory.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.SuspendingPagingSourceFactory$create$2 */
    public static final class C43912 extends SuspendLambda implements InterfaceC10574p {
        int label;
        final /* synthetic */ SuspendingPagingSourceFactory<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43912(SuspendingPagingSourceFactory<Key, Value> suspendingPagingSourceFactory, InterfaceC9324c<? super C43912> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = suspendingPagingSourceFactory;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C43912(this.this$0, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super PagingSource<Key, Value>> interfaceC9324c) {
            return ((C43912) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return ((SuspendingPagingSourceFactory) this.this$0).delegate.invoke();
        }
    }

    public SuspendingPagingSourceFactory(CoroutineDispatcher dispatcher, InterfaceC10559a delegate) {
        AbstractC9133u.m16133g(dispatcher, "dispatcher");
        AbstractC9133u.m16133g(delegate, "delegate");
        this.dispatcher = dispatcher;
        this.delegate = delegate;
    }

    public final Object create(InterfaceC9324c<? super PagingSource<Key, Value>> interfaceC9324c) {
        return AbstractC8833f.m14848g(this.dispatcher, new C43912(this, null), interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10559a
    public PagingSource<Key, Value> invoke() {
        return (PagingSource) this.delegate.invoke();
    }
}
