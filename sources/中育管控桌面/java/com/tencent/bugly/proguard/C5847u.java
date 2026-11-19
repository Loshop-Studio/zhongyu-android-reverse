package com.tencent.bugly.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.compose.material3.internal.CalendarModelKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.u */
/* loaded from: classes3.dex */
public final class C5847u {

    /* renamed from: a */
    public static final long f4397a = System.currentTimeMillis();

    /* renamed from: b */
    private static C5847u f4398b;

    /* renamed from: c */
    private Context f4399c;

    /* renamed from: f */
    private SharedPreferences f4402f;

    /* renamed from: e */
    private Map<Integer, Map<String, C5846t>> f4401e = new HashMap();

    /* renamed from: d */
    private String f4400d = C5780aa.m3795b().f3916d;

    private C5847u(Context context) {
        this.f4399c = context;
        this.f4402f = context.getSharedPreferences("crashrecord", 0);
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
    public synchronized <T extends java.util.List<?>> T m4293d(int r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            android.content.Context r3 = r5.f4399c     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
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
            com.tencent.bugly.proguard.C5791al.m3928a(r2, r3)     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L5e
        L42:
            r6.close()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            goto L5e
        L46:
            r6 = r0
        L47:
            java.lang.String r2 = "open record file error"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L33
            com.tencent.bugly.proguard.C5791al.m3928a(r2, r3)     // Catch: java.lang.Throwable -> L33
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
            com.tencent.bugly.proguard.C5791al.m3934e(r6, r1)     // Catch: java.lang.Throwable -> L31
        L5e:
            monitor-exit(r5)
            return r0
        L60:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L31
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C5847u.m4293d(int):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public synchronized boolean m4292c(int i6) {
        try {
            try {
                List<C5846t> listM4293d = m4293d(i6);
                if (listM4293d == null) {
                    return false;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (C5846t c5846t : listM4293d) {
                    String str = c5846t.f4391b;
                    if (str != null && str.equalsIgnoreCase(this.f4400d) && c5846t.f4393d > 0) {
                        arrayList.add(c5846t);
                    }
                    if (c5846t.f4392c + CalendarModelKt.MillisecondsIn24Hours < jCurrentTimeMillis) {
                        arrayList2.add(c5846t);
                    }
                }
                Collections.sort(arrayList);
                if (arrayList.size() < 2) {
                    listM4293d.removeAll(arrayList2);
                    m4285a(i6, (int) listM4293d);
                    return false;
                }
                if (arrayList.size() <= 0 || ((C5846t) arrayList.get(arrayList.size() - 1)).f4392c + CalendarModelKt.MillisecondsIn24Hours >= jCurrentTimeMillis) {
                    return true;
                }
                listM4293d.clear();
                m4285a(i6, (int) listM4293d);
                return false;
            } catch (Exception unused) {
                C5791al.m3934e("isFrequentCrash failed", new Object[0]);
                return false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized boolean m4295b(final int i6) {
        boolean z6;
        z6 = true;
        try {
            z6 = this.f4402f.getBoolean(i6 + "_" + this.f4400d, true);
            C5790ak.m3919a().m3921a(new Runnable() { // from class: com.tencent.bugly.proguard.u.2
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zM4292c = C5847u.this.m4292c(i6);
                    C5847u.this.f4402f.edit().putBoolean(i6 + "_" + C5847u.this.f4400d, !zM4292c).commit();
                }
            });
        } catch (Exception unused) {
            C5791al.m3934e("canInit error", new Object[0]);
            return z6;
        }
        return z6;
    }

    /* renamed from: a */
    public static synchronized C5847u m4282a(Context context) {
        try {
            if (f4398b == null) {
                f4398b = new C5847u(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4398b;
    }

    /* renamed from: a */
    public static synchronized C5847u m4281a() {
        return f4398b;
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m4289b(C5846t c5846t, C5846t c5846t2) {
        String str = c5846t.f4394e;
        if (str != null && !str.equalsIgnoreCase(c5846t2.f4394e)) {
            return true;
        }
        String str2 = c5846t.f4395f;
        return !(str2 == null || str2.equalsIgnoreCase(c5846t2.f4395f)) || c5846t.f4393d <= 0;
    }

    /* renamed from: a */
    public final void m4294a(final int i6) {
        C5790ak.m3919a().m3921a(new Runnable() { // from class: com.tencent.bugly.proguard.u.1

            /* renamed from: a */
            final /* synthetic */ int f4403a = 1004;

            @Override // java.lang.Runnable
            public final void run() {
                C5846t c5846t;
                try {
                    if (TextUtils.isEmpty(C5847u.this.f4400d)) {
                        return;
                    }
                    List<C5846t> listM4293d = C5847u.this.m4293d(this.f4403a);
                    if (listM4293d == null) {
                        listM4293d = new ArrayList();
                    }
                    if (C5847u.this.f4401e.get(Integer.valueOf(this.f4403a)) == null) {
                        C5847u.this.f4401e.put(Integer.valueOf(this.f4403a), new HashMap());
                    }
                    if (((Map) C5847u.this.f4401e.get(Integer.valueOf(this.f4403a))).get(C5847u.this.f4400d) == null) {
                        c5846t = new C5846t();
                        c5846t.f4390a = this.f4403a;
                        c5846t.f4396g = C5847u.f4397a;
                        c5846t.f4391b = C5847u.this.f4400d;
                        c5846t.f4395f = C5780aa.m3795b().f3927o;
                        c5846t.f4394e = C5780aa.m3795b().f3920h;
                        c5846t.f4392c = System.currentTimeMillis();
                        c5846t.f4393d = i6;
                        ((Map) C5847u.this.f4401e.get(Integer.valueOf(this.f4403a))).put(C5847u.this.f4400d, c5846t);
                    } else {
                        c5846t = (C5846t) ((Map) C5847u.this.f4401e.get(Integer.valueOf(this.f4403a))).get(C5847u.this.f4400d);
                        c5846t.f4393d = i6;
                    }
                    ArrayList arrayList = new ArrayList();
                    boolean z6 = false;
                    for (C5846t c5846t2 : listM4293d) {
                        if (C5847u.m4287a(c5846t2, c5846t)) {
                            c5846t2.f4393d = c5846t.f4393d;
                            z6 = true;
                        }
                        if (C5847u.m4289b(c5846t2, c5846t)) {
                            arrayList.add(c5846t2);
                        }
                    }
                    listM4293d.removeAll(arrayList);
                    if (!z6) {
                        listM4293d.add(c5846t);
                    }
                    C5847u.this.m4285a(this.f4403a, (int) listM4293d);
                } catch (Exception unused) {
                    C5791al.m3934e("saveCrashRecord failed", new Object[0]);
                }
            }
        });
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
    public synchronized <T extends java.util.List<?>> void m4285a(int r5, T r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r6 != 0) goto L5
            monitor-exit(r4)
            return
        L5:
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
            android.content.Context r2 = r4.f4399c     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
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
            com.tencent.bugly.proguard.C5791al.m3928a(r5, r6)     // Catch: java.lang.Throwable -> L2c
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
            com.tencent.bugly.proguard.C5791al.m3934e(r5, r6)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r4)
            return
        L59:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C5847u.m4285a(int, java.util.List):void");
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m4287a(C5846t c5846t, C5846t c5846t2) {
        String str;
        return c5846t.f4396g == c5846t2.f4396g && (str = c5846t.f4391b) != null && str.equalsIgnoreCase(c5846t2.f4391b);
    }
}
