package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.w */
/* loaded from: classes5.dex */
public final class C7837w {

    /* renamed from: a */
    public static boolean f14129a = false;

    /* renamed from: b */
    private static C7837w f14130b;

    /* renamed from: c */
    private static C7838x f14131c;

    /* renamed from: com.tencent.bugly.proguard.w$a */
    public class a extends Thread {

        /* renamed from: c */
        public int f14132c = 4;

        /* renamed from: d */
        public InterfaceC7836v f14133d = null;

        /* renamed from: e */
        public String f14134e;

        /* renamed from: f */
        public ContentValues f14135f;

        /* renamed from: g */
        public boolean f14136g;

        /* renamed from: h */
        public String[] f14137h;

        /* renamed from: i */
        public String f14138i;

        /* renamed from: j */
        public String[] f14139j;

        /* renamed from: k */
        public String f14140k;

        /* renamed from: l */
        public String f14141l;

        /* renamed from: m */
        public String f14142m;

        /* renamed from: n */
        public String f14143n;

        /* renamed from: o */
        public String f14144o;

        /* renamed from: p */
        public String[] f14145p;

        /* renamed from: q */
        public int f14146q;

        /* renamed from: r */
        public String f14147r;

        /* renamed from: s */
        public byte[] f14148s;

        public a() {
        }

        /* renamed from: a */
        public final void m11009a(int i10, String str, byte[] bArr) {
            this.f14146q = i10;
            this.f14147r = str;
            this.f14148s = bArr;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            switch (this.f14132c) {
                case 1:
                    C7837w.this.m11000a(this.f14134e, this.f14135f, this.f14133d);
                    break;
                case 2:
                    C7837w.this.m10982a(this.f14134e, this.f14144o, this.f14145p, this.f14133d);
                    break;
                case 3:
                    Cursor cursorM10985a = C7837w.this.m10985a(this.f14136g, this.f14134e, this.f14137h, this.f14138i, this.f14139j, this.f14140k, this.f14141l, this.f14142m, this.f14143n, this.f14133d);
                    if (cursorM10985a != null) {
                        cursorM10985a.close();
                        break;
                    }
                    break;
                case 4:
                    C7837w.this.m10991a(this.f14146q, this.f14147r, this.f14148s, this.f14133d);
                    break;
                case 5:
                    C7837w.this.m11004a(this.f14146q, this.f14133d);
                    break;
                case 6:
                    C7837w.this.m10990a(this.f14146q, this.f14147r, this.f14133d);
                    break;
            }
        }
    }

    private C7837w(Context context, List<AbstractC7829o> list) {
        f14131c = new C7838x(context, list);
    }

    /* renamed from: b */
    private synchronized boolean m10995b(C7839y c7839y) {
        ContentValues contentValuesM10998d;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f14131c.getWritableDatabase();
            if (writableDatabase == null || (contentValuesM10998d = m10998d(c7839y)) == null) {
                return false;
            }
            long jReplace = writableDatabase.replace("t_pf", "_id", contentValuesM10998d);
            if (jReplace < 0) {
                if (f14129a) {
                    writableDatabase.close();
                }
                return false;
            }
            C7779al.m10617c("[Database] insert %s success.", "t_pf");
            c7839y.f14154a = jReplace;
            if (f14129a) {
                writableDatabase.close();
            }
            return true;
        } catch (Throwable th) {
            try {
                if (!C7779al.m10614a(th)) {
                    th.printStackTrace();
                }
                if (f14129a && writableDatabase != null) {
                    writableDatabase.close();
                }
                return false;
            } finally {
                if (f14129a && writableDatabase != null) {
                    writableDatabase.close();
                }
            }
        }
    }

    /* renamed from: c */
    private static ContentValues m10996c(C7839y c7839y) {
        if (c7839y == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j10 = c7839y.f14154a;
            if (j10 > 0) {
                contentValues.put("_id", Long.valueOf(j10));
            }
            contentValues.put("_tp", Integer.valueOf(c7839y.f14155b));
            contentValues.put("_pc", c7839y.f14156c);
            contentValues.put("_th", c7839y.f14157d);
            contentValues.put("_tm", Long.valueOf(c7839y.f14158e));
            byte[] bArr = c7839y.f14160g;
            if (bArr != null) {
                contentValues.put("_dt", bArr);
            }
            return contentValues;
        } catch (Throwable th) {
            if (!C7779al.m10614a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: d */
    private static ContentValues m10998d(C7839y c7839y) {
        if (c7839y != null && !C7783ap.m10676b(c7839y.f14159f)) {
            try {
                ContentValues contentValues = new ContentValues();
                long j10 = c7839y.f14154a;
                if (j10 > 0) {
                    contentValues.put("_id", Long.valueOf(j10));
                }
                contentValues.put("_tp", c7839y.f14159f);
                contentValues.put("_tm", Long.valueOf(c7839y.f14158e));
                byte[] bArr = c7839y.f14160g;
                if (bArr != null) {
                    contentValues.put("_dt", bArr);
                }
                return contentValues;
            } catch (Throwable th) {
                if (!C7779al.m10614a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized C7837w m10987a(Context context, List<AbstractC7829o> list) {
        try {
            if (f14130b == null) {
                f14130b = new C7837w(context, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14130b;
    }

    /* renamed from: a */
    public static synchronized C7837w m10986a() {
        return f14130b;
    }

    /* renamed from: a */
    public final Cursor m11001a(String str, String[] strArr, String str2) {
        return m11002a(str, strArr, str2, (String) null, (String) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab A[Catch: all -> 0x0027, PHI: r2
      0x00ab: PHI (r2v2 android.database.sqlite.SQLiteDatabase) = (r2v1 android.database.sqlite.SQLiteDatabase), (r2v3 android.database.sqlite.SQLiteDatabase) binds: [B:56:0x00c9, B:41:0x00a9] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x0027, blocks: (B:9:0x0023, B:12:0x002b, B:14:0x002f, B:32:0x0095, B:34:0x009c, B:53:0x00c2, B:54:0x00c5, B:42:0x00ab, B:61:0x00d0, B:62:0x00d3, B:65:0x00d9, B:66:0x00dc, B:39:0x00a5, B:46:0x00b3, B:48:0x00b9), top: B:73:0x0002, inners: #3 }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized java.util.List<com.tencent.bugly.proguard.C7839y> m10997c(int r11) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C7837w.m10997c(int):java.util.List");
    }

    /* renamed from: a */
    public final Cursor m11002a(String str, String[] strArr, String str2, String str3, String str4) {
        return m10985a(false, str, strArr, str2, null, null, null, str3, str4, null);
    }

    /* renamed from: a */
    public final int m10999a(String str, String str2) {
        return m10982a(str, str2, (String[]) null, (InterfaceC7836v) null);
    }

    /* renamed from: a */
    public final synchronized long m11000a(String str, ContentValues contentValues, InterfaceC7836v interfaceC7836v) {
        long j10;
        j10 = -1;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f14131c.getWritableDatabase();
            if (writableDatabase != null && contentValues != null) {
                long jReplace = writableDatabase.replace(str, "_id", contentValues);
                if (jReplace >= 0) {
                    C7779al.m10617c("[Database] insert %s success.", str);
                } else {
                    C7779al.m10618d("[Database] replace %s error.", str);
                }
                j10 = jReplace;
            }
        } catch (Throwable th) {
            try {
                if (!C7779al.m10614a(th)) {
                    th.printStackTrace();
                }
                if (f14129a && 0 != 0) {
                }
            } finally {
                if (f14129a && 0 != 0) {
                    writableDatabase.close();
                }
            }
        }
        return j10;
    }

    /* renamed from: b */
    public final synchronized void m11008b(int i10) {
        String strConcat;
        SQLiteDatabase writableDatabase = f14131c.getWritableDatabase();
        if (writableDatabase != null) {
            if (i10 >= 0) {
                try {
                    strConcat = "_tp = ".concat(String.valueOf(i10));
                } catch (Throwable th) {
                    try {
                        if (!C7779al.m10614a(th)) {
                            th.printStackTrace();
                        }
                        if (f14129a) {
                            writableDatabase.close();
                            return;
                        }
                    } finally {
                        if (f14129a) {
                            writableDatabase.close();
                        }
                    }
                }
            } else {
                strConcat = null;
            }
            C7779al.m10617c("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", strConcat, null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized Cursor m10985a(boolean z10, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, InterfaceC7836v interfaceC7836v) {
        Cursor cursorQuery;
        cursorQuery = null;
        try {
            SQLiteDatabase writableDatabase = f14131c.getWritableDatabase();
            if (writableDatabase != null) {
                cursorQuery = writableDatabase.query(z10, str, strArr, str2, strArr2, str3, str4, str5, str6);
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
    public synchronized int m10982a(String str, String str2, String[] strArr, InterfaceC7836v interfaceC7836v) {
        int iDelete;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f14131c.getWritableDatabase();
            iDelete = writableDatabase != null ? writableDatabase.delete(str, str2, strArr) : 0;
        } catch (Throwable th) {
            try {
                if (!C7779al.m10614a(th)) {
                    th.printStackTrace();
                }
                if (f14129a && writableDatabase != null) {
                }
            } finally {
                if (f14129a && writableDatabase != null) {
                    writableDatabase.close();
                }
            }
        }
        return iDelete;
    }

    /* renamed from: b */
    private static C7839y m10994b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            C7839y c7839y = new C7839y();
            c7839y.f14154a = cursor.getLong(cursor.getColumnIndex("_id"));
            c7839y.f14158e = cursor.getLong(cursor.getColumnIndex("_tm"));
            c7839y.f14159f = cursor.getString(cursor.getColumnIndex("_tp"));
            c7839y.f14160g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return c7839y;
        } catch (Throwable th) {
            if (!C7779al.m10614a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    public final boolean m11006a(int i10, String str, byte[] bArr, boolean z10) {
        if (!z10) {
            a aVar = new a();
            aVar.m11009a(i10, str, bArr);
            C7778ak.m10604a().m10606a(aVar);
            return true;
        }
        return m10991a(i10, str, bArr, (InterfaceC7836v) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m10991a(int i10, String str, byte[] bArr, InterfaceC7836v interfaceC7836v) {
        try {
            C7839y c7839y = new C7839y();
            c7839y.f14154a = i10;
            c7839y.f14159f = str;
            c7839y.f14158e = System.currentTimeMillis();
            c7839y.f14160g = bArr;
            return m10995b(c7839y);
        } catch (Throwable th) {
            if (C7779al.m10614a(th)) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final Map<String, byte[]> m11004a(int i10, InterfaceC7836v interfaceC7836v) {
        HashMap map = null;
        try {
            List<C7839y> listM10997c = m10997c(i10);
            if (listM10997c == null) {
                return null;
            }
            HashMap map2 = new HashMap();
            try {
                for (C7839y c7839y : listM10997c) {
                    byte[] bArr = c7839y.f14160g;
                    if (bArr != null) {
                        map2.put(c7839y.f14159f, bArr);
                    }
                }
                return map2;
            } catch (Throwable th) {
                th = th;
                map = map2;
                if (!C7779al.m10614a(th)) {
                    th.printStackTrace();
                }
                return map;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public final synchronized boolean m11007a(C7839y c7839y) {
        ContentValues contentValuesM10996c;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f14131c.getWritableDatabase();
            if (writableDatabase == null || (contentValuesM10996c = m10996c(c7839y)) == null) {
                return false;
            }
            long jReplace = writableDatabase.replace("t_lr", "_id", contentValuesM10996c);
            if (jReplace >= 0) {
                C7779al.m10617c("[Database] insert %s success.", "t_lr");
                c7839y.f14154a = jReplace;
                if (f14129a) {
                    writableDatabase.close();
                }
                return true;
            }
            if (f14129a) {
                writableDatabase.close();
            }
            return false;
        } catch (Throwable th) {
            try {
                if (!C7779al.m10614a(th)) {
                    th.printStackTrace();
                }
                if (f14129a && writableDatabase != null) {
                    writableDatabase.close();
                }
                return false;
            } finally {
                if (f14129a && writableDatabase != null) {
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
    public final synchronized java.util.List<com.tencent.bugly.proguard.C7839y> m11003a(int r11) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C7837w.m11003a(int):java.util.List");
    }

    /* renamed from: a */
    public final synchronized void m11005a(List<C7839y> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    SQLiteDatabase writableDatabase = f14131c.getWritableDatabase();
                    if (writableDatabase != null) {
                        StringBuilder sb2 = new StringBuilder();
                        for (C7839y c7839y : list) {
                            sb2.append(" or _id = ");
                            sb2.append(c7839y.f14154a);
                        }
                        String string = sb2.toString();
                        if (string.length() > 0) {
                            string = string.substring(4);
                        }
                        sb2.setLength(0);
                        try {
                            C7779al.m10617c("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", string, null)));
                        } catch (Throwable th) {
                            try {
                                if (!C7779al.m10614a(th)) {
                                    th.printStackTrace();
                                }
                                if (f14129a) {
                                    writableDatabase.close();
                                }
                            } finally {
                                if (f14129a) {
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
    private static C7839y m10988a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            C7839y c7839y = new C7839y();
            c7839y.f14154a = cursor.getLong(cursor.getColumnIndex("_id"));
            c7839y.f14155b = cursor.getInt(cursor.getColumnIndex("_tp"));
            c7839y.f14156c = cursor.getString(cursor.getColumnIndex("_pc"));
            c7839y.f14157d = cursor.getString(cursor.getColumnIndex("_th"));
            c7839y.f14158e = cursor.getLong(cursor.getColumnIndex("_tm"));
            c7839y.f14160g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return c7839y;
        } catch (Throwable th) {
            if (!C7779al.m10614a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized boolean m10990a(int i10, String str, InterfaceC7836v interfaceC7836v) {
        boolean z10;
        String strConcat;
        z10 = false;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase writableDatabase = f14131c.getWritableDatabase();
            if (writableDatabase != null) {
                try {
                    if (C7783ap.m10676b(str)) {
                        strConcat = "_id = ".concat(String.valueOf(i10));
                    } else {
                        strConcat = "_id = " + i10 + " and _tp = \"" + str + "\"";
                    }
                    int iDelete = writableDatabase.delete("t_pf", strConcat, null);
                    C7779al.m10617c("[Database] deleted %s data %d", "t_pf", Integer.valueOf(iDelete));
                    if (iDelete > 0) {
                        z10 = true;
                    }
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase = writableDatabase;
                    try {
                        if (!C7779al.m10614a(th)) {
                            th.printStackTrace();
                        }
                        return z10;
                    } finally {
                        if (f14129a && sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                    }
                }
            }
            if (f14129a && writableDatabase != null) {
                writableDatabase.close();
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return z10;
    }
}
