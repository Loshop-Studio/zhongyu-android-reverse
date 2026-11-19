package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.lang.Thread;

/* renamed from: com.tencent.bugly.proguard.av */
/* loaded from: classes4.dex */
public final class C6424av implements Thread.UncaughtExceptionHandler {

    /* renamed from: h */
    private static String f5407h;

    /* renamed from: i */
    private static final Object f5408i = new Object();

    /* renamed from: a */
    protected final Context f5409a;

    /* renamed from: b */
    protected final C6421as f5410b;

    /* renamed from: c */
    protected final C6405ac f5411c;

    /* renamed from: d */
    protected final C6403aa f5412d;

    /* renamed from: e */
    protected Thread.UncaughtExceptionHandler f5413e;

    /* renamed from: f */
    protected Thread.UncaughtExceptionHandler f5414f;

    /* renamed from: g */
    protected boolean f5415g = false;

    /* renamed from: j */
    private int f5416j;

    public C6424av(Context context, C6421as c6421as, C6405ac c6405ac, C6403aa c6403aa) {
        this.f5409a = context;
        this.f5410b = c6421as;
        this.f5411c = c6405ac;
        this.f5412d = c6403aa;
    }

    /* renamed from: c */
    private static void m5074c() {
        C6414al.m4929e("current process die", new Object[0]);
        Process.killProcess(Process.myPid());
        System.exit(1);
    }

    /* renamed from: a */
    public final synchronized void m5075a() {
        if (this.f5416j >= 10) {
            C6414al.m4923a("java crash handler over %d, no need set.", 10);
            return;
        }
        this.f5415g = true;
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            if (C6424av.class.getName().equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                return;
            }
            if ("com.android.internal.os.RuntimeInit$UncaughtHandler".equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                C6414al.m4923a("backup system java handler: %s", defaultUncaughtExceptionHandler.toString());
                this.f5414f = defaultUncaughtExceptionHandler;
                this.f5413e = defaultUncaughtExceptionHandler;
            } else {
                C6414al.m4923a("backup java handler: %s", defaultUncaughtExceptionHandler.toString());
                this.f5413e = defaultUncaughtExceptionHandler;
            }
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
        this.f5416j++;
        C6414al.m4923a("registered java monitor: %s", toString());
    }

    /* renamed from: b */
    public final synchronized void m5078b() {
        this.f5415g = false;
        C6414al.m4923a("close java monitor!", new Object[0]);
        if ("bugly".equals(Thread.getDefaultUncaughtExceptionHandler().getClass().getName())) {
            C6414al.m4923a("Java monitor to unregister: %s", toString());
            Thread.setDefaultUncaughtExceptionHandler(this.f5413e);
            this.f5416j--;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        synchronized (f5408i) {
            m5077a(thread, th, true, null, null, this.f5412d.f5159Q);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0106  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.tencent.bugly.crashreport.crash.CrashDetailBean m5073b(java.lang.Thread r5, java.lang.Throwable r6, boolean r7, java.lang.String r8, byte[] r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C6424av.m5073b(java.lang.Thread, java.lang.Throwable, boolean, java.lang.String, byte[], boolean):com.tencent.bugly.crashreport.crash.CrashDetailBean");
    }

    /* renamed from: a */
    private static void m5070a(CrashDetailBean crashDetailBean, Throwable th, boolean z9) {
        String strM5069a;
        String name = th.getClass().getName();
        String strM5068a = m5068a(th);
        C6414al.m4929e("stack frame :%d, has cause %b", Integer.valueOf(th.getStackTrace().length), Boolean.valueOf(th.getCause() != null));
        String str = "";
        String string = th.getStackTrace().length > 0 ? th.getStackTrace()[0].toString() : "";
        Throwable cause = th;
        while (cause != null && cause.getCause() != null) {
            cause = cause.getCause();
        }
        if (cause != null && cause != th) {
            crashDetailBean.f5098n = cause.getClass().getName();
            crashDetailBean.f5099o = m5068a(cause);
            if (cause.getStackTrace().length > 0) {
                crashDetailBean.f5100p = cause.getStackTrace()[0].toString();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append(":");
            sb.append(strM5068a);
            sb.append(SignParameters.NEW_LINE);
            sb.append(string);
            sb.append("\n......");
            sb.append("\nCaused by:\n");
            sb.append(crashDetailBean.f5098n);
            sb.append(":");
            sb.append(crashDetailBean.f5099o);
            sb.append(SignParameters.NEW_LINE);
            strM5069a = m5069a(cause, C6422at.f5361h);
            sb.append(strM5069a);
            crashDetailBean.f5101q = sb.toString();
        } else {
            crashDetailBean.f5098n = name;
            if (C6422at.m5046a().m5060i() && z9) {
                C6414al.m4929e("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
                str = " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]";
            }
            crashDetailBean.f5099o = strM5068a + str;
            crashDetailBean.f5100p = string;
            strM5069a = m5069a(th, C6422at.f5361h);
            crashDetailBean.f5101q = strM5069a;
        }
        crashDetailBean.f5105u = C6418ap.m4988c(crashDetailBean.f5101q.getBytes());
        crashDetailBean.f5110z.put(crashDetailBean.f5059B, strM5069a);
    }

    /* renamed from: a */
    private static boolean m5072a(Thread thread) {
        synchronized (f5408i) {
            try {
                if (f5407h != null && thread.getName().equals(f5407h)) {
                    return true;
                }
                f5407h = thread.getName();
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void m5077a(Thread thread, Throwable th, boolean z9, String str, byte[] bArr, boolean z10) {
        if (z9) {
            C6414al.m4929e("Java Crash Happen cause by %s(%d)", thread.getName(), Long.valueOf(thread.getId()));
            if (m5072a(thread)) {
                C6414al.m4923a("this class has handled this exception", new Object[0]);
                if (this.f5414f != null) {
                    C6414al.m4923a("call system handler", new Object[0]);
                    this.f5414f.uncaughtException(thread, th);
                } else {
                    m5074c();
                }
            }
        } else {
            C6414al.m4929e("Java Catch Happen", new Object[0]);
        }
        try {
            if (!this.f5415g) {
                C6414al.m4927c("Java crash handler is disable. Just return.", new Object[0]);
                if (z9) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f5413e;
                    if (uncaughtExceptionHandler != null && m5071a(uncaughtExceptionHandler)) {
                        C6414al.m4929e("sys default last handle start!", new Object[0]);
                        this.f5413e.uncaughtException(thread, th);
                        C6414al.m4929e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f5414f != null) {
                        C6414al.m4929e("system handle start!", new Object[0]);
                        this.f5414f.uncaughtException(thread, th);
                        C6414al.m4929e("system handle end!", new Object[0]);
                        return;
                    } else {
                        C6414al.m4929e("crashreport last handle start!", new Object[0]);
                        m5074c();
                        C6414al.m4929e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            if (!this.f5411c.m4860b()) {
                C6414al.m4928d("no remote but still store!", new Object[0]);
            }
            if (!this.f5411c.m4861c().f5040f && this.f5411c.m4860b()) {
                C6414al.m4929e("crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
                C6421as.m5013a(z9 ? "JAVA_CRASH" : "JAVA_CATCH", C6418ap.m4958a(), this.f5412d.f5195d, thread.getName(), C6418ap.m4964a(th), null);
                if (z9) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f5413e;
                    if (uncaughtExceptionHandler2 != null && m5071a(uncaughtExceptionHandler2)) {
                        C6414al.m4929e("sys default last handle start!", new Object[0]);
                        this.f5413e.uncaughtException(thread, th);
                        C6414al.m4929e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f5414f != null) {
                        C6414al.m4929e("system handle start!", new Object[0]);
                        this.f5414f.uncaughtException(thread, th);
                        C6414al.m4929e("system handle end!", new Object[0]);
                        return;
                    } else {
                        C6414al.m4929e("crashreport last handle start!", new Object[0]);
                        m5074c();
                        C6414al.m4929e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            CrashDetailBean crashDetailBeanM5073b = m5073b(thread, th, z9, str, bArr, z10);
            if (crashDetailBeanM5073b == null) {
                C6414al.m4929e("pkg crash datas fail!", new Object[0]);
                if (z9) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f5413e;
                    if (uncaughtExceptionHandler3 != null && m5071a(uncaughtExceptionHandler3)) {
                        C6414al.m4929e("sys default last handle start!", new Object[0]);
                        this.f5413e.uncaughtException(thread, th);
                        C6414al.m4929e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f5414f != null) {
                        C6414al.m4929e("system handle start!", new Object[0]);
                        this.f5414f.uncaughtException(thread, th);
                        C6414al.m4929e("system handle end!", new Object[0]);
                        return;
                    } else {
                        C6414al.m4929e("crashreport last handle start!", new Object[0]);
                        m5074c();
                        C6414al.m4929e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            C6421as.m5013a(z9 ? "JAVA_CRASH" : "JAVA_CATCH", C6418ap.m4958a(), this.f5412d.f5195d, thread.getName(), C6418ap.m4964a(th), crashDetailBeanM5073b);
            if (!this.f5410b.m5042a(crashDetailBeanM5073b, z9)) {
                this.f5410b.m5044b(crashDetailBeanM5073b, z9);
            }
            if (z9) {
                this.f5410b.m5040a(crashDetailBeanM5073b);
            }
            if (z9) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = this.f5413e;
                if (uncaughtExceptionHandler4 != null && m5071a(uncaughtExceptionHandler4)) {
                    C6414al.m4929e("sys default last handle start!", new Object[0]);
                    this.f5413e.uncaughtException(thread, th);
                    C6414al.m4929e("sys default last handle end!", new Object[0]);
                } else if (this.f5414f != null) {
                    C6414al.m4929e("system handle start!", new Object[0]);
                    this.f5414f.uncaughtException(thread, th);
                    C6414al.m4929e("system handle end!", new Object[0]);
                } else {
                    C6414al.m4929e("crashreport last handle start!", new Object[0]);
                    m5074c();
                    C6414al.m4929e("crashreport last handle end!", new Object[0]);
                }
            }
        } catch (Throwable th2) {
            try {
                if (!C6414al.m4924a(th2)) {
                    th2.printStackTrace();
                }
                if (z9) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = this.f5413e;
                    if (uncaughtExceptionHandler5 != null && m5071a(uncaughtExceptionHandler5)) {
                        C6414al.m4929e("sys default last handle start!", new Object[0]);
                        this.f5413e.uncaughtException(thread, th);
                        C6414al.m4929e("sys default last handle end!", new Object[0]);
                    } else if (this.f5414f != null) {
                        C6414al.m4929e("system handle start!", new Object[0]);
                        this.f5414f.uncaughtException(thread, th);
                        C6414al.m4929e("system handle end!", new Object[0]);
                    } else {
                        C6414al.m4929e("crashreport last handle start!", new Object[0]);
                        m5074c();
                        C6414al.m4929e("crashreport last handle end!", new Object[0]);
                    }
                }
            } catch (Throwable th3) {
                if (z9) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = this.f5413e;
                    if (uncaughtExceptionHandler6 != null && m5071a(uncaughtExceptionHandler6)) {
                        C6414al.m4929e("sys default last handle start!", new Object[0]);
                        this.f5413e.uncaughtException(thread, th);
                        C6414al.m4929e("sys default last handle end!", new Object[0]);
                    } else if (this.f5414f != null) {
                        C6414al.m4929e("system handle start!", new Object[0]);
                        this.f5414f.uncaughtException(thread, th);
                        C6414al.m4929e("system handle end!", new Object[0]);
                    } else {
                        C6414al.m4929e("crashreport last handle start!", new Object[0]);
                        m5074c();
                        C6414al.m4929e("crashreport last handle end!", new Object[0]);
                    }
                }
                throw th3;
            }
        }
    }

    /* renamed from: a */
    private static boolean m5071a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
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
    public final synchronized void m5076a(StrategyBean strategyBean) {
        if (strategyBean != null) {
            boolean z9 = strategyBean.f5040f;
            if (z9 != this.f5415g) {
                C6414al.m4923a("java changed to %b", Boolean.valueOf(z9));
                if (strategyBean.f5040f) {
                    m5075a();
                    return;
                }
                m5078b();
            }
        }
    }

    /* renamed from: a */
    private static String m5069a(Throwable th, int i10) {
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
            C6414al.m4929e("gen stack error %s", th2.toString());
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m5068a(Throwable th) {
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
