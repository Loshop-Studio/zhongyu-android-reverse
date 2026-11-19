package p090g1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p169x0.AbstractC3445n;

/* renamed from: g1.p */
/* loaded from: classes.dex */
public class C2644p {

    /* renamed from: f */
    private static final String f10453f = AbstractC3445n.m10503f("WorkTimer");

    /* renamed from: a */
    private final ThreadFactory f10454a;

    /* renamed from: b */
    private final ScheduledExecutorService f10455b;

    /* renamed from: c */
    final Map<String, c> f10456c;

    /* renamed from: d */
    final Map<String, b> f10457d;

    /* renamed from: e */
    final Object f10458e;

    /* renamed from: g1.p$a */
    class a implements ThreadFactory {

        /* renamed from: a */
        private int f10459a = 0;

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f10459a);
            this.f10459a = this.f10459a + 1;
            return threadNewThread;
        }
    }

    /* renamed from: g1.p$b */
    public interface b {
        /* renamed from: b */
        void mo4212b(String str);
    }

    /* renamed from: g1.p$c */
    public static class c implements Runnable {

        /* renamed from: a */
        private final C2644p f10461a;

        /* renamed from: b */
        private final String f10462b;

        c(C2644p c2644p, String str) {
            this.f10461a = c2644p;
            this.f10462b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f10461a.f10458e) {
                if (this.f10461a.f10456c.remove(this.f10462b) != null) {
                    b bVarRemove = this.f10461a.f10457d.remove(this.f10462b);
                    if (bVarRemove != null) {
                        bVarRemove.mo4212b(this.f10462b);
                    }
                } else {
                    AbstractC3445n.m10501c().mo10504a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f10462b), new Throwable[0]);
                }
            }
        }
    }

    public C2644p() {
        a aVar = new a();
        this.f10454a = aVar;
        this.f10456c = new HashMap();
        this.f10457d = new HashMap();
        this.f10458e = new Object();
        this.f10455b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    /* renamed from: a */
    public void m8853a() {
        if (this.f10455b.isShutdown()) {
            return;
        }
        this.f10455b.shutdownNow();
    }

    /* renamed from: b */
    public void m8854b(String str, long j4, b bVar) {
        synchronized (this.f10458e) {
            AbstractC3445n.m10501c().mo10504a(f10453f, String.format("Starting timer for %s", str), new Throwable[0]);
            m8855c(str);
            c cVar = new c(this, str);
            this.f10456c.put(str, cVar);
            this.f10457d.put(str, bVar);
            this.f10455b.schedule(cVar, j4, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: c */
    public void m8855c(String str) {
        synchronized (this.f10458e) {
            if (this.f10456c.remove(str) != null) {
                AbstractC3445n.m10501c().mo10504a(f10453f, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f10457d.remove(str);
            }
        }
    }
}
