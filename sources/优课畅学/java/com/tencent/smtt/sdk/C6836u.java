package com.tencent.smtt.sdk;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.smtt.utils.C6854k;
import com.tencent.smtt.utils.TbsLog;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.tencent.smtt.sdk.u */
/* loaded from: classes4.dex */
public class C6836u {

    /* renamed from: a */
    public static final String f6929a = CookieManager.LOGTAG;

    /* renamed from: b */
    static File f6930b;

    /* renamed from: a */
    public static File m6234a(Context context) {
        if (f6930b == null && context != null) {
            f6930b = new File(context.getDir("webview", 0), "Cookies");
        }
        if (f6930b == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("/data/data/");
            sb.append(context.getPackageName());
            String str = File.separator;
            sb.append(str);
            sb.append("app_webview");
            sb.append(str);
            sb.append("Cookies");
            f6930b = new File(sb.toString());
        }
        return f6930b;
    }

    /* renamed from: b */
    public static boolean m6238b(Context context) {
        if (context == null) {
            return false;
        }
        C6854k.m6302a(m6234a(context), false);
        return true;
    }

    /* renamed from: c */
    public static SQLiteDatabase m6239c(Context context) {
        File fileM6234a;
        SQLiteDatabase sQLiteDatabaseOpenDatabase = null;
        if (context == null || (fileM6234a = m6234a(context)) == null) {
            return null;
        }
        try {
            sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(fileM6234a.getAbsolutePath(), null, 0);
        } catch (Exception unused) {
        }
        if (sQLiteDatabaseOpenDatabase == null) {
            TbsLog.m6248i(f6929a, "dbPath is not exist!");
        }
        return sQLiteDatabaseOpenDatabase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        r1 = java.lang.Integer.parseInt(r0.getString(1));
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m6240d(android.content.Context r4) {
        /*
            java.lang.System.currentTimeMillis()
            r0 = 0
            r1 = 0
            android.database.sqlite.SQLiteDatabase r4 = m6239c(r4)     // Catch: java.lang.Throwable -> L56
            if (r4 != 0) goto L18
            r0 = -1
            if (r4 == 0) goto L17
            boolean r1 = r4.isOpen()
            if (r1 == 0) goto L17
            r4.close()
        L17:
            return r0
        L18:
            java.lang.String r2 = "select * from meta"
            android.database.Cursor r0 = r4.rawQuery(r2, r0)     // Catch: java.lang.Throwable -> L57
            int r2 = r0.getCount()     // Catch: java.lang.Throwable -> L57
            r0.getColumnCount()     // Catch: java.lang.Throwable -> L57
            if (r2 <= 0) goto L49
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L49
        L2d:
            java.lang.String r2 = r0.getString(r1)     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "version"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L43
            r2 = 1
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Throwable -> L57
            int r1 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L57
            goto L49
        L43:
            boolean r2 = r0.moveToNext()     // Catch: java.lang.Throwable -> L57
            if (r2 != 0) goto L2d
        L49:
            r0.close()
            boolean r0 = r4.isOpen()
            if (r0 == 0) goto L55
            r4.close()
        L55:
            return r1
        L56:
            r4 = r0
        L57:
            if (r0 == 0) goto L5c
            r0.close()
        L5c:
            if (r4 == 0) goto L67
            boolean r0 = r4.isOpen()
            if (r0 == 0) goto L67
            r4.close()
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C6836u.m6240d(android.content.Context):int");
    }

    /* renamed from: a */
    private static String m6235a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select * from " + str, null);
        int count = cursorRawQuery.getCount();
        int columnCount = cursorRawQuery.getColumnCount();
        StringBuilder sb = new StringBuilder();
        sb.append("raws:" + count + ",columns:" + columnCount + SignParameters.NEW_LINE);
        if (count > 0 && cursorRawQuery.moveToFirst()) {
            do {
                sb.append(SignParameters.NEW_LINE);
                for (int i10 = 0; i10 < columnCount; i10++) {
                    try {
                        sb.append(cursorRawQuery.getString(i10));
                        sb.append(",");
                    } catch (Exception unused) {
                    }
                }
                sb.append(SignParameters.NEW_LINE);
            } while (cursorRawQuery.moveToNext());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static ArrayList<String> m6236a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorRawQuery = null;
        if (sQLiteDatabase == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("select * from sqlite_master where type='table'", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    String string = cursorRawQuery.getString(1);
                    cursorRawQuery.getString(4);
                    arrayList.add(string);
                    m6235a(sQLiteDatabase, string);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            if (sQLiteDatabase.isOpen()) {
                sQLiteDatabase.close();
                return arrayList;
            }
        } catch (Throwable unused) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            if (sQLiteDatabase.isOpen()) {
                sQLiteDatabase.close();
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m6237a(android.content.Context r8, com.tencent.smtt.sdk.CookieManager.EnumC6758a r9, java.lang.String r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C6836u.m6237a(android.content.Context, com.tencent.smtt.sdk.CookieManager$a, java.lang.String, boolean, boolean):void");
    }
}
