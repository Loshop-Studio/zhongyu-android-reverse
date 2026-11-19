package com.umeng.analytics.pro;

import com.umeng.analytics.AnalyticsConfig;
import java.lang.Thread;

/* renamed from: com.umeng.analytics.pro.o */
/* loaded from: classes.dex */
public class C1914o implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private Thread.UncaughtExceptionHandler f8896a;

    /* renamed from: b */
    private InterfaceC1918s f8897b;

    public C1914o() {
        if (Thread.getDefaultUncaughtExceptionHandler() == this) {
            return;
        }
        this.f8896a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* renamed from: a */
    public void m7209a(InterfaceC1918s interfaceC1918s) {
        this.f8897b = interfaceC1918s;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        m7208a(th);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f8896a;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == Thread.getDefaultUncaughtExceptionHandler()) {
            return;
        }
        this.f8896a.uncaughtException(thread, th);
    }

    /* renamed from: a */
    private void m7208a(Throwable th) {
        if (AnalyticsConfig.CATCH_EXCEPTION) {
            this.f8897b.mo6705a(th);
        } else {
            this.f8897b.mo6705a(null);
        }
    }
}
