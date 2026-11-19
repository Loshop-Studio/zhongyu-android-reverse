package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10947g0;

/* loaded from: classes3.dex */
final /* synthetic */ class SQLiteStatementUtil__StatementUtilKt {
    public static final int columnIndexOfCommon(SQLiteStatement sQLiteStatement, String name) {
        AbstractC9979u.m20294g(sQLiteStatement, "<this>");
        AbstractC9979u.m20294g(name, "name");
        if (sQLiteStatement instanceof MappedColumnsSQLiteStatementWrapper) {
            return ((MappedColumnsSQLiteStatementWrapper) sQLiteStatement).getColumnIndex(name);
        }
        int columnCount = sQLiteStatement.getColumnCount();
        for (int i10 = 0; i10 < columnCount; i10++) {
            if (AbstractC9979u.m20289b(name, sQLiteStatement.getColumnName(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int getColumnIndex(SQLiteStatement stmt, String name) {
        AbstractC9979u.m20294g(stmt, "stmt");
        AbstractC9979u.m20294g(name, "name");
        return SQLiteStatementUtil.columnIndexOf(stmt, name);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int getColumnIndexOrThrow(SQLiteStatement stmt, String name) {
        AbstractC9979u.m20294g(stmt, "stmt");
        AbstractC9979u.m20294g(name, "name");
        int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(stmt, name);
        if (iColumnIndexOf >= 0) {
            return iColumnIndexOf;
        }
        int columnCount = stmt.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i10 = 0; i10 < columnCount; i10++) {
            arrayList.add(stmt.getColumnName(i10));
        }
        throw new IllegalArgumentException("Column '" + name + "' does not exist. Available columns: [" + AbstractC10947g0.m23954w0(arrayList, null, null, null, 0, null, null, 63, null) + ']');
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final SQLiteStatement wrapMappedColumns(SQLiteStatement statement, String[] columnNames, int[] mapping) {
        AbstractC9979u.m20294g(statement, "statement");
        AbstractC9979u.m20294g(columnNames, "columnNames");
        AbstractC9979u.m20294g(mapping, "mapping");
        return new MappedColumnsSQLiteStatementWrapper(statement, columnNames, mapping);
    }
}
