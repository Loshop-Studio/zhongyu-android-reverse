package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9963e;
import kotlin.jvm.internal.AbstractC9979u;
import p152fd.AbstractC9223a;
import p309qc.C10786q;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public abstract class EntityDeleteOrUpdateAdapter<T> {
    public abstract void bind(SQLiteStatement sQLiteStatement, T t10);

    public abstract String createQuery();

    public final int handle(SQLiteConnection connection, T t10) throws Exception {
        AbstractC9979u.m20294g(connection, "connection");
        if (t10 == null) {
            return 0;
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            bind(sQLiteStatementPrepare, t10);
            sQLiteStatementPrepare.step();
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
            return SQLiteConnectionUtil.getTotalChangedRows(connection);
        } finally {
        }
    }

    public final int handleMultiple(SQLiteConnection connection, Iterable<? extends T> iterable) throws Exception {
        AbstractC9979u.m20294g(connection, "connection");
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
            C10786q c10786q = C10786q.f26013a;
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
            return totalChangedRows;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int handleMultiple(SQLiteConnection connection, T[] tArr) throws Exception {
        AbstractC9979u.m20294g(connection, "connection");
        int totalChangedRows = 0;
        if (tArr == null) {
            return 0;
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            Iterator itM20268a = AbstractC9963e.m20268a(tArr);
            while (itM20268a.hasNext()) {
                Object next = itM20268a.next();
                if (next != null) {
                    bind(sQLiteStatementPrepare, next);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    totalChangedRows += SQLiteConnectionUtil.getTotalChangedRows(connection);
                }
            }
            C10786q c10786q = C10786q.f26013a;
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
            return totalChangedRows;
        } finally {
        }
    }
}
