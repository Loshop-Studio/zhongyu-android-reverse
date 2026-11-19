package com.alibaba.sdk.android.push.common.util;

import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ThreadPoolFactory {
    private static volatile ScheduledThreadPoolExecutor scheduleThreadPoolExecutor;
    private static final AtomicInteger integer = new AtomicInteger();
    private static final String TAG = "MPS:ThreadPoolFactory";
    private static final AmsLogger LOGGER = AmsLogger.getLogger(TAG);

    /* renamed from: com.alibaba.sdk.android.push.common.util.ThreadPoolFactory$a */
    static class ThreadFactoryC1164a implements ThreadFactory {

        /* renamed from: a */
        private final String f6743a;

        public ThreadFactoryC1164a(String str) {
            this.f6743a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f6743a + ThreadPoolFactory.integer.getAndIncrement());
            thread.setPriority(5);
            return thread;
        }
    }

    public static ScheduledThreadPoolExecutor getScheduledExecutor() {
        if (scheduleThreadPoolExecutor == null) {
            synchronized (ThreadPoolFactory.class) {
                if (scheduleThreadPoolExecutor == null) {
                    scheduleThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1164a(TAG));
                    scheduleThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
                    scheduleThreadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return scheduleThreadPoolExecutor;
    }
}
