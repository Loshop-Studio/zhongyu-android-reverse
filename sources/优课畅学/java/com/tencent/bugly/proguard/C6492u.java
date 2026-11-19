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
/* loaded from: classes4.dex */
public final class C6492u {

    /* renamed from: a */
    public static final long f5019a = System.currentTimeMillis();

    /* renamed from: b */
    private static C6492u f5020b;

    /* renamed from: c */
    private Context f5021c;

    /* renamed from: f */
    private SharedPreferences f5024f;

    /* renamed from: e */
    private Map<Integer, Map<String, C6491t>> f5023e = new HashMap();

    /* renamed from: d */
    private String f5022d = C6425aa.m4150b().f4538d;

    private C6492u(Context context) {
        this.f5021c = context;
        this.f5024f = context.getSharedPreferences("crashrecord", 0);
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
    public synchronized <T extends java.util.List<?>> T m4648d(int r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            android.content.Context r3 = r5.f5021c     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
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
            com.tencent.bugly.proguard.C6436al.m4283a(r2, r3)     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L5e
        L42:
            r6.close()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            goto L5e
        L46:
            r6 = r0
        L47:
            java.lang.String r2 = "open record file error"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L33
            com.tencent.bugly.proguard.C6436al.m4283a(r2, r3)     // Catch: java.lang.Throwable -> L33
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
            com.tencent.bugly.proguard.C6436al.m4289e(r6, r1)     // Catch: java.lang.Throwable -> L31
        L5e:
            monitor-exit(r5)
            return r0
        L60:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L31
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C6492u.m4648d(int):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public synchronized boolean m4647c(int i10) {
        try {
            try {
                List<C6491t> listM4648d = m4648d(i10);
                if (listM4648d == null) {
                    return false;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (C6491t c6491t : listM4648d) {
                    String str = c6491t.f5013b;
                    if (str != null && str.equalsIgnoreCase(this.f5022d) && c6491t.f5015d > 0) {
                        arrayList.add(c6491t);
                    }
                    if (c6491t.f5014c + CalendarModelKt.MillisecondsIn24Hours < jCurrentTimeMillis) {
                        arrayList2.add(c6491t);
                    }
                }
                Collections.sort(arrayList);
                if (arrayList.size() < 2) {
                    listM4648d.removeAll(arrayList2);
                    m4640a(i10, (int) listM4648d);
                    return false;
                }
                if (arrayList.size() <= 0 || ((C6491t) arrayList.get(arrayList.size() - 1)).f5014c + CalendarModelKt.MillisecondsIn24Hours >= jCurrentTimeMillis) {
                    return true;
                }
                listM4648d.clear();
                m4640a(i10, (int) listM4648d);
                return false;
            } catch (Exception unused) {
                C6436al.m4289e("isFrequentCrash failed", new Object[0]);
                return false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized boolean m4650b(final int i10) {
        boolean z10;
        z10 = true;
        try {
            z10 = this.f5024f.getBoolean(i10 + "_" + this.f5022d, true);
            C6435ak.m4274a().m4276a(new Runnable() { // from class: com.tencent.bugly.proguard.u.2
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zM4647c = C6492u.this.m4647c(i10);
                    C6492u.this.f5024f.edit().putBoolean(i10 + "_" + C6492u.this.f5022d, !zM4647c).commit();
                }
            });
        } catch (Exception unused) {
            C6436al.m4289e("canInit error", new Object[0]);
            return z10;
        }
        return z10;
    }

    /* renamed from: a */
    public static synchronized C6492u m4637a(Context context) {
        try {
            if (f5020b == null) {
                f5020b = new C6492u(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5020b;
    }

    /* renamed from: a */
    public static synchronized C6492u m4636a() {
        return f5020b;
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m4644b(C6491t c6491t, C6491t c6491t2) {
        String str = c6491t.f5016e;
        if (str != null && !str.equalsIgnoreCase(c6491t2.f5016e)) {
            return true;
        }
        String str2 = c6491t.f5017f;
        return !(str2 == null || str2.equalsIgnoreCase(c6491t2.f5017f)) || c6491t.f5015d <= 0;
    }

    /* renamed from: a */
    public final void m4649a(final int i10) {
        C6435ak.m4274a().m4276a(new Runnable() { // from class: com.tencent.bugly.proguard.u.1

            /* renamed from: a */
            final /* synthetic */ int f5025a = 1004;

            @Override // java.lang.Runnable
            public final void run() {
                C6491t c6491t;
                try {
                    if (TextUtils.isEmpty(C6492u.this.f5022d)) {
                        return;
                    }
                    List<C6491t> listM4648d = C6492u.this.m4648d(this.f5025a);
                    if (listM4648d == null) {
                        listM4648d = new ArrayList();
                    }
                    if (C6492u.this.f5023e.get(Integer.valueOf(this.f5025a)) == null) {
                        C6492u.this.f5023e.put(Integer.valueOf(this.f5025a), new HashMap());
                    }
                    if (((Map) C6492u.this.f5023e.get(Integer.valueOf(this.f5025a))).get(C6492u.this.f5022d) == null) {
                        c6491t = new C6491t();
                        c6491t.f5012a = this.f5025a;
                        c6491t.f5018g = C6492u.f5019a;
                        c6491t.f5013b = C6492u.this.f5022d;
                        c6491t.f5017f = C6425aa.m4150b().f4549o;
                        c6491t.f5016e = C6425aa.m4150b().f4542h;
                        c6491t.f5014c = System.currentTimeMillis();
                        c6491t.f5015d = i10;
                        ((Map) C6492u.this.f5023e.get(Integer.valueOf(this.f5025a))).put(C6492u.this.f5022d, c6491t);
                    } else {
                        c6491t = (C6491t) ((Map) C6492u.this.f5023e.get(Integer.valueOf(this.f5025a))).get(C6492u.this.f5022d);
                        c6491t.f5015d = i10;
                    }
                    ArrayList arrayList = new ArrayList();
                    boolean z10 = false;
                    for (C6491t c6491t2 : listM4648d) {
                        if (C6492u.m4642a(c6491t2, c6491t)) {
                            c6491t2.f5015d = c6491t.f5015d;
                            z10 = true;
                        }
                        if (C6492u.m4644b(c6491t2, c6491t)) {
                            arrayList.add(c6491t2);
                        }
                    }
                    listM4648d.removeAll(arrayList);
                    if (!z10) {
                        listM4648d.add(c6491t);
                    }
                    C6492u.this.m4640a(this.f5025a, (int) listM4648d);
                } catch (Exception unused) {
                    C6436al.m4289e("saveCrashRecord failed", new Object[0]);
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
    public synchronized <T extends java.util.List<?>> void m4640a(int r5, T r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r6 != 0) goto L5
            monitor-exit(r4)
            return
        L5:
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
            android.content.Context r2 = r4.f5021c     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
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
            com.tencent.bugly.proguard.C6436al.m4283a(r5, r6)     // Catch: java.lang.Throwable -> L2c
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
            com.tencent.bugly.proguard.C6436al.m4289e(r5, r6)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r4)
            return
        L59:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C6492u.m4640a(int, java.util.List):void");
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m4642a(C6491t c6491t, C6491t c6491t2) {
        String str;
        return c6491t.f5018g == c6491t2.f5018g && (str = c6491t.f5013b) != null && str.equalsIgnoreCase(c6491t2.f5013b);
    }
}
