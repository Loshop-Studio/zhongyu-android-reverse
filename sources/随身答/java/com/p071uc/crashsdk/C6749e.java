package com.p071uc.crashsdk;

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
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.os.EnvironmentCompat;
import androidx.work.WorkRequest;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.p071uc.crashsdk.export.LogType;
import com.p071uc.crashsdk.p072a.C6738a;
import com.p071uc.crashsdk.p072a.C6739b;
import com.p071uc.crashsdk.p072a.C6740c;
import com.p071uc.crashsdk.p072a.C6741d;
import com.p071uc.crashsdk.p072a.C6743f;
import com.p071uc.crashsdk.p072a.C6744g;
import com.p071uc.crashsdk.p072a.C6745h;
import com.p071uc.crashsdk.p072a.RunnableC6742e;
import io.reactivex.annotations.SchedulerSupport;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
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
/* loaded from: classes4.dex */
public class C6749e implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    static final /* synthetic */ boolean f6484a = true;

    /* renamed from: b */
    private static long f6491b;

    /* renamed from: i */
    private static String f6497i;

    /* renamed from: e */
    private final List<FileInputStream> f6515e = new ArrayList();

    /* renamed from: c */
    private static final AtomicBoolean f6492c = new AtomicBoolean(false);

    /* renamed from: d */
    private static boolean f6493d = false;

    /* renamed from: f */
    private static long f6494f = 0;

    /* renamed from: g */
    private static long f6495g = -1;

    /* renamed from: h */
    private static boolean f6496h = true;

    /* renamed from: j */
    private static String f6498j = "";

    /* renamed from: k */
    private static String f6499k = null;

    /* renamed from: l */
    private static String f6500l = null;

    /* renamed from: m */
    private static String f6501m = null;

    /* renamed from: n */
    private static final Object f6502n = new Object();

    /* renamed from: o */
    private static final Object f6503o = new Object();

    /* renamed from: p */
    private static final Object f6504p = new Object();

    /* renamed from: q */
    private static final Object f6505q = new Object();

    /* renamed from: r */
    private static final ArrayList<String> f6506r = new ArrayList<>();

    /* renamed from: s */
    private static int f6507s = 0;

    /* renamed from: t */
    private static String f6508t = null;

    /* renamed from: u */
    private static boolean f6509u = false;

    /* renamed from: v */
    private static String f6510v = null;

    /* renamed from: w */
    private static String f6511w = null;

    /* renamed from: x */
    private static String f6512x = null;

    /* renamed from: y */
    private static final Object f6513y = new Object();

    /* renamed from: z */
    private static final Object f6514z = new Object();

    /* renamed from: A */
    private static Map<String, Integer> f6458A = null;

    /* renamed from: B */
    private static String f6459B = null;

    /* renamed from: C */
    private static int f6460C = -1;

    /* renamed from: D */
    private static int f6461D = -1;

    /* renamed from: E */
    private static int f6462E = -1;

    /* renamed from: F */
    private static int f6463F = -1;

    /* renamed from: G */
    private static int f6464G = -1;

    /* renamed from: H */
    private static int f6465H = -1;

    /* renamed from: I */
    private static int f6466I = -1;

    /* renamed from: J */
    private static String f6467J = "?";

    /* renamed from: K */
    private static boolean f6468K = false;

    /* renamed from: L */
    private static boolean f6469L = false;

    /* renamed from: M */
    private static int f6470M = 0;

    /* renamed from: N */
    private static int f6471N = 0;

    /* renamed from: O */
    private static boolean f6472O = false;

    /* renamed from: P */
    private static RunnableC6742e f6473P = new RunnableC6742e(405);

    /* renamed from: Q */
    private static c f6474Q = new c(0);

    /* renamed from: R */
    private static boolean f6475R = false;

    /* renamed from: S */
    private static final RunnableC6742e f6476S = new RunnableC6742e(412);

    /* renamed from: T */
    private static Thread.UncaughtExceptionHandler f6477T = null;

    /* renamed from: U */
    private static Throwable f6478U = null;

    /* renamed from: V */
    private static boolean f6479V = false;

    /* renamed from: W */
    private static boolean f6480W = false;

    /* renamed from: X */
    private static Runnable f6481X = null;

    /* renamed from: Y */
    private static final Object f6482Y = new Object();

    /* renamed from: Z */
    private static int f6483Z = 101;

    /* renamed from: aa */
    private static Runnable f6485aa = new RunnableC6742e(407);

    /* renamed from: ab */
    private static final Object f6486ab = new Object();

    /* renamed from: ac */
    private static boolean f6487ac = false;

    /* renamed from: ad */
    private static ParcelFileDescriptor f6488ad = null;

    /* renamed from: ae */
    private static boolean f6489ae = false;

    /* renamed from: af */
    private static boolean f6490af = false;

    /* renamed from: com.uc.crashsdk.e$b */
    public static class b implements Comparator<File> {
        private b() {
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

        public /* synthetic */ b(byte b10) {
            this();
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
                    boolean unused = C6749e.f6468K = "android.intent.action.BATTERY_LOW".equals(action);
                    C6749e.m5778J();
                    return;
                } else {
                    if ("android.intent.action.ANR".equals(action)) {
                        try {
                            C6749e.m5852d(context);
                            return;
                        } catch (Throwable th) {
                            C6744g.m5614a(th);
                            return;
                        }
                    }
                    return;
                }
            }
            int unused2 = C6749e.f6460C = intent.getIntExtra("level", -1);
            int unused3 = C6749e.f6461D = intent.getIntExtra("scale", -1);
            int unused4 = C6749e.f6462E = intent.getIntExtra("voltage", -1);
            int unused5 = C6749e.f6463F = intent.getIntExtra("health", -1);
            int unused6 = C6749e.f6464G = intent.getIntExtra("plugged", -1);
            int unused7 = C6749e.f6465H = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            int unused8 = C6749e.f6466I = intent.getIntExtra("temperature", -1);
            String unused9 = C6749e.f6467J = intent.getStringExtra("technology");
            if (C6749e.m5777I() >= 2) {
                C6749e.m5778J();
                C6749e.m5779K();
            }
        }

        public /* synthetic */ c(byte b10) {
            this();
        }
    }

    public C6749e() {
        try {
            m5780L();
        } catch (Throwable th) {
            C6744g.m5614a(th);
        }
    }

    /* renamed from: A */
    public static void m5769A() {
        if (f6487ac || C6746b.m5697I()) {
            return;
        }
        C6743f.m5601a(1, new RunnableC6742e(408), 1000L);
    }

    /* renamed from: B */
    public static void m5770B() {
        C6743f.m5601a(1, new RunnableC6742e(409), 7000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m5771C() {
        /*
            int r0 = com.p071uc.crashsdk.C6751g.m5948L()
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
            com.p071uc.crashsdk.p072a.C6738a.m5563a(r0, r1)
        L48:
            boolean r0 = com.p071uc.crashsdk.C6746b.m5697I()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r1 == r2) goto L64
            if (r4 == 0) goto L64
            com.uc.crashsdk.a.e r1 = new com.uc.crashsdk.a.e
            r2 = 413(0x19d, float:5.79E-43)
            r1.<init>(r2)
            r2 = 2
            com.p071uc.crashsdk.p072a.C6743f.m5600a(r2, r1)
            goto L65
        L64:
            r3 = r4
        L65:
            r1 = 7
            long r4 = (long) r0
            r0 = 0
            com.p071uc.crashsdk.JNIBridge.nativeCmd(r1, r4, r0, r0)
            if (r3 == 0) goto L72
            r0 = 8
            com.p071uc.crashsdk.JNIBridge.cmd(r0)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p071uc.crashsdk.C6749e.m5771C():void");
    }

    /* renamed from: D */
    public static ParcelFileDescriptor m5772D() {
        if (!C6746b.f6426d) {
            C6738a.m5568d("crashsdk", "Crash so is not loaded!");
            return null;
        }
        ParcelFileDescriptor parcelFileDescriptor = f6488ad;
        if (parcelFileDescriptor != null) {
            return parcelFileDescriptor;
        }
        int iCmd = (int) JNIBridge.cmd(14);
        if (iCmd == -1) {
            return null;
        }
        ParcelFileDescriptor parcelFileDescriptorAdoptFd = ParcelFileDescriptor.adoptFd(iCmd);
        f6488ad = parcelFileDescriptorAdoptFd;
        f6489ae = true;
        return parcelFileDescriptorAdoptFd;
    }

    /* renamed from: E */
    public static boolean m5773E() {
        return f6490af;
    }

    /* renamed from: F */
    public static void m5774F() {
        String strM5958V = C6751g.m5958V();
        File file = new File(strM5958V);
        if (file.exists() && file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                C6738a.m5565b("Ucebu can not list folder: " + strM5958V);
                return;
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isFile() && file2.getName().contains("ucebu")) {
                    m5825a(false, false);
                    return;
                }
            }
        }
    }

    /* renamed from: I */
    public static /* synthetic */ int m5777I() {
        int i9 = f6470M + 1;
        f6470M = i9;
        return i9;
    }

    /* renamed from: J */
    public static /* synthetic */ void m5778J() {
        StringBuilder sbM5792X;
        if (C6746b.f6426d && (sbM5792X = m5792X()) != null) {
            JNIBridge.set(125, sbM5792X.toString());
        }
        f6469L = true;
        m5793Y();
    }

    /* renamed from: K */
    public static /* synthetic */ int m5779K() {
        f6470M = 0;
        return 0;
    }

    /* renamed from: L */
    private void m5780L() {
        int iM5943G = C6751g.m5943G();
        for (int i9 = 0; i9 < iM5943G; i9++) {
            try {
                this.f6515e.add(new FileInputStream("/dev/null"));
            } catch (Exception e10) {
                C6744g.m5614a(e10);
                return;
            }
        }
    }

    /* renamed from: M */
    private void m5781M() {
        Iterator<FileInputStream> it = this.f6515e.iterator();
        while (it.hasNext()) {
            C6744g.m5612a(it.next());
        }
        this.f6515e.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static boolean m5782N() {
        if (C6751g.m5950N()) {
            return true;
        }
        return m5818a();
    }

    /* renamed from: O */
    private static String m5783O() {
        return C6751g.m5975e() + "_";
    }

    /* renamed from: P */
    private static String m5784P() {
        return C6746b.m5755y() ? "fg" : "bg";
    }

    /* renamed from: Q */
    private static byte[] m5785Q() {
        byte[] bArr = null;
        int i9 = 1024;
        while (bArr == null && i9 > 0) {
            try {
                bArr = new byte[i9];
            } catch (Throwable unused) {
                i9 /= 2;
                if (i9 < 16) {
                    break;
                }
            }
        }
        return bArr;
    }

    /* renamed from: R */
    private static String m5786R() {
        return (!C6746b.m5691C() || f6493d) ? LogType.JAVA_TYPE : "ucebujava";
    }

    /* renamed from: S */
    private static void m5787S() {
        String strTrim;
        BufferedReader bufferedReader;
        Throwable th;
        FileReader fileReader;
        String strTrim2 = "-";
        try {
            strTrim = Build.HARDWARE;
        } catch (Throwable th2) {
            C6744g.m5614a(th2);
            strTrim = "-";
        }
        try {
            fileReader = new FileReader(new File("/proc/cpuinfo"));
            try {
                bufferedReader = new BufferedReader(fileReader, 512);
                int i9 = 0;
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
                        i9++;
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            C6744g.m5614a(th);
                            C6744g.m5612a(fileReader);
                            C6744g.m5612a(bufferedReader);
                            f6499k = strTrim;
                            f6500l = strTrim2;
                        } catch (Throwable th4) {
                            C6744g.m5612a(fileReader);
                            C6744g.m5612a(bufferedReader);
                            throw th4;
                        }
                    }
                } while (i9 < 2);
                C6744g.m5612a(fileReader);
            } catch (Throwable th5) {
                bufferedReader = null;
                th = th5;
            }
        } catch (Throwable th6) {
            bufferedReader = null;
            th = th6;
            fileReader = null;
        }
        C6744g.m5612a(bufferedReader);
        f6499k = strTrim;
        f6500l = strTrim2;
    }

    /* renamed from: T */
    private static String m5788T() {
        return C6751g.m5957U() + "bytes";
    }

    /* renamed from: U */
    private static boolean m5789U() {
        return Build.VERSION.SDK_INT < 29;
    }

    /* renamed from: V */
    private static void m5790V() {
        if (f6472O || C6746b.m5691C() || C6746b.m5697I()) {
            return;
        }
        JNIBridge.cmd(18);
    }

    /* renamed from: W */
    private static void m5791W() {
        C6743f.m5601a(3, new RunnableC6742e(414), 1000L);
    }

    /* renamed from: X */
    private static StringBuilder m5792X() {
        String str;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("level: ");
            sb.append(f6460C);
            sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
            sb.append("scale: ");
            sb.append(f6461D);
            sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
            switch (f6463F) {
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
            sb.append(f6463F);
            sb.append(str);
            sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
            int i9 = f6464G;
            String str2 = i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 4 ? " (?)" : " (Wireless)" : " (USB port)" : " (AC charger)" : " (None)";
            sb.append("pluged: ");
            sb.append(f6464G);
            sb.append(str2);
            sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
            int i10 = f6465H;
            String str3 = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? " (?)" : " (Full)" : " (Not charging)" : " (Discharging)" : " (Charging)" : " (Unknown)";
            sb.append("status: ");
            sb.append(f6465H);
            sb.append(str3);
            sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
            sb.append("voltage: ");
            sb.append(f6462E);
            sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
            sb.append("temperature: ");
            sb.append(f6466I);
            sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
            sb.append("technology: ");
            sb.append(f6467J);
            sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
            sb.append("battery low: ");
            sb.append(f6468K);
            sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
            return sb;
        } catch (Throwable th) {
            C6744g.m5614a(th);
            return null;
        }
    }

    /* renamed from: Y */
    private static void m5793Y() {
        if (C6746b.f6425c && f6469L && C6737a.f6309c) {
            f6469L = false;
            if (C6743f.m5603b(f6473P)) {
                return;
            }
            C6743f.m5601a(0, f6473P, 2000L);
        }
    }

    /* renamed from: Z */
    private static boolean m5794Z() {
        return C6746b.f6426d && JNIBridge.nativeIsCrashing();
    }

    /* renamed from: a */
    public static boolean m5818a() {
        if (f6494f == 0) {
            f6494f = 2L;
            if (m5865g(C6746b.m5717a("logs")) == 1) {
                f6494f = 1L;
            }
        }
        return f6494f == 1;
    }

    /* renamed from: aa */
    private static void m5826aa() {
        String strM5959W = C6751g.m5959W();
        File file = new File(strM5959W);
        if (file.isDirectory()) {
            try {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length > 150) {
                    Arrays.sort(fileArrListFiles, new b((byte) 0));
                    int length = fileArrListFiles.length - 150;
                    if (length < 0) {
                        length = 0;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i9 = 0;
                    int i10 = 0;
                    int i11 = 0;
                    while (i9 < fileArrListFiles.length) {
                        File file2 = fileArrListFiles[i9];
                        boolean z9 = i9 < length;
                        if (!z9 && jCurrentTimeMillis - file2.lastModified() >= 432000000) {
                            z9 = true;
                        }
                        if (!z9) {
                            break;
                        }
                        try {
                            file2.delete();
                            i10++;
                            i11 = 0;
                        } catch (Throwable th) {
                            i11++;
                            C6744g.m5614a(th);
                        }
                        if (i11 >= 3) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                    C6738a.m5562a("Removed " + i10 + " logs in " + strM5959W);
                }
            } catch (Throwable th2) {
                C6744g.m5614a(th2);
            }
        }
    }

    /* renamed from: b */
    public static long m5829b() {
        if (f6495g == -1) {
            f6495g = m5865g(C6746b.m5717a("local"));
        }
        return f6495g;
    }

    /* renamed from: j */
    private static String m5873j(String str) {
        return String.format(Locale.US, "%s%s_%s_%s.log", m5849d(), m5879m(), m5784P(), str);
    }

    /* renamed from: k */
    private static String m5876k(String str) {
        if (!C6744g.m5624b(str)) {
            return "";
        }
        int iIndexOf = str.indexOf(0);
        if (iIndexOf >= 0) {
            str = str.substring(0, iIndexOf);
        }
        return str.trim();
    }

    /* renamed from: l */
    private static String m5877l(String str) {
        String strM5570a = C6739b.m5570a(str, C6751g.m5993w(), C6751g.m5992v());
        if (!str.equals(strM5570a)) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
        return strM5570a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean[] m5880m(java.lang.String r7) {
        /*
            boolean r0 = com.p071uc.crashsdk.C6751g.m5992v()
            boolean r1 = com.p071uc.crashsdk.C6751g.m5994x()
            r2 = 0
            if (r0 != 0) goto Ld
            if (r1 == 0) goto L70
        Ld:
            java.lang.String r3 = ".tmp"
            boolean r3 = r7.endsWith(r3)
            if (r3 != 0) goto L3c
            java.lang.String r3 = ".ec"
            boolean r3 = r7.contains(r3)
            if (r3 == 0) goto L1e
            goto L3c
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
            if (r4 == r3) goto L3f
        L3c:
            r0 = r2
            r1 = r0
            goto L70
        L3f:
            java.lang.String r3 = com.p071uc.crashsdk.C6751g.m5993w()
            java.lang.String r4 = ".log"
            boolean r6 = r7.endsWith(r4)
            if (r6 != 0) goto L5a
            boolean r0 = com.p071uc.crashsdk.p072a.C6744g.m5619a(r3)
            if (r0 != 0) goto L3c
            boolean r7 = r7.endsWith(r3)
            if (r7 != 0) goto L58
            goto L3c
        L58:
            r0 = r2
            goto L70
        L5a:
            boolean r3 = com.p071uc.crashsdk.p072a.C6744g.m5619a(r3)
            if (r3 == 0) goto L61
            goto L58
        L61:
            int r3 = r7.lastIndexOf(r5)
            int r3 = r7.indexOf(r4, r3)
            int r7 = r7.lastIndexOf(r4)
            if (r3 == r7) goto L70
            goto L58
        L70:
            r7 = 2
            boolean[] r7 = new boolean[r7]
            r7[r2] = r0
            r0 = 1
            r7[r0] = r1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p071uc.crashsdk.C6749e.m5880m(java.lang.String):boolean[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.Locale] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.CharSequence, java.lang.StringBuffer] */
    /* renamed from: n */
    private static boolean m5882n(String str) {
        boolean z9;
        boolean z10;
        ?? r12;
        Throwable th;
        FileWriter fileWriter;
        Exception e10;
        int i9;
        synchronized (f6505q) {
            try {
                File file = new File(C6751g.m5957U() + "customlog");
                ?? M5606a = C6744g.m5606a(file, 1024, false);
                long jCurrentTimeMillis = System.currentTimeMillis();
                ?? stringBuffer = new StringBuffer();
                if (M5606a != 0) {
                    stringBuffer.append(M5606a);
                    M5606a = Pattern.compile("([^\\n\\r\\t\\s]+) (\\d+) (\\d+)").matcher(stringBuffer);
                    for (int iEnd = 0; M5606a.find(iEnd); iEnd = M5606a.end()) {
                        z9 = true;
                        if (str.equals(M5606a.group(1))) {
                            long j9 = Long.parseLong(M5606a.group(2));
                            if (jCurrentTimeMillis - j9 < CalendarModelKt.MillisecondsIn24Hours) {
                                try {
                                    i9 = Integer.parseInt(M5606a.group(3));
                                } catch (Exception e11) {
                                    C6744g.m5614a(e11);
                                    i9 = 0;
                                }
                            } else {
                                i9 = 0;
                                j9 = jCurrentTimeMillis;
                            }
                            int iM5940D = C6751g.m5940D();
                            z10 = iM5940D >= 0 && i9 >= iM5940D;
                            String str2 = String.format(Locale.US, "%s %d %d", str, Long.valueOf(j9), Integer.valueOf(i9 + 1));
                            int iStart = M5606a.start();
                            int iEnd2 = M5606a.end();
                            stringBuffer.replace(iStart, iEnd2, str2);
                            r12 = iEnd2;
                        }
                    }
                    z9 = false;
                    z10 = false;
                    r12 = M5606a;
                } else {
                    z9 = false;
                    z10 = false;
                    r12 = M5606a;
                }
                if (!z9) {
                    r12 = Locale.US;
                    stringBuffer.append(String.format(r12, "%s %d 1\n", str, Long.valueOf(jCurrentTimeMillis)));
                }
                try {
                    try {
                        fileWriter = new FileWriter(file);
                        try {
                            String string = stringBuffer.toString();
                            fileWriter.write(string, 0, string.length());
                            r12 = fileWriter;
                        } catch (Exception e12) {
                            e10 = e12;
                            C6744g.m5614a(e10);
                            r12 = fileWriter;
                            C6744g.m5612a((Closeable) r12);
                            return z10;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C6744g.m5612a((Closeable) r12);
                        throw th;
                    }
                } catch (Exception e13) {
                    fileWriter = null;
                    e10 = e13;
                } catch (Throwable th3) {
                    r12 = 0;
                    th = th3;
                    C6744g.m5612a((Closeable) r12);
                    throw th;
                }
                C6744g.m5612a((Closeable) r12);
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:4:0x0003, B:6:0x0008, B:9:0x001c, B:11:0x0027, B:12:0x0031, B:40:0x00b2, B:52:0x00d8, B:59:0x00f3, B:55:0x00e3, B:66:0x0100, B:69:0x010a, B:13:0x0037, B:15:0x003f, B:16:0x0048, B:18:0x0050, B:20:0x0058, B:22:0x0060, B:28:0x006e, B:30:0x0078, B:32:0x0085, B:34:0x008f, B:35:0x009a, B:37:0x00a4), top: B:73:0x0003 }] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m5884o(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p071uc.crashsdk.C6749e.m5884o(java.lang.String):boolean");
    }

    /* renamed from: p */
    private static Map<String, Integer> m5886p(String str) {
        HashMap map = new HashMap();
        for (String str2 : str.split("\\|", 30)) {
            String[] strArrSplit = str2.split(":", 3);
            if (strArrSplit.length == 2) {
                String strTrim = strArrSplit[0].trim();
                if (!C6744g.m5619a(strTrim)) {
                    int i9 = 1;
                    try {
                        i9 = Integer.parseInt(strArrSplit[1].trim(), 10);
                    } catch (Throwable th) {
                        C6744g.m5614a(th);
                    }
                    map.put(strTrim, Integer.valueOf(i9));
                }
            }
        }
        return map;
    }

    /* renamed from: q */
    private static void m5888q(String str) {
        if (C6751g.m5987q()) {
            try {
                m5826aa();
            } catch (Throwable th) {
                C6744g.m5614a(th);
            }
            if (str == null || "".equals(str)) {
                return;
            }
            try {
                File file = new File(C6751g.m5959W());
                if (!file.exists()) {
                    file.mkdirs();
                }
                C6738a.m5563a("crashsdk", "copy log to: " + file);
                C6744g.m5613a(new File(str), file);
            } catch (Throwable th2) {
                C6744g.m5614a(th2);
            }
        }
    }

    /* renamed from: r */
    private static String m5889r(String str) {
        return String.format("$^%s^$", str);
    }

    /* renamed from: s */
    public static void m5891s() {
        Thread.setDefaultUncaughtExceptionHandler(f6477T);
    }

    /* renamed from: t */
    public static boolean m5892t() {
        return f6492c.get() || m5794Z();
    }

    /* renamed from: u */
    public static Throwable m5893u() {
        return f6478U;
    }

    /* renamed from: v */
    public static int m5894v() {
        if (C6746b.m5694F() == 5) {
            return f6483Z;
        }
        return 100;
    }

    /* renamed from: w */
    public static void m5895w() {
        long jM5985o = C6751g.m5985o();
        if (jM5985o < 0) {
            return;
        }
        boolean z9 = C6746b.m5694F() == 5;
        C6743f.m5600a(0, new RunnableC6742e(TypedValues.CycleType.TYPE_CURVE_FIT));
        if (z9) {
            RunnableC6742e runnableC6742e = new RunnableC6742e(TypedValues.CycleType.TYPE_VISIBILITY);
            f6481X = runnableC6742e;
            C6743f.m5601a(0, runnableC6742e, jM5985o);
        }
    }

    /* renamed from: x */
    public static void m5896x() {
        if (C6746b.f6425c && C6737a.f6309c && !C6743f.m5603b(f6485aa)) {
            C6743f.m5601a(0, f6485aa, 1000L);
        }
    }

    /* renamed from: y */
    public static boolean m5897y() {
        synchronized (f6482Y) {
            try {
                Runnable runnable = f6481X;
                if (runnable == null || f6480W) {
                    return false;
                }
                C6743f.m5599a(runnable);
                f6481X = null;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: z */
    public static void m5898z() {
        if (C6751g.m5987q()) {
            C6743f.m5601a(0, new RunnableC6742e(TypedValues.CycleType.TYPE_ALPHA), WorkRequest.MIN_BACKOFF_MILLIS);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        m5899a(thread, th, false);
    }

    /* renamed from: d */
    public static String m5849d() {
        String str = f6497i;
        if (str != null) {
            return str;
        }
        String strM5871i = m5871i((String) null);
        f6497i = strM5871i;
        return strM5871i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:35|(2:70|36)|44|62|45|(1:49)|50|(1:54)|58|59) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0132, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0133, code lost:
    
        com.p071uc.crashsdk.p072a.C6744g.m5614a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1 A[Catch: all -> 0x00bf, TRY_LEAVE, TryCatch #5 {all -> 0x00bf, blocks: (B:33:0x008f, B:35:0x00a1), top: B:72:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf A[Catch: all -> 0x0132, TryCatch #0 {all -> 0x0132, blocks: (B:45:0x00c9, B:47:0x00cf, B:49:0x00d7, B:50:0x00fd, B:52:0x0103, B:54:0x010b), top: B:62:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103 A[Catch: all -> 0x0132, TryCatch #0 {all -> 0x0132, blocks: (B:45:0x00c9, B:47:0x00cf, B:49:0x00d7, B:50:0x00fd, B:52:0x0103, B:54:0x010b), top: B:62:0x00c9 }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m5856e() {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p071uc.crashsdk.C6749e.m5856e():java.lang.String");
    }

    /* renamed from: g */
    private static long m5865g(String str) {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("getLong", String.class, Long.TYPE);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                return ((Long) declaredMethod.invoke(null, str, 0L)).longValue();
            }
        } catch (Throwable th) {
            C6744g.m5614a(th);
        }
        return 0L;
    }

    /* renamed from: h */
    private static String m5869h(String str) {
        try {
            return str.replaceAll("[^0-9a-zA-Z-.]", "-");
        } catch (Throwable unused) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
    }

    /* renamed from: i */
    private static String m5871i(String str) {
        if (str == null) {
            str = String.valueOf(System.currentTimeMillis()) + new Random().nextInt(65536);
        }
        return String.format(Locale.US, "%s%s_%s_%s_%s_%s_", m5783O(), C6751g.m5954R(), C6751g.m5956T(), m5869h(Build.MODEL), m5869h(Build.VERSION.RELEASE), str);
    }

    /* renamed from: r */
    public static void m5890r() {
        f6477T = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new C6749e());
    }

    /* renamed from: c */
    public static void m5843c() {
        f6497i = null;
    }

    /* renamed from: b */
    public static boolean m5840b(int i9, Object[] objArr) {
        if (i9 == 451) {
            if (f6484a || objArr != null) {
                return m5822a((String) objArr[0], (d) objArr[1]);
            }
            throw new AssertionError();
        }
        if (i9 != 452) {
            if (f6484a) {
                return false;
            }
            throw new AssertionError();
        }
        if (!f6484a && objArr == null) {
            throw new AssertionError();
        }
        String str = (String) objArr[0];
        d dVar = (d) objArr[1];
        return C6744g.m5618a(new File(str), String.format(Locale.US, "%d %d %d %d", Long.valueOf(dVar.f6521a), Long.valueOf(dVar.f6522b), Integer.valueOf(dVar.f6523c), Integer.valueOf(dVar.f6524d)).getBytes());
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m5844c(java.io.OutputStream r8) {
        /*
            java.lang.String r0 = "UTF-8"
            boolean r1 = com.p071uc.crashsdk.C6746b.f6426d
            r2 = 0
            if (r1 == 0) goto L3d
            java.lang.String r0 = com.p071uc.crashsdk.C6746b.m5742l()
            com.p071uc.crashsdk.C6749e.f6496h = r2
            r1 = 17
            long r1 = com.p071uc.crashsdk.JNIBridge.cmd(r1, r0)
            r3 = 1
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 1
            if (r1 != 0) goto L3a
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            byte[] r0 = com.p071uc.crashsdk.p072a.C6744g.m5632e(r1)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L2d
            r8.write(r0)     // Catch: java.lang.Throwable -> L29
            goto L2d
        L29:
            r0 = move-exception
            m5815a(r0, r8)
        L2d:
            r1.delete()     // Catch: java.lang.Throwable -> L31
            goto L35
        L31:
            r0 = move-exception
            m5815a(r0, r8)
        L35:
            com.p071uc.crashsdk.C6749e.f6496h = r2
            m5809a(r8)
        L3a:
            com.p071uc.crashsdk.C6749e.f6496h = r2
            return
        L3d:
            r1 = 0
            int r3 = com.p071uc.crashsdk.C6751g.m5944H()     // Catch: java.lang.Throwable -> L78
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L6c
            java.lang.String r5 = "/proc/self/fd"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L6c
            java.io.File[] r1 = r4.listFiles()     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L6e
            java.util.Locale r4 = java.util.Locale.US     // Catch: java.lang.Throwable -> L6c
            java.lang.String r5 = "opened file count: %d, write limit: %d.\n"
            int r6 = r1.length     // Catch: java.lang.Throwable -> L6c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L6c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L6c
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = java.lang.String.format(r4, r5, r6)     // Catch: java.lang.Throwable -> L6c
            byte[] r4 = r4.getBytes(r0)     // Catch: java.lang.Throwable -> L6c
            r8.write(r4)     // Catch: java.lang.Throwable -> L6c
            goto L7e
        L6c:
            r4 = move-exception
            goto L7b
        L6e:
            java.lang.String r4 = "[DEBUG] listFiles failed!\n"
            byte[] r4 = r4.getBytes(r0)     // Catch: java.lang.Throwable -> L6c
            r8.write(r4)     // Catch: java.lang.Throwable -> L6c
            goto L7e
        L78:
            r4 = move-exception
            r3 = 900(0x384, float:1.261E-42)
        L7b:
            m5815a(r4, r8)
        L7e:
            if (r1 == 0) goto Lc5
            int r4 = r1.length     // Catch: java.lang.Throwable -> Lc1
            if (r4 < r3) goto Lc5
            java.lang.String r3 = "opened files:\n"
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> Lc1
            r8.write(r3)     // Catch: java.lang.Throwable -> Lc1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc1
            r3.<init>()     // Catch: java.lang.Throwable -> Lc1
            int r4 = r1.length     // Catch: java.lang.Throwable -> Lb1
        L92:
            if (r2 >= r4) goto Lb5
            r5 = r1[r2]     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> Lb1
            r3.append(r6)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r6 = " -> "
            r3.append(r6)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r5 = r5.getCanonicalPath()     // Catch: java.lang.Throwable -> Lb1
            r3.append(r5)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r5 = "\n"
            r3.append(r5)     // Catch: java.lang.Throwable -> Lb1
            int r2 = r2 + 1
            goto L92
        Lb1:
            r1 = move-exception
            m5815a(r1, r8)     // Catch: java.lang.Throwable -> Lc1
        Lb5:
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> Lc1
            byte[] r0 = r1.getBytes(r0)     // Catch: java.lang.Throwable -> Lc1
            r8.write(r0)     // Catch: java.lang.Throwable -> Lc1
            goto Lc5
        Lc1:
            r0 = move-exception
            m5815a(r0, r8)
        Lc5:
            m5809a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p071uc.crashsdk.C6749e.m5844c(java.io.OutputStream):void");
    }

    /* renamed from: f */
    public static String m5860f() {
        if (C6744g.m5619a(f6499k)) {
            m5787S();
        }
        return f6499k;
    }

    /* renamed from: h */
    public static String m5868h() {
        String str = f6501m;
        if (str != null) {
            return str;
        }
        String strM5798a = m5798a(Process.myPid());
        f6501m = strM5798a;
        return strM5798a;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m5851d(java.io.OutputStream r9) {
        /*
            java.lang.String r0 = "UTF-8"
            r1 = 0
            r2 = 0
            int r3 = com.p071uc.crashsdk.C6751g.m5945I()     // Catch: java.lang.Throwable -> L1c
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = "/proc/self/task"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L1a
            java.io.File[] r1 = r4.listFiles()     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L16
            goto L25
        L16:
            int r4 = r1.length     // Catch: java.lang.Throwable -> L1a
            if (r4 >= r3) goto L23
            goto L25
        L1a:
            r4 = move-exception
            goto L1f
        L1c:
            r4 = move-exception
            r3 = 300(0x12c, float:4.2E-43)
        L1f:
            com.p071uc.crashsdk.p072a.C6744g.m5614a(r4)
            r4 = r2
        L23:
            if (r1 != 0) goto L26
        L25:
            return
        L26:
            java.lang.String r5 = "threads info:\n"
            byte[] r5 = r5.getBytes(r0)     // Catch: java.lang.Throwable -> L88
            r9.write(r5)     // Catch: java.lang.Throwable -> L88
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L88
            java.lang.String r6 = "threads count: %d, dump limit: %d.\n"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L88
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L88
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r3}     // Catch: java.lang.Throwable -> L88
            java.lang.String r3 = java.lang.String.format(r5, r6, r3)     // Catch: java.lang.Throwable -> L88
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L88
            r9.write(r3)     // Catch: java.lang.Throwable -> L88
            java.lang.String r3 = " tid     name\n"
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L88
            r9.write(r3)     // Catch: java.lang.Throwable -> L88
            int r3 = r1.length     // Catch: java.lang.Throwable -> L88
            r4 = r2
        L55:
            if (r4 >= r3) goto L8c
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L88
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L88
            java.lang.String r7 = r5.getPath()     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = "comm"
            r6.<init>(r7, r8)     // Catch: java.lang.Throwable -> L88
            r7 = 128(0x80, float:1.8E-43)
            java.lang.String r6 = com.p071uc.crashsdk.p072a.C6744g.m5606a(r6, r7, r2)     // Catch: java.lang.Throwable -> L88
            java.lang.String r6 = m5876k(r6)     // Catch: java.lang.Throwable -> L88
            java.util.Locale r7 = java.util.Locale.US     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = "%5s %s\n"
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L88
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6}     // Catch: java.lang.Throwable -> L88
            java.lang.String r5 = java.lang.String.format(r7, r8, r5)     // Catch: java.lang.Throwable -> L88
            byte[] r5 = r5.getBytes(r0)     // Catch: java.lang.Throwable -> L88
            r9.write(r5)     // Catch: java.lang.Throwable -> L88
            int r4 = r4 + 1
            goto L55
        L88:
            r0 = move-exception
            m5815a(r0, r9)
        L8c:
            m5809a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p071uc.crashsdk.C6749e.m5851d(java.io.OutputStream):void");
    }

    /* renamed from: j */
    public static void m5874j() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitNetwork().build());
        } catch (Throwable th) {
            C6744g.m5614a(th);
        }
    }

    /* renamed from: a */
    public static void m5805a(int i9, Object[] objArr) {
        int i10;
        switch (i9) {
            case TypedValues.CycleType.TYPE_CURVE_FIT /* 401 */:
                JNIBridge.nativeCmd(10, C6746b.m5694F() == 5 ? 1L : 0L, null, null);
                C6737a.f6309c = true;
                C6737a.m5541a(false);
                f6469L = true;
                m5793Y();
                m5896x();
                return;
            case TypedValues.CycleType.TYPE_VISIBILITY /* 402 */:
                Object obj = f6482Y;
                synchronized (obj) {
                    try {
                        if (f6481X == null) {
                            return;
                        }
                        f6480W = true;
                        if (C6746b.m5744n()) {
                            return;
                        }
                        if (!C6741d.m5592d()) {
                            C6738a.m5567c("DEBUG", C6741d.m5590b());
                            return;
                        }
                        if (!m5847c(LogType.UNEXP_TYPE)) {
                            C6738a.m5568d("DEBUG", "unexp sample miss");
                            return;
                        }
                        int iNativeGenerateUnexpLog = JNIBridge.nativeGenerateUnexpLog(C6751g.m5985o(), C6751g.m5986p());
                        if (iNativeGenerateUnexpLog != 0) {
                            C6750f.m5916a(11);
                            if ((iNativeGenerateUnexpLog & LogType.UNEXP_KILL_PROCESS) != 0) {
                                f6483Z = 105;
                                i10 = 30;
                            } else if ((iNativeGenerateUnexpLog & LogType.UNEXP_EXIT) != 0) {
                                f6483Z = 104;
                                i10 = 31;
                            } else if ((iNativeGenerateUnexpLog & LogType.UNEXP_RESTART) != 0) {
                                f6483Z = 106;
                                i10 = 32;
                            } else {
                                if ((iNativeGenerateUnexpLog & LogType.UNEXP_ANR) != 0) {
                                    f6483Z = 103;
                                    C6750f.m5916a(10);
                                } else if ((iNativeGenerateUnexpLog & LogType.UNEXP_LOW_MEMORY) != 0) {
                                    f6483Z = 107;
                                    C6750f.m5916a(29);
                                } else {
                                    f6483Z = 102;
                                }
                                m5817a(true);
                            }
                            C6750f.m5916a(i10);
                            m5817a(true);
                        }
                        synchronized (obj) {
                            f6481X = null;
                        }
                        return;
                    } finally {
                    }
                }
            case TypedValues.CycleType.TYPE_ALPHA /* 403 */:
                m5826aa();
                return;
            case 404:
            default:
                if (!f6484a) {
                    throw new AssertionError();
                }
                return;
            case 405:
                f6469L = false;
                StringBuilder sbM5792X = m5792X();
                String strM5733d = C6746b.m5733d();
                if (sbM5792X != null) {
                    C6744g.m5617a(new File(strM5733d), sbM5792X.toString());
                    return;
                }
                return;
            case 406:
                if (!f6484a && objArr == null) {
                    throw new AssertionError();
                }
                m5813a((String) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Boolean) objArr[2]).booleanValue());
                return;
            case 407:
                try {
                    C6737a.m5549d();
                    return;
                } catch (Throwable th) {
                    C6744g.m5614a(th);
                    return;
                }
            case 408:
                synchronized (f6486ab) {
                    try {
                        if (!f6487ac && C6751g.m5951O() && C6746b.m5753w()) {
                            C6746b.m5746p();
                            C6745h.m5671f();
                            C6750f.m5930c();
                            if (C6746b.m5691C()) {
                                m5770B();
                            }
                            if (C6751g.m5951O()) {
                                m5816a(Calendar.getInstance());
                            }
                            f6487ac = true;
                        }
                    } finally {
                    }
                }
                return;
            case 409:
                m5828b(false, false);
                return;
            case 410:
                m5825a(false, true);
                return;
            case 411:
                if (C6746b.f6426d) {
                    JNIBridge.set(28, m5847c(LogType.NATIVE_TYPE));
                    JNIBridge.set(29, m5847c(LogType.ANR_TYPE));
                    return;
                }
                return;
            case 412:
                if (!f6475R && C6746b.m5755y() && C6751g.m5947K()) {
                    m5832b(C6744g.m5605a());
                    return;
                }
                if (f6475R) {
                    if (C6746b.m5755y() && C6751g.m5947K()) {
                        return;
                    }
                    try {
                        C6744g.m5605a().unregisterReceiver(f6474Q);
                        f6475R = false;
                        return;
                    } catch (Throwable th2) {
                        C6744g.m5614a(th2);
                        return;
                    }
                }
                return;
            case 413:
                JNIBridge.cmd(8);
                return;
            case 414:
                try {
                    if (m5852d(C6744g.m5605a())) {
                        return;
                    }
                    int i11 = f6471N + 1;
                    f6471N = i11;
                    if (i11 < 10) {
                        m5791W();
                        return;
                    } else {
                        if (C6746b.f6426d) {
                            JNIBridge.set(130, "(get failed)");
                            return;
                        }
                        return;
                    }
                } catch (Throwable th3) {
                    C6744g.m5614a(th3);
                    return;
                }
            case 415:
                if (!f6484a && objArr == null) {
                    throw new AssertionError();
                }
                long jLongValue = ((Long) objArr[0]).longValue();
                Calendar calendar = Calendar.getInstance();
                if (calendar.getTimeInMillis() >= jLongValue) {
                    C6745h.m5672g();
                    C6750f.m5916a(100);
                    m5828b(true, true);
                    C6745h.m5658b();
                } else {
                    C6745h.m5673h();
                    C6745h.m5674i();
                    C6745h.m5667c();
                }
                m5816a(calendar);
                break;
            case TypedValues.CycleType.TYPE_PATH_ROTATE /* 416 */:
                break;
        }
        m5790V();
    }

    /* renamed from: k */
    public static String m5875k() {
        if (C6744g.m5619a(f6511w)) {
            synchronized (f6513y) {
                f6511w = C6744g.m5607a(C6746b.m5736f(), f6512x, true);
            }
        }
        return f6511w;
    }

    /* renamed from: com.uc.crashsdk.e$a */
    public static class a extends OutputStream {

        /* renamed from: a */
        private final long f6516a;

        /* renamed from: b */
        private final OutputStream f6517b;

        /* renamed from: c */
        private int f6518c = 0;

        /* renamed from: d */
        private int f6519d = 0;

        /* renamed from: e */
        private boolean f6520e = false;

        public a(long j9, OutputStream outputStream) {
            this.f6516a = j9;
            this.f6517b = outputStream;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private int m5900a(byte[] r6, int r7, int r8) throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f6519d
                int r0 = r0 + r8
                r5.f6519d = r0
                boolean r0 = r5.f6520e
                if (r0 == 0) goto Lb
                r6 = 0
                return r6
            Lb:
                int r0 = com.p071uc.crashsdk.C6751g.m5995y()
                if (r0 <= 0) goto L19
                int r1 = r5.f6518c
                int r2 = r1 + r8
                if (r2 <= r0) goto L19
                int r0 = r0 - r1
                goto L1a
            L19:
                r0 = r8
            L1a:
                int r1 = r5.f6518c
                int r1 = r1 + r0
                r5.f6518c = r1
                long r1 = r5.f6516a
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 == 0) goto L30
                java.lang.String r1 = new java.lang.String
                r1.<init>(r6, r7, r0)
                r5.m5901b(r1)
                goto L35
            L30:
                java.io.OutputStream r1 = r5.f6517b
                r1.write(r6, r7, r0)
            L35:
                if (r0 >= r8) goto L3a
                r6 = 1
                r5.f6520e = r6
            L3a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p071uc.crashsdk.C6749e.a.m5900a(byte[], int, int):int");
        }

        /* renamed from: b */
        private void m5901b(String str) {
            if (C6746b.f6426d) {
                JNIBridge.nativeClientWriteData(this.f6516a, str);
            }
        }

        @Override // java.io.OutputStream
        public final void write(int i9) throws IOException {
            if (C6749e.f6496h && C6749e.m5782N()) {
                C6738a.m5568d("DEBUG", String.format(Locale.US, "%c", Integer.valueOf(i9)));
            }
            if (this.f6516a != 0) {
                m5901b(String.format(Locale.US, "%c", Integer.valueOf(i9)));
            } else {
                this.f6517b.write(i9);
            }
            this.f6518c++;
            this.f6519d++;
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i9, int i10) throws IOException {
            if (C6749e.f6496h && C6749e.m5782N()) {
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArr, i9, bArr2, 0, i10);
                if (i10 != 1 || bArr2[0] != 10) {
                    try {
                        C6738a.m5568d("DEBUG", new String(bArr2));
                    } catch (Throwable unused) {
                    }
                }
            }
            m5900a(bArr, i9, i10);
        }

        /* renamed from: a */
        public final void m5902a() {
            try {
                if (this.f6519d - this.f6518c > 0) {
                    m5903a(AbsSection.SEP_ORIGIN_LINE_BREAK);
                    m5903a("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
                }
                m5903a(String.format(Locale.US, "Full: %d bytes, write: %d bytes, limit: %d bytes, reject: %d bytes.\n", Integer.valueOf(this.f6519d), Integer.valueOf(this.f6518c), Integer.valueOf(C6751g.m5995y()), Integer.valueOf(this.f6519d - this.f6518c)));
            } catch (Throwable th) {
                C6744g.m5614a(th);
            }
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            if (C6749e.f6496h && C6749e.m5782N() && (bArr.length != 1 || bArr[0] != 10)) {
                try {
                    C6738a.m5568d("DEBUG", new String(bArr));
                } catch (Throwable unused) {
                }
            }
            m5900a(bArr, 0, bArr.length);
        }

        /* renamed from: a */
        public final void m5903a(String str) throws IOException {
            if (C6749e.f6496h && C6749e.m5782N()) {
                C6738a.m5568d("DEBUG", str);
            }
            if (this.f6516a != 0) {
                m5901b(str);
            } else {
                this.f6517b.write(str.getBytes("UTF-8"));
            }
        }
    }

    /* renamed from: f */
    private static void m5862f(OutputStream outputStream) {
        String strM5558m;
        try {
            outputStream.write("recent status:\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            m5815a(th, outputStream);
        }
        try {
            if (f6490af) {
                strM5558m = m5889r("LASTVER");
            } else {
                strM5558m = C6737a.m5558m();
            }
            outputStream.write(String.format(Locale.US, "last version: '%s'\n", strM5558m).getBytes("UTF-8"));
        } catch (Throwable th2) {
            m5815a(th2, outputStream);
        }
        try {
            ArrayList<String> arrayList = f6506r;
            synchronized (arrayList) {
                try {
                    if (f6508t != null) {
                        outputStream.write(String.format(Locale.US, "generating log: %s\n", f6508t).getBytes("UTF-8"));
                    }
                    if (f6507s > 0 || arrayList.size() > 0) {
                        outputStream.write(String.format(Locale.US, "generated %d logs, recent are:\n", Integer.valueOf(f6507s)).getBytes("UTF-8"));
                        int size = arrayList.size();
                        int i9 = 0;
                        while (i9 < size) {
                            String str = arrayList.get(i9);
                            i9++;
                            outputStream.write(String.format(Locale.US, "* %s\n", str).getBytes("UTF-8"));
                        }
                    }
                } finally {
                }
            }
            Locale locale = Locale.US;
            outputStream.write(String.format(locale, "dumping all threads: %s\n", Boolean.valueOf(f6509u)).getBytes("UTF-8"));
            String str2 = f6510v;
            if (str2 != null) {
                outputStream.write(String.format(locale, "dumping threads: %s\n", str2).getBytes("UTF-8"));
            }
        } catch (Throwable th3) {
            m5815a(th3, outputStream);
        }
        m5809a(outputStream);
    }

    /* renamed from: g */
    public static String m5866g() {
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
                ActivityManager activityManager = (ActivityManager) C6744g.m5605a().getSystemService("activity");
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
                    sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                }
            } catch (Throwable th) {
                C6744g.m5614a(th);
            }
            return sb.toString();
        } catch (Throwable th2) {
            C6744g.m5614a(th2);
            return "";
        }
    }

    /* renamed from: com.uc.crashsdk.e$d */
    public static class d {

        /* renamed from: a */
        long f6521a;

        /* renamed from: b */
        long f6522b;

        /* renamed from: c */
        int f6523c;

        /* renamed from: d */
        int f6524d;

        /* renamed from: e */
        boolean f6525e;

        /* renamed from: f */
        boolean f6526f;

        /* renamed from: g */
        boolean f6527g;

        private d() {
            this.f6521a = 0L;
            this.f6522b = 0L;
            this.f6523c = 0;
            this.f6524d = 0;
            this.f6525e = false;
            this.f6526f = false;
            this.f6527g = false;
        }

        public /* synthetic */ d(byte b10) {
            this();
        }
    }

    /* renamed from: l */
    public static void m5878l() {
        if (f6490af) {
            return;
        }
        C6743f.m5601a(1, new RunnableC6742e(411), 1000L);
    }

    /* renamed from: i */
    public static boolean m5872i() {
        return f6493d;
    }

    /* renamed from: o */
    public static void m5883o() {
        String strM5606a;
        Throwable th;
        File file;
        if (C6744g.m5619a(f6459B)) {
            String string = null;
            try {
                file = new File(C6751g.m5957U() + "unique");
            } catch (Throwable th2) {
                strM5606a = string;
                th = th2;
            }
            if (file.exists()) {
                strM5606a = C6744g.m5606a(file, 48, false);
                try {
                    if (strM5606a != null) {
                        try {
                            if (strM5606a.length() == 36) {
                                string = strM5606a.replaceAll("[^0-9a-zA-Z-]", "-");
                            }
                        } catch (Exception e10) {
                            C6744g.m5614a(e10);
                        }
                    } else {
                        string = strM5606a;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    C6744g.m5614a(th);
                    string = strM5606a;
                    f6459B = string;
                }
                f6459B = string;
            }
            if (C6744g.m5619a(string)) {
                C6746b.m5692D();
                string = UUID.randomUUID().toString();
                if (!C6744g.m5619a(string)) {
                    C6744g.m5618a(file, string.getBytes());
                }
            }
            f6459B = string;
        }
    }

    /* renamed from: p */
    public static String m5885p() {
        return f6459B;
    }

    /* renamed from: q */
    public static void m5887q() {
        f6472O = false;
        if (!C6746b.m5755y()) {
            C6743f.m5601a(3, new RunnableC6742e(TypedValues.CycleType.TYPE_PATH_ROTATE), 11000L);
        }
        if (m5789U()) {
            return;
        }
        f6471N = 0;
        m5791W();
    }

    /* renamed from: b */
    private static void m5835b(OutputStream outputStream, String str, String str2) {
        String strM5889r;
        String strNativeGet;
        try {
            outputStream.write("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            m5815a(th, outputStream);
        }
        try {
            Locale locale = Locale.US;
            outputStream.write(String.format(locale, "Basic Information: 'pid: %d/tid: %d/time: %s'\n", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()), m5879m()).getBytes("UTF-8"));
            String strM5856e = m5856e();
            if (C6744g.m5619a(f6500l)) {
                m5787S();
            }
            outputStream.write(String.format(locale, "Cpu Information: 'abi: %s/processor: %s/hardware: %s'\n", strM5856e, f6500l, m5860f()).getBytes("UTF-8"));
        } catch (Throwable th2) {
            m5815a(th2, outputStream);
        }
        try {
            Locale locale2 = Locale.US;
            outputStream.write(String.format(locale2, "Mobile Information: 'model: %s/version: %s/sdk: %d'\n", Build.MODEL, Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT)).getBytes("UTF-8"));
            outputStream.write(("Build fingerprint: '" + Build.FINGERPRINT + "'\n").getBytes("UTF-8"));
            outputStream.write(String.format(locale2, "Runtime Information: 'start: %s/maxheap: %s/primaryabi: %s/ground: %s'\n", m5803a(new Date(f6491b)), Long.valueOf(Runtime.getRuntime().maxMemory()), C6744g.m5628d(), C6746b.m5755y() ? "fg" : "bg").getBytes("UTF-8"));
        } catch (Throwable th3) {
            m5815a(th3, outputStream);
        }
        try {
            Locale locale3 = Locale.US;
            outputStream.write(String.format(locale3, "Application Information: 'version: %s/subversion: %s/buildseq: %s/versioncode: %d'\n", C6751g.m5954R(), C6751g.m5955S(), C6751g.m5956T(), Integer.valueOf(C6737a.m5547c())).getBytes("UTF-8"));
            String str3 = "0";
            if (C6746b.f6426d) {
                String strNativeGet2 = JNIBridge.nativeGet(1, 0L, null);
                strNativeGet = JNIBridge.nativeGet(2, 0L, null);
                str3 = strNativeGet2;
            } else {
                strNativeGet = "";
            }
            outputStream.write(String.format(locale3, "CrashSDK Information: 'version: %s/nativeseq: %s/javaseq: %s/arch: %s/target: %s'\n", "3.2.0.4", str3, "210105150455", strNativeGet, "release").getBytes("UTF-8"));
            if (str == null) {
                str = "";
            }
            outputStream.write(("Report Name: " + str.substring(str.lastIndexOf(47) + 1) + AbsSection.SEP_ORIGIN_LINE_BREAK).getBytes("UTF-8"));
        } catch (Throwable th4) {
            m5815a(th4, outputStream);
        }
        try {
            if (f6490af) {
                strM5889r = m5889r("UUID");
            } else {
                strM5889r = f6459B;
            }
            outputStream.write(String.format("UUID: %s\n", strM5889r).getBytes("UTF-8"));
            outputStream.write(("Log Type: " + str2 + AbsSection.SEP_ORIGIN_LINE_BREAK).getBytes("UTF-8"));
        } catch (Throwable th5) {
            m5815a(th5, outputStream);
        }
        try {
            String strM5690B = C6746b.m5690B();
            if (C6744g.m5619a(strM5690B)) {
                strM5690B = "(none)";
            }
            outputStream.write(("Activity: " + strM5690B + AbsSection.SEP_ORIGIN_LINE_BREAK).getBytes("UTF-8"));
        } catch (Throwable th6) {
            m5815a(th6, outputStream);
        }
        m5809a(outputStream);
        try {
            C6737a.m5534a(outputStream, "UTF-8");
            if (f6490af) {
                f6496h = false;
                outputStream.write(m5889r("HEADER").getBytes("UTF-8"));
                f6496h = true;
            }
        } catch (Throwable th7) {
            m5815a(th7, outputStream);
        }
        m5809a(outputStream);
    }

    /* renamed from: m */
    public static String m5879m() {
        return m5803a(new Date());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m5852d(Context context) {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (processesInErrorState = activityManager.getProcessesInErrorState()) == null) {
            return false;
        }
        int iMyPid = Process.myPid();
        Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
        while (true) {
            if (it.hasNext()) {
                ActivityManager.ProcessErrorStateInfo next = it.next();
                if (next.pid == iMyPid) {
                    f6472O = true;
                    if (m5782N()) {
                        C6738a.m5568d("crashsdk", "ANR occurred in process: " + next.processName);
                    }
                    if (C6746b.f6426d) {
                        JNIBridge.set(130, next.longMsg);
                    }
                }
            } else if (C6746b.f6426d) {
                m5790V();
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m5817a(boolean z9) {
        File[] fileArrListFiles;
        try {
            if (C6746b.m5752v() && (fileArrListFiles = new File(C6751g.m5958V()).listFiles()) != null) {
                int iM5982l = C6751g.m5982l();
                int iM5983m = C6751g.m5983m();
                if (fileArrListFiles.length < Math.min(iM5982l, iM5983m)) {
                    return;
                }
                Object[] objArr = 0;
                int i9 = 0;
                int i10 = 0;
                for (File file : fileArrListFiles) {
                    if (m5841b(file)) {
                        i9++;
                    } else {
                        i10++;
                    }
                }
                int i11 = (!z9 || i9 < iM5982l) ? 0 : (i9 - iM5982l) + 1;
                int i12 = (z9 || i10 < iM5983m) ? 0 : (i10 - iM5983m) + 1;
                if (i11 == 0 && i12 == 0) {
                    return;
                }
                Arrays.sort(fileArrListFiles, new b(objArr == true ? 1 : 0));
                int i13 = i11;
                int i14 = i12;
                for (File file2 : fileArrListFiles) {
                    boolean zM5841b = m5841b(file2);
                    if (zM5841b && i13 > 0) {
                        C6738a.m5563a("crashsdk", "Delete oldest crash log: " + file2.getPath());
                        file2.delete();
                        i13 += -1;
                    } else if (!zM5841b && i14 > 0) {
                        C6738a.m5563a("crashsdk", "Delete oldest custom log: " + file2.getPath());
                        file2.delete();
                        i14 += -1;
                    }
                    if (i13 == 0 && i14 == 0) {
                        break;
                    }
                }
                C6750f.m5917a(16, i11 + i12);
                if (i11 > 0) {
                    C6750f.m5917a(22, i11);
                }
                if (i12 > 0) {
                    C6750f.m5917a(23, i12);
                }
            }
        } catch (Throwable th) {
            C6744g.m5614a(th);
        }
    }

    /* renamed from: n */
    public static void m5881n() {
        f6491b = System.currentTimeMillis();
    }

    /* renamed from: e */
    private static void m5858e(OutputStream outputStream) {
        BufferedReader bufferedReader;
        int iIndexOf;
        if (C6746b.f6426d) {
            try {
                outputStream.write("solib build id:\n".getBytes("UTF-8"));
            } catch (Throwable th) {
                m5815a(th, outputStream);
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
                                if (strSubstring.contains("/data/") || strSubstring.contains(C6737a.f6307a)) {
                                    if (!arrayList.contains(strSubstring)) {
                                        arrayList.add(strSubstring);
                                        if (f6490af) {
                                            try {
                                                outputStream.write((String.format("$^%s`%s^$", "SOBUILDID", strSubstring) + AbsSection.SEP_ORIGIN_LINE_BREAK).getBytes("UTF-8"));
                                            } catch (Throwable th2) {
                                                m5815a(th2, outputStream);
                                            }
                                        } else {
                                            outputStream.write(String.format(Locale.US, "%s: %s\n", strSubstring, JNIBridge.nativeGet(3, 0L, strSubstring)).getBytes("UTF-8"));
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileReader = fileReader2;
                            try {
                                m5815a(th, outputStream);
                                C6744g.m5612a(fileReader);
                                C6744g.m5612a(bufferedReader);
                                m5809a(outputStream);
                            } catch (Throwable th4) {
                                C6744g.m5612a(fileReader);
                                C6744g.m5612a(bufferedReader);
                                throw th4;
                            }
                        }
                    }
                    C6744g.m5612a(fileReader2);
                } catch (Throwable th5) {
                    th = th5;
                    bufferedReader = null;
                }
            } catch (Throwable th6) {
                th = th6;
                bufferedReader = null;
            }
            C6744g.m5612a(bufferedReader);
            m5809a(outputStream);
        }
    }

    /* renamed from: c */
    public static boolean m5847c(String str) {
        if (f6490af) {
            return true;
        }
        try {
            return m5884o(str);
        } catch (Throwable th) {
            C6744g.m5614a(th);
            return true;
        }
    }

    /* renamed from: d */
    public static boolean m5853d(String str) {
        try {
            if (!C6744g.m5624b(str) || !str.startsWith("lib") || !str.endsWith(".so")) {
                return false;
            }
            System.loadLibrary(str.substring(3, str.length() - 3));
            return true;
        } catch (Throwable th) {
            C6744g.m5614a(th);
            return false;
        }
    }

    /* renamed from: c */
    public static void m5845c(boolean z9) {
        if (f6475R) {
            if (z9 && C6751g.m5947K()) {
                return;
            }
        } else if (!z9 || !C6751g.m5947K()) {
            return;
        }
        RunnableC6742e runnableC6742e = f6476S;
        if (C6743f.m5603b(runnableC6742e)) {
            C6743f.m5599a(runnableC6742e);
        }
        C6743f.m5601a(0, runnableC6742e, 3000L);
    }

    /* renamed from: d */
    public static String m5850d(boolean z9) {
        if (z9) {
            return "https://errlogos.umeng.com/upload";
        }
        return "https://errlog.umeng.com/upload";
    }

    /* renamed from: a */
    public static String m5801a(String str, String str2) {
        String[] strArr;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                strArr = new String[]{"ps", "-ef"};
            } else {
                strArr = new String[]{"ps"};
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(strArr).getInputStream()));
            boolean zM5624b = C6744g.m5624b(str);
            boolean zM5624b2 = C6744g.m5624b(str2);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    if ((zM5624b && line.contains(str)) || ((zM5624b2 && line.contains(str2)) || (line.indexOf(47) < 0 && line.indexOf(46) > 0))) {
                        byteArrayOutputStream.write(line.getBytes("UTF-8"));
                        byteArrayOutputStream.write(AbsSection.SEP_ORIGIN_LINE_BREAK.getBytes("UTF-8"));
                    }
                } else {
                    return byteArrayOutputStream.toString("UTF-8");
                }
            }
        } catch (Throwable th) {
            C6744g.m5614a(th);
            return "exception exists.";
        }
    }

    /* renamed from: e */
    public static int m5855e(boolean z9) {
        int iM5924b;
        if (z9) {
            iM5924b = C6750f.m5921a(C6746b.m5730c()) ? 1 : 0;
        } else {
            iM5924b = C6750f.m5924b();
        }
        int iM5925b = C6750f.m5925b(z9);
        return iM5925b > iM5924b ? iM5925b : iM5924b;
    }

    /* renamed from: a */
    private static BufferedReader m5797a(InputStreamReader inputStreamReader) {
        BufferedReader bufferedReader = null;
        int i9 = 8192;
        while (bufferedReader == null && i9 > 0) {
            try {
                bufferedReader = new BufferedReader(inputStreamReader, i9);
            } catch (Throwable unused) {
                i9 /= 2;
                if (i9 < 512) {
                    break;
                }
            }
        }
        return bufferedReader;
    }

    /* renamed from: a */
    private static void m5809a(OutputStream outputStream) {
        try {
            outputStream.write("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            m5815a(th, outputStream);
        }
    }

    /* renamed from: e */
    public static StringBuilder m5857e(String str) {
        return m5804a(Thread.currentThread().getStackTrace(), str);
    }

    /* renamed from: a */
    private static String m5799a(File file) {
        String canonicalPath;
        try {
            canonicalPath = file.getCanonicalPath();
        } catch (Throwable unused) {
            canonicalPath = null;
        }
        return C6744g.m5619a(canonicalPath) ? file.getPath() : canonicalPath;
    }

    /* renamed from: a */
    private static long m5796a(StatFs statFs, String str, String str2) {
        try {
            Method declaredMethod = StatFs.class.getDeclaredMethod(str, null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(statFs, null);
            if (objInvoke != null && (objInvoke instanceof Long)) {
                return ((Long) objInvoke).longValue();
            }
        } catch (Throwable unused) {
        }
        try {
            Method declaredMethod2 = StatFs.class.getDeclaredMethod(str2, null);
            declaredMethod2.setAccessible(true);
            Object objInvoke2 = declaredMethod2.invoke(statFs, null);
            if (objInvoke2 == null || !(objInvoke2 instanceof Integer)) {
                return 0L;
            }
            return ((Integer) objInvoke2).intValue();
        } catch (Throwable th) {
            C6744g.m5614a(th);
            return 0L;
        }
    }

    /* renamed from: b */
    private static void m5834b(OutputStream outputStream) {
        BufferedReader bufferedReaderM5797a = null;
        try {
            outputStream.write("logcat:\n".getBytes("UTF-8"));
        } finally {
        }
        try {
            if (C6751g.m5984n() <= 0) {
                try {
                    outputStream.write("[DEBUG] custom java logcat lines count is 0!\n".getBytes("UTF-8"));
                } catch (Throwable th) {
                    m5815a(th, outputStream);
                }
                m5809a(outputStream);
                return;
            }
            int iM5984n = C6751g.m5984n();
            bufferedReaderM5797a = m5797a(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"logcat", "-d", "-b", "events", "-b", "main", "-v", "threadtime", "-t", String.valueOf(iM5984n)}).getInputStream()));
            if (bufferedReaderM5797a == null) {
                try {
                    outputStream.write("[DEBUG] alloc buffer failed!\n".getBytes("UTF-8"));
                } catch (Throwable th2) {
                    m5815a(th2, outputStream);
                }
                m5809a(outputStream);
                return;
            }
            int i9 = 0;
            f6496h = false;
            int i10 = 0;
            while (true) {
                String line = bufferedReaderM5797a.readLine();
                if (line != null) {
                    i9++;
                    if (i10 < iM5984n && !line.contains(" I auditd ") && !line.contains(" I liblog ")) {
                        outputStream.write(line.getBytes("UTF-8"));
                        outputStream.write(AbsSection.SEP_ORIGIN_LINE_BREAK.getBytes("UTF-8"));
                        i10++;
                    }
                } else {
                    try {
                        break;
                    } catch (Throwable th3) {
                        m5815a(th3, outputStream);
                    }
                }
            }
            outputStream.write(String.format(Locale.US, "[DEBUG] Read %d lines, wrote %d lines.\n", Integer.valueOf(i9), Integer.valueOf(i10)).getBytes("UTF-8"));
            f6496h = true;
            m5809a(outputStream);
            return;
            m5809a(outputStream);
            return;
        } finally {
        }
    }

    /* renamed from: a */
    private static void m5807a(a aVar) {
        try {
            aVar.m5903a(String.format(Locale.US, "log end: %s\n", m5879m()));
        } catch (Throwable th) {
            m5815a(th, aVar);
        }
    }

    /* renamed from: a */
    public static int m5795a(OutputStream outputStream, String str, int i9) {
        int i10 = 0;
        if (str == null) {
            m5809a(outputStream);
            return 0;
        }
        try {
            String strM5569a = C6739b.m5569a(str);
            if (strM5569a == null) {
                strM5569a = "file: '" + str + "' not found or decode failed!";
            }
            int length = strM5569a.length();
            if (length <= i9 + 32) {
                i9 = length;
            }
            if (i9 > 0) {
                try {
                    outputStream.write(strM5569a.getBytes("UTF-8"), 0, i9);
                    outputStream.write(AbsSection.SEP_ORIGIN_LINE_BREAK.getBytes("UTF-8"));
                } catch (Throwable th) {
                    th = th;
                    i10 = i9;
                    m5815a(th, outputStream);
                    i9 = i10;
                    m5809a(outputStream);
                    return i9;
                }
            }
            if (i9 < strM5569a.length()) {
                outputStream.write(String.format(Locale.US, "(truncated %d bytes)\n", Integer.valueOf(strM5569a.length() - i9)).getBytes("UTF-8"));
            }
        } catch (Throwable th2) {
            th = th2;
        }
        m5809a(outputStream);
        return i9;
    }

    /* renamed from: a */
    public static String m5798a(int i9) {
        try {
            String strM5606a = C6744g.m5606a(new File(String.format(Locale.US, "/proc/%d/cmdline", Integer.valueOf(i9))), 128, false);
            if (C6744g.m5624b(strM5606a)) {
                return m5876k(strM5606a);
            }
            return EnvironmentCompat.MEDIA_UNKNOWN;
        } catch (Throwable th) {
            C6744g.m5614a(th);
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
    }

    /* renamed from: b */
    private static void m5833b(a aVar) {
        f6496h = false;
        try {
            aVar.write((m5889r("LOG_END") + AbsSection.SEP_ORIGIN_LINE_BREAK).getBytes("UTF-8"));
        } catch (Throwable th) {
            C6744g.m5614a(th);
        }
        f6496h = true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:(2:277|182)|203|204|(2:333|205)|209|(4:211|283|212|216)|(2:297|217)|218|(2:314|222)|226|(4:228|339|229|233)|234|275|235|(1:240)|241) */
    /* JADX WARN: Can't wrap try/catch for region: R(25:0|2|295|3|4|(2:349|6)|9|(1:11)(1:13)|14|(45:312|15|(1:17)|21|(2:326|23)|(2:337|31)|310|35|320|36|(4:38|39|316|40)(1:46)|48|(1:52)|322|59|(2:341|63)|67|271|68|281|72|(2:293|77)|84|324|85|289|89|(2:335|93)|97|269|98|102|(4:104|308|105|109)|318|110|114|330|115|(2:347|119)|299|123|(1:125)(2:128|(1:130))|133|(2:345|134)|138)|(4:140|291|141|145)(10:306|147|(0)(15:154|302|155|156|157|158|159|287|160|(3:162|285|163)|175|328|176|180|(20:277|182|203|204|333|205|209|(4:211|283|212|216)|297|217|218|314|222|226|(4:228|339|229|233)|234|275|235|(1:240)|241)(25:279|187|(1:189)|190|(1:192)|195|(4:197|(1:199)(1:201)|200|202)|203|204|333|205|209|(0)|297|217|218|314|222|226|(0)|234|275|235|(0)|241))|249|(1:251)|343|252|(1:254)(1:257)|258|261)|146|175|328|176|180|(0)(0)|249|(0)|343|252|(0)(0)|258|261|(4:(0)|(1:332)|(1:288)|(1:305))) */
    /* JADX WARN: Can't wrap try/catch for region: R(72:0|2|295|3|4|(2:349|6)|9|(1:11)(1:13)|14|312|15|(1:17)|21|(2:326|23)|337|31|310|35|320|36|(4:38|39|316|40)(1:46)|48|(1:52)|322|59|341|63|67|271|68|281|72|(2:293|77)|84|324|85|289|89|335|93|97|269|98|102|(4:104|308|105|109)|318|110|114|330|115|(2:347|119)|299|123|(1:125)(2:128|(1:130))|133|(2:345|134)|138|(4:140|291|141|145)(10:306|147|(0)(15:154|302|155|156|157|158|159|287|160|(3:162|285|163)|175|328|176|180|(20:277|182|203|204|333|205|209|(4:211|283|212|216)|297|217|218|314|222|226|(4:228|339|229|233)|234|275|235|(1:240)|241)(25:279|187|(1:189)|190|(1:192)|195|(4:197|(1:199)(1:201)|200|202)|203|204|333|205|209|(0)|297|217|218|314|222|226|(0)|234|275|235|(0)|241))|249|(1:251)|343|252|(1:254)(1:257)|258|261)|146|175|328|176|180|(0)(0)|249|(0)|343|252|(0)(0)|258|261|(4:(0)|(1:332)|(1:288)|(1:305))) */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0350, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0351, code lost:
    
        m5815a(r0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0469, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x046a, code lost:
    
        com.p071uc.crashsdk.p072a.C6744g.m5614a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x049b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x04a5, code lost:
    
        com.p071uc.crashsdk.p072a.C6744g.m5614a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ac A[Catch: all -> 0x013b, TRY_LEAVE, TryCatch #18 {all -> 0x013b, blocks: (B:67:0x011d, B:97:0x0199, B:102:0x01a7, B:104:0x01ac, B:109:0x01c0, B:108:0x01bd, B:114:0x01ca, B:133:0x0210, B:138:0x0221, B:140:0x0225, B:145:0x0239, B:175:0x0343, B:180:0x0354, B:203:0x0407, B:209:0x0419, B:211:0x041d, B:216:0x0431, B:215:0x042e, B:226:0x0445, B:228:0x0449, B:233:0x045d, B:232:0x045a, B:234:0x045f, B:238:0x046a, B:225:0x0442, B:220:0x0439, B:208:0x0416, B:185:0x036c, B:179:0x0351, B:144:0x0236, B:174:0x0340, B:137:0x021e, B:132:0x020d, B:122:0x01e0, B:118:0x01d2, B:113:0x01c7, B:101:0x01a4, B:96:0x0196, B:92:0x0175, B:88:0x0150, B:80:0x0137, B:75:0x012d, B:71:0x0125, B:66:0x011a, B:62:0x010c, B:58:0x00ff, B:98:0x019f, B:68:0x0120, B:235:0x0465, B:72:0x0128, B:212:0x041f, B:89:0x0153, B:141:0x0227, B:77:0x0132, B:217:0x0433, B:123:0x01e3, B:125:0x01e7, B:128:0x01fb, B:130:0x0201, B:105:0x01ae, B:222:0x043d, B:110:0x01c2, B:59:0x0102, B:85:0x0140, B:176:0x0346, B:115:0x01cd, B:205:0x0411, B:93:0x0178, B:229:0x044b, B:63:0x010f, B:134:0x0213, B:119:0x01d5), top: B:304:0x00ff, inners: #0, #1, #3, #6, #7, #10, #11, #12, #14, #15, #20, #23, #25, #27, #28, #30, #31, #33, #34, #36, #37, #39, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e7 A[Catch: all -> 0x01f9, TryCatch #15 {all -> 0x01f9, blocks: (B:123:0x01e3, B:125:0x01e7, B:128:0x01fb, B:130:0x0201), top: B:299:0x01e3, outer: #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01fb A[Catch: all -> 0x01f9, TryCatch #15 {all -> 0x01f9, blocks: (B:123:0x01e3, B:125:0x01e7, B:128:0x01fb, B:130:0x0201), top: B:299:0x01e3, outer: #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0225 A[Catch: all -> 0x013b, TRY_LEAVE, TryCatch #18 {all -> 0x013b, blocks: (B:67:0x011d, B:97:0x0199, B:102:0x01a7, B:104:0x01ac, B:109:0x01c0, B:108:0x01bd, B:114:0x01ca, B:133:0x0210, B:138:0x0221, B:140:0x0225, B:145:0x0239, B:175:0x0343, B:180:0x0354, B:203:0x0407, B:209:0x0419, B:211:0x041d, B:216:0x0431, B:215:0x042e, B:226:0x0445, B:228:0x0449, B:233:0x045d, B:232:0x045a, B:234:0x045f, B:238:0x046a, B:225:0x0442, B:220:0x0439, B:208:0x0416, B:185:0x036c, B:179:0x0351, B:144:0x0236, B:174:0x0340, B:137:0x021e, B:132:0x020d, B:122:0x01e0, B:118:0x01d2, B:113:0x01c7, B:101:0x01a4, B:96:0x0196, B:92:0x0175, B:88:0x0150, B:80:0x0137, B:75:0x012d, B:71:0x0125, B:66:0x011a, B:62:0x010c, B:58:0x00ff, B:98:0x019f, B:68:0x0120, B:235:0x0465, B:72:0x0128, B:212:0x041f, B:89:0x0153, B:141:0x0227, B:77:0x0132, B:217:0x0433, B:123:0x01e3, B:125:0x01e7, B:128:0x01fb, B:130:0x0201, B:105:0x01ae, B:222:0x043d, B:110:0x01c2, B:59:0x0102, B:85:0x0140, B:176:0x0346, B:115:0x01cd, B:205:0x0411, B:93:0x0178, B:229:0x044b, B:63:0x010f, B:134:0x0213, B:119:0x01d5), top: B:304:0x00ff, inners: #0, #1, #3, #6, #7, #10, #11, #12, #14, #15, #20, #23, #25, #27, #28, #30, #31, #33, #34, #36, #37, #39, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x041d A[Catch: all -> 0x013b, TRY_LEAVE, TryCatch #18 {all -> 0x013b, blocks: (B:67:0x011d, B:97:0x0199, B:102:0x01a7, B:104:0x01ac, B:109:0x01c0, B:108:0x01bd, B:114:0x01ca, B:133:0x0210, B:138:0x0221, B:140:0x0225, B:145:0x0239, B:175:0x0343, B:180:0x0354, B:203:0x0407, B:209:0x0419, B:211:0x041d, B:216:0x0431, B:215:0x042e, B:226:0x0445, B:228:0x0449, B:233:0x045d, B:232:0x045a, B:234:0x045f, B:238:0x046a, B:225:0x0442, B:220:0x0439, B:208:0x0416, B:185:0x036c, B:179:0x0351, B:144:0x0236, B:174:0x0340, B:137:0x021e, B:132:0x020d, B:122:0x01e0, B:118:0x01d2, B:113:0x01c7, B:101:0x01a4, B:96:0x0196, B:92:0x0175, B:88:0x0150, B:80:0x0137, B:75:0x012d, B:71:0x0125, B:66:0x011a, B:62:0x010c, B:58:0x00ff, B:98:0x019f, B:68:0x0120, B:235:0x0465, B:72:0x0128, B:212:0x041f, B:89:0x0153, B:141:0x0227, B:77:0x0132, B:217:0x0433, B:123:0x01e3, B:125:0x01e7, B:128:0x01fb, B:130:0x0201, B:105:0x01ae, B:222:0x043d, B:110:0x01c2, B:59:0x0102, B:85:0x0140, B:176:0x0346, B:115:0x01cd, B:205:0x0411, B:93:0x0178, B:229:0x044b, B:63:0x010f, B:134:0x0213, B:119:0x01d5), top: B:304:0x00ff, inners: #0, #1, #3, #6, #7, #10, #11, #12, #14, #15, #20, #23, #25, #27, #28, #30, #31, #33, #34, #36, #37, #39, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0449 A[Catch: all -> 0x013b, TRY_LEAVE, TryCatch #18 {all -> 0x013b, blocks: (B:67:0x011d, B:97:0x0199, B:102:0x01a7, B:104:0x01ac, B:109:0x01c0, B:108:0x01bd, B:114:0x01ca, B:133:0x0210, B:138:0x0221, B:140:0x0225, B:145:0x0239, B:175:0x0343, B:180:0x0354, B:203:0x0407, B:209:0x0419, B:211:0x041d, B:216:0x0431, B:215:0x042e, B:226:0x0445, B:228:0x0449, B:233:0x045d, B:232:0x045a, B:234:0x045f, B:238:0x046a, B:225:0x0442, B:220:0x0439, B:208:0x0416, B:185:0x036c, B:179:0x0351, B:144:0x0236, B:174:0x0340, B:137:0x021e, B:132:0x020d, B:122:0x01e0, B:118:0x01d2, B:113:0x01c7, B:101:0x01a4, B:96:0x0196, B:92:0x0175, B:88:0x0150, B:80:0x0137, B:75:0x012d, B:71:0x0125, B:66:0x011a, B:62:0x010c, B:58:0x00ff, B:98:0x019f, B:68:0x0120, B:235:0x0465, B:72:0x0128, B:212:0x041f, B:89:0x0153, B:141:0x0227, B:77:0x0132, B:217:0x0433, B:123:0x01e3, B:125:0x01e7, B:128:0x01fb, B:130:0x0201, B:105:0x01ae, B:222:0x043d, B:110:0x01c2, B:59:0x0102, B:85:0x0140, B:176:0x0346, B:115:0x01cd, B:205:0x0411, B:93:0x0178, B:229:0x044b, B:63:0x010f, B:134:0x0213, B:119:0x01d5), top: B:304:0x00ff, inners: #0, #1, #3, #6, #7, #10, #11, #12, #14, #15, #20, #23, #25, #27, #28, #30, #31, #33, #34, #36, #37, #39, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0481 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0492 A[Catch: all -> 0x049b, TryCatch #38 {all -> 0x049b, blocks: (B:252:0x048e, B:254:0x0492, B:258:0x049f), top: B:343:0x048e }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0358 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0371 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0243 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m5802a(java.lang.Throwable r29, java.lang.String r30, long r31, boolean r33) {
        /*
            Method dump skipped, instructions count: 1205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p071uc.crashsdk.C6749e.m5802a(java.lang.Throwable, java.lang.String, long, boolean):java.lang.String");
    }

    /* renamed from: b */
    public static int m5827b(OutputStream outputStream, String str, int i9) {
        int i10;
        DataInputStream dataInputStream = null;
        int i11 = 0;
        try {
            File file = new File(str);
            if (file.exists()) {
                byte[] bArrM5785Q = m5785Q();
                if (bArrM5785Q == null) {
                    outputStream.write("(alloc buffer failed!)\n".getBytes("UTF-8"));
                    return 0;
                }
                DataInputStream dataInputStream2 = new DataInputStream(new FileInputStream(file));
                int i12 = 0;
                int i13 = 0;
                boolean z9 = false;
                while (true) {
                    try {
                        int i14 = dataInputStream2.read(bArrM5785Q);
                        if (i14 == -1) {
                            break;
                        }
                        i12 += i14;
                        int i15 = i9 - i13;
                        if (i14 <= i15 + 32) {
                            i15 = i14;
                        }
                        if (i15 > 0 && !z9) {
                            outputStream.write(bArrM5785Q, 0, i15);
                            i13 += i15;
                        }
                        if (!z9) {
                            z9 = i15 < i14 || i13 >= i9;
                        }
                    } catch (Throwable th) {
                        th = th;
                        i11 = i13;
                        dataInputStream = dataInputStream2;
                        try {
                            m5815a(th, outputStream);
                            m5809a(outputStream);
                            return i11;
                        } finally {
                            C6744g.m5612a(dataInputStream);
                        }
                    }
                }
                i10 = i12;
                i11 = i13;
                dataInputStream = dataInputStream2;
            } else {
                outputStream.write(("file: '" + str + "' not exists!\n").getBytes("UTF-8"));
                i10 = 0;
            }
            if (i11 > 0) {
                outputStream.write(AbsSection.SEP_ORIGIN_LINE_BREAK.getBytes("UTF-8"));
            }
            if (i11 < i10) {
                outputStream.write(String.format(Locale.US, "(truncated %d bytes)\n", Integer.valueOf(i10 - i11)).getBytes("UTF-8"));
            }
        } catch (Throwable th2) {
            th = th2;
        }
        m5809a(outputStream);
        return i11;
    }

    /* renamed from: b */
    public static void m5839b(boolean z9) {
        try {
            boolean zM5989s = C6751g.m5988r() && C6746b.m5691C() && !f6493d;
            if (!zM5989s) {
                zM5989s = C6751g.m5989s();
            }
            if (zM5989s) {
                if (z9) {
                    String strM5875k = m5875k();
                    if (C6744g.m5619a(strM5875k)) {
                        return;
                    }
                    m5874j();
                    m5813a(strM5875k, false, false);
                    return;
                }
                m5825a(true, false);
            }
        } catch (Throwable th) {
            C6744g.m5614a(th);
        }
    }

    /* renamed from: b */
    private static boolean m5841b(File file) {
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
    private static String m5830b(String str, boolean z9, boolean z10) {
        if (z9) {
            try {
                str = m5877l(str);
            } catch (Throwable th) {
                C6744g.m5614a(th);
            }
        }
        if (!z10) {
            return str;
        }
        try {
            return m5800a(str);
        } catch (Throwable th2) {
            C6744g.m5614a(th2);
            return str;
        }
    }

    /* renamed from: b */
    public static void m5838b(String str, String str2, boolean z9) {
        C6745h.m5656a(str, str2, false, z9);
    }

    /* renamed from: b */
    public static void m5836b(String str) {
        synchronized (f6514z) {
            C6739b.m5571a(C6746b.m5739i(), str + AbsSection.SEP_ORIGIN_LINE_BREAK);
        }
    }

    /* renamed from: b */
    private static void m5837b(String str, String str2) {
        try {
            C6748d.m5763a(str, m5868h(), str2);
        } catch (Throwable th) {
            C6744g.m5614a(th);
        }
    }

    /* renamed from: b */
    public static void m5832b(Context context) {
        if (C6751g.m5947K()) {
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
                intentFilter.addAction("android.intent.action.BATTERY_LOW");
                intentFilter.addAction("android.intent.action.BATTERY_OKAY");
                context.registerReceiver(f6474Q, intentFilter, null, C6743f.m5596a(1));
                f6475R = true;
            } catch (Throwable th) {
                C6744g.m5614a(th);
            }
        }
    }

    /* renamed from: b */
    public static void m5831b(int i9) {
        C6743f.m5601a(0, new RunnableC6742e(410), i9 * 1000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static int m5828b(boolean z9, boolean z10) {
        int i9;
        if (z10 && !f6487ac) {
            C6750f.m5933d(false);
        }
        if (z9) {
            boolean zM5923a = C6750f.m5923a(C6746b.m5730c(), false);
            C6745h.m5674i();
            i9 = zM5923a;
        } else {
            int iM5912a = C6750f.m5912a();
            C6745h.m5674i();
            i9 = iM5912a;
        }
        return z10 ? C6750f.m5914a(z9) : i9;
    }

    /* renamed from: a */
    public static String m5800a(String str) {
        int iLastIndexOf;
        int iIndexOf;
        int i9;
        int iIndexOf2;
        File file;
        byte[] bArrM5632e;
        byte[] bArrM5585b;
        if (C6751g.m5994x() && (iLastIndexOf = str.lastIndexOf(47)) > 0 && (iIndexOf = str.indexOf(95, iLastIndexOf)) > iLastIndexOf && (iIndexOf2 = str.indexOf(95, (i9 = iIndexOf + 1))) > iIndexOf) {
            String strM5630d = C6744g.m5630d("CrashSDK" + str.substring(iLastIndexOf + 1, iIndexOf) + str.substring(i9, iIndexOf2));
            if (strM5630d != null && (bArrM5632e = C6744g.m5632e((file = new File(str)))) != null && bArrM5632e.length > 0) {
                try {
                    bArrM5585b = C6740c.m5585b(bArrM5632e, strM5630d.substring(0, 16).getBytes());
                } catch (Throwable th) {
                    C6744g.m5614a(th);
                    bArrM5585b = null;
                }
                if (bArrM5585b != null) {
                    String str2 = str + ".ec";
                    File file2 = new File(str2 + ".tmp");
                    if (C6744g.m5618a(file2, bArrM5585b)) {
                        if (!file2.renameTo(new File(str2))) {
                            file2.delete();
                            return str;
                        }
                        file.delete();
                        return str2;
                    }
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    public static void m5815a(Throwable th, OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.write("[DEBUG] CrashHandler occurred new exception:\n".getBytes("UTF-8"));
                th.printStackTrace(new PrintStream(outputStream));
                outputStream.write("\n\n".getBytes("UTF-8"));
            } catch (Throwable th2) {
                C6744g.m5614a(th2);
            }
        }
        C6744g.m5614a(th);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:30|(5:32|(1:42)(1:36)|43|(2:45|217)|159)(1:46)|47|203|48|(12:50|(7:52|53|211|54|55|209|56)(1:64)|(1:66)(1:67)|68|70|(6:72|(1:74)(1:76)|75|77|(1:79)(1:80)|81)(1:82)|83|(1:85)(1:(1:91))|(1:93)(2:94|(9:99|(1:101)(1:102)|103|(6:105|(1:107)|108|122|(2:124|218)(2:125|(2:127|219)(2:128|(2:130|220)(2:131|(7:133|(1:135)(1:136)|(1:141)(1:140)|142|(5:144|(1:146)|147|(1:149)(1:150)|151)(2:153|(1:155))|152|(2:214|157)(2:158|215))(0))))|159)(1:109)|110|(2:112|(1:(2:117|108))(1:(2:121|108)))|122|(0)(0)|159)(1:98))|26|216|159)(0)|195) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b1, code lost:
    
        r25 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0303 A[Catch: all -> 0x0034, TryCatch #2 {all -> 0x0034, blocks: (B:4:0x000a, B:6:0x0010, B:8:0x001f, B:11:0x0037, B:13:0x003d, B:14:0x0050, B:16:0x0060, B:18:0x006a, B:159:0x03d6, B:20:0x0072, B:22:0x0082, B:24:0x0094, B:27:0x00b2, B:29:0x00c0, B:32:0x00ca, B:43:0x00f7, B:70:0x01c7, B:72:0x01db, B:74:0x01df, B:77:0x01e7, B:79:0x01eb, B:81:0x01f0, B:83:0x01fa, B:93:0x021d, B:94:0x0234, B:96:0x023a, B:98:0x0243, B:99:0x024a, B:101:0x026a, B:103:0x027d, B:105:0x028f, B:107:0x029f, B:108:0x02b0, B:122:0x02f4, B:125:0x0303, B:128:0x0312, B:131:0x0322, B:133:0x0330, B:135:0x033d, B:138:0x0345, B:142:0x0352, B:144:0x035e, B:146:0x0378, B:147:0x037d, B:149:0x038c, B:151:0x039d, B:157:0x03c1, B:162:0x03e7, B:164:0x03ee, B:166:0x03f5, B:168:0x03fc, B:170:0x0403, B:172:0x040a, B:178:0x041c, B:180:0x0423, B:182:0x042a, B:184:0x0431, B:176:0x0415, B:150:0x0395, B:153:0x03b5, B:155:0x03b9, B:110:0x02b8, B:112:0x02be, B:115:0x02c6, B:117:0x02ca, B:119:0x02de, B:121:0x02e2, B:87:0x0204, B:89:0x0212, B:91:0x0218, B:69:0x01c2, B:39:0x00e9, B:185:0x0437), top: B:207:0x000a, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01db A[Catch: all -> 0x0034, TryCatch #2 {all -> 0x0034, blocks: (B:4:0x000a, B:6:0x0010, B:8:0x001f, B:11:0x0037, B:13:0x003d, B:14:0x0050, B:16:0x0060, B:18:0x006a, B:159:0x03d6, B:20:0x0072, B:22:0x0082, B:24:0x0094, B:27:0x00b2, B:29:0x00c0, B:32:0x00ca, B:43:0x00f7, B:70:0x01c7, B:72:0x01db, B:74:0x01df, B:77:0x01e7, B:79:0x01eb, B:81:0x01f0, B:83:0x01fa, B:93:0x021d, B:94:0x0234, B:96:0x023a, B:98:0x0243, B:99:0x024a, B:101:0x026a, B:103:0x027d, B:105:0x028f, B:107:0x029f, B:108:0x02b0, B:122:0x02f4, B:125:0x0303, B:128:0x0312, B:131:0x0322, B:133:0x0330, B:135:0x033d, B:138:0x0345, B:142:0x0352, B:144:0x035e, B:146:0x0378, B:147:0x037d, B:149:0x038c, B:151:0x039d, B:157:0x03c1, B:162:0x03e7, B:164:0x03ee, B:166:0x03f5, B:168:0x03fc, B:170:0x0403, B:172:0x040a, B:178:0x041c, B:180:0x0423, B:182:0x042a, B:184:0x0431, B:176:0x0415, B:150:0x0395, B:153:0x03b5, B:155:0x03b9, B:110:0x02b8, B:112:0x02be, B:115:0x02c6, B:117:0x02ca, B:119:0x02de, B:121:0x02e2, B:87:0x0204, B:89:0x0212, B:91:0x0218, B:69:0x01c2, B:39:0x00e9, B:185:0x0437), top: B:207:0x000a, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021d A[Catch: all -> 0x0034, TryCatch #2 {all -> 0x0034, blocks: (B:4:0x000a, B:6:0x0010, B:8:0x001f, B:11:0x0037, B:13:0x003d, B:14:0x0050, B:16:0x0060, B:18:0x006a, B:159:0x03d6, B:20:0x0072, B:22:0x0082, B:24:0x0094, B:27:0x00b2, B:29:0x00c0, B:32:0x00ca, B:43:0x00f7, B:70:0x01c7, B:72:0x01db, B:74:0x01df, B:77:0x01e7, B:79:0x01eb, B:81:0x01f0, B:83:0x01fa, B:93:0x021d, B:94:0x0234, B:96:0x023a, B:98:0x0243, B:99:0x024a, B:101:0x026a, B:103:0x027d, B:105:0x028f, B:107:0x029f, B:108:0x02b0, B:122:0x02f4, B:125:0x0303, B:128:0x0312, B:131:0x0322, B:133:0x0330, B:135:0x033d, B:138:0x0345, B:142:0x0352, B:144:0x035e, B:146:0x0378, B:147:0x037d, B:149:0x038c, B:151:0x039d, B:157:0x03c1, B:162:0x03e7, B:164:0x03ee, B:166:0x03f5, B:168:0x03fc, B:170:0x0403, B:172:0x040a, B:178:0x041c, B:180:0x0423, B:182:0x042a, B:184:0x0431, B:176:0x0415, B:150:0x0395, B:153:0x03b5, B:155:0x03b9, B:110:0x02b8, B:112:0x02be, B:115:0x02c6, B:117:0x02ca, B:119:0x02de, B:121:0x02e2, B:87:0x0204, B:89:0x0212, B:91:0x0218, B:69:0x01c2, B:39:0x00e9, B:185:0x0437), top: B:207:0x000a, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0234 A[Catch: all -> 0x0034, TryCatch #2 {all -> 0x0034, blocks: (B:4:0x000a, B:6:0x0010, B:8:0x001f, B:11:0x0037, B:13:0x003d, B:14:0x0050, B:16:0x0060, B:18:0x006a, B:159:0x03d6, B:20:0x0072, B:22:0x0082, B:24:0x0094, B:27:0x00b2, B:29:0x00c0, B:32:0x00ca, B:43:0x00f7, B:70:0x01c7, B:72:0x01db, B:74:0x01df, B:77:0x01e7, B:79:0x01eb, B:81:0x01f0, B:83:0x01fa, B:93:0x021d, B:94:0x0234, B:96:0x023a, B:98:0x0243, B:99:0x024a, B:101:0x026a, B:103:0x027d, B:105:0x028f, B:107:0x029f, B:108:0x02b0, B:122:0x02f4, B:125:0x0303, B:128:0x0312, B:131:0x0322, B:133:0x0330, B:135:0x033d, B:138:0x0345, B:142:0x0352, B:144:0x035e, B:146:0x0378, B:147:0x037d, B:149:0x038c, B:151:0x039d, B:157:0x03c1, B:162:0x03e7, B:164:0x03ee, B:166:0x03f5, B:168:0x03fc, B:170:0x0403, B:172:0x040a, B:178:0x041c, B:180:0x0423, B:182:0x042a, B:184:0x0431, B:176:0x0415, B:150:0x0395, B:153:0x03b5, B:155:0x03b9, B:110:0x02b8, B:112:0x02be, B:115:0x02c6, B:117:0x02ca, B:119:0x02de, B:121:0x02e2, B:87:0x0204, B:89:0x0212, B:91:0x0218, B:69:0x01c2, B:39:0x00e9, B:185:0x0437), top: B:207:0x000a, outer: #3 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m5813a(java.lang.String r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1117
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p071uc.crashsdk.C6749e.m5813a(java.lang.String, boolean, boolean):void");
    }

    /* renamed from: a */
    public static boolean m5825a(boolean z9, boolean z10) {
        if (!f6493d) {
            if (C6746b.f6426d) {
                JNIBridge.set(1, true);
            }
            f6493d = true;
        }
        try {
            String strM5875k = m5875k();
            if (C6744g.m5619a(strM5875k)) {
                C6738a.m5563a("crashsdk", "CrashHandler url is empty!");
                return false;
            }
            Object obj = f6502n;
            synchronized (obj) {
                if (C6743f.m5600a(z9 ? 1 : 0, new RunnableC6742e(406, new Object[]{strM5875k, Boolean.valueOf(z10), Boolean.valueOf(z9)})) && z9) {
                    try {
                        obj.wait();
                    } catch (InterruptedException e10) {
                        C6744g.m5614a(e10);
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            C6744g.m5614a(th);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* renamed from: a */
    private static boolean m5821a(String str, RunnableC6742e runnableC6742e) {
        boolean zM5595a;
        FileChannel channel;
        Exception e10;
        synchronized (f6503o) {
            File file = new File(str);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (Exception e11) {
                    C6744g.m5614a(e11);
                }
            }
            ?? r52 = 0;
            fileLockLock = null;
            FileLock fileLockLock = null;
            zM5595a = false;
            try {
                try {
                    try {
                        channel = new RandomAccessFile(file, "rw").getChannel();
                    } catch (Throwable th) {
                        th = th;
                        r52 = file;
                        C6744g.m5612a((Closeable) r52);
                        throw th;
                    }
                } catch (Exception e12) {
                    try {
                        C6744g.m5614a(e12);
                        channel = null;
                    } catch (Exception e13) {
                        channel = null;
                        e10 = e13;
                        C6744g.m5614a(e10);
                        C6744g.m5612a(channel);
                        return zM5595a;
                    }
                }
                if (channel != null) {
                    try {
                        fileLockLock = channel.lock();
                    } catch (Exception e14) {
                        try {
                            C6744g.m5614a(e14);
                        } catch (Exception e15) {
                            e10 = e15;
                            C6744g.m5614a(e10);
                            C6744g.m5612a(channel);
                            return zM5595a;
                        }
                    }
                }
                try {
                    zM5595a = runnableC6742e.m5595a();
                    C6744g.m5612a(channel);
                } finally {
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (Exception e16) {
                            C6744g.m5614a(e16);
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return zM5595a;
    }

    /* renamed from: a */
    private static boolean m5822a(String str, d dVar) {
        String strM5606a = C6744g.m5606a(new File(str), 64, false);
        if (strM5606a == null) {
            return false;
        }
        try {
            Matcher matcher = Pattern.compile("(\\d+)\\s+(\\d+)\\s+(\\d+)\\s+(\\d+)").matcher(strM5606a);
            if (matcher.find()) {
                long j9 = Long.parseLong(matcher.group(1));
                if (System.currentTimeMillis() - j9 < CalendarModelKt.MillisecondsIn24Hours) {
                    dVar.f6522b = Long.parseLong(matcher.group(2));
                    dVar.f6523c = Integer.parseInt(matcher.group(3));
                    dVar.f6524d = Integer.parseInt(matcher.group(4));
                    dVar.f6521a = j9;
                }
            }
        } catch (Throwable th) {
            C6744g.m5614a(th);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    /* renamed from: a */
    public static boolean m5824a(StringBuffer stringBuffer, String str, long j9, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, String str2) {
        long jNativeClientCreateConnection;
        boolean z9;
        long j10;
        boolean zM5820a;
        if (f6492c.get()) {
            C6738a.m5565b("Processing java crash, skip generate custom log: " + str);
            return false;
        }
        boolean z10 = f6490af || C6746b.m5697I();
        if (!z10 && !C6741d.m5592d()) {
            C6738a.m5567c("DEBUG", C6741d.m5590b());
            return false;
        }
        if (!m5847c(str)) {
            C6738a.m5568d("DEBUG", "custom log sample miss: " + str);
            return false;
        }
        if (m5794Z()) {
            C6738a.m5565b("Processing native crash, skip generate custom log: " + str);
            return false;
        }
        if (stringBuffer == null || str == null) {
            return false;
        }
        String strM5800a = C6751g.m5958V() + m5873j(str);
        ?? r12 = (j9 & 32) != 0 ? 1 : 0;
        if (z10) {
            jNativeClientCreateConnection = C6746b.f6426d ? JNIBridge.nativeClientCreateConnection(strM5800a, SchedulerSupport.CUSTOM, str, r12) : 0L;
            if (jNativeClientCreateConnection == 0) {
                C6738a.m5568d("DEBUG", "skip custom log: " + str);
                return false;
            }
        } else {
            if (m5823a(m5868h(), str, (boolean) r12)) {
                return false;
            }
            C6751g.m5965a();
            m5817a(false);
            jNativeClientCreateConnection = 0;
        }
        synchronized (f6504p) {
            z9 = r12;
            j10 = jNativeClientCreateConnection;
            zM5820a = m5820a(strM5800a, j10, stringBuffer, str, j9, arrayList, arrayList2, arrayList3, str2);
        }
        if (zM5820a && !z10) {
            m5838b(m5868h(), str, z9);
        }
        if (j10 != 0) {
            JNIBridge.nativeClientCloseConnection(j10);
        }
        if (!zM5820a) {
            return false;
        }
        if (!z10) {
            m5888q(strM5800a);
        }
        if (!z10) {
            strM5800a = m5800a(m5877l(strM5800a));
        }
        m5837b(strM5800a, str);
        if (z9 && !z10) {
            try {
                m5825a(true, false);
            } catch (Throwable th) {
                C6744g.m5614a(th);
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m5823a(String str, String str2, boolean z9) {
        if (!m5882n(str2)) {
            return false;
        }
        C6745h.m5656a(str, str2, true, z9);
        C6738a.m5565b(String.format(Locale.US, "Custom log '%s' has reach max count!", str2));
        return true;
    }

    /* renamed from: a */
    private static void m5808a(a aVar, String str, long j9) {
        String strNativeDumpThreads;
        String str2 = null;
        if (C6746b.f6426d) {
            try {
                aVar.flush();
            } catch (Throwable th) {
                C6744g.m5614a(th);
            }
            strNativeDumpThreads = JNIBridge.nativeDumpThreads(str, j9);
            if (f6490af || strNativeDumpThreads == null || strNativeDumpThreads.length() >= 512 || !strNativeDumpThreads.startsWith("/") || strNativeDumpThreads.indexOf(10) >= 0) {
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
                aVar.write(AbsSection.SEP_ORIGIN_LINE_BREAK.getBytes("UTF-8"));
            } catch (Throwable th2) {
                C6744g.m5614a(th2);
            }
            m5809a((OutputStream) aVar);
        } else if (str2 != null && !f6490af) {
            m5827b(aVar, str2, 1048576);
            File file = new File(str2);
            if (file.exists()) {
                file.delete();
            }
        }
        try {
            aVar.flush();
        } catch (Throwable th3) {
            C6744g.m5614a(th3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0140 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0045  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m5820a(java.lang.String r17, long r18, java.lang.StringBuffer r20, java.lang.String r21, long r22, java.util.ArrayList<java.lang.String> r24, java.util.ArrayList<java.lang.String> r25, java.util.ArrayList<java.lang.String> r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p071uc.crashsdk.C6749e.m5820a(java.lang.String, long, java.lang.StringBuffer, java.lang.String, long, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static void m5812a(String str, boolean z9) {
        if (z9) {
            f6512x = str;
            return;
        }
        synchronized (f6513y) {
            f6511w = str;
            C6739b.m5571a(C6746b.m5736f(), str + AbsSection.SEP_ORIGIN_LINE_BREAK);
        }
    }

    /* renamed from: a */
    private static String m5803a(Date date) {
        return String.format(Locale.US, "%d%02d%02d%02d%02d%02d", Integer.valueOf(date.getYear() + 1900), Integer.valueOf(date.getMonth() + 1), Integer.valueOf(date.getDate()), Integer.valueOf(date.getHours()), Integer.valueOf(date.getMinutes()), Integer.valueOf(date.getSeconds()));
    }

    /* renamed from: a */
    public static void m5811a(OutputStream outputStream, String str, String str2, int i9, boolean z9, boolean z10) {
        f6496h = false;
        try {
            outputStream.write(String.format(Locale.US, "$^%s`%s`%d`%d,%d^$", str, str2, Integer.valueOf(i9), Integer.valueOf(z9 ? 1 : 0), Integer.valueOf(z10 ? 1 : 0)).getBytes("UTF-8"));
        } catch (Throwable th) {
            C6744g.m5614a(th);
        }
        f6496h = true;
        m5809a(outputStream);
    }

    /* renamed from: a */
    public static void m5810a(OutputStream outputStream, String str, String str2) {
        f6496h = false;
        try {
            outputStream.write(String.format(Locale.US, "$^%s`%s^$", str, str2).getBytes("UTF-8"));
        } catch (Throwable th) {
            C6744g.m5614a(th);
        }
        f6496h = true;
    }

    /* renamed from: a */
    public static void m5806a(Context context) {
        try {
            if (m5789U()) {
                context.registerReceiver(new c((byte) 0), new IntentFilter("android.intent.action.ANR"), null, C6743f.m5596a(3));
            }
        } catch (Throwable th) {
            C6744g.m5614a(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x045a A[Catch: all -> 0x03b1, TryCatch #6 {all -> 0x03b1, blocks: (B:340:0x042a, B:343:0x043c, B:345:0x0442, B:347:0x045a, B:348:0x045d, B:353:0x0486, B:352:0x0483, B:252:0x0335, B:349:0x047e), top: B:495:0x0201, inners: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0536 A[Catch: all -> 0x0549, TRY_LEAVE, TryCatch #14 {all -> 0x0549, blocks: (B:401:0x0520, B:403:0x0536), top: B:520:0x0520 }] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x05c3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x05e7 A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0601 A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0638 A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:508:0x04af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x055a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0203 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:596:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:597:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:598:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:599:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:600:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:601:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:602:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:603:? A[DONT_GENERATE, FINALLY_INSNS, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf A[Catch: all -> 0x051c, TRY_ENTER, TRY_LEAVE, TryCatch #50 {all -> 0x051c, blocks: (B:10:0x001f, B:67:0x00cf, B:110:0x014b, B:113:0x017a, B:116:0x0188, B:120:0x0192, B:117:0x018d), top: B:590:0x001f, inners: #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0112  */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v7, types: [long] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:151:0x0217 -> B:502:0x021f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x021c -> B:502:0x021f). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5899a(java.lang.Thread r21, java.lang.Throwable r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 1600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p071uc.crashsdk.C6749e.m5899a(java.lang.Thread, java.lang.Throwable, boolean):void");
    }

    /* renamed from: a */
    private static void m5814a(Throwable th) {
        try {
            C6738a.m5568d("DEBUG", m5804a(th.getStackTrace(), (String) null).toString());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m5816a(Calendar calendar) {
        if (C6751g.m5953Q()) {
            long timeInMillis = calendar.getTimeInMillis();
            calendar.add(5, 1);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            long timeInMillis2 = calendar.getTimeInMillis();
            long j9 = timeInMillis2 - timeInMillis;
            C6743f.m5601a(0, new RunnableC6742e(415, new Object[]{Long.valueOf(timeInMillis2)}), j9 <= 3600000 ? 1000 + j9 : 3600000L);
        }
    }

    /* renamed from: a */
    public static StringBuilder m5804a(StackTraceElement[] stackTraceElementArr, String str) {
        StringBuilder sb = new StringBuilder();
        int i9 = 0;
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            boolean z9 = str == null;
            int i10 = 0;
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                i10++;
                sb.append("  at ");
                sb.append(stackTraceElement.toString());
                sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                if (!z9 && stackTraceElement.getMethodName().contains(str)) {
                    sb.delete(0, sb.length());
                    i10 = 0;
                    z9 = true;
                }
            }
            i9 = i10;
        }
        if (i9 == 0) {
            sb.append("  (no java stack)\n");
        }
        return sb;
    }

    /* renamed from: a */
    public static boolean m5819a(ParcelFileDescriptor parcelFileDescriptor) {
        if (f6489ae) {
            C6738a.m5568d("crashsdk", "Can not call setHostFd and getHostFd in the same process!");
            return false;
        }
        if (!C6746b.f6426d) {
            C6738a.m5568d("crashsdk", "Crash so is not loaded!");
            return false;
        }
        if (f6488ad != null) {
            C6738a.m5567c("crashsdk", "Has already set host fd!");
        }
        f6488ad = parcelFileDescriptor;
        int fd = parcelFileDescriptor.getFd();
        int iNativeCmd = (int) JNIBridge.nativeCmd(13, fd, null, null);
        f6490af = iNativeCmd != -1;
        return fd == -1 || iNativeCmd != -1;
    }
}
