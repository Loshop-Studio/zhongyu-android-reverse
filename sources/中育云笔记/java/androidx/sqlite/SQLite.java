package androidx.sqlite;

import android.database.SQLException;
import kotlin.jvm.internal.AbstractC9979u;
import p152fd.AbstractC9223a;

/* loaded from: classes3.dex */
public final class SQLite {
    public static final int SQLITE_DATA_BLOB = 4;
    public static final int SQLITE_DATA_FLOAT = 2;
    public static final int SQLITE_DATA_INTEGER = 1;
    public static final int SQLITE_DATA_NULL = 5;
    public static final int SQLITE_DATA_TEXT = 3;

    public static final void execSQL(SQLiteConnection sQLiteConnection, String sql) throws Exception {
        AbstractC9979u.m20294g(sQLiteConnection, "<this>");
        AbstractC9979u.m20294g(sql, "sql");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(sql);
        try {
            sQLiteStatementPrepare.step();
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
        } finally {
        }
    }

    public static final Void throwSQLiteException(int i10, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error code: " + i10);
        if (str != null) {
            sb2.append(", message: " + str);
        }
        throw new SQLException(sb2.toString());
    }
}
