package com.umeng.analytics.pro;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.umeng.analytics.pro.g */
/* loaded from: classes.dex */
public class C1906g {
    /* renamed from: a */
    public static boolean m7077a(String str, SQLiteDatabase sQLiteDatabase) {
        boolean z3 = false;
        if (str == null) {
            return false;
        }
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("select count(*) as c from sqlite_master where type=? and name=?", new String[]{"table", str.trim()});
            if (cursorRawQuery.moveToNext()) {
                if (cursorRawQuery.getInt(0) > 0) {
                    z3 = true;
                }
            }
        } catch (Exception unused) {
            if (cursorRawQuery != null) {
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        cursorRawQuery.close();
        return z3;
    }

    /* renamed from: b */
    public static String m7078b(Context context) {
        return context.getDatabasePath(C1903d.f8639b).getParent() + File.separator;
    }

    /* renamed from: c */
    public static String m7080c(Context context) {
        return m7078b(context) + "subprocess/";
    }

    /* renamed from: b */
    public static List<String> m7079b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : list) {
                if (Collections.frequency(arrayList, str) < 1) {
                    arrayList.add(str);
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m7074a(Context context) {
        if (context == null) {
            return;
        }
        try {
            File databasePath = context.getDatabasePath(C1903d.f8639b);
            if (databasePath != null && databasePath.exists()) {
                databasePath.delete();
            }
            C1904e.m7057a(context).m7066a();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static String m7072a(List<String> list) {
        return TextUtils.join("!", list);
    }

    /* renamed from: a */
    public static List<String> m7073a(String str) {
        return new ArrayList(Arrays.asList(str.split("!")));
    }

    /* renamed from: a */
    public static boolean m7076a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Cursor cursorRawQuery = null;
        boolean z3 = false;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
            if (cursorRawQuery != null) {
                if (cursorRawQuery.getColumnIndex(str2) != -1) {
                    z3 = true;
                }
            }
        } catch (Exception unused) {
            if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
            cursorRawQuery.close();
        }
        return z3;
    }

    /* renamed from: a */
    public static void m7075a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        sQLiteDatabase.execSQL("alter table " + str + " add " + str2 + " " + str3);
    }
}
