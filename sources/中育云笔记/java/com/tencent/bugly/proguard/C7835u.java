package com.tencent.bugly.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.u */
/* loaded from: classes5.dex */
public final class C7835u {

    /* renamed from: a */
    public static final long f14118a = System.currentTimeMillis();

    /* renamed from: b */
    private static C7835u f14119b;

    /* renamed from: c */
    private Context f14120c;

    /* renamed from: f */
    private SharedPreferences f14123f;

    /* renamed from: e */
    private Map<Integer, Map<String, C7834t>> f14122e = new HashMap();

    /* renamed from: d */
    private String f14121d = C7768aa.m10480b().f13637d;

    /* renamed from: com.tencent.bugly.proguard.u$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ int f14124c = 1004;

        /* renamed from: d */
        public final /* synthetic */ int f14125d;

        public a(int i10) {
            this.f14125d = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7834t c7834t;
            try {
                if (TextUtils.isEmpty(C7835u.this.f14121d)) {
                    return;
                }
                List<C7834t> listM10978d = C7835u.this.m10978d(this.f14124c);
                if (listM10978d == null) {
                    listM10978d = new ArrayList();
                }
                if (C7835u.this.f14122e.get(Integer.valueOf(this.f14124c)) == null) {
                    C7835u.this.f14122e.put(Integer.valueOf(this.f14124c), new HashMap());
                }
                if (((Map) C7835u.this.f14122e.get(Integer.valueOf(this.f14124c))).get(C7835u.this.f14121d) == null) {
                    c7834t = new C7834t();
                    c7834t.f14111a = this.f14124c;
                    c7834t.f14117g = C7835u.f14118a;
                    c7834t.f14112b = C7835u.this.f14121d;
                    c7834t.f14116f = C7768aa.m10480b().f13648o;
                    c7834t.f14115e = C7768aa.m10480b().f13641h;
                    c7834t.f14113c = System.currentTimeMillis();
                    c7834t.f14114d = this.f14125d;
                    ((Map) C7835u.this.f14122e.get(Integer.valueOf(this.f14124c))).put(C7835u.this.f14121d, c7834t);
                } else {
                    c7834t = (C7834t) ((Map) C7835u.this.f14122e.get(Integer.valueOf(this.f14124c))).get(C7835u.this.f14121d);
                    c7834t.f14114d = this.f14125d;
                }
                ArrayList arrayList = new ArrayList();
                boolean z10 = false;
                for (C7834t c7834t2 : listM10978d) {
                    if (C7835u.m10972a(c7834t2, c7834t)) {
                        c7834t2.f14114d = c7834t.f14114d;
                        z10 = true;
                    }
                    if (C7835u.m10974b(c7834t2, c7834t)) {
                        arrayList.add(c7834t2);
                    }
                }
                listM10978d.removeAll(arrayList);
                if (!z10) {
                    listM10978d.add(c7834t);
                }
                C7835u.this.m10970a(this.f14124c, (int) listM10978d);
            } catch (Exception unused) {
                C7779al.m10619e("saveCrashRecord failed", new Object[0]);
            }
        }
    }

    /* renamed from: com.tencent.bugly.proguard.u$b */
    public class b implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ int f14127c;

        public b(int i10) {
            this.f14127c = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zM10977c = C7835u.this.m10977c(this.f14127c);
            C7835u.this.f14123f.edit().putBoolean(this.f14127c + BundleUtil.UNDERLINE_TAG + C7835u.this.f14121d, !zM10977c).commit();
        }
    }

    private C7835u(Context context) {
        this.f14120c = context;
        this.f14123f = context.getSharedPreferences("crashrecord", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042 A[Catch: all -> 0x0031, Exception -> 0x0057, PHI: r6
      0x0042: PHI (r6v10 java.io.ObjectInputStream) = (r6v9 java.io.ObjectInputStream), (r6v11 java.io.ObjectInputStream) binds: [B:21:0x0040, B:26:0x004e] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0057, blocks: (B:4:0x0003, B:10:0x002c, B:29:0x0053, B:30:0x0056, B:22:0x0042), top: B:38:0x0003, outer: #0 }] */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized <T extends java.util.List<?>> T m10978d(int r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            android.content.Context r3 = r5.f14120c     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            java.lang.String r4 = "crashrecord"
            java.io.File r3 = r3.getDir(r4, r1)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            r2.<init>(r3, r6)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            boolean r6 = r2.exists()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            if (r6 != 0) goto L1c
            monitor-exit(r5)
            return r0
        L1c:
            java.io.ObjectInputStream r6 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L35 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L46
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L35 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L46
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L35 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L46
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L35 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L46
            java.lang.Object r2 = r6.readObject()     // Catch: java.lang.Throwable -> L33 java.lang.ClassNotFoundException -> L39 java.io.IOException -> L47
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L33 java.lang.ClassNotFoundException -> L39 java.io.IOException -> L47
            r6.close()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            monitor-exit(r5)
            return r2
        L31:
            r6 = move-exception
            goto L60
        L33:
            r2 = move-exception
            goto L51
        L35:
            r2 = move-exception
            r6 = r0
            goto L51
        L38:
            r6 = r0
        L39:
            java.lang.String r2 = "get object error"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L33
            com.tencent.bugly.proguard.C7779al.m10613a(r2, r3)     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L5e
        L42:
            r6.close()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            goto L5e
        L46:
            r6 = r0
        L47:
            java.lang.String r2 = "open record file error"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L33
            com.tencent.bugly.proguard.C7779al.m10613a(r2, r3)     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L5e
            goto L42
        L51:
            if (r6 == 0) goto L56
            r6.close()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
        L56:
            throw r2     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
        L57:
            java.lang.String r6 = "readCrashRecord error"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L31
            com.tencent.bugly.proguard.C7779al.m10619e(r6, r1)     // Catch: java.lang.Throwable -> L31
        L5e:
            monitor-exit(r5)
            return r0
        L60:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L31
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C7835u.m10978d(int):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public synchronized boolean m10977c(int i10) {
        try {
            try {
                List<C7834t> listM10978d = m10978d(i10);
                if (listM10978d == null) {
                    return false;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (C7834t c7834t : listM10978d) {
                    String str = c7834t.f14112b;
                    if (str != null && str.equalsIgnoreCase(this.f14121d) && c7834t.f14114d > 0) {
                        arrayList.add(c7834t);
                    }
                    if (c7834t.f14113c + 86400000 < jCurrentTimeMillis) {
                        arrayList2.add(c7834t);
                    }
                }
                Collections.sort(arrayList);
                if (arrayList.size() < 2) {
                    listM10978d.removeAll(arrayList2);
                    m10970a(i10, (int) listM10978d);
                    return false;
                }
                if (arrayList.size() <= 0 || ((C7834t) arrayList.get(arrayList.size() - 1)).f14113c + 86400000 >= jCurrentTimeMillis) {
                    return true;
                }
                listM10978d.clear();
                m10970a(i10, (int) listM10978d);
                return false;
            } catch (Exception unused) {
                C7779al.m10619e("isFrequentCrash failed", new Object[0]);
                return false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized boolean m10980b(int i10) {
        boolean z10;
        z10 = true;
        try {
            z10 = this.f14123f.getBoolean(i10 + BundleUtil.UNDERLINE_TAG + this.f14121d, true);
            C7778ak.m10604a().m10606a(new b(i10));
        } catch (Exception unused) {
            C7779al.m10619e("canInit error", new Object[0]);
            return z10;
        }
        return z10;
    }

    /* renamed from: a */
    public static synchronized C7835u m10967a(Context context) {
        try {
            if (f14119b == null) {
                f14119b = new C7835u(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14119b;
    }

    /* renamed from: a */
    public static synchronized C7835u m10966a() {
        return f14119b;
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m10974b(C7834t c7834t, C7834t c7834t2) {
        String str = c7834t.f14115e;
        if (str != null && !str.equalsIgnoreCase(c7834t2.f14115e)) {
            return true;
        }
        String str2 = c7834t.f14116f;
        return !(str2 == null || str2.equalsIgnoreCase(c7834t2.f14116f)) || c7834t.f14114d <= 0;
    }

    /* renamed from: a */
    public final void m10979a(int i10) {
        C7778ak.m10604a().m10606a(new a(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c A[Catch: all -> 0x002a, Exception -> 0x0050, TRY_ENTER, TryCatch #1 {Exception -> 0x0050, blocks: (B:7:0x0006, B:11:0x0025, B:32:0x004c, B:33:0x004f, B:26:0x0043), top: B:39:0x0006, outer: #3 }] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized <T extends java.util.List<?>> void m10970a(int r5, T r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r6 != 0) goto L5
            monitor-exit(r4)
            return
        L5:
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
            android.content.Context r2 = r4.f14120c     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
            java.lang.String r3 = "crashrecord"
            java.io.File r2 = r2.getDir(r3, r0)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
            r5 = 0
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L34
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L34
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L34
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L34
            r2.writeObject(r6)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
            r2.close()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
            monitor-exit(r4)
            return
        L2a:
            r5 = move-exception
            goto L59
        L2c:
            r5 = move-exception
            goto L4a
        L2e:
            r5 = move-exception
            goto L37
        L30:
            r6 = move-exception
            r2 = r5
            r5 = r6
            goto L4a
        L34:
            r6 = move-exception
            r2 = r5
            r5 = r6
        L37:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = "open record file error"
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L2c
            com.tencent.bugly.proguard.C7779al.m10613a(r5, r6)     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L48
            r2.close()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
            monitor-exit(r4)
            return
        L48:
            monitor-exit(r4)
            return
        L4a:
            if (r2 == 0) goto L4f
            r2.close()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
        L4f:
            throw r5     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
        L50:
            java.lang.String r5 = "writeCrashRecord error"
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L2a
            com.tencent.bugly.proguard.C7779al.m10619e(r5, r6)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r4)
            return
        L59:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C7835u.m10970a(int, java.util.List):void");
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m10972a(C7834t c7834t, C7834t c7834t2) {
        String str;
        return c7834t.f14117g == c7834t2.f14117g && (str = c7834t.f14112b) != null && str.equalsIgnoreCase(c7834t2.f14112b);
    }
}
