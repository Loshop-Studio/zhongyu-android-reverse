package p076d7;

import androidx.camera.view.AbstractC0949q;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: d7.e */
/* loaded from: classes5.dex */
public abstract class AbstractC8314e {

    /* renamed from: a */
    public static final boolean f15754a;

    /* renamed from: b */
    public static final int f15755b;

    /* renamed from: c */
    public static final AtomicReference f15756c = new AtomicReference();

    /* renamed from: d */
    public static final Map f15757d = new ConcurrentHashMap();

    /* renamed from: d7.e$a */
    public static final class a {

        /* renamed from: a */
        public boolean f15758a;

        /* renamed from: b */
        public int f15759b;

        /* renamed from: a */
        public void m13485a(Properties properties) {
            if (properties.containsKey("rx2.purge-enabled")) {
                this.f15758a = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
            } else {
                this.f15758a = true;
            }
            if (!this.f15758a || !properties.containsKey("rx2.purge-period-seconds")) {
                this.f15759b = 1;
                return;
            }
            try {
                this.f15759b = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
            } catch (NumberFormatException unused) {
                this.f15759b = 1;
            }
        }
    }

    /* renamed from: d7.e$b */
    public static final class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(AbstractC8314e.f15757d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    AbstractC8314e.f15757d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        a aVar = new a();
        aVar.m13485a(properties);
        f15754a = aVar.f15758a;
        f15755b = aVar.f15759b;
        m13482b();
    }

    /* renamed from: a */
    public static ScheduledExecutorService m13481a(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        m13483c(f15754a, scheduledExecutorServiceNewScheduledThreadPool);
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    /* renamed from: b */
    public static void m13482b() {
        m13484d(f15754a);
    }

    /* renamed from: c */
    public static void m13483c(boolean z10, ScheduledExecutorService scheduledExecutorService) {
        if (z10 && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f15757d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    /* renamed from: d */
    public static void m13484d(boolean z10) {
        if (!z10) {
            return;
        }
        while (true) {
            AtomicReference atomicReference = f15756c;
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
            if (AbstractC0949q.m807a(atomicReference, scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                b bVar = new b();
                int i10 = f15755b;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(bVar, i10, i10, TimeUnit.SECONDS);
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
