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
/* loaded from: classes2.dex */
public class C3390g {
    /* renamed from: a */
    public static boolean m3154a(String str, SQLiteDatabase sQLiteDatabase) {
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
    public static String m3155b(Context context) {
        return context.getDatabasePath(C3387d.f2047b).getParent() + File.separator;
    }

    /* renamed from: c */
    public static String m3157c(Context context) {
        return m3155b(context) + "subprocess/";
    }

    /* renamed from: b */
    public static List<String> m3156b(List<String> list) {
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
    public static void m3151a(Context context) {
        if (context == null) {
            return;
        }
        try {
            File databasePath = context.getDatabasePath(C3387d.f2047b);
            if (databasePath != null && databasePath.exists()) {
                databasePath.delete();
            }
            C3388e.m3134a(context).m3143a();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static String m3149a(List<String> list) {
        return TextUtils.join("!", list);
    }

    /* renamed from: a */
    public static List<String> m3150a(String str) {
        return new ArrayList(Arrays.asList(str.split("!")));
    }

    /* renamed from: a */
    public static boolean m3153a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        boolean z3 = false;
        Cursor cursorRawQuery = null;
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
    public static void m3152a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        sQLiteDatabase.execSQL("alter table " + str + " add " + str2 + " " + str3);
    }
}
