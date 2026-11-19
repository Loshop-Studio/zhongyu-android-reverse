package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.w */
/* loaded from: classes3.dex */
public final class C4143w {

    /* renamed from: a */
    public static boolean f3902a = false;

    /* renamed from: b */
    private static C4143w f3903b;

    /* renamed from: c */
    private static C4145x f3904c;

    private C4143w(Context context, List<AbstractC4127o> list) {
        f3904c = new C4145x(context, list);
    }

    /* renamed from: b */
    private synchronized boolean m3402b(C4147y c4147y) {
        ContentValues contentValuesM3405d;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f3904c.getWritableDatabase();
            if (writableDatabase == null || (contentValuesM3405d = m3405d(c4147y)) == null) {
                return false;
            }
            long jReplace = writableDatabase.replace("t_pf", "_id", contentValuesM3405d);
            if (jReplace < 0) {
                if (f3902a) {
                    writableDatabase.close();
                }
                return false;
            }
            C4055al.m3025c("[Database] insert %s success.", "t_pf");
            c4147y.f3909a = jReplace;
            if (f3902a) {
                writableDatabase.close();
            }
            return true;
        } catch (Throwable th) {
            try {
                if (!C4055al.m3022a(th)) {
                    th.printStackTrace();
                }
                if (f3902a && writableDatabase != null) {
                    writableDatabase.close();
                }
                return false;
            } finally {
                if (f3902a && writableDatabase != null) {
                    writableDatabase.close();
                }
            }
        }
    }

    /* renamed from: c */
    private static ContentValues m3403c(C4147y c4147y) {
        if (c4147y == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j7 = c4147y.f3909a;
            if (j7 > 0) {
                contentValues.put("_id", Long.valueOf(j7));
            }
            contentValues.put("_tp", Integer.valueOf(c4147y.f3910b));
            contentValues.put("_pc", c4147y.f3911c);
            contentValues.put("_th", c4147y.f3912d);
            contentValues.put("_tm", Long.valueOf(c4147y.f3913e));
            byte[] bArr = c4147y.f3915g;
            if (bArr != null) {
                contentValues.put("_dt", bArr);
            }
            return contentValues;
        } catch (Throwable th) {
            if (!C4055al.m3022a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: d */
    private static ContentValues m3405d(C4147y c4147y) {
        if (c4147y != null && !C4059ap.m3084b(c4147y.f3914f)) {
            try {
                ContentValues contentValues = new ContentValues();
                long j7 = c4147y.f3909a;
                if (j7 > 0) {
                    contentValues.put("_id", Long.valueOf(j7));
                }
                contentValues.put("_tp", c4147y.f3914f);
                contentValues.put("_tm", Long.valueOf(c4147y.f3913e));
                byte[] bArr = c4147y.f3915g;
                if (bArr != null) {
                    contentValues.put("_dt", bArr);
                }
                return contentValues;
            } catch (Throwable th) {
                if (!C4055al.m3022a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized C4143w m3394a(Context context, List<AbstractC4127o> list) {
        try {
            if (f3903b == null) {
                f3903b = new C4143w(context, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3903b;
    }

    /* renamed from: a */
    public static synchronized C4143w m3393a() {
        return f3903b;
    }

    /* renamed from: a */
    public final Cursor m3408a(String str, String[] strArr, String str2) {
        return m3409a(str, strArr, str2, (String) null, (String) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab A[Catch: all -> 0x0027, PHI: r2
      0x00ab: PHI (r2v2 android.database.sqlite.SQLiteDatabase) = (r2v1 android.database.sqlite.SQLiteDatabase), (r2v3 android.database.sqlite.SQLiteDatabase) binds: [B:56:0x00c9, B:41:0x00a9] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x0027, blocks: (B:9:0x0023, B:12:0x002b, B:14:0x002f, B:32:0x0095, B:34:0x009c, B:53:0x00c2, B:54:0x00c5, B:42:0x00ab, B:61:0x00d0, B:62:0x00d3, B:65:0x00d9, B:66:0x00dc, B:39:0x00a5, B:46:0x00b3, B:48:0x00b9), top: B:73:0x0002, inners: #3 }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized java.util.List<com.tencent.bugly.proguard.C4147y> m3404c(int r11) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C4143w.m3404c(int):java.util.List");
    }

    /* renamed from: a */
    public final Cursor m3409a(String str, String[] strArr, String str2, String str3, String str4) {
        return m3392a(false, str, strArr, str2, null, null, null, str3, str4, null);
    }

    /* renamed from: a */
    public final int m3406a(String str, String str2) {
        return m3389a(str, str2, (String[]) null, (InterfaceC4141v) null);
    }

    /* renamed from: a */
    public final synchronized long m3407a(String str, ContentValues contentValues, InterfaceC4141v interfaceC4141v) {
        long j7;
        j7 = -1;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f3904c.getWritableDatabase();
            if (writableDatabase != null && contentValues != null) {
                long jReplace = writableDatabase.replace(str, "_id", contentValues);
                if (jReplace >= 0) {
                    C4055al.m3025c("[Database] insert %s success.", str);
                } else {
                    C4055al.m3026d("[Database] replace %s error.", str);
                }
                j7 = jReplace;
            }
        } catch (Throwable th) {
            try {
                if (!C4055al.m3022a(th)) {
                    th.printStackTrace();
                }
                if (f3902a && 0 != 0) {
                }
            } finally {
                if (f3902a && 0 != 0) {
                    writableDatabase.close();
                }
            }
        }
        return j7;
    }

    /* renamed from: b */
    public final synchronized void m3415b(int i) {
        String strConcat;
        SQLiteDatabase writableDatabase = f3904c.getWritableDatabase();
        if (writableDatabase != null) {
            if (i >= 0) {
                try {
                    strConcat = "_tp = ".concat(String.valueOf(i));
                } catch (Throwable th) {
                    try {
                        if (!C4055al.m3022a(th)) {
                            th.printStackTrace();
                        }
                        if (f3902a) {
                            writableDatabase.close();
                            return;
                        }
                    } finally {
                        if (f3902a) {
                            writableDatabase.close();
                        }
                    }
                }
            } else {
                strConcat = null;
            }
            C4055al.m3025c("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", strConcat, null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized Cursor m3392a(boolean z8, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, InterfaceC4141v interfaceC4141v) {
        Cursor cursorQuery;
        cursorQuery = null;
        try {
            SQLiteDatabase writableDatabase = f3904c.getWritableDatabase();
            if (writableDatabase != null) {
                cursorQuery = writableDatabase.query(z8, str, strArr, str2, strArr2, str3, str4, str5, str6);
            }
        } finally {
            try {
                return cursorQuery;
            } finally {
            }
        }
        return cursorQuery;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized int m3389a(String str, String str2, String[] strArr, InterfaceC4141v interfaceC4141v) {
        int iDelete;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f3904c.getWritableDatabase();
            iDelete = writableDatabase != null ? writableDatabase.delete(str, str2, strArr) : 0;
        } catch (Throwable th) {
            try {
                if (!C4055al.m3022a(th)) {
                    th.printStackTrace();
                }
                if (f3902a && writableDatabase != null) {
                }
            } finally {
                if (f3902a && writableDatabase != null) {
                    writableDatabase.close();
                }
            }
        }
        return iDelete;
    }

    /* renamed from: b */
    private static C4147y m3401b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            C4147y c4147y = new C4147y();
            c4147y.f3909a = cursor.getLong(cursor.getColumnIndex("_id"));
            c4147y.f3913e = cursor.getLong(cursor.getColumnIndex("_tm"));
            c4147y.f3914f = cursor.getString(cursor.getColumnIndex("_tp"));
            c4147y.f3915g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return c4147y;
        } catch (Throwable th) {
            if (!C4055al.m3022a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    public final boolean m3413a(int i, String str, byte[] bArr, boolean z8) {
        if (!z8) {
            C4118j1 c4118j1 = new C4118j1(this);
            c4118j1.f3840b = i;
            c4118j1.f3841c = str;
            c4118j1.f3842d = bArr;
            C4054ak.m3012a().m3014a(c4118j1);
            return true;
        }
        return m3398a(i, str, bArr, (InterfaceC4141v) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m3398a(int i, String str, byte[] bArr, InterfaceC4141v interfaceC4141v) {
        try {
            C4147y c4147y = new C4147y();
            c4147y.f3909a = i;
            c4147y.f3914f = str;
            c4147y.f3913e = System.currentTimeMillis();
            c4147y.f3915g = bArr;
            return m3402b(c4147y);
        } catch (Throwable th) {
            if (C4055al.m3022a(th)) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final Map<String, byte[]> m3411a(int i, InterfaceC4141v interfaceC4141v) {
        HashMap map = null;
        try {
            List<C4147y> listM3404c = m3404c(i);
            if (listM3404c == null) {
                return null;
            }
            HashMap map2 = new HashMap();
            try {
                for (C4147y c4147y : listM3404c) {
                    byte[] bArr = c4147y.f3915g;
                    if (bArr != null) {
                        map2.put(c4147y.f3914f, bArr);
                    }
                }
                return map2;
            } catch (Throwable th) {
                th = th;
                map = map2;
                if (!C4055al.m3022a(th)) {
                    th.printStackTrace();
                }
                return map;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public final synchronized boolean m3414a(C4147y c4147y) {
        ContentValues contentValuesM3403c;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f3904c.getWritableDatabase();
            if (writableDatabase == null || (contentValuesM3403c = m3403c(c4147y)) == null) {
                return false;
            }
            long jReplace = writableDatabase.replace("t_lr", "_id", contentValuesM3403c);
            if (jReplace >= 0) {
                C4055al.m3025c("[Database] insert %s success.", "t_lr");
                c4147y.f3909a = jReplace;
                if (f3902a) {
                    writableDatabase.close();
                }
                return true;
            }
            if (f3902a) {
                writableDatabase.close();
            }
            return false;
        } catch (Throwable th) {
            try {
                if (!C4055al.m3022a(th)) {
                    th.printStackTrace();
                }
                if (f3902a && writableDatabase != null) {
                    writableDatabase.close();
                }
                return false;
            } finally {
                if (f3902a && writableDatabase != null) {
                    writableDatabase.close();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae A[Catch: all -> 0x00b2, TRY_LEAVE, TryCatch #1 {all -> 0x00b2, blocks: (B:42:0x00a8, B:44:0x00ae), top: B:64:0x00a8, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #0 {all -> 0x0031, blocks: (B:3:0x0001, B:14:0x002d, B:17:0x0035, B:19:0x0039, B:37:0x009c, B:39:0x00a3, B:49:0x00b7, B:50:0x00ba, B:52:0x00be, B:54:0x00c4, B:55:0x00c7, B:57:0x00cb, B:58:0x00ce, B:42:0x00a8, B:44:0x00ae), top: B:63:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:3:0x0001, B:14:0x002d, B:17:0x0035, B:19:0x0039, B:37:0x009c, B:39:0x00a3, B:49:0x00b7, B:50:0x00ba, B:52:0x00be, B:54:0x00c4, B:55:0x00c7, B:57:0x00cb, B:58:0x00ce, B:42:0x00a8, B:44:0x00ae), top: B:63:0x0001, inners: #1 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.tencent.bugly.proguard.C4147y> m3410a(int r11) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C4143w.m3410a(int):java.util.List");
    }

    /* renamed from: a */
    public final synchronized void m3412a(List<C4147y> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    SQLiteDatabase writableDatabase = f3904c.getWritableDatabase();
                    if (writableDatabase != null) {
                        StringBuilder sb = new StringBuilder();
                        for (C4147y c4147y : list) {
                            sb.append(" or _id = ");
                            sb.append(c4147y.f3909a);
                        }
                        String string = sb.toString();
                        if (string.length() > 0) {
                            string = string.substring(4);
                        }
                        sb.setLength(0);
                        try {
                            C4055al.m3025c("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", string, null)));
                        } catch (Throwable th) {
                            try {
                                if (!C4055al.m3022a(th)) {
                                    th.printStackTrace();
                                }
                                if (f3902a) {
                                    writableDatabase.close();
                                }
                            } finally {
                                if (f3902a) {
                                    writableDatabase.close();
                                }
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: a */
    private static C4147y m3395a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            C4147y c4147y = new C4147y();
            c4147y.f3909a = cursor.getLong(cursor.getColumnIndex("_id"));
            c4147y.f3910b = cursor.getInt(cursor.getColumnIndex("_tp"));
            c4147y.f3911c = cursor.getString(cursor.getColumnIndex("_pc"));
            c4147y.f3912d = cursor.getString(cursor.getColumnIndex("_th"));
            c4147y.f3913e = cursor.getLong(cursor.getColumnIndex("_tm"));
            c4147y.f3915g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return c4147y;
        } catch (Throwable th) {
            if (!C4055al.m3022a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized boolean m3397a(int i, String str, InterfaceC4141v interfaceC4141v) {
        boolean z8;
        String strConcat;
        z8 = false;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase writableDatabase = f3904c.getWritableDatabase();
            if (writableDatabase != null) {
                try {
                    if (C4059ap.m3084b(str)) {
                        strConcat = "_id = ".concat(String.valueOf(i));
                    } else {
                        strConcat = "_id = " + i + " and _tp = \"" + str + "\"";
                    }
                    int iDelete = writableDatabase.delete("t_pf", strConcat, null);
                    C4055al.m3025c("[Database] deleted %s data %d", "t_pf", Integer.valueOf(iDelete));
                    if (iDelete > 0) {
                        z8 = true;
                    }
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase = writableDatabase;
                    try {
                        if (!C4055al.m3022a(th)) {
                            th.printStackTrace();
                        }
                        return z8;
                    } finally {
                        if (f3902a && sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                    }
                }
            }
            if (f3902a && writableDatabase != null) {
                writableDatabase.close();
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return z8;
    }
}
