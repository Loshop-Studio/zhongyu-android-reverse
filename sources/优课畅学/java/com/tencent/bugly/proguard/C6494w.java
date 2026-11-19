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
public final class C6494w {

    /* renamed from: a */
    public static boolean f5030a = false;

    /* renamed from: b */
    private static C6494w f5031b;

    /* renamed from: c */
    private static C6495x f5032c;

    /* renamed from: com.tencent.bugly.proguard.w$a */
    public class a extends Thread {

        /* renamed from: b */
        private int f5034b = 4;

        /* renamed from: c */
        private InterfaceC6493v f5035c = null;

        /* renamed from: d */
        private String f5036d;

        /* renamed from: e */
        private ContentValues f5037e;

        /* renamed from: f */
        private boolean f5038f;

        /* renamed from: g */
        private String[] f5039g;

        /* renamed from: h */
        private String f5040h;

        /* renamed from: i */
        private String[] f5041i;

        /* renamed from: j */
        private String f5042j;

        /* renamed from: k */
        private String f5043k;

        /* renamed from: l */
        private String f5044l;

        /* renamed from: m */
        private String f5045m;

        /* renamed from: n */
        private String f5046n;

        /* renamed from: o */
        private String[] f5047o;

        /* renamed from: p */
        private int f5048p;

        /* renamed from: q */
        private String f5049q;

        /* renamed from: r */
        private byte[] f5050r;

        public a() {
        }

        /* renamed from: a */
        public final void m4679a(int i10, String str, byte[] bArr) {
            this.f5048p = i10;
            this.f5049q = str;
            this.f5050r = bArr;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            switch (this.f5034b) {
                case 1:
                    C6494w.this.m4670a(this.f5036d, this.f5037e, this.f5035c);
                    break;
                case 2:
                    C6494w.this.m4652a(this.f5036d, this.f5046n, this.f5047o, this.f5035c);
                    break;
                case 3:
                    Cursor cursorM4655a = C6494w.this.m4655a(this.f5038f, this.f5036d, this.f5039g, this.f5040h, this.f5041i, this.f5042j, this.f5043k, this.f5044l, this.f5045m, this.f5035c);
                    if (cursorM4655a != null) {
                        cursorM4655a.close();
                        break;
                    }
                    break;
                case 4:
                    C6494w.this.m4661a(this.f5048p, this.f5049q, this.f5050r, this.f5035c);
                    break;
                case 5:
                    C6494w.this.m4674a(this.f5048p, this.f5035c);
                    break;
                case 6:
                    C6494w.this.m4660a(this.f5048p, this.f5049q, this.f5035c);
                    break;
            }
        }
    }

    private C6494w(Context context, List<AbstractC6486o> list) {
        f5032c = new C6495x(context, list);
    }

    /* renamed from: b */
    private synchronized boolean m4665b(C6496y c6496y) {
        ContentValues contentValuesM4668d;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f5032c.getWritableDatabase();
            if (writableDatabase == null || (contentValuesM4668d = m4668d(c6496y)) == null) {
                return false;
            }
            long jReplace = writableDatabase.replace("t_pf", "_id", contentValuesM4668d);
            if (jReplace < 0) {
                if (f5030a) {
                    writableDatabase.close();
                }
                return false;
            }
            C6436al.m4287c("[Database] insert %s success.", "t_pf");
            c6496y.f5055a = jReplace;
            if (f5030a) {
                writableDatabase.close();
            }
            return true;
        } catch (Throwable th) {
            try {
                if (!C6436al.m4284a(th)) {
                    th.printStackTrace();
                }
                if (f5030a && writableDatabase != null) {
                    writableDatabase.close();
                }
                return false;
            } finally {
                if (f5030a && writableDatabase != null) {
                    writableDatabase.close();
                }
            }
        }
    }

    /* renamed from: c */
    private static ContentValues m4666c(C6496y c6496y) {
        if (c6496y == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j10 = c6496y.f5055a;
            if (j10 > 0) {
                contentValues.put("_id", Long.valueOf(j10));
            }
            contentValues.put("_tp", Integer.valueOf(c6496y.f5056b));
            contentValues.put("_pc", c6496y.f5057c);
            contentValues.put("_th", c6496y.f5058d);
            contentValues.put("_tm", Long.valueOf(c6496y.f5059e));
            byte[] bArr = c6496y.f5061g;
            if (bArr != null) {
                contentValues.put("_dt", bArr);
            }
            return contentValues;
        } catch (Throwable th) {
            if (!C6436al.m4284a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: d */
    private static ContentValues m4668d(C6496y c6496y) {
        if (c6496y != null && !C6440ap.m4346b(c6496y.f5060f)) {
            try {
                ContentValues contentValues = new ContentValues();
                long j10 = c6496y.f5055a;
                if (j10 > 0) {
                    contentValues.put("_id", Long.valueOf(j10));
                }
                contentValues.put("_tp", c6496y.f5060f);
                contentValues.put("_tm", Long.valueOf(c6496y.f5059e));
                byte[] bArr = c6496y.f5061g;
                if (bArr != null) {
                    contentValues.put("_dt", bArr);
                }
                return contentValues;
            } catch (Throwable th) {
                if (!C6436al.m4284a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized C6494w m4657a(Context context, List<AbstractC6486o> list) {
        try {
            if (f5031b == null) {
                f5031b = new C6494w(context, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5031b;
    }

    /* renamed from: a */
    public static synchronized C6494w m4656a() {
        return f5031b;
    }

    /* renamed from: a */
    public final Cursor m4671a(String str, String[] strArr, String str2) {
        return m4672a(str, strArr, str2, (String) null, (String) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab A[Catch: all -> 0x0027, PHI: r2
      0x00ab: PHI (r2v2 android.database.sqlite.SQLiteDatabase) = (r2v1 android.database.sqlite.SQLiteDatabase), (r2v3 android.database.sqlite.SQLiteDatabase) binds: [B:56:0x00c9, B:41:0x00a9] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x0027, blocks: (B:9:0x0023, B:12:0x002b, B:14:0x002f, B:32:0x0095, B:34:0x009c, B:53:0x00c2, B:54:0x00c5, B:42:0x00ab, B:61:0x00d0, B:62:0x00d3, B:65:0x00d9, B:66:0x00dc, B:39:0x00a5, B:46:0x00b3, B:48:0x00b9), top: B:73:0x0002, inners: #3 }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized java.util.List<com.tencent.bugly.proguard.C6496y> m4667c(int r11) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C6494w.m4667c(int):java.util.List");
    }

    /* renamed from: a */
    public final Cursor m4672a(String str, String[] strArr, String str2, String str3, String str4) {
        return m4655a(false, str, strArr, str2, null, null, null, str3, str4, null);
    }

    /* renamed from: a */
    public final int m4669a(String str, String str2) {
        return m4652a(str, str2, (String[]) null, (InterfaceC6493v) null);
    }

    /* renamed from: a */
    public final synchronized long m4670a(String str, ContentValues contentValues, InterfaceC6493v interfaceC6493v) {
        long j10;
        j10 = -1;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f5032c.getWritableDatabase();
            if (writableDatabase != null && contentValues != null) {
                long jReplace = writableDatabase.replace(str, "_id", contentValues);
                if (jReplace >= 0) {
                    C6436al.m4287c("[Database] insert %s success.", str);
                } else {
                    C6436al.m4288d("[Database] replace %s error.", str);
                }
                j10 = jReplace;
            }
        } catch (Throwable th) {
            try {
                if (!C6436al.m4284a(th)) {
                    th.printStackTrace();
                }
                if (f5030a && 0 != 0) {
                }
            } finally {
                if (f5030a && 0 != 0) {
                    writableDatabase.close();
                }
            }
        }
        return j10;
    }

    /* renamed from: b */
    public final synchronized void m4678b(int i10) {
        String strConcat;
        SQLiteDatabase writableDatabase = f5032c.getWritableDatabase();
        if (writableDatabase != null) {
            if (i10 >= 0) {
                try {
                    strConcat = "_tp = ".concat(String.valueOf(i10));
                } catch (Throwable th) {
                    try {
                        if (!C6436al.m4284a(th)) {
                            th.printStackTrace();
                        }
                        if (f5030a) {
                            writableDatabase.close();
                            return;
                        }
                    } finally {
                        if (f5030a) {
                            writableDatabase.close();
                        }
                    }
                }
            } else {
                strConcat = null;
            }
            C6436al.m4287c("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", strConcat, null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized Cursor m4655a(boolean z10, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, InterfaceC6493v interfaceC6493v) {
        Cursor cursorQuery;
        cursorQuery = null;
        try {
            SQLiteDatabase writableDatabase = f5032c.getWritableDatabase();
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
    public synchronized int m4652a(String str, String str2, String[] strArr, InterfaceC6493v interfaceC6493v) {
        int iDelete;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f5032c.getWritableDatabase();
            iDelete = writableDatabase != null ? writableDatabase.delete(str, str2, strArr) : 0;
        } catch (Throwable th) {
            try {
                if (!C6436al.m4284a(th)) {
                    th.printStackTrace();
                }
                if (f5030a && writableDatabase != null) {
                }
            } finally {
                if (f5030a && writableDatabase != null) {
                    writableDatabase.close();
                }
            }
        }
        return iDelete;
    }

    /* renamed from: b */
    private static C6496y m4664b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            C6496y c6496y = new C6496y();
            c6496y.f5055a = cursor.getLong(cursor.getColumnIndex("_id"));
            c6496y.f5059e = cursor.getLong(cursor.getColumnIndex("_tm"));
            c6496y.f5060f = cursor.getString(cursor.getColumnIndex("_tp"));
            c6496y.f5061g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return c6496y;
        } catch (Throwable th) {
            if (!C6436al.m4284a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    public final boolean m4676a(int i10, String str, byte[] bArr, boolean z10) {
        if (!z10) {
            a aVar = new a();
            aVar.m4679a(i10, str, bArr);
            C6435ak.m4274a().m4276a(aVar);
            return true;
        }
        return m4661a(i10, str, bArr, (InterfaceC6493v) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m4661a(int i10, String str, byte[] bArr, InterfaceC6493v interfaceC6493v) {
        try {
            C6496y c6496y = new C6496y();
            c6496y.f5055a = i10;
            c6496y.f5060f = str;
            c6496y.f5059e = System.currentTimeMillis();
            c6496y.f5061g = bArr;
            return m4665b(c6496y);
        } catch (Throwable th) {
            if (C6436al.m4284a(th)) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final Map<String, byte[]> m4674a(int i10, InterfaceC6493v interfaceC6493v) {
        HashMap map = null;
        try {
            List<C6496y> listM4667c = m4667c(i10);
            if (listM4667c == null) {
                return null;
            }
            HashMap map2 = new HashMap();
            try {
                for (C6496y c6496y : listM4667c) {
                    byte[] bArr = c6496y.f5061g;
                    if (bArr != null) {
                        map2.put(c6496y.f5060f, bArr);
                    }
                }
                return map2;
            } catch (Throwable th) {
                th = th;
                map = map2;
                if (!C6436al.m4284a(th)) {
                    th.printStackTrace();
                }
                return map;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public final synchronized boolean m4677a(C6496y c6496y) {
        ContentValues contentValuesM4666c;
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f5032c.getWritableDatabase();
            if (writableDatabase == null || (contentValuesM4666c = m4666c(c6496y)) == null) {
                return false;
            }
            long jReplace = writableDatabase.replace("t_lr", "_id", contentValuesM4666c);
            if (jReplace >= 0) {
                C6436al.m4287c("[Database] insert %s success.", "t_lr");
                c6496y.f5055a = jReplace;
                if (f5030a) {
                    writableDatabase.close();
                }
                return true;
            }
            if (f5030a) {
                writableDatabase.close();
            }
            return false;
        } catch (Throwable th) {
            try {
                if (!C6436al.m4284a(th)) {
                    th.printStackTrace();
                }
                if (f5030a && writableDatabase != null) {
                    writableDatabase.close();
                }
                return false;
            } finally {
                if (f5030a && writableDatabase != null) {
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
    public final synchronized java.util.List<com.tencent.bugly.proguard.C6496y> m4673a(int r11) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C6494w.m4673a(int):java.util.List");
    }

    /* renamed from: a */
    public final synchronized void m4675a(List<C6496y> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    SQLiteDatabase writableDatabase = f5032c.getWritableDatabase();
                    if (writableDatabase != null) {
                        StringBuilder sb = new StringBuilder();
                        for (C6496y c6496y : list) {
                            sb.append(" or _id = ");
                            sb.append(c6496y.f5055a);
                        }
                        String string = sb.toString();
                        if (string.length() > 0) {
                            string = string.substring(4);
                        }
                        sb.setLength(0);
                        try {
                            C6436al.m4287c("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", string, null)));
                        } catch (Throwable th) {
                            try {
                                if (!C6436al.m4284a(th)) {
                                    th.printStackTrace();
                                }
                                if (f5030a) {
                                    writableDatabase.close();
                                }
                            } finally {
                                if (f5030a) {
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
    private static C6496y m4658a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            C6496y c6496y = new C6496y();
            c6496y.f5055a = cursor.getLong(cursor.getColumnIndex("_id"));
            c6496y.f5056b = cursor.getInt(cursor.getColumnIndex("_tp"));
            c6496y.f5057c = cursor.getString(cursor.getColumnIndex("_pc"));
            c6496y.f5058d = cursor.getString(cursor.getColumnIndex("_th"));
            c6496y.f5059e = cursor.getLong(cursor.getColumnIndex("_tm"));
            c6496y.f5061g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return c6496y;
        } catch (Throwable th) {
            if (!C6436al.m4284a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized boolean m4660a(int i10, String str, InterfaceC6493v interfaceC6493v) {
        boolean z10;
        String strConcat;
        z10 = false;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase writableDatabase = f5032c.getWritableDatabase();
            if (writableDatabase != null) {
                try {
                    if (C6440ap.m4346b(str)) {
                        strConcat = "_id = ".concat(String.valueOf(i10));
                    } else {
                        strConcat = "_id = " + i10 + " and _tp = \"" + str + "\"";
                    }
                    int iDelete = writableDatabase.delete("t_pf", strConcat, null);
                    C6436al.m4287c("[Database] deleted %s data %d", "t_pf", Integer.valueOf(iDelete));
                    if (iDelete > 0) {
                        z10 = true;
                    }
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase = writableDatabase;
                    try {
                        if (!C6436al.m4284a(th)) {
                            th.printStackTrace();
                        }
                        return z10;
                    } finally {
                        if (f5030a && sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                    }
                }
            }
            if (f5030a && writableDatabase != null) {
                writableDatabase.close();
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return z10;
    }
}
