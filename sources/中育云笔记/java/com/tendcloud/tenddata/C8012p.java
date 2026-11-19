package com.tendcloud.tenddata;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tendcloud.tenddata.p */
/* loaded from: classes5.dex */
class C8012p {

    /* renamed from: a */
    static final Executor f15063a;

    /* renamed from: b */
    private static final int f15064b;

    /* renamed from: c */
    private static final int f15065c;

    /* renamed from: d */
    private static final int f15066d;

    /* renamed from: e */
    private static final int f15067e = 30;

    /* renamed from: f */
    private static final ThreadFactory f15068f;

    /* renamed from: g */
    private static final BlockingQueue<Runnable> f15069g;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f15064b = iAvailableProcessors;
        int iMax = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
        f15065c = iMax;
        int i10 = (iAvailableProcessors * 2) + 1;
        f15066d = i10;
        ThreadFactory threadFactory = new ThreadFactory() { // from class: com.tendcloud.tenddata.p.1
            private final AtomicInteger mCount = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "Codeless #" + this.mCount.getAndIncrement());
            }
        };
        f15068f = threadFactory;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        f15069g = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iMax, i10, 30L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f15063a = threadPoolExecutor;
    }

    private C8012p() {
    }
}
