package com.taobao.sophix.p099e;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.taobao.sophix.e.l */
/* loaded from: classes5.dex */
public class C7751l {

    /* renamed from: a */
    private static volatile ScheduledThreadPoolExecutor f13421a;

    /* renamed from: b */
    private static volatile ScheduledThreadPoolExecutor f13422b;

    /* renamed from: c */
    private static final AtomicInteger f13423c = new AtomicInteger();

    /* renamed from: com.taobao.sophix.e.l$a */
    public static class a implements ThreadFactory {

        /* renamed from: a */
        private String f13424a;

        public a(String str) {
            this.f13424a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f13424a + C7751l.f13423c.getAndIncrement());
            thread.setPriority(5);
            return thread;
        }
    }

    /* renamed from: b */
    private static ScheduledThreadPoolExecutor m10438b() {
        if (f13421a == null) {
            synchronized (C7751l.class) {
                try {
                    if (f13421a == null) {
                        f13421a = new ScheduledThreadPoolExecutor(1, new a("Sophix-Load"));
                        f13421a.setKeepAliveTime(10L, TimeUnit.SECONDS);
                        f13421a.allowCoreThreadTimeOut(true);
                    }
                } finally {
                }
            }
        }
        return f13421a;
    }

    /* renamed from: c */
    private static ScheduledThreadPoolExecutor m10439c() {
        if (f13422b == null) {
            synchronized (C7751l.class) {
                try {
                    if (f13422b == null) {
                        f13422b = new ScheduledThreadPoolExecutor(4, new a("Sophix-Report"));
                        f13422b.setKeepAliveTime(10L, TimeUnit.SECONDS);
                        f13422b.allowCoreThreadTimeOut(true);
                    }
                } finally {
                }
            }
        }
        return f13422b;
    }

    /* renamed from: a */
    public static void m10436a(Runnable runnable) {
        try {
            m10439c().execute(runnable);
        } catch (Throwable th) {
            C7744e.m10399b("ThreadPoolFactory", "executeSingle", th, new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m10437a(Runnable runnable, long j10) {
        try {
            m10438b().schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            C7744e.m10399b("ThreadPoolFactory", "executeSingle", th, new Object[0]);
        }
    }
}
