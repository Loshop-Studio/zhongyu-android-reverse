package p318r5;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.eclipse.paho.client.mqttv3.DisconnectedBufferOptions;

/* renamed from: r5.e */
/* loaded from: classes5.dex */
public class C10856e {

    /* renamed from: b */
    public static C10856e f26195b;

    /* renamed from: c */
    public static C10856e f26196c;

    /* renamed from: d */
    public static C10856e f26197d;

    /* renamed from: a */
    public ThreadPoolExecutor f26198a = new ThreadPoolExecutor(0, 1, 60000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(DisconnectedBufferOptions.DISCONNECTED_BUFFER_SIZE_DEFAULT), new b());

    /* renamed from: r5.e$a */
    public static class a implements Runnable {

        /* renamed from: c */
        public Runnable f26199c;

        public a(Runnable runnable) {
            this.f26199c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = this.f26199c;
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Exception unused) {
                    AbstractC10861f1.m23440l("hmsSdk", "InnerTask : Exception has happened,From internal operations!");
                }
            }
        }
    }

    /* renamed from: r5.e$b */
    public static class b implements ThreadFactory {

        /* renamed from: f */
        public static final AtomicInteger f26200f = new AtomicInteger(1);

        /* renamed from: c */
        public final ThreadGroup f26201c;

        /* renamed from: d */
        public final AtomicInteger f26202d = new AtomicInteger(1);

        /* renamed from: e */
        public final String f26203e;

        public b() {
            SecurityManager securityManager = System.getSecurityManager();
            this.f26201c = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            this.f26203e = "FormalHASDK-base-" + f26200f.getAndIncrement();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(this.f26201c, runnable, this.f26203e + this.f26202d.getAndIncrement(), 0L);
        }
    }

    static {
        new C10856e();
        new C10856e();
        f26195b = new C10856e();
        f26196c = new C10856e();
        f26197d = new C10856e();
    }

    /* renamed from: a */
    public static C10856e m23402a() {
        return f26197d;
    }

    /* renamed from: c */
    public static C10856e m23403c() {
        return f26196c;
    }

    /* renamed from: d */
    public static C10856e m23404d() {
        return f26195b;
    }

    /* renamed from: b */
    public void m23405b(InterfaceRunnableC10897u interfaceRunnableC10897u) {
        try {
            this.f26198a.execute(new a(interfaceRunnableC10897u));
        } catch (RejectedExecutionException unused) {
            AbstractC10861f1.m23440l("hmsSdk", "addToQueue() Exception has happened!Form rejected execution");
        }
    }
}
