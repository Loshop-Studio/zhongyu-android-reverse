package com.tencent.bugly.crashreport.crash.jni;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.media.AbstractC0037f;
import android.text.TextUtils;
import com.google.protobuf.DescriptorProtos;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.C4044aa;
import com.tencent.bugly.proguard.C4045ab;
import com.tencent.bugly.proguard.C4046ac;
import com.tencent.bugly.proguard.C4054ak;
import com.tencent.bugly.proguard.C4055al;
import com.tencent.bugly.proguard.C4059ap;
import com.tencent.bugly.proguard.C4062as;
import com.tencent.bugly.proguard.C4063at;
import com.tencent.bugly.proguard.C4076bd;
import com.tencent.bugly.proguard.C4077be;
import com.tencent.bugly.proguard.InterfaceC4131q;

/* loaded from: classes3.dex */
public class NativeCrashHandler implements InterfaceC4131q {

    /* renamed from: a */
    static String f3359a = null;

    /* renamed from: b */
    private static NativeCrashHandler f3360b = null;

    /* renamed from: c */
    private static int f3361c = 1;

    /* renamed from: n */
    private static boolean f3362n = true;

    /* renamed from: d */
    private final Context f3363d;

    /* renamed from: e */
    private final C4044aa f3364e;

    /* renamed from: f */
    private final C4054ak f3365f;

    /* renamed from: g */
    private NativeExceptionHandler f3366g;

    /* renamed from: h */
    private final boolean f3367h;

    /* renamed from: i */
    private boolean f3368i = false;

    /* renamed from: j */
    private boolean f3369j = false;

    /* renamed from: k */
    private boolean f3370k = false;

    /* renamed from: l */
    private boolean f3371l = false;

    /* renamed from: m */
    private C4062as f3372m;

    @SuppressLint({"SdCardPath"})
    private NativeCrashHandler(Context context, C4044aa c4044aa, C4062as c4062as, C4054ak c4054ak, boolean z8, String str) {
        this.f3363d = C4059ap.m3051a(context);
        if (C4059ap.m3084b(f3359a)) {
            try {
                if (C4059ap.m3084b(str)) {
                    str = context.getDir("bugly", 0).getAbsolutePath();
                }
            } catch (Throwable unused) {
                str = AbstractC0037f.m86k("/data/data/", C4044aa.m2888a(context).f3433c, "/app_bugly");
            }
            f3359a = str;
        }
        this.f3372m = c4062as;
        this.f3364e = c4044aa;
        this.f3365f = c4054ak;
        this.f3367h = z8;
        this.f3366g = new C4076bd(context, c4044aa, c4062as, C4046ac.m2951a());
    }

    public static synchronized String getDumpFilePath() {
        return f3359a;
    }

    public static synchronized NativeCrashHandler getInstance(Context context, C4044aa c4044aa, C4062as c4062as, C4046ac c4046ac, C4054ak c4054ak, boolean z8, String str) {
        try {
            if (f3360b == null) {
                f3360b = new NativeCrashHandler(context, c4044aa, c4062as, c4054ak, z8, str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3360b;
    }

    private native String getProperties(String str);

    private native String getSoCpuAbi();

    public static boolean isShouldHandleInJava() {
        return f3362n;
    }

    public static synchronized void setDumpFilePath(String str) {
        f3359a = str;
    }

    public static void setShouldHandleInJava(boolean z8) {
        f3362n = z8;
        NativeCrashHandler nativeCrashHandler = f3360b;
        if (nativeCrashHandler != null) {
            nativeCrashHandler.m2871a(999, String.valueOf(z8));
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC4131q
    public boolean appendLogToNative(String str, String str2, String str3) {
        if ((this.f3368i || this.f3369j) && str != null && str2 != null && str3 != null) {
            try {
                if (this.f3369j) {
                    return appendNativeLog(str, str2, str3);
                }
                Boolean bool = (Boolean) C4059ap.m3054a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "appendNativeLog", new Class[]{String.class, String.class, String.class}, new Object[]{str, str2, str3});
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                if (!C4055al.m3022a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return false;
    }

    public native boolean appendNativeLog(String str, String str2, String str3);

    public native boolean appendWholeNativeLog(String str);

    public void checkUploadRecordCrash() {
        this.f3365f.m3014a(new RunnableC4040a(this));
    }

    public void disableCatchAnrTrace() {
        f3361c = 1;
    }

    public void dumpAnrNativeStack() {
        m2871a(19, "1");
    }

    public void enableCatchAnrTrace() {
        f3361c |= 2;
    }

    public boolean filterSigabrtSysLog() {
        return m2871a(DescriptorProtos.Edition.EDITION_PROTO2_VALUE, "true");
    }

    @Override // com.tencent.bugly.proguard.InterfaceC4131q
    public String getLogFromNative() {
        if (!this.f3368i && !this.f3369j) {
            return null;
        }
        try {
            return this.f3369j ? getNativeLog() : (String) C4059ap.m3054a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "getNativeLog", null, null);
        } catch (UnsatisfiedLinkError unused) {
            return null;
        } catch (Throwable th) {
            if (!C4055al.m3022a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    public NativeExceptionHandler getNativeExceptionHandler() {
        return this.f3366g;
    }

    public native String getNativeKeyValueList();

    public native String getNativeLog();

    public String getRunningCpuAbi() {
        try {
            return getSoCpuAbi();
        } catch (Throwable unused) {
            C4055al.m3026d("get so cpu abi failed，please upgrade bugly so version", new Object[0]);
            return "";
        }
    }

    public String getSystemProperty(String str) {
        return (this.f3369j || this.f3368i) ? getProperties(str) : "fail";
    }

    public boolean isEnableCatchAnrTrace() {
        return (f3361c & 2) == 2;
    }

    public synchronized boolean isUserOpened() {
        return this.f3371l;
    }

    public synchronized void onStrategyChanged(StrategyBean strategyBean) {
        if (strategyBean != null) {
            try {
                boolean z8 = strategyBean.f3274f;
                if (z8 != this.f3370k) {
                    C4055al.m3026d("server native changed to %b", Boolean.valueOf(z8));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean z9 = C4046ac.m2951a().m2960c().f3274f && this.f3371l;
        if (z9 != this.f3370k) {
            C4055al.m3021a("native changed to %b", Boolean.valueOf(z9));
            m2876b(z9);
        }
    }

    public boolean putKeyValueToNative(String str, String str2) {
        if ((this.f3368i || this.f3369j) && str != null && str2 != null) {
            try {
                if (this.f3369j) {
                    return putNativeKeyValue(str, str2);
                }
                Boolean bool = (Boolean) C4059ap.m3054a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "putNativeKeyValue", new Class[]{String.class, String.class}, new Object[]{str, str2});
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                if (!C4055al.m3022a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return false;
    }

    public native boolean putNativeKeyValue(String str, String str2);

    public native String regist(String str, boolean z8, int i);

    public void removeEmptyNativeRecordFiles() {
        C4077be.m3217c(f3359a);
    }

    public native String removeNativeKeyValue(String str);

    public void resendSigquit() {
        m2871a(20, "");
    }

    public boolean setNativeAppChannel(String str) {
        return m2871a(12, str);
    }

    public boolean setNativeAppPackage(String str) {
        return m2871a(13, str);
    }

    public boolean setNativeAppVersion(String str) {
        return m2871a(10, str);
    }

    public native void setNativeInfo(int i, String str);

    @Override // com.tencent.bugly.proguard.InterfaceC4131q
    public boolean setNativeIsAppForeground(boolean z8) {
        return m2871a(14, z8 ? "true" : "false");
    }

    public boolean setNativeLaunchTime(long j7) {
        try {
            return m2871a(15, String.valueOf(j7));
        } catch (NumberFormatException e) {
            if (C4055al.m3022a(e)) {
                return false;
            }
            e.printStackTrace();
            return false;
        }
    }

    public boolean setNativeUserId(String str) {
        return m2871a(11, str);
    }

    public synchronized void setUserOpened(boolean z8) {
        try {
            m2879c(z8);
            boolean zIsUserOpened = isUserOpened();
            C4046ac c4046acM2951a = C4046ac.m2951a();
            if (c4046acM2951a != null) {
                zIsUserOpened = zIsUserOpened && c4046acM2951a.m2960c().f3274f;
            }
            if (zIsUserOpened != this.f3370k) {
                C4055al.m3021a("native changed to %b", Boolean.valueOf(zIsUserOpened));
                m2876b(zIsUserOpened);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void startNativeMonitor() {
        try {
            if (!this.f3369j && !this.f3368i) {
                boolean zM3084b = C4059ap.m3084b(this.f3364e.f3450t);
                boolean z8 = !zM3084b;
                if (C4063at.f3572b) {
                    boolean zM2873a = m2873a(zM3084b ? "Bugly_Native" : this.f3364e.f3450t, z8);
                    this.f3369j = zM2873a;
                    if (!zM2873a && zM3084b) {
                        this.f3368i = m2873a("NativeRQD", false);
                    }
                } else {
                    String str = "Bugly_Native";
                    C4044aa c4044aa = this.f3364e;
                    String str2 = c4044aa.f3450t;
                    if (zM3084b) {
                        c4044aa.getClass();
                    } else {
                        str = str2;
                    }
                    this.f3369j = m2873a(str, z8);
                }
                if (this.f3369j || this.f3368i) {
                    m2869a(this.f3367h);
                    setNativeAppVersion(this.f3364e.f3445o);
                    setNativeAppChannel(this.f3364e.f3449s);
                    setNativeAppPackage(this.f3364e.f3433c);
                    setNativeUserId(this.f3364e.m2905f());
                    setNativeIsAppForeground(this.f3364e.m2896a());
                    setNativeLaunchTime(this.f3364e.f3407a);
                    return;
                }
                return;
            }
            m2869a(this.f3367h);
        } catch (Throwable th) {
            throw th;
        }
    }

    public native void testCrash();

    public void testNativeCrash() {
        if (this.f3369j) {
            testCrash();
        } else {
            C4055al.m3026d("[Native] Bugly SO file has not been load.", new Object[0]);
        }
    }

    public void unBlockSigquit(boolean z8) {
        if (z8) {
            m2871a(21, "true");
        } else {
            m2871a(21, "false");
        }
    }

    public native String unregist();

    /* renamed from: c */
    private synchronized void m2878c() {
        if (!this.f3370k) {
            C4055al.m3026d("[Native] Native crash report has already unregistered.", new Object[0]);
            return;
        }
        try {
        } catch (Throwable unused) {
            C4055al.m3025c("[Native] Failed to close native crash report.", new Object[0]);
        }
        if (unregist() != null) {
            C4055al.m3021a("[Native] Successfully closed native crash report.", new Object[0]);
            this.f3370k = false;
            return;
        }
        try {
            C4059ap.m3054a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "enableHandler", new Class[]{Boolean.TYPE}, new Object[]{Boolean.FALSE});
            this.f3370k = false;
            C4055al.m3021a("[Native] Successfully closed native crash report.", new Object[0]);
            return;
        } catch (Throwable unused2) {
            C4055al.m3025c("[Native] Failed to close native crash report.", new Object[0]);
            this.f3369j = false;
            this.f3368i = false;
            return;
        }
    }

    /* renamed from: b */
    private synchronized void m2876b(boolean z8) {
        if (z8) {
            startNativeMonitor();
        } else {
            m2878c();
        }
    }

    /* renamed from: a */
    private synchronized void m2869a(boolean z8) {
        if (this.f3370k) {
            C4055al.m3026d("[Native] Native crash report has already registered.", new Object[0]);
            return;
        }
        int i = 1;
        if (this.f3369j) {
            try {
                String strRegist = regist(f3359a, z8, f3361c);
                if (strRegist != null) {
                    C4055al.m3021a("[Native] Native Crash Report enable.", new Object[0]);
                    this.f3364e.f3451u = strRegist;
                    String strConcat = "-".concat(strRegist);
                    if (!C4063at.f3572b && !this.f3364e.f3438h.contains(strConcat)) {
                        C4044aa c4044aa = this.f3364e;
                        c4044aa.f3438h = c4044aa.f3438h.concat("-").concat(this.f3364e.f3451u);
                    }
                    C4055al.m3021a("comInfo.sdkVersion %s", this.f3364e.f3438h);
                    this.f3370k = true;
                    String runningCpuAbi = getRunningCpuAbi();
                    if (!TextUtils.isEmpty(runningCpuAbi)) {
                        this.f3364e.m2904e(runningCpuAbi);
                    }
                    return;
                }
            } catch (Throwable unused) {
                C4055al.m3025c("[Native] Failed to load Bugly SO file.", new Object[0]);
            }
        } else if (this.f3368i) {
            try {
                Class cls = Integer.TYPE;
                String str = (String) C4059ap.m3054a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "registNativeExceptionHandler2", new Class[]{String.class, String.class, cls, cls}, new Object[]{f3359a, C4045ab.m2933d(), Integer.valueOf(z8 ? 1 : 5), 1});
                if (str == null) {
                    String str2 = f3359a;
                    String strM2933d = C4045ab.m2933d();
                    C4044aa.m2890b();
                    str = (String) C4059ap.m3054a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "registNativeExceptionHandler", new Class[]{String.class, String.class, cls}, new Object[]{str2, strM2933d, Integer.valueOf(C4044aa.m2882B())});
                }
                if (str != null) {
                    this.f3370k = true;
                    this.f3364e.f3451u = str;
                    C4059ap.m3054a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "enableHandler", new Class[]{Boolean.TYPE}, new Object[]{Boolean.TRUE});
                    if (!z8) {
                        i = 5;
                    }
                    C4059ap.m3054a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "setLogMode", new Class[]{cls}, new Object[]{Integer.valueOf(i)});
                    String runningCpuAbi2 = getRunningCpuAbi();
                    if (!TextUtils.isEmpty(runningCpuAbi2)) {
                        this.f3364e.m2904e(runningCpuAbi2);
                    }
                    return;
                }
            } catch (Throwable unused2) {
            }
        }
        this.f3369j = false;
        this.f3368i = false;
    }

    public static synchronized NativeCrashHandler getInstance() {
        return f3360b;
    }

    public void testNativeCrash(boolean z8, boolean z9, boolean z10) {
        m2871a(16, String.valueOf(z8));
        m2871a(17, String.valueOf(z9));
        m2871a(18, String.valueOf(z10));
        testNativeCrash();
    }

    /* renamed from: c */
    private synchronized void m2879c(boolean z8) {
        if (this.f3371l != z8) {
            C4055al.m3021a("user change native %b", Boolean.valueOf(z8));
            this.f3371l = z8;
        }
    }

    /* renamed from: a */
    private static boolean m2873a(String str, boolean z8) {
        boolean z9;
        try {
            C4055al.m3021a("[Native] Trying to load so: %s", str);
            if (z8) {
                System.load(str);
            } else {
                System.loadLibrary(str);
            }
        } catch (Throwable th) {
            th = th;
            z9 = false;
        }
        try {
            C4055al.m3021a("[Native] Successfully loaded SO: %s", str);
            return true;
        } catch (Throwable th2) {
            z9 = true;
            th = th2;
            C4055al.m3026d(th.getMessage(), new Object[0]);
            C4055al.m3026d("[Native] Failed to load so: %s", str);
            return z9;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m2871a(int i, String str) {
        if (!this.f3369j) {
            return false;
        }
        try {
            setNativeInfo(i, str);
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        } catch (Throwable th) {
            if (!C4055al.m3022a(th)) {
                th.printStackTrace();
            }
            return false;
        }
    }
}
