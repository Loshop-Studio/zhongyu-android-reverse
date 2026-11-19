package com.umeng.umzid;

import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.umeng.umzid.b */
/* loaded from: classes.dex */
public class C2038b {

    /* renamed from: a */
    public static volatile ScheduledThreadPoolExecutor f9653a;

    /* renamed from: b */
    public static ThreadFactory f9654b = new a();

    /* renamed from: com.umeng.umzid.b$a */
    public static class a implements ThreadFactory {

        /* renamed from: a */
        public AtomicInteger f9655a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("ZIDThreadPoolExecutor" + this.f9655a.addAndGet(1));
            return thread;
        }
    }

    /* renamed from: a */
    public static ScheduledThreadPoolExecutor m7944a() {
        if (f9653a == null) {
            synchronized (C2038b.class) {
                if (f9653a == null) {
                    f9653a = new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors() * 4, f9654b);
                }
            }
        }
        return f9653a;
    }

    /* renamed from: a */
    public static void m7945a(Runnable runnable) {
        try {
            m7944a().execute(runnable);
        } catch (Throwable unused) {
            Log.e("com.umeng.umzid.b", "UmengThreadPoolExecutorFactory execute exception");
        }
    }
}
