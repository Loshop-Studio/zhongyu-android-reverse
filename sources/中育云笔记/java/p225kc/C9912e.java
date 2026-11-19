package p225kc;

import io.objectbox.BoxStore;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: kc.e */
/* loaded from: classes6.dex */
public class C9912e extends ThreadPoolExecutor {

    /* renamed from: c */
    public final BoxStore f23231c;

    /* renamed from: kc.e$a */
    public static class a implements ThreadFactory {

        /* renamed from: f */
        public static final AtomicInteger f23232f = new AtomicInteger();

        /* renamed from: c */
        public final ThreadGroup f23233c;

        /* renamed from: d */
        public final String f23234d = "ObjectBox-" + f23232f.incrementAndGet() + "-Thread-";

        /* renamed from: e */
        public final AtomicInteger f23235e = new AtomicInteger();

        public a() {
            SecurityManager securityManager = System.getSecurityManager();
            this.f23233c = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.f23233c, runnable, this.f23234d + this.f23235e.incrementAndGet());
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            return thread;
        }
    }

    public C9912e(BoxStore boxStore) {
        super(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new a());
        this.f23231c = boxStore;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        this.f23231c.m18960n();
    }
}
