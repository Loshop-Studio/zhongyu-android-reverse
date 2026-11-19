package com.luck.picture.lib.thread;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public abstract class PictureThreadUtils {

    /* renamed from: a */
    public static final Handler f12572a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public static final Map f12573b = new HashMap();

    /* renamed from: c */
    public static final Map f12574c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final int f12575d = Runtime.getRuntime().availableProcessors();

    /* renamed from: e */
    public static final Timer f12576e = new Timer();

    /* renamed from: f */
    public static Executor f12577f;

    public static final class UtilsThreadFactory extends AtomicLong implements ThreadFactory {

        /* renamed from: f */
        public static final AtomicInteger f12580f = new AtomicInteger(1);

        /* renamed from: c */
        public final String f12581c;

        /* renamed from: d */
        public final int f12582d;

        /* renamed from: e */
        public final boolean f12583e;

        /* renamed from: com.luck.picture.lib.thread.PictureThreadUtils$UtilsThreadFactory$a */
        public class C7499a extends Thread {
            public C7499a(Runnable runnable, String str) {
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

        /* renamed from: com.luck.picture.lib.thread.PictureThreadUtils$UtilsThreadFactory$b */
        public class C7500b implements Thread.UncaughtExceptionHandler {
            public C7500b() {
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
            C7499a c7499a = new C7499a(runnable, this.f12581c + getAndIncrement());
            c7499a.setDaemon(this.f12583e);
            c7499a.setUncaughtExceptionHandler(new C7500b());
            c7499a.setPriority(this.f12582d);
            return c7499a;
        }

        public UtilsThreadFactory(String str, int i10, boolean z10) {
            this.f12581c = str + "-pool-" + f12580f.getAndIncrement() + "-thread-";
            this.f12582d = i10;
            this.f12583e = z10;
        }
    }

    /* renamed from: com.luck.picture.lib.thread.PictureThreadUtils$a */
    public class C7501a extends TimerTask {

        /* renamed from: c */
        public final /* synthetic */ ExecutorService f12586c;

        /* renamed from: d */
        public final /* synthetic */ AbstractRunnableC7505e f12587d;

        public C7501a(ExecutorService executorService, AbstractRunnableC7505e abstractRunnableC7505e) {
            this.f12586c = executorService;
            this.f12587d = abstractRunnableC7505e;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f12586c.execute(this.f12587d);
        }
    }

    /* renamed from: com.luck.picture.lib.thread.PictureThreadUtils$b */
    public class C7502b extends TimerTask {

        /* renamed from: c */
        public final /* synthetic */ ExecutorService f12588c;

        /* renamed from: d */
        public final /* synthetic */ AbstractRunnableC7505e f12589d;

        public C7502b(ExecutorService executorService, AbstractRunnableC7505e abstractRunnableC7505e) {
            this.f12588c = executorService;
            this.f12589d = abstractRunnableC7505e;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f12588c.execute(this.f12589d);
        }
    }

    /* renamed from: com.luck.picture.lib.thread.PictureThreadUtils$c */
    public class ExecutorC7503c implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            PictureThreadUtils.m9590n(runnable);
        }
    }

    /* renamed from: com.luck.picture.lib.thread.PictureThreadUtils$d */
    public static abstract class AbstractC7504d extends AbstractRunnableC7505e {
        @Override // com.luck.picture.lib.thread.PictureThreadUtils.AbstractRunnableC7505e
        /* renamed from: f */
        public void mo9593f() {
            Log.e("ThreadUtils", "onCancel: " + Thread.currentThread());
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.AbstractRunnableC7505e
        /* renamed from: h */
        public void mo9594h(Throwable th) {
            Log.e("ThreadUtils", "onFail: ", th);
        }
    }

    /* renamed from: com.luck.picture.lib.thread.PictureThreadUtils$e */
    public static abstract class AbstractRunnableC7505e implements Runnable {

        /* renamed from: c */
        public final AtomicInteger f12590c = new AtomicInteger(0);

        /* renamed from: d */
        public volatile boolean f12591d;

        /* renamed from: e */
        public volatile Thread f12592e;

        /* renamed from: f */
        public Timer f12593f;

        /* renamed from: g */
        public Executor f12594g;

        /* renamed from: com.luck.picture.lib.thread.PictureThreadUtils$e$a */
        public class a implements Runnable {

            /* renamed from: c */
            public final /* synthetic */ Object f12595c;

            public a(Object obj) {
                this.f12595c = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractRunnableC7505e.this.mo193i(this.f12595c);
            }
        }

        /* renamed from: com.luck.picture.lib.thread.PictureThreadUtils$e$b */
        public class b implements Runnable {

            /* renamed from: c */
            public final /* synthetic */ Object f12597c;

            public b(Object obj) {
                this.f12597c = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractRunnableC7505e.this.mo193i(this.f12597c);
                AbstractRunnableC7505e.this.m9599g();
            }
        }

        /* renamed from: com.luck.picture.lib.thread.PictureThreadUtils$e$c */
        public class c implements Runnable {

            /* renamed from: c */
            public final /* synthetic */ Throwable f12599c;

            public c(Throwable th) {
                this.f12599c = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractRunnableC7505e.this.mo9594h(this.f12599c);
                AbstractRunnableC7505e.this.m9599g();
            }
        }

        /* renamed from: com.luck.picture.lib.thread.PictureThreadUtils$e$d */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractRunnableC7505e.this.mo9593f();
                AbstractRunnableC7505e.this.m9599g();
            }
        }

        /* renamed from: b */
        public void m9596b() {
            m9597c(true);
        }

        /* renamed from: c */
        public void m9597c(boolean z10) {
            synchronized (this.f12590c) {
                try {
                    if (this.f12590c.get() > 1) {
                        return;
                    }
                    this.f12590c.set(4);
                    if (z10 && this.f12592e != null) {
                        this.f12592e.interrupt();
                    }
                    m9598e().execute(new d());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* renamed from: d */
        public abstract Object mo192d();

        /* renamed from: e */
        public final Executor m9598e() {
            Executor executor = this.f12594g;
            return executor == null ? PictureThreadUtils.m9585i() : executor;
        }

        /* renamed from: f */
        public abstract void mo9593f();

        /* renamed from: g */
        public void m9599g() {
            PictureThreadUtils.f12574c.remove(this);
            Timer timer = this.f12593f;
            if (timer != null) {
                timer.cancel();
                this.f12593f = null;
            }
        }

        /* renamed from: h */
        public abstract void mo9594h(Throwable th);

        /* renamed from: i */
        public abstract void mo193i(Object obj);

        /* renamed from: j */
        public final void m9600j(boolean z10) {
            this.f12591d = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f12591d) {
                if (this.f12592e == null) {
                    if (!this.f12590c.compareAndSet(0, 1)) {
                        return;
                    } else {
                        this.f12592e = Thread.currentThread();
                    }
                } else if (this.f12590c.get() != 1) {
                    return;
                }
            } else if (!this.f12590c.compareAndSet(0, 1)) {
                return;
            } else {
                this.f12592e = Thread.currentThread();
            }
            try {
                Object objMo192d = mo192d();
                if (this.f12591d) {
                    if (this.f12590c.get() != 1) {
                        return;
                    }
                    m9598e().execute(new a(objMo192d));
                } else if (this.f12590c.compareAndSet(1, 3)) {
                    m9598e().execute(new b(objMo192d));
                }
            } catch (InterruptedException unused) {
                this.f12590c.compareAndSet(4, 5);
            } catch (Throwable th) {
                if (this.f12590c.compareAndSet(1, 2)) {
                    m9598e().execute(new c(th));
                }
            }
        }
    }

    /* renamed from: com.luck.picture.lib.thread.PictureThreadUtils$f */
    public static final class C7506f extends ThreadPoolExecutor {

        /* renamed from: c */
        public final AtomicInteger f12602c;

        /* renamed from: d */
        public LinkedBlockingQueue4Util f12603d;

        public C7506f(int i10, int i11, long j10, TimeUnit timeUnit, LinkedBlockingQueue4Util linkedBlockingQueue4Util, ThreadFactory threadFactory) {
            super(i10, i11, j10, timeUnit, linkedBlockingQueue4Util, threadFactory);
            this.f12602c = new AtomicInteger();
            linkedBlockingQueue4Util.f12578c = this;
            this.f12603d = linkedBlockingQueue4Util;
        }

        /* renamed from: b */
        public static ExecutorService m9602b(int i10, int i11) {
            if (i10 == -8) {
                return new C7506f(PictureThreadUtils.f12575d + 1, (PictureThreadUtils.f12575d * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory("cpu", i11));
            }
            if (i10 == -4) {
                return new C7506f((PictureThreadUtils.f12575d * 2) + 1, (PictureThreadUtils.f12575d * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("io", i11));
            }
            if (i10 == -2) {
                return new C7506f(0, 128, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory("cached", i11));
            }
            if (i10 == -1) {
                return new C7506f(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("single", i11));
            }
            return new C7506f(i10, i10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("fixed(" + i10 + ")", i11));
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th) {
            this.f12602c.decrementAndGet();
            super.afterExecute(runnable, th);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (isShutdown()) {
                return;
            }
            this.f12602c.incrementAndGet();
            try {
                super.execute(runnable);
            } catch (RejectedExecutionException unused) {
                Log.e("ThreadUtils", "This will not happen!");
                this.f12603d.offer(runnable);
            } catch (Throwable unused2) {
                this.f12602c.decrementAndGet();
            }
        }
    }

    /* renamed from: d */
    public static void m9580d(AbstractRunnableC7505e abstractRunnableC7505e) {
        if (abstractRunnableC7505e == null) {
            return;
        }
        abstractRunnableC7505e.m9596b();
    }

    /* renamed from: e */
    public static void m9581e(ExecutorService executorService) {
        if (!(executorService instanceof C7506f)) {
            Log.e("ThreadUtils", "The executorService is not ThreadUtils's pool.");
            return;
        }
        for (Map.Entry entry : f12574c.entrySet()) {
            if (entry.getValue() == executorService) {
                m9580d((AbstractRunnableC7505e) entry.getKey());
            }
        }
    }

    /* renamed from: f */
    public static void m9582f(ExecutorService executorService, AbstractRunnableC7505e abstractRunnableC7505e) {
        m9583g(executorService, abstractRunnableC7505e, 0L, 0L, null);
    }

    /* renamed from: g */
    public static void m9583g(ExecutorService executorService, AbstractRunnableC7505e abstractRunnableC7505e, long j10, long j11, TimeUnit timeUnit) {
        Map map = f12574c;
        synchronized (map) {
            try {
                if (map.get(abstractRunnableC7505e) != null) {
                    Log.e("ThreadUtils", "Task can only be executed once.");
                    return;
                }
                map.put(abstractRunnableC7505e, executorService);
                if (j11 != 0) {
                    abstractRunnableC7505e.m9600j(true);
                    f12576e.scheduleAtFixedRate(new C7502b(executorService, abstractRunnableC7505e), timeUnit.toMillis(j10), timeUnit.toMillis(j11));
                } else if (j10 == 0) {
                    executorService.execute(abstractRunnableC7505e);
                } else {
                    f12576e.schedule(new C7501a(executorService, abstractRunnableC7505e), timeUnit.toMillis(j10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: h */
    public static void m9584h(AbstractRunnableC7505e abstractRunnableC7505e) {
        m9582f(m9587k(-4), abstractRunnableC7505e);
    }

    /* renamed from: i */
    public static Executor m9585i() {
        if (f12577f == null) {
            f12577f = new ExecutorC7503c();
        }
        return f12577f;
    }

    /* renamed from: j */
    public static ExecutorService m9586j() {
        return m9587k(-4);
    }

    /* renamed from: k */
    public static ExecutorService m9587k(int i10) {
        return m9588l(i10, 5);
    }

    /* renamed from: l */
    public static ExecutorService m9588l(int i10, int i11) {
        ExecutorService executorServiceM9602b;
        Map map = f12573b;
        synchronized (map) {
            try {
                Map map2 = (Map) map.get(Integer.valueOf(i10));
                if (map2 == null) {
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    executorServiceM9602b = C7506f.m9602b(i10, i11);
                    concurrentHashMap.put(Integer.valueOf(i11), executorServiceM9602b);
                    map.put(Integer.valueOf(i10), concurrentHashMap);
                } else {
                    executorServiceM9602b = (ExecutorService) map2.get(Integer.valueOf(i11));
                    if (executorServiceM9602b == null) {
                        executorServiceM9602b = C7506f.m9602b(i10, i11);
                        map2.put(Integer.valueOf(i11), executorServiceM9602b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorServiceM9602b;
    }

    /* renamed from: m */
    public static boolean m9589m() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: n */
    public static void m9590n(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            f12572a.post(runnable);
        }
    }

    public static final class LinkedBlockingQueue4Util extends LinkedBlockingQueue<Runnable> {

        /* renamed from: c */
        public volatile C7506f f12578c;

        /* renamed from: d */
        public int f12579d;

        public LinkedBlockingQueue4Util() {
            this.f12579d = Integer.MAX_VALUE;
        }

        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean offer(Runnable runnable) {
            if (this.f12579d > size() || this.f12578c == null || this.f12578c.getPoolSize() >= this.f12578c.getMaximumPoolSize()) {
                return super.offer(runnable);
            }
            return false;
        }

        public LinkedBlockingQueue4Util(boolean z10) {
            this.f12579d = Integer.MAX_VALUE;
            if (z10) {
                this.f12579d = 0;
            }
        }
    }
}
