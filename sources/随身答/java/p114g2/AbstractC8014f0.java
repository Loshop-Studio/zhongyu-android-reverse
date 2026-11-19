package p114g2;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* renamed from: g2.f0 */
/* loaded from: classes4.dex */
public abstract class AbstractC8014f0 {
    /* renamed from: a */
    public static void m12593a(Context context) {
        if (context == null) {
            return;
        }
        try {
            File databasePath = context.getDatabasePath("ua.db");
            if (databasePath != null && databasePath.exists()) {
                databasePath.delete();
            }
            C8010d0.m12574a(context).m12576c();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static void m12594b(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        sQLiteDatabase.execSQL("alter table " + str + " add " + str2 + " " + str3);
    }

    /* renamed from: c */
    public static boolean m12595c(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        boolean z9 = false;
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
            if (cursorRawQuery != null) {
                if (cursorRawQuery.getColumnIndex(str2) != -1) {
                    z9 = true;
                }
            }
            if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
                cursorRawQuery.close();
            }
            return z9;
        } catch (Exception unused) {
            if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
                cursorRawQuery.close();
            }
            return false;
        } catch (Throwable th) {
            if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* renamed from: d */
    public static boolean m12596d(String str, SQLiteDatabase sQLiteDatabase) {
        boolean z9 = false;
        if (str == null) {
            return false;
        }
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("select count(*) as c from sqlite_master where type=? and name=?", new String[]{"table", str.trim()});
            if (cursorRawQuery.moveToNext()) {
                if (cursorRawQuery.getInt(0) > 0) {
                    z9 = true;
                }
            }
            cursorRawQuery.close();
            return z9;
        } catch (Exception unused) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return false;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* renamed from: e */
    public static String m12597e(Context context) {
        return context.getDatabasePath("ua.db").getParent() + File.separator;
    }
}
