package com.taobao.sophix.p042a;

import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.taobao.sophix.p043b.C6362b;
import com.taobao.sophix.p052e.C6378e;
import com.taobao.sophix.p052e.C6383j;
import java.lang.Thread;

/* renamed from: com.taobao.sophix.a.a */
/* loaded from: classes4.dex */
public class C6347a implements Thread.UncaughtExceptionHandler {

    /* renamed from: e */
    private static C6347a f4845e = new C6347a();

    /* renamed from: b */
    private volatile boolean f4847b = false;

    /* renamed from: a */
    private volatile boolean f4846a = false;

    /* renamed from: c */
    private volatile int f4848c = C6383j.m4733a(C6362b.f4912b, "happ_crash_num", 0);

    /* renamed from: d */
    private Thread.UncaughtExceptionHandler f4849d = Thread.getDefaultUncaughtExceptionHandler();

    private C6347a() {
    }

    /* renamed from: a */
    public static void m4522a(boolean z9) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        if (z9 == f4845e.f4847b) {
            return;
        }
        f4845e.f4847b = z9;
        if (z9) {
            Thread.setDefaultUncaughtExceptionHandler(f4845e);
            C6378e.m4709b("CrashHandler", "set", "crash number", String.valueOf(f4845e.f4848c));
            return;
        }
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        String string = defaultUncaughtExceptionHandler == null ? "null" : defaultUncaughtExceptionHandler.toString();
        C6347a c6347a = f4845e;
        String string2 = c6347a == null ? "null" : c6347a.toString();
        C6347a c6347a2 = f4845e;
        C6378e.m4709b("CrashHandler", "handlers", "current", string, "sophix", string2, OSSHeaders.ORIGIN, (c6347a2 == null || (uncaughtExceptionHandler = c6347a2.f4849d) == null) ? "null" : uncaughtExceptionHandler.toString());
        C6347a c6347a3 = f4845e;
        if (defaultUncaughtExceptionHandler == c6347a3) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = c6347a3.f4849d;
            C6378e.m4709b("handler", "recove", uncaughtExceptionHandler2 != null ? uncaughtExceptionHandler2.toString() : "null");
            Thread.setDefaultUncaughtExceptionHandler(f4845e.f4849d);
        }
    }

    /* renamed from: b */
    public static boolean m4524b() {
        return f4845e.f4846a;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        C6378e.m4712d("CrashHandler", "crash happend", new Object[0]);
        if (f4845e.f4847b) {
            if (!(th instanceof OutOfMemoryError)) {
                this.f4846a = true;
                this.f4848c++;
                C6383j.m4738b(C6362b.f4912b, "happ_crash_num", this.f4848c);
                C6378e.m4712d("CrashHandler", "crash is found", "crashNum", Integer.valueOf(this.f4848c));
            }
            m4522a(false);
        }
        this.f4849d.uncaughtException(thread, th);
    }

    /* renamed from: a */
    public static boolean m4523a() {
        return f4845e.f4847b;
    }
}
