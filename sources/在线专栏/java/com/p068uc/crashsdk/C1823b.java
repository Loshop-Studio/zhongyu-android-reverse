package com.p068uc.crashsdk;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.util.Log;
import anet.channel.entity.EventType;
import com.p068uc.crashsdk.p069a.C1815a;
import com.p068uc.crashsdk.p069a.C1820f;
import com.p068uc.crashsdk.p069a.C1821g;
import com.p068uc.crashsdk.p069a.C1822h;
import com.p068uc.crashsdk.p069a.RunnableC1819e;
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
import org.android.agoo.common.AgooConstants;

/* renamed from: com.uc.crashsdk.b */
/* loaded from: classes.dex */
public class C1823b {

    /* renamed from: A */
    private static boolean f7981A = false;

    /* renamed from: B */
    private static boolean f7982B = false;

    /* renamed from: C */
    private static boolean f7983C = false;

    /* renamed from: D */
    private static boolean f7984D = false;

    /* renamed from: E */
    private static boolean f7985E = false;

    /* renamed from: G */
    private static String f7987G = null;

    /* renamed from: H */
    private static int f7988H = 0;

    /* renamed from: I */
    private static boolean f7989I = false;

    /* renamed from: J */
    private static boolean f7990J = false;

    /* renamed from: K */
    private static boolean f7991K = true;

    /* renamed from: L */
    private static RandomAccessFile f7992L = null;

    /* renamed from: M */
    private static boolean f7993M = false;

    /* renamed from: O */
    private static String f7995O = null;

    /* renamed from: P */
    private static boolean f7996P = false;

    /* renamed from: Q */
    private static volatile Object[] f7997Q = null;

    /* renamed from: a */
    public static boolean f8007a = false;

    /* renamed from: b */
    public static boolean f8018b = false;

    /* renamed from: c */
    public static boolean f8019c = false;

    /* renamed from: d */
    public static boolean f8020d = false;

    /* renamed from: f */
    public static boolean f8022f = false;

    /* renamed from: g */
    public static boolean f8023g = true;

    /* renamed from: h */
    public static boolean f8024h = false;

    /* renamed from: i */
    static final /* synthetic */ boolean f8025i = true;

    /* renamed from: j */
    private static String f8026j = null;

    /* renamed from: k */
    private static String f8027k = null;

    /* renamed from: l */
    private static String f8028l = null;

    /* renamed from: m */
    private static String f8029m = null;

    /* renamed from: n */
    private static String f8030n = null;

    /* renamed from: o */
    private static String f8031o = null;

    /* renamed from: p */
    private static String f8032p = null;

    /* renamed from: q */
    private static String f8033q = null;

    /* renamed from: r */
    private static String f8034r = null;

    /* renamed from: s */
    private static String f8035s = null;

    /* renamed from: t */
    private static String f8036t = null;

    /* renamed from: u */
    private static String f8037u = null;

    /* renamed from: v */
    private static String f8038v = null;

    /* renamed from: w */
    private static boolean f8039w = false;

    /* renamed from: x */
    private static boolean f8040x = false;

    /* renamed from: y */
    private static volatile boolean f8041y = false;

    /* renamed from: z */
    private static boolean f8042z = false;

    /* renamed from: e */
    public static final Object f8021e = new Object();

    /* renamed from: F */
    private static final Object f7986F = new Object();

    /* renamed from: N */
    private static final Object f7994N = new Object();

    /* renamed from: R */
    private static Runnable f7998R = new RunnableC1819e(101);

    /* renamed from: S */
    private static boolean f7999S = false;

    /* renamed from: T */
    private static long f8000T = 0;

    /* renamed from: U */
    private static final Object f8001U = new Object();

    /* renamed from: V */
    private static long f8002V = 0;

    /* renamed from: W */
    private static boolean f8003W = false;

    /* renamed from: X */
    private static boolean f8004X = false;

    /* renamed from: Y */
    private static boolean f8005Y = false;

    /* renamed from: Z */
    private static long f8006Z = 0;

    /* renamed from: aa */
    private static final WeakHashMap<Activity, Integer> f8008aa = new WeakHashMap<>();

    /* renamed from: ab */
    private static boolean f8009ab = false;

    /* renamed from: ac */
    private static String f8010ac = null;

    /* renamed from: ad */
    private static boolean f8011ad = false;

    /* renamed from: ae */
    private static boolean f8012ae = false;

    /* renamed from: af */
    private static boolean f8013af = false;

    /* renamed from: ag */
    private static boolean f8014ag = false;

    /* renamed from: ah */
    private static boolean f8015ah = false;

    /* renamed from: ai */
    private static final Object f8016ai = new Object();

    /* renamed from: aj */
    private static PendingIntent f8017aj = null;

    /* renamed from: A */
    static void m6368A() {
        String str;
        if (!f8020d || (str = f8010ac) == null) {
            return;
        }
        JNIBridge.set(129, str);
    }

    /* renamed from: B */
    static String m6369B() {
        String str = f8010ac;
        return str == null ? "" : str;
    }

    /* renamed from: C */
    public static boolean m6370C() {
        if (!f8011ad) {
            if (!C1821g.m6298a(C1814a.f7901a) && C1814a.f7901a.equals(C1826e.m6547h())) {
                f8012ae = true;
                if (f8020d) {
                    JNIBridge.set(2, true);
                }
            }
            f8011ad = true;
        }
        return f8012ae;
    }

    /* renamed from: D */
    static void m6371D() {
        f8013af = true;
        if (f8020d) {
            JNIBridge.set(34, true);
        }
    }

    /* renamed from: E */
    public static boolean m6372E() {
        return f8013af;
    }

    /* renamed from: F */
    public static int m6373F() {
        boolean zM6385R = m6385R();
        return m6426q() ? zM6385R ? 3 : 6 : m6425p() ? zM6385R ? 2 : 5 : zM6385R ? 4 : 1;
    }

    /* renamed from: G */
    public static int m6374G() {
        boolean zM6386S = m6386S();
        boolean zM6387T = m6387T();
        boolean zM6388U = m6388U();
        if (m6426q()) {
            if (zM6386S) {
                return 12;
            }
            if (zM6387T) {
                return 14;
            }
            return zM6388U ? 16 : 98;
        }
        if (!m6425p()) {
            return 1;
        }
        if (zM6386S) {
            return 11;
        }
        if (zM6387T) {
            return 13;
        }
        return zM6388U ? 15 : 97;
    }

    /* renamed from: H */
    static void m6375H() {
        if (f8020d) {
            JNIBridge.nativeSet(27, f7988H, AgooConstants.ACK_PACK_NULL, null);
            JNIBridge.set(30, f7991K);
        }
    }

    /* renamed from: I */
    public static boolean m6376I() {
        if (!f8015ah) {
            synchronized (f8016ai) {
                if (!f8015ah) {
                    f8014ag = m6403ab();
                    f8015ah = true;
                }
            }
        }
        return f8014ag;
    }

    /* renamed from: J */
    public static void m6377J() {
        if (C1826e.m6452E() || m6376I() || f8017aj != null || C1828g.m6657h() < 0) {
            return;
        }
        try {
            Context contextM6284a = C1821g.m6284a();
            Intent launchIntentForPackage = contextM6284a.getPackageManager().getLaunchIntentForPackage(contextM6284a.getPackageName());
            launchIntentForPackage.addFlags(335544320);
            f8017aj = PendingIntent.getActivity(contextM6284a, 0, launchIntentForPackage, 0);
        } catch (Throwable th) {
            C1821g.m6293a(th);
        }
    }

    /* renamed from: K */
    static boolean m6378K() {
        if (f8017aj == null) {
            C1815a.m6244b("Restart intent is null!");
            return false;
        }
        try {
            C1815a.m6242a("crashsdk", "restarting ...");
            ((AlarmManager) C1821g.m6284a().getSystemService("alarm")).set(1, System.currentTimeMillis() + 200, f8017aj);
            return true;
        } catch (Throwable th) {
            C1821g.m6293a(th);
            return false;
        }
    }

    /* renamed from: L */
    static /* synthetic */ boolean m6379L() {
        f8009ab = true;
        return true;
    }

    /* renamed from: N */
    private static String m6381N() {
        if (f8026j == null) {
            f8026j = m6410c("ss");
        }
        return f8026j;
    }

    /* renamed from: O */
    private static String m6382O() {
        if (f8028l == null) {
            f8028l = m6410c("ctn");
        }
        return f8028l;
    }

    /* renamed from: P */
    private static String m6383P() {
        if (f8029m == null) {
            f8029m = m6410c("cta");
        }
        return f8029m;
    }

    /* renamed from: Q */
    private static void m6384Q() {
        if (f8041y || f8040x) {
            return;
        }
        synchronized (f7986F) {
            if (f8041y) {
                return;
            }
            m6413d(C1828g.m6636U());
            String strM6422m = m6422m();
            File file = new File(m6404b());
            File file2 = new File(m6382O());
            f8042z = "f".equals(strM6422m);
            f7981A = "b".equals(strM6422m);
            f7983C = file.exists();
            boolean zExists = file2.exists();
            f7984D = zExists;
            boolean z3 = f7983C || zExists;
            f7982B = z3;
            if (!z3 && (f8042z || f7981A)) {
                boolean zM6424o = m6424o();
                f7985E = zM6424o;
                f7982B = zM6424o;
            }
            try {
                if (m6432w()) {
                    m6390W();
                }
            } catch (Throwable th) {
                C1821g.m6293a(th);
            }
            f8041y = true;
        }
    }

    /* renamed from: R */
    private static boolean m6385R() {
        m6384Q();
        return f7982B;
    }

    /* renamed from: S */
    private static boolean m6386S() {
        m6384Q();
        return f7983C;
    }

    /* renamed from: T */
    private static boolean m6387T() {
        m6384Q();
        return f7984D;
    }

    /* renamed from: U */
    private static boolean m6388U() {
        m6384Q();
        return f7985E;
    }

    /* renamed from: V */
    private static void m6389V() {
        if (f8020d) {
            JNIBridge.set(26, f8039w);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0041 -> B:29:0x0044). Please report as a decompilation issue!!! */
    /* renamed from: W */
    private static void m6390W() {
        if (!f7999S) {
            f7999S = true;
            try {
                new File(m6404b()).delete();
            } catch (Throwable th) {
                C1821g.m6293a(th);
            }
            try {
                new File(m6382O()).delete();
            } catch (Throwable th2) {
                C1821g.m6293a(th2);
            }
            try {
                if (f8020d) {
                    JNIBridge.cmd(16);
                } else {
                    new File(m6383P()).delete();
                }
            } catch (Throwable th3) {
                C1821g.m6293a(th3);
            }
        }
        Object[] objArrM6392Y = m6392Y();
        if (!objArrM6392Y[0].equals(f7995O) && f7997Q == null) {
            m6399a(objArrM6392Y);
        } else {
            f7996P = true;
            m6391X();
        }
    }

    /* renamed from: X */
    private static void m6391X() {
        if (!C1820f.m6282b(f7998R)) {
            C1820f.m6279a(1, f7998R);
            return;
        }
        Object[] objArr = f7997Q;
        if (objArr == null || !m6392Y()[0].equals(objArr[0])) {
            C1820f.m6278a(f7998R);
            C1820f.m6279a(1, f7998R);
        }
    }

    /* renamed from: Y */
    private static Object[] m6392Y() {
        synchronized (f8001U) {
            long j4 = f8002V + 1;
            f8002V = j4;
            if (f8039w) {
                return new Object[]{"e", Long.valueOf(j4)};
            }
            if (m6434y()) {
                return new Object[]{"f", Long.valueOf(f8002V)};
            }
            return new Object[]{"b", Long.valueOf(f8002V)};
        }
    }

    /* renamed from: Z */
    private static Object m6393Z() {
        Object objM6394a;
        Object objM6394a2 = m6394a((Application) C1821g.m6284a(), (Class<?>) Application.class, "mLoadedApk");
        if (objM6394a2 != null && (objM6394a = m6394a(objM6394a2, (Class<?>) null, "mActivityThread")) != null) {
            return objM6394a;
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                return declaredMethod.invoke(null, new Object[0]);
            }
        } catch (Throwable th) {
            C1821g.m6293a(th);
        }
        return null;
    }

    /* renamed from: a */
    static String m6395a() {
        String str = f7987G;
        if (str != null) {
            return str;
        }
        String strM6547h = C1826e.m6547h();
        if (C1821g.m6298a(strM6547h)) {
            f7987G = "LLUN";
        } else {
            int i4 = 0;
            if (strM6547h.length() > 48) {
                int length = strM6547h.length() - 48;
                strM6547h = strM6547h.substring(0, 48);
                i4 = length;
            }
            StringBuilder sb = new StringBuilder();
            byte[] bytes = strM6547h.getBytes();
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
            f7987G = sb.toString();
        }
        return f7987G;
    }

    /* renamed from: aa */
    private static boolean m6402aa() {
        String strM6285a = C1821g.m6285a(new File("/proc/self/cgroup"), EventType.AUTH_SUCC, false);
        if (C1821g.m6298a(strM6285a)) {
            return false;
        }
        return strM6285a.contains("/bg_non_interactive") || strM6285a.contains("/background");
    }

    /* renamed from: ab */
    private static boolean m6403ab() {
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
            C1821g.m6293a(th);
        }
        int iMyUid = Process.myUid() % 100000;
        return iMyUid >= 99000 && iMyUid <= 99999;
    }

    /* renamed from: c */
    private static String m6410c(String str) {
        return C1828g.m6636U() + m6395a() + "." + str;
    }

    /* renamed from: d */
    static String m6412d() {
        if (f8037u == null) {
            f8037u = m6410c("bati");
        }
        return f8037u;
    }

    /* renamed from: e */
    static String m6414e() {
        if (f8038v == null) {
            f8038v = m6410c("hdr");
        }
        return f8038v;
    }

    /* renamed from: f */
    static String m6415f() {
        if (f8032p == null) {
            f8032p = C1828g.m6636U() + "up";
        }
        return f8032p;
    }

    /* renamed from: g */
    public static String m6416g() {
        if (f8033q == null) {
            f8033q = C1828g.m6636U() + "authu";
        }
        return f8033q;
    }

    /* renamed from: h */
    public static String m6417h() {
        if (f8034r == null) {
            f8034r = C1828g.m6636U() + "statu";
        }
        return f8034r;
    }

    /* renamed from: i */
    static String m6418i() {
        if (f8035s == null) {
            f8035s = C1828g.m6636U() + "poli";
        }
        return f8035s;
    }

    /* renamed from: j */
    static String m6419j() {
        if (f8036t == null) {
            f8036t = C1828g.m6636U() + "ver";
        }
        return f8036t;
    }

    /* renamed from: k */
    public static String m6420k() {
        return C1828g.m6636U() + "bvu";
    }

    /* renamed from: l */
    static String m6421l() {
        return C1828g.m6636U() + "fds";
    }

    /* renamed from: m */
    static String m6422m() {
        return C1821g.m6285a(new File(m6381N()), 8, false);
    }

    /* renamed from: n */
    static boolean m6423n() {
        return f8040x;
    }

    /* renamed from: o */
    static boolean m6424o() {
        if (!f7989I) {
            if (f8020d) {
                f7990J = JNIBridge.cmd(15) == 1;
            } else {
                f7990J = new File(m6383P()).exists();
            }
            f7989I = true;
        }
        return f7990J;
    }

    /* renamed from: p */
    static boolean m6425p() {
        m6384Q();
        return f8042z;
    }

    /* renamed from: q */
    static boolean m6426q() {
        m6384Q();
        return f7981A;
    }

    /* renamed from: r */
    static boolean m6427r() {
        return f8039w;
    }

    /* renamed from: s */
    public static void m6428s() {
        boolean z3;
        m6413d(C1828g.m6636U());
        f8040x = true;
        f8042z = false;
        f7981A = false;
        f7982B = false;
        f7983C = false;
        f7984D = false;
        f7985E = false;
        String[] strArr = {".st", ".wa", ".callback", ".ctn", ".ctj", ".cta", ".signal"};
        String[] strArr2 = {"up", "authu", "statu", "poli"};
        File[] fileArrListFiles = new File(C1828g.m6636U()).listFiles();
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
                    C1815a.m6242a("crashsdk", "delete file: " + file.getPath());
                    C1821g.m6295a(file);
                }
            }
        }
        m6390W();
    }

    /* renamed from: t */
    public static void m6429t() {
        if (f8039w) {
            return;
        }
        f8039w = true;
        if (m6376I() || C1826e.m6571t()) {
            return;
        }
        m6413d(C1828g.m6636U());
        m6389V();
        m6390W();
    }

    /* renamed from: u */
    static boolean m6430u() {
        return m6413d(C1828g.m6636U());
    }

    /* renamed from: v */
    static boolean m6431v() {
        return m6413d(C1828g.m6637V());
    }

    /* renamed from: w */
    static boolean m6432w() {
        return f8003W || !m6402aa();
    }

    /* renamed from: x */
    public static boolean m6433x() {
        return f8004X || !m6402aa();
    }

    /* renamed from: y */
    static boolean m6434y() {
        return f8004X && !f8039w;
    }

    /* renamed from: z */
    static void m6435z() {
        C1820f.m6279a(2, new RunnableC1819e(100));
    }

    /* renamed from: b */
    static String m6404b() {
        if (f8027k == null) {
            f8027k = m6410c("ctj");
        }
        return f8027k;
    }

    /* renamed from: c */
    static String m6409c() {
        if (f8030n == null) {
            f8030n = m6410c("st");
        }
        return f8030n;
    }

    /* renamed from: d */
    private static boolean m6413d(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (file.isDirectory()) {
            return true;
        }
        C1815a.m6243a("crashsdk", "Crash log directory was placed by a file!", null);
        if (!file.delete()) {
            return false;
        }
        file.mkdirs();
        return true;
    }

    /* renamed from: b */
    public static void m6408b(boolean z3) {
        if (C1826e.m6571t()) {
            return;
        }
        if (z3 && f8039w) {
            if (C1828g.m6628M()) {
                Log.v("crashsdk", "setForeground, reset sExited to false!!!");
            }
            f8039w = false;
            m6389V();
        }
        boolean z4 = C1826e.m6452E() || m6376I();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (f8003W && !f8004X && z3) {
            long j4 = f8006Z;
            if (j4 != 0 && !z4 && jCurrentTimeMillis - j4 > 1800000) {
                C1820f.m6280a(1, new RunnableC1819e(104), 1000L);
            }
        }
        f8006Z = jCurrentTimeMillis;
        f8004X = z3;
        if (z3) {
            f8003W = true;
        }
        if (f8020d) {
            JNIBridge.nativeSetForeground(z3);
        }
        if (f8039w || z4) {
            return;
        }
        m6384Q();
        m6390W();
        if (z3) {
            C1814a.m6220a(false);
            if (!f8005Y) {
                C1826e.m6448A();
                f8005Y = true;
            }
        }
        if (!f7993M) {
            m6391X();
        }
        C1826e.m6524c(z3);
    }

    /* renamed from: c */
    public static boolean m6411c(int i4) {
        return (i4 & f7988H) != 0;
    }

    /* renamed from: a */
    public static void m6398a(boolean z3) {
        f7991K = z3;
        if (f8020d) {
            JNIBridge.set(30, z3);
        }
    }

    /* renamed from: a */
    public static String m6396a(String str) {
        return "debug.crs." + str;
    }

    /* renamed from: a */
    private static void m6399a(Object[] objArr) {
        f7997Q = objArr;
        synchronized (f7994N) {
            String str = (String) objArr[0];
            long jLongValue = ((Long) objArr[1]).longValue();
            if (jLongValue < f8000T) {
                C1815a.m6246c("crashsdk", String.format(Locale.US, "Update state generation %d, last is: %d", Long.valueOf(jLongValue), Long.valueOf(f8000T)));
                return;
            }
            f8000T = jLongValue;
            String strM6381N = m6381N();
            if (f8020d) {
                RandomAccessFile randomAccessFile = f7992L;
                if (randomAccessFile != null) {
                    C1821g.m6291a(randomAccessFile);
                    f7992L = null;
                }
                boolean zNativeChangeState = JNIBridge.nativeChangeState(strM6381N, str, f7993M);
                f7993M = false;
                if (!zNativeChangeState) {
                    C1815a.m6244b("write state failed: " + str);
                }
            } else {
                RandomAccessFile randomAccessFile2 = f7992L;
                if (randomAccessFile2 == null || f7993M) {
                    if (randomAccessFile2 != null) {
                        C1821g.m6291a(randomAccessFile2);
                        f7992L = null;
                    }
                    try {
                        RandomAccessFile randomAccessFile3 = new RandomAccessFile(strM6381N, "rw");
                        f7992L = randomAccessFile3;
                        randomAccessFile3.seek(0L);
                        f7993M = false;
                    } catch (Exception e4) {
                        C1821g.m6293a(e4);
                    }
                }
                try {
                    f7992L.write(str.getBytes());
                    f7992L.seek(0L);
                } catch (Exception e5) {
                    C1821g.m6293a(e5);
                }
            }
            f7995O = str;
            f7997Q = null;
        }
    }

    /* renamed from: b */
    public static void m6406b(int i4) {
        f7988H = i4;
        m6375H();
    }

    /* renamed from: b */
    static void m6407b(Context context) {
        C1815a.m6241a("Restart APP");
        if (context == null) {
            return;
        }
        if (f8031o == null) {
            f8031o = m6410c("rt");
        }
        File file = new File(f8031o);
        long j4 = -1;
        try {
            j4 = Long.parseLong(C1821g.m6308d(file));
        } catch (Throwable th) {
            C1821g.m6293a(th);
        }
        boolean z3 = false;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        if (C1828g.m6657h() >= 0 && (j4 <= 0 || jCurrentTimeMillis - j4 > C1828g.m6657h())) {
            m6413d(C1828g.m6636U());
            C1821g.m6296a(file, String.valueOf(jCurrentTimeMillis));
            z3 = true;
        }
        C1815a.m6241a("lastTime: " + j4 + ", currentTime: " + jCurrentTimeMillis + ", needRestart: " + z3);
        if (z3) {
            try {
                C1825d.m6443a(true);
            } catch (Throwable th2) {
                C1821g.m6293a(th2);
            }
            m6378K();
        }
    }

    /* renamed from: a */
    public static boolean m6400a(Context context) {
        try {
            ((Application) context).registerActivityLifecycleCallbacks(new C1824c());
            if (!C1828g.m6625J()) {
                return true;
            }
            m6435z();
            return true;
        } catch (Throwable th) {
            C1821g.m6293a(th);
            return false;
        }
    }

    /* renamed from: a */
    public static void m6397a(int i4) {
        Object objM6394a;
        Activity activity;
        int i5;
        boolean z3 = false;
        boolean z4 = true;
        switch (i4) {
            case 100:
                Object objM6393Z = m6393Z();
                if (objM6393Z == null || (objM6394a = m6394a(objM6393Z, (Class<?>) null, "mActivities")) == null) {
                    return;
                }
                try {
                    Iterator it = ((Map) objM6394a).entrySet().iterator();
                    boolean z5 = false;
                    while (it.hasNext()) {
                        Object value = ((Map.Entry) it.next()).getValue();
                        if (value != null && (activity = (Activity) m6394a(value, (Class<?>) null, AgooConstants.OPEN_ACTIIVTY_NAME)) != null) {
                            boolean zBooleanValue = ((Boolean) m6394a(value, (Class<?>) null, "paused")).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) m6394a(value, (Class<?>) null, "stopped")).booleanValue();
                            WeakHashMap<Activity, Integer> weakHashMap = f8008aa;
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
                        m6408b(z5);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    C1821g.m6293a(th);
                    return;
                }
            case 101:
                try {
                    if (new File(m6381N()).exists()) {
                        z4 = false;
                    }
                    f7993M = z4;
                    if (z4 || f7996P) {
                        m6399a(m6392Y());
                        f7996P = false;
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    C1821g.m6293a(th2);
                    return;
                }
            case 102:
                C1820f.m6279a(1, new RunnableC1819e(103));
                return;
            case 103:
                try {
                    C1821g.m6295a(new File(m6383P()));
                    return;
                } catch (Throwable th3) {
                    C1821g.m6293a(th3);
                    return;
                }
            case 104:
                C1822h.m6347d();
                C1827f.m6595a(102);
                if (m6370C()) {
                    C1826e.m6449B();
                    return;
                }
                return;
            default:
                if (!f8025i) {
                    throw new AssertionError();
                }
                return;
        }
    }

    /* renamed from: a */
    private static Object m6394a(Object obj, Class<?> cls, String str) {
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
            C1821g.m6293a(th);
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m6401a(Object obj, String str, RunnableC1819e runnableC1819e) {
        FileChannel channel;
        boolean zM6274a;
        synchronized (obj) {
            FileChannel fileChannel = null;
            fileLockLock = null;
            FileLock fileLockLock = null;
            FileChannel fileChannel2 = null;
            boolean zM6274a2 = false;
            if (f8020d) {
                int iNativeOpenFile = JNIBridge.nativeOpenFile(str);
                if (iNativeOpenFile < 0) {
                    C1815a.m6243a("crashsdk", "Can not open file: " + str, null);
                    return false;
                }
                try {
                    boolean zNativeLockFile = JNIBridge.nativeLockFile(iNativeOpenFile, true);
                    try {
                        zM6274a = runnableC1819e.m6274a();
                        return zM6274a;
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
                    C1821g.m6293a(e4);
                }
            }
            try {
                try {
                    channel = new RandomAccessFile(file, "rw").getChannel();
                } catch (Throwable th) {
                    th = th;
                    C1821g.m6291a(fileChannel2);
                    throw th;
                }
            } catch (Exception e5) {
                try {
                    C1821g.m6293a(e5);
                    channel = null;
                } catch (Exception e6) {
                    e = e6;
                    C1821g.m6293a(e);
                    C1821g.m6291a(fileChannel);
                    zM6274a = zM6274a2;
                    return zM6274a;
                }
            }
            if (channel != null) {
                try {
                    try {
                        fileLockLock = channel.lock();
                    } catch (Exception e7) {
                        try {
                            C1821g.m6293a(e7);
                        } catch (Exception e8) {
                            e = e8;
                            fileChannel = channel;
                            C1821g.m6293a(e);
                            C1821g.m6291a(fileChannel);
                            zM6274a = zM6274a2;
                            return zM6274a;
                        }
                    }
                } catch (Throwable th2) {
                    fileChannel2 = channel;
                    th = th2;
                    C1821g.m6291a(fileChannel2);
                    throw th;
                }
            }
            try {
                zM6274a2 = runnableC1819e.m6274a();
                C1821g.m6291a(channel);
                zM6274a = zM6274a2;
                return zM6274a;
            } finally {
                if (fileLockLock != null) {
                    try {
                        fileLockLock.release();
                    } catch (Exception e9) {
                        C1821g.m6293a(e9);
                    }
                }
            }
        }
    }
}
