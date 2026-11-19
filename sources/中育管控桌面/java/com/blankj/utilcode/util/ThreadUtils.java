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
    public static final Handler f1991a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public static final Map f1992b = new HashMap();

    /* renamed from: c */
    public static final Map f1993c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final int f1994d = Runtime.getRuntime().availableProcessors();

    /* renamed from: e */
    public static final Timer f1995e = new Timer();

    public static final class UtilsThreadFactory extends AtomicLong implements ThreadFactory {

        /* renamed from: d */
        public static final AtomicInteger f1998d = new AtomicInteger(1);

        /* renamed from: a */
        public final String f1999a;

        /* renamed from: b */
        public final int f2000b;

        /* renamed from: c */
        public final boolean f2001c;

        /* renamed from: com.blankj.utilcode.util.ThreadUtils$UtilsThreadFactory$a */
        public class C4624a extends Thread {
            public C4624a(Runnable runnable, String str) {
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
        public class C4625b implements Thread.UncaughtExceptionHandler {
            public C4625b() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                System.out.println(th);
            }
        }

        public UtilsThreadFactory(String str, int i6) {
            this(str, i6, false);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            C4624a c4624a = new C4624a(runnable, this.f1999a + getAndIncrement());
            c4624a.setDaemon(this.f2001c);
            c4624a.setUncaughtExceptionHandler(new C4625b());
            c4624a.setPriority(this.f2000b);
            return c4624a;
        }

        public UtilsThreadFactory(String str, int i6, boolean z6) {
            this.f1999a = str + "-pool-" + f1998d.getAndIncrement() + "-thread-";
            this.f2000b = i6;
            this.f2001c = z6;
        }
    }

    /* renamed from: com.blankj.utilcode.util.ThreadUtils$a */
    public static final class C4626a extends ThreadPoolExecutor {

        /* renamed from: a */
        public final AtomicInteger f2004a;

        /* renamed from: b */
        public LinkedBlockingQueue4Util f2005b;

        public C4626a(int i6, int i7, long j6, TimeUnit timeUnit, LinkedBlockingQueue4Util linkedBlockingQueue4Util, ThreadFactory threadFactory) {
            super(i6, i7, j6, timeUnit, linkedBlockingQueue4Util, threadFactory);
            this.f2004a = new AtomicInteger();
            linkedBlockingQueue4Util.f1996a = this;
            this.f2005b = linkedBlockingQueue4Util;
        }

        /* renamed from: b */
        public static ExecutorService m2078b(int i6, int i7) {
            if (i6 == -8) {
                return new C4626a(ThreadUtils.f1994d + 1, (ThreadUtils.f1994d * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory("cpu", i7));
            }
            if (i6 == -4) {
                return new C4626a((ThreadUtils.f1994d * 2) + 1, (ThreadUtils.f1994d * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("io", i7));
            }
            if (i6 == -2) {
                return new C4626a(0, 128, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory("cached", i7));
            }
            if (i6 == -1) {
                return new C4626a(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("single", i7));
            }
            return new C4626a(i6, i6, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("fixed(" + i6 + ")", i7));
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th) {
            this.f2004a.decrementAndGet();
            super.afterExecute(runnable, th);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (isShutdown()) {
                return;
            }
            this.f2004a.incrementAndGet();
            try {
                super.execute(runnable);
            } catch (RejectedExecutionException unused) {
                Log.e("ThreadUtils", "This will not happen!");
                this.f2005b.offer(runnable);
            } catch (Throwable unused2) {
                this.f2004a.decrementAndGet();
            }
        }
    }

    /* renamed from: b */
    public static ExecutorService m2070b() {
        return m2071c(-2);
    }

    /* renamed from: c */
    public static ExecutorService m2071c(int i6) {
        return m2072d(i6, 5);
    }

    /* renamed from: d */
    public static ExecutorService m2072d(int i6, int i7) {
        ExecutorService executorServiceM2078b;
        Map map = f1992b;
        synchronized (map) {
            try {
                Map map2 = (Map) map.get(Integer.valueOf(i6));
                if (map2 == null) {
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    executorServiceM2078b = C4626a.m2078b(i6, i7);
                    concurrentHashMap.put(Integer.valueOf(i7), executorServiceM2078b);
                    map.put(Integer.valueOf(i6), concurrentHashMap);
                } else {
                    executorServiceM2078b = (ExecutorService) map2.get(Integer.valueOf(i7));
                    if (executorServiceM2078b == null) {
                        executorServiceM2078b = C4626a.m2078b(i6, i7);
                        map2.put(Integer.valueOf(i7), executorServiceM2078b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorServiceM2078b;
    }

    /* renamed from: e */
    public static void m2073e(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            f1991a.post(runnable);
        }
    }

    /* renamed from: f */
    public static void m2074f(Runnable runnable, long j6) {
        f1991a.postDelayed(runnable, j6);
    }

    public static final class LinkedBlockingQueue4Util extends LinkedBlockingQueue<Runnable> {

        /* renamed from: a */
        public volatile C4626a f1996a;

        /* renamed from: b */
        public int f1997b;

        public LinkedBlockingQueue4Util() {
            this.f1997b = Integer.MAX_VALUE;
        }

        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean offer(Runnable runnable) {
            if (this.f1997b > size() || this.f1996a == null || this.f1996a.getPoolSize() >= this.f1996a.getMaximumPoolSize()) {
                return super.offer(runnable);
            }
            return false;
        }

        public LinkedBlockingQueue4Util(boolean z6) {
            this.f1997b = Integer.MAX_VALUE;
            if (z6) {
                this.f1997b = 0;
            }
        }
    }
}
