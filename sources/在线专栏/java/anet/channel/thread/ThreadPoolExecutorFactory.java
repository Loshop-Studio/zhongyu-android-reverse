package anet.channel.thread;

import anet.channel.util.ALog;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ThreadPoolExecutorFactory {

    /* renamed from: a */
    private static ScheduledThreadPoolExecutor f5449a = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0955b("AWCN Scheduler"));

    /* renamed from: b */
    private static ThreadPoolExecutor f5450b;

    /* renamed from: c */
    private static ThreadPoolExecutor f5451c;

    /* renamed from: d */
    private static ThreadPoolExecutor f5452d;

    /* renamed from: e */
    private static ThreadPoolExecutor f5453e;

    /* renamed from: f */
    private static ThreadPoolExecutor f5454f;

    /* renamed from: g */
    private static ThreadPoolExecutor f5455g;

    /* renamed from: h */
    private static ThreadPoolExecutor f5456h;

    public static class Priority {
        public static int HIGH = 0;
        public static int LOW = 9;
        public static int NORMAL = 1;
    }

    /* renamed from: anet.channel.thread.ThreadPoolExecutorFactory$a */
    static class RunnableC0954a implements Comparable<RunnableC0954a>, Runnable {

        /* renamed from: a */
        Runnable f5457a;

        /* renamed from: b */
        int f5458b;

        /* renamed from: c */
        long f5459c;

        public RunnableC0954a(Runnable runnable, int i4) {
            this.f5457a = null;
            this.f5458b = 0;
            this.f5459c = System.currentTimeMillis();
            this.f5457a = runnable;
            this.f5458b = i4;
            this.f5459c = System.currentTimeMillis();
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(RunnableC0954a runnableC0954a) {
            int i4 = this.f5458b;
            int i5 = runnableC0954a.f5458b;
            return i4 != i5 ? i4 - i5 : (int) (runnableC0954a.f5459c - this.f5459c);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5457a.run();
        }
    }

    /* renamed from: anet.channel.thread.ThreadPoolExecutorFactory$b */
    private static class ThreadFactoryC0955b implements ThreadFactory {

        /* renamed from: a */
        AtomicInteger f5460a = new AtomicInteger(0);

        /* renamed from: b */
        String f5461b;

        ThreadFactoryC0955b(String str) {
            this.f5461b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f5461b + this.f5460a.incrementAndGet());
            ALog.m4639i("awcn.ThreadPoolExecutorFactory", "thread created!", null, "name", thread.getName());
            thread.setPriority(5);
            return thread;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f5450b = new ThreadPoolExecutor(2, 2, 60L, timeUnit, new LinkedBlockingDeque(), new ThreadFactoryC0955b("AWCN Worker(H)"));
        f5451c = new C0956a(16, 16, 60L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC0955b("AWCN Worker(M)"));
        f5452d = new ThreadPoolExecutor(2, 2, 60L, timeUnit, new LinkedBlockingDeque(), new ThreadFactoryC0955b("AWCN Worker(L)"));
        f5453e = new ThreadPoolExecutor(32, 32, 60L, timeUnit, new LinkedBlockingDeque(), new ThreadFactoryC0955b("AWCN Worker(Backup)"));
        f5454f = new ThreadPoolExecutor(1, 1, 30L, timeUnit, new LinkedBlockingDeque(), new ThreadFactoryC0955b("AWCN Detector"));
        f5455g = new ThreadPoolExecutor(1, 1, 30L, timeUnit, new LinkedBlockingDeque(), new ThreadFactoryC0955b("AWCN HR"));
        f5456h = new ThreadPoolExecutor(1, 1, 30L, timeUnit, new LinkedBlockingDeque(), new ThreadFactoryC0955b("AWCN Cookie"));
        f5450b.allowCoreThreadTimeOut(true);
        f5451c.allowCoreThreadTimeOut(true);
        f5452d.allowCoreThreadTimeOut(true);
        f5453e.allowCoreThreadTimeOut(true);
        f5454f.allowCoreThreadTimeOut(true);
        f5455g.allowCoreThreadTimeOut(true);
        f5456h.allowCoreThreadTimeOut(true);
    }

    public static void removeScheduleTask(Runnable runnable) {
        f5449a.remove(runnable);
    }

    public static synchronized void setNormalExecutorPoolSize(int i4) {
        if (i4 < 6) {
            i4 = 6;
        }
        f5451c.setCorePoolSize(i4);
        f5451c.setMaximumPoolSize(i4);
    }

    public static Future<?> submitBackupTask(Runnable runnable) {
        return f5453e.submit(runnable);
    }

    public static Future<?> submitCookieMonitor(Runnable runnable) {
        return f5456h.submit(runnable);
    }

    public static Future<?> submitDetectTask(Runnable runnable) {
        return f5454f.submit(runnable);
    }

    public static Future<?> submitHRTask(Runnable runnable) {
        return f5455g.submit(runnable);
    }

    public static Future<?> submitPriorityTask(Runnable runnable, int i4) {
        if (ALog.isPrintLog(1)) {
            ALog.m4636d("awcn.ThreadPoolExecutorFactory", "submit priority task", null, "priority", Integer.valueOf(i4));
        }
        if (i4 < Priority.HIGH || i4 > Priority.LOW) {
            i4 = Priority.LOW;
        }
        return i4 == Priority.HIGH ? f5450b.submit(runnable) : i4 == Priority.LOW ? f5452d.submit(runnable) : f5451c.submit(new RunnableC0954a(runnable, i4));
    }

    public static Future<?> submitScheduledTask(Runnable runnable) {
        return f5449a.submit(runnable);
    }

    public static Future<?> submitScheduledTask(Runnable runnable, long j4, TimeUnit timeUnit) {
        return f5449a.schedule(runnable, j4, timeUnit);
    }
}
