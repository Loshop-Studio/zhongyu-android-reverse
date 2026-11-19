package p116m5;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: m5.d */
/* loaded from: classes3.dex */
public final class ThreadFactoryC6112d implements ThreadFactory {

    /* renamed from: d */
    public static final AtomicInteger f9755d = new AtomicInteger();

    /* renamed from: a */
    public final ThreadGroup f9756a;

    /* renamed from: b */
    public final String f9757b = "ObjectBox-" + f9755d.incrementAndGet() + "-Thread-";

    /* renamed from: c */
    public final AtomicInteger f9758c = new AtomicInteger();

    public ThreadFactoryC6112d() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f9756a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f9756a, runnable, this.f9757b + this.f9758c.incrementAndGet());
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
