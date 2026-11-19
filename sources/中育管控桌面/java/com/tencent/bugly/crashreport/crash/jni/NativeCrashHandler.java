package com.tencent.bugly.crashreport.crash.jni;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import androidx.compose.material3.internal.CalendarModelKt;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.proguard.C5780aa;
import com.tencent.bugly.proguard.C5781ab;
import com.tencent.bugly.proguard.C5782ac;
import com.tencent.bugly.proguard.C5790ak;
import com.tencent.bugly.proguard.C5791al;
import com.tencent.bugly.proguard.C5795ap;
import com.tencent.bugly.proguard.C5798as;
import com.tencent.bugly.proguard.C5799at;
import com.tencent.bugly.proguard.C5810bd;
import com.tencent.bugly.proguard.C5811be;
import com.tencent.bugly.proguard.InterfaceC5843q;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes3.dex */
public class NativeCrashHandler implements InterfaceC5843q {

    /* renamed from: a */
    static String f3846a = null;

    /* renamed from: b */
    private static NativeCrashHandler f3847b = null;

    /* renamed from: c */
    private static int f3848c = 1;

    /* renamed from: n */
    private static boolean f3849n = true;

    /* renamed from: d */
    private final Context f3850d;

    /* renamed from: e */
    private final C5780aa f3851e;

    /* renamed from: f */
    private final C5790ak f3852f;

    /* renamed from: g */
    private NativeExceptionHandler f3853g;

    /* renamed from: h */
    private final boolean f3854h;

    /* renamed from: i */
    private boolean f3855i = false;

    /* renamed from: j */
    private boolean f3856j = false;

    /* renamed from: k */
    private boolean f3857k = false;

    /* renamed from: l */
    private boolean f3858l = false;

    /* renamed from: m */
    private C5798as f3859m;

    @SuppressLint({"SdCardPath"})
    private NativeCrashHandler(Context context, C5780aa c5780aa, C5798as c5798as, C5790ak c5790ak, boolean z6, String str) {
        this.f3850d = C5795ap.m3958a(context);
        if (C5795ap.m3991b(f3846a)) {
            try {
                if (C5795ap.m3991b(str)) {
                    str = context.getDir("bugly", 0).getAbsolutePath();
                }
            } catch (Throwable unused) {
                str = "/data/data/" + C5780aa.m3793a(context).f3915c + "/app_bugly";
            }
            f3846a = str;
        }
        this.f3859m = c5798as;
        this.f3851e = c5780aa;
        this.f3852f = c5790ak;
        this.f3854h = z6;
        this.f3853g = new C5810bd(context, c5780aa, c5798as, C5782ac.m3857a());
    }

    public static synchronized String getDumpFilePath() {
        return f3846a;
    }

    public static synchronized NativeCrashHandler getInstance(Context context, C5780aa c5780aa, C5798as c5798as, C5782ac c5782ac, C5790ak c5790ak, boolean z6, String str) {
        try {
            if (f3847b == null) {
                f3847b = new NativeCrashHandler(context, c5780aa, c5798as, c5790ak, z6, str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3847b;
    }

    private native String getProperties(String str);

    private native String getSoCpuAbi();

    public static boolean isShouldHandleInJava() {
        return f3849n;
    }

    public static synchronized void setDumpFilePath(String str) {
        f3846a = str;
    }

    public static void setShouldHandleInJava(boolean z6) {
        f3849n = z6;
        NativeCrashHandler nativeCrashHandler = f3847b;
        if (nativeCrashHandler != null) {
            nativeCrashHandler.m3777a(999, String.valueOf(z6));
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC5843q
    public boolean appendLogToNative(String str, String str2, String str3) {
        if ((this.f3855i || this.f3856j) && str != null && str2 != null && str3 != null) {
            try {
                if (this.f3856j) {
                    return appendNativeLog(str, str2, str3);
                }
                Boolean bool = (Boolean) C5795ap.m3961a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "appendNativeLog", new Class[]{String.class, String.class, String.class}, new Object[]{str, str2, str3});
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                if (!C5791al.m3929a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return false;
    }

    public native boolean appendNativeLog(String str, String str2, String str3);

    public native boolean appendWholeNativeLog(String str);

    public void checkUploadRecordCrash() {
        this.f3852f.m3921a(new Runnable() { // from class: com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.1
            @Override // java.lang.Runnable
            public final void run() {
                if (!C5795ap.m3977a(NativeCrashHandler.this.f3850d, "native_record_lock")) {
                    C5791al.m3928a("[Native] Failed to lock file for handling native crash record.", new Object[0]);
                    return;
                }
                if (!NativeCrashHandler.f3849n) {
                    NativeCrashHandler.m3778a(NativeCrashHandler.this, "false");
                }
                CrashDetailBean crashDetailBeanM4112a = C5811be.m4112a(NativeCrashHandler.this.f3850d, NativeCrashHandler.f3846a, NativeCrashHandler.this.f3853g);
                if (crashDetailBeanM4112a != null) {
                    C5791al.m3928a("[Native] Get crash from native record.", new Object[0]);
                    if (!NativeCrashHandler.this.f3859m.m4047a(crashDetailBeanM4112a, true)) {
                        NativeCrashHandler.this.f3859m.m4049b(crashDetailBeanM4112a, false);
                    }
                    C5811be.m4120a(false, NativeCrashHandler.f3846a);
                }
                final NativeCrashHandler nativeCrashHandler = NativeCrashHandler.this;
                long jM3983b = C5795ap.m3983b() - C5799at.f4084j;
                long jM3983b2 = C5795ap.m3983b() + CalendarModelKt.MillisecondsIn24Hours;
                File file = new File(NativeCrashHandler.f3846a);
                if (file.exists() && file.isDirectory()) {
                    try {
                        File[] fileArrListFiles = file.listFiles();
                        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                            Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.2
                                @Override // java.util.Comparator
                                public final /* synthetic */ int compare(File file2, File file3) {
                                    return Long.compare(file3.lastModified(), file2.lastModified());
                                }
                            });
                            long length = 0;
                            int i6 = 0;
                            int i7 = 0;
                            for (File file2 : fileArrListFiles) {
                                long jLastModified = file2.lastModified();
                                length += file2.length();
                                if (jLastModified < jM3983b || jLastModified >= jM3983b2 || length >= C5799at.f4083i) {
                                    C5791al.m3928a("[Native] Delete record file: %s", file2.getAbsolutePath());
                                    i6++;
                                    if (file2.delete()) {
                                        i7++;
                                    }
                                }
                            }
                            C5791al.m3932c("[Native] Number of record files overdue: %d, has deleted: %d", Integer.valueOf(i6), Integer.valueOf(i7));
                        }
                    } catch (Throwable th) {
                        C5791al.m3929a(th);
                    }
                }
                C5795ap.m3989b(NativeCrashHandler.this.f3850d, "native_record_lock");
            }
        });
    }

    public void disableCatchAnrTrace() {
        f3848c = 1;
    }

    public void dumpAnrNativeStack() {
        m3777a(19, "1");
    }

    public void enableCatchAnrTrace() {
        f3848c |= 2;
    }

    public boolean filterSigabrtSysLog() {
        return m3777a(998, "true");
    }

    @Override // com.tencent.bugly.proguard.InterfaceC5843q
    public String getLogFromNative() {
        if (!this.f3855i && !this.f3856j) {
            return null;
        }
        try {
            return this.f3856j ? getNativeLog() : (String) C5795ap.m3961a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "getNativeLog", null, null);
        } catch (UnsatisfiedLinkError unused) {
            return null;
        } catch (Throwable th) {
            if (!C5791al.m3929a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    public NativeExceptionHandler getNativeExceptionHandler() {
        return this.f3853g;
    }

    public native String getNativeKeyValueList();

    public native String getNativeLog();

    public String getRunningCpuAbi() {
        try {
            return getSoCpuAbi();
        } catch (Throwable unused) {
            C5791al.m3933d("get so cpu abi failed，please upgrade bugly so version", new Object[0]);
            return "";
        }
    }

    public String getSystemProperty(String str) {
        return (this.f3856j || this.f3855i) ? getProperties(str) : "fail";
    }

    public boolean isEnableCatchAnrTrace() {
        return (f3848c & 2) == 2;
    }

    public synchronized boolean isUserOpened() {
        return this.f3858l;
    }

    public synchronized void onStrategyChanged(StrategyBean strategyBean) {
        if (strategyBean != null) {
            try {
                boolean z6 = strategyBean.f3761f;
                if (z6 != this.f3857k) {
                    C5791al.m3933d("server native changed to %b", Boolean.valueOf(z6));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean z7 = C5782ac.m3857a().m3866c().f3761f && this.f3858l;
        if (z7 != this.f3857k) {
            C5791al.m3928a("native changed to %b", Boolean.valueOf(z7));
            m3782b(z7);
        }
    }

    public boolean putKeyValueToNative(String str, String str2) {
        if ((this.f3855i || this.f3856j) && str != null && str2 != null) {
            try {
                if (this.f3856j) {
                    return putNativeKeyValue(str, str2);
                }
                Boolean bool = (Boolean) C5795ap.m3961a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "putNativeKeyValue", new Class[]{String.class, String.class}, new Object[]{str, str2});
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                if (!C5791al.m3929a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return false;
    }

    public native boolean putNativeKeyValue(String str, String str2);

    public native String regist(String str, boolean z6, int i6);

    public void removeEmptyNativeRecordFiles() {
        C5811be.m4125c(f3846a);
    }

    public native String removeNativeKeyValue(String str);

    public void resendSigquit() {
        m3777a(20, "");
    }

    public boolean setNativeAppChannel(String str) {
        return m3777a(12, str);
    }

    public boolean setNativeAppPackage(String str) {
        return m3777a(13, str);
    }

    public boolean setNativeAppVersion(String str) {
        return m3777a(10, str);
    }

    public native void setNativeInfo(int i6, String str);

    @Override // com.tencent.bugly.proguard.InterfaceC5843q
    public boolean setNativeIsAppForeground(boolean z6) {
        return m3777a(14, z6 ? "true" : "false");
    }

    public boolean setNativeLaunchTime(long j6) {
        try {
            return m3777a(15, String.valueOf(j6));
        } catch (NumberFormatException e6) {
            if (C5791al.m3929a(e6)) {
                return false;
            }
            e6.printStackTrace();
            return false;
        }
    }

    public boolean setNativeUserId(String str) {
        return m3777a(11, str);
    }

    public synchronized void setUserOpened(boolean z6) {
        try {
            m3785c(z6);
            boolean zIsUserOpened = isUserOpened();
            C5782ac c5782acM3857a = C5782ac.m3857a();
            if (c5782acM3857a != null) {
                zIsUserOpened = zIsUserOpened && c5782acM3857a.m3866c().f3761f;
            }
            if (zIsUserOpened != this.f3857k) {
                C5791al.m3928a("native changed to %b", Boolean.valueOf(zIsUserOpened));
                m3782b(zIsUserOpened);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void startNativeMonitor() {
        try {
            if (!this.f3856j && !this.f3855i) {
                boolean zM3991b = C5795ap.m3991b(this.f3851e.f3932t);
                boolean z6 = !zM3991b;
                if (C5799at.f4077b) {
                    boolean zM3779a = m3779a(zM3991b ? "Bugly_Native" : this.f3851e.f3932t, z6);
                    this.f3856j = zM3779a;
                    if (!zM3779a && zM3991b) {
                        this.f3855i = m3779a("NativeRQD", false);
                    }
                } else {
                    String str = "Bugly_Native";
                    C5780aa c5780aa = this.f3851e;
                    String str2 = c5780aa.f3932t;
                    if (zM3991b) {
                        c5780aa.getClass();
                    } else {
                        str = str2;
                    }
                    this.f3856j = m3779a(str, z6);
                }
                if (this.f3856j || this.f3855i) {
                    m3775a(this.f3854h);
                    setNativeAppVersion(this.f3851e.f3927o);
                    setNativeAppChannel(this.f3851e.f3931s);
                    setNativeAppPackage(this.f3851e.f3915c);
                    setNativeUserId(this.f3851e.m3810f());
                    setNativeIsAppForeground(this.f3851e.m3801a());
                    setNativeLaunchTime(this.f3851e.f3889a);
                    return;
                }
                return;
            }
            m3775a(this.f3854h);
        } catch (Throwable th) {
            throw th;
        }
    }

    public native void testCrash();

    public void testNativeCrash() {
        if (this.f3856j) {
            testCrash();
        } else {
            C5791al.m3933d("[Native] Bugly SO file has not been load.", new Object[0]);
        }
    }

    public void unBlockSigquit(boolean z6) {
        if (z6) {
            m3777a(21, "true");
        } else {
            m3777a(21, "false");
        }
    }

    public native String unregist();

    /* renamed from: c */
    private synchronized void m3784c() {
        if (!this.f3857k) {
            C5791al.m3933d("[Native] Native crash report has already unregistered.", new Object[0]);
            return;
        }
        try {
        } catch (Throwable unused) {
            C5791al.m3932c("[Native] Failed to close native crash report.", new Object[0]);
        }
        if (unregist() != null) {
            C5791al.m3928a("[Native] Successfully closed native crash report.", new Object[0]);
            this.f3857k = false;
            return;
        }
        try {
            C5795ap.m3961a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "enableHandler", new Class[]{Boolean.TYPE}, new Object[]{Boolean.FALSE});
            this.f3857k = false;
            C5791al.m3928a("[Native] Successfully closed native crash report.", new Object[0]);
            return;
        } catch (Throwable unused2) {
            C5791al.m3932c("[Native] Failed to close native crash report.", new Object[0]);
            this.f3856j = false;
            this.f3855i = false;
            return;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m3778a(NativeCrashHandler nativeCrashHandler, String str) {
        return nativeCrashHandler.m3777a(999, str);
    }

    /* renamed from: b */
    private synchronized void m3782b(boolean z6) {
        if (z6) {
            startNativeMonitor();
        } else {
            m3784c();
        }
    }

    /* renamed from: a */
    private synchronized void m3775a(boolean z6) {
        if (this.f3857k) {
            C5791al.m3933d("[Native] Native crash report has already registered.", new Object[0]);
            return;
        }
        int i6 = 1;
        if (this.f3856j) {
            try {
                String strRegist = regist(f3846a, z6, f3848c);
                if (strRegist != null) {
                    C5791al.m3928a("[Native] Native Crash Report enable.", new Object[0]);
                    this.f3851e.f3933u = strRegist;
                    String strConcat = "-".concat(strRegist);
                    if (!C5799at.f4077b && !this.f3851e.f3920h.contains(strConcat)) {
                        C5780aa c5780aa = this.f3851e;
                        c5780aa.f3920h = c5780aa.f3920h.concat("-").concat(this.f3851e.f3933u);
                    }
                    C5791al.m3928a("comInfo.sdkVersion %s", this.f3851e.f3920h);
                    this.f3857k = true;
                    String runningCpuAbi = getRunningCpuAbi();
                    if (!TextUtils.isEmpty(runningCpuAbi)) {
                        this.f3851e.m3809e(runningCpuAbi);
                    }
                    return;
                }
            } catch (Throwable unused) {
                C5791al.m3932c("[Native] Failed to load Bugly SO file.", new Object[0]);
            }
        } else if (this.f3855i) {
            try {
                Class cls = Integer.TYPE;
                String str = (String) C5795ap.m3961a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "registNativeExceptionHandler2", new Class[]{String.class, String.class, cls, cls}, new Object[]{f3846a, C5781ab.m3838d(), Integer.valueOf(z6 ? 1 : 5), 1});
                if (str == null) {
                    String str2 = f3846a;
                    String strM3838d = C5781ab.m3838d();
                    C5780aa.m3795b();
                    str = (String) C5795ap.m3961a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "registNativeExceptionHandler", new Class[]{String.class, String.class, cls}, new Object[]{str2, strM3838d, Integer.valueOf(C5780aa.m3787B())});
                }
                if (str != null) {
                    this.f3857k = true;
                    this.f3851e.f3933u = str;
                    C5795ap.m3961a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "enableHandler", new Class[]{Boolean.TYPE}, new Object[]{Boolean.TRUE});
                    if (!z6) {
                        i6 = 5;
                    }
                    C5795ap.m3961a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "setLogMode", new Class[]{cls}, new Object[]{Integer.valueOf(i6)});
                    String runningCpuAbi2 = getRunningCpuAbi();
                    if (!TextUtils.isEmpty(runningCpuAbi2)) {
                        this.f3851e.m3809e(runningCpuAbi2);
                    }
                    return;
                }
            } catch (Throwable unused2) {
            }
        }
        this.f3856j = false;
        this.f3855i = false;
    }

    public static synchronized NativeCrashHandler getInstance() {
        return f3847b;
    }

    public void testNativeCrash(boolean z6, boolean z7, boolean z8) {
        m3777a(16, String.valueOf(z6));
        m3777a(17, String.valueOf(z7));
        m3777a(18, String.valueOf(z8));
        testNativeCrash();
    }

    /* renamed from: c */
    private synchronized void m3785c(boolean z6) {
        if (this.f3858l != z6) {
            C5791al.m3928a("user change native %b", Boolean.valueOf(z6));
            this.f3858l = z6;
        }
    }

    /* renamed from: a */
    private static boolean m3779a(String str, boolean z6) {
        boolean z7;
        try {
            C5791al.m3928a("[Native] Trying to load so: %s", str);
            if (z6) {
                System.load(str);
            } else {
                System.loadLibrary(str);
            }
        } catch (Throwable th) {
            th = th;
            z7 = false;
        }
        try {
            C5791al.m3928a("[Native] Successfully loaded SO: %s", str);
            return true;
        } catch (Throwable th2) {
            z7 = true;
            th = th2;
            C5791al.m3933d(th.getMessage(), new Object[0]);
            C5791al.m3933d("[Native] Failed to load so: %s", str);
            return z7;
        }
    }

    /* renamed from: a */
    private boolean m3777a(int i6, String str) {
        if (!this.f3856j) {
            return false;
        }
        try {
            setNativeInfo(i6, str);
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        } catch (Throwable th) {
            if (!C5791al.m3929a(th)) {
                th.printStackTrace();
            }
            return false;
        }
    }
}
