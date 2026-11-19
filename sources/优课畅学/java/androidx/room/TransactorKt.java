package androidx.room;

import androidx.room.Transactor;
import androidx.sqlite.SQLiteStatement;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class TransactorKt {
    public static final <R> Object deferredTransaction(Transactor transactor, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super R> interfaceC9324c) {
        return transactor.withTransaction(Transactor.SQLiteTransactionType.DEFERRED, interfaceC10574p, interfaceC9324c);
    }

    public static final <R> Object exclusiveTransaction(Transactor transactor, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super R> interfaceC9324c) {
        return transactor.withTransaction(Transactor.SQLiteTransactionType.EXCLUSIVE, interfaceC10574p, interfaceC9324c);
    }

    public static final Object execSQL(PooledConnection pooledConnection, String str, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objUsePrepared = pooledConnection.usePrepared(str, new InterfaceC10570l() { // from class: androidx.room.w
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TransactorKt.execSQL$lambda$0((SQLiteStatement) obj));
            }
        }, interfaceC9324c);
        return objUsePrepared == AbstractC9434a.m17291f() ? objUsePrepared : C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean execSQL$lambda$0(SQLiteStatement it) {
        AbstractC9133u.m16133g(it, "it");
        return it.step();
    }

    public static final <R> Object immediateTransaction(Transactor transactor, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super R> interfaceC9324c) {
        return transactor.withTransaction(Transactor.SQLiteTransactionType.IMMEDIATE, interfaceC10574p, interfaceC9324c);
    }
}
