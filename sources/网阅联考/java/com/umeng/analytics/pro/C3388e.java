package com.umeng.analytics.pro;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3387d;

/* renamed from: com.umeng.analytics.pro.e */
/* loaded from: classes2.dex */
class C3388e extends SQLiteOpenHelper {

    /* renamed from: b */
    private static Context f2113b;

    /* renamed from: a */
    private String f2114a;

    /* renamed from: com.umeng.analytics.pro.e$a */
    public static class a {

        /* renamed from: a */
        private static final C3388e f2115a = new C3388e(C3388e.f2113b, C3390g.m3155b(C3388e.f2113b), C3387d.f2047b, null, 2);

        private a() {
        }
    }

    /* renamed from: a */
    public static C3388e m3134a(Context context) {
        if (f2113b == null) {
            f2113b = context.getApplicationContext();
        }
        return a.f2115a;
    }

    /* renamed from: c */
    private void m3139c(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            this.f2114a = "create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* renamed from: d */
    private void m3140d(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            this.f2114a = "create table if not exists __is(id INTEGER primary key autoincrement, __ii TEXT unique, __e TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __is(id INTEGER primary key autoincrement, __ii TEXT unique, __e TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* renamed from: e */
    private void m3141e(SQLiteDatabase sQLiteDatabase) {
        if (!C3390g.m3153a(sQLiteDatabase, C3387d.d.f2088a, "__av")) {
            C3390g.m3152a(sQLiteDatabase, C3387d.d.f2088a, "__sp", "TEXT");
            C3390g.m3152a(sQLiteDatabase, C3387d.d.f2088a, "__pp", "TEXT");
            C3390g.m3152a(sQLiteDatabase, C3387d.d.f2088a, "__av", "TEXT");
            C3390g.m3152a(sQLiteDatabase, C3387d.d.f2088a, "__vc", "TEXT");
        }
        if (!C3390g.m3153a(sQLiteDatabase, C3387d.b.f2062a, "__av")) {
            C3390g.m3152a(sQLiteDatabase, C3387d.b.f2062a, "__av", "TEXT");
            C3390g.m3152a(sQLiteDatabase, C3387d.b.f2062a, "__vc", "TEXT");
        }
        if (C3390g.m3153a(sQLiteDatabase, C3387d.a.f2051a, "__av")) {
            return;
        }
        C3390g.m3152a(sQLiteDatabase, C3387d.a.f2051a, "__av", "TEXT");
        C3390g.m3152a(sQLiteDatabase, C3387d.a.f2051a, "__vc", "TEXT");
    }

    /* renamed from: f */
    private void m3142f(SQLiteDatabase sQLiteDatabase) throws SQLException {
        m3136a(sQLiteDatabase, C3387d.d.f2088a);
        m3136a(sQLiteDatabase, C3387d.b.f2062a);
        m3136a(sQLiteDatabase, C3387d.a.f2051a);
        m3143a();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                m3139c(sQLiteDatabase);
                m3140d(sQLiteDatabase);
                m3138b(sQLiteDatabase);
                m3135a(sQLiteDatabase);
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException unused2) {
            C3390g.m3151a(f2113b);
            if (sQLiteDatabase == null) {
                return;
            }
        } catch (Throwable unused3) {
            if (sQLiteDatabase == null) {
                return;
            }
        }
        try {
            sQLiteDatabase.endTransaction();
        } catch (Throwable unused4) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) throws SQLException {
        if (i5 <= i4 || i4 != 1) {
            return;
        }
        try {
            try {
                m3141e(sQLiteDatabase);
            } catch (Exception unused) {
                m3142f(sQLiteDatabase);
            }
        } catch (Exception unused2) {
            m3141e(sQLiteDatabase);
        }
    }

    private C3388e(Context context, String str, String str2, SQLiteDatabase.CursorFactory cursorFactory, int i4) {
        this(new C3353b(context, str), str2, cursorFactory, i4);
    }

    /* renamed from: b */
    private void m3138b(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            this.f2114a = "create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    private C3388e(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i4) {
        super(context, TextUtils.isEmpty(str) ? C3387d.f2047b : str, cursorFactory, i4);
        this.f2114a = null;
        m3143a();
    }

    /* renamed from: a */
    public void m3143a() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (!C3390g.m3154a(C3387d.d.f2088a, writableDatabase)) {
                m3139c(writableDatabase);
            }
            if (!C3390g.m3154a(C3387d.c.f2075a, writableDatabase)) {
                m3140d(writableDatabase);
            }
            if (!C3390g.m3154a(C3387d.b.f2062a, writableDatabase)) {
                m3138b(writableDatabase);
            }
            if (C3390g.m3154a(C3387d.a.f2051a, writableDatabase)) {
                return;
            }
            m3135a(writableDatabase);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m3135a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            this.f2114a = "create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* renamed from: a */
    private void m3136a(SQLiteDatabase sQLiteDatabase, String str) throws SQLException {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        } catch (SQLException unused) {
        }
    }
}
