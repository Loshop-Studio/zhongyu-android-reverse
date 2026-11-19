package com.p068uc.crashsdk;

import android.os.Build;
import android.os.Bundle;
import com.p068uc.crashsdk.export.CustomInfo;
import com.p068uc.crashsdk.export.VersionInfo;
import com.p068uc.crashsdk.p069a.C1815a;
import com.p068uc.crashsdk.p069a.C1821g;
import com.xuexiang.xui.widget.picker.wheelview.timer.MessageHandler;
import java.io.File;
import java.lang.reflect.Field;
import java.util.zip.ZipFile;

/* renamed from: com.uc.crashsdk.g */
/* loaded from: classes.dex */
public class C1828g {

    /* renamed from: a */
    public static RuntimeException f8132a = null;

    /* renamed from: b */
    public static RuntimeException f8133b = null;

    /* renamed from: c */
    static final /* synthetic */ boolean f8134c = true;

    /* renamed from: d */
    private static CustomInfo f8135d;

    /* renamed from: e */
    private static VersionInfo f8136e;

    /* renamed from: g */
    private static String f8138g;

    /* renamed from: h */
    private static String f8139h;

    /* renamed from: i */
    private static String f8140i;

    /* renamed from: j */
    private static String f8141j;

    /* renamed from: f */
    private static final Object f8137f = new Object();

    /* renamed from: k */
    private static final Object f8142k = new Object();

    /* renamed from: A */
    static long m6616A() {
        return f8135d.mMaxUploadBytesPerDay;
    }

    /* renamed from: B */
    static int m6617B() {
        return f8135d.mMaxUploadBuiltinLogCountPerDay;
    }

    /* renamed from: C */
    static int m6618C() {
        return f8135d.mMaxUploadCustomLogCountPerDay;
    }

    /* renamed from: D */
    static int m6619D() {
        return f8135d.mMaxCustomLogCountPerTypePerDay;
    }

    /* renamed from: E */
    static int m6620E() {
        return f8135d.mInfoUpdateInterval;
    }

    /* renamed from: F */
    static int m6621F() {
        return f8135d.mInfoSaveFrequency;
    }

    /* renamed from: G */
    static int m6622G() {
        return f8135d.mReservedJavaFileHandleCount;
    }

    /* renamed from: H */
    static int m6623H() {
        return f8135d.mFdDumpMinLimit;
    }

    /* renamed from: I */
    static int m6624I() {
        return f8135d.mThreadsDumpMinLimit;
    }

    /* renamed from: J */
    static boolean m6625J() {
        return f8135d.mAutoDetectLifeCycle;
    }

    /* renamed from: K */
    static boolean m6626K() {
        return f8135d.mMonitorBattery;
    }

    /* renamed from: L */
    static int m6627L() {
        return f8135d.mAnrTraceStrategy;
    }

    /* renamed from: M */
    public static boolean m6628M() {
        CustomInfo customInfo = f8135d;
        return customInfo == null || customInfo.mDebug;
    }

    /* renamed from: N */
    static boolean m6629N() {
        CustomInfo customInfo = f8135d;
        return customInfo == null || customInfo.mPrintStackInfos;
    }

    /* renamed from: O */
    public static boolean m6630O() {
        return f8135d.mEnableStatReport;
    }

    /* renamed from: P */
    public static boolean m6631P() {
        return f8135d.mIsInternational;
    }

    /* renamed from: Q */
    public static boolean m6632Q() {
        return f8135d.mAddPvForNewDay;
    }

    /* renamed from: R */
    public static String m6633R() {
        return C1821g.m6298a(f8136e.mVersion) ? C1814a.m6209a() : m6643a(f8136e.mVersion);
    }

    /* renamed from: S */
    public static String m6634S() {
        return C1821g.m6298a(f8136e.mSubVersion) ? "release" : f8136e.mSubVersion;
    }

    /* renamed from: T */
    public static String m6635T() {
        return C1821g.m6298a(f8136e.mBuildId) ? m6639X() : m6643a(f8136e.mBuildId);
    }

    /* renamed from: U */
    public static String m6636U() {
        if (f8139h == null) {
            f8139h = C1821g.m6300b() + File.separatorChar + f8135d.mTagFilesFolderName + File.separatorChar;
        }
        return f8139h;
    }

    /* renamed from: V */
    static String m6637V() {
        if (f8140i == null) {
            f8140i = C1821g.m6300b() + File.separatorChar + f8135d.mCrashLogsFolderName + File.separatorChar;
        }
        return f8140i;
    }

    /* renamed from: W */
    static String m6638W() {
        if (f8141j == null) {
            if (C1821g.m6298a(f8135d.mLogsBackupPathName)) {
                f8141j = (C1821g.m6300b() + File.separatorChar + "msdb" + File.separatorChar) + File.separatorChar + f8135d.mCrashLogsFolderName + File.separatorChar;
            } else {
                String strTrim = f8135d.mLogsBackupPathName.trim();
                String str = File.separator;
                if (!strTrim.endsWith(str)) {
                    strTrim = strTrim + str;
                }
                f8141j = strTrim;
            }
        }
        return f8141j;
    }

    /* renamed from: X */
    private static String m6639X() {
        ZipFile zipFile;
        Throwable th;
        String str = f8138g;
        if (str != null) {
            return str;
        }
        try {
            try {
                zipFile = new ZipFile(C1821g.m6305c());
                try {
                    f8138g = Long.toHexString(zipFile.getEntry("classes.dex").getCrc());
                    C1815a.m6242a("crashsdk", "version unique build id: " + f8138g);
                    zipFile.close();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        f8138g = "";
                        C1821g.m6293a(th);
                        if (zipFile != null) {
                            zipFile.close();
                        }
                        return f8138g;
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
        return f8138g;
    }

    /* renamed from: Y */
    private static void m6640Y() {
        if (C1823b.f8020d) {
            JNIBridge.nativeSet(24, 1L, C1814a.f7902b, null);
        }
    }

    /* renamed from: a */
    public static void m6646a(CustomInfo customInfo, VersionInfo versionInfo) {
        CustomInfo customInfo2 = new CustomInfo(customInfo);
        f8135d = customInfo2;
        m6652c(customInfo2);
        if (!f8135d.mZipLog) {
            f8132a = new RuntimeException("initialize set mZipLog to false, info.mZipLog: " + customInfo.mZipLog);
        }
        if (f8135d.mEncryptLog) {
            f8133b = new RuntimeException("initialize set mEncryptLog to true, info.mEncryptLog: " + customInfo.mEncryptLog);
        }
        f8136e = new VersionInfo(versionInfo);
        if (C1823b.m6376I()) {
            return;
        }
        try {
            m6644a();
        } catch (Throwable th) {
            C1821g.m6293a(th);
        }
    }

    /* renamed from: b */
    public static void m6650b() {
        JNIBridge.set(103, C1821g.m6300b());
        JNIBridge.set(104, f8135d.mTagFilesFolderName);
        JNIBridge.set(105, f8135d.mCrashLogsFolderName);
        JNIBridge.set(106, m6638W());
        JNIBridge.set(107, C1826e.m6547h());
        JNIBridge.set(108, C1823b.m6395a());
        JNIBridge.set(109, m6633R());
        JNIBridge.set(110, m6634S());
        JNIBridge.set(111, m6635T());
        JNIBridge.set(112, "210105150455");
        JNIBridge.set(116, Build.MODEL);
        JNIBridge.set(117, Build.VERSION.RELEASE);
        JNIBridge.set(118, C1826e.m6564p());
        JNIBridge.set(5, f8135d.mCallNativeDefaultHandler);
        JNIBridge.set(6, f8135d.mDumpUserSolibBuildId);
        JNIBridge.set(7, f8135d.mReservedNativeMemoryBytes);
        JNIBridge.set(100, f8135d.mNativeCrashLogFileName);
        JNIBridge.set(101, f8135d.mUnexpCrashLogFileName);
        JNIBridge.set(102, f8135d.mAppId);
    }

    /* renamed from: c */
    private static void m6652c(CustomInfo customInfo) {
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
        long jM6508b = C1826e.m6508b();
        if (jM6508b >= 1) {
            customInfo.mMaxBuiltinLogFilesCount = 200;
            customInfo.mMaxCustomLogFilesCount = 100;
            customInfo.mMaxUploadBytesPerDay = 268435456L;
            customInfo.mMaxUploadBuiltinLogCountPerDay = MessageHandler.WHAT_SMOOTH_SCROLL;
            customInfo.mMaxUploadCustomLogCountPerDay = MessageHandler.WHAT_SMOOTH_SCROLL;
            customInfo.mMaxCustomLogCountPerTypePerDay = 100;
            customInfo.mMaxAnrLogCountPerProcess = 100;
            customInfo.mAnrTraceStrategy = 2;
            if (jM6508b >= 2) {
                customInfo.mSyncUploadSetupCrashLogs = true;
                customInfo.mSyncUploadLogs = true;
                if (jM6508b >= 3) {
                    customInfo.mBackupLogs = true;
                    customInfo.mPrintStackInfos = true;
                    customInfo.mDebug = true;
                }
            }
        }
    }

    /* renamed from: d */
    public static void m6653d() {
        JNIBridge.set(23, f8135d.mIsInternational);
        if (C1823b.m6372E()) {
            JNIBridge.set(34, true);
        }
        if (C1826e.m6551i()) {
            JNIBridge.set(1, true);
        }
        JNIBridge.set(10, f8135d.mFdDumpMinLimit);
        JNIBridge.nativeCmd(3, f8135d.mReservedNativeFileHandleCount, null, null);
        JNIBridge.nativeSetForeground(C1823b.m6434y());
        JNIBridge.set(2, C1823b.m6370C());
        C1814a.m6229e();
        C1814a.m6231g();
        C1814a.m6233i();
        C1814a.m6235k();
        JNIBridge.set(113, C1814a.f7901a);
        JNIBridge.cmd(1);
        JNIBridge.set(22, f8135d.mThreadsDumpMinLimit);
        JNIBridge.set(122, C1814a.m6209a());
        JNIBridge.set(33, C1814a.m6226c());
        m6640Y();
        C1823b.m6375H();
        C1823b.m6368A();
        C1821g.m6317k();
    }

    /* renamed from: e */
    public static String m6654e() {
        return f8135d.mAppId;
    }

    /* renamed from: f */
    static boolean m6655f() {
        if (C1821g.m6303b(f8135d.mJavaCrashLogFileName) || C1821g.m6303b(f8135d.mNativeCrashLogFileName)) {
            return true;
        }
        return C1821g.m6303b(f8135d.mUnexpCrashLogFileName);
    }

    /* renamed from: g */
    static String m6656g() {
        return f8135d.mJavaCrashLogFileName;
    }

    /* renamed from: h */
    static int m6657h() {
        return f8135d.mCrashRestartInterval;
    }

    /* renamed from: i */
    static boolean m6658i() {
        return f8135d.mCallJavaDefaultHandler;
    }

    /* renamed from: j */
    static boolean m6659j() {
        return f8135d.mDumpHprofDataForJavaOOM;
    }

    /* renamed from: k */
    static boolean m6660k() {
        return f8135d.mRenameFileToDefaultName;
    }

    /* renamed from: l */
    static int m6661l() {
        return f8135d.mMaxBuiltinLogFilesCount;
    }

    /* renamed from: m */
    static int m6662m() {
        return f8135d.mMaxCustomLogFilesCount;
    }

    /* renamed from: n */
    static int m6663n() {
        return f8135d.mMaxJavaLogcatLineCount;
    }

    /* renamed from: o */
    static int m6664o() {
        return f8135d.mUnexpDelayMillSeconds;
    }

    /* renamed from: p */
    static int m6665p() {
        return f8135d.mUnexpSubTypes;
    }

    /* renamed from: q */
    static boolean m6666q() {
        return f8135d.mBackupLogs;
    }

    /* renamed from: r */
    public static boolean m6667r() {
        return f8135d.mSyncUploadSetupCrashLogs;
    }

    /* renamed from: s */
    static boolean m6668s() {
        return f8135d.mSyncUploadLogs;
    }

    /* renamed from: t */
    static boolean m6669t() {
        return f8135d.mOmitJavaCrash;
    }

    /* renamed from: u */
    static boolean m6670u() {
        return f8135d.mAutoDeleteOldVersionStats;
    }

    /* renamed from: v */
    static boolean m6671v() {
        return f8135d.mZipLog;
    }

    /* renamed from: w */
    static String m6672w() {
        return f8135d.mZippedLogExtension;
    }

    /* renamed from: x */
    static boolean m6673x() {
        return f8135d.mEncryptLog;
    }

    /* renamed from: y */
    static int m6674y() {
        return f8135d.mLogMaxBytesLimit;
    }

    /* renamed from: z */
    static int m6675z() {
        return f8135d.mLogMaxUploadBytesLimit;
    }

    /* renamed from: a */
    public static void m6645a(CustomInfo customInfo) {
        boolean z3 = f8134c;
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
    public static void m6647a(VersionInfo versionInfo) {
        synchronized (f8137f) {
            f8136e = new VersionInfo(versionInfo);
            C1826e.m6522c();
            if (C1823b.f8020d) {
                JNIBridge.set(109, m6633R());
                JNIBridge.set(110, m6634S());
                JNIBridge.set(111, m6635T());
                JNIBridge.set(112, "210105150455");
                JNIBridge.cmd(2);
            }
        }
    }

    /* renamed from: a */
    static void m6644a() {
        C1823b.m6431v();
        C1823b.m6430u();
        if (f8135d.mBackupLogs) {
            File file = new File(m6638W());
            if (file.exists()) {
                return;
            }
            file.mkdirs();
        }
    }

    /* renamed from: b */
    public static int m6649b(CustomInfo customInfo) {
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        synchronized (f8142k) {
            i4 = 0;
            if (customInfo != null) {
                m6652c(customInfo);
                if (f8135d == null) {
                    f8135d = new CustomInfo();
                }
                CustomInfo customInfo2 = f8135d;
                boolean z5 = true;
                if (m6648a(customInfo.mAppId, customInfo2.mAppId)) {
                    i5 = 0;
                    z3 = false;
                } else {
                    String str = customInfo.mAppId;
                    customInfo2.mAppId = str;
                    if (C1823b.f8020d) {
                        JNIBridge.set(102, str);
                    }
                    i5 = 1;
                    z3 = true;
                }
                if (!m6648a(customInfo.mJavaCrashLogFileName, customInfo2.mJavaCrashLogFileName)) {
                    customInfo2.mJavaCrashLogFileName = customInfo.mJavaCrashLogFileName;
                    i5++;
                }
                if (!m6648a(customInfo.mNativeCrashLogFileName, customInfo2.mNativeCrashLogFileName)) {
                    String str2 = customInfo.mNativeCrashLogFileName;
                    customInfo2.mNativeCrashLogFileName = str2;
                    if (C1823b.f8020d) {
                        JNIBridge.set(100, str2);
                    }
                    i5++;
                    z3 = true;
                }
                if (!m6648a(customInfo.mUnexpCrashLogFileName, customInfo2.mUnexpCrashLogFileName)) {
                    String str3 = customInfo.mUnexpCrashLogFileName;
                    customInfo2.mUnexpCrashLogFileName = str3;
                    if (C1823b.f8020d) {
                        JNIBridge.set(101, str3);
                    }
                    i5++;
                    z3 = true;
                }
                if (z3) {
                    C1826e.m6522c();
                    if (C1823b.f8020d) {
                        JNIBridge.cmd(2);
                    }
                }
                boolean z6 = customInfo2.mPrintStackInfos;
                boolean z7 = customInfo.mPrintStackInfos;
                if (z6 != z7) {
                    customInfo2.mPrintStackInfos = z7;
                    if (C1823b.f8020d) {
                        JNIBridge.set(11, z7);
                    }
                    i5++;
                }
                boolean z8 = customInfo2.mDebug;
                boolean z9 = customInfo.mDebug;
                if (z8 != z9) {
                    customInfo2.mDebug = z9;
                    if (C1823b.f8020d) {
                        JNIBridge.set(18, z9);
                    }
                    i5++;
                }
                boolean z10 = customInfo2.mBackupLogs;
                boolean z11 = customInfo.mBackupLogs;
                if (z10 != z11) {
                    customInfo2.mBackupLogs = z11;
                    if (C1823b.f8020d) {
                        JNIBridge.set(12, z11);
                    }
                    i5++;
                }
                boolean z12 = customInfo2.mOmitNativeCrash;
                boolean z13 = customInfo.mOmitNativeCrash;
                if (z12 != z13) {
                    customInfo2.mOmitNativeCrash = z13;
                    if (C1823b.f8020d) {
                        JNIBridge.set(21, z13);
                    }
                    i5++;
                }
                int i6 = customInfo2.mCrashRestartInterval;
                int i7 = customInfo.mCrashRestartInterval;
                if (i6 != i7) {
                    customInfo2.mCrashRestartInterval = i7;
                    if (C1823b.f8020d) {
                        JNIBridge.set(13, i7);
                    }
                    if (customInfo2.mCrashRestartInterval >= 0) {
                        C1823b.m6377J();
                    }
                    i5++;
                }
                int i8 = customInfo2.mMaxBuiltinLogFilesCount;
                int i9 = customInfo.mMaxBuiltinLogFilesCount;
                if (i8 != i9) {
                    customInfo2.mMaxBuiltinLogFilesCount = i9;
                    if (C1823b.f8020d) {
                        JNIBridge.set(14, i9);
                    }
                    i5++;
                }
                int i10 = customInfo2.mMaxNativeLogcatLineCount;
                int i11 = customInfo.mMaxNativeLogcatLineCount;
                if (i10 != i11) {
                    customInfo2.mMaxNativeLogcatLineCount = i11;
                    if (C1823b.f8020d) {
                        JNIBridge.set(15, i11);
                    }
                    i5++;
                }
                int i12 = customInfo2.mMaxJavaLogcatLineCount;
                int i13 = customInfo.mMaxJavaLogcatLineCount;
                if (i12 != i13) {
                    customInfo2.mMaxJavaLogcatLineCount = i13;
                    i5++;
                }
                int i14 = customInfo2.mMaxUnexpLogcatLineCount;
                int i15 = customInfo.mMaxUnexpLogcatLineCount;
                if (i14 != i15) {
                    customInfo2.mMaxUnexpLogcatLineCount = i15;
                    if (C1823b.f8020d) {
                        JNIBridge.set(16, i15);
                    }
                    i5++;
                }
                int i16 = customInfo2.mMaxAnrLogcatLineCount;
                int i17 = customInfo.mMaxAnrLogcatLineCount;
                if (i16 != i17) {
                    customInfo2.mMaxAnrLogcatLineCount = i17;
                    if (C1823b.f8020d) {
                        JNIBridge.set(31, i17);
                    }
                    i5++;
                }
                boolean z14 = customInfo2.mZipLog;
                boolean z15 = customInfo.mZipLog;
                if (z14 != z15) {
                    customInfo2.mZipLog = z15;
                    if (!z15) {
                        C1815a.m6247d("DEBUG", "updateCustomInfoImpl set mZipLog to false");
                        f8132a = new RuntimeException("updateCustomInfoImpl set mZipLog to false");
                    }
                    i5++;
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (m6648a(customInfo.mZippedLogExtension, customInfo2.mZippedLogExtension)) {
                    z5 = z4;
                } else {
                    customInfo2.mZippedLogExtension = customInfo.mZippedLogExtension;
                    i5++;
                }
                if (z5 && C1823b.f8020d) {
                    JNIBridge.nativeSet(3, customInfo2.mZipLog ? 1L : 0L, customInfo2.mZippedLogExtension, null);
                }
                int i18 = customInfo2.mLogMaxBytesLimit;
                int i19 = customInfo.mLogMaxBytesLimit;
                if (i18 != i19) {
                    customInfo2.mLogMaxBytesLimit = i19;
                    if (C1823b.f8020d) {
                        JNIBridge.set(4, i19);
                    }
                    i5++;
                }
                boolean z16 = customInfo2.mEncryptLog;
                boolean z17 = customInfo.mEncryptLog;
                if (z16 != z17) {
                    customInfo2.mEncryptLog = z17;
                    if (z17) {
                        C1815a.m6247d("DEBUG", "updateCustomInfoImpl set mEncryptLog to true");
                        f8133b = new RuntimeException("updateCustomInfoImpl set mEncryptLog to true");
                    }
                    i5++;
                }
                boolean z18 = customInfo2.mSyncUploadSetupCrashLogs;
                boolean z19 = customInfo.mSyncUploadSetupCrashLogs;
                if (z18 != z19) {
                    customInfo2.mSyncUploadSetupCrashLogs = z19;
                    i5++;
                }
                boolean z20 = customInfo2.mSyncUploadLogs;
                boolean z21 = customInfo.mSyncUploadLogs;
                if (z20 != z21) {
                    customInfo2.mSyncUploadLogs = z21;
                    i5++;
                }
                int i20 = customInfo2.mMaxCustomLogFilesCount;
                int i21 = customInfo.mMaxCustomLogFilesCount;
                if (i20 != i21) {
                    customInfo2.mMaxCustomLogFilesCount = i21;
                    i5++;
                }
                boolean z22 = customInfo2.mOmitJavaCrash;
                boolean z23 = customInfo.mOmitJavaCrash;
                if (z22 != z23) {
                    customInfo2.mOmitJavaCrash = z23;
                    i5++;
                }
                int i22 = customInfo2.mLogMaxUploadBytesLimit;
                int i23 = customInfo.mLogMaxUploadBytesLimit;
                if (i22 != i23) {
                    customInfo2.mLogMaxUploadBytesLimit = i23;
                    i5++;
                }
                long j4 = customInfo2.mMaxUploadBytesPerDay;
                long j5 = customInfo.mMaxUploadBytesPerDay;
                if (j4 != j5) {
                    customInfo2.mMaxUploadBytesPerDay = j5;
                    i5++;
                }
                int i24 = customInfo2.mMaxUploadBuiltinLogCountPerDay;
                int i25 = customInfo.mMaxUploadBuiltinLogCountPerDay;
                if (i24 != i25) {
                    customInfo2.mMaxUploadBuiltinLogCountPerDay = i25;
                    i5++;
                }
                int i26 = customInfo2.mMaxUploadCustomLogCountPerDay;
                int i27 = customInfo.mMaxUploadCustomLogCountPerDay;
                if (i26 != i27) {
                    customInfo2.mMaxUploadCustomLogCountPerDay = i27;
                    i5++;
                }
                int i28 = customInfo2.mMaxCustomLogCountPerTypePerDay;
                int i29 = customInfo.mMaxCustomLogCountPerTypePerDay;
                if (i28 != i29) {
                    customInfo2.mMaxCustomLogCountPerTypePerDay = i29;
                    i5++;
                }
                int i30 = customInfo2.mMaxAnrLogCountPerProcess;
                int i31 = customInfo.mMaxAnrLogCountPerProcess;
                if (i30 != i31) {
                    customInfo2.mMaxAnrLogCountPerProcess = i31;
                    if (C1823b.f8020d) {
                        JNIBridge.set(32, f8135d.mMaxAnrLogCountPerProcess);
                    }
                    i5++;
                }
                boolean z24 = customInfo2.mCallJavaDefaultHandler;
                boolean z25 = customInfo.mCallJavaDefaultHandler;
                if (z24 != z25) {
                    customInfo2.mCallJavaDefaultHandler = z25;
                    i5++;
                }
                boolean z26 = customInfo2.mCallNativeDefaultHandler;
                boolean z27 = customInfo.mCallNativeDefaultHandler;
                if (z26 != z27) {
                    customInfo2.mCallNativeDefaultHandler = z27;
                    i5++;
                    if (C1823b.f8020d) {
                        JNIBridge.set(5, f8135d.mCallNativeDefaultHandler);
                    }
                }
                boolean z28 = customInfo2.mDumpUserSolibBuildId;
                boolean z29 = customInfo.mDumpUserSolibBuildId;
                if (z28 != z29) {
                    customInfo2.mDumpUserSolibBuildId = z29;
                    i5++;
                    if (C1823b.f8020d) {
                        JNIBridge.set(6, f8135d.mDumpUserSolibBuildId);
                    }
                }
                boolean z30 = customInfo2.mDumpHprofDataForJavaOOM;
                boolean z31 = customInfo.mDumpHprofDataForJavaOOM;
                if (z30 != z31) {
                    customInfo2.mDumpHprofDataForJavaOOM = z31;
                    i5++;
                }
                boolean z32 = customInfo2.mRenameFileToDefaultName;
                boolean z33 = customInfo.mRenameFileToDefaultName;
                if (z32 != z33) {
                    customInfo2.mRenameFileToDefaultName = z33;
                    i5++;
                }
                boolean z34 = customInfo2.mAutoDeleteOldVersionStats;
                boolean z35 = customInfo.mAutoDeleteOldVersionStats;
                if (z34 != z35) {
                    customInfo2.mAutoDeleteOldVersionStats = z35;
                    i5++;
                }
                int i32 = customInfo2.mFdDumpMinLimit;
                int i33 = customInfo.mFdDumpMinLimit;
                if (i32 != i33) {
                    customInfo2.mFdDumpMinLimit = i33;
                    if (C1823b.f8020d) {
                        JNIBridge.set(10, i33);
                    }
                    i5++;
                }
                int i34 = customInfo2.mThreadsDumpMinLimit;
                int i35 = customInfo.mThreadsDumpMinLimit;
                if (i34 != i35) {
                    customInfo2.mThreadsDumpMinLimit = i35;
                    if (C1823b.f8020d) {
                        JNIBridge.set(22, i35);
                    }
                    i5++;
                }
                int i36 = customInfo2.mInfoUpdateInterval;
                int i37 = customInfo.mInfoUpdateInterval;
                if (i36 != i37) {
                    if (i36 <= 0 && i37 > 0) {
                        C1814a.m6220a(false);
                    }
                    customInfo2.mInfoUpdateInterval = customInfo.mInfoUpdateInterval;
                    i5++;
                }
                int i38 = customInfo2.mInfoSaveFrequency;
                int i39 = customInfo.mInfoSaveFrequency;
                if (i38 != i39) {
                    customInfo2.mInfoSaveFrequency = i39;
                    i5++;
                }
                long j6 = customInfo2.mDisableBackgroundSignals;
                long j7 = customInfo.mDisableBackgroundSignals;
                if (j6 != j7) {
                    customInfo2.mDisableBackgroundSignals = j7;
                    if (C1823b.f8020d) {
                        JNIBridge.set(9, j7);
                    }
                    i5++;
                }
                boolean z36 = customInfo2.mEnableStatReport;
                boolean z37 = customInfo.mEnableStatReport;
                if (z36 != z37) {
                    customInfo2.mEnableStatReport = z37;
                    if (z37) {
                        C1826e.m6448A();
                    }
                    i5++;
                }
                boolean z38 = customInfo2.mIsInternational;
                boolean z39 = customInfo.mIsInternational;
                if (z38 != z39) {
                    customInfo2.mIsInternational = z39;
                    if (C1823b.f8020d) {
                        JNIBridge.set(23, z39);
                    }
                    i5++;
                }
                boolean z40 = customInfo2.mAutoDetectLifeCycle;
                boolean z41 = customInfo.mAutoDetectLifeCycle;
                if (z40 != z41) {
                    customInfo2.mAutoDetectLifeCycle = z41;
                    if (z41) {
                        C1823b.m6435z();
                    }
                    i5++;
                }
                boolean z42 = customInfo2.mMonitorBattery;
                boolean z43 = customInfo.mMonitorBattery;
                if (z42 != z43) {
                    customInfo2.mMonitorBattery = z43;
                    C1826e.m6524c(C1823b.m6434y());
                    i5++;
                }
                int i40 = customInfo2.mUnexpSubTypes;
                int i41 = customInfo.mUnexpSubTypes;
                if (i40 != i41) {
                    customInfo2.mUnexpSubTypes = i41;
                    i5++;
                }
                i4 = i5;
            }
        }
        return i4;
    }

    /* renamed from: c */
    public static void m6651c() {
        JNIBridge.set(11, m6629N());
        JNIBridge.set(12, f8135d.mBackupLogs);
        JNIBridge.set(13, f8135d.mCrashRestartInterval);
        JNIBridge.set(14, f8135d.mMaxBuiltinLogFilesCount);
        JNIBridge.set(15, f8135d.mMaxNativeLogcatLineCount);
        JNIBridge.set(16, f8135d.mMaxUnexpLogcatLineCount);
        JNIBridge.set(31, f8135d.mMaxAnrLogcatLineCount);
        JNIBridge.set(18, m6628M());
        JNIBridge.set(20, Build.VERSION.SDK_INT);
        JNIBridge.set(21, f8135d.mOmitNativeCrash);
        JNIBridge.set(32, f8135d.mMaxAnrLogCountPerProcess);
        JNIBridge.set(8, f8135d.mDisableSignals);
        JNIBridge.set(9, f8135d.mDisableBackgroundSignals);
        CustomInfo customInfo = f8135d;
        JNIBridge.nativeSet(3, customInfo.mZipLog ? 1L : 0L, customInfo.mZippedLogExtension, null);
        JNIBridge.set(4, f8135d.mLogMaxBytesLimit);
        JNIBridge.set(119, Build.FINGERPRINT);
    }

    /* renamed from: a */
    private static String m6643a(String str) {
        return (str == null || !str.contains("_")) ? str : str.replaceAll("_", "-");
    }

    /* renamed from: a */
    public static CustomInfo m6641a(CustomInfo customInfo, Bundle bundle) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        if (customInfo == null) {
            CustomInfo customInfo2 = f8135d;
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
                        C1821g.m6293a(e4);
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
    public static VersionInfo m6642a(Bundle bundle) {
        VersionInfo versionInfo;
        VersionInfo versionInfo2 = f8136e;
        if (versionInfo2 == null) {
            versionInfo = new VersionInfo();
        } else {
            versionInfo = new VersionInfo(versionInfo2);
        }
        String string = bundle.getString("mVersion");
        if (!C1821g.m6298a(string)) {
            versionInfo.mVersion = string;
        }
        String string2 = bundle.getString("mSubVersion");
        if (!C1821g.m6298a(string2)) {
            versionInfo.mSubVersion = string2;
        }
        String string3 = bundle.getString("mBuildId");
        if (!C1821g.m6298a(string3)) {
            versionInfo.mBuildId = string3;
        }
        String string4 = bundle.getString("crver");
        if (!C1821g.m6298a(string4)) {
            C1814a.f7902b = string4;
            m6640Y();
        }
        return versionInfo;
    }

    /* renamed from: a */
    private static boolean m6648a(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }
}
