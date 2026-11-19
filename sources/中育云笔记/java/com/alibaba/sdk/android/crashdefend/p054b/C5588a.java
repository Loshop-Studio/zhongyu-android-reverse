package com.alibaba.sdk.android.crashdefend.p054b;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.alibaba.sdk.android.crashdefend.b.a */
/* loaded from: classes3.dex */
public class C5588a {

    /* renamed from: a */
    private final ThreadFactory f4034a = new ThreadFactory() { // from class: com.alibaba.sdk.android.crashdefend.b.a.1
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "safe_thread");
            thread.setDaemon(false);
            return thread;
        }
    };

    /* renamed from: b */
    private ExecutorService f4035b;

    /* renamed from: a */
    public synchronized ExecutorService m3473a() {
        try {
            if (this.f4035b == null) {
                this.f4035b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 1L, TimeUnit.SECONDS, new SynchronousQueue(), this.f4034a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4035b;
    }
}
