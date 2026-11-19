package com.umeng.analytics.pro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p114g2.AbstractC8014f0;
import p114g2.C8012e0;
import p176m2.AbstractC8959h;
import p240s2.C9468a;
import p270v2.AbstractC9753a;
import p290x2.AbstractC9866a;
import p310z2.AbstractC9993d;

/* renamed from: com.umeng.analytics.pro.h */
/* loaded from: classes4.dex */
public class C6773h {

    /* renamed from: e */
    public static Context f6693e;

    /* renamed from: f */
    public static String f6694f;

    /* renamed from: a */
    public List f6695a;

    /* renamed from: b */
    public List f6696b;

    /* renamed from: c */
    public String f6697c;

    /* renamed from: d */
    public List f6698d;

    /* renamed from: com.umeng.analytics.pro.h$a */
    public enum a {
        AUTOPAGE,
        PAGE,
        BEGIN,
        END,
        NEWSESSION,
        INSTANTSESSIONBEGIN
    }

    /* renamed from: com.umeng.analytics.pro.h$c */
    public static class c {

        /* renamed from: a */
        public static final C6773h f6706a = new C6773h();
    }

    /* renamed from: b */
    public static C6773h m6194b(Context context) {
        C6773h c6773h = c.f6706a;
        if (f6693e == null && context != null) {
            f6693e = context.getApplicationContext();
            c6773h.m6199E();
        }
        return c6773h;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081 A[EXC_TOP_SPLITTER, PHI: r2 r5
      0x0081: PHI (r2v5 android.database.sqlite.SQLiteDatabase) = (r2v4 android.database.sqlite.SQLiteDatabase), (r2v6 android.database.sqlite.SQLiteDatabase) binds: [B:28:0x007f, B:34:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r5v3 org.json.JSONObject) = (r5v2 org.json.JSONObject), (r5v5 org.json.JSONObject) binds: [B:28:0x007f, B:34:0x0099] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject m6195A() {
        /*
            r7 = this;
            java.lang.String r0 = "__vc"
            java.lang.String r1 = "__av"
            java.util.List r2 = r7.f6698d
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 == 0) goto Le
            return r3
        Le:
            android.content.Context r2 = com.umeng.analytics.pro.C6773h.f6693e     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteDatabaseCorruptException -> L77
            g2.e0 r2 = p114g2.C8012e0.m12585b(r2)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteDatabaseCorruptException -> L77
            android.database.sqlite.SQLiteDatabase r2 = r2.m12586a()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteDatabaseCorruptException -> L77
            r2.beginTransaction()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            java.util.List r4 = r7.f6698d     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            r5 = 0
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            java.lang.String r5 = "select *  from __is where __ii=?"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            android.database.Cursor r4 = r2.rawQuery(r5, r4)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            if (r4 == 0) goto L5b
            boolean r5 = r4.moveToNext()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L59
            if (r5 == 0) goto L5b
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L59
            r5.<init>()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L59
            int r3 = r4.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L55
            java.lang.String r3 = r4.getString(r3)     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L55
            int r6 = r4.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L55
            java.lang.String r6 = r4.getString(r6)     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L55
            r5.put(r1, r3)     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L55
            r5.put(r0, r6)     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L55
            r3 = r5
            goto L5b
        L53:
            r3 = r4
            goto L7a
        L55:
            r3 = r4
            goto L8f
        L57:
            r5 = r3
            goto L53
        L59:
            r5 = r3
            goto L55
        L5b:
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L59
            if (r4 == 0) goto L63
            r4.close()
        L63:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L66
        L66:
            android.content.Context r0 = com.umeng.analytics.pro.C6773h.f6693e
            g2.e0 r0 = p114g2.C8012e0.m12585b(r0)
            r0.m12587c()
            goto L9c
        L70:
            r5 = r3
            goto L7a
        L72:
            r5 = r3
            goto L8f
        L74:
            r2 = r3
            r5 = r2
            goto L7a
        L77:
            r2 = r3
            r5 = r2
            goto L8f
        L7a:
            if (r3 == 0) goto L7f
            r3.close()
        L7f:
            if (r2 == 0) goto L84
        L81:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L84
        L84:
            android.content.Context r0 = com.umeng.analytics.pro.C6773h.f6693e
            g2.e0 r0 = p114g2.C8012e0.m12585b(r0)
            r0.m12587c()
            r3 = r5
            goto L9c
        L8f:
            android.content.Context r0 = com.umeng.analytics.pro.C6773h.f6693e     // Catch: java.lang.Throwable -> L9d
            p114g2.AbstractC8014f0.m12593a(r0)     // Catch: java.lang.Throwable -> L9d
            if (r3 == 0) goto L99
            r3.close()
        L99:
            if (r2 == 0) goto L84
            goto L81
        L9c:
            return r3
        L9d:
            r0 = move-exception
            if (r3 == 0) goto La3
            r3.close()
        La3:
            if (r2 == 0) goto La8
            r2.endTransaction()     // Catch: java.lang.Throwable -> La8
        La8:
            android.content.Context r1 = com.umeng.analytics.pro.C6773h.f6693e
            g2.e0 r1 = p114g2.C8012e0.m12585b(r1)
            r1.m12587c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C6773h.m6195A():org.json.JSONObject");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081 A[EXC_TOP_SPLITTER, PHI: r2 r5
      0x0081: PHI (r2v5 android.database.sqlite.SQLiteDatabase) = (r2v4 android.database.sqlite.SQLiteDatabase), (r2v6 android.database.sqlite.SQLiteDatabase) binds: [B:28:0x007f, B:34:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r5v3 org.json.JSONObject) = (r5v2 org.json.JSONObject), (r5v5 org.json.JSONObject) binds: [B:28:0x007f, B:34:0x0099] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject m6196B() {
        /*
            r7 = this;
            java.lang.String r0 = "__vc"
            java.lang.String r1 = "__av"
            java.util.List r2 = r7.f6695a
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 == 0) goto Le
            return r3
        Le:
            android.content.Context r2 = com.umeng.analytics.pro.C6773h.f6693e     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteDatabaseCorruptException -> L77
            g2.e0 r2 = p114g2.C8012e0.m12585b(r2)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteDatabaseCorruptException -> L77
            android.database.sqlite.SQLiteDatabase r2 = r2.m12586a()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteDatabaseCorruptException -> L77
            r2.beginTransaction()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            java.util.List r4 = r7.f6695a     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            r5 = 0
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            java.lang.String r5 = "select *  from __sd where __ii=?"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            android.database.Cursor r4 = r2.rawQuery(r5, r4)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            if (r4 == 0) goto L5b
            boolean r5 = r4.moveToNext()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L59
            if (r5 == 0) goto L5b
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L59
            r5.<init>()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L59
            int r3 = r4.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L55
            java.lang.String r3 = r4.getString(r3)     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L55
            int r6 = r4.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L55
            java.lang.String r6 = r4.getString(r6)     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L55
            r5.put(r1, r3)     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L55
            r5.put(r0, r6)     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L55
            r3 = r5
            goto L5b
        L53:
            r3 = r4
            goto L7a
        L55:
            r3 = r4
            goto L8f
        L57:
            r5 = r3
            goto L53
        L59:
            r5 = r3
            goto L55
        L5b:
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L59
            if (r4 == 0) goto L63
            r4.close()
        L63:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L66
        L66:
            android.content.Context r0 = com.umeng.analytics.pro.C6773h.f6693e
            g2.e0 r0 = p114g2.C8012e0.m12585b(r0)
            r0.m12587c()
            goto L9c
        L70:
            r5 = r3
            goto L7a
        L72:
            r5 = r3
            goto L8f
        L74:
            r2 = r3
            r5 = r2
            goto L7a
        L77:
            r2 = r3
            r5 = r2
            goto L8f
        L7a:
            if (r3 == 0) goto L7f
            r3.close()
        L7f:
            if (r2 == 0) goto L84
        L81:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L84
        L84:
            android.content.Context r0 = com.umeng.analytics.pro.C6773h.f6693e
            g2.e0 r0 = p114g2.C8012e0.m12585b(r0)
            r0.m12587c()
            r3 = r5
            goto L9c
        L8f:
            android.content.Context r0 = com.umeng.analytics.pro.C6773h.f6693e     // Catch: java.lang.Throwable -> L9d
            p114g2.AbstractC8014f0.m12593a(r0)     // Catch: java.lang.Throwable -> L9d
            if (r3 == 0) goto L99
            r3.close()
        L99:
            if (r2 == 0) goto L84
            goto L81
        L9c:
            return r3
        L9d:
            r0 = move-exception
            if (r3 == 0) goto La3
            r3.close()
        La3:
            if (r2 == 0) goto La8
            r2.endTransaction()     // Catch: java.lang.Throwable -> La8
        La8:
            android.content.Context r1 = com.umeng.analytics.pro.C6773h.f6693e
            g2.e0 r1 = p114g2.C8012e0.m12585b(r1)
            r1.m12587c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C6773h.m6196B():org.json.JSONObject");
    }

    /* renamed from: C */
    public void m6197C() {
        SQLiteDatabase sQLiteDatabaseM12586a = null;
        try {
            try {
                sQLiteDatabaseM12586a = C8012e0.m12585b(f6693e).m12586a();
                sQLiteDatabaseM12586a.beginTransaction();
                if (this.f6696b.size() > 0) {
                    for (int i9 = 0; i9 < this.f6696b.size(); i9++) {
                        sQLiteDatabaseM12586a.execSQL("delete from __et where rowid=" + this.f6696b.get(i9));
                    }
                }
                this.f6696b.clear();
                sQLiteDatabaseM12586a.setTransactionSuccessful();
            } finally {
                if (sQLiteDatabaseM12586a != null) {
                    try {
                        sQLiteDatabaseM12586a.endTransaction();
                    } catch (Throwable unused) {
                    }
                }
                C8012e0.m12585b(f6693e).m12587c();
            }
        } catch (SQLiteDatabaseCorruptException unused2) {
            AbstractC8014f0.m12593a(f6693e);
            if (sQLiteDatabaseM12586a != null) {
            }
        } catch (Throwable unused3) {
        }
    }

    /* renamed from: D */
    public void m6198D() {
        SQLiteDatabase sQLiteDatabaseM12586a = null;
        try {
            try {
                sQLiteDatabaseM12586a = C8012e0.m12585b(f6693e).m12586a();
                sQLiteDatabaseM12586a.beginTransaction();
                sQLiteDatabaseM12586a.execSQL("delete from __er");
                sQLiteDatabaseM12586a.setTransactionSuccessful();
            } finally {
                if (sQLiteDatabaseM12586a != null) {
                    try {
                        sQLiteDatabaseM12586a.endTransaction();
                    } catch (Throwable unused) {
                    }
                }
                C8012e0.m12585b(f6693e).m12587c();
            }
        } catch (SQLiteDatabaseCorruptException unused2) {
            AbstractC8014f0.m12593a(f6693e);
            if (sQLiteDatabaseM12586a != null) {
            }
        } catch (Throwable unused3) {
        }
    }

    /* renamed from: E */
    public final void m6199E() {
        synchronized (this) {
            m6200F();
            this.f6695a.clear();
            this.f6698d.clear();
            this.f6696b.clear();
        }
    }

    /* renamed from: F */
    public final void m6200F() {
        try {
            if (TextUtils.isEmpty(f6694f)) {
                String strM17328m = AbstractC9993d.m17328m(f6693e, "ek__id");
                if (TextUtils.isEmpty(strM17328m)) {
                    strM17328m = AbstractC9866a.m16841a(f6693e).getString("ek__id", null);
                    if (TextUtils.isEmpty(strM17328m)) {
                        strM17328m = AbstractC9993d.m17318c();
                    }
                    if (!TextUtils.isEmpty(strM17328m)) {
                        AbstractC9993d.m17339x(f6693e, "ek__id", strM17328m);
                    }
                }
                if (!TextUtils.isEmpty(strM17328m)) {
                    String strSubstring = strM17328m.substring(1, 9);
                    StringBuilder sb = new StringBuilder();
                    for (int i9 = 0; i9 < strSubstring.length(); i9++) {
                        char cCharAt = strSubstring.charAt(i9);
                        if (!Character.isDigit(cCharAt)) {
                            sb.append(cCharAt);
                        } else if (Integer.parseInt(Character.toString(cCharAt)) == 0) {
                            sb.append(0);
                        } else {
                            sb.append(10 - Integer.parseInt(Character.toString(cCharAt)));
                        }
                    }
                    f6694f = sb.toString();
                }
                if (TextUtils.isEmpty(f6694f)) {
                    return;
                }
                f6694f += new StringBuilder(f6694f).reverse().toString();
                String strM17328m2 = AbstractC9993d.m17328m(f6693e, "ek_key");
                if (TextUtils.isEmpty(strM17328m2)) {
                    AbstractC9993d.m17339x(f6693e, "ek_key", m6220u("umeng+"));
                } else {
                    if ("umeng+".equals(m6223x(strM17328m2))) {
                        return;
                    }
                    m6219t(true, false);
                    m6209j(true, false);
                    m6197C();
                    m6198D();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public long m6201a(String str) throws Throwable {
        SQLiteDatabase sQLiteDatabaseM12586a;
        Cursor cursorRawQuery = null;
        long j9 = 0;
        try {
            try {
                sQLiteDatabaseM12586a = C8012e0.m12585b(f6693e).m12586a();
            } catch (Exception unused) {
            }
            try {
                sQLiteDatabaseM12586a.beginTransaction();
                cursorRawQuery = sQLiteDatabaseM12586a.rawQuery("select __f from __sd where __ii=?", new String[]{str});
                if (cursorRawQuery != null) {
                    cursorRawQuery.moveToFirst();
                    j9 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("__f"));
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Exception unused2) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                if (sQLiteDatabaseM12586a != null) {
                    sQLiteDatabaseM12586a.endTransaction();
                }
                C8012e0.m12585b(f6693e).m12587c();
                return j9;
            } catch (Throwable th) {
                th = th;
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Exception unused3) {
                        C8012e0.m12585b(f6693e).m12587c();
                        throw th;
                    }
                }
                if (sQLiteDatabaseM12586a != null) {
                    sQLiteDatabaseM12586a.endTransaction();
                }
                C8012e0.m12585b(f6693e).m12587c();
                throw th;
            }
        } catch (Exception unused4) {
            sQLiteDatabaseM12586a = null;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabaseM12586a = null;
        }
        sQLiteDatabaseM12586a.endTransaction();
        C8012e0.m12585b(f6693e).m12587c();
        return j9;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0208 A[EXC_TOP_SPLITTER, PHI: r0 r12 r16
      0x0208: PHI (r0v6 java.lang.String) = (r0v2 java.lang.String), (r0v3 java.lang.String), (r0v37 java.lang.String), (r0v37 java.lang.String) binds: [B:90:0x022f, B:97:0x023e, B:79:0x0203, B:80:0x0205] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r12v6 android.database.sqlite.SQLiteDatabase) = 
      (r12v3 android.database.sqlite.SQLiteDatabase)
      (r12v4 android.database.sqlite.SQLiteDatabase)
      (r12v33 android.database.sqlite.SQLiteDatabase)
      (r12v33 android.database.sqlite.SQLiteDatabase)
     binds: [B:90:0x022f, B:97:0x023e, B:79:0x0203, B:80:0x0205] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r16v6 android.database.Cursor) = 
      (r16v3 android.database.Cursor)
      (r16v4 android.database.Cursor)
      (r16v29 android.database.Cursor)
      (r16v29 android.database.Cursor)
     binds: [B:90:0x022f, B:97:0x023e, B:79:0x0203, B:80:0x0205] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x020b A[PHI: r0 r12 r16
      0x020b: PHI (r0v5 java.lang.String) = (r0v2 java.lang.String), (r0v3 java.lang.String), (r0v6 java.lang.String) binds: [B:90:0x022f, B:97:0x023e, B:81:0x0208] A[DONT_GENERATE, DONT_INLINE]
      0x020b: PHI (r12v5 android.database.sqlite.SQLiteDatabase) = 
      (r12v3 android.database.sqlite.SQLiteDatabase)
      (r12v4 android.database.sqlite.SQLiteDatabase)
      (r12v6 android.database.sqlite.SQLiteDatabase)
     binds: [B:90:0x022f, B:97:0x023e, B:81:0x0208] A[DONT_GENERATE, DONT_INLINE]
      0x020b: PHI (r16v5 android.database.Cursor) = (r16v3 android.database.Cursor), (r16v4 android.database.Cursor), (r16v6 android.database.Cursor) binds: [B:90:0x022f, B:97:0x023e, B:81:0x0208] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023b  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m6202c(org.json.JSONObject r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C6773h.m6202c(org.json.JSONObject, boolean):java.lang.String");
    }

    /* renamed from: d */
    public JSONObject m6203d(boolean z9) {
        m6204e();
        this.f6696b.clear();
        JSONObject jSONObject = new JSONObject();
        if (!z9) {
            m6202c(jSONObject, z9);
            m6218s(jSONObject, null);
            m6208i(jSONObject, null);
            return jSONObject;
        }
        String strM6202c = m6202c(jSONObject, z9);
        if (!TextUtils.isEmpty(strM6202c)) {
            m6218s(jSONObject, strM6202c);
            m6208i(jSONObject, strM6202c);
        }
        return jSONObject;
    }

    /* renamed from: e */
    public void m6204e() {
        this.f6695a.clear();
    }

    /* renamed from: f */
    public final void m6205f(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        try {
            long jLongValue = ((Long) jSONObject.opt("__f")).longValue();
            Object objOpt = jSONObject.opt("__g");
            long jLongValue2 = (objOpt == null || !(objOpt instanceof Long)) ? 0L : ((Long) objOpt).longValue();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("__pp");
            String strM6220u = "";
            String strM6220u2 = (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() <= 0) ? "" : m6220u(jSONObjectOptJSONObject.toString());
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
                strM6220u = m6220u(jSONObjectOptJSONObject2.toString());
            }
            sQLiteDatabase.execSQL("update __sd set __f=\"" + jLongValue + "\", __g=\"" + jLongValue2 + "\", __sp=\"" + strM6220u2 + "\", __pp=\"" + strM6220u + "\" where __ii=\"" + str + "\"");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    public final void m6206g(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase, String str2) {
        JSONArray jSONArrayOptJSONArray;
        Cursor cursor = null;
        strM6223x = null;
        String strM6223x = null;
        try {
            if ("__a".equals(str2)) {
                jSONArrayOptJSONArray = jSONObject.optJSONArray("__a");
                if (jSONArrayOptJSONArray == null) {
                    return;
                }
                if (jSONArrayOptJSONArray.length() <= 0) {
                    return;
                }
            } else if ("__b".equals(str2)) {
                jSONArrayOptJSONArray = jSONObject.optJSONArray("__b");
                if (jSONArrayOptJSONArray == null) {
                    return;
                }
                if (jSONArrayOptJSONArray.length() <= 0) {
                    return;
                }
            } else {
                jSONArrayOptJSONArray = null;
            }
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select " + str2 + " from __sd where __ii=?", new String[]{str});
            if (cursorRawQuery != null) {
                while (cursorRawQuery.moveToNext()) {
                    try {
                        strM6223x = m6223x(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(str2)));
                    } catch (Throwable unused) {
                        cursor = cursorRawQuery;
                        if (cursor != null) {
                            cursor.close();
                            return;
                        }
                        return;
                    }
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (!TextUtils.isEmpty(strM6223x)) {
                jSONArray = new JSONArray(strM6223x);
            }
            if (jSONArray.length() > 1000) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                    return;
                }
                return;
            }
            for (int i9 = 0; i9 < jSONArrayOptJSONArray.length(); i9++) {
                try {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i9);
                    if (jSONObject2 != null) {
                        jSONArray.put(jSONObject2);
                    }
                } catch (JSONException unused2) {
                }
            }
            String strM6220u = m6220u(jSONArray.toString());
            if (!TextUtils.isEmpty(strM6220u)) {
                sQLiteDatabase.execSQL("update __sd set " + str2 + "=\"" + strM6220u + "\" where __ii=\"" + str + "\"");
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        } catch (Throwable unused3) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        if (r2 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
    
        if (r2 == null) goto L21;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m6207h(org.json.JSONArray r11) {
        /*
            r10 = this;
            java.lang.String r0 = "__t"
            java.lang.String r1 = "__i"
            r2 = 0
            android.content.Context r3 = com.umeng.analytics.pro.C6773h.f6693e     // Catch: java.lang.Throwable -> La2 android.database.sqlite.SQLiteDatabaseCorruptException -> La8
            g2.e0 r3 = p114g2.C8012e0.m12585b(r3)     // Catch: java.lang.Throwable -> La2 android.database.sqlite.SQLiteDatabaseCorruptException -> La8
            android.database.sqlite.SQLiteDatabase r3 = r3.m12586a()     // Catch: java.lang.Throwable -> La2 android.database.sqlite.SQLiteDatabaseCorruptException -> La8
            r3.beginTransaction()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteDatabaseCorruptException -> La0
            r4 = 0
        L13:
            int r5 = r11.length()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteDatabaseCorruptException -> La0
            if (r4 >= r5) goto L90
            org.json.JSONObject r5 = r11.getJSONObject(r4)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            r6.<init>()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            java.lang.String r7 = r5.optString(r1)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            java.lang.String r9 = "-1"
            if (r8 != 0) goto L37
            boolean r8 = r9.equals(r7)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            if (r8 == 0) goto L46
            goto L37
        L35:
            r2 = r3
            goto La2
        L37:
            com.umeng.analytics.pro.e r7 = com.umeng.analytics.pro.C6770e.m6155d()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            java.lang.String r7 = r7.m6164j()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            if (r8 == 0) goto L46
            r7 = r9
        L46:
            r6.put(r1, r7)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            java.lang.String r7 = "__e"
            java.lang.String r8 = "id"
            java.lang.String r8 = r5.optString(r8)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            int r7 = r5.optInt(r0)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            r6.put(r0, r7)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            java.lang.String r7 = "__av"
            android.content.Context r8 = com.umeng.analytics.pro.C6773h.f6693e     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            java.lang.String r8 = p310z2.AbstractC9993d.m17320e(r8)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            java.lang.String r7 = "__vc"
            android.content.Context r8 = com.umeng.analytics.pro.C6773h.f6693e     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            java.lang.String r8 = p310z2.AbstractC9993d.m17319d(r8)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            r5.remove(r1)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            r5.remove(r0)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            java.lang.String r7 = "__s"
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            java.lang.String r5 = r10.m6220u(r5)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            r6.put(r7, r5)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
            java.lang.String r5 = "__et"
            r3.insert(r5, r2, r6)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L8d
        L8d:
            int r4 = r4 + 1
            goto L13
        L90:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteDatabaseCorruptException -> La0
            r3.endTransaction()     // Catch: java.lang.Throwable -> L96
        L96:
            android.content.Context r11 = com.umeng.analytics.pro.C6773h.f6693e
            g2.e0 r11 = p114g2.C8012e0.m12585b(r11)
            r11.m12587c()
            goto Lb0
        La0:
            r2 = r3
            goto La8
        La2:
            if (r2 == 0) goto L96
        La4:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L96
            goto L96
        La8:
            android.content.Context r11 = com.umeng.analytics.pro.C6773h.f6693e     // Catch: java.lang.Throwable -> Lb1
            p114g2.AbstractC8014f0.m12593a(r11)     // Catch: java.lang.Throwable -> Lb1
            if (r2 == 0) goto L96
            goto La4
        Lb0:
            return
        Lb1:
            r11 = move-exception
            if (r2 == 0) goto Lb7
            r2.endTransaction()     // Catch: java.lang.Throwable -> Lb7
        Lb7:
            android.content.Context r0 = com.umeng.analytics.pro.C6773h.f6693e
            g2.e0 r0 = p114g2.C8012e0.m12585b(r0)
            r0.m12587c()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C6773h.m6207h(org.json.JSONArray):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0165 A[PHI: r0 r1
      0x0165: PHI (r0v4 android.database.Cursor) = (r0v2 android.database.Cursor), (r0v3 android.database.Cursor), (r0v5 android.database.Cursor) binds: [B:71:0x017d, B:78:0x018c, B:64:0x0162] A[DONT_GENERATE, DONT_INLINE]
      0x0165: PHI (r1v5 android.database.sqlite.SQLiteDatabase) = 
      (r1v3 android.database.sqlite.SQLiteDatabase)
      (r1v4 android.database.sqlite.SQLiteDatabase)
      (r1v6 android.database.sqlite.SQLiteDatabase)
     binds: [B:71:0x017d, B:78:0x018c, B:64:0x0162] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0162 A[EXC_TOP_SPLITTER, PHI: r0 r1
      0x0162: PHI (r0v5 android.database.Cursor) = 
      (r0v2 android.database.Cursor)
      (r0v3 android.database.Cursor)
      (r0v8 android.database.Cursor)
      (r0v8 android.database.Cursor)
     binds: [B:71:0x017d, B:78:0x018c, B:62:0x015d, B:63:0x015f] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r1v6 android.database.sqlite.SQLiteDatabase) = 
      (r1v3 android.database.sqlite.SQLiteDatabase)
      (r1v4 android.database.sqlite.SQLiteDatabase)
      (r1v9 android.database.sqlite.SQLiteDatabase)
      (r1v9 android.database.sqlite.SQLiteDatabase)
     binds: [B:71:0x017d, B:78:0x018c, B:62:0x015d, B:63:0x015f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6208i(org.json.JSONObject r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C6773h.m6208i(org.json.JSONObject, java.lang.String):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(4:41|3|(1:(1:6))(3:7|(4:9|(3:11|(2:13|45)(1:46)|14)|44|15)|(1:17))|18)|36|19|40|20|29|(1:(0))) */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m6209j(boolean r6, boolean r7) {
        /*
            r5 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.C6773h.f6693e     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L6d
            g2.e0 r1 = p114g2.C8012e0.m12585b(r1)     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L6d
            android.database.sqlite.SQLiteDatabase r0 = r1.m12586a()     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L6d
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L6d
            if (r7 == 0) goto L18
            if (r6 == 0) goto L53
            java.lang.String r6 = "delete from __is"
            r0.execSQL(r6)     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L6d
            goto L53
        L18:
            java.util.List r6 = r5.f6698d     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L6d
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L6d
            r7 = 0
            if (r6 <= 0) goto L4c
            r1 = r7
        L22:
            if (r7 >= r6) goto L4b
            java.util.List r2 = r5.f6698d     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L6d
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L6d
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L6d
            if (r2 != 0) goto L2f
            r1 = 1
        L2f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L6d
            r3.<init>()     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L6d
            java.lang.String r4 = "delete from __is where __ii=\""
            r3.append(r4)     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L6d
            r3.append(r2)     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L6d
            java.lang.String r2 = "\""
            r3.append(r2)     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L6d
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L6d
            r0.execSQL(r2)     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L6d
            int r7 = r7 + 1
            goto L22
        L4b:
            r7 = r1
        L4c:
            if (r7 == 0) goto L53
            java.lang.String r6 = "delete from __is where __ii is null"
            r0.execSQL(r6)     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L6d
        L53:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L6d
        L56:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L59
        L59:
            android.content.Context r6 = com.umeng.analytics.pro.C6773h.f6693e
            g2.e0 r6 = p114g2.C8012e0.m12585b(r6)
            r6.m12587c()
            goto L75
        L63:
            android.content.Context r6 = com.umeng.analytics.pro.C6773h.f6693e     // Catch: java.lang.Throwable -> L6b
            p114g2.AbstractC8014f0.m12593a(r6)     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L59
            goto L56
        L6b:
            r6 = move-exception
            goto L76
        L6d:
            android.content.Context r6 = com.umeng.analytics.pro.C6773h.f6693e     // Catch: java.lang.Throwable -> L6b
            p114g2.AbstractC8014f0.m12593a(r6)     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L59
            goto L56
        L75:
            return
        L76:
            if (r0 == 0) goto L7b
            r0.endTransaction()     // Catch: java.lang.Throwable -> L7b
        L7b:
            android.content.Context r7 = com.umeng.analytics.pro.C6773h.f6693e
            g2.e0 r7 = p114g2.C8012e0.m12585b(r7)
            r7.m12587c()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C6773h.m6209j(boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        if (r0 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        r0.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (r0 == null) goto L11;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m6210k(java.lang.String r5, java.lang.String r6, int r7) {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.C6773h.f6693e     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteDatabaseCorruptException -> L66
            g2.e0 r1 = p114g2.C8012e0.m12585b(r1)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteDatabaseCorruptException -> L66
            android.database.sqlite.SQLiteDatabase r1 = r1.m12586a()     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteDatabaseCorruptException -> L66
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4e
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4e
            r2.<init>()     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4e
            java.lang.String r3 = "__i"
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4e
            java.lang.String r5 = r4.m6220u(r6)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4e
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4e
            if (r6 != 0) goto L50
            java.lang.String r6 = "__a"
            r2.put(r6, r5)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4e
            java.lang.String r5 = "__t"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4e
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4e
            java.lang.String r5 = "__av"
            android.content.Context r6 = com.umeng.analytics.pro.C6773h.f6693e     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4e
            java.lang.String r6 = p310z2.AbstractC9993d.m17320e(r6)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4e
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4e
            java.lang.String r5 = "__vc"
            android.content.Context r6 = com.umeng.analytics.pro.C6773h.f6693e     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4e
            java.lang.String r6 = p310z2.AbstractC9993d.m17319d(r6)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4e
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4e
            java.lang.String r5 = "__er"
            r1.insert(r5, r0, r2)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4e
            goto L50
        L4c:
            r0 = r1
            goto L60
        L4e:
            r0 = r1
            goto L66
        L50:
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteDatabaseCorruptException -> L4e
            r1.endTransaction()     // Catch: java.lang.Throwable -> L56
        L56:
            android.content.Context r5 = com.umeng.analytics.pro.C6773h.f6693e
            g2.e0 r5 = p114g2.C8012e0.m12585b(r5)
            r5.m12587c()
            goto L6e
        L60:
            if (r0 == 0) goto L56
        L62:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L56
            goto L56
        L66:
            android.content.Context r5 = com.umeng.analytics.pro.C6773h.f6693e     // Catch: java.lang.Throwable -> L70
            p114g2.AbstractC8014f0.m12593a(r5)     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L56
            goto L62
        L6e:
            r5 = 0
            return r5
        L70:
            r5 = move-exception
            if (r0 == 0) goto L76
            r0.endTransaction()     // Catch: java.lang.Throwable -> L76
        L76:
            android.content.Context r6 = com.umeng.analytics.pro.C6773h.f6693e
            g2.e0 r6 = p114g2.C8012e0.m12585b(r6)
            r6.m12587c()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C6773h.m6210k(java.lang.String, java.lang.String, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (r2 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (r2 == null) goto L29;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m6211l(java.lang.String r7, org.json.JSONObject r8, com.umeng.analytics.pro.C6773h.a r9) {
        /*
            r6 = this;
            java.lang.String r0 = "__e"
            r1 = 0
            if (r8 != 0) goto L6
            return r1
        L6:
            r2 = 0
            android.content.Context r3 = com.umeng.analytics.pro.C6773h.f6693e     // Catch: java.lang.Throwable -> L8e android.database.sqlite.SQLiteDatabaseCorruptException -> L94
            g2.e0 r3 = p114g2.C8012e0.m12585b(r3)     // Catch: java.lang.Throwable -> L8e android.database.sqlite.SQLiteDatabaseCorruptException -> L94
            android.database.sqlite.SQLiteDatabase r3 = r3.m12586a()     // Catch: java.lang.Throwable -> L8e android.database.sqlite.SQLiteDatabaseCorruptException -> L94
            r3.beginTransaction()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            com.umeng.analytics.pro.h$a r4 = com.umeng.analytics.pro.C6773h.a.BEGIN     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            if (r9 != r4) goto L53
            java.lang.Object r8 = r8.opt(r0)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            long r8 = r8.longValue()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            r4.<init>()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            java.lang.String r5 = "__ii"
            r4.put(r5, r7)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            java.lang.String r7 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            r4.put(r0, r7)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            java.lang.String r7 = "__av"
            android.content.Context r8 = com.umeng.analytics.pro.C6773h.f6693e     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            java.lang.String r8 = p310z2.AbstractC9993d.m17320e(r8)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            java.lang.String r7 = "__vc"
            android.content.Context r8 = com.umeng.analytics.pro.C6773h.f6693e     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            java.lang.String r8 = p310z2.AbstractC9993d.m17319d(r8)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            java.lang.String r7 = "__sd"
            r3.insert(r7, r2, r4)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            goto L7e
        L4f:
            r2 = r3
            goto L8e
        L51:
            r2 = r3
            goto L94
        L53:
            com.umeng.analytics.pro.h$a r0 = com.umeng.analytics.pro.C6773h.a.INSTANTSESSIONBEGIN     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            if (r9 != r0) goto L5b
            r6.m6217r(r7, r8, r3)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            goto L7e
        L5b:
            com.umeng.analytics.pro.h$a r0 = com.umeng.analytics.pro.C6773h.a.END     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            if (r9 != r0) goto L63
            r6.m6205f(r7, r8, r3)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            goto L7e
        L63:
            com.umeng.analytics.pro.h$a r0 = com.umeng.analytics.pro.C6773h.a.PAGE     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            if (r9 != r0) goto L6d
            java.lang.String r9 = "__a"
            r6.m6206g(r7, r8, r3, r9)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            goto L7e
        L6d:
            com.umeng.analytics.pro.h$a r0 = com.umeng.analytics.pro.C6773h.a.AUTOPAGE     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            if (r9 != r0) goto L77
            java.lang.String r9 = "__b"
            r6.m6206g(r7, r8, r3, r9)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            goto L7e
        L77:
            com.umeng.analytics.pro.h$a r0 = com.umeng.analytics.pro.C6773h.a.NEWSESSION     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            if (r9 != r0) goto L7e
            r6.m6221v(r7, r8, r3)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
        L7e:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            r3.endTransaction()     // Catch: java.lang.Throwable -> L84
        L84:
            android.content.Context r7 = com.umeng.analytics.pro.C6773h.f6693e
            g2.e0 r7 = p114g2.C8012e0.m12585b(r7)
            r7.m12587c()
            goto L9c
        L8e:
            if (r2 == 0) goto L84
        L90:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L84
            goto L84
        L94:
            android.content.Context r7 = com.umeng.analytics.pro.C6773h.f6693e     // Catch: java.lang.Throwable -> L9d
            p114g2.AbstractC8014f0.m12593a(r7)     // Catch: java.lang.Throwable -> L9d
            if (r2 == 0) goto L84
            goto L90
        L9c:
            return r1
        L9d:
            r7 = move-exception
            if (r2 == 0) goto La3
            r2.endTransaction()     // Catch: java.lang.Throwable -> La3
        La3:
            android.content.Context r8 = com.umeng.analytics.pro.C6773h.f6693e
            g2.e0 r8 = p114g2.C8012e0.m12585b(r8)
            r8.m12587c()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C6773h.m6211l(java.lang.String, org.json.JSONObject, com.umeng.analytics.pro.h$a):boolean");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d5 A[EXC_TOP_SPLITTER, PHI: r1 r11
      0x00d5: PHI (r1v4 android.database.sqlite.SQLiteDatabase) = (r1v3 android.database.sqlite.SQLiteDatabase), (r1v6 android.database.sqlite.SQLiteDatabase) binds: [B:38:0x00d3, B:46:0x00ef] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r11v5 java.lang.Object) = (r11v4 java.lang.Object), (r11v7 java.lang.Object) binds: [B:38:0x00d3, B:46:0x00ef] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v0, types: [org.json.JSONObject] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m6212m(org.json.JSONObject r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C6773h.m6212m(org.json.JSONObject, boolean):java.lang.String");
    }

    /* renamed from: n */
    public final JSONArray m6213n(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i9 = 0; i9 < length; i9++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optLong(TypedValues.TransitionType.S_DURATION) > 0) {
                jSONArray2.put(jSONObjectOptJSONObject);
            }
        }
        return jSONArray2;
    }

    /* renamed from: o */
    public JSONObject m6214o(boolean z9) {
        JSONObject jSONObject = new JSONObject();
        m6212m(jSONObject, z9);
        return jSONObject;
    }

    /* renamed from: p */
    public void m6215p() {
        this.f6698d.clear();
    }

    /* renamed from: q */
    public void m6216q(String str) {
        SQLiteDatabase sQLiteDatabaseM12586a = null;
        try {
            try {
                sQLiteDatabaseM12586a = C8012e0.m12585b(f6693e).m12586a();
                sQLiteDatabaseM12586a.beginTransaction();
                if (!TextUtils.isEmpty(str)) {
                    sQLiteDatabaseM12586a.execSQL("delete from __is where __ii=\"" + str + "\"");
                }
                sQLiteDatabaseM12586a.setTransactionSuccessful();
            } finally {
                if (sQLiteDatabaseM12586a != null) {
                    try {
                        sQLiteDatabaseM12586a.endTransaction();
                    } catch (Throwable unused) {
                    }
                }
                C8012e0.m12585b(f6693e).m12587c();
            }
        } catch (SQLiteDatabaseCorruptException unused2) {
            AbstractC8014f0.m12593a(f6693e);
            if (sQLiteDatabaseM12586a != null) {
            }
        } catch (Throwable unused3) {
        }
    }

    /* renamed from: r */
    public final void m6217r(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        try {
            long jLongValue = ((Long) jSONObject.get("__e")).longValue();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("__pp");
            String strM6220u = "";
            String strM6220u2 = (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() <= 0) ? "" : m6220u(jSONObjectOptJSONObject.toString());
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
                strM6220u = m6220u(jSONObjectOptJSONObject2.toString());
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("__ii", str);
            contentValues.put("__e", String.valueOf(jLongValue));
            contentValues.put("__sp", strM6220u2);
            contentValues.put("__pp", strM6220u);
            contentValues.put("__av", C9468a.m15648e(f6693e).m15649c());
            contentValues.put("__vc", AbstractC9993d.m17319d(f6693e));
            sQLiteDatabase.insert("__is", null, contentValues);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:50|3)|(7:57|4|(1:6)(1:8)|7|(5:10|(4:13|(3:60|15|63)(1:62)|61|11)|59|16|(1:18))|19|(1:21))|52|22|49|23|38|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0067 A[PHI: r0 r1
      0x0067: PHI (r0v4 android.database.Cursor) = (r0v2 android.database.Cursor), (r0v3 android.database.Cursor), (r0v5 android.database.Cursor) binds: [B:29:0x007f, B:36:0x008e, B:22:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0067: PHI (r1v5 android.database.sqlite.SQLiteDatabase) = 
      (r1v3 android.database.sqlite.SQLiteDatabase)
      (r1v4 android.database.sqlite.SQLiteDatabase)
      (r1v6 android.database.sqlite.SQLiteDatabase)
     binds: [B:29:0x007f, B:36:0x008e, B:22:0x0064] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0064 A[EXC_TOP_SPLITTER, PHI: r0 r1
      0x0064: PHI (r0v5 android.database.Cursor) = 
      (r0v2 android.database.Cursor)
      (r0v3 android.database.Cursor)
      (r0v8 android.database.Cursor)
      (r0v8 android.database.Cursor)
     binds: [B:29:0x007f, B:36:0x008e, B:20:0x005f, B:21:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0064: PHI (r1v6 android.database.sqlite.SQLiteDatabase) = 
      (r1v3 android.database.sqlite.SQLiteDatabase)
      (r1v4 android.database.sqlite.SQLiteDatabase)
      (r1v9 android.database.sqlite.SQLiteDatabase)
      (r1v9 android.database.sqlite.SQLiteDatabase)
     binds: [B:29:0x007f, B:36:0x008e, B:20:0x005f, B:21:0x0061] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6218s(org.json.JSONObject r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.C6773h.f6693e     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            g2.e0 r1 = p114g2.C8012e0.m12585b(r1)     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            android.database.sqlite.SQLiteDatabase r1 = r1.m12586a()     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L84
            java.lang.String r2 = "select *  from __er"
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L84
            if (r3 != 0) goto L22
            java.lang.String r2 = "select *  from __er where __i=?"
            java.lang.String[] r6 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L84
            android.database.Cursor r6 = r1.rawQuery(r2, r6)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L84
        L20:
            r0 = r6
            goto L27
        L22:
            android.database.Cursor r6 = r1.rawQuery(r2, r0)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L84
            goto L20
        L27:
            if (r0 == 0) goto L5c
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L84
            r6.<init>()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L84
        L2e:
            boolean r2 = r0.moveToNext()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L84
            if (r2 == 0) goto L51
            java.lang.String r2 = "__a"
            int r2 = r0.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L84
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L84
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L84
            if (r3 != 0) goto L2e
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L84
            java.lang.String r2 = r4.m6223x(r2)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L84
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L84
            r6.put(r3)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L84
            goto L2e
        L51:
            int r2 = r6.length()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L84
            if (r2 <= 0) goto L5c
            java.lang.String r2 = "error"
            r5.put(r2, r6)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L84
        L5c:
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L84
            if (r0 == 0) goto L64
            r0.close()
        L64:
            r1.endTransaction()     // Catch: java.lang.Throwable -> L67
        L67:
            android.content.Context r5 = com.umeng.analytics.pro.C6773h.f6693e
            g2.e0 r5 = p114g2.C8012e0.m12585b(r5)
            r5.m12587c()
            goto L91
        L71:
            r1 = r0
            goto L75
        L73:
            r1 = r0
            goto L84
        L75:
            android.content.Context r5 = com.umeng.analytics.pro.C6773h.f6693e     // Catch: java.lang.Throwable -> L82
            p114g2.AbstractC8014f0.m12593a(r5)     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L7f
            r0.close()
        L7f:
            if (r1 == 0) goto L67
            goto L64
        L82:
            r5 = move-exception
            goto L92
        L84:
            android.content.Context r5 = com.umeng.analytics.pro.C6773h.f6693e     // Catch: java.lang.Throwable -> L82
            p114g2.AbstractC8014f0.m12593a(r5)     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L8e
            r0.close()
        L8e:
            if (r1 == 0) goto L67
            goto L64
        L91:
            return
        L92:
            if (r0 == 0) goto L97
            r0.close()
        L97:
            if (r1 == 0) goto L9c
            r1.endTransaction()     // Catch: java.lang.Throwable -> L9c
        L9c:
            android.content.Context r6 = com.umeng.analytics.pro.C6773h.f6693e
            g2.e0 r6 = p114g2.C8012e0.m12585b(r6)
            r6.m12587c()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C6773h.m6218s(org.json.JSONObject, java.lang.String):void");
    }

    /* renamed from: t */
    public void m6219t(boolean z9, boolean z10) {
        SQLiteDatabase sQLiteDatabaseM12586a = null;
        try {
            try {
                sQLiteDatabaseM12586a = C8012e0.m12585b(f6693e).m12586a();
                sQLiteDatabaseM12586a.beginTransaction();
                if (z10) {
                    if (z9) {
                        sQLiteDatabaseM12586a.execSQL("delete from __sd");
                    }
                } else if (this.f6695a.size() > 0) {
                    for (int i9 = 0; i9 < this.f6695a.size(); i9++) {
                        sQLiteDatabaseM12586a.execSQL("delete from __sd where __ii=\"" + ((String) this.f6695a.get(i9)) + "\"");
                    }
                }
                sQLiteDatabaseM12586a.setTransactionSuccessful();
            } finally {
                if (sQLiteDatabaseM12586a != null) {
                    try {
                        sQLiteDatabaseM12586a.endTransaction();
                    } catch (Throwable unused) {
                    }
                }
                C8012e0.m12585b(f6693e).m12587c();
            }
        } catch (SQLiteDatabaseCorruptException unused2) {
            AbstractC8014f0.m12593a(f6693e);
            if (sQLiteDatabaseM12586a != null) {
            }
        } catch (Throwable unused3) {
        }
    }

    /* renamed from: u */
    public String m6220u(String str) {
        try {
            return TextUtils.isEmpty(f6694f) ? str : Base64.encodeToString(AbstractC9753a.m16340f(str.getBytes(), f6694f.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: v */
    public final void m6221v(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        Cursor cursorRawQuery;
        Cursor cursor = null;
        strM6223x = null;
        strM6223x = null;
        String strM6223x = null;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("__d");
            if (jSONObjectOptJSONObject != null) {
                cursorRawQuery = sQLiteDatabase.rawQuery("select __d from __sd where __ii=?", new String[]{str});
                if (cursorRawQuery != null) {
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            strM6223x = m6223x(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("__d")));
                        } catch (Throwable unused) {
                            cursor = cursorRawQuery;
                            if (cursor != null) {
                                cursor.close();
                                return;
                            }
                            return;
                        }
                    }
                }
            } else {
                cursorRawQuery = null;
            }
            if (jSONObjectOptJSONObject != null) {
                JSONArray jSONArray = new JSONArray();
                if (!TextUtils.isEmpty(strM6223x)) {
                    jSONArray = new JSONArray(strM6223x);
                }
                jSONArray.put(jSONObjectOptJSONObject);
                String strM6220u = m6220u(jSONArray.toString());
                if (!TextUtils.isEmpty(strM6220u)) {
                    sQLiteDatabase.execSQL("update  __sd set __d=\"" + strM6220u + "\" where __ii=\"" + str + "\"");
                }
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("__c");
            if (jSONObjectOptJSONObject2 != null) {
                String strM6220u2 = m6220u(jSONObjectOptJSONObject2.toString());
                if (!TextUtils.isEmpty(strM6220u2)) {
                    sQLiteDatabase.execSQL("update  __sd set __c=\"" + strM6220u2 + "\" where __ii=\"" + str + "\"");
                }
            }
            sQLiteDatabase.execSQL("update  __sd set __f=\"" + String.valueOf(jSONObject.optLong("__f")) + "\" where __ii=\"" + str + "\"");
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: w */
    public boolean m6222w() {
        return this.f6698d.isEmpty();
    }

    /* renamed from: x */
    public String m6223x(String str) {
        try {
            return TextUtils.isEmpty(f6694f) ? str : new String(AbstractC9753a.m16339e(Base64.decode(str.getBytes(), 0), f6694f.getBytes()));
        } catch (Exception unused) {
            if (Build.VERSION.SDK_INT >= 29 && !TextUtils.isEmpty(str)) {
                try {
                    new JSONObject(str);
                    AbstractC8959h.m14292b("MobclickRT", "--->>> UMStoreManager decrypt failed, return origin data.");
                    return str;
                } catch (Throwable unused2) {
                    return null;
                }
            }
            return null;
        }
    }

    /* renamed from: y */
    public void m6224y() {
        String strM6168o;
        SQLiteDatabase sQLiteDatabaseM12586a = null;
        try {
            try {
                sQLiteDatabaseM12586a = C8012e0.m12585b(f6693e).m12586a();
                sQLiteDatabaseM12586a.beginTransaction();
                strM6168o = C6770e.m6155d().m6168o();
            } finally {
                if (sQLiteDatabaseM12586a != null) {
                    try {
                        sQLiteDatabaseM12586a.endTransaction();
                    } catch (Throwable unused) {
                    }
                }
                C8012e0.m12585b(f6693e).m12587c();
            }
        } catch (SQLiteDatabaseCorruptException unused2) {
            AbstractC8014f0.m12593a(f6693e);
            if (sQLiteDatabaseM12586a != null) {
            }
        } catch (Throwable unused3) {
        }
        if (TextUtils.isEmpty(strM6168o)) {
            try {
                sQLiteDatabaseM12586a.endTransaction();
            } catch (Throwable unused4) {
            }
            C8012e0.m12585b(f6693e).m12587c();
            return;
        }
        String[] strArr = {"", "-1"};
        for (int i9 = 0; i9 < 2; i9++) {
            sQLiteDatabaseM12586a.execSQL("update __et set __i=\"" + strM6168o + "\" where __i=\"" + strArr[i9] + "\"");
        }
        sQLiteDatabaseM12586a.setTransactionSuccessful();
    }

    /* renamed from: z */
    public boolean m6225z() {
        return this.f6695a.isEmpty();
    }

    public C6773h() {
        this.f6695a = new ArrayList();
        this.f6696b = new ArrayList();
        this.f6697c = null;
        this.f6698d = new ArrayList();
    }
}
