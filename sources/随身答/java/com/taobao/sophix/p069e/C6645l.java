package com.taobao.sophix.p069e;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.taobao.sophix.e.l */
/* loaded from: classes4.dex */
public class C6645l {

    /* renamed from: a */
    private static volatile ScheduledThreadPoolExecutor f5556a;

    /* renamed from: b */
    private static volatile ScheduledThreadPoolExecutor f5557b;

    /* renamed from: c */
    private static final AtomicInteger f5558c = new AtomicInteger();

    /* renamed from: com.taobao.sophix.e.l$a */
    public static class a implements ThreadFactory {

        /* renamed from: a */
        private String f5559a;

        public a(String str) {
            this.f5559a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f5559a + C6645l.f5558c.getAndIncrement());
            thread.setPriority(5);
            return thread;
        }
    }

    /* renamed from: b */
    private static ScheduledThreadPoolExecutor m4926b() {
        if (f5556a == null) {
            synchronized (C6645l.class) {
                try {
                    if (f5556a == null) {
                        f5556a = new ScheduledThreadPoolExecutor(1, new a("Sophix-Load"));
                        f5556a.setKeepAliveTime(10L, TimeUnit.SECONDS);
                        f5556a.allowCoreThreadTimeOut(true);
                    }
                } finally {
                }
            }
        }
        return f5556a;
    }

    /* renamed from: c */
    private static ScheduledThreadPoolExecutor m4927c() {
        if (f5557b == null) {
            synchronized (C6645l.class) {
                try {
                    if (f5557b == null) {
                        f5557b = new ScheduledThreadPoolExecutor(4, new a("Sophix-Report"));
                        f5557b.setKeepAliveTime(10L, TimeUnit.SECONDS);
                        f5557b.allowCoreThreadTimeOut(true);
                    }
                } finally {
                }
            }
        }
        return f5557b;
    }

    /* renamed from: a */
    public static void m4924a(Runnable runnable) {
        try {
            m4927c().execute(runnable);
        } catch (Throwable th) {
            C6638e.m4887b("ThreadPoolFactory", "executeSingle", th, new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m4925a(Runnable runnable, long j9) {
        try {
            m4926b().schedule(runnable, j9, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            C6638e.m4887b("ThreadPoolFactory", "executeSingle", th, new Object[0]);
        }
    }
}
