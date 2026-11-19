package com.tencent.bugly.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.material3.internal.CalendarModelKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.u */
/* loaded from: classes3.dex */
public final class C4139u {

    /* renamed from: a */
    public static final long f3896a = System.currentTimeMillis();

    /* renamed from: b */
    private static C4139u f3897b;

    /* renamed from: c */
    private Context f3898c;

    /* renamed from: f */
    private SharedPreferences f3901f;

    /* renamed from: e */
    private Map<Integer, Map<String, C4137t>> f3900e = new HashMap();

    /* renamed from: d */
    private String f3899d = C4044aa.m2890b().f3434d;

    private C4139u(Context context) {
        this.f3898c = context;
        this.f3901f = context.getSharedPreferences("crashrecord", 0);
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
    public synchronized <T extends java.util.List<?>> T m3385d(int r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            android.content.Context r3 = r5.f3898c     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
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
            com.tencent.bugly.proguard.C4055al.m3021a(r2, r3)     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L5e
        L42:
            r6.close()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            goto L5e
        L46:
            r6 = r0
        L47:
            java.lang.String r2 = "open record file error"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L33
            com.tencent.bugly.proguard.C4055al.m3021a(r2, r3)     // Catch: java.lang.Throwable -> L33
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
            com.tencent.bugly.proguard.C4055al.m3027e(r6, r1)     // Catch: java.lang.Throwable -> L31
        L5e:
            monitor-exit(r5)
            return r0
        L60:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L31
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C4139u.m3385d(int):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public synchronized boolean m3384c(int i) {
        try {
            try {
                List<C4137t> listM3385d = m3385d(i);
                if (listM3385d == null) {
                    return false;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (C4137t c4137t : listM3385d) {
                    String str = c4137t.f3890b;
                    if (str != null && str.equalsIgnoreCase(this.f3899d) && c4137t.f3892d > 0) {
                        arrayList.add(c4137t);
                    }
                    if (c4137t.f3891c + CalendarModelKt.MillisecondsIn24Hours < jCurrentTimeMillis) {
                        arrayList2.add(c4137t);
                    }
                }
                Collections.sort(arrayList);
                if (arrayList.size() < 2) {
                    listM3385d.removeAll(arrayList2);
                    m3377a(i, (int) listM3385d);
                    return false;
                }
                if (arrayList.size() <= 0 || ((C4137t) arrayList.get(arrayList.size() - 1)).f3891c + CalendarModelKt.MillisecondsIn24Hours >= jCurrentTimeMillis) {
                    return true;
                }
                listM3385d.clear();
                m3377a(i, (int) listM3385d);
                return false;
            } catch (Exception unused) {
                C4055al.m3027e("isFrequentCrash failed", new Object[0]);
                return false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized boolean m3387b(int i) {
        boolean z8;
        z8 = true;
        try {
            z8 = this.f3901f.getBoolean(i + "_" + this.f3899d, true);
            C4054ak.m3012a().m3014a(new RunnableC4115i1(this, i, 1));
        } catch (Exception unused) {
            C4055al.m3027e("canInit error", new Object[0]);
            return z8;
        }
        return z8;
    }

    /* renamed from: a */
    public static synchronized C4139u m3374a(Context context) {
        try {
            if (f3897b == null) {
                f3897b = new C4139u(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3897b;
    }

    /* renamed from: a */
    public static synchronized C4139u m3373a() {
        return f3897b;
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m3381b(C4137t c4137t, C4137t c4137t2) {
        String str = c4137t.f3893e;
        if (str != null && !str.equalsIgnoreCase(c4137t2.f3893e)) {
            return true;
        }
        String str2 = c4137t.f3894f;
        return !(str2 == null || str2.equalsIgnoreCase(c4137t2.f3894f)) || c4137t.f3892d <= 0;
    }

    /* renamed from: a */
    public final void m3386a(int i) {
        C4054ak.m3012a().m3014a(new RunnableC4115i1(this, i, 0));
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
    public synchronized <T extends java.util.List<?>> void m3377a(int r5, T r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r6 != 0) goto L5
            monitor-exit(r4)
            return
        L5:
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
            android.content.Context r2 = r4.f3898c     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
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
            com.tencent.bugly.proguard.C4055al.m3021a(r5, r6)     // Catch: java.lang.Throwable -> L2c
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
            com.tencent.bugly.proguard.C4055al.m3027e(r5, r6)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r4)
            return
        L59:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C4139u.m3377a(int, java.util.List):void");
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m3379a(C4137t c4137t, C4137t c4137t2) {
        String str;
        return c4137t.f3895g == c4137t2.f3895g && (str = c4137t.f3890b) != null && str.equalsIgnoreCase(c4137t2.f3890b);
    }
}
