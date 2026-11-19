package androidx.room.coroutines;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.room.coroutines.Pool$acquireWithTimeout$2", m17801f = "ConnectionPoolImpl.kt", m17802l = {TbsListener.ErrorCode.DEXOPT_EXCEPTION}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class Pool$acquireWithTimeout$2 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ Ref$ObjectRef<ConnectionWithLock> $connection;
    Object L$0;
    int label;
    final /* synthetic */ Pool this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pool$acquireWithTimeout$2(Ref$ObjectRef<ConnectionWithLock> ref$ObjectRef, Pool pool, InterfaceC9324c<? super Pool$acquireWithTimeout$2> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$connection = ref$ObjectRef;
        this.this$0 = pool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new Pool$acquireWithTimeout$2(this.$connection, this.this$0, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((Pool$acquireWithTimeout$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref$ObjectRef<ConnectionWithLock> ref$ObjectRef;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            Ref$ObjectRef<ConnectionWithLock> ref$ObjectRef2 = this.$connection;
            Pool pool = this.this$0;
            this.L$0 = ref$ObjectRef2;
            this.label = 1;
            Object objAcquire = pool.acquire(this);
            if (objAcquire == objM17291f) {
                return objM17291f;
            }
            ref$ObjectRef = ref$ObjectRef2;
            obj = objAcquire;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = (Ref$ObjectRef) this.L$0;
            AbstractC9079b.m15926b(obj);
        }
        ref$ObjectRef.f17473a = obj;
        return C8736p.f16368a;
    }
}
