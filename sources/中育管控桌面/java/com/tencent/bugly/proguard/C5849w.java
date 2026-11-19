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
public final class C5849w {

    /* renamed from: a */
    public static boolean f4408a = false;

    /* renamed from: b */
    private static C5849w f4409b;

    /* renamed from: c */
    private static C5850x f4410c;

    /* renamed from: com.tencent.bugly.proguard.w$a */
    public class a extends Thread {

        /* renamed from: b */
        private int f4412b = 4;

        /* renamed from: c */
        private InterfaceC5848v f4413c = null;

        /* renamed from: d */
        private String f4414d;

        /* renamed from: e */
        private ContentValues f4415e;

        /* renamed from: f */
        private boolean f4416f;

        /* renamed from: g */
        private String[] f4417g;

        /* renamed from: h */
        private String f4418h;

        /* renamed from: i */
        private String[] f4419i;

        /* renamed from: j */
        private String f4420j;

        /* renamed from: k */
        private String f4421k;

        /* renamed from: l */
        private String f4422l;

        /* renamed from: m */
        private String f4423m;

        /* renamed from: n */
        private String f4424n;

        /* renamed from: o */
        private String[] f4425o;

        /* renamed from: p */
        private int f4426p;

        /* renamed from: q */
        private String f4427q;

        /* renamed from: r */
        private byte[] f4428r;

        public a() {
        }

        /* renamed from: a */
        public final void m4324a(int i6, String str, byte[] bArr) {
            this.f4426p = i6;
            this.f4427q = str;
            this.f4428r = bArr;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            switch (this.f4412b) {
                case 1:
                    C5849w.this.m4315a(this.f4414d, this.f4415e, this.f4413c);
                    break;
                case 2:
                    C5849w.this.m4297a(this.f4414d, this.f4424n, this.f4425o, this.f4413c);
                    break;
                case 3:
                    Cursor cursorM4300a = C5849w.this.m4300a(this.f4416f, this.f4414d, this.f4417g, this.f4418h, this.f4419i, this.f4420j, this.f4421k, this.f4422l, this.f4423m, this.f4413c);
                    if (cursorM4300a != null) {
                        cursorM4300a.close();
                        break;
                    }
                    break;
                case 4:
                    C5849w.this.m4306a(this.f4426p, this.f4427q, this.f4428r, this.f4413c);
                    break;
                case 5:
                    C5849w.this.m4319a(this.f4426p, this.f4413c);
                    break;
                case 6:
                    C5849w.this.m4305a(this.f4426p, this.f4427q, this.f4413c);
                    break;
            }
        }
    }

    private C5849w(Context context, List<AbstractC5841o> list) {
        f4410c = new C5850x(context, list);
    }

    /* renamed from: b */
    private synchronized boolean m4310b(C5851y c5851y) {
        ContentValues contentValuesM4313d;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f4410c.getWritableDatabase();
            if (writableDatabase == null || (contentValuesM4313d = m4313d(c5851y)) == null) {
                return false;
            }
            long jReplace = writableDatabase.replace("t_pf", "_id", contentValuesM4313d);
            if (jReplace < 0) {
                if (f4408a) {
                    writableDatabase.close();
                }
                return false;
            }
            C5791al.m3932c("[Database] insert %s success.", "t_pf");
            c5851y.f4433a = jReplace;
            if (f4408a) {
                writableDatabase.close();
            }
            return true;
        } catch (Throwable th) {
            try {
                if (!C5791al.m3929a(th)) {
                    th.printStackTrace();
                }
                if (f4408a && writableDatabase != null) {
                    writableDatabase.close();
                }
                return false;
            } finally {
                if (f4408a && writableDatabase != null) {
                    writableDatabase.close();
                }
            }
        }
    }

    /* renamed from: c */
    private static ContentValues m4311c(C5851y c5851y) {
        if (c5851y == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j6 = c5851y.f4433a;
            if (j6 > 0) {
                contentValues.put("_id", Long.valueOf(j6));
            }
            contentValues.put("_tp", Integer.valueOf(c5851y.f4434b));
            contentValues.put("_pc", c5851y.f4435c);
            contentValues.put("_th", c5851y.f4436d);
            contentValues.put("_tm", Long.valueOf(c5851y.f4437e));
            byte[] bArr = c5851y.f4439g;
            if (bArr != null) {
                contentValues.put("_dt", bArr);
            }
            return contentValues;
        } catch (Throwable th) {
            if (!C5791al.m3929a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: d */
    private static ContentValues m4313d(C5851y c5851y) {
        if (c5851y != null && !C5795ap.m3991b(c5851y.f4438f)) {
            try {
                ContentValues contentValues = new ContentValues();
                long j6 = c5851y.f4433a;
                if (j6 > 0) {
                    contentValues.put("_id", Long.valueOf(j6));
                }
                contentValues.put("_tp", c5851y.f4438f);
                contentValues.put("_tm", Long.valueOf(c5851y.f4437e));
                byte[] bArr = c5851y.f4439g;
                if (bArr != null) {
                    contentValues.put("_dt", bArr);
                }
                return contentValues;
            } catch (Throwable th) {
                if (!C5791al.m3929a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized C5849w m4302a(Context context, List<AbstractC5841o> list) {
        try {
            if (f4409b == null) {
                f4409b = new C5849w(context, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4409b;
    }

    /* renamed from: a */
    public static synchronized C5849w m4301a() {
        return f4409b;
    }

    /* renamed from: a */
    public final Cursor m4316a(String str, String[] strArr, String str2) {
        return m4317a(str, strArr, str2, (String) null, (String) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab A[Catch: all -> 0x0027, PHI: r2
      0x00ab: PHI (r2v2 android.database.sqlite.SQLiteDatabase) = (r2v1 android.database.sqlite.SQLiteDatabase), (r2v3 android.database.sqlite.SQLiteDatabase) binds: [B:56:0x00c9, B:41:0x00a9] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x0027, blocks: (B:9:0x0023, B:12:0x002b, B:14:0x002f, B:32:0x0095, B:34:0x009c, B:53:0x00c2, B:54:0x00c5, B:42:0x00ab, B:61:0x00d0, B:62:0x00d3, B:65:0x00d9, B:66:0x00dc, B:39:0x00a5, B:46:0x00b3, B:48:0x00b9), top: B:73:0x0002, inners: #3 }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized java.util.List<com.tencent.bugly.proguard.C5851y> m4312c(int r11) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C5849w.m4312c(int):java.util.List");
    }

    /* renamed from: a */
    public final Cursor m4317a(String str, String[] strArr, String str2, String str3, String str4) {
        return m4300a(false, str, strArr, str2, null, null, null, str3, str4, null);
    }

    /* renamed from: a */
    public final int m4314a(String str, String str2) {
        return m4297a(str, str2, (String[]) null, (InterfaceC5848v) null);
    }

    /* renamed from: a */
    public final synchronized long m4315a(String str, ContentValues contentValues, InterfaceC5848v interfaceC5848v) {
        long j6;
        j6 = -1;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f4410c.getWritableDatabase();
            if (writableDatabase != null && contentValues != null) {
                long jReplace = writableDatabase.replace(str, "_id", contentValues);
                if (jReplace >= 0) {
                    C5791al.m3932c("[Database] insert %s success.", str);
                } else {
                    C5791al.m3933d("[Database] replace %s error.", str);
                }
                j6 = jReplace;
            }
        } catch (Throwable th) {
            try {
                if (!C5791al.m3929a(th)) {
                    th.printStackTrace();
                }
                if (f4408a && 0 != 0) {
                }
            } finally {
                if (f4408a && 0 != 0) {
                    writableDatabase.close();
                }
            }
        }
        return j6;
    }

    /* renamed from: b */
    public final synchronized void m4323b(int i6) {
        String strConcat;
        SQLiteDatabase writableDatabase = f4410c.getWritableDatabase();
        if (writableDatabase != null) {
            if (i6 >= 0) {
                try {
                    strConcat = "_tp = ".concat(String.valueOf(i6));
                } catch (Throwable th) {
                    try {
                        if (!C5791al.m3929a(th)) {
                            th.printStackTrace();
                        }
                        if (f4408a) {
                            writableDatabase.close();
                            return;
                        }
                    } finally {
                        if (f4408a) {
                            writableDatabase.close();
                        }
                    }
                }
            } else {
                strConcat = null;
            }
            C5791al.m3932c("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", strConcat, null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized Cursor m4300a(boolean z6, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, InterfaceC5848v interfaceC5848v) {
        Cursor cursorQuery;
        cursorQuery = null;
        try {
            SQLiteDatabase writableDatabase = f4410c.getWritableDatabase();
            if (writableDatabase != null) {
                cursorQuery = writableDatabase.query(z6, str, strArr, str2, strArr2, str3, str4, str5, str6);
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
    public synchronized int m4297a(String str, String str2, String[] strArr, InterfaceC5848v interfaceC5848v) {
        int iDelete;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f4410c.getWritableDatabase();
            iDelete = writableDatabase != null ? writableDatabase.delete(str, str2, strArr) : 0;
        } catch (Throwable th) {
            try {
                if (!C5791al.m3929a(th)) {
                    th.printStackTrace();
                }
                if (f4408a && writableDatabase != null) {
                }
            } finally {
                if (f4408a && writableDatabase != null) {
                    writableDatabase.close();
                }
            }
        }
        return iDelete;
    }

    /* renamed from: b */
    private static C5851y m4309b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            C5851y c5851y = new C5851y();
            c5851y.f4433a = cursor.getLong(cursor.getColumnIndex("_id"));
            c5851y.f4437e = cursor.getLong(cursor.getColumnIndex("_tm"));
            c5851y.f4438f = cursor.getString(cursor.getColumnIndex("_tp"));
            c5851y.f4439g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return c5851y;
        } catch (Throwable th) {
            if (!C5791al.m3929a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    public final boolean m4321a(int i6, String str, byte[] bArr, boolean z6) {
        if (!z6) {
            a aVar = new a();
            aVar.m4324a(i6, str, bArr);
            C5790ak.m3919a().m3921a(aVar);
            return true;
        }
        return m4306a(i6, str, bArr, (InterfaceC5848v) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m4306a(int i6, String str, byte[] bArr, InterfaceC5848v interfaceC5848v) {
        try {
            C5851y c5851y = new C5851y();
            c5851y.f4433a = i6;
            c5851y.f4438f = str;
            c5851y.f4437e = System.currentTimeMillis();
            c5851y.f4439g = bArr;
            return m4310b(c5851y);
        } catch (Throwable th) {
            if (C5791al.m3929a(th)) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final Map<String, byte[]> m4319a(int i6, InterfaceC5848v interfaceC5848v) {
        HashMap map = null;
        try {
            List<C5851y> listM4312c = m4312c(i6);
            if (listM4312c == null) {
                return null;
            }
            HashMap map2 = new HashMap();
            try {
                for (C5851y c5851y : listM4312c) {
                    byte[] bArr = c5851y.f4439g;
                    if (bArr != null) {
                        map2.put(c5851y.f4438f, bArr);
                    }
                }
                return map2;
            } catch (Throwable th) {
                th = th;
                map = map2;
                if (!C5791al.m3929a(th)) {
                    th.printStackTrace();
                }
                return map;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public final synchronized boolean m4322a(C5851y c5851y) {
        ContentValues contentValuesM4311c;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f4410c.getWritableDatabase();
            if (writableDatabase == null || (contentValuesM4311c = m4311c(c5851y)) == null) {
                return false;
            }
            long jReplace = writableDatabase.replace("t_lr", "_id", contentValuesM4311c);
            if (jReplace >= 0) {
                C5791al.m3932c("[Database] insert %s success.", "t_lr");
                c5851y.f4433a = jReplace;
                if (f4408a) {
                    writableDatabase.close();
                }
                return true;
            }
            if (f4408a) {
                writableDatabase.close();
            }
            return false;
        } catch (Throwable th) {
            try {
                if (!C5791al.m3929a(th)) {
                    th.printStackTrace();
                }
                if (f4408a && writableDatabase != null) {
                    writableDatabase.close();
                }
                return false;
            } finally {
                if (f4408a && writableDatabase != null) {
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
    public final synchronized java.util.List<com.tencent.bugly.proguard.C5851y> m4318a(int r11) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C5849w.m4318a(int):java.util.List");
    }

    /* renamed from: a */
    public final synchronized void m4320a(List<C5851y> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    SQLiteDatabase writableDatabase = f4410c.getWritableDatabase();
                    if (writableDatabase != null) {
                        StringBuilder sb = new StringBuilder();
                        for (C5851y c5851y : list) {
                            sb.append(" or _id = ");
                            sb.append(c5851y.f4433a);
                        }
                        String string = sb.toString();
                        if (string.length() > 0) {
                            string = string.substring(4);
                        }
                        sb.setLength(0);
                        try {
                            C5791al.m3932c("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", string, null)));
                        } catch (Throwable th) {
                            try {
                                if (!C5791al.m3929a(th)) {
                                    th.printStackTrace();
                                }
                                if (f4408a) {
                                    writableDatabase.close();
                                }
                            } finally {
                                if (f4408a) {
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
    private static C5851y m4303a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            C5851y c5851y = new C5851y();
            c5851y.f4433a = cursor.getLong(cursor.getColumnIndex("_id"));
            c5851y.f4434b = cursor.getInt(cursor.getColumnIndex("_tp"));
            c5851y.f4435c = cursor.getString(cursor.getColumnIndex("_pc"));
            c5851y.f4436d = cursor.getString(cursor.getColumnIndex("_th"));
            c5851y.f4437e = cursor.getLong(cursor.getColumnIndex("_tm"));
            c5851y.f4439g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return c5851y;
        } catch (Throwable th) {
            if (!C5791al.m3929a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized boolean m4305a(int i6, String str, InterfaceC5848v interfaceC5848v) {
        boolean z6;
        String strConcat;
        z6 = false;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase writableDatabase = f4410c.getWritableDatabase();
            if (writableDatabase != null) {
                try {
                    if (C5795ap.m3991b(str)) {
                        strConcat = "_id = ".concat(String.valueOf(i6));
                    } else {
                        strConcat = "_id = " + i6 + " and _tp = \"" + str + "\"";
                    }
                    int iDelete = writableDatabase.delete("t_pf", strConcat, null);
                    C5791al.m3932c("[Database] deleted %s data %d", "t_pf", Integer.valueOf(iDelete));
                    if (iDelete > 0) {
                        z6 = true;
                    }
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase = writableDatabase;
                    try {
                        if (!C5791al.m3929a(th)) {
                            th.printStackTrace();
                        }
                        return z6;
                    } finally {
                        if (f4408a && sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                    }
                }
            }
            if (f4408a && writableDatabase != null) {
                writableDatabase.close();
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return z6;
    }
}
