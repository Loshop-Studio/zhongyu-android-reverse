package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.lang.Thread;

/* renamed from: com.tencent.bugly.proguard.av */
/* loaded from: classes5.dex */
public final class C7789av implements Thread.UncaughtExceptionHandler {

    /* renamed from: h */
    private static String f13849h;

    /* renamed from: i */
    private static final Object f13850i = new Object();

    /* renamed from: a */
    protected final Context f13851a;

    /* renamed from: b */
    protected final C7786as f13852b;

    /* renamed from: c */
    protected final C7770ac f13853c;

    /* renamed from: d */
    protected final C7768aa f13854d;

    /* renamed from: e */
    protected Thread.UncaughtExceptionHandler f13855e;

    /* renamed from: f */
    protected Thread.UncaughtExceptionHandler f13856f;

    /* renamed from: g */
    protected boolean f13857g = false;

    /* renamed from: j */
    private int f13858j;

    public C7789av(Context context, C7786as c7786as, C7770ac c7770ac, C7768aa c7768aa) {
        this.f13851a = context;
        this.f13852b = c7786as;
        this.f13853c = c7770ac;
        this.f13854d = c7768aa;
    }

    /* renamed from: c */
    private static void m10764c() {
        C7779al.m10619e("current process die", new Object[0]);
        Process.killProcess(Process.myPid());
        System.exit(1);
    }

    /* renamed from: a */
    public final synchronized void m10765a() {
        if (this.f13858j >= 10) {
            C7779al.m10613a("java crash handler over %d, no need set.", 10);
            return;
        }
        this.f13857g = true;
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            if (C7789av.class.getName().equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                return;
            }
            if ("com.android.internal.os.RuntimeInit$UncaughtHandler".equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                C7779al.m10613a("backup system java handler: %s", defaultUncaughtExceptionHandler.toString());
                this.f13856f = defaultUncaughtExceptionHandler;
                this.f13855e = defaultUncaughtExceptionHandler;
            } else {
                C7779al.m10613a("backup java handler: %s", defaultUncaughtExceptionHandler.toString());
                this.f13855e = defaultUncaughtExceptionHandler;
            }
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
        this.f13858j++;
        C7779al.m10613a("registered java monitor: %s", toString());
    }

    /* renamed from: b */
    public final synchronized void m10768b() {
        this.f13857g = false;
        C7779al.m10613a("close java monitor!", new Object[0]);
        if ("bugly".equals(Thread.getDefaultUncaughtExceptionHandler().getClass().getName())) {
            C7779al.m10613a("Java monitor to unregister: %s", toString());
            Thread.setDefaultUncaughtExceptionHandler(this.f13855e);
            this.f13858j--;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        synchronized (f13850i) {
            m10767a(thread, th, true, null, null, this.f13854d.f13601Q);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0106  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.tencent.bugly.crashreport.crash.CrashDetailBean m10763b(java.lang.Thread r5, java.lang.Throwable r6, boolean r7, java.lang.String r8, byte[] r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C7789av.m10763b(java.lang.Thread, java.lang.Throwable, boolean, java.lang.String, byte[], boolean):com.tencent.bugly.crashreport.crash.CrashDetailBean");
    }

    /* renamed from: a */
    private static void m10760a(CrashDetailBean crashDetailBean, Throwable th, boolean z10) {
        String strM10759a;
        String name = th.getClass().getName();
        String strM10758a = m10758a(th);
        C7779al.m10619e("stack frame :%d, has cause %b", Integer.valueOf(th.getStackTrace().length), Boolean.valueOf(th.getCause() != null));
        String str = "";
        String string = th.getStackTrace().length > 0 ? th.getStackTrace()[0].toString() : "";
        Throwable cause = th;
        while (cause != null && cause.getCause() != null) {
            cause = cause.getCause();
        }
        if (cause != null && cause != th) {
            crashDetailBean.f13540n = cause.getClass().getName();
            crashDetailBean.f13541o = m10758a(cause);
            if (cause.getStackTrace().length > 0) {
                crashDetailBean.f13542p = cause.getStackTrace()[0].toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(name);
            sb2.append(":");
            sb2.append(strM10758a);
            sb2.append(SignParameters.NEW_LINE);
            sb2.append(string);
            sb2.append("\n......");
            sb2.append("\nCaused by:\n");
            sb2.append(crashDetailBean.f13540n);
            sb2.append(":");
            sb2.append(crashDetailBean.f13541o);
            sb2.append(SignParameters.NEW_LINE);
            strM10759a = m10759a(cause, C7787at.f13803h);
            sb2.append(strM10759a);
            crashDetailBean.f13543q = sb2.toString();
        } else {
            crashDetailBean.f13540n = name;
            if (C7787at.m10736a().m10750i() && z10) {
                C7779al.m10619e("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
                str = " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]";
            }
            crashDetailBean.f13541o = strM10758a + str;
            crashDetailBean.f13542p = string;
            strM10759a = m10759a(th, C7787at.f13803h);
            crashDetailBean.f13543q = strM10759a;
        }
        crashDetailBean.f13547u = C7783ap.m10678c(crashDetailBean.f13543q.getBytes());
        crashDetailBean.f13552z.put(crashDetailBean.f13501B, strM10759a);
    }

    /* renamed from: a */
    private static boolean m10762a(Thread thread) {
        synchronized (f13850i) {
            try {
                if (f13849h != null && thread.getName().equals(f13849h)) {
                    return true;
                }
                f13849h = thread.getName();
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void m10767a(Thread thread, Throwable th, boolean z10, String str, byte[] bArr, boolean z11) {
        if (z10) {
            C7779al.m10619e("Java Crash Happen cause by %s(%d)", thread.getName(), Long.valueOf(thread.getId()));
            if (m10762a(thread)) {
                C7779al.m10613a("this class has handled this exception", new Object[0]);
                if (this.f13856f != null) {
                    C7779al.m10613a("call system handler", new Object[0]);
                    this.f13856f.uncaughtException(thread, th);
                } else {
                    m10764c();
                }
            }
        } else {
            C7779al.m10619e("Java Catch Happen", new Object[0]);
        }
        try {
            if (!this.f13857g) {
                C7779al.m10617c("Java crash handler is disable. Just return.", new Object[0]);
                if (z10) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f13855e;
                    if (uncaughtExceptionHandler != null && m10761a(uncaughtExceptionHandler)) {
                        C7779al.m10619e("sys default last handle start!", new Object[0]);
                        this.f13855e.uncaughtException(thread, th);
                        C7779al.m10619e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f13856f != null) {
                        C7779al.m10619e("system handle start!", new Object[0]);
                        this.f13856f.uncaughtException(thread, th);
                        C7779al.m10619e("system handle end!", new Object[0]);
                        return;
                    } else {
                        C7779al.m10619e("crashreport last handle start!", new Object[0]);
                        m10764c();
                        C7779al.m10619e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            if (!this.f13853c.m10550b()) {
                C7779al.m10618d("no remote but still store!", new Object[0]);
            }
            if (!this.f13853c.m10551c().f13482f && this.f13853c.m10550b()) {
                C7779al.m10619e("crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
                C7786as.m10703a(z10 ? "JAVA_CRASH" : "JAVA_CATCH", C7783ap.m10648a(), this.f13854d.f13637d, thread.getName(), C7783ap.m10654a(th), null);
                if (z10) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f13855e;
                    if (uncaughtExceptionHandler2 != null && m10761a(uncaughtExceptionHandler2)) {
                        C7779al.m10619e("sys default last handle start!", new Object[0]);
                        this.f13855e.uncaughtException(thread, th);
                        C7779al.m10619e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f13856f != null) {
                        C7779al.m10619e("system handle start!", new Object[0]);
                        this.f13856f.uncaughtException(thread, th);
                        C7779al.m10619e("system handle end!", new Object[0]);
                        return;
                    } else {
                        C7779al.m10619e("crashreport last handle start!", new Object[0]);
                        m10764c();
                        C7779al.m10619e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            CrashDetailBean crashDetailBeanM10763b = m10763b(thread, th, z10, str, bArr, z11);
            if (crashDetailBeanM10763b == null) {
                C7779al.m10619e("pkg crash datas fail!", new Object[0]);
                if (z10) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f13855e;
                    if (uncaughtExceptionHandler3 != null && m10761a(uncaughtExceptionHandler3)) {
                        C7779al.m10619e("sys default last handle start!", new Object[0]);
                        this.f13855e.uncaughtException(thread, th);
                        C7779al.m10619e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f13856f != null) {
                        C7779al.m10619e("system handle start!", new Object[0]);
                        this.f13856f.uncaughtException(thread, th);
                        C7779al.m10619e("system handle end!", new Object[0]);
                        return;
                    } else {
                        C7779al.m10619e("crashreport last handle start!", new Object[0]);
                        m10764c();
                        C7779al.m10619e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            C7786as.m10703a(z10 ? "JAVA_CRASH" : "JAVA_CATCH", C7783ap.m10648a(), this.f13854d.f13637d, thread.getName(), C7783ap.m10654a(th), crashDetailBeanM10763b);
            if (!this.f13852b.m10732a(crashDetailBeanM10763b, z10)) {
                this.f13852b.m10734b(crashDetailBeanM10763b, z10);
            }
            if (z10) {
                this.f13852b.m10730a(crashDetailBeanM10763b);
            }
            if (z10) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = this.f13855e;
                if (uncaughtExceptionHandler4 != null && m10761a(uncaughtExceptionHandler4)) {
                    C7779al.m10619e("sys default last handle start!", new Object[0]);
                    this.f13855e.uncaughtException(thread, th);
                    C7779al.m10619e("sys default last handle end!", new Object[0]);
                } else if (this.f13856f != null) {
                    C7779al.m10619e("system handle start!", new Object[0]);
                    this.f13856f.uncaughtException(thread, th);
                    C7779al.m10619e("system handle end!", new Object[0]);
                } else {
                    C7779al.m10619e("crashreport last handle start!", new Object[0]);
                    m10764c();
                    C7779al.m10619e("crashreport last handle end!", new Object[0]);
                }
            }
        } catch (Throwable th2) {
            try {
                if (!C7779al.m10614a(th2)) {
                    th2.printStackTrace();
                }
                if (z10) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = this.f13855e;
                    if (uncaughtExceptionHandler5 != null && m10761a(uncaughtExceptionHandler5)) {
                        C7779al.m10619e("sys default last handle start!", new Object[0]);
                        this.f13855e.uncaughtException(thread, th);
                        C7779al.m10619e("sys default last handle end!", new Object[0]);
                    } else if (this.f13856f != null) {
                        C7779al.m10619e("system handle start!", new Object[0]);
                        this.f13856f.uncaughtException(thread, th);
                        C7779al.m10619e("system handle end!", new Object[0]);
                    } else {
                        C7779al.m10619e("crashreport last handle start!", new Object[0]);
                        m10764c();
                        C7779al.m10619e("crashreport last handle end!", new Object[0]);
                    }
                }
            } catch (Throwable th3) {
                if (z10) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = this.f13855e;
                    if (uncaughtExceptionHandler6 != null && m10761a(uncaughtExceptionHandler6)) {
                        C7779al.m10619e("sys default last handle start!", new Object[0]);
                        this.f13855e.uncaughtException(thread, th);
                        C7779al.m10619e("sys default last handle end!", new Object[0]);
                    } else if (this.f13856f != null) {
                        C7779al.m10619e("system handle start!", new Object[0]);
                        this.f13856f.uncaughtException(thread, th);
                        C7779al.m10619e("system handle end!", new Object[0]);
                    } else {
                        C7779al.m10619e("crashreport last handle start!", new Object[0]);
                        m10764c();
                        C7779al.m10619e("crashreport last handle end!", new Object[0]);
                    }
                }
                throw th3;
            }
        }
    }

    /* renamed from: a */
    private static boolean m10761a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (uncaughtExceptionHandler == null) {
            return true;
        }
        String name = uncaughtExceptionHandler.getClass().getName();
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            if (name.equals(className) && "uncaughtException".equals(methodName)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final synchronized void m10766a(StrategyBean strategyBean) {
        if (strategyBean != null) {
            boolean z10 = strategyBean.f13482f;
            if (z10 != this.f13857g) {
                C7779al.m10613a("java changed to %b", Boolean.valueOf(z10));
                if (strategyBean.f13482f) {
                    m10765a();
                    return;
                }
                m10768b();
            }
        }
    }

    /* renamed from: a */
    private static String m10759a(Throwable th, int i10) {
        if (th == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            if (th.getStackTrace() != null) {
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if (i10 > 0 && sb2.length() >= i10) {
                        sb2.append("\n[Stack over limit size :" + i10 + " , has been cutted !]");
                        return sb2.toString();
                    }
                    sb2.append(stackTraceElement.toString());
                    sb2.append(SignParameters.NEW_LINE);
                }
            }
        } catch (Throwable th2) {
            C7779al.m10619e("gen stack error %s", th2.toString());
        }
        return sb2.toString();
    }

    /* renamed from: a */
    private static String m10758a(Throwable th) {
        String message = th.getMessage();
        if (message == null) {
            return "";
        }
        if (message.length() <= 1000) {
            return message;
        }
        return message.substring(0, 1000) + "\n[Message over limit size:1000, has been cutted!]";
    }
}
