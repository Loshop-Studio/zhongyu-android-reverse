package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import android.support.v4.media.AbstractC0037f;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.lang.Thread;

/* renamed from: com.tencent.bugly.proguard.av */
/* loaded from: classes3.dex */
public final class C4065av implements Thread.UncaughtExceptionHandler {

    /* renamed from: h */
    private static String f3613h;

    /* renamed from: i */
    private static final Object f3614i = new Object();

    /* renamed from: a */
    protected final Context f3615a;

    /* renamed from: b */
    protected final C4062as f3616b;

    /* renamed from: c */
    protected final C4046ac f3617c;

    /* renamed from: d */
    protected final C4044aa f3618d;

    /* renamed from: e */
    protected Thread.UncaughtExceptionHandler f3619e;

    /* renamed from: f */
    protected Thread.UncaughtExceptionHandler f3620f;

    /* renamed from: g */
    protected boolean f3621g = false;

    /* renamed from: j */
    private int f3622j;

    public C4065av(Context context, C4062as c4062as, C4046ac c4046ac, C4044aa c4044aa) {
        this.f3615a = context;
        this.f3616b = c4062as;
        this.f3617c = c4046ac;
        this.f3618d = c4044aa;
    }

    /* renamed from: c */
    private static void m3171c() {
        C4055al.m3027e("current process die", new Object[0]);
        Process.killProcess(Process.myPid());
        System.exit(1);
    }

    /* renamed from: a */
    public final synchronized void m3172a() {
        if (this.f3622j >= 10) {
            C4055al.m3021a("java crash handler over %d, no need set.", 10);
            return;
        }
        this.f3621g = true;
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            if (C4065av.class.getName().equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                return;
            }
            if ("com.android.internal.os.RuntimeInit$UncaughtHandler".equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                C4055al.m3021a("backup system java handler: %s", defaultUncaughtExceptionHandler.toString());
                this.f3620f = defaultUncaughtExceptionHandler;
                this.f3619e = defaultUncaughtExceptionHandler;
            } else {
                C4055al.m3021a("backup java handler: %s", defaultUncaughtExceptionHandler.toString());
                this.f3619e = defaultUncaughtExceptionHandler;
            }
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
        this.f3622j++;
        C4055al.m3021a("registered java monitor: %s", toString());
    }

    /* renamed from: b */
    public final synchronized void m3175b() {
        this.f3621g = false;
        C4055al.m3021a("close java monitor!", new Object[0]);
        if ("bugly".equals(Thread.getDefaultUncaughtExceptionHandler().getClass().getName())) {
            C4055al.m3021a("Java monitor to unregister: %s", toString());
            Thread.setDefaultUncaughtExceptionHandler(this.f3619e);
            this.f3622j--;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        synchronized (f3614i) {
            m3174a(thread, th, true, null, null, this.f3618d.f3398Q);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0106  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.tencent.bugly.crashreport.crash.CrashDetailBean m3170b(java.lang.Thread r5, java.lang.Throwable r6, boolean r7, java.lang.String r8, byte[] r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C4065av.m3170b(java.lang.Thread, java.lang.Throwable, boolean, java.lang.String, byte[], boolean):com.tencent.bugly.crashreport.crash.CrashDetailBean");
    }

    /* renamed from: a */
    private static void m3167a(CrashDetailBean crashDetailBean, Throwable th, boolean z8) {
        String strM3166a;
        String name = th.getClass().getName();
        String strM3165a = m3165a(th);
        C4055al.m3027e("stack frame :%d, has cause %b", Integer.valueOf(th.getStackTrace().length), Boolean.valueOf(th.getCause() != null));
        String str = "";
        String string = th.getStackTrace().length > 0 ? th.getStackTrace()[0].toString() : "";
        Throwable cause = th;
        while (cause != null && cause.getCause() != null) {
            cause = cause.getCause();
        }
        if (cause != null && cause != th) {
            crashDetailBean.f3332n = cause.getClass().getName();
            crashDetailBean.f3333o = m3165a(cause);
            if (cause.getStackTrace().length > 0) {
                crashDetailBean.f3334p = cause.getStackTrace()[0].toString();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append(":");
            sb.append(strM3165a);
            sb.append(SignParameters.NEW_LINE);
            sb.append(string);
            sb.append("\n......\nCaused by:\n");
            sb.append(crashDetailBean.f3332n);
            sb.append(":");
            sb.append(crashDetailBean.f3333o);
            sb.append(SignParameters.NEW_LINE);
            strM3166a = m3166a(cause, C4063at.f3577h);
            sb.append(strM3166a);
            crashDetailBean.f3335q = sb.toString();
        } else {
            crashDetailBean.f3332n = name;
            if (C4063at.m3143a().m3157i() && z8) {
                C4055al.m3027e("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
                str = " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]";
            }
            crashDetailBean.f3333o = AbstractC0037f.m74C(strM3165a, str);
            crashDetailBean.f3334p = string;
            strM3166a = m3166a(th, C4063at.f3577h);
            crashDetailBean.f3335q = strM3166a;
        }
        crashDetailBean.f3339u = C4059ap.m3086c(crashDetailBean.f3335q.getBytes());
        crashDetailBean.f3344z.put(crashDetailBean.f3293B, strM3166a);
    }

    /* renamed from: a */
    private static boolean m3169a(Thread thread) {
        synchronized (f3614i) {
            try {
                if (f3613h != null && thread.getName().equals(f3613h)) {
                    return true;
                }
                f3613h = thread.getName();
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void m3174a(Thread thread, Throwable th, boolean z8, String str, byte[] bArr, boolean z9) {
        if (z8) {
            C4055al.m3027e("Java Crash Happen cause by %s(%d)", thread.getName(), Long.valueOf(thread.getId()));
            if (m3169a(thread)) {
                C4055al.m3021a("this class has handled this exception", new Object[0]);
                if (this.f3620f != null) {
                    C4055al.m3021a("call system handler", new Object[0]);
                    this.f3620f.uncaughtException(thread, th);
                } else {
                    m3171c();
                }
            }
        } else {
            C4055al.m3027e("Java Catch Happen", new Object[0]);
        }
        try {
            if (!this.f3621g) {
                C4055al.m3025c("Java crash handler is disable. Just return.", new Object[0]);
                if (z8) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f3619e;
                    if (uncaughtExceptionHandler != null && m3168a(uncaughtExceptionHandler)) {
                        C4055al.m3027e("sys default last handle start!", new Object[0]);
                        this.f3619e.uncaughtException(thread, th);
                        C4055al.m3027e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f3620f != null) {
                        C4055al.m3027e("system handle start!", new Object[0]);
                        this.f3620f.uncaughtException(thread, th);
                        C4055al.m3027e("system handle end!", new Object[0]);
                        return;
                    } else {
                        C4055al.m3027e("crashreport last handle start!", new Object[0]);
                        m3171c();
                        C4055al.m3027e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            if (!this.f3617c.m2959b()) {
                C4055al.m3026d("no remote but still store!", new Object[0]);
            }
            if (!this.f3617c.m2960c().f3274f && this.f3617c.m2959b()) {
                C4055al.m3027e("crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
                C4062as.m3111a(z8 ? "JAVA_CRASH" : "JAVA_CATCH", C4059ap.m3056a(), this.f3618d.f3434d, thread.getName(), C4059ap.m3062a(th), null);
                if (z8) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f3619e;
                    if (uncaughtExceptionHandler2 != null && m3168a(uncaughtExceptionHandler2)) {
                        C4055al.m3027e("sys default last handle start!", new Object[0]);
                        this.f3619e.uncaughtException(thread, th);
                        C4055al.m3027e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f3620f != null) {
                        C4055al.m3027e("system handle start!", new Object[0]);
                        this.f3620f.uncaughtException(thread, th);
                        C4055al.m3027e("system handle end!", new Object[0]);
                        return;
                    } else {
                        C4055al.m3027e("crashreport last handle start!", new Object[0]);
                        m3171c();
                        C4055al.m3027e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            CrashDetailBean crashDetailBeanM3170b = m3170b(thread, th, z8, str, bArr, z9);
            if (crashDetailBeanM3170b == null) {
                C4055al.m3027e("pkg crash datas fail!", new Object[0]);
                if (z8) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f3619e;
                    if (uncaughtExceptionHandler3 != null && m3168a(uncaughtExceptionHandler3)) {
                        C4055al.m3027e("sys default last handle start!", new Object[0]);
                        this.f3619e.uncaughtException(thread, th);
                        C4055al.m3027e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f3620f != null) {
                        C4055al.m3027e("system handle start!", new Object[0]);
                        this.f3620f.uncaughtException(thread, th);
                        C4055al.m3027e("system handle end!", new Object[0]);
                        return;
                    } else {
                        C4055al.m3027e("crashreport last handle start!", new Object[0]);
                        m3171c();
                        C4055al.m3027e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            C4062as.m3111a(z8 ? "JAVA_CRASH" : "JAVA_CATCH", C4059ap.m3056a(), this.f3618d.f3434d, thread.getName(), C4059ap.m3062a(th), crashDetailBeanM3170b);
            if (!this.f3616b.m3140a(crashDetailBeanM3170b, z8)) {
                this.f3616b.m3142b(crashDetailBeanM3170b, z8);
            }
            if (z8) {
                this.f3616b.m3138a(crashDetailBeanM3170b);
            }
            if (z8) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = this.f3619e;
                if (uncaughtExceptionHandler4 != null && m3168a(uncaughtExceptionHandler4)) {
                    C4055al.m3027e("sys default last handle start!", new Object[0]);
                    this.f3619e.uncaughtException(thread, th);
                    C4055al.m3027e("sys default last handle end!", new Object[0]);
                } else if (this.f3620f != null) {
                    C4055al.m3027e("system handle start!", new Object[0]);
                    this.f3620f.uncaughtException(thread, th);
                    C4055al.m3027e("system handle end!", new Object[0]);
                } else {
                    C4055al.m3027e("crashreport last handle start!", new Object[0]);
                    m3171c();
                    C4055al.m3027e("crashreport last handle end!", new Object[0]);
                }
            }
        } catch (Throwable th2) {
            try {
                if (!C4055al.m3022a(th2)) {
                    th2.printStackTrace();
                }
                if (z8) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = this.f3619e;
                    if (uncaughtExceptionHandler5 != null && m3168a(uncaughtExceptionHandler5)) {
                        C4055al.m3027e("sys default last handle start!", new Object[0]);
                        this.f3619e.uncaughtException(thread, th);
                        C4055al.m3027e("sys default last handle end!", new Object[0]);
                    } else if (this.f3620f != null) {
                        C4055al.m3027e("system handle start!", new Object[0]);
                        this.f3620f.uncaughtException(thread, th);
                        C4055al.m3027e("system handle end!", new Object[0]);
                    } else {
                        C4055al.m3027e("crashreport last handle start!", new Object[0]);
                        m3171c();
                        C4055al.m3027e("crashreport last handle end!", new Object[0]);
                    }
                }
            } catch (Throwable th3) {
                if (z8) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = this.f3619e;
                    if (uncaughtExceptionHandler6 != null && m3168a(uncaughtExceptionHandler6)) {
                        C4055al.m3027e("sys default last handle start!", new Object[0]);
                        this.f3619e.uncaughtException(thread, th);
                        C4055al.m3027e("sys default last handle end!", new Object[0]);
                    } else if (this.f3620f != null) {
                        C4055al.m3027e("system handle start!", new Object[0]);
                        this.f3620f.uncaughtException(thread, th);
                        C4055al.m3027e("system handle end!", new Object[0]);
                    } else {
                        C4055al.m3027e("crashreport last handle start!", new Object[0]);
                        m3171c();
                        C4055al.m3027e("crashreport last handle end!", new Object[0]);
                    }
                }
                throw th3;
            }
        }
    }

    /* renamed from: a */
    private static boolean m3168a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
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
    public final synchronized void m3173a(StrategyBean strategyBean) {
        if (strategyBean != null) {
            boolean z8 = strategyBean.f3274f;
            if (z8 != this.f3621g) {
                C4055al.m3021a("java changed to %b", Boolean.valueOf(z8));
                if (strategyBean.f3274f) {
                    m3172a();
                    return;
                }
                m3175b();
            }
        }
    }

    /* renamed from: a */
    private static String m3166a(Throwable th, int i) {
        if (th == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            if (th.getStackTrace() != null) {
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if (i > 0 && sb.length() >= i) {
                        sb.append("\n[Stack over limit size :" + i + " , has been cutted !]");
                        return sb.toString();
                    }
                    sb.append(stackTraceElement.toString());
                    sb.append(SignParameters.NEW_LINE);
                }
            }
        } catch (Throwable th2) {
            C4055al.m3027e("gen stack error %s", th2.toString());
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m3165a(Throwable th) {
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
