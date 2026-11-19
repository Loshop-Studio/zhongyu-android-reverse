package p114g2;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;

/* renamed from: g2.d0 */
/* loaded from: classes4.dex */
public class C8010d0 extends SQLiteOpenHelper {

    /* renamed from: b */
    public static Context f13489b;

    /* renamed from: a */
    public String f13490a;

    /* renamed from: g2.d0$b */
    public static class b {

        /* renamed from: a */
        public static final C8010d0 f13491a = new C8010d0(C8010d0.f13489b, AbstractC8014f0.m12597e(C8010d0.f13489b), "ua.db", null, 2);
    }

    /* renamed from: a */
    public static C8010d0 m12574a(Context context) {
        if (f13489b == null) {
            f13489b = context.getApplicationContext();
        }
        return b.f13491a;
    }

    /* renamed from: c */
    public void m12576c() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (!AbstractC8014f0.m12596d("__sd", writableDatabase)) {
                m12580k(writableDatabase);
            }
            if (!AbstractC8014f0.m12596d("__is", writableDatabase)) {
                m12581l(writableDatabase);
            }
            if (!AbstractC8014f0.m12596d("__et", writableDatabase)) {
                m12579j(writableDatabase);
            }
            if (AbstractC8014f0.m12596d("__er", writableDatabase)) {
                return;
            }
            m12577g(writableDatabase);
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public final void m12577g(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            this.f13490a = "create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* renamed from: h */
    public final void m12578h(SQLiteDatabase sQLiteDatabase, String str) throws SQLException {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        } catch (SQLException unused) {
        }
    }

    /* renamed from: j */
    public final void m12579j(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            this.f13490a = "create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* renamed from: k */
    public final void m12580k(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            this.f13490a = "create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* renamed from: l */
    public final void m12581l(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            this.f13490a = "create table if not exists __is(id INTEGER primary key autoincrement, __ii TEXT unique, __e TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __is(id INTEGER primary key autoincrement, __ii TEXT unique, __e TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* renamed from: m */
    public final void m12582m(SQLiteDatabase sQLiteDatabase) {
        if (!AbstractC8014f0.m12595c(sQLiteDatabase, "__sd", "__av")) {
            AbstractC8014f0.m12594b(sQLiteDatabase, "__sd", "__sp", "TEXT");
            AbstractC8014f0.m12594b(sQLiteDatabase, "__sd", "__pp", "TEXT");
            AbstractC8014f0.m12594b(sQLiteDatabase, "__sd", "__av", "TEXT");
            AbstractC8014f0.m12594b(sQLiteDatabase, "__sd", "__vc", "TEXT");
        }
        if (!AbstractC8014f0.m12595c(sQLiteDatabase, "__et", "__av")) {
            AbstractC8014f0.m12594b(sQLiteDatabase, "__et", "__av", "TEXT");
            AbstractC8014f0.m12594b(sQLiteDatabase, "__et", "__vc", "TEXT");
        }
        if (AbstractC8014f0.m12595c(sQLiteDatabase, "__er", "__av")) {
            return;
        }
        AbstractC8014f0.m12594b(sQLiteDatabase, "__er", "__av", "TEXT");
        AbstractC8014f0.m12594b(sQLiteDatabase, "__er", "__vc", "TEXT");
    }

    /* renamed from: n */
    public final void m12583n(SQLiteDatabase sQLiteDatabase) throws SQLException {
        m12578h(sQLiteDatabase, "__sd");
        m12578h(sQLiteDatabase, "__et");
        m12578h(sQLiteDatabase, "__er");
        m12576c();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                try {
                    sQLiteDatabase.beginTransaction();
                    m12580k(sQLiteDatabase);
                    m12581l(sQLiteDatabase);
                    m12579j(sQLiteDatabase);
                    m12577g(sQLiteDatabase);
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException unused3) {
            AbstractC8014f0.m12593a(f13489b);
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.endTransaction();
        } catch (Throwable unused4) {
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) throws SQLException {
        if (i10 <= i9 || i9 != 1) {
            return;
        }
        try {
            try {
                m12582m(sQLiteDatabase);
            } catch (Exception unused) {
                m12583n(sQLiteDatabase);
            }
        } catch (Exception unused2) {
            m12582m(sQLiteDatabase);
        }
    }

    public C8010d0(Context context, String str, String str2, SQLiteDatabase.CursorFactory cursorFactory, int i9) {
        this(new C8031o(context, str), str2, cursorFactory, i9);
    }

    public C8010d0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i9) {
        super(context, TextUtils.isEmpty(str) ? "ua.db" : str, cursorFactory, i9);
        this.f13490a = null;
        m12576c();
    }
}
