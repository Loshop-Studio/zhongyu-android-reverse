package p115d7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import p146f7.AbstractC9204c;

/* renamed from: d7.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8999a {

    /* renamed from: d */
    public static String f20963d;

    /* renamed from: a */
    public Lock f20964a;

    /* renamed from: b */
    public SQLiteOpenHelper f20965b;

    /* renamed from: c */
    public SQLiteDatabase f20966c;

    public AbstractC8999a(SQLiteOpenHelper sQLiteOpenHelper) {
        f20963d = getClass().getSimpleName();
        this.f20964a = C9001c.f20973g;
        this.f20965b = sQLiteOpenHelper;
        this.f20966c = m17575d();
    }

    /* renamed from: a */
    public final void m17572a(SQLiteDatabase sQLiteDatabase, Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return;
        }
        sQLiteDatabase.close();
    }

    /* renamed from: b */
    public abstract ContentValues mo17573b(Object obj);

    /* renamed from: c */
    public abstract String mo17574c();

    /* renamed from: d */
    public SQLiteDatabase m17575d() {
        return this.f20965b.getWritableDatabase();
    }

    /* renamed from: e */
    public abstract Object mo17576e(Cursor cursor);

    /* renamed from: f */
    public List m17577f(String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) throws Throwable {
        Cursor cursorQuery;
        String str6;
        StringBuilder sb2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f20964a.lock();
        ArrayList arrayList = new ArrayList();
        try {
            try {
                this.f20966c.beginTransaction();
                cursorQuery = this.f20966c.query(mo17574c(), strArr, str, strArr2, str2, str3, str4, str5);
                while (!cursorQuery.isClosed() && cursorQuery.moveToNext()) {
                    try {
                        arrayList.add(mo17576e(cursorQuery));
                    } catch (Exception e10) {
                        e = e10;
                        AbstractC9204c.m18111a(e);
                        m17572a(null, cursorQuery);
                        this.f20966c.endTransaction();
                        this.f20964a.unlock();
                        str6 = f20963d;
                        sb2 = new StringBuilder();
                        sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                        sb2.append(" query");
                        AbstractC9204c.m18112b(str6, sb2.toString());
                        return arrayList;
                    }
                }
                this.f20966c.setTransactionSuccessful();
                m17572a(null, cursorQuery);
                this.f20966c.endTransaction();
                this.f20964a.unlock();
                str6 = f20963d;
                sb2 = new StringBuilder();
            } catch (Throwable th) {
                th = th;
                m17572a(null, null);
                this.f20966c.endTransaction();
                this.f20964a.unlock();
                AbstractC9204c.m18112b(f20963d, (System.currentTimeMillis() - jCurrentTimeMillis) + " query");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            m17572a(null, null);
            this.f20966c.endTransaction();
            this.f20964a.unlock();
            AbstractC9204c.m18112b(f20963d, (System.currentTimeMillis() - jCurrentTimeMillis) + " query");
            throw th;
        }
        sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sb2.append(" query");
        AbstractC9204c.m18112b(str6, sb2.toString());
        return arrayList;
    }

    /* renamed from: g */
    public Object m17578g(String str, String[] strArr) throws Throwable {
        long jCurrentTimeMillis = System.currentTimeMillis();
        List listM17577f = m17577f(null, str, strArr, null, null, null, "1");
        AbstractC9204c.m18112b(f20963d, (System.currentTimeMillis() - jCurrentTimeMillis) + " queryOne");
        if (listM17577f.size() > 0) {
            return listM17577f.get(0);
        }
        return null;
    }

    /* renamed from: h */
    public boolean m17579h(Object obj) {
        if (obj == null) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f20964a.lock();
        try {
            try {
                this.f20966c.beginTransaction();
                this.f20966c.replace(mo17574c(), null, mo17573b(obj));
                this.f20966c.setTransactionSuccessful();
                this.f20966c.endTransaction();
                this.f20964a.unlock();
                AbstractC9204c.m18112b(f20963d, (System.currentTimeMillis() - jCurrentTimeMillis) + " replaceT");
                return true;
            } catch (Exception e10) {
                AbstractC9204c.m18111a(e10);
                this.f20966c.endTransaction();
                this.f20964a.unlock();
                AbstractC9204c.m18112b(f20963d, (System.currentTimeMillis() - jCurrentTimeMillis) + " replaceT");
                return false;
            }
        } catch (Throwable th) {
            this.f20966c.endTransaction();
            this.f20964a.unlock();
            AbstractC9204c.m18112b(f20963d, (System.currentTimeMillis() - jCurrentTimeMillis) + " replaceT");
            throw th;
        }
    }

    /* renamed from: i */
    public boolean m17580i(List list) {
        if (list == null) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f20964a.lock();
        try {
            try {
                this.f20966c.beginTransaction();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f20966c.replace(mo17574c(), null, mo17573b(it.next()));
                }
                this.f20966c.setTransactionSuccessful();
                this.f20966c.endTransaction();
                this.f20964a.unlock();
                AbstractC9204c.m18112b(f20963d, (System.currentTimeMillis() - jCurrentTimeMillis) + " replaceList");
                return true;
            } catch (Exception e10) {
                AbstractC9204c.m18111a(e10);
                this.f20966c.endTransaction();
                this.f20964a.unlock();
                AbstractC9204c.m18112b(f20963d, (System.currentTimeMillis() - jCurrentTimeMillis) + " replaceList");
                return false;
            }
        } catch (Throwable th) {
            this.f20966c.endTransaction();
            this.f20964a.unlock();
            AbstractC9204c.m18112b(f20963d, (System.currentTimeMillis() - jCurrentTimeMillis) + " replaceList");
            throw th;
        }
    }

    /* renamed from: j */
    public boolean m17581j(ContentValues contentValues, String str, String[] strArr) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f20964a.lock();
        try {
            try {
                this.f20966c.beginTransaction();
                this.f20966c.update(mo17574c(), contentValues, str, strArr);
                this.f20966c.setTransactionSuccessful();
                this.f20966c.endTransaction();
                this.f20964a.unlock();
                AbstractC9204c.m18112b(f20963d, (System.currentTimeMillis() - jCurrentTimeMillis) + " updateContentValues");
                return true;
            } catch (Exception e10) {
                AbstractC9204c.m18111a(e10);
                this.f20966c.endTransaction();
                this.f20964a.unlock();
                AbstractC9204c.m18112b(f20963d, (System.currentTimeMillis() - jCurrentTimeMillis) + " updateContentValues");
                return false;
            }
        } catch (Throwable th) {
            this.f20966c.endTransaction();
            this.f20964a.unlock();
            AbstractC9204c.m18112b(f20963d, (System.currentTimeMillis() - jCurrentTimeMillis) + " updateContentValues");
            throw th;
        }
    }
}
