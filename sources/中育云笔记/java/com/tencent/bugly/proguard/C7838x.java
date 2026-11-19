package com.tencent.bugly.proguard;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.x */
/* loaded from: classes5.dex */
public final class C7838x extends SQLiteOpenHelper {

    /* renamed from: a */
    public static String f14150a = "bugly_db";

    /* renamed from: b */
    public static int f14151b = 16;

    /* renamed from: c */
    protected Context f14152c;

    /* renamed from: d */
    private List<AbstractC7829o> f14153d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7838x(Context context, List<AbstractC7829o> list) {
        super(context, f14150a + BundleUtil.UNDERLINE_TAG, (SQLiteDatabase.CursorFactory) null, f14151b);
        C7768aa.m10478a(context).getClass();
        this.f14152c = context;
        this.f14153d = list;
    }

    /* renamed from: a */
    private synchronized boolean m11010a(SQLiteDatabase sQLiteDatabase) {
        try {
            String[] strArr = {"t_lr", "t_ui", "t_pf"};
            for (int i10 = 0; i10 < 3; i10++) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(String.valueOf(strArr[i10])), new String[0]);
            }
        } catch (Throwable th) {
            if (!C7779al.m10616b(th)) {
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
        int i10 = 0;
        while (readableDatabase == null && i10 < 5) {
            i10++;
            try {
                readableDatabase = super.getReadableDatabase();
            } catch (Throwable unused) {
                C7779al.m10618d("[Database] Try to get db(count: %d).", Integer.valueOf(i10));
                if (i10 == 5) {
                    C7779al.m10619e("[Database] Failed to get db.", new Object[0]);
                }
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
            }
        }
        return readableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase writableDatabase;
        writableDatabase = null;
        int i10 = 0;
        while (writableDatabase == null && i10 < 5) {
            i10++;
            try {
                writableDatabase = super.getWritableDatabase();
            } catch (Throwable unused) {
                C7779al.m10618d("[Database] Try to get db(count: %d).", Integer.valueOf(i10));
                if (i10 == 5) {
                    C7779al.m10619e("[Database] Failed to get db.", new Object[0]);
                }
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
            }
        }
        if (writableDatabase == null) {
            C7779al.m10618d("[Database] db error delay error record 1min.", new Object[0]);
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C7838x.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @TargetApi(11)
    public final synchronized void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            if (C7769ab.m10521c() >= 11) {
                C7779al.m10618d("[Database] Downgrade %d to %d drop tables.", Integer.valueOf(i10), Integer.valueOf(i11));
                List<AbstractC7829o> list = this.f14153d;
                if (list != null) {
                    Iterator<AbstractC7829o> it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            it.next().onDbDowngrade(sQLiteDatabase, i10, i11);
                        } catch (Throwable th) {
                            if (!C7779al.m10616b(th)) {
                                th.printStackTrace();
                            }
                        }
                    }
                }
                if (m11010a(sQLiteDatabase)) {
                    onCreate(sQLiteDatabase);
                    return;
                }
                C7779al.m10618d("[Database] Failed to drop, delete db.", new Object[0]);
                File databasePath = this.f14152c.getDatabasePath(f14150a);
                if (databasePath != null && databasePath.canWrite()) {
                    databasePath.delete();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            C7779al.m10618d("[Database] Upgrade %d to %d , drop tables!", Integer.valueOf(i10), Integer.valueOf(i11));
            List<AbstractC7829o> list = this.f14153d;
            if (list != null) {
                Iterator<AbstractC7829o> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().onDbUpgrade(sQLiteDatabase, i10, i11);
                    } catch (Throwable th) {
                        if (!C7779al.m10616b(th)) {
                            th.printStackTrace();
                        }
                    }
                }
            }
            if (m11010a(sQLiteDatabase)) {
                onCreate(sQLiteDatabase);
                return;
            }
            C7779al.m10618d("[Database] Failed to drop, delete db.", new Object[0]);
            File databasePath = this.f14152c.getDatabasePath(f14150a);
            if (databasePath != null && databasePath.canWrite()) {
                databasePath.delete();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
