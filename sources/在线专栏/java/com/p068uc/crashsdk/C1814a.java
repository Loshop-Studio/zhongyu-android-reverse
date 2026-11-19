package com.p068uc.crashsdk;

import android.content.pm.PackageInfo;
import android.util.Log;
import android.util.SparseArray;
import com.p068uc.crashsdk.export.LogType;
import com.p068uc.crashsdk.p069a.C1815a;
import com.p068uc.crashsdk.p069a.C1816b;
import com.p068uc.crashsdk.p069a.C1820f;
import com.p068uc.crashsdk.p069a.C1821g;
import com.p068uc.crashsdk.p069a.RunnableC1819e;
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
/* loaded from: classes.dex */
public class C1814a {

    /* renamed from: a */
    public static String f7901a = "";

    /* renamed from: b */
    public static String f7902b = "";

    /* renamed from: d */
    static final /* synthetic */ boolean f7904d = true;

    /* renamed from: e */
    private static final Map<String, String> f7905e = new HashMap();

    /* renamed from: f */
    private static final List<String> f7906f = new ArrayList();

    /* renamed from: g */
    private static String f7907g = "";

    /* renamed from: h */
    private static String f7908h = null;

    /* renamed from: i */
    private static int f7909i = -1;

    /* renamed from: j */
    private static long f7910j = 0;

    /* renamed from: k */
    private static final HashMap<String, Object[]> f7911k = new HashMap<>();

    /* renamed from: l */
    private static final List<String> f7912l = new ArrayList();

    /* renamed from: m */
    private static int f7913m = 0;

    /* renamed from: n */
    private static int f7914n = 0;

    /* renamed from: o */
    private static int f7915o = 0;

    /* renamed from: p */
    private static int f7916p = 0;

    /* renamed from: q */
    private static final HashMap<String, Object[]> f7917q = new HashMap<>();

    /* renamed from: r */
    private static final List<String> f7918r = new ArrayList();

    /* renamed from: s */
    private static int f7919s = 0;

    /* renamed from: t */
    private static int f7920t = 0;

    /* renamed from: u */
    private static int f7921u = 0;

    /* renamed from: v */
    private static int f7922v = 0;

    /* renamed from: w */
    private static int f7923w = 0;

    /* renamed from: x */
    private static int f7924x = 0;

    /* renamed from: y */
    private static final SparseArray<Object[]> f7925y = new SparseArray<>();

    /* renamed from: z */
    private static final List<Integer> f7926z = new ArrayList();

    /* renamed from: A */
    private static final HashMap<String, Object[]> f7892A = new HashMap<>();

    /* renamed from: B */
    private static final List<String> f7893B = new ArrayList();

    /* renamed from: C */
    private static int f7894C = 0;

    /* renamed from: D */
    private static int f7895D = 0;

    /* renamed from: E */
    private static int f7896E = 0;

    /* renamed from: c */
    static boolean f7903c = false;

    /* renamed from: F */
    private static Runnable f7897F = new RunnableC1819e(201);

    /* renamed from: G */
    private static boolean f7898G = false;

    /* renamed from: H */
    private static boolean f7899H = false;

    /* renamed from: I */
    private static boolean f7900I = false;

    /* renamed from: a */
    public static String m6209a() {
        String str = f7908h;
        return str != null ? str : m6239o() ? f7908h : "";
    }

    /* renamed from: b */
    static long m6222b() {
        return f7910j;
    }

    /* renamed from: c */
    static int m6226c() {
        if (f7909i == -1) {
            m6239o();
        }
        return f7909i;
    }

    /* renamed from: d */
    static void m6228d() {
        StringBuilder sb = new StringBuilder();
        synchronized (f7905e) {
            for (String str : f7906f) {
                String str2 = f7905e.get(str);
                sb.append(str);
                sb.append(": ");
                if (str2 != null) {
                    sb.append(str2);
                }
                sb.append("\n");
            }
        }
        sb.append(String.format(Locale.US, "(saved at %s)\n", C1826e.m6558m()));
        C1816b.m6250a(C1823b.m6414e(), sb.toString());
    }

    /* renamed from: e */
    static void m6229e() {
        if (!f7904d && !C1823b.f8020d) {
            throw new AssertionError();
        }
        synchronized (f7905e) {
            for (String str : f7906f) {
                JNIBridge.nativeAddHeaderInfo(str, f7905e.get(str));
            }
        }
    }

    /* renamed from: f */
    public static byte[] m6230f() {
        return new byte[]{24, 99, 121, 60};
    }

    /* renamed from: g */
    static void m6231g() {
        if (!f7904d && !C1823b.f8020d) {
            throw new AssertionError();
        }
        synchronized (f7911k) {
            for (String str : f7912l) {
                Object[] objArr = f7911k.get(str);
                int iIntValue = ((Integer) objArr[0]).intValue();
                if ((1048833 & iIntValue) != 0) {
                    JNIBridge.nativeAddDumpFile(str, (String) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue(), iIntValue, ((Boolean) objArr[4]).booleanValue());
                }
            }
        }
    }

    /* renamed from: h */
    static String m6232h() {
        StringBuilder sb = new StringBuilder();
        synchronized (f7911k) {
            boolean z3 = true;
            for (String str : f7912l) {
                if (LogType.isForJava(((Integer) f7911k.get(str)[0]).intValue())) {
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
    static void m6233i() {
        if (!f7904d && !C1823b.f8020d) {
            throw new AssertionError();
        }
        synchronized (f7917q) {
            for (String str : f7918r) {
                Object[] objArr = f7917q.get(str);
                int iIntValue = ((Integer) objArr[0]).intValue();
                if ((1048833 & iIntValue) != 0) {
                    JNIBridge.nativeAddCallbackInfo(str, iIntValue, ((Long) objArr[2]).longValue(), ((Integer) objArr[3]).intValue());
                }
            }
        }
    }

    /* renamed from: j */
    static String m6234j() {
        String string;
        synchronized (f7917q) {
            StringBuilder sb = new StringBuilder();
            List<String> list = f7918r;
            synchronized (list) {
                boolean z3 = true;
                for (String str : list) {
                    if (LogType.isForJava(((Integer) f7917q.get(str)[0]).intValue())) {
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
    static void m6235k() {
        if (!f7904d && !C1823b.f8020d) {
            throw new AssertionError();
        }
        synchronized (f7892A) {
            for (String str : f7893B) {
                Object[] objArr = f7892A.get(str);
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
    static String m6236l() {
        StringBuilder sb = new StringBuilder();
        synchronized (f7892A) {
            boolean z3 = true;
            for (String str : f7893B) {
                if (LogType.isForJava(((Integer) f7892A.get(str)[1]).intValue())) {
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
    static String m6237m() throws Throwable {
        if (!f7898G) {
            String strM6248a = C1816b.m6248a(C1823b.m6419j());
            f7907g = strM6248a;
            f7898G = true;
            if (strM6248a == null) {
                f7907g = "";
            }
        }
        return f7907g;
    }

    /* renamed from: n */
    public static void m6238n() {
        m6240p();
        if (!f7899H) {
            f7899H = true;
            C1820f.m6279a(0, new RunnableC1819e(202));
        } else if (C1823b.f8020d) {
            JNIBridge.set(128, f7907g);
        }
    }

    /* renamed from: o */
    private static boolean m6239o() {
        try {
            PackageInfo packageInfo = C1821g.m6284a().getPackageManager().getPackageInfo(f7901a, 0);
            f7908h = packageInfo.versionName;
            f7910j = packageInfo.lastUpdateTime;
            f7909i = packageInfo.versionCode;
            return true;
        } catch (Throwable th) {
            C1821g.m6302b(th);
            return false;
        }
    }

    /* renamed from: p */
    private static void m6240p() {
        if (!f7900I && C1826e.m6497a()) {
            if (C1823b.f8020d || !C1823b.f8023g) {
                String str = String.format(Locale.US, "%s/%s/%s", C1828g.m6633R(), C1828g.m6634S(), C1828g.m6635T());
                C1815a.m6245b("crashsdk", "UUID: " + C1826e.m6564p());
                C1815a.m6245b("crashsdk", "Version: " + str);
                C1815a.m6245b("crashsdk", "Process Name: " + C1826e.m6547h());
                f7900I = true;
            }
        }
    }

    /* renamed from: b */
    private static StringBuilder m6224b(String str, boolean z3) {
        String strM6439a;
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr = f7917q.get(str);
            try {
                if (objArr == null) {
                    strM6439a = "Unknown callback: " + str;
                } else {
                    Callable callable = (Callable) objArr[1];
                    strM6439a = callable != null ? (String) callable.call() : C1825d.m6439a(str, z3);
                }
                if (strM6439a != null) {
                    sb.append(strM6439a);
                }
            } catch (Throwable th) {
                sb.append("[DEBUG] Callback occurred new exception:\n");
                sb.append(Log.getStackTraceString(th));
            }
        } catch (Throwable th2) {
            C1821g.m6293a(th2);
        }
        try {
            if (sb.length() == 0) {
                sb.append("(data is null)\n");
            }
        } catch (Throwable th3) {
            C1821g.m6293a(th3);
        }
        return sb;
    }

    /* renamed from: a */
    public static void m6217a(String str, String str2) {
        Map<String, String> map = f7905e;
        synchronized (map) {
            if (!map.containsKey(str)) {
                f7906f.add(str);
            }
            map.put(str, str2);
            if (C1823b.f8020d) {
                JNIBridge.nativeAddHeaderInfo(str, str2);
            }
            C1826e.m6575x();
        }
    }

    /* renamed from: c */
    static ArrayList<String> m6227c(String str) {
        if (C1821g.m6298a(str)) {
            return null;
        }
        String[] strArrSplit = str.split(";", 20);
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : strArrSplit) {
            if (!C1821g.m6298a(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    static void m6213a(OutputStream outputStream, String str) {
        synchronized (f7905e) {
            for (String str2 : f7906f) {
                try {
                    StringBuilder sb = new StringBuilder(11);
                    sb.append(str2);
                    sb.append(": ");
                    String str3 = f7905e.get(str2);
                    if (str3 != null) {
                        sb.append(str3);
                    }
                    sb.append("\n");
                    outputStream.write(sb.toString().getBytes(str));
                } catch (Throwable th) {
                    C1826e.m6494a(th, outputStream);
                }
            }
        }
    }

    /* renamed from: b */
    public static int m6221b(String str, String str2) {
        int iAddType;
        if (str == null || str2 == null) {
            return 0;
        }
        if (str2.length() > 2048) {
            str2 = str2.substring(0, 2048);
        }
        HashMap<String, Object[]> map = f7892A;
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
                if (!C1823b.f8020d) {
                    if (LogType.isForNative(iIntValue2)) {
                        iAddType = LogType.addType(iAddType, 1);
                    }
                    if (LogType.isForANR(iIntValue2)) {
                        iAddType = LogType.addType(iAddType, LogType.ANR);
                    }
                }
                iAddType = iAddType;
                iAddType = iIntValue2;
            } else {
                iAddType = 0;
            }
            if (C1823b.f8020d && JNIBridge.nativeAddCachedInfo(str, str2)) {
                if (LogType.isForNative(iAddType)) {
                    iAddType = LogType.addType(iAddType, 1);
                }
                if (LogType.isForANR(iAddType)) {
                    iAddType = LogType.addType(iAddType, LogType.ANR);
                }
            }
        }
        return iAddType;
    }

    /* renamed from: a */
    public static int m6208a(String str, String str2, boolean z3, boolean z4, int i4, boolean z5) {
        int iRemoveType;
        int iIntValue;
        boolean z6;
        if (str == null || str2 == null) {
            return 0;
        }
        if (str.length() > 256) {
            C1815a.m6243a("crashsdk", "addDumpFile: description is too long!", null);
            return 0;
        }
        HashMap<String, Object[]> map = f7911k;
        synchronized (map) {
            if (map.containsKey(str)) {
                iIntValue = ((Integer) map.get(str)[0]).intValue();
                iRemoveType = LogType.addType(iIntValue, i4);
            } else {
                iRemoveType = i4;
                iIntValue = 0;
            }
            if (LogType.isForJava(iRemoveType) && !LogType.isForJava(iIntValue)) {
                int i5 = f7913m;
                if (i5 >= 10) {
                    iRemoveType = LogType.removeType(iRemoveType, 16);
                } else {
                    f7913m = i5 + 1;
                }
            }
            if (LogType.isForNative(iRemoveType) && !LogType.isForNative(iIntValue)) {
                int i6 = f7914n;
                if (i6 >= 10) {
                    iRemoveType = LogType.removeType(iRemoveType, 1);
                } else {
                    f7914n = i6 + 1;
                }
            }
            if (LogType.isForUnexp(iRemoveType) && !LogType.isForUnexp(iIntValue)) {
                int i7 = f7915o;
                if (i7 >= 10) {
                    iRemoveType = LogType.removeType(iRemoveType, 256);
                } else {
                    f7915o = i7 + 1;
                }
            }
            if (LogType.isForANR(iRemoveType) && !LogType.isForANR(iIntValue)) {
                int i8 = f7916p;
                if (i8 >= 10) {
                    iRemoveType = LogType.removeType(iRemoveType, LogType.ANR);
                } else {
                    f7916p = i8 + 1;
                }
            }
            if ((1048849 & iRemoveType) == 0) {
                z6 = false;
            } else {
                if (iIntValue == 0) {
                    f7912l.add(str);
                }
                z6 = true;
            }
            if (!z6) {
                return iRemoveType;
            }
            if (C1823b.f8020d && (1048833 & i4) != 0) {
                int iNativeAddDumpFile = JNIBridge.nativeAddDumpFile(str, str2, z3, z4, i4, z5);
                if (!LogType.isForNative(iNativeAddDumpFile)) {
                    iRemoveType = LogType.removeType(iRemoveType, 1);
                }
                if (!LogType.isForUnexp(iNativeAddDumpFile)) {
                    iRemoveType = LogType.removeType(iRemoveType, 256);
                }
                if (!LogType.isForANR(iNativeAddDumpFile)) {
                    iRemoveType = LogType.removeType(iRemoveType, LogType.ANR);
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
    static void m6225b(java.io.OutputStream r11, java.lang.String r12, java.lang.String r13, java.util.ArrayList<java.lang.String> r14) {
        /*
            java.util.HashMap<java.lang.String, java.lang.Object[]> r0 = com.p068uc.crashsdk.C1814a.f7892A
            monitor-enter(r0)
            java.util.List<java.lang.String> r1 = com.p068uc.crashsdk.C1814a.f7893B     // Catch: java.lang.Throwable -> Ld1
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Ld1
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r2 == 0) goto La9
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Ld1
            java.util.HashMap<java.lang.String, java.lang.Object[]> r3 = com.p068uc.crashsdk.C1814a.f7892A     // Catch: java.lang.Throwable -> Ld1
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
            boolean r7 = com.p068uc.crashsdk.export.LogType.isForJava(r7)     // Catch: java.lang.Throwable -> Ld1
            if (r7 != 0) goto L43
            goto L9
        L3d:
            boolean r7 = m6219a(r14, r2)     // Catch: java.lang.Throwable -> Ld1
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
            com.p068uc.crashsdk.C1826e.m6494a(r2, r11)     // Catch: java.lang.Throwable -> Ld1
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
            com.p068uc.crashsdk.C1826e.m6494a(r2, r11)     // Catch: java.lang.Throwable -> Ld1
        L91:
            java.lang.String r2 = "\n"
            byte[] r2 = r2.getBytes(r12)     // Catch: java.lang.Throwable -> La3
            r11.write(r2)     // Catch: java.lang.Throwable -> La3
            byte[] r2 = r13.getBytes(r12)     // Catch: java.lang.Throwable -> La3
            r11.write(r2)     // Catch: java.lang.Throwable -> La3
            goto L9
        La3:
            r2 = move-exception
            com.p068uc.crashsdk.C1826e.m6494a(r2, r11)     // Catch: java.lang.Throwable -> Ld1
            goto L9
        La9:
            if (r14 == 0) goto Lcf
            boolean r12 = com.p068uc.crashsdk.C1826e.m6452E()     // Catch: java.lang.Throwable -> Ld1
            if (r12 == 0) goto Lcf
            java.util.Iterator r12 = r14.iterator()     // Catch: java.lang.Throwable -> Ld1
        Lb5:
            boolean r13 = r12.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r13 == 0) goto Lcf
            java.lang.Object r13 = r12.next()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> Ld1
            java.util.List<java.lang.String> r14 = com.p068uc.crashsdk.C1814a.f7893B     // Catch: java.lang.Throwable -> Ld1
            boolean r14 = m6219a(r14, r13)     // Catch: java.lang.Throwable -> Ld1
            if (r14 != 0) goto Lb5
            java.lang.String r14 = "CUSTOMCACHEDINFO"
            com.p068uc.crashsdk.C1826e.m6489a(r11, r14, r13)     // Catch: java.lang.Throwable -> Ld1
            goto Lb5
        Lcf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld1
            return
        Ld1:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld1
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p068uc.crashsdk.C1814a.m6225b(java.io.OutputStream, java.lang.String, java.lang.String, java.util.ArrayList):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[Catch: all -> 0x00d7, TRY_LEAVE, TryCatch #2 {all -> 0x00d7, blocks: (B:12:0x0025, B:14:0x002f, B:20:0x0045, B:22:0x0050, B:17:0x003e), top: B:73:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0 A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:34:0x007f, B:36:0x009b, B:38:0x00a3, B:40:0x00b0, B:41:0x00b5), top: B:69:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5 A[Catch: all -> 0x00d3, TRY_LEAVE, TryCatch #0 {all -> 0x00d3, blocks: (B:34:0x007f, B:36:0x009b, B:38:0x00a3, B:40:0x00b0, B:41:0x00b5), top: B:69:0x007f }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void m6216a(java.io.OutputStream r18, java.lang.String r19, java.util.ArrayList<java.lang.String> r20) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p068uc.crashsdk.C1814a.m6216a(java.io.OutputStream, java.lang.String, java.util.ArrayList):void");
    }

    /* renamed from: b */
    static String m6223b(String str) {
        StringBuilder sb = new StringBuilder();
        HashMap<String, Object[]> map = f7892A;
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
    static String m6210a(String str) {
        HashMap<String, Object[]> map = f7911k;
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
    private static boolean m6219a(List<String> list, String str) {
        if (C1821g.m6298a(str)) {
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

    /* JADX WARN: Removed duplicated region for block: B:32:0x005d A[Catch: all -> 0x015a, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0013, B:11:0x0027, B:14:0x002b, B:16:0x0035, B:18:0x003b, B:32:0x005d, B:23:0x0047, B:26:0x004c, B:30:0x0057, B:27:0x0050, B:33:0x0063, B:35:0x006a, B:37:0x0070, B:52:0x009a, B:54:0x00a1, B:56:0x00a9, B:58:0x00af, B:60:0x00b3, B:61:0x00b8, B:63:0x00be, B:65:0x00c6, B:67:0x00cc, B:69:0x00d0, B:70:0x00d5, B:72:0x00db, B:79:0x00ed, B:81:0x00ef, B:83:0x00f3, B:85:0x00f9, B:87:0x0105, B:89:0x010b, B:91:0x0112, B:92:0x0117, B:94:0x011d, B:96:0x0123, B:97:0x0128, B:99:0x012e, B:101:0x0134, B:103:0x013c, B:104:0x0158, B:76:0x00e5, B:43:0x007c, B:46:0x0081, B:47:0x008b, B:50:0x0092), top: B:109:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a A[Catch: all -> 0x015a, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0013, B:11:0x0027, B:14:0x002b, B:16:0x0035, B:18:0x003b, B:32:0x005d, B:23:0x0047, B:26:0x004c, B:30:0x0057, B:27:0x0050, B:33:0x0063, B:35:0x006a, B:37:0x0070, B:52:0x009a, B:54:0x00a1, B:56:0x00a9, B:58:0x00af, B:60:0x00b3, B:61:0x00b8, B:63:0x00be, B:65:0x00c6, B:67:0x00cc, B:69:0x00d0, B:70:0x00d5, B:72:0x00db, B:79:0x00ed, B:81:0x00ef, B:83:0x00f3, B:85:0x00f9, B:87:0x0105, B:89:0x010b, B:91:0x0112, B:92:0x0117, B:94:0x011d, B:96:0x0123, B:97:0x0128, B:99:0x012e, B:101:0x0134, B:103:0x013c, B:104:0x0158, B:76:0x00e5, B:43:0x007c, B:46:0x0081, B:47:0x008b, B:50:0x0092), top: B:109:0x000d }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m6207a(java.lang.String r16, int r17, java.util.concurrent.Callable<java.lang.String> r18, long r19, int r21) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p068uc.crashsdk.C1814a.m6207a(java.lang.String, int, java.util.concurrent.Callable, long, int):int");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:7|(2:50|8)|(3:57|10|(4:55|12|63|59)(4:54|16|(1:18)(1:19)|(1:24)(1:23)))(3:53|13|(4:56|15|60|59)(5:58|16|(0)(0)|(1:21)|24))|48|28|61|59|5) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
    
        com.p068uc.crashsdk.C1826e.m6494a(r2, r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[Catch: all -> 0x008d, TryCatch #2 {all -> 0x008d, blocks: (B:8:0x0015, B:10:0x0028, B:16:0x0036, B:18:0x005d, B:21:0x0075, B:23:0x007b, B:24:0x0083, B:19:0x006b, B:13:0x002f), top: B:50:0x0015, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[Catch: all -> 0x008d, TryCatch #2 {all -> 0x008d, blocks: (B:8:0x0015, B:10:0x0028, B:16:0x0036, B:18:0x005d, B:21:0x0075, B:23:0x007b, B:24:0x0083, B:19:0x006b, B:13:0x002f), top: B:50:0x0015, outer: #0 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void m6215a(java.io.OutputStream r10, java.lang.String r11, java.lang.String r12, java.util.ArrayList<java.lang.String> r13) {
        /*
            java.util.HashMap<java.lang.String, java.lang.Object[]> r0 = com.p068uc.crashsdk.C1814a.f7917q
            monitor-enter(r0)
            java.util.List<java.lang.String> r1 = com.p068uc.crashsdk.C1814a.f7918r     // Catch: java.lang.Throwable -> Ld1
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Ld1
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r2 == 0) goto La9
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Ld1
            java.util.HashMap<java.lang.String, java.lang.Object[]> r3 = com.p068uc.crashsdk.C1814a.f7917q     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L8d
            java.lang.Object[] r3 = (java.lang.Object[]) r3     // Catch: java.lang.Throwable -> L8d
            r4 = 0
            r5 = r3[r4]     // Catch: java.lang.Throwable -> L8d
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L8d
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L8d
            if (r13 != 0) goto L2f
            boolean r5 = com.p068uc.crashsdk.export.LogType.isForJava(r5)     // Catch: java.lang.Throwable -> L8d
            if (r5 != 0) goto L36
            goto L9
        L2f:
            boolean r5 = m6219a(r13, r2)     // Catch: java.lang.Throwable -> L8d
            if (r5 != 0) goto L36
            goto L9
        L36:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r5.<init>()     // Catch: java.lang.Throwable -> L8d
            r5.append(r2)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r6 = "\n"
            r5.append(r6)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L8d
            byte[] r5 = r5.getBytes(r11)     // Catch: java.lang.Throwable -> L8d
            r10.write(r5)     // Catch: java.lang.Throwable -> L8d
            r5 = 2
            r5 = r3[r5]     // Catch: java.lang.Throwable -> L8d
            java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.Throwable -> L8d
            long r5 = r5.longValue()     // Catch: java.lang.Throwable -> L8d
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L6b
            r7 = 3
            r3 = r3[r7]     // Catch: java.lang.Throwable -> L8d
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L8d
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = com.p068uc.crashsdk.JNIBridge.nativeGetCallbackInfo(r2, r5, r3, r4)     // Catch: java.lang.Throwable -> L8d
            goto L73
        L6b:
            java.lang.StringBuilder r2 = m6224b(r2, r4)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L8d
        L73:
            if (r2 == 0) goto L83
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L8d
            if (r3 <= 0) goto L83
            byte[] r2 = r2.getBytes(r11)     // Catch: java.lang.Throwable -> L8d
            r10.write(r2)     // Catch: java.lang.Throwable -> L8d
            goto L91
        L83:
            java.lang.String r2 = "(data is null)\n"
            byte[] r2 = r2.getBytes(r11)     // Catch: java.lang.Throwable -> L8d
            r10.write(r2)     // Catch: java.lang.Throwable -> L8d
            goto L91
        L8d:
            r2 = move-exception
            com.p068uc.crashsdk.C1826e.m6494a(r2, r10)     // Catch: java.lang.Throwable -> Ld1
        L91:
            java.lang.String r2 = "\n"
            byte[] r2 = r2.getBytes(r11)     // Catch: java.lang.Throwable -> La3
            r10.write(r2)     // Catch: java.lang.Throwable -> La3
            byte[] r2 = r12.getBytes(r11)     // Catch: java.lang.Throwable -> La3
            r10.write(r2)     // Catch: java.lang.Throwable -> La3
            goto L9
        La3:
            r2 = move-exception
            com.p068uc.crashsdk.C1826e.m6494a(r2, r10)     // Catch: java.lang.Throwable -> Ld1
            goto L9
        La9:
            if (r13 == 0) goto Lcf
            boolean r11 = com.p068uc.crashsdk.C1826e.m6452E()     // Catch: java.lang.Throwable -> Ld1
            if (r11 == 0) goto Lcf
            java.util.Iterator r11 = r13.iterator()     // Catch: java.lang.Throwable -> Ld1
        Lb5:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r12 == 0) goto Lcf
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> Ld1
            java.util.List<java.lang.String> r13 = com.p068uc.crashsdk.C1814a.f7918r     // Catch: java.lang.Throwable -> Ld1
            boolean r13 = m6219a(r13, r12)     // Catch: java.lang.Throwable -> Ld1
            if (r13 != 0) goto Lb5
            java.lang.String r13 = "CUSTOMCALLBACKINFO"
            com.p068uc.crashsdk.C1826e.m6489a(r10, r13, r12)     // Catch: java.lang.Throwable -> Ld1
            goto Lb5
        Lcf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld1
            return
        Ld1:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld1
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p068uc.crashsdk.C1814a.m6215a(java.io.OutputStream, java.lang.String, java.lang.String, java.util.ArrayList):void");
    }

    /* renamed from: a */
    static String m6211a(String str, boolean z3) {
        String string;
        HashMap<String, Object[]> map = f7917q;
        synchronized (map) {
            Object[] objArr = map.get(str);
            long jLongValue = ((Long) objArr[2]).longValue();
            if (jLongValue != 0) {
                string = JNIBridge.nativeGetCallbackInfo(str, jLongValue, ((Integer) objArr[3]).intValue(), z3);
            } else {
                string = m6224b(str, z3).toString();
            }
        }
        return string;
    }

    /* renamed from: a */
    private static boolean m6218a(String str, Thread thread) {
        if (thread == null) {
            return false;
        }
        SparseArray<Object[]> sparseArray = f7925y;
        synchronized (sparseArray) {
            int id = (int) thread.getId();
            if (sparseArray.get(id) == null) {
                f7926z.add(Integer.valueOf(id));
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
    static void m6214a(java.io.OutputStream r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p068uc.crashsdk.C1814a.m6214a(java.io.OutputStream, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public static int m6206a(String str, int i4, int i5) {
        int iRemoveType;
        int iIntValue;
        boolean z3;
        if (str == null || i4 <= 0) {
            return 0;
        }
        if (i4 > 1500) {
            C1815a.m6243a("crashsdk", "createCachedInfo: capacity is too large!", null);
            return 0;
        }
        HashMap<String, Object[]> map = f7892A;
        synchronized (map) {
            if (map.containsKey(str)) {
                iIntValue = ((Integer) map.get(str)[1]).intValue();
                iRemoveType = LogType.addType(iIntValue, i5);
            } else {
                iRemoveType = i5;
                iIntValue = 0;
            }
            if (LogType.isForJava(iRemoveType) && !LogType.isForJava(iIntValue)) {
                int i6 = f7894C;
                if (i6 >= 8) {
                    iRemoveType = LogType.removeType(iRemoveType, 16);
                } else {
                    f7894C = i6 + 1;
                }
            }
            if (LogType.isForNative(iRemoveType) && !LogType.isForNative(iIntValue)) {
                int i7 = f7895D;
                if (i7 >= 8) {
                    iRemoveType = LogType.removeType(iRemoveType, 1);
                } else {
                    f7895D = i7 + 1;
                }
            }
            if (LogType.isForANR(iRemoveType) && !LogType.isForANR(iIntValue)) {
                int i8 = f7896E;
                if (i8 >= 8) {
                    iRemoveType = LogType.removeType(iRemoveType, LogType.ANR);
                } else {
                    f7896E = i8 + 1;
                }
            }
            if ((1048849 & iRemoveType) == 0) {
                z3 = false;
            } else {
                if (iIntValue == 0) {
                    f7893B.add(str);
                }
                z3 = true;
            }
            if (!z3) {
                return iRemoveType;
            }
            if (C1823b.f8020d && (i5 & 1048577) != 0) {
                int iNativeCreateCachedInfo = JNIBridge.nativeCreateCachedInfo(str, i4, iRemoveType);
                if (!LogType.isForNative(iNativeCreateCachedInfo)) {
                    iRemoveType = LogType.removeType(iRemoveType, 1);
                }
                if (!LogType.isForANR(iNativeCreateCachedInfo)) {
                    iRemoveType = LogType.removeType(iRemoveType, LogType.ANR);
                }
            }
            map.put(str, new Object[]{Integer.valueOf(i4), Integer.valueOf(iRemoveType), new ArrayList()});
            return iRemoveType;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static int m6205a(int i4, String str) {
        if (C1821g.m6298a(str)) {
            str = Thread.currentThread().getName();
        }
        int i5 = 0;
        i5 = 0;
        if (LogType.isForNative(i4) || LogType.isForANR(i4)) {
            if (C1823b.f8020d) {
                synchronized (f7925y) {
                    JNIBridge.nativeCmd(4, i4, str, null);
                }
                boolean zIsForNative = LogType.isForNative(i4);
                i5 = zIsForNative;
                if (LogType.isForANR(i4)) {
                    i5 = (zIsForNative ? 1 : 0) | LogType.ANR;
                }
            } else {
                C1815a.m6243a("crashsdk", "crashsdk so has not loaded!", null);
            }
        }
        if (!LogType.isForJava(i4)) {
            return i5;
        }
        m6218a(str, Thread.currentThread());
        return i5 | 16;
    }

    /* renamed from: a */
    public static boolean m6220a(boolean z3) {
        int iM6620E;
        if (!C1823b.f8019c) {
            C1815a.m6242a("crashsdk", "Unexp log not enabled, skip update unexp info!");
            return false;
        }
        if (C1826e.m6452E() || C1823b.m6376I()) {
            return false;
        }
        if (z3) {
            C1820f.m6278a(f7897F);
            iM6620E = 0;
        } else {
            if (!C1823b.m6434y()) {
                C1815a.m6242a("crashsdk", "Stop update unexp info in background!");
                return false;
            }
            if (C1828g.m6620E() <= 0) {
                return false;
            }
            if (C1820f.m6282b(f7897F)) {
                return true;
            }
            iM6620E = C1828g.m6620E() * 1000;
        }
        C1820f.m6280a(0, f7897F, iM6620E);
        return true;
    }

    /* renamed from: a */
    public static void m6212a(int i4) {
        if (i4 == 201) {
            C1815a.m6242a("crashsdk", "Begin update info ...");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (C1823b.f8020d && f7903c) {
                JNIBridge.nativeCmd(11, C1828g.m6620E(), String.valueOf(C1828g.m6621F()), null);
            }
            C1815a.m6242a("crashsdk", "Update info took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
            m6220a(false);
            return;
        }
        if (i4 != 202) {
            if (!f7904d) {
                throw new AssertionError();
            }
            return;
        }
        m6240p();
        Locale locale = Locale.US;
        String str = String.format(locale, "%s/%s/%s", C1828g.m6633R(), C1828g.m6634S(), C1828g.m6635T());
        f7907g = m6237m();
        if (C1823b.f8020d) {
            JNIBridge.set(128, f7907g);
        }
        boolean z3 = !str.equals(f7907g);
        if (z3) {
            C1816b.m6250a(C1823b.m6419j(), str);
        }
        if (z3 && C1828g.m6670u()) {
            C1815a.m6242a("crashsdk", String.format(locale, "Is new version ('%s' -> '%s'), deleting old stats data!", f7907g, str));
            C1823b.m6428s();
        }
    }
}
