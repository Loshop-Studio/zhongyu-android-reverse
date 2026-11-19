package com.umeng.analytics.pro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.C1903d;
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
/* loaded from: classes.dex */
public class C1907h {

    /* renamed from: a */
    public static final int f8713a = 2049;

    /* renamed from: b */
    public static final int f8714b = 2050;

    /* renamed from: c */
    private static final int f8715c = 1000;

    /* renamed from: d */
    private static Context f8716d = null;

    /* renamed from: e */
    private static String f8717e = null;

    /* renamed from: f */
    private static final String f8718f = "umeng+";

    /* renamed from: g */
    private static final String f8719g = "ek__id";

    /* renamed from: h */
    private static final String f8720h = "ek_key";

    /* renamed from: i */
    private List<String> f8721i;

    /* renamed from: j */
    private List<Integer> f8722j;

    /* renamed from: k */
    private String f8723k;

    /* renamed from: l */
    private List<String> f8724l;

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
    private static class b {

        /* renamed from: a */
        private static final C1907h f8732a = new C1907h();

        private b() {
        }
    }

    /* renamed from: a */
    public static C1907h m7081a(Context context) {
        C1907h c1907h = b.f8732a;
        if (f8716d == null && context != null) {
            f8716d = context.getApplicationContext();
            c1907h.m7091k();
        }
        return c1907h;
    }

    /* renamed from: k */
    private void m7091k() {
        synchronized (this) {
            m7092l();
            this.f8721i.clear();
            this.f8724l.clear();
            this.f8722j.clear();
        }
    }

    /* renamed from: l */
    private void m7092l() {
        try {
            if (TextUtils.isEmpty(f8717e)) {
                String multiProcessSP = UMUtils.getMultiProcessSP(f8716d, f8719g);
                if (TextUtils.isEmpty(multiProcessSP)) {
                    multiProcessSP = PreferenceWrapper.getDefault(f8716d).getString(f8719g, null);
                    if (TextUtils.isEmpty(multiProcessSP)) {
                        multiProcessSP = UMUtils.genId();
                    }
                    if (!TextUtils.isEmpty(multiProcessSP)) {
                        UMUtils.setMultiProcessSP(f8716d, f8719g, multiProcessSP);
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
                    f8717e = sb.toString();
                }
                if (TextUtils.isEmpty(f8717e)) {
                    return;
                }
                f8717e += new StringBuilder(f8717e).reverse().toString();
                String multiProcessSP2 = UMUtils.getMultiProcessSP(f8716d, f8720h);
                if (TextUtils.isEmpty(multiProcessSP2)) {
                    UMUtils.setMultiProcessSP(f8716d, f8720h, m7105c(f8718f));
                } else {
                    if (f8718f.equals(m7107d(multiProcessSP2))) {
                        return;
                    }
                    m7104b(true, false);
                    m7098a(true, false);
                    m7112h();
                    m7113i();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void m7102b() {
        this.f8724l.clear();
    }

    /* renamed from: c */
    public boolean m7106c() {
        return this.f8724l.isEmpty();
    }

    /* renamed from: d */
    public void m7108d() {
        String strM7253c;
        SQLiteDatabase sQLiteDatabaseM7069a = null;
        try {
            try {
                sQLiteDatabaseM7069a = C1905f.m7068a(f8716d).m7069a();
                sQLiteDatabaseM7069a.beginTransaction();
                strM7253c = C1919t.m7237a().m7253c();
            } finally {
                if (sQLiteDatabaseM7069a != null) {
                    try {
                        sQLiteDatabaseM7069a.endTransaction();
                    } catch (Throwable unused) {
                    }
                }
                C1905f.m7068a(f8716d).m7070b();
            }
        } catch (SQLiteDatabaseCorruptException unused2) {
            C1906g.m7074a(f8716d);
            if (sQLiteDatabaseM7069a != null) {
            }
        } catch (Throwable unused3) {
        }
        if (TextUtils.isEmpty(strM7253c)) {
            try {
                sQLiteDatabaseM7069a.endTransaction();
            } catch (Throwable unused4) {
            }
            C1905f.m7068a(f8716d).m7070b();
            return;
        }
        String[] strArr = {"", "-1"};
        for (int i4 = 0; i4 < 2; i4++) {
            sQLiteDatabaseM7069a.execSQL("update __et set __i=\"" + strM7253c + "\" where __i=\"" + strArr[i4] + "\"");
        }
        sQLiteDatabaseM7069a.setTransactionSuccessful();
    }

    /* renamed from: e */
    public boolean m7109e() {
        return this.f8721i.isEmpty();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007b A[EXC_TOP_SPLITTER, PHI: r2 r5
      0x007b: PHI (r2v5 android.database.sqlite.SQLiteDatabase) = (r2v4 android.database.sqlite.SQLiteDatabase), (r2v6 android.database.sqlite.SQLiteDatabase) binds: [B:27:0x0079, B:34:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x007b: PHI (r5v3 org.json.JSONObject) = (r5v2 org.json.JSONObject), (r5v5 org.json.JSONObject) binds: [B:27:0x0079, B:34:0x0095] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject m7110f() {
        /*
            r8 = this;
            java.lang.String r0 = "__vc"
            java.lang.String r1 = "__av"
            java.util.List<java.lang.String> r2 = r8.f8724l
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 == 0) goto Le
            return r3
        Le:
            android.content.Context r2 = com.umeng.analytics.pro.C1907h.f8716d     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L89
            com.umeng.analytics.pro.f r2 = com.umeng.analytics.pro.C1905f.m7068a(r2)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L89
            android.database.sqlite.SQLiteDatabase r2 = r2.m7069a()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L89
            r2.beginTransaction()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteDatabaseCorruptException -> L70
            java.util.List<java.lang.String> r4 = r8.f8724l     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteDatabaseCorruptException -> L70
            r5 = 0
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteDatabaseCorruptException -> L70
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteDatabaseCorruptException -> L70
            java.lang.String r6 = "select *  from __is where __ii=?"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteDatabaseCorruptException -> L70
            r7[r5] = r4     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteDatabaseCorruptException -> L70
            android.database.Cursor r4 = r2.rawQuery(r6, r7)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteDatabaseCorruptException -> L70
            if (r4 == 0) goto L53
            boolean r5 = r4.moveToNext()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteDatabaseCorruptException -> L6b
            if (r5 == 0) goto L53
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteDatabaseCorruptException -> L6b
            r5.<init>()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteDatabaseCorruptException -> L6b
            int r3 = r4.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            java.lang.String r3 = r4.getString(r3)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            int r6 = r4.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            java.lang.String r6 = r4.getString(r6)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            r5.put(r1, r3)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            r5.put(r0, r6)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            r3 = r5
        L53:
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteDatabaseCorruptException -> L6b
            if (r4 == 0) goto L5b
            r4.close()
        L5b:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L5e
        L5e:
            android.content.Context r0 = com.umeng.analytics.pro.C1907h.f8716d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.C1905f.m7068a(r0)
            r0.m7070b()
            goto L98
        L68:
            r5 = r3
        L69:
            r3 = r4
            goto L74
        L6b:
            r5 = r3
        L6c:
            r3 = r4
            goto L8b
        L6e:
            r5 = r3
            goto L74
        L70:
            r5 = r3
            goto L8b
        L72:
            r2 = r3
            r5 = r2
        L74:
            if (r3 == 0) goto L79
            r3.close()
        L79:
            if (r2 == 0) goto L7e
        L7b:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L7e
        L7e:
            android.content.Context r0 = com.umeng.analytics.pro.C1907h.f8716d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.C1905f.m7068a(r0)
            r0.m7070b()
            r3 = r5
            goto L98
        L89:
            r2 = r3
            r5 = r2
        L8b:
            android.content.Context r0 = com.umeng.analytics.pro.C1907h.f8716d     // Catch: java.lang.Throwable -> L99
            com.umeng.analytics.pro.C1906g.m7074a(r0)     // Catch: java.lang.Throwable -> L99
            if (r3 == 0) goto L95
            r3.close()
        L95:
            if (r2 == 0) goto L7e
            goto L7b
        L98:
            return r3
        L99:
            r0 = move-exception
            if (r3 == 0) goto L9f
            r3.close()
        L9f:
            if (r2 == 0) goto La4
            r2.endTransaction()     // Catch: java.lang.Throwable -> La4
        La4:
            android.content.Context r1 = com.umeng.analytics.pro.C1907h.f8716d
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.C1905f.m7068a(r1)
            r1.m7070b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C1907h.m7110f():org.json.JSONObject");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007b A[EXC_TOP_SPLITTER, PHI: r2 r5
      0x007b: PHI (r2v5 android.database.sqlite.SQLiteDatabase) = (r2v4 android.database.sqlite.SQLiteDatabase), (r2v6 android.database.sqlite.SQLiteDatabase) binds: [B:27:0x0079, B:34:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x007b: PHI (r5v3 org.json.JSONObject) = (r5v2 org.json.JSONObject), (r5v5 org.json.JSONObject) binds: [B:27:0x0079, B:34:0x0095] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject m7111g() {
        /*
            r8 = this;
            java.lang.String r0 = "__vc"
            java.lang.String r1 = "__av"
            java.util.List<java.lang.String> r2 = r8.f8721i
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 == 0) goto Le
            return r3
        Le:
            android.content.Context r2 = com.umeng.analytics.pro.C1907h.f8716d     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L89
            com.umeng.analytics.pro.f r2 = com.umeng.analytics.pro.C1905f.m7068a(r2)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L89
            android.database.sqlite.SQLiteDatabase r2 = r2.m7069a()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L89
            r2.beginTransaction()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteDatabaseCorruptException -> L70
            java.util.List<java.lang.String> r4 = r8.f8721i     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteDatabaseCorruptException -> L70
            r5 = 0
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteDatabaseCorruptException -> L70
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteDatabaseCorruptException -> L70
            java.lang.String r6 = "select *  from __sd where __ii=?"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteDatabaseCorruptException -> L70
            r7[r5] = r4     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteDatabaseCorruptException -> L70
            android.database.Cursor r4 = r2.rawQuery(r6, r7)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteDatabaseCorruptException -> L70
            if (r4 == 0) goto L53
            boolean r5 = r4.moveToNext()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteDatabaseCorruptException -> L6b
            if (r5 == 0) goto L53
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteDatabaseCorruptException -> L6b
            r5.<init>()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteDatabaseCorruptException -> L6b
            int r3 = r4.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            java.lang.String r3 = r4.getString(r3)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            int r6 = r4.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            java.lang.String r6 = r4.getString(r6)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            r5.put(r1, r3)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            r5.put(r0, r6)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            r3 = r5
        L53:
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteDatabaseCorruptException -> L6b
            if (r4 == 0) goto L5b
            r4.close()
        L5b:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L5e
        L5e:
            android.content.Context r0 = com.umeng.analytics.pro.C1907h.f8716d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.C1905f.m7068a(r0)
            r0.m7070b()
            goto L98
        L68:
            r5 = r3
        L69:
            r3 = r4
            goto L74
        L6b:
            r5 = r3
        L6c:
            r3 = r4
            goto L8b
        L6e:
            r5 = r3
            goto L74
        L70:
            r5 = r3
            goto L8b
        L72:
            r2 = r3
            r5 = r2
        L74:
            if (r3 == 0) goto L79
            r3.close()
        L79:
            if (r2 == 0) goto L7e
        L7b:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L7e
        L7e:
            android.content.Context r0 = com.umeng.analytics.pro.C1907h.f8716d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.C1905f.m7068a(r0)
            r0.m7070b()
            r3 = r5
            goto L98
        L89:
            r2 = r3
            r5 = r2
        L8b:
            android.content.Context r0 = com.umeng.analytics.pro.C1907h.f8716d     // Catch: java.lang.Throwable -> L99
            com.umeng.analytics.pro.C1906g.m7074a(r0)     // Catch: java.lang.Throwable -> L99
            if (r3 == 0) goto L95
            r3.close()
        L95:
            if (r2 == 0) goto L7e
            goto L7b
        L98:
            return r3
        L99:
            r0 = move-exception
            if (r3 == 0) goto L9f
            r3.close()
        L9f:
            if (r2 == 0) goto La4
            r2.endTransaction()     // Catch: java.lang.Throwable -> La4
        La4:
            android.content.Context r1 = com.umeng.analytics.pro.C1907h.f8716d
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.C1905f.m7068a(r1)
            r1.m7070b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C1907h.m7111g():org.json.JSONObject");
    }

    /* renamed from: h */
    public void m7112h() {
        SQLiteDatabase sQLiteDatabaseM7069a = null;
        try {
            try {
                sQLiteDatabaseM7069a = C1905f.m7068a(f8716d).m7069a();
                sQLiteDatabaseM7069a.beginTransaction();
                if (this.f8722j.size() > 0) {
                    for (int i4 = 0; i4 < this.f8722j.size(); i4++) {
                        sQLiteDatabaseM7069a.execSQL("delete from __et where rowid=" + this.f8722j.get(i4));
                    }
                }
                this.f8722j.clear();
                sQLiteDatabaseM7069a.setTransactionSuccessful();
            } finally {
                if (sQLiteDatabaseM7069a != null) {
                    try {
                        sQLiteDatabaseM7069a.endTransaction();
                    } catch (Throwable unused) {
                    }
                }
                C1905f.m7068a(f8716d).m7070b();
            }
        } catch (SQLiteDatabaseCorruptException unused2) {
            C1906g.m7074a(f8716d);
            if (sQLiteDatabaseM7069a != null) {
            }
        } catch (Throwable unused3) {
        }
    }

    /* renamed from: i */
    public void m7113i() {
        SQLiteDatabase sQLiteDatabaseM7069a = null;
        try {
            try {
                sQLiteDatabaseM7069a = C1905f.m7068a(f8716d).m7069a();
                sQLiteDatabaseM7069a.beginTransaction();
                sQLiteDatabaseM7069a.execSQL("delete from __er");
                sQLiteDatabaseM7069a.setTransactionSuccessful();
            } finally {
                if (sQLiteDatabaseM7069a != null) {
                    try {
                        sQLiteDatabaseM7069a.endTransaction();
                    } catch (Throwable unused) {
                    }
                }
                C1905f.m7068a(f8716d).m7070b();
            }
        } catch (SQLiteDatabaseCorruptException unused2) {
            C1906g.m7074a(f8716d);
            if (sQLiteDatabaseM7069a != null) {
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
    public void m7114j() {
        /*
            r5 = this;
            java.lang.String r0 = "\""
            java.lang.String r1 = r5.f8723k
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            if (r1 != 0) goto L77
            android.content.Context r1 = com.umeng.analytics.pro.C1907h.f8716d     // Catch: java.lang.Throwable -> L4e android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.C1905f.m7068a(r1)     // Catch: java.lang.Throwable -> L4e android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            android.database.sqlite.SQLiteDatabase r1 = r1.m7069a()     // Catch: java.lang.Throwable -> L4e android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r3.<init>()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r4 = "delete from __er where __i=\""
            r3.append(r4)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r4 = r5.f8723k     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r3.append(r4)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r3.append(r0)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r1.execSQL(r3)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r3.<init>()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r4 = "delete from __et where __i=\""
            r3.append(r4)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r4 = r5.f8723k     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
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
            android.content.Context r0 = com.umeng.analytics.pro.C1907h.f8716d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.C1905f.m7068a(r0)
            r0.m7070b()
            goto L77
        L5e:
            r1 = r2
        L5f:
            android.content.Context r0 = com.umeng.analytics.pro.C1907h.f8716d     // Catch: java.lang.Throwable -> L67
            com.umeng.analytics.pro.C1906g.m7074a(r0)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L54
            goto L51
        L67:
            r0 = move-exception
            if (r1 == 0) goto L6d
            r1.endTransaction()     // Catch: java.lang.Throwable -> L6d
        L6d:
            android.content.Context r1 = com.umeng.analytics.pro.C1907h.f8716d
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.C1905f.m7068a(r1)
            r1.m7070b()
            throw r0
        L77:
            r5.f8723k = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C1907h.m7114j():void");
    }

    private C1907h() {
        this.f8721i = new ArrayList();
        this.f8722j = new ArrayList();
        this.f8723k = null;
        this.f8724l = new ArrayList();
    }

    /* renamed from: b */
    private void m7088b(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        try {
            long jLongValue = ((Long) jSONObject.get("__e")).longValue();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("__pp");
            String strM7105c = "";
            String strM7105c2 = (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() <= 0) ? "" : m7105c(jSONObjectOptJSONObject.toString());
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
                strM7105c = m7105c(jSONObjectOptJSONObject2.toString());
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("__ii", str);
            contentValues.put("__e", String.valueOf(jLongValue));
            contentValues.put("__sp", strM7105c2);
            contentValues.put("__pp", strM7105c);
            contentValues.put("__av", UMGlobalContext.getInstance(f8716d).getAppVersion());
            contentValues.put("__vc", UMUtils.getAppVersionCode(f8716d));
            sQLiteDatabase.insert(C1903d.c.f8667a, null, contentValues);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private void m7090c(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        Cursor cursorRawQuery;
        Cursor cursor = null;
        strM7107d = null;
        strM7107d = null;
        String strM7107d = null;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C1903d.d.a.f8685e);
            if (jSONObjectOptJSONObject != null) {
                cursorRawQuery = sQLiteDatabase.rawQuery("select __d from __sd where __ii=?", new String[]{str});
                if (cursorRawQuery != null) {
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            strM7107d = m7107d(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(C1903d.d.a.f8685e)));
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
                if (!TextUtils.isEmpty(strM7107d)) {
                    jSONArray = new JSONArray(strM7107d);
                }
                jSONArray.put(jSONObjectOptJSONObject);
                String strM7105c = m7105c(jSONArray.toString());
                if (!TextUtils.isEmpty(strM7105c)) {
                    sQLiteDatabase.execSQL("update  __sd set __d=\"" + strM7105c + "\" where __ii=\"" + str + "\"");
                }
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(C1903d.d.a.f8684d);
            if (jSONObjectOptJSONObject2 != null) {
                String strM7105c2 = m7105c(jSONObjectOptJSONObject2.toString());
                if (!TextUtils.isEmpty(strM7105c2)) {
                    sQLiteDatabase.execSQL("update  __sd set __c=\"" + strM7105c2 + "\" where __ii=\"" + str + "\"");
                }
            }
            sQLiteDatabase.execSQL("update  __sd set __f=\"" + String.valueOf(jSONObject.optLong(C1903d.d.a.f8687g)) + "\" where __ii=\"" + str + "\"");
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    public void m7095a() {
        this.f8721i.clear();
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
    public void m7096a(org.json.JSONArray r11) {
        /*
            r10 = this;
            java.lang.String r0 = "__t"
            java.lang.String r1 = "__i"
            r2 = 0
            android.content.Context r3 = com.umeng.analytics.pro.C1907h.f8716d     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteDatabaseCorruptException -> La7
            com.umeng.analytics.pro.f r3 = com.umeng.analytics.pro.C1905f.m7068a(r3)     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteDatabaseCorruptException -> La7
            android.database.sqlite.SQLiteDatabase r3 = r3.m7069a()     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteDatabaseCorruptException -> La7
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
            com.umeng.analytics.pro.t r7 = com.umeng.analytics.pro.C1919t.m7237a()     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r7 = r7.m7249b()     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
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
            android.content.Context r8 = com.umeng.analytics.pro.C1907h.f8716d     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r6.put(r7, r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r7 = "__vc"
            android.content.Context r8 = com.umeng.analytics.pro.C1907h.f8716d     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r6.put(r7, r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r5.remove(r1)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r5.remove(r0)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r7 = "__s"
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r5 = r10.m7105c(r5)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
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
            android.content.Context r11 = com.umeng.analytics.pro.C1907h.f8716d
            com.umeng.analytics.pro.f r11 = com.umeng.analytics.pro.C1905f.m7068a(r11)
            r11.m7070b()
            goto Laf
        La7:
            android.content.Context r11 = com.umeng.analytics.pro.C1907h.f8716d     // Catch: java.lang.Throwable -> Lb0
            com.umeng.analytics.pro.C1906g.m7074a(r11)     // Catch: java.lang.Throwable -> Lb0
            if (r2 == 0) goto L9d
            goto L9a
        Laf:
            return
        Lb0:
            r11 = move-exception
            if (r2 == 0) goto Lb6
            r2.endTransaction()     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            android.content.Context r0 = com.umeng.analytics.pro.C1907h.f8716d
            com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.C1905f.m7068a(r0)
            r0.m7070b()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C1907h.m7096a(org.json.JSONArray):void");
    }

    /* renamed from: d */
    public String m7107d(String str) {
        try {
            return TextUtils.isEmpty(f8717e) ? str : new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f8717e.getBytes()));
        } catch (Exception unused) {
            if (Build.VERSION.SDK_INT >= 29 && !TextUtils.isEmpty(str)) {
                try {
                    new JSONObject(str);
                    UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> UMStoreManager decrypt failed, return origin data.");
                    return str;
                } catch (Throwable unused2) {
                    return null;
                }
            }
            return null;
        }
    }

    /* renamed from: b */
    public JSONObject m7101b(boolean z3) {
        JSONObject jSONObject = new JSONObject();
        m7086b(jSONObject, z3);
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0081 A[EXC_TOP_SPLITTER, PHI: r0 r1
      0x0081: PHI (r0v5 android.database.Cursor) = 
      (r0v2 android.database.Cursor)
      (r0v3 android.database.Cursor)
      (r0v8 android.database.Cursor)
      (r0v8 android.database.Cursor)
     binds: [B:26:0x0071, B:32:0x007f, B:20:0x0060, B:21:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r1v6 android.database.sqlite.SQLiteDatabase) = 
      (r1v3 android.database.sqlite.SQLiteDatabase)
      (r1v4 android.database.sqlite.SQLiteDatabase)
      (r1v9 android.database.sqlite.SQLiteDatabase)
      (r1v9 android.database.sqlite.SQLiteDatabase)
     binds: [B:26:0x0071, B:32:0x007f, B:20:0x0060, B:21:0x0062] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0084 A[PHI: r0 r1
      0x0084: PHI (r0v4 android.database.Cursor) = (r0v2 android.database.Cursor), (r0v3 android.database.Cursor), (r0v5 android.database.Cursor) binds: [B:26:0x0071, B:32:0x007f, B:33:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0084: PHI (r1v5 android.database.sqlite.SQLiteDatabase) = 
      (r1v3 android.database.sqlite.SQLiteDatabase)
      (r1v4 android.database.sqlite.SQLiteDatabase)
      (r1v6 android.database.sqlite.SQLiteDatabase)
     binds: [B:26:0x0071, B:32:0x007f, B:33:0x0081] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m7089b(org.json.JSONObject r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.C1907h.f8716d     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteDatabaseCorruptException -> L74
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.C1905f.m7068a(r1)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteDatabaseCorruptException -> L74
            android.database.sqlite.SQLiteDatabase r1 = r1.m7069a()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteDatabaseCorruptException -> L74
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            java.lang.String r2 = "select *  from __er"
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            if (r3 != 0) goto L23
            java.lang.String r2 = "select *  from __er where __i=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            r4 = 0
            r3[r4] = r7     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            android.database.Cursor r7 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            goto L27
        L23:
            android.database.Cursor r7 = r1.rawQuery(r2, r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
        L27:
            r0 = r7
            if (r0 == 0) goto L5d
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            r7.<init>()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
        L2f:
            boolean r2 = r0.moveToNext()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            if (r2 == 0) goto L52
            java.lang.String r2 = "__a"
            int r2 = r0.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            if (r3 != 0) goto L2f
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            java.lang.String r2 = r5.m7107d(r2)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            r7.put(r3)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            goto L2f
        L52:
            int r2 = r7.length()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            if (r2 <= 0) goto L5d
            java.lang.String r2 = "error"
            r6.put(r2, r7)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
        L5d:
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            if (r0 == 0) goto L81
            r0.close()
            goto L81
        L66:
            r1 = r0
        L67:
            android.content.Context r6 = com.umeng.analytics.pro.C1907h.f8716d     // Catch: java.lang.Throwable -> L8e
            com.umeng.analytics.pro.C1906g.m7074a(r6)     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L71
            r0.close()
        L71:
            if (r1 == 0) goto L84
            goto L81
        L74:
            r1 = r0
        L75:
            android.content.Context r6 = com.umeng.analytics.pro.C1907h.f8716d     // Catch: java.lang.Throwable -> L8e
            com.umeng.analytics.pro.C1906g.m7074a(r6)     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L7f
            r0.close()
        L7f:
            if (r1 == 0) goto L84
        L81:
            r1.endTransaction()     // Catch: java.lang.Throwable -> L84
        L84:
            android.content.Context r6 = com.umeng.analytics.pro.C1907h.f8716d
            com.umeng.analytics.pro.f r6 = com.umeng.analytics.pro.C1905f.m7068a(r6)
            r6.m7070b()
            return
        L8e:
            r6 = move-exception
            if (r0 == 0) goto L94
            r0.close()
        L94:
            if (r1 == 0) goto L99
            r1.endTransaction()     // Catch: java.lang.Throwable -> L99
        L99:
            android.content.Context r7 = com.umeng.analytics.pro.C1907h.f8716d
            com.umeng.analytics.pro.f r7 = com.umeng.analytics.pro.C1905f.m7068a(r7)
            r7.m7070b()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C1907h.m7089b(org.json.JSONObject, java.lang.String):void");
    }

    /* renamed from: c */
    public String m7105c(String str) {
        try {
            return TextUtils.isEmpty(f8717e) ? str : Base64.encodeToString(DataHelper.encrypt(str.getBytes(), f8717e.getBytes()), 0);
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
    public boolean m7099a(java.lang.String r5, java.lang.String r6, int r7) {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.C1907h.f8716d     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.C1905f.m7068a(r1)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            android.database.sqlite.SQLiteDatabase r1 = r1.m7069a()     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r2.<init>()     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r3 = "__i"
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r5 = r4.m7105c(r6)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            if (r6 != 0) goto L4b
            java.lang.String r6 = "__a"
            r2.put(r6, r5)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r5 = "__t"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r5 = "__av"
            android.content.Context r6 = com.umeng.analytics.pro.C1907h.f8716d     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r6 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r6)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r5 = "__vc"
            android.content.Context r6 = com.umeng.analytics.pro.C1907h.f8716d     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
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
            android.content.Context r5 = com.umeng.analytics.pro.C1907h.f8716d
            com.umeng.analytics.pro.f r5 = com.umeng.analytics.pro.C1905f.m7068a(r5)
            r5.m7070b()
            goto L6d
        L65:
            android.content.Context r5 = com.umeng.analytics.pro.C1907h.f8716d     // Catch: java.lang.Throwable -> L6f
            com.umeng.analytics.pro.C1906g.m7074a(r5)     // Catch: java.lang.Throwable -> L6f
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
            android.content.Context r6 = com.umeng.analytics.pro.C1907h.f8716d
            com.umeng.analytics.pro.f r6 = com.umeng.analytics.pro.C1905f.m7068a(r6)
            r6.m7070b()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C1907h.m7099a(java.lang.String, java.lang.String, int):boolean");
    }

    /* renamed from: b */
    private JSONArray m7087b(JSONArray jSONArray) {
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
    private java.lang.String m7086b(org.json.JSONObject r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C1907h.m7086b(org.json.JSONObject, boolean):java.lang.String");
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
    public boolean m7100a(java.lang.String r7, org.json.JSONObject r8, com.umeng.analytics.pro.C1907h.a r9) {
        /*
            r6 = this;
            java.lang.String r0 = "__e"
            r1 = 0
            if (r8 != 0) goto L6
            return r1
        L6:
            r2 = 0
            android.content.Context r3 = com.umeng.analytics.pro.C1907h.f8716d     // Catch: java.lang.Throwable -> L85 android.database.sqlite.SQLiteDatabaseCorruptException -> L94
            com.umeng.analytics.pro.f r3 = com.umeng.analytics.pro.C1905f.m7068a(r3)     // Catch: java.lang.Throwable -> L85 android.database.sqlite.SQLiteDatabaseCorruptException -> L94
            android.database.sqlite.SQLiteDatabase r3 = r3.m7069a()     // Catch: java.lang.Throwable -> L85 android.database.sqlite.SQLiteDatabaseCorruptException -> L94
            r3.beginTransaction()     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            com.umeng.analytics.pro.h$a r4 = com.umeng.analytics.pro.C1907h.a.BEGIN     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
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
            android.content.Context r8 = com.umeng.analytics.pro.C1907h.f8716d     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r8)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r7 = "__vc"
            android.content.Context r8 = com.umeng.analytics.pro.C1907h.f8716d     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r8)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r7 = "__sd"
            r3.insert(r7, r2, r4)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            goto L7a
        L4f:
            com.umeng.analytics.pro.h$a r0 = com.umeng.analytics.pro.C1907h.a.INSTANTSESSIONBEGIN     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            if (r9 != r0) goto L57
            r6.m7088b(r7, r8, r3)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            goto L7a
        L57:
            com.umeng.analytics.pro.h$a r0 = com.umeng.analytics.pro.C1907h.a.END     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            if (r9 != r0) goto L5f
            r6.m7083a(r7, r8, r3)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            goto L7a
        L5f:
            com.umeng.analytics.pro.h$a r0 = com.umeng.analytics.pro.C1907h.a.PAGE     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            if (r9 != r0) goto L69
            java.lang.String r9 = "__a"
            r6.m7084a(r7, r8, r3, r9)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            goto L7a
        L69:
            com.umeng.analytics.pro.h$a r0 = com.umeng.analytics.pro.C1907h.a.AUTOPAGE     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            if (r9 != r0) goto L73
            java.lang.String r9 = "__b"
            r6.m7084a(r7, r8, r3, r9)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            goto L7a
        L73:
            com.umeng.analytics.pro.h$a r0 = com.umeng.analytics.pro.C1907h.a.NEWSESSION     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            if (r9 != r0) goto L7a
            r6.m7090c(r7, r8, r3)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
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
            android.content.Context r7 = com.umeng.analytics.pro.C1907h.f8716d
            com.umeng.analytics.pro.f r7 = com.umeng.analytics.pro.C1905f.m7068a(r7)
            r7.m7070b()
            goto L9c
        L94:
            android.content.Context r7 = com.umeng.analytics.pro.C1907h.f8716d     // Catch: java.lang.Throwable -> L9d
            com.umeng.analytics.pro.C1906g.m7074a(r7)     // Catch: java.lang.Throwable -> L9d
            if (r2 == 0) goto L8a
            goto L87
        L9c:
            return r1
        L9d:
            r7 = move-exception
            if (r2 == 0) goto La3
            r2.endTransaction()     // Catch: java.lang.Throwable -> La3
        La3:
            android.content.Context r8 = com.umeng.analytics.pro.C1907h.f8716d
            com.umeng.analytics.pro.f r8 = com.umeng.analytics.pro.C1905f.m7068a(r8)
            r8.m7070b()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C1907h.m7100a(java.lang.String, org.json.JSONObject, com.umeng.analytics.pro.h$a):boolean");
    }

    /* renamed from: a */
    private void m7083a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        try {
            long jLongValue = ((Long) jSONObject.opt(C1903d.d.a.f8687g)).longValue();
            long jLongValue2 = 0;
            Object objOpt = jSONObject.opt(C1903d.d.a.f8688h);
            if (objOpt != null && (objOpt instanceof Long)) {
                jLongValue2 = ((Long) objOpt).longValue();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("__pp");
            String strM7105c = "";
            String strM7105c2 = (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() <= 0) ? "" : m7105c(jSONObjectOptJSONObject.toString());
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
                strM7105c = m7105c(jSONObjectOptJSONObject2.toString());
            }
            sQLiteDatabase.execSQL("update __sd set __f=\"" + jLongValue + "\", " + C1903d.d.a.f8688h + "=\"" + jLongValue2 + "\", __sp=\"" + strM7105c2 + "\", __pp=\"" + strM7105c + "\" where __ii=\"" + str + "\"");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void m7104b(boolean z3, boolean z4) {
        SQLiteDatabase sQLiteDatabaseM7069a = null;
        try {
            try {
                sQLiteDatabaseM7069a = C1905f.m7068a(f8716d).m7069a();
                sQLiteDatabaseM7069a.beginTransaction();
                if (z4) {
                    if (z3) {
                        sQLiteDatabaseM7069a.execSQL("delete from __sd");
                    }
                } else if (this.f8721i.size() > 0) {
                    for (int i4 = 0; i4 < this.f8721i.size(); i4++) {
                        sQLiteDatabaseM7069a.execSQL("delete from __sd where __ii=\"" + this.f8721i.get(i4) + "\"");
                    }
                }
                sQLiteDatabaseM7069a.setTransactionSuccessful();
            } finally {
                if (sQLiteDatabaseM7069a != null) {
                    try {
                        sQLiteDatabaseM7069a.endTransaction();
                    } catch (Throwable unused) {
                    }
                }
                C1905f.m7068a(f8716d).m7070b();
            }
        } catch (SQLiteDatabaseCorruptException unused2) {
            C1906g.m7074a(f8716d);
            if (sQLiteDatabaseM7069a != null) {
            }
        } catch (Throwable unused3) {
        }
    }

    /* renamed from: a */
    public long m7093a(String str) throws Throwable {
        SQLiteDatabase sQLiteDatabaseM7069a;
        Cursor cursorRawQuery = null;
        long j4 = 0;
        try {
            try {
                sQLiteDatabaseM7069a = C1905f.m7068a(f8716d).m7069a();
            } catch (Exception unused) {
            }
            try {
                sQLiteDatabaseM7069a.beginTransaction();
                cursorRawQuery = sQLiteDatabaseM7069a.rawQuery("select __f from __sd where __ii=?", new String[]{str});
                if (cursorRawQuery != null) {
                    cursorRawQuery.moveToFirst();
                    j4 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex(C1903d.d.a.f8687g));
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Exception unused2) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                if (sQLiteDatabaseM7069a != null) {
                    sQLiteDatabaseM7069a.endTransaction();
                }
                C1905f.m7068a(f8716d).m7070b();
                return j4;
            } catch (Throwable th) {
                th = th;
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Exception unused3) {
                        C1905f.m7068a(f8716d).m7070b();
                        throw th;
                    }
                }
                if (sQLiteDatabaseM7069a != null) {
                    sQLiteDatabaseM7069a.endTransaction();
                }
                C1905f.m7068a(f8716d).m7070b();
                throw th;
            }
        } catch (Exception unused4) {
            sQLiteDatabaseM7069a = null;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabaseM7069a = null;
        }
        sQLiteDatabaseM7069a.endTransaction();
        C1905f.m7068a(f8716d).m7070b();
        return j4;
    }

    /* renamed from: a */
    private void m7084a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase, String str2) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        Cursor cursor = null;
        strM7107d = null;
        String strM7107d = null;
        try {
            if ("__a".equals(str2)) {
                jSONArrayOptJSONArray = jSONObject.optJSONArray("__a");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                    return;
                }
            } else if (C1903d.d.a.f8683c.equals(str2)) {
                jSONArrayOptJSONArray = jSONObject.optJSONArray(C1903d.d.a.f8683c);
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                    return;
                }
            } else {
                jSONArrayOptJSONArray = null;
            }
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select " + str2 + " from " + C1903d.d.f8680a + " where __ii=?", new String[]{str});
            if (cursorRawQuery != null) {
                while (cursorRawQuery.moveToNext()) {
                    try {
                        strM7107d = m7107d(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(str2)));
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
            if (!TextUtils.isEmpty(strM7107d)) {
                jSONArray = new JSONArray(strM7107d);
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
            String strM7105c = m7105c(jSONArray.toString());
            if (!TextUtils.isEmpty(strM7105c)) {
                sQLiteDatabase.execSQL("update __sd set " + str2 + "=\"" + strM7105c + "\" where __ii=\"" + str + "\"");
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        } catch (Throwable unused3) {
        }
    }

    /* renamed from: b */
    public void m7103b(String str) {
        SQLiteDatabase sQLiteDatabaseM7069a = null;
        try {
            try {
                sQLiteDatabaseM7069a = C1905f.m7068a(f8716d).m7069a();
                sQLiteDatabaseM7069a.beginTransaction();
                if (!TextUtils.isEmpty(str)) {
                    sQLiteDatabaseM7069a.execSQL("delete from __is where __ii=\"" + str + "\"");
                }
                sQLiteDatabaseM7069a.setTransactionSuccessful();
            } finally {
                if (sQLiteDatabaseM7069a != null) {
                    try {
                        sQLiteDatabaseM7069a.endTransaction();
                    } catch (Throwable unused) {
                    }
                }
                C1905f.m7068a(f8716d).m7070b();
            }
        } catch (SQLiteDatabaseCorruptException unused2) {
            C1906g.m7074a(f8716d);
            if (sQLiteDatabaseM7069a != null) {
            }
        } catch (Throwable unused3) {
        }
    }

    /* renamed from: a */
    public JSONObject m7094a(boolean z3) {
        m7095a();
        this.f8722j.clear();
        JSONObject jSONObject = new JSONObject();
        if (!z3) {
            m7082a(jSONObject, z3);
            m7089b(jSONObject, (String) null);
            m7085a(jSONObject, (String) null);
        } else {
            String strM7082a = m7082a(jSONObject, z3);
            if (!TextUtils.isEmpty(strM7082a)) {
                m7089b(jSONObject, strM7082a);
                m7085a(jSONObject, strM7082a);
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:94|3)|(7:97|4|(1:6)(1:7)|8|(7:10|(6:13|(2:17|(2:107|19)(2:114|108))(1:106)|20|(3:105|22|(5:103|27|(1:29)(1:30)|31|112))(3:100|32|(5:104|34|(1:36)(1:37)|38|110)(1:109))|108|11)|99|39|(5:41|(4:44|(3:116|46|119)(1:118)|117|42)|115|47|(1:49))|50|(5:52|(4:55|(3:121|57|124)(1:123)|122|53)|120|58|(1:60)))|61|(1:63))|89|75|93|76|77|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017e A[EXC_TOP_SPLITTER, PHI: r0 r1
      0x017e: PHI (r0v5 android.database.Cursor) = 
      (r0v2 android.database.Cursor)
      (r0v3 android.database.Cursor)
      (r0v8 android.database.Cursor)
      (r0v8 android.database.Cursor)
     binds: [B:68:0x016e, B:74:0x017c, B:62:0x015d, B:63:0x015f] A[DONT_GENERATE, DONT_INLINE]
      0x017e: PHI (r1v6 android.database.sqlite.SQLiteDatabase) = 
      (r1v3 android.database.sqlite.SQLiteDatabase)
      (r1v4 android.database.sqlite.SQLiteDatabase)
      (r1v9 android.database.sqlite.SQLiteDatabase)
      (r1v9 android.database.sqlite.SQLiteDatabase)
     binds: [B:68:0x016e, B:74:0x017c, B:62:0x015d, B:63:0x015f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0181 A[PHI: r0 r1
      0x0181: PHI (r0v4 android.database.Cursor) = (r0v2 android.database.Cursor), (r0v3 android.database.Cursor), (r0v5 android.database.Cursor) binds: [B:68:0x016e, B:74:0x017c, B:75:0x017e] A[DONT_GENERATE, DONT_INLINE]
      0x0181: PHI (r1v5 android.database.sqlite.SQLiteDatabase) = 
      (r1v3 android.database.sqlite.SQLiteDatabase)
      (r1v4 android.database.sqlite.SQLiteDatabase)
      (r1v6 android.database.sqlite.SQLiteDatabase)
     binds: [B:68:0x016e, B:74:0x017c, B:75:0x017e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m7085a(org.json.JSONObject r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C1907h.m7085a(org.json.JSONObject, java.lang.String):void");
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
    private java.lang.String m7082a(org.json.JSONObject r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C1907h.m7082a(org.json.JSONObject, boolean):java.lang.String");
    }

    /* renamed from: a */
    public void m7098a(boolean z3, boolean z4) {
        SQLiteDatabase sQLiteDatabaseM7069a = null;
        try {
            try {
                try {
                    sQLiteDatabaseM7069a = C1905f.m7068a(f8716d).m7069a();
                    sQLiteDatabaseM7069a.beginTransaction();
                    if (!z4) {
                        int size = this.f8724l.size();
                        int i4 = 0;
                        if (size > 0) {
                            int i5 = 0;
                            while (i4 < size) {
                                String str = this.f8724l.get(i4);
                                if (str == null) {
                                    i5 = 1;
                                }
                                sQLiteDatabaseM7069a.execSQL("delete from __is where __ii=\"" + str + "\"");
                                i4++;
                            }
                            i4 = i5;
                        }
                        if (i4 != 0) {
                            sQLiteDatabaseM7069a.execSQL("delete from __is where __ii is null");
                        }
                    } else if (z3) {
                        sQLiteDatabaseM7069a.execSQL("delete from __is");
                    }
                    sQLiteDatabaseM7069a.setTransactionSuccessful();
                } catch (Throwable unused) {
                    C1906g.m7074a(f8716d);
                    if (sQLiteDatabaseM7069a != null) {
                    }
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                C1906g.m7074a(f8716d);
                if (sQLiteDatabaseM7069a != null) {
                }
            }
            try {
                sQLiteDatabaseM7069a.endTransaction();
            } catch (Throwable unused3) {
            }
            C1905f.m7068a(f8716d).m7070b();
        } catch (Throwable th) {
            if (sQLiteDatabaseM7069a != null) {
                try {
                    sQLiteDatabaseM7069a.endTransaction();
                } catch (Throwable unused4) {
                }
            }
            C1905f.m7068a(f8716d).m7070b();
            throw th;
        }
    }

    /* renamed from: a */
    public void m7097a(boolean z3, String str) {
        SQLiteDatabase sQLiteDatabaseM7069a = null;
        try {
            try {
                sQLiteDatabaseM7069a = C1905f.m7068a(f8716d).m7069a();
                sQLiteDatabaseM7069a.beginTransaction();
                if (!TextUtils.isEmpty(str)) {
                    sQLiteDatabaseM7069a.execSQL("delete from __er where __i=\"" + str + "\"");
                    sQLiteDatabaseM7069a.execSQL("delete from __et where __i=\"" + str + "\"");
                    this.f8722j.clear();
                    sQLiteDatabaseM7069a.execSQL("delete from __sd where __ii=\"" + str + "\"");
                }
                sQLiteDatabaseM7069a.setTransactionSuccessful();
            } finally {
                if (sQLiteDatabaseM7069a != null) {
                    try {
                        sQLiteDatabaseM7069a.endTransaction();
                    } catch (Throwable unused) {
                    }
                }
                C1905f.m7068a(f8716d).m7070b();
            }
        } catch (SQLiteDatabaseCorruptException unused2) {
            C1906g.m7074a(f8716d);
            if (sQLiteDatabaseM7069a != null) {
            }
        } catch (Throwable unused3) {
        }
    }
}
