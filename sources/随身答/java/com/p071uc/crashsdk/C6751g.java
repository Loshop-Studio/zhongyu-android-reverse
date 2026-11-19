package com.p071uc.crashsdk;

import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDelegate;
import com.p071uc.crashsdk.export.CustomInfo;
import com.p071uc.crashsdk.export.VersionInfo;
import com.p071uc.crashsdk.p072a.C6738a;
import com.p071uc.crashsdk.p072a.C6744g;
import com.taobao.sophix.PatchStatus;
import java.io.File;
import java.lang.reflect.Field;
import java.util.zip.ZipFile;

/* renamed from: com.uc.crashsdk.g */
/* loaded from: classes4.dex */
public class C6751g {

    /* renamed from: a */
    public static RuntimeException f6538a = null;

    /* renamed from: b */
    public static RuntimeException f6539b = null;

    /* renamed from: c */
    static final /* synthetic */ boolean f6540c = true;

    /* renamed from: d */
    private static CustomInfo f6541d;

    /* renamed from: e */
    private static VersionInfo f6542e;

    /* renamed from: g */
    private static String f6544g;

    /* renamed from: h */
    private static String f6545h;

    /* renamed from: i */
    private static String f6546i;

    /* renamed from: j */
    private static String f6547j;

    /* renamed from: f */
    private static final Object f6543f = new Object();

    /* renamed from: k */
    private static final Object f6548k = new Object();

    /* renamed from: A */
    public static long m5937A() {
        return f6541d.mMaxUploadBytesPerDay;
    }

    /* renamed from: B */
    public static int m5938B() {
        return f6541d.mMaxUploadBuiltinLogCountPerDay;
    }

    /* renamed from: C */
    public static int m5939C() {
        return f6541d.mMaxUploadCustomLogCountPerDay;
    }

    /* renamed from: D */
    public static int m5940D() {
        return f6541d.mMaxCustomLogCountPerTypePerDay;
    }

    /* renamed from: E */
    public static int m5941E() {
        return f6541d.mInfoUpdateInterval;
    }

    /* renamed from: F */
    public static int m5942F() {
        return f6541d.mInfoSaveFrequency;
    }

    /* renamed from: G */
    public static int m5943G() {
        return f6541d.mReservedJavaFileHandleCount;
    }

    /* renamed from: H */
    public static int m5944H() {
        return f6541d.mFdDumpMinLimit;
    }

    /* renamed from: I */
    public static int m5945I() {
        return f6541d.mThreadsDumpMinLimit;
    }

    /* renamed from: J */
    public static boolean m5946J() {
        return f6541d.mAutoDetectLifeCycle;
    }

    /* renamed from: K */
    public static boolean m5947K() {
        return f6541d.mMonitorBattery;
    }

    /* renamed from: L */
    public static int m5948L() {
        return f6541d.mAnrTraceStrategy;
    }

    /* renamed from: M */
    public static boolean m5949M() {
        CustomInfo customInfo = f6541d;
        return customInfo == null || customInfo.mDebug;
    }

    /* renamed from: N */
    public static boolean m5950N() {
        CustomInfo customInfo = f6541d;
        return customInfo == null || customInfo.mPrintStackInfos;
    }

    /* renamed from: O */
    public static boolean m5951O() {
        return f6541d.mEnableStatReport;
    }

    /* renamed from: P */
    public static boolean m5952P() {
        return f6541d.mIsInternational;
    }

    /* renamed from: Q */
    public static boolean m5953Q() {
        return f6541d.mAddPvForNewDay;
    }

    /* renamed from: R */
    public static String m5954R() {
        return C6744g.m5619a(f6542e.mVersion) ? C6737a.m5530a() : m5964a(f6542e.mVersion);
    }

    /* renamed from: S */
    public static String m5955S() {
        return C6744g.m5619a(f6542e.mSubVersion) ? "release" : f6542e.mSubVersion;
    }

    /* renamed from: T */
    public static String m5956T() {
        return C6744g.m5619a(f6542e.mBuildId) ? m5960X() : m5964a(f6542e.mBuildId);
    }

    /* renamed from: U */
    public static String m5957U() {
        if (f6545h == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C6744g.m5621b());
            char c10 = File.separatorChar;
            sb.append(c10);
            sb.append(f6541d.mTagFilesFolderName);
            sb.append(c10);
            f6545h = sb.toString();
        }
        return f6545h;
    }

    /* renamed from: V */
    public static String m5958V() {
        if (f6546i == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C6744g.m5621b());
            char c10 = File.separatorChar;
            sb.append(c10);
            sb.append(f6541d.mCrashLogsFolderName);
            sb.append(c10);
            f6546i = sb.toString();
        }
        return f6546i;
    }

    /* renamed from: W */
    public static String m5959W() {
        if (f6547j == null) {
            if (C6744g.m5619a(f6541d.mLogsBackupPathName)) {
                StringBuilder sb = new StringBuilder();
                sb.append(C6744g.m5621b());
                char c10 = File.separatorChar;
                sb.append(c10);
                sb.append("msdb");
                sb.append(c10);
                f6547j = sb.toString() + c10 + f6541d.mCrashLogsFolderName + c10;
            } else {
                String strTrim = f6541d.mLogsBackupPathName.trim();
                String str = File.separator;
                if (!strTrim.endsWith(str)) {
                    strTrim = strTrim + str;
                }
                f6547j = strTrim;
            }
        }
        return f6547j;
    }

    /* renamed from: X */
    private static String m5960X() {
        ZipFile zipFile;
        Throwable th;
        String str = f6544g;
        if (str != null) {
            return str;
        }
        try {
            try {
                zipFile = new ZipFile(C6744g.m5626c());
                try {
                    f6544g = Long.toHexString(zipFile.getEntry("classes.dex").getCrc());
                    C6738a.m5563a("crashsdk", "version unique build id: " + f6544g);
                    zipFile.close();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        f6544g = "";
                        C6744g.m5614a(th);
                        if (zipFile != null) {
                            zipFile.close();
                        }
                        return f6544g;
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
        return f6544g;
    }

    /* renamed from: Y */
    private static void m5961Y() {
        if (C6746b.f6426d) {
            JNIBridge.nativeSet(24, 1L, C6737a.f6308b, null);
        }
    }

    /* renamed from: a */
    public static void m5967a(CustomInfo customInfo, VersionInfo versionInfo) {
        CustomInfo customInfo2 = new CustomInfo(customInfo);
        f6541d = customInfo2;
        m5973c(customInfo2);
        if (!f6541d.mZipLog) {
            f6538a = new RuntimeException("initialize set mZipLog to false, info.mZipLog: " + customInfo.mZipLog);
        }
        if (f6541d.mEncryptLog) {
            f6539b = new RuntimeException("initialize set mEncryptLog to true, info.mEncryptLog: " + customInfo.mEncryptLog);
        }
        f6542e = new VersionInfo(versionInfo);
        if (C6746b.m5697I()) {
            return;
        }
        try {
            m5965a();
        } catch (Throwable th) {
            C6744g.m5614a(th);
        }
    }

    /* renamed from: b */
    public static void m5971b() {
        JNIBridge.set(103, C6744g.m5621b());
        JNIBridge.set(104, f6541d.mTagFilesFolderName);
        JNIBridge.set(105, f6541d.mCrashLogsFolderName);
        JNIBridge.set(106, m5959W());
        JNIBridge.set(107, C6749e.m5868h());
        JNIBridge.set(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, C6746b.m5716a());
        JNIBridge.set(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, m5954R());
        JNIBridge.set(110, m5955S());
        JNIBridge.set(111, m5956T());
        JNIBridge.set(112, "210105150455");
        JNIBridge.set(116, Build.MODEL);
        JNIBridge.set(117, Build.VERSION.RELEASE);
        JNIBridge.set(118, C6749e.m5885p());
        JNIBridge.set(5, f6541d.mCallNativeDefaultHandler);
        JNIBridge.set(6, f6541d.mDumpUserSolibBuildId);
        JNIBridge.set(7, f6541d.mReservedNativeMemoryBytes);
        JNIBridge.set(100, f6541d.mNativeCrashLogFileName);
        JNIBridge.set(101, f6541d.mUnexpCrashLogFileName);
        JNIBridge.set(102, f6541d.mAppId);
    }

    /* renamed from: c */
    private static void m5973c(CustomInfo customInfo) {
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
        long jM5829b = C6749e.m5829b();
        if (jM5829b >= 1) {
            customInfo.mMaxBuiltinLogFilesCount = 200;
            customInfo.mMaxCustomLogFilesCount = 100;
            customInfo.mMaxUploadBytesPerDay = 268435456L;
            customInfo.mMaxUploadBuiltinLogCountPerDay = 2000;
            customInfo.mMaxUploadCustomLogCountPerDay = 2000;
            customInfo.mMaxCustomLogCountPerTypePerDay = 100;
            customInfo.mMaxAnrLogCountPerProcess = 100;
            customInfo.mAnrTraceStrategy = 2;
            if (jM5829b >= 2) {
                customInfo.mSyncUploadSetupCrashLogs = true;
                customInfo.mSyncUploadLogs = true;
                if (jM5829b >= 3) {
                    customInfo.mBackupLogs = true;
                    customInfo.mPrintStackInfos = true;
                    customInfo.mDebug = true;
                }
            }
        }
    }

    /* renamed from: d */
    public static void m5974d() {
        JNIBridge.set(23, f6541d.mIsInternational);
        if (C6746b.m5693E()) {
            JNIBridge.set(34, true);
        }
        if (C6749e.m5872i()) {
            JNIBridge.set(1, true);
        }
        JNIBridge.set(10, f6541d.mFdDumpMinLimit);
        JNIBridge.nativeCmd(3, f6541d.mReservedNativeFileHandleCount, null, null);
        JNIBridge.nativeSetForeground(C6746b.m5755y());
        JNIBridge.set(2, C6746b.m5691C());
        C6737a.m5550e();
        C6737a.m5552g();
        C6737a.m5554i();
        C6737a.m5556k();
        JNIBridge.set(113, C6737a.f6307a);
        JNIBridge.cmd(1);
        JNIBridge.set(22, f6541d.mThreadsDumpMinLimit);
        JNIBridge.set(PatchStatus.CODE_LOAD_RES_UPDATECONFIG, C6737a.m5530a());
        JNIBridge.set(33, C6737a.m5547c());
        m5961Y();
        C6746b.m5696H();
        C6746b.m5689A();
        C6744g.m5638k();
    }

    /* renamed from: e */
    public static String m5975e() {
        return f6541d.mAppId;
    }

    /* renamed from: f */
    public static boolean m5976f() {
        if (C6744g.m5624b(f6541d.mJavaCrashLogFileName) || C6744g.m5624b(f6541d.mNativeCrashLogFileName)) {
            return true;
        }
        return C6744g.m5624b(f6541d.mUnexpCrashLogFileName);
    }

    /* renamed from: g */
    public static String m5977g() {
        return f6541d.mJavaCrashLogFileName;
    }

    /* renamed from: h */
    public static int m5978h() {
        return f6541d.mCrashRestartInterval;
    }

    /* renamed from: i */
    public static boolean m5979i() {
        return f6541d.mCallJavaDefaultHandler;
    }

    /* renamed from: j */
    public static boolean m5980j() {
        return f6541d.mDumpHprofDataForJavaOOM;
    }

    /* renamed from: k */
    public static boolean m5981k() {
        return f6541d.mRenameFileToDefaultName;
    }

    /* renamed from: l */
    public static int m5982l() {
        return f6541d.mMaxBuiltinLogFilesCount;
    }

    /* renamed from: m */
    public static int m5983m() {
        return f6541d.mMaxCustomLogFilesCount;
    }

    /* renamed from: n */
    public static int m5984n() {
        return f6541d.mMaxJavaLogcatLineCount;
    }

    /* renamed from: o */
    public static int m5985o() {
        return f6541d.mUnexpDelayMillSeconds;
    }

    /* renamed from: p */
    public static int m5986p() {
        return f6541d.mUnexpSubTypes;
    }

    /* renamed from: q */
    public static boolean m5987q() {
        return f6541d.mBackupLogs;
    }

    /* renamed from: r */
    public static boolean m5988r() {
        return f6541d.mSyncUploadSetupCrashLogs;
    }

    /* renamed from: s */
    public static boolean m5989s() {
        return f6541d.mSyncUploadLogs;
    }

    /* renamed from: t */
    public static boolean m5990t() {
        return f6541d.mOmitJavaCrash;
    }

    /* renamed from: u */
    public static boolean m5991u() {
        return f6541d.mAutoDeleteOldVersionStats;
    }

    /* renamed from: v */
    public static boolean m5992v() {
        return f6541d.mZipLog;
    }

    /* renamed from: w */
    public static String m5993w() {
        return f6541d.mZippedLogExtension;
    }

    /* renamed from: x */
    public static boolean m5994x() {
        return f6541d.mEncryptLog;
    }

    /* renamed from: y */
    public static int m5995y() {
        return f6541d.mLogMaxBytesLimit;
    }

    /* renamed from: z */
    public static int m5996z() {
        return f6541d.mLogMaxUploadBytesLimit;
    }

    /* renamed from: a */
    public static void m5966a(CustomInfo customInfo) {
        boolean z9 = f6540c;
        if (!z9 && customInfo.mTagFilesFolderName == null) {
            throw new AssertionError();
        }
        if (!z9 && customInfo.mCrashLogsFolderName == null) {
            throw new AssertionError();
        }
        if (customInfo.mTagFilesFolderName.equals(customInfo.mCrashLogsFolderName)) {
            throw new IllegalArgumentException("mTagFilesFolderName and mCrashLogsFolderName can not be set to the same!");
        }
    }

    /* renamed from: a */
    public static void m5968a(VersionInfo versionInfo) {
        synchronized (f6543f) {
            try {
                f6542e = new VersionInfo(versionInfo);
                C6749e.m5843c();
                if (C6746b.f6426d) {
                    JNIBridge.set(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, m5954R());
                    JNIBridge.set(110, m5955S());
                    JNIBridge.set(111, m5956T());
                    JNIBridge.set(112, "210105150455");
                    JNIBridge.cmd(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static void m5965a() {
        C6746b.m5752v();
        C6746b.m5751u();
        if (f6541d.mBackupLogs) {
            File file = new File(m5959W());
            if (file.exists()) {
                return;
            }
            file.mkdirs();
        }
    }

    /* renamed from: b */
    public static int m5970b(CustomInfo customInfo) {
        int i9;
        int i10;
        boolean z9;
        synchronized (f6548k) {
            i9 = 0;
            if (customInfo != null) {
                try {
                    m5973c(customInfo);
                    if (f6541d == null) {
                        f6541d = new CustomInfo();
                    }
                    CustomInfo customInfo2 = f6541d;
                    boolean z10 = true;
                    if (m5969a(customInfo.mAppId, customInfo2.mAppId)) {
                        i10 = 0;
                    } else {
                        String str = customInfo.mAppId;
                        customInfo2.mAppId = str;
                        if (C6746b.f6426d) {
                            JNIBridge.set(102, str);
                        }
                        i10 = 1;
                    }
                    int i11 = i10;
                    if (!m5969a(customInfo.mJavaCrashLogFileName, customInfo2.mJavaCrashLogFileName)) {
                        customInfo2.mJavaCrashLogFileName = customInfo.mJavaCrashLogFileName;
                        i10++;
                    }
                    if (!m5969a(customInfo.mNativeCrashLogFileName, customInfo2.mNativeCrashLogFileName)) {
                        String str2 = customInfo.mNativeCrashLogFileName;
                        customInfo2.mNativeCrashLogFileName = str2;
                        if (C6746b.f6426d) {
                            JNIBridge.set(100, str2);
                        }
                        i10++;
                        i11 = 1;
                    }
                    if (!m5969a(customInfo.mUnexpCrashLogFileName, customInfo2.mUnexpCrashLogFileName)) {
                        String str3 = customInfo.mUnexpCrashLogFileName;
                        customInfo2.mUnexpCrashLogFileName = str3;
                        if (C6746b.f6426d) {
                            JNIBridge.set(101, str3);
                        }
                        i10++;
                        i11 = 1;
                    }
                    if (i11 != 0) {
                        C6749e.m5843c();
                        if (C6746b.f6426d) {
                            JNIBridge.cmd(2);
                        }
                    }
                    boolean z11 = customInfo2.mPrintStackInfos;
                    boolean z12 = customInfo.mPrintStackInfos;
                    if (z11 != z12) {
                        customInfo2.mPrintStackInfos = z12;
                        if (C6746b.f6426d) {
                            JNIBridge.set(11, z12);
                        }
                        i10++;
                    }
                    boolean z13 = customInfo2.mDebug;
                    boolean z14 = customInfo.mDebug;
                    if (z13 != z14) {
                        customInfo2.mDebug = z14;
                        if (C6746b.f6426d) {
                            JNIBridge.set(18, z14);
                        }
                        i10++;
                    }
                    boolean z15 = customInfo2.mBackupLogs;
                    boolean z16 = customInfo.mBackupLogs;
                    if (z15 != z16) {
                        customInfo2.mBackupLogs = z16;
                        if (C6746b.f6426d) {
                            JNIBridge.set(12, z16);
                        }
                        i10++;
                    }
                    boolean z17 = customInfo2.mOmitNativeCrash;
                    boolean z18 = customInfo.mOmitNativeCrash;
                    if (z17 != z18) {
                        customInfo2.mOmitNativeCrash = z18;
                        if (C6746b.f6426d) {
                            JNIBridge.set(21, z18);
                        }
                        i10++;
                    }
                    int i12 = customInfo2.mCrashRestartInterval;
                    int i13 = customInfo.mCrashRestartInterval;
                    if (i12 != i13) {
                        customInfo2.mCrashRestartInterval = i13;
                        if (C6746b.f6426d) {
                            JNIBridge.set(13, i13);
                        }
                        if (customInfo2.mCrashRestartInterval >= 0) {
                            C6746b.m5698J();
                        }
                        i10++;
                    }
                    int i14 = customInfo2.mMaxBuiltinLogFilesCount;
                    int i15 = customInfo.mMaxBuiltinLogFilesCount;
                    if (i14 != i15) {
                        customInfo2.mMaxBuiltinLogFilesCount = i15;
                        if (C6746b.f6426d) {
                            JNIBridge.set(14, i15);
                        }
                        i10++;
                    }
                    int i16 = customInfo2.mMaxNativeLogcatLineCount;
                    int i17 = customInfo.mMaxNativeLogcatLineCount;
                    if (i16 != i17) {
                        customInfo2.mMaxNativeLogcatLineCount = i17;
                        if (C6746b.f6426d) {
                            JNIBridge.set(15, i17);
                        }
                        i10++;
                    }
                    int i18 = customInfo2.mMaxJavaLogcatLineCount;
                    int i19 = customInfo.mMaxJavaLogcatLineCount;
                    if (i18 != i19) {
                        customInfo2.mMaxJavaLogcatLineCount = i19;
                        i10++;
                    }
                    int i20 = customInfo2.mMaxUnexpLogcatLineCount;
                    int i21 = customInfo.mMaxUnexpLogcatLineCount;
                    if (i20 != i21) {
                        customInfo2.mMaxUnexpLogcatLineCount = i21;
                        if (C6746b.f6426d) {
                            JNIBridge.set(16, i21);
                        }
                        i10++;
                    }
                    int i22 = customInfo2.mMaxAnrLogcatLineCount;
                    int i23 = customInfo.mMaxAnrLogcatLineCount;
                    if (i22 != i23) {
                        customInfo2.mMaxAnrLogcatLineCount = i23;
                        if (C6746b.f6426d) {
                            JNIBridge.set(31, i23);
                        }
                        i10++;
                    }
                    boolean z19 = customInfo2.mZipLog;
                    boolean z20 = customInfo.mZipLog;
                    if (z19 != z20) {
                        customInfo2.mZipLog = z20;
                        if (!z20) {
                            C6738a.m5568d("DEBUG", "updateCustomInfoImpl set mZipLog to false");
                            f6538a = new RuntimeException("updateCustomInfoImpl set mZipLog to false");
                        }
                        i10++;
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (m5969a(customInfo.mZippedLogExtension, customInfo2.mZippedLogExtension)) {
                        z10 = z9;
                    } else {
                        customInfo2.mZippedLogExtension = customInfo.mZippedLogExtension;
                        i10++;
                    }
                    if (z10 && C6746b.f6426d) {
                        JNIBridge.nativeSet(3, customInfo2.mZipLog ? 1L : 0L, customInfo2.mZippedLogExtension, null);
                    }
                    int i24 = customInfo2.mLogMaxBytesLimit;
                    int i25 = customInfo.mLogMaxBytesLimit;
                    if (i24 != i25) {
                        customInfo2.mLogMaxBytesLimit = i25;
                        if (C6746b.f6426d) {
                            JNIBridge.set(4, i25);
                        }
                        i10++;
                    }
                    boolean z21 = customInfo2.mEncryptLog;
                    boolean z22 = customInfo.mEncryptLog;
                    if (z21 != z22) {
                        customInfo2.mEncryptLog = z22;
                        if (z22) {
                            C6738a.m5568d("DEBUG", "updateCustomInfoImpl set mEncryptLog to true");
                            f6539b = new RuntimeException("updateCustomInfoImpl set mEncryptLog to true");
                        }
                        i10++;
                    }
                    boolean z23 = customInfo2.mSyncUploadSetupCrashLogs;
                    boolean z24 = customInfo.mSyncUploadSetupCrashLogs;
                    if (z23 != z24) {
                        customInfo2.mSyncUploadSetupCrashLogs = z24;
                        i10++;
                    }
                    boolean z25 = customInfo2.mSyncUploadLogs;
                    boolean z26 = customInfo.mSyncUploadLogs;
                    if (z25 != z26) {
                        customInfo2.mSyncUploadLogs = z26;
                        i10++;
                    }
                    int i26 = customInfo2.mMaxCustomLogFilesCount;
                    int i27 = customInfo.mMaxCustomLogFilesCount;
                    if (i26 != i27) {
                        customInfo2.mMaxCustomLogFilesCount = i27;
                        i10++;
                    }
                    boolean z27 = customInfo2.mOmitJavaCrash;
                    boolean z28 = customInfo.mOmitJavaCrash;
                    if (z27 != z28) {
                        customInfo2.mOmitJavaCrash = z28;
                        i10++;
                    }
                    int i28 = customInfo2.mLogMaxUploadBytesLimit;
                    int i29 = customInfo.mLogMaxUploadBytesLimit;
                    if (i28 != i29) {
                        customInfo2.mLogMaxUploadBytesLimit = i29;
                        i10++;
                    }
                    long j9 = customInfo2.mMaxUploadBytesPerDay;
                    long j10 = customInfo.mMaxUploadBytesPerDay;
                    if (j9 != j10) {
                        customInfo2.mMaxUploadBytesPerDay = j10;
                        i10++;
                    }
                    int i30 = customInfo2.mMaxUploadBuiltinLogCountPerDay;
                    int i31 = customInfo.mMaxUploadBuiltinLogCountPerDay;
                    if (i30 != i31) {
                        customInfo2.mMaxUploadBuiltinLogCountPerDay = i31;
                        i10++;
                    }
                    int i32 = customInfo2.mMaxUploadCustomLogCountPerDay;
                    int i33 = customInfo.mMaxUploadCustomLogCountPerDay;
                    if (i32 != i33) {
                        customInfo2.mMaxUploadCustomLogCountPerDay = i33;
                        i10++;
                    }
                    int i34 = customInfo2.mMaxCustomLogCountPerTypePerDay;
                    int i35 = customInfo.mMaxCustomLogCountPerTypePerDay;
                    if (i34 != i35) {
                        customInfo2.mMaxCustomLogCountPerTypePerDay = i35;
                        i10++;
                    }
                    int i36 = customInfo2.mMaxAnrLogCountPerProcess;
                    int i37 = customInfo.mMaxAnrLogCountPerProcess;
                    if (i36 != i37) {
                        customInfo2.mMaxAnrLogCountPerProcess = i37;
                        if (C6746b.f6426d) {
                            JNIBridge.set(32, f6541d.mMaxAnrLogCountPerProcess);
                        }
                        i10++;
                    }
                    boolean z29 = customInfo2.mCallJavaDefaultHandler;
                    boolean z30 = customInfo.mCallJavaDefaultHandler;
                    if (z29 != z30) {
                        customInfo2.mCallJavaDefaultHandler = z30;
                        i10++;
                    }
                    boolean z31 = customInfo2.mCallNativeDefaultHandler;
                    boolean z32 = customInfo.mCallNativeDefaultHandler;
                    if (z31 != z32) {
                        customInfo2.mCallNativeDefaultHandler = z32;
                        i10++;
                        if (C6746b.f6426d) {
                            JNIBridge.set(5, f6541d.mCallNativeDefaultHandler);
                        }
                    }
                    boolean z33 = customInfo2.mDumpUserSolibBuildId;
                    boolean z34 = customInfo.mDumpUserSolibBuildId;
                    if (z33 != z34) {
                        customInfo2.mDumpUserSolibBuildId = z34;
                        i10++;
                        if (C6746b.f6426d) {
                            JNIBridge.set(6, f6541d.mDumpUserSolibBuildId);
                        }
                    }
                    boolean z35 = customInfo2.mDumpHprofDataForJavaOOM;
                    boolean z36 = customInfo.mDumpHprofDataForJavaOOM;
                    if (z35 != z36) {
                        customInfo2.mDumpHprofDataForJavaOOM = z36;
                        i10++;
                    }
                    boolean z37 = customInfo2.mRenameFileToDefaultName;
                    boolean z38 = customInfo.mRenameFileToDefaultName;
                    if (z37 != z38) {
                        customInfo2.mRenameFileToDefaultName = z38;
                        i10++;
                    }
                    boolean z39 = customInfo2.mAutoDeleteOldVersionStats;
                    boolean z40 = customInfo.mAutoDeleteOldVersionStats;
                    if (z39 != z40) {
                        customInfo2.mAutoDeleteOldVersionStats = z40;
                        i10++;
                    }
                    int i38 = customInfo2.mFdDumpMinLimit;
                    int i39 = customInfo.mFdDumpMinLimit;
                    if (i38 != i39) {
                        customInfo2.mFdDumpMinLimit = i39;
                        if (C6746b.f6426d) {
                            JNIBridge.set(10, i39);
                        }
                        i10++;
                    }
                    int i40 = customInfo2.mThreadsDumpMinLimit;
                    int i41 = customInfo.mThreadsDumpMinLimit;
                    if (i40 != i41) {
                        customInfo2.mThreadsDumpMinLimit = i41;
                        if (C6746b.f6426d) {
                            JNIBridge.set(22, i41);
                        }
                        i10++;
                    }
                    int i42 = customInfo2.mInfoUpdateInterval;
                    int i43 = customInfo.mInfoUpdateInterval;
                    if (i42 != i43) {
                        if (i42 <= 0 && i43 > 0) {
                            C6737a.m5541a(false);
                        }
                        customInfo2.mInfoUpdateInterval = customInfo.mInfoUpdateInterval;
                        i10++;
                    }
                    int i44 = customInfo2.mInfoSaveFrequency;
                    int i45 = customInfo.mInfoSaveFrequency;
                    if (i44 != i45) {
                        customInfo2.mInfoSaveFrequency = i45;
                        i10++;
                    }
                    long j11 = customInfo2.mDisableBackgroundSignals;
                    long j12 = customInfo.mDisableBackgroundSignals;
                    if (j11 != j12) {
                        customInfo2.mDisableBackgroundSignals = j12;
                        if (C6746b.f6426d) {
                            JNIBridge.set(9, j12);
                        }
                        i10++;
                    }
                    boolean z41 = customInfo2.mEnableStatReport;
                    boolean z42 = customInfo.mEnableStatReport;
                    if (z41 != z42) {
                        customInfo2.mEnableStatReport = z42;
                        if (z42) {
                            C6749e.m5769A();
                        }
                        i10++;
                    }
                    boolean z43 = customInfo2.mIsInternational;
                    boolean z44 = customInfo.mIsInternational;
                    if (z43 != z44) {
                        customInfo2.mIsInternational = z44;
                        if (C6746b.f6426d) {
                            JNIBridge.set(23, z44);
                        }
                        i10++;
                    }
                    boolean z45 = customInfo2.mAutoDetectLifeCycle;
                    boolean z46 = customInfo.mAutoDetectLifeCycle;
                    if (z45 != z46) {
                        customInfo2.mAutoDetectLifeCycle = z46;
                        if (z46) {
                            C6746b.m5756z();
                        }
                        i10++;
                    }
                    boolean z47 = customInfo2.mMonitorBattery;
                    boolean z48 = customInfo.mMonitorBattery;
                    if (z47 != z48) {
                        customInfo2.mMonitorBattery = z48;
                        C6749e.m5845c(C6746b.m5755y());
                        i10++;
                    }
                    int i46 = customInfo2.mUnexpSubTypes;
                    int i47 = customInfo.mUnexpSubTypes;
                    if (i46 != i47) {
                        customInfo2.mUnexpSubTypes = i47;
                        i10++;
                    }
                    i9 = i10;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return i9;
    }

    /* renamed from: c */
    public static void m5972c() {
        JNIBridge.set(11, m5950N());
        JNIBridge.set(12, f6541d.mBackupLogs);
        JNIBridge.set(13, f6541d.mCrashRestartInterval);
        JNIBridge.set(14, f6541d.mMaxBuiltinLogFilesCount);
        JNIBridge.set(15, f6541d.mMaxNativeLogcatLineCount);
        JNIBridge.set(16, f6541d.mMaxUnexpLogcatLineCount);
        JNIBridge.set(31, f6541d.mMaxAnrLogcatLineCount);
        JNIBridge.set(18, m5949M());
        JNIBridge.set(20, Build.VERSION.SDK_INT);
        JNIBridge.set(21, f6541d.mOmitNativeCrash);
        JNIBridge.set(32, f6541d.mMaxAnrLogCountPerProcess);
        JNIBridge.set(8, f6541d.mDisableSignals);
        JNIBridge.set(9, f6541d.mDisableBackgroundSignals);
        CustomInfo customInfo = f6541d;
        JNIBridge.nativeSet(3, customInfo.mZipLog ? 1L : 0L, customInfo.mZippedLogExtension, null);
        JNIBridge.set(4, f6541d.mLogMaxBytesLimit);
        JNIBridge.set(119, Build.FINGERPRINT);
    }

    /* renamed from: a */
    private static String m5964a(String str) {
        return (str == null || !str.contains("_")) ? str : str.replaceAll("_", "-");
    }

    /* renamed from: a */
    public static CustomInfo m5962a(CustomInfo customInfo, Bundle bundle) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        if (customInfo == null) {
            CustomInfo customInfo2 = f6541d;
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
                    } catch (Exception e10) {
                        C6744g.m5614a(e10);
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
    public static VersionInfo m5963a(Bundle bundle) {
        VersionInfo versionInfo;
        VersionInfo versionInfo2 = f6542e;
        if (versionInfo2 == null) {
            versionInfo = new VersionInfo();
        } else {
            versionInfo = new VersionInfo(versionInfo2);
        }
        String string = bundle.getString("mVersion");
        if (!C6744g.m5619a(string)) {
            versionInfo.mVersion = string;
        }
        String string2 = bundle.getString("mSubVersion");
        if (!C6744g.m5619a(string2)) {
            versionInfo.mSubVersion = string2;
        }
        String string3 = bundle.getString("mBuildId");
        if (!C6744g.m5619a(string3)) {
            versionInfo.mBuildId = string3;
        }
        String string4 = bundle.getString("crver");
        if (!C6744g.m5619a(string4)) {
            C6737a.f6308b = string4;
            m5961Y();
        }
        return versionInfo;
    }

    /* renamed from: a */
    private static boolean m5969a(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }
}
