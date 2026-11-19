package com.p040uc.crashsdk;

import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDelegate;
import com.p040uc.crashsdk.export.CustomInfo;
import com.p040uc.crashsdk.export.ExitType;
import com.p040uc.crashsdk.export.VersionInfo;
import com.p040uc.crashsdk.p041a.C3299a;
import com.p040uc.crashsdk.p041a.C3305g;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.lang.reflect.Field;
import java.util.zip.ZipFile;

/* renamed from: com.uc.crashsdk.g */
/* loaded from: classes2.dex */
public class C3312g {

    /* renamed from: a */
    public static RuntimeException f1540a = null;

    /* renamed from: b */
    public static RuntimeException f1541b = null;

    /* renamed from: c */
    static final /* synthetic */ boolean f1542c = true;

    /* renamed from: d */
    private static CustomInfo f1543d;

    /* renamed from: e */
    private static VersionInfo f1544e;

    /* renamed from: g */
    private static String f1546g;

    /* renamed from: h */
    private static String f1547h;

    /* renamed from: i */
    private static String f1548i;

    /* renamed from: j */
    private static String f1549j;

    /* renamed from: f */
    private static final Object f1545f = new Object();

    /* renamed from: k */
    private static final Object f1550k = new Object();

    /* renamed from: A */
    public static long m2693A() {
        return f1543d.mMaxUploadBytesPerDay;
    }

    /* renamed from: B */
    public static int m2694B() {
        return f1543d.mMaxUploadBuiltinLogCountPerDay;
    }

    /* renamed from: C */
    public static int m2695C() {
        return f1543d.mMaxUploadCustomLogCountPerDay;
    }

    /* renamed from: D */
    public static int m2696D() {
        return f1543d.mMaxCustomLogCountPerTypePerDay;
    }

    /* renamed from: E */
    public static int m2697E() {
        return f1543d.mInfoUpdateInterval;
    }

    /* renamed from: F */
    public static int m2698F() {
        return f1543d.mInfoSaveFrequency;
    }

    /* renamed from: G */
    public static int m2699G() {
        return f1543d.mReservedJavaFileHandleCount;
    }

    /* renamed from: H */
    public static int m2700H() {
        return f1543d.mFdDumpMinLimit;
    }

    /* renamed from: I */
    public static int m2701I() {
        return f1543d.mThreadsDumpMinLimit;
    }

    /* renamed from: J */
    public static boolean m2702J() {
        return f1543d.mAutoDetectLifeCycle;
    }

    /* renamed from: K */
    public static boolean m2703K() {
        return f1543d.mMonitorBattery;
    }

    /* renamed from: L */
    public static int m2704L() {
        return f1543d.mAnrTraceStrategy;
    }

    /* renamed from: M */
    public static boolean m2705M() {
        CustomInfo customInfo = f1543d;
        return customInfo == null || customInfo.mDebug;
    }

    /* renamed from: N */
    public static boolean m2706N() {
        CustomInfo customInfo = f1543d;
        return customInfo == null || customInfo.mPrintStackInfos;
    }

    /* renamed from: O */
    public static boolean m2707O() {
        return f1543d.mEnableStatReport;
    }

    /* renamed from: P */
    public static boolean m2708P() {
        return f1543d.mIsInternational;
    }

    /* renamed from: Q */
    public static boolean m2709Q() {
        return f1543d.mAddPvForNewDay;
    }

    /* renamed from: R */
    public static String m2710R() {
        return C3305g.m2375a(f1544e.mVersion) ? C3298a.m2286a() : m2720a(f1544e.mVersion);
    }

    /* renamed from: S */
    public static String m2711S() {
        return C3305g.m2375a(f1544e.mSubVersion) ? "release" : f1544e.mSubVersion;
    }

    /* renamed from: T */
    public static String m2712T() {
        return C3305g.m2375a(f1544e.mBuildId) ? m2716X() : m2720a(f1544e.mBuildId);
    }

    /* renamed from: U */
    public static String m2713U() {
        if (f1547h == null) {
            f1547h = C3305g.m2377b() + File.separatorChar + f1543d.mTagFilesFolderName + File.separatorChar;
        }
        return f1547h;
    }

    /* renamed from: V */
    public static String m2714V() {
        if (f1548i == null) {
            f1548i = C3305g.m2377b() + File.separatorChar + f1543d.mCrashLogsFolderName + File.separatorChar;
        }
        return f1548i;
    }

    /* renamed from: W */
    public static String m2715W() {
        if (f1549j == null) {
            if (C3305g.m2375a(f1543d.mLogsBackupPathName)) {
                f1549j = (C3305g.m2377b() + File.separatorChar + "msdb" + File.separatorChar) + File.separatorChar + f1543d.mCrashLogsFolderName + File.separatorChar;
            } else {
                String strTrim = f1543d.mLogsBackupPathName.trim();
                String str = File.separator;
                if (!strTrim.endsWith(str)) {
                    strTrim = strTrim + str;
                }
                f1549j = strTrim;
            }
        }
        return f1549j;
    }

    /* renamed from: X */
    private static String m2716X() {
        ZipFile zipFile;
        Throwable th;
        String str = f1546g;
        if (str != null) {
            return str;
        }
        try {
            try {
                zipFile = new ZipFile(C3305g.m2382c());
                try {
                    f1546g = Long.toHexString(zipFile.getEntry("classes.dex").getCrc());
                    C3299a.m2319a("crashsdk", "version unique build id: " + f1546g);
                    zipFile.close();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        f1546g = "";
                        C3305g.m2370a(th);
                        if (zipFile != null) {
                            zipFile.close();
                        }
                        return f1546g;
                    } catch (Throwable th3) {
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th3;
                    }
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable th4) {
            zipFile = null;
            th = th4;
        }
        return f1546g;
    }

    /* renamed from: Y */
    private static void m2717Y() {
        if (C3307b.f1428d) {
            JNIBridge.nativeSet(24, 1L, C3298a.f1310b, null);
        }
    }

    /* renamed from: a */
    public static void m2723a(CustomInfo customInfo, VersionInfo versionInfo) {
        CustomInfo customInfo2 = new CustomInfo(customInfo);
        f1543d = customInfo2;
        m2729c(customInfo2);
        if (!f1543d.mZipLog) {
            f1540a = new RuntimeException("initialize set mZipLog to false, info.mZipLog: " + customInfo.mZipLog);
        }
        if (f1543d.mEncryptLog) {
            f1541b = new RuntimeException("initialize set mEncryptLog to true, info.mEncryptLog: " + customInfo.mEncryptLog);
        }
        f1544e = new VersionInfo(versionInfo);
        if (C3307b.m2453I()) {
            return;
        }
        try {
            m2721a();
        } catch (Throwable th) {
            C3305g.m2370a(th);
        }
    }

    /* renamed from: b */
    public static void m2727b() {
        JNIBridge.set(ExitType.UNEXP_REASON_ANR, C3305g.m2377b());
        JNIBridge.set(104, f1543d.mTagFilesFolderName);
        JNIBridge.set(ExitType.UNEXP_REASON_KILL_PROCESS, f1543d.mCrashLogsFolderName);
        JNIBridge.set(ExitType.UNEXP_REASON_RESTART, m2715W());
        JNIBridge.set(ExitType.UNEXP_REASON_LOW_MEMORY, C3310e.m2624h());
        JNIBridge.set(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, C3307b.m2472a());
        JNIBridge.set(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, m2710R());
        JNIBridge.set(UMErrorCode.E_UM_BE_JSON_FAILED, m2711S());
        JNIBridge.set(UMErrorCode.E_UM_BE_CREATE_FAILED, m2712T());
        JNIBridge.set(UMErrorCode.E_UM_BE_DEFLATE_FAILED, "210105150455");
        JNIBridge.set(116, Build.MODEL);
        JNIBridge.set(117, Build.VERSION.RELEASE);
        JNIBridge.set(118, C3310e.m2641p());
        JNIBridge.set(5, f1543d.mCallNativeDefaultHandler);
        JNIBridge.set(6, f1543d.mDumpUserSolibBuildId);
        JNIBridge.set(7, f1543d.mReservedNativeMemoryBytes);
        JNIBridge.set(100, f1543d.mNativeCrashLogFileName);
        JNIBridge.set(101, f1543d.mUnexpCrashLogFileName);
        JNIBridge.set(102, f1543d.mAppId);
    }

    /* renamed from: c */
    private static void m2729c(CustomInfo customInfo) {
        if (customInfo.mZippedLogExtension == null) {
            customInfo.mZippedLogExtension = "";
        }
        if (customInfo.mZippedLogExtension.equals(".tmp")) {
            throw new IllegalArgumentException("mZippedLogExtension can not be '.tmp'!");
        }
        if (customInfo.mOmitJavaCrash) {
            customInfo.mCallJavaDefaultHandler = false;
        }
        if (customInfo.mOmitNativeCrash) {
            customInfo.mCallNativeDefaultHandler = false;
        }
        long jM2585b = C3310e.m2585b();
        if (jM2585b >= 1) {
            customInfo.mMaxBuiltinLogFilesCount = 200;
            customInfo.mMaxCustomLogFilesCount = 100;
            customInfo.mMaxUploadBytesPerDay = 268435456L;
            customInfo.mMaxUploadBuiltinLogCountPerDay = 2000;
            customInfo.mMaxUploadCustomLogCountPerDay = 2000;
            customInfo.mMaxCustomLogCountPerTypePerDay = 100;
            customInfo.mMaxAnrLogCountPerProcess = 100;
            customInfo.mAnrTraceStrategy = 2;
            if (jM2585b >= 2) {
                customInfo.mSyncUploadSetupCrashLogs = true;
                customInfo.mSyncUploadLogs = true;
                if (jM2585b >= 3) {
                    customInfo.mBackupLogs = true;
                    customInfo.mPrintStackInfos = true;
                    customInfo.mDebug = true;
                }
            }
        }
    }

    /* renamed from: d */
    public static void m2730d() {
        JNIBridge.set(23, f1543d.mIsInternational);
        if (C3307b.m2449E()) {
            JNIBridge.set(34, true);
        }
        if (C3310e.m2628i()) {
            JNIBridge.set(1, true);
        }
        JNIBridge.set(10, f1543d.mFdDumpMinLimit);
        JNIBridge.nativeCmd(3, f1543d.mReservedNativeFileHandleCount, null, null);
        JNIBridge.nativeSetForeground(C3307b.m2511y());
        JNIBridge.set(2, C3307b.m2447C());
        C3298a.m2306e();
        C3298a.m2308g();
        C3298a.m2310i();
        C3298a.m2312k();
        JNIBridge.set(UMErrorCode.E_UM_BE_RAW_OVERSIZE, C3298a.f1309a);
        JNIBridge.cmd(1);
        JNIBridge.set(22, f1543d.mThreadsDumpMinLimit);
        JNIBridge.set(122, C3298a.m2286a());
        JNIBridge.set(33, C3298a.m2303c());
        m2717Y();
        C3307b.m2452H();
        C3307b.m2445A();
        C3305g.m2394k();
    }

    /* renamed from: e */
    public static String m2731e() {
        return f1543d.mAppId;
    }

    /* renamed from: f */
    public static boolean m2732f() {
        if (C3305g.m2380b(f1543d.mJavaCrashLogFileName) || C3305g.m2380b(f1543d.mNativeCrashLogFileName)) {
            return true;
        }
        return C3305g.m2380b(f1543d.mUnexpCrashLogFileName);
    }

    /* renamed from: g */
    public static String m2733g() {
        return f1543d.mJavaCrashLogFileName;
    }

    /* renamed from: h */
    public static int m2734h() {
        return f1543d.mCrashRestartInterval;
    }

    /* renamed from: i */
    public static boolean m2735i() {
        return f1543d.mCallJavaDefaultHandler;
    }

    /* renamed from: j */
    public static boolean m2736j() {
        return f1543d.mDumpHprofDataForJavaOOM;
    }

    /* renamed from: k */
    public static boolean m2737k() {
        return f1543d.mRenameFileToDefaultName;
    }

    /* renamed from: l */
    public static int m2738l() {
        return f1543d.mMaxBuiltinLogFilesCount;
    }

    /* renamed from: m */
    public static int m2739m() {
        return f1543d.mMaxCustomLogFilesCount;
    }

    /* renamed from: n */
    public static int m2740n() {
        return f1543d.mMaxJavaLogcatLineCount;
    }

    /* renamed from: o */
    public static int m2741o() {
        return f1543d.mUnexpDelayMillSeconds;
    }

    /* renamed from: p */
    public static int m2742p() {
        return f1543d.mUnexpSubTypes;
    }

    /* renamed from: q */
    public static boolean m2743q() {
        return f1543d.mBackupLogs;
    }

    /* renamed from: r */
    public static boolean m2744r() {
        return f1543d.mSyncUploadSetupCrashLogs;
    }

    /* renamed from: s */
    public static boolean m2745s() {
        return f1543d.mSyncUploadLogs;
    }

    /* renamed from: t */
    public static boolean m2746t() {
        return f1543d.mOmitJavaCrash;
    }

    /* renamed from: u */
    public static boolean m2747u() {
        return f1543d.mAutoDeleteOldVersionStats;
    }

    /* renamed from: v */
    public static boolean m2748v() {
        return f1543d.mZipLog;
    }

    /* renamed from: w */
    public static String m2749w() {
        return f1543d.mZippedLogExtension;
    }

    /* renamed from: x */
    public static boolean m2750x() {
        return f1543d.mEncryptLog;
    }

    /* renamed from: y */
    public static int m2751y() {
        return f1543d.mLogMaxBytesLimit;
    }

    /* renamed from: z */
    public static int m2752z() {
        return f1543d.mLogMaxUploadBytesLimit;
    }

    /* renamed from: a */
    public static void m2722a(CustomInfo customInfo) {
        boolean z3 = f1542c;
        if (!z3 && customInfo.mTagFilesFolderName == null) {
            throw new AssertionError();
        }
        if (!z3 && customInfo.mCrashLogsFolderName == null) {
            throw new AssertionError();
        }
        if (customInfo.mTagFilesFolderName.equals(customInfo.mCrashLogsFolderName)) {
            throw new IllegalArgumentException("mTagFilesFolderName and mCrashLogsFolderName can not be set to the same!");
        }
    }

    /* renamed from: a */
    public static void m2724a(VersionInfo versionInfo) {
        synchronized (f1545f) {
            f1544e = new VersionInfo(versionInfo);
            C3310e.m2599c();
            if (C3307b.f1428d) {
                JNIBridge.set(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, m2710R());
                JNIBridge.set(UMErrorCode.E_UM_BE_JSON_FAILED, m2711S());
                JNIBridge.set(UMErrorCode.E_UM_BE_CREATE_FAILED, m2712T());
                JNIBridge.set(UMErrorCode.E_UM_BE_DEFLATE_FAILED, "210105150455");
                JNIBridge.cmd(2);
            }
        }
    }

    /* renamed from: a */
    public static void m2721a() {
        C3307b.m2508v();
        C3307b.m2507u();
        if (f1543d.mBackupLogs) {
            File file = new File(m2715W());
            if (file.exists()) {
                return;
            }
            file.mkdirs();
        }
    }

    /* renamed from: b */
    public static int m2726b(CustomInfo customInfo) {
        int i4;
        int i5;
        boolean z3;
        synchronized (f1550k) {
            i4 = 0;
            if (customInfo != null) {
                m2729c(customInfo);
                if (f1543d == null) {
                    f1543d = new CustomInfo();
                }
                CustomInfo customInfo2 = f1543d;
                boolean z4 = true;
                if (m2725a(customInfo.mAppId, customInfo2.mAppId)) {
                    i5 = 0;
                } else {
                    String str = customInfo.mAppId;
                    customInfo2.mAppId = str;
                    if (C3307b.f1428d) {
                        JNIBridge.set(102, str);
                    }
                    i5 = 1;
                }
                int i6 = i5;
                if (!m2725a(customInfo.mJavaCrashLogFileName, customInfo2.mJavaCrashLogFileName)) {
                    customInfo2.mJavaCrashLogFileName = customInfo.mJavaCrashLogFileName;
                    i5++;
                }
                if (!m2725a(customInfo.mNativeCrashLogFileName, customInfo2.mNativeCrashLogFileName)) {
                    String str2 = customInfo.mNativeCrashLogFileName;
                    customInfo2.mNativeCrashLogFileName = str2;
                    if (C3307b.f1428d) {
                        JNIBridge.set(100, str2);
                    }
                    i5++;
                    i6 = 1;
                }
                if (!m2725a(customInfo.mUnexpCrashLogFileName, customInfo2.mUnexpCrashLogFileName)) {
                    String str3 = customInfo.mUnexpCrashLogFileName;
                    customInfo2.mUnexpCrashLogFileName = str3;
                    if (C3307b.f1428d) {
                        JNIBridge.set(101, str3);
                    }
                    i5++;
                    i6 = 1;
                }
                if (i6 != 0) {
                    C3310e.m2599c();
                    if (C3307b.f1428d) {
                        JNIBridge.cmd(2);
                    }
                }
                boolean z5 = customInfo2.mPrintStackInfos;
                boolean z6 = customInfo.mPrintStackInfos;
                if (z5 != z6) {
                    customInfo2.mPrintStackInfos = z6;
                    if (C3307b.f1428d) {
                        JNIBridge.set(11, z6);
                    }
                    i5++;
                }
                boolean z7 = customInfo2.mDebug;
                boolean z8 = customInfo.mDebug;
                if (z7 != z8) {
                    customInfo2.mDebug = z8;
                    if (C3307b.f1428d) {
                        JNIBridge.set(18, z8);
                    }
                    i5++;
                }
                boolean z9 = customInfo2.mBackupLogs;
                boolean z10 = customInfo.mBackupLogs;
                if (z9 != z10) {
                    customInfo2.mBackupLogs = z10;
                    if (C3307b.f1428d) {
                        JNIBridge.set(12, z10);
                    }
                    i5++;
                }
                boolean z11 = customInfo2.mOmitNativeCrash;
                boolean z12 = customInfo.mOmitNativeCrash;
                if (z11 != z12) {
                    customInfo2.mOmitNativeCrash = z12;
                    if (C3307b.f1428d) {
                        JNIBridge.set(21, z12);
                    }
                    i5++;
                }
                int i7 = customInfo2.mCrashRestartInterval;
                int i8 = customInfo.mCrashRestartInterval;
                if (i7 != i8) {
                    customInfo2.mCrashRestartInterval = i8;
                    if (C3307b.f1428d) {
                        JNIBridge.set(13, i8);
                    }
                    if (customInfo2.mCrashRestartInterval >= 0) {
                        C3307b.m2454J();
                    }
                    i5++;
                }
                int i9 = customInfo2.mMaxBuiltinLogFilesCount;
                int i10 = customInfo.mMaxBuiltinLogFilesCount;
                if (i9 != i10) {
                    customInfo2.mMaxBuiltinLogFilesCount = i10;
                    if (C3307b.f1428d) {
                        JNIBridge.set(14, i10);
                    }
                    i5++;
                }
                int i11 = customInfo2.mMaxNativeLogcatLineCount;
                int i12 = customInfo.mMaxNativeLogcatLineCount;
                if (i11 != i12) {
                    customInfo2.mMaxNativeLogcatLineCount = i12;
                    if (C3307b.f1428d) {
                        JNIBridge.set(15, i12);
                    }
                    i5++;
                }
                int i13 = customInfo2.mMaxJavaLogcatLineCount;
                int i14 = customInfo.mMaxJavaLogcatLineCount;
                if (i13 != i14) {
                    customInfo2.mMaxJavaLogcatLineCount = i14;
                    i5++;
                }
                int i15 = customInfo2.mMaxUnexpLogcatLineCount;
                int i16 = customInfo.mMaxUnexpLogcatLineCount;
                if (i15 != i16) {
                    customInfo2.mMaxUnexpLogcatLineCount = i16;
                    if (C3307b.f1428d) {
                        JNIBridge.set(16, i16);
                    }
                    i5++;
                }
                int i17 = customInfo2.mMaxAnrLogcatLineCount;
                int i18 = customInfo.mMaxAnrLogcatLineCount;
                if (i17 != i18) {
                    customInfo2.mMaxAnrLogcatLineCount = i18;
                    if (C3307b.f1428d) {
                        JNIBridge.set(31, i18);
                    }
                    i5++;
                }
                boolean z13 = customInfo2.mZipLog;
                boolean z14 = customInfo.mZipLog;
                if (z13 != z14) {
                    customInfo2.mZipLog = z14;
                    if (!z14) {
                        C3299a.m2324d("DEBUG", "updateCustomInfoImpl set mZipLog to false");
                        f1540a = new RuntimeException("updateCustomInfoImpl set mZipLog to false");
                    }
                    i5++;
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (m2725a(customInfo.mZippedLogExtension, customInfo2.mZippedLogExtension)) {
                    z4 = z3;
                } else {
                    customInfo2.mZippedLogExtension = customInfo.mZippedLogExtension;
                    i5++;
                }
                if (z4 && C3307b.f1428d) {
                    JNIBridge.nativeSet(3, customInfo2.mZipLog ? 1L : 0L, customInfo2.mZippedLogExtension, null);
                }
                int i19 = customInfo2.mLogMaxBytesLimit;
                int i20 = customInfo.mLogMaxBytesLimit;
                if (i19 != i20) {
                    customInfo2.mLogMaxBytesLimit = i20;
                    if (C3307b.f1428d) {
                        JNIBridge.set(4, i20);
                    }
                    i5++;
                }
                boolean z15 = customInfo2.mEncryptLog;
                boolean z16 = customInfo.mEncryptLog;
                if (z15 != z16) {
                    customInfo2.mEncryptLog = z16;
                    if (z16) {
                        C3299a.m2324d("DEBUG", "updateCustomInfoImpl set mEncryptLog to true");
                        f1541b = new RuntimeException("updateCustomInfoImpl set mEncryptLog to true");
                    }
                    i5++;
                }
                boolean z17 = customInfo2.mSyncUploadSetupCrashLogs;
                boolean z18 = customInfo.mSyncUploadSetupCrashLogs;
                if (z17 != z18) {
                    customInfo2.mSyncUploadSetupCrashLogs = z18;
                    i5++;
                }
                boolean z19 = customInfo2.mSyncUploadLogs;
                boolean z20 = customInfo.mSyncUploadLogs;
                if (z19 != z20) {
                    customInfo2.mSyncUploadLogs = z20;
                    i5++;
                }
                int i21 = customInfo2.mMaxCustomLogFilesCount;
                int i22 = customInfo.mMaxCustomLogFilesCount;
                if (i21 != i22) {
                    customInfo2.mMaxCustomLogFilesCount = i22;
                    i5++;
                }
                boolean z21 = customInfo2.mOmitJavaCrash;
                boolean z22 = customInfo.mOmitJavaCrash;
                if (z21 != z22) {
                    customInfo2.mOmitJavaCrash = z22;
                    i5++;
                }
                int i23 = customInfo2.mLogMaxUploadBytesLimit;
                int i24 = customInfo.mLogMaxUploadBytesLimit;
                if (i23 != i24) {
                    customInfo2.mLogMaxUploadBytesLimit = i24;
                    i5++;
                }
                long j4 = customInfo2.mMaxUploadBytesPerDay;
                long j5 = customInfo.mMaxUploadBytesPerDay;
                if (j4 != j5) {
                    customInfo2.mMaxUploadBytesPerDay = j5;
                    i5++;
                }
                int i25 = customInfo2.mMaxUploadBuiltinLogCountPerDay;
                int i26 = customInfo.mMaxUploadBuiltinLogCountPerDay;
                if (i25 != i26) {
                    customInfo2.mMaxUploadBuiltinLogCountPerDay = i26;
                    i5++;
                }
                int i27 = customInfo2.mMaxUploadCustomLogCountPerDay;
                int i28 = customInfo.mMaxUploadCustomLogCountPerDay;
                if (i27 != i28) {
                    customInfo2.mMaxUploadCustomLogCountPerDay = i28;
                    i5++;
                }
                int i29 = customInfo2.mMaxCustomLogCountPerTypePerDay;
                int i30 = customInfo.mMaxCustomLogCountPerTypePerDay;
                if (i29 != i30) {
                    customInfo2.mMaxCustomLogCountPerTypePerDay = i30;
                    i5++;
                }
                int i31 = customInfo2.mMaxAnrLogCountPerProcess;
                int i32 = customInfo.mMaxAnrLogCountPerProcess;
                if (i31 != i32) {
                    customInfo2.mMaxAnrLogCountPerProcess = i32;
                    if (C3307b.f1428d) {
                        JNIBridge.set(32, f1543d.mMaxAnrLogCountPerProcess);
                    }
                    i5++;
                }
                boolean z23 = customInfo2.mCallJavaDefaultHandler;
                boolean z24 = customInfo.mCallJavaDefaultHandler;
                if (z23 != z24) {
                    customInfo2.mCallJavaDefaultHandler = z24;
                    i5++;
                }
                boolean z25 = customInfo2.mCallNativeDefaultHandler;
                boolean z26 = customInfo.mCallNativeDefaultHandler;
                if (z25 != z26) {
                    customInfo2.mCallNativeDefaultHandler = z26;
                    i5++;
                    if (C3307b.f1428d) {
                        JNIBridge.set(5, f1543d.mCallNativeDefaultHandler);
                    }
                }
                boolean z27 = customInfo2.mDumpUserSolibBuildId;
                boolean z28 = customInfo.mDumpUserSolibBuildId;
                if (z27 != z28) {
                    customInfo2.mDumpUserSolibBuildId = z28;
                    i5++;
                    if (C3307b.f1428d) {
                        JNIBridge.set(6, f1543d.mDumpUserSolibBuildId);
                    }
                }
                boolean z29 = customInfo2.mDumpHprofDataForJavaOOM;
                boolean z30 = customInfo.mDumpHprofDataForJavaOOM;
                if (z29 != z30) {
                    customInfo2.mDumpHprofDataForJavaOOM = z30;
                    i5++;
                }
                boolean z31 = customInfo2.mRenameFileToDefaultName;
                boolean z32 = customInfo.mRenameFileToDefaultName;
                if (z31 != z32) {
                    customInfo2.mRenameFileToDefaultName = z32;
                    i5++;
                }
                boolean z33 = customInfo2.mAutoDeleteOldVersionStats;
                boolean z34 = customInfo.mAutoDeleteOldVersionStats;
                if (z33 != z34) {
                    customInfo2.mAutoDeleteOldVersionStats = z34;
                    i5++;
                }
                int i33 = customInfo2.mFdDumpMinLimit;
                int i34 = customInfo.mFdDumpMinLimit;
                if (i33 != i34) {
                    customInfo2.mFdDumpMinLimit = i34;
                    if (C3307b.f1428d) {
                        JNIBridge.set(10, i34);
                    }
                    i5++;
                }
                int i35 = customInfo2.mThreadsDumpMinLimit;
                int i36 = customInfo.mThreadsDumpMinLimit;
                if (i35 != i36) {
                    customInfo2.mThreadsDumpMinLimit = i36;
                    if (C3307b.f1428d) {
                        JNIBridge.set(22, i36);
                    }
                    i5++;
                }
                int i37 = customInfo2.mInfoUpdateInterval;
                int i38 = customInfo.mInfoUpdateInterval;
                if (i37 != i38) {
                    if (i37 <= 0 && i38 > 0) {
                        C3298a.m2297a(false);
                    }
                    customInfo2.mInfoUpdateInterval = customInfo.mInfoUpdateInterval;
                    i5++;
                }
                int i39 = customInfo2.mInfoSaveFrequency;
                int i40 = customInfo.mInfoSaveFrequency;
                if (i39 != i40) {
                    customInfo2.mInfoSaveFrequency = i40;
                    i5++;
                }
                long j6 = customInfo2.mDisableBackgroundSignals;
                long j7 = customInfo.mDisableBackgroundSignals;
                if (j6 != j7) {
                    customInfo2.mDisableBackgroundSignals = j7;
                    if (C3307b.f1428d) {
                        JNIBridge.set(9, j7);
                    }
                    i5++;
                }
                boolean z35 = customInfo2.mEnableStatReport;
                boolean z36 = customInfo.mEnableStatReport;
                if (z35 != z36) {
                    customInfo2.mEnableStatReport = z36;
                    if (z36) {
                        C3310e.m2525A();
                    }
                    i5++;
                }
                boolean z37 = customInfo2.mIsInternational;
                boolean z38 = customInfo.mIsInternational;
                if (z37 != z38) {
                    customInfo2.mIsInternational = z38;
                    if (C3307b.f1428d) {
                        JNIBridge.set(23, z38);
                    }
                    i5++;
                }
                boolean z39 = customInfo2.mAutoDetectLifeCycle;
                boolean z40 = customInfo.mAutoDetectLifeCycle;
                if (z39 != z40) {
                    customInfo2.mAutoDetectLifeCycle = z40;
                    if (z40) {
                        C3307b.m2512z();
                    }
                    i5++;
                }
                boolean z41 = customInfo2.mMonitorBattery;
                boolean z42 = customInfo.mMonitorBattery;
                if (z41 != z42) {
                    customInfo2.mMonitorBattery = z42;
                    C3310e.m2601c(C3307b.m2511y());
                    i5++;
                }
                int i41 = customInfo2.mUnexpSubTypes;
                int i42 = customInfo.mUnexpSubTypes;
                if (i41 != i42) {
                    customInfo2.mUnexpSubTypes = i42;
                    i5++;
                }
                i4 = i5;
            }
        }
        return i4;
    }

    /* renamed from: c */
    public static void m2728c() {
        JNIBridge.set(11, m2706N());
        JNIBridge.set(12, f1543d.mBackupLogs);
        JNIBridge.set(13, f1543d.mCrashRestartInterval);
        JNIBridge.set(14, f1543d.mMaxBuiltinLogFilesCount);
        JNIBridge.set(15, f1543d.mMaxNativeLogcatLineCount);
        JNIBridge.set(16, f1543d.mMaxUnexpLogcatLineCount);
        JNIBridge.set(31, f1543d.mMaxAnrLogcatLineCount);
        JNIBridge.set(18, m2705M());
        JNIBridge.set(20, Build.VERSION.SDK_INT);
        JNIBridge.set(21, f1543d.mOmitNativeCrash);
        JNIBridge.set(32, f1543d.mMaxAnrLogCountPerProcess);
        JNIBridge.set(8, f1543d.mDisableSignals);
        JNIBridge.set(9, f1543d.mDisableBackgroundSignals);
        CustomInfo customInfo = f1543d;
        JNIBridge.nativeSet(3, customInfo.mZipLog ? 1L : 0L, customInfo.mZippedLogExtension, null);
        JNIBridge.set(4, f1543d.mLogMaxBytesLimit);
        JNIBridge.set(119, Build.FINGERPRINT);
    }

    /* renamed from: a */
    private static String m2720a(String str) {
        return (str == null || !str.contains("_")) ? str : str.replaceAll("_", "-");
    }

    /* renamed from: a */
    public static CustomInfo m2718a(CustomInfo customInfo, Bundle bundle) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        if (customInfo == null) {
            CustomInfo customInfo2 = f1543d;
            if (customInfo2 == null) {
                customInfo = new CustomInfo();
            } else {
                customInfo = new CustomInfo(customInfo2);
            }
        }
        Field[] fields = customInfo.getClass().getFields();
        for (String str : bundle.keySet()) {
            for (Field field : fields) {
                if (field.getName().equals(str)) {
                    Object obj = bundle.get(str);
                    try {
                        field.set(customInfo, obj);
                    } catch (Exception e4) {
                        C3305g.m2370a(e4);
                        StringBuilder sb = new StringBuilder("Field ");
                        sb.append(str);
                        sb.append(" must be a ");
                        sb.append(field.getType().getName());
                        sb.append(", but give a ");
                        sb.append(obj != null ? obj.getClass().getName() : "(null)");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
        return customInfo;
    }

    /* renamed from: a */
    public static VersionInfo m2719a(Bundle bundle) {
        VersionInfo versionInfo;
        VersionInfo versionInfo2 = f1544e;
        if (versionInfo2 == null) {
            versionInfo = new VersionInfo();
        } else {
            versionInfo = new VersionInfo(versionInfo2);
        }
        String string = bundle.getString("mVersion");
        if (!C3305g.m2375a(string)) {
            versionInfo.mVersion = string;
        }
        String string2 = bundle.getString("mSubVersion");
        if (!C3305g.m2375a(string2)) {
            versionInfo.mSubVersion = string2;
        }
        String string3 = bundle.getString("mBuildId");
        if (!C3305g.m2375a(string3)) {
            versionInfo.mBuildId = string3;
        }
        String string4 = bundle.getString("crver");
        if (!C3305g.m2375a(string4)) {
            C3298a.f1310b = string4;
            m2717Y();
        }
        return versionInfo;
    }

    /* renamed from: a */
    private static boolean m2725a(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }
}
