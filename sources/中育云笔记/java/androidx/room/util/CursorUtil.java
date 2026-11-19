package androidx.room.util;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.MatrixCursor;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import cd.AbstractC5423b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p310qd.AbstractC10819z;
import p325rc.AbstractC10968r;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class CursorUtil {
    public static final Cursor copyAndClose(Cursor c10) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(c10, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(c10.getColumnNames(), c10.getCount());
            while (c10.moveToNext()) {
                Object[] objArr = new Object[c10.getColumnCount()];
                int columnCount = c10.getColumnCount();
                for (int i10 = 0; i10 < columnCount; i10++) {
                    int type = c10.getType(i10);
                    if (type == 0) {
                        objArr[i10] = null;
                    } else if (type == 1) {
                        objArr[i10] = Long.valueOf(c10.getLong(i10));
                    } else if (type == 2) {
                        objArr[i10] = Double.valueOf(c10.getDouble(i10));
                    } else if (type == 3) {
                        objArr[i10] = c10.getString(i10);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i10] = c10.getBlob(i10);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            AbstractC5423b.m2902a(c10, null);
            return matrixCursor;
        } finally {
        }
    }

    private static final int findColumnIndexBySuffix(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        AbstractC9979u.m20291d(columnNames);
        return findColumnIndexBySuffix(columnNames, str);
    }

    public static final int getColumnIndex(Cursor c10, String name) {
        AbstractC9979u.m20294g(c10, "c");
        AbstractC9979u.m20294g(name, "name");
        int columnIndex = c10.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c10.getColumnIndex('`' + name + '`');
        return columnIndex2 >= 0 ? columnIndex2 : findColumnIndexBySuffix(c10, name);
    }

    public static final int getColumnIndexOrThrow(Cursor c10, String name) {
        String strM24052K0;
        AbstractC9979u.m20294g(c10, "c");
        AbstractC9979u.m20294g(name, "name");
        int columnIndex = getColumnIndex(c10, name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = c10.getColumnNames();
            AbstractC9979u.m20293f(columnNames, "getColumnNames(...)");
            strM24052K0 = AbstractC10968r.m24052K0(columnNames, null, null, null, 0, null, null, 63, null);
        } catch (Exception unused) {
            strM24052K0 = "unknown";
        }
        throw new IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + strM24052K0);
    }

    public static final <R> R useCursor(Cursor cursor, InterfaceC9540l block) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(cursor, "<this>");
        AbstractC9979u.m20294g(block, "block");
        try {
            R r10 = (R) block.invoke(cursor);
            AbstractC9977s.m20286b(1);
            AbstractC5423b.m2902a(cursor, null);
            AbstractC9977s.m20285a(1);
            return r10;
        } finally {
        }
    }

    public static final Cursor wrapMappedColumns(Cursor cursor, final String[] columnNames, final int[] mapping) {
        AbstractC9979u.m20294g(cursor, "cursor");
        AbstractC9979u.m20294g(columnNames, "columnNames");
        AbstractC9979u.m20294g(mapping, "mapping");
        if (columnNames.length == mapping.length) {
            return new CursorWrapper(cursor) { // from class: androidx.room.util.CursorUtil.wrapMappedColumns.2
                @Override // android.database.CursorWrapper, android.database.Cursor
                public int getColumnIndex(String columnName) {
                    AbstractC9979u.m20294g(columnName, "columnName");
                    String[] strArr = columnNames;
                    int[] iArr = mapping;
                    int length = strArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        int i12 = i11 + 1;
                        if (AbstractC10819z.m23230C(strArr[i10], columnName, true)) {
                            return iArr[i11];
                        }
                        i10++;
                        i11 = i12;
                    }
                    return super.getColumnIndex(columnName);
                }
            };
        }
        throw new IllegalStateException("Expected columnNames.length == mapping.length");
    }

    @VisibleForTesting
    public static final int findColumnIndexBySuffix(String[] columnNames, String name) {
        AbstractC9979u.m20294g(columnNames, "columnNames");
        AbstractC9979u.m20294g(name, "name");
        String str = '.' + name;
        String str2 = '.' + name + '`';
        int length = columnNames.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            String str3 = columnNames[i10];
            int i12 = i11 + 1;
            if (str3.length() >= name.length() + 2 && (AbstractC10819z.m23229B(str3, str, false, 2, null) || (str3.charAt(0) == '`' && AbstractC10819z.m23229B(str3, str2, false, 2, null)))) {
                return i11;
            }
            i10++;
            i11 = i12;
        }
        return -1;
    }
}
