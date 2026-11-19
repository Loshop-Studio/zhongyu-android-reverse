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
public final class C5850x extends SQLiteOpenHelper {

    /* renamed from: a */
    public static String f4429a = "bugly_db";

    /* renamed from: b */
    public static int f4430b = 16;

    /* renamed from: c */
    protected Context f4431c;

    /* renamed from: d */
    private List<AbstractC5841o> f4432d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5850x(Context context, List<AbstractC5841o> list) {
        super(context, f4429a + "_", (SQLiteDatabase.CursorFactory) null, f4430b);
        C5780aa.m3793a(context).getClass();
        this.f4431c = context;
        this.f4432d = list;
    }

    /* renamed from: a */
    private synchronized boolean m4325a(SQLiteDatabase sQLiteDatabase) {
        try {
            String[] strArr = {"t_lr", "t_ui", "t_pf"};
            for (int i6 = 0; i6 < 3; i6++) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(String.valueOf(strArr[i6])), new String[0]);
            }
        } catch (Throwable th) {
            if (!C5791al.m3931b(th)) {
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
        int i6 = 0;
        while (readableDatabase == null && i6 < 5) {
            i6++;
            try {
                readableDatabase = super.getReadableDatabase();
            } catch (Throwable unused) {
                C5791al.m3933d("[Database] Try to get db(count: %d).", Integer.valueOf(i6));
                if (i6 == 5) {
                    C5791al.m3934e("[Database] Failed to get db.", new Object[0]);
                }
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException e6) {
                    e6.printStackTrace();
                }
            }
        }
        return readableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase writableDatabase;
        writableDatabase = null;
        int i6 = 0;
        while (writableDatabase == null && i6 < 5) {
            i6++;
            try {
                writableDatabase = super.getWritableDatabase();
            } catch (Throwable unused) {
                C5791al.m3933d("[Database] Try to get db(count: %d).", Integer.valueOf(i6));
                if (i6 == 5) {
                    C5791al.m3934e("[Database] Failed to get db.", new Object[0]);
                }
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException e6) {
                    e6.printStackTrace();
                }
            }
        }
        if (writableDatabase == null) {
            C5791al.m3933d("[Database] db error delay error record 1min.", new Object[0]);
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C5850x.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @TargetApi(11)
    public final synchronized void onDowngrade(SQLiteDatabase sQLiteDatabase, int i6, int i7) {
        try {
            if (C5781ab.m3836c() >= 11) {
                C5791al.m3933d("[Database] Downgrade %d to %d drop tables.", Integer.valueOf(i6), Integer.valueOf(i7));
                List<AbstractC5841o> list = this.f4432d;
                if (list != null) {
                    Iterator<AbstractC5841o> it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            it.next().onDbDowngrade(sQLiteDatabase, i6, i7);
                        } catch (Throwable th) {
                            if (!C5791al.m3931b(th)) {
                                th.printStackTrace();
                            }
                        }
                    }
                }
                if (m4325a(sQLiteDatabase)) {
                    onCreate(sQLiteDatabase);
                    return;
                }
                C5791al.m3933d("[Database] Failed to drop, delete db.", new Object[0]);
                File databasePath = this.f4431c.getDatabasePath(f4429a);
                if (databasePath != null && databasePath.canWrite()) {
                    databasePath.delete();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized void onUpgrade(SQLiteDatabase sQLiteDatabase, int i6, int i7) {
        try {
            C5791al.m3933d("[Database] Upgrade %d to %d , drop tables!", Integer.valueOf(i6), Integer.valueOf(i7));
            List<AbstractC5841o> list = this.f4432d;
            if (list != null) {
                Iterator<AbstractC5841o> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().onDbUpgrade(sQLiteDatabase, i6, i7);
                    } catch (Throwable th) {
                        if (!C5791al.m3931b(th)) {
                            th.printStackTrace();
                        }
                    }
                }
            }
            if (m4325a(sQLiteDatabase)) {
                onCreate(sQLiteDatabase);
                return;
            }
            C5791al.m3933d("[Database] Failed to drop, delete db.", new Object[0]);
            File databasePath = this.f4431c.getDatabasePath(f4429a);
            if (databasePath != null && databasePath.canWrite()) {
                databasePath.delete();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
