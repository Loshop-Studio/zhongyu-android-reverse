package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.lang.Thread;

/* renamed from: com.tencent.bugly.proguard.av */
/* loaded from: classes3.dex */
public final class C5801av implements Thread.UncaughtExceptionHandler {

    /* renamed from: h */
    private static String f4128h;

    /* renamed from: i */
    private static final Object f4129i = new Object();

    /* renamed from: a */
    protected final Context f4130a;

    /* renamed from: b */
    protected final C5798as f4131b;

    /* renamed from: c */
    protected final C5782ac f4132c;

    /* renamed from: d */
    protected final C5780aa f4133d;

    /* renamed from: e */
    protected Thread.UncaughtExceptionHandler f4134e;

    /* renamed from: f */
    protected Thread.UncaughtExceptionHandler f4135f;

    /* renamed from: g */
    protected boolean f4136g = false;

    /* renamed from: j */
    private int f4137j;

    public C5801av(Context context, C5798as c5798as, C5782ac c5782ac, C5780aa c5780aa) {
        this.f4130a = context;
        this.f4131b = c5798as;
        this.f4132c = c5782ac;
        this.f4133d = c5780aa;
    }

    /* renamed from: c */
    private static void m4079c() {
        C5791al.m3934e("current process die", new Object[0]);
        Process.killProcess(Process.myPid());
        System.exit(1);
    }

    /* renamed from: a */
    public final synchronized void m4080a() {
        if (this.f4137j >= 10) {
            C5791al.m3928a("java crash handler over %d, no need set.", 10);
            return;
        }
        this.f4136g = true;
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            if (C5801av.class.getName().equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                return;
            }
            if ("com.android.internal.os.RuntimeInit$UncaughtHandler".equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                C5791al.m3928a("backup system java handler: %s", defaultUncaughtExceptionHandler.toString());
                this.f4135f = defaultUncaughtExceptionHandler;
                this.f4134e = defaultUncaughtExceptionHandler;
            } else {
                C5791al.m3928a("backup java handler: %s", defaultUncaughtExceptionHandler.toString());
                this.f4134e = defaultUncaughtExceptionHandler;
            }
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
        this.f4137j++;
        C5791al.m3928a("registered java monitor: %s", toString());
    }

    /* renamed from: b */
    public final synchronized void m4083b() {
        this.f4136g = false;
        C5791al.m3928a("close java monitor!", new Object[0]);
        if ("bugly".equals(Thread.getDefaultUncaughtExceptionHandler().getClass().getName())) {
            C5791al.m3928a("Java monitor to unregister: %s", toString());
            Thread.setDefaultUncaughtExceptionHandler(this.f4134e);
            this.f4137j--;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        synchronized (f4129i) {
            m4082a(thread, th, true, null, null, this.f4133d.f3880Q);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0106  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.tencent.bugly.crashreport.crash.CrashDetailBean m4078b(java.lang.Thread r5, java.lang.Throwable r6, boolean r7, java.lang.String r8, byte[] r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C5801av.m4078b(java.lang.Thread, java.lang.Throwable, boolean, java.lang.String, byte[], boolean):com.tencent.bugly.crashreport.crash.CrashDetailBean");
    }

    /* renamed from: a */
    private static void m4075a(CrashDetailBean crashDetailBean, Throwable th, boolean z6) {
        String strM4074a;
        String name = th.getClass().getName();
        String strM4073a = m4073a(th);
        C5791al.m3934e("stack frame :%d, has cause %b", Integer.valueOf(th.getStackTrace().length), Boolean.valueOf(th.getCause() != null));
        String str = "";
        String string = th.getStackTrace().length > 0 ? th.getStackTrace()[0].toString() : "";
        Throwable cause = th;
        while (cause != null && cause.getCause() != null) {
            cause = cause.getCause();
        }
        if (cause != null && cause != th) {
            crashDetailBean.f3819n = cause.getClass().getName();
            crashDetailBean.f3820o = m4073a(cause);
            if (cause.getStackTrace().length > 0) {
                crashDetailBean.f3821p = cause.getStackTrace()[0].toString();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append(":");
            sb.append(strM4073a);
            sb.append(SignParameters.NEW_LINE);
            sb.append(string);
            sb.append("\n......");
            sb.append("\nCaused by:\n");
            sb.append(crashDetailBean.f3819n);
            sb.append(":");
            sb.append(crashDetailBean.f3820o);
            sb.append(SignParameters.NEW_LINE);
            strM4074a = m4074a(cause, C5799at.f4082h);
            sb.append(strM4074a);
            crashDetailBean.f3822q = sb.toString();
        } else {
            crashDetailBean.f3819n = name;
            if (C5799at.m4051a().m4065i() && z6) {
                C5791al.m3934e("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
                str = " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]";
            }
            crashDetailBean.f3820o = strM4073a + str;
            crashDetailBean.f3821p = string;
            strM4074a = m4074a(th, C5799at.f4082h);
            crashDetailBean.f3822q = strM4074a;
        }
        crashDetailBean.f3826u = C5795ap.m3993c(crashDetailBean.f3822q.getBytes());
        crashDetailBean.f3831z.put(crashDetailBean.f3780B, strM4074a);
    }

    /* renamed from: a */
    private static boolean m4077a(Thread thread) {
        synchronized (f4129i) {
            try {
                if (f4128h != null && thread.getName().equals(f4128h)) {
                    return true;
                }
                f4128h = thread.getName();
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void m4082a(Thread thread, Throwable th, boolean z6, String str, byte[] bArr, boolean z7) {
        if (z6) {
            C5791al.m3934e("Java Crash Happen cause by %s(%d)", thread.getName(), Long.valueOf(thread.getId()));
            if (m4077a(thread)) {
                C5791al.m3928a("this class has handled this exception", new Object[0]);
                if (this.f4135f != null) {
                    C5791al.m3928a("call system handler", new Object[0]);
                    this.f4135f.uncaughtException(thread, th);
                } else {
                    m4079c();
                }
            }
        } else {
            C5791al.m3934e("Java Catch Happen", new Object[0]);
        }
        try {
            if (!this.f4136g) {
                C5791al.m3932c("Java crash handler is disable. Just return.", new Object[0]);
                if (z6) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f4134e;
                    if (uncaughtExceptionHandler != null && m4076a(uncaughtExceptionHandler)) {
                        C5791al.m3934e("sys default last handle start!", new Object[0]);
                        this.f4134e.uncaughtException(thread, th);
                        C5791al.m3934e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f4135f != null) {
                        C5791al.m3934e("system handle start!", new Object[0]);
                        this.f4135f.uncaughtException(thread, th);
                        C5791al.m3934e("system handle end!", new Object[0]);
                        return;
                    } else {
                        C5791al.m3934e("crashreport last handle start!", new Object[0]);
                        m4079c();
                        C5791al.m3934e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            if (!this.f4132c.m3865b()) {
                C5791al.m3933d("no remote but still store!", new Object[0]);
            }
            if (!this.f4132c.m3866c().f3761f && this.f4132c.m3865b()) {
                C5791al.m3934e("crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
                C5798as.m4018a(z6 ? "JAVA_CRASH" : "JAVA_CATCH", C5795ap.m3963a(), this.f4133d.f3916d, thread.getName(), C5795ap.m3969a(th), null);
                if (z6) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f4134e;
                    if (uncaughtExceptionHandler2 != null && m4076a(uncaughtExceptionHandler2)) {
                        C5791al.m3934e("sys default last handle start!", new Object[0]);
                        this.f4134e.uncaughtException(thread, th);
                        C5791al.m3934e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f4135f != null) {
                        C5791al.m3934e("system handle start!", new Object[0]);
                        this.f4135f.uncaughtException(thread, th);
                        C5791al.m3934e("system handle end!", new Object[0]);
                        return;
                    } else {
                        C5791al.m3934e("crashreport last handle start!", new Object[0]);
                        m4079c();
                        C5791al.m3934e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            CrashDetailBean crashDetailBeanM4078b = m4078b(thread, th, z6, str, bArr, z7);
            if (crashDetailBeanM4078b == null) {
                C5791al.m3934e("pkg crash datas fail!", new Object[0]);
                if (z6) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f4134e;
                    if (uncaughtExceptionHandler3 != null && m4076a(uncaughtExceptionHandler3)) {
                        C5791al.m3934e("sys default last handle start!", new Object[0]);
                        this.f4134e.uncaughtException(thread, th);
                        C5791al.m3934e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f4135f != null) {
                        C5791al.m3934e("system handle start!", new Object[0]);
                        this.f4135f.uncaughtException(thread, th);
                        C5791al.m3934e("system handle end!", new Object[0]);
                        return;
                    } else {
                        C5791al.m3934e("crashreport last handle start!", new Object[0]);
                        m4079c();
                        C5791al.m3934e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            C5798as.m4018a(z6 ? "JAVA_CRASH" : "JAVA_CATCH", C5795ap.m3963a(), this.f4133d.f3916d, thread.getName(), C5795ap.m3969a(th), crashDetailBeanM4078b);
            if (!this.f4131b.m4047a(crashDetailBeanM4078b, z6)) {
                this.f4131b.m4049b(crashDetailBeanM4078b, z6);
            }
            if (z6) {
                this.f4131b.m4045a(crashDetailBeanM4078b);
            }
            if (z6) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = this.f4134e;
                if (uncaughtExceptionHandler4 != null && m4076a(uncaughtExceptionHandler4)) {
                    C5791al.m3934e("sys default last handle start!", new Object[0]);
                    this.f4134e.uncaughtException(thread, th);
                    C5791al.m3934e("sys default last handle end!", new Object[0]);
                } else if (this.f4135f != null) {
                    C5791al.m3934e("system handle start!", new Object[0]);
                    this.f4135f.uncaughtException(thread, th);
                    C5791al.m3934e("system handle end!", new Object[0]);
                } else {
                    C5791al.m3934e("crashreport last handle start!", new Object[0]);
                    m4079c();
                    C5791al.m3934e("crashreport last handle end!", new Object[0]);
                }
            }
        } catch (Throwable th2) {
            try {
                if (!C5791al.m3929a(th2)) {
                    th2.printStackTrace();
                }
                if (z6) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = this.f4134e;
                    if (uncaughtExceptionHandler5 != null && m4076a(uncaughtExceptionHandler5)) {
                        C5791al.m3934e("sys default last handle start!", new Object[0]);
                        this.f4134e.uncaughtException(thread, th);
                        C5791al.m3934e("sys default last handle end!", new Object[0]);
                    } else if (this.f4135f != null) {
                        C5791al.m3934e("system handle start!", new Object[0]);
                        this.f4135f.uncaughtException(thread, th);
                        C5791al.m3934e("system handle end!", new Object[0]);
                    } else {
                        C5791al.m3934e("crashreport last handle start!", new Object[0]);
                        m4079c();
                        C5791al.m3934e("crashreport last handle end!", new Object[0]);
                    }
                }
            } catch (Throwable th3) {
                if (z6) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = this.f4134e;
                    if (uncaughtExceptionHandler6 != null && m4076a(uncaughtExceptionHandler6)) {
                        C5791al.m3934e("sys default last handle start!", new Object[0]);
                        this.f4134e.uncaughtException(thread, th);
                        C5791al.m3934e("sys default last handle end!", new Object[0]);
                    } else if (this.f4135f != null) {
                        C5791al.m3934e("system handle start!", new Object[0]);
                        this.f4135f.uncaughtException(thread, th);
                        C5791al.m3934e("system handle end!", new Object[0]);
                    } else {
                        C5791al.m3934e("crashreport last handle start!", new Object[0]);
                        m4079c();
                        C5791al.m3934e("crashreport last handle end!", new Object[0]);
                    }
                }
                throw th3;
            }
        }
    }

    /* renamed from: a */
    private static boolean m4076a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
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
    public final synchronized void m4081a(StrategyBean strategyBean) {
        if (strategyBean != null) {
            boolean z6 = strategyBean.f3761f;
            if (z6 != this.f4136g) {
                C5791al.m3928a("java changed to %b", Boolean.valueOf(z6));
                if (strategyBean.f3761f) {
                    m4080a();
                    return;
                }
                m4083b();
            }
        }
    }

    /* renamed from: a */
    private static String m4074a(Throwable th, int i6) {
        if (th == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            if (th.getStackTrace() != null) {
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if (i6 > 0 && sb.length() >= i6) {
                        sb.append("\n[Stack over limit size :" + i6 + " , has been cutted !]");
                        return sb.toString();
                    }
                    sb.append(stackTraceElement.toString());
                    sb.append(SignParameters.NEW_LINE);
                }
            }
        } catch (Throwable th2) {
            C5791al.m3934e("gen stack error %s", th2.toString());
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m4073a(Throwable th) {
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
