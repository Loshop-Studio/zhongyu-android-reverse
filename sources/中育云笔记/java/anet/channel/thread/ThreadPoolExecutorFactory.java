package anet.channel.thread;

import androidx.autofill.HintConstants;
import anet.channel.util.ALog;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class ThreadPoolExecutorFactory {

    /* renamed from: a */
    private static ScheduledThreadPoolExecutor f2727a = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC5078b("AWCN Scheduler"));

    /* renamed from: b */
    private static ThreadPoolExecutor f2728b;

    /* renamed from: c */
    private static ThreadPoolExecutor f2729c;

    /* renamed from: d */
    private static ThreadPoolExecutor f2730d;

    /* renamed from: e */
    private static ThreadPoolExecutor f2731e;

    /* renamed from: f */
    private static ThreadPoolExecutor f2732f;

    /* renamed from: g */
    private static ThreadPoolExecutor f2733g;

    /* renamed from: h */
    private static ThreadPoolExecutor f2734h;

    public static class Priority {
        public static int HIGH = 0;
        public static int LOW = 9;
        public static int NORMAL = 1;
    }

    /* renamed from: anet.channel.thread.ThreadPoolExecutorFactory$a */
    public static class RunnableC5077a implements Comparable<RunnableC5077a>, Runnable {

        /* renamed from: a */
        Runnable f2735a;

        /* renamed from: b */
        int f2736b;

        /* renamed from: c */
        long f2737c;

        public RunnableC5077a(Runnable runnable, int i10) {
            this.f2735a = null;
            this.f2736b = 0;
            this.f2737c = System.currentTimeMillis();
            this.f2735a = runnable;
            this.f2736b = i10;
            this.f2737c = System.currentTimeMillis();
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(RunnableC5077a runnableC5077a) {
            int i10 = this.f2736b;
            int i11 = runnableC5077a.f2736b;
            return i10 != i11 ? i10 - i11 : (int) (runnableC5077a.f2737c - this.f2737c);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2735a.run();
        }
    }

    /* renamed from: anet.channel.thread.ThreadPoolExecutorFactory$b */
    public static class ThreadFactoryC5078b implements ThreadFactory {

        /* renamed from: a */
        AtomicInteger f2738a = new AtomicInteger(0);

        /* renamed from: b */
        String f2739b;

        public ThreadFactoryC5078b(String str) {
            this.f2739b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f2739b + this.f2738a.incrementAndGet());
            ALog.m2530i("awcn.ThreadPoolExecutorFactory", "thread created!", null, HintConstants.AUTOFILL_HINT_NAME, thread.getName());
            thread.setPriority(5);
            return thread;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f2728b = new ThreadPoolExecutor(2, 2, 60L, timeUnit, new LinkedBlockingDeque(), new ThreadFactoryC5078b("AWCN Worker(H)"));
        f2729c = new C5079a(16, 16, 60L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC5078b("AWCN Worker(M)"));
        f2730d = new ThreadPoolExecutor(2, 2, 60L, timeUnit, new LinkedBlockingDeque(), new ThreadFactoryC5078b("AWCN Worker(L)"));
        f2731e = new ThreadPoolExecutor(32, 32, 60L, timeUnit, new LinkedBlockingDeque(), new ThreadFactoryC5078b("AWCN Worker(Backup)"));
        f2732f = new ThreadPoolExecutor(1, 1, 30L, timeUnit, new LinkedBlockingDeque(), new ThreadFactoryC5078b("AWCN Detector"));
        f2733g = new ThreadPoolExecutor(1, 1, 30L, timeUnit, new LinkedBlockingDeque(), new ThreadFactoryC5078b("AWCN HR"));
        f2734h = new ThreadPoolExecutor(1, 1, 30L, timeUnit, new LinkedBlockingDeque(), new ThreadFactoryC5078b("AWCN Cookie"));
        f2728b.allowCoreThreadTimeOut(true);
        f2729c.allowCoreThreadTimeOut(true);
        f2730d.allowCoreThreadTimeOut(true);
        f2731e.allowCoreThreadTimeOut(true);
        f2732f.allowCoreThreadTimeOut(true);
        f2733g.allowCoreThreadTimeOut(true);
        f2734h.allowCoreThreadTimeOut(true);
    }

    public static void removeScheduleTask(Runnable runnable) {
        f2727a.remove(runnable);
    }

    public static synchronized void setNormalExecutorPoolSize(int i10) {
        if (i10 < 6) {
            i10 = 6;
        }
        f2729c.setCorePoolSize(i10);
        f2729c.setMaximumPoolSize(i10);
    }

    public static Future<?> submitBackupTask(Runnable runnable) {
        return f2731e.submit(runnable);
    }

    public static Future<?> submitCookieMonitor(Runnable runnable) {
        return f2734h.submit(runnable);
    }

    public static Future<?> submitDetectTask(Runnable runnable) {
        return f2732f.submit(runnable);
    }

    public static Future<?> submitHRTask(Runnable runnable) {
        return f2733g.submit(runnable);
    }

    public static Future<?> submitPriorityTask(Runnable runnable, int i10) {
        if (ALog.isPrintLog(1)) {
            ALog.m2527d("awcn.ThreadPoolExecutorFactory", "submit priority task", null, "priority", Integer.valueOf(i10));
        }
        if (i10 < Priority.HIGH || i10 > Priority.LOW) {
            i10 = Priority.LOW;
        }
        return i10 == Priority.HIGH ? f2728b.submit(runnable) : i10 == Priority.LOW ? f2730d.submit(runnable) : f2729c.submit(new RunnableC5077a(runnable, i10));
    }

    public static Future<?> submitScheduledTask(Runnable runnable) {
        return f2727a.submit(runnable);
    }

    public static Future<?> submitScheduledTask(Runnable runnable, long j10, TimeUnit timeUnit) {
        return f2727a.schedule(runnable, j10, timeUnit);
    }
}
