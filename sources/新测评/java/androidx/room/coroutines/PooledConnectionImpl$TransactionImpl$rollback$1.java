package androidx.room.coroutines;

import androidx.room.coroutines.PooledConnectionImpl;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.room.coroutines.PooledConnectionImpl$TransactionImpl", m13596f = "ConnectionPoolImpl.kt", m13597i = {0, 0}, m13598l = {573}, m13599m = "rollback", m13600n = {"result", "$this$withLock_u24default$iv"}, m13601s = {"L$0", "L$2"})
/* loaded from: classes3.dex */
public final class PooledConnectionImpl$TransactionImpl$rollback$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PooledConnectionImpl.TransactionImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PooledConnectionImpl$TransactionImpl$rollback$1(PooledConnectionImpl.TransactionImpl<T> transactionImpl, Continuation<? super PooledConnectionImpl$TransactionImpl$rollback$1> continuation) {
        super(continuation);
        this.this$0 = transactionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.rollback(null, this);
    }
}
