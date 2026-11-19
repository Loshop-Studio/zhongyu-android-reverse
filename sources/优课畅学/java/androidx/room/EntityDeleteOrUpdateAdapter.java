package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9117e;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p278v7.AbstractC10251a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public abstract class EntityDeleteOrUpdateAdapter<T> {
    public abstract void bind(SQLiteStatement sQLiteStatement, T t10);

    public abstract String createQuery();

    public final int handle(SQLiteConnection connection, T t10) throws Exception {
        AbstractC9133u.m16133g(connection, "connection");
        if (t10 == null) {
            return 0;
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            bind(sQLiteStatementPrepare, t10);
            sQLiteStatementPrepare.step();
            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
            return SQLiteConnectionUtil.getTotalChangedRows(connection);
        } finally {
        }
    }

    public final int handleMultiple(SQLiteConnection connection, Iterable<? extends T> iterable) throws Exception {
        AbstractC9133u.m16133g(connection, "connection");
        int totalChangedRows = 0;
        if (iterable == null) {
            return 0;
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            for (T t10 : iterable) {
                if (t10 != null) {
                    bind(sQLiteStatementPrepare, t10);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    totalChangedRows += SQLiteConnectionUtil.getTotalChangedRows(connection);
                }
            }
            C8736p c8736p = C8736p.f16368a;
            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
            return totalChangedRows;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int handleMultiple(SQLiteConnection connection, T[] tArr) throws Exception {
        AbstractC9133u.m16133g(connection, "connection");
        int totalChangedRows = 0;
        if (tArr == null) {
            return 0;
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            Iterator itM16110a = AbstractC9117e.m16110a(tArr);
            while (itM16110a.hasNext()) {
                Object next = itM16110a.next();
                if (next != null) {
                    bind(sQLiteStatementPrepare, next);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    totalChangedRows += SQLiteConnectionUtil.getTotalChangedRows(connection);
                }
            }
            C8736p c8736p = C8736p.f16368a;
            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
            return totalChangedRows;
        } finally {
        }
    }
}
