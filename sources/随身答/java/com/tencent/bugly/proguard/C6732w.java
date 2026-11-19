package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.w */
/* loaded from: classes4.dex */
public final class C6732w {

    /* renamed from: a */
    public static boolean f6264a = false;

    /* renamed from: b */
    private static C6732w f6265b;

    /* renamed from: c */
    private static C6733x f6266c;

    /* renamed from: com.tencent.bugly.proguard.w$a */
    public class a extends Thread {

        /* renamed from: b */
        private int f6268b = 4;

        /* renamed from: c */
        private InterfaceC6731v f6269c = null;

        /* renamed from: d */
        private String f6270d;

        /* renamed from: e */
        private ContentValues f6271e;

        /* renamed from: f */
        private boolean f6272f;

        /* renamed from: g */
        private String[] f6273g;

        /* renamed from: h */
        private String f6274h;

        /* renamed from: i */
        private String[] f6275i;

        /* renamed from: j */
        private String f6276j;

        /* renamed from: k */
        private String f6277k;

        /* renamed from: l */
        private String f6278l;

        /* renamed from: m */
        private String f6279m;

        /* renamed from: n */
        private String f6280n;

        /* renamed from: o */
        private String[] f6281o;

        /* renamed from: p */
        private int f6282p;

        /* renamed from: q */
        private String f6283q;

        /* renamed from: r */
        private byte[] f6284r;

        public a() {
        }

        /* renamed from: a */
        public final void m5498a(int i9, String str, byte[] bArr) {
            this.f6282p = i9;
            this.f6283q = str;
            this.f6284r = bArr;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            switch (this.f6268b) {
                case 1:
                    C6732w.this.m5489a(this.f6270d, this.f6271e, this.f6269c);
                    break;
                case 2:
                    C6732w.this.m5471a(this.f6270d, this.f6280n, this.f6281o, this.f6269c);
                    break;
                case 3:
                    Cursor cursorM5474a = C6732w.this.m5474a(this.f6272f, this.f6270d, this.f6273g, this.f6274h, this.f6275i, this.f6276j, this.f6277k, this.f6278l, this.f6279m, this.f6269c);
                    if (cursorM5474a != null) {
                        cursorM5474a.close();
                        break;
                    }
                    break;
                case 4:
                    C6732w.this.m5480a(this.f6282p, this.f6283q, this.f6284r, this.f6269c);
                    break;
                case 5:
                    C6732w.this.m5493a(this.f6282p, this.f6269c);
                    break;
                case 6:
                    C6732w.this.m5479a(this.f6282p, this.f6283q, this.f6269c);
                    break;
            }
        }
    }

    private C6732w(Context context, List<AbstractC6724o> list) {
        f6266c = new C6733x(context, list);
    }

    /* renamed from: b */
    private synchronized boolean m5484b(C6734y c6734y) {
        ContentValues contentValuesM5487d;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f6266c.getWritableDatabase();
            if (writableDatabase == null || (contentValuesM5487d = m5487d(c6734y)) == null) {
                return false;
            }
            long jReplace = writableDatabase.replace("t_pf", "_id", contentValuesM5487d);
            if (jReplace < 0) {
                if (f6264a) {
                    writableDatabase.close();
                }
                return false;
            }
            C6674al.m5106c("[Database] insert %s success.", "t_pf");
            c6734y.f6289a = jReplace;
            if (f6264a) {
                writableDatabase.close();
            }
            return true;
        } catch (Throwable th) {
            try {
                if (!C6674al.m5103a(th)) {
                    th.printStackTrace();
                }
                if (f6264a && writableDatabase != null) {
                    writableDatabase.close();
                }
                return false;
            } finally {
                if (f6264a && writableDatabase != null) {
                    writableDatabase.close();
                }
            }
        }
    }

    /* renamed from: c */
    private static ContentValues m5485c(C6734y c6734y) {
        if (c6734y == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j9 = c6734y.f6289a;
            if (j9 > 0) {
                contentValues.put("_id", Long.valueOf(j9));
            }
            contentValues.put("_tp", Integer.valueOf(c6734y.f6290b));
            contentValues.put("_pc", c6734y.f6291c);
            contentValues.put("_th", c6734y.f6292d);
            contentValues.put("_tm", Long.valueOf(c6734y.f6293e));
            byte[] bArr = c6734y.f6295g;
            if (bArr != null) {
                contentValues.put("_dt", bArr);
            }
            return contentValues;
        } catch (Throwable th) {
            if (!C6674al.m5103a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: d */
    private static ContentValues m5487d(C6734y c6734y) {
        if (c6734y != null && !C6678ap.m5165b(c6734y.f6294f)) {
            try {
                ContentValues contentValues = new ContentValues();
                long j9 = c6734y.f6289a;
                if (j9 > 0) {
                    contentValues.put("_id", Long.valueOf(j9));
                }
                contentValues.put("_tp", c6734y.f6294f);
                contentValues.put("_tm", Long.valueOf(c6734y.f6293e));
                byte[] bArr = c6734y.f6295g;
                if (bArr != null) {
                    contentValues.put("_dt", bArr);
                }
                return contentValues;
            } catch (Throwable th) {
                if (!C6674al.m5103a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized C6732w m5476a(Context context, List<AbstractC6724o> list) {
        try {
            if (f6265b == null) {
                f6265b = new C6732w(context, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6265b;
    }

    /* renamed from: a */
    public static synchronized C6732w m5475a() {
        return f6265b;
    }

    /* renamed from: a */
    public final Cursor m5490a(String str, String[] strArr, String str2) {
        return m5491a(str, strArr, str2, (String) null, (String) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab A[Catch: all -> 0x0027, PHI: r2
      0x00ab: PHI (r2v2 android.database.sqlite.SQLiteDatabase) = (r2v1 android.database.sqlite.SQLiteDatabase), (r2v3 android.database.sqlite.SQLiteDatabase) binds: [B:56:0x00c9, B:41:0x00a9] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x0027, blocks: (B:9:0x0023, B:12:0x002b, B:14:0x002f, B:32:0x0095, B:34:0x009c, B:53:0x00c2, B:54:0x00c5, B:42:0x00ab, B:61:0x00d0, B:62:0x00d3, B:65:0x00d9, B:66:0x00dc, B:39:0x00a5, B:46:0x00b3, B:48:0x00b9), top: B:73:0x0002, inners: #3 }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized java.util.List<com.tencent.bugly.proguard.C6734y> m5486c(int r11) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C6732w.m5486c(int):java.util.List");
    }

    /* renamed from: a */
    public final Cursor m5491a(String str, String[] strArr, String str2, String str3, String str4) {
        return m5474a(false, str, strArr, str2, null, null, null, str3, str4, null);
    }

    /* renamed from: a */
    public final int m5488a(String str, String str2) {
        return m5471a(str, str2, (String[]) null, (InterfaceC6731v) null);
    }

    /* renamed from: a */
    public final synchronized long m5489a(String str, ContentValues contentValues, InterfaceC6731v interfaceC6731v) {
        long j9;
        j9 = -1;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f6266c.getWritableDatabase();
            if (writableDatabase != null && contentValues != null) {
                long jReplace = writableDatabase.replace(str, "_id", contentValues);
                if (jReplace >= 0) {
                    C6674al.m5106c("[Database] insert %s success.", str);
                } else {
                    C6674al.m5107d("[Database] replace %s error.", str);
                }
                j9 = jReplace;
            }
        } catch (Throwable th) {
            try {
                if (!C6674al.m5103a(th)) {
                    th.printStackTrace();
                }
                if (f6264a && 0 != 0) {
                }
            } finally {
                if (f6264a && 0 != 0) {
                    writableDatabase.close();
                }
            }
        }
        return j9;
    }

    /* renamed from: b */
    public final synchronized void m5497b(int i9) {
        String strConcat;
        SQLiteDatabase writableDatabase = f6266c.getWritableDatabase();
        if (writableDatabase != null) {
            if (i9 >= 0) {
                try {
                    strConcat = "_tp = ".concat(String.valueOf(i9));
                } catch (Throwable th) {
                    try {
                        if (!C6674al.m5103a(th)) {
                            th.printStackTrace();
                        }
                        if (f6264a) {
                            writableDatabase.close();
                            return;
                        }
                    } finally {
                        if (f6264a) {
                            writableDatabase.close();
                        }
                    }
                }
            } else {
                strConcat = null;
            }
            C6674al.m5106c("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", strConcat, null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized Cursor m5474a(boolean z9, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, InterfaceC6731v interfaceC6731v) {
        Cursor cursorQuery;
        cursorQuery = null;
        try {
            SQLiteDatabase writableDatabase = f6266c.getWritableDatabase();
            if (writableDatabase != null) {
                cursorQuery = writableDatabase.query(z9, str, strArr, str2, strArr2, str3, str4, str5, str6);
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
    public synchronized int m5471a(String str, String str2, String[] strArr, InterfaceC6731v interfaceC6731v) {
        int iDelete;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f6266c.getWritableDatabase();
            iDelete = writableDatabase != null ? writableDatabase.delete(str, str2, strArr) : 0;
        } catch (Throwable th) {
            try {
                if (!C6674al.m5103a(th)) {
                    th.printStackTrace();
                }
                if (f6264a && writableDatabase != null) {
                }
            } finally {
                if (f6264a && writableDatabase != null) {
                    writableDatabase.close();
                }
            }
        }
        return iDelete;
    }

    /* renamed from: b */
    private static C6734y m5483b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            C6734y c6734y = new C6734y();
            c6734y.f6289a = cursor.getLong(cursor.getColumnIndex("_id"));
            c6734y.f6293e = cursor.getLong(cursor.getColumnIndex("_tm"));
            c6734y.f6294f = cursor.getString(cursor.getColumnIndex("_tp"));
            c6734y.f6295g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return c6734y;
        } catch (Throwable th) {
            if (!C6674al.m5103a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    public final boolean m5495a(int i9, String str, byte[] bArr, boolean z9) {
        if (!z9) {
            a aVar = new a();
            aVar.m5498a(i9, str, bArr);
            C6673ak.m5093a().m5095a(aVar);
            return true;
        }
        return m5480a(i9, str, bArr, (InterfaceC6731v) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m5480a(int i9, String str, byte[] bArr, InterfaceC6731v interfaceC6731v) {
        try {
            C6734y c6734y = new C6734y();
            c6734y.f6289a = i9;
            c6734y.f6294f = str;
            c6734y.f6293e = System.currentTimeMillis();
            c6734y.f6295g = bArr;
            return m5484b(c6734y);
        } catch (Throwable th) {
            if (C6674al.m5103a(th)) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final Map<String, byte[]> m5493a(int i9, InterfaceC6731v interfaceC6731v) {
        HashMap map = null;
        try {
            List<C6734y> listM5486c = m5486c(i9);
            if (listM5486c == null) {
                return null;
            }
            HashMap map2 = new HashMap();
            try {
                for (C6734y c6734y : listM5486c) {
                    byte[] bArr = c6734y.f6295g;
                    if (bArr != null) {
                        map2.put(c6734y.f6294f, bArr);
                    }
                }
                return map2;
            } catch (Throwable th) {
                th = th;
                map = map2;
                if (!C6674al.m5103a(th)) {
                    th.printStackTrace();
                }
                return map;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public final synchronized boolean m5496a(C6734y c6734y) {
        ContentValues contentValuesM5485c;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f6266c.getWritableDatabase();
            if (writableDatabase == null || (contentValuesM5485c = m5485c(c6734y)) == null) {
                return false;
            }
            long jReplace = writableDatabase.replace("t_lr", "_id", contentValuesM5485c);
            if (jReplace >= 0) {
                C6674al.m5106c("[Database] insert %s success.", "t_lr");
                c6734y.f6289a = jReplace;
                if (f6264a) {
                    writableDatabase.close();
                }
                return true;
            }
            if (f6264a) {
                writableDatabase.close();
            }
            return false;
        } catch (Throwable th) {
            try {
                if (!C6674al.m5103a(th)) {
                    th.printStackTrace();
                }
                if (f6264a && writableDatabase != null) {
                    writableDatabase.close();
                }
                return false;
            } finally {
                if (f6264a && writableDatabase != null) {
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
    public final synchronized java.util.List<com.tencent.bugly.proguard.C6734y> m5492a(int r11) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C6732w.m5492a(int):java.util.List");
    }

    /* renamed from: a */
    public final synchronized void m5494a(List<C6734y> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    SQLiteDatabase writableDatabase = f6266c.getWritableDatabase();
                    if (writableDatabase != null) {
                        StringBuilder sb = new StringBuilder();
                        for (C6734y c6734y : list) {
                            sb.append(" or _id = ");
                            sb.append(c6734y.f6289a);
                        }
                        String string = sb.toString();
                        if (string.length() > 0) {
                            string = string.substring(4);
                        }
                        sb.setLength(0);
                        try {
                            C6674al.m5106c("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", string, null)));
                        } catch (Throwable th) {
                            try {
                                if (!C6674al.m5103a(th)) {
                                    th.printStackTrace();
                                }
                                if (f6264a) {
                                    writableDatabase.close();
                                }
                            } finally {
                                if (f6264a) {
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
    private static C6734y m5477a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            C6734y c6734y = new C6734y();
            c6734y.f6289a = cursor.getLong(cursor.getColumnIndex("_id"));
            c6734y.f6290b = cursor.getInt(cursor.getColumnIndex("_tp"));
            c6734y.f6291c = cursor.getString(cursor.getColumnIndex("_pc"));
            c6734y.f6292d = cursor.getString(cursor.getColumnIndex("_th"));
            c6734y.f6293e = cursor.getLong(cursor.getColumnIndex("_tm"));
            c6734y.f6295g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return c6734y;
        } catch (Throwable th) {
            if (!C6674al.m5103a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized boolean m5479a(int i9, String str, InterfaceC6731v interfaceC6731v) {
        boolean z9;
        String strConcat;
        z9 = false;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase writableDatabase = f6266c.getWritableDatabase();
            if (writableDatabase != null) {
                try {
                    if (C6678ap.m5165b(str)) {
                        strConcat = "_id = ".concat(String.valueOf(i9));
                    } else {
                        strConcat = "_id = " + i9 + " and _tp = \"" + str + "\"";
                    }
                    int iDelete = writableDatabase.delete("t_pf", strConcat, null);
                    C6674al.m5106c("[Database] deleted %s data %d", "t_pf", Integer.valueOf(iDelete));
                    if (iDelete > 0) {
                        z9 = true;
                    }
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase = writableDatabase;
                    try {
                        if (!C6674al.m5103a(th)) {
                            th.printStackTrace();
                        }
                        return z9;
                    } finally {
                        if (f6264a && sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                    }
                }
            }
            if (f6264a && writableDatabase != null) {
                writableDatabase.close();
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return z9;
    }
}
