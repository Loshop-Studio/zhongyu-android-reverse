package com.p040uc.crashsdk;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import androidx.compose.p006ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.app.NotificationCompat;
import com.p040uc.crashsdk.export.ExitType;
import com.p040uc.crashsdk.p041a.C3299a;
import com.p040uc.crashsdk.p041a.C3304f;
import com.p040uc.crashsdk.p041a.C3305g;
import com.p040uc.crashsdk.p041a.C3306h;
import com.p040uc.crashsdk.p041a.RunnableC3303e;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.uc.crashsdk.b */
/* loaded from: classes2.dex */
public class C3307b {

    /* renamed from: A */
    private static boolean f1389A = false;

    /* renamed from: B */
    private static boolean f1390B = false;

    /* renamed from: C */
    private static boolean f1391C = false;

    /* renamed from: D */
    private static boolean f1392D = false;

    /* renamed from: E */
    private static boolean f1393E = false;

    /* renamed from: G */
    private static String f1395G = null;

    /* renamed from: H */
    private static int f1396H = 0;

    /* renamed from: I */
    private static boolean f1397I = false;

    /* renamed from: J */
    private static boolean f1398J = false;

    /* renamed from: K */
    private static boolean f1399K = true;

    /* renamed from: L */
    private static RandomAccessFile f1400L = null;

    /* renamed from: M */
    private static boolean f1401M = false;

    /* renamed from: O */
    private static String f1403O = null;

    /* renamed from: P */
    private static boolean f1404P = false;

    /* renamed from: Q */
    private static volatile Object[] f1405Q = null;

    /* renamed from: a */
    public static boolean f1415a = false;

    /* renamed from: b */
    public static boolean f1426b = false;

    /* renamed from: c */
    public static boolean f1427c = false;

    /* renamed from: d */
    public static boolean f1428d = false;

    /* renamed from: f */
    public static boolean f1430f = false;

    /* renamed from: g */
    public static boolean f1431g = true;

    /* renamed from: h */
    public static boolean f1432h = false;

    /* renamed from: i */
    static final /* synthetic */ boolean f1433i = true;

    /* renamed from: j */
    private static String f1434j = null;

    /* renamed from: k */
    private static String f1435k = null;

    /* renamed from: l */
    private static String f1436l = null;

    /* renamed from: m */
    private static String f1437m = null;

    /* renamed from: n */
    private static String f1438n = null;

    /* renamed from: o */
    private static String f1439o = null;

    /* renamed from: p */
    private static String f1440p = null;

    /* renamed from: q */
    private static String f1441q = null;

    /* renamed from: r */
    private static String f1442r = null;

    /* renamed from: s */
    private static String f1443s = null;

    /* renamed from: t */
    private static String f1444t = null;

    /* renamed from: u */
    private static String f1445u = null;

    /* renamed from: v */
    private static String f1446v = null;

    /* renamed from: w */
    private static boolean f1447w = false;

    /* renamed from: x */
    private static boolean f1448x = false;

    /* renamed from: y */
    private static volatile boolean f1449y = false;

    /* renamed from: z */
    private static boolean f1450z = false;

    /* renamed from: e */
    public static final Object f1429e = new Object();

    /* renamed from: F */
    private static final Object f1394F = new Object();

    /* renamed from: N */
    private static final Object f1402N = new Object();

    /* renamed from: R */
    private static Runnable f1406R = new RunnableC3303e(101);

    /* renamed from: S */
    private static boolean f1407S = false;

    /* renamed from: T */
    private static long f1408T = 0;

    /* renamed from: U */
    private static final Object f1409U = new Object();

    /* renamed from: V */
    private static long f1410V = 0;

    /* renamed from: W */
    private static boolean f1411W = false;

    /* renamed from: X */
    private static boolean f1412X = false;

    /* renamed from: Y */
    private static boolean f1413Y = false;

    /* renamed from: Z */
    private static long f1414Z = 0;

    /* renamed from: aa */
    private static final WeakHashMap<Activity, Integer> f1416aa = new WeakHashMap<>();

    /* renamed from: ab */
    private static boolean f1417ab = false;

    /* renamed from: ac */
    private static String f1418ac = null;

    /* renamed from: ad */
    private static boolean f1419ad = false;

    /* renamed from: ae */
    private static boolean f1420ae = false;

    /* renamed from: af */
    private static boolean f1421af = false;

    /* renamed from: ag */
    private static boolean f1422ag = false;

    /* renamed from: ah */
    private static boolean f1423ah = false;

    /* renamed from: ai */
    private static final Object f1424ai = new Object();

    /* renamed from: aj */
    private static PendingIntent f1425aj = null;

    /* renamed from: A */
    public static void m2445A() {
        String str;
        if (!f1428d || (str = f1418ac) == null) {
            return;
        }
        JNIBridge.set(129, str);
    }

    /* renamed from: B */
    public static String m2446B() {
        String str = f1418ac;
        return str == null ? "" : str;
    }

    /* renamed from: C */
    public static boolean m2447C() {
        if (!f1419ad) {
            if (!C3305g.m2375a(C3298a.f1309a) && C3298a.f1309a.equals(C3310e.m2624h())) {
                f1420ae = true;
                if (f1428d) {
                    JNIBridge.set(2, true);
                }
            }
            f1419ad = true;
        }
        return f1420ae;
    }

    /* renamed from: D */
    public static void m2448D() {
        f1421af = true;
        if (f1428d) {
            JNIBridge.set(34, true);
        }
    }

    /* renamed from: E */
    public static boolean m2449E() {
        return f1421af;
    }

    /* renamed from: F */
    public static int m2450F() {
        boolean zM2462R = m2462R();
        return m2503q() ? zM2462R ? 3 : 6 : m2502p() ? zM2462R ? 2 : 5 : zM2462R ? 4 : 1;
    }

    /* renamed from: G */
    public static int m2451G() {
        boolean zM2463S = m2463S();
        boolean zM2464T = m2464T();
        boolean zM2465U = m2465U();
        if (m2503q()) {
            if (zM2463S) {
                return 12;
            }
            if (zM2464T) {
                return 14;
            }
            return zM2465U ? 16 : 98;
        }
        if (!m2502p()) {
            return 1;
        }
        if (zM2463S) {
            return 11;
        }
        if (zM2464T) {
            return 13;
        }
        return zM2465U ? 15 : 97;
    }

    /* renamed from: H */
    public static void m2452H() {
        if (f1428d) {
            JNIBridge.nativeSet(27, f1396H, "12", null);
            JNIBridge.set(30, f1399K);
        }
    }

    /* renamed from: I */
    public static boolean m2453I() {
        if (!f1423ah) {
            synchronized (f1424ai) {
                if (!f1423ah) {
                    f1422ag = m2480ab();
                    f1423ah = true;
                }
            }
        }
        return f1422ag;
    }

    /* renamed from: J */
    public static void m2454J() {
        if (C3310e.m2529E() || m2453I() || f1425aj != null || C3312g.m2734h() < 0) {
            return;
        }
        try {
            Context contextM2361a = C3305g.m2361a();
            Intent launchIntentForPackage = contextM2361a.getPackageManager().getLaunchIntentForPackage(contextM2361a.getPackageName());
            launchIntentForPackage.addFlags(335544320);
            f1425aj = PendingIntent.getActivity(contextM2361a, 0, launchIntentForPackage, 0);
        } catch (Throwable th) {
            C3305g.m2370a(th);
        }
    }

    /* renamed from: K */
    public static boolean m2455K() {
        if (f1425aj == null) {
            C3299a.m2321b("Restart intent is null!");
            return false;
        }
        try {
            C3299a.m2319a("crashsdk", "restarting ...");
            ((AlarmManager) C3305g.m2361a().getSystemService(NotificationCompat.CATEGORY_ALARM)).set(1, System.currentTimeMillis() + 200, f1425aj);
            return true;
        } catch (Throwable th) {
            C3305g.m2370a(th);
            return false;
        }
    }

    /* renamed from: L */
    public static /* synthetic */ boolean m2456L() {
        f1417ab = true;
        return true;
    }

    /* renamed from: N */
    private static String m2458N() {
        if (f1434j == null) {
            f1434j = m2487c("ss");
        }
        return f1434j;
    }

    /* renamed from: O */
    private static String m2459O() {
        if (f1436l == null) {
            f1436l = m2487c("ctn");
        }
        return f1436l;
    }

    /* renamed from: P */
    private static String m2460P() {
        if (f1437m == null) {
            f1437m = m2487c("cta");
        }
        return f1437m;
    }

    /* renamed from: Q */
    private static void m2461Q() {
        if (f1449y || f1448x) {
            return;
        }
        synchronized (f1394F) {
            if (f1449y) {
                return;
            }
            m2490d(C3312g.m2713U());
            String strM2499m = m2499m();
            File file = new File(m2481b());
            File file2 = new File(m2459O());
            f1450z = "f".equals(strM2499m);
            f1389A = "b".equals(strM2499m);
            f1391C = file.exists();
            boolean zExists = file2.exists();
            f1392D = zExists;
            boolean z3 = f1391C || zExists;
            f1390B = z3;
            if (!z3 && (f1450z || f1389A)) {
                boolean zM2501o = m2501o();
                f1393E = zM2501o;
                f1390B = zM2501o;
            }
            try {
                if (m2509w()) {
                    m2467W();
                }
            } catch (Throwable th) {
                C3305g.m2370a(th);
            }
            f1449y = true;
        }
    }

    /* renamed from: R */
    private static boolean m2462R() {
        m2461Q();
        return f1390B;
    }

    /* renamed from: S */
    private static boolean m2463S() {
        m2461Q();
        return f1391C;
    }

    /* renamed from: T */
    private static boolean m2464T() {
        m2461Q();
        return f1392D;
    }

    /* renamed from: U */
    private static boolean m2465U() {
        m2461Q();
        return f1393E;
    }

    /* renamed from: V */
    private static void m2466V() {
        if (f1428d) {
            JNIBridge.set(26, f1447w);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0041 -> B:29:0x0044). Please report as a decompilation issue!!! */
    /* renamed from: W */
    private static void m2467W() {
        if (!f1407S) {
            f1407S = true;
            try {
                new File(m2481b()).delete();
            } catch (Throwable th) {
                C3305g.m2370a(th);
            }
            try {
                new File(m2459O()).delete();
            } catch (Throwable th2) {
                C3305g.m2370a(th2);
            }
            try {
                if (f1428d) {
                    JNIBridge.cmd(16);
                } else {
                    new File(m2460P()).delete();
                }
            } catch (Throwable th3) {
                C3305g.m2370a(th3);
            }
        }
        Object[] objArrM2469Y = m2469Y();
        if (!objArrM2469Y[0].equals(f1403O) && f1405Q == null) {
            m2476a(objArrM2469Y);
        } else {
            f1404P = true;
            m2468X();
        }
    }

    /* renamed from: X */
    private static void m2468X() {
        if (!C3304f.m2359b(f1406R)) {
            C3304f.m2356a(1, f1406R);
            return;
        }
        Object[] objArr = f1405Q;
        if (objArr == null || !m2469Y()[0].equals(objArr[0])) {
            C3304f.m2355a(f1406R);
            C3304f.m2356a(1, f1406R);
        }
    }

    /* renamed from: Y */
    private static Object[] m2469Y() {
        synchronized (f1409U) {
            long j4 = f1410V + 1;
            f1410V = j4;
            if (f1447w) {
                return new Object[]{"e", Long.valueOf(j4)};
            }
            if (m2511y()) {
                return new Object[]{"f", Long.valueOf(f1410V)};
            }
            return new Object[]{"b", Long.valueOf(f1410V)};
        }
    }

    /* renamed from: Z */
    private static Object m2470Z() {
        Object objM2471a;
        Object objM2471a2 = m2471a((Application) C3305g.m2361a(), (Class<?>) Application.class, "mLoadedApk");
        if (objM2471a2 != null && (objM2471a = m2471a(objM2471a2, (Class<?>) null, "mActivityThread")) != null) {
            return objM2471a;
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                return declaredMethod.invoke(null, new Object[0]);
            }
        } catch (Throwable th) {
            C3305g.m2370a(th);
        }
        return null;
    }

    /* renamed from: a */
    public static String m2472a() {
        String str = f1395G;
        if (str != null) {
            return str;
        }
        String strM2624h = C3310e.m2624h();
        if (C3305g.m2375a(strM2624h)) {
            f1395G = "LLUN";
        } else {
            int i4 = 0;
            if (strM2624h.length() > 48) {
                int length = strM2624h.length() - 48;
                strM2624h = strM2624h.substring(0, 48);
                i4 = length;
            }
            StringBuilder sb = new StringBuilder();
            byte[] bytes = strM2624h.getBytes();
            for (int length2 = bytes.length - 1; length2 >= 0; length2--) {
                byte b4 = bytes[length2];
                if (b4 == 46) {
                    sb.append('0');
                } else if (b4 == 58) {
                    sb.append('1');
                } else if (b4 >= 97 && b4 <= 122) {
                    sb.append((char) ((b4 + 65) - 97));
                } else if (b4 >= 65 && b4 <= 90) {
                    sb.append((char) b4);
                } else if (b4 < 48 || b4 > 57) {
                    sb.append('2');
                } else {
                    sb.append((char) b4);
                }
            }
            if (i4 > 0) {
                sb.append(String.valueOf(i4));
            }
            f1395G = sb.toString();
        }
        return f1395G;
    }

    /* renamed from: aa */
    private static boolean m2479aa() {
        String strM2362a = C3305g.m2362a(new File("/proc/self/cgroup"), 512, false);
        if (C3305g.m2375a(strM2362a)) {
            return false;
        }
        return strM2362a.contains("/bg_non_interactive") || strM2362a.contains("/background");
    }

    /* renamed from: ab */
    private static boolean m2480ab() {
        try {
            Method declaredMethod = Process.class.getDeclaredMethod("isIsolated", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, new Object[0]);
                if (objInvoke != null && (objInvoke instanceof Boolean)) {
                    return ((Boolean) objInvoke).booleanValue();
                }
            }
        } catch (Throwable th) {
            C3305g.m2370a(th);
        }
        int iMyUid = Process.myUid() % AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
        return iMyUid >= 99000 && iMyUid <= 99999;
    }

    /* renamed from: c */
    private static String m2487c(String str) {
        return C3312g.m2713U() + m2472a() + "." + str;
    }

    /* renamed from: d */
    public static String m2489d() {
        if (f1445u == null) {
            f1445u = m2487c("bati");
        }
        return f1445u;
    }

    /* renamed from: e */
    public static String m2491e() {
        if (f1446v == null) {
            f1446v = m2487c("hdr");
        }
        return f1446v;
    }

    /* renamed from: f */
    public static String m2492f() {
        if (f1440p == null) {
            f1440p = C3312g.m2713U() + "up";
        }
        return f1440p;
    }

    /* renamed from: g */
    public static String m2493g() {
        if (f1441q == null) {
            f1441q = C3312g.m2713U() + "authu";
        }
        return f1441q;
    }

    /* renamed from: h */
    public static String m2494h() {
        if (f1442r == null) {
            f1442r = C3312g.m2713U() + "statu";
        }
        return f1442r;
    }

    /* renamed from: i */
    public static String m2495i() {
        if (f1443s == null) {
            f1443s = C3312g.m2713U() + "poli";
        }
        return f1443s;
    }

    /* renamed from: j */
    public static String m2496j() {
        if (f1444t == null) {
            f1444t = C3312g.m2713U() + "ver";
        }
        return f1444t;
    }

    /* renamed from: k */
    public static String m2497k() {
        return C3312g.m2713U() + "bvu";
    }

    /* renamed from: l */
    public static String m2498l() {
        return C3312g.m2713U() + "fds";
    }

    /* renamed from: m */
    public static String m2499m() {
        return C3305g.m2362a(new File(m2458N()), 8, false);
    }

    /* renamed from: n */
    public static boolean m2500n() {
        return f1448x;
    }

    /* renamed from: o */
    public static boolean m2501o() {
        if (!f1397I) {
            if (f1428d) {
                f1398J = JNIBridge.cmd(15) == 1;
            } else {
                f1398J = new File(m2460P()).exists();
            }
            f1397I = true;
        }
        return f1398J;
    }

    /* renamed from: p */
    public static boolean m2502p() {
        m2461Q();
        return f1450z;
    }

    /* renamed from: q */
    public static boolean m2503q() {
        m2461Q();
        return f1389A;
    }

    /* renamed from: r */
    public static boolean m2504r() {
        return f1447w;
    }

    /* renamed from: s */
    public static void m2505s() {
        boolean z3;
        m2490d(C3312g.m2713U());
        f1448x = true;
        f1450z = false;
        f1389A = false;
        f1390B = false;
        f1391C = false;
        f1392D = false;
        f1393E = false;
        String[] strArr = {".st", ".wa", ".callback", ".ctn", ".ctj", ".cta", ".signal"};
        String[] strArr2 = {"up", "authu", "statu", "poli"};
        File[] fileArrListFiles = new File(C3312g.m2713U()).listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                String name = file.getName();
                int i4 = 0;
                while (true) {
                    if (i4 >= 7) {
                        z3 = false;
                        break;
                    } else {
                        if (name.endsWith(strArr[i4])) {
                            z3 = true;
                            break;
                        }
                        i4++;
                    }
                }
                if (!z3) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= 4) {
                            break;
                        }
                        if (name.equals(strArr2[i5])) {
                            z3 = true;
                            break;
                        }
                        i5++;
                    }
                }
                if (z3) {
                    C3299a.m2319a("crashsdk", "delete file: " + file.getPath());
                    C3305g.m2372a(file);
                }
            }
        }
        m2467W();
    }

    /* renamed from: t */
    public static void m2506t() {
        if (f1447w) {
            return;
        }
        f1447w = true;
        if (m2453I() || C3310e.m2648t()) {
            return;
        }
        m2490d(C3312g.m2713U());
        m2466V();
        m2467W();
    }

    /* renamed from: u */
    public static boolean m2507u() {
        return m2490d(C3312g.m2713U());
    }

    /* renamed from: v */
    public static boolean m2508v() {
        return m2490d(C3312g.m2714V());
    }

    /* renamed from: w */
    public static boolean m2509w() {
        return f1411W || !m2479aa();
    }

    /* renamed from: x */
    public static boolean m2510x() {
        return f1412X || !m2479aa();
    }

    /* renamed from: y */
    public static boolean m2511y() {
        return f1412X && !f1447w;
    }

    /* renamed from: z */
    public static void m2512z() {
        C3304f.m2356a(2, new RunnableC3303e(100));
    }

    /* renamed from: b */
    public static String m2481b() {
        if (f1435k == null) {
            f1435k = m2487c("ctj");
        }
        return f1435k;
    }

    /* renamed from: c */
    public static String m2486c() {
        if (f1438n == null) {
            f1438n = m2487c("st");
        }
        return f1438n;
    }

    /* renamed from: d */
    private static boolean m2490d(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (file.isDirectory()) {
            return true;
        }
        C3299a.m2320a("crashsdk", "Crash log directory was placed by a file!", null);
        if (!file.delete()) {
            return false;
        }
        file.mkdirs();
        return true;
    }

    /* renamed from: b */
    public static void m2485b(boolean z3) {
        if (C3310e.m2648t()) {
            return;
        }
        if (z3 && f1447w) {
            C3312g.m2705M();
            f1447w = false;
            m2466V();
        }
        boolean z4 = C3310e.m2529E() || m2453I();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (f1411W && !f1412X && z3) {
            long j4 = f1414Z;
            if (j4 != 0 && !z4 && jCurrentTimeMillis - j4 > 1800000) {
                C3304f.m2357a(1, new RunnableC3303e(104), 1000L);
            }
        }
        f1414Z = jCurrentTimeMillis;
        f1412X = z3;
        if (z3) {
            f1411W = true;
        }
        if (f1428d) {
            JNIBridge.nativeSetForeground(z3);
        }
        if (f1447w || z4) {
            return;
        }
        m2461Q();
        m2467W();
        if (z3) {
            C3298a.m2297a(false);
            if (!f1413Y) {
                C3310e.m2525A();
                f1413Y = true;
            }
        }
        if (!f1401M) {
            m2468X();
        }
        C3310e.m2601c(z3);
    }

    /* renamed from: c */
    public static boolean m2488c(int i4) {
        return (i4 & f1396H) != 0;
    }

    /* renamed from: a */
    public static void m2475a(boolean z3) {
        f1399K = z3;
        if (f1428d) {
            JNIBridge.set(30, z3);
        }
    }

    /* renamed from: a */
    public static String m2473a(String str) {
        return "debug.crs." + str;
    }

    /* renamed from: a */
    private static void m2476a(Object[] objArr) {
        f1405Q = objArr;
        synchronized (f1402N) {
            String str = (String) objArr[0];
            long jLongValue = ((Long) objArr[1]).longValue();
            if (jLongValue < f1408T) {
                C3299a.m2323c("crashsdk", String.format(Locale.US, "Update state generation %d, last is: %d", Long.valueOf(jLongValue), Long.valueOf(f1408T)));
                return;
            }
            f1408T = jLongValue;
            String strM2458N = m2458N();
            if (f1428d) {
                RandomAccessFile randomAccessFile = f1400L;
                if (randomAccessFile != null) {
                    C3305g.m2368a(randomAccessFile);
                    f1400L = null;
                }
                boolean zNativeChangeState = JNIBridge.nativeChangeState(strM2458N, str, f1401M);
                f1401M = false;
                if (!zNativeChangeState) {
                    C3299a.m2321b("write state failed: " + str);
                }
            } else {
                RandomAccessFile randomAccessFile2 = f1400L;
                if (randomAccessFile2 == null || f1401M) {
                    if (randomAccessFile2 != null) {
                        C3305g.m2368a(randomAccessFile2);
                        f1400L = null;
                    }
                    try {
                        RandomAccessFile randomAccessFile3 = new RandomAccessFile(strM2458N, "rw");
                        f1400L = randomAccessFile3;
                        randomAccessFile3.seek(0L);
                        f1401M = false;
                    } catch (Exception e4) {
                        C3305g.m2370a(e4);
                    }
                }
                try {
                    f1400L.write(str.getBytes());
                    f1400L.seek(0L);
                } catch (Exception e5) {
                    C3305g.m2370a(e5);
                }
            }
            f1403O = str;
            f1405Q = null;
        }
    }

    /* renamed from: b */
    public static void m2483b(int i4) {
        f1396H = i4;
        m2452H();
    }

    /* renamed from: b */
    public static void m2484b(Context context) {
        long j4;
        boolean z3;
        C3299a.m2318a("Restart APP");
        if (context == null) {
            return;
        }
        if (f1439o == null) {
            f1439o = m2487c("rt");
        }
        File file = new File(f1439o);
        try {
            j4 = Long.parseLong(C3305g.m2385d(file));
        } catch (Throwable th) {
            C3305g.m2370a(th);
            j4 = -1;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        if (C3312g.m2734h() < 0 || (j4 > 0 && jCurrentTimeMillis - j4 <= C3312g.m2734h())) {
            z3 = false;
        } else {
            m2490d(C3312g.m2713U());
            C3305g.m2373a(file, String.valueOf(jCurrentTimeMillis));
            z3 = true;
        }
        C3299a.m2318a("lastTime: " + j4 + ", currentTime: " + jCurrentTimeMillis + ", needRestart: " + z3);
        if (z3) {
            try {
                C3309d.m2520a(true);
            } catch (Throwable th2) {
                C3305g.m2370a(th2);
            }
            m2455K();
        }
    }

    /* renamed from: a */
    public static boolean m2477a(Context context) {
        try {
            ((Application) context).registerActivityLifecycleCallbacks(new C3308c());
            if (!C3312g.m2702J()) {
                return true;
            }
            m2512z();
            return true;
        } catch (Throwable th) {
            C3305g.m2370a(th);
            return false;
        }
    }

    /* renamed from: a */
    public static void m2474a(int i4) {
        Object objM2471a;
        Activity activity;
        int i5;
        boolean z3 = false;
        boolean z4 = true;
        switch (i4) {
            case 100:
                Object objM2470Z = m2470Z();
                if (objM2470Z == null || (objM2471a = m2471a(objM2470Z, (Class<?>) null, "mActivities")) == null) {
                    return;
                }
                try {
                    Iterator it = ((Map) objM2471a).entrySet().iterator();
                    boolean z5 = false;
                    while (it.hasNext()) {
                        Object value = ((Map.Entry) it.next()).getValue();
                        if (value != null && (activity = (Activity) m2471a(value, (Class<?>) null, "activity")) != null) {
                            boolean zBooleanValue = ((Boolean) m2471a(value, (Class<?>) null, "paused")).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) m2471a(value, (Class<?>) null, "stopped")).booleanValue();
                            WeakHashMap<Activity, Integer> weakHashMap = f1416aa;
                            synchronized (weakHashMap) {
                                if (zBooleanValue || zBooleanValue2) {
                                    i5 = 2;
                                } else {
                                    i5 = 1;
                                    z5 = true;
                                }
                                weakHashMap.put(activity, Integer.valueOf(i5));
                            }
                        }
                        z3 = true;
                    }
                    if (z3) {
                        m2485b(z5);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    C3305g.m2370a(th);
                    return;
                }
            case 101:
                try {
                    if (new File(m2458N()).exists()) {
                        z4 = false;
                    }
                    f1401M = z4;
                    if (z4 || f1404P) {
                        m2476a(m2469Y());
                        f1404P = false;
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    C3305g.m2370a(th2);
                    return;
                }
            case 102:
                C3304f.m2356a(1, new RunnableC3303e(ExitType.UNEXP_REASON_ANR));
                return;
            case ExitType.UNEXP_REASON_ANR /* 103 */:
                try {
                    C3305g.m2372a(new File(m2460P()));
                    return;
                } catch (Throwable th3) {
                    C3305g.m2370a(th3);
                    return;
                }
            case 104:
                C3306h.m2424d();
                C3311f.m2672a(102);
                if (m2447C()) {
                    C3310e.m2526B();
                    return;
                }
                return;
            default:
                if (!f1433i) {
                    throw new AssertionError();
                }
                return;
        }
    }

    /* renamed from: a */
    private static Object m2471a(Object obj, Class<?> cls, String str) {
        if (obj == null) {
            return null;
        }
        if (cls == null) {
            cls = obj.getClass();
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Throwable th) {
            C3305g.m2370a(th);
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m2478a(Object obj, String str, RunnableC3303e runnableC3303e) {
        FileChannel channel;
        boolean zM2351a;
        synchronized (obj) {
            FileChannel fileChannel = null;
            fileLockLock = null;
            FileLock fileLockLock = null;
            FileChannel fileChannel2 = null;
            boolean zM2351a2 = false;
            if (f1428d) {
                int iNativeOpenFile = JNIBridge.nativeOpenFile(str);
                if (iNativeOpenFile < 0) {
                    C3299a.m2320a("crashsdk", "Can not open file: " + str, null);
                    return false;
                }
                try {
                    boolean zNativeLockFile = JNIBridge.nativeLockFile(iNativeOpenFile, true);
                    try {
                        zM2351a = runnableC3303e.m2351a();
                        return zM2351a;
                    } finally {
                        if (zNativeLockFile) {
                            JNIBridge.nativeLockFile(iNativeOpenFile, false);
                        }
                    }
                } finally {
                    JNIBridge.nativeCloseFile(iNativeOpenFile);
                }
            }
            File file = new File(str);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (Exception e4) {
                    C3305g.m2370a(e4);
                }
            }
            try {
                try {
                    channel = new RandomAccessFile(file, "rw").getChannel();
                } catch (Throwable th) {
                    th = th;
                    C3305g.m2368a(fileChannel2);
                    throw th;
                }
            } catch (Exception e5) {
                try {
                    C3305g.m2370a(e5);
                    channel = null;
                } catch (Exception e6) {
                    e = e6;
                    C3305g.m2370a(e);
                    C3305g.m2368a(fileChannel);
                    zM2351a = zM2351a2;
                    return zM2351a;
                }
            }
            if (channel != null) {
                try {
                    try {
                        fileLockLock = channel.lock();
                    } catch (Exception e7) {
                        try {
                            C3305g.m2370a(e7);
                        } catch (Exception e8) {
                            e = e8;
                            fileChannel = channel;
                            C3305g.m2370a(e);
                            C3305g.m2368a(fileChannel);
                            zM2351a = zM2351a2;
                            return zM2351a;
                        }
                    }
                } catch (Throwable th2) {
                    fileChannel2 = channel;
                    th = th2;
                    C3305g.m2368a(fileChannel2);
                    throw th;
                }
            }
            try {
                zM2351a2 = runnableC3303e.m2351a();
                C3305g.m2368a(channel);
                zM2351a = zM2351a2;
                return zM2351a;
            } finally {
                if (fileLockLock != null) {
                    try {
                        fileLockLock.release();
                    } catch (Exception e9) {
                        C3305g.m2370a(e9);
                    }
                }
            }
        }
    }
}
