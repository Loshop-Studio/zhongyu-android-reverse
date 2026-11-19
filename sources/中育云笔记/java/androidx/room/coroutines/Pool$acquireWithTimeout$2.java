package androidx.room.coroutines;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.room.coroutines.Pool$acquireWithTimeout$2", m26211f = "ConnectionPoolImpl.kt", m26212l = {209}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class Pool$acquireWithTimeout$2 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ Ref$ObjectRef<ConnectionWithLock> $connection;
    Object L$0;
    int label;
    final /* synthetic */ Pool this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pool$acquireWithTimeout$2(Ref$ObjectRef<ConnectionWithLock> ref$ObjectRef, Pool pool, InterfaceC11588c<? super Pool$acquireWithTimeout$2> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$connection = ref$ObjectRef;
        this.this$0 = pool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new Pool$acquireWithTimeout$2(this.$connection, this.this$0, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref$ObjectRef<ConnectionWithLock> ref$ObjectRef;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            Ref$ObjectRef<ConnectionWithLock> ref$ObjectRef2 = this.$connection;
            Pool pool = this.this$0;
            this.L$0 = ref$ObjectRef2;
            this.label = 1;
            Object objAcquire = pool.acquire(this);
            if (objAcquire == objM25952f) {
                return objM25952f;
            }
            ref$ObjectRef = ref$ObjectRef2;
            obj = objAcquire;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = (Ref$ObjectRef) this.L$0;
            AbstractC9924b.m20071b(obj);
        }
        ref$ObjectRef.f23402c = obj;
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((Pool$acquireWithTimeout$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
