package com.blankj.utilcode.util;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.umeng.analytics.pro.C3335ai;
import java.lang.Thread;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class ThreadUtils {
    private static final byte TYPE_CACHED = -2;
    private static final byte TYPE_CPU = -8;
    private static final byte TYPE_IO = -4;
    private static final byte TYPE_SINGLE = -1;
    private static Executor sDeliver;
    private static final Handler HANDLER = new Handler(Looper.getMainLooper());
    private static final Map<Integer, Map<Integer, ExecutorService>> TYPE_PRIORITY_POOLS = new HashMap();
    private static final Map<Task, ExecutorService> TASK_POOL_MAP = new ConcurrentHashMap();
    private static final int CPU_COUNT = Runtime.getRuntime().availableProcessors();
    private static final Timer TIMER = new Timer();

    public static final class LinkedBlockingQueue4Util extends LinkedBlockingQueue<Runnable> {
        private int mCapacity;
        private volatile ThreadPoolExecutor4Util mPool;

        public LinkedBlockingQueue4Util() {
            this.mCapacity = Integer.MAX_VALUE;
        }

        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
        public boolean offer(@NonNull Runnable runnable) {
            if (this.mCapacity > size() || this.mPool == null || this.mPool.getPoolSize() >= this.mPool.getMaximumPoolSize()) {
                return super.offer((LinkedBlockingQueue4Util) runnable);
            }
            return false;
        }

        public LinkedBlockingQueue4Util(boolean z3) {
            this.mCapacity = Integer.MAX_VALUE;
            if (z3) {
                this.mCapacity = 0;
            }
        }

        public LinkedBlockingQueue4Util(int i4) {
            this.mCapacity = i4;
        }
    }

    public static abstract class SimpleTask<T> extends Task<T> {
        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onCancel() {
            Log.e("ThreadUtils", "onCancel: " + Thread.currentThread());
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onFail(Throwable th) {
            Log.e("ThreadUtils", "onFail: ", th);
        }
    }

    public static abstract class Task<T> implements Runnable {
        private static final int CANCELLED = 4;
        private static final int COMPLETING = 3;
        private static final int EXCEPTIONAL = 2;
        private static final int INTERRUPTED = 5;
        private static final int NEW = 0;
        private static final int RUNNING = 1;
        private static final int TIMEOUT = 6;
        private Executor deliver;
        private volatile boolean isSchedule;
        private OnTimeoutListener mTimeoutListener;
        private long mTimeoutMillis;
        private Timer mTimer;
        private volatile Thread runner;
        private final AtomicInteger state = new AtomicInteger(0);

        public interface OnTimeoutListener {
            void onTimeout();
        }

        private Executor getDeliver() {
            Executor executor = this.deliver;
            return executor == null ? ThreadUtils.getGlobalDeliver() : executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSchedule(boolean z3) {
            this.isSchedule = z3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void timeout() {
            synchronized (this.state) {
                if (this.state.get() > 1) {
                    return;
                }
                this.state.set(6);
                if (this.runner != null) {
                    this.runner.interrupt();
                }
            }
        }

        public void cancel() {
            cancel(true);
        }

        public abstract T doInBackground() throws Throwable;

        public boolean isCanceled() {
            return this.state.get() >= 4;
        }

        public boolean isDone() {
            return this.state.get() > 1;
        }

        public abstract void onCancel();

        @CallSuper
        public void onDone() {
            ThreadUtils.TASK_POOL_MAP.remove(this);
            Timer timer = this.mTimer;
            if (timer != null) {
                timer.cancel();
                this.mTimer = null;
                this.mTimeoutListener = null;
            }
        }

        public abstract void onFail(Throwable th);

        public abstract void onSuccess(T t3);

        @Override // java.lang.Runnable
        public void run() {
            if (this.isSchedule) {
                if (this.runner == null) {
                    if (!this.state.compareAndSet(0, 1)) {
                        return;
                    }
                    this.runner = Thread.currentThread();
                    if (this.mTimeoutListener != null) {
                        Log.w("ThreadUtils", "Scheduled task doesn't support timeout.");
                    }
                } else if (this.state.get() != 1) {
                    return;
                }
            } else {
                if (!this.state.compareAndSet(0, 1)) {
                    return;
                }
                this.runner = Thread.currentThread();
                if (this.mTimeoutListener != null) {
                    Timer timer = new Timer();
                    this.mTimer = timer;
                    timer.schedule(new TimerTask() { // from class: com.blankj.utilcode.util.ThreadUtils.Task.1
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            if (Task.this.isDone() || Task.this.mTimeoutListener == null) {
                                return;
                            }
                            Task.this.timeout();
                            Task.this.mTimeoutListener.onTimeout();
                            Task.this.onDone();
                        }
                    }, this.mTimeoutMillis);
                }
            }
            try {
                final T tDoInBackground = doInBackground();
                if (this.isSchedule) {
                    if (this.state.get() != 1) {
                        return;
                    }
                    getDeliver().execute(new Runnable() { // from class: com.blankj.utilcode.util.ThreadUtils.Task.2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public void run() {
                            Task.this.onSuccess(tDoInBackground);
                        }
                    });
                } else if (this.state.compareAndSet(1, 3)) {
                    getDeliver().execute(new Runnable() { // from class: com.blankj.utilcode.util.ThreadUtils.Task.3
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public void run() {
                            Task.this.onSuccess(tDoInBackground);
                            Task.this.onDone();
                        }
                    });
                }
            } catch (InterruptedException unused) {
                this.state.compareAndSet(4, 5);
            } catch (Throwable th) {
                if (this.state.compareAndSet(1, 2)) {
                    getDeliver().execute(new Runnable() { // from class: com.blankj.utilcode.util.ThreadUtils.Task.4
                        @Override // java.lang.Runnable
                        public void run() {
                            Task.this.onFail(th);
                            Task.this.onDone();
                        }
                    });
                }
            }
        }

        public Task<T> setDeliver(Executor executor) {
            this.deliver = executor;
            return this;
        }

        public Task<T> setTimeout(long j4, OnTimeoutListener onTimeoutListener) {
            this.mTimeoutMillis = j4;
            this.mTimeoutListener = onTimeoutListener;
            return this;
        }

        public void cancel(boolean z3) {
            synchronized (this.state) {
                if (this.state.get() > 1) {
                    return;
                }
                this.state.set(4);
                if (z3 && this.runner != null) {
                    this.runner.interrupt();
                }
                getDeliver().execute(new Runnable() { // from class: com.blankj.utilcode.util.ThreadUtils.Task.5
                    @Override // java.lang.Runnable
                    public void run() {
                        Task.this.onCancel();
                        Task.this.onDone();
                    }
                });
            }
        }
    }

    public static final class ThreadPoolExecutor4Util extends ThreadPoolExecutor {
        private final AtomicInteger mSubmittedCount;
        private LinkedBlockingQueue4Util mWorkQueue;

        public ThreadPoolExecutor4Util(int i4, int i5, long j4, TimeUnit timeUnit, LinkedBlockingQueue4Util linkedBlockingQueue4Util, ThreadFactory threadFactory) {
            super(i4, i5, j4, timeUnit, linkedBlockingQueue4Util, threadFactory);
            this.mSubmittedCount = new AtomicInteger();
            linkedBlockingQueue4Util.mPool = this;
            this.mWorkQueue = linkedBlockingQueue4Util;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ExecutorService createPool(int i4, int i5) {
            if (i4 == -8) {
                return new ThreadPoolExecutor4Util(ThreadUtils.CPU_COUNT + 1, (ThreadUtils.CPU_COUNT * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory(C3335ai.f1743w, i5));
            }
            if (i4 == -4) {
                return new ThreadPoolExecutor4Util((ThreadUtils.CPU_COUNT * 2) + 1, (ThreadUtils.CPU_COUNT * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("io", i5));
            }
            if (i4 == -2) {
                return new ThreadPoolExecutor4Util(0, 128, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory("cached", i5));
            }
            if (i4 == -1) {
                return new ThreadPoolExecutor4Util(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("single", i5));
            }
            return new ThreadPoolExecutor4Util(i4, i4, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("fixed(" + i4 + ")", i5));
        }

        private int getSubmittedCount() {
            return this.mSubmittedCount.get();
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th) {
            this.mSubmittedCount.decrementAndGet();
            super.afterExecute(runnable, th);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            if (isShutdown()) {
                return;
            }
            this.mSubmittedCount.incrementAndGet();
            try {
                super.execute(runnable);
            } catch (RejectedExecutionException unused) {
                Log.e("ThreadUtils", "This will not happen!");
                this.mWorkQueue.offer(runnable);
            } catch (Throwable unused2) {
                this.mSubmittedCount.decrementAndGet();
            }
        }
    }

    public static final class UtilsThreadFactory extends AtomicLong implements ThreadFactory {
        private static final AtomicInteger POOL_NUMBER = new AtomicInteger(1);
        private static final long serialVersionUID = -9209200509960368598L;
        private final boolean isDaemon;
        private final String namePrefix;
        private final int priority;

        public UtilsThreadFactory(String str, int i4) {
            this(str, i4, false);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread thread = new Thread(runnable, this.namePrefix + getAndIncrement()) { // from class: com.blankj.utilcode.util.ThreadUtils.UtilsThreadFactory.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        super.run();
                    } catch (Throwable th) {
                        Log.e("ThreadUtils", "Request threw uncaught throwable", th);
                    }
                }
            };
            thread.setDaemon(this.isDaemon);
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.blankj.utilcode.util.ThreadUtils.UtilsThreadFactory.2
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread2, Throwable th) {
                    System.out.println(th);
                }
            });
            thread.setPriority(this.priority);
            return thread;
        }

        public UtilsThreadFactory(String str, int i4, boolean z3) {
            this.namePrefix = str + "-pool-" + POOL_NUMBER.getAndIncrement() + "-thread-";
            this.priority = i4;
            this.isDaemon = z3;
        }
    }

    public static void cancel(Task task) {
        if (task == null) {
            return;
        }
        task.cancel();
    }

    private static <T> void execute(ExecutorService executorService, Task<T> task) {
        execute(executorService, task, 0L, 0L, null);
    }

    private static <T> void executeAtFixedRate(ExecutorService executorService, Task<T> task, long j4, long j5, TimeUnit timeUnit) {
        execute(executorService, task, j4, j5, timeUnit);
    }

    public static <T> void executeByCached(Task<T> task) {
        execute(getPoolByTypeAndPriority(-2), task);
    }

    public static <T> void executeByCachedAtFixRate(Task<T> task, long j4, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-2), task, 0L, j4, timeUnit);
    }

    public static <T> void executeByCachedWithDelay(Task<T> task, long j4, TimeUnit timeUnit) {
        executeWithDelay(getPoolByTypeAndPriority(-2), task, j4, timeUnit);
    }

    public static <T> void executeByCpu(Task<T> task) {
        execute(getPoolByTypeAndPriority(-8), task);
    }

    public static <T> void executeByCpuAtFixRate(Task<T> task, long j4, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-8), task, 0L, j4, timeUnit);
    }

    public static <T> void executeByCpuWithDelay(Task<T> task, long j4, TimeUnit timeUnit) {
        executeWithDelay(getPoolByTypeAndPriority(-8), task, j4, timeUnit);
    }

    public static <T> void executeByCustom(ExecutorService executorService, Task<T> task) {
        execute(executorService, task);
    }

    public static <T> void executeByCustomAtFixRate(ExecutorService executorService, Task<T> task, long j4, TimeUnit timeUnit) {
        executeAtFixedRate(executorService, task, 0L, j4, timeUnit);
    }

    public static <T> void executeByCustomWithDelay(ExecutorService executorService, Task<T> task, long j4, TimeUnit timeUnit) {
        executeWithDelay(executorService, task, j4, timeUnit);
    }

    public static <T> void executeByFixed(@IntRange(from = 1) int i4, Task<T> task) {
        execute(getPoolByTypeAndPriority(i4), task);
    }

    public static <T> void executeByFixedAtFixRate(@IntRange(from = 1) int i4, Task<T> task, long j4, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(i4), task, 0L, j4, timeUnit);
    }

    public static <T> void executeByFixedWithDelay(@IntRange(from = 1) int i4, Task<T> task, long j4, TimeUnit timeUnit) {
        executeWithDelay(getPoolByTypeAndPriority(i4), task, j4, timeUnit);
    }

    public static <T> void executeByIo(Task<T> task) {
        execute(getPoolByTypeAndPriority(-4), task);
    }

    public static <T> void executeByIoAtFixRate(Task<T> task, long j4, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-4), task, 0L, j4, timeUnit);
    }

    public static <T> void executeByIoWithDelay(Task<T> task, long j4, TimeUnit timeUnit) {
        executeWithDelay(getPoolByTypeAndPriority(-4), task, j4, timeUnit);
    }

    public static <T> void executeBySingle(Task<T> task) {
        execute(getPoolByTypeAndPriority(-1), task);
    }

    public static <T> void executeBySingleAtFixRate(Task<T> task, long j4, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-1), task, 0L, j4, timeUnit);
    }

    public static <T> void executeBySingleWithDelay(Task<T> task, long j4, TimeUnit timeUnit) {
        executeWithDelay(getPoolByTypeAndPriority(-1), task, j4, timeUnit);
    }

    private static <T> void executeWithDelay(ExecutorService executorService, Task<T> task, long j4, TimeUnit timeUnit) {
        execute(executorService, task, j4, 0L, timeUnit);
    }

    public static ExecutorService getCachedPool() {
        return getPoolByTypeAndPriority(-2);
    }

    public static ExecutorService getCpuPool() {
        return getPoolByTypeAndPriority(-8);
    }

    public static ExecutorService getFixedPool(@IntRange(from = 1) int i4) {
        return getPoolByTypeAndPriority(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Executor getGlobalDeliver() {
        if (sDeliver == null) {
            sDeliver = new Executor() { // from class: com.blankj.utilcode.util.ThreadUtils.3
                @Override // java.util.concurrent.Executor
                public void execute(@NonNull Runnable runnable) {
                    ThreadUtils.runOnUiThread(runnable);
                }
            };
        }
        return sDeliver;
    }

    public static ExecutorService getIoPool() {
        return getPoolByTypeAndPriority(-4);
    }

    public static Handler getMainHandler() {
        return HANDLER;
    }

    private static ExecutorService getPoolByTypeAndPriority(int i4) {
        return getPoolByTypeAndPriority(i4, 5);
    }

    public static ExecutorService getSinglePool() {
        return getPoolByTypeAndPriority(-1);
    }

    public static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void runOnUiThread(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            HANDLER.post(runnable);
        }
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j4) {
        HANDLER.postDelayed(runnable, j4);
    }

    public static void setDeliver(Executor executor) {
        sDeliver = executor;
    }

    public static void cancel(Task... taskArr) {
        if (taskArr == null || taskArr.length == 0) {
            return;
        }
        for (Task task : taskArr) {
            if (task != null) {
                task.cancel();
            }
        }
    }

    private static <T> void execute(final ExecutorService executorService, final Task<T> task, long j4, long j5, TimeUnit timeUnit) {
        Map<Task, ExecutorService> map = TASK_POOL_MAP;
        synchronized (map) {
            if (map.get(task) != null) {
                Log.e("ThreadUtils", "Task can only be executed once.");
                return;
            }
            map.put(task, executorService);
            if (j5 != 0) {
                task.setSchedule(true);
                TIMER.scheduleAtFixedRate(new TimerTask() { // from class: com.blankj.utilcode.util.ThreadUtils.2
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        executorService.execute(task);
                    }
                }, timeUnit.toMillis(j4), timeUnit.toMillis(j5));
            } else if (j4 == 0) {
                executorService.execute(task);
            } else {
                TIMER.schedule(new TimerTask() { // from class: com.blankj.utilcode.util.ThreadUtils.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        executorService.execute(task);
                    }
                }, timeUnit.toMillis(j4));
            }
        }
    }

    public static <T> void executeByCached(Task<T> task, @IntRange(from = 1, m96to = 10) int i4) {
        execute(getPoolByTypeAndPriority(-2, i4), task);
    }

    public static <T> void executeByCachedAtFixRate(Task<T> task, long j4, TimeUnit timeUnit, @IntRange(from = 1, m96to = 10) int i4) {
        executeAtFixedRate(getPoolByTypeAndPriority(-2, i4), task, 0L, j4, timeUnit);
    }

    public static <T> void executeByCachedWithDelay(Task<T> task, long j4, TimeUnit timeUnit, @IntRange(from = 1, m96to = 10) int i4) {
        executeWithDelay(getPoolByTypeAndPriority(-2, i4), task, j4, timeUnit);
    }

    public static <T> void executeByCpu(Task<T> task, @IntRange(from = 1, m96to = 10) int i4) {
        execute(getPoolByTypeAndPriority(-8, i4), task);
    }

    public static <T> void executeByCpuAtFixRate(Task<T> task, long j4, TimeUnit timeUnit, @IntRange(from = 1, m96to = 10) int i4) {
        executeAtFixedRate(getPoolByTypeAndPriority(-8, i4), task, 0L, j4, timeUnit);
    }

    public static <T> void executeByCpuWithDelay(Task<T> task, long j4, TimeUnit timeUnit, @IntRange(from = 1, m96to = 10) int i4) {
        executeWithDelay(getPoolByTypeAndPriority(-8, i4), task, j4, timeUnit);
    }

    public static <T> void executeByCustomAtFixRate(ExecutorService executorService, Task<T> task, long j4, long j5, TimeUnit timeUnit) {
        executeAtFixedRate(executorService, task, j4, j5, timeUnit);
    }

    public static <T> void executeByFixed(@IntRange(from = 1) int i4, Task<T> task, @IntRange(from = 1, m96to = 10) int i5) {
        execute(getPoolByTypeAndPriority(i4, i5), task);
    }

    public static <T> void executeByFixedAtFixRate(@IntRange(from = 1) int i4, Task<T> task, long j4, TimeUnit timeUnit, @IntRange(from = 1, m96to = 10) int i5) {
        executeAtFixedRate(getPoolByTypeAndPriority(i4, i5), task, 0L, j4, timeUnit);
    }

    public static <T> void executeByFixedWithDelay(@IntRange(from = 1) int i4, Task<T> task, long j4, TimeUnit timeUnit, @IntRange(from = 1, m96to = 10) int i5) {
        executeWithDelay(getPoolByTypeAndPriority(i4, i5), task, j4, timeUnit);
    }

    public static <T> void executeByIo(Task<T> task, @IntRange(from = 1, m96to = 10) int i4) {
        execute(getPoolByTypeAndPriority(-4, i4), task);
    }

    public static <T> void executeByIoAtFixRate(Task<T> task, long j4, TimeUnit timeUnit, @IntRange(from = 1, m96to = 10) int i4) {
        executeAtFixedRate(getPoolByTypeAndPriority(-4, i4), task, 0L, j4, timeUnit);
    }

    public static <T> void executeByIoWithDelay(Task<T> task, long j4, TimeUnit timeUnit, @IntRange(from = 1, m96to = 10) int i4) {
        executeWithDelay(getPoolByTypeAndPriority(-4, i4), task, j4, timeUnit);
    }

    public static <T> void executeBySingle(Task<T> task, @IntRange(from = 1, m96to = 10) int i4) {
        execute(getPoolByTypeAndPriority(-1, i4), task);
    }

    public static <T> void executeBySingleAtFixRate(Task<T> task, long j4, TimeUnit timeUnit, @IntRange(from = 1, m96to = 10) int i4) {
        executeAtFixedRate(getPoolByTypeAndPriority(-1, i4), task, 0L, j4, timeUnit);
    }

    public static <T> void executeBySingleWithDelay(Task<T> task, long j4, TimeUnit timeUnit, @IntRange(from = 1, m96to = 10) int i4) {
        executeWithDelay(getPoolByTypeAndPriority(-1, i4), task, j4, timeUnit);
    }

    public static ExecutorService getCachedPool(@IntRange(from = 1, m96to = 10) int i4) {
        return getPoolByTypeAndPriority(-2, i4);
    }

    public static ExecutorService getCpuPool(@IntRange(from = 1, m96to = 10) int i4) {
        return getPoolByTypeAndPriority(-8, i4);
    }

    public static ExecutorService getFixedPool(@IntRange(from = 1) int i4, @IntRange(from = 1, m96to = 10) int i5) {
        return getPoolByTypeAndPriority(i4, i5);
    }

    public static ExecutorService getIoPool(@IntRange(from = 1, m96to = 10) int i4) {
        return getPoolByTypeAndPriority(-4, i4);
    }

    private static ExecutorService getPoolByTypeAndPriority(int i4, int i5) {
        ExecutorService executorServiceCreatePool;
        Map<Integer, Map<Integer, ExecutorService>> map = TYPE_PRIORITY_POOLS;
        synchronized (map) {
            Map<Integer, ExecutorService> map2 = map.get(Integer.valueOf(i4));
            if (map2 == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                executorServiceCreatePool = ThreadPoolExecutor4Util.createPool(i4, i5);
                concurrentHashMap.put(Integer.valueOf(i5), executorServiceCreatePool);
                map.put(Integer.valueOf(i4), concurrentHashMap);
            } else {
                executorServiceCreatePool = map2.get(Integer.valueOf(i5));
                if (executorServiceCreatePool == null) {
                    executorServiceCreatePool = ThreadPoolExecutor4Util.createPool(i4, i5);
                    map2.put(Integer.valueOf(i5), executorServiceCreatePool);
                }
            }
        }
        return executorServiceCreatePool;
    }

    public static ExecutorService getSinglePool(@IntRange(from = 1, m96to = 10) int i4) {
        return getPoolByTypeAndPriority(-1, i4);
    }

    public static <T> void executeByCachedAtFixRate(Task<T> task, long j4, long j5, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-2), task, j4, j5, timeUnit);
    }

    public static <T> void executeByCpuAtFixRate(Task<T> task, long j4, long j5, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-8), task, j4, j5, timeUnit);
    }

    public static <T> void executeByFixedAtFixRate(@IntRange(from = 1) int i4, Task<T> task, long j4, long j5, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(i4), task, j4, j5, timeUnit);
    }

    public static <T> void executeByIoAtFixRate(Task<T> task, long j4, long j5, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-4), task, j4, j5, timeUnit);
    }

    public static <T> void executeBySingleAtFixRate(Task<T> task, long j4, long j5, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-1), task, j4, j5, timeUnit);
    }

    public static class SyncValue<T> {
        private T mValue;
        private CountDownLatch mLatch = new CountDownLatch(1);
        private AtomicBoolean mFlag = new AtomicBoolean();

        public T getValue() throws InterruptedException {
            if (!this.mFlag.get()) {
                try {
                    this.mLatch.await();
                } catch (InterruptedException e4) {
                    e4.printStackTrace();
                }
            }
            return this.mValue;
        }

        public void setValue(T t3) {
            if (this.mFlag.compareAndSet(false, true)) {
                this.mValue = t3;
                this.mLatch.countDown();
            }
        }

        public T getValue(long j4, TimeUnit timeUnit, T t3) throws InterruptedException {
            if (!this.mFlag.get()) {
                try {
                    this.mLatch.await(j4, timeUnit);
                } catch (InterruptedException e4) {
                    e4.printStackTrace();
                    return t3;
                }
            }
            return this.mValue;
        }
    }

    public static <T> void executeByCachedAtFixRate(Task<T> task, long j4, long j5, TimeUnit timeUnit, @IntRange(from = 1, m96to = 10) int i4) {
        executeAtFixedRate(getPoolByTypeAndPriority(-2, i4), task, j4, j5, timeUnit);
    }

    public static <T> void executeByCpuAtFixRate(Task<T> task, long j4, long j5, TimeUnit timeUnit, @IntRange(from = 1, m96to = 10) int i4) {
        executeAtFixedRate(getPoolByTypeAndPriority(-8, i4), task, j4, j5, timeUnit);
    }

    public static <T> void executeByFixedAtFixRate(@IntRange(from = 1) int i4, Task<T> task, long j4, long j5, TimeUnit timeUnit, @IntRange(from = 1, m96to = 10) int i5) {
        executeAtFixedRate(getPoolByTypeAndPriority(i4, i5), task, j4, j5, timeUnit);
    }

    public static <T> void executeByIoAtFixRate(Task<T> task, long j4, long j5, TimeUnit timeUnit, @IntRange(from = 1, m96to = 10) int i4) {
        executeAtFixedRate(getPoolByTypeAndPriority(-4, i4), task, j4, j5, timeUnit);
    }

    public static <T> void executeBySingleAtFixRate(Task<T> task, long j4, long j5, TimeUnit timeUnit, @IntRange(from = 1, m96to = 10) int i4) {
        executeAtFixedRate(getPoolByTypeAndPriority(-1, i4), task, j4, j5, timeUnit);
    }

    public static void cancel(List<Task> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (Task task : list) {
            if (task != null) {
                task.cancel();
            }
        }
    }

    public static void cancel(ExecutorService executorService) {
        if (executorService instanceof ThreadPoolExecutor4Util) {
            for (Map.Entry<Task, ExecutorService> entry : TASK_POOL_MAP.entrySet()) {
                if (entry.getValue() == executorService) {
                    cancel(entry.getKey());
                }
            }
            return;
        }
        Log.e("ThreadUtils", "The executorService is not ThreadUtils's pool.");
    }
}
