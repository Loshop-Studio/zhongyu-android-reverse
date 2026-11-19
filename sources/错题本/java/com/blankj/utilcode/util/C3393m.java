package com.blankj.utilcode.util;

import android.util.Log;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.blankj.utilcode.util.m */
/* loaded from: classes2.dex */
public final class C3393m extends ThreadPoolExecutor {

    /* renamed from: a */
    public final AtomicInteger f2170a;

    /* renamed from: b */
    public final ThreadUtils$LinkedBlockingQueue4Util f2171b;

    public C3393m(int i, int i8, long j7, TimeUnit timeUnit, ThreadUtils$LinkedBlockingQueue4Util threadUtils$LinkedBlockingQueue4Util, ThreadFactory threadFactory) {
        super(i, i8, j7, timeUnit, threadUtils$LinkedBlockingQueue4Util, threadFactory);
        this.f2170a = new AtomicInteger();
        threadUtils$LinkedBlockingQueue4Util.mPool = this;
        this.f2171b = threadUtils$LinkedBlockingQueue4Util;
    }

    /* renamed from: a */
    public static C3393m m2348a() {
        return new C3393m(0, 128, 60L, TimeUnit.SECONDS, new ThreadUtils$LinkedBlockingQueue4Util(true), new ThreadUtils$UtilsThreadFactory("cached", 5));
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        this.f2170a.decrementAndGet();
        super.afterExecute(runnable, th);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (isShutdown()) {
            return;
        }
        AtomicInteger atomicInteger = this.f2170a;
        atomicInteger.incrementAndGet();
        try {
            super.execute(runnable);
        } catch (RejectedExecutionException unused) {
            Log.e("ThreadUtils", "This will not happen!");
            this.f2171b.offer(runnable);
        } catch (Throwable unused2) {
            atomicInteger.decrementAndGet();
        }
    }
}
