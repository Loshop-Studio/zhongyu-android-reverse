package com.p040uc.crashsdk;

import android.content.pm.PackageInfo;
import android.util.Log;
import android.util.SparseArray;
import androidx.compose.runtime.ComposerKt;
import com.p040uc.crashsdk.export.LogType;
import com.p040uc.crashsdk.p041a.C3299a;
import com.p040uc.crashsdk.p041a.C3300b;
import com.p040uc.crashsdk.p041a.C3304f;
import com.p040uc.crashsdk.p041a.C3305g;
import com.p040uc.crashsdk.p041a.RunnableC3303e;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.uc.crashsdk.a */
/* loaded from: classes2.dex */
public class C3298a {

    /* renamed from: a */
    public static String f1309a = "";

    /* renamed from: b */
    public static String f1310b = "";

    /* renamed from: d */
    static final /* synthetic */ boolean f1312d = true;

    /* renamed from: e */
    private static final Map<String, String> f1313e = new HashMap();

    /* renamed from: f */
    private static final List<String> f1314f = new ArrayList();

    /* renamed from: g */
    private static String f1315g = "";

    /* renamed from: h */
    private static String f1316h = null;

    /* renamed from: i */
    private static int f1317i = -1;

    /* renamed from: j */
    private static long f1318j = 0;

    /* renamed from: k */
    private static final HashMap<String, Object[]> f1319k = new HashMap<>();

    /* renamed from: l */
    private static final List<String> f1320l = new ArrayList();

    /* renamed from: m */
    private static int f1321m = 0;

    /* renamed from: n */
    private static int f1322n = 0;

    /* renamed from: o */
    private static int f1323o = 0;

    /* renamed from: p */
    private static int f1324p = 0;

    /* renamed from: q */
    private static final HashMap<String, Object[]> f1325q = new HashMap<>();

    /* renamed from: r */
    private static final List<String> f1326r = new ArrayList();

    /* renamed from: s */
    private static int f1327s = 0;

    /* renamed from: t */
    private static int f1328t = 0;

    /* renamed from: u */
    private static int f1329u = 0;

    /* renamed from: v */
    private static int f1330v = 0;

    /* renamed from: w */
    private static int f1331w = 0;

    /* renamed from: x */
    private static int f1332x = 0;

    /* renamed from: y */
    private static final SparseArray<Object[]> f1333y = new SparseArray<>();

    /* renamed from: z */
    private static final List<Integer> f1334z = new ArrayList();

    /* renamed from: A */
    private static final HashMap<String, Object[]> f1300A = new HashMap<>();

    /* renamed from: B */
    private static final List<String> f1301B = new ArrayList();

    /* renamed from: C */
    private static int f1302C = 0;

    /* renamed from: D */
    private static int f1303D = 0;

    /* renamed from: E */
    private static int f1304E = 0;

    /* renamed from: c */
    static boolean f1311c = false;

    /* renamed from: F */
    private static Runnable f1305F = new RunnableC3303e(201);

    /* renamed from: G */
    private static boolean f1306G = false;

    /* renamed from: H */
    private static boolean f1307H = false;

    /* renamed from: I */
    private static boolean f1308I = false;

    /* renamed from: a */
    public static String m2286a() {
        String str = f1316h;
        return str != null ? str : m2316o() ? f1316h : "";
    }

    /* renamed from: b */
    public static long m2299b() {
        return f1318j;
    }

    /* renamed from: c */
    public static int m2303c() {
        if (f1317i == -1) {
            m2316o();
        }
        return f1317i;
    }

    /* renamed from: d */
    public static void m2305d() {
        StringBuilder sb = new StringBuilder();
        synchronized (f1313e) {
            for (String str : f1314f) {
                String str2 = f1313e.get(str);
                sb.append(str);
                sb.append(": ");
                if (str2 != null) {
                    sb.append(str2);
                }
                sb.append("\n");
            }
        }
        sb.append(String.format(Locale.US, "(saved at %s)\n", C3310e.m2635m()));
        C3300b.m2327a(C3307b.m2491e(), sb.toString());
    }

    /* renamed from: e */
    public static void m2306e() {
        if (!f1312d && !C3307b.f1428d) {
            throw new AssertionError();
        }
        synchronized (f1313e) {
            for (String str : f1314f) {
                JNIBridge.nativeAddHeaderInfo(str, f1313e.get(str));
            }
        }
    }

    /* renamed from: f */
    public static byte[] m2307f() {
        return new byte[]{24, 99, 121, 60};
    }

    /* renamed from: g */
    public static void m2308g() {
        if (!f1312d && !C3307b.f1428d) {
            throw new AssertionError();
        }
        synchronized (f1319k) {
            for (String str : f1320l) {
                Object[] objArr = f1319k.get(str);
                int iIntValue = ((Integer) objArr[0]).intValue();
                if ((1048833 & iIntValue) != 0) {
                    JNIBridge.nativeAddDumpFile(str, (String) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue(), iIntValue, ((Boolean) objArr[4]).booleanValue());
                }
            }
        }
    }

    /* renamed from: h */
    public static String m2309h() {
        StringBuilder sb = new StringBuilder();
        synchronized (f1319k) {
            boolean z3 = true;
            for (String str : f1320l) {
                if (LogType.isForJava(((Integer) f1319k.get(str)[0]).intValue())) {
                    if (!z3) {
                        sb.append("`");
                    }
                    sb.append(str);
                    z3 = false;
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: i */
    public static void m2310i() {
        if (!f1312d && !C3307b.f1428d) {
            throw new AssertionError();
        }
        synchronized (f1325q) {
            for (String str : f1326r) {
                Object[] objArr = f1325q.get(str);
                int iIntValue = ((Integer) objArr[0]).intValue();
                if ((1048833 & iIntValue) != 0) {
                    JNIBridge.nativeAddCallbackInfo(str, iIntValue, ((Long) objArr[2]).longValue(), ((Integer) objArr[3]).intValue());
                }
            }
        }
    }

    /* renamed from: j */
    public static String m2311j() {
        String string;
        synchronized (f1325q) {
            StringBuilder sb = new StringBuilder();
            List<String> list = f1326r;
            synchronized (list) {
                boolean z3 = true;
                for (String str : list) {
                    if (LogType.isForJava(((Integer) f1325q.get(str)[0]).intValue())) {
                        if (!z3) {
                            sb.append("`");
                        }
                        sb.append(str);
                        z3 = false;
                    }
                }
            }
            string = sb.toString();
        }
        return string;
    }

    /* renamed from: k */
    public static void m2312k() {
        if (!f1312d && !C3307b.f1428d) {
            throw new AssertionError();
        }
        synchronized (f1300A) {
            for (String str : f1301B) {
                Object[] objArr = f1300A.get(str);
                int iIntValue = ((Integer) objArr[0]).intValue();
                int iIntValue2 = ((Integer) objArr[1]).intValue();
                List list = (List) objArr[2];
                if ((1048577 & iIntValue2) != 0 && JNIBridge.nativeCreateCachedInfo(str, iIntValue, iIntValue2) != 0) {
                    Iterator it = list.iterator();
                    while (it.hasNext() && JNIBridge.nativeAddCachedInfo(str, (String) it.next())) {
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public static String m2313l() {
        StringBuilder sb = new StringBuilder();
        synchronized (f1300A) {
            boolean z3 = true;
            for (String str : f1301B) {
                if (LogType.isForJava(((Integer) f1300A.get(str)[1]).intValue())) {
                    if (!z3) {
                        sb.append("`");
                    }
                    sb.append(str);
                    z3 = false;
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: m */
    public static String m2314m() throws Throwable {
        if (!f1306G) {
            String strM2325a = C3300b.m2325a(C3307b.m2496j());
            f1315g = strM2325a;
            f1306G = true;
            if (strM2325a == null) {
                f1315g = "";
            }
        }
        return f1315g;
    }

    /* renamed from: n */
    public static void m2315n() {
        m2317p();
        if (!f1307H) {
            f1307H = true;
            C3304f.m2356a(0, new RunnableC3303e(ComposerKt.compositionLocalMapKey));
        } else if (C3307b.f1428d) {
            JNIBridge.set(128, f1315g);
        }
    }

    /* renamed from: o */
    private static boolean m2316o() {
        try {
            PackageInfo packageInfo = C3305g.m2361a().getPackageManager().getPackageInfo(f1309a, 0);
            f1316h = packageInfo.versionName;
            f1318j = packageInfo.lastUpdateTime;
            f1317i = packageInfo.versionCode;
            return true;
        } catch (Throwable th) {
            C3305g.m2379b(th);
            return false;
        }
    }

    /* renamed from: p */
    private static void m2317p() {
        if (!f1308I && C3310e.m2574a()) {
            if (C3307b.f1428d || !C3307b.f1431g) {
                String str = String.format(Locale.US, "%s/%s/%s", C3312g.m2710R(), C3312g.m2711S(), C3312g.m2712T());
                C3299a.m2322b("crashsdk", "UUID: " + C3310e.m2641p());
                C3299a.m2322b("crashsdk", "Version: " + str);
                C3299a.m2322b("crashsdk", "Process Name: " + C3310e.m2624h());
                f1308I = true;
            }
        }
    }

    /* renamed from: b */
    private static StringBuilder m2301b(String str, boolean z3) {
        String strM2516a;
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr = f1325q.get(str);
            try {
                if (objArr == null) {
                    strM2516a = "Unknown callback: " + str;
                } else {
                    Callable callable = (Callable) objArr[1];
                    strM2516a = callable != null ? (String) callable.call() : C3309d.m2516a(str, z3);
                }
                if (strM2516a != null) {
                    sb.append(strM2516a);
                }
            } catch (Throwable th) {
                sb.append("[DEBUG] Callback occurred new exception:\n");
                sb.append(Log.getStackTraceString(th));
            }
        } catch (Throwable th2) {
            C3305g.m2370a(th2);
        }
        try {
            if (sb.length() == 0) {
                sb.append("(data is null)\n");
            }
        } catch (Throwable th3) {
            C3305g.m2370a(th3);
        }
        return sb;
    }

    /* renamed from: a */
    public static void m2294a(String str, String str2) {
        Map<String, String> map = f1313e;
        synchronized (map) {
            if (!map.containsKey(str)) {
                f1314f.add(str);
            }
            map.put(str, str2);
            if (C3307b.f1428d) {
                JNIBridge.nativeAddHeaderInfo(str, str2);
            }
            C3310e.m2652x();
        }
    }

    /* renamed from: c */
    public static ArrayList<String> m2304c(String str) {
        if (C3305g.m2375a(str)) {
            return null;
        }
        String[] strArrSplit = str.split(";", 20);
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : strArrSplit) {
            if (!C3305g.m2375a(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m2290a(OutputStream outputStream, String str) {
        synchronized (f1313e) {
            for (String str2 : f1314f) {
                try {
                    StringBuilder sb = new StringBuilder(11);
                    sb.append(str2);
                    sb.append(": ");
                    String str3 = f1313e.get(str2);
                    if (str3 != null) {
                        sb.append(str3);
                    }
                    sb.append("\n");
                    outputStream.write(sb.toString().getBytes(str));
                } catch (Throwable th) {
                    C3310e.m2571a(th, outputStream);
                }
            }
        }
    }

    /* renamed from: b */
    public static int m2298b(String str, String str2) {
        int iAddType;
        if (str == null || str2 == null) {
            return 0;
        }
        if (str2.length() > 2048) {
            str2 = str2.substring(0, 2048);
        }
        HashMap<String, Object[]> map = f1300A;
        synchronized (map) {
            Object[] objArr = map.get(str);
            if (objArr != null) {
                int iIntValue = ((Integer) objArr[0]).intValue();
                int iIntValue2 = ((Integer) objArr[1]).intValue();
                List list = (List) objArr[2];
                if (list.size() >= iIntValue) {
                    list.remove(0);
                }
                list.add(str2);
                iAddType = LogType.isForJava(iIntValue2) ? LogType.addType(0, 16) : 0;
                if (!C3307b.f1428d) {
                    if (LogType.isForNative(iIntValue2)) {
                        iAddType = LogType.addType(iAddType, 1);
                    }
                    if (LogType.isForANR(iIntValue2)) {
                        iAddType = LogType.addType(iAddType, 1048576);
                    }
                }
                iAddType = iAddType;
                iAddType = iIntValue2;
            } else {
                iAddType = 0;
            }
            if (C3307b.f1428d && JNIBridge.nativeAddCachedInfo(str, str2)) {
                if (LogType.isForNative(iAddType)) {
                    iAddType = LogType.addType(iAddType, 1);
                }
                if (LogType.isForANR(iAddType)) {
                    iAddType = LogType.addType(iAddType, 1048576);
                }
            }
        }
        return iAddType;
    }

    /* renamed from: a */
    public static int m2285a(String str, String str2, boolean z3, boolean z4, int i4, boolean z5) {
        int iRemoveType;
        int iIntValue;
        boolean z6;
        if (str == null || str2 == null) {
            return 0;
        }
        if (str.length() > 256) {
            C3299a.m2320a("crashsdk", "addDumpFile: description is too long!", null);
            return 0;
        }
        HashMap<String, Object[]> map = f1319k;
        synchronized (map) {
            if (map.containsKey(str)) {
                iIntValue = ((Integer) map.get(str)[0]).intValue();
                iRemoveType = LogType.addType(iIntValue, i4);
            } else {
                iRemoveType = i4;
                iIntValue = 0;
            }
            if (LogType.isForJava(iRemoveType) && !LogType.isForJava(iIntValue)) {
                int i5 = f1321m;
                if (i5 >= 10) {
                    iRemoveType = LogType.removeType(iRemoveType, 16);
                } else {
                    f1321m = i5 + 1;
                }
            }
            if (LogType.isForNative(iRemoveType) && !LogType.isForNative(iIntValue)) {
                int i6 = f1322n;
                if (i6 >= 10) {
                    iRemoveType = LogType.removeType(iRemoveType, 1);
                } else {
                    f1322n = i6 + 1;
                }
            }
            if (LogType.isForUnexp(iRemoveType) && !LogType.isForUnexp(iIntValue)) {
                int i7 = f1323o;
                if (i7 >= 10) {
                    iRemoveType = LogType.removeType(iRemoveType, 256);
                } else {
                    f1323o = i7 + 1;
                }
            }
            if (LogType.isForANR(iRemoveType) && !LogType.isForANR(iIntValue)) {
                int i8 = f1324p;
                if (i8 >= 10) {
                    iRemoveType = LogType.removeType(iRemoveType, 1048576);
                } else {
                    f1324p = i8 + 1;
                }
            }
            if ((1048849 & iRemoveType) == 0) {
                z6 = false;
            } else {
                if (iIntValue == 0) {
                    f1320l.add(str);
                }
                z6 = true;
            }
            if (!z6) {
                return iRemoveType;
            }
            if (C3307b.f1428d && (1048833 & i4) != 0) {
                int iNativeAddDumpFile = JNIBridge.nativeAddDumpFile(str, str2, z3, z4, i4, z5);
                if (!LogType.isForNative(iNativeAddDumpFile)) {
                    iRemoveType = LogType.removeType(iRemoveType, 1);
                }
                if (!LogType.isForUnexp(iNativeAddDumpFile)) {
                    iRemoveType = LogType.removeType(iRemoveType, 256);
                }
                if (!LogType.isForANR(iNativeAddDumpFile)) {
                    iRemoveType = LogType.removeType(iRemoveType, 1048576);
                }
            }
            map.put(str, new Object[]{Integer.valueOf(iRemoveType), str2, Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5)});
            return iRemoveType;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m2302b(java.io.OutputStream r11, java.lang.String r12, java.lang.String r13, java.util.ArrayList<java.lang.String> r14) {
        /*
            java.util.HashMap<java.lang.String, java.lang.Object[]> r0 = com.p040uc.crashsdk.C3298a.f1300A
            monitor-enter(r0)
            java.util.List<java.lang.String> r1 = com.p040uc.crashsdk.C3298a.f1301B     // Catch: java.lang.Throwable -> Ld1
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Ld1
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r2 == 0) goto La9
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Ld1
            java.util.HashMap<java.lang.String, java.lang.Object[]> r3 = com.p040uc.crashsdk.C3298a.f1300A     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object[] r3 = (java.lang.Object[]) r3     // Catch: java.lang.Throwable -> Ld1
            r4 = 0
            r5 = r3[r4]     // Catch: java.lang.Throwable -> Ld1
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> Ld1
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> Ld1
            r6 = 1
            r7 = r3[r6]     // Catch: java.lang.Throwable -> Ld1
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> Ld1
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> Ld1
            r8 = 2
            r3 = r3[r8]     // Catch: java.lang.Throwable -> Ld1
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> Ld1
            if (r14 != 0) goto L3d
            boolean r7 = com.p040uc.crashsdk.export.LogType.isForJava(r7)     // Catch: java.lang.Throwable -> Ld1
            if (r7 != 0) goto L43
            goto L9
        L3d:
            boolean r7 = m2296a(r14, r2)     // Catch: java.lang.Throwable -> Ld1
            if (r7 == 0) goto L9
        L43:
            java.util.Locale r7 = java.util.Locale.US     // Catch: java.lang.Throwable -> L68
            java.lang.String r9 = "%s (%d/%d)\n"
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L68
            r10[r4] = r2     // Catch: java.lang.Throwable -> L68
            int r2 = r3.size()     // Catch: java.lang.Throwable -> L68
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L68
            r10[r6] = r2     // Catch: java.lang.Throwable -> L68
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L68
            r10[r8] = r2     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = java.lang.String.format(r7, r9, r10)     // Catch: java.lang.Throwable -> L68
            byte[] r2 = r2.getBytes(r12)     // Catch: java.lang.Throwable -> L68
            r11.write(r2)     // Catch: java.lang.Throwable -> L68
            goto L6c
        L68:
            r2 = move-exception
            com.p040uc.crashsdk.C3310e.m2571a(r2, r11)     // Catch: java.lang.Throwable -> Ld1
        L6c:
            java.util.Iterator r2 = r3.iterator()     // Catch: java.lang.Throwable -> L8d
        L70:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L8d
            if (r3 == 0) goto L91
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L8d
            byte[] r3 = r3.getBytes(r12)     // Catch: java.lang.Throwable -> L8d
            r11.write(r3)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = "\n"
            byte[] r3 = r3.getBytes(r12)     // Catch: java.lang.Throwable -> L8d
            r11.write(r3)     // Catch: java.lang.Throwable -> L8d
            goto L70
        L8d:
            r2 = move-exception
            com.p040uc.crashsdk.C3310e.m2571a(r2, r11)     // Catch: java.lang.Throwable -> Ld1
        L91:
            java.lang.String r2 = "\n"
            byte[] r2 = r2.getBytes(r12)     // Catch: java.lang.Throwable -> La3
            r11.write(r2)     // Catch: java.lang.Throwable -> La3
            byte[] r2 = r13.getBytes(r12)     // Catch: java.lang.Throwable -> La3
            r11.write(r2)     // Catch: java.lang.Throwable -> La3
            goto L9
        La3:
            r2 = move-exception
            com.p040uc.crashsdk.C3310e.m2571a(r2, r11)     // Catch: java.lang.Throwable -> Ld1
            goto L9
        La9:
            if (r14 == 0) goto Lcf
            boolean r12 = com.p040uc.crashsdk.C3310e.m2529E()     // Catch: java.lang.Throwable -> Ld1
            if (r12 == 0) goto Lcf
            java.util.Iterator r12 = r14.iterator()     // Catch: java.lang.Throwable -> Ld1
        Lb5:
            boolean r13 = r12.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r13 == 0) goto Lcf
            java.lang.Object r13 = r12.next()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> Ld1
            java.util.List<java.lang.String> r14 = com.p040uc.crashsdk.C3298a.f1301B     // Catch: java.lang.Throwable -> Ld1
            boolean r14 = m2296a(r14, r13)     // Catch: java.lang.Throwable -> Ld1
            if (r14 != 0) goto Lb5
            java.lang.String r14 = "CUSTOMCACHEDINFO"
            com.p040uc.crashsdk.C3310e.m2566a(r11, r14, r13)     // Catch: java.lang.Throwable -> Ld1
            goto Lb5
        Lcf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld1
            return
        Ld1:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld1
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p040uc.crashsdk.C3298a.m2302b(java.io.OutputStream, java.lang.String, java.lang.String, java.util.ArrayList):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #2 {all -> 0x00d6, blocks: (B:12:0x0025, B:14:0x002f, B:20:0x0045, B:22:0x0050, B:17:0x003e), top: B:73:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af A[Catch: all -> 0x00d2, TryCatch #0 {all -> 0x00d2, blocks: (B:34:0x007e, B:36:0x009a, B:38:0x00a2, B:40:0x00af, B:41:0x00b4), top: B:69:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4 A[Catch: all -> 0x00d2, TRY_LEAVE, TryCatch #0 {all -> 0x00d2, blocks: (B:34:0x007e, B:36:0x009a, B:38:0x00a2, B:40:0x00af, B:41:0x00b4), top: B:69:0x007e }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m2293a(java.io.OutputStream r18, java.lang.String r19, java.util.ArrayList<java.lang.String> r20) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p040uc.crashsdk.C3298a.m2293a(java.io.OutputStream, java.lang.String, java.util.ArrayList):void");
    }

    /* renamed from: b */
    public static String m2300b(String str) {
        StringBuilder sb = new StringBuilder();
        HashMap<String, Object[]> map = f1300A;
        synchronized (map) {
            Object[] objArr = map.get(str);
            int iIntValue = ((Integer) objArr[0]).intValue();
            List list = (List) objArr[2];
            sb.append(String.format(Locale.US, "%s (%d/%d)\n", str, Integer.valueOf(list.size()), Integer.valueOf(iIntValue)));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m2287a(String str) {
        HashMap<String, Object[]> map = f1319k;
        synchronized (map) {
            Object[] objArr = map.get(str);
            if (objArr == null) {
                return null;
            }
            int i4 = 1;
            String str2 = (String) objArr[1];
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
            Locale locale = Locale.US;
            Object[] objArr2 = new Object[4];
            objArr2[0] = str2;
            objArr2[1] = "`";
            objArr2[2] = Integer.valueOf(zBooleanValue ? 1 : 0);
            if (!zBooleanValue2) {
                i4 = 0;
            }
            objArr2[3] = Integer.valueOf(i4);
            return String.format(locale, "%s%s%d%d", objArr2);
        }
    }

    /* renamed from: a */
    private static boolean m2296a(List<String> list, String str) {
        if (C3305g.m2375a(str)) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005d A[Catch: all -> 0x015a, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0013, B:11:0x0027, B:14:0x002b, B:16:0x0035, B:18:0x003b, B:32:0x005d, B:23:0x0047, B:26:0x004c, B:30:0x0057, B:27:0x0050, B:33:0x0063, B:35:0x006a, B:37:0x0070, B:51:0x009a, B:53:0x00a1, B:55:0x00a9, B:57:0x00af, B:59:0x00b3, B:60:0x00b8, B:62:0x00be, B:64:0x00c6, B:66:0x00cc, B:68:0x00d0, B:69:0x00d5, B:71:0x00db, B:78:0x00ed, B:80:0x00ef, B:82:0x00f3, B:84:0x00f9, B:86:0x0105, B:88:0x010b, B:90:0x0112, B:91:0x0117, B:93:0x011d, B:95:0x0123, B:96:0x0128, B:98:0x012e, B:100:0x0134, B:102:0x013c, B:103:0x0158, B:75:0x00e5, B:42:0x007c, B:45:0x0081, B:46:0x008b, B:49:0x0092), top: B:108:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a A[Catch: all -> 0x015a, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0013, B:11:0x0027, B:14:0x002b, B:16:0x0035, B:18:0x003b, B:32:0x005d, B:23:0x0047, B:26:0x004c, B:30:0x0057, B:27:0x0050, B:33:0x0063, B:35:0x006a, B:37:0x0070, B:51:0x009a, B:53:0x00a1, B:55:0x00a9, B:57:0x00af, B:59:0x00b3, B:60:0x00b8, B:62:0x00be, B:64:0x00c6, B:66:0x00cc, B:68:0x00d0, B:69:0x00d5, B:71:0x00db, B:78:0x00ed, B:80:0x00ef, B:82:0x00f3, B:84:0x00f9, B:86:0x0105, B:88:0x010b, B:90:0x0112, B:91:0x0117, B:93:0x011d, B:95:0x0123, B:96:0x0128, B:98:0x012e, B:100:0x0134, B:102:0x013c, B:103:0x0158, B:75:0x00e5, B:42:0x007c, B:45:0x0081, B:46:0x008b, B:49:0x0092), top: B:108:0x000d }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m2284a(java.lang.String r16, int r17, java.util.concurrent.Callable<java.lang.String> r18, long r19, int r21) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p040uc.crashsdk.C3298a.m2284a(java.lang.String, int, java.util.concurrent.Callable, long, int):int");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:7|(2:50|8)|(3:57|10|(4:55|12|63|59)(4:54|16|(1:18)(1:19)|(1:24)(1:23)))(3:53|13|(4:56|15|60|59)(5:58|16|(0)(0)|(1:21)|24))|48|28|61|59|5) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
    
        com.p040uc.crashsdk.C3310e.m2571a(r2, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[Catch: all -> 0x008d, TryCatch #2 {all -> 0x008d, blocks: (B:8:0x0015, B:10:0x0028, B:16:0x0036, B:18:0x005d, B:21:0x0075, B:23:0x007b, B:24:0x0083, B:19:0x006b, B:13:0x002f), top: B:50:0x0015, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[Catch: all -> 0x008d, TryCatch #2 {all -> 0x008d, blocks: (B:8:0x0015, B:10:0x0028, B:16:0x0036, B:18:0x005d, B:21:0x0075, B:23:0x007b, B:24:0x0083, B:19:0x006b, B:13:0x002f), top: B:50:0x0015, outer: #0 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m2292a(java.io.OutputStream r9, java.lang.String r10, java.lang.String r11, java.util.ArrayList<java.lang.String> r12) {
        /*
            java.util.HashMap<java.lang.String, java.lang.Object[]> r0 = com.p040uc.crashsdk.C3298a.f1325q
            monitor-enter(r0)
            java.util.List<java.lang.String> r1 = com.p040uc.crashsdk.C3298a.f1326r     // Catch: java.lang.Throwable -> Ld1
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Ld1
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r2 == 0) goto La9
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Ld1
            java.util.HashMap<java.lang.String, java.lang.Object[]> r3 = com.p040uc.crashsdk.C3298a.f1325q     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L8d
            java.lang.Object[] r3 = (java.lang.Object[]) r3     // Catch: java.lang.Throwable -> L8d
            r4 = 0
            r5 = r3[r4]     // Catch: java.lang.Throwable -> L8d
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L8d
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L8d
            if (r12 != 0) goto L2f
            boolean r5 = com.p040uc.crashsdk.export.LogType.isForJava(r5)     // Catch: java.lang.Throwable -> L8d
            if (r5 != 0) goto L36
            goto L9
        L2f:
            boolean r5 = m2296a(r12, r2)     // Catch: java.lang.Throwable -> L8d
            if (r5 != 0) goto L36
            goto L9
        L36:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r5.<init>()     // Catch: java.lang.Throwable -> L8d
            r5.append(r2)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r6 = "\n"
            r5.append(r6)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L8d
            byte[] r5 = r5.getBytes(r10)     // Catch: java.lang.Throwable -> L8d
            r9.write(r5)     // Catch: java.lang.Throwable -> L8d
            r5 = 2
            r5 = r3[r5]     // Catch: java.lang.Throwable -> L8d
            java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.Throwable -> L8d
            long r5 = r5.longValue()     // Catch: java.lang.Throwable -> L8d
            r7 = 0
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L6b
            r7 = 3
            r3 = r3[r7]     // Catch: java.lang.Throwable -> L8d
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L8d
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = com.p040uc.crashsdk.JNIBridge.nativeGetCallbackInfo(r2, r5, r3, r4)     // Catch: java.lang.Throwable -> L8d
            goto L73
        L6b:
            java.lang.StringBuilder r2 = m2301b(r2, r4)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L8d
        L73:
            if (r2 == 0) goto L83
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L8d
            if (r3 <= 0) goto L83
            byte[] r2 = r2.getBytes(r10)     // Catch: java.lang.Throwable -> L8d
            r9.write(r2)     // Catch: java.lang.Throwable -> L8d
            goto L91
        L83:
            java.lang.String r2 = "(data is null)\n"
            byte[] r2 = r2.getBytes(r10)     // Catch: java.lang.Throwable -> L8d
            r9.write(r2)     // Catch: java.lang.Throwable -> L8d
            goto L91
        L8d:
            r2 = move-exception
            com.p040uc.crashsdk.C3310e.m2571a(r2, r9)     // Catch: java.lang.Throwable -> Ld1
        L91:
            java.lang.String r2 = "\n"
            byte[] r2 = r2.getBytes(r10)     // Catch: java.lang.Throwable -> La3
            r9.write(r2)     // Catch: java.lang.Throwable -> La3
            byte[] r2 = r11.getBytes(r10)     // Catch: java.lang.Throwable -> La3
            r9.write(r2)     // Catch: java.lang.Throwable -> La3
            goto L9
        La3:
            r2 = move-exception
            com.p040uc.crashsdk.C3310e.m2571a(r2, r9)     // Catch: java.lang.Throwable -> Ld1
            goto L9
        La9:
            if (r12 == 0) goto Lcf
            boolean r10 = com.p040uc.crashsdk.C3310e.m2529E()     // Catch: java.lang.Throwable -> Ld1
            if (r10 == 0) goto Lcf
            java.util.Iterator r10 = r12.iterator()     // Catch: java.lang.Throwable -> Ld1
        Lb5:
            boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r11 == 0) goto Lcf
            java.lang.Object r11 = r10.next()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> Ld1
            java.util.List<java.lang.String> r12 = com.p040uc.crashsdk.C3298a.f1326r     // Catch: java.lang.Throwable -> Ld1
            boolean r12 = m2296a(r12, r11)     // Catch: java.lang.Throwable -> Ld1
            if (r12 != 0) goto Lb5
            java.lang.String r12 = "CUSTOMCALLBACKINFO"
            com.p040uc.crashsdk.C3310e.m2566a(r9, r12, r11)     // Catch: java.lang.Throwable -> Ld1
            goto Lb5
        Lcf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld1
            return
        Ld1:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p040uc.crashsdk.C3298a.m2292a(java.io.OutputStream, java.lang.String, java.lang.String, java.util.ArrayList):void");
    }

    /* renamed from: a */
    public static String m2288a(String str, boolean z3) {
        String string;
        HashMap<String, Object[]> map = f1325q;
        synchronized (map) {
            Object[] objArr = map.get(str);
            long jLongValue = ((Long) objArr[2]).longValue();
            if (jLongValue != 0) {
                string = JNIBridge.nativeGetCallbackInfo(str, jLongValue, ((Integer) objArr[3]).intValue(), z3);
            } else {
                string = m2301b(str, z3).toString();
            }
        }
        return string;
    }

    /* renamed from: a */
    private static boolean m2295a(String str, Thread thread) {
        if (thread == null) {
            return false;
        }
        SparseArray<Object[]> sparseArray = f1333y;
        synchronized (sparseArray) {
            int id = (int) thread.getId();
            if (sparseArray.get(id) == null) {
                f1334z.add(Integer.valueOf(id));
            }
            sparseArray.put(id, new Object[]{new WeakReference(thread), str});
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:34:0x00c3, B:36:0x00ca, B:37:0x00d3, B:39:0x00d8, B:41:0x00dc, B:42:0x00e5), top: B:55:0x00c3, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:34:0x00c3, B:36:0x00ca, B:37:0x00d3, B:39:0x00d8, B:41:0x00dc, B:42:0x00e5), top: B:55:0x00c3, outer: #4 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m2291a(java.io.OutputStream r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p040uc.crashsdk.C3298a.m2291a(java.io.OutputStream, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public static int m2283a(String str, int i4, int i5) {
        int iRemoveType;
        int iIntValue;
        boolean z3;
        if (str == null || i4 <= 0) {
            return 0;
        }
        if (i4 > 1500) {
            C3299a.m2320a("crashsdk", "createCachedInfo: capacity is too large!", null);
            return 0;
        }
        HashMap<String, Object[]> map = f1300A;
        synchronized (map) {
            if (map.containsKey(str)) {
                iIntValue = ((Integer) map.get(str)[1]).intValue();
                iRemoveType = LogType.addType(iIntValue, i5);
            } else {
                iRemoveType = i5;
                iIntValue = 0;
            }
            if (LogType.isForJava(iRemoveType) && !LogType.isForJava(iIntValue)) {
                int i6 = f1302C;
                if (i6 >= 8) {
                    iRemoveType = LogType.removeType(iRemoveType, 16);
                } else {
                    f1302C = i6 + 1;
                }
            }
            if (LogType.isForNative(iRemoveType) && !LogType.isForNative(iIntValue)) {
                int i7 = f1303D;
                if (i7 >= 8) {
                    iRemoveType = LogType.removeType(iRemoveType, 1);
                } else {
                    f1303D = i7 + 1;
                }
            }
            if (LogType.isForANR(iRemoveType) && !LogType.isForANR(iIntValue)) {
                int i8 = f1304E;
                if (i8 >= 8) {
                    iRemoveType = LogType.removeType(iRemoveType, 1048576);
                } else {
                    f1304E = i8 + 1;
                }
            }
            if ((1048849 & iRemoveType) == 0) {
                z3 = false;
            } else {
                if (iIntValue == 0) {
                    f1301B.add(str);
                }
                z3 = true;
            }
            if (!z3) {
                return iRemoveType;
            }
            if (C3307b.f1428d && (i5 & 1048577) != 0) {
                int iNativeCreateCachedInfo = JNIBridge.nativeCreateCachedInfo(str, i4, iRemoveType);
                if (!LogType.isForNative(iNativeCreateCachedInfo)) {
                    iRemoveType = LogType.removeType(iRemoveType, 1);
                }
                if (!LogType.isForANR(iNativeCreateCachedInfo)) {
                    iRemoveType = LogType.removeType(iRemoveType, 1048576);
                }
            }
            map.put(str, new Object[]{Integer.valueOf(i4), Integer.valueOf(iRemoveType), new ArrayList()});
            return iRemoveType;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* renamed from: a */
    public static int m2282a(int i4, String str) {
        ?? r02;
        if (C3305g.m2375a(str)) {
            str = Thread.currentThread().getName();
        }
        if (!LogType.isForNative(i4) && !LogType.isForANR(i4)) {
            r02 = 0;
        } else if (C3307b.f1428d) {
            synchronized (f1333y) {
                JNIBridge.nativeCmd(4, i4, str, null);
            }
            boolean zIsForNative = LogType.isForNative(i4);
            r02 = zIsForNative;
            if (LogType.isForANR(i4)) {
                r02 = (zIsForNative ? 1 : 0) | 1048576;
            }
        } else {
            C3299a.m2320a("crashsdk", "crashsdk so has not loaded!", null);
            r02 = 0;
        }
        if (!LogType.isForJava(i4)) {
            return r02;
        }
        m2295a(str, Thread.currentThread());
        return r02 | 16;
    }

    /* renamed from: a */
    public static boolean m2297a(boolean z3) {
        int iM2697E;
        if (!C3307b.f1427c) {
            C3299a.m2319a("crashsdk", "Unexp log not enabled, skip update unexp info!");
            return false;
        }
        if (C3310e.m2529E() || C3307b.m2453I()) {
            return false;
        }
        if (z3) {
            C3304f.m2355a(f1305F);
            iM2697E = 0;
        } else {
            if (!C3307b.m2511y()) {
                C3299a.m2319a("crashsdk", "Stop update unexp info in background!");
                return false;
            }
            if (C3312g.m2697E() <= 0) {
                return false;
            }
            if (C3304f.m2359b(f1305F)) {
                return true;
            }
            iM2697E = C3312g.m2697E() * 1000;
        }
        C3304f.m2357a(0, f1305F, iM2697E);
        return true;
    }

    /* renamed from: a */
    public static void m2289a(int i4) {
        if (i4 == 201) {
            C3299a.m2319a("crashsdk", "Begin update info ...");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (C3307b.f1428d && f1311c) {
                JNIBridge.nativeCmd(11, C3312g.m2697E(), String.valueOf(C3312g.m2698F()), null);
            }
            C3299a.m2319a("crashsdk", "Update info took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
            m2297a(false);
            return;
        }
        if (i4 != 202) {
            if (!f1312d) {
                throw new AssertionError();
            }
            return;
        }
        m2317p();
        Locale locale = Locale.US;
        String str = String.format(locale, "%s/%s/%s", C3312g.m2710R(), C3312g.m2711S(), C3312g.m2712T());
        f1315g = m2314m();
        if (C3307b.f1428d) {
            JNIBridge.set(128, f1315g);
        }
        boolean z3 = !str.equals(f1315g);
        if (z3) {
            C3300b.m2327a(C3307b.m2496j(), str);
        }
        if (z3 && C3312g.m2747u()) {
            C3299a.m2319a("crashsdk", String.format(locale, "Is new version ('%s' -> '%s'), deleting old stats data!", f1315g, str));
            C3307b.m2505s();
        }
    }
}
