package com.p071uc.crashsdk;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import androidx.core.app.NotificationCompat;
import com.p071uc.crashsdk.p072a.C6738a;
import com.p071uc.crashsdk.p072a.C6743f;
import com.p071uc.crashsdk.p072a.C6744g;
import com.p071uc.crashsdk.p072a.C6745h;
import com.p071uc.crashsdk.p072a.RunnableC6742e;
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
/* loaded from: classes4.dex */
public class C6746b {

    /* renamed from: A */
    private static boolean f6387A = false;

    /* renamed from: B */
    private static boolean f6388B = false;

    /* renamed from: C */
    private static boolean f6389C = false;

    /* renamed from: D */
    private static boolean f6390D = false;

    /* renamed from: E */
    private static boolean f6391E = false;

    /* renamed from: G */
    private static String f6393G = null;

    /* renamed from: H */
    private static int f6394H = 0;

    /* renamed from: I */
    private static boolean f6395I = false;

    /* renamed from: J */
    private static boolean f6396J = false;

    /* renamed from: K */
    private static boolean f6397K = true;

    /* renamed from: L */
    private static RandomAccessFile f6398L = null;

    /* renamed from: M */
    private static boolean f6399M = false;

    /* renamed from: O */
    private static String f6401O = null;

    /* renamed from: P */
    private static boolean f6402P = false;

    /* renamed from: Q */
    private static volatile Object[] f6403Q = null;

    /* renamed from: a */
    public static boolean f6413a = false;

    /* renamed from: b */
    public static boolean f6424b = false;

    /* renamed from: c */
    public static boolean f6425c = false;

    /* renamed from: d */
    public static boolean f6426d = false;

    /* renamed from: f */
    public static boolean f6428f = false;

    /* renamed from: g */
    public static boolean f6429g = true;

    /* renamed from: h */
    public static boolean f6430h = false;

    /* renamed from: i */
    static final /* synthetic */ boolean f6431i = true;

    /* renamed from: j */
    private static String f6432j = null;

    /* renamed from: k */
    private static String f6433k = null;

    /* renamed from: l */
    private static String f6434l = null;

    /* renamed from: m */
    private static String f6435m = null;

    /* renamed from: n */
    private static String f6436n = null;

    /* renamed from: o */
    private static String f6437o = null;

    /* renamed from: p */
    private static String f6438p = null;

    /* renamed from: q */
    private static String f6439q = null;

    /* renamed from: r */
    private static String f6440r = null;

    /* renamed from: s */
    private static String f6441s = null;

    /* renamed from: t */
    private static String f6442t = null;

    /* renamed from: u */
    private static String f6443u = null;

    /* renamed from: v */
    private static String f6444v = null;

    /* renamed from: w */
    private static boolean f6445w = false;

    /* renamed from: x */
    private static boolean f6446x = false;

    /* renamed from: y */
    private static volatile boolean f6447y = false;

    /* renamed from: z */
    private static boolean f6448z = false;

    /* renamed from: e */
    public static final Object f6427e = new Object();

    /* renamed from: F */
    private static final Object f6392F = new Object();

    /* renamed from: N */
    private static final Object f6400N = new Object();

    /* renamed from: R */
    private static Runnable f6404R = new RunnableC6742e(101);

    /* renamed from: S */
    private static boolean f6405S = false;

    /* renamed from: T */
    private static long f6406T = 0;

    /* renamed from: U */
    private static final Object f6407U = new Object();

    /* renamed from: V */
    private static long f6408V = 0;

    /* renamed from: W */
    private static boolean f6409W = false;

    /* renamed from: X */
    private static boolean f6410X = false;

    /* renamed from: Y */
    private static boolean f6411Y = false;

    /* renamed from: Z */
    private static long f6412Z = 0;

    /* renamed from: aa */
    private static final WeakHashMap<Activity, Integer> f6414aa = new WeakHashMap<>();

    /* renamed from: ab */
    private static boolean f6415ab = false;

    /* renamed from: ac */
    private static String f6416ac = null;

    /* renamed from: ad */
    private static boolean f6417ad = false;

    /* renamed from: ae */
    private static boolean f6418ae = false;

    /* renamed from: af */
    private static boolean f6419af = false;

    /* renamed from: ag */
    private static boolean f6420ag = false;

    /* renamed from: ah */
    private static boolean f6421ah = false;

    /* renamed from: ai */
    private static final Object f6422ai = new Object();

    /* renamed from: aj */
    private static PendingIntent f6423aj = null;

    /* renamed from: A */
    public static void m5689A() {
        String str;
        if (!f6426d || (str = f6416ac) == null) {
            return;
        }
        JNIBridge.set(129, str);
    }

    /* renamed from: B */
    public static String m5690B() {
        String str = f6416ac;
        return str == null ? "" : str;
    }

    /* renamed from: C */
    public static boolean m5691C() {
        if (!f6417ad) {
            if (!C6744g.m5619a(C6737a.f6307a) && C6737a.f6307a.equals(C6749e.m5868h())) {
                f6418ae = true;
                if (f6426d) {
                    JNIBridge.set(2, true);
                }
            }
            f6417ad = true;
        }
        return f6418ae;
    }

    /* renamed from: D */
    public static void m5692D() {
        f6419af = true;
        if (f6426d) {
            JNIBridge.set(34, true);
        }
    }

    /* renamed from: E */
    public static boolean m5693E() {
        return f6419af;
    }

    /* renamed from: F */
    public static int m5694F() {
        boolean zM5706R = m5706R();
        return m5747q() ? zM5706R ? 3 : 6 : m5746p() ? zM5706R ? 2 : 5 : zM5706R ? 4 : 1;
    }

    /* renamed from: G */
    public static int m5695G() {
        boolean zM5707S = m5707S();
        boolean zM5708T = m5708T();
        boolean zM5709U = m5709U();
        if (m5747q()) {
            if (zM5707S) {
                return 12;
            }
            if (zM5708T) {
                return 14;
            }
            return zM5709U ? 16 : 98;
        }
        if (!m5746p()) {
            return 1;
        }
        if (zM5707S) {
            return 11;
        }
        if (zM5708T) {
            return 13;
        }
        return zM5709U ? 15 : 97;
    }

    /* renamed from: H */
    public static void m5696H() {
        if (f6426d) {
            JNIBridge.nativeSet(27, f6394H, "12", null);
            JNIBridge.set(30, f6397K);
        }
    }

    /* renamed from: I */
    public static boolean m5697I() {
        if (!f6421ah) {
            synchronized (f6422ai) {
                try {
                    if (!f6421ah) {
                        f6420ag = m5724ab();
                        f6421ah = true;
                    }
                } finally {
                }
            }
        }
        return f6420ag;
    }

    /* renamed from: J */
    public static void m5698J() {
        if (C6749e.m5773E() || m5697I() || f6423aj != null || C6751g.m5978h() < 0) {
            return;
        }
        try {
            Context contextM5605a = C6744g.m5605a();
            Intent launchIntentForPackage = contextM5605a.getPackageManager().getLaunchIntentForPackage(contextM5605a.getPackageName());
            launchIntentForPackage.addFlags(335544320);
            f6423aj = PendingIntent.getActivity(contextM5605a, 0, launchIntentForPackage, 0);
        } catch (Throwable th) {
            C6744g.m5614a(th);
        }
    }

    /* renamed from: K */
    public static boolean m5699K() {
        if (f6423aj == null) {
            C6738a.m5565b("Restart intent is null!");
            return false;
        }
        try {
            C6738a.m5563a("crashsdk", "restarting ...");
            ((AlarmManager) C6744g.m5605a().getSystemService(NotificationCompat.CATEGORY_ALARM)).set(1, System.currentTimeMillis() + 200, f6423aj);
            return true;
        } catch (Throwable th) {
            C6744g.m5614a(th);
            return false;
        }
    }

    /* renamed from: L */
    public static /* synthetic */ boolean m5700L() {
        f6415ab = true;
        return true;
    }

    /* renamed from: N */
    private static String m5702N() {
        if (f6432j == null) {
            f6432j = m5731c("ss");
        }
        return f6432j;
    }

    /* renamed from: O */
    private static String m5703O() {
        if (f6434l == null) {
            f6434l = m5731c("ctn");
        }
        return f6434l;
    }

    /* renamed from: P */
    private static String m5704P() {
        if (f6435m == null) {
            f6435m = m5731c("cta");
        }
        return f6435m;
    }

    /* renamed from: Q */
    private static void m5705Q() {
        if (f6447y || f6446x) {
            return;
        }
        synchronized (f6392F) {
            try {
                if (f6447y) {
                    return;
                }
                m5734d(C6751g.m5957U());
                String strM5743m = m5743m();
                File file = new File(m5725b());
                File file2 = new File(m5703O());
                f6448z = "f".equals(strM5743m);
                f6387A = "b".equals(strM5743m);
                f6389C = file.exists();
                boolean zExists = file2.exists();
                f6390D = zExists;
                boolean z9 = f6389C || zExists;
                f6388B = z9;
                if (!z9 && (f6448z || f6387A)) {
                    boolean zM5745o = m5745o();
                    f6391E = zM5745o;
                    f6388B = zM5745o;
                }
                try {
                    if (m5753w()) {
                        m5711W();
                    }
                } catch (Throwable th) {
                    C6744g.m5614a(th);
                }
                f6447y = true;
            } finally {
            }
        }
    }

    /* renamed from: R */
    private static boolean m5706R() {
        m5705Q();
        return f6388B;
    }

    /* renamed from: S */
    private static boolean m5707S() {
        m5705Q();
        return f6389C;
    }

    /* renamed from: T */
    private static boolean m5708T() {
        m5705Q();
        return f6390D;
    }

    /* renamed from: U */
    private static boolean m5709U() {
        m5705Q();
        return f6391E;
    }

    /* renamed from: V */
    private static void m5710V() {
        if (f6426d) {
            JNIBridge.set(26, f6445w);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0042 -> B:30:0x0045). Please report as a decompilation issue!!! */
    /* renamed from: W */
    private static void m5711W() {
        if (!f6405S) {
            f6405S = true;
            try {
                new File(m5725b()).delete();
            } catch (Throwable th) {
                C6744g.m5614a(th);
            }
            try {
                new File(m5703O()).delete();
            } catch (Throwable th2) {
                C6744g.m5614a(th2);
            }
            try {
                if (f6426d) {
                    JNIBridge.cmd(16);
                } else {
                    new File(m5704P()).delete();
                }
            } catch (Throwable th3) {
                C6744g.m5614a(th3);
            }
        }
        Object[] objArrM5713Y = m5713Y();
        if (!objArrM5713Y[0].equals(f6401O) && f6403Q == null) {
            m5720a(objArrM5713Y);
        } else {
            f6402P = true;
            m5712X();
        }
    }

    /* renamed from: X */
    private static void m5712X() {
        if (!C6743f.m5603b(f6404R)) {
            C6743f.m5600a(1, f6404R);
            return;
        }
        Object[] objArr = f6403Q;
        if (objArr == null || !m5713Y()[0].equals(objArr[0])) {
            C6743f.m5599a(f6404R);
            C6743f.m5600a(1, f6404R);
        }
    }

    /* renamed from: Y */
    private static Object[] m5713Y() {
        synchronized (f6407U) {
            try {
                long j9 = f6408V + 1;
                f6408V = j9;
                if (f6445w) {
                    return new Object[]{"e", Long.valueOf(j9)};
                }
                if (m5755y()) {
                    return new Object[]{"f", Long.valueOf(f6408V)};
                }
                return new Object[]{"b", Long.valueOf(f6408V)};
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: Z */
    private static Object m5714Z() {
        Object objM5715a;
        Object objM5715a2 = m5715a((Application) C6744g.m5605a(), (Class<?>) Application.class, "mLoadedApk");
        if (objM5715a2 != null && (objM5715a = m5715a(objM5715a2, (Class<?>) null, "mActivityThread")) != null) {
            return objM5715a;
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", null);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                return declaredMethod.invoke(null, null);
            }
        } catch (Throwable th) {
            C6744g.m5614a(th);
        }
        return null;
    }

    /* renamed from: a */
    public static String m5716a() {
        String str = f6393G;
        if (str != null) {
            return str;
        }
        String strM5868h = C6749e.m5868h();
        if (C6744g.m5619a(strM5868h)) {
            f6393G = "LLUN";
        } else {
            int i9 = 0;
            if (strM5868h.length() > 48) {
                int length = strM5868h.length() - 48;
                strM5868h = strM5868h.substring(0, 48);
                i9 = length;
            }
            StringBuilder sb = new StringBuilder();
            byte[] bytes = strM5868h.getBytes();
            for (int length2 = bytes.length - 1; length2 >= 0; length2--) {
                byte b10 = bytes[length2];
                if (b10 == 46) {
                    sb.append('0');
                } else if (b10 == 58) {
                    sb.append('1');
                } else if (b10 >= 97 && b10 <= 122) {
                    sb.append((char) (b10 - 32));
                } else if (b10 >= 65 && b10 <= 90) {
                    sb.append((char) b10);
                } else if (b10 < 48 || b10 > 57) {
                    sb.append('2');
                } else {
                    sb.append((char) b10);
                }
            }
            if (i9 > 0) {
                sb.append(String.valueOf(i9));
            }
            f6393G = sb.toString();
        }
        return f6393G;
    }

    /* renamed from: aa */
    private static boolean m5723aa() {
        String strM5606a = C6744g.m5606a(new File("/proc/self/cgroup"), 512, false);
        if (C6744g.m5619a(strM5606a)) {
            return false;
        }
        return strM5606a.contains("/bg_non_interactive") || strM5606a.contains("/background");
    }

    /* renamed from: ab */
    private static boolean m5724ab() {
        try {
            Method declaredMethod = Process.class.getDeclaredMethod("isIsolated", null);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, null);
                if (objInvoke != null && (objInvoke instanceof Boolean)) {
                    return ((Boolean) objInvoke).booleanValue();
                }
            }
        } catch (Throwable th) {
            C6744g.m5614a(th);
        }
        int iMyUid = Process.myUid() % 100000;
        return iMyUid >= 99000 && iMyUid <= 99999;
    }

    /* renamed from: c */
    private static String m5731c(String str) {
        return C6751g.m5957U() + m5716a() + "." + str;
    }

    /* renamed from: d */
    public static String m5733d() {
        if (f6443u == null) {
            f6443u = m5731c("bati");
        }
        return f6443u;
    }

    /* renamed from: e */
    public static String m5735e() {
        if (f6444v == null) {
            f6444v = m5731c("hdr");
        }
        return f6444v;
    }

    /* renamed from: f */
    public static String m5736f() {
        if (f6438p == null) {
            f6438p = C6751g.m5957U() + "up";
        }
        return f6438p;
    }

    /* renamed from: g */
    public static String m5737g() {
        if (f6439q == null) {
            f6439q = C6751g.m5957U() + "authu";
        }
        return f6439q;
    }

    /* renamed from: h */
    public static String m5738h() {
        if (f6440r == null) {
            f6440r = C6751g.m5957U() + "statu";
        }
        return f6440r;
    }

    /* renamed from: i */
    public static String m5739i() {
        if (f6441s == null) {
            f6441s = C6751g.m5957U() + "poli";
        }
        return f6441s;
    }

    /* renamed from: j */
    public static String m5740j() {
        if (f6442t == null) {
            f6442t = C6751g.m5957U() + "ver";
        }
        return f6442t;
    }

    /* renamed from: k */
    public static String m5741k() {
        return C6751g.m5957U() + "bvu";
    }

    /* renamed from: l */
    public static String m5742l() {
        return C6751g.m5957U() + "fds";
    }

    /* renamed from: m */
    public static String m5743m() {
        return C6744g.m5606a(new File(m5702N()), 8, false);
    }

    /* renamed from: n */
    public static boolean m5744n() {
        return f6446x;
    }

    /* renamed from: o */
    public static boolean m5745o() {
        if (!f6395I) {
            if (f6426d) {
                f6396J = JNIBridge.cmd(15) == 1;
            } else {
                f6396J = new File(m5704P()).exists();
            }
            f6395I = true;
        }
        return f6396J;
    }

    /* renamed from: p */
    public static boolean m5746p() {
        m5705Q();
        return f6448z;
    }

    /* renamed from: q */
    public static boolean m5747q() {
        m5705Q();
        return f6387A;
    }

    /* renamed from: r */
    public static boolean m5748r() {
        return f6445w;
    }

    /* renamed from: s */
    public static void m5749s() {
        boolean z9;
        m5734d(C6751g.m5957U());
        f6446x = true;
        f6448z = false;
        f6387A = false;
        f6388B = false;
        f6389C = false;
        f6390D = false;
        f6391E = false;
        String[] strArr = {".st", ".wa", ".callback", ".ctn", ".ctj", ".cta", ".signal"};
        String[] strArr2 = {"up", "authu", "statu", "poli"};
        File[] fileArrListFiles = new File(C6751g.m5957U()).listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                String name = file.getName();
                int i9 = 0;
                while (true) {
                    if (i9 >= 7) {
                        z9 = false;
                        break;
                    } else {
                        if (name.endsWith(strArr[i9])) {
                            z9 = true;
                            break;
                        }
                        i9++;
                    }
                }
                if (!z9) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 4) {
                            break;
                        }
                        if (name.equals(strArr2[i10])) {
                            z9 = true;
                            break;
                        }
                        i10++;
                    }
                }
                if (z9) {
                    C6738a.m5563a("crashsdk", "delete file: " + file.getPath());
                    C6744g.m5616a(file);
                }
            }
        }
        m5711W();
    }

    /* renamed from: t */
    public static void m5750t() {
        if (f6445w) {
            return;
        }
        f6445w = true;
        if (m5697I() || C6749e.m5892t()) {
            return;
        }
        m5734d(C6751g.m5957U());
        m5710V();
        m5711W();
    }

    /* renamed from: u */
    public static boolean m5751u() {
        return m5734d(C6751g.m5957U());
    }

    /* renamed from: v */
    public static boolean m5752v() {
        return m5734d(C6751g.m5958V());
    }

    /* renamed from: w */
    public static boolean m5753w() {
        return f6409W || !m5723aa();
    }

    /* renamed from: x */
    public static boolean m5754x() {
        return f6410X || !m5723aa();
    }

    /* renamed from: y */
    public static boolean m5755y() {
        return f6410X && !f6445w;
    }

    /* renamed from: z */
    public static void m5756z() {
        C6743f.m5600a(2, new RunnableC6742e(100));
    }

    /* renamed from: b */
    public static String m5725b() {
        if (f6433k == null) {
            f6433k = m5731c("ctj");
        }
        return f6433k;
    }

    /* renamed from: c */
    public static String m5730c() {
        if (f6436n == null) {
            f6436n = m5731c("st");
        }
        return f6436n;
    }

    /* renamed from: d */
    private static boolean m5734d(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (file.isDirectory()) {
            return true;
        }
        C6738a.m5564a("crashsdk", "Crash log directory was placed by a file!", null);
        if (!file.delete()) {
            return false;
        }
        file.mkdirs();
        return true;
    }

    /* renamed from: b */
    public static void m5729b(boolean z9) {
        if (C6749e.m5892t()) {
            return;
        }
        if (z9 && f6445w) {
            C6751g.m5949M();
            f6445w = false;
            m5710V();
        }
        boolean z10 = C6749e.m5773E() || m5697I();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (f6409W && !f6410X && z9) {
            long j9 = f6412Z;
            if (j9 != 0 && !z10 && jCurrentTimeMillis - j9 > 1800000) {
                C6743f.m5601a(1, new RunnableC6742e(104), 1000L);
            }
        }
        f6412Z = jCurrentTimeMillis;
        f6410X = z9;
        if (z9) {
            f6409W = true;
        }
        if (f6426d) {
            JNIBridge.nativeSetForeground(z9);
        }
        if (f6445w || z10) {
            return;
        }
        m5705Q();
        m5711W();
        if (z9) {
            C6737a.m5541a(false);
            if (!f6411Y) {
                C6749e.m5769A();
                f6411Y = true;
            }
        }
        if (!f6399M) {
            m5712X();
        }
        C6749e.m5845c(z9);
    }

    /* renamed from: c */
    public static boolean m5732c(int i9) {
        return (i9 & f6394H) != 0;
    }

    /* renamed from: a */
    public static void m5719a(boolean z9) {
        f6397K = z9;
        if (f6426d) {
            JNIBridge.set(30, z9);
        }
    }

    /* renamed from: a */
    public static String m5717a(String str) {
        return "debug.crs." + str;
    }

    /* renamed from: a */
    private static void m5720a(Object[] objArr) {
        f6403Q = objArr;
        synchronized (f6400N) {
            try {
                String str = (String) objArr[0];
                Long l9 = (Long) objArr[1];
                long jLongValue = l9.longValue();
                if (jLongValue < f6406T) {
                    C6738a.m5567c("crashsdk", String.format(Locale.US, "Update state generation %d, last is: %d", l9, Long.valueOf(f6406T)));
                    return;
                }
                f6406T = jLongValue;
                String strM5702N = m5702N();
                if (f6426d) {
                    RandomAccessFile randomAccessFile = f6398L;
                    if (randomAccessFile != null) {
                        C6744g.m5612a(randomAccessFile);
                        f6398L = null;
                    }
                    boolean zNativeChangeState = JNIBridge.nativeChangeState(strM5702N, str, f6399M);
                    f6399M = false;
                    if (!zNativeChangeState) {
                        C6738a.m5565b("write state failed: " + str);
                    }
                } else {
                    RandomAccessFile randomAccessFile2 = f6398L;
                    if (randomAccessFile2 == null || f6399M) {
                        if (randomAccessFile2 != null) {
                            C6744g.m5612a(randomAccessFile2);
                            f6398L = null;
                        }
                        try {
                            RandomAccessFile randomAccessFile3 = new RandomAccessFile(strM5702N, "rw");
                            f6398L = randomAccessFile3;
                            randomAccessFile3.seek(0L);
                            f6399M = false;
                        } catch (Exception e10) {
                            C6744g.m5614a(e10);
                        }
                    }
                    try {
                        f6398L.write(str.getBytes());
                        f6398L.seek(0L);
                    } catch (Exception e11) {
                        C6744g.m5614a(e11);
                    }
                }
                f6401O = str;
                f6403Q = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static void m5727b(int i9) {
        f6394H = i9;
        m5696H();
    }

    /* renamed from: b */
    public static void m5728b(Context context) {
        long j9;
        boolean z9;
        C6738a.m5562a("Restart APP");
        if (context == null) {
            return;
        }
        if (f6437o == null) {
            f6437o = m5731c("rt");
        }
        File file = new File(f6437o);
        try {
            j9 = Long.parseLong(C6744g.m5629d(file));
        } catch (Throwable th) {
            C6744g.m5614a(th);
            j9 = -1;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        if (C6751g.m5978h() < 0 || (j9 > 0 && jCurrentTimeMillis - j9 <= C6751g.m5978h())) {
            z9 = false;
        } else {
            m5734d(C6751g.m5957U());
            C6744g.m5617a(file, String.valueOf(jCurrentTimeMillis));
            z9 = true;
        }
        C6738a.m5562a("lastTime: " + j9 + ", currentTime: " + jCurrentTimeMillis + ", needRestart: " + z9);
        if (z9) {
            try {
                C6748d.m5764a(true);
            } catch (Throwable th2) {
                C6744g.m5614a(th2);
            }
            m5699K();
        }
    }

    /* renamed from: a */
    public static boolean m5721a(Context context) {
        try {
            ((Application) context).registerActivityLifecycleCallbacks(new C6747c());
            if (!C6751g.m5946J()) {
                return true;
            }
            m5756z();
            return true;
        } catch (Throwable th) {
            C6744g.m5614a(th);
            return false;
        }
    }

    /* renamed from: a */
    public static void m5718a(int i9) {
        Object objM5715a;
        Activity activity;
        int i10;
        boolean z9 = false;
        switch (i9) {
            case 100:
                Object objM5714Z = m5714Z();
                if (objM5714Z == null || (objM5715a = m5715a(objM5714Z, (Class<?>) null, "mActivities")) == null) {
                    return;
                }
                try {
                    Iterator it = ((Map) objM5715a).entrySet().iterator();
                    boolean z10 = false;
                    while (it.hasNext()) {
                        Object value = ((Map.Entry) it.next()).getValue();
                        if (value != null && (activity = (Activity) m5715a(value, (Class<?>) null, "activity")) != null) {
                            boolean zBooleanValue = ((Boolean) m5715a(value, (Class<?>) null, "paused")).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) m5715a(value, (Class<?>) null, "stopped")).booleanValue();
                            WeakHashMap<Activity, Integer> weakHashMap = f6414aa;
                            synchronized (weakHashMap) {
                                if (zBooleanValue || zBooleanValue2) {
                                    i10 = 2;
                                } else {
                                    i10 = 1;
                                    z10 = true;
                                }
                                weakHashMap.put(activity, Integer.valueOf(i10));
                            }
                        }
                        z9 = true;
                    }
                    if (z9) {
                        m5729b(z10);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    C6744g.m5614a(th);
                    return;
                }
            case 101:
                try {
                    boolean zExists = new File(m5702N()).exists();
                    f6399M = !zExists;
                    if (!zExists || f6402P) {
                        m5720a(m5713Y());
                        f6402P = false;
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    C6744g.m5614a(th2);
                    return;
                }
            case 102:
                C6743f.m5600a(1, new RunnableC6742e(103));
                return;
            case 103:
                try {
                    C6744g.m5616a(new File(m5704P()));
                    return;
                } catch (Throwable th3) {
                    C6744g.m5614a(th3);
                    return;
                }
            case 104:
                C6745h.m5668d();
                C6750f.m5916a(102);
                if (m5691C()) {
                    C6749e.m5770B();
                    return;
                }
                return;
            default:
                if (!f6431i) {
                    throw new AssertionError();
                }
                return;
        }
    }

    /* renamed from: a */
    private static Object m5715a(Object obj, Class<?> cls, String str) {
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
            C6744g.m5614a(th);
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m5722a(Object obj, String str, RunnableC6742e runnableC6742e) {
        FileChannel channel;
        boolean zM5595a;
        synchronized (obj) {
            FileChannel fileChannel = null;
            fileLockLock = null;
            FileLock fileLockLock = null;
            FileChannel fileChannel2 = null;
            boolean zM5595a2 = false;
            if (f6426d) {
                int iNativeOpenFile = JNIBridge.nativeOpenFile(str);
                if (iNativeOpenFile < 0) {
                    C6738a.m5564a("crashsdk", "Can not open file: " + str, null);
                    return false;
                }
                try {
                    boolean zNativeLockFile = JNIBridge.nativeLockFile(iNativeOpenFile, true);
                    try {
                        zM5595a = runnableC6742e.m5595a();
                        return zM5595a;
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
                } catch (Exception e10) {
                    C6744g.m5614a(e10);
                }
            }
            try {
                try {
                    channel = new RandomAccessFile(file, "rw").getChannel();
                } catch (Throwable th) {
                    th = th;
                    C6744g.m5612a(fileChannel2);
                    throw th;
                }
            } catch (Exception e11) {
                try {
                    C6744g.m5614a(e11);
                    channel = null;
                } catch (Exception e12) {
                    e = e12;
                    C6744g.m5614a(e);
                    C6744g.m5612a(fileChannel);
                    zM5595a = zM5595a2;
                    return zM5595a;
                }
            }
            if (channel != null) {
                try {
                    try {
                        fileLockLock = channel.lock();
                    } catch (Exception e13) {
                        try {
                            C6744g.m5614a(e13);
                        } catch (Exception e14) {
                            e = e14;
                            fileChannel = channel;
                            C6744g.m5614a(e);
                            C6744g.m5612a(fileChannel);
                            zM5595a = zM5595a2;
                            return zM5595a;
                        }
                    }
                } catch (Throwable th2) {
                    fileChannel2 = channel;
                    th = th2;
                    C6744g.m5612a(fileChannel2);
                    throw th;
                }
            }
            try {
                zM5595a2 = runnableC6742e.m5595a();
                C6744g.m5612a(channel);
                zM5595a = zM5595a2;
                return zM5595a;
            } finally {
                if (fileLockLock != null) {
                    try {
                        fileLockLock.release();
                    } catch (Exception e15) {
                        C6744g.m5614a(e15);
                    }
                }
            }
        }
    }
}
