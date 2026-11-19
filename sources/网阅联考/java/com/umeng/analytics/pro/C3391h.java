package com.umeng.analytics.pro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.C3387d;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.h */
/* loaded from: classes2.dex */
public class C3391h {

    /* renamed from: a */
    public static final int f2121a = 2049;

    /* renamed from: b */
    public static final int f2122b = 2050;

    /* renamed from: c */
    private static final int f2123c = 1000;

    /* renamed from: d */
    private static Context f2124d = null;

    /* renamed from: e */
    private static String f2125e = null;

    /* renamed from: f */
    private static final String f2126f = "umeng+";

    /* renamed from: g */
    private static final String f2127g = "ek__id";

    /* renamed from: h */
    private static final String f2128h = "ek_key";

    /* renamed from: i */
    private List<String> f2129i;

    /* renamed from: j */
    private List<Integer> f2130j;

    /* renamed from: k */
    private String f2131k;

    /* renamed from: l */
    private List<String> f2132l;

    /* renamed from: com.umeng.analytics.pro.h$a */
    public enum a {
        AUTOPAGE,
        PAGE,
        BEGIN,
        END,
        NEWSESSION,
        INSTANTSESSIONBEGIN
    }

    /* renamed from: com.umeng.analytics.pro.h$b */
    public static class b {

        /* renamed from: a */
        private static final C3391h f2140a = new C3391h();

        private b() {
        }
    }

    /* renamed from: a */
    public static C3391h m3158a(Context context) {
        C3391h c3391h = b.f2140a;
        if (f2124d == null && context != null) {
            f2124d = context.getApplicationContext();
            c3391h.m3168k();
        }
        return c3391h;
    }

    /* renamed from: k */
    private void m3168k() {
        synchronized (this) {
            m3169l();
            this.f2129i.clear();
            this.f2132l.clear();
            this.f2130j.clear();
        }
    }

    /* renamed from: l */
    private void m3169l() {
        try {
            if (TextUtils.isEmpty(f2125e)) {
                String multiProcessSP = UMUtils.getMultiProcessSP(f2124d, f2127g);
                if (TextUtils.isEmpty(multiProcessSP)) {
                    multiProcessSP = PreferenceWrapper.getDefault(f2124d).getString(f2127g, null);
                    if (TextUtils.isEmpty(multiProcessSP)) {
                        multiProcessSP = UMUtils.genId();
                    }
                    if (!TextUtils.isEmpty(multiProcessSP)) {
                        UMUtils.setMultiProcessSP(f2124d, f2127g, multiProcessSP);
                    }
                }
                if (!TextUtils.isEmpty(multiProcessSP)) {
                    String strSubstring = multiProcessSP.substring(1, 9);
                    StringBuilder sb = new StringBuilder();
                    for (int i4 = 0; i4 < strSubstring.length(); i4++) {
                        char cCharAt = strSubstring.charAt(i4);
                        if (!Character.isDigit(cCharAt)) {
                            sb.append(cCharAt);
                        } else if (Integer.parseInt(Character.toString(cCharAt)) == 0) {
                            sb.append(0);
                        } else {
                            sb.append(10 - Integer.parseInt(Character.toString(cCharAt)));
                        }
                    }
                    f2125e = sb.toString();
                }
                if (TextUtils.isEmpty(f2125e)) {
                    return;
                }
                f2125e += new StringBuilder(f2125e).reverse().toString();
                String multiProcessSP2 = UMUtils.getMultiProcessSP(f2124d, f2128h);
                if (TextUtils.isEmpty(multiProcessSP2)) {
                    UMUtils.setMultiProcessSP(f2124d, f2128h, m3182c(f2126f));
                } else {
                    if (f2126f.equals(m3184d(multiProcessSP2))) {
                        return;
                    }
                    m3181b(true, false);
                    m3175a(true, false);
                    m3189h();
                    m3190i();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void m3179b() {
        this.f2132l.clear();
    }

    /* renamed from: c */
    public boolean m3183c() {
        return this.f2132l.isEmpty();
    }

    /* renamed from: d */
    public void m3185d() {
        String strM3330c;
        SQLiteDatabase sQLiteDatabaseM3146a = null;
        try {
            try {
                sQLiteDatabaseM3146a = C3389f.m3145a(f2124d).m3146a();
                sQLiteDatabaseM3146a.beginTransaction();
                strM3330c = C3403t.m3314a().m3330c();
            } finally {
                if (sQLiteDatabaseM3146a != null) {
                    try {
                        sQLiteDatabaseM3146a.endTransaction();
                    } catch (Throwable unused) {
                    }
                }
                C3389f.m3145a(f2124d).m3147b();
            }
        } catch (SQLiteDatabaseCorruptException unused2) {
            C3390g.m3151a(f2124d);
            if (sQLiteDatabaseM3146a != null) {
            }
        } catch (Throwable unused3) {
        }
        if (TextUtils.isEmpty(strM3330c)) {
            try {
                sQLiteDatabaseM3146a.endTransaction();
            } catch (Throwable unused4) {
            }
            C3389f.m3145a(f2124d).m3147b();
            return;
        }
        String[] strArr = {"", "-1"};
        for (int i4 = 0; i4 < 2; i4++) {
            sQLiteDatabaseM3146a.execSQL("update __et set __i=\"" + strM3330c + "\" where __i=\"" + strArr[i4] + "\"");
        }
        sQLiteDatabaseM3146a.setTransactionSuccessful();
    }

    /* renamed from: e */
    public boolean m3186e() {
        return this.f2129i.isEmpty();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007a A[EXC_TOP_SPLITTER, PHI: r2 r5
      0x007a: PHI (r2v5 android.database.sqlite.SQLiteDatabase) = (r2v4 android.database.sqlite.SQLiteDatabase), (r2v6 android.database.sqlite.SQLiteDatabase) binds: [B:27:0x0078, B:34:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x007a: PHI (r5v3 org.json.JSONObject) = (r5v2 org.json.JSONObject), (r5v5 org.json.JSONObject) binds: [B:27:0x0078, B:34:0x0094] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject m3187f() {
        /*
            r7 = this;
            java.lang.String r0 = "__vc"
            java.lang.String r1 = "__av"
            java.util.List<java.lang.String> r2 = r7.f2132l
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 == 0) goto Le
            return r3
        Le:
            android.content.Context r2 = com.umeng.analytics.pro.C3391h.f2124d     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            com.umeng.analytics.pro.f r2 = com.umeng.analytics.pro.C3389f.m3145a(r2)     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            android.database.sqlite.SQLiteDatabase r2 = r2.m3146a()     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            r2.beginTransaction()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L6f
            java.util.List<java.lang.String> r4 = r7.f2132l     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L6f
            r5 = 0
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L6f
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L6f
            java.lang.String r5 = "select *  from __is where __ii=?"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L6f
            android.database.Cursor r4 = r2.rawQuery(r5, r4)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L6f
            if (r4 == 0) goto L52
            boolean r5 = r4.moveToNext()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L6a
            if (r5 == 0) goto L52
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L6a
            r5.<init>()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L6a
            int r3 = r4.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteDatabaseCorruptException -> L6b
            java.lang.String r3 = r4.getString(r3)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteDatabaseCorruptException -> L6b
            int r6 = r4.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteDatabaseCorruptException -> L6b
            java.lang.String r6 = r4.getString(r6)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteDatabaseCorruptException -> L6b
            r5.put(r1, r3)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteDatabaseCorruptException -> L6b
            r5.put(r0, r6)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteDatabaseCorruptException -> L6b
            r3 = r5
        L52:
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L6a
            if (r4 == 0) goto L5a
            r4.close()
        L5a:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L5d
        L5d:
            android.content.Context r0 = com.umeng.analytics.pro.C3391h.f2124d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.C3389f.m3145a(r0)
            r0.m3147b()
            goto L97
        L67:
            r5 = r3
        L68:
            r3 = r4
            goto L73
        L6a:
            r5 = r3
        L6b:
            r3 = r4
            goto L8a
        L6d:
            r5 = r3
            goto L73
        L6f:
            r5 = r3
            goto L8a
        L71:
            r2 = r3
            r5 = r2
        L73:
            if (r3 == 0) goto L78
            r3.close()
        L78:
            if (r2 == 0) goto L7d
        L7a:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L7d
        L7d:
            android.content.Context r0 = com.umeng.analytics.pro.C3391h.f2124d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.C3389f.m3145a(r0)
            r0.m3147b()
            r3 = r5
            goto L97
        L88:
            r2 = r3
            r5 = r2
        L8a:
            android.content.Context r0 = com.umeng.analytics.pro.C3391h.f2124d     // Catch: java.lang.Throwable -> L98
            com.umeng.analytics.pro.C3390g.m3151a(r0)     // Catch: java.lang.Throwable -> L98
            if (r3 == 0) goto L94
            r3.close()
        L94:
            if (r2 == 0) goto L7d
            goto L7a
        L97:
            return r3
        L98:
            r0 = move-exception
            if (r3 == 0) goto L9e
            r3.close()
        L9e:
            if (r2 == 0) goto La3
            r2.endTransaction()     // Catch: java.lang.Throwable -> La3
        La3:
            android.content.Context r1 = com.umeng.analytics.pro.C3391h.f2124d
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.C3389f.m3145a(r1)
            r1.m3147b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3391h.m3187f():org.json.JSONObject");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007a A[EXC_TOP_SPLITTER, PHI: r2 r5
      0x007a: PHI (r2v5 android.database.sqlite.SQLiteDatabase) = (r2v4 android.database.sqlite.SQLiteDatabase), (r2v6 android.database.sqlite.SQLiteDatabase) binds: [B:27:0x0078, B:34:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x007a: PHI (r5v3 org.json.JSONObject) = (r5v2 org.json.JSONObject), (r5v5 org.json.JSONObject) binds: [B:27:0x0078, B:34:0x0094] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject m3188g() {
        /*
            r7 = this;
            java.lang.String r0 = "__vc"
            java.lang.String r1 = "__av"
            java.util.List<java.lang.String> r2 = r7.f2129i
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 == 0) goto Le
            return r3
        Le:
            android.content.Context r2 = com.umeng.analytics.pro.C3391h.f2124d     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            com.umeng.analytics.pro.f r2 = com.umeng.analytics.pro.C3389f.m3145a(r2)     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            android.database.sqlite.SQLiteDatabase r2 = r2.m3146a()     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            r2.beginTransaction()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L6f
            java.util.List<java.lang.String> r4 = r7.f2129i     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L6f
            r5 = 0
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L6f
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L6f
            java.lang.String r5 = "select *  from __sd where __ii=?"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L6f
            android.database.Cursor r4 = r2.rawQuery(r5, r4)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L6f
            if (r4 == 0) goto L52
            boolean r5 = r4.moveToNext()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L6a
            if (r5 == 0) goto L52
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L6a
            r5.<init>()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L6a
            int r3 = r4.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteDatabaseCorruptException -> L6b
            java.lang.String r3 = r4.getString(r3)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteDatabaseCorruptException -> L6b
            int r6 = r4.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteDatabaseCorruptException -> L6b
            java.lang.String r6 = r4.getString(r6)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteDatabaseCorruptException -> L6b
            r5.put(r1, r3)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteDatabaseCorruptException -> L6b
            r5.put(r0, r6)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteDatabaseCorruptException -> L6b
            r3 = r5
        L52:
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L6a
            if (r4 == 0) goto L5a
            r4.close()
        L5a:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L5d
        L5d:
            android.content.Context r0 = com.umeng.analytics.pro.C3391h.f2124d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.C3389f.m3145a(r0)
            r0.m3147b()
            goto L97
        L67:
            r5 = r3
        L68:
            r3 = r4
            goto L73
        L6a:
            r5 = r3
        L6b:
            r3 = r4
            goto L8a
        L6d:
            r5 = r3
            goto L73
        L6f:
            r5 = r3
            goto L8a
        L71:
            r2 = r3
            r5 = r2
        L73:
            if (r3 == 0) goto L78
            r3.close()
        L78:
            if (r2 == 0) goto L7d
        L7a:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L7d
        L7d:
            android.content.Context r0 = com.umeng.analytics.pro.C3391h.f2124d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.C3389f.m3145a(r0)
            r0.m3147b()
            r3 = r5
            goto L97
        L88:
            r2 = r3
            r5 = r2
        L8a:
            android.content.Context r0 = com.umeng.analytics.pro.C3391h.f2124d     // Catch: java.lang.Throwable -> L98
            com.umeng.analytics.pro.C3390g.m3151a(r0)     // Catch: java.lang.Throwable -> L98
            if (r3 == 0) goto L94
            r3.close()
        L94:
            if (r2 == 0) goto L7d
            goto L7a
        L97:
            return r3
        L98:
            r0 = move-exception
            if (r3 == 0) goto L9e
            r3.close()
        L9e:
            if (r2 == 0) goto La3
            r2.endTransaction()     // Catch: java.lang.Throwable -> La3
        La3:
            android.content.Context r1 = com.umeng.analytics.pro.C3391h.f2124d
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.C3389f.m3145a(r1)
            r1.m3147b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3391h.m3188g():org.json.JSONObject");
    }

    /* renamed from: h */
    public void m3189h() {
        SQLiteDatabase sQLiteDatabaseM3146a = null;
        try {
            try {
                sQLiteDatabaseM3146a = C3389f.m3145a(f2124d).m3146a();
                sQLiteDatabaseM3146a.beginTransaction();
                if (this.f2130j.size() > 0) {
                    for (int i4 = 0; i4 < this.f2130j.size(); i4++) {
                        sQLiteDatabaseM3146a.execSQL("delete from __et where rowid=" + this.f2130j.get(i4));
                    }
                }
                this.f2130j.clear();
                sQLiteDatabaseM3146a.setTransactionSuccessful();
            } finally {
                if (sQLiteDatabaseM3146a != null) {
                    try {
                        sQLiteDatabaseM3146a.endTransaction();
                    } catch (Throwable unused) {
                    }
                }
                C3389f.m3145a(f2124d).m3147b();
            }
        } catch (SQLiteDatabaseCorruptException unused2) {
            C3390g.m3151a(f2124d);
            if (sQLiteDatabaseM3146a != null) {
            }
        } catch (Throwable unused3) {
        }
    }

    /* renamed from: i */
    public void m3190i() {
        SQLiteDatabase sQLiteDatabaseM3146a = null;
        try {
            try {
                sQLiteDatabaseM3146a = C3389f.m3145a(f2124d).m3146a();
                sQLiteDatabaseM3146a.beginTransaction();
                sQLiteDatabaseM3146a.execSQL("delete from __er");
                sQLiteDatabaseM3146a.setTransactionSuccessful();
            } finally {
                if (sQLiteDatabaseM3146a != null) {
                    try {
                        sQLiteDatabaseM3146a.endTransaction();
                    } catch (Throwable unused) {
                    }
                }
                C3389f.m3145a(f2124d).m3147b();
            }
        } catch (SQLiteDatabaseCorruptException unused2) {
            C3390g.m3151a(f2124d);
            if (sQLiteDatabaseM3146a != null) {
            }
        } catch (Throwable unused3) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051 A[EXC_TOP_SPLITTER, PHI: r1
      0x0051: PHI (r1v8 android.database.sqlite.SQLiteDatabase) = 
      (r1v4 android.database.sqlite.SQLiteDatabase)
      (r1v5 android.database.sqlite.SQLiteDatabase)
      (r1v11 android.database.sqlite.SQLiteDatabase)
     binds: [B:8:0x004f, B:13:0x0064, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m3191j() {
        /*
            r5 = this;
            java.lang.String r0 = "\""
            java.lang.String r1 = r5.f2131k
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            if (r1 != 0) goto L77
            android.content.Context r1 = com.umeng.analytics.pro.C3391h.f2124d     // Catch: java.lang.Throwable -> L4e android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.C3389f.m3145a(r1)     // Catch: java.lang.Throwable -> L4e android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            android.database.sqlite.SQLiteDatabase r1 = r1.m3146a()     // Catch: java.lang.Throwable -> L4e android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r3.<init>()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r4 = "delete from __er where __i=\""
            r3.append(r4)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r4 = r5.f2131k     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r3.append(r4)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r3.append(r0)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r1.execSQL(r3)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r3.<init>()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r4 = "delete from __et where __i=\""
            r3.append(r4)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r4 = r5.f2131k     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r3.append(r4)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r3.append(r0)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r1.execSQL(r0)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            goto L51
        L4e:
            r1 = r2
        L4f:
            if (r1 == 0) goto L54
        L51:
            r1.endTransaction()     // Catch: java.lang.Throwable -> L54
        L54:
            android.content.Context r0 = com.umeng.analytics.pro.C3391h.f2124d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.C3389f.m3145a(r0)
            r0.m3147b()
            goto L77
        L5e:
            r1 = r2
        L5f:
            android.content.Context r0 = com.umeng.analytics.pro.C3391h.f2124d     // Catch: java.lang.Throwable -> L67
            com.umeng.analytics.pro.C3390g.m3151a(r0)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L54
            goto L51
        L67:
            r0 = move-exception
            if (r1 == 0) goto L6d
            r1.endTransaction()     // Catch: java.lang.Throwable -> L6d
        L6d:
            android.content.Context r1 = com.umeng.analytics.pro.C3391h.f2124d
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.C3389f.m3145a(r1)
            r1.m3147b()
            throw r0
        L77:
            r5.f2131k = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3391h.m3191j():void");
    }

    private C3391h() {
        this.f2129i = new ArrayList();
        this.f2130j = new ArrayList();
        this.f2131k = null;
        this.f2132l = new ArrayList();
    }

    /* renamed from: b */
    private void m3165b(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        try {
            long jLongValue = ((Long) jSONObject.get("__e")).longValue();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("__pp");
            String strM3182c = "";
            String strM3182c2 = (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() <= 0) ? "" : m3182c(jSONObjectOptJSONObject.toString());
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
                strM3182c = m3182c(jSONObjectOptJSONObject2.toString());
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("__ii", str);
            contentValues.put("__e", String.valueOf(jLongValue));
            contentValues.put("__sp", strM3182c2);
            contentValues.put("__pp", strM3182c);
            contentValues.put("__av", UMGlobalContext.getInstance(f2124d).getAppVersion());
            contentValues.put("__vc", UMUtils.getAppVersionCode(f2124d));
            sQLiteDatabase.insert(C3387d.c.f2075a, null, contentValues);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private void m3167c(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        Cursor cursorRawQuery;
        Cursor cursor = null;
        strM3184d = null;
        strM3184d = null;
        String strM3184d = null;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C3387d.d.a.f2093e);
            if (jSONObjectOptJSONObject != null) {
                cursorRawQuery = sQLiteDatabase.rawQuery("select __d from __sd where __ii=?", new String[]{str});
                if (cursorRawQuery != null) {
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            strM3184d = m3184d(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(C3387d.d.a.f2093e)));
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
                if (!TextUtils.isEmpty(strM3184d)) {
                    jSONArray = new JSONArray(strM3184d);
                }
                jSONArray.put(jSONObjectOptJSONObject);
                String strM3182c = m3182c(jSONArray.toString());
                if (!TextUtils.isEmpty(strM3182c)) {
                    sQLiteDatabase.execSQL("update  __sd set __d=\"" + strM3182c + "\" where __ii=\"" + str + "\"");
                }
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(C3387d.d.a.f2092d);
            if (jSONObjectOptJSONObject2 != null) {
                String strM3182c2 = m3182c(jSONObjectOptJSONObject2.toString());
                if (!TextUtils.isEmpty(strM3182c2)) {
                    sQLiteDatabase.execSQL("update  __sd set __c=\"" + strM3182c2 + "\" where __ii=\"" + str + "\"");
                }
            }
            sQLiteDatabase.execSQL("update  __sd set __f=\"" + String.valueOf(jSONObject.optLong(C3387d.d.a.f2095g)) + "\" where __ii=\"" + str + "\"");
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    public void m3172a() {
        this.f2129i.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        if (r2 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009a, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        if (r2 == null) goto L23;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m3173a(org.json.JSONArray r11) {
        /*
            r10 = this;
            java.lang.String r0 = "__t"
            java.lang.String r1 = "__i"
            r2 = 0
            android.content.Context r3 = com.umeng.analytics.pro.C3391h.f2124d     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteDatabaseCorruptException -> La7
            com.umeng.analytics.pro.f r3 = com.umeng.analytics.pro.C3389f.m3145a(r3)     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteDatabaseCorruptException -> La7
            android.database.sqlite.SQLiteDatabase r3 = r3.m3146a()     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteDatabaseCorruptException -> La7
            r3.beginTransaction()     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            r4 = 0
        L13:
            int r5 = r11.length()     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            if (r4 >= r5) goto L8d
            org.json.JSONObject r5 = r11.getJSONObject(r4)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r6.<init>()     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r7 = r5.optString(r1)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r9 = "-1"
            if (r8 != 0) goto L34
            boolean r8 = r9.equals(r7)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            if (r8 == 0) goto L43
        L34:
            com.umeng.analytics.pro.t r7 = com.umeng.analytics.pro.C3403t.m3314a()     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r7 = r7.m3326b()     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            if (r8 == 0) goto L43
            r7 = r9
        L43:
            r6.put(r1, r7)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r7 = "__e"
            java.lang.String r8 = "id"
            java.lang.String r8 = r5.optString(r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r6.put(r7, r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            int r7 = r5.optInt(r0)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r6.put(r0, r7)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r7 = "__av"
            android.content.Context r8 = com.umeng.analytics.pro.C3391h.f2124d     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r6.put(r7, r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r7 = "__vc"
            android.content.Context r8 = com.umeng.analytics.pro.C3391h.f2124d     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r6.put(r7, r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r5.remove(r1)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r5.remove(r0)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r7 = "__s"
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r5 = r10.m3182c(r5)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r6.put(r7, r5)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r5 = "__et"
            r3.insert(r5, r2, r6)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
        L8a:
            int r4 = r4 + 1
            goto L13
        L8d:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            r3.endTransaction()     // Catch: java.lang.Throwable -> L9d
            goto L9d
        L94:
            r2 = r3
            goto L98
        L96:
            r2 = r3
            goto La7
        L98:
            if (r2 == 0) goto L9d
        L9a:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L9d
        L9d:
            android.content.Context r11 = com.umeng.analytics.pro.C3391h.f2124d
            com.umeng.analytics.pro.f r11 = com.umeng.analytics.pro.C3389f.m3145a(r11)
            r11.m3147b()
            goto Laf
        La7:
            android.content.Context r11 = com.umeng.analytics.pro.C3391h.f2124d     // Catch: java.lang.Throwable -> Lb0
            com.umeng.analytics.pro.C3390g.m3151a(r11)     // Catch: java.lang.Throwable -> Lb0
            if (r2 == 0) goto L9d
            goto L9a
        Laf:
            return
        Lb0:
            r11 = move-exception
            if (r2 == 0) goto Lb6
            r2.endTransaction()     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            android.content.Context r0 = com.umeng.analytics.pro.C3391h.f2124d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.C3389f.m3145a(r0)
            r0.m3147b()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3391h.m3173a(org.json.JSONArray):void");
    }

    /* renamed from: d */
    public String m3184d(String str) {
        try {
            return TextUtils.isEmpty(f2125e) ? str : new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f2125e.getBytes()));
        } catch (Exception unused) {
            if (Build.VERSION.SDK_INT >= 29 && !TextUtils.isEmpty(str)) {
                try {
                    new JSONObject(str);
                    UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> UMStoreManager decrypt failed, return origin data.");
                    return str;
                } catch (Throwable unused2) {
                    return null;
                }
            }
            return null;
        }
    }

    /* renamed from: b */
    public JSONObject m3178b(boolean z3) {
        JSONObject jSONObject = new JSONObject();
        m3163b(jSONObject, z3);
        return jSONObject;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:52|3)|(7:55|4|(1:6)(1:7)|8|(5:10|(4:13|(3:58|15|61)(1:60)|59|11)|57|16|(1:18))|19|(1:21))|47|33|51|34|35|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f A[EXC_TOP_SPLITTER, PHI: r0 r1
      0x007f: PHI (r0v5 android.database.Cursor) = 
      (r0v2 android.database.Cursor)
      (r0v3 android.database.Cursor)
      (r0v8 android.database.Cursor)
      (r0v8 android.database.Cursor)
     binds: [B:26:0x006f, B:32:0x007d, B:20:0x005e, B:21:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x007f: PHI (r1v6 android.database.sqlite.SQLiteDatabase) = 
      (r1v3 android.database.sqlite.SQLiteDatabase)
      (r1v4 android.database.sqlite.SQLiteDatabase)
      (r1v9 android.database.sqlite.SQLiteDatabase)
      (r1v9 android.database.sqlite.SQLiteDatabase)
     binds: [B:26:0x006f, B:32:0x007d, B:20:0x005e, B:21:0x0060] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082 A[PHI: r0 r1
      0x0082: PHI (r0v4 android.database.Cursor) = (r0v2 android.database.Cursor), (r0v3 android.database.Cursor), (r0v5 android.database.Cursor) binds: [B:26:0x006f, B:32:0x007d, B:33:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r1v5 android.database.sqlite.SQLiteDatabase) = 
      (r1v3 android.database.sqlite.SQLiteDatabase)
      (r1v4 android.database.sqlite.SQLiteDatabase)
      (r1v6 android.database.sqlite.SQLiteDatabase)
     binds: [B:26:0x006f, B:32:0x007d, B:33:0x007f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m3166b(org.json.JSONObject r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.C3391h.f2124d     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.C3389f.m3145a(r1)     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            android.database.sqlite.SQLiteDatabase r1 = r1.m3146a()     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            java.lang.String r2 = "select *  from __er"
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            if (r3 != 0) goto L21
            java.lang.String r2 = "select *  from __er where __i=?"
            java.lang.String[] r6 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            android.database.Cursor r6 = r1.rawQuery(r2, r6)     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            goto L25
        L21:
            android.database.Cursor r6 = r1.rawQuery(r2, r0)     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
        L25:
            r0 = r6
            if (r0 == 0) goto L5b
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            r6.<init>()     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
        L2d:
            boolean r2 = r0.moveToNext()     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            if (r2 == 0) goto L50
            java.lang.String r2 = "__a"
            int r2 = r0.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            if (r3 != 0) goto L2d
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            java.lang.String r2 = r4.m3184d(r2)     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            r6.put(r3)     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            goto L2d
        L50:
            int r2 = r6.length()     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            if (r2 <= 0) goto L5b
            java.lang.String r2 = "error"
            r5.put(r2, r6)     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
        L5b:
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            if (r0 == 0) goto L7f
            r0.close()
            goto L7f
        L64:
            r1 = r0
        L65:
            android.content.Context r5 = com.umeng.analytics.pro.C3391h.f2124d     // Catch: java.lang.Throwable -> L8c
            com.umeng.analytics.pro.C3390g.m3151a(r5)     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L6f
            r0.close()
        L6f:
            if (r1 == 0) goto L82
            goto L7f
        L72:
            r1 = r0
        L73:
            android.content.Context r5 = com.umeng.analytics.pro.C3391h.f2124d     // Catch: java.lang.Throwable -> L8c
            com.umeng.analytics.pro.C3390g.m3151a(r5)     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L7d
            r0.close()
        L7d:
            if (r1 == 0) goto L82
        L7f:
            r1.endTransaction()     // Catch: java.lang.Throwable -> L82
        L82:
            android.content.Context r5 = com.umeng.analytics.pro.C3391h.f2124d
            com.umeng.analytics.pro.f r5 = com.umeng.analytics.pro.C3389f.m3145a(r5)
            r5.m3147b()
            return
        L8c:
            r5 = move-exception
            if (r0 == 0) goto L92
            r0.close()
        L92:
            if (r1 == 0) goto L97
            r1.endTransaction()     // Catch: java.lang.Throwable -> L97
        L97:
            android.content.Context r6 = com.umeng.analytics.pro.C3391h.f2124d
            com.umeng.analytics.pro.f r6 = com.umeng.analytics.pro.C3389f.m3145a(r6)
            r6.m3147b()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3391h.m3166b(org.json.JSONObject, java.lang.String):void");
    }

    /* renamed from: c */
    public String m3182c(String str) {
        try {
            return TextUtils.isEmpty(f2125e) ? str : Base64.encodeToString(DataHelper.encrypt(str.getBytes(), f2125e.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        if (r0 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        r0.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        if (r0 == null) goto L13;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m3176a(java.lang.String r5, java.lang.String r6, int r7) {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.C3391h.f2124d     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.C3389f.m3145a(r1)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            android.database.sqlite.SQLiteDatabase r1 = r1.m3146a()     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r2.<init>()     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r3 = "__i"
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r5 = r4.m3182c(r6)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            if (r6 != 0) goto L4b
            java.lang.String r6 = "__a"
            r2.put(r6, r5)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r5 = "__t"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r5 = "__av"
            android.content.Context r6 = com.umeng.analytics.pro.C3391h.f2124d     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r6 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r6)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r5 = "__vc"
            android.content.Context r6 = com.umeng.analytics.pro.C3391h.f2124d     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r6 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r6)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r5 = "__er"
            r1.insert(r5, r0, r2)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
        L4b:
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r1.endTransaction()     // Catch: java.lang.Throwable -> L5b
            goto L5b
        L52:
            r0 = r1
            goto L56
        L54:
            r0 = r1
            goto L65
        L56:
            if (r0 == 0) goto L5b
        L58:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L5b
        L5b:
            android.content.Context r5 = com.umeng.analytics.pro.C3391h.f2124d
            com.umeng.analytics.pro.f r5 = com.umeng.analytics.pro.C3389f.m3145a(r5)
            r5.m3147b()
            goto L6d
        L65:
            android.content.Context r5 = com.umeng.analytics.pro.C3391h.f2124d     // Catch: java.lang.Throwable -> L6f
            com.umeng.analytics.pro.C3390g.m3151a(r5)     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L5b
            goto L58
        L6d:
            r5 = 0
            return r5
        L6f:
            r5 = move-exception
            if (r0 == 0) goto L75
            r0.endTransaction()     // Catch: java.lang.Throwable -> L75
        L75:
            android.content.Context r6 = com.umeng.analytics.pro.C3391h.f2124d
            com.umeng.analytics.pro.f r6 = com.umeng.analytics.pro.C3389f.m3145a(r6)
            r6.m3147b()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3391h.m3176a(java.lang.String, java.lang.String, int):boolean");
    }

    /* renamed from: b */
    private JSONArray m3164b(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i4);
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optLong("duration") > 0) {
                jSONArray2.put(jSONObjectOptJSONObject);
            }
        }
        return jSONArray2;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dd A[EXC_TOP_SPLITTER, PHI: r1 r11
      0x00dd: PHI (r1v4 android.database.sqlite.SQLiteDatabase) = (r1v3 android.database.sqlite.SQLiteDatabase), (r1v6 android.database.sqlite.SQLiteDatabase) binds: [B:37:0x00cc, B:43:0x00db] A[DONT_GENERATE, DONT_INLINE]
      0x00dd: PHI (r11v5 java.lang.Object) = (r11v4 java.lang.Object), (r11v7 java.lang.Object) binds: [B:37:0x00cc, B:43:0x00db] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
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
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String m3163b(org.json.JSONObject r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3391h.m3163b(org.json.JSONObject, boolean):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (r2 == null) goto L31;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m3177a(java.lang.String r7, org.json.JSONObject r8, com.umeng.analytics.pro.C3391h.a r9) {
        /*
            r6 = this;
            java.lang.String r0 = "__e"
            r1 = 0
            if (r8 != 0) goto L6
            return r1
        L6:
            r2 = 0
            android.content.Context r3 = com.umeng.analytics.pro.C3391h.f2124d     // Catch: java.lang.Throwable -> L85 android.database.sqlite.SQLiteDatabaseCorruptException -> L94
            com.umeng.analytics.pro.f r3 = com.umeng.analytics.pro.C3389f.m3145a(r3)     // Catch: java.lang.Throwable -> L85 android.database.sqlite.SQLiteDatabaseCorruptException -> L94
            android.database.sqlite.SQLiteDatabase r3 = r3.m3146a()     // Catch: java.lang.Throwable -> L85 android.database.sqlite.SQLiteDatabaseCorruptException -> L94
            r3.beginTransaction()     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            com.umeng.analytics.pro.h$a r4 = com.umeng.analytics.pro.C3391h.a.BEGIN     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            if (r9 != r4) goto L4f
            java.lang.Object r8 = r8.opt(r0)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            long r8 = r8.longValue()     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            r4.<init>()     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r5 = "__ii"
            r4.put(r5, r7)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r7 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            r4.put(r0, r7)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r7 = "__av"
            android.content.Context r8 = com.umeng.analytics.pro.C3391h.f2124d     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r8)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r7 = "__vc"
            android.content.Context r8 = com.umeng.analytics.pro.C3391h.f2124d     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r8)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r7 = "__sd"
            r3.insert(r7, r2, r4)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            goto L7a
        L4f:
            com.umeng.analytics.pro.h$a r0 = com.umeng.analytics.pro.C3391h.a.INSTANTSESSIONBEGIN     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            if (r9 != r0) goto L57
            r6.m3165b(r7, r8, r3)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            goto L7a
        L57:
            com.umeng.analytics.pro.h$a r0 = com.umeng.analytics.pro.C3391h.a.END     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            if (r9 != r0) goto L5f
            r6.m3160a(r7, r8, r3)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            goto L7a
        L5f:
            com.umeng.analytics.pro.h$a r0 = com.umeng.analytics.pro.C3391h.a.PAGE     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            if (r9 != r0) goto L69
            java.lang.String r9 = "__a"
            r6.m3161a(r7, r8, r3, r9)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            goto L7a
        L69:
            com.umeng.analytics.pro.h$a r0 = com.umeng.analytics.pro.C3391h.a.AUTOPAGE     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            if (r9 != r0) goto L73
            java.lang.String r9 = "__b"
            r6.m3161a(r7, r8, r3, r9)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            goto L7a
        L73:
            com.umeng.analytics.pro.h$a r0 = com.umeng.analytics.pro.C3391h.a.NEWSESSION     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            if (r9 != r0) goto L7a
            r6.m3167c(r7, r8, r3)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
        L7a:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            r3.endTransaction()     // Catch: java.lang.Throwable -> L8a
            goto L8a
        L81:
            r2 = r3
            goto L85
        L83:
            r2 = r3
            goto L94
        L85:
            if (r2 == 0) goto L8a
        L87:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L8a
        L8a:
            android.content.Context r7 = com.umeng.analytics.pro.C3391h.f2124d
            com.umeng.analytics.pro.f r7 = com.umeng.analytics.pro.C3389f.m3145a(r7)
            r7.m3147b()
            goto L9c
        L94:
            android.content.Context r7 = com.umeng.analytics.pro.C3391h.f2124d     // Catch: java.lang.Throwable -> L9d
            com.umeng.analytics.pro.C3390g.m3151a(r7)     // Catch: java.lang.Throwable -> L9d
            if (r2 == 0) goto L8a
            goto L87
        L9c:
            return r1
        L9d:
            r7 = move-exception
            if (r2 == 0) goto La3
            r2.endTransaction()     // Catch: java.lang.Throwable -> La3
        La3:
            android.content.Context r8 = com.umeng.analytics.pro.C3391h.f2124d
            com.umeng.analytics.pro.f r8 = com.umeng.analytics.pro.C3389f.m3145a(r8)
            r8.m3147b()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3391h.m3177a(java.lang.String, org.json.JSONObject, com.umeng.analytics.pro.h$a):boolean");
    }

    /* renamed from: a */
    private void m3160a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        try {
            long jLongValue = ((Long) jSONObject.opt(C3387d.d.a.f2095g)).longValue();
            Object objOpt = jSONObject.opt(C3387d.d.a.f2096h);
            long jLongValue2 = (objOpt == null || !(objOpt instanceof Long)) ? 0L : ((Long) objOpt).longValue();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("__pp");
            String strM3182c = "";
            String strM3182c2 = (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() <= 0) ? "" : m3182c(jSONObjectOptJSONObject.toString());
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
                strM3182c = m3182c(jSONObjectOptJSONObject2.toString());
            }
            sQLiteDatabase.execSQL("update __sd set __f=\"" + jLongValue + "\", " + C3387d.d.a.f2096h + "=\"" + jLongValue2 + "\", __sp=\"" + strM3182c2 + "\", __pp=\"" + strM3182c + "\" where __ii=\"" + str + "\"");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void m3181b(boolean z3, boolean z4) {
        SQLiteDatabase sQLiteDatabaseM3146a = null;
        try {
            try {
                sQLiteDatabaseM3146a = C3389f.m3145a(f2124d).m3146a();
                sQLiteDatabaseM3146a.beginTransaction();
                if (z4) {
                    if (z3) {
                        sQLiteDatabaseM3146a.execSQL("delete from __sd");
                    }
                } else if (this.f2129i.size() > 0) {
                    for (int i4 = 0; i4 < this.f2129i.size(); i4++) {
                        sQLiteDatabaseM3146a.execSQL("delete from __sd where __ii=\"" + this.f2129i.get(i4) + "\"");
                    }
                }
                sQLiteDatabaseM3146a.setTransactionSuccessful();
            } finally {
                if (sQLiteDatabaseM3146a != null) {
                    try {
                        sQLiteDatabaseM3146a.endTransaction();
                    } catch (Throwable unused) {
                    }
                }
                C3389f.m3145a(f2124d).m3147b();
            }
        } catch (SQLiteDatabaseCorruptException unused2) {
            C3390g.m3151a(f2124d);
            if (sQLiteDatabaseM3146a != null) {
            }
        } catch (Throwable unused3) {
        }
    }

    /* renamed from: a */
    public long m3170a(String str) throws Throwable {
        SQLiteDatabase sQLiteDatabaseM3146a;
        Cursor cursorRawQuery = null;
        long j4 = 0;
        try {
            try {
                sQLiteDatabaseM3146a = C3389f.m3145a(f2124d).m3146a();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            sQLiteDatabaseM3146a = null;
        } catch (Throwable th) {
            th = th;
            sQLiteDatabaseM3146a = null;
        }
        try {
            sQLiteDatabaseM3146a.beginTransaction();
            cursorRawQuery = sQLiteDatabaseM3146a.rawQuery("select __f from __sd where __ii=?", new String[]{str});
            if (cursorRawQuery != null) {
                cursorRawQuery.moveToFirst();
                j4 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex(C3387d.d.a.f2095g));
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        } catch (Exception unused3) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            if (sQLiteDatabaseM3146a != null) {
                sQLiteDatabaseM3146a.endTransaction();
            }
            C3389f.m3145a(f2124d).m3147b();
            return j4;
        } catch (Throwable th2) {
            th = th2;
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception unused4) {
                    C3389f.m3145a(f2124d).m3147b();
                    throw th;
                }
            }
            if (sQLiteDatabaseM3146a != null) {
                sQLiteDatabaseM3146a.endTransaction();
            }
            C3389f.m3145a(f2124d).m3147b();
            throw th;
        }
        sQLiteDatabaseM3146a.endTransaction();
        C3389f.m3145a(f2124d).m3147b();
        return j4;
    }

    /* renamed from: a */
    private void m3161a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase, String str2) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        Cursor cursor = null;
        strM3184d = null;
        String strM3184d = null;
        try {
            if ("__a".equals(str2)) {
                jSONArrayOptJSONArray = jSONObject.optJSONArray("__a");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                    return;
                }
            } else if (C3387d.d.a.f2091c.equals(str2)) {
                jSONArrayOptJSONArray = jSONObject.optJSONArray(C3387d.d.a.f2091c);
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                    return;
                }
            } else {
                jSONArrayOptJSONArray = null;
            }
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select " + str2 + " from " + C3387d.d.f2088a + " where __ii=?", new String[]{str});
            if (cursorRawQuery != null) {
                while (cursorRawQuery.moveToNext()) {
                    try {
                        strM3184d = m3184d(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(str2)));
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
            if (!TextUtils.isEmpty(strM3184d)) {
                jSONArray = new JSONArray(strM3184d);
            }
            if (jSONArray.length() > 1000) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                    return;
                }
                return;
            }
            for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                try {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i4);
                    if (jSONObject2 != null) {
                        jSONArray.put(jSONObject2);
                    }
                } catch (JSONException unused2) {
                }
            }
            String strM3182c = m3182c(jSONArray.toString());
            if (!TextUtils.isEmpty(strM3182c)) {
                sQLiteDatabase.execSQL("update __sd set " + str2 + "=\"" + strM3182c + "\" where __ii=\"" + str + "\"");
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        } catch (Throwable unused3) {
        }
    }

    /* renamed from: b */
    public void m3180b(String str) {
        SQLiteDatabase sQLiteDatabaseM3146a = null;
        try {
            try {
                sQLiteDatabaseM3146a = C3389f.m3145a(f2124d).m3146a();
                sQLiteDatabaseM3146a.beginTransaction();
                if (!TextUtils.isEmpty(str)) {
                    sQLiteDatabaseM3146a.execSQL("delete from __is where __ii=\"" + str + "\"");
                }
                sQLiteDatabaseM3146a.setTransactionSuccessful();
            } finally {
                if (sQLiteDatabaseM3146a != null) {
                    try {
                        sQLiteDatabaseM3146a.endTransaction();
                    } catch (Throwable unused) {
                    }
                }
                C3389f.m3145a(f2124d).m3147b();
            }
        } catch (SQLiteDatabaseCorruptException unused2) {
            C3390g.m3151a(f2124d);
            if (sQLiteDatabaseM3146a != null) {
            }
        } catch (Throwable unused3) {
        }
    }

    /* renamed from: a */
    public JSONObject m3171a(boolean z3) {
        m3172a();
        this.f2130j.clear();
        JSONObject jSONObject = new JSONObject();
        if (!z3) {
            m3159a(jSONObject, z3);
            m3166b(jSONObject, (String) null);
            m3162a(jSONObject, (String) null);
        } else {
            String strM3159a = m3159a(jSONObject, z3);
            if (!TextUtils.isEmpty(strM3159a)) {
                m3166b(jSONObject, strM3159a);
                m3162a(jSONObject, strM3159a);
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:94|3)|(7:97|4|(1:6)(1:7)|8|(7:10|(6:13|(2:17|(2:107|19)(2:114|108))(1:106)|20|(3:105|22|(5:103|27|(1:29)(1:30)|31|112))(3:100|32|(5:104|34|(1:36)(1:37)|38|110)(1:109))|108|11)|99|39|(5:41|(4:44|(3:116|46|119)(1:118)|117|42)|115|47|(1:49))|50|(5:52|(4:55|(3:121|57|124)(1:123)|122|53)|120|58|(1:60)))|61|(1:63))|89|75|93|76|77|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017d A[EXC_TOP_SPLITTER, PHI: r0 r1
      0x017d: PHI (r0v5 android.database.Cursor) = 
      (r0v2 android.database.Cursor)
      (r0v3 android.database.Cursor)
      (r0v8 android.database.Cursor)
      (r0v8 android.database.Cursor)
     binds: [B:68:0x016d, B:74:0x017b, B:62:0x015c, B:63:0x015e] A[DONT_GENERATE, DONT_INLINE]
      0x017d: PHI (r1v6 android.database.sqlite.SQLiteDatabase) = 
      (r1v3 android.database.sqlite.SQLiteDatabase)
      (r1v4 android.database.sqlite.SQLiteDatabase)
      (r1v9 android.database.sqlite.SQLiteDatabase)
      (r1v9 android.database.sqlite.SQLiteDatabase)
     binds: [B:68:0x016d, B:74:0x017b, B:62:0x015c, B:63:0x015e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0180 A[PHI: r0 r1
      0x0180: PHI (r0v4 android.database.Cursor) = (r0v2 android.database.Cursor), (r0v3 android.database.Cursor), (r0v5 android.database.Cursor) binds: [B:68:0x016d, B:74:0x017b, B:75:0x017d] A[DONT_GENERATE, DONT_INLINE]
      0x0180: PHI (r1v5 android.database.sqlite.SQLiteDatabase) = 
      (r1v3 android.database.sqlite.SQLiteDatabase)
      (r1v4 android.database.sqlite.SQLiteDatabase)
      (r1v6 android.database.sqlite.SQLiteDatabase)
     binds: [B:68:0x016d, B:74:0x017b, B:75:0x017d] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m3162a(org.json.JSONObject r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3391h.m3162a(org.json.JSONObject, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0230 A[EXC_TOP_SPLITTER, PHI: r0 r12 r16
      0x0230: PHI (r0v6 java.lang.String) = (r0v2 java.lang.String), (r0v3 java.lang.String), (r0v37 java.lang.String), (r0v37 java.lang.String) binds: [B:87:0x021e, B:93:0x022e, B:79:0x0203, B:80:0x0205] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r12v6 android.database.sqlite.SQLiteDatabase) = 
      (r12v3 android.database.sqlite.SQLiteDatabase)
      (r12v4 android.database.sqlite.SQLiteDatabase)
      (r12v33 android.database.sqlite.SQLiteDatabase)
      (r12v33 android.database.sqlite.SQLiteDatabase)
     binds: [B:87:0x021e, B:93:0x022e, B:79:0x0203, B:80:0x0205] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r16v6 android.database.Cursor) = 
      (r16v3 android.database.Cursor)
      (r16v4 android.database.Cursor)
      (r16v29 android.database.Cursor)
      (r16v29 android.database.Cursor)
     binds: [B:87:0x021e, B:93:0x022e, B:79:0x0203, B:80:0x0205] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0233 A[PHI: r0 r12 r16
      0x0233: PHI (r0v5 java.lang.String) = (r0v2 java.lang.String), (r0v3 java.lang.String), (r0v6 java.lang.String) binds: [B:87:0x021e, B:93:0x022e, B:94:0x0230] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r12v5 android.database.sqlite.SQLiteDatabase) = 
      (r12v3 android.database.sqlite.SQLiteDatabase)
      (r12v4 android.database.sqlite.SQLiteDatabase)
      (r12v6 android.database.sqlite.SQLiteDatabase)
     binds: [B:87:0x021e, B:93:0x022e, B:94:0x0230] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r16v5 android.database.Cursor) = (r16v3 android.database.Cursor), (r16v4 android.database.Cursor), (r16v6 android.database.Cursor) binds: [B:87:0x021e, B:93:0x022e, B:94:0x0230] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String m3159a(org.json.JSONObject r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3391h.m3159a(org.json.JSONObject, boolean):java.lang.String");
    }

    /* renamed from: a */
    public void m3175a(boolean z3, boolean z4) {
        SQLiteDatabase sQLiteDatabaseM3146a = null;
        try {
            try {
                try {
                    sQLiteDatabaseM3146a = C3389f.m3145a(f2124d).m3146a();
                    sQLiteDatabaseM3146a.beginTransaction();
                    if (!z4) {
                        int size = this.f2132l.size();
                        int i4 = 0;
                        if (size > 0) {
                            int i5 = 0;
                            while (i4 < size) {
                                String str = this.f2132l.get(i4);
                                if (str == null) {
                                    i5 = 1;
                                }
                                sQLiteDatabaseM3146a.execSQL("delete from __is where __ii=\"" + str + "\"");
                                i4++;
                            }
                            i4 = i5;
                        }
                        if (i4 != 0) {
                            sQLiteDatabaseM3146a.execSQL("delete from __is where __ii is null");
                        }
                    } else if (z3) {
                        sQLiteDatabaseM3146a.execSQL("delete from __is");
                    }
                    sQLiteDatabaseM3146a.setTransactionSuccessful();
                } catch (Throwable unused) {
                    C3390g.m3151a(f2124d);
                    if (sQLiteDatabaseM3146a != null) {
                    }
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                C3390g.m3151a(f2124d);
                if (sQLiteDatabaseM3146a != null) {
                }
            }
            try {
                sQLiteDatabaseM3146a.endTransaction();
            } catch (Throwable unused3) {
            }
            C3389f.m3145a(f2124d).m3147b();
        } catch (Throwable th) {
            if (sQLiteDatabaseM3146a != null) {
                try {
                    sQLiteDatabaseM3146a.endTransaction();
                } catch (Throwable unused4) {
                }
            }
            C3389f.m3145a(f2124d).m3147b();
            throw th;
        }
    }

    /* renamed from: a */
    public void m3174a(boolean z3, String str) {
        SQLiteDatabase sQLiteDatabaseM3146a = null;
        try {
            try {
                sQLiteDatabaseM3146a = C3389f.m3145a(f2124d).m3146a();
                sQLiteDatabaseM3146a.beginTransaction();
                if (!TextUtils.isEmpty(str)) {
                    sQLiteDatabaseM3146a.execSQL("delete from __er where __i=\"" + str + "\"");
                    sQLiteDatabaseM3146a.execSQL("delete from __et where __i=\"" + str + "\"");
                    this.f2130j.clear();
                    sQLiteDatabaseM3146a.execSQL("delete from __sd where __ii=\"" + str + "\"");
                }
                sQLiteDatabaseM3146a.setTransactionSuccessful();
            } finally {
                if (sQLiteDatabaseM3146a != null) {
                    try {
                        sQLiteDatabaseM3146a.endTransaction();
                    } catch (Throwable unused) {
                    }
                }
                C3389f.m3145a(f2124d).m3147b();
            }
        } catch (SQLiteDatabaseCorruptException unused2) {
            C3390g.m3151a(f2124d);
            if (sQLiteDatabaseM3146a != null) {
            }
        } catch (Throwable unused3) {
        }
    }
}
