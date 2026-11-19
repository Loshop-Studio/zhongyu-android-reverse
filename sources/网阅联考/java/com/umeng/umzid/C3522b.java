package com.umeng.umzid;

import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.umeng.umzid.b */
/* loaded from: classes2.dex */
public class C3522b {

    /* renamed from: a */
    public static volatile ScheduledThreadPoolExecutor f3061a;

    /* renamed from: b */
    public static ThreadFactory f3062b = new a();

    /* renamed from: com.umeng.umzid.b$a */
    public static class a implements ThreadFactory {

        /* renamed from: a */
        public AtomicInteger f3063a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("ZIDThreadPoolExecutor" + this.f3063a.addAndGet(1));
            return thread;
        }
    }

    /* renamed from: a */
    public static ScheduledThreadPoolExecutor m4021a() {
        if (f3061a == null) {
            synchronized (C3522b.class) {
                if (f3061a == null) {
                    f3061a = new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors() * 4, f3062b);
                }
            }
        }
        return f3061a;
    }

    /* renamed from: a */
    public static void m4022a(Runnable runnable) {
        try {
            m4021a().execute(runnable);
        } catch (Throwable unused) {
            Log.e("com.umeng.umzid.b", "UmengThreadPoolExecutorFactory execute exception");
        }
    }
}
