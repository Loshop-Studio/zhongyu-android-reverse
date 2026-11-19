package com.tencent.bugly.proguard;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.x */
/* loaded from: classes3.dex */
public final class C4145x extends SQLiteOpenHelper {

    /* renamed from: a */
    public static String f3905a = "bugly_db";

    /* renamed from: b */
    public static int f3906b = 16;

    /* renamed from: c */
    protected Context f3907c;

    /* renamed from: d */
    private List<AbstractC4127o> f3908d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4145x(Context context, List<AbstractC4127o> list) {
        super(context, f3905a + "_", (SQLiteDatabase.CursorFactory) null, f3906b);
        C4044aa.m2888a(context).getClass();
        this.f3907c = context;
        this.f3908d = list;
    }

    /* renamed from: a */
    private synchronized boolean m3416a(SQLiteDatabase sQLiteDatabase) {
        try {
            String[] strArr = {"t_lr", "t_ui", "t_pf"};
            for (int i = 0; i < 3; i++) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(String.valueOf(strArr[i])), new String[0]);
            }
        } catch (Throwable th) {
            if (!C4055al.m3024b(th)) {
                th.printStackTrace();
            }
            return false;
        }
        return true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase readableDatabase;
        readableDatabase = null;
        int i = 0;
        while (readableDatabase == null && i < 5) {
            i++;
            try {
                readableDatabase = super.getReadableDatabase();
            } catch (Throwable unused) {
                C4055al.m3026d("[Database] Try to get db(count: %d).", Integer.valueOf(i));
                if (i == 5) {
                    C4055al.m3027e("[Database] Failed to get db.", new Object[0]);
                }
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return readableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase writableDatabase;
        writableDatabase = null;
        int i = 0;
        while (writableDatabase == null && i < 5) {
            i++;
            try {
                writableDatabase = super.getWritableDatabase();
            } catch (Throwable unused) {
                C4055al.m3026d("[Database] Try to get db(count: %d).", Integer.valueOf(i));
                if (i == 5) {
                    C4055al.m3027e("[Database] Failed to get db.", new Object[0]);
                }
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        if (writableDatabase == null) {
            C4055al.m3026d("[Database] db error delay error record 1min.", new Object[0]);
        }
        return writableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e5 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e7 A[Catch: all -> 0x00df, TRY_ENTER, TryCatch #2 {all -> 0x00df, blocks: (B:11:0x00e1, B:15:0x00e7, B:16:0x00eb, B:18:0x00f1, B:22:0x00fc, B:24:0x0102, B:6:0x00d5, B:8:0x00db, B:3:0x0001, B:19:0x00f7), top: B:30:0x0001, inners: #0, #1 }] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void onCreate(android.database.sqlite.SQLiteDatabase r5) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C4145x.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @TargetApi(11)
    public final synchronized void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i8) {
        try {
            if (C4045ab.m2931c() >= 11) {
                C4055al.m3026d("[Database] Downgrade %d to %d drop tables.", Integer.valueOf(i), Integer.valueOf(i8));
                List<AbstractC4127o> list = this.f3908d;
                if (list != null) {
                    Iterator<AbstractC4127o> it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            it.next().onDbDowngrade(sQLiteDatabase, i, i8);
                        } catch (Throwable th) {
                            if (!C4055al.m3024b(th)) {
                                th.printStackTrace();
                            }
                        }
                    }
                }
                if (m3416a(sQLiteDatabase)) {
                    onCreate(sQLiteDatabase);
                    return;
                }
                C4055al.m3026d("[Database] Failed to drop, delete db.", new Object[0]);
                File databasePath = this.f3907c.getDatabasePath(f3905a);
                if (databasePath != null && databasePath.canWrite()) {
                    databasePath.delete();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i8) {
        try {
            C4055al.m3026d("[Database] Upgrade %d to %d , drop tables!", Integer.valueOf(i), Integer.valueOf(i8));
            List<AbstractC4127o> list = this.f3908d;
            if (list != null) {
                Iterator<AbstractC4127o> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().onDbUpgrade(sQLiteDatabase, i, i8);
                    } catch (Throwable th) {
                        if (!C4055al.m3024b(th)) {
                            th.printStackTrace();
                        }
                    }
                }
            }
            if (m3416a(sQLiteDatabase)) {
                onCreate(sQLiteDatabase);
                return;
            }
            C4055al.m3026d("[Database] Failed to drop, delete db.", new Object[0]);
            File databasePath = this.f3907c.getDatabasePath(f3905a);
            if (databasePath != null && databasePath.canWrite()) {
                databasePath.delete();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
