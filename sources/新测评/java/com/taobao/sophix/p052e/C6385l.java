package com.taobao.sophix.p052e;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.taobao.sophix.e.l */
/* loaded from: classes4.dex */
public class C6385l {

    /* renamed from: a */
    private static volatile ScheduledThreadPoolExecutor f4979a;

    /* renamed from: b */
    private static volatile ScheduledThreadPoolExecutor f4980b;

    /* renamed from: c */
    private static final AtomicInteger f4981c = new AtomicInteger();

    /* renamed from: com.taobao.sophix.e.l$a */
    public static class a implements ThreadFactory {

        /* renamed from: a */
        private String f4982a;

        public a(String str) {
            this.f4982a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f4982a + C6385l.f4981c.getAndIncrement());
            thread.setPriority(5);
            return thread;
        }
    }

    /* renamed from: b */
    private static ScheduledThreadPoolExecutor m4747b() {
        if (f4979a == null) {
            synchronized (C6385l.class) {
                try {
                    if (f4979a == null) {
                        f4979a = new ScheduledThreadPoolExecutor(1, new a("Sophix-Load"));
                        f4979a.setKeepAliveTime(10L, TimeUnit.SECONDS);
                        f4979a.allowCoreThreadTimeOut(true);
                    }
                } finally {
                }
            }
        }
        return f4979a;
    }

    /* renamed from: c */
    private static ScheduledThreadPoolExecutor m4748c() {
        if (f4980b == null) {
            synchronized (C6385l.class) {
                try {
                    if (f4980b == null) {
                        f4980b = new ScheduledThreadPoolExecutor(4, new a("Sophix-Report"));
                        f4980b.setKeepAliveTime(10L, TimeUnit.SECONDS);
                        f4980b.allowCoreThreadTimeOut(true);
                    }
                } finally {
                }
            }
        }
        return f4980b;
    }

    /* renamed from: a */
    public static void m4745a(Runnable runnable) {
        try {
            m4748c().execute(runnable);
        } catch (Throwable th) {
            C6378e.m4708b("ThreadPoolFactory", "executeSingle", th, new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m4746a(Runnable runnable, long j10) {
        try {
            m4747b().schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            C6378e.m4708b("ThreadPoolFactory", "executeSingle", th, new Object[0]);
        }
    }
}
