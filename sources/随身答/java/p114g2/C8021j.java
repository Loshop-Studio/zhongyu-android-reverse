package p114g2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.analytics.pro.C6773h;
import p176m2.AbstractC8959h;

/* renamed from: g2.j */
/* loaded from: classes4.dex */
public class C8021j extends SQLiteOpenHelper {

    /* renamed from: b */
    public static final Object f13573b = new Object();

    /* renamed from: c */
    public static C8021j f13574c;

    /* renamed from: a */
    public final Context f13575a;

    public C8021j(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i9) {
        super(context, str, cursorFactory, i9);
        this.f13575a = context;
    }

    /* renamed from: c */
    public static C8021j m12608c(Context context) {
        C8021j c8021j;
        synchronized (f13573b) {
            try {
                if (f13574c == null) {
                    f13574c = new C8021j(context, "umeng_zero_cache.db", null, 1);
                }
                c8021j = f13574c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c8021j;
    }

    /* renamed from: a */
    public Cursor m12609a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
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

    /* renamed from: g */
    public C8023k m12610g(String str) {
        Cursor cursorM12609a;
        C8023k c8023k = null;
        try {
            cursorM12609a = m12609a(str, new String[]{"_uuid", "_tp", "_hd", "_bd", "_re1", "_re2"}, null, null, null, null, null, "1");
            if (cursorM12609a != null) {
                try {
                    if (cursorM12609a.moveToFirst()) {
                        C8023k c8023k2 = new C8023k();
                        try {
                            c8023k2.f13576a = cursorM12609a.getString(0);
                            c8023k2.f13577b = cursorM12609a.getString(1);
                            String string = cursorM12609a.getString(2);
                            String string2 = cursorM12609a.getString(3);
                            c8023k2.f13578c = C6773h.m6194b(this.f13575a).m6223x(string);
                            c8023k2.f13579d = C6773h.m6194b(this.f13575a).m6223x(string2);
                            c8023k2.f13580e = cursorM12609a.getString(4);
                            c8023k2.f13581f = cursorM12609a.getString(5);
                            c8023k = c8023k2;
                        } catch (Throwable unused) {
                            c8023k = c8023k2;
                            try {
                                m12619p();
                                if (cursorM12609a != null) {
                                    cursorM12609a.close();
                                }
                                return c8023k;
                            } finally {
                                if (cursorM12609a != null) {
                                    cursorM12609a.close();
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            return c8023k;
        } catch (Throwable unused3) {
            cursorM12609a = null;
        }
    }

    /* renamed from: h */
    public final void m12611h(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS stf");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS stf(_id INTEGER PRIMARY KEY AUTOINCREMENT, _tp TEXT, _hd TEXT, _bd TEXT, _ts TEXT, _uuid TEXT, _re1 TEXT, _re2 TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* renamed from: i */
    public void m12612i(String str, ContentValues contentValues) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            try {
                writableDatabase.beginTransaction();
                writableDatabase.insert(str, null, contentValues);
                writableDatabase.setTransactionSuccessful();
                AbstractC8959h.m14292b("MobclickRT", "--->>> [有状态]插入二级缓存数据记录 成功。");
            } catch (Throwable unused) {
            }
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: j */
    public void m12613j(String str, String str2) {
        m12614k(str, "_uuid=?", new String[]{str2});
    }

    /* renamed from: k */
    public void m12614k(String str, String str2, String[] strArr) {
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

    /* renamed from: l */
    public void m12615l() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            writableDatabase.close();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: m */
    public final void m12616m(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS stf(_id INTEGER PRIMARY KEY AUTOINCREMENT, _tp TEXT, _hd TEXT, _bd TEXT, _ts TEXT, _uuid TEXT, _re1 TEXT, _re2 TEXT)");
        } catch (SQLiteDatabaseCorruptException unused) {
            m12611h(sQLiteDatabase);
        } catch (Throwable th) {
            AbstractC8959h.m14292b("MobclickRT", "--->>> [有状态]创建二级缓存数据库失败: " + th.getMessage());
        }
    }

    /* renamed from: n */
    public boolean m12617n(String str) {
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
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
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

    /* renamed from: o */
    public boolean m12618o() {
        return !m12617n("stf");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        m12616m(sQLiteDatabase);
    }

    /* renamed from: p */
    public final void m12619p() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            try {
                writableDatabase.execSQL("DELETE FROM stf WHERE _id IN( SELECT _id FROM stf ORDER BY _id LIMIT 1)");
            } catch (Throwable unused) {
            }
            writableDatabase.close();
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
    }
}
