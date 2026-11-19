package p333s5;

import java.util.concurrent.ThreadFactory;

/* renamed from: s5.b */
/* loaded from: classes5.dex */
public class ThreadFactoryC11062b implements ThreadFactory {

    /* renamed from: c */
    public final ThreadGroup f26690c;

    /* renamed from: d */
    public int f26691d = 1;

    /* renamed from: e */
    public final String f26692e;

    public ThreadFactoryC11062b(String str) {
        SecurityManager securityManager = System.getSecurityManager();
        this.f26690c = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.f26692e = str + "-pool-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        synchronized (this) {
            this.f26691d++;
        }
        Thread thread = new Thread(this.f26690c, runnable, this.f26692e + this.f26691d, 0L);
        thread.setUncaughtExceptionHandler(null);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
