package com.taobao.accs.p083a;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.taobao.accs.common.Constants;
import com.taobao.accs.p085ut.monitor.TrafficsMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AdapterUtilityImpl;
import com.taobao.accs.utl.UtilityImpl;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.taobao.accs.a.a */
/* loaded from: classes5.dex */
public class C7602a extends SQLiteOpenHelper {

    /* renamed from: c */
    private static volatile C7602a f12891c;

    /* renamed from: e */
    private static final Lock f12892e = new ReentrantLock();

    /* renamed from: a */
    public int f12893a;

    /* renamed from: b */
    LinkedList<a> f12894b;

    /* renamed from: d */
    private Context f12895d;

    /* renamed from: com.taobao.accs.a.a$a */
    public class a {

        /* renamed from: a */
        String f12896a;

        /* renamed from: b */
        Object[] f12897b;

        private a(String str, Object[] objArr) {
            this.f12896a = str;
            this.f12897b = objArr;
        }
    }

    private C7602a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        super(context, str, cursorFactory, i10);
        this.f12893a = 0;
        this.f12894b = new LinkedList<>();
        this.f12895d = context;
    }

    /* renamed from: a */
    public static C7602a m9855a(Context context) {
        if (f12891c == null) {
            synchronized (C7602a.class) {
                try {
                    if (f12891c == null) {
                        f12891c = new C7602a(context, Constants.DB_NAME, null, 3);
                    }
                } finally {
                }
            }
        }
        return f12891c;
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
            Lock lock = f12892e;
            if (lock.tryLock()) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS traffic(_id INTEGER PRIMARY KEY AUTOINCREMENT, date TEXT, host TEXT,serviceid TEXT, bid TEXT, isbackground TEXT, size TEXT)");
            }
            lock.unlock();
        } catch (Throwable th) {
            f12892e.unlock();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        if (i10 < i11) {
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
    public void m9860a(String str, String str2, String str3, boolean z10, long j10, String str4) {
        if (!m9857a(str, str3, z10, str4)) {
            m9856a("INSERT INTO traffic VALUES(null,?,?,?,?,?,?)", new Object[]{str4, str, str2, str3, String.valueOf(z10), Long.valueOf(j10)}, true);
        } else {
            m9856a("UPDATE traffic SET size=? WHERE date=? AND host=? AND bid=? AND isbackground=?", new Object[]{Long.valueOf(j10), str4, str, str3, String.valueOf(z10)}, true);
        }
    }

    /* renamed from: a */
    private synchronized boolean m9857a(String str, String str2, boolean z10, String str3) {
        SQLiteDatabase writableDatabase;
        Cursor cursorQuery = null;
        try {
            try {
                writableDatabase = getWritableDatabase();
            } catch (Exception e10) {
                ALog.m10122w("DBHelper", e10.toString(), new Object[0]);
                if (cursorQuery != null) {
                }
            }
            if (writableDatabase == null) {
                return false;
            }
            cursorQuery = writableDatabase.query("traffic", new String[]{"_id", "date", Constants.KEY_HOST, "serviceid", "bid", "isbackground", "size"}, "date=? AND host=? AND bid=? AND isbackground=?", new String[]{str3, str, str2, String.valueOf(z10)}, null, null, null, String.valueOf(100));
            if (cursorQuery != null) {
                if (cursorQuery.getCount() > 0) {
                    cursorQuery.close();
                    return true;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return false;
        } finally {
        }
    }

    /* renamed from: a */
    public void m9859a() {
        m9856a("DELETE FROM traffic", null, true);
    }

    /* renamed from: a */
    public List<TrafficsMonitor.C7673a> m9858a(boolean z10) {
        SQLiteDatabase writableDatabase;
        Cursor cursorQuery;
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            Cursor cursor = null;
            try {
                try {
                    writableDatabase = getWritableDatabase();
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e10) {
                e = e10;
            }
            if (writableDatabase != null) {
                if (z10) {
                    cursorQuery = writableDatabase.query("traffic", new String[]{"_id", "date", Constants.KEY_HOST, "serviceid", "bid", "isbackground", "size"}, "date=?", new String[]{UtilityImpl.m10127a(System.currentTimeMillis())}, null, null, null, String.valueOf(100));
                } else {
                    cursorQuery = writableDatabase.query("traffic", new String[]{"_id", "date", Constants.KEY_HOST, "serviceid", "bid", "isbackground", "size"}, null, null, null, null, null, String.valueOf(100));
                }
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            do {
                                String string = cursorQuery.getString(1);
                                String string2 = cursorQuery.getString(2);
                                String string3 = cursorQuery.getString(3);
                                String string4 = cursorQuery.getString(4);
                                boolean zBooleanValue = Boolean.valueOf(cursorQuery.getString(5)).booleanValue();
                                long j10 = cursorQuery.getLong(6);
                                if (string4 != null && j10 > 0) {
                                    arrayList.add(new TrafficsMonitor.C7673a(string, string4, string3, zBooleanValue, string2, j10));
                                }
                            } while (cursorQuery.moveToNext());
                        }
                        cursorQuery.close();
                    } catch (Exception e11) {
                        e = e11;
                        cursor = cursorQuery;
                        ALog.m10122w("DBHelper", e.toString(), new Object[0]);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        Throwable th3 = th;
                        if (cursor != null) {
                            cursor.close();
                            throw th3;
                        }
                        throw th3;
                    }
                    return arrayList;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        com.taobao.accs.utl.ALog.m10116d("DBHelper", "db is full!", new java.lang.Object[0]);
        onUpgrade(r5, 0, 1);
        r4.f12893a = 0;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void m9856a(java.lang.String r5, java.lang.Object[] r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            java.util.LinkedList<com.taobao.accs.a.a$a> r1 = r4.f12894b     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            com.taobao.accs.a.a$a r2 = new com.taobao.accs.a.a$a     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r3 = 0
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r1.add(r2)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.util.LinkedList<com.taobao.accs.a.a$a> r5 = r4.f12894b     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r6 = 5
            if (r5 > r6) goto L18
            if (r7 == 0) goto L7a
        L18:
            android.database.sqlite.SQLiteDatabase r5 = r4.getWritableDatabase()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            if (r5 != 0) goto L20
            monitor-exit(r4)
            return
        L20:
            java.util.LinkedList<com.taobao.accs.a.a$a> r6 = r4.f12894b     // Catch: java.lang.Throwable -> L3a
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L3a
            if (r6 <= 0) goto L63
            java.util.LinkedList<com.taobao.accs.a.a$a> r6 = r4.f12894b     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r6 = r6.removeFirst()     // Catch: java.lang.Throwable -> L3a
            com.taobao.accs.a.a$a r6 = (com.taobao.accs.p083a.C7602a.a) r6     // Catch: java.lang.Throwable -> L3a
            java.lang.Object[] r7 = r6.f12897b     // Catch: java.lang.Throwable -> L3a
            if (r7 == 0) goto L3c
            java.lang.String r1 = r6.f12896a     // Catch: java.lang.Throwable -> L3a
            r5.execSQL(r1, r7)     // Catch: java.lang.Throwable -> L3a
            goto L41
        L3a:
            r6 = move-exception
            goto L6b
        L3c:
            java.lang.String r7 = r6.f12896a     // Catch: java.lang.Throwable -> L3a
            r5.execSQL(r7)     // Catch: java.lang.Throwable -> L3a
        L41:
            java.lang.String r6 = r6.f12896a     // Catch: java.lang.Throwable -> L3a
            java.lang.String r7 = "INSERT"
            boolean r6 = r6.contains(r7)     // Catch: java.lang.Throwable -> L3a
            if (r6 == 0) goto L20
            int r6 = r4.f12893a     // Catch: java.lang.Throwable -> L3a
            r7 = 1
            int r6 = r6 + r7
            r4.f12893a = r6     // Catch: java.lang.Throwable -> L3a
            r1 = 4000(0xfa0, float:5.605E-42)
            if (r6 <= r1) goto L20
            java.lang.String r6 = "DBHelper"
            java.lang.String r1 = "db is full!"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L3a
            com.taobao.accs.utl.ALog.m10116d(r6, r1, r2)     // Catch: java.lang.Throwable -> L3a
            r4.onUpgrade(r5, r0, r7)     // Catch: java.lang.Throwable -> L3a
            r4.f12893a = r0     // Catch: java.lang.Throwable -> L3a
        L63:
            r5.close()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            goto L7a
        L67:
            r5 = move-exception
            goto L7c
        L69:
            r5 = move-exception
            goto L6f
        L6b:
            r5.close()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            throw r6     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
        L6f:
            java.lang.String r6 = "DBHelper"
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L67
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L67
            com.taobao.accs.utl.ALog.m10116d(r6, r5, r7)     // Catch: java.lang.Throwable -> L67
        L7a:
            monitor-exit(r4)
            return
        L7c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L67
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.p083a.C7602a.m9856a(java.lang.String, java.lang.Object[], boolean):void");
    }
}
