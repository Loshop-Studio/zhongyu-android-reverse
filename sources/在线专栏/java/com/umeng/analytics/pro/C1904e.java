package com.umeng.analytics.pro;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.umeng.analytics.pro.C1903d;

/* renamed from: com.umeng.analytics.pro.e */
/* loaded from: classes.dex */
class C1904e extends SQLiteOpenHelper {

    /* renamed from: b */
    private static Context f8705b;

    /* renamed from: a */
    private String f8706a;

    /* renamed from: com.umeng.analytics.pro.e$a */
    private static class a {

        /* renamed from: a */
        private static final C1904e f8707a = new C1904e(C1904e.f8705b, C1906g.m7078b(C1904e.f8705b), C1903d.f8639b, null, 2);

        private a() {
        }
    }

    /* renamed from: a */
    public static C1904e m7057a(Context context) {
        if (f8705b == null) {
            f8705b = context.getApplicationContext();
        }
        return a.f8707a;
    }

    /* renamed from: c */
    private void m7062c(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            this.f8706a = "create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* renamed from: d */
    private void m7063d(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            this.f8706a = "create table if not exists __is(id INTEGER primary key autoincrement, __ii TEXT unique, __e TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __is(id INTEGER primary key autoincrement, __ii TEXT unique, __e TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* renamed from: e */
    private void m7064e(SQLiteDatabase sQLiteDatabase) {
        if (!C1906g.m7076a(sQLiteDatabase, C1903d.d.f8680a, "__av")) {
            C1906g.m7075a(sQLiteDatabase, C1903d.d.f8680a, "__sp", "TEXT");
            C1906g.m7075a(sQLiteDatabase, C1903d.d.f8680a, "__pp", "TEXT");
            C1906g.m7075a(sQLiteDatabase, C1903d.d.f8680a, "__av", "TEXT");
            C1906g.m7075a(sQLiteDatabase, C1903d.d.f8680a, "__vc", "TEXT");
        }
        if (!C1906g.m7076a(sQLiteDatabase, C1903d.b.f8654a, "__av")) {
            C1906g.m7075a(sQLiteDatabase, C1903d.b.f8654a, "__av", "TEXT");
            C1906g.m7075a(sQLiteDatabase, C1903d.b.f8654a, "__vc", "TEXT");
        }
        if (C1906g.m7076a(sQLiteDatabase, C1903d.a.f8643a, "__av")) {
            return;
        }
        C1906g.m7075a(sQLiteDatabase, C1903d.a.f8643a, "__av", "TEXT");
        C1906g.m7075a(sQLiteDatabase, C1903d.a.f8643a, "__vc", "TEXT");
    }

    /* renamed from: f */
    private void m7065f(SQLiteDatabase sQLiteDatabase) throws SQLException {
        m7059a(sQLiteDatabase, C1903d.d.f8680a);
        m7059a(sQLiteDatabase, C1903d.b.f8654a);
        m7059a(sQLiteDatabase, C1903d.a.f8643a);
        m7066a();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                m7062c(sQLiteDatabase);
                m7063d(sQLiteDatabase);
                m7061b(sQLiteDatabase);
                m7058a(sQLiteDatabase);
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
            C1906g.m7074a(f8705b);
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
                m7064e(sQLiteDatabase);
            } catch (Exception unused) {
                m7065f(sQLiteDatabase);
            }
        } catch (Exception unused2) {
            m7064e(sQLiteDatabase);
        }
    }

    private C1904e(Context context, String str, String str2, SQLiteDatabase.CursorFactory cursorFactory, int i4) {
        this(new C1869b(context, str), str2, cursorFactory, i4);
    }

    /* renamed from: b */
    private void m7061b(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            this.f8706a = "create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    private C1904e(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i4) {
        super(context, TextUtils.isEmpty(str) ? C1903d.f8639b : str, cursorFactory, i4);
        this.f8706a = null;
        m7066a();
    }

    /* renamed from: a */
    public void m7066a() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (!C1906g.m7077a(C1903d.d.f8680a, writableDatabase)) {
                m7062c(writableDatabase);
            }
            if (!C1906g.m7077a(C1903d.c.f8667a, writableDatabase)) {
                m7063d(writableDatabase);
            }
            if (!C1906g.m7077a(C1903d.b.f8654a, writableDatabase)) {
                m7061b(writableDatabase);
            }
            if (C1906g.m7077a(C1903d.a.f8643a, writableDatabase)) {
                return;
            }
            m7058a(writableDatabase);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m7058a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            this.f8706a = "create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* renamed from: a */
    private void m7059a(SQLiteDatabase sQLiteDatabase, String str) throws SQLException {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        } catch (SQLException unused) {
        }
    }
}
