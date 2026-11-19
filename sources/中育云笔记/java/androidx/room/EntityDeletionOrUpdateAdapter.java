package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.p019db.SupportSQLiteStatement;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

@InterfaceC10770a
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public abstract class EntityDeletionOrUpdateAdapter<T> extends SharedSQLiteStatement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityDeletionOrUpdateAdapter(RoomDatabase database) {
        super(database);
        AbstractC9979u.m20294g(database, "database");
    }

    public abstract void bind(SupportSQLiteStatement supportSQLiteStatement, T t10);

    @Override // androidx.room.SharedSQLiteStatement
    public abstract String createQuery();

    public final int handle(T t10) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            bind(supportSQLiteStatementAcquire, t10);
            return supportSQLiteStatementAcquire.executeUpdateDelete();
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final int handleMultiple(Iterable<? extends T> entities) {
        AbstractC9979u.m20294g(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            Iterator<? extends T> it = entities.iterator();
            int iExecuteUpdateDelete = 0;
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                iExecuteUpdateDelete += supportSQLiteStatementAcquire.executeUpdateDelete();
            }
            return iExecuteUpdateDelete;
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final int handleMultiple(T[] entities) {
        AbstractC9979u.m20294g(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            int iExecuteUpdateDelete = 0;
            for (T t10 : entities) {
                bind(supportSQLiteStatementAcquire, t10);
                iExecuteUpdateDelete += supportSQLiteStatementAcquire.executeUpdateDelete();
            }
            return iExecuteUpdateDelete;
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }
}
