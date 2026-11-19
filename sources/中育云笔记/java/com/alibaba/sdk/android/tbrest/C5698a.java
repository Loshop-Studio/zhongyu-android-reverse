package com.alibaba.sdk.android.tbrest;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.alibaba.sdk.android.tbrest.a */
/* loaded from: classes3.dex */
public class C5698a {

    /* renamed from: a */
    public static ScheduledExecutorService f4466a = null;

    /* renamed from: a */
    public static final AtomicInteger f4467a = new AtomicInteger();

    /* renamed from: f */
    public static int f4468f = 1;

    /* renamed from: a */
    public Integer f4469a = 2;

    /* renamed from: com.alibaba.sdk.android.tbrest.a$a */
    public static class a implements ThreadFactory {
        private int priority;

        public a(int i10) {
            this.priority = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "RestSend:" + C5698a.f4467a.getAndIncrement());
            thread.setPriority(this.priority);
            return thread;
        }
    }

    /* renamed from: a */
    public synchronized void m3849a(Runnable runnable) {
        try {
            if (f4466a == null) {
                f4466a = Executors.newScheduledThreadPool(this.f4469a.intValue(), new a(f4468f));
            }
            f4466a.submit(runnable);
        } finally {
        }
    }
}
