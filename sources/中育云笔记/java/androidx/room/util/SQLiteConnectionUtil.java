package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import kotlin.jvm.internal.AbstractC9979u;
import p152fd.AbstractC9223a;

/* loaded from: classes3.dex */
public final class SQLiteConnectionUtil {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final long getLastInsertedRowId(SQLiteConnection connection) throws Exception {
        AbstractC9979u.m20294g(connection, "connection");
        if (getTotalChangedRows(connection) == 0) {
            return -1L;
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("SELECT last_insert_rowid()");
        try {
            sQLiteStatementPrepare.step();
            long j10 = sQLiteStatementPrepare.getLong(0);
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
            return j10;
        } finally {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int getTotalChangedRows(SQLiteConnection connection) throws Exception {
        AbstractC9979u.m20294g(connection, "connection");
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("SELECT changes()");
        try {
            sQLiteStatementPrepare.step();
            int i10 = (int) sQLiteStatementPrepare.getLong(0);
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
            return i10;
        } finally {
        }
    }
}
