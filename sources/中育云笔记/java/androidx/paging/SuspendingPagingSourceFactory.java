package androidx.paging;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11106e0;
import sd.AbstractC11109f;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class SuspendingPagingSourceFactory<Key, Value> implements InterfaceC9529a {
    private final InterfaceC9529a delegate;
    private final AbstractC11106e0 dispatcher;

    @InterfaceC11829d(m26210c = "androidx.paging.SuspendingPagingSourceFactory$create$2", m26211f = "SuspendingPagingSourceFactory.jvmAndAndroid.kt", m26212l = {}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.SuspendingPagingSourceFactory$create$2 */
    public static final class C42942 extends SuspendLambda implements InterfaceC9544p {
        int label;
        final /* synthetic */ SuspendingPagingSourceFactory<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42942(SuspendingPagingSourceFactory<Key, Value> suspendingPagingSourceFactory, InterfaceC11588c<? super C42942> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = suspendingPagingSourceFactory;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C42942(this.this$0, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return ((SuspendingPagingSourceFactory) this.this$0).delegate.invoke();
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super PagingSource<Key, Value>> interfaceC11588c) {
            return ((C42942) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public SuspendingPagingSourceFactory(AbstractC11106e0 dispatcher, InterfaceC9529a delegate) {
        AbstractC9979u.m20294g(dispatcher, "dispatcher");
        AbstractC9979u.m20294g(delegate, "delegate");
        this.dispatcher = dispatcher;
        this.delegate = delegate;
    }

    public final Object create(InterfaceC11588c<? super PagingSource<Key, Value>> interfaceC11588c) {
        return AbstractC11109f.m24709g(this.dispatcher, new C42942(this, null), interfaceC11588c);
    }

    @Override // p181hd.InterfaceC9529a
    public PagingSource<Key, Value> invoke() {
        return (PagingSource) this.delegate.invoke();
    }
}
