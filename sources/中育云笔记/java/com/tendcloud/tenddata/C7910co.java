package com.tendcloud.tenddata;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tendcloud.tenddata.co */
/* loaded from: classes5.dex */
public final class C7910co {

    /* renamed from: a */
    public static final ThreadPoolExecutor f14599a;

    /* renamed from: b */
    private static final int f14600b;

    /* renamed from: c */
    private static final int f14601c;

    /* renamed from: d */
    private static final int f14602d;

    /* renamed from: e */
    private static final int f14603e = 30;

    /* renamed from: f */
    private static final ThreadFactory f14604f;

    /* renamed from: g */
    private static final BlockingQueue<Runnable> f14605g;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f14600b = iAvailableProcessors;
        int iMax = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
        f14601c = iMax;
        int i10 = (iAvailableProcessors * 2) + 1;
        f14602d = i10;
        ThreadFactory threadFactory = new ThreadFactory() { // from class: com.tendcloud.tenddata.co.1
            private final AtomicInteger mCount = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "ThreadPoolUtils #" + this.mCount.getAndIncrement());
            }
        };
        f14604f = threadFactory;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        f14605g = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iMax, i10, 30L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f14599a = threadPoolExecutor;
    }
}
