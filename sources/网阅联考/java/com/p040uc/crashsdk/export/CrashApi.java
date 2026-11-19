package com.p040uc.crashsdk.export;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.webkit.ValueCallback;
import com.p040uc.crashsdk.C3298a;
import com.p040uc.crashsdk.C3307b;
import com.p040uc.crashsdk.C3309d;
import com.p040uc.crashsdk.C3310e;
import com.p040uc.crashsdk.C3312g;
import com.p040uc.crashsdk.JNIBridge;
import com.p040uc.crashsdk.p041a.C3299a;
import com.p040uc.crashsdk.p041a.C3302d;
import com.p040uc.crashsdk.p041a.C3305g;
import com.p040uc.crashsdk.p041a.C3306h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class CrashApi {

    /* renamed from: a */
    private static CrashApi f1530a = null;

    /* renamed from: c */
    private static boolean f1531c = true;

    /* renamed from: d */
    private static boolean f1532d = false;

    /* renamed from: b */
    private boolean f1533b;

    private CrashApi(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient, boolean z3, boolean z4, boolean z5) {
        this.f1533b = false;
        Context contextM2660a = m2660a(context);
        m2666b(contextM2660a);
        C3307b.f1431g = z4;
        C3307b.f1432h = z5;
        if (C3307b.m2453I()) {
            m2666b(contextM2660a);
            m2662a(contextM2660a, customInfo, versionInfo, iCrashClient);
            if (z3) {
                m2661a();
            }
            if (C3307b.f1431g && C3310e.m2609d("libcrashsdk.so")) {
                C3307b.f1430f = true;
                m2665b();
                return;
            }
            return;
        }
        if (customInfo == null || versionInfo == null) {
            C3299a.m2324d("crashsdk", "VersionInfo and CustomInfo can not be null!");
            throw null;
        }
        C3312g.m2722a(customInfo);
        try {
            C3310e.m2568a(C3310e.m2606d(customInfo.mIsInternational), true);
            m2662a(contextM2660a, customInfo, versionInfo, iCrashClient);
        } catch (Throwable th) {
            m2663a(th);
        }
        if (z3) {
            try {
                m2661a();
            } catch (Throwable th2) {
                m2663a(th2);
            }
        }
        try {
            C3307b.m2454J();
            C3306h.m2399a();
            C3302d.m2343a();
            C3305g.m2393j();
        } catch (Throwable th3) {
            C3305g.m2370a(th3);
        }
        try {
            if (!C3307b.m2477a(contextM2660a)) {
                C3299a.m2324d("crashsdk", "registerLifecycleCallbacks failed!");
            }
        } catch (Throwable th4) {
            C3305g.m2370a(th4);
        }
        try {
            C3298a.m2315n();
            try {
                C3310e.m2654z();
            } catch (Throwable th5) {
                C3305g.m2379b(th5);
            }
            C3310e.m2525A();
        } catch (Throwable th6) {
            C3305g.m2370a(th6);
        }
        try {
            if (C3312g.m2744r() && C3307b.m2447C() && !this.f1533b) {
                C3310e.m2530F();
                this.f1533b = true;
            }
        } catch (Throwable th7) {
            C3305g.m2379b(th7);
        }
    }

    /* renamed from: a */
    private static void m2661a() {
        if (C3307b.f1415a) {
            C3299a.m2321b("Has enabled java log!");
            return;
        }
        C3310e.m2646r();
        C3310e.m2637n();
        C3307b.f1415a = true;
    }

    /* renamed from: b */
    private static void m2665b() {
        synchronized (C3307b.f1429e) {
            if (C3307b.f1431g && C3307b.f1430f) {
                if (C3307b.f1426b) {
                    C3299a.m2321b("Has enabled native log!");
                    return;
                }
                m2667c();
                C3310e.m2527C();
                C3307b.f1426b = true;
                JNIBridge.cmd(6);
                C3312g.m2730d();
            }
        }
    }

    /* renamed from: c */
    private static void m2667c() {
        if (C3307b.f1428d) {
            return;
        }
        C3312g.m2727b();
        JNIBridge.cmd(5);
        C3312g.m2728c();
        C3307b.f1428d = true;
    }

    public static synchronized CrashApi createInstance(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient, boolean z3, boolean z4, boolean z5) {
        if (f1530a == null) {
            f1530a = new CrashApi(context, customInfo, versionInfo, iCrashClient, z3, z4, z5);
        }
        return f1530a;
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z3) {
        return createInstanceEx(context, str, z3, null);
    }

    public static CrashApi getInstance() {
        return f1530a;
    }

    public int addCachedInfo(String str, String str2) {
        if (str == null || str2 == null) {
            throw null;
        }
        return C3298a.m2298b(str, str2);
    }

    public int addDumpFile(DumpFileInfo dumpFileInfo) {
        String str;
        dumpFileInfo.getClass();
        String str2 = dumpFileInfo.mCategory;
        if (str2 == null || (str = dumpFileInfo.mFileTobeDump) == null) {
            throw null;
        }
        int i4 = dumpFileInfo.mLogType;
        if ((1048849 & i4) == 0) {
            return 0;
        }
        return C3298a.m2285a(str2, str, dumpFileInfo.mIsEncrypted, dumpFileInfo.mWriteCategory, i4, dumpFileInfo.mDeleteAfterDump);
    }

    public void addHeaderInfo(String str, String str2) {
        str.getClass();
        C3298a.m2294a(str, str2);
    }

    public boolean addStatInfo(String str, String str2) {
        if (m2664a("addStatInfo")) {
            return false;
        }
        if (C3305g.m2375a(str)) {
            throw null;
        }
        if (str.length() > 24) {
            throw new IllegalArgumentException("key is too long!");
        }
        if (str2 != null && str2.length() > 512) {
            str2 = str2.substring(0, 512);
        }
        return C3306h.m2411a(str, str2);
    }

    public void crashSoLoaded() {
        if (m2664a("crashSoLoaded")) {
            return;
        }
        C3307b.f1430f = true;
        m2665b();
        synchronized (C3307b.f1429e) {
            if (C3307b.f1432h && C3307b.f1430f && !C3307b.f1427c) {
                if (!C3307b.f1428d) {
                    m2667c();
                    C3312g.m2730d();
                }
                C3310e.m2651w();
                C3307b.f1427c = true;
            }
        }
        C3298a.m2315n();
        C3310e.m2634l();
    }

    public int createCachedInfo(String str, int i4, int i5) {
        str.getClass();
        if (i4 <= 0) {
            throw new IllegalArgumentException("capacity must > 0!");
        }
        if ((1048849 & i5) == 0) {
            return 0;
        }
        return C3298a.m2283a(str, i4, i5);
    }

    public void disableLog(int i4) {
        synchronized (C3307b.f1429e) {
            C3307b.m2483b(i4);
            if (LogType.isForJava(i4) && C3307b.f1415a) {
                C3310e.m2647s();
                C3307b.f1415a = false;
            }
            if (LogType.isForNative(i4)) {
                if (C3307b.f1426b) {
                    JNIBridge.cmd(9);
                    C3307b.f1426b = false;
                } else {
                    C3307b.f1431g = false;
                }
            }
            if (LogType.isForANR(i4)) {
                C3307b.m2475a(false);
            }
            if (LogType.isForUnexp(i4)) {
                if (!C3307b.f1427c) {
                    C3307b.f1432h = false;
                } else if (C3310e.m2653y()) {
                    C3307b.f1427c = false;
                }
            }
        }
    }

    public boolean generateCustomLog(CustomLogInfo customLogInfo) {
        String str;
        StringBuilder sb;
        customLogInfo.getClass();
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
        return C3310e.m2580a(customLogInfo.mData, customLogInfo.mLogType, j4, customLogInfo.mDumpFiles, customLogInfo.mCallbacks, customLogInfo.mCachedInfos, sb != null ? sb.toString() : null);
    }

    public boolean generateTraces(String str, long j4) {
        if (m2664a("generateTraces")) {
            return false;
        }
        if (C3307b.f1428d) {
            return JNIBridge.nativeCmd(12, j4, str, null) == 1;
        }
        C3299a.m2324d("crashsdk", "Crash so is not loaded!");
        return false;
    }

    public String getCrashLogUploadUrl() {
        if (m2664a("getCrashLogUploadUrl")) {
            return null;
        }
        return C3310e.m2631k();
    }

    public ParcelFileDescriptor getHostFd() {
        return C3310e.m2528D();
    }

    public ParcelFileDescriptor getIsolatedHostFd() {
        return C3310e.m2528D();
    }

    public int getLastExitType() {
        if (m2664a("getLastExitType")) {
            return 1;
        }
        return C3307b.m2450F();
    }

    public int getLastExitTypeEx() {
        if (m2664a("getLastExitTypeEx")) {
            return 1;
        }
        return C3307b.m2451G();
    }

    public Throwable getUncaughtException() {
        return C3310e.m2649u();
    }

    public int getUnexpReason() {
        if (m2664a("getUnexpReason")) {
            return 100;
        }
        return C3310e.m2650v();
    }

    public void onExit() {
        C3307b.m2506t();
    }

    public boolean registerCallback(int i4, ValueCallback<Bundle> valueCallback) {
        valueCallback.getClass();
        if (i4 == 1) {
            return C3309d.m2521a(valueCallback);
        }
        if (i4 == 2) {
            return C3309d.m2523c(valueCallback);
        }
        if (i4 == 3) {
            return C3309d.m2524d(valueCallback);
        }
        if (i4 == 4) {
            return C3309d.m2522b(valueCallback);
        }
        throw new IllegalArgumentException("Unknown event type: " + i4);
    }

    public int registerInfoCallback(String str, int i4) {
        str.getClass();
        if ((1048849 & i4) == 0) {
            return 0;
        }
        return C3298a.m2284a(str, i4, null, 0L, 0);
    }

    public int registerThread(int i4, String str) {
        return C3298a.m2282a(i4, str);
    }

    public int reportCrashStats(boolean z3) {
        if (m2664a("reportCrashStats")) {
            return 0;
        }
        return C3310e.m2584b(z3, true);
    }

    public int resetCrashStats(boolean z3) {
        if (m2664a("resetCrashStats")) {
            return 0;
        }
        return C3310e.m2611e(z3);
    }

    public void setForeground(boolean z3) {
        C3307b.m2485b(z3);
    }

    public boolean setHostFd(ParcelFileDescriptor parcelFileDescriptor) {
        return C3310e.m2575a(parcelFileDescriptor);
    }

    public boolean setIsolatedHostFd(ParcelFileDescriptor parcelFileDescriptor) {
        return C3310e.m2575a(parcelFileDescriptor);
    }

    public void setNewInstall() {
        if (m2664a("setNewInstall")) {
            return;
        }
        C3307b.m2505s();
    }

    public int updateCustomInfo(CustomInfo customInfo) {
        customInfo.getClass();
        return C3312g.m2726b(customInfo);
    }

    public boolean updateUnexpInfo() {
        if (m2664a("updateUnexpInfo")) {
            return false;
        }
        return C3298a.m2297a(true);
    }

    public void updateVersionInfo(VersionInfo versionInfo) {
        versionInfo.getClass();
        C3312g.m2724a(versionInfo);
    }

    public void uploadCrashLogs() {
        if (m2664a("uploadCrashLogs")) {
            return;
        }
        C3310e.m2581a(false, true);
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z3, Bundle bundle) {
        return createInstanceEx(context, str, z3, bundle, null);
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z3, Bundle bundle, ICrashClient iCrashClient) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        CrashApi crashApi = f1530a;
        if (crashApi != null) {
            return crashApi;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        f1531c = bundle.getBoolean("useApplicationContext", true);
        Context contextM2660a = m2660a(context);
        m2666b(contextM2660a);
        CustomInfo customInfo = new CustomInfo(str);
        customInfo.mEnableStatReport = true;
        customInfo.mZipLog = true;
        customInfo.mPrintStackInfos = z3;
        CustomInfo customInfoM2718a = C3312g.m2718a(customInfo, bundle);
        VersionInfo versionInfoM2719a = C3312g.m2719a(bundle);
        boolean z4 = bundle.getBoolean("enableJavaLog", true);
        boolean z5 = bundle.getBoolean("enableNativeLog", true);
        boolean z6 = bundle.getBoolean("enableUnexpLog", C3307b.m2447C());
        boolean z7 = bundle.getBoolean("enableANRLog", true);
        CrashApi crashApiCreateInstance = createInstance(contextM2660a, customInfoM2718a, versionInfoM2719a, iCrashClient, z4, z5, z6);
        C3307b.m2475a(z7);
        if (z5 || z6) {
            if (C3310e.m2609d("libcrashsdk.so")) {
                crashApiCreateInstance.crashSoLoaded();
            } else {
                C3299a.m2324d("crashsdk", "load libcrashsdk.so failed!");
            }
        }
        int i4 = bundle.getInt("uploadLogDelaySeconds", 15);
        if (i4 >= 0 && C3307b.m2447C()) {
            C3310e.m2587b(i4);
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
        return C3298a.m2284a(str, i4, callable, 0L, 0);
    }

    public int updateCustomInfo(Bundle bundle) {
        bundle.getClass();
        return updateCustomInfo(C3312g.m2718a((CustomInfo) null, bundle));
    }

    public void updateVersionInfo(Bundle bundle) {
        bundle.getClass();
        updateVersionInfo(C3312g.m2719a(bundle));
    }

    /* renamed from: a */
    private static void m2662a(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient) {
        C3309d.m2517a(iCrashClient);
        C3312g.m2723a(customInfo, versionInfo);
        if (C3307b.m2453I()) {
            return;
        }
        C3310e.m2639o();
        C3310e.m2562a(context);
        C3310e.m2588b(context);
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
    private static Context m2660a(Context context) {
        if (context != null) {
            if (!f1531c || (context instanceof Application) || ((context = context.getApplicationContext()) != null && (context instanceof Application))) {
                return context;
            }
            C3299a.m2324d("crashsdk", "Can not get Application context from given context!");
            throw new IllegalArgumentException("Can not get Application context from given context!");
        }
        C3299a.m2324d("crashsdk", "context can not be null!");
        throw null;
    }

    /* renamed from: b */
    private static void m2666b(Context context) {
        try {
            if (f1532d) {
                return;
            }
            C3305g.m2367a(context);
            C3298a.f1309a = context.getPackageName();
            f1532d = true;
        } catch (Throwable th) {
            m2663a(th);
        }
    }

    /* renamed from: a */
    private static void m2663a(Throwable th) {
        new C3310e().m2655a(Thread.currentThread(), th, true);
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
    private static boolean m2664a(String str) {
        if (!C3307b.m2453I()) {
            return false;
        }
        C3299a.m2324d("crashsdk", "Can not call '" + str + "' in isolated process!");
        return true;
    }
}
