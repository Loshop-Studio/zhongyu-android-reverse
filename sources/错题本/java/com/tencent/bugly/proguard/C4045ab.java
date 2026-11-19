package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import androidx.core.os.EnvironmentCompat;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.ab */
/* loaded from: classes3.dex */
public final class C4045ab {

    /* renamed from: a */
    private static final ArrayList<AbstractC4095c> f3457a = new ArrayList<AbstractC4095c>() { // from class: com.tencent.bugly.proguard.ab.1
        {
            add(new C4120k0());
            add(new C4102e0());
            add(new C4105f0());
            add(new C4122l0());
            add(new C4108g0());
            add(new C4111h0());
            add(new C4117j0());
            add(new C4099d0());
            add(new C4114i0());
            add(new C4042a0());
            add(new C4096c0());
            add(new C4071b0());
        }
    };

    /* renamed from: b */
    private static final Map<Integer, String> f3458b = new HashMap<Integer, String>() { // from class: com.tencent.bugly.proguard.ab.2
        {
            put(1, "GPRS");
            put(2, "EDGE");
            put(3, "UMTS");
            put(8, "HSDPA");
            put(9, "HSUPA");
            put(10, "HSPA");
            put(4, "CDMA");
            put(5, "EVDO_0");
            put(6, "EVDO_A");
            put(7, "1xRTT");
            put(11, "iDen");
            put(12, "EVDO_B");
            put(13, "LTE");
            put(14, "eHRPD");
            put(15, "HSPA+");
        }
    };

    /* renamed from: c */
    private static final String[] f3459c = {"/su", "/su/bin/su", "/sbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/data/local/su", "/system/xbin/su", "/system/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/system/bin/cufsdosck", "/system/xbin/cufsdosck", "/system/bin/cufsmgr", "/system/xbin/cufsmgr", "/system/bin/cufaevdd", "/system/xbin/cufaevdd", "/system/bin/conbb", "/system/xbin/conbb"};

    /* renamed from: a */
    public static String m2927a() {
        try {
            return Build.MODEL;
        } catch (Throwable th) {
            if (C4055al.m3022a(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    /* renamed from: b */
    public static String m2930b() {
        try {
            return Build.VERSION.RELEASE;
        } catch (Throwable th) {
            if (C4055al.m3022a(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    /* renamed from: c */
    public static int m2931c() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Throwable th) {
            if (C4055al.m3022a(th)) {
                return -1;
            }
            th.printStackTrace();
            return -1;
        }
    }

    /* renamed from: d */
    public static String m2933d() {
        try {
            return String.valueOf(System.getProperty("os.arch"));
        } catch (Throwable th) {
            if (C4055al.m3022a(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    /* renamed from: e */
    public static long m2934e() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable th) {
            if (C4055al.m3022a(th)) {
                return -1L;
            }
            th.printStackTrace();
            return -1L;
        }
    }

    /* renamed from: f */
    public static long m2935f() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable th) {
            if (C4055al.m3022a(th)) {
                return -1L;
            }
            th.printStackTrace();
            return -1L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        r0 = java.lang.Long.parseLong(r2.replaceAll("[^\\d]", ""));
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m2936g() {
        /*
            r0 = 0
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3a
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3a
            java.lang.String r5 = "/proc/self/status"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = r3.readLine()     // Catch: java.lang.Throwable -> L2a
        L13:
            if (r2 == 0) goto L31
            java.lang.String r4 = "VmSize"
            boolean r4 = r2.startsWith(r4)     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L2c
            java.lang.String r4 = "[^\\d]"
            java.lang.String r5 = ""
            java.lang.String r2 = r2.replaceAll(r4, r5)     // Catch: java.lang.Throwable -> L2a
            long r0 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> L2a
            goto L31
        L2a:
            r2 = move-exception
            goto L3e
        L2c:
            java.lang.String r2 = r3.readLine()     // Catch: java.lang.Throwable -> L2a
            goto L13
        L31:
            r3.close()     // Catch: java.lang.Throwable -> L35
            goto L44
        L35:
            r2 = move-exception
            r2.printStackTrace()
            goto L44
        L3a:
            r3 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
        L3e:
            com.tencent.bugly.proguard.C4055al.m3022a(r2)     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L44
            goto L31
        L44:
            r2 = 1024(0x400, double:5.06E-321)
            long r0 = r0 * r2
            return r0
        L48:
            r0 = move-exception
            if (r3 == 0) goto L53
            r3.close()     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r1 = move-exception
            r1.printStackTrace()
        L53:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C4045ab.m2936g():long");
    }

    /* renamed from: h */
    public static long m2937h() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    /* renamed from: i */
    public static long m2938i() throws IOException {
        FileReader fileReader;
        Throwable th;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader("/proc/meminfo");
            try {
                bufferedReader = new BufferedReader(fileReader, 2048);
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        long j7 = Long.parseLong(line.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * 1024;
                        try {
                            bufferedReader.close();
                        } catch (IOException e) {
                            if (!C4055al.m3022a(e)) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e4) {
                            if (!C4055al.m3022a(e4)) {
                                e4.printStackTrace();
                            }
                        }
                        return j7;
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException e8) {
                        if (!C4055al.m3022a(e8)) {
                            e8.printStackTrace();
                        }
                    }
                    try {
                        fileReader.close();
                        return -1L;
                    } catch (IOException e9) {
                        if (C4055al.m3022a(e9)) {
                            return -1L;
                        }
                        e9.printStackTrace();
                        return -1L;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (!C4055al.m3022a(th)) {
                            th.printStackTrace();
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e10) {
                                if (!C4055al.m3022a(e10)) {
                                    e10.printStackTrace();
                                }
                            }
                        }
                        if (fileReader == null) {
                            return -2L;
                        }
                        try {
                            fileReader.close();
                            return -2L;
                        } catch (IOException e11) {
                            if (C4055al.m3022a(e11)) {
                                return -2L;
                            }
                            e11.printStackTrace();
                            return -2L;
                        }
                    } catch (Throwable th3) {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e12) {
                                if (!C4055al.m3022a(e12)) {
                                    e12.printStackTrace();
                                }
                            }
                        }
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (IOException e13) {
                                if (!C4055al.m3022a(e13)) {
                                    e13.printStackTrace();
                                }
                            }
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
            }
        } catch (Throwable th5) {
            fileReader = null;
            th = th5;
            bufferedReader = null;
        }
    }

    /* renamed from: j */
    public static long m2939j() throws IOException {
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("/proc/meminfo");
            try {
                BufferedReader bufferedReader2 = new BufferedReader(fileReader, 2048);
                try {
                    bufferedReader2.readLine();
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e) {
                            if (!C4055al.m3022a(e)) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e4) {
                            if (!C4055al.m3022a(e4)) {
                                e4.printStackTrace();
                            }
                        }
                        return -1L;
                    }
                    long j7 = Long.parseLong(line.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * 1024;
                    String line2 = bufferedReader2.readLine();
                    if (line2 == null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e8) {
                            if (!C4055al.m3022a(e8)) {
                                e8.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e9) {
                            if (!C4055al.m3022a(e9)) {
                                e9.printStackTrace();
                            }
                        }
                        return -1L;
                    }
                    long j8 = (Long.parseLong(line2.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * 1024) + j7;
                    String line3 = bufferedReader2.readLine();
                    if (line3 == null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e10) {
                            if (!C4055al.m3022a(e10)) {
                                e10.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e11) {
                            if (!C4055al.m3022a(e11)) {
                                e11.printStackTrace();
                            }
                        }
                        return -1L;
                    }
                    long j9 = (Long.parseLong(line3.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * 1024) + j8;
                    try {
                        bufferedReader2.close();
                    } catch (IOException e12) {
                        if (!C4055al.m3022a(e12)) {
                            e12.printStackTrace();
                        }
                    }
                    try {
                        fileReader.close();
                    } catch (IOException e13) {
                        if (!C4055al.m3022a(e13)) {
                            e13.printStackTrace();
                        }
                    }
                    return j9;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    try {
                        if (!C4055al.m3022a(th)) {
                            th.printStackTrace();
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e14) {
                                if (!C4055al.m3022a(e14)) {
                                    e14.printStackTrace();
                                }
                            }
                        }
                        if (fileReader == null) {
                            return -2L;
                        }
                        try {
                            fileReader.close();
                            return -2L;
                        } catch (IOException e15) {
                            if (C4055al.m3022a(e15)) {
                                return -2L;
                            }
                            e15.printStackTrace();
                            return -2L;
                        }
                    } catch (Throwable th2) {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e16) {
                                if (!C4055al.m3022a(e16)) {
                                    e16.printStackTrace();
                                }
                            }
                        }
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (IOException e17) {
                                if (!C4055al.m3022a(e17)) {
                                    e17.printStackTrace();
                                }
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            fileReader = null;
        }
    }

    /* renamed from: k */
    public static long m2940k() {
        if (!m2948s()) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable th) {
            if (C4055al.m3022a(th)) {
                return -2L;
            }
            th.printStackTrace();
            return -2L;
        }
    }

    /* renamed from: l */
    public static long m2941l() {
        if (!m2948s()) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable th) {
            if (C4055al.m3022a(th)) {
                return -2L;
            }
            th.printStackTrace();
            return -2L;
        }
    }

    /* renamed from: m */
    public static String m2942m() {
        return "";
    }

    /* renamed from: n */
    public static String m2943n() {
        ArrayList<AbstractC4095c> arrayList = f3457a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            AbstractC4095c abstractC4095c = arrayList.get(i);
            i++;
            String strMo2881a = abstractC4095c.mo2881a();
            if (!TextUtils.isEmpty(strMo2881a)) {
                return strMo2881a;
            }
        }
        return null;
    }

    /* renamed from: o */
    public static boolean m2944o() {
        String strM3060a = C4059ap.m3060a("ro.build.version.opporom");
        return !TextUtils.isEmpty((C4059ap.m3084b(strM3060a) || strM3060a.equals("fail")) ? null : "Oppo/COLOROS/".concat(strM3060a));
    }

    /* renamed from: p */
    public static boolean m2945p() {
        String strM3060a = C4059ap.m3060a("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty((C4059ap.m3084b(strM3060a) || strM3060a.equals("fail")) ? null : "vivo/FUNTOUCH/".concat(strM3060a));
    }

    /* renamed from: q */
    public static boolean m2946q() {
        boolean z8;
        String[] strArr = f3459c;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z8 = false;
                break;
            }
            if (new File(strArr[i]).exists()) {
                z8 = true;
                break;
            }
            i++;
        }
        String str = Build.TAGS;
        return (str != null && str.contains("test-keys")) || z8;
    }

    /* renamed from: r */
    public static boolean m2947r() {
        float fMaxMemory = (float) ((Runtime.getRuntime().maxMemory() * 1.0d) / 1048576.0d);
        float f = (float) ((Runtime.getRuntime().totalMemory() * 1.0d) / 1048576.0d);
        float f7 = fMaxMemory - f;
        C4055al.m3025c("maxMemory : %f", Float.valueOf(fMaxMemory));
        C4055al.m3025c("totalMemory : %f", Float.valueOf(f));
        C4055al.m3025c("freeMemory : %f", Float.valueOf(f7));
        return f7 < 10.0f;
    }

    /* renamed from: s */
    private static boolean m2948s() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Throwable th) {
            if (C4055al.m3022a(th)) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    public static String m2932c(Context context) {
        TelephonyManager telephonyManager;
        String str = EnvironmentCompat.MEDIA_UNKNOWN;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI";
            }
            if (activeNetworkInfo.getType() != 0 || (telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)) == null) {
                return EnvironmentCompat.MEDIA_UNKNOWN;
            }
            int networkType = telephonyManager.getNetworkType();
            String str2 = f3458b.get(Integer.valueOf(networkType));
            if (str2 != null) {
                return str2;
            }
            try {
                return "MOBILE(" + networkType + ")";
            } catch (Exception e) {
                e = e;
                str = str2;
                if (!C4055al.m3022a(e)) {
                    e.printStackTrace();
                }
                return str;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    /* renamed from: a */
    public static String m2928a(Context context) {
        if (context != null && context.getApplicationInfo() != null) {
            String str = context.getApplicationInfo().nativeLibraryDir;
            if (!TextUtils.isEmpty(str)) {
                if (str.endsWith("arm")) {
                    return "armeabi-v7a";
                }
                if (str.endsWith("arm64")) {
                    return "arm64-v8a";
                }
                if (str.endsWith("x86")) {
                    return "x86";
                }
                if (str.endsWith("x86_64")) {
                    return "x86_64";
                }
                return "fail";
            }
            return "fail";
        }
        return "fail";
    }

    /* renamed from: b */
    public static long m2929b(Context context) {
        long pss;
        ActivityManager activityManager;
        try {
            activityManager = (ActivityManager) context.getSystemService("activity");
        } catch (Throwable unused) {
            pss = Debug.getPss();
        }
        if (activityManager == null) {
            return 0L;
        }
        pss = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPss();
        return pss * 1024;
    }
}
