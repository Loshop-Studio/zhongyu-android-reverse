package com.alibaba.sdk.android.crashdefend.p024b;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.alibaba.sdk.android.crashdefend.b.a */
/* loaded from: classes.dex */
public class C1113a {

    /* renamed from: a */
    private final ThreadFactory f6549a = new ThreadFactory() { // from class: com.alibaba.sdk.android.crashdefend.b.a.1
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "safe_thread");
            thread.setDaemon(false);
            return thread;
        }
    };

    /* renamed from: b */
    private ExecutorService f6550b;

    /* renamed from: a */
    public synchronized ExecutorService m5072a() {
        if (this.f6550b == null) {
            this.f6550b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 1L, TimeUnit.SECONDS, new SynchronousQueue(), this.f6549a);
        }
        return this.f6550b;
    }
}
