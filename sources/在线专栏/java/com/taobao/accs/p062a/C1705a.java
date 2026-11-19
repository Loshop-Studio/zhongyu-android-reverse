package com.taobao.accs.p062a;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.taobao.accs.common.Constants;
import com.taobao.accs.p064ut.monitor.TrafficsMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AdapterUtilityImpl;
import com.taobao.accs.utl.UtilityImpl;
import com.umeng.analytics.pro.C1855am;
import com.umeng.analytics.pro.C1896c;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.taobao.accs.a.a */
/* loaded from: classes.dex */
public class C1705a extends SQLiteOpenHelper {

    /* renamed from: c */
    private static volatile C1705a f7493c;

    /* renamed from: e */
    private static final Lock f7494e = new ReentrantLock();

    /* renamed from: a */
    public int f7495a;

    /* renamed from: b */
    LinkedList<a> f7496b;

    /* renamed from: d */
    private Context f7497d;

    /* renamed from: com.taobao.accs.a.a$a */
    private class a {

        /* renamed from: a */
        String f7498a;

        /* renamed from: b */
        Object[] f7499b;

        private a(String str, Object[] objArr) {
            this.f7498a = str;
            this.f7499b = objArr;
        }
    }

    private C1705a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i4) {
        super(context, str, cursorFactory, i4);
        this.f7495a = 0;
        this.f7496b = new LinkedList<>();
        this.f7497d = context;
    }

    /* renamed from: a */
    public static C1705a m5829a(Context context) {
        if (f7493c == null) {
            synchronized (C1705a.class) {
                if (f7493c == null) {
                    f7493c = new C1705a(context, Constants.DB_NAME, null, 3);
                }
            }
        }
        return f7493c;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getWritableDatabase() {
        if (AdapterUtilityImpl.checkIsWritable(super.getWritableDatabase().getPath(), 102400)) {
            return super.getWritableDatabase();
        }
        return null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            Lock lock = f7494e;
            if (lock.tryLock()) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS traffic(_id INTEGER PRIMARY KEY AUTOINCREMENT, date TEXT, host TEXT,serviceid TEXT, bid TEXT, isbackground TEXT, size TEXT)");
            }
            lock.unlock();
        } catch (Throwable th) {
            f7494e.unlock();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) throws SQLException {
        if (i4 < i5) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS service");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS network");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ping");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS msg");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ack");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS election");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS bindApp");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS bindUser");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS traffic");
            onCreate(sQLiteDatabase);
        }
    }

    /* renamed from: a */
    public void m5834a(String str, String str2, String str3, boolean z3, long j4, String str4) {
        if (m5831a(str, str3, z3, str4)) {
            m5830a("UPDATE traffic SET size=? WHERE date=? AND host=? AND bid=? AND isbackground=?", new Object[]{Long.valueOf(j4), str4, str, str3, String.valueOf(z3)}, true);
        } else {
            m5830a("INSERT INTO traffic VALUES(null,?,?,?,?,?,?)", new Object[]{str4, str, str2, str3, String.valueOf(z3), Long.valueOf(j4)}, true);
        }
    }

    /* renamed from: a */
    private synchronized boolean m5831a(String str, String str2, boolean z3, String str3) {
        SQLiteDatabase writableDatabase;
        Cursor cursorQuery = null;
        try {
            try {
                writableDatabase = getWritableDatabase();
            } catch (Exception e4) {
                ALog.m6096w("DBHelper", e4.toString(), new Object[0]);
                if (cursorQuery != null) {
                }
            }
            if (writableDatabase == null) {
                return false;
            }
            cursorQuery = writableDatabase.query(C1896c.f8545F, new String[]{C1855am.f8398d, "date", Constants.KEY_HOST, "serviceid", "bid", "isbackground", "size"}, "date=? AND host=? AND bid=? AND isbackground=?", new String[]{str3, str, str2, String.valueOf(z3)}, null, null, null, String.valueOf(100));
            if (cursorQuery != null) {
                if (cursorQuery.getCount() > 0) {
                    cursorQuery.close();
                    return true;
                }
            }
            return false;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* renamed from: a */
    public void m5833a() {
        m5830a("DELETE FROM traffic", null, true);
    }

    /* renamed from: a */
    public List<TrafficsMonitor.C1776a> m5832a(boolean z3) {
        SQLiteDatabase writableDatabase;
        Cursor cursorQuery;
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            Cursor cursor = null;
            try {
                try {
                    writableDatabase = getWritableDatabase();
                } catch (Exception e4) {
                    e = e4;
                }
                if (writableDatabase == null) {
                    return null;
                }
                if (z3) {
                    cursorQuery = writableDatabase.query(C1896c.f8545F, new String[]{C1855am.f8398d, "date", Constants.KEY_HOST, "serviceid", "bid", "isbackground", "size"}, "date=?", new String[]{UtilityImpl.m6101a(System.currentTimeMillis())}, null, null, null, String.valueOf(100));
                } else {
                    cursorQuery = writableDatabase.query(C1896c.f8545F, new String[]{C1855am.f8398d, "date", Constants.KEY_HOST, "serviceid", "bid", "isbackground", "size"}, null, null, null, null, null, String.valueOf(100));
                }
                if (cursorQuery == null) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                try {
                    if (cursorQuery.moveToFirst()) {
                        do {
                            String string = cursorQuery.getString(1);
                            String string2 = cursorQuery.getString(2);
                            String string3 = cursorQuery.getString(3);
                            String string4 = cursorQuery.getString(4);
                            boolean zBooleanValue = Boolean.valueOf(cursorQuery.getString(5)).booleanValue();
                            long j4 = cursorQuery.getLong(6);
                            if (string4 != null && j4 > 0) {
                                arrayList.add(new TrafficsMonitor.C1776a(string, string4, string3, zBooleanValue, string2, j4));
                            }
                        } while (cursorQuery.moveToNext());
                    }
                    cursorQuery.close();
                } catch (Exception e5) {
                    cursor = cursorQuery;
                    e = e5;
                    ALog.m6096w("DBHelper", e.toString(), new Object[0]);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                } catch (Throwable th) {
                    cursor = cursorQuery;
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        com.taobao.accs.utl.ALog.m6090d("DBHelper", "db is full!", new java.lang.Object[0]);
        onUpgrade(r5, 0, 1);
        r4.f7495a = 0;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void m5830a(java.lang.String r5, java.lang.Object[] r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            java.util.LinkedList<com.taobao.accs.a.a$a> r1 = r4.f7496b     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            com.taobao.accs.a.a$a r2 = new com.taobao.accs.a.a$a     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            r3 = 0
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            r1.add(r2)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            java.util.LinkedList<com.taobao.accs.a.a$a> r5 = r4.f7496b     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            r6 = 5
            if (r5 > r6) goto L18
            if (r7 == 0) goto L78
        L18:
            android.database.sqlite.SQLiteDatabase r5 = r4.getWritableDatabase()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            if (r5 != 0) goto L20
            monitor-exit(r4)
            return
        L20:
            java.util.LinkedList<com.taobao.accs.a.a$a> r6 = r4.f7496b     // Catch: java.lang.Throwable -> L65
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L65
            if (r6 <= 0) goto L61
            java.util.LinkedList<com.taobao.accs.a.a$a> r6 = r4.f7496b     // Catch: java.lang.Throwable -> L65
            java.lang.Object r6 = r6.removeFirst()     // Catch: java.lang.Throwable -> L65
            com.taobao.accs.a.a$a r6 = (com.taobao.accs.p062a.C1705a.a) r6     // Catch: java.lang.Throwable -> L65
            java.lang.Object[] r7 = r6.f7499b     // Catch: java.lang.Throwable -> L65
            if (r7 == 0) goto L3a
            java.lang.String r1 = r6.f7498a     // Catch: java.lang.Throwable -> L65
            r5.execSQL(r1, r7)     // Catch: java.lang.Throwable -> L65
            goto L3f
        L3a:
            java.lang.String r7 = r6.f7498a     // Catch: java.lang.Throwable -> L65
            r5.execSQL(r7)     // Catch: java.lang.Throwable -> L65
        L3f:
            java.lang.String r6 = r6.f7498a     // Catch: java.lang.Throwable -> L65
            java.lang.String r7 = "INSERT"
            boolean r6 = r6.contains(r7)     // Catch: java.lang.Throwable -> L65
            if (r6 == 0) goto L20
            int r6 = r4.f7495a     // Catch: java.lang.Throwable -> L65
            r7 = 1
            int r6 = r6 + r7
            r4.f7495a = r6     // Catch: java.lang.Throwable -> L65
            r1 = 4000(0xfa0, float:5.605E-42)
            if (r6 <= r1) goto L20
            java.lang.String r6 = "DBHelper"
            java.lang.String r1 = "db is full!"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L65
            com.taobao.accs.utl.ALog.m6090d(r6, r1, r2)     // Catch: java.lang.Throwable -> L65
            r4.onUpgrade(r5, r0, r7)     // Catch: java.lang.Throwable -> L65
            r4.f7495a = r0     // Catch: java.lang.Throwable -> L65
        L61:
            r5.close()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            goto L78
        L65:
            r6 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            throw r6     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
        L6a:
            r5 = move-exception
            goto L7a
        L6c:
            r5 = move-exception
            java.lang.String r6 = "DBHelper"
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L6a
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L6a
            com.taobao.accs.utl.ALog.m6090d(r6, r5, r7)     // Catch: java.lang.Throwable -> L6a
        L78:
            monitor-exit(r4)
            return
        L7a:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.p062a.C1705a.m5830a(java.lang.String, java.lang.Object[], boolean):void");
    }
}
