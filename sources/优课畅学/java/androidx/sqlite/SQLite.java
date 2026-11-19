package androidx.sqlite;

import android.database.SQLException;
import kotlin.jvm.internal.AbstractC9133u;
import p278v7.AbstractC10251a;

/* loaded from: classes3.dex */
public final class SQLite {
    public static final int SQLITE_DATA_BLOB = 4;
    public static final int SQLITE_DATA_FLOAT = 2;
    public static final int SQLITE_DATA_INTEGER = 1;
    public static final int SQLITE_DATA_NULL = 5;
    public static final int SQLITE_DATA_TEXT = 3;

    public static final void execSQL(SQLiteConnection sQLiteConnection, String sql) throws Exception {
        AbstractC9133u.m16133g(sQLiteConnection, "<this>");
        AbstractC9133u.m16133g(sql, "sql");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(sql);
        try {
            sQLiteStatementPrepare.step();
            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
        } finally {
        }
    }

    public static final Void throwSQLiteException(int i10, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i10);
        if (str != null) {
            sb.append(", message: " + str);
        }
        throw new SQLException(sb.toString());
    }
}
