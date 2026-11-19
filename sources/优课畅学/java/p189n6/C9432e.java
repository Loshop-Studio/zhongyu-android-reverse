package p189n6;

import io.objectbox.BoxStore;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: n6.e */
/* loaded from: classes5.dex */
public class C9432e extends ThreadPoolExecutor {

    /* renamed from: a */
    public final BoxStore f18632a;

    /* renamed from: n6.e$a */
    public static class a implements ThreadFactory {

        /* renamed from: d */
        public static final AtomicInteger f18633d = new AtomicInteger();

        /* renamed from: a */
        public final ThreadGroup f18634a;

        /* renamed from: b */
        public final String f18635b = "ObjectBox-" + f18633d.incrementAndGet() + "-Thread-";

        /* renamed from: c */
        public final AtomicInteger f18636c = new AtomicInteger();

        public a() {
            SecurityManager securityManager = System.getSecurityManager();
            this.f18634a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.f18634a, runnable, this.f18635b + this.f18636c.incrementAndGet());
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            return thread;
        }
    }

    public C9432e(BoxStore boxStore) {
        super(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new a());
        this.f18632a = boxStore;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        this.f18632a.m15376j();
    }
}
