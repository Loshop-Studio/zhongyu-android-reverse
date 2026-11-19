package com.blankj.utilcode.util;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public abstract class ThreadUtils {

    /* renamed from: a */
    public static final Handler f2642a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public static final Map f2643b = new HashMap();

    /* renamed from: c */
    public static final Map f2644c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final int f2645d = Runtime.getRuntime().availableProcessors();

    /* renamed from: e */
    public static final Timer f2646e = new Timer();

    public static final class UtilsThreadFactory extends AtomicLong implements ThreadFactory {

        /* renamed from: d */
        public static final AtomicInteger f2649d = new AtomicInteger(1);

        /* renamed from: a */
        public final String f2650a;

        /* renamed from: b */
        public final int f2651b;

        /* renamed from: c */
        public final boolean f2652c;

        /* renamed from: com.blankj.utilcode.util.ThreadUtils$UtilsThreadFactory$a */
        public class C5341a extends Thread {
            public C5341a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    super.run();
                } catch (Throwable th) {
                    Log.e("ThreadUtils", "Request threw uncaught throwable", th);
                }
            }
        }

        /* renamed from: com.blankj.utilcode.util.ThreadUtils$UtilsThreadFactory$b */
        public class C5342b implements Thread.UncaughtExceptionHandler {
            public C5342b() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                System.out.println(th);
            }
        }

        public UtilsThreadFactory(String str, int i10) {
            this(str, i10, false);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            C5341a c5341a = new C5341a(runnable, this.f2650a + getAndIncrement());
            c5341a.setDaemon(this.f2652c);
            c5341a.setUncaughtExceptionHandler(new C5342b());
            c5341a.setPriority(this.f2651b);
            return c5341a;
        }

        public UtilsThreadFactory(String str, int i10, boolean z10) {
            this.f2650a = str + "-pool-" + f2649d.getAndIncrement() + "-thread-";
            this.f2651b = i10;
            this.f2652c = z10;
        }
    }

    /* renamed from: com.blankj.utilcode.util.ThreadUtils$a */
    public static final class C5343a extends ThreadPoolExecutor {

        /* renamed from: a */
        public final AtomicInteger f2655a;

        /* renamed from: b */
        public LinkedBlockingQueue4Util f2656b;

        public C5343a(int i10, int i11, long j10, TimeUnit timeUnit, LinkedBlockingQueue4Util linkedBlockingQueue4Util, ThreadFactory threadFactory) {
            super(i10, i11, j10, timeUnit, linkedBlockingQueue4Util, threadFactory);
            this.f2655a = new AtomicInteger();
            linkedBlockingQueue4Util.f2647a = this;
            this.f2656b = linkedBlockingQueue4Util;
        }

        /* renamed from: b */
        public static ExecutorService m2384b(int i10, int i11) {
            if (i10 == -8) {
                return new C5343a(ThreadUtils.f2645d + 1, (ThreadUtils.f2645d * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory("cpu", i11));
            }
            if (i10 == -4) {
                return new C5343a((ThreadUtils.f2645d * 2) + 1, (ThreadUtils.f2645d * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("io", i11));
            }
            if (i10 == -2) {
                return new C5343a(0, 128, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory("cached", i11));
            }
            if (i10 == -1) {
                return new C5343a(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("single", i11));
            }
            return new C5343a(i10, i10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("fixed(" + i10 + ")", i11));
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th) {
            this.f2655a.decrementAndGet();
            super.afterExecute(runnable, th);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (isShutdown()) {
                return;
            }
            this.f2655a.incrementAndGet();
            try {
                super.execute(runnable);
            } catch (RejectedExecutionException unused) {
                Log.e("ThreadUtils", "This will not happen!");
                this.f2656b.offer(runnable);
            } catch (Throwable unused2) {
                this.f2655a.decrementAndGet();
            }
        }
    }

    /* renamed from: b */
    public static ExecutorService m2376b() {
        return m2377c(-2);
    }

    /* renamed from: c */
    public static ExecutorService m2377c(int i10) {
        return m2378d(i10, 5);
    }

    /* renamed from: d */
    public static ExecutorService m2378d(int i10, int i11) {
        ExecutorService executorServiceM2384b;
        Map map = f2643b;
        synchronized (map) {
            try {
                Map map2 = (Map) map.get(Integer.valueOf(i10));
                if (map2 == null) {
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    executorServiceM2384b = C5343a.m2384b(i10, i11);
                    concurrentHashMap.put(Integer.valueOf(i11), executorServiceM2384b);
                    map.put(Integer.valueOf(i10), concurrentHashMap);
                } else {
                    executorServiceM2384b = (ExecutorService) map2.get(Integer.valueOf(i11));
                    if (executorServiceM2384b == null) {
                        executorServiceM2384b = C5343a.m2384b(i10, i11);
                        map2.put(Integer.valueOf(i11), executorServiceM2384b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorServiceM2384b;
    }

    /* renamed from: e */
    public static void m2379e(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            f2642a.post(runnable);
        }
    }

    /* renamed from: f */
    public static void m2380f(Runnable runnable, long j10) {
        f2642a.postDelayed(runnable, j10);
    }

    public static final class LinkedBlockingQueue4Util extends LinkedBlockingQueue<Runnable> {

        /* renamed from: a */
        public volatile C5343a f2647a;

        /* renamed from: b */
        public int f2648b;

        public LinkedBlockingQueue4Util() {
            this.f2648b = Integer.MAX_VALUE;
        }

        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean offer(Runnable runnable) {
            if (this.f2648b > size() || this.f2647a == null || this.f2647a.getPoolSize() >= this.f2647a.getMaximumPoolSize()) {
                return super.offer(runnable);
            }
            return false;
        }

        public LinkedBlockingQueue4Util(boolean z10) {
            this.f2648b = Integer.MAX_VALUE;
            if (z10) {
                this.f2648b = 0;
            }
        }
    }
}
