package androidx.room;

import p181hd.InterfaceC9544p;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public interface TransactionScope<T> extends PooledConnection {
    Object rollback(T t10, InterfaceC11588c<?> interfaceC11588c);

    <R> Object withNestedTransaction(InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super R> interfaceC11588c);
}
