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
public final class C6730u {

    /* renamed from: a */
    public static final long f6253a = System.currentTimeMillis();

    /* renamed from: b */
    private static C6730u f6254b;

    /* renamed from: c */
    private Context f6255c;

    /* renamed from: f */
    private SharedPreferences f6258f;

    /* renamed from: e */
    private Map<Integer, Map<String, C6729t>> f6257e = new HashMap();

    /* renamed from: d */
    private String f6256d = C6663aa.m4969b().f5772d;

    private C6730u(Context context) {
        this.f6255c = context;
        this.f6258f = context.getSharedPreferences("crashrecord", 0);
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
    public synchronized <T extends java.util.List<?>> T m5467d(int r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            android.content.Context r3 = r5.f6255c     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
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
            com.tencent.bugly.proguard.C6674al.m5102a(r2, r3)     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L5e
        L42:
            r6.close()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L57
            goto L5e
        L46:
            r6 = r0
        L47:
            java.lang.String r2 = "open record file error"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L33
            com.tencent.bugly.proguard.C6674al.m5102a(r2, r3)     // Catch: java.lang.Throwable -> L33
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
            com.tencent.bugly.proguard.C6674al.m5108e(r6, r1)     // Catch: java.lang.Throwable -> L31
        L5e:
            monitor-exit(r5)
            return r0
        L60:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L31
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C6730u.m5467d(int):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public synchronized boolean m5466c(int i9) {
        try {
            try {
                List<C6729t> listM5467d = m5467d(i9);
                if (listM5467d == null) {
                    return false;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (C6729t c6729t : listM5467d) {
                    String str = c6729t.f6247b;
                    if (str != null && str.equalsIgnoreCase(this.f6256d) && c6729t.f6249d > 0) {
                        arrayList.add(c6729t);
                    }
                    if (c6729t.f6248c + CalendarModelKt.MillisecondsIn24Hours < jCurrentTimeMillis) {
                        arrayList2.add(c6729t);
                    }
                }
                Collections.sort(arrayList);
                if (arrayList.size() < 2) {
                    listM5467d.removeAll(arrayList2);
                    m5459a(i9, (int) listM5467d);
                    return false;
                }
                if (arrayList.size() <= 0 || ((C6729t) arrayList.get(arrayList.size() - 1)).f6248c + CalendarModelKt.MillisecondsIn24Hours >= jCurrentTimeMillis) {
                    return true;
                }
                listM5467d.clear();
                m5459a(i9, (int) listM5467d);
                return false;
            } catch (Exception unused) {
                C6674al.m5108e("isFrequentCrash failed", new Object[0]);
                return false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized boolean m5469b(final int i9) {
        boolean z9;
        z9 = true;
        try {
            z9 = this.f6258f.getBoolean(i9 + "_" + this.f6256d, true);
            C6673ak.m5093a().m5095a(new Runnable() { // from class: com.tencent.bugly.proguard.u.2
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zM5466c = C6730u.this.m5466c(i9);
                    C6730u.this.f6258f.edit().putBoolean(i9 + "_" + C6730u.this.f6256d, !zM5466c).commit();
                }
            });
        } catch (Exception unused) {
            C6674al.m5108e("canInit error", new Object[0]);
            return z9;
        }
        return z9;
    }

    /* renamed from: a */
    public static synchronized C6730u m5456a(Context context) {
        try {
            if (f6254b == null) {
                f6254b = new C6730u(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6254b;
    }

    /* renamed from: a */
    public static synchronized C6730u m5455a() {
        return f6254b;
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m5463b(C6729t c6729t, C6729t c6729t2) {
        String str = c6729t.f6250e;
        if (str != null && !str.equalsIgnoreCase(c6729t2.f6250e)) {
            return true;
        }
        String str2 = c6729t.f6251f;
        return !(str2 == null || str2.equalsIgnoreCase(c6729t2.f6251f)) || c6729t.f6249d <= 0;
    }

    /* renamed from: a */
    public final void m5468a(final int i9) {
        C6673ak.m5093a().m5095a(new Runnable() { // from class: com.tencent.bugly.proguard.u.1

            /* renamed from: a */
            final /* synthetic */ int f6259a = 1004;

            @Override // java.lang.Runnable
            public final void run() {
                C6729t c6729t;
                try {
                    if (TextUtils.isEmpty(C6730u.this.f6256d)) {
                        return;
                    }
                    List<C6729t> listM5467d = C6730u.this.m5467d(this.f6259a);
                    if (listM5467d == null) {
                        listM5467d = new ArrayList();
                    }
                    if (C6730u.this.f6257e.get(Integer.valueOf(this.f6259a)) == null) {
                        C6730u.this.f6257e.put(Integer.valueOf(this.f6259a), new HashMap());
                    }
                    if (((Map) C6730u.this.f6257e.get(Integer.valueOf(this.f6259a))).get(C6730u.this.f6256d) == null) {
                        c6729t = new C6729t();
                        c6729t.f6246a = this.f6259a;
                        c6729t.f6252g = C6730u.f6253a;
                        c6729t.f6247b = C6730u.this.f6256d;
                        c6729t.f6251f = C6663aa.m4969b().f5783o;
                        c6729t.f6250e = C6663aa.m4969b().f5776h;
                        c6729t.f6248c = System.currentTimeMillis();
                        c6729t.f6249d = i9;
                        ((Map) C6730u.this.f6257e.get(Integer.valueOf(this.f6259a))).put(C6730u.this.f6256d, c6729t);
                    } else {
                        c6729t = (C6729t) ((Map) C6730u.this.f6257e.get(Integer.valueOf(this.f6259a))).get(C6730u.this.f6256d);
                        c6729t.f6249d = i9;
                    }
                    ArrayList arrayList = new ArrayList();
                    boolean z9 = false;
                    for (C6729t c6729t2 : listM5467d) {
                        if (C6730u.m5461a(c6729t2, c6729t)) {
                            c6729t2.f6249d = c6729t.f6249d;
                            z9 = true;
                        }
                        if (C6730u.m5463b(c6729t2, c6729t)) {
                            arrayList.add(c6729t2);
                        }
                    }
                    listM5467d.removeAll(arrayList);
                    if (!z9) {
                        listM5467d.add(c6729t);
                    }
                    C6730u.this.m5459a(this.f6259a, (int) listM5467d);
                } catch (Exception unused) {
                    C6674al.m5108e("saveCrashRecord failed", new Object[0]);
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
    public synchronized <T extends java.util.List<?>> void m5459a(int r5, T r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r6 != 0) goto L5
            monitor-exit(r4)
            return
        L5:
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
            android.content.Context r2 = r4.f6255c     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L50
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
            com.tencent.bugly.proguard.C6674al.m5102a(r5, r6)     // Catch: java.lang.Throwable -> L2c
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
            com.tencent.bugly.proguard.C6674al.m5108e(r5, r6)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r4)
            return
        L59:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C6730u.m5459a(int, java.util.List):void");
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m5461a(C6729t c6729t, C6729t c6729t2) {
        String str;
        return c6729t.f6252g == c6729t2.f6252g && (str = c6729t.f6247b) != null && str.equalsIgnoreCase(c6729t2.f6247b);
    }
}
