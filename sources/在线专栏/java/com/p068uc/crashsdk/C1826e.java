package com.p068uc.crashsdk;

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
import anet.channel.entity.EventType;
import anet.channel.util.HttpConstant;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.p068uc.crashsdk.export.LogType;
import com.p068uc.crashsdk.p069a.C1815a;
import com.p068uc.crashsdk.p069a.C1816b;
import com.p068uc.crashsdk.p069a.C1817c;
import com.p068uc.crashsdk.p069a.C1818d;
import com.p068uc.crashsdk.p069a.C1820f;
import com.p068uc.crashsdk.p069a.C1821g;
import com.p068uc.crashsdk.p069a.C1822h;
import com.p068uc.crashsdk.p069a.RunnableC1819e;
import com.taobao.accs.utl.UtilityImpl;
import com.umeng.analytics.pro.C1896c;
import com.xuexiang.xui.widget.picker.widget.utils.LunarCalendarUtils;
import com.xuexiang.xui.widget.popupwindow.bar.Cookie;
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
import org.android.agoo.common.AgooConstants;
import org.android.agoo.message.MessageService;

/* renamed from: com.uc.crashsdk.e */
/* loaded from: classes.dex */
public class C1826e implements Thread.UncaughtExceptionHandler {

    /* renamed from: b */
    private static long f8085b;

    /* renamed from: i */
    private static String f8091i;

    /* renamed from: e */
    private final List<FileInputStream> f8109e = new ArrayList();

    /* renamed from: a */
    static final /* synthetic */ boolean f8078a = true;

    /* renamed from: c */
    private static final AtomicBoolean f8086c = new AtomicBoolean(false);

    /* renamed from: d */
    private static boolean f8087d = false;

    /* renamed from: f */
    private static long f8088f = 0;

    /* renamed from: g */
    private static long f8089g = -1;

    /* renamed from: h */
    private static boolean f8090h = true;

    /* renamed from: j */
    private static String f8092j = "";

    /* renamed from: k */
    private static String f8093k = null;

    /* renamed from: l */
    private static String f8094l = null;

    /* renamed from: m */
    private static String f8095m = null;

    /* renamed from: n */
    private static final Object f8096n = new Object();

    /* renamed from: o */
    private static final Object f8097o = new Object();

    /* renamed from: p */
    private static final Object f8098p = new Object();

    /* renamed from: q */
    private static final Object f8099q = new Object();

    /* renamed from: r */
    private static final ArrayList<String> f8100r = new ArrayList<>();

    /* renamed from: s */
    private static int f8101s = 0;

    /* renamed from: t */
    private static String f8102t = null;

    /* renamed from: u */
    private static boolean f8103u = false;

    /* renamed from: v */
    private static String f8104v = null;

    /* renamed from: w */
    private static String f8105w = null;

    /* renamed from: x */
    private static String f8106x = null;

    /* renamed from: y */
    private static final Object f8107y = new Object();

    /* renamed from: z */
    private static final Object f8108z = new Object();

    /* renamed from: A */
    private static Map<String, Integer> f8052A = null;

    /* renamed from: B */
    private static String f8053B = null;

    /* renamed from: C */
    private static int f8054C = -1;

    /* renamed from: D */
    private static int f8055D = -1;

    /* renamed from: E */
    private static int f8056E = -1;

    /* renamed from: F */
    private static int f8057F = -1;

    /* renamed from: G */
    private static int f8058G = -1;

    /* renamed from: H */
    private static int f8059H = -1;

    /* renamed from: I */
    private static int f8060I = -1;

    /* renamed from: J */
    private static String f8061J = "?";

    /* renamed from: K */
    private static boolean f8062K = false;

    /* renamed from: L */
    private static boolean f8063L = false;

    /* renamed from: M */
    private static int f8064M = 0;

    /* renamed from: N */
    private static int f8065N = 0;

    /* renamed from: O */
    private static boolean f8066O = false;

    /* renamed from: P */
    private static RunnableC1819e f8067P = new RunnableC1819e(405);

    /* renamed from: Q */
    private static c f8068Q = new c(0);

    /* renamed from: R */
    private static boolean f8069R = false;

    /* renamed from: S */
    private static final RunnableC1819e f8070S = new RunnableC1819e(412);

    /* renamed from: T */
    private static Thread.UncaughtExceptionHandler f8071T = null;

    /* renamed from: U */
    private static Throwable f8072U = null;

    /* renamed from: V */
    private static boolean f8073V = false;

    /* renamed from: W */
    private static boolean f8074W = false;

    /* renamed from: X */
    private static Runnable f8075X = null;

    /* renamed from: Y */
    private static final Object f8076Y = new Object();

    /* renamed from: Z */
    private static int f8077Z = 101;

    /* renamed from: aa */
    private static Runnable f8079aa = new RunnableC1819e(407);

    /* renamed from: ab */
    private static final Object f8080ab = new Object();

    /* renamed from: ac */
    private static boolean f8081ac = false;

    /* renamed from: ad */
    private static ParcelFileDescriptor f8082ad = null;

    /* renamed from: ae */
    private static boolean f8083ae = false;

    /* renamed from: af */
    private static boolean f8084af = false;

    /* renamed from: com.uc.crashsdk.e$b */
    private static class b implements Comparator<File> {
        private b() {
        }

        /* synthetic */ b(byte b4) {
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
    private static class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (!"android.intent.action.BATTERY_CHANGED".equals(action)) {
                if ("android.intent.action.BATTERY_LOW".equals(action) || "android.intent.action.BATTERY_OKAY".equals(action)) {
                    boolean unused = C1826e.f8062K = "android.intent.action.BATTERY_LOW".equals(action);
                    C1826e.m6457J();
                    return;
                } else {
                    if ("android.intent.action.ANR".equals(action)) {
                        try {
                            C1826e.m6531d(context);
                            return;
                        } catch (Throwable th) {
                            C1821g.m6293a(th);
                            return;
                        }
                    }
                    return;
                }
            }
            int unused2 = C1826e.f8054C = intent.getIntExtra("level", -1);
            int unused3 = C1826e.f8055D = intent.getIntExtra("scale", -1);
            int unused4 = C1826e.f8056E = intent.getIntExtra("voltage", -1);
            int unused5 = C1826e.f8057F = intent.getIntExtra("health", -1);
            int unused6 = C1826e.f8058G = intent.getIntExtra("plugged", -1);
            int unused7 = C1826e.f8059H = intent.getIntExtra("status", -1);
            int unused8 = C1826e.f8060I = intent.getIntExtra("temperature", -1);
            String unused9 = C1826e.f8061J = intent.getStringExtra("technology");
            if (C1826e.m6456I() >= 2) {
                C1826e.m6457J();
                C1826e.m6458K();
            }
        }

        /* synthetic */ c(byte b4) {
            this();
        }
    }

    public C1826e() {
        try {
            m6459L();
        } catch (Throwable th) {
            C1821g.m6293a(th);
        }
    }

    /* renamed from: A */
    public static void m6448A() {
        if (f8081ac || C1823b.m6376I()) {
            return;
        }
        C1820f.m6280a(1, new RunnableC1819e(408), 1000L);
    }

    /* renamed from: B */
    static void m6449B() {
        C1820f.m6280a(1, new RunnableC1819e(409), 7000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m6450C() {
        /*
            int r0 = com.p068uc.crashsdk.C1828g.m6627L()
            r1 = 4
            r2 = 3
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L13
            if (r0 == r2) goto L13
            if (r0 != r1) goto Lf
            goto L13
        Lf:
            if (r0 != r3) goto L3f
        L11:
            r3 = 0
            goto L3f
        L13:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 25
            if (r5 > r6) goto L3f
            if (r0 != 0) goto L1d
            r5 = 0
            goto L1e
        L1d:
            r5 = 1
        L1e:
            r6 = 0
            if (r0 != r2) goto L30
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 10
            long r8 = r8 % r10
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 != 0) goto L2f
            r5 = 1
            goto L30
        L2f:
            r5 = 0
        L30:
            if (r0 != r1) goto L3e
            long r0 = java.lang.System.currentTimeMillis()
            r8 = 3
            long r0 = r0 % r8
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L11
            goto L3f
        L3e:
            r3 = r5
        L3f:
            if (r3 != 0) goto L48
            java.lang.String r0 = "crashsdk"
            java.lang.String r1 = "SIG 3 is disabled by settings"
            com.p068uc.crashsdk.p069a.C1815a.m6242a(r0, r1)
        L48:
            boolean r0 = com.p068uc.crashsdk.C1823b.m6376I()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r1 == r2) goto L64
            if (r3 == 0) goto L64
            r1 = 2
            com.uc.crashsdk.a.e r2 = new com.uc.crashsdk.a.e
            r3 = 413(0x19d, float:5.79E-43)
            r2.<init>(r3)
            com.p068uc.crashsdk.p069a.C1820f.m6279a(r1, r2)
            goto L65
        L64:
            r4 = r3
        L65:
            r1 = 7
            long r2 = (long) r0
            r0 = 0
            com.p068uc.crashsdk.JNIBridge.nativeCmd(r1, r2, r0, r0)
            if (r4 == 0) goto L72
            r0 = 8
            com.p068uc.crashsdk.JNIBridge.cmd(r0)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p068uc.crashsdk.C1826e.m6450C():void");
    }

    /* renamed from: D */
    public static ParcelFileDescriptor m6451D() {
        if (!C1823b.f8020d) {
            C1815a.m6247d("crashsdk", "Crash so is not loaded!");
            return null;
        }
        ParcelFileDescriptor parcelFileDescriptor = f8082ad;
        if (parcelFileDescriptor != null) {
            return parcelFileDescriptor;
        }
        int iCmd = (int) JNIBridge.cmd(14);
        if (iCmd == -1) {
            return null;
        }
        ParcelFileDescriptor parcelFileDescriptorAdoptFd = ParcelFileDescriptor.adoptFd(iCmd);
        f8082ad = parcelFileDescriptorAdoptFd;
        f8083ae = true;
        return parcelFileDescriptorAdoptFd;
    }

    /* renamed from: E */
    public static boolean m6452E() {
        return f8084af;
    }

    /* renamed from: F */
    public static void m6453F() {
        String strM6637V = C1828g.m6637V();
        File file = new File(strM6637V);
        if (file.exists() && file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                C1815a.m6244b("Ucebu can not list folder: " + strM6637V);
                return;
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isFile() && file2.getName().contains("ucebu")) {
                    m6504a(false, false);
                    return;
                }
            }
        }
    }

    /* renamed from: I */
    static /* synthetic */ int m6456I() {
        int i4 = f8064M + 1;
        f8064M = i4;
        return i4;
    }

    /* renamed from: J */
    static /* synthetic */ void m6457J() {
        StringBuilder sbM6471X;
        if (C1823b.f8020d && (sbM6471X = m6471X()) != null) {
            JNIBridge.set(125, sbM6471X.toString());
        }
        f8063L = true;
        m6472Y();
    }

    /* renamed from: K */
    static /* synthetic */ int m6458K() {
        f8064M = 0;
        return 0;
    }

    /* renamed from: L */
    private void m6459L() {
        int iM6622G = C1828g.m6622G();
        for (int i4 = 0; i4 < iM6622G; i4++) {
            try {
                this.f8109e.add(new FileInputStream("/dev/null"));
            } catch (Exception e4) {
                C1821g.m6293a(e4);
                return;
            }
        }
    }

    /* renamed from: M */
    private void m6460M() {
        Iterator<FileInputStream> it = this.f8109e.iterator();
        while (it.hasNext()) {
            C1821g.m6291a(it.next());
        }
        this.f8109e.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static boolean m6461N() {
        if (C1828g.m6629N()) {
            return true;
        }
        return m6497a();
    }

    /* renamed from: O */
    private static String m6462O() {
        return C1828g.m6654e() + "_";
    }

    /* renamed from: P */
    private static String m6463P() {
        return C1823b.m6434y() ? "fg" : "bg";
    }

    /* renamed from: Q */
    private static byte[] m6464Q() {
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
    private static String m6465R() {
        return (!C1823b.m6370C() || f8087d) ? LogType.JAVA_TYPE : "ucebujava";
    }

    /* renamed from: S */
    private static void m6466S() {
        String strTrim;
        BufferedReader bufferedReader;
        Throwable th;
        FileReader fileReader;
        String strTrim2 = "-";
        try {
            strTrim = Build.HARDWARE;
        } catch (Throwable th2) {
            C1821g.m6293a(th2);
            strTrim = "-";
        }
        try {
            fileReader = new FileReader(new File("/proc/cpuinfo"));
            try {
                bufferedReader = new BufferedReader(fileReader, EventType.AUTH_SUCC);
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
                            C1821g.m6293a(th);
                            C1821g.m6291a(fileReader);
                            C1821g.m6291a(bufferedReader);
                            f8093k = strTrim;
                            f8094l = strTrim2;
                        } catch (Throwable th4) {
                            C1821g.m6291a(fileReader);
                            C1821g.m6291a(bufferedReader);
                            throw th4;
                        }
                    }
                } while (i4 < 2);
                C1821g.m6291a(fileReader);
            } catch (Throwable th5) {
                bufferedReader = null;
                th = th5;
            }
        } catch (Throwable th6) {
            bufferedReader = null;
            th = th6;
            fileReader = null;
        }
        C1821g.m6291a(bufferedReader);
        f8093k = strTrim;
        f8094l = strTrim2;
    }

    /* renamed from: T */
    private static String m6467T() {
        return C1828g.m6636U() + "bytes";
    }

    /* renamed from: U */
    private static boolean m6468U() {
        return Build.VERSION.SDK_INT < 29;
    }

    /* renamed from: V */
    private static void m6469V() {
        if (f8066O || C1823b.m6370C() || C1823b.m6376I()) {
            return;
        }
        JNIBridge.cmd(18);
    }

    /* renamed from: W */
    private static void m6470W() {
        C1820f.m6280a(3, new RunnableC1819e(414), 1000L);
    }

    /* renamed from: X */
    private static StringBuilder m6471X() {
        String str;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("level: ");
            sb.append(f8054C);
            sb.append("\n");
            sb.append("scale: ");
            sb.append(f8055D);
            sb.append("\n");
            switch (f8057F) {
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
            sb.append(f8057F);
            sb.append(str);
            sb.append("\n");
            int i4 = f8058G;
            String str2 = i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 4 ? " (?)" : " (Wireless)" : " (USB port)" : " (AC charger)" : " (None)";
            sb.append("pluged: ");
            sb.append(f8058G);
            sb.append(str2);
            sb.append("\n");
            int i5 = f8059H;
            String str3 = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? " (?)" : " (Full)" : " (Not charging)" : " (Discharging)" : " (Charging)" : " (Unknown)";
            sb.append("status: ");
            sb.append(f8059H);
            sb.append(str3);
            sb.append("\n");
            sb.append("voltage: ");
            sb.append(f8056E);
            sb.append("\n");
            sb.append("temperature: ");
            sb.append(f8060I);
            sb.append("\n");
            sb.append("technology: ");
            sb.append(f8061J);
            sb.append("\n");
            sb.append("battery low: ");
            sb.append(f8062K);
            sb.append("\n");
            return sb;
        } catch (Throwable th) {
            C1821g.m6293a(th);
            return null;
        }
    }

    /* renamed from: Y */
    private static void m6472Y() {
        if (C1823b.f8019c && f8063L && C1814a.f7903c) {
            f8063L = false;
            if (C1820f.m6282b(f8067P)) {
                return;
            }
            C1820f.m6280a(0, f8067P, Cookie.DEFAULT_COOKIE_DURATION);
        }
    }

    /* renamed from: Z */
    private static boolean m6473Z() {
        return C1823b.f8020d && JNIBridge.nativeIsCrashing();
    }

    /* renamed from: a */
    public static boolean m6497a() {
        if (f8088f == 0) {
            f8088f = 2L;
            if (m6544g(C1823b.m6396a("logs")) == 1) {
                f8088f = 1L;
            }
        }
        return f8088f == 1;
    }

    /* renamed from: aa */
    private static void m6505aa() {
        String strM6638W = C1828g.m6638W();
        File file = new File(strM6638W);
        if (file.isDirectory()) {
            try {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length > 150) {
                    Arrays.sort(fileArrListFiles, new b((byte) 0));
                    int length = fileArrListFiles.length - 150;
                    int i4 = length < 0 ? 0 : length;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i5 = 0;
                    int i6 = 0;
                    int i7 = 0;
                    while (i5 < fileArrListFiles.length) {
                        File file2 = fileArrListFiles[i5];
                        boolean z3 = i5 < i4;
                        if (!z3 && jCurrentTimeMillis - file2.lastModified() >= 432000000) {
                            z3 = true;
                        }
                        if (!z3) {
                            break;
                        }
                        try {
                            file2.delete();
                            i6++;
                            i7 = 0;
                        } catch (Throwable th) {
                            i7++;
                            C1821g.m6293a(th);
                        }
                        if (i7 >= 3) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    C1815a.m6241a("Removed " + i6 + " logs in " + strM6638W);
                }
            } catch (Throwable th2) {
                C1821g.m6293a(th2);
            }
        }
    }

    /* renamed from: b */
    static long m6508b() {
        if (f8089g == -1) {
            f8089g = m6544g(C1823b.m6396a(AgooConstants.MESSAGE_LOCAL));
        }
        return f8089g;
    }

    /* renamed from: d */
    public static String m6529d(boolean z3) {
        return z3 ? "https://errlogos.umeng.com/upload" : "https://errlog.umeng.com/upload";
    }

    /* renamed from: j */
    private static String m6552j(String str) {
        return String.format(Locale.US, "%s%s_%s_%s.log", m6528d(), m6558m(), m6463P(), str);
    }

    /* renamed from: k */
    private static String m6555k(String str) {
        if (!C1821g.m6303b(str)) {
            return "";
        }
        int iIndexOf = str.indexOf(0);
        if (iIndexOf >= 0) {
            str = str.substring(0, iIndexOf);
        }
        return str.trim();
    }

    /* renamed from: l */
    private static String m6556l(String str) {
        String strM6249a = C1816b.m6249a(str, C1828g.m6672w(), C1828g.m6671v());
        if (!str.equals(strM6249a)) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
        return strM6249a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean[] m6559m(java.lang.String r7) {
        /*
            boolean r0 = com.p068uc.crashsdk.C1828g.m6671v()
            boolean r1 = com.p068uc.crashsdk.C1828g.m6673x()
            r2 = 0
            if (r0 != 0) goto Ld
            if (r1 == 0) goto L6d
        Ld:
            java.lang.String r3 = ".tmp"
            boolean r3 = r7.endsWith(r3)
            if (r3 != 0) goto L6b
            java.lang.String r3 = ".ec"
            boolean r3 = r7.contains(r3)
            if (r3 == 0) goto L1e
            goto L6b
        L1e:
            char r3 = java.io.File.separatorChar
            int r3 = r7.lastIndexOf(r3)
            if (r3 >= 0) goto L27
            r3 = 0
        L27:
            r4 = 0
        L28:
            r5 = 95
            int r3 = r7.indexOf(r5, r3)
            if (r3 < 0) goto L34
            int r4 = r4 + 1
            int r3 = r3 + 1
        L34:
            if (r3 >= 0) goto L28
            r3 = 8
            if (r4 == r3) goto L3b
            goto L6b
        L3b:
            java.lang.String r3 = com.p068uc.crashsdk.C1828g.m6672w()
            java.lang.String r4 = ".log"
            boolean r6 = r7.endsWith(r4)
            if (r6 != 0) goto L54
            boolean r0 = com.p068uc.crashsdk.p069a.C1821g.m6298a(r3)
            if (r0 != 0) goto L6b
            boolean r7 = r7.endsWith(r3)
            if (r7 != 0) goto L5a
            goto L6b
        L54:
            boolean r3 = com.p068uc.crashsdk.p069a.C1821g.m6298a(r3)
            if (r3 == 0) goto L5c
        L5a:
            r0 = 0
            goto L6d
        L5c:
            int r3 = r7.lastIndexOf(r5)
            int r3 = r7.indexOf(r4, r3)
            int r7 = r7.lastIndexOf(r4)
            if (r3 == r7) goto L6d
            goto L5a
        L6b:
            r0 = 0
            r1 = 0
        L6d:
            r7 = 2
            boolean[] r7 = new boolean[r7]
            r7[r2] = r0
            r0 = 1
            r7[r0] = r1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p068uc.crashsdk.C1826e.m6559m(java.lang.String):boolean[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m6561n(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p068uc.crashsdk.C1826e.m6561n(java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae A[Catch: all -> 0x0106, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:7:0x0018, B:9:0x0023, B:10:0x002d, B:38:0x00ae, B:49:0x00d3, B:56:0x00ee, B:52:0x00de, B:63:0x00fa, B:66:0x0104, B:11:0x0033, B:13:0x003b, B:14:0x0044, B:16:0x004c, B:18:0x0054, B:20:0x005c, B:26:0x006a, B:28:0x0074, B:30:0x0081, B:32:0x008b, B:33:0x0096, B:35:0x00a0), top: B:71:0x0003 }] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m6563o(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p068uc.crashsdk.C1826e.m6563o(java.lang.String):boolean");
    }

    /* renamed from: p */
    private static Map<String, Integer> m6565p(String str) {
        HashMap map = new HashMap();
        for (String str2 : str.split("\\|", 30)) {
            String[] strArrSplit = str2.split(":", 3);
            if (strArrSplit.length == 2) {
                String strTrim = strArrSplit[0].trim();
                if (!C1821g.m6298a(strTrim)) {
                    int i4 = 1;
                    try {
                        i4 = Integer.parseInt(strArrSplit[1].trim(), 10);
                    } catch (Throwable th) {
                        C1821g.m6293a(th);
                    }
                    map.put(strTrim, Integer.valueOf(i4));
                }
            }
        }
        return map;
    }

    /* renamed from: q */
    private static void m6567q(String str) {
        if (C1828g.m6666q()) {
            try {
                m6505aa();
            } catch (Throwable th) {
                C1821g.m6293a(th);
            }
            if (str == null || "".equals(str)) {
                return;
            }
            try {
                File file = new File(C1828g.m6638W());
                if (!file.exists()) {
                    file.mkdirs();
                }
                C1815a.m6242a("crashsdk", "copy log to: " + file);
                C1821g.m6292a(new File(str), file);
            } catch (Throwable th2) {
                C1821g.m6293a(th2);
            }
        }
    }

    /* renamed from: r */
    private static String m6568r(String str) {
        return String.format("$^%s^$", str);
    }

    /* renamed from: s */
    public static void m6570s() {
        Thread.setDefaultUncaughtExceptionHandler(f8071T);
    }

    /* renamed from: t */
    static boolean m6571t() {
        return f8086c.get() || m6473Z();
    }

    /* renamed from: u */
    public static Throwable m6572u() {
        return f8072U;
    }

    /* renamed from: v */
    public static int m6573v() {
        if (C1823b.m6373F() == 5) {
            return f8077Z;
        }
        return 100;
    }

    /* renamed from: w */
    public static void m6574w() {
        long jM6664o = C1828g.m6664o();
        if (jM6664o < 0) {
            return;
        }
        boolean z3 = C1823b.m6373F() == 5;
        C1820f.m6279a(0, new RunnableC1819e(401));
        if (z3) {
            RunnableC1819e runnableC1819e = new RunnableC1819e(402);
            f8075X = runnableC1819e;
            C1820f.m6280a(0, runnableC1819e, jM6664o);
        }
    }

    /* renamed from: x */
    static void m6575x() {
        if (C1823b.f8019c && C1814a.f7903c && !C1820f.m6282b(f8079aa)) {
            C1820f.m6280a(0, f8079aa, 1000L);
        }
    }

    /* renamed from: y */
    public static boolean m6576y() {
        synchronized (f8076Y) {
            Runnable runnable = f8075X;
            if (runnable == null || f8074W) {
                return false;
            }
            C1820f.m6278a(runnable);
            f8075X = null;
            return true;
        }
    }

    /* renamed from: z */
    public static void m6577z() {
        if (C1828g.m6666q()) {
            C1820f.m6280a(0, new RunnableC1819e(403), 10000L);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        m6578a(thread, th, false);
    }

    /* renamed from: d */
    static String m6528d() {
        String str = f8091i;
        if (str != null) {
            return str;
        }
        String strM6550i = m6550i((String) null);
        f8091i = strM6550i;
        return strM6550i;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7 A[Catch: all -> 0x00cb, TRY_LEAVE, TryCatch #5 {all -> 0x00cb, blocks: (B:35:0x0092, B:37:0x00a7), top: B:73:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8 A[Catch: all -> 0x013b, TryCatch #4 {all -> 0x013b, blocks: (B:47:0x00d2, B:49:0x00d8, B:51:0x00e0, B:52:0x0106, B:54:0x010c, B:56:0x0114), top: B:71:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c A[Catch: all -> 0x013b, TryCatch #4 {all -> 0x013b, blocks: (B:47:0x00d2, B:49:0x00d8, B:51:0x00e0, B:52:0x0106, B:54:0x010c, B:56:0x0114), top: B:71:0x00d2 }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m6535e() {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p068uc.crashsdk.C1826e.m6535e():java.lang.String");
    }

    /* renamed from: g */
    private static long m6544g(String str) {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("getLong", String.class, Long.TYPE);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                return ((Long) declaredMethod.invoke(null, str, 0L)).longValue();
            }
        } catch (Throwable th) {
            C1821g.m6293a(th);
        }
        return 0L;
    }

    /* renamed from: h */
    private static String m6548h(String str) {
        try {
            return str.replaceAll("[^0-9a-zA-Z-.]", "-");
        } catch (Throwable unused) {
            return UtilityImpl.NET_TYPE_UNKNOWN;
        }
    }

    /* renamed from: i */
    private static String m6550i(String str) {
        if (str == null) {
            str = String.valueOf(System.currentTimeMillis()) + new Random().nextInt(ArrayPool.STANDARD_BUFFER_SIZE_BYTES);
        }
        return String.format(Locale.US, "%s%s_%s_%s_%s_%s_", m6462O(), C1828g.m6633R(), C1828g.m6635T(), m6548h(Build.MODEL), m6548h(Build.VERSION.RELEASE), str);
    }

    /* renamed from: r */
    public static void m6569r() {
        f8071T = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new C1826e());
    }

    /* renamed from: c */
    static void m6522c() {
        f8091i = null;
    }

    /* renamed from: h */
    public static String m6547h() {
        String str = f8095m;
        if (str != null) {
            return str;
        }
        String strM6477a = m6477a(Process.myPid());
        f8095m = strM6477a;
        return strM6477a;
    }

    /* renamed from: b */
    public static boolean m6519b(int i4, Object[] objArr) {
        if (i4 == 451) {
            if (f8078a || objArr != null) {
                return m6501a((String) objArr[0], (d) objArr[1]);
            }
            throw new AssertionError();
        }
        if (i4 != 452) {
            if (f8078a) {
                return false;
            }
            throw new AssertionError();
        }
        if (!f8078a && objArr == null) {
            throw new AssertionError();
        }
        String str = (String) objArr[0];
        d dVar = (d) objArr[1];
        return C1821g.m6297a(new File(str), String.format(Locale.US, "%d %d %d %d", Long.valueOf(dVar.f8115a), Long.valueOf(dVar.f8116b), Integer.valueOf(dVar.f8117c), Integer.valueOf(dVar.f8118d)).getBytes());
    }

    /* renamed from: c */
    private static void m6523c(OutputStream outputStream) {
        if (C1823b.f8020d) {
            String strM6421l = C1823b.m6421l();
            f8090h = false;
            if (1 == JNIBridge.cmd(17, strM6421l)) {
                File file = new File(strM6421l);
                try {
                    byte[] bArrM6311e = C1821g.m6311e(file);
                    if (bArrM6311e != null) {
                        outputStream.write(bArrM6311e);
                    }
                } catch (Throwable th) {
                    m6494a(th, outputStream);
                }
                try {
                    file.delete();
                } catch (Throwable th2) {
                    m6494a(th2, outputStream);
                }
                f8090h = true;
                m6488a(outputStream);
            }
            f8090h = true;
            return;
        }
        File[] fileArrListFiles = null;
        int iM6623H = 900;
        try {
            iM6623H = C1828g.m6623H();
            fileArrListFiles = new File("/proc/self/fd").listFiles();
            if (fileArrListFiles != null) {
                outputStream.write(String.format(Locale.US, "opened file count: %d, write limit: %d.\n", Integer.valueOf(fileArrListFiles.length), Integer.valueOf(iM6623H)).getBytes("UTF-8"));
            } else {
                outputStream.write("[DEBUG] listFiles failed!\n".getBytes("UTF-8"));
            }
        } catch (Throwable th3) {
            m6494a(th3, outputStream);
        }
        if (fileArrListFiles != null) {
            try {
                if (fileArrListFiles.length >= iM6623H) {
                    outputStream.write("opened files:\n".getBytes("UTF-8"));
                    StringBuilder sb = new StringBuilder();
                    try {
                        for (File file2 : fileArrListFiles) {
                            sb.append(file2.getName());
                            sb.append(" -> ");
                            sb.append(file2.getCanonicalPath());
                            sb.append("\n");
                        }
                    } catch (Throwable th4) {
                        m6494a(th4, outputStream);
                    }
                    outputStream.write(sb.toString().getBytes("UTF-8"));
                }
            } catch (Throwable th5) {
                m6494a(th5, outputStream);
            }
        }
        m6488a(outputStream);
    }

    /* renamed from: f */
    public static String m6539f() {
        if (C1821g.m6298a(f8093k)) {
            m6466S();
        }
        return f8093k;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m6530d(java.io.OutputStream r12) {
        /*
            java.lang.String r0 = "UTF-8"
            r1 = 0
            r2 = 0
            int r3 = com.p068uc.crashsdk.C1828g.m6624I()     // Catch: java.lang.Throwable -> L1c
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = "/proc/self/task"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L1a
            java.io.File[] r2 = r4.listFiles()     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L16
            return
        L16:
            int r4 = r2.length     // Catch: java.lang.Throwable -> L1a
            if (r4 >= r3) goto L23
            return
        L1a:
            r4 = move-exception
            goto L1f
        L1c:
            r4 = move-exception
            r3 = 300(0x12c, float:4.2E-43)
        L1f:
            com.p068uc.crashsdk.p069a.C1821g.m6293a(r4)
            r4 = 0
        L23:
            if (r2 != 0) goto L26
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
            r8[r1] = r4     // Catch: java.lang.Throwable -> L8e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L8e
            r4 = 1
            r8[r4] = r3     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = java.lang.String.format(r5, r6, r8)     // Catch: java.lang.Throwable -> L8e
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L8e
            r12.write(r3)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = " tid     name\n"
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L8e
            r12.write(r3)     // Catch: java.lang.Throwable -> L8e
            int r3 = r2.length     // Catch: java.lang.Throwable -> L8e
            r5 = 0
        L59:
            if (r5 >= r3) goto L92
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L8e
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L8e
            java.lang.String r9 = r6.getPath()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r10 = "comm"
            r8.<init>(r9, r10)     // Catch: java.lang.Throwable -> L8e
            r9 = 128(0x80, float:1.8E-43)
            java.lang.String r8 = com.p068uc.crashsdk.p069a.C1821g.m6285a(r8, r9, r1)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r8 = m6555k(r8)     // Catch: java.lang.Throwable -> L8e
            java.util.Locale r9 = java.util.Locale.US     // Catch: java.lang.Throwable -> L8e
            java.lang.String r10 = "%5s %s\n"
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L8e
            r11[r1] = r6     // Catch: java.lang.Throwable -> L8e
            r11[r4] = r8     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = java.lang.String.format(r9, r10, r11)     // Catch: java.lang.Throwable -> L8e
            byte[] r6 = r6.getBytes(r0)     // Catch: java.lang.Throwable -> L8e
            r12.write(r6)     // Catch: java.lang.Throwable -> L8e
            int r5 = r5 + 1
            goto L59
        L8e:
            r0 = move-exception
            m6494a(r0, r12)
        L92:
            m6488a(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p068uc.crashsdk.C1826e.m6530d(java.io.OutputStream):void");
    }

    /* renamed from: j */
    public static void m6553j() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitNetwork().build());
        } catch (Throwable th) {
            C1821g.m6293a(th);
        }
    }

    /* renamed from: k */
    public static String m6554k() {
        if (C1821g.m6298a(f8105w)) {
            synchronized (f8107y) {
                f8105w = C1821g.m6286a(C1823b.m6415f(), f8106x, true);
            }
        }
        return f8105w;
    }

    /* renamed from: a */
    public static void m6484a(int i4, Object[] objArr) {
        int i5;
        switch (i4) {
            case 401:
                JNIBridge.nativeCmd(10, C1823b.m6373F() == 5 ? 1L : 0L, null, null);
                C1814a.f7903c = true;
                C1814a.m6220a(false);
                f8063L = true;
                m6472Y();
                m6575x();
                return;
            case 402:
                Object obj = f8076Y;
                synchronized (obj) {
                    if (f8075X == null) {
                        return;
                    }
                    f8074W = true;
                    if (C1823b.m6423n()) {
                        return;
                    }
                    if (!C1818d.m6271d()) {
                        C1815a.m6246c("DEBUG", C1818d.m6269b());
                        return;
                    }
                    if (!m6526c(LogType.UNEXP_TYPE)) {
                        C1815a.m6247d("DEBUG", "unexp sample miss");
                        return;
                    }
                    int iNativeGenerateUnexpLog = JNIBridge.nativeGenerateUnexpLog(C1828g.m6664o(), C1828g.m6665p());
                    if (iNativeGenerateUnexpLog != 0) {
                        C1827f.m6595a(11);
                        if ((iNativeGenerateUnexpLog & 4352) != 0) {
                            f8077Z = 105;
                            i5 = 30;
                        } else if ((iNativeGenerateUnexpLog & LogType.UNEXP_EXIT) != 0) {
                            f8077Z = 104;
                            i5 = 31;
                        } else if ((iNativeGenerateUnexpLog & LogType.UNEXP_RESTART) != 0) {
                            f8077Z = 106;
                            i5 = 32;
                        } else {
                            if ((iNativeGenerateUnexpLog & LogType.UNEXP_ANR) != 0) {
                                f8077Z = 103;
                                C1827f.m6595a(10);
                            } else if ((iNativeGenerateUnexpLog & LogType.UNEXP_LOW_MEMORY) != 0) {
                                f8077Z = 107;
                                C1827f.m6595a(29);
                            } else {
                                f8077Z = 102;
                            }
                            m6496a(true);
                        }
                        C1827f.m6595a(i5);
                        m6496a(true);
                    }
                    synchronized (obj) {
                        f8075X = null;
                    }
                    return;
                }
            case 403:
                m6505aa();
                return;
            case 404:
            default:
                if (!f8078a) {
                    throw new AssertionError();
                }
                return;
            case 405:
                f8063L = false;
                StringBuilder sbM6471X = m6471X();
                String strM6412d = C1823b.m6412d();
                if (sbM6471X != null) {
                    C1821g.m6296a(new File(strM6412d), sbM6471X.toString());
                    return;
                }
                return;
            case 406:
                if (!f8078a && objArr == null) {
                    throw new AssertionError();
                }
                m6492a((String) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Boolean) objArr[2]).booleanValue());
                return;
            case 407:
                try {
                    C1814a.m6228d();
                    return;
                } catch (Throwable th) {
                    C1821g.m6293a(th);
                    return;
                }
            case 408:
                synchronized (f8080ab) {
                    if (!f8081ac && C1828g.m6630O() && C1823b.m6432w()) {
                        C1823b.m6425p();
                        C1822h.m6350f();
                        C1827f.m6609c();
                        if (C1823b.m6370C()) {
                            m6449B();
                        }
                        if (C1828g.m6630O()) {
                            m6495a(Calendar.getInstance());
                        }
                        f8081ac = true;
                        return;
                    }
                    return;
                }
            case 409:
                m6507b(false, false);
                return;
            case 410:
                m6504a(false, true);
                return;
            case 411:
                if (C1823b.f8020d) {
                    JNIBridge.set(28, m6526c(LogType.NATIVE_TYPE));
                    JNIBridge.set(29, m6526c(LogType.ANR_TYPE));
                    return;
                }
                return;
            case 412:
                if (!f8069R && C1823b.m6434y() && C1828g.m6626K()) {
                    m6511b(C1821g.m6284a());
                    return;
                }
                if (f8069R) {
                    if (C1823b.m6434y() && C1828g.m6626K()) {
                        return;
                    }
                    try {
                        C1821g.m6284a().unregisterReceiver(f8068Q);
                        f8069R = false;
                        return;
                    } catch (Throwable th2) {
                        C1821g.m6293a(th2);
                        return;
                    }
                }
                return;
            case 413:
                JNIBridge.cmd(8);
                return;
            case 414:
                try {
                    if (m6531d(C1821g.m6284a())) {
                        return;
                    }
                    int i6 = f8065N + 1;
                    f8065N = i6;
                    if (i6 < 10) {
                        m6470W();
                        return;
                    } else {
                        if (C1823b.f8020d) {
                            JNIBridge.set(130, "(get failed)");
                            return;
                        }
                        return;
                    }
                } catch (Throwable th3) {
                    C1821g.m6293a(th3);
                    return;
                }
            case 415:
                if (!f8078a && objArr == null) {
                    throw new AssertionError();
                }
                long jLongValue = ((Long) objArr[0]).longValue();
                Calendar calendar = Calendar.getInstance();
                if (calendar.getTimeInMillis() >= jLongValue) {
                    C1822h.m6351g();
                    C1827f.m6595a(100);
                    m6507b(true, true);
                    C1822h.m6337b();
                } else {
                    C1822h.m6352h();
                    C1822h.m6353i();
                    C1822h.m6346c();
                }
                m6495a(calendar);
                break;
            case HttpConstant.SC_REQUESTED_RANGE_NOT_SATISFIABLE /* 416 */:
                break;
        }
        m6469V();
    }

    /* renamed from: com.uc.crashsdk.e$a */
    private static class a extends OutputStream {

        /* renamed from: a */
        private final long f8110a;

        /* renamed from: b */
        private final OutputStream f8111b;

        /* renamed from: c */
        private int f8112c = 0;

        /* renamed from: d */
        private int f8113d = 0;

        /* renamed from: e */
        private boolean f8114e = false;

        a(long j4, OutputStream outputStream) {
            this.f8110a = j4;
            this.f8111b = outputStream;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private int m6579a(byte[] r7, int r8, int r9) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.f8113d
                int r0 = r0 + r9
                r6.f8113d = r0
                boolean r0 = r6.f8114e
                if (r0 == 0) goto Lb
                r7 = 0
                return r7
            Lb:
                int r0 = com.p068uc.crashsdk.C1828g.m6674y()
                if (r0 <= 0) goto L19
                int r1 = r6.f8112c
                int r2 = r1 + r9
                if (r2 <= r0) goto L19
                int r0 = r0 - r1
                goto L1a
            L19:
                r0 = r9
            L1a:
                int r1 = r6.f8112c
                int r1 = r1 + r0
                r6.f8112c = r1
                long r1 = r6.f8110a
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L30
                java.lang.String r1 = new java.lang.String
                r1.<init>(r7, r8, r0)
                r6.m6580b(r1)
                goto L35
            L30:
                java.io.OutputStream r1 = r6.f8111b
                r1.write(r7, r8, r0)
            L35:
                if (r0 >= r9) goto L3a
                r7 = 1
                r6.f8114e = r7
            L3a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p068uc.crashsdk.C1826e.a.m6579a(byte[], int, int):int");
        }

        /* renamed from: b */
        private void m6580b(String str) {
            if (C1823b.f8020d) {
                JNIBridge.nativeClientWriteData(this.f8110a, str);
            }
        }

        @Override // java.io.OutputStream
        public final void write(int i4) throws IOException {
            if (C1826e.f8090h && C1826e.m6461N()) {
                C1815a.m6247d("DEBUG", String.format(Locale.US, "%c", Integer.valueOf(i4)));
            }
            if (this.f8110a != 0) {
                m6580b(String.format(Locale.US, "%c", Integer.valueOf(i4)));
            } else {
                this.f8111b.write(i4);
            }
            this.f8112c++;
            this.f8113d++;
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i4, int i5) throws IOException {
            if (C1826e.f8090h && C1826e.m6461N()) {
                byte[] bArr2 = new byte[i5];
                System.arraycopy(bArr, i4, bArr2, 0, i5);
                if (i5 != 1 || bArr2[0] != 10) {
                    try {
                        C1815a.m6247d("DEBUG", new String(bArr2));
                    } catch (Throwable unused) {
                    }
                }
            }
            m6579a(bArr, i4, i5);
        }

        /* renamed from: a */
        final void m6581a() {
            try {
                if (this.f8113d - this.f8112c > 0) {
                    m6582a("\n");
                    m6582a("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
                }
                m6582a(String.format(Locale.US, "Full: %d bytes, write: %d bytes, limit: %d bytes, reject: %d bytes.\n", Integer.valueOf(this.f8113d), Integer.valueOf(this.f8112c), Integer.valueOf(C1828g.m6674y()), Integer.valueOf(this.f8113d - this.f8112c)));
            } catch (Throwable th) {
                C1821g.m6293a(th);
            }
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            if (C1826e.f8090h && C1826e.m6461N() && (bArr.length != 1 || bArr[0] != 10)) {
                try {
                    C1815a.m6247d("DEBUG", new String(bArr));
                } catch (Throwable unused) {
                }
            }
            m6579a(bArr, 0, bArr.length);
        }

        /* renamed from: a */
        final void m6582a(String str) throws IOException {
            if (C1826e.f8090h && C1826e.m6461N()) {
                C1815a.m6247d("DEBUG", str);
            }
            if (this.f8110a != 0) {
                m6580b(str);
            } else {
                this.f8111b.write(str.getBytes("UTF-8"));
            }
        }
    }

    /* renamed from: f */
    private static void m6541f(OutputStream outputStream) {
        String strM6237m;
        try {
            outputStream.write("recent status:\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            m6494a(th, outputStream);
        }
        try {
            if (f8084af) {
                strM6237m = m6568r("LASTVER");
            } else {
                strM6237m = C1814a.m6237m();
            }
            outputStream.write(String.format(Locale.US, "last version: '%s'\n", strM6237m).getBytes("UTF-8"));
        } catch (Throwable th2) {
            m6494a(th2, outputStream);
        }
        try {
            ArrayList<String> arrayList = f8100r;
            synchronized (arrayList) {
                if (f8102t != null) {
                    outputStream.write(String.format(Locale.US, "generating log: %s\n", f8102t).getBytes("UTF-8"));
                }
                if (f8101s > 0 || arrayList.size() > 0) {
                    outputStream.write(String.format(Locale.US, "generated %d logs, recent are:\n", Integer.valueOf(f8101s)).getBytes("UTF-8"));
                    Iterator<String> it = arrayList.iterator();
                    while (it.hasNext()) {
                        outputStream.write(String.format(Locale.US, "* %s\n", it.next()).getBytes("UTF-8"));
                    }
                }
            }
            Locale locale = Locale.US;
            outputStream.write(String.format(locale, "dumping all threads: %s\n", Boolean.valueOf(f8103u)).getBytes("UTF-8"));
            String str = f8104v;
            if (str != null) {
                outputStream.write(String.format(locale, "dumping threads: %s\n", str).getBytes("UTF-8"));
            }
        } catch (Throwable th3) {
            m6494a(th3, outputStream);
        }
        m6488a(outputStream);
    }

    /* renamed from: g */
    static String m6545g() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("JavaMax:    ");
            sb.append(Runtime.getRuntime().maxMemory() / 1024);
            sb.append(" kB\n");
            sb.append("JavaTotal:  ");
            sb.append(Runtime.getRuntime().totalMemory() / 1024);
            sb.append(" kB\n");
            sb.append("JavaFree:   ");
            sb.append(Runtime.getRuntime().freeMemory() / 1024);
            sb.append(" kB\n");
            sb.append("NativeHeap: ");
            sb.append(Debug.getNativeHeapSize() / 1024);
            sb.append(" kB\n");
            sb.append("NativeAllocated: ");
            sb.append(Debug.getNativeHeapAllocatedSize() / 1024);
            sb.append(" kB\n");
            sb.append("NativeFree: ");
            sb.append(Debug.getNativeHeapFreeSize() / 1024);
            sb.append(" kB\n");
            try {
                ActivityManager activityManager = (ActivityManager) C1821g.m6284a().getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME);
                if (activityManager != null) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    sb.append("availMem:   ");
                    sb.append(memoryInfo.availMem / 1024);
                    sb.append(" kB\n");
                    sb.append("threshold:  ");
                    sb.append(memoryInfo.threshold / 1024);
                    sb.append(" kB\n");
                    sb.append("lowMemory:  ");
                    sb.append(memoryInfo.lowMemory);
                    sb.append("\n");
                }
            } catch (Throwable th) {
                C1821g.m6293a(th);
            }
            return sb.toString();
        } catch (Throwable th2) {
            C1821g.m6293a(th2);
            return "";
        }
    }

    /* renamed from: com.uc.crashsdk.e$d */
    private static class d {

        /* renamed from: a */
        long f8115a;

        /* renamed from: b */
        long f8116b;

        /* renamed from: c */
        int f8117c;

        /* renamed from: d */
        int f8118d;

        /* renamed from: e */
        boolean f8119e;

        /* renamed from: f */
        boolean f8120f;

        /* renamed from: g */
        boolean f8121g;

        private d() {
            this.f8115a = 0L;
            this.f8116b = 0L;
            this.f8117c = 0;
            this.f8118d = 0;
            this.f8119e = false;
            this.f8120f = false;
            this.f8121g = false;
        }

        /* synthetic */ d(byte b4) {
            this();
        }
    }

    /* renamed from: l */
    public static void m6557l() {
        if (f8084af) {
            return;
        }
        C1820f.m6280a(1, new RunnableC1819e(411), 1000L);
    }

    /* renamed from: i */
    static boolean m6551i() {
        return f8087d;
    }

    /* renamed from: o */
    public static void m6562o() {
        String strM6285a;
        Throwable th;
        File file;
        if (C1821g.m6298a(f8053B)) {
            String string = null;
            try {
                file = new File(C1828g.m6636U() + "unique");
            } catch (Throwable th2) {
                strM6285a = string;
                th = th2;
            }
            if (file.exists()) {
                strM6285a = C1821g.m6285a(file, 48, false);
                try {
                    if (strM6285a != null) {
                        try {
                            if (strM6285a.length() == 36) {
                                string = strM6285a.replaceAll("[^0-9a-zA-Z-]", "-");
                            }
                        } catch (Exception e4) {
                            C1821g.m6293a(e4);
                        }
                    } else {
                        string = strM6285a;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    C1821g.m6293a(th);
                    string = strM6285a;
                    f8053B = string;
                }
                f8053B = string;
            }
            if (C1821g.m6298a(string)) {
                C1823b.m6371D();
                string = UUID.randomUUID().toString();
                if (!C1821g.m6298a(string)) {
                    C1821g.m6297a(file, string.getBytes());
                }
            }
            f8053B = string;
        }
    }

    /* renamed from: p */
    public static String m6564p() {
        return f8053B;
    }

    /* renamed from: q */
    static void m6566q() {
        f8066O = false;
        if (!C1823b.m6434y()) {
            C1820f.m6280a(3, new RunnableC1819e(HttpConstant.SC_REQUESTED_RANGE_NOT_SATISFIABLE), 11000L);
        }
        if (m6468U()) {
            return;
        }
        f8065N = 0;
        m6470W();
    }

    /* renamed from: b */
    private static void m6514b(OutputStream outputStream, String str, String str2) {
        String strM6568r;
        String strNativeGet;
        try {
            outputStream.write("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            m6494a(th, outputStream);
        }
        try {
            Locale locale = Locale.US;
            outputStream.write(String.format(locale, "Basic Information: 'pid: %d/tid: %d/time: %s'\n", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()), m6558m()).getBytes("UTF-8"));
            Object[] objArr = new Object[3];
            objArr[0] = m6535e();
            if (C1821g.m6298a(f8094l)) {
                m6466S();
            }
            objArr[1] = f8094l;
            objArr[2] = m6539f();
            outputStream.write(String.format(locale, "Cpu Information: 'abi: %s/processor: %s/hardware: %s'\n", objArr).getBytes("UTF-8"));
        } catch (Throwable th2) {
            m6494a(th2, outputStream);
        }
        try {
            Locale locale2 = Locale.US;
            outputStream.write(String.format(locale2, "Mobile Information: 'model: %s/version: %s/sdk: %d'\n", Build.MODEL, Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT)).getBytes("UTF-8"));
            outputStream.write(("Build fingerprint: '" + Build.FINGERPRINT + "'\n").getBytes("UTF-8"));
            Object[] objArr2 = new Object[4];
            objArr2[0] = m6482a(new Date(f8085b));
            objArr2[1] = Long.valueOf(Runtime.getRuntime().maxMemory());
            objArr2[2] = C1821g.m6307d();
            objArr2[3] = C1823b.m6434y() ? "fg" : "bg";
            outputStream.write(String.format(locale2, "Runtime Information: 'start: %s/maxheap: %s/primaryabi: %s/ground: %s'\n", objArr2).getBytes("UTF-8"));
        } catch (Throwable th3) {
            m6494a(th3, outputStream);
        }
        try {
            Locale locale3 = Locale.US;
            outputStream.write(String.format(locale3, "Application Information: 'version: %s/subversion: %s/buildseq: %s/versioncode: %d'\n", C1828g.m6633R(), C1828g.m6634S(), C1828g.m6635T(), Integer.valueOf(C1814a.m6226c())).getBytes("UTF-8"));
            String str3 = MessageService.MSG_DB_READY_REPORT;
            String str4 = "";
            if (C1823b.f8020d) {
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
            m6494a(th4, outputStream);
        }
        try {
            if (f8084af) {
                strM6568r = m6568r("UUID");
            } else {
                strM6568r = f8053B;
            }
            outputStream.write(String.format("UUID: %s\n", strM6568r).getBytes("UTF-8"));
            outputStream.write(("Log Type: " + str2 + "\n").getBytes("UTF-8"));
        } catch (Throwable th5) {
            m6494a(th5, outputStream);
        }
        try {
            String strM6369B = C1823b.m6369B();
            if (C1821g.m6298a(strM6369B)) {
                strM6369B = "(none)";
            }
            outputStream.write(("Activity: " + strM6369B + "\n").getBytes("UTF-8"));
        } catch (Throwable th6) {
            m6494a(th6, outputStream);
        }
        m6488a(outputStream);
        try {
            C1814a.m6213a(outputStream, "UTF-8");
            if (f8084af) {
                f8090h = false;
                outputStream.write(m6568r("HEADER").getBytes("UTF-8"));
                f8090h = true;
            }
        } catch (Throwable th7) {
            m6494a(th7, outputStream);
        }
        m6488a(outputStream);
    }

    /* renamed from: m */
    static String m6558m() {
        return m6482a(new Date());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m6531d(Context context) {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME);
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
                f8066O = true;
                if (m6461N()) {
                    C1815a.m6247d("crashsdk", "ANR occurred in process: " + next.processName);
                }
                if (C1823b.f8020d) {
                    JNIBridge.set(130, next.longMsg);
                }
                z3 = true;
            }
        }
        if (!z3 && C1823b.f8020d) {
            m6469V();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static void m6496a(boolean z3) {
        File[] fileArrListFiles;
        try {
            if (C1823b.m6431v() && (fileArrListFiles = new File(C1828g.m6637V()).listFiles()) != null) {
                int iM6661l = C1828g.m6661l();
                int iM6662m = C1828g.m6662m();
                if (fileArrListFiles.length < Math.min(iM6661l, iM6662m)) {
                    return;
                }
                Object[] objArr = 0;
                int i4 = 0;
                int i5 = 0;
                for (File file : fileArrListFiles) {
                    if (m6520b(file)) {
                        i4++;
                    } else {
                        i5++;
                    }
                }
                int i6 = (!z3 || i4 < iM6661l) ? 0 : (i4 - iM6661l) + 1;
                int i7 = (z3 || i5 < iM6662m) ? 0 : (i5 - iM6662m) + 1;
                if (i6 == 0 && i7 == 0) {
                    return;
                }
                Arrays.sort(fileArrListFiles, new b(objArr == true ? 1 : 0));
                int i8 = i6;
                int i9 = i7;
                for (File file2 : fileArrListFiles) {
                    boolean zM6520b = m6520b(file2);
                    if (zM6520b && i8 > 0) {
                        C1815a.m6242a("crashsdk", "Delete oldest crash log: " + file2.getPath());
                        file2.delete();
                        i8 += -1;
                    } else if (!zM6520b && i9 > 0) {
                        C1815a.m6242a("crashsdk", "Delete oldest custom log: " + file2.getPath());
                        file2.delete();
                        i9 += -1;
                    }
                    if (i8 == 0 && i9 == 0) {
                        break;
                    }
                }
                C1827f.m6596a(16, i6 + i7);
                if (i6 > 0) {
                    C1827f.m6596a(22, i6);
                }
                if (i7 > 0) {
                    C1827f.m6596a(23, i7);
                }
            }
        } catch (Throwable th) {
            C1821g.m6293a(th);
        }
    }

    /* renamed from: n */
    public static void m6560n() {
        f8085b = System.currentTimeMillis();
    }

    /* renamed from: e */
    private static void m6537e(OutputStream outputStream) {
        BufferedReader bufferedReader;
        int iIndexOf;
        if (C1823b.f8020d) {
            try {
                outputStream.write("solib build id:\n".getBytes("UTF-8"));
            } catch (Throwable th) {
                m6494a(th, outputStream);
            }
            FileReader fileReader = null;
            try {
                ArrayList arrayList = new ArrayList();
                FileReader fileReader2 = new FileReader(new File("/proc/self/maps"));
                try {
                    bufferedReader = new BufferedReader(fileReader2, EventType.AUTH_SUCC);
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            if (line.endsWith(".so") && (iIndexOf = line.indexOf(47)) != -1) {
                                String strSubstring = line.substring(iIndexOf);
                                if ((strSubstring.contains("/data/") || strSubstring.contains(C1814a.f7901a)) && !arrayList.contains(strSubstring)) {
                                    arrayList.add(strSubstring);
                                    if (f8084af) {
                                        try {
                                            outputStream.write((String.format("$^%s`%s^$", "SOBUILDID", strSubstring) + "\n").getBytes("UTF-8"));
                                        } catch (Throwable th2) {
                                            m6494a(th2, outputStream);
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
                                m6494a(th, outputStream);
                                C1821g.m6291a(fileReader);
                                C1821g.m6291a(bufferedReader);
                                m6488a(outputStream);
                            } catch (Throwable th4) {
                                C1821g.m6291a(fileReader);
                                C1821g.m6291a(bufferedReader);
                                throw th4;
                            }
                        }
                    }
                    C1821g.m6291a(fileReader2);
                } catch (Throwable th5) {
                    th = th5;
                    bufferedReader = null;
                }
            } catch (Throwable th6) {
                th = th6;
                bufferedReader = null;
            }
            C1821g.m6291a(bufferedReader);
            m6488a(outputStream);
        }
    }

    /* renamed from: c */
    static boolean m6526c(String str) {
        if (f8084af) {
            return true;
        }
        try {
            return m6563o(str);
        } catch (Throwable th) {
            C1821g.m6293a(th);
            return true;
        }
    }

    /* renamed from: d */
    public static boolean m6532d(String str) {
        try {
            if (!C1821g.m6303b(str) || !str.startsWith("lib") || !str.endsWith(".so")) {
                return false;
            }
            System.loadLibrary(str.substring(3, str.length() - 3));
            return true;
        } catch (Throwable th) {
            C1821g.m6293a(th);
            return false;
        }
    }

    /* renamed from: c */
    static void m6524c(boolean z3) {
        boolean z4 = true;
        if (!f8069R ? !z3 || !C1828g.m6626K() : z3 && C1828g.m6626K()) {
            z4 = false;
        }
        if (z4) {
            RunnableC1819e runnableC1819e = f8070S;
            if (C1820f.m6282b(runnableC1819e)) {
                C1820f.m6278a(runnableC1819e);
            }
            C1820f.m6280a(0, runnableC1819e, 3000L);
        }
    }

    /* renamed from: a */
    static String m6480a(String str, String str2) {
        String[] strArr;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                strArr = new String[]{"ps", "-ef"};
            } else {
                strArr = new String[]{"ps"};
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(strArr).getInputStream()));
            boolean zM6303b = C1821g.m6303b(str);
            boolean zM6303b2 = C1821g.m6303b(str2);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    boolean z3 = true;
                    if ((!zM6303b || !line.contains(str)) && ((!zM6303b2 || !line.contains(str2)) && (line.indexOf(47) >= 0 || line.indexOf(46) <= 0))) {
                        z3 = false;
                    }
                    if (z3) {
                        byteArrayOutputStream.write(line.getBytes("UTF-8"));
                        byteArrayOutputStream.write("\n".getBytes("UTF-8"));
                    }
                } else {
                    return byteArrayOutputStream.toString("UTF-8");
                }
            }
        } catch (Throwable th) {
            C1821g.m6293a(th);
            return "exception exists.";
        }
    }

    /* renamed from: a */
    private static BufferedReader m6476a(InputStreamReader inputStreamReader) {
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

    /* renamed from: e */
    public static int m6534e(boolean z3) {
        int iM6603b;
        if (z3) {
            iM6603b = C1827f.m6600a(C1823b.m6409c()) ? 1 : 0;
        } else {
            iM6603b = C1827f.m6603b();
        }
        int iM6604b = C1827f.m6604b(z3);
        return iM6604b > iM6603b ? iM6604b : iM6603b;
    }

    /* renamed from: a */
    private static void m6488a(OutputStream outputStream) {
        try {
            outputStream.write("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            m6494a(th, outputStream);
        }
    }

    /* renamed from: e */
    static StringBuilder m6536e(String str) {
        return m6483a(Thread.currentThread().getStackTrace(), str);
    }

    /* renamed from: a */
    private static String m6478a(File file) {
        String canonicalPath;
        try {
            canonicalPath = file.getCanonicalPath();
        } catch (Throwable unused) {
            canonicalPath = null;
        }
        return C1821g.m6298a(canonicalPath) ? file.getPath() : canonicalPath;
    }

    /* renamed from: a */
    private static long m6475a(StatFs statFs, String str, String str2) {
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
            C1821g.m6293a(th);
            return 0L;
        }
    }

    /* renamed from: b */
    private static void m6513b(OutputStream outputStream) {
        BufferedReader bufferedReaderM6476a = null;
        try {
            outputStream.write("logcat:\n".getBytes("UTF-8"));
        } finally {
        }
        try {
            if (C1828g.m6663n() <= 0) {
                try {
                    outputStream.write("[DEBUG] custom java logcat lines count is 0!\n".getBytes("UTF-8"));
                } catch (Throwable th) {
                    m6494a(th, outputStream);
                }
                m6488a(outputStream);
                return;
            }
            int iM6663n = C1828g.m6663n();
            bufferedReaderM6476a = m6476a(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"logcat", "-d", "-b", C1896c.f8592ar, "-b", "main", "-v", "threadtime", "-t", String.valueOf(iM6663n)}).getInputStream()));
            if (bufferedReaderM6476a == null) {
                try {
                    outputStream.write("[DEBUG] alloc buffer failed!\n".getBytes("UTF-8"));
                } catch (Throwable th2) {
                    m6494a(th2, outputStream);
                }
                m6488a(outputStream);
                return;
            }
            f8090h = false;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                String line = bufferedReaderM6476a.readLine();
                if (line != null) {
                    i4++;
                    if (i5 < iM6663n && !line.contains(" I auditd ") && !line.contains(" I liblog ")) {
                        outputStream.write(line.getBytes("UTF-8"));
                        outputStream.write("\n".getBytes("UTF-8"));
                        i5++;
                    }
                } else {
                    try {
                        break;
                    } catch (Throwable th3) {
                        m6494a(th3, outputStream);
                    }
                }
            }
            outputStream.write(String.format(Locale.US, "[DEBUG] Read %d lines, wrote %d lines.\n", Integer.valueOf(i4), Integer.valueOf(i5)).getBytes("UTF-8"));
            f8090h = true;
            C1821g.m6291a(bufferedReaderM6476a);
            m6488a(outputStream);
            return;
            C1821g.m6291a(bufferedReaderM6476a);
            m6488a(outputStream);
            return;
        } finally {
        }
    }

    /* renamed from: a */
    private static void m6486a(a aVar) {
        try {
            aVar.m6582a(String.format(Locale.US, "log end: %s\n", m6558m()));
        } catch (Throwable th) {
            m6494a(th, aVar);
        }
    }

    /* renamed from: a */
    static int m6474a(OutputStream outputStream, String str, int i4) {
        int i5 = 0;
        if (str == null) {
            m6488a(outputStream);
            return 0;
        }
        try {
            String strM6248a = C1816b.m6248a(str);
            if (strM6248a == null) {
                strM6248a = "file: '" + str + "' not found or decode failed!";
            }
            int length = strM6248a.length();
            if (length <= i4 + 32) {
                i4 = length;
            }
            if (i4 > 0) {
                try {
                    outputStream.write(strM6248a.getBytes("UTF-8"), 0, i4);
                    outputStream.write("\n".getBytes("UTF-8"));
                } catch (Throwable th) {
                    th = th;
                    i5 = i4;
                    m6494a(th, outputStream);
                    i4 = i5;
                    m6488a(outputStream);
                    return i4;
                }
            }
            if (i4 < strM6248a.length()) {
                outputStream.write(String.format(Locale.US, "(truncated %d bytes)\n", Integer.valueOf(strM6248a.length() - i4)).getBytes("UTF-8"));
            }
        } catch (Throwable th2) {
            th = th2;
        }
        m6488a(outputStream);
        return i4;
    }

    /* renamed from: a */
    static String m6477a(int i4) {
        try {
            String strM6285a = C1821g.m6285a(new File(String.format(Locale.US, "/proc/%d/cmdline", Integer.valueOf(i4))), 128, false);
            return C1821g.m6303b(strM6285a) ? m6555k(strM6285a) : UtilityImpl.NET_TYPE_UNKNOWN;
        } catch (Throwable th) {
            C1821g.m6293a(th);
            return UtilityImpl.NET_TYPE_UNKNOWN;
        }
    }

    /* renamed from: b */
    private static void m6512b(a aVar) {
        f8090h = false;
        try {
            aVar.write((m6568r("LOG_END") + "\n").getBytes("UTF-8"));
        } catch (Throwable th) {
            C1821g.m6293a(th);
        }
        f8090h = true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:183|(2:279|184)|206|207|345|208|213|(4:215|299|216|220)|(2:312|221)|226|327|227|232|(4:234|351|235|239)|240|(2:297|241)|(1:247)|248) */
    /* JADX WARN: Can't wrap try/catch for region: R(26:0|2|323|3|4|(2:357|6)|9|(1:11)(1:13)|14|(51:318|15|(1:17)|21|(2:339|23)|343|28|291|32|314|33|(1:35)|39|(1:43)|307|47|329|51|55|341|56|347|61|(2:281|67)|72|310|73|77|355|78|321|82|86|337|87|92|(4:94|289|95|99)|303|100|105|316|106|335|111|309|115|(1:117)(2:118|(1:120))|124|333|125|129)|(4:131|277|132|136)(10:301|139|(0)(8:146|287|147|148|149|293|150|(14:152|153|285|154|353|155|156|349|157|176|331|177|181|(21:183|279|184|206|207|345|208|213|(4:215|299|216|220)|312|221|226|327|227|232|(4:234|351|235|239)|240|297|241|(1:247)|248)(25:325|189|(1:191)|192|(1:194)|195|(4:197|(1:199)(1:201)|200|202)|206|207|345|208|213|(0)|312|221|226|327|227|232|(0)|240|297|241|(0)|248))(7:169|138|176|331|177|181|(0)(0)))|258|(1:260)|295|261|(1:263)(1:264)|265|269)|137|138|176|331|177|181|(0)(0)|258|(0)|295|261|(0)(0)|265|269|(2:(0)|(1:319))) */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0345, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0346, code lost:
    
        m6494a(r0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0414, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0416, code lost:
    
        m6494a(r0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0443, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0445, code lost:
    
        m6494a(r0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x04ac, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x04ad, code lost:
    
        com.p068uc.crashsdk.p069a.C1821g.m6293a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:183:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x041d A[Catch: all -> 0x047c, TRY_LEAVE, TryCatch #21 {all -> 0x047c, blocks: (B:21:0x0040, B:55:0x0107, B:86:0x0183, B:92:0x0192, B:94:0x0196, B:99:0x01aa, B:98:0x01a7, B:105:0x01b5, B:124:0x01fb, B:129:0x020c, B:131:0x0210, B:136:0x0224, B:176:0x0338, B:181:0x0349, B:206:0x0404, B:213:0x0419, B:215:0x041d, B:220:0x0432, B:219:0x042f, B:232:0x0448, B:234:0x044c, B:239:0x0461, B:238:0x045e, B:240:0x0464, B:245:0x0470, B:231:0x0445, B:225:0x043b, B:212:0x0416, B:187:0x0363, B:180:0x0346, B:135:0x0221, B:175:0x0335, B:128:0x0209, B:123:0x01f8, B:114:0x01cc, B:110:0x01be, B:104:0x01b2, B:91:0x018f, B:85:0x0180, B:81:0x015f, B:76:0x0139, B:71:0x0124, B:65:0x0119, B:60:0x0110, B:54:0x0104, B:50:0x00f6, B:46:0x00e9, B:31:0x0090, B:27:0x004f, B:20:0x003d, B:132:0x0212, B:67:0x011e, B:95:0x0198, B:32:0x0093, B:39:0x00bf, B:41:0x00c5, B:43:0x00cf, B:38:0x00bc, B:33:0x009c, B:35:0x00ad, B:241:0x046a, B:216:0x0420, B:100:0x01ac, B:47:0x00ec, B:115:0x01cf, B:117:0x01d3, B:118:0x01e5, B:120:0x01eb, B:73:0x0129, B:221:0x0435, B:106:0x01b8, B:15:0x0032, B:17:0x0036, B:82:0x0162, B:227:0x043f, B:51:0x00f9, B:177:0x033b, B:125:0x01fe, B:111:0x01c1, B:87:0x0189, B:23:0x0049, B:56:0x010a, B:28:0x0052, B:208:0x0410, B:61:0x0113, B:235:0x044f, B:78:0x013d), top: B:318:0x0032, inners: #0, #2, #6, #7, #10, #11, #13, #15, #16, #17, #18, #20, #22, #23, #26, #27, #28, #29, #30, #31, #32, #33, #34, #35, #36, #38, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x044c A[Catch: all -> 0x047c, TRY_LEAVE, TryCatch #21 {all -> 0x047c, blocks: (B:21:0x0040, B:55:0x0107, B:86:0x0183, B:92:0x0192, B:94:0x0196, B:99:0x01aa, B:98:0x01a7, B:105:0x01b5, B:124:0x01fb, B:129:0x020c, B:131:0x0210, B:136:0x0224, B:176:0x0338, B:181:0x0349, B:206:0x0404, B:213:0x0419, B:215:0x041d, B:220:0x0432, B:219:0x042f, B:232:0x0448, B:234:0x044c, B:239:0x0461, B:238:0x045e, B:240:0x0464, B:245:0x0470, B:231:0x0445, B:225:0x043b, B:212:0x0416, B:187:0x0363, B:180:0x0346, B:135:0x0221, B:175:0x0335, B:128:0x0209, B:123:0x01f8, B:114:0x01cc, B:110:0x01be, B:104:0x01b2, B:91:0x018f, B:85:0x0180, B:81:0x015f, B:76:0x0139, B:71:0x0124, B:65:0x0119, B:60:0x0110, B:54:0x0104, B:50:0x00f6, B:46:0x00e9, B:31:0x0090, B:27:0x004f, B:20:0x003d, B:132:0x0212, B:67:0x011e, B:95:0x0198, B:32:0x0093, B:39:0x00bf, B:41:0x00c5, B:43:0x00cf, B:38:0x00bc, B:33:0x009c, B:35:0x00ad, B:241:0x046a, B:216:0x0420, B:100:0x01ac, B:47:0x00ec, B:115:0x01cf, B:117:0x01d3, B:118:0x01e5, B:120:0x01eb, B:73:0x0129, B:221:0x0435, B:106:0x01b8, B:15:0x0032, B:17:0x0036, B:82:0x0162, B:227:0x043f, B:51:0x00f9, B:177:0x033b, B:125:0x01fe, B:111:0x01c1, B:87:0x0189, B:23:0x0049, B:56:0x010a, B:28:0x0052, B:208:0x0410, B:61:0x0113, B:235:0x044f, B:78:0x013d), top: B:318:0x0032, inners: #0, #2, #6, #7, #10, #11, #13, #15, #16, #17, #18, #20, #22, #23, #26, #27, #28, #29, #30, #31, #32, #33, #34, #35, #36, #38, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x048a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x049b A[Catch: all -> 0x04ac, TryCatch #9 {all -> 0x04ac, blocks: (B:261:0x0497, B:263:0x049b, B:265:0x04a6), top: B:295:0x0497 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0368 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m6481a(java.lang.Throwable r23, java.lang.String r24, long r25, boolean r27) {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p068uc.crashsdk.C1826e.m6481a(java.lang.Throwable, java.lang.String, long, boolean):java.lang.String");
    }

    /* renamed from: b */
    static int m6506b(OutputStream outputStream, String str, int i4) {
        int i5;
        DataInputStream dataInputStream;
        int i6;
        DataInputStream dataInputStream2 = null;
        int i7 = 0;
        try {
            File file = new File(str);
            if (file.exists()) {
                byte[] bArrM6464Q = m6464Q();
                if (bArrM6464Q == null) {
                    outputStream.write("(alloc buffer failed!)\n".getBytes("UTF-8"));
                    return 0;
                }
                dataInputStream = new DataInputStream(new FileInputStream(file));
                i6 = 0;
                i5 = 0;
                loop0: while (true) {
                    boolean z3 = false;
                    while (true) {
                        try {
                            int i8 = dataInputStream.read(bArrM6464Q);
                            if (i8 == -1) {
                                break loop0;
                            }
                            i6 += i8;
                            int i9 = i4 - i5;
                            if (i8 <= i9 + 32) {
                                i9 = i8;
                            }
                            if (i9 > 0 && !z3) {
                                outputStream.write(bArrM6464Q, 0, i9);
                                i5 += i9;
                            }
                            if (!z3) {
                                if (i9 < i8 || i5 >= i4) {
                                    z3 = true;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            i7 = i5;
                            dataInputStream2 = dataInputStream;
                            try {
                                m6494a(th, outputStream);
                                C1821g.m6291a(dataInputStream2);
                                i5 = i7;
                                m6488a(outputStream);
                                return i5;
                            } finally {
                                C1821g.m6291a(dataInputStream2);
                            }
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
        m6488a(outputStream);
        return i5;
    }

    /* renamed from: b */
    static void m6518b(boolean z3) {
        try {
            boolean zM6668s = C1828g.m6667r() && C1823b.m6370C() && !f8087d;
            if (!zM6668s) {
                zM6668s = C1828g.m6668s();
            }
            if (zM6668s) {
                if (z3) {
                    String strM6554k = m6554k();
                    if (C1821g.m6298a(strM6554k)) {
                        return;
                    }
                    m6553j();
                    m6492a(strM6554k, false, false);
                    return;
                }
                m6504a(true, false);
            }
        } catch (Throwable th) {
            C1821g.m6293a(th);
        }
    }

    /* renamed from: b */
    private static boolean m6520b(File file) {
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
    private static String m6509b(String str, boolean z3, boolean z4) {
        if (z3) {
            try {
                str = m6556l(str);
            } catch (Throwable th) {
                C1821g.m6293a(th);
            }
        }
        if (!z4) {
            return str;
        }
        try {
            return m6479a(str);
        } catch (Throwable th2) {
            C1821g.m6293a(th2);
            return str;
        }
    }

    /* renamed from: b */
    static void m6517b(String str, String str2, boolean z3) {
        C1822h.m6335a(str, str2, false, z3);
    }

    /* renamed from: b */
    public static void m6515b(String str) {
        synchronized (f8108z) {
            C1816b.m6250a(C1823b.m6418i(), str + "\n");
        }
    }

    /* renamed from: b */
    private static void m6516b(String str, String str2) {
        try {
            C1825d.m6442a(str, m6547h(), str2);
        } catch (Throwable th) {
            C1821g.m6293a(th);
        }
    }

    /* renamed from: b */
    public static void m6511b(Context context) {
        if (C1828g.m6626K()) {
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
                intentFilter.addAction("android.intent.action.BATTERY_LOW");
                intentFilter.addAction("android.intent.action.BATTERY_OKAY");
                context.registerReceiver(f8068Q, intentFilter, null, C1820f.m6275a(1));
                f8069R = true;
            } catch (Throwable th) {
                C1821g.m6293a(th);
            }
        }
    }

    /* renamed from: b */
    public static void m6510b(int i4) {
        C1820f.m6280a(0, new RunnableC1819e(410), i4 * 1000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static int m6507b(boolean z3, boolean z4) {
        int i4;
        if (z4 && !f8081ac) {
            C1827f.m6612d(false);
        }
        if (z3) {
            boolean zM6602a = C1827f.m6602a(C1823b.m6409c(), false);
            C1822h.m6353i();
            i4 = zM6602a;
        } else {
            int iM6591a = C1827f.m6591a();
            C1822h.m6353i();
            i4 = iM6591a;
        }
        return z4 ? C1827f.m6593a(z3) : i4;
    }

    /* renamed from: a */
    static String m6479a(String str) {
        int iLastIndexOf;
        int iIndexOf;
        int i4;
        int iIndexOf2;
        File file;
        byte[] bArrM6311e;
        if (!C1828g.m6673x() || (iLastIndexOf = str.lastIndexOf(47)) <= 0 || (iIndexOf = str.indexOf(95, iLastIndexOf)) <= iLastIndexOf || (iIndexOf2 = str.indexOf(95, (i4 = iIndexOf + 1))) <= iIndexOf) {
            return str;
        }
        String strM6309d = C1821g.m6309d("CrashSDK" + str.substring(iLastIndexOf + 1, iIndexOf) + str.substring(i4, iIndexOf2));
        if (strM6309d == null || (bArrM6311e = C1821g.m6311e((file = new File(str)))) == null || bArrM6311e.length <= 0) {
            return str;
        }
        byte[] bArrM6264b = null;
        try {
            bArrM6264b = C1817c.m6264b(bArrM6311e, strM6309d.substring(0, 16).getBytes());
        } catch (Throwable th) {
            C1821g.m6293a(th);
        }
        if (bArrM6264b == null) {
            return str;
        }
        String str2 = str + ".ec";
        File file2 = new File(str2 + ".tmp");
        if (!C1821g.m6297a(file2, bArrM6264b)) {
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
    static void m6494a(Throwable th, OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.write("[DEBUG] CrashHandler occurred new exception:\n".getBytes("UTF-8"));
                th.printStackTrace(new PrintStream(outputStream));
                outputStream.write("\n\n".getBytes("UTF-8"));
            } catch (Throwable th2) {
                C1821g.m6293a(th2);
            }
        }
        C1821g.m6293a(th);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f2 A[Catch: all -> 0x0432, TryCatch #0 {all -> 0x0432, blocks: (B:4:0x000a, B:6:0x0010, B:8:0x001f, B:9:0x0034, B:11:0x003a, B:12:0x004d, B:14:0x005d, B:16:0x0067, B:147:0x03bd, B:18:0x006d, B:20:0x007b, B:22:0x008d, B:25:0x00ae, B:27:0x00be, B:31:0x00cb, B:42:0x00f7, B:38:0x00e9, B:62:0x01c4, B:64:0x01d8, B:66:0x01dc, B:67:0x01de, B:69:0x01e3, B:70:0x01e5, B:71:0x01ea, B:81:0x020d, B:82:0x0223, B:84:0x0229, B:86:0x0232, B:88:0x023e, B:90:0x025d, B:91:0x0270, B:93:0x0282, B:95:0x0290, B:96:0x02a1, B:110:0x02e3, B:113:0x02f2, B:116:0x02fe, B:119:0x030d, B:121:0x031b, B:123:0x0328, B:126:0x032f, B:130:0x033c, B:132:0x0348, B:134:0x0362, B:135:0x0367, B:137:0x0377, B:139:0x0384, B:145:0x03ae, B:150:0x03d1, B:152:0x03d8, B:154:0x03df, B:156:0x03e6, B:158:0x03ed, B:160:0x03f4, B:166:0x0406, B:168:0x040d, B:170:0x0414, B:172:0x041b, B:164:0x03ff, B:138:0x037e, B:140:0x03a1, B:142:0x03a6, B:98:0x02a7, B:100:0x02ad, B:103:0x02b5, B:105:0x02b9, B:107:0x02cd, B:109:0x02d1, B:75:0x01f4, B:77:0x0202, B:79:0x0208, B:61:0x01c1, B:173:0x0423), top: B:193:0x000a, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d8 A[Catch: all -> 0x0432, TryCatch #0 {all -> 0x0432, blocks: (B:4:0x000a, B:6:0x0010, B:8:0x001f, B:9:0x0034, B:11:0x003a, B:12:0x004d, B:14:0x005d, B:16:0x0067, B:147:0x03bd, B:18:0x006d, B:20:0x007b, B:22:0x008d, B:25:0x00ae, B:27:0x00be, B:31:0x00cb, B:42:0x00f7, B:38:0x00e9, B:62:0x01c4, B:64:0x01d8, B:66:0x01dc, B:67:0x01de, B:69:0x01e3, B:70:0x01e5, B:71:0x01ea, B:81:0x020d, B:82:0x0223, B:84:0x0229, B:86:0x0232, B:88:0x023e, B:90:0x025d, B:91:0x0270, B:93:0x0282, B:95:0x0290, B:96:0x02a1, B:110:0x02e3, B:113:0x02f2, B:116:0x02fe, B:119:0x030d, B:121:0x031b, B:123:0x0328, B:126:0x032f, B:130:0x033c, B:132:0x0348, B:134:0x0362, B:135:0x0367, B:137:0x0377, B:139:0x0384, B:145:0x03ae, B:150:0x03d1, B:152:0x03d8, B:154:0x03df, B:156:0x03e6, B:158:0x03ed, B:160:0x03f4, B:166:0x0406, B:168:0x040d, B:170:0x0414, B:172:0x041b, B:164:0x03ff, B:138:0x037e, B:140:0x03a1, B:142:0x03a6, B:98:0x02a7, B:100:0x02ad, B:103:0x02b5, B:105:0x02b9, B:107:0x02cd, B:109:0x02d1, B:75:0x01f4, B:77:0x0202, B:79:0x0208, B:61:0x01c1, B:173:0x0423), top: B:193:0x000a, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020d A[Catch: all -> 0x0432, TryCatch #0 {all -> 0x0432, blocks: (B:4:0x000a, B:6:0x0010, B:8:0x001f, B:9:0x0034, B:11:0x003a, B:12:0x004d, B:14:0x005d, B:16:0x0067, B:147:0x03bd, B:18:0x006d, B:20:0x007b, B:22:0x008d, B:25:0x00ae, B:27:0x00be, B:31:0x00cb, B:42:0x00f7, B:38:0x00e9, B:62:0x01c4, B:64:0x01d8, B:66:0x01dc, B:67:0x01de, B:69:0x01e3, B:70:0x01e5, B:71:0x01ea, B:81:0x020d, B:82:0x0223, B:84:0x0229, B:86:0x0232, B:88:0x023e, B:90:0x025d, B:91:0x0270, B:93:0x0282, B:95:0x0290, B:96:0x02a1, B:110:0x02e3, B:113:0x02f2, B:116:0x02fe, B:119:0x030d, B:121:0x031b, B:123:0x0328, B:126:0x032f, B:130:0x033c, B:132:0x0348, B:134:0x0362, B:135:0x0367, B:137:0x0377, B:139:0x0384, B:145:0x03ae, B:150:0x03d1, B:152:0x03d8, B:154:0x03df, B:156:0x03e6, B:158:0x03ed, B:160:0x03f4, B:166:0x0406, B:168:0x040d, B:170:0x0414, B:172:0x041b, B:164:0x03ff, B:138:0x037e, B:140:0x03a1, B:142:0x03a6, B:98:0x02a7, B:100:0x02ad, B:103:0x02b5, B:105:0x02b9, B:107:0x02cd, B:109:0x02d1, B:75:0x01f4, B:77:0x0202, B:79:0x0208, B:61:0x01c1, B:173:0x0423), top: B:193:0x000a, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0223 A[Catch: all -> 0x0432, TryCatch #0 {all -> 0x0432, blocks: (B:4:0x000a, B:6:0x0010, B:8:0x001f, B:9:0x0034, B:11:0x003a, B:12:0x004d, B:14:0x005d, B:16:0x0067, B:147:0x03bd, B:18:0x006d, B:20:0x007b, B:22:0x008d, B:25:0x00ae, B:27:0x00be, B:31:0x00cb, B:42:0x00f7, B:38:0x00e9, B:62:0x01c4, B:64:0x01d8, B:66:0x01dc, B:67:0x01de, B:69:0x01e3, B:70:0x01e5, B:71:0x01ea, B:81:0x020d, B:82:0x0223, B:84:0x0229, B:86:0x0232, B:88:0x023e, B:90:0x025d, B:91:0x0270, B:93:0x0282, B:95:0x0290, B:96:0x02a1, B:110:0x02e3, B:113:0x02f2, B:116:0x02fe, B:119:0x030d, B:121:0x031b, B:123:0x0328, B:126:0x032f, B:130:0x033c, B:132:0x0348, B:134:0x0362, B:135:0x0367, B:137:0x0377, B:139:0x0384, B:145:0x03ae, B:150:0x03d1, B:152:0x03d8, B:154:0x03df, B:156:0x03e6, B:158:0x03ed, B:160:0x03f4, B:166:0x0406, B:168:0x040d, B:170:0x0414, B:172:0x041b, B:164:0x03ff, B:138:0x037e, B:140:0x03a1, B:142:0x03a6, B:98:0x02a7, B:100:0x02ad, B:103:0x02b5, B:105:0x02b9, B:107:0x02cd, B:109:0x02d1, B:75:0x01f4, B:77:0x0202, B:79:0x0208, B:61:0x01c1, B:173:0x0423), top: B:193:0x000a, outer: #2 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m6492a(java.lang.String r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 1099
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p068uc.crashsdk.C1826e.m6492a(java.lang.String, boolean, boolean):void");
    }

    /* renamed from: a */
    public static boolean m6504a(boolean z3, boolean z4) {
        if (!f8087d) {
            if (C1823b.f8020d) {
                JNIBridge.set(1, true);
            }
            f8087d = true;
        }
        try {
            String strM6554k = m6554k();
            if (C1821g.m6298a(strM6554k)) {
                C1815a.m6242a("crashsdk", "CrashHandler url is empty!");
                return false;
            }
            Object obj = f8096n;
            synchronized (obj) {
                if (C1820f.m6279a(z3 ? 1 : 0, new RunnableC1819e(406, new Object[]{strM6554k, Boolean.valueOf(z4), Boolean.valueOf(z3)})) && z3) {
                    try {
                        obj.wait();
                    } catch (InterruptedException e4) {
                        C1821g.m6293a(e4);
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            C1821g.m6293a(th);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* renamed from: a */
    private static boolean m6500a(String str, RunnableC1819e runnableC1819e) {
        boolean zM6274a;
        FileChannel channel;
        Exception e4;
        synchronized (f8097o) {
            File file = new File(str);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (Exception e5) {
                    C1821g.m6293a(e5);
                }
            }
            ?? r5 = 0;
            fileLockLock = null;
            FileLock fileLockLock = null;
            zM6274a = false;
            try {
                try {
                    try {
                        channel = new RandomAccessFile(file, "rw").getChannel();
                    } catch (Throwable th) {
                        th = th;
                        r5 = file;
                        C1821g.m6291a((Closeable) r5);
                        throw th;
                    }
                } catch (Exception e6) {
                    try {
                        C1821g.m6293a(e6);
                        channel = null;
                    } catch (Exception e7) {
                        channel = null;
                        e4 = e7;
                        C1821g.m6293a(e4);
                        C1821g.m6291a(channel);
                        return zM6274a;
                    }
                }
                if (channel != null) {
                    try {
                        fileLockLock = channel.lock();
                    } catch (Exception e8) {
                        try {
                            C1821g.m6293a(e8);
                        } catch (Exception e9) {
                            e4 = e9;
                            C1821g.m6293a(e4);
                            C1821g.m6291a(channel);
                            return zM6274a;
                        }
                    }
                }
                try {
                    zM6274a = runnableC1819e.m6274a();
                    C1821g.m6291a(channel);
                } finally {
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (Exception e10) {
                            C1821g.m6293a(e10);
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return zM6274a;
    }

    /* renamed from: a */
    private static boolean m6501a(String str, d dVar) {
        String strM6285a = C1821g.m6285a(new File(str), 64, false);
        if (strM6285a == null) {
            return false;
        }
        try {
            Matcher matcher = Pattern.compile("(\\d+)\\s+(\\d+)\\s+(\\d+)\\s+(\\d+)").matcher(strM6285a);
            if (matcher.find()) {
                long j4 = Long.parseLong(matcher.group(1));
                if (System.currentTimeMillis() - j4 < 86400000) {
                    dVar.f8116b = Long.parseLong(matcher.group(2));
                    dVar.f8117c = Integer.parseInt(matcher.group(3));
                    dVar.f8118d = Integer.parseInt(matcher.group(4));
                    dVar.f8115a = j4;
                }
            }
        } catch (Throwable th) {
            C1821g.m6293a(th);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* renamed from: a */
    public static boolean m6503a(StringBuffer stringBuffer, String str, long j4, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, String str2) {
        long j5;
        boolean z3;
        boolean zM6499a;
        if (f8086c.get()) {
            C1815a.m6244b("Processing java crash, skip generate custom log: " + str);
            return false;
        }
        boolean z4 = f8084af || C1823b.m6376I();
        if (!z4 && !C1818d.m6271d()) {
            C1815a.m6246c("DEBUG", C1818d.m6269b());
            return false;
        }
        if (!m6526c(str)) {
            C1815a.m6247d("DEBUG", "custom log sample miss: " + str);
            return false;
        }
        if (m6473Z()) {
            C1815a.m6244b("Processing native crash, skip generate custom log: " + str);
            return false;
        }
        if (stringBuffer == null || str == null) {
            return false;
        }
        String strM6479a = C1828g.m6637V() + m6552j(str);
        ?? r11 = (j4 & 32) != 0 ? 1 : 0;
        if (z4) {
            long jNativeClientCreateConnection = C1823b.f8020d ? JNIBridge.nativeClientCreateConnection(strM6479a, "custom", str, r11) : 0L;
            if (jNativeClientCreateConnection == 0) {
                C1815a.m6247d("DEBUG", "skip custom log: " + str);
                return false;
            }
            j5 = jNativeClientCreateConnection;
        } else {
            if (m6502a(m6547h(), str, (boolean) r11)) {
                return false;
            }
            C1828g.m6644a();
            m6496a(false);
            j5 = 0;
        }
        synchronized (f8098p) {
            z3 = r11;
            zM6499a = m6499a(strM6479a, j5, stringBuffer, str, j4, arrayList, arrayList2, arrayList3, str2);
        }
        if (zM6499a && !z4) {
            m6517b(m6547h(), str, z3);
        }
        if (j5 != 0) {
            JNIBridge.nativeClientCloseConnection(j5);
        }
        if (!zM6499a) {
            return false;
        }
        if (!z4) {
            m6567q(strM6479a);
        }
        if (!z4) {
            strM6479a = m6479a(m6556l(strM6479a));
        }
        m6516b(strM6479a, str);
        if (!z3 || z4) {
            return true;
        }
        try {
            m6504a(true, false);
            return true;
        } catch (Throwable th) {
            C1821g.m6293a(th);
            return true;
        }
    }

    /* renamed from: a */
    static boolean m6502a(String str, String str2, boolean z3) {
        if (!m6561n(str2)) {
            return false;
        }
        C1822h.m6335a(str, str2, true, z3);
        C1815a.m6244b(String.format(Locale.US, "Custom log '%s' has reach max count!", str2));
        return true;
    }

    /* renamed from: a */
    private static void m6487a(a aVar, String str, long j4) {
        String strNativeDumpThreads;
        String str2 = null;
        if (C1823b.f8020d) {
            try {
                aVar.flush();
            } catch (Throwable th) {
                C1821g.m6293a(th);
            }
            strNativeDumpThreads = JNIBridge.nativeDumpThreads(str, j4);
            if (f8084af || strNativeDumpThreads == null || strNativeDumpThreads.length() >= 512 || !strNativeDumpThreads.startsWith("/") || strNativeDumpThreads.indexOf(10) >= 0) {
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
                C1821g.m6293a(th2);
            }
            m6488a((OutputStream) aVar);
        } else if (str2 != null && !f8084af) {
            m6506b(aVar, str2, LogType.ANR);
            File file = new File(str2);
            if (file.exists()) {
                file.delete();
            }
        }
        try {
            aVar.flush();
        } catch (Throwable th3) {
            C1821g.m6293a(th3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m6499a(java.lang.String r18, long r19, java.lang.StringBuffer r21, java.lang.String r22, long r23, java.util.ArrayList<java.lang.String> r25, java.util.ArrayList<java.lang.String> r26, java.util.ArrayList<java.lang.String> r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p068uc.crashsdk.C1826e.m6499a(java.lang.String, long, java.lang.StringBuffer, java.lang.String, long, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static void m6491a(String str, boolean z3) {
        if (z3) {
            f8106x = str;
            return;
        }
        synchronized (f8107y) {
            f8105w = str;
            C1816b.m6250a(C1823b.m6415f(), str + "\n");
        }
    }

    /* renamed from: a */
    private static String m6482a(Date date) {
        return String.format(Locale.US, "%d%02d%02d%02d%02d%02d", Integer.valueOf(date.getYear() + LunarCalendarUtils.MIN_YEAR), Integer.valueOf(date.getMonth() + 1), Integer.valueOf(date.getDate()), Integer.valueOf(date.getHours()), Integer.valueOf(date.getMinutes()), Integer.valueOf(date.getSeconds()));
    }

    /* renamed from: a */
    static void m6490a(OutputStream outputStream, String str, String str2, int i4, boolean z3, boolean z4) {
        f8090h = false;
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
            C1821g.m6293a(th);
        }
        f8090h = true;
        m6488a(outputStream);
    }

    /* renamed from: a */
    static void m6489a(OutputStream outputStream, String str, String str2) {
        f8090h = false;
        try {
            outputStream.write(String.format(Locale.US, "$^%s`%s^$", str, str2).getBytes("UTF-8"));
        } catch (Throwable th) {
            C1821g.m6293a(th);
        }
        f8090h = true;
    }

    /* renamed from: a */
    public static void m6485a(Context context) {
        try {
            if (m6468U()) {
                context.registerReceiver(new c((byte) 0), new IntentFilter("android.intent.action.ANR"), null, C1820f.m6275a(3));
            }
        } catch (Throwable th) {
            C1821g.m6293a(th);
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
    public final void m6578a(java.lang.Thread r20, java.lang.Throwable r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 1624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p068uc.crashsdk.C1826e.m6578a(java.lang.Thread, java.lang.Throwable, boolean):void");
    }

    /* renamed from: a */
    private static void m6493a(Throwable th) {
        try {
            C1815a.m6247d("DEBUG", m6483a(th.getStackTrace(), (String) null).toString());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m6495a(Calendar calendar) {
        if (C1828g.m6632Q()) {
            long timeInMillis = calendar.getTimeInMillis();
            calendar.add(5, 1);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            long timeInMillis2 = calendar.getTimeInMillis();
            long j4 = timeInMillis2 - timeInMillis;
            C1820f.m6280a(0, new RunnableC1819e(415, new Object[]{Long.valueOf(timeInMillis2)}), j4 <= 3600000 ? 1000 + j4 : 3600000L);
        }
    }

    /* renamed from: a */
    static StringBuilder m6483a(StackTraceElement[] stackTraceElementArr, String str) {
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
                    z3 = true;
                    i5 = 0;
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
    public static boolean m6498a(ParcelFileDescriptor parcelFileDescriptor) {
        if (f8083ae) {
            C1815a.m6247d("crashsdk", "Can not call setHostFd and getHostFd in the same process!");
            return false;
        }
        if (!C1823b.f8020d) {
            C1815a.m6247d("crashsdk", "Crash so is not loaded!");
            return false;
        }
        if (f8082ad != null) {
            C1815a.m6246c("crashsdk", "Has already set host fd!");
        }
        f8082ad = parcelFileDescriptor;
        int fd = parcelFileDescriptor.getFd();
        int iNativeCmd = (int) JNIBridge.nativeCmd(13, fd, null, null);
        f8084af = iNativeCmd != -1;
        return fd == -1 || iNativeCmd != -1;
    }
}
