package com.taobao.sophix.p059a;

import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.taobao.sophix.p060b.C6622b;
import com.taobao.sophix.p069e.C6638e;
import com.taobao.sophix.p069e.C6643j;
import java.lang.Thread;

/* renamed from: com.taobao.sophix.a.a */
/* loaded from: classes4.dex */
public class C6607a implements Thread.UncaughtExceptionHandler {

    /* renamed from: e */
    private static C6607a f5422e = new C6607a();

    /* renamed from: b */
    private volatile boolean f5424b = false;

    /* renamed from: a */
    private volatile boolean f5423a = false;

    /* renamed from: c */
    private volatile int f5425c = C6643j.m4912a(C6622b.f5489b, "happ_crash_num", 0);

    /* renamed from: d */
    private Thread.UncaughtExceptionHandler f5426d = Thread.getDefaultUncaughtExceptionHandler();

    private C6607a() {
    }

    /* renamed from: a */
    public static void m4701a(boolean z9) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        if (z9 == f5422e.f5424b) {
            return;
        }
        f5422e.f5424b = z9;
        if (z9) {
            Thread.setDefaultUncaughtExceptionHandler(f5422e);
            C6638e.m4888b("CrashHandler", "set", "crash number", String.valueOf(f5422e.f5425c));
            return;
        }
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        String string = defaultUncaughtExceptionHandler == null ? "null" : defaultUncaughtExceptionHandler.toString();
        C6607a c6607a = f5422e;
        String string2 = c6607a == null ? "null" : c6607a.toString();
        C6607a c6607a2 = f5422e;
        C6638e.m4888b("CrashHandler", "handlers", "current", string, "sophix", string2, OSSHeaders.ORIGIN, (c6607a2 == null || (uncaughtExceptionHandler = c6607a2.f5426d) == null) ? "null" : uncaughtExceptionHandler.toString());
        C6607a c6607a3 = f5422e;
        if (defaultUncaughtExceptionHandler == c6607a3) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = c6607a3.f5426d;
            C6638e.m4888b("handler", "recove", uncaughtExceptionHandler2 != null ? uncaughtExceptionHandler2.toString() : "null");
            Thread.setDefaultUncaughtExceptionHandler(f5422e.f5426d);
        }
    }

    /* renamed from: b */
    public static boolean m4703b() {
        return f5422e.f5423a;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        C6638e.m4891d("CrashHandler", "crash happend", new Object[0]);
        if (f5422e.f5424b) {
            if (!(th instanceof OutOfMemoryError)) {
                this.f5423a = true;
                this.f5425c++;
                C6643j.m4917b(C6622b.f5489b, "happ_crash_num", this.f5425c);
                C6638e.m4891d("CrashHandler", "crash is found", "crashNum", Integer.valueOf(this.f5425c));
            }
            m4701a(false);
        }
        this.f5426d.uncaughtException(thread, th);
    }

    /* renamed from: a */
    public static boolean m4702a() {
        return f5422e.f5424b;
    }
}
