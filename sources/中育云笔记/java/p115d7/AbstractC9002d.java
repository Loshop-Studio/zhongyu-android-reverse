package p115d7;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import p146f7.AbstractC9204c;

/* renamed from: d7.d */
/* loaded from: classes5.dex */
public abstract class AbstractC9002d {
    /* renamed from: a */
    public static boolean m17582a(SQLiteDatabase sQLiteDatabase, C9004f c9004f) {
        if (!m17583b(sQLiteDatabase, c9004f.f20979a)) {
            return true;
        }
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select * from " + c9004f.f20979a, null);
        if (cursorRawQuery == null) {
            return false;
        }
        try {
            int iM17593c = c9004f.m17593c();
            if (iM17593c != cursorRawQuery.getColumnCount()) {
                return true;
            }
            for (int i10 = 0; i10 < iM17593c; i10++) {
                if (c9004f.m17594d(cursorRawQuery.getColumnName(i10)) == -1) {
                    return true;
                }
            }
            return false;
        } finally {
            cursorRawQuery.close();
        }
    }

    /* renamed from: b */
    public static boolean m17583b(SQLiteDatabase sQLiteDatabase, String str) {
        int i10;
        if (str == null || sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return false;
        }
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*) FROM sqlite_master WHERE type = ? AND name = ?", new String[]{"table", str});
            } catch (Exception e10) {
                AbstractC9204c.m18111a(e10);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                i10 = 0;
            }
            if (!cursorRawQuery.moveToFirst()) {
                cursorRawQuery.close();
                return false;
            }
            i10 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i10 > 0;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }
}
