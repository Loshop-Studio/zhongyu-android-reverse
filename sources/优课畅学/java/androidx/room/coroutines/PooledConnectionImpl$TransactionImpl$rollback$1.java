package androidx.room.coroutines;

import androidx.room.coroutines.PooledConnectionImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "androidx.room.coroutines.PooledConnectionImpl$TransactionImpl", m17801f = "ConnectionPoolImpl.kt", m17802l = {573}, m17803m = "rollback")
/* loaded from: classes3.dex */
public final class PooledConnectionImpl$TransactionImpl$rollback$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PooledConnectionImpl.TransactionImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PooledConnectionImpl$TransactionImpl$rollback$1(PooledConnectionImpl.TransactionImpl<T> transactionImpl, InterfaceC9324c<? super PooledConnectionImpl$TransactionImpl$rollback$1> interfaceC9324c) {
        super(interfaceC9324c);
        this.this$0 = transactionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.rollback(null, this);
    }
}
