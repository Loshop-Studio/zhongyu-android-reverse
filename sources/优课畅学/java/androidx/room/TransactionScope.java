package androidx.room;

import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public interface TransactionScope<T> extends PooledConnection {
    Object rollback(T t10, InterfaceC9324c<?> interfaceC9324c);

    <R> Object withNestedTransaction(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super R> interfaceC9324c);
}
