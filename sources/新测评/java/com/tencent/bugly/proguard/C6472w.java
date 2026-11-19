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
public final class C6472w {

    /* renamed from: a */
    public static boolean f5687a = false;

    /* renamed from: b */
    private static C6472w f5688b;

    /* renamed from: c */
    private static C6473x f5689c;

    /* renamed from: com.tencent.bugly.proguard.w$a */
    public class a extends Thread {

        /* renamed from: b */
        private int f5691b = 4;

        /* renamed from: c */
        private InterfaceC6471v f5692c = null;

        /* renamed from: d */
        private String f5693d;

        /* renamed from: e */
        private ContentValues f5694e;

        /* renamed from: f */
        private boolean f5695f;

        /* renamed from: g */
        private String[] f5696g;

        /* renamed from: h */
        private String f5697h;

        /* renamed from: i */
        private String[] f5698i;

        /* renamed from: j */
        private String f5699j;

        /* renamed from: k */
        private String f5700k;

        /* renamed from: l */
        private String f5701l;

        /* renamed from: m */
        private String f5702m;

        /* renamed from: n */
        private String f5703n;

        /* renamed from: o */
        private String[] f5704o;

        /* renamed from: p */
        private int f5705p;

        /* renamed from: q */
        private String f5706q;

        /* renamed from: r */
        private byte[] f5707r;

        public a() {
        }

        /* renamed from: a */
        public final void m5319a(int i10, String str, byte[] bArr) {
            this.f5705p = i10;
            this.f5706q = str;
            this.f5707r = bArr;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            switch (this.f5691b) {
                case 1:
                    C6472w.this.m5310a(this.f5693d, this.f5694e, this.f5692c);
                    break;
                case 2:
                    C6472w.this.m5292a(this.f5693d, this.f5703n, this.f5704o, this.f5692c);
                    break;
                case 3:
                    Cursor cursorM5295a = C6472w.this.m5295a(this.f5695f, this.f5693d, this.f5696g, this.f5697h, this.f5698i, this.f5699j, this.f5700k, this.f5701l, this.f5702m, this.f5692c);
                    if (cursorM5295a != null) {
                        cursorM5295a.close();
                        break;
                    }
                    break;
                case 4:
                    C6472w.this.m5301a(this.f5705p, this.f5706q, this.f5707r, this.f5692c);
                    break;
                case 5:
                    C6472w.this.m5314a(this.f5705p, this.f5692c);
                    break;
                case 6:
                    C6472w.this.m5300a(this.f5705p, this.f5706q, this.f5692c);
                    break;
            }
        }
    }

    private C6472w(Context context, List<AbstractC6464o> list) {
        f5689c = new C6473x(context, list);
    }

    /* renamed from: b */
    private synchronized boolean m5305b(C6474y c6474y) {
        ContentValues contentValuesM5308d;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f5689c.getWritableDatabase();
            if (writableDatabase == null || (contentValuesM5308d = m5308d(c6474y)) == null) {
                return false;
            }
            long jReplace = writableDatabase.replace("t_pf", "_id", contentValuesM5308d);
            if (jReplace < 0) {
                if (f5687a) {
                    writableDatabase.close();
                }
                return false;
            }
            C6414al.m4927c("[Database] insert %s success.", "t_pf");
            c6474y.f5712a = jReplace;
            if (f5687a) {
                writableDatabase.close();
            }
            return true;
        } catch (Throwable th) {
            try {
                if (!C6414al.m4924a(th)) {
                    th.printStackTrace();
                }
                if (f5687a && writableDatabase != null) {
                    writableDatabase.close();
                }
                return false;
            } finally {
                if (f5687a && writableDatabase != null) {
                    writableDatabase.close();
                }
            }
        }
    }

    /* renamed from: c */
    private static ContentValues m5306c(C6474y c6474y) {
        if (c6474y == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j10 = c6474y.f5712a;
            if (j10 > 0) {
                contentValues.put("_id", Long.valueOf(j10));
            }
            contentValues.put("_tp", Integer.valueOf(c6474y.f5713b));
            contentValues.put("_pc", c6474y.f5714c);
            contentValues.put("_th", c6474y.f5715d);
            contentValues.put("_tm", Long.valueOf(c6474y.f5716e));
            byte[] bArr = c6474y.f5718g;
            if (bArr != null) {
                contentValues.put("_dt", bArr);
            }
            return contentValues;
        } catch (Throwable th) {
            if (!C6414al.m4924a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: d */
    private static ContentValues m5308d(C6474y c6474y) {
        if (c6474y != null && !C6418ap.m4986b(c6474y.f5717f)) {
            try {
                ContentValues contentValues = new ContentValues();
                long j10 = c6474y.f5712a;
                if (j10 > 0) {
                    contentValues.put("_id", Long.valueOf(j10));
                }
                contentValues.put("_tp", c6474y.f5717f);
                contentValues.put("_tm", Long.valueOf(c6474y.f5716e));
                byte[] bArr = c6474y.f5718g;
                if (bArr != null) {
                    contentValues.put("_dt", bArr);
                }
                return contentValues;
            } catch (Throwable th) {
                if (!C6414al.m4924a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized C6472w m5297a(Context context, List<AbstractC6464o> list) {
        try {
            if (f5688b == null) {
                f5688b = new C6472w(context, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5688b;
    }

    /* renamed from: a */
    public static synchronized C6472w m5296a() {
        return f5688b;
    }

    /* renamed from: a */
    public final Cursor m5311a(String str, String[] strArr, String str2) {
        return m5312a(str, strArr, str2, (String) null, (String) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab A[Catch: all -> 0x0027, PHI: r2
      0x00ab: PHI (r2v2 android.database.sqlite.SQLiteDatabase) = (r2v1 android.database.sqlite.SQLiteDatabase), (r2v3 android.database.sqlite.SQLiteDatabase) binds: [B:56:0x00c9, B:41:0x00a9] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x0027, blocks: (B:9:0x0023, B:12:0x002b, B:14:0x002f, B:32:0x0095, B:34:0x009c, B:53:0x00c2, B:54:0x00c5, B:42:0x00ab, B:61:0x00d0, B:62:0x00d3, B:65:0x00d9, B:66:0x00dc, B:39:0x00a5, B:46:0x00b3, B:48:0x00b9), top: B:73:0x0002, inners: #3 }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized java.util.List<com.tencent.bugly.proguard.C6474y> m5307c(int r11) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C6472w.m5307c(int):java.util.List");
    }

    /* renamed from: a */
    public final Cursor m5312a(String str, String[] strArr, String str2, String str3, String str4) {
        return m5295a(false, str, strArr, str2, null, null, null, str3, str4, null);
    }

    /* renamed from: a */
    public final int m5309a(String str, String str2) {
        return m5292a(str, str2, (String[]) null, (InterfaceC6471v) null);
    }

    /* renamed from: a */
    public final synchronized long m5310a(String str, ContentValues contentValues, InterfaceC6471v interfaceC6471v) {
        long j10;
        j10 = -1;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f5689c.getWritableDatabase();
            if (writableDatabase != null && contentValues != null) {
                long jReplace = writableDatabase.replace(str, "_id", contentValues);
                if (jReplace >= 0) {
                    C6414al.m4927c("[Database] insert %s success.", str);
                } else {
                    C6414al.m4928d("[Database] replace %s error.", str);
                }
                j10 = jReplace;
            }
        } catch (Throwable th) {
            try {
                if (!C6414al.m4924a(th)) {
                    th.printStackTrace();
                }
                if (f5687a && 0 != 0) {
                }
            } finally {
                if (f5687a && 0 != 0) {
                    writableDatabase.close();
                }
            }
        }
        return j10;
    }

    /* renamed from: b */
    public final synchronized void m5318b(int i10) {
        String strConcat;
        SQLiteDatabase writableDatabase = f5689c.getWritableDatabase();
        if (writableDatabase != null) {
            if (i10 >= 0) {
                try {
                    strConcat = "_tp = ".concat(String.valueOf(i10));
                } catch (Throwable th) {
                    try {
                        if (!C6414al.m4924a(th)) {
                            th.printStackTrace();
                        }
                        if (f5687a) {
                            writableDatabase.close();
                            return;
                        }
                    } finally {
                        if (f5687a) {
                            writableDatabase.close();
                        }
                    }
                }
            } else {
                strConcat = null;
            }
            C6414al.m4927c("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", strConcat, null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized Cursor m5295a(boolean z9, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, InterfaceC6471v interfaceC6471v) {
        Cursor cursorQuery;
        cursorQuery = null;
        try {
            SQLiteDatabase writableDatabase = f5689c.getWritableDatabase();
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
    public synchronized int m5292a(String str, String str2, String[] strArr, InterfaceC6471v interfaceC6471v) {
        int iDelete;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f5689c.getWritableDatabase();
            iDelete = writableDatabase != null ? writableDatabase.delete(str, str2, strArr) : 0;
        } catch (Throwable th) {
            try {
                if (!C6414al.m4924a(th)) {
                    th.printStackTrace();
                }
                if (f5687a && writableDatabase != null) {
                }
            } finally {
                if (f5687a && writableDatabase != null) {
                    writableDatabase.close();
                }
            }
        }
        return iDelete;
    }

    /* renamed from: b */
    private static C6474y m5304b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            C6474y c6474y = new C6474y();
            c6474y.f5712a = cursor.getLong(cursor.getColumnIndex("_id"));
            c6474y.f5716e = cursor.getLong(cursor.getColumnIndex("_tm"));
            c6474y.f5717f = cursor.getString(cursor.getColumnIndex("_tp"));
            c6474y.f5718g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return c6474y;
        } catch (Throwable th) {
            if (!C6414al.m4924a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    public final boolean m5316a(int i10, String str, byte[] bArr, boolean z9) {
        if (!z9) {
            a aVar = new a();
            aVar.m5319a(i10, str, bArr);
            C6413ak.m4914a().m4916a(aVar);
            return true;
        }
        return m5301a(i10, str, bArr, (InterfaceC6471v) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m5301a(int i10, String str, byte[] bArr, InterfaceC6471v interfaceC6471v) {
        try {
            C6474y c6474y = new C6474y();
            c6474y.f5712a = i10;
            c6474y.f5717f = str;
            c6474y.f5716e = System.currentTimeMillis();
            c6474y.f5718g = bArr;
            return m5305b(c6474y);
        } catch (Throwable th) {
            if (C6414al.m4924a(th)) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final Map<String, byte[]> m5314a(int i10, InterfaceC6471v interfaceC6471v) {
        HashMap map = null;
        try {
            List<C6474y> listM5307c = m5307c(i10);
            if (listM5307c == null) {
                return null;
            }
            HashMap map2 = new HashMap();
            try {
                for (C6474y c6474y : listM5307c) {
                    byte[] bArr = c6474y.f5718g;
                    if (bArr != null) {
                        map2.put(c6474y.f5717f, bArr);
                    }
                }
                return map2;
            } catch (Throwable th) {
                th = th;
                map = map2;
                if (!C6414al.m4924a(th)) {
                    th.printStackTrace();
                }
                return map;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public final synchronized boolean m5317a(C6474y c6474y) {
        ContentValues contentValuesM5306c;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f5689c.getWritableDatabase();
            if (writableDatabase == null || (contentValuesM5306c = m5306c(c6474y)) == null) {
                return false;
            }
            long jReplace = writableDatabase.replace("t_lr", "_id", contentValuesM5306c);
            if (jReplace >= 0) {
                C6414al.m4927c("[Database] insert %s success.", "t_lr");
                c6474y.f5712a = jReplace;
                if (f5687a) {
                    writableDatabase.close();
                }
                return true;
            }
            if (f5687a) {
                writableDatabase.close();
            }
            return false;
        } catch (Throwable th) {
            try {
                if (!C6414al.m4924a(th)) {
                    th.printStackTrace();
                }
                if (f5687a && writableDatabase != null) {
                    writableDatabase.close();
                }
                return false;
            } finally {
                if (f5687a && writableDatabase != null) {
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
    public final synchronized java.util.List<com.tencent.bugly.proguard.C6474y> m5313a(int r11) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C6472w.m5313a(int):java.util.List");
    }

    /* renamed from: a */
    public final synchronized void m5315a(List<C6474y> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    SQLiteDatabase writableDatabase = f5689c.getWritableDatabase();
                    if (writableDatabase != null) {
                        StringBuilder sb = new StringBuilder();
                        for (C6474y c6474y : list) {
                            sb.append(" or _id = ");
                            sb.append(c6474y.f5712a);
                        }
                        String string = sb.toString();
                        if (string.length() > 0) {
                            string = string.substring(4);
                        }
                        sb.setLength(0);
                        try {
                            C6414al.m4927c("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", string, null)));
                        } catch (Throwable th) {
                            try {
                                if (!C6414al.m4924a(th)) {
                                    th.printStackTrace();
                                }
                                if (f5687a) {
                                    writableDatabase.close();
                                }
                            } finally {
                                if (f5687a) {
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
    private static C6474y m5298a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            C6474y c6474y = new C6474y();
            c6474y.f5712a = cursor.getLong(cursor.getColumnIndex("_id"));
            c6474y.f5713b = cursor.getInt(cursor.getColumnIndex("_tp"));
            c6474y.f5714c = cursor.getString(cursor.getColumnIndex("_pc"));
            c6474y.f5715d = cursor.getString(cursor.getColumnIndex("_th"));
            c6474y.f5716e = cursor.getLong(cursor.getColumnIndex("_tm"));
            c6474y.f5718g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return c6474y;
        } catch (Throwable th) {
            if (!C6414al.m4924a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized boolean m5300a(int i10, String str, InterfaceC6471v interfaceC6471v) {
        boolean z9;
        String strConcat;
        z9 = false;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase writableDatabase = f5689c.getWritableDatabase();
            if (writableDatabase != null) {
                try {
                    if (C6418ap.m4986b(str)) {
                        strConcat = "_id = ".concat(String.valueOf(i10));
                    } else {
                        strConcat = "_id = " + i10 + " and _tp = \"" + str + "\"";
                    }
                    int iDelete = writableDatabase.delete("t_pf", strConcat, null);
                    C6414al.m4927c("[Database] deleted %s data %d", "t_pf", Integer.valueOf(iDelete));
                    if (iDelete > 0) {
                        z9 = true;
                    }
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase = writableDatabase;
                    try {
                        if (!C6414al.m4924a(th)) {
                            th.printStackTrace();
                        }
                        return z9;
                    } finally {
                        if (f5687a && sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                    }
                }
            }
            if (f5687a && writableDatabase != null) {
                writableDatabase.close();
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return z9;
    }
}
