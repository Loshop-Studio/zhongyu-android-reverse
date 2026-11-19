package com.p071uc.crashsdk.export;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.webkit.ValueCallback;
import com.p071uc.crashsdk.C6737a;
import com.p071uc.crashsdk.C6746b;
import com.p071uc.crashsdk.C6748d;
import com.p071uc.crashsdk.C6749e;
import com.p071uc.crashsdk.C6751g;
import com.p071uc.crashsdk.JNIBridge;
import com.p071uc.crashsdk.p072a.C6738a;
import com.p071uc.crashsdk.p072a.C6741d;
import com.p071uc.crashsdk.p072a.C6744g;
import com.p071uc.crashsdk.p072a.C6745h;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public class CrashApi {

    /* renamed from: a */
    private static CrashApi f6528a = null;

    /* renamed from: c */
    private static boolean f6529c = true;

    /* renamed from: d */
    private static boolean f6530d = false;

    /* renamed from: b */
    private boolean f6531b;

    private CrashApi(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient, boolean z9, boolean z10, boolean z11) {
        this.f6531b = false;
        Context contextM5904a = m5904a(context);
        m5910b(contextM5904a);
        C6746b.f6429g = z10;
        C6746b.f6430h = z11;
        if (C6746b.m5697I()) {
            m5910b(contextM5904a);
            m5906a(contextM5904a, customInfo, versionInfo, iCrashClient);
            if (z9) {
                m5905a();
            }
            if (C6746b.f6429g && C6749e.m5853d("libcrashsdk.so")) {
                C6746b.f6428f = true;
                m5909b();
                return;
            }
            return;
        }
        if (customInfo == null || versionInfo == null) {
            C6738a.m5568d("crashsdk", "VersionInfo and CustomInfo can not be null!");
            throw null;
        }
        C6751g.m5966a(customInfo);
        try {
            C6749e.m5812a(C6749e.m5850d(customInfo.mIsInternational), true);
            m5906a(contextM5904a, customInfo, versionInfo, iCrashClient);
        } catch (Throwable th) {
            m5907a(th);
        }
        if (z9) {
            try {
                m5905a();
            } catch (Throwable th2) {
                m5907a(th2);
            }
        }
        try {
            C6746b.m5698J();
            C6745h.m5643a();
            C6741d.m5587a();
            C6744g.m5637j();
        } catch (Throwable th3) {
            C6744g.m5614a(th3);
        }
        try {
            if (!C6746b.m5721a(contextM5904a)) {
                C6738a.m5568d("crashsdk", "registerLifecycleCallbacks failed!");
            }
        } catch (Throwable th4) {
            C6744g.m5614a(th4);
        }
        try {
            C6737a.m5559n();
            try {
                C6749e.m5898z();
            } catch (Throwable th5) {
                C6744g.m5623b(th5);
            }
            C6749e.m5769A();
        } catch (Throwable th6) {
            C6744g.m5614a(th6);
        }
        try {
            if (C6751g.m5988r() && C6746b.m5691C() && !this.f6531b) {
                C6749e.m5774F();
                this.f6531b = true;
            }
        } catch (Throwable th7) {
            C6744g.m5623b(th7);
        }
    }

    /* renamed from: a */
    private static void m5905a() {
        if (C6746b.f6413a) {
            C6738a.m5565b("Has enabled java log!");
            return;
        }
        C6749e.m5890r();
        C6749e.m5881n();
        C6746b.f6413a = true;
    }

    /* renamed from: b */
    private static void m5909b() {
        synchronized (C6746b.f6427e) {
            try {
                if (C6746b.f6429g && C6746b.f6428f) {
                    if (C6746b.f6424b) {
                        C6738a.m5565b("Has enabled native log!");
                        return;
                    }
                    m5911c();
                    C6749e.m5771C();
                    C6746b.f6424b = true;
                    JNIBridge.cmd(6);
                    C6751g.m5974d();
                }
            } finally {
            }
        }
    }

    /* renamed from: c */
    private static void m5911c() {
        if (C6746b.f6426d) {
            return;
        }
        C6751g.m5971b();
        JNIBridge.cmd(5);
        C6751g.m5972c();
        C6746b.f6426d = true;
    }

    public static synchronized CrashApi createInstance(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient, boolean z9, boolean z10, boolean z11) {
        try {
            if (f6528a == null) {
                f6528a = new CrashApi(context, customInfo, versionInfo, iCrashClient, z9, z10, z11);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6528a;
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z9) {
        return createInstanceEx(context, str, z9, null);
    }

    public static CrashApi getInstance() {
        return f6528a;
    }

    public int addCachedInfo(String str, String str2) {
        if (str == null || str2 == null) {
            throw null;
        }
        return C6737a.m5542b(str, str2);
    }

    public int addDumpFile(DumpFileInfo dumpFileInfo) {
        String str;
        dumpFileInfo.getClass();
        String str2 = dumpFileInfo.mCategory;
        if (str2 == null || (str = dumpFileInfo.mFileTobeDump) == null) {
            throw null;
        }
        int i9 = dumpFileInfo.mLogType;
        if ((1048849 & i9) == 0) {
            return 0;
        }
        return C6737a.m5529a(str2, str, dumpFileInfo.mIsEncrypted, dumpFileInfo.mWriteCategory, i9, dumpFileInfo.mDeleteAfterDump);
    }

    public void addHeaderInfo(String str, String str2) {
        str.getClass();
        C6737a.m5538a(str, str2);
    }

    public boolean addStatInfo(String str, String str2) {
        if (m5908a("addStatInfo")) {
            return false;
        }
        if (C6744g.m5619a(str)) {
            throw null;
        }
        if (str.length() > 24) {
            throw new IllegalArgumentException("key is too long!");
        }
        if (str2 != null && str2.length() > 512) {
            str2 = str2.substring(0, 512);
        }
        return C6745h.m5655a(str, str2);
    }

    public void crashSoLoaded() {
        if (m5908a("crashSoLoaded")) {
            return;
        }
        C6746b.f6428f = true;
        m5909b();
        synchronized (C6746b.f6427e) {
            try {
                if (C6746b.f6430h && C6746b.f6428f && !C6746b.f6425c) {
                    if (!C6746b.f6426d) {
                        m5911c();
                        C6751g.m5974d();
                    }
                    C6749e.m5895w();
                    C6746b.f6425c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C6737a.m5559n();
        C6749e.m5878l();
    }

    public int createCachedInfo(String str, int i9, int i10) {
        str.getClass();
        if (i9 <= 0) {
            throw new IllegalArgumentException("capacity must > 0!");
        }
        if ((1048849 & i10) == 0) {
            return 0;
        }
        return C6737a.m5527a(str, i9, i10);
    }

    public void disableLog(int i9) {
        synchronized (C6746b.f6427e) {
            try {
                C6746b.m5727b(i9);
                if (LogType.isForJava(i9) && C6746b.f6413a) {
                    C6749e.m5891s();
                    C6746b.f6413a = false;
                }
                if (LogType.isForNative(i9)) {
                    if (C6746b.f6424b) {
                        JNIBridge.cmd(9);
                        C6746b.f6424b = false;
                    } else {
                        C6746b.f6429g = false;
                    }
                }
                if (LogType.isForANR(i9)) {
                    C6746b.m5719a(false);
                }
                if (LogType.isForUnexp(i9)) {
                    if (!C6746b.f6425c) {
                        C6746b.f6430h = false;
                    } else if (C6749e.m5897y()) {
                        C6746b.f6425c = false;
                    }
                }
            } catch (Throwable th) {
                throw th;
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
            ArrayList<Integer> arrayList2 = customLogInfo.mDumpTids;
            int size = arrayList2.size();
            int i9 = 0;
            while (i9 < size) {
                Integer num = arrayList2.get(i9);
                i9++;
                sb.append(num.intValue());
                sb.append(" ");
            }
        }
        long j9 = customLogInfo.mAddHeader ? 1L : 0L;
        if (customLogInfo.mAddFooter) {
            j9 |= 2;
        }
        if (customLogInfo.mAddLogcat) {
            j9 |= 4;
        }
        if (customLogInfo.mAddThreadsDump) {
            j9 |= 8;
        }
        if (customLogInfo.mAddBuildId) {
            j9 |= 16;
        }
        if (customLogInfo.mUploadNow) {
            j9 |= 32;
        }
        return C6749e.m5824a(customLogInfo.mData, customLogInfo.mLogType, j9, customLogInfo.mDumpFiles, customLogInfo.mCallbacks, customLogInfo.mCachedInfos, sb != null ? sb.toString() : null);
    }

    public boolean generateTraces(String str, long j9) {
        if (m5908a("generateTraces")) {
            return false;
        }
        if (C6746b.f6426d) {
            return JNIBridge.nativeCmd(12, j9, str, null) == 1;
        }
        C6738a.m5568d("crashsdk", "Crash so is not loaded!");
        return false;
    }

    public String getCrashLogUploadUrl() {
        if (m5908a("getCrashLogUploadUrl")) {
            return null;
        }
        return C6749e.m5875k();
    }

    public ParcelFileDescriptor getHostFd() {
        return C6749e.m5772D();
    }

    public ParcelFileDescriptor getIsolatedHostFd() {
        return C6749e.m5772D();
    }

    public int getLastExitType() {
        if (m5908a("getLastExitType")) {
            return 1;
        }
        return C6746b.m5694F();
    }

    public int getLastExitTypeEx() {
        if (m5908a("getLastExitTypeEx")) {
            return 1;
        }
        return C6746b.m5695G();
    }

    public Throwable getUncaughtException() {
        return C6749e.m5893u();
    }

    public int getUnexpReason() {
        if (m5908a("getUnexpReason")) {
            return 100;
        }
        return C6749e.m5894v();
    }

    public void onExit() {
        C6746b.m5750t();
    }

    public boolean registerCallback(int i9, ValueCallback<Bundle> valueCallback) {
        valueCallback.getClass();
        if (i9 == 1) {
            return C6748d.m5765a(valueCallback);
        }
        if (i9 == 2) {
            return C6748d.m5767c(valueCallback);
        }
        if (i9 == 3) {
            return C6748d.m5768d(valueCallback);
        }
        if (i9 == 4) {
            return C6748d.m5766b(valueCallback);
        }
        throw new IllegalArgumentException("Unknown event type: " + i9);
    }

    public int registerInfoCallback(String str, int i9) {
        str.getClass();
        if ((1048849 & i9) == 0) {
            return 0;
        }
        return C6737a.m5528a(str, i9, null, 0L, 0);
    }

    public int registerThread(int i9, String str) {
        return C6737a.m5526a(i9, str);
    }

    public int reportCrashStats(boolean z9) {
        if (m5908a("reportCrashStats")) {
            return 0;
        }
        return C6749e.m5828b(z9, true);
    }

    public int resetCrashStats(boolean z9) {
        if (m5908a("resetCrashStats")) {
            return 0;
        }
        return C6749e.m5855e(z9);
    }

    public void setForeground(boolean z9) {
        C6746b.m5729b(z9);
    }

    public boolean setHostFd(ParcelFileDescriptor parcelFileDescriptor) {
        return C6749e.m5819a(parcelFileDescriptor);
    }

    public boolean setIsolatedHostFd(ParcelFileDescriptor parcelFileDescriptor) {
        return C6749e.m5819a(parcelFileDescriptor);
    }

    public void setNewInstall() {
        if (m5908a("setNewInstall")) {
            return;
        }
        C6746b.m5749s();
    }

    public int updateCustomInfo(CustomInfo customInfo) {
        customInfo.getClass();
        return C6751g.m5970b(customInfo);
    }

    public boolean updateUnexpInfo() {
        if (m5908a("updateUnexpInfo")) {
            return false;
        }
        return C6737a.m5541a(true);
    }

    public void updateVersionInfo(VersionInfo versionInfo) {
        versionInfo.getClass();
        C6751g.m5968a(versionInfo);
    }

    public void uploadCrashLogs() {
        if (m5908a("uploadCrashLogs")) {
            return;
        }
        C6749e.m5825a(false, true);
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z9, Bundle bundle) {
        return createInstanceEx(context, str, z9, bundle, null);
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z9, Bundle bundle, ICrashClient iCrashClient) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        CrashApi crashApi = f6528a;
        if (crashApi != null) {
            return crashApi;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        f6529c = bundle.getBoolean("useApplicationContext", true);
        Context contextM5904a = m5904a(context);
        m5910b(contextM5904a);
        CustomInfo customInfo = new CustomInfo(str);
        customInfo.mEnableStatReport = true;
        customInfo.mZipLog = true;
        customInfo.mPrintStackInfos = z9;
        CustomInfo customInfoM5962a = C6751g.m5962a(customInfo, bundle);
        VersionInfo versionInfoM5963a = C6751g.m5963a(bundle);
        boolean z10 = bundle.getBoolean("enableJavaLog", true);
        boolean z11 = bundle.getBoolean("enableNativeLog", true);
        boolean z12 = bundle.getBoolean("enableUnexpLog", C6746b.m5691C());
        boolean z13 = bundle.getBoolean("enableANRLog", true);
        CrashApi crashApiCreateInstance = createInstance(contextM5904a, customInfoM5962a, versionInfoM5963a, iCrashClient, z10, z11, z12);
        C6746b.m5719a(z13);
        if (z11 || z12) {
            if (C6749e.m5853d("libcrashsdk.so")) {
                crashApiCreateInstance.crashSoLoaded();
            } else {
                C6738a.m5568d("crashsdk", "load libcrashsdk.so failed!");
            }
        }
        int i9 = bundle.getInt("uploadLogDelaySeconds", 15);
        if (i9 >= 0 && C6746b.m5691C()) {
            C6749e.m5831b(i9);
        }
        return crashApiCreateInstance;
    }

    public int registerInfoCallback(String str, int i9, Callable<String> callable) {
        if (str == null || callable == null) {
            throw null;
        }
        if ((1048849 & i9) == 0) {
            return 0;
        }
        return C6737a.m5528a(str, i9, callable, 0L, 0);
    }

    public int updateCustomInfo(Bundle bundle) {
        bundle.getClass();
        return updateCustomInfo(C6751g.m5962a((CustomInfo) null, bundle));
    }

    public void updateVersionInfo(Bundle bundle) {
        bundle.getClass();
        updateVersionInfo(C6751g.m5963a(bundle));
    }

    /* renamed from: a */
    private static void m5906a(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient) {
        C6748d.m5761a(iCrashClient);
        C6751g.m5967a(customInfo, versionInfo);
        if (C6746b.m5697I()) {
            return;
        }
        C6749e.m5883o();
        C6749e.m5806a(context);
        C6749e.m5832b(context);
    }

    public int addDumpFile(String str, String str2, int i9, Bundle bundle) {
        DumpFileInfo dumpFileInfo = new DumpFileInfo(str, str2, i9);
        if (bundle != null) {
            dumpFileInfo.mIsEncrypted = bundle.getBoolean("mIsEncrypted", dumpFileInfo.mIsEncrypted);
            dumpFileInfo.mWriteCategory = bundle.getBoolean("mWriteCategory", dumpFileInfo.mWriteCategory);
            dumpFileInfo.mDeleteAfterDump = bundle.getBoolean("mDeleteAfterDump", dumpFileInfo.mDeleteAfterDump);
        }
        return addDumpFile(dumpFileInfo);
    }

    /* renamed from: a */
    private static Context m5904a(Context context) {
        if (context == null) {
            C6738a.m5568d("crashsdk", "context can not be null!");
            throw null;
        }
        if (!f6529c || (context instanceof Application)) {
            return context;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null && (applicationContext instanceof Application)) {
            return applicationContext;
        }
        C6738a.m5568d("crashsdk", "Can not get Application context from given context!");
        throw new IllegalArgumentException("Can not get Application context from given context!");
    }

    /* renamed from: b */
    private static void m5910b(Context context) {
        try {
            if (f6530d) {
                return;
            }
            C6744g.m5611a(context);
            C6737a.f6307a = context.getPackageName();
            f6530d = true;
        } catch (Throwable th) {
            m5907a(th);
        }
    }

    /* renamed from: a */
    private static void m5907a(Throwable th) {
        new C6749e().m5899a(Thread.currentThread(), th, true);
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
    private static boolean m5908a(String str) {
        if (!C6746b.m5697I()) {
            return false;
        }
        C6738a.m5568d("crashsdk", "Can not call '" + str + "' in isolated process!");
        return true;
    }
}
