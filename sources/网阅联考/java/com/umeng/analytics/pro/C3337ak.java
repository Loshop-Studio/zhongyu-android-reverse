package com.umeng.analytics.pro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.commonsdk.debug.UMRTLog;

/* renamed from: com.umeng.analytics.pro.ak */
/* loaded from: classes2.dex */
public class C3337ak extends SQLiteOpenHelper {

    /* renamed from: b */
    private static final Object f1791b = new Object();

    /* renamed from: c */
    private static C3337ak f1792c = null;

    /* renamed from: d */
    private static final String f1793d = "CREATE TABLE IF NOT EXISTS stf(_id INTEGER PRIMARY KEY AUTOINCREMENT, _tp TEXT, _hd TEXT, _bd TEXT, _ts TEXT, _uuid TEXT, _re1 TEXT, _re2 TEXT)";

    /* renamed from: e */
    private static final String f1794e = "DROP TABLE IF EXISTS stf";

    /* renamed from: f */
    private static final String f1795f = "DELETE FROM stf WHERE _id IN( SELECT _id FROM stf ORDER BY _id LIMIT 1)";

    /* renamed from: a */
    private final Context f1796a;

    private C3337ak(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i4) {
        super(context, str, cursorFactory, i4);
        this.f1796a = context;
    }

    /* renamed from: a */
    public static final int m2923a() {
        return 1;
    }

    /* renamed from: b */
    private void m2926b(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            sQLiteDatabase.execSQL(f1793d);
        } catch (SQLiteDatabaseCorruptException unused) {
            m2925a(sQLiteDatabase);
        } catch (Throwable th) {
            UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> [有状态]创建二级缓存数据库失败: " + th.getMessage());
        }
    }

    /* renamed from: d */
    private void m2927d() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            try {
                writableDatabase.execSQL(f1795f);
            } catch (Throwable unused) {
            }
            writableDatabase.close();
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: c */
    public boolean m2935c() {
        return !m2934b(C3339am.f1805c);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        m2926b(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }

    /* renamed from: a */
    public static C3337ak m2924a(Context context) {
        C3337ak c3337ak;
        synchronized (f1791b) {
            if (f1792c == null) {
                f1792c = new C3337ak(context, C3339am.f1804b, null, 1);
            }
            c3337ak = f1792c;
        }
        return c3337ak;
    }

    /* renamed from: b */
    public void m2933b() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            writableDatabase.close();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m2925a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            sQLiteDatabase.execSQL(f1794e);
            sQLiteDatabase.execSQL(f1793d);
        } catch (SQLException unused) {
        }
    }

    /* renamed from: b */
    public boolean m2934b(String str) {
        SQLiteDatabase writableDatabase;
        Cursor cursorQuery = null;
        try {
            writableDatabase = getWritableDatabase();
            if (writableDatabase != null) {
                try {
                    if (writableDatabase.isOpen()) {
                        cursorQuery = writableDatabase.query(str, null, null, null, null, null, null, null);
                    }
                } catch (Throwable unused) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (writableDatabase == null) {
                        return false;
                    }
                    writableDatabase.close();
                    return false;
                }
            }
            if (cursorQuery != null) {
                if (cursorQuery.getCount() > 0) {
                    cursorQuery.close();
                    if (writableDatabase == null) {
                        return true;
                    }
                    writableDatabase.close();
                    return true;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (writableDatabase == null) {
                return false;
            }
        } catch (Throwable unused2) {
            writableDatabase = null;
        }
        writableDatabase.close();
        return false;
    }

    /* renamed from: a */
    public void m2930a(String str, ContentValues contentValues) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            try {
                writableDatabase.beginTransaction();
                writableDatabase.insert(str, null, contentValues);
                writableDatabase.setTransactionSuccessful();
                UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> [有状态]插入二级缓存数据记录 成功。");
            } catch (Throwable unused) {
            }
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    public void m2932a(String str, String str2, String[] strArr) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            try {
                writableDatabase.beginTransaction();
                writableDatabase.delete(str, str2, strArr);
                writableDatabase.setTransactionSuccessful();
            } catch (Throwable unused) {
            }
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.umeng.analytics.pro.C3338al m2929a(java.lang.String r19) {
        /*
            r18 = this;
            r10 = r18
            r0 = 6
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = "_uuid"
            r12 = 0
            r3[r12] = r0     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = "_tp"
            r13 = 1
            r3[r13] = r0     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = "_hd"
            r14 = 2
            r3[r14] = r0     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = "_bd"
            r15 = 3
            r3[r15] = r0     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = "_re1"
            r9 = 4
            r3[r9] = r0     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = "_re2"
            r8 = 5
            r3[r8] = r0     // Catch: java.lang.Throwable -> L8b
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = 0
            java.lang.String r16 = "1"
            r1 = r18
            r2 = r19
            r11 = r8
            r8 = r0
            r0 = r9
            r9 = r16
            android.database.Cursor r1 = r1.m2928a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L84
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L82
            if (r2 == 0) goto L84
            com.umeng.analytics.pro.al r2 = new com.umeng.analytics.pro.al     // Catch: java.lang.Throwable -> L82
            r2.<init>()     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = r1.getString(r12)     // Catch: java.lang.Throwable -> L7e
            r2.f1797a = r3     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = r1.getString(r13)     // Catch: java.lang.Throwable -> L7e
            r2.f1798b = r3     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = r1.getString(r14)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r4 = r1.getString(r15)     // Catch: java.lang.Throwable -> L7e
            android.content.Context r5 = r10.f1796a     // Catch: java.lang.Throwable -> L7e
            com.umeng.analytics.pro.h r5 = com.umeng.analytics.pro.C3391h.m3158a(r5)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = r5.m3184d(r3)     // Catch: java.lang.Throwable -> L7e
            r2.f1799c = r3     // Catch: java.lang.Throwable -> L7e
            android.content.Context r3 = r10.f1796a     // Catch: java.lang.Throwable -> L7e
            com.umeng.analytics.pro.h r3 = com.umeng.analytics.pro.C3391h.m3158a(r3)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = r3.m3184d(r4)     // Catch: java.lang.Throwable -> L7e
            r2.f1800d = r3     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L7e
            r2.f1801e = r0     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = r1.getString(r11)     // Catch: java.lang.Throwable -> L7e
            r2.f1802f = r0     // Catch: java.lang.Throwable -> L7e
            r11 = r2
            goto L85
        L7e:
            r11 = r1
            r17 = r2
            goto L8e
        L82:
            r11 = r1
            goto L8c
        L84:
            r11 = 0
        L85:
            if (r1 == 0) goto L98
            r1.close()
            goto L98
        L8b:
            r11 = 0
        L8c:
            r17 = 0
        L8e:
            r18.m2927d()     // Catch: java.lang.Throwable -> L99
            if (r11 == 0) goto L96
            r11.close()
        L96:
            r11 = r17
        L98:
            return r11
        L99:
            r0 = move-exception
            r1 = r0
            if (r11 == 0) goto La0
            r11.close()
        La0:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3337ak.m2929a(java.lang.String):com.umeng.analytics.pro.al");
    }

    /* renamed from: a */
    public void m2931a(String str, String str2) {
        m2932a(str, "_uuid=?", new String[]{str2});
    }

    /* renamed from: a */
    public Cursor m2928a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return null;
            }
            return writableDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        } catch (Throwable unused) {
            return null;
        }
    }
}
