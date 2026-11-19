package com.umeng.analytics.pro;

import com.umeng.analytics.AnalyticsConfig;
import java.lang.Thread;

/* renamed from: com.umeng.analytics.pro.o */
/* loaded from: classes2.dex */
public class C3398o implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private Thread.UncaughtExceptionHandler f2304a;

    /* renamed from: b */
    private InterfaceC3402s f2305b;

    public C3398o() {
        if (Thread.getDefaultUncaughtExceptionHandler() == this) {
            return;
        }
        this.f2304a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* renamed from: a */
    public void m3286a(InterfaceC3402s interfaceC3402s) {
        this.f2305b = interfaceC3402s;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        m3285a(th);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f2304a;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == Thread.getDefaultUncaughtExceptionHandler()) {
            return;
        }
        this.f2304a.uncaughtException(thread, th);
    }

    /* renamed from: a */
    private void m3285a(Throwable th) {
        if (AnalyticsConfig.CATCH_EXCEPTION) {
            this.f2305b.mo2782a(th);
        } else {
            this.f2305b.mo2782a(null);
        }
    }
}
