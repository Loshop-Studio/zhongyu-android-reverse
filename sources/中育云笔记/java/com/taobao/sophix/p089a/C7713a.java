package com.taobao.sophix.p089a;

import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.taobao.sophix.p090b.C7728b;
import com.taobao.sophix.p099e.C7744e;
import com.taobao.sophix.p099e.C7749j;
import java.lang.Thread;

/* renamed from: com.taobao.sophix.a.a */
/* loaded from: classes5.dex */
public class C7713a implements Thread.UncaughtExceptionHandler {

    /* renamed from: e */
    private static C7713a f13287e = new C7713a();

    /* renamed from: b */
    private volatile boolean f13289b = false;

    /* renamed from: a */
    private volatile boolean f13288a = false;

    /* renamed from: c */
    private volatile int f13290c = C7749j.m10424a(C7728b.f13354b, "happ_crash_num", 0);

    /* renamed from: d */
    private Thread.UncaughtExceptionHandler f13291d = Thread.getDefaultUncaughtExceptionHandler();

    private C7713a() {
    }

    /* renamed from: a */
    public static void m10213a(boolean z10) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        if (z10 == f13287e.f13289b) {
            return;
        }
        f13287e.f13289b = z10;
        if (z10) {
            Thread.setDefaultUncaughtExceptionHandler(f13287e);
            C7744e.m10400b("CrashHandler", "set", "crash number", String.valueOf(f13287e.f13290c));
            return;
        }
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        String string = defaultUncaughtExceptionHandler == null ? "null" : defaultUncaughtExceptionHandler.toString();
        C7713a c7713a = f13287e;
        String string2 = c7713a == null ? "null" : c7713a.toString();
        C7713a c7713a2 = f13287e;
        C7744e.m10400b("CrashHandler", "handlers", "current", string, "sophix", string2, OSSHeaders.ORIGIN, (c7713a2 == null || (uncaughtExceptionHandler = c7713a2.f13291d) == null) ? "null" : uncaughtExceptionHandler.toString());
        C7713a c7713a3 = f13287e;
        if (defaultUncaughtExceptionHandler == c7713a3) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = c7713a3.f13291d;
            C7744e.m10400b("handler", "recove", uncaughtExceptionHandler2 != null ? uncaughtExceptionHandler2.toString() : "null");
            Thread.setDefaultUncaughtExceptionHandler(f13287e.f13291d);
        }
    }

    /* renamed from: b */
    public static boolean m10215b() {
        return f13287e.f13288a;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        C7744e.m10403d("CrashHandler", "crash happend", new Object[0]);
        if (f13287e.f13289b) {
            if (!(th instanceof OutOfMemoryError)) {
                this.f13288a = true;
                this.f13290c++;
                C7749j.m10429b(C7728b.f13354b, "happ_crash_num", this.f13290c);
                C7744e.m10403d("CrashHandler", "crash is found", "crashNum", Integer.valueOf(this.f13290c));
            }
            m10213a(false);
        }
        this.f13291d.uncaughtException(thread, th);
    }

    /* renamed from: a */
    public static boolean m10214a() {
        return f13287e.f13289b;
    }
}
