package p144r0;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;

/* renamed from: r0.b */
/* loaded from: classes.dex */
public class C3020b {
    /* renamed from: a */
    public static Cursor m10139a(Cursor cursor) {
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                for (int i4 = 0; i4 < cursor.getColumnCount(); i4++) {
                    int type = cursor.getType(i4);
                    if (type == 0) {
                        objArr[i4] = null;
                    } else if (type == 1) {
                        objArr[i4] = Long.valueOf(cursor.getLong(i4));
                    } else if (type == 2) {
                        objArr[i4] = Double.valueOf(cursor.getDouble(i4));
                    } else if (type == 3) {
                        objArr[i4] = cursor.getString(i4);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i4] = cursor.getBlob(i4);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            return matrixCursor;
        } finally {
            cursor.close();
        }
    }

    /* renamed from: b */
    private static int m10140b(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            return m10141c(cursor.getColumnNames(), str);
        }
        return -1;
    }

    /* renamed from: c */
    static int m10141c(String[] strArr, String str) {
        String str2 = "." + str;
        String str3 = "." + str + "`";
        for (int i4 = 0; i4 < strArr.length; i4++) {
            String str4 = strArr[i4];
            if (str4.length() >= str.length() + 2) {
                if (str4.endsWith(str2)) {
                    return i4;
                }
                if (str4.charAt(0) == '`' && str4.endsWith(str3)) {
                    return i4;
                }
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static int m10142d(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + "`");
        return columnIndex2 >= 0 ? columnIndex2 : m10140b(cursor, str);
    }

    /* renamed from: e */
    public static int m10143e(Cursor cursor, String str) {
        String string;
        int iM10142d = m10142d(cursor, str);
        if (iM10142d >= 0) {
            return iM10142d;
        }
        try {
            string = Arrays.toString(cursor.getColumnNames());
        } catch (Exception e4) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e4);
            string = "";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + string);
    }
}
