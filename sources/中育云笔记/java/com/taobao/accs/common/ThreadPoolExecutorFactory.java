package com.taobao.accs.common;

import com.taobao.accs.utl.ALog;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public class ThreadPoolExecutorFactory {
    private static final String TAG = "ThreadPoolExecutorFactory";
    private static final AtomicInteger integer = new AtomicInteger();
    private static volatile ScheduledThreadPoolExecutor scheduleThreadPoolExecutor;
    private static volatile ScheduledThreadPoolExecutor sendThreadPoolExecutor;

    /* renamed from: com.taobao.accs.common.ThreadPoolExecutorFactory$a */
    public static class ThreadFactoryC7616a implements ThreadFactory {

        /* renamed from: a */
        private final String f12917a;

        public ThreadFactoryC7616a(String str) {
            this.f12917a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f12917a + ThreadPoolExecutorFactory.integer.getAndIncrement());
            thread.setPriority(5);
            return thread;
        }
    }

    public static void execute(Runnable runnable) {
        try {
            getScheduledExecutor().execute(runnable);
        } catch (Throwable th) {
            ALog.m10117e(TAG, "ThreadPoolExecutorFactory execute", th, new Object[0]);
        }
    }

    public static ScheduledThreadPoolExecutor getScheduledExecutor() {
        if (scheduleThreadPoolExecutor == null) {
            synchronized (ThreadPoolExecutorFactory.class) {
                try {
                    if (scheduleThreadPoolExecutor == null) {
                        scheduleThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC7616a("ACCS"));
                        scheduleThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
                        scheduleThreadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                } finally {
                }
            }
        }
        return scheduleThreadPoolExecutor;
    }

    public static ScheduledThreadPoolExecutor getSendScheduledExecutor() {
        if (sendThreadPoolExecutor == null) {
            synchronized (ThreadPoolExecutorFactory.class) {
                try {
                    if (sendThreadPoolExecutor == null) {
                        sendThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC7616a("ACCS-SEND"));
                        sendThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
                        sendThreadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                } finally {
                }
            }
        }
        return sendThreadPoolExecutor;
    }

    public static ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        try {
            return getScheduledExecutor().schedule(runnable, j10, timeUnit);
        } catch (Throwable th) {
            ALog.m10117e(TAG, "ThreadPoolExecutorFactory schedule", th, new Object[0]);
            return null;
        }
    }
}
