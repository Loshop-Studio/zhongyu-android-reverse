package androidx.room.util;

import android.os.Build;
import androidx.sqlite.SQLiteStatement;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10819z;

/* loaded from: classes3.dex */
final /* synthetic */ class SQLiteStatementUtil__StatementUtil_androidKt {
    public static final int columnIndexOf(SQLiteStatement sQLiteStatement, String name) {
        AbstractC9979u.m20294g(sQLiteStatement, "<this>");
        AbstractC9979u.m20294g(name, "name");
        int iColumnIndexOfCommon = SQLiteStatementUtil.columnIndexOfCommon(sQLiteStatement, name);
        if (iColumnIndexOfCommon >= 0) {
            return iColumnIndexOfCommon;
        }
        int iColumnIndexOfCommon2 = SQLiteStatementUtil.columnIndexOfCommon(sQLiteStatement, '`' + name + '`');
        return iColumnIndexOfCommon2 >= 0 ? iColumnIndexOfCommon2 : m2109x9cb9e9e(sQLiteStatement, name);
    }

    /* renamed from: findColumnIndexBySuffix$SQLiteStatementUtil__StatementUtil_androidKt */
    private static final int m2109x9cb9e9e(SQLiteStatement sQLiteStatement, String str) {
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount = sQLiteStatement.getColumnCount();
            String str2 = '.' + str;
            String str3 = '.' + str + '`';
            for (int i10 = 0; i10 < columnCount; i10++) {
                String columnName = sQLiteStatement.getColumnName(i10);
                if (columnName.length() >= str.length() + 2 && (AbstractC10819z.m23229B(columnName, str2, false, 2, null) || (columnName.charAt(0) == '`' && AbstractC10819z.m23229B(columnName, str3, false, 2, null)))) {
                    return i10;
                }
            }
        }
        return -1;
    }
}
