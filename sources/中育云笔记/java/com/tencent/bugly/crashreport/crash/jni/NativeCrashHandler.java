package com.tencent.bugly.crashreport.crash.jni;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import anetwork.channel.util.RequestConstant;
import com.google.protobuf.DescriptorProtos;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.proguard.C7768aa;
import com.tencent.bugly.proguard.C7769ab;
import com.tencent.bugly.proguard.C7770ac;
import com.tencent.bugly.proguard.C7778ak;
import com.tencent.bugly.proguard.C7779al;
import com.tencent.bugly.proguard.C7783ap;
import com.tencent.bugly.proguard.C7786as;
import com.tencent.bugly.proguard.C7787at;
import com.tencent.bugly.proguard.C7798bd;
import com.tencent.bugly.proguard.C7799be;
import com.tencent.bugly.proguard.InterfaceC7831q;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes5.dex */
public class NativeCrashHandler implements InterfaceC7831q {

    /* renamed from: a */
    static String f13567a = null;

    /* renamed from: b */
    private static NativeCrashHandler f13568b = null;

    /* renamed from: c */
    private static int f13569c = 1;

    /* renamed from: n */
    private static boolean f13570n = true;

    /* renamed from: d */
    private final Context f13571d;

    /* renamed from: e */
    private final C7768aa f13572e;

    /* renamed from: f */
    private final C7778ak f13573f;

    /* renamed from: g */
    private NativeExceptionHandler f13574g;

    /* renamed from: h */
    private final boolean f13575h;

    /* renamed from: i */
    private boolean f13576i = false;

    /* renamed from: j */
    private boolean f13577j = false;

    /* renamed from: k */
    private boolean f13578k = false;

    /* renamed from: l */
    private boolean f13579l = false;

    /* renamed from: m */
    private C7786as f13580m;

    /* renamed from: com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler$a */
    public class RunnableC7765a implements Runnable {
        public RunnableC7765a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!C7783ap.m10662a(NativeCrashHandler.this.f13571d, "native_record_lock")) {
                C7779al.m10613a("[Native] Failed to lock file for handling native crash record.", new Object[0]);
                return;
            }
            if (!NativeCrashHandler.f13570n) {
                NativeCrashHandler.m10463a(NativeCrashHandler.this, RequestConstant.FALSE);
            }
            CrashDetailBean crashDetailBeanM10797a = C7799be.m10797a(NativeCrashHandler.this.f13571d, NativeCrashHandler.f13567a, NativeCrashHandler.this.f13574g);
            if (crashDetailBeanM10797a != null) {
                C7779al.m10613a("[Native] Get crash from native record.", new Object[0]);
                if (!NativeCrashHandler.this.f13580m.m10732a(crashDetailBeanM10797a, true)) {
                    NativeCrashHandler.this.f13580m.m10734b(crashDetailBeanM10797a, false);
                }
                C7799be.m10805a(false, NativeCrashHandler.f13567a);
            }
            NativeCrashHandler nativeCrashHandler = NativeCrashHandler.this;
            long jM10668b = C7783ap.m10668b() - C7787at.f13805j;
            long jM10668b2 = C7783ap.m10668b() + 86400000;
            File file = new File(NativeCrashHandler.f13567a);
            if (file.exists() && file.isDirectory()) {
                try {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                        Arrays.sort(fileArrListFiles, nativeCrashHandler.new C7766b());
                        long length = 0;
                        int i10 = 0;
                        int i11 = 0;
                        for (File file2 : fileArrListFiles) {
                            long jLastModified = file2.lastModified();
                            length += file2.length();
                            if (jLastModified < jM10668b || jLastModified >= jM10668b2 || length >= C7787at.f13804i) {
                                C7779al.m10613a("[Native] Delete record file: %s", file2.getAbsolutePath());
                                i10++;
                                if (file2.delete()) {
                                    i11++;
                                }
                            }
                        }
                        C7779al.m10617c("[Native] Number of record files overdue: %d, has deleted: %d", Integer.valueOf(i10), Integer.valueOf(i11));
                    }
                } catch (Throwable th) {
                    C7779al.m10614a(th);
                }
            }
            C7783ap.m10674b(NativeCrashHandler.this.f13571d, "native_record_lock");
        }
    }

    /* renamed from: com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler$b */
    public class C7766b implements Comparator {
        public C7766b() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
        }
    }

    @SuppressLint({"SdCardPath"})
    private NativeCrashHandler(Context context, C7768aa c7768aa, C7786as c7786as, C7778ak c7778ak, boolean z10, String str) {
        this.f13571d = C7783ap.m10643a(context);
        if (C7783ap.m10676b(f13567a)) {
            try {
                if (C7783ap.m10676b(str)) {
                    str = context.getDir("bugly", 0).getAbsolutePath();
                }
            } catch (Throwable unused) {
                str = "/data/data/" + C7768aa.m10478a(context).f13636c + "/app_bugly";
            }
            f13567a = str;
        }
        this.f13580m = c7786as;
        this.f13572e = c7768aa;
        this.f13573f = c7778ak;
        this.f13575h = z10;
        this.f13574g = new C7798bd(context, c7768aa, c7786as, C7770ac.m10542a());
    }

    public static synchronized String getDumpFilePath() {
        return f13567a;
    }

    public static synchronized NativeCrashHandler getInstance(Context context, C7768aa c7768aa, C7786as c7786as, C7770ac c7770ac, C7778ak c7778ak, boolean z10, String str) {
        try {
            if (f13568b == null) {
                f13568b = new NativeCrashHandler(context, c7768aa, c7786as, c7778ak, z10, str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13568b;
    }

    private native String getProperties(String str);

    private native String getSoCpuAbi();

    public static boolean isShouldHandleInJava() {
        return f13570n;
    }

    public static synchronized void setDumpFilePath(String str) {
        f13567a = str;
    }

    public static void setShouldHandleInJava(boolean z10) {
        f13570n = z10;
        NativeCrashHandler nativeCrashHandler = f13568b;
        if (nativeCrashHandler != null) {
            nativeCrashHandler.m10462a(999, String.valueOf(z10));
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC7831q
    public boolean appendLogToNative(String str, String str2, String str3) {
        if ((this.f13576i || this.f13577j) && str != null && str2 != null && str3 != null) {
            try {
                if (this.f13577j) {
                    return appendNativeLog(str, str2, str3);
                }
                Boolean bool = (Boolean) C7783ap.m10646a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "appendNativeLog", new Class[]{String.class, String.class, String.class}, new Object[]{str, str2, str3});
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                if (!C7779al.m10614a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return false;
    }

    public native boolean appendNativeLog(String str, String str2, String str3);

    public native boolean appendWholeNativeLog(String str);

    public void checkUploadRecordCrash() {
        this.f13573f.m10606a(new RunnableC7765a());
    }

    public void disableCatchAnrTrace() {
        f13569c = 1;
    }

    public void dumpAnrNativeStack() {
        m10462a(19, "1");
    }

    public void enableCatchAnrTrace() {
        f13569c |= 2;
    }

    public boolean filterSigabrtSysLog() {
        return m10462a(DescriptorProtos.Edition.EDITION_PROTO2_VALUE, RequestConstant.TRUE);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC7831q
    public String getLogFromNative() {
        if (!this.f13576i && !this.f13577j) {
            return null;
        }
        try {
            return this.f13577j ? getNativeLog() : (String) C7783ap.m10646a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "getNativeLog", null, null);
        } catch (UnsatisfiedLinkError unused) {
            return null;
        } catch (Throwable th) {
            if (!C7779al.m10614a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    public NativeExceptionHandler getNativeExceptionHandler() {
        return this.f13574g;
    }

    public native String getNativeKeyValueList();

    public native String getNativeLog();

    public String getRunningCpuAbi() {
        try {
            return getSoCpuAbi();
        } catch (Throwable unused) {
            C7779al.m10618d("get so cpu abi failed，please upgrade bugly so version", new Object[0]);
            return "";
        }
    }

    public String getSystemProperty(String str) {
        return (this.f13577j || this.f13576i) ? getProperties(str) : "fail";
    }

    public boolean isEnableCatchAnrTrace() {
        return (f13569c & 2) == 2;
    }

    public synchronized boolean isUserOpened() {
        return this.f13579l;
    }

    public synchronized void onStrategyChanged(StrategyBean strategyBean) {
        if (strategyBean != null) {
            try {
                boolean z10 = strategyBean.f13482f;
                if (z10 != this.f13578k) {
                    C7779al.m10618d("server native changed to %b", Boolean.valueOf(z10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean z11 = C7770ac.m10542a().m10551c().f13482f && this.f13579l;
        if (z11 != this.f13578k) {
            C7779al.m10613a("native changed to %b", Boolean.valueOf(z11));
            m10467b(z11);
        }
    }

    public boolean putKeyValueToNative(String str, String str2) {
        if ((this.f13576i || this.f13577j) && str != null && str2 != null) {
            try {
                if (this.f13577j) {
                    return putNativeKeyValue(str, str2);
                }
                Boolean bool = (Boolean) C7783ap.m10646a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "putNativeKeyValue", new Class[]{String.class, String.class}, new Object[]{str, str2});
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                if (!C7779al.m10614a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return false;
    }

    public native boolean putNativeKeyValue(String str, String str2);

    public native String regist(String str, boolean z10, int i10);

    public void removeEmptyNativeRecordFiles() {
        C7799be.m10810c(f13567a);
    }

    public native String removeNativeKeyValue(String str);

    public void resendSigquit() {
        m10462a(20, "");
    }

    public boolean setNativeAppChannel(String str) {
        return m10462a(12, str);
    }

    public boolean setNativeAppPackage(String str) {
        return m10462a(13, str);
    }

    public boolean setNativeAppVersion(String str) {
        return m10462a(10, str);
    }

    public native void setNativeInfo(int i10, String str);

    @Override // com.tencent.bugly.proguard.InterfaceC7831q
    public boolean setNativeIsAppForeground(boolean z10) {
        return m10462a(14, z10 ? RequestConstant.TRUE : RequestConstant.FALSE);
    }

    public boolean setNativeLaunchTime(long j10) {
        try {
            return m10462a(15, String.valueOf(j10));
        } catch (NumberFormatException e10) {
            if (C7779al.m10614a(e10)) {
                return false;
            }
            e10.printStackTrace();
            return false;
        }
    }

    public boolean setNativeUserId(String str) {
        return m10462a(11, str);
    }

    public synchronized void setUserOpened(boolean z10) {
        try {
            m10470c(z10);
            boolean zIsUserOpened = isUserOpened();
            C7770ac c7770acM10542a = C7770ac.m10542a();
            if (c7770acM10542a != null) {
                zIsUserOpened = zIsUserOpened && c7770acM10542a.m10551c().f13482f;
            }
            if (zIsUserOpened != this.f13578k) {
                C7779al.m10613a("native changed to %b", Boolean.valueOf(zIsUserOpened));
                m10467b(zIsUserOpened);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void startNativeMonitor() {
        try {
            if (!this.f13577j && !this.f13576i) {
                boolean zM10676b = C7783ap.m10676b(this.f13572e.f13653t);
                boolean z10 = !zM10676b;
                if (C7787at.f13798b) {
                    boolean zM10464a = m10464a(zM10676b ? "Bugly_Native" : this.f13572e.f13653t, z10);
                    this.f13577j = zM10464a;
                    if (!zM10464a && zM10676b) {
                        this.f13576i = m10464a("NativeRQD", false);
                    }
                } else {
                    String str = "Bugly_Native";
                    C7768aa c7768aa = this.f13572e;
                    String str2 = c7768aa.f13653t;
                    if (zM10676b) {
                        c7768aa.getClass();
                    } else {
                        str = str2;
                    }
                    this.f13577j = m10464a(str, z10);
                }
                if (this.f13577j || this.f13576i) {
                    m10460a(this.f13575h);
                    setNativeAppVersion(this.f13572e.f13648o);
                    setNativeAppChannel(this.f13572e.f13652s);
                    setNativeAppPackage(this.f13572e.f13636c);
                    setNativeUserId(this.f13572e.m10495f());
                    setNativeIsAppForeground(this.f13572e.m10486a());
                    setNativeLaunchTime(this.f13572e.f13610a);
                    return;
                }
                return;
            }
            m10460a(this.f13575h);
        } catch (Throwable th) {
            throw th;
        }
    }

    public native void testCrash();

    public void testNativeCrash() {
        if (this.f13577j) {
            testCrash();
        } else {
            C7779al.m10618d("[Native] Bugly SO file has not been load.", new Object[0]);
        }
    }

    public void unBlockSigquit(boolean z10) {
        if (z10) {
            m10462a(21, RequestConstant.TRUE);
        } else {
            m10462a(21, RequestConstant.FALSE);
        }
    }

    public native String unregist();

    /* renamed from: c */
    private synchronized void m10469c() {
        if (!this.f13578k) {
            C7779al.m10618d("[Native] Native crash report has already unregistered.", new Object[0]);
            return;
        }
        try {
        } catch (Throwable unused) {
            C7779al.m10617c("[Native] Failed to close native crash report.", new Object[0]);
        }
        if (unregist() != null) {
            C7779al.m10613a("[Native] Successfully closed native crash report.", new Object[0]);
            this.f13578k = false;
            return;
        }
        try {
            C7783ap.m10646a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "enableHandler", new Class[]{Boolean.TYPE}, new Object[]{Boolean.FALSE});
            this.f13578k = false;
            C7779al.m10613a("[Native] Successfully closed native crash report.", new Object[0]);
            return;
        } catch (Throwable unused2) {
            C7779al.m10617c("[Native] Failed to close native crash report.", new Object[0]);
            this.f13577j = false;
            this.f13576i = false;
            return;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m10463a(NativeCrashHandler nativeCrashHandler, String str) {
        return nativeCrashHandler.m10462a(999, str);
    }

    /* renamed from: b */
    private synchronized void m10467b(boolean z10) {
        if (z10) {
            startNativeMonitor();
        } else {
            m10469c();
        }
    }

    /* renamed from: a */
    private synchronized void m10460a(boolean z10) {
        if (this.f13578k) {
            C7779al.m10618d("[Native] Native crash report has already registered.", new Object[0]);
            return;
        }
        int i10 = 1;
        if (this.f13577j) {
            try {
                String strRegist = regist(f13567a, z10, f13569c);
                if (strRegist != null) {
                    C7779al.m10613a("[Native] Native Crash Report enable.", new Object[0]);
                    this.f13572e.f13654u = strRegist;
                    String strConcat = "-".concat(strRegist);
                    if (!C7787at.f13798b && !this.f13572e.f13641h.contains(strConcat)) {
                        C7768aa c7768aa = this.f13572e;
                        c7768aa.f13641h = c7768aa.f13641h.concat("-").concat(this.f13572e.f13654u);
                    }
                    C7779al.m10613a("comInfo.sdkVersion %s", this.f13572e.f13641h);
                    this.f13578k = true;
                    String runningCpuAbi = getRunningCpuAbi();
                    if (!TextUtils.isEmpty(runningCpuAbi)) {
                        this.f13572e.m10494e(runningCpuAbi);
                    }
                    return;
                }
            } catch (Throwable unused) {
                C7779al.m10617c("[Native] Failed to load Bugly SO file.", new Object[0]);
            }
        } else if (this.f13576i) {
            try {
                Class cls = Integer.TYPE;
                String str = (String) C7783ap.m10646a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "registNativeExceptionHandler2", new Class[]{String.class, String.class, cls, cls}, new Object[]{f13567a, C7769ab.m10523d(), Integer.valueOf(z10 ? 1 : 5), 1});
                if (str == null) {
                    String str2 = f13567a;
                    String strM10523d = C7769ab.m10523d();
                    C7768aa.m10480b();
                    str = (String) C7783ap.m10646a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "registNativeExceptionHandler", new Class[]{String.class, String.class, cls}, new Object[]{str2, strM10523d, Integer.valueOf(C7768aa.m10472B())});
                }
                if (str != null) {
                    this.f13578k = true;
                    this.f13572e.f13654u = str;
                    C7783ap.m10646a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "enableHandler", new Class[]{Boolean.TYPE}, new Object[]{Boolean.TRUE});
                    if (!z10) {
                        i10 = 5;
                    }
                    C7783ap.m10646a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "setLogMode", new Class[]{cls}, new Object[]{Integer.valueOf(i10)});
                    String runningCpuAbi2 = getRunningCpuAbi();
                    if (!TextUtils.isEmpty(runningCpuAbi2)) {
                        this.f13572e.m10494e(runningCpuAbi2);
                    }
                    return;
                }
            } catch (Throwable unused2) {
            }
        }
        this.f13577j = false;
        this.f13576i = false;
    }

    public static synchronized NativeCrashHandler getInstance() {
        return f13568b;
    }

    public void testNativeCrash(boolean z10, boolean z11, boolean z12) {
        m10462a(16, String.valueOf(z10));
        m10462a(17, String.valueOf(z11));
        m10462a(18, String.valueOf(z12));
        testNativeCrash();
    }

    /* renamed from: c */
    private synchronized void m10470c(boolean z10) {
        if (this.f13579l != z10) {
            C7779al.m10613a("user change native %b", Boolean.valueOf(z10));
            this.f13579l = z10;
        }
    }

    /* renamed from: a */
    private static boolean m10464a(String str, boolean z10) {
        boolean z11;
        try {
            C7779al.m10613a("[Native] Trying to load so: %s", str);
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
            C7779al.m10613a("[Native] Successfully loaded SO: %s", str);
            return true;
        } catch (Throwable th2) {
            z11 = true;
            th = th2;
            C7779al.m10618d(th.getMessage(), new Object[0]);
            C7779al.m10618d("[Native] Failed to load so: %s", str);
            return z11;
        }
    }

    /* renamed from: a */
    private boolean m10462a(int i10, String str) {
        if (!this.f13577j) {
            return false;
        }
        try {
            setNativeInfo(i10, str);
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        } catch (Throwable th) {
            if (!C7779al.m10614a(th)) {
                th.printStackTrace();
            }
            return false;
        }
    }
}
