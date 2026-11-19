package com.tencent.bugly.crashreport.crash.jni;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import androidx.compose.material3.internal.CalendarModelKt;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.proguard.C6663aa;
import com.tencent.bugly.proguard.C6664ab;
import com.tencent.bugly.proguard.C6665ac;
import com.tencent.bugly.proguard.C6673ak;
import com.tencent.bugly.proguard.C6674al;
import com.tencent.bugly.proguard.C6678ap;
import com.tencent.bugly.proguard.C6681as;
import com.tencent.bugly.proguard.C6682at;
import com.tencent.bugly.proguard.C6693bd;
import com.tencent.bugly.proguard.C6694be;
import com.tencent.bugly.proguard.InterfaceC6726q;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes4.dex */
public class NativeCrashHandler implements InterfaceC6726q {

    /* renamed from: a */
    static String f5702a = null;

    /* renamed from: b */
    private static NativeCrashHandler f5703b = null;

    /* renamed from: c */
    private static int f5704c = 1;

    /* renamed from: n */
    private static boolean f5705n = true;

    /* renamed from: d */
    private final Context f5706d;

    /* renamed from: e */
    private final C6663aa f5707e;

    /* renamed from: f */
    private final C6673ak f5708f;

    /* renamed from: g */
    private NativeExceptionHandler f5709g;

    /* renamed from: h */
    private final boolean f5710h;

    /* renamed from: i */
    private boolean f5711i = false;

    /* renamed from: j */
    private boolean f5712j = false;

    /* renamed from: k */
    private boolean f5713k = false;

    /* renamed from: l */
    private boolean f5714l = false;

    /* renamed from: m */
    private C6681as f5715m;

    @SuppressLint({"SdCardPath"})
    private NativeCrashHandler(Context context, C6663aa c6663aa, C6681as c6681as, C6673ak c6673ak, boolean z9, String str) {
        this.f5706d = C6678ap.m5132a(context);
        if (C6678ap.m5165b(f5702a)) {
            try {
                if (C6678ap.m5165b(str)) {
                    str = context.getDir("bugly", 0).getAbsolutePath();
                }
            } catch (Throwable unused) {
                str = "/data/data/" + C6663aa.m4967a(context).f5771c + "/app_bugly";
            }
            f5702a = str;
        }
        this.f5715m = c6681as;
        this.f5707e = c6663aa;
        this.f5708f = c6673ak;
        this.f5710h = z9;
        this.f5709g = new C6693bd(context, c6663aa, c6681as, C6665ac.m5031a());
    }

    public static synchronized String getDumpFilePath() {
        return f5702a;
    }

    public static synchronized NativeCrashHandler getInstance(Context context, C6663aa c6663aa, C6681as c6681as, C6665ac c6665ac, C6673ak c6673ak, boolean z9, String str) {
        try {
            if (f5703b == null) {
                f5703b = new NativeCrashHandler(context, c6663aa, c6681as, c6673ak, z9, str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5703b;
    }

    private native String getProperties(String str);

    private native String getSoCpuAbi();

    public static boolean isShouldHandleInJava() {
        return f5705n;
    }

    public static synchronized void setDumpFilePath(String str) {
        f5702a = str;
    }

    public static void setShouldHandleInJava(boolean z9) {
        f5705n = z9;
        NativeCrashHandler nativeCrashHandler = f5703b;
        if (nativeCrashHandler != null) {
            nativeCrashHandler.m4951a(999, String.valueOf(z9));
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC6726q
    public boolean appendLogToNative(String str, String str2, String str3) {
        if ((this.f5711i || this.f5712j) && str != null && str2 != null && str3 != null) {
            try {
                if (this.f5712j) {
                    return appendNativeLog(str, str2, str3);
                }
                Boolean bool = (Boolean) C6678ap.m5135a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "appendNativeLog", new Class[]{String.class, String.class, String.class}, new Object[]{str, str2, str3});
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                if (!C6674al.m5103a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return false;
    }

    public native boolean appendNativeLog(String str, String str2, String str3);

    public native boolean appendWholeNativeLog(String str);

    public void checkUploadRecordCrash() {
        this.f5708f.m5095a(new Runnable() { // from class: com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.1
            @Override // java.lang.Runnable
            public final void run() {
                if (!C6678ap.m5151a(NativeCrashHandler.this.f5706d, "native_record_lock")) {
                    C6674al.m5102a("[Native] Failed to lock file for handling native crash record.", new Object[0]);
                    return;
                }
                if (!NativeCrashHandler.f5705n) {
                    NativeCrashHandler.m4952a(NativeCrashHandler.this, "false");
                }
                CrashDetailBean crashDetailBeanM5286a = C6694be.m5286a(NativeCrashHandler.this.f5706d, NativeCrashHandler.f5702a, NativeCrashHandler.this.f5709g);
                if (crashDetailBeanM5286a != null) {
                    C6674al.m5102a("[Native] Get crash from native record.", new Object[0]);
                    if (!NativeCrashHandler.this.f5715m.m5221a(crashDetailBeanM5286a, true)) {
                        NativeCrashHandler.this.f5715m.m5223b(crashDetailBeanM5286a, false);
                    }
                    C6694be.m5294a(false, NativeCrashHandler.f5702a);
                }
                final NativeCrashHandler nativeCrashHandler = NativeCrashHandler.this;
                long jM5157b = C6678ap.m5157b() - C6682at.f5940j;
                long jM5157b2 = C6678ap.m5157b() + CalendarModelKt.MillisecondsIn24Hours;
                File file = new File(NativeCrashHandler.f5702a);
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
                            int i9 = 0;
                            int i10 = 0;
                            for (File file2 : fileArrListFiles) {
                                long jLastModified = file2.lastModified();
                                length += file2.length();
                                if (jLastModified < jM5157b || jLastModified >= jM5157b2 || length >= C6682at.f5939i) {
                                    C6674al.m5102a("[Native] Delete record file: %s", file2.getAbsolutePath());
                                    i9++;
                                    if (file2.delete()) {
                                        i10++;
                                    }
                                }
                            }
                            C6674al.m5106c("[Native] Number of record files overdue: %d, has deleted: %d", Integer.valueOf(i9), Integer.valueOf(i10));
                        }
                    } catch (Throwable th) {
                        C6674al.m5103a(th);
                    }
                }
                C6678ap.m5163b(NativeCrashHandler.this.f5706d, "native_record_lock");
            }
        });
    }

    public void disableCatchAnrTrace() {
        f5704c = 1;
    }

    public void dumpAnrNativeStack() {
        m4951a(19, "1");
    }

    public void enableCatchAnrTrace() {
        f5704c |= 2;
    }

    public boolean filterSigabrtSysLog() {
        return m4951a(998, "true");
    }

    @Override // com.tencent.bugly.proguard.InterfaceC6726q
    public String getLogFromNative() {
        if (!this.f5711i && !this.f5712j) {
            return null;
        }
        try {
            return this.f5712j ? getNativeLog() : (String) C6678ap.m5135a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "getNativeLog", null, null);
        } catch (UnsatisfiedLinkError unused) {
            return null;
        } catch (Throwable th) {
            if (!C6674al.m5103a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    public NativeExceptionHandler getNativeExceptionHandler() {
        return this.f5709g;
    }

    public native String getNativeKeyValueList();

    public native String getNativeLog();

    public String getRunningCpuAbi() {
        try {
            return getSoCpuAbi();
        } catch (Throwable unused) {
            C6674al.m5107d("get so cpu abi failed，please upgrade bugly so version", new Object[0]);
            return "";
        }
    }

    public String getSystemProperty(String str) {
        return (this.f5712j || this.f5711i) ? getProperties(str) : "fail";
    }

    public boolean isEnableCatchAnrTrace() {
        return (f5704c & 2) == 2;
    }

    public synchronized boolean isUserOpened() {
        return this.f5714l;
    }

    public synchronized void onStrategyChanged(StrategyBean strategyBean) {
        if (strategyBean != null) {
            try {
                boolean z9 = strategyBean.f5617f;
                if (z9 != this.f5713k) {
                    C6674al.m5107d("server native changed to %b", Boolean.valueOf(z9));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean z10 = C6665ac.m5031a().m5040c().f5617f && this.f5714l;
        if (z10 != this.f5713k) {
            C6674al.m5102a("native changed to %b", Boolean.valueOf(z10));
            m4956b(z10);
        }
    }

    public boolean putKeyValueToNative(String str, String str2) {
        if ((this.f5711i || this.f5712j) && str != null && str2 != null) {
            try {
                if (this.f5712j) {
                    return putNativeKeyValue(str, str2);
                }
                Boolean bool = (Boolean) C6678ap.m5135a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "putNativeKeyValue", new Class[]{String.class, String.class}, new Object[]{str, str2});
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                if (!C6674al.m5103a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return false;
    }

    public native boolean putNativeKeyValue(String str, String str2);

    public native String regist(String str, boolean z9, int i9);

    public void removeEmptyNativeRecordFiles() {
        C6694be.m5299c(f5702a);
    }

    public native String removeNativeKeyValue(String str);

    public void resendSigquit() {
        m4951a(20, "");
    }

    public boolean setNativeAppChannel(String str) {
        return m4951a(12, str);
    }

    public boolean setNativeAppPackage(String str) {
        return m4951a(13, str);
    }

    public boolean setNativeAppVersion(String str) {
        return m4951a(10, str);
    }

    public native void setNativeInfo(int i9, String str);

    @Override // com.tencent.bugly.proguard.InterfaceC6726q
    public boolean setNativeIsAppForeground(boolean z9) {
        return m4951a(14, z9 ? "true" : "false");
    }

    public boolean setNativeLaunchTime(long j9) {
        try {
            return m4951a(15, String.valueOf(j9));
        } catch (NumberFormatException e10) {
            if (C6674al.m5103a(e10)) {
                return false;
            }
            e10.printStackTrace();
            return false;
        }
    }

    public boolean setNativeUserId(String str) {
        return m4951a(11, str);
    }

    public synchronized void setUserOpened(boolean z9) {
        try {
            m4959c(z9);
            boolean zIsUserOpened = isUserOpened();
            C6665ac c6665acM5031a = C6665ac.m5031a();
            if (c6665acM5031a != null) {
                zIsUserOpened = zIsUserOpened && c6665acM5031a.m5040c().f5617f;
            }
            if (zIsUserOpened != this.f5713k) {
                C6674al.m5102a("native changed to %b", Boolean.valueOf(zIsUserOpened));
                m4956b(zIsUserOpened);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void startNativeMonitor() {
        try {
            if (!this.f5712j && !this.f5711i) {
                boolean zM5165b = C6678ap.m5165b(this.f5707e.f5788t);
                boolean z9 = !zM5165b;
                if (C6682at.f5933b) {
                    boolean zM4953a = m4953a(zM5165b ? "Bugly_Native" : this.f5707e.f5788t, z9);
                    this.f5712j = zM4953a;
                    if (!zM4953a && zM5165b) {
                        this.f5711i = m4953a("NativeRQD", false);
                    }
                } else {
                    String str = "Bugly_Native";
                    C6663aa c6663aa = this.f5707e;
                    String str2 = c6663aa.f5788t;
                    if (zM5165b) {
                        c6663aa.getClass();
                    } else {
                        str = str2;
                    }
                    this.f5712j = m4953a(str, z9);
                }
                if (this.f5712j || this.f5711i) {
                    m4949a(this.f5710h);
                    setNativeAppVersion(this.f5707e.f5783o);
                    setNativeAppChannel(this.f5707e.f5787s);
                    setNativeAppPackage(this.f5707e.f5771c);
                    setNativeUserId(this.f5707e.m4984f());
                    setNativeIsAppForeground(this.f5707e.m4975a());
                    setNativeLaunchTime(this.f5707e.f5745a);
                    return;
                }
                return;
            }
            m4949a(this.f5710h);
        } catch (Throwable th) {
            throw th;
        }
    }

    public native void testCrash();

    public void testNativeCrash() {
        if (this.f5712j) {
            testCrash();
        } else {
            C6674al.m5107d("[Native] Bugly SO file has not been load.", new Object[0]);
        }
    }

    public void unBlockSigquit(boolean z9) {
        if (z9) {
            m4951a(21, "true");
        } else {
            m4951a(21, "false");
        }
    }

    public native String unregist();

    /* renamed from: c */
    private synchronized void m4958c() {
        if (!this.f5713k) {
            C6674al.m5107d("[Native] Native crash report has already unregistered.", new Object[0]);
            return;
        }
        try {
        } catch (Throwable unused) {
            C6674al.m5106c("[Native] Failed to close native crash report.", new Object[0]);
        }
        if (unregist() != null) {
            C6674al.m5102a("[Native] Successfully closed native crash report.", new Object[0]);
            this.f5713k = false;
            return;
        }
        try {
            C6678ap.m5135a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "enableHandler", new Class[]{Boolean.TYPE}, new Object[]{Boolean.FALSE});
            this.f5713k = false;
            C6674al.m5102a("[Native] Successfully closed native crash report.", new Object[0]);
            return;
        } catch (Throwable unused2) {
            C6674al.m5106c("[Native] Failed to close native crash report.", new Object[0]);
            this.f5712j = false;
            this.f5711i = false;
            return;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m4952a(NativeCrashHandler nativeCrashHandler, String str) {
        return nativeCrashHandler.m4951a(999, str);
    }

    /* renamed from: b */
    private synchronized void m4956b(boolean z9) {
        if (z9) {
            startNativeMonitor();
        } else {
            m4958c();
        }
    }

    /* renamed from: a */
    private synchronized void m4949a(boolean z9) {
        if (this.f5713k) {
            C6674al.m5107d("[Native] Native crash report has already registered.", new Object[0]);
            return;
        }
        int i9 = 1;
        if (this.f5712j) {
            try {
                String strRegist = regist(f5702a, z9, f5704c);
                if (strRegist != null) {
                    C6674al.m5102a("[Native] Native Crash Report enable.", new Object[0]);
                    this.f5707e.f5789u = strRegist;
                    String strConcat = "-".concat(strRegist);
                    if (!C6682at.f5933b && !this.f5707e.f5776h.contains(strConcat)) {
                        C6663aa c6663aa = this.f5707e;
                        c6663aa.f5776h = c6663aa.f5776h.concat("-").concat(this.f5707e.f5789u);
                    }
                    C6674al.m5102a("comInfo.sdkVersion %s", this.f5707e.f5776h);
                    this.f5713k = true;
                    String runningCpuAbi = getRunningCpuAbi();
                    if (!TextUtils.isEmpty(runningCpuAbi)) {
                        this.f5707e.m4983e(runningCpuAbi);
                    }
                    return;
                }
            } catch (Throwable unused) {
                C6674al.m5106c("[Native] Failed to load Bugly SO file.", new Object[0]);
            }
        } else if (this.f5711i) {
            try {
                Class cls = Integer.TYPE;
                String str = (String) C6678ap.m5135a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "registNativeExceptionHandler2", new Class[]{String.class, String.class, cls, cls}, new Object[]{f5702a, C6664ab.m5012d(), Integer.valueOf(z9 ? 1 : 5), 1});
                if (str == null) {
                    String str2 = f5702a;
                    String strM5012d = C6664ab.m5012d();
                    C6663aa.m4969b();
                    str = (String) C6678ap.m5135a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "registNativeExceptionHandler", new Class[]{String.class, String.class, cls}, new Object[]{str2, strM5012d, Integer.valueOf(C6663aa.m4961B())});
                }
                if (str != null) {
                    this.f5713k = true;
                    this.f5707e.f5789u = str;
                    C6678ap.m5135a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "enableHandler", new Class[]{Boolean.TYPE}, new Object[]{Boolean.TRUE});
                    if (!z9) {
                        i9 = 5;
                    }
                    C6678ap.m5135a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "setLogMode", new Class[]{cls}, new Object[]{Integer.valueOf(i9)});
                    String runningCpuAbi2 = getRunningCpuAbi();
                    if (!TextUtils.isEmpty(runningCpuAbi2)) {
                        this.f5707e.m4983e(runningCpuAbi2);
                    }
                    return;
                }
            } catch (Throwable unused2) {
            }
        }
        this.f5712j = false;
        this.f5711i = false;
    }

    public static synchronized NativeCrashHandler getInstance() {
        return f5703b;
    }

    public void testNativeCrash(boolean z9, boolean z10, boolean z11) {
        m4951a(16, String.valueOf(z9));
        m4951a(17, String.valueOf(z10));
        m4951a(18, String.valueOf(z11));
        testNativeCrash();
    }

    /* renamed from: c */
    private synchronized void m4959c(boolean z9) {
        if (this.f5714l != z9) {
            C6674al.m5102a("user change native %b", Boolean.valueOf(z9));
            this.f5714l = z9;
        }
    }

    /* renamed from: a */
    private static boolean m4953a(String str, boolean z9) {
        boolean z10;
        try {
            C6674al.m5102a("[Native] Trying to load so: %s", str);
            if (z9) {
                System.load(str);
            } else {
                System.loadLibrary(str);
            }
        } catch (Throwable th) {
            th = th;
            z10 = false;
        }
        try {
            C6674al.m5102a("[Native] Successfully loaded SO: %s", str);
            return true;
        } catch (Throwable th2) {
            z10 = true;
            th = th2;
            C6674al.m5107d(th.getMessage(), new Object[0]);
            C6674al.m5107d("[Native] Failed to load so: %s", str);
            return z10;
        }
    }

    /* renamed from: a */
    private boolean m4951a(int i9, String str) {
        if (!this.f5712j) {
            return false;
        }
        try {
            setNativeInfo(i9, str);
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        } catch (Throwable th) {
            if (!C6674al.m5103a(th)) {
                th.printStackTrace();
            }
            return false;
        }
    }
}
