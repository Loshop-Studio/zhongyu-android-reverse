package io.reactivex.internal.schedulers;

import androidx.camera.view.AbstractC0920q;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class SchedulerPoolFactory {
    public static final boolean PURGE_ENABLED;
    static final String PURGE_ENABLED_KEY = "rx2.purge-enabled";
    public static final int PURGE_PERIOD_SECONDS;
    static final String PURGE_PERIOD_SECONDS_KEY = "rx2.purge-period-seconds";
    static final AtomicReference<ScheduledExecutorService> PURGE_THREAD = new AtomicReference<>();
    static final Map<ScheduledThreadPoolExecutor, Object> POOLS = new ConcurrentHashMap();

    public static final class PurgeProperties {
        boolean purgeEnable;
        int purgePeriod;

        public void load(Properties properties) {
            if (properties.containsKey(SchedulerPoolFactory.PURGE_ENABLED_KEY)) {
                this.purgeEnable = Boolean.parseBoolean(properties.getProperty(SchedulerPoolFactory.PURGE_ENABLED_KEY));
            } else {
                this.purgeEnable = true;
            }
            if (!this.purgeEnable || !properties.containsKey(SchedulerPoolFactory.PURGE_PERIOD_SECONDS_KEY)) {
                this.purgePeriod = 1;
                return;
            }
            try {
                this.purgePeriod = Integer.parseInt(properties.getProperty(SchedulerPoolFactory.PURGE_PERIOD_SECONDS_KEY));
            } catch (NumberFormatException unused) {
                this.purgePeriod = 1;
            }
        }
    }

    public static final class ScheduledTask implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = new ArrayList(SchedulerPoolFactory.POOLS.keySet());
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) obj;
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    SchedulerPoolFactory.POOLS.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        PurgeProperties purgeProperties = new PurgeProperties();
        purgeProperties.load(properties);
        PURGE_ENABLED = purgeProperties.purgeEnable;
        PURGE_PERIOD_SECONDS = purgeProperties.purgePeriod;
        start();
    }

    private SchedulerPoolFactory() {
        throw new IllegalStateException("No instances!");
    }

    public static ScheduledExecutorService create(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        tryPutIntoPool(PURGE_ENABLED, scheduledExecutorServiceNewScheduledThreadPool);
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    public static void shutdown() {
        ScheduledExecutorService andSet = PURGE_THREAD.getAndSet(null);
        if (andSet != null) {
            andSet.shutdownNow();
        }
        POOLS.clear();
    }

    public static void start() {
        tryStart(PURGE_ENABLED);
    }

    public static void tryPutIntoPool(boolean z9, ScheduledExecutorService scheduledExecutorService) {
        if (z9 && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            POOLS.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    public static void tryStart(boolean z9) {
        if (!z9) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = PURGE_THREAD;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
            if (AbstractC0920q.m1034a(atomicReference, scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                ScheduledTask scheduledTask = new ScheduledTask();
                int i10 = PURGE_PERIOD_SECONDS;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(scheduledTask, i10, i10, TimeUnit.SECONDS);
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
