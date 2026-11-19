package com.p068uc.crashsdk.export;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.webkit.ValueCallback;
import anet.channel.entity.EventType;
import com.p068uc.crashsdk.C1814a;
import com.p068uc.crashsdk.C1823b;
import com.p068uc.crashsdk.C1825d;
import com.p068uc.crashsdk.C1826e;
import com.p068uc.crashsdk.C1828g;
import com.p068uc.crashsdk.JNIBridge;
import com.p068uc.crashsdk.p069a.C1815a;
import com.p068uc.crashsdk.p069a.C1818d;
import com.p068uc.crashsdk.p069a.C1821g;
import com.p068uc.crashsdk.p069a.C1822h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class CrashApi {

    /* renamed from: a */
    private static CrashApi f8122a = null;

    /* renamed from: c */
    private static boolean f8123c = true;

    /* renamed from: d */
    private static boolean f8124d = false;

    /* renamed from: b */
    private boolean f8125b;

    private CrashApi(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient, boolean z3, boolean z4, boolean z5) {
        this.f8125b = false;
        Context contextM6583a = m6583a(context);
        m6589b(contextM6583a);
        C1823b.f8023g = z4;
        C1823b.f8024h = z5;
        if (C1823b.m6376I()) {
            m6589b(contextM6583a);
            m6585a(contextM6583a, customInfo, versionInfo, iCrashClient);
            if (z3) {
                m6584a();
            }
            if (C1823b.f8023g && C1826e.m6532d("libcrashsdk.so")) {
                C1823b.f8022f = true;
                m6588b();
                return;
            }
            return;
        }
        if (customInfo == null || versionInfo == null) {
            C1815a.m6247d("crashsdk", "VersionInfo and CustomInfo can not be null!");
            throw null;
        }
        C1828g.m6645a(customInfo);
        try {
            C1826e.m6491a(C1826e.m6529d(customInfo.mIsInternational), true);
            m6585a(contextM6583a, customInfo, versionInfo, iCrashClient);
        } catch (Throwable th) {
            m6586a(th);
        }
        if (z3) {
            try {
                m6584a();
            } catch (Throwable th2) {
                m6586a(th2);
            }
        }
        try {
            C1823b.m6377J();
            C1822h.m6322a();
            C1818d.m6266a();
            C1821g.m6316j();
        } catch (Throwable th3) {
            C1821g.m6293a(th3);
        }
        try {
            if (!C1823b.m6400a(contextM6583a)) {
                C1815a.m6247d("crashsdk", "registerLifecycleCallbacks failed!");
            }
        } catch (Throwable th4) {
            C1821g.m6293a(th4);
        }
        try {
            C1814a.m6238n();
            try {
                C1826e.m6577z();
            } catch (Throwable th5) {
                C1821g.m6302b(th5);
            }
            C1826e.m6448A();
        } catch (Throwable th6) {
            C1821g.m6293a(th6);
        }
        try {
            if (C1828g.m6667r() && C1823b.m6370C() && !this.f8125b) {
                C1826e.m6453F();
                this.f8125b = true;
            }
        } catch (Throwable th7) {
            C1821g.m6302b(th7);
        }
    }

    /* renamed from: a */
    private static void m6584a() {
        if (C1823b.f8007a) {
            C1815a.m6244b("Has enabled java log!");
            return;
        }
        C1826e.m6569r();
        C1826e.m6560n();
        C1823b.f8007a = true;
    }

    /* renamed from: b */
    private static void m6588b() {
        synchronized (C1823b.f8021e) {
            if (C1823b.f8023g && C1823b.f8022f) {
                if (C1823b.f8018b) {
                    C1815a.m6244b("Has enabled native log!");
                    return;
                }
                m6590c();
                C1826e.m6450C();
                C1823b.f8018b = true;
                JNIBridge.cmd(6);
                C1828g.m6653d();
            }
        }
    }

    /* renamed from: c */
    private static void m6590c() {
        if (C1823b.f8020d) {
            return;
        }
        C1828g.m6650b();
        JNIBridge.cmd(5);
        C1828g.m6651c();
        C1823b.f8020d = true;
    }

    public static synchronized CrashApi createInstance(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient, boolean z3, boolean z4, boolean z5) {
        if (f8122a == null) {
            f8122a = new CrashApi(context, customInfo, versionInfo, iCrashClient, z3, z4, z5);
        }
        return f8122a;
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z3) {
        return createInstanceEx(context, str, z3, null);
    }

    public static CrashApi getInstance() {
        return f8122a;
    }

    public int addCachedInfo(String str, String str2) {
        if (str == null || str2 == null) {
            throw null;
        }
        return C1814a.m6221b(str, str2);
    }

    public int addDumpFile(DumpFileInfo dumpFileInfo) {
        String str;
        Objects.requireNonNull(dumpFileInfo);
        String str2 = dumpFileInfo.mCategory;
        if (str2 == null || (str = dumpFileInfo.mFileTobeDump) == null) {
            throw null;
        }
        int i4 = dumpFileInfo.mLogType;
        if ((1048849 & i4) == 0) {
            return 0;
        }
        return C1814a.m6208a(str2, str, dumpFileInfo.mIsEncrypted, dumpFileInfo.mWriteCategory, i4, dumpFileInfo.mDeleteAfterDump);
    }

    public void addHeaderInfo(String str, String str2) {
        Objects.requireNonNull(str);
        C1814a.m6217a(str, str2);
    }

    public boolean addStatInfo(String str, String str2) {
        if (m6587a("addStatInfo")) {
            return false;
        }
        if (C1821g.m6298a(str)) {
            throw null;
        }
        if (str.length() > 24) {
            throw new IllegalArgumentException("key is too long!");
        }
        if (str2 != null && str2.length() > 512) {
            str2 = str2.substring(0, EventType.AUTH_SUCC);
        }
        return C1822h.m6334a(str, str2);
    }

    public void crashSoLoaded() {
        if (m6587a("crashSoLoaded")) {
            return;
        }
        C1823b.f8022f = true;
        m6588b();
        synchronized (C1823b.f8021e) {
            if (C1823b.f8024h && C1823b.f8022f && !C1823b.f8019c) {
                if (!C1823b.f8020d) {
                    m6590c();
                    C1828g.m6653d();
                }
                C1826e.m6574w();
                C1823b.f8019c = true;
            }
        }
        C1814a.m6238n();
        C1826e.m6557l();
    }

    public int createCachedInfo(String str, int i4, int i5) {
        Objects.requireNonNull(str);
        if (i4 <= 0) {
            throw new IllegalArgumentException("capacity must > 0!");
        }
        if ((1048849 & i5) == 0) {
            return 0;
        }
        return C1814a.m6206a(str, i4, i5);
    }

    public void disableLog(int i4) {
        synchronized (C1823b.f8021e) {
            C1823b.m6406b(i4);
            if (LogType.isForJava(i4) && C1823b.f8007a) {
                C1826e.m6570s();
                C1823b.f8007a = false;
            }
            if (LogType.isForNative(i4)) {
                if (C1823b.f8018b) {
                    JNIBridge.cmd(9);
                    C1823b.f8018b = false;
                } else {
                    C1823b.f8023g = false;
                }
            }
            if (LogType.isForANR(i4)) {
                C1823b.m6398a(false);
            }
            if (LogType.isForUnexp(i4)) {
                if (!C1823b.f8019c) {
                    C1823b.f8024h = false;
                } else if (C1826e.m6576y()) {
                    C1823b.f8019c = false;
                }
            }
        }
    }

    public boolean generateCustomLog(CustomLogInfo customLogInfo) {
        String str;
        StringBuilder sb;
        Objects.requireNonNull(customLogInfo);
        if (customLogInfo.mData == null || (str = customLogInfo.mLogType) == null) {
            throw new NullPointerException("mData or mLogType is null!");
        }
        if (str.contains("_") || customLogInfo.mLogType.contains(" ")) {
            throw new IllegalArgumentException("mLogType can not contain char '_' and ' '");
        }
        ArrayList<Integer> arrayList = customLogInfo.mDumpTids;
        if (arrayList == null || arrayList.size() <= 0) {
            sb = null;
        } else {
            sb = new StringBuilder();
            Iterator<Integer> it = customLogInfo.mDumpTids.iterator();
            while (it.hasNext()) {
                sb.append(it.next().intValue());
                sb.append(" ");
            }
        }
        long j4 = customLogInfo.mAddHeader ? 1L : 0L;
        if (customLogInfo.mAddFooter) {
            j4 |= 2;
        }
        if (customLogInfo.mAddLogcat) {
            j4 |= 4;
        }
        if (customLogInfo.mAddThreadsDump) {
            j4 |= 8;
        }
        if (customLogInfo.mAddBuildId) {
            j4 |= 16;
        }
        if (customLogInfo.mUploadNow) {
            j4 |= 32;
        }
        return C1826e.m6503a(customLogInfo.mData, customLogInfo.mLogType, j4, customLogInfo.mDumpFiles, customLogInfo.mCallbacks, customLogInfo.mCachedInfos, sb != null ? sb.toString() : null);
    }

    public boolean generateTraces(String str, long j4) {
        if (m6587a("generateTraces")) {
            return false;
        }
        if (C1823b.f8020d) {
            return JNIBridge.nativeCmd(12, j4, str, null) == 1;
        }
        C1815a.m6247d("crashsdk", "Crash so is not loaded!");
        return false;
    }

    public String getCrashLogUploadUrl() {
        if (m6587a("getCrashLogUploadUrl")) {
            return null;
        }
        return C1826e.m6554k();
    }

    public ParcelFileDescriptor getHostFd() {
        return C1826e.m6451D();
    }

    public ParcelFileDescriptor getIsolatedHostFd() {
        return C1826e.m6451D();
    }

    public int getLastExitType() {
        if (m6587a("getLastExitType")) {
            return 1;
        }
        return C1823b.m6373F();
    }

    public int getLastExitTypeEx() {
        if (m6587a("getLastExitTypeEx")) {
            return 1;
        }
        return C1823b.m6374G();
    }

    public Throwable getUncaughtException() {
        return C1826e.m6572u();
    }

    public int getUnexpReason() {
        if (m6587a("getUnexpReason")) {
            return 100;
        }
        return C1826e.m6573v();
    }

    public void onExit() {
        C1823b.m6429t();
    }

    public boolean registerCallback(int i4, ValueCallback<Bundle> valueCallback) {
        Objects.requireNonNull(valueCallback);
        if (i4 == 1) {
            return C1825d.m6444a(valueCallback);
        }
        if (i4 == 2) {
            return C1825d.m6446c(valueCallback);
        }
        if (i4 == 3) {
            return C1825d.m6447d(valueCallback);
        }
        if (i4 == 4) {
            return C1825d.m6445b(valueCallback);
        }
        throw new IllegalArgumentException("Unknown event type: " + i4);
    }

    public int registerInfoCallback(String str, int i4) {
        Objects.requireNonNull(str);
        if ((1048849 & i4) == 0) {
            return 0;
        }
        return C1814a.m6207a(str, i4, null, 0L, 0);
    }

    public int registerThread(int i4, String str) {
        return C1814a.m6205a(i4, str);
    }

    public int reportCrashStats(boolean z3) {
        if (m6587a("reportCrashStats")) {
            return 0;
        }
        return C1826e.m6507b(z3, true);
    }

    public int resetCrashStats(boolean z3) {
        if (m6587a("resetCrashStats")) {
            return 0;
        }
        return C1826e.m6534e(z3);
    }

    public void setForeground(boolean z3) {
        C1823b.m6408b(z3);
    }

    public boolean setHostFd(ParcelFileDescriptor parcelFileDescriptor) {
        return C1826e.m6498a(parcelFileDescriptor);
    }

    public boolean setIsolatedHostFd(ParcelFileDescriptor parcelFileDescriptor) {
        return C1826e.m6498a(parcelFileDescriptor);
    }

    public void setNewInstall() {
        if (m6587a("setNewInstall")) {
            return;
        }
        C1823b.m6428s();
    }

    public int updateCustomInfo(CustomInfo customInfo) {
        Objects.requireNonNull(customInfo);
        return C1828g.m6649b(customInfo);
    }

    public boolean updateUnexpInfo() {
        if (m6587a("updateUnexpInfo")) {
            return false;
        }
        return C1814a.m6220a(true);
    }

    public void updateVersionInfo(VersionInfo versionInfo) {
        Objects.requireNonNull(versionInfo);
        C1828g.m6647a(versionInfo);
    }

    public void uploadCrashLogs() {
        if (m6587a("uploadCrashLogs")) {
            return;
        }
        C1826e.m6504a(false, true);
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z3, Bundle bundle) {
        return createInstanceEx(context, str, z3, bundle, null);
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z3, Bundle bundle, ICrashClient iCrashClient) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        CrashApi crashApi = f8122a;
        if (crashApi != null) {
            return crashApi;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        f8123c = bundle.getBoolean("useApplicationContext", true);
        Context contextM6583a = m6583a(context);
        m6589b(contextM6583a);
        CustomInfo customInfo = new CustomInfo(str);
        customInfo.mEnableStatReport = true;
        customInfo.mZipLog = true;
        customInfo.mPrintStackInfos = z3;
        CustomInfo customInfoM6641a = C1828g.m6641a(customInfo, bundle);
        VersionInfo versionInfoM6642a = C1828g.m6642a(bundle);
        boolean z4 = bundle.getBoolean("enableJavaLog", true);
        boolean z5 = bundle.getBoolean("enableNativeLog", true);
        boolean z6 = bundle.getBoolean("enableUnexpLog", C1823b.m6370C());
        boolean z7 = bundle.getBoolean("enableANRLog", true);
        CrashApi crashApiCreateInstance = createInstance(contextM6583a, customInfoM6641a, versionInfoM6642a, iCrashClient, z4, z5, z6);
        C1823b.m6398a(z7);
        if (z5 || z6) {
            if (C1826e.m6532d("libcrashsdk.so")) {
                crashApiCreateInstance.crashSoLoaded();
            } else {
                C1815a.m6247d("crashsdk", "load libcrashsdk.so failed!");
            }
        }
        int i4 = bundle.getInt("uploadLogDelaySeconds", 15);
        if (i4 >= 0 && C1823b.m6370C()) {
            C1826e.m6510b(i4);
        }
        return crashApiCreateInstance;
    }

    public int registerInfoCallback(String str, int i4, Callable<String> callable) {
        if (str == null || callable == null) {
            throw null;
        }
        if ((1048849 & i4) == 0) {
            return 0;
        }
        return C1814a.m6207a(str, i4, callable, 0L, 0);
    }

    public int updateCustomInfo(Bundle bundle) {
        Objects.requireNonNull(bundle);
        return updateCustomInfo(C1828g.m6641a((CustomInfo) null, bundle));
    }

    public void updateVersionInfo(Bundle bundle) {
        Objects.requireNonNull(bundle);
        updateVersionInfo(C1828g.m6642a(bundle));
    }

    /* renamed from: a */
    private static void m6585a(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient) {
        C1825d.m6440a(iCrashClient);
        C1828g.m6646a(customInfo, versionInfo);
        if (C1823b.m6376I()) {
            return;
        }
        C1826e.m6562o();
        C1826e.m6485a(context);
        C1826e.m6511b(context);
    }

    public int addDumpFile(String str, String str2, int i4, Bundle bundle) {
        DumpFileInfo dumpFileInfo = new DumpFileInfo(str, str2, i4);
        if (bundle != null) {
            dumpFileInfo.mIsEncrypted = bundle.getBoolean("mIsEncrypted", dumpFileInfo.mIsEncrypted);
            dumpFileInfo.mWriteCategory = bundle.getBoolean("mWriteCategory", dumpFileInfo.mWriteCategory);
            dumpFileInfo.mDeleteAfterDump = bundle.getBoolean("mDeleteAfterDump", dumpFileInfo.mDeleteAfterDump);
        }
        return addDumpFile(dumpFileInfo);
    }

    /* renamed from: a */
    private static Context m6583a(Context context) {
        if (context != null) {
            if (!f8123c || (context instanceof Application) || ((context = context.getApplicationContext()) != null && (context instanceof Application))) {
                return context;
            }
            C1815a.m6247d("crashsdk", "Can not get Application context from given context!");
            throw new IllegalArgumentException("Can not get Application context from given context!");
        }
        C1815a.m6247d("crashsdk", "context can not be null!");
        throw null;
    }

    /* renamed from: b */
    private static void m6589b(Context context) {
        try {
            if (f8124d) {
                return;
            }
            C1821g.m6290a(context);
            C1814a.f7901a = context.getPackageName();
            f8124d = true;
        } catch (Throwable th) {
            m6586a(th);
        }
    }

    /* renamed from: a */
    private static void m6586a(Throwable th) {
        new C1826e().m6578a(Thread.currentThread(), th, true);
    }

    public boolean generateCustomLog(StringBuffer stringBuffer, String str, Bundle bundle) {
        CustomLogInfo customLogInfo = new CustomLogInfo(stringBuffer, str);
        if (bundle != null) {
            customLogInfo.mAddHeader = bundle.getBoolean("mAddHeader", customLogInfo.mAddHeader);
            customLogInfo.mAddFooter = bundle.getBoolean("mAddFooter", customLogInfo.mAddFooter);
            customLogInfo.mAddLogcat = bundle.getBoolean("mAddLogcat", customLogInfo.mAddLogcat);
            customLogInfo.mUploadNow = bundle.getBoolean("mUploadNow", customLogInfo.mUploadNow);
            customLogInfo.mAddThreadsDump = bundle.getBoolean("mAddThreadsDump", customLogInfo.mAddThreadsDump);
            customLogInfo.mAddBuildId = bundle.getBoolean("mAddBuildId", customLogInfo.mAddBuildId);
            customLogInfo.mDumpFiles = bundle.getStringArrayList("mDumpFiles");
            customLogInfo.mCallbacks = bundle.getStringArrayList("mCallbacks");
            customLogInfo.mCachedInfos = bundle.getStringArrayList("mCachedInfos");
            customLogInfo.mDumpTids = bundle.getIntegerArrayList("mDumpTids");
        }
        return generateCustomLog(customLogInfo);
    }

    /* renamed from: a */
    private static boolean m6587a(String str) {
        if (!C1823b.m6376I()) {
            return false;
        }
        C1815a.m6247d("crashsdk", "Can not call '" + str + "' in isolated process!");
        return true;
    }
}
