package com.tencent.bugly.crashreport.crash.jni;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import androidx.compose.material3.internal.CalendarModelKt;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.proguard.C6425aa;
import com.tencent.bugly.proguard.C6426ab;
import com.tencent.bugly.proguard.C6427ac;
import com.tencent.bugly.proguard.C6435ak;
import com.tencent.bugly.proguard.C6436al;
import com.tencent.bugly.proguard.C6440ap;
import com.tencent.bugly.proguard.C6443as;
import com.tencent.bugly.proguard.C6444at;
import com.tencent.bugly.proguard.C6455bd;
import com.tencent.bugly.proguard.C6456be;
import com.tencent.bugly.proguard.InterfaceC6488q;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes4.dex */
public class NativeCrashHandler implements InterfaceC6488q {

    /* renamed from: a */
    static String f4468a = null;

    /* renamed from: b */
    private static NativeCrashHandler f4469b = null;

    /* renamed from: c */
    private static int f4470c = 1;

    /* renamed from: n */
    private static boolean f4471n = true;

    /* renamed from: d */
    private final Context f4472d;

    /* renamed from: e */
    private final C6425aa f4473e;

    /* renamed from: f */
    private final C6435ak f4474f;

    /* renamed from: g */
    private NativeExceptionHandler f4475g;

    /* renamed from: h */
    private final boolean f4476h;

    /* renamed from: i */
    private boolean f4477i = false;

    /* renamed from: j */
    private boolean f4478j = false;

    /* renamed from: k */
    private boolean f4479k = false;

    /* renamed from: l */
    private boolean f4480l = false;

    /* renamed from: m */
    private C6443as f4481m;

    @SuppressLint({"SdCardPath"})
    private NativeCrashHandler(Context context, C6425aa c6425aa, C6443as c6443as, C6435ak c6435ak, boolean z10, String str) {
        this.f4472d = C6440ap.m4313a(context);
        if (C6440ap.m4346b(f4468a)) {
            try {
                if (C6440ap.m4346b(str)) {
                    str = context.getDir("bugly", 0).getAbsolutePath();
                }
            } catch (Throwable unused) {
                str = "/data/data/" + C6425aa.m4148a(context).f4537c + "/app_bugly";
            }
            f4468a = str;
        }
        this.f4481m = c6443as;
        this.f4473e = c6425aa;
        this.f4474f = c6435ak;
        this.f4476h = z10;
        this.f4475g = new C6455bd(context, c6425aa, c6443as, C6427ac.m4212a());
    }

    public static synchronized String getDumpFilePath() {
        return f4468a;
    }

    public static synchronized NativeCrashHandler getInstance(Context context, C6425aa c6425aa, C6443as c6443as, C6427ac c6427ac, C6435ak c6435ak, boolean z10, String str) {
        try {
            if (f4469b == null) {
                f4469b = new NativeCrashHandler(context, c6425aa, c6443as, c6435ak, z10, str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4469b;
    }

    private native String getProperties(String str);

    private native String getSoCpuAbi();

    public static boolean isShouldHandleInJava() {
        return f4471n;
    }

    public static synchronized void setDumpFilePath(String str) {
        f4468a = str;
    }

    public static void setShouldHandleInJava(boolean z10) {
        f4471n = z10;
        NativeCrashHandler nativeCrashHandler = f4469b;
        if (nativeCrashHandler != null) {
            nativeCrashHandler.m4132a(999, String.valueOf(z10));
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC6488q
    public boolean appendLogToNative(String str, String str2, String str3) {
        if ((this.f4477i || this.f4478j) && str != null && str2 != null && str3 != null) {
            try {
                if (this.f4478j) {
                    return appendNativeLog(str, str2, str3);
                }
                Boolean bool = (Boolean) C6440ap.m4316a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "appendNativeLog", new Class[]{String.class, String.class, String.class}, new Object[]{str, str2, str3});
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                if (!C6436al.m4284a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return false;
    }

    public native boolean appendNativeLog(String str, String str2, String str3);

    public native boolean appendWholeNativeLog(String str);

    public void checkUploadRecordCrash() {
        this.f4474f.m4276a(new Runnable() { // from class: com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.1
            @Override // java.lang.Runnable
            public final void run() {
                if (!C6440ap.m4332a(NativeCrashHandler.this.f4472d, "native_record_lock")) {
                    C6436al.m4283a("[Native] Failed to lock file for handling native crash record.", new Object[0]);
                    return;
                }
                if (!NativeCrashHandler.f4471n) {
                    NativeCrashHandler.m4133a(NativeCrashHandler.this, "false");
                }
                CrashDetailBean crashDetailBeanM4467a = C6456be.m4467a(NativeCrashHandler.this.f4472d, NativeCrashHandler.f4468a, NativeCrashHandler.this.f4475g);
                if (crashDetailBeanM4467a != null) {
                    C6436al.m4283a("[Native] Get crash from native record.", new Object[0]);
                    if (!NativeCrashHandler.this.f4481m.m4402a(crashDetailBeanM4467a, true)) {
                        NativeCrashHandler.this.f4481m.m4404b(crashDetailBeanM4467a, false);
                    }
                    C6456be.m4475a(false, NativeCrashHandler.f4468a);
                }
                final NativeCrashHandler nativeCrashHandler = NativeCrashHandler.this;
                long jM4338b = C6440ap.m4338b() - C6444at.f4706j;
                long jM4338b2 = C6440ap.m4338b() + CalendarModelKt.MillisecondsIn24Hours;
                File file = new File(NativeCrashHandler.f4468a);
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
                            int i10 = 0;
                            int i11 = 0;
                            for (File file2 : fileArrListFiles) {
                                long jLastModified = file2.lastModified();
                                length += file2.length();
                                if (jLastModified < jM4338b || jLastModified >= jM4338b2 || length >= C6444at.f4705i) {
                                    C6436al.m4283a("[Native] Delete record file: %s", file2.getAbsolutePath());
                                    i10++;
                                    if (file2.delete()) {
                                        i11++;
                                    }
                                }
                            }
                            C6436al.m4287c("[Native] Number of record files overdue: %d, has deleted: %d", Integer.valueOf(i10), Integer.valueOf(i11));
                        }
                    } catch (Throwable th) {
                        C6436al.m4284a(th);
                    }
                }
                C6440ap.m4344b(NativeCrashHandler.this.f4472d, "native_record_lock");
            }
        });
    }

    public void disableCatchAnrTrace() {
        f4470c = 1;
    }

    public void dumpAnrNativeStack() {
        m4132a(19, "1");
    }

    public void enableCatchAnrTrace() {
        f4470c |= 2;
    }

    public boolean filterSigabrtSysLog() {
        return m4132a(998, "true");
    }

    @Override // com.tencent.bugly.proguard.InterfaceC6488q
    public String getLogFromNative() {
        if (!this.f4477i && !this.f4478j) {
            return null;
        }
        try {
            return this.f4478j ? getNativeLog() : (String) C6440ap.m4316a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "getNativeLog", null, null);
        } catch (UnsatisfiedLinkError unused) {
            return null;
        } catch (Throwable th) {
            if (!C6436al.m4284a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    public NativeExceptionHandler getNativeExceptionHandler() {
        return this.f4475g;
    }

    public native String getNativeKeyValueList();

    public native String getNativeLog();

    public String getRunningCpuAbi() {
        try {
            return getSoCpuAbi();
        } catch (Throwable unused) {
            C6436al.m4288d("get so cpu abi failed，please upgrade bugly so version", new Object[0]);
            return "";
        }
    }

    public String getSystemProperty(String str) {
        return (this.f4478j || this.f4477i) ? getProperties(str) : "fail";
    }

    public boolean isEnableCatchAnrTrace() {
        return (f4470c & 2) == 2;
    }

    public synchronized boolean isUserOpened() {
        return this.f4480l;
    }

    public synchronized void onStrategyChanged(StrategyBean strategyBean) {
        if (strategyBean != null) {
            try {
                boolean z10 = strategyBean.f4383f;
                if (z10 != this.f4479k) {
                    C6436al.m4288d("server native changed to %b", Boolean.valueOf(z10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean z11 = C6427ac.m4212a().m4221c().f4383f && this.f4480l;
        if (z11 != this.f4479k) {
            C6436al.m4283a("native changed to %b", Boolean.valueOf(z11));
            m4137b(z11);
        }
    }

    public boolean putKeyValueToNative(String str, String str2) {
        if ((this.f4477i || this.f4478j) && str != null && str2 != null) {
            try {
                if (this.f4478j) {
                    return putNativeKeyValue(str, str2);
                }
                Boolean bool = (Boolean) C6440ap.m4316a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "putNativeKeyValue", new Class[]{String.class, String.class}, new Object[]{str, str2});
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                if (!C6436al.m4284a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return false;
    }

    public native boolean putNativeKeyValue(String str, String str2);

    public native String regist(String str, boolean z10, int i10);

    public void removeEmptyNativeRecordFiles() {
        C6456be.m4480c(f4468a);
    }

    public native String removeNativeKeyValue(String str);

    public void resendSigquit() {
        m4132a(20, "");
    }

    public boolean setNativeAppChannel(String str) {
        return m4132a(12, str);
    }

    public boolean setNativeAppPackage(String str) {
        return m4132a(13, str);
    }

    public boolean setNativeAppVersion(String str) {
        return m4132a(10, str);
    }

    public native void setNativeInfo(int i10, String str);

    @Override // com.tencent.bugly.proguard.InterfaceC6488q
    public boolean setNativeIsAppForeground(boolean z10) {
        return m4132a(14, z10 ? "true" : "false");
    }

    public boolean setNativeLaunchTime(long j10) {
        try {
            return m4132a(15, String.valueOf(j10));
        } catch (NumberFormatException e10) {
            if (C6436al.m4284a(e10)) {
                return false;
            }
            e10.printStackTrace();
            return false;
        }
    }

    public boolean setNativeUserId(String str) {
        return m4132a(11, str);
    }

    public synchronized void setUserOpened(boolean z10) {
        try {
            m4140c(z10);
            boolean zIsUserOpened = isUserOpened();
            C6427ac c6427acM4212a = C6427ac.m4212a();
            if (c6427acM4212a != null) {
                zIsUserOpened = zIsUserOpened && c6427acM4212a.m4221c().f4383f;
            }
            if (zIsUserOpened != this.f4479k) {
                C6436al.m4283a("native changed to %b", Boolean.valueOf(zIsUserOpened));
                m4137b(zIsUserOpened);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void startNativeMonitor() {
        try {
            if (!this.f4478j && !this.f4477i) {
                boolean zM4346b = C6440ap.m4346b(this.f4473e.f4554t);
                boolean z10 = !zM4346b;
                if (C6444at.f4699b) {
                    boolean zM4134a = m4134a(zM4346b ? "Bugly_Native" : this.f4473e.f4554t, z10);
                    this.f4478j = zM4134a;
                    if (!zM4134a && zM4346b) {
                        this.f4477i = m4134a("NativeRQD", false);
                    }
                } else {
                    String str = "Bugly_Native";
                    C6425aa c6425aa = this.f4473e;
                    String str2 = c6425aa.f4554t;
                    if (zM4346b) {
                        c6425aa.getClass();
                    } else {
                        str = str2;
                    }
                    this.f4478j = m4134a(str, z10);
                }
                if (this.f4478j || this.f4477i) {
                    m4130a(this.f4476h);
                    setNativeAppVersion(this.f4473e.f4549o);
                    setNativeAppChannel(this.f4473e.f4553s);
                    setNativeAppPackage(this.f4473e.f4537c);
                    setNativeUserId(this.f4473e.m4165f());
                    setNativeIsAppForeground(this.f4473e.m4156a());
                    setNativeLaunchTime(this.f4473e.f4511a);
                    return;
                }
                return;
            }
            m4130a(this.f4476h);
        } catch (Throwable th) {
            throw th;
        }
    }

    public native void testCrash();

    public void testNativeCrash() {
        if (this.f4478j) {
            testCrash();
        } else {
            C6436al.m4288d("[Native] Bugly SO file has not been load.", new Object[0]);
        }
    }

    public void unBlockSigquit(boolean z10) {
        if (z10) {
            m4132a(21, "true");
        } else {
            m4132a(21, "false");
        }
    }

    public native String unregist();

    /* renamed from: c */
    private synchronized void m4139c() {
        if (!this.f4479k) {
            C6436al.m4288d("[Native] Native crash report has already unregistered.", new Object[0]);
            return;
        }
        try {
        } catch (Throwable unused) {
            C6436al.m4287c("[Native] Failed to close native crash report.", new Object[0]);
        }
        if (unregist() != null) {
            C6436al.m4283a("[Native] Successfully closed native crash report.", new Object[0]);
            this.f4479k = false;
            return;
        }
        try {
            C6440ap.m4316a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "enableHandler", new Class[]{Boolean.TYPE}, new Object[]{Boolean.FALSE});
            this.f4479k = false;
            C6436al.m4283a("[Native] Successfully closed native crash report.", new Object[0]);
            return;
        } catch (Throwable unused2) {
            C6436al.m4287c("[Native] Failed to close native crash report.", new Object[0]);
            this.f4478j = false;
            this.f4477i = false;
            return;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m4133a(NativeCrashHandler nativeCrashHandler, String str) {
        return nativeCrashHandler.m4132a(999, str);
    }

    /* renamed from: b */
    private synchronized void m4137b(boolean z10) {
        if (z10) {
            startNativeMonitor();
        } else {
            m4139c();
        }
    }

    /* renamed from: a */
    private synchronized void m4130a(boolean z10) {
        if (this.f4479k) {
            C6436al.m4288d("[Native] Native crash report has already registered.", new Object[0]);
            return;
        }
        int i10 = 1;
        if (this.f4478j) {
            try {
                String strRegist = regist(f4468a, z10, f4470c);
                if (strRegist != null) {
                    C6436al.m4283a("[Native] Native Crash Report enable.", new Object[0]);
                    this.f4473e.f4555u = strRegist;
                    String strConcat = "-".concat(strRegist);
                    if (!C6444at.f4699b && !this.f4473e.f4542h.contains(strConcat)) {
                        C6425aa c6425aa = this.f4473e;
                        c6425aa.f4542h = c6425aa.f4542h.concat("-").concat(this.f4473e.f4555u);
                    }
                    C6436al.m4283a("comInfo.sdkVersion %s", this.f4473e.f4542h);
                    this.f4479k = true;
                    String runningCpuAbi = getRunningCpuAbi();
                    if (!TextUtils.isEmpty(runningCpuAbi)) {
                        this.f4473e.m4164e(runningCpuAbi);
                    }
                    return;
                }
            } catch (Throwable unused) {
                C6436al.m4287c("[Native] Failed to load Bugly SO file.", new Object[0]);
            }
        } else if (this.f4477i) {
            try {
                Class cls = Integer.TYPE;
                String str = (String) C6440ap.m4316a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "registNativeExceptionHandler2", new Class[]{String.class, String.class, cls, cls}, new Object[]{f4468a, C6426ab.m4193d(), Integer.valueOf(z10 ? 1 : 5), 1});
                if (str == null) {
                    String str2 = f4468a;
                    String strM4193d = C6426ab.m4193d();
                    C6425aa.m4150b();
                    str = (String) C6440ap.m4316a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "registNativeExceptionHandler", new Class[]{String.class, String.class, cls}, new Object[]{str2, strM4193d, Integer.valueOf(C6425aa.m4142B())});
                }
                if (str != null) {
                    this.f4479k = true;
                    this.f4473e.f4555u = str;
                    C6440ap.m4316a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "enableHandler", new Class[]{Boolean.TYPE}, new Object[]{Boolean.TRUE});
                    if (!z10) {
                        i10 = 5;
                    }
                    C6440ap.m4316a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "setLogMode", new Class[]{cls}, new Object[]{Integer.valueOf(i10)});
                    String runningCpuAbi2 = getRunningCpuAbi();
                    if (!TextUtils.isEmpty(runningCpuAbi2)) {
                        this.f4473e.m4164e(runningCpuAbi2);
                    }
                    return;
                }
            } catch (Throwable unused2) {
            }
        }
        this.f4478j = false;
        this.f4477i = false;
    }

    public static synchronized NativeCrashHandler getInstance() {
        return f4469b;
    }

    public void testNativeCrash(boolean z10, boolean z11, boolean z12) {
        m4132a(16, String.valueOf(z10));
        m4132a(17, String.valueOf(z11));
        m4132a(18, String.valueOf(z12));
        testNativeCrash();
    }

    /* renamed from: c */
    private synchronized void m4140c(boolean z10) {
        if (this.f4480l != z10) {
            C6436al.m4283a("user change native %b", Boolean.valueOf(z10));
            this.f4480l = z10;
        }
    }

    /* renamed from: a */
    private static boolean m4134a(String str, boolean z10) {
        boolean z11;
        try {
            C6436al.m4283a("[Native] Trying to load so: %s", str);
            if (z10) {
                System.load(str);
            } else {
                System.loadLibrary(str);
            }
        } catch (Throwable th) {
            th = th;
            z11 = false;
        }
        try {
            C6436al.m4283a("[Native] Successfully loaded SO: %s", str);
            return true;
        } catch (Throwable th2) {
            z11 = true;
            th = th2;
            C6436al.m4288d(th.getMessage(), new Object[0]);
            C6436al.m4288d("[Native] Failed to load so: %s", str);
            return z11;
        }
    }

    /* renamed from: a */
    private boolean m4132a(int i10, String str) {
        if (!this.f4478j) {
            return false;
        }
        try {
            setNativeInfo(i10, str);
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        } catch (Throwable th) {
            if (!C6436al.m4284a(th)) {
                th.printStackTrace();
            }
            return false;
        }
    }
}
