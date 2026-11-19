package androidx.room;

import androidx.room.Transactor;
import androidx.sqlite.SQLiteStatement;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class TransactorKt {
    public static final <R> Object deferredTransaction(Transactor transactor, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super R> interfaceC11588c) {
        return transactor.withTransaction(Transactor.SQLiteTransactionType.DEFERRED, interfaceC9544p, interfaceC11588c);
    }

    public static final <R> Object exclusiveTransaction(Transactor transactor, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super R> interfaceC11588c) {
        return transactor.withTransaction(Transactor.SQLiteTransactionType.EXCLUSIVE, interfaceC9544p, interfaceC11588c);
    }

    public static final Object execSQL(PooledConnection pooledConnection, String str, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objUsePrepared = pooledConnection.usePrepared(str, new InterfaceC9540l() { // from class: androidx.room.w
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TransactorKt.execSQL$lambda$0((SQLiteStatement) obj));
            }
        }, interfaceC11588c);
        return objUsePrepared == AbstractC11725a.m25952f() ? objUsePrepared : C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean execSQL$lambda$0(SQLiteStatement it) {
        AbstractC9979u.m20294g(it, "it");
        return it.step();
    }

    public static final <R> Object immediateTransaction(Transactor transactor, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super R> interfaceC11588c) {
        return transactor.withTransaction(Transactor.SQLiteTransactionType.IMMEDIATE, interfaceC9544p, interfaceC11588c);
    }
}
