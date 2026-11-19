package p037c8;

import io.objectbox.BoxStore;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: c8.e */
/* loaded from: classes5.dex */
public class C5270e extends ThreadPoolExecutor {

    /* renamed from: a */
    public final BoxStore f2509a;

    /* renamed from: c8.e$a */
    public static class a implements ThreadFactory {

        /* renamed from: d */
        public static final AtomicInteger f2510d = new AtomicInteger();

        /* renamed from: a */
        public final ThreadGroup f2511a;

        /* renamed from: b */
        public final String f2512b = "ObjectBox-" + f2510d.incrementAndGet() + "-Thread-";

        /* renamed from: c */
        public final AtomicInteger f2513c = new AtomicInteger();

        public a() {
            SecurityManager securityManager = System.getSecurityManager();
            this.f2511a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.f2511a, runnable, this.f2512b + this.f2513c.incrementAndGet());
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            return thread;
        }
    }

    public C5270e(BoxStore boxStore) {
        super(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new a());
        this.f2509a = boxStore;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        this.f2509a.m13107n();
    }
}
