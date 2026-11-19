package p225r8;

import io.objectbox.BoxStore;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: r8.e */
/* loaded from: classes5.dex */
public class C9050e extends ThreadPoolExecutor {

    /* renamed from: a */
    public final BoxStore f15511a;

    /* renamed from: r8.e$a */
    public static class a implements ThreadFactory {

        /* renamed from: d */
        public static final AtomicInteger f15512d = new AtomicInteger();

        /* renamed from: a */
        public final ThreadGroup f15513a;

        /* renamed from: b */
        public final String f15514b = "ObjectBox-" + f15512d.incrementAndGet() + "-Thread-";

        /* renamed from: c */
        public final AtomicInteger f15515c = new AtomicInteger();

        public a() {
            SecurityManager securityManager = System.getSecurityManager();
            this.f15513a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.f15513a, runnable, this.f15514b + this.f15515c.incrementAndGet());
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            return thread;
        }
    }

    public C9050e(BoxStore boxStore) {
        super(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new a());
        this.f15511a = boxStore;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        this.f15511a.m12987n();
    }
}
