package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.lang.Thread;

/* renamed from: com.tencent.bugly.proguard.av */
/* loaded from: classes4.dex */
public final class C6684av implements Thread.UncaughtExceptionHandler {

    /* renamed from: h */
    private static String f5984h;

    /* renamed from: i */
    private static final Object f5985i = new Object();

    /* renamed from: a */
    protected final Context f5986a;

    /* renamed from: b */
    protected final C6681as f5987b;

    /* renamed from: c */
    protected final C6665ac f5988c;

    /* renamed from: d */
    protected final C6663aa f5989d;

    /* renamed from: e */
    protected Thread.UncaughtExceptionHandler f5990e;

    /* renamed from: f */
    protected Thread.UncaughtExceptionHandler f5991f;

    /* renamed from: g */
    protected boolean f5992g = false;

    /* renamed from: j */
    private int f5993j;

    public C6684av(Context context, C6681as c6681as, C6665ac c6665ac, C6663aa c6663aa) {
        this.f5986a = context;
        this.f5987b = c6681as;
        this.f5988c = c6665ac;
        this.f5989d = c6663aa;
    }

    /* renamed from: c */
    private static void m5253c() {
        C6674al.m5108e("current process die", new Object[0]);
        Process.killProcess(Process.myPid());
        System.exit(1);
    }

    /* renamed from: a */
    public final synchronized void m5254a() {
        if (this.f5993j >= 10) {
            C6674al.m5102a("java crash handler over %d, no need set.", 10);
            return;
        }
        this.f5992g = true;
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            if (C6684av.class.getName().equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                return;
            }
            if ("com.android.internal.os.RuntimeInit$UncaughtHandler".equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                C6674al.m5102a("backup system java handler: %s", defaultUncaughtExceptionHandler.toString());
                this.f5991f = defaultUncaughtExceptionHandler;
                this.f5990e = defaultUncaughtExceptionHandler;
            } else {
                C6674al.m5102a("backup java handler: %s", defaultUncaughtExceptionHandler.toString());
                this.f5990e = defaultUncaughtExceptionHandler;
            }
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
        this.f5993j++;
        C6674al.m5102a("registered java monitor: %s", toString());
    }

    /* renamed from: b */
    public final synchronized void m5257b() {
        this.f5992g = false;
        C6674al.m5102a("close java monitor!", new Object[0]);
        if ("bugly".equals(Thread.getDefaultUncaughtExceptionHandler().getClass().getName())) {
            C6674al.m5102a("Java monitor to unregister: %s", toString());
            Thread.setDefaultUncaughtExceptionHandler(this.f5990e);
            this.f5993j--;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        synchronized (f5985i) {
            m5256a(thread, th, true, null, null, this.f5989d.f5736Q);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0106  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.tencent.bugly.crashreport.crash.CrashDetailBean m5252b(java.lang.Thread r5, java.lang.Throwable r6, boolean r7, java.lang.String r8, byte[] r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C6684av.m5252b(java.lang.Thread, java.lang.Throwable, boolean, java.lang.String, byte[], boolean):com.tencent.bugly.crashreport.crash.CrashDetailBean");
    }

    /* renamed from: a */
    private static void m5249a(CrashDetailBean crashDetailBean, Throwable th, boolean z9) {
        String strM5248a;
        String name = th.getClass().getName();
        String strM5247a = m5247a(th);
        C6674al.m5108e("stack frame :%d, has cause %b", Integer.valueOf(th.getStackTrace().length), Boolean.valueOf(th.getCause() != null));
        String str = "";
        String string = th.getStackTrace().length > 0 ? th.getStackTrace()[0].toString() : "";
        Throwable cause = th;
        while (cause != null && cause.getCause() != null) {
            cause = cause.getCause();
        }
        if (cause != null && cause != th) {
            crashDetailBean.f5675n = cause.getClass().getName();
            crashDetailBean.f5676o = m5247a(cause);
            if (cause.getStackTrace().length > 0) {
                crashDetailBean.f5677p = cause.getStackTrace()[0].toString();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append(":");
            sb.append(strM5247a);
            sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
            sb.append(string);
            sb.append("\n......");
            sb.append("\nCaused by:\n");
            sb.append(crashDetailBean.f5675n);
            sb.append(":");
            sb.append(crashDetailBean.f5676o);
            sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
            strM5248a = m5248a(cause, C6682at.f5938h);
            sb.append(strM5248a);
            crashDetailBean.f5678q = sb.toString();
        } else {
            crashDetailBean.f5675n = name;
            if (C6682at.m5225a().m5239i() && z9) {
                C6674al.m5108e("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
                str = " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]";
            }
            crashDetailBean.f5676o = strM5247a + str;
            crashDetailBean.f5677p = string;
            strM5248a = m5248a(th, C6682at.f5938h);
            crashDetailBean.f5678q = strM5248a;
        }
        crashDetailBean.f5682u = C6678ap.m5167c(crashDetailBean.f5678q.getBytes());
        crashDetailBean.f5687z.put(crashDetailBean.f5636B, strM5248a);
    }

    /* renamed from: a */
    private static boolean m5251a(Thread thread) {
        synchronized (f5985i) {
            try {
                if (f5984h != null && thread.getName().equals(f5984h)) {
                    return true;
                }
                f5984h = thread.getName();
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void m5256a(Thread thread, Throwable th, boolean z9, String str, byte[] bArr, boolean z10) {
        if (z9) {
            C6674al.m5108e("Java Crash Happen cause by %s(%d)", thread.getName(), Long.valueOf(thread.getId()));
            if (m5251a(thread)) {
                C6674al.m5102a("this class has handled this exception", new Object[0]);
                if (this.f5991f != null) {
                    C6674al.m5102a("call system handler", new Object[0]);
                    this.f5991f.uncaughtException(thread, th);
                } else {
                    m5253c();
                }
            }
        } else {
            C6674al.m5108e("Java Catch Happen", new Object[0]);
        }
        try {
            if (!this.f5992g) {
                C6674al.m5106c("Java crash handler is disable. Just return.", new Object[0]);
                if (z9) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f5990e;
                    if (uncaughtExceptionHandler != null && m5250a(uncaughtExceptionHandler)) {
                        C6674al.m5108e("sys default last handle start!", new Object[0]);
                        this.f5990e.uncaughtException(thread, th);
                        C6674al.m5108e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f5991f != null) {
                        C6674al.m5108e("system handle start!", new Object[0]);
                        this.f5991f.uncaughtException(thread, th);
                        C6674al.m5108e("system handle end!", new Object[0]);
                        return;
                    } else {
                        C6674al.m5108e("crashreport last handle start!", new Object[0]);
                        m5253c();
                        C6674al.m5108e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            if (!this.f5988c.m5039b()) {
                C6674al.m5107d("no remote but still store!", new Object[0]);
            }
            if (!this.f5988c.m5040c().f5617f && this.f5988c.m5039b()) {
                C6674al.m5108e("crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
                C6681as.m5192a(z9 ? "JAVA_CRASH" : "JAVA_CATCH", C6678ap.m5137a(), this.f5989d.f5772d, thread.getName(), C6678ap.m5143a(th), null);
                if (z9) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f5990e;
                    if (uncaughtExceptionHandler2 != null && m5250a(uncaughtExceptionHandler2)) {
                        C6674al.m5108e("sys default last handle start!", new Object[0]);
                        this.f5990e.uncaughtException(thread, th);
                        C6674al.m5108e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f5991f != null) {
                        C6674al.m5108e("system handle start!", new Object[0]);
                        this.f5991f.uncaughtException(thread, th);
                        C6674al.m5108e("system handle end!", new Object[0]);
                        return;
                    } else {
                        C6674al.m5108e("crashreport last handle start!", new Object[0]);
                        m5253c();
                        C6674al.m5108e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            CrashDetailBean crashDetailBeanM5252b = m5252b(thread, th, z9, str, bArr, z10);
            if (crashDetailBeanM5252b == null) {
                C6674al.m5108e("pkg crash datas fail!", new Object[0]);
                if (z9) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f5990e;
                    if (uncaughtExceptionHandler3 != null && m5250a(uncaughtExceptionHandler3)) {
                        C6674al.m5108e("sys default last handle start!", new Object[0]);
                        this.f5990e.uncaughtException(thread, th);
                        C6674al.m5108e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f5991f != null) {
                        C6674al.m5108e("system handle start!", new Object[0]);
                        this.f5991f.uncaughtException(thread, th);
                        C6674al.m5108e("system handle end!", new Object[0]);
                        return;
                    } else {
                        C6674al.m5108e("crashreport last handle start!", new Object[0]);
                        m5253c();
                        C6674al.m5108e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            C6681as.m5192a(z9 ? "JAVA_CRASH" : "JAVA_CATCH", C6678ap.m5137a(), this.f5989d.f5772d, thread.getName(), C6678ap.m5143a(th), crashDetailBeanM5252b);
            if (!this.f5987b.m5221a(crashDetailBeanM5252b, z9)) {
                this.f5987b.m5223b(crashDetailBeanM5252b, z9);
            }
            if (z9) {
                this.f5987b.m5219a(crashDetailBeanM5252b);
            }
            if (z9) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = this.f5990e;
                if (uncaughtExceptionHandler4 != null && m5250a(uncaughtExceptionHandler4)) {
                    C6674al.m5108e("sys default last handle start!", new Object[0]);
                    this.f5990e.uncaughtException(thread, th);
                    C6674al.m5108e("sys default last handle end!", new Object[0]);
                } else if (this.f5991f != null) {
                    C6674al.m5108e("system handle start!", new Object[0]);
                    this.f5991f.uncaughtException(thread, th);
                    C6674al.m5108e("system handle end!", new Object[0]);
                } else {
                    C6674al.m5108e("crashreport last handle start!", new Object[0]);
                    m5253c();
                    C6674al.m5108e("crashreport last handle end!", new Object[0]);
                }
            }
        } catch (Throwable th2) {
            try {
                if (!C6674al.m5103a(th2)) {
                    th2.printStackTrace();
                }
                if (z9) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = this.f5990e;
                    if (uncaughtExceptionHandler5 != null && m5250a(uncaughtExceptionHandler5)) {
                        C6674al.m5108e("sys default last handle start!", new Object[0]);
                        this.f5990e.uncaughtException(thread, th);
                        C6674al.m5108e("sys default last handle end!", new Object[0]);
                    } else if (this.f5991f != null) {
                        C6674al.m5108e("system handle start!", new Object[0]);
                        this.f5991f.uncaughtException(thread, th);
                        C6674al.m5108e("system handle end!", new Object[0]);
                    } else {
                        C6674al.m5108e("crashreport last handle start!", new Object[0]);
                        m5253c();
                        C6674al.m5108e("crashreport last handle end!", new Object[0]);
                    }
                }
            } catch (Throwable th3) {
                if (z9) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = this.f5990e;
                    if (uncaughtExceptionHandler6 != null && m5250a(uncaughtExceptionHandler6)) {
                        C6674al.m5108e("sys default last handle start!", new Object[0]);
                        this.f5990e.uncaughtException(thread, th);
                        C6674al.m5108e("sys default last handle end!", new Object[0]);
                    } else if (this.f5991f != null) {
                        C6674al.m5108e("system handle start!", new Object[0]);
                        this.f5991f.uncaughtException(thread, th);
                        C6674al.m5108e("system handle end!", new Object[0]);
                    } else {
                        C6674al.m5108e("crashreport last handle start!", new Object[0]);
                        m5253c();
                        C6674al.m5108e("crashreport last handle end!", new Object[0]);
                    }
                }
                throw th3;
            }
        }
    }

    /* renamed from: a */
    private static boolean m5250a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
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
    public final synchronized void m5255a(StrategyBean strategyBean) {
        if (strategyBean != null) {
            boolean z9 = strategyBean.f5617f;
            if (z9 != this.f5992g) {
                C6674al.m5102a("java changed to %b", Boolean.valueOf(z9));
                if (strategyBean.f5617f) {
                    m5254a();
                    return;
                }
                m5257b();
            }
        }
    }

    /* renamed from: a */
    private static String m5248a(Throwable th, int i9) {
        if (th == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            if (th.getStackTrace() != null) {
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if (i9 > 0 && sb.length() >= i9) {
                        sb.append("\n[Stack over limit size :" + i9 + " , has been cutted !]");
                        return sb.toString();
                    }
                    sb.append(stackTraceElement.toString());
                    sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                }
            }
        } catch (Throwable th2) {
            C6674al.m5108e("gen stack error %s", th2.toString());
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m5247a(Throwable th) {
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
