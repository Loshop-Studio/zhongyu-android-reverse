package com.tencent.bugly.crashreport.crash.jni;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import androidx.compose.material3.internal.CalendarModelKt;
import com.google.protobuf.DescriptorProtos;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.proguard.C6403aa;
import com.tencent.bugly.proguard.C6404ab;
import com.tencent.bugly.proguard.C6405ac;
import com.tencent.bugly.proguard.C6413ak;
import com.tencent.bugly.proguard.C6414al;
import com.tencent.bugly.proguard.C6418ap;
import com.tencent.bugly.proguard.C6421as;
import com.tencent.bugly.proguard.C6422at;
import com.tencent.bugly.proguard.C6433bd;
import com.tencent.bugly.proguard.C6434be;
import com.tencent.bugly.proguard.InterfaceC6466q;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes4.dex */
public class NativeCrashHandler implements InterfaceC6466q {

    /* renamed from: a */
    static String f5125a = null;

    /* renamed from: b */
    private static NativeCrashHandler f5126b = null;

    /* renamed from: c */
    private static int f5127c = 1;

    /* renamed from: n */
    private static boolean f5128n = true;

    /* renamed from: d */
    private final Context f5129d;

    /* renamed from: e */
    private final C6403aa f5130e;

    /* renamed from: f */
    private final C6413ak f5131f;

    /* renamed from: g */
    private NativeExceptionHandler f5132g;

    /* renamed from: h */
    private final boolean f5133h;

    /* renamed from: i */
    private boolean f5134i = false;

    /* renamed from: j */
    private boolean f5135j = false;

    /* renamed from: k */
    private boolean f5136k = false;

    /* renamed from: l */
    private boolean f5137l = false;

    /* renamed from: m */
    private C6421as f5138m;

    @SuppressLint({"SdCardPath"})
    private NativeCrashHandler(Context context, C6403aa c6403aa, C6421as c6421as, C6413ak c6413ak, boolean z9, String str) {
        this.f5129d = C6418ap.m4953a(context);
        if (C6418ap.m4986b(f5125a)) {
            try {
                if (C6418ap.m4986b(str)) {
                    str = context.getDir("bugly", 0).getAbsolutePath();
                }
            } catch (Throwable unused) {
                str = "/data/data/" + C6403aa.m4788a(context).f5194c + "/app_bugly";
            }
            f5125a = str;
        }
        this.f5138m = c6421as;
        this.f5130e = c6403aa;
        this.f5131f = c6413ak;
        this.f5133h = z9;
        this.f5132g = new C6433bd(context, c6403aa, c6421as, C6405ac.m4852a());
    }

    public static synchronized String getDumpFilePath() {
        return f5125a;
    }

    public static synchronized NativeCrashHandler getInstance(Context context, C6403aa c6403aa, C6421as c6421as, C6405ac c6405ac, C6413ak c6413ak, boolean z9, String str) {
        try {
            if (f5126b == null) {
                f5126b = new NativeCrashHandler(context, c6403aa, c6421as, c6413ak, z9, str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5126b;
    }

    private native String getProperties(String str);

    private native String getSoCpuAbi();

    public static boolean isShouldHandleInJava() {
        return f5128n;
    }

    public static synchronized void setDumpFilePath(String str) {
        f5125a = str;
    }

    public static void setShouldHandleInJava(boolean z9) {
        f5128n = z9;
        NativeCrashHandler nativeCrashHandler = f5126b;
        if (nativeCrashHandler != null) {
            nativeCrashHandler.m4772a(999, String.valueOf(z9));
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC6466q
    public boolean appendLogToNative(String str, String str2, String str3) {
        if ((this.f5134i || this.f5135j) && str != null && str2 != null && str3 != null) {
            try {
                if (this.f5135j) {
                    return appendNativeLog(str, str2, str3);
                }
                Boolean bool = (Boolean) C6418ap.m4956a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "appendNativeLog", new Class[]{String.class, String.class, String.class}, new Object[]{str, str2, str3});
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                if (!C6414al.m4924a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return false;
    }

    public native boolean appendNativeLog(String str, String str2, String str3);

    public native boolean appendWholeNativeLog(String str);

    public void checkUploadRecordCrash() {
        this.f5131f.m4916a(new Runnable() { // from class: com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.1
            @Override // java.lang.Runnable
            public final void run() {
                if (!C6418ap.m4972a(NativeCrashHandler.this.f5129d, "native_record_lock")) {
                    C6414al.m4923a("[Native] Failed to lock file for handling native crash record.", new Object[0]);
                    return;
                }
                if (!NativeCrashHandler.f5128n) {
                    NativeCrashHandler.m4773a(NativeCrashHandler.this, "false");
                }
                CrashDetailBean crashDetailBeanM5107a = C6434be.m5107a(NativeCrashHandler.this.f5129d, NativeCrashHandler.f5125a, NativeCrashHandler.this.f5132g);
                if (crashDetailBeanM5107a != null) {
                    C6414al.m4923a("[Native] Get crash from native record.", new Object[0]);
                    if (!NativeCrashHandler.this.f5138m.m5042a(crashDetailBeanM5107a, true)) {
                        NativeCrashHandler.this.f5138m.m5044b(crashDetailBeanM5107a, false);
                    }
                    C6434be.m5115a(false, NativeCrashHandler.f5125a);
                }
                final NativeCrashHandler nativeCrashHandler = NativeCrashHandler.this;
                long jM4978b = C6418ap.m4978b() - C6422at.f5363j;
                long jM4978b2 = C6418ap.m4978b() + CalendarModelKt.MillisecondsIn24Hours;
                File file = new File(NativeCrashHandler.f5125a);
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
                                if (jLastModified < jM4978b || jLastModified >= jM4978b2 || length >= C6422at.f5362i) {
                                    C6414al.m4923a("[Native] Delete record file: %s", file2.getAbsolutePath());
                                    i10++;
                                    if (file2.delete()) {
                                        i11++;
                                    }
                                }
                            }
                            C6414al.m4927c("[Native] Number of record files overdue: %d, has deleted: %d", Integer.valueOf(i10), Integer.valueOf(i11));
                        }
                    } catch (Throwable th) {
                        C6414al.m4924a(th);
                    }
                }
                C6418ap.m4984b(NativeCrashHandler.this.f5129d, "native_record_lock");
            }
        });
    }

    public void disableCatchAnrTrace() {
        f5127c = 1;
    }

    public void dumpAnrNativeStack() {
        m4772a(19, "1");
    }

    public void enableCatchAnrTrace() {
        f5127c |= 2;
    }

    public boolean filterSigabrtSysLog() {
        return m4772a(DescriptorProtos.Edition.EDITION_PROTO2_VALUE, "true");
    }

    @Override // com.tencent.bugly.proguard.InterfaceC6466q
    public String getLogFromNative() {
        if (!this.f5134i && !this.f5135j) {
            return null;
        }
        try {
            return this.f5135j ? getNativeLog() : (String) C6418ap.m4956a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "getNativeLog", null, null);
        } catch (UnsatisfiedLinkError unused) {
            return null;
        } catch (Throwable th) {
            if (!C6414al.m4924a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    public NativeExceptionHandler getNativeExceptionHandler() {
        return this.f5132g;
    }

    public native String getNativeKeyValueList();

    public native String getNativeLog();

    public String getRunningCpuAbi() {
        try {
            return getSoCpuAbi();
        } catch (Throwable unused) {
            C6414al.m4928d("get so cpu abi failed，please upgrade bugly so version", new Object[0]);
            return "";
        }
    }

    public String getSystemProperty(String str) {
        return (this.f5135j || this.f5134i) ? getProperties(str) : "fail";
    }

    public boolean isEnableCatchAnrTrace() {
        return (f5127c & 2) == 2;
    }

    public synchronized boolean isUserOpened() {
        return this.f5137l;
    }

    public synchronized void onStrategyChanged(StrategyBean strategyBean) {
        if (strategyBean != null) {
            try {
                boolean z9 = strategyBean.f5040f;
                if (z9 != this.f5136k) {
                    C6414al.m4928d("server native changed to %b", Boolean.valueOf(z9));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean z10 = C6405ac.m4852a().m4861c().f5040f && this.f5137l;
        if (z10 != this.f5136k) {
            C6414al.m4923a("native changed to %b", Boolean.valueOf(z10));
            m4777b(z10);
        }
    }

    public boolean putKeyValueToNative(String str, String str2) {
        if ((this.f5134i || this.f5135j) && str != null && str2 != null) {
            try {
                if (this.f5135j) {
                    return putNativeKeyValue(str, str2);
                }
                Boolean bool = (Boolean) C6418ap.m4956a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "putNativeKeyValue", new Class[]{String.class, String.class}, new Object[]{str, str2});
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                if (!C6414al.m4924a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return false;
    }

    public native boolean putNativeKeyValue(String str, String str2);

    public native String regist(String str, boolean z9, int i10);

    public void removeEmptyNativeRecordFiles() {
        C6434be.m5120c(f5125a);
    }

    public native String removeNativeKeyValue(String str);

    public void resendSigquit() {
        m4772a(20, "");
    }

    public boolean setNativeAppChannel(String str) {
        return m4772a(12, str);
    }

    public boolean setNativeAppPackage(String str) {
        return m4772a(13, str);
    }

    public boolean setNativeAppVersion(String str) {
        return m4772a(10, str);
    }

    public native void setNativeInfo(int i10, String str);

    @Override // com.tencent.bugly.proguard.InterfaceC6466q
    public boolean setNativeIsAppForeground(boolean z9) {
        return m4772a(14, z9 ? "true" : "false");
    }

    public boolean setNativeLaunchTime(long j10) {
        try {
            return m4772a(15, String.valueOf(j10));
        } catch (NumberFormatException e10) {
            if (C6414al.m4924a(e10)) {
                return false;
            }
            e10.printStackTrace();
            return false;
        }
    }

    public boolean setNativeUserId(String str) {
        return m4772a(11, str);
    }

    public synchronized void setUserOpened(boolean z9) {
        try {
            m4780c(z9);
            boolean zIsUserOpened = isUserOpened();
            C6405ac c6405acM4852a = C6405ac.m4852a();
            if (c6405acM4852a != null) {
                zIsUserOpened = zIsUserOpened && c6405acM4852a.m4861c().f5040f;
            }
            if (zIsUserOpened != this.f5136k) {
                C6414al.m4923a("native changed to %b", Boolean.valueOf(zIsUserOpened));
                m4777b(zIsUserOpened);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void startNativeMonitor() {
        try {
            if (!this.f5135j && !this.f5134i) {
                boolean zM4986b = C6418ap.m4986b(this.f5130e.f5211t);
                boolean z9 = !zM4986b;
                if (C6422at.f5356b) {
                    boolean zM4774a = m4774a(zM4986b ? "Bugly_Native" : this.f5130e.f5211t, z9);
                    this.f5135j = zM4774a;
                    if (!zM4774a && zM4986b) {
                        this.f5134i = m4774a("NativeRQD", false);
                    }
                } else {
                    String str = "Bugly_Native";
                    C6403aa c6403aa = this.f5130e;
                    String str2 = c6403aa.f5211t;
                    if (zM4986b) {
                        c6403aa.getClass();
                    } else {
                        str = str2;
                    }
                    this.f5135j = m4774a(str, z9);
                }
                if (this.f5135j || this.f5134i) {
                    m4770a(this.f5133h);
                    setNativeAppVersion(this.f5130e.f5206o);
                    setNativeAppChannel(this.f5130e.f5210s);
                    setNativeAppPackage(this.f5130e.f5194c);
                    setNativeUserId(this.f5130e.m4805f());
                    setNativeIsAppForeground(this.f5130e.m4796a());
                    setNativeLaunchTime(this.f5130e.f5168a);
                    return;
                }
                return;
            }
            m4770a(this.f5133h);
        } catch (Throwable th) {
            throw th;
        }
    }

    public native void testCrash();

    public void testNativeCrash() {
        if (this.f5135j) {
            testCrash();
        } else {
            C6414al.m4928d("[Native] Bugly SO file has not been load.", new Object[0]);
        }
    }

    public void unBlockSigquit(boolean z9) {
        if (z9) {
            m4772a(21, "true");
        } else {
            m4772a(21, "false");
        }
    }

    public native String unregist();

    /* renamed from: c */
    private synchronized void m4779c() {
        if (!this.f5136k) {
            C6414al.m4928d("[Native] Native crash report has already unregistered.", new Object[0]);
            return;
        }
        try {
        } catch (Throwable unused) {
            C6414al.m4927c("[Native] Failed to close native crash report.", new Object[0]);
        }
        if (unregist() != null) {
            C6414al.m4923a("[Native] Successfully closed native crash report.", new Object[0]);
            this.f5136k = false;
            return;
        }
        try {
            C6418ap.m4956a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "enableHandler", new Class[]{Boolean.TYPE}, new Object[]{Boolean.FALSE});
            this.f5136k = false;
            C6414al.m4923a("[Native] Successfully closed native crash report.", new Object[0]);
            return;
        } catch (Throwable unused2) {
            C6414al.m4927c("[Native] Failed to close native crash report.", new Object[0]);
            this.f5135j = false;
            this.f5134i = false;
            return;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m4773a(NativeCrashHandler nativeCrashHandler, String str) {
        return nativeCrashHandler.m4772a(999, str);
    }

    /* renamed from: b */
    private synchronized void m4777b(boolean z9) {
        if (z9) {
            startNativeMonitor();
        } else {
            m4779c();
        }
    }

    /* renamed from: a */
    private synchronized void m4770a(boolean z9) {
        if (this.f5136k) {
            C6414al.m4928d("[Native] Native crash report has already registered.", new Object[0]);
            return;
        }
        int i10 = 1;
        if (this.f5135j) {
            try {
                String strRegist = regist(f5125a, z9, f5127c);
                if (strRegist != null) {
                    C6414al.m4923a("[Native] Native Crash Report enable.", new Object[0]);
                    this.f5130e.f5212u = strRegist;
                    String strConcat = "-".concat(strRegist);
                    if (!C6422at.f5356b && !this.f5130e.f5199h.contains(strConcat)) {
                        C6403aa c6403aa = this.f5130e;
                        c6403aa.f5199h = c6403aa.f5199h.concat("-").concat(this.f5130e.f5212u);
                    }
                    C6414al.m4923a("comInfo.sdkVersion %s", this.f5130e.f5199h);
                    this.f5136k = true;
                    String runningCpuAbi = getRunningCpuAbi();
                    if (!TextUtils.isEmpty(runningCpuAbi)) {
                        this.f5130e.m4804e(runningCpuAbi);
                    }
                    return;
                }
            } catch (Throwable unused) {
                C6414al.m4927c("[Native] Failed to load Bugly SO file.", new Object[0]);
            }
        } else if (this.f5134i) {
            try {
                Class cls = Integer.TYPE;
                String str = (String) C6418ap.m4956a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "registNativeExceptionHandler2", new Class[]{String.class, String.class, cls, cls}, new Object[]{f5125a, C6404ab.m4833d(), Integer.valueOf(z9 ? 1 : 5), 1});
                if (str == null) {
                    String str2 = f5125a;
                    String strM4833d = C6404ab.m4833d();
                    C6403aa.m4790b();
                    str = (String) C6418ap.m4956a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "registNativeExceptionHandler", new Class[]{String.class, String.class, cls}, new Object[]{str2, strM4833d, Integer.valueOf(C6403aa.m4782B())});
                }
                if (str != null) {
                    this.f5136k = true;
                    this.f5130e.f5212u = str;
                    C6418ap.m4956a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "enableHandler", new Class[]{Boolean.TYPE}, new Object[]{Boolean.TRUE});
                    if (!z9) {
                        i10 = 5;
                    }
                    C6418ap.m4956a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "setLogMode", new Class[]{cls}, new Object[]{Integer.valueOf(i10)});
                    String runningCpuAbi2 = getRunningCpuAbi();
                    if (!TextUtils.isEmpty(runningCpuAbi2)) {
                        this.f5130e.m4804e(runningCpuAbi2);
                    }
                    return;
                }
            } catch (Throwable unused2) {
            }
        }
        this.f5135j = false;
        this.f5134i = false;
    }

    public static synchronized NativeCrashHandler getInstance() {
        return f5126b;
    }

    public void testNativeCrash(boolean z9, boolean z10, boolean z11) {
        m4772a(16, String.valueOf(z9));
        m4772a(17, String.valueOf(z10));
        m4772a(18, String.valueOf(z11));
        testNativeCrash();
    }

    /* renamed from: c */
    private synchronized void m4780c(boolean z9) {
        if (this.f5137l != z9) {
            C6414al.m4923a("user change native %b", Boolean.valueOf(z9));
            this.f5137l = z9;
        }
    }

    /* renamed from: a */
    private static boolean m4774a(String str, boolean z9) {
        boolean z10;
        try {
            C6414al.m4923a("[Native] Trying to load so: %s", str);
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
            C6414al.m4923a("[Native] Successfully loaded SO: %s", str);
            return true;
        } catch (Throwable th2) {
            z10 = true;
            th = th2;
            C6414al.m4928d(th.getMessage(), new Object[0]);
            C6414al.m4928d("[Native] Failed to load so: %s", str);
            return z10;
        }
    }

    /* renamed from: a */
    private boolean m4772a(int i10, String str) {
        if (!this.f5135j) {
            return false;
        }
        try {
            setNativeInfo(i10, str);
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        } catch (Throwable th) {
            if (!C6414al.m4924a(th)) {
                th.printStackTrace();
            }
            return false;
        }
    }
}
