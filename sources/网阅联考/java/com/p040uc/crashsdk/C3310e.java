package com.p040uc.crashsdk;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Debug;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StatFs;
import android.os.StrictMode;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.compose.material3.TextFieldImplKt;
import androidx.core.app.NotificationCompat;
import androidx.core.os.EnvironmentCompat;
import com.p040uc.crashsdk.export.ExitType;
import com.p040uc.crashsdk.export.LogType;
import com.p040uc.crashsdk.p041a.C3299a;
import com.p040uc.crashsdk.p041a.C3300b;
import com.p040uc.crashsdk.p041a.C3301c;
import com.p040uc.crashsdk.p041a.C3302d;
import com.p040uc.crashsdk.p041a.C3304f;
import com.p040uc.crashsdk.p041a.C3305g;
import com.p040uc.crashsdk.p041a.C3306h;
import com.p040uc.crashsdk.p041a.RunnableC3303e;
import com.umeng.analytics.pro.C3380c;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.uc.crashsdk.e */
/* loaded from: classes2.dex */
public class C3310e implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    static final /* synthetic */ boolean f1486a = true;

    /* renamed from: b */
    private static long f1493b;

    /* renamed from: i */
    private static String f1499i;

    /* renamed from: e */
    private final List<FileInputStream> f1517e = new ArrayList();

    /* renamed from: c */
    private static final AtomicBoolean f1494c = new AtomicBoolean(false);

    /* renamed from: d */
    private static boolean f1495d = false;

    /* renamed from: f */
    private static long f1496f = 0;

    /* renamed from: g */
    private static long f1497g = -1;

    /* renamed from: h */
    private static boolean f1498h = true;

    /* renamed from: j */
    private static String f1500j = "";

    /* renamed from: k */
    private static String f1501k = null;

    /* renamed from: l */
    private static String f1502l = null;

    /* renamed from: m */
    private static String f1503m = null;

    /* renamed from: n */
    private static final Object f1504n = new Object();

    /* renamed from: o */
    private static final Object f1505o = new Object();

    /* renamed from: p */
    private static final Object f1506p = new Object();

    /* renamed from: q */
    private static final Object f1507q = new Object();

    /* renamed from: r */
    private static final ArrayList<String> f1508r = new ArrayList<>();

    /* renamed from: s */
    private static int f1509s = 0;

    /* renamed from: t */
    private static String f1510t = null;

    /* renamed from: u */
    private static boolean f1511u = false;

    /* renamed from: v */
    private static String f1512v = null;

    /* renamed from: w */
    private static String f1513w = null;

    /* renamed from: x */
    private static String f1514x = null;

    /* renamed from: y */
    private static final Object f1515y = new Object();

    /* renamed from: z */
    private static final Object f1516z = new Object();

    /* renamed from: A */
    private static Map<String, Integer> f1460A = null;

    /* renamed from: B */
    private static String f1461B = null;

    /* renamed from: C */
    private static int f1462C = -1;

    /* renamed from: D */
    private static int f1463D = -1;

    /* renamed from: E */
    private static int f1464E = -1;

    /* renamed from: F */
    private static int f1465F = -1;

    /* renamed from: G */
    private static int f1466G = -1;

    /* renamed from: H */
    private static int f1467H = -1;

    /* renamed from: I */
    private static int f1468I = -1;

    /* renamed from: J */
    private static String f1469J = "?";

    /* renamed from: K */
    private static boolean f1470K = false;

    /* renamed from: L */
    private static boolean f1471L = false;

    /* renamed from: M */
    private static int f1472M = 0;

    /* renamed from: N */
    private static int f1473N = 0;

    /* renamed from: O */
    private static boolean f1474O = false;

    /* renamed from: P */
    private static RunnableC3303e f1475P = new RunnableC3303e(405);

    /* renamed from: Q */
    private static c f1476Q = new c(0);

    /* renamed from: R */
    private static boolean f1477R = false;

    /* renamed from: S */
    private static final RunnableC3303e f1478S = new RunnableC3303e(412);

    /* renamed from: T */
    private static Thread.UncaughtExceptionHandler f1479T = null;

    /* renamed from: U */
    private static Throwable f1480U = null;

    /* renamed from: V */
    private static boolean f1481V = false;

    /* renamed from: W */
    private static boolean f1482W = false;

    /* renamed from: X */
    private static Runnable f1483X = null;

    /* renamed from: Y */
    private static final Object f1484Y = new Object();

    /* renamed from: Z */
    private static int f1485Z = 101;

    /* renamed from: aa */
    private static Runnable f1487aa = new RunnableC3303e(407);

    /* renamed from: ab */
    private static final Object f1488ab = new Object();

    /* renamed from: ac */
    private static boolean f1489ac = false;

    /* renamed from: ad */
    private static ParcelFileDescriptor f1490ad = null;

    /* renamed from: ae */
    private static boolean f1491ae = false;

    /* renamed from: af */
    private static boolean f1492af = false;

    /* renamed from: com.uc.crashsdk.e$b */
    public static class b implements Comparator<File> {
        private b() {
        }

        public /* synthetic */ b(byte b4) {
            this();
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            File file3 = file;
            File file4 = file2;
            if (file3.lastModified() > file4.lastModified()) {
                return 1;
            }
            return file3.lastModified() < file4.lastModified() ? -1 : 0;
        }
    }

    /* renamed from: com.uc.crashsdk.e$c */
    public static class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (!"android.intent.action.BATTERY_CHANGED".equals(action)) {
                if ("android.intent.action.BATTERY_LOW".equals(action) || "android.intent.action.BATTERY_OKAY".equals(action)) {
                    boolean unused = C3310e.f1470K = "android.intent.action.BATTERY_LOW".equals(action);
                    C3310e.m2534J();
                    return;
                } else {
                    if ("android.intent.action.ANR".equals(action)) {
                        try {
                            C3310e.m2608d(context);
                            return;
                        } catch (Throwable th) {
                            C3305g.m2370a(th);
                            return;
                        }
                    }
                    return;
                }
            }
            int unused2 = C3310e.f1462C = intent.getIntExtra("level", -1);
            int unused3 = C3310e.f1463D = intent.getIntExtra("scale", -1);
            int unused4 = C3310e.f1464E = intent.getIntExtra("voltage", -1);
            int unused5 = C3310e.f1465F = intent.getIntExtra("health", -1);
            int unused6 = C3310e.f1466G = intent.getIntExtra("plugged", -1);
            int unused7 = C3310e.f1467H = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            int unused8 = C3310e.f1468I = intent.getIntExtra("temperature", -1);
            String unused9 = C3310e.f1469J = intent.getStringExtra("technology");
            if (C3310e.m2533I() >= 2) {
                C3310e.m2534J();
                C3310e.m2535K();
            }
        }

        public /* synthetic */ c(byte b4) {
            this();
        }
    }

    public C3310e() {
        try {
            m2536L();
        } catch (Throwable th) {
            C3305g.m2370a(th);
        }
    }

    /* renamed from: A */
    public static void m2525A() {
        if (f1489ac || C3307b.m2453I()) {
            return;
        }
        C3304f.m2357a(1, new RunnableC3303e(408), 1000L);
    }

    /* renamed from: B */
    public static void m2526B() {
        C3304f.m2357a(1, new RunnableC3303e(409), 7000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m2527C() {
        /*
            int r0 = com.p040uc.crashsdk.C3312g.m2704L()
            r1 = 4
            r2 = 3
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L13
            if (r0 == r2) goto L13
            if (r0 != r1) goto Lf
            goto L13
        Lf:
            if (r0 != r4) goto L3f
        L11:
            r4 = r3
            goto L3f
        L13:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 25
            if (r5 > r6) goto L3f
            if (r0 != 0) goto L1d
            r5 = r3
            goto L1e
        L1d:
            r5 = r4
        L1e:
            r6 = 0
            if (r0 != r2) goto L30
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 10
            long r8 = r8 % r10
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 != 0) goto L2f
            r5 = r4
            goto L30
        L2f:
            r5 = r3
        L30:
            if (r0 != r1) goto L3e
            long r0 = java.lang.System.currentTimeMillis()
            r8 = 3
            long r0 = r0 % r8
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L11
            goto L3f
        L3e:
            r4 = r5
        L3f:
            if (r4 != 0) goto L48
            java.lang.String r0 = "crashsdk"
            java.lang.String r1 = "SIG 3 is disabled by settings"
            com.p040uc.crashsdk.p041a.C3299a.m2319a(r0, r1)
        L48:
            boolean r0 = com.p040uc.crashsdk.C3307b.m2453I()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r1 == r2) goto L64
            if (r4 == 0) goto L64
            com.uc.crashsdk.a.e r1 = new com.uc.crashsdk.a.e
            r2 = 413(0x19d, float:5.79E-43)
            r1.<init>(r2)
            r2 = 2
            com.p040uc.crashsdk.p041a.C3304f.m2356a(r2, r1)
            goto L65
        L64:
            r3 = r4
        L65:
            r1 = 7
            long r4 = (long) r0
            r0 = 0
            com.p040uc.crashsdk.JNIBridge.nativeCmd(r1, r4, r0, r0)
            if (r3 == 0) goto L72
            r0 = 8
            com.p040uc.crashsdk.JNIBridge.cmd(r0)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p040uc.crashsdk.C3310e.m2527C():void");
    }

    /* renamed from: D */
    public static ParcelFileDescriptor m2528D() {
        if (!C3307b.f1428d) {
            C3299a.m2324d("crashsdk", "Crash so is not loaded!");
            return null;
        }
        ParcelFileDescriptor parcelFileDescriptor = f1490ad;
        if (parcelFileDescriptor != null) {
            return parcelFileDescriptor;
        }
        int iCmd = (int) JNIBridge.cmd(14);
        if (iCmd == -1) {
            return null;
        }
        ParcelFileDescriptor parcelFileDescriptorAdoptFd = ParcelFileDescriptor.adoptFd(iCmd);
        f1490ad = parcelFileDescriptorAdoptFd;
        f1491ae = true;
        return parcelFileDescriptorAdoptFd;
    }

    /* renamed from: E */
    public static boolean m2529E() {
        return f1492af;
    }

    /* renamed from: F */
    public static void m2530F() {
        String strM2714V = C3312g.m2714V();
        File file = new File(strM2714V);
        if (file.exists() && file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                C3299a.m2321b("Ucebu can not list folder: " + strM2714V);
                return;
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isFile() && file2.getName().contains("ucebu")) {
                    m2581a(false, false);
                    return;
                }
            }
        }
    }

    /* renamed from: I */
    public static /* synthetic */ int m2533I() {
        int i4 = f1472M + 1;
        f1472M = i4;
        return i4;
    }

    /* renamed from: J */
    public static /* synthetic */ void m2534J() {
        StringBuilder sbM2548X;
        if (C3307b.f1428d && (sbM2548X = m2548X()) != null) {
            JNIBridge.set(125, sbM2548X.toString());
        }
        f1471L = true;
        m2549Y();
    }

    /* renamed from: K */
    public static /* synthetic */ int m2535K() {
        f1472M = 0;
        return 0;
    }

    /* renamed from: L */
    private void m2536L() {
        int iM2699G = C3312g.m2699G();
        for (int i4 = 0; i4 < iM2699G; i4++) {
            try {
                this.f1517e.add(new FileInputStream("/dev/null"));
            } catch (Exception e4) {
                C3305g.m2370a(e4);
                return;
            }
        }
    }

    /* renamed from: M */
    private void m2537M() {
        Iterator<FileInputStream> it = this.f1517e.iterator();
        while (it.hasNext()) {
            C3305g.m2368a(it.next());
        }
        this.f1517e.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static boolean m2538N() {
        if (C3312g.m2706N()) {
            return true;
        }
        return m2574a();
    }

    /* renamed from: O */
    private static String m2539O() {
        return C3312g.m2731e() + "_";
    }

    /* renamed from: P */
    private static String m2540P() {
        return C3307b.m2511y() ? "fg" : "bg";
    }

    /* renamed from: Q */
    private static byte[] m2541Q() {
        byte[] bArr = null;
        int i4 = 1024;
        while (bArr == null && i4 > 0) {
            try {
                bArr = new byte[i4];
            } catch (Throwable unused) {
                i4 /= 2;
                if (i4 < 16) {
                    break;
                }
            }
        }
        return bArr;
    }

    /* renamed from: R */
    private static String m2542R() {
        return (!C3307b.m2447C() || f1495d) ? LogType.JAVA_TYPE : "ucebujava";
    }

    /* renamed from: S */
    private static void m2543S() {
        String strTrim;
        BufferedReader bufferedReader;
        Throwable th;
        FileReader fileReader;
        String strTrim2 = "-";
        try {
            strTrim = Build.HARDWARE;
        } catch (Throwable th2) {
            C3305g.m2370a(th2);
            strTrim = "-";
        }
        try {
            fileReader = new FileReader(new File("/proc/cpuinfo"));
            try {
                bufferedReader = new BufferedReader(fileReader, 512);
                int i4 = 0;
                do {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (line.startsWith("Hardware")) {
                            strTrim = line.substring(line.indexOf(":") + 1).trim();
                        } else if (line.startsWith("Processor")) {
                            strTrim2 = line.substring(line.indexOf(":") + 1).trim();
                        }
                        i4++;
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            C3305g.m2370a(th);
                            C3305g.m2368a(fileReader);
                            C3305g.m2368a(bufferedReader);
                            f1501k = strTrim;
                            f1502l = strTrim2;
                        } catch (Throwable th4) {
                            C3305g.m2368a(fileReader);
                            C3305g.m2368a(bufferedReader);
                            throw th4;
                        }
                    }
                } while (i4 < 2);
                C3305g.m2368a(fileReader);
            } catch (Throwable th5) {
                bufferedReader = null;
                th = th5;
            }
        } catch (Throwable th6) {
            bufferedReader = null;
            th = th6;
            fileReader = null;
        }
        C3305g.m2368a(bufferedReader);
        f1501k = strTrim;
        f1502l = strTrim2;
    }

    /* renamed from: T */
    private static String m2544T() {
        return C3312g.m2713U() + "bytes";
    }

    /* renamed from: U */
    private static boolean m2545U() {
        return Build.VERSION.SDK_INT < 29;
    }

    /* renamed from: V */
    private static void m2546V() {
        if (f1474O || C3307b.m2447C() || C3307b.m2453I()) {
            return;
        }
        JNIBridge.cmd(18);
    }

    /* renamed from: W */
    private static void m2547W() {
        C3304f.m2357a(3, new RunnableC3303e(414), 1000L);
    }

    /* renamed from: X */
    private static StringBuilder m2548X() {
        String str;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("level: ");
            sb.append(f1462C);
            sb.append("\n");
            sb.append("scale: ");
            sb.append(f1463D);
            sb.append("\n");
            switch (f1465F) {
                case 1:
                    str = " (Unknown)";
                    break;
                case 2:
                    str = " (Good)";
                    break;
                case 3:
                    str = " (Overheat)";
                    break;
                case 4:
                    str = " (Dead)";
                    break;
                case 5:
                    str = " (Over voltage)";
                    break;
                case 6:
                    str = " (Unspecified failure)";
                    break;
                case 7:
                    str = " (Cold)";
                    break;
                default:
                    str = " (?)";
                    break;
            }
            sb.append("health: ");
            sb.append(f1465F);
            sb.append(str);
            sb.append("\n");
            int i4 = f1466G;
            String str2 = i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 4 ? " (?)" : " (Wireless)" : " (USB port)" : " (AC charger)" : " (None)";
            sb.append("pluged: ");
            sb.append(f1466G);
            sb.append(str2);
            sb.append("\n");
            int i5 = f1467H;
            String str3 = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? " (?)" : " (Full)" : " (Not charging)" : " (Discharging)" : " (Charging)" : " (Unknown)";
            sb.append("status: ");
            sb.append(f1467H);
            sb.append(str3);
            sb.append("\n");
            sb.append("voltage: ");
            sb.append(f1464E);
            sb.append("\n");
            sb.append("temperature: ");
            sb.append(f1468I);
            sb.append("\n");
            sb.append("technology: ");
            sb.append(f1469J);
            sb.append("\n");
            sb.append("battery low: ");
            sb.append(f1470K);
            sb.append("\n");
            return sb;
        } catch (Throwable th) {
            C3305g.m2370a(th);
            return null;
        }
    }

    /* renamed from: Y */
    private static void m2549Y() {
        if (C3307b.f1427c && f1471L && C3298a.f1311c) {
            f1471L = false;
            if (C3304f.m2359b(f1475P)) {
                return;
            }
            C3304f.m2357a(0, f1475P, 2000L);
        }
    }

    /* renamed from: Z */
    private static boolean m2550Z() {
        return C3307b.f1428d && JNIBridge.nativeIsCrashing();
    }

    /* renamed from: a */
    public static boolean m2574a() {
        if (f1496f == 0) {
            f1496f = 2L;
            if (m2621g(C3307b.m2473a("logs")) == 1) {
                f1496f = 1L;
            }
        }
        return f1496f == 1;
    }

    /* renamed from: aa */
    private static void m2582aa() {
        String strM2715W = C3312g.m2715W();
        File file = new File(strM2715W);
        if (file.isDirectory()) {
            try {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length > 150) {
                    Arrays.sort(fileArrListFiles, new b((byte) 0));
                    int length = fileArrListFiles.length - TextFieldImplKt.AnimationDuration;
                    if (length < 0) {
                        length = 0;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    while (i4 < fileArrListFiles.length) {
                        File file2 = fileArrListFiles[i4];
                        boolean z3 = i4 < length;
                        if (!z3 && jCurrentTimeMillis - file2.lastModified() >= 432000000) {
                            z3 = true;
                        }
                        if (!z3) {
                            break;
                        }
                        try {
                            file2.delete();
                            i5++;
                            i6 = 0;
                        } catch (Throwable th) {
                            i6++;
                            C3305g.m2370a(th);
                        }
                        if (i6 >= 3) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    C3299a.m2318a("Removed " + i5 + " logs in " + strM2715W);
                }
            } catch (Throwable th2) {
                C3305g.m2370a(th2);
            }
        }
    }

    /* renamed from: b */
    public static long m2585b() {
        if (f1497g == -1) {
            f1497g = m2621g(C3307b.m2473a("local"));
        }
        return f1497g;
    }

    /* renamed from: d */
    public static String m2606d(boolean z3) {
        return z3 ? "https://errlogos.umeng.com/upload" : "https://errlog.umeng.com/upload";
    }

    /* renamed from: j */
    private static String m2629j(String str) {
        return String.format(Locale.US, "%s%s_%s_%s.log", m2605d(), m2635m(), m2540P(), str);
    }

    /* renamed from: k */
    private static String m2632k(String str) {
        if (!C3305g.m2380b(str)) {
            return "";
        }
        int iIndexOf = str.indexOf(0);
        if (iIndexOf >= 0) {
            str = str.substring(0, iIndexOf);
        }
        return str.trim();
    }

    /* renamed from: l */
    private static String m2633l(String str) {
        String strM2326a = C3300b.m2326a(str, C3312g.m2749w(), C3312g.m2748v());
        if (!str.equals(strM2326a)) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
        return strM2326a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean[] m2636m(java.lang.String r7) {
        /*
            boolean r0 = com.p040uc.crashsdk.C3312g.m2748v()
            boolean r1 = com.p040uc.crashsdk.C3312g.m2750x()
            r2 = 0
            if (r0 != 0) goto Ld
            if (r1 == 0) goto L6f
        Ld:
            java.lang.String r3 = ".tmp"
            boolean r3 = r7.endsWith(r3)
            if (r3 != 0) goto L6d
            java.lang.String r3 = ".ec"
            boolean r3 = r7.contains(r3)
            if (r3 == 0) goto L1e
            goto L6d
        L1e:
            char r3 = java.io.File.separatorChar
            int r3 = r7.lastIndexOf(r3)
            if (r3 >= 0) goto L29
            r3 = r2
            r4 = r3
            goto L2a
        L29:
            r4 = r2
        L2a:
            r5 = 95
            int r3 = r7.indexOf(r5, r3)
            if (r3 < 0) goto L36
            int r4 = r4 + 1
            int r3 = r3 + 1
        L36:
            if (r3 >= 0) goto L2a
            r3 = 8
            if (r4 == r3) goto L3d
            goto L6d
        L3d:
            java.lang.String r3 = com.p040uc.crashsdk.C3312g.m2749w()
            java.lang.String r4 = ".log"
            boolean r6 = r7.endsWith(r4)
            if (r6 != 0) goto L56
            boolean r0 = com.p040uc.crashsdk.p041a.C3305g.m2375a(r3)
            if (r0 != 0) goto L6d
            boolean r7 = r7.endsWith(r3)
            if (r7 != 0) goto L5c
            goto L6d
        L56:
            boolean r3 = com.p040uc.crashsdk.p041a.C3305g.m2375a(r3)
            if (r3 == 0) goto L5e
        L5c:
            r0 = r2
            goto L6f
        L5e:
            int r3 = r7.lastIndexOf(r5)
            int r3 = r7.indexOf(r4, r3)
            int r7 = r7.lastIndexOf(r4)
            if (r3 == r7) goto L6f
            goto L5c
        L6d:
            r0 = r2
            r1 = r0
        L6f:
            r7 = 2
            boolean[] r7 = new boolean[r7]
            r7[r2] = r0
            r0 = 1
            r7[r0] = r1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p040uc.crashsdk.C3310e.m2636m(java.lang.String):boolean[]");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:6|(3:9|(1:11)(15:60|12|13|(2:53|15)(1:19)|20|(1:24)(1:23)|25|(1:28)|29|50|30|57|31|32|43)|7)|59|26|(0)|29|50|30|57|31|32|43) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00de, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e3, code lost:
    
        com.p040uc.crashsdk.p041a.C3305g.m2370a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e6, code lost:
    
        com.p040uc.crashsdk.p041a.C3305g.m2368a(r1);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00eb, code lost:
    
        com.p040uc.crashsdk.p041a.C3305g.m2368a((java.io.Closeable) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ee, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af A[Catch: all -> 0x00ef, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0005, B:6:0x0033, B:7:0x0041, B:9:0x0047, B:11:0x0051, B:12:0x0056, B:15:0x0068, B:20:0x0079, B:25:0x0084, B:28:0x00af, B:32:0x00d6, B:43:0x00e9, B:45:0x00eb, B:46:0x00ee, B:42:0x00e6, B:18:0x0072), top: B:55:0x0005, inners: #4 }] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m2638n(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p040uc.crashsdk.C3310e.m2638n(java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae A[Catch: all -> 0x0108, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:7:0x0018, B:9:0x0023, B:10:0x002d, B:38:0x00ae, B:50:0x00d4, B:57:0x00ef, B:53:0x00df, B:64:0x00fc, B:67:0x0106, B:11:0x0033, B:13:0x003b, B:14:0x0044, B:16:0x004c, B:18:0x0054, B:20:0x005c, B:26:0x006a, B:28:0x0074, B:30:0x0081, B:32:0x008b, B:33:0x0096, B:35:0x00a0), top: B:72:0x0003 }] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m2640o(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p040uc.crashsdk.C3310e.m2640o(java.lang.String):boolean");
    }

    /* renamed from: p */
    private static Map<String, Integer> m2642p(String str) {
        HashMap map = new HashMap();
        for (String str2 : str.split("\\|", 30)) {
            String[] strArrSplit = str2.split(":", 3);
            if (strArrSplit.length == 2) {
                String strTrim = strArrSplit[0].trim();
                if (!C3305g.m2375a(strTrim)) {
                    int i4 = 1;
                    try {
                        i4 = Integer.parseInt(strArrSplit[1].trim(), 10);
                    } catch (Throwable th) {
                        C3305g.m2370a(th);
                    }
                    map.put(strTrim, Integer.valueOf(i4));
                }
            }
        }
        return map;
    }

    /* renamed from: q */
    private static void m2644q(String str) {
        if (C3312g.m2743q()) {
            try {
                m2582aa();
            } catch (Throwable th) {
                C3305g.m2370a(th);
            }
            if (str == null || "".equals(str)) {
                return;
            }
            try {
                File file = new File(C3312g.m2715W());
                if (!file.exists()) {
                    file.mkdirs();
                }
                C3299a.m2319a("crashsdk", "copy log to: " + file);
                C3305g.m2369a(new File(str), file);
            } catch (Throwable th2) {
                C3305g.m2370a(th2);
            }
        }
    }

    /* renamed from: r */
    private static String m2645r(String str) {
        return String.format("$^%s^$", str);
    }

    /* renamed from: s */
    public static void m2647s() {
        Thread.setDefaultUncaughtExceptionHandler(f1479T);
    }

    /* renamed from: t */
    public static boolean m2648t() {
        return f1494c.get() || m2550Z();
    }

    /* renamed from: u */
    public static Throwable m2649u() {
        return f1480U;
    }

    /* renamed from: v */
    public static int m2650v() {
        if (C3307b.m2450F() == 5) {
            return f1485Z;
        }
        return 100;
    }

    /* renamed from: w */
    public static void m2651w() {
        long jM2741o = C3312g.m2741o();
        if (jM2741o < 0) {
            return;
        }
        boolean z3 = C3307b.m2450F() == 5;
        C3304f.m2356a(0, new RunnableC3303e(401));
        if (z3) {
            RunnableC3303e runnableC3303e = new RunnableC3303e(402);
            f1483X = runnableC3303e;
            C3304f.m2357a(0, runnableC3303e, jM2741o);
        }
    }

    /* renamed from: x */
    public static void m2652x() {
        if (C3307b.f1427c && C3298a.f1311c && !C3304f.m2359b(f1487aa)) {
            C3304f.m2357a(0, f1487aa, 1000L);
        }
    }

    /* renamed from: y */
    public static boolean m2653y() {
        synchronized (f1484Y) {
            Runnable runnable = f1483X;
            if (runnable == null || f1482W) {
                return false;
            }
            C3304f.m2355a(runnable);
            f1483X = null;
            return true;
        }
    }

    /* renamed from: z */
    public static void m2654z() {
        if (C3312g.m2743q()) {
            C3304f.m2357a(0, new RunnableC3303e(403), 10000L);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        m2655a(thread, th, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5 A[Catch: all -> 0x00c9, TRY_LEAVE, TryCatch #5 {all -> 0x00c9, blocks: (B:33:0x0090, B:35:0x00a5), top: B:72:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6 A[Catch: all -> 0x0139, TryCatch #4 {all -> 0x0139, blocks: (B:45:0x00d0, B:47:0x00d6, B:49:0x00de, B:50:0x0104, B:52:0x010a, B:54:0x0112), top: B:70:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010a A[Catch: all -> 0x0139, TryCatch #4 {all -> 0x0139, blocks: (B:45:0x00d0, B:47:0x00d6, B:49:0x00de, B:50:0x0104, B:52:0x010a, B:54:0x0112), top: B:70:0x00d0 }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m2612e() {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p040uc.crashsdk.C3310e.m2612e():java.lang.String");
    }

    /* renamed from: g */
    private static long m2621g(String str) {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("getLong", String.class, Long.TYPE);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                return ((Long) declaredMethod.invoke(null, str, 0L)).longValue();
            }
        } catch (Throwable th) {
            C3305g.m2370a(th);
        }
        return 0L;
    }

    /* renamed from: h */
    private static String m2625h(String str) {
        try {
            return str.replaceAll("[^0-9a-zA-Z-.]", "-");
        } catch (Throwable unused) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
    }

    /* renamed from: i */
    private static String m2627i(String str) {
        if (str == null) {
            str = String.valueOf(System.currentTimeMillis()) + new Random().nextInt(65536);
        }
        return String.format(Locale.US, "%s%s_%s_%s_%s_%s_", m2539O(), C3312g.m2710R(), C3312g.m2712T(), m2625h(Build.MODEL), m2625h(Build.VERSION.RELEASE), str);
    }

    /* renamed from: r */
    public static void m2646r() {
        f1479T = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new C3310e());
    }

    /* renamed from: c */
    public static void m2599c() {
        f1499i = null;
    }

    /* renamed from: d */
    public static String m2605d() {
        String str = f1499i;
        if (str != null) {
            return str;
        }
        String strM2627i = m2627i((String) null);
        f1499i = strM2627i;
        return strM2627i;
    }

    /* renamed from: h */
    public static String m2624h() {
        String str = f1503m;
        if (str != null) {
            return str;
        }
        String strM2554a = m2554a(Process.myPid());
        f1503m = strM2554a;
        return strM2554a;
    }

    /* renamed from: b */
    public static boolean m2596b(int i4, Object[] objArr) {
        if (i4 == 451) {
            if (f1486a || objArr != null) {
                return m2578a((String) objArr[0], (d) objArr[1]);
            }
            throw new AssertionError();
        }
        if (i4 != 452) {
            if (f1486a) {
                return false;
            }
            throw new AssertionError();
        }
        if (!f1486a && objArr == null) {
            throw new AssertionError();
        }
        String str = (String) objArr[0];
        d dVar = (d) objArr[1];
        return C3305g.m2374a(new File(str), String.format(Locale.US, "%d %d %d %d", Long.valueOf(dVar.f1523a), Long.valueOf(dVar.f1524b), Integer.valueOf(dVar.f1525c), Integer.valueOf(dVar.f1526d)).getBytes());
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m2600c(java.io.OutputStream r9) {
        /*
            java.lang.String r0 = "UTF-8"
            boolean r1 = com.p040uc.crashsdk.C3307b.f1428d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3d
            java.lang.String r0 = com.p040uc.crashsdk.C3307b.m2498l()
            com.p040uc.crashsdk.C3310e.f1498h = r2
            r1 = 17
            long r1 = com.p040uc.crashsdk.JNIBridge.cmd(r1, r0)
            r4 = 1
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L3a
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            byte[] r0 = com.p040uc.crashsdk.p041a.C3305g.m2388e(r1)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L2d
            r9.write(r0)     // Catch: java.lang.Throwable -> L29
            goto L2d
        L29:
            r0 = move-exception
            m2571a(r0, r9)
        L2d:
            r1.delete()     // Catch: java.lang.Throwable -> L31
            goto L35
        L31:
            r0 = move-exception
            m2571a(r0, r9)
        L35:
            com.p040uc.crashsdk.C3310e.f1498h = r3
            m2565a(r9)
        L3a:
            com.p040uc.crashsdk.C3310e.f1498h = r3
            return
        L3d:
            r1 = 0
            int r4 = com.p040uc.crashsdk.C3312g.m2700H()     // Catch: java.lang.Throwable -> L7b
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L79
            java.lang.String r6 = "/proc/self/fd"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L79
            java.io.File[] r1 = r5.listFiles()     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L6f
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L79
            java.lang.String r6 = "opened file count: %d, write limit: %d.\n"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L79
            int r8 = r1.length     // Catch: java.lang.Throwable -> L79
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L79
            r7[r2] = r8     // Catch: java.lang.Throwable -> L79
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L79
            r7[r3] = r8     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = java.lang.String.format(r5, r6, r7)     // Catch: java.lang.Throwable -> L79
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L79
            r9.write(r3)     // Catch: java.lang.Throwable -> L79
            goto L81
        L6f:
            java.lang.String r3 = "[DEBUG] listFiles failed!\n"
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L79
            r9.write(r3)     // Catch: java.lang.Throwable -> L79
            goto L81
        L79:
            r3 = move-exception
            goto L7e
        L7b:
            r3 = move-exception
            r4 = 900(0x384, float:1.261E-42)
        L7e:
            m2571a(r3, r9)
        L81:
            if (r1 == 0) goto Lc8
            int r3 = r1.length     // Catch: java.lang.Throwable -> Lc4
            if (r3 < r4) goto Lc8
            java.lang.String r3 = "opened files:\n"
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> Lc4
            r9.write(r3)     // Catch: java.lang.Throwable -> Lc4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
            r3.<init>()     // Catch: java.lang.Throwable -> Lc4
            int r4 = r1.length     // Catch: java.lang.Throwable -> Lb4
        L95:
            if (r2 >= r4) goto Lb8
            r5 = r1[r2]     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> Lb4
            r3.append(r6)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r6 = " -> "
            r3.append(r6)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r5 = r5.getCanonicalPath()     // Catch: java.lang.Throwable -> Lb4
            r3.append(r5)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r5 = "\n"
            r3.append(r5)     // Catch: java.lang.Throwable -> Lb4
            int r2 = r2 + 1
            goto L95
        Lb4:
            r1 = move-exception
            m2571a(r1, r9)     // Catch: java.lang.Throwable -> Lc4
        Lb8:
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> Lc4
            byte[] r0 = r1.getBytes(r0)     // Catch: java.lang.Throwable -> Lc4
            r9.write(r0)     // Catch: java.lang.Throwable -> Lc4
            goto Lc8
        Lc4:
            r0 = move-exception
            m2571a(r0, r9)
        Lc8:
            m2565a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p040uc.crashsdk.C3310e.m2600c(java.io.OutputStream):void");
    }

    /* renamed from: f */
    public static String m2616f() {
        if (C3305g.m2375a(f1501k)) {
            m2543S();
        }
        return f1501k;
    }

    /* renamed from: j */
    public static void m2630j() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitNetwork().build());
        } catch (Throwable th) {
            C3305g.m2370a(th);
        }
    }

    /* renamed from: k */
    public static String m2631k() {
        if (C3305g.m2375a(f1513w)) {
            synchronized (f1515y) {
                f1513w = C3305g.m2363a(C3307b.m2492f(), f1514x, true);
            }
        }
        return f1513w;
    }

    /* renamed from: a */
    public static void m2561a(int i4, Object[] objArr) {
        int i5;
        switch (i4) {
            case 401:
                JNIBridge.nativeCmd(10, C3307b.m2450F() == 5 ? 1L : 0L, null, null);
                C3298a.f1311c = true;
                C3298a.m2297a(false);
                f1471L = true;
                m2549Y();
                m2652x();
                return;
            case 402:
                Object obj = f1484Y;
                synchronized (obj) {
                    if (f1483X == null) {
                        return;
                    }
                    f1482W = true;
                    if (C3307b.m2500n()) {
                        return;
                    }
                    if (!C3302d.m2348d()) {
                        C3299a.m2323c("DEBUG", C3302d.m2346b());
                        return;
                    }
                    if (!m2603c(LogType.UNEXP_TYPE)) {
                        C3299a.m2324d("DEBUG", "unexp sample miss");
                        return;
                    }
                    int iNativeGenerateUnexpLog = JNIBridge.nativeGenerateUnexpLog(C3312g.m2741o(), C3312g.m2742p());
                    if (iNativeGenerateUnexpLog != 0) {
                        C3311f.m2672a(11);
                        if ((iNativeGenerateUnexpLog & 4352) != 0) {
                            f1485Z = ExitType.UNEXP_REASON_KILL_PROCESS;
                            i5 = 30;
                        } else if ((iNativeGenerateUnexpLog & LogType.UNEXP_EXIT) != 0) {
                            f1485Z = 104;
                            i5 = 31;
                        } else if ((iNativeGenerateUnexpLog & LogType.UNEXP_RESTART) != 0) {
                            f1485Z = ExitType.UNEXP_REASON_RESTART;
                            i5 = 32;
                        } else {
                            if ((iNativeGenerateUnexpLog & LogType.UNEXP_ANR) != 0) {
                                f1485Z = ExitType.UNEXP_REASON_ANR;
                                C3311f.m2672a(10);
                            } else if ((iNativeGenerateUnexpLog & LogType.UNEXP_LOW_MEMORY) != 0) {
                                f1485Z = ExitType.UNEXP_REASON_LOW_MEMORY;
                                C3311f.m2672a(29);
                            } else {
                                f1485Z = 102;
                            }
                            m2573a(true);
                        }
                        C3311f.m2672a(i5);
                        m2573a(true);
                    }
                    synchronized (obj) {
                        f1483X = null;
                    }
                    return;
                }
            case 403:
                m2582aa();
                return;
            case 404:
            default:
                if (!f1486a) {
                    throw new AssertionError();
                }
                return;
            case 405:
                f1471L = false;
                StringBuilder sbM2548X = m2548X();
                String strM2489d = C3307b.m2489d();
                if (sbM2548X != null) {
                    C3305g.m2373a(new File(strM2489d), sbM2548X.toString());
                    return;
                }
                return;
            case 406:
                if (!f1486a && objArr == null) {
                    throw new AssertionError();
                }
                m2569a((String) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Boolean) objArr[2]).booleanValue());
                return;
            case 407:
                try {
                    C3298a.m2305d();
                    return;
                } catch (Throwable th) {
                    C3305g.m2370a(th);
                    return;
                }
            case 408:
                synchronized (f1488ab) {
                    if (!f1489ac && C3312g.m2707O() && C3307b.m2509w()) {
                        C3307b.m2502p();
                        C3306h.m2427f();
                        C3311f.m2686c();
                        if (C3307b.m2447C()) {
                            m2526B();
                        }
                        if (C3312g.m2707O()) {
                            m2572a(Calendar.getInstance());
                        }
                        f1489ac = true;
                        return;
                    }
                    return;
                }
            case 409:
                m2584b(false, false);
                return;
            case 410:
                m2581a(false, true);
                return;
            case 411:
                if (C3307b.f1428d) {
                    JNIBridge.set(28, m2603c(LogType.NATIVE_TYPE));
                    JNIBridge.set(29, m2603c(LogType.ANR_TYPE));
                    return;
                }
                return;
            case 412:
                if (!f1477R && C3307b.m2511y() && C3312g.m2703K()) {
                    m2588b(C3305g.m2361a());
                    return;
                }
                if (f1477R) {
                    if (C3307b.m2511y() && C3312g.m2703K()) {
                        return;
                    }
                    try {
                        C3305g.m2361a().unregisterReceiver(f1476Q);
                        f1477R = false;
                        return;
                    } catch (Throwable th2) {
                        C3305g.m2370a(th2);
                        return;
                    }
                }
                return;
            case 413:
                JNIBridge.cmd(8);
                return;
            case 414:
                try {
                    if (m2608d(C3305g.m2361a())) {
                        return;
                    }
                    int i6 = f1473N + 1;
                    f1473N = i6;
                    if (i6 < 10) {
                        m2547W();
                        return;
                    } else {
                        if (C3307b.f1428d) {
                            JNIBridge.set(130, "(get failed)");
                            return;
                        }
                        return;
                    }
                } catch (Throwable th3) {
                    C3305g.m2370a(th3);
                    return;
                }
            case 415:
                if (!f1486a && objArr == null) {
                    throw new AssertionError();
                }
                long jLongValue = ((Long) objArr[0]).longValue();
                Calendar calendar = Calendar.getInstance();
                if (calendar.getTimeInMillis() >= jLongValue) {
                    C3306h.m2428g();
                    C3311f.m2672a(100);
                    m2584b(true, true);
                    C3306h.m2414b();
                } else {
                    C3306h.m2429h();
                    C3306h.m2430i();
                    C3306h.m2423c();
                }
                m2572a(calendar);
                break;
            case 416:
                break;
        }
        m2546V();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m2607d(java.io.OutputStream r12) {
        /*
            java.lang.String r0 = "UTF-8"
            r1 = 0
            r2 = 0
            int r3 = com.p040uc.crashsdk.C3312g.m2701I()     // Catch: java.lang.Throwable -> L1c
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = "/proc/self/task"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L1a
            java.io.File[] r1 = r4.listFiles()     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L16
            return
        L16:
            int r4 = r1.length     // Catch: java.lang.Throwable -> L1a
            if (r4 >= r3) goto L23
            return
        L1a:
            r4 = move-exception
            goto L1f
        L1c:
            r4 = move-exception
            r3 = 300(0x12c, float:4.2E-43)
        L1f:
            com.p040uc.crashsdk.p041a.C3305g.m2370a(r4)
            r4 = r2
        L23:
            if (r1 != 0) goto L26
            return
        L26:
            java.lang.String r5 = "threads info:\n"
            byte[] r5 = r5.getBytes(r0)     // Catch: java.lang.Throwable -> L8e
            r12.write(r5)     // Catch: java.lang.Throwable -> L8e
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = "threads count: %d, dump limit: %d.\n"
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L8e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L8e
            r8[r2] = r4     // Catch: java.lang.Throwable -> L8e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L8e
            r4 = 1
            r8[r4] = r3     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = java.lang.String.format(r5, r6, r8)     // Catch: java.lang.Throwable -> L8e
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L8e
            r12.write(r3)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = " tid     name\n"
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L8e
            r12.write(r3)     // Catch: java.lang.Throwable -> L8e
            int r3 = r1.length     // Catch: java.lang.Throwable -> L8e
            r5 = r2
        L59:
            if (r5 >= r3) goto L92
            r6 = r1[r5]     // Catch: java.lang.Throwable -> L8e
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L8e
            java.lang.String r9 = r6.getPath()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r10 = "comm"
            r8.<init>(r9, r10)     // Catch: java.lang.Throwable -> L8e
            r9 = 128(0x80, float:1.8E-43)
            java.lang.String r8 = com.p040uc.crashsdk.p041a.C3305g.m2362a(r8, r9, r2)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r8 = m2632k(r8)     // Catch: java.lang.Throwable -> L8e
            java.util.Locale r9 = java.util.Locale.US     // Catch: java.lang.Throwable -> L8e
            java.lang.String r10 = "%5s %s\n"
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L8e
            r11[r2] = r6     // Catch: java.lang.Throwable -> L8e
            r11[r4] = r8     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = java.lang.String.format(r9, r10, r11)     // Catch: java.lang.Throwable -> L8e
            byte[] r6 = r6.getBytes(r0)     // Catch: java.lang.Throwable -> L8e
            r12.write(r6)     // Catch: java.lang.Throwable -> L8e
            int r5 = r5 + 1
            goto L59
        L8e:
            r0 = move-exception
            m2571a(r0, r12)
        L92:
            m2565a(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p040uc.crashsdk.C3310e.m2607d(java.io.OutputStream):void");
    }

    /* renamed from: com.uc.crashsdk.e$a */
    public static class a extends OutputStream {

        /* renamed from: a */
        private final long f1518a;

        /* renamed from: b */
        private final OutputStream f1519b;

        /* renamed from: c */
        private int f1520c = 0;

        /* renamed from: d */
        private int f1521d = 0;

        /* renamed from: e */
        private boolean f1522e = false;

        public a(long j4, OutputStream outputStream) {
            this.f1518a = j4;
            this.f1519b = outputStream;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private int m2656a(byte[] r6, int r7, int r8) throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f1521d
                int r0 = r0 + r8
                r5.f1521d = r0
                boolean r0 = r5.f1522e
                if (r0 == 0) goto Lb
                r6 = 0
                return r6
            Lb:
                int r0 = com.p040uc.crashsdk.C3312g.m2751y()
                if (r0 <= 0) goto L19
                int r1 = r5.f1520c
                int r2 = r1 + r8
                if (r2 <= r0) goto L19
                int r0 = r0 - r1
                goto L1a
            L19:
                r0 = r8
            L1a:
                int r1 = r5.f1520c
                int r1 = r1 + r0
                r5.f1520c = r1
                long r1 = r5.f1518a
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 == 0) goto L30
                java.lang.String r1 = new java.lang.String
                r1.<init>(r6, r7, r0)
                r5.m2657b(r1)
                goto L35
            L30:
                java.io.OutputStream r1 = r5.f1519b
                r1.write(r6, r7, r0)
            L35:
                if (r0 >= r8) goto L3a
                r6 = 1
                r5.f1522e = r6
            L3a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p040uc.crashsdk.C3310e.a.m2656a(byte[], int, int):int");
        }

        /* renamed from: b */
        private void m2657b(String str) {
            if (C3307b.f1428d) {
                JNIBridge.nativeClientWriteData(this.f1518a, str);
            }
        }

        @Override // java.io.OutputStream
        public final void write(int i4) throws IOException {
            if (C3310e.f1498h && C3310e.m2538N()) {
                C3299a.m2324d("DEBUG", String.format(Locale.US, "%c", Integer.valueOf(i4)));
            }
            if (this.f1518a != 0) {
                m2657b(String.format(Locale.US, "%c", Integer.valueOf(i4)));
            } else {
                this.f1519b.write(i4);
            }
            this.f1520c++;
            this.f1521d++;
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i4, int i5) throws IOException {
            if (C3310e.f1498h && C3310e.m2538N()) {
                byte[] bArr2 = new byte[i5];
                System.arraycopy(bArr, i4, bArr2, 0, i5);
                if (i5 != 1 || bArr2[0] != 10) {
                    try {
                        C3299a.m2324d("DEBUG", new String(bArr2));
                    } catch (Throwable unused) {
                    }
                }
            }
            m2656a(bArr, i4, i5);
        }

        /* renamed from: a */
        public final void m2658a() {
            try {
                if (this.f1521d - this.f1520c > 0) {
                    m2659a("\n");
                    m2659a("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
                }
                m2659a(String.format(Locale.US, "Full: %d bytes, write: %d bytes, limit: %d bytes, reject: %d bytes.\n", Integer.valueOf(this.f1521d), Integer.valueOf(this.f1520c), Integer.valueOf(C3312g.m2751y()), Integer.valueOf(this.f1521d - this.f1520c)));
            } catch (Throwable th) {
                C3305g.m2370a(th);
            }
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            if (C3310e.f1498h && C3310e.m2538N() && (bArr.length != 1 || bArr[0] != 10)) {
                try {
                    C3299a.m2324d("DEBUG", new String(bArr));
                } catch (Throwable unused) {
                }
            }
            m2656a(bArr, 0, bArr.length);
        }

        /* renamed from: a */
        public final void m2659a(String str) throws IOException {
            if (C3310e.f1498h && C3310e.m2538N()) {
                C3299a.m2324d("DEBUG", str);
            }
            if (this.f1518a != 0) {
                m2657b(str);
            } else {
                this.f1519b.write(str.getBytes("UTF-8"));
            }
        }
    }

    /* renamed from: f */
    private static void m2618f(OutputStream outputStream) {
        String strM2314m;
        try {
            outputStream.write("recent status:\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            m2571a(th, outputStream);
        }
        try {
            if (f1492af) {
                strM2314m = m2645r("LASTVER");
            } else {
                strM2314m = C3298a.m2314m();
            }
            outputStream.write(String.format(Locale.US, "last version: '%s'\n", strM2314m).getBytes("UTF-8"));
        } catch (Throwable th2) {
            m2571a(th2, outputStream);
        }
        try {
            ArrayList<String> arrayList = f1508r;
            synchronized (arrayList) {
                if (f1510t != null) {
                    outputStream.write(String.format(Locale.US, "generating log: %s\n", f1510t).getBytes("UTF-8"));
                }
                if (f1509s > 0 || arrayList.size() > 0) {
                    outputStream.write(String.format(Locale.US, "generated %d logs, recent are:\n", Integer.valueOf(f1509s)).getBytes("UTF-8"));
                    Iterator<String> it = arrayList.iterator();
                    while (it.hasNext()) {
                        outputStream.write(String.format(Locale.US, "* %s\n", it.next()).getBytes("UTF-8"));
                    }
                }
            }
            Locale locale = Locale.US;
            outputStream.write(String.format(locale, "dumping all threads: %s\n", Boolean.valueOf(f1511u)).getBytes("UTF-8"));
            String str = f1512v;
            if (str != null) {
                outputStream.write(String.format(locale, "dumping threads: %s\n", str).getBytes("UTF-8"));
            }
        } catch (Throwable th3) {
            m2571a(th3, outputStream);
        }
        m2565a(outputStream);
    }

    /* renamed from: g */
    public static String m2622g() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("JavaMax:    ");
            sb.append(Runtime.getRuntime().maxMemory() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
            sb.append(" kB\n");
            sb.append("JavaTotal:  ");
            sb.append(Runtime.getRuntime().totalMemory() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
            sb.append(" kB\n");
            sb.append("JavaFree:   ");
            sb.append(Runtime.getRuntime().freeMemory() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
            sb.append(" kB\n");
            sb.append("NativeHeap: ");
            sb.append(Debug.getNativeHeapSize() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
            sb.append(" kB\n");
            sb.append("NativeAllocated: ");
            sb.append(Debug.getNativeHeapAllocatedSize() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
            sb.append(" kB\n");
            sb.append("NativeFree: ");
            sb.append(Debug.getNativeHeapFreeSize() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
            sb.append(" kB\n");
            try {
                ActivityManager activityManager = (ActivityManager) C3305g.m2361a().getSystemService("activity");
                if (activityManager != null) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    sb.append("availMem:   ");
                    sb.append(memoryInfo.availMem / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
                    sb.append(" kB\n");
                    sb.append("threshold:  ");
                    sb.append(memoryInfo.threshold / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
                    sb.append(" kB\n");
                    sb.append("lowMemory:  ");
                    sb.append(memoryInfo.lowMemory);
                    sb.append("\n");
                }
            } catch (Throwable th) {
                C3305g.m2370a(th);
            }
            return sb.toString();
        } catch (Throwable th2) {
            C3305g.m2370a(th2);
            return "";
        }
    }

    /* renamed from: com.uc.crashsdk.e$d */
    public static class d {

        /* renamed from: a */
        long f1523a;

        /* renamed from: b */
        long f1524b;

        /* renamed from: c */
        int f1525c;

        /* renamed from: d */
        int f1526d;

        /* renamed from: e */
        boolean f1527e;

        /* renamed from: f */
        boolean f1528f;

        /* renamed from: g */
        boolean f1529g;

        private d() {
            this.f1523a = 0L;
            this.f1524b = 0L;
            this.f1525c = 0;
            this.f1526d = 0;
            this.f1527e = false;
            this.f1528f = false;
            this.f1529g = false;
        }

        public /* synthetic */ d(byte b4) {
            this();
        }
    }

    /* renamed from: l */
    public static void m2634l() {
        if (f1492af) {
            return;
        }
        C3304f.m2357a(1, new RunnableC3303e(411), 1000L);
    }

    /* renamed from: i */
    public static boolean m2628i() {
        return f1495d;
    }

    /* renamed from: o */
    public static void m2639o() {
        String strM2362a;
        Throwable th;
        File file;
        if (C3305g.m2375a(f1461B)) {
            String string = null;
            try {
                file = new File(C3312g.m2713U() + "unique");
            } catch (Throwable th2) {
                strM2362a = string;
                th = th2;
            }
            if (file.exists()) {
                strM2362a = C3305g.m2362a(file, 48, false);
                try {
                    if (strM2362a != null) {
                        try {
                            if (strM2362a.length() == 36) {
                                string = strM2362a.replaceAll("[^0-9a-zA-Z-]", "-");
                            }
                        } catch (Exception e4) {
                            C3305g.m2370a(e4);
                        }
                    } else {
                        string = strM2362a;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    C3305g.m2370a(th);
                    string = strM2362a;
                    f1461B = string;
                }
                f1461B = string;
            }
            if (C3305g.m2375a(string)) {
                C3307b.m2448D();
                string = UUID.randomUUID().toString();
                if (!C3305g.m2375a(string)) {
                    C3305g.m2374a(file, string.getBytes());
                }
            }
            f1461B = string;
        }
    }

    /* renamed from: p */
    public static String m2641p() {
        return f1461B;
    }

    /* renamed from: q */
    public static void m2643q() {
        f1474O = false;
        if (!C3307b.m2511y()) {
            C3304f.m2357a(3, new RunnableC3303e(416), 11000L);
        }
        if (m2545U()) {
            return;
        }
        f1473N = 0;
        m2547W();
    }

    /* renamed from: b */
    private static void m2591b(OutputStream outputStream, String str, String str2) {
        String strM2645r;
        String strNativeGet;
        try {
            outputStream.write("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            m2571a(th, outputStream);
        }
        try {
            Locale locale = Locale.US;
            outputStream.write(String.format(locale, "Basic Information: 'pid: %d/tid: %d/time: %s'\n", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()), m2635m()).getBytes("UTF-8"));
            Object[] objArr = new Object[3];
            objArr[0] = m2612e();
            if (C3305g.m2375a(f1502l)) {
                m2543S();
            }
            objArr[1] = f1502l;
            objArr[2] = m2616f();
            outputStream.write(String.format(locale, "Cpu Information: 'abi: %s/processor: %s/hardware: %s'\n", objArr).getBytes("UTF-8"));
        } catch (Throwable th2) {
            m2571a(th2, outputStream);
        }
        try {
            Locale locale2 = Locale.US;
            outputStream.write(String.format(locale2, "Mobile Information: 'model: %s/version: %s/sdk: %d'\n", Build.MODEL, Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT)).getBytes("UTF-8"));
            outputStream.write(("Build fingerprint: '" + Build.FINGERPRINT + "'\n").getBytes("UTF-8"));
            Object[] objArr2 = new Object[4];
            objArr2[0] = m2559a(new Date(f1493b));
            objArr2[1] = Long.valueOf(Runtime.getRuntime().maxMemory());
            objArr2[2] = C3305g.m2384d();
            objArr2[3] = C3307b.m2511y() ? "fg" : "bg";
            outputStream.write(String.format(locale2, "Runtime Information: 'start: %s/maxheap: %s/primaryabi: %s/ground: %s'\n", objArr2).getBytes("UTF-8"));
        } catch (Throwable th3) {
            m2571a(th3, outputStream);
        }
        try {
            Locale locale3 = Locale.US;
            outputStream.write(String.format(locale3, "Application Information: 'version: %s/subversion: %s/buildseq: %s/versioncode: %d'\n", C3312g.m2710R(), C3312g.m2711S(), C3312g.m2712T(), Integer.valueOf(C3298a.m2303c())).getBytes("UTF-8"));
            String str3 = "0";
            String str4 = "";
            if (C3307b.f1428d) {
                String strNativeGet2 = JNIBridge.nativeGet(1, 0L, null);
                strNativeGet = JNIBridge.nativeGet(2, 0L, null);
                str3 = strNativeGet2;
            } else {
                strNativeGet = "";
            }
            outputStream.write(String.format(locale3, "CrashSDK Information: 'version: %s/nativeseq: %s/javaseq: %s/arch: %s/target: %s'\n", "3.2.0.4", str3, "210105150455", strNativeGet, "release").getBytes("UTF-8"));
            if (str != null) {
                str4 = str;
            }
            outputStream.write(("Report Name: " + str4.substring(str4.lastIndexOf(47) + 1) + "\n").getBytes("UTF-8"));
        } catch (Throwable th4) {
            m2571a(th4, outputStream);
        }
        try {
            if (f1492af) {
                strM2645r = m2645r("UUID");
            } else {
                strM2645r = f1461B;
            }
            outputStream.write(String.format("UUID: %s\n", strM2645r).getBytes("UTF-8"));
            outputStream.write(("Log Type: " + str2 + "\n").getBytes("UTF-8"));
        } catch (Throwable th5) {
            m2571a(th5, outputStream);
        }
        try {
            String strM2446B = C3307b.m2446B();
            if (C3305g.m2375a(strM2446B)) {
                strM2446B = "(none)";
            }
            outputStream.write(("Activity: " + strM2446B + "\n").getBytes("UTF-8"));
        } catch (Throwable th6) {
            m2571a(th6, outputStream);
        }
        m2565a(outputStream);
        try {
            C3298a.m2290a(outputStream, "UTF-8");
            if (f1492af) {
                f1498h = false;
                outputStream.write(m2645r("HEADER").getBytes("UTF-8"));
                f1498h = true;
            }
        } catch (Throwable th7) {
            m2571a(th7, outputStream);
        }
        m2565a(outputStream);
    }

    /* renamed from: m */
    public static String m2635m() {
        return m2559a(new Date());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m2608d(Context context) {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        boolean z3 = false;
        if (activityManager == null || (processesInErrorState = activityManager.getProcessesInErrorState()) == null) {
            return false;
        }
        int iMyPid = Process.myPid();
        Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ActivityManager.ProcessErrorStateInfo next = it.next();
            if (next.pid == iMyPid) {
                f1474O = true;
                if (m2538N()) {
                    C3299a.m2324d("crashsdk", "ANR occurred in process: " + next.processName);
                }
                if (C3307b.f1428d) {
                    JNIBridge.set(130, next.longMsg);
                }
                z3 = true;
            }
        }
        if (!z3 && C3307b.f1428d) {
            m2546V();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m2573a(boolean z3) {
        File[] fileArrListFiles;
        try {
            if (C3307b.m2508v() && (fileArrListFiles = new File(C3312g.m2714V()).listFiles()) != null) {
                int iM2738l = C3312g.m2738l();
                int iM2739m = C3312g.m2739m();
                if (fileArrListFiles.length < Math.min(iM2738l, iM2739m)) {
                    return;
                }
                Object[] objArr = 0;
                int i4 = 0;
                int i5 = 0;
                for (File file : fileArrListFiles) {
                    if (m2597b(file)) {
                        i4++;
                    } else {
                        i5++;
                    }
                }
                int i6 = (!z3 || i4 < iM2738l) ? 0 : (i4 - iM2738l) + 1;
                int i7 = (z3 || i5 < iM2739m) ? 0 : (i5 - iM2739m) + 1;
                if (i6 == 0 && i7 == 0) {
                    return;
                }
                Arrays.sort(fileArrListFiles, new b(objArr == true ? 1 : 0));
                int i8 = i6;
                int i9 = i7;
                for (File file2 : fileArrListFiles) {
                    boolean zM2597b = m2597b(file2);
                    if (zM2597b && i8 > 0) {
                        C3299a.m2319a("crashsdk", "Delete oldest crash log: " + file2.getPath());
                        file2.delete();
                        i8 += -1;
                    } else if (!zM2597b && i9 > 0) {
                        C3299a.m2319a("crashsdk", "Delete oldest custom log: " + file2.getPath());
                        file2.delete();
                        i9 += -1;
                    }
                    if (i8 == 0 && i9 == 0) {
                        break;
                    }
                }
                C3311f.m2673a(16, i6 + i7);
                if (i6 > 0) {
                    C3311f.m2673a(22, i6);
                }
                if (i7 > 0) {
                    C3311f.m2673a(23, i7);
                }
            }
        } catch (Throwable th) {
            C3305g.m2370a(th);
        }
    }

    /* renamed from: n */
    public static void m2637n() {
        f1493b = System.currentTimeMillis();
    }

    /* renamed from: e */
    private static void m2614e(OutputStream outputStream) {
        BufferedReader bufferedReader;
        int iIndexOf;
        if (C3307b.f1428d) {
            try {
                outputStream.write("solib build id:\n".getBytes("UTF-8"));
            } catch (Throwable th) {
                m2571a(th, outputStream);
            }
            FileReader fileReader = null;
            try {
                ArrayList arrayList = new ArrayList();
                FileReader fileReader2 = new FileReader(new File("/proc/self/maps"));
                try {
                    bufferedReader = new BufferedReader(fileReader2, 512);
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            if (line.endsWith(".so") && (iIndexOf = line.indexOf(47)) != -1) {
                                String strSubstring = line.substring(iIndexOf);
                                if ((strSubstring.contains("/data/") || strSubstring.contains(C3298a.f1309a)) && !arrayList.contains(strSubstring)) {
                                    arrayList.add(strSubstring);
                                    if (f1492af) {
                                        try {
                                            outputStream.write((String.format("$^%s`%s^$", "SOBUILDID", strSubstring) + "\n").getBytes("UTF-8"));
                                        } catch (Throwable th2) {
                                            m2571a(th2, outputStream);
                                        }
                                    } else {
                                        outputStream.write(String.format(Locale.US, "%s: %s\n", strSubstring, JNIBridge.nativeGet(3, 0L, strSubstring)).getBytes("UTF-8"));
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileReader = fileReader2;
                            try {
                                m2571a(th, outputStream);
                                C3305g.m2368a(fileReader);
                                C3305g.m2368a(bufferedReader);
                                m2565a(outputStream);
                            } catch (Throwable th4) {
                                C3305g.m2368a(fileReader);
                                C3305g.m2368a(bufferedReader);
                                throw th4;
                            }
                        }
                    }
                    C3305g.m2368a(fileReader2);
                } catch (Throwable th5) {
                    th = th5;
                    bufferedReader = null;
                }
            } catch (Throwable th6) {
                th = th6;
                bufferedReader = null;
            }
            C3305g.m2368a(bufferedReader);
            m2565a(outputStream);
        }
    }

    /* renamed from: c */
    public static boolean m2603c(String str) {
        if (f1492af) {
            return true;
        }
        try {
            return m2640o(str);
        } catch (Throwable th) {
            C3305g.m2370a(th);
            return true;
        }
    }

    /* renamed from: d */
    public static boolean m2609d(String str) {
        try {
            if (!C3305g.m2380b(str) || !str.startsWith("lib") || !str.endsWith(".so")) {
                return false;
            }
            System.loadLibrary(str.substring(3, str.length() - 3));
            return true;
        } catch (Throwable th) {
            C3305g.m2370a(th);
            return false;
        }
    }

    /* renamed from: c */
    public static void m2601c(boolean z3) {
        boolean z4 = true;
        if (!f1477R ? !z3 || !C3312g.m2703K() : z3 && C3312g.m2703K()) {
            z4 = false;
        }
        if (z4) {
            RunnableC3303e runnableC3303e = f1478S;
            if (C3304f.m2359b(runnableC3303e)) {
                C3304f.m2355a(runnableC3303e);
            }
            C3304f.m2357a(0, runnableC3303e, 3000L);
        }
    }

    /* renamed from: a */
    public static String m2557a(String str, String str2) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(Build.VERSION.SDK_INT >= 26 ? new String[]{"ps", "-ef"} : new String[]{"ps"}).getInputStream()));
            boolean zM2380b = C3305g.m2380b(str);
            boolean zM2380b2 = C3305g.m2380b(str2);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    if ((zM2380b && line.contains(str)) || (zM2380b2 && line.contains(str2)) || (line.indexOf(47) < 0 && line.indexOf(46) > 0)) {
                        byteArrayOutputStream.write(line.getBytes("UTF-8"));
                        byteArrayOutputStream.write("\n".getBytes("UTF-8"));
                    }
                } else {
                    return byteArrayOutputStream.toString("UTF-8");
                }
            }
        } catch (Throwable th) {
            C3305g.m2370a(th);
            return "exception exists.";
        }
    }

    /* renamed from: a */
    private static BufferedReader m2553a(InputStreamReader inputStreamReader) {
        BufferedReader bufferedReader = null;
        int i4 = 8192;
        while (bufferedReader == null && i4 > 0) {
            try {
                bufferedReader = new BufferedReader(inputStreamReader, i4);
            } catch (Throwable unused) {
                i4 /= 2;
                if (i4 < 512) {
                    break;
                }
            }
        }
        return bufferedReader;
    }

    /* renamed from: a */
    private static void m2565a(OutputStream outputStream) {
        try {
            outputStream.write("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            m2571a(th, outputStream);
        }
    }

    /* renamed from: e */
    public static int m2611e(boolean z3) {
        int iM2680b;
        if (z3) {
            iM2680b = C3311f.m2677a(C3307b.m2486c()) ? 1 : 0;
        } else {
            iM2680b = C3311f.m2680b();
        }
        int iM2681b = C3311f.m2681b(z3);
        return iM2681b > iM2680b ? iM2681b : iM2680b;
    }

    /* renamed from: a */
    private static String m2555a(File file) {
        String canonicalPath;
        try {
            canonicalPath = file.getCanonicalPath();
        } catch (Throwable unused) {
            canonicalPath = null;
        }
        return C3305g.m2375a(canonicalPath) ? file.getPath() : canonicalPath;
    }

    /* renamed from: e */
    public static StringBuilder m2613e(String str) {
        return m2560a(Thread.currentThread().getStackTrace(), str);
    }

    /* renamed from: a */
    private static long m2552a(StatFs statFs, String str, String str2) {
        try {
            Method declaredMethod = StatFs.class.getDeclaredMethod(str, new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(statFs, new Object[0]);
            if (objInvoke != null && (objInvoke instanceof Long)) {
                return ((Long) objInvoke).longValue();
            }
        } catch (Throwable unused) {
        }
        try {
            Method declaredMethod2 = StatFs.class.getDeclaredMethod(str2, new Class[0]);
            declaredMethod2.setAccessible(true);
            Object objInvoke2 = declaredMethod2.invoke(statFs, new Object[0]);
            if (objInvoke2 == null || !(objInvoke2 instanceof Integer)) {
                return 0L;
            }
            return ((Integer) objInvoke2).intValue();
        } catch (Throwable th) {
            C3305g.m2370a(th);
            return 0L;
        }
    }

    /* renamed from: b */
    private static void m2590b(OutputStream outputStream) {
        BufferedReader bufferedReaderM2553a = null;
        try {
            outputStream.write("logcat:\n".getBytes("UTF-8"));
        } finally {
        }
        try {
            if (C3312g.m2740n() <= 0) {
                try {
                    outputStream.write("[DEBUG] custom java logcat lines count is 0!\n".getBytes("UTF-8"));
                } catch (Throwable th) {
                    m2571a(th, outputStream);
                }
                m2565a(outputStream);
                return;
            }
            int iM2740n = C3312g.m2740n();
            bufferedReaderM2553a = m2553a(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"logcat", "-d", "-b", C3380c.f2000ar, "-b", "main", "-v", "threadtime", "-t", String.valueOf(iM2740n)}).getInputStream()));
            if (bufferedReaderM2553a == null) {
                try {
                    outputStream.write("[DEBUG] alloc buffer failed!\n".getBytes("UTF-8"));
                } catch (Throwable th2) {
                    m2571a(th2, outputStream);
                }
                m2565a(outputStream);
                return;
            }
            f1498h = false;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                String line = bufferedReaderM2553a.readLine();
                if (line != null) {
                    i4++;
                    if (i5 < iM2740n && !line.contains(" I auditd ") && !line.contains(" I liblog ")) {
                        outputStream.write(line.getBytes("UTF-8"));
                        outputStream.write("\n".getBytes("UTF-8"));
                        i5++;
                    }
                } else {
                    try {
                        break;
                    } catch (Throwable th3) {
                        m2571a(th3, outputStream);
                    }
                }
            }
            outputStream.write(String.format(Locale.US, "[DEBUG] Read %d lines, wrote %d lines.\n", Integer.valueOf(i4), Integer.valueOf(i5)).getBytes("UTF-8"));
            f1498h = true;
            C3305g.m2368a(bufferedReaderM2553a);
            m2565a(outputStream);
            return;
            C3305g.m2368a(bufferedReaderM2553a);
            m2565a(outputStream);
            return;
        } finally {
        }
    }

    /* renamed from: a */
    private static void m2563a(a aVar) {
        try {
            aVar.m2659a(String.format(Locale.US, "log end: %s\n", m2635m()));
        } catch (Throwable th) {
            m2571a(th, aVar);
        }
    }

    /* renamed from: a */
    public static int m2551a(OutputStream outputStream, String str, int i4) {
        int i5 = 0;
        if (str == null) {
            m2565a(outputStream);
            return 0;
        }
        try {
            String strM2325a = C3300b.m2325a(str);
            if (strM2325a == null) {
                strM2325a = "file: '" + str + "' not found or decode failed!";
            }
            int length = strM2325a.length();
            if (length <= i4 + 32) {
                i4 = length;
            }
            if (i4 > 0) {
                try {
                    outputStream.write(strM2325a.getBytes("UTF-8"), 0, i4);
                    outputStream.write("\n".getBytes("UTF-8"));
                } catch (Throwable th) {
                    th = th;
                    i5 = i4;
                    m2571a(th, outputStream);
                    i4 = i5;
                    m2565a(outputStream);
                    return i4;
                }
            }
            if (i4 < strM2325a.length()) {
                outputStream.write(String.format(Locale.US, "(truncated %d bytes)\n", Integer.valueOf(strM2325a.length() - i4)).getBytes("UTF-8"));
            }
        } catch (Throwable th2) {
            th = th2;
        }
        m2565a(outputStream);
        return i4;
    }

    /* renamed from: a */
    public static String m2554a(int i4) {
        try {
            String strM2362a = C3305g.m2362a(new File(String.format(Locale.US, "/proc/%d/cmdline", Integer.valueOf(i4))), 128, false);
            return C3305g.m2380b(strM2362a) ? m2632k(strM2362a) : EnvironmentCompat.MEDIA_UNKNOWN;
        } catch (Throwable th) {
            C3305g.m2370a(th);
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
    }

    /* renamed from: b */
    private static void m2589b(a aVar) {
        f1498h = false;
        try {
            aVar.write((m2645r("LOG_END") + "\n").getBytes("UTF-8"));
        } catch (Throwable th) {
            C3305g.m2370a(th);
        }
        f1498h = true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|2|(49:319|3|4|(2:357|6)|9|(1:11)(1:13)|14|312|15|(1:17)|21|(2:337|23)|(2:341|28)|289|32|314|33|(1:35)|39|(1:43)|305|47|(2:329|51)|55|(2:339|56)|(2:345|61)|(2:281|67)|72|310|73|77|(2:353|78)|(2:323|82)|86|(2:335|87)|92|(4:94|287|95|99)|303|100|105|316|106|(2:333|111)|309|115|(1:117)(2:118|(1:120))|124|(2:331|125)|129)|(4:131|277|132|136)(10:299|139|(0)(8:146|285|147|148|149|291|150|(14:152|153|283|154|351|155|156|347|157|176|327|177|181|(21:183|355|184|206|207|343|208|213|(4:215|297|216|220)|307|221|226|325|227|232|(4:234|349|235|239)|240|295|241|(1:247)|248)(25:321|189|(1:191)|192|(1:194)|195|(4:197|(1:199)(1:201)|200|202)|206|207|343|208|213|(0)|307|221|226|325|227|232|(0)|240|295|241|(0)|248))(7:169|138|176|327|177|181|(0)(0)))|258|(1:260)|293|261|(1:263)(1:264)|265|269)|137|138|176|327|177|181|(0)(0)|258|(0)|293|261|(0)(0)|265|269|(2:(0)|(1:313))) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:183|(2:355|184)|206|207|343|208|213|(4:215|297|216|220)|307|221|226|325|227|232|(4:234|349|235|239)|240|295|241|(1:247)|248) */
    /* JADX WARN: Can't wrap try/catch for region: R(68:0|2|319|3|4|(2:357|6)|9|(1:11)(1:13)|14|312|15|(1:17)|21|(2:337|23)|(2:341|28)|289|32|314|33|(1:35)|39|(1:43)|305|47|(2:329|51)|55|(2:339|56)|(2:345|61)|(2:281|67)|72|310|73|77|(2:353|78)|323|82|86|(2:335|87)|92|(4:94|287|95|99)|303|100|105|316|106|(2:333|111)|309|115|(1:117)(2:118|(1:120))|124|(2:331|125)|129|(4:131|277|132|136)(10:299|139|(0)(8:146|285|147|148|149|291|150|(14:152|153|283|154|351|155|156|347|157|176|327|177|181|(21:183|355|184|206|207|343|208|213|(4:215|297|216|220)|307|221|226|325|227|232|(4:234|349|235|239)|240|295|241|(1:247)|248)(25:321|189|(1:191)|192|(1:194)|195|(4:197|(1:199)(1:201)|200|202)|206|207|343|208|213|(0)|307|221|226|325|227|232|(0)|240|295|241|(0)|248))(7:169|138|176|327|177|181|(0)(0)))|258|(1:260)|293|261|(1:263)(1:264)|265|269)|137|138|176|327|177|181|(0)(0)|258|(0)|293|261|(0)(0)|265|269|(2:(0)|(1:313))) */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0342, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0343, code lost:
    
        m2571a(r0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0411, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0413, code lost:
    
        m2571a(r0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0436, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0438, code lost:
    
        com.p040uc.crashsdk.p041a.C3305g.m2370a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0440, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0442, code lost:
    
        m2571a(r0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x046b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x046d, code lost:
    
        com.p040uc.crashsdk.p041a.C3305g.m2370a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x04a9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x04aa, code lost:
    
        com.p040uc.crashsdk.p041a.C3305g.m2370a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:183:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x041a A[Catch: all -> 0x0479, TRY_LEAVE, TryCatch #18 {all -> 0x0479, blocks: (B:21:0x0040, B:55:0x0107, B:86:0x0183, B:92:0x0192, B:94:0x0196, B:99:0x01aa, B:98:0x01a7, B:105:0x01b5, B:124:0x01fb, B:129:0x020c, B:131:0x0210, B:136:0x0224, B:176:0x0335, B:181:0x0346, B:206:0x0401, B:213:0x0416, B:215:0x041a, B:220:0x042f, B:219:0x042c, B:232:0x0445, B:234:0x0449, B:239:0x045e, B:238:0x045b, B:240:0x0461, B:245:0x046d, B:231:0x0442, B:225:0x0438, B:212:0x0413, B:187:0x0360, B:180:0x0343, B:135:0x0221, B:175:0x0332, B:128:0x0209, B:123:0x01f8, B:114:0x01cc, B:110:0x01be, B:104:0x01b2, B:91:0x018f, B:85:0x0180, B:81:0x015f, B:76:0x0139, B:71:0x0124, B:65:0x0119, B:60:0x0110, B:54:0x0104, B:50:0x00f6, B:46:0x00e9, B:31:0x0090, B:27:0x004f, B:20:0x003d, B:132:0x0212, B:67:0x011e, B:95:0x0198, B:32:0x0093, B:39:0x00bf, B:41:0x00c5, B:43:0x00cf, B:38:0x00bc, B:33:0x009c, B:35:0x00ad, B:241:0x0467, B:216:0x041d, B:100:0x01ac, B:47:0x00ec, B:221:0x0432, B:115:0x01cf, B:117:0x01d3, B:118:0x01e5, B:120:0x01eb, B:73:0x0129, B:106:0x01b8, B:15:0x0032, B:17:0x0036, B:82:0x0162, B:227:0x043c, B:177:0x0338, B:51:0x00f9, B:125:0x01fe, B:111:0x01c1, B:87:0x0189, B:23:0x0049, B:56:0x010a, B:28:0x0052, B:208:0x040d, B:61:0x0113, B:235:0x044c, B:78:0x013d), top: B:312:0x0032, inners: #0, #2, #5, #6, #9, #10, #13, #14, #15, #16, #17, #20, #21, #24, #25, #26, #27, #28, #29, #30, #31, #32, #33, #34, #35, #37, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0449 A[Catch: all -> 0x0479, TRY_LEAVE, TryCatch #18 {all -> 0x0479, blocks: (B:21:0x0040, B:55:0x0107, B:86:0x0183, B:92:0x0192, B:94:0x0196, B:99:0x01aa, B:98:0x01a7, B:105:0x01b5, B:124:0x01fb, B:129:0x020c, B:131:0x0210, B:136:0x0224, B:176:0x0335, B:181:0x0346, B:206:0x0401, B:213:0x0416, B:215:0x041a, B:220:0x042f, B:219:0x042c, B:232:0x0445, B:234:0x0449, B:239:0x045e, B:238:0x045b, B:240:0x0461, B:245:0x046d, B:231:0x0442, B:225:0x0438, B:212:0x0413, B:187:0x0360, B:180:0x0343, B:135:0x0221, B:175:0x0332, B:128:0x0209, B:123:0x01f8, B:114:0x01cc, B:110:0x01be, B:104:0x01b2, B:91:0x018f, B:85:0x0180, B:81:0x015f, B:76:0x0139, B:71:0x0124, B:65:0x0119, B:60:0x0110, B:54:0x0104, B:50:0x00f6, B:46:0x00e9, B:31:0x0090, B:27:0x004f, B:20:0x003d, B:132:0x0212, B:67:0x011e, B:95:0x0198, B:32:0x0093, B:39:0x00bf, B:41:0x00c5, B:43:0x00cf, B:38:0x00bc, B:33:0x009c, B:35:0x00ad, B:241:0x0467, B:216:0x041d, B:100:0x01ac, B:47:0x00ec, B:221:0x0432, B:115:0x01cf, B:117:0x01d3, B:118:0x01e5, B:120:0x01eb, B:73:0x0129, B:106:0x01b8, B:15:0x0032, B:17:0x0036, B:82:0x0162, B:227:0x043c, B:177:0x0338, B:51:0x00f9, B:125:0x01fe, B:111:0x01c1, B:87:0x0189, B:23:0x0049, B:56:0x010a, B:28:0x0052, B:208:0x040d, B:61:0x0113, B:235:0x044c, B:78:0x013d), top: B:312:0x0032, inners: #0, #2, #5, #6, #9, #10, #13, #14, #15, #16, #17, #20, #21, #24, #25, #26, #27, #28, #29, #30, #31, #32, #33, #34, #35, #37, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0487 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0498 A[Catch: all -> 0x04a9, TryCatch #8 {all -> 0x04a9, blocks: (B:261:0x0494, B:263:0x0498, B:265:0x04a3), top: B:293:0x0494 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0365 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m2558a(java.lang.Throwable r23, java.lang.String r24, long r25, boolean r27) {
        /*
            Method dump skipped, instructions count: 1213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p040uc.crashsdk.C3310e.m2558a(java.lang.Throwable, java.lang.String, long, boolean):java.lang.String");
    }

    /* renamed from: b */
    public static int m2583b(OutputStream outputStream, String str, int i4) {
        int i5;
        DataInputStream dataInputStream;
        int i6;
        DataInputStream dataInputStream2 = null;
        int i7 = 0;
        try {
            File file = new File(str);
            if (file.exists()) {
                byte[] bArrM2541Q = m2541Q();
                if (bArrM2541Q == null) {
                    outputStream.write("(alloc buffer failed!)\n".getBytes("UTF-8"));
                    return 0;
                }
                dataInputStream = new DataInputStream(new FileInputStream(file));
                i6 = 0;
                i5 = 0;
                boolean z3 = false;
                while (true) {
                    try {
                        int i8 = dataInputStream.read(bArrM2541Q);
                        if (i8 == -1) {
                            break;
                        }
                        i6 += i8;
                        int i9 = i4 - i5;
                        if (i8 <= i9 + 32) {
                            i9 = i8;
                        }
                        if (i9 > 0 && !z3) {
                            outputStream.write(bArrM2541Q, 0, i9);
                            i5 += i9;
                        }
                        if (!z3) {
                            z3 = i9 < i8 || i5 >= i4;
                        }
                    } catch (Throwable th) {
                        th = th;
                        i7 = i5;
                        dataInputStream2 = dataInputStream;
                        try {
                            m2571a(th, outputStream);
                            C3305g.m2368a(dataInputStream2);
                            i5 = i7;
                            m2565a(outputStream);
                            return i5;
                        } finally {
                            C3305g.m2368a(dataInputStream2);
                        }
                    }
                }
            } else {
                outputStream.write(("file: '" + str + "' not exists!\n").getBytes("UTF-8"));
                dataInputStream = null;
                i6 = 0;
                i5 = 0;
            }
            if (i5 > 0) {
                outputStream.write("\n".getBytes("UTF-8"));
            }
            if (i5 < i6) {
                outputStream.write(String.format(Locale.US, "(truncated %d bytes)\n", Integer.valueOf(i6 - i5)).getBytes("UTF-8"));
            }
        } catch (Throwable th2) {
            th = th2;
        }
        m2565a(outputStream);
        return i5;
    }

    /* renamed from: b */
    public static void m2595b(boolean z3) {
        try {
            boolean zM2745s = C3312g.m2744r() && C3307b.m2447C() && !f1495d;
            if (!zM2745s) {
                zM2745s = C3312g.m2745s();
            }
            if (zM2745s) {
                if (z3) {
                    String strM2631k = m2631k();
                    if (C3305g.m2375a(strM2631k)) {
                        return;
                    }
                    m2630j();
                    m2569a(strM2631k, false, false);
                    return;
                }
                m2581a(true, false);
            }
        } catch (Throwable th) {
            C3305g.m2370a(th);
        }
    }

    /* renamed from: b */
    private static boolean m2597b(File file) {
        int iIndexOf;
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(95);
        if (iLastIndexOf <= 0 || (iIndexOf = name.indexOf(46, iLastIndexOf)) <= 0) {
            return false;
        }
        String strSubstring = name.substring(iLastIndexOf + 1, iIndexOf);
        return LogType.JAVA_TYPE.equals(strSubstring) || "ucebujava".equals(strSubstring) || LogType.NATIVE_TYPE.equals(strSubstring) || "ucebujni".equals(strSubstring) || LogType.UNEXP_TYPE.equals(strSubstring) || LogType.ANR_TYPE.equals(strSubstring);
    }

    /* renamed from: b */
    private static String m2586b(String str, boolean z3, boolean z4) {
        if (z3) {
            try {
                str = m2633l(str);
            } catch (Throwable th) {
                C3305g.m2370a(th);
            }
        }
        if (!z4) {
            return str;
        }
        try {
            return m2556a(str);
        } catch (Throwable th2) {
            C3305g.m2370a(th2);
            return str;
        }
    }

    /* renamed from: b */
    public static void m2594b(String str, String str2, boolean z3) {
        C3306h.m2412a(str, str2, false, z3);
    }

    /* renamed from: b */
    public static void m2592b(String str) {
        synchronized (f1516z) {
            C3300b.m2327a(C3307b.m2495i(), str + "\n");
        }
    }

    /* renamed from: b */
    private static void m2593b(String str, String str2) {
        try {
            C3309d.m2519a(str, m2624h(), str2);
        } catch (Throwable th) {
            C3305g.m2370a(th);
        }
    }

    /* renamed from: b */
    public static void m2588b(Context context) {
        if (C3312g.m2703K()) {
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
                intentFilter.addAction("android.intent.action.BATTERY_LOW");
                intentFilter.addAction("android.intent.action.BATTERY_OKAY");
                context.registerReceiver(f1476Q, intentFilter, null, C3304f.m2352a(1));
                f1477R = true;
            } catch (Throwable th) {
                C3305g.m2370a(th);
            }
        }
    }

    /* renamed from: b */
    public static void m2587b(int i4) {
        C3304f.m2357a(0, new RunnableC3303e(410), i4 * 1000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static int m2584b(boolean z3, boolean z4) {
        int i4;
        if (z4 && !f1489ac) {
            C3311f.m2689d(false);
        }
        if (z3) {
            boolean zM2679a = C3311f.m2679a(C3307b.m2486c(), false);
            C3306h.m2430i();
            i4 = zM2679a;
        } else {
            int iM2668a = C3311f.m2668a();
            C3306h.m2430i();
            i4 = iM2668a;
        }
        return z4 ? C3311f.m2670a(z3) : i4;
    }

    /* renamed from: a */
    public static String m2556a(String str) {
        int iLastIndexOf;
        int iIndexOf;
        int i4;
        int iIndexOf2;
        File file;
        byte[] bArrM2388e;
        byte[] bArrM2341b;
        if (!C3312g.m2750x() || (iLastIndexOf = str.lastIndexOf(47)) <= 0 || (iIndexOf = str.indexOf(95, iLastIndexOf)) <= iLastIndexOf || (iIndexOf2 = str.indexOf(95, (i4 = iIndexOf + 1))) <= iIndexOf) {
            return str;
        }
        String strM2386d = C3305g.m2386d("CrashSDK" + str.substring(iLastIndexOf + 1, iIndexOf) + str.substring(i4, iIndexOf2));
        if (strM2386d == null || (bArrM2388e = C3305g.m2388e((file = new File(str)))) == null || bArrM2388e.length <= 0) {
            return str;
        }
        try {
            bArrM2341b = C3301c.m2341b(bArrM2388e, strM2386d.substring(0, 16).getBytes());
        } catch (Throwable th) {
            C3305g.m2370a(th);
            bArrM2341b = null;
        }
        if (bArrM2341b == null) {
            return str;
        }
        String str2 = str + ".ec";
        File file2 = new File(str2 + ".tmp");
        if (!C3305g.m2374a(file2, bArrM2341b)) {
            return str;
        }
        if (!file2.renameTo(new File(str2))) {
            file2.delete();
            return str;
        }
        file.delete();
        return str2;
    }

    /* renamed from: a */
    public static void m2571a(Throwable th, OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.write("[DEBUG] CrashHandler occurred new exception:\n".getBytes("UTF-8"));
                th.printStackTrace(new PrintStream(outputStream));
                outputStream.write("\n\n".getBytes("UTF-8"));
            } catch (Throwable th2) {
                C3305g.m2370a(th2);
            }
        }
        C3305g.m2370a(th);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02fc A[Catch: all -> 0x0440, TryCatch #1 {all -> 0x0440, blocks: (B:4:0x000a, B:6:0x0010, B:8:0x001f, B:9:0x0034, B:11:0x003a, B:12:0x004d, B:14:0x005d, B:16:0x0065, B:147:0x03cb, B:18:0x006d, B:20:0x007d, B:22:0x008f, B:25:0x00b0, B:27:0x00c0, B:31:0x00cd, B:42:0x00f9, B:38:0x00eb, B:62:0x01c6, B:64:0x01da, B:66:0x01de, B:67:0x01e0, B:69:0x01e5, B:70:0x01e7, B:71:0x01ec, B:81:0x0210, B:82:0x0226, B:84:0x022c, B:86:0x0235, B:88:0x0242, B:90:0x0261, B:91:0x0274, B:93:0x0286, B:95:0x0296, B:96:0x02a7, B:110:0x02eb, B:113:0x02fc, B:116:0x030a, B:119:0x031b, B:121:0x0329, B:123:0x0336, B:126:0x033d, B:130:0x034a, B:132:0x0356, B:134:0x036f, B:135:0x0374, B:137:0x0383, B:139:0x0390, B:145:0x03b9, B:150:0x03df, B:152:0x03e6, B:154:0x03ed, B:156:0x03f4, B:158:0x03fb, B:160:0x0402, B:166:0x0414, B:168:0x041b, B:170:0x0422, B:172:0x0429, B:164:0x040d, B:138:0x038a, B:140:0x03ac, B:142:0x03b1, B:98:0x02af, B:100:0x02b5, B:103:0x02bd, B:105:0x02c1, B:107:0x02d5, B:109:0x02d9, B:75:0x01f7, B:77:0x0205, B:79:0x020b, B:61:0x01c3, B:173:0x0431), top: B:195:0x000a, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01da A[Catch: all -> 0x0440, TryCatch #1 {all -> 0x0440, blocks: (B:4:0x000a, B:6:0x0010, B:8:0x001f, B:9:0x0034, B:11:0x003a, B:12:0x004d, B:14:0x005d, B:16:0x0065, B:147:0x03cb, B:18:0x006d, B:20:0x007d, B:22:0x008f, B:25:0x00b0, B:27:0x00c0, B:31:0x00cd, B:42:0x00f9, B:38:0x00eb, B:62:0x01c6, B:64:0x01da, B:66:0x01de, B:67:0x01e0, B:69:0x01e5, B:70:0x01e7, B:71:0x01ec, B:81:0x0210, B:82:0x0226, B:84:0x022c, B:86:0x0235, B:88:0x0242, B:90:0x0261, B:91:0x0274, B:93:0x0286, B:95:0x0296, B:96:0x02a7, B:110:0x02eb, B:113:0x02fc, B:116:0x030a, B:119:0x031b, B:121:0x0329, B:123:0x0336, B:126:0x033d, B:130:0x034a, B:132:0x0356, B:134:0x036f, B:135:0x0374, B:137:0x0383, B:139:0x0390, B:145:0x03b9, B:150:0x03df, B:152:0x03e6, B:154:0x03ed, B:156:0x03f4, B:158:0x03fb, B:160:0x0402, B:166:0x0414, B:168:0x041b, B:170:0x0422, B:172:0x0429, B:164:0x040d, B:138:0x038a, B:140:0x03ac, B:142:0x03b1, B:98:0x02af, B:100:0x02b5, B:103:0x02bd, B:105:0x02c1, B:107:0x02d5, B:109:0x02d9, B:75:0x01f7, B:77:0x0205, B:79:0x020b, B:61:0x01c3, B:173:0x0431), top: B:195:0x000a, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0210 A[Catch: all -> 0x0440, TryCatch #1 {all -> 0x0440, blocks: (B:4:0x000a, B:6:0x0010, B:8:0x001f, B:9:0x0034, B:11:0x003a, B:12:0x004d, B:14:0x005d, B:16:0x0065, B:147:0x03cb, B:18:0x006d, B:20:0x007d, B:22:0x008f, B:25:0x00b0, B:27:0x00c0, B:31:0x00cd, B:42:0x00f9, B:38:0x00eb, B:62:0x01c6, B:64:0x01da, B:66:0x01de, B:67:0x01e0, B:69:0x01e5, B:70:0x01e7, B:71:0x01ec, B:81:0x0210, B:82:0x0226, B:84:0x022c, B:86:0x0235, B:88:0x0242, B:90:0x0261, B:91:0x0274, B:93:0x0286, B:95:0x0296, B:96:0x02a7, B:110:0x02eb, B:113:0x02fc, B:116:0x030a, B:119:0x031b, B:121:0x0329, B:123:0x0336, B:126:0x033d, B:130:0x034a, B:132:0x0356, B:134:0x036f, B:135:0x0374, B:137:0x0383, B:139:0x0390, B:145:0x03b9, B:150:0x03df, B:152:0x03e6, B:154:0x03ed, B:156:0x03f4, B:158:0x03fb, B:160:0x0402, B:166:0x0414, B:168:0x041b, B:170:0x0422, B:172:0x0429, B:164:0x040d, B:138:0x038a, B:140:0x03ac, B:142:0x03b1, B:98:0x02af, B:100:0x02b5, B:103:0x02bd, B:105:0x02c1, B:107:0x02d5, B:109:0x02d9, B:75:0x01f7, B:77:0x0205, B:79:0x020b, B:61:0x01c3, B:173:0x0431), top: B:195:0x000a, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0226 A[Catch: all -> 0x0440, TryCatch #1 {all -> 0x0440, blocks: (B:4:0x000a, B:6:0x0010, B:8:0x001f, B:9:0x0034, B:11:0x003a, B:12:0x004d, B:14:0x005d, B:16:0x0065, B:147:0x03cb, B:18:0x006d, B:20:0x007d, B:22:0x008f, B:25:0x00b0, B:27:0x00c0, B:31:0x00cd, B:42:0x00f9, B:38:0x00eb, B:62:0x01c6, B:64:0x01da, B:66:0x01de, B:67:0x01e0, B:69:0x01e5, B:70:0x01e7, B:71:0x01ec, B:81:0x0210, B:82:0x0226, B:84:0x022c, B:86:0x0235, B:88:0x0242, B:90:0x0261, B:91:0x0274, B:93:0x0286, B:95:0x0296, B:96:0x02a7, B:110:0x02eb, B:113:0x02fc, B:116:0x030a, B:119:0x031b, B:121:0x0329, B:123:0x0336, B:126:0x033d, B:130:0x034a, B:132:0x0356, B:134:0x036f, B:135:0x0374, B:137:0x0383, B:139:0x0390, B:145:0x03b9, B:150:0x03df, B:152:0x03e6, B:154:0x03ed, B:156:0x03f4, B:158:0x03fb, B:160:0x0402, B:166:0x0414, B:168:0x041b, B:170:0x0422, B:172:0x0429, B:164:0x040d, B:138:0x038a, B:140:0x03ac, B:142:0x03b1, B:98:0x02af, B:100:0x02b5, B:103:0x02bd, B:105:0x02c1, B:107:0x02d5, B:109:0x02d9, B:75:0x01f7, B:77:0x0205, B:79:0x020b, B:61:0x01c3, B:173:0x0431), top: B:195:0x000a, outer: #3 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m2569a(java.lang.String r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 1113
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p040uc.crashsdk.C3310e.m2569a(java.lang.String, boolean, boolean):void");
    }

    /* renamed from: a */
    public static boolean m2581a(boolean z3, boolean z4) {
        if (!f1495d) {
            if (C3307b.f1428d) {
                JNIBridge.set(1, true);
            }
            f1495d = true;
        }
        try {
            String strM2631k = m2631k();
            if (C3305g.m2375a(strM2631k)) {
                C3299a.m2319a("crashsdk", "CrashHandler url is empty!");
                return false;
            }
            Object obj = f1504n;
            synchronized (obj) {
                if (C3304f.m2356a(z3 ? 1 : 0, new RunnableC3303e(406, new Object[]{strM2631k, Boolean.valueOf(z4), Boolean.valueOf(z3)})) && z3) {
                    try {
                        obj.wait();
                    } catch (InterruptedException e4) {
                        C3305g.m2370a(e4);
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            C3305g.m2370a(th);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* renamed from: a */
    private static boolean m2577a(String str, RunnableC3303e runnableC3303e) {
        boolean zM2351a;
        FileChannel channel;
        Exception e4;
        synchronized (f1505o) {
            File file = new File(str);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (Exception e5) {
                    C3305g.m2370a(e5);
                }
            }
            ?? r5 = 0;
            fileLockLock = null;
            FileLock fileLockLock = null;
            zM2351a = false;
            try {
                try {
                    try {
                        channel = new RandomAccessFile(file, "rw").getChannel();
                    } catch (Throwable th) {
                        th = th;
                        r5 = file;
                        C3305g.m2368a((Closeable) r5);
                        throw th;
                    }
                } catch (Exception e6) {
                    try {
                        C3305g.m2370a(e6);
                        channel = null;
                    } catch (Exception e7) {
                        channel = null;
                        e4 = e7;
                        C3305g.m2370a(e4);
                        C3305g.m2368a(channel);
                        return zM2351a;
                    }
                }
                if (channel != null) {
                    try {
                        fileLockLock = channel.lock();
                    } catch (Exception e8) {
                        try {
                            C3305g.m2370a(e8);
                        } catch (Exception e9) {
                            e4 = e9;
                            C3305g.m2370a(e4);
                            C3305g.m2368a(channel);
                            return zM2351a;
                        }
                    }
                }
                try {
                    zM2351a = runnableC3303e.m2351a();
                    C3305g.m2368a(channel);
                } finally {
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (Exception e10) {
                            C3305g.m2370a(e10);
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return zM2351a;
    }

    /* renamed from: a */
    private static boolean m2578a(String str, d dVar) {
        String strM2362a = C3305g.m2362a(new File(str), 64, false);
        if (strM2362a == null) {
            return false;
        }
        try {
            Matcher matcher = Pattern.compile("(\\d+)\\s+(\\d+)\\s+(\\d+)\\s+(\\d+)").matcher(strM2362a);
            if (matcher.find()) {
                long j4 = Long.parseLong(matcher.group(1));
                if (System.currentTimeMillis() - j4 < 86400000) {
                    dVar.f1524b = Long.parseLong(matcher.group(2));
                    dVar.f1525c = Integer.parseInt(matcher.group(3));
                    dVar.f1526d = Integer.parseInt(matcher.group(4));
                    dVar.f1523a = j4;
                }
            }
        } catch (Throwable th) {
            C3305g.m2370a(th);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* renamed from: a */
    public static boolean m2580a(StringBuffer stringBuffer, String str, long j4, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, String str2) {
        long j5;
        boolean z3;
        boolean zM2576a;
        if (f1494c.get()) {
            C3299a.m2321b("Processing java crash, skip generate custom log: " + str);
            return false;
        }
        boolean z4 = f1492af || C3307b.m2453I();
        if (!z4 && !C3302d.m2348d()) {
            C3299a.m2323c("DEBUG", C3302d.m2346b());
            return false;
        }
        if (!m2603c(str)) {
            C3299a.m2324d("DEBUG", "custom log sample miss: " + str);
            return false;
        }
        if (m2550Z()) {
            C3299a.m2321b("Processing native crash, skip generate custom log: " + str);
            return false;
        }
        if (stringBuffer == null || str == null) {
            return false;
        }
        String strM2556a = C3312g.m2714V() + m2629j(str);
        ?? r11 = (j4 & 32) != 0 ? 1 : 0;
        if (z4) {
            long jNativeClientCreateConnection = C3307b.f1428d ? JNIBridge.nativeClientCreateConnection(strM2556a, "custom", str, r11) : 0L;
            if (jNativeClientCreateConnection == 0) {
                C3299a.m2324d("DEBUG", "skip custom log: " + str);
                return false;
            }
            j5 = jNativeClientCreateConnection;
        } else {
            if (m2579a(m2624h(), str, (boolean) r11)) {
                return false;
            }
            C3312g.m2721a();
            m2573a(false);
            j5 = 0;
        }
        synchronized (f1506p) {
            z3 = r11;
            zM2576a = m2576a(strM2556a, j5, stringBuffer, str, j4, arrayList, arrayList2, arrayList3, str2);
        }
        if (zM2576a && !z4) {
            m2594b(m2624h(), str, z3);
        }
        if (j5 != 0) {
            JNIBridge.nativeClientCloseConnection(j5);
        }
        if (!zM2576a) {
            return false;
        }
        if (!z4) {
            m2644q(strM2556a);
        }
        if (!z4) {
            strM2556a = m2556a(m2633l(strM2556a));
        }
        m2593b(strM2556a, str);
        if (!z3 || z4) {
            return true;
        }
        try {
            m2581a(true, false);
            return true;
        } catch (Throwable th) {
            C3305g.m2370a(th);
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m2579a(String str, String str2, boolean z3) {
        if (!m2638n(str2)) {
            return false;
        }
        C3306h.m2412a(str, str2, true, z3);
        C3299a.m2321b(String.format(Locale.US, "Custom log '%s' has reach max count!", str2));
        return true;
    }

    /* renamed from: a */
    private static void m2564a(a aVar, String str, long j4) {
        String strNativeDumpThreads;
        String str2 = null;
        if (C3307b.f1428d) {
            try {
                aVar.flush();
            } catch (Throwable th) {
                C3305g.m2370a(th);
            }
            strNativeDumpThreads = JNIBridge.nativeDumpThreads(str, j4);
            if (f1492af || strNativeDumpThreads == null || strNativeDumpThreads.length() >= 512 || !strNativeDumpThreads.startsWith("/") || strNativeDumpThreads.indexOf(10) >= 0) {
                str2 = strNativeDumpThreads;
            } else {
                if (!new File(strNativeDumpThreads).exists()) {
                    str2 = "Can not found " + strNativeDumpThreads;
                }
                String str3 = str2;
                str2 = strNativeDumpThreads;
                strNativeDumpThreads = str3;
            }
        } else {
            strNativeDumpThreads = "Native not initialized, skip dump!";
        }
        if (strNativeDumpThreads != null) {
            try {
                aVar.write(strNativeDumpThreads.getBytes("UTF-8"));
                aVar.write("\n".getBytes("UTF-8"));
            } catch (Throwable th2) {
                C3305g.m2370a(th2);
            }
            m2565a((OutputStream) aVar);
        } else if (str2 != null && !f1492af) {
            m2583b(aVar, str2, 1048576);
            File file = new File(str2);
            if (file.exists()) {
                file.delete();
            }
        }
        try {
            aVar.flush();
        } catch (Throwable th3) {
            C3305g.m2370a(th3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m2576a(java.lang.String r17, long r18, java.lang.StringBuffer r20, java.lang.String r21, long r22, java.util.ArrayList<java.lang.String> r24, java.util.ArrayList<java.lang.String> r25, java.util.ArrayList<java.lang.String> r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p040uc.crashsdk.C3310e.m2576a(java.lang.String, long, java.lang.StringBuffer, java.lang.String, long, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static void m2568a(String str, boolean z3) {
        if (z3) {
            f1514x = str;
            return;
        }
        synchronized (f1515y) {
            f1513w = str;
            C3300b.m2327a(C3307b.m2492f(), str + "\n");
        }
    }

    /* renamed from: a */
    private static String m2559a(Date date) {
        return String.format(Locale.US, "%d%02d%02d%02d%02d%02d", Integer.valueOf(date.getYear() + 1900), Integer.valueOf(date.getMonth() + 1), Integer.valueOf(date.getDate()), Integer.valueOf(date.getHours()), Integer.valueOf(date.getMinutes()), Integer.valueOf(date.getSeconds()));
    }

    /* renamed from: a */
    public static void m2567a(OutputStream outputStream, String str, String str2, int i4, boolean z3, boolean z4) {
        f1498h = false;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[5];
            objArr[0] = str;
            objArr[1] = str2;
            objArr[2] = Integer.valueOf(i4);
            objArr[3] = Integer.valueOf(z3 ? 1 : 0);
            objArr[4] = Integer.valueOf(z4 ? 1 : 0);
            outputStream.write(String.format(locale, "$^%s`%s`%d`%d,%d^$", objArr).getBytes("UTF-8"));
        } catch (Throwable th) {
            C3305g.m2370a(th);
        }
        f1498h = true;
        m2565a(outputStream);
    }

    /* renamed from: a */
    public static void m2566a(OutputStream outputStream, String str, String str2) {
        f1498h = false;
        try {
            outputStream.write(String.format(Locale.US, "$^%s`%s^$", str, str2).getBytes("UTF-8"));
        } catch (Throwable th) {
            C3305g.m2370a(th);
        }
        f1498h = true;
    }

    /* renamed from: a */
    public static void m2562a(Context context) {
        try {
            if (m2545U()) {
                context.registerReceiver(new c((byte) 0), new IntentFilter("android.intent.action.ANR"), null, C3304f.m2352a(3));
            }
        } catch (Throwable th) {
            C3305g.m2370a(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0458 A[Catch: all -> 0x0526, TryCatch #3 {all -> 0x0526, blocks: (B:327:0x0428, B:330:0x043a, B:332:0x0440, B:334:0x0458, B:335:0x045b, B:341:0x0489, B:340:0x0486, B:241:0x032c, B:336:0x0480), top: B:491:0x01f1, inners: #28 }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x04d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x04fa A[Catch: all -> 0x0511, TryCatch #41 {all -> 0x0511, blocks: (B:367:0x04de, B:370:0x04e9, B:372:0x04fa, B:374:0x04fe, B:375:0x0501, B:378:0x0509), top: B:564:0x04de }] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0507 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x05ff A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:468:0x061a A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0650 A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:542:0x04b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:554:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:581:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:582:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:583:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:584:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:585:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:586:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:587:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:588:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:589:? A[DONT_GENERATE, FINALLY_INSNS, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [long] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6, types: [long] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2655a(java.lang.Thread r20, java.lang.Throwable r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 1624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p040uc.crashsdk.C3310e.m2655a(java.lang.Thread, java.lang.Throwable, boolean):void");
    }

    /* renamed from: a */
    private static void m2570a(Throwable th) {
        try {
            C3299a.m2324d("DEBUG", m2560a(th.getStackTrace(), (String) null).toString());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m2572a(Calendar calendar) {
        if (C3312g.m2709Q()) {
            long timeInMillis = calendar.getTimeInMillis();
            calendar.add(5, 1);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            long timeInMillis2 = calendar.getTimeInMillis();
            long j4 = timeInMillis2 - timeInMillis;
            C3304f.m2357a(0, new RunnableC3303e(415, new Object[]{Long.valueOf(timeInMillis2)}), j4 <= 3600000 ? 1000 + j4 : 3600000L);
        }
    }

    /* renamed from: a */
    public static StringBuilder m2560a(StackTraceElement[] stackTraceElementArr, String str) {
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            boolean z3 = str == null;
            int i5 = 0;
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                i5++;
                sb.append("  at ");
                sb.append(stackTraceElement.toString());
                sb.append("\n");
                if (!z3 && stackTraceElement.getMethodName().contains(str)) {
                    sb.delete(0, sb.length());
                    i5 = 0;
                    z3 = true;
                }
            }
            i4 = i5;
        }
        if (i4 == 0) {
            sb.append("  (no java stack)\n");
        }
        return sb;
    }

    /* renamed from: a */
    public static boolean m2575a(ParcelFileDescriptor parcelFileDescriptor) {
        if (f1491ae) {
            C3299a.m2324d("crashsdk", "Can not call setHostFd and getHostFd in the same process!");
            return false;
        }
        if (!C3307b.f1428d) {
            C3299a.m2324d("crashsdk", "Crash so is not loaded!");
            return false;
        }
        if (f1490ad != null) {
            C3299a.m2323c("crashsdk", "Has already set host fd!");
        }
        f1490ad = parcelFileDescriptor;
        int fd = parcelFileDescriptor.getFd();
        int iNativeCmd = (int) JNIBridge.nativeCmd(13, fd, null, null);
        f1492af = iNativeCmd != -1;
        return fd == -1 || iNativeCmd != -1;
    }
}
