package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.lang.Thread;

/* renamed from: com.tencent.bugly.proguard.av */
/* loaded from: classes4.dex */
public final class C6446av implements Thread.UncaughtExceptionHandler {

    /* renamed from: h */
    private static String f4750h;

    /* renamed from: i */
    private static final Object f4751i = new Object();

    /* renamed from: a */
    protected final Context f4752a;

    /* renamed from: b */
    protected final C6443as f4753b;

    /* renamed from: c */
    protected final C6427ac f4754c;

    /* renamed from: d */
    protected final C6425aa f4755d;

    /* renamed from: e */
    protected Thread.UncaughtExceptionHandler f4756e;

    /* renamed from: f */
    protected Thread.UncaughtExceptionHandler f4757f;

    /* renamed from: g */
    protected boolean f4758g = false;

    /* renamed from: j */
    private int f4759j;

    public C6446av(Context context, C6443as c6443as, C6427ac c6427ac, C6425aa c6425aa) {
        this.f4752a = context;
        this.f4753b = c6443as;
        this.f4754c = c6427ac;
        this.f4755d = c6425aa;
    }

    /* renamed from: c */
    private static void m4434c() {
        C6436al.m4289e("current process die", new Object[0]);
        Process.killProcess(Process.myPid());
        System.exit(1);
    }

    /* renamed from: a */
    public final synchronized void m4435a() {
        if (this.f4759j >= 10) {
            C6436al.m4283a("java crash handler over %d, no need set.", 10);
            return;
        }
        this.f4758g = true;
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            if (C6446av.class.getName().equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                return;
            }
            if ("com.android.internal.os.RuntimeInit$UncaughtHandler".equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                C6436al.m4283a("backup system java handler: %s", defaultUncaughtExceptionHandler.toString());
                this.f4757f = defaultUncaughtExceptionHandler;
                this.f4756e = defaultUncaughtExceptionHandler;
            } else {
                C6436al.m4283a("backup java handler: %s", defaultUncaughtExceptionHandler.toString());
                this.f4756e = defaultUncaughtExceptionHandler;
            }
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
        this.f4759j++;
        C6436al.m4283a("registered java monitor: %s", toString());
    }

    /* renamed from: b */
    public final synchronized void m4438b() {
        this.f4758g = false;
        C6436al.m4283a("close java monitor!", new Object[0]);
        if ("bugly".equals(Thread.getDefaultUncaughtExceptionHandler().getClass().getName())) {
            C6436al.m4283a("Java monitor to unregister: %s", toString());
            Thread.setDefaultUncaughtExceptionHandler(this.f4756e);
            this.f4759j--;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        synchronized (f4751i) {
            m4437a(thread, th, true, null, null, this.f4755d.f4502Q);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0106  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.tencent.bugly.crashreport.crash.CrashDetailBean m4433b(java.lang.Thread r5, java.lang.Throwable r6, boolean r7, java.lang.String r8, byte[] r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C6446av.m4433b(java.lang.Thread, java.lang.Throwable, boolean, java.lang.String, byte[], boolean):com.tencent.bugly.crashreport.crash.CrashDetailBean");
    }

    /* renamed from: a */
    private static void m4430a(CrashDetailBean crashDetailBean, Throwable th, boolean z10) {
        String strM4429a;
        String name = th.getClass().getName();
        String strM4428a = m4428a(th);
        C6436al.m4289e("stack frame :%d, has cause %b", Integer.valueOf(th.getStackTrace().length), Boolean.valueOf(th.getCause() != null));
        String str = "";
        String string = th.getStackTrace().length > 0 ? th.getStackTrace()[0].toString() : "";
        Throwable cause = th;
        while (cause != null && cause.getCause() != null) {
            cause = cause.getCause();
        }
        if (cause != null && cause != th) {
            crashDetailBean.f4441n = cause.getClass().getName();
            crashDetailBean.f4442o = m4428a(cause);
            if (cause.getStackTrace().length > 0) {
                crashDetailBean.f4443p = cause.getStackTrace()[0].toString();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append(":");
            sb.append(strM4428a);
            sb.append(SignParameters.NEW_LINE);
            sb.append(string);
            sb.append("\n......");
            sb.append("\nCaused by:\n");
            sb.append(crashDetailBean.f4441n);
            sb.append(":");
            sb.append(crashDetailBean.f4442o);
            sb.append(SignParameters.NEW_LINE);
            strM4429a = m4429a(cause, C6444at.f4704h);
            sb.append(strM4429a);
            crashDetailBean.f4444q = sb.toString();
        } else {
            crashDetailBean.f4441n = name;
            if (C6444at.m4406a().m4420i() && z10) {
                C6436al.m4289e("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
                str = " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]";
            }
            crashDetailBean.f4442o = strM4428a + str;
            crashDetailBean.f4443p = string;
            strM4429a = m4429a(th, C6444at.f4704h);
            crashDetailBean.f4444q = strM4429a;
        }
        crashDetailBean.f4448u = C6440ap.m4348c(crashDetailBean.f4444q.getBytes());
        crashDetailBean.f4453z.put(crashDetailBean.f4402B, strM4429a);
    }

    /* renamed from: a */
    private static boolean m4432a(Thread thread) {
        synchronized (f4751i) {
            try {
                if (f4750h != null && thread.getName().equals(f4750h)) {
                    return true;
                }
                f4750h = thread.getName();
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void m4437a(Thread thread, Throwable th, boolean z10, String str, byte[] bArr, boolean z11) {
        if (z10) {
            C6436al.m4289e("Java Crash Happen cause by %s(%d)", thread.getName(), Long.valueOf(thread.getId()));
            if (m4432a(thread)) {
                C6436al.m4283a("this class has handled this exception", new Object[0]);
                if (this.f4757f != null) {
                    C6436al.m4283a("call system handler", new Object[0]);
                    this.f4757f.uncaughtException(thread, th);
                } else {
                    m4434c();
                }
            }
        } else {
            C6436al.m4289e("Java Catch Happen", new Object[0]);
        }
        try {
            if (!this.f4758g) {
                C6436al.m4287c("Java crash handler is disable. Just return.", new Object[0]);
                if (z10) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f4756e;
                    if (uncaughtExceptionHandler != null && m4431a(uncaughtExceptionHandler)) {
                        C6436al.m4289e("sys default last handle start!", new Object[0]);
                        this.f4756e.uncaughtException(thread, th);
                        C6436al.m4289e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f4757f != null) {
                        C6436al.m4289e("system handle start!", new Object[0]);
                        this.f4757f.uncaughtException(thread, th);
                        C6436al.m4289e("system handle end!", new Object[0]);
                        return;
                    } else {
                        C6436al.m4289e("crashreport last handle start!", new Object[0]);
                        m4434c();
                        C6436al.m4289e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            if (!this.f4754c.m4220b()) {
                C6436al.m4288d("no remote but still store!", new Object[0]);
            }
            if (!this.f4754c.m4221c().f4383f && this.f4754c.m4220b()) {
                C6436al.m4289e("crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
                C6443as.m4373a(z10 ? "JAVA_CRASH" : "JAVA_CATCH", C6440ap.m4318a(), this.f4755d.f4538d, thread.getName(), C6440ap.m4324a(th), null);
                if (z10) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f4756e;
                    if (uncaughtExceptionHandler2 != null && m4431a(uncaughtExceptionHandler2)) {
                        C6436al.m4289e("sys default last handle start!", new Object[0]);
                        this.f4756e.uncaughtException(thread, th);
                        C6436al.m4289e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f4757f != null) {
                        C6436al.m4289e("system handle start!", new Object[0]);
                        this.f4757f.uncaughtException(thread, th);
                        C6436al.m4289e("system handle end!", new Object[0]);
                        return;
                    } else {
                        C6436al.m4289e("crashreport last handle start!", new Object[0]);
                        m4434c();
                        C6436al.m4289e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            CrashDetailBean crashDetailBeanM4433b = m4433b(thread, th, z10, str, bArr, z11);
            if (crashDetailBeanM4433b == null) {
                C6436al.m4289e("pkg crash datas fail!", new Object[0]);
                if (z10) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f4756e;
                    if (uncaughtExceptionHandler3 != null && m4431a(uncaughtExceptionHandler3)) {
                        C6436al.m4289e("sys default last handle start!", new Object[0]);
                        this.f4756e.uncaughtException(thread, th);
                        C6436al.m4289e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f4757f != null) {
                        C6436al.m4289e("system handle start!", new Object[0]);
                        this.f4757f.uncaughtException(thread, th);
                        C6436al.m4289e("system handle end!", new Object[0]);
                        return;
                    } else {
                        C6436al.m4289e("crashreport last handle start!", new Object[0]);
                        m4434c();
                        C6436al.m4289e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            C6443as.m4373a(z10 ? "JAVA_CRASH" : "JAVA_CATCH", C6440ap.m4318a(), this.f4755d.f4538d, thread.getName(), C6440ap.m4324a(th), crashDetailBeanM4433b);
            if (!this.f4753b.m4402a(crashDetailBeanM4433b, z10)) {
                this.f4753b.m4404b(crashDetailBeanM4433b, z10);
            }
            if (z10) {
                this.f4753b.m4400a(crashDetailBeanM4433b);
            }
            if (z10) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = this.f4756e;
                if (uncaughtExceptionHandler4 != null && m4431a(uncaughtExceptionHandler4)) {
                    C6436al.m4289e("sys default last handle start!", new Object[0]);
                    this.f4756e.uncaughtException(thread, th);
                    C6436al.m4289e("sys default last handle end!", new Object[0]);
                } else if (this.f4757f != null) {
                    C6436al.m4289e("system handle start!", new Object[0]);
                    this.f4757f.uncaughtException(thread, th);
                    C6436al.m4289e("system handle end!", new Object[0]);
                } else {
                    C6436al.m4289e("crashreport last handle start!", new Object[0]);
                    m4434c();
                    C6436al.m4289e("crashreport last handle end!", new Object[0]);
                }
            }
        } catch (Throwable th2) {
            try {
                if (!C6436al.m4284a(th2)) {
                    th2.printStackTrace();
                }
                if (z10) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = this.f4756e;
                    if (uncaughtExceptionHandler5 != null && m4431a(uncaughtExceptionHandler5)) {
                        C6436al.m4289e("sys default last handle start!", new Object[0]);
                        this.f4756e.uncaughtException(thread, th);
                        C6436al.m4289e("sys default last handle end!", new Object[0]);
                    } else if (this.f4757f != null) {
                        C6436al.m4289e("system handle start!", new Object[0]);
                        this.f4757f.uncaughtException(thread, th);
                        C6436al.m4289e("system handle end!", new Object[0]);
                    } else {
                        C6436al.m4289e("crashreport last handle start!", new Object[0]);
                        m4434c();
                        C6436al.m4289e("crashreport last handle end!", new Object[0]);
                    }
                }
            } catch (Throwable th3) {
                if (z10) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = this.f4756e;
                    if (uncaughtExceptionHandler6 != null && m4431a(uncaughtExceptionHandler6)) {
                        C6436al.m4289e("sys default last handle start!", new Object[0]);
                        this.f4756e.uncaughtException(thread, th);
                        C6436al.m4289e("sys default last handle end!", new Object[0]);
                    } else if (this.f4757f != null) {
                        C6436al.m4289e("system handle start!", new Object[0]);
                        this.f4757f.uncaughtException(thread, th);
                        C6436al.m4289e("system handle end!", new Object[0]);
                    } else {
                        C6436al.m4289e("crashreport last handle start!", new Object[0]);
                        m4434c();
                        C6436al.m4289e("crashreport last handle end!", new Object[0]);
                    }
                }
                throw th3;
            }
        }
    }

    /* renamed from: a */
    private static boolean m4431a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
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
    public final synchronized void m4436a(StrategyBean strategyBean) {
        if (strategyBean != null) {
            boolean z10 = strategyBean.f4383f;
            if (z10 != this.f4758g) {
                C6436al.m4283a("java changed to %b", Boolean.valueOf(z10));
                if (strategyBean.f4383f) {
                    m4435a();
                    return;
                }
                m4438b();
            }
        }
    }

    /* renamed from: a */
    private static String m4429a(Throwable th, int i10) {
        if (th == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            if (th.getStackTrace() != null) {
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if (i10 > 0 && sb.length() >= i10) {
                        sb.append("\n[Stack over limit size :" + i10 + " , has been cutted !]");
                        return sb.toString();
                    }
                    sb.append(stackTraceElement.toString());
                    sb.append(SignParameters.NEW_LINE);
                }
            }
        } catch (Throwable th2) {
            C6436al.m4289e("gen stack error %s", th2.toString());
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m4428a(Throwable th) {
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
