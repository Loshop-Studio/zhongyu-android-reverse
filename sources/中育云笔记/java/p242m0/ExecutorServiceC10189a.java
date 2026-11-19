package p242m0;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: m0.a */
/* loaded from: classes3.dex */
public final class ExecutorServiceC10189a implements ExecutorService {

    /* renamed from: d */
    public static final long f24235d = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: e */
    public static volatile int f24236e;

    /* renamed from: c */
    public final ExecutorService f24237c;

    /* renamed from: m0.a$b */
    public static final class b {

        /* renamed from: a */
        public final boolean f24238a;

        /* renamed from: b */
        public int f24239b;

        /* renamed from: c */
        public int f24240c;

        /* renamed from: d */
        public ThreadFactory f24241d = new c();

        /* renamed from: e */
        public e f24242e = e.f24256d;

        /* renamed from: f */
        public String f24243f;

        /* renamed from: g */
        public long f24244g;

        public b(boolean z10) {
            this.f24238a = z10;
        }

        /* renamed from: a */
        public ExecutorServiceC10189a m21270a() {
            if (TextUtils.isEmpty(this.f24243f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f24243f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f24239b, this.f24240c, this.f24244g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f24241d, this.f24243f, this.f24242e, this.f24238a));
            if (this.f24244g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new ExecutorServiceC10189a(threadPoolExecutor);
        }

        /* renamed from: b */
        public b m21271b(String str) {
            this.f24243f = str;
            return this;
        }

        /* renamed from: c */
        public b m21272c(int i10) {
            this.f24239b = i10;
            this.f24240c = i10;
            return this;
        }
    }

    /* renamed from: m0.a$c */
    public static final class c implements ThreadFactory {

        /* renamed from: m0.a$c$a */
        public class a extends Thread {
            public a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        public c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new a(runnable);
        }
    }

    /* renamed from: m0.a$d */
    public static final class d implements ThreadFactory {

        /* renamed from: c */
        public final ThreadFactory f24246c;

        /* renamed from: d */
        public final String f24247d;

        /* renamed from: e */
        public final e f24248e;

        /* renamed from: f */
        public final boolean f24249f;

        /* renamed from: g */
        public final AtomicInteger f24250g = new AtomicInteger();

        /* renamed from: m0.a$d$a */
        public class a implements Runnable {

            /* renamed from: c */
            public final /* synthetic */ Runnable f24251c;

            public a(Runnable runnable) {
                this.f24251c = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f24249f) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f24251c.run();
                } catch (Throwable th) {
                    d.this.f24248e.mo21273a(th);
                }
            }
        }

        public d(ThreadFactory threadFactory, String str, e eVar, boolean z10) {
            this.f24246c = threadFactory;
            this.f24247d = str;
            this.f24248e = eVar;
            this.f24249f = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f24246c.newThread(new a(runnable));
            threadNewThread.setName("glide-" + this.f24247d + "-thread-" + this.f24250g.getAndIncrement());
            return threadNewThread;
        }
    }

    public ExecutorServiceC10189a(ExecutorService executorService) {
        this.f24237c = executorService;
    }

    /* renamed from: a */
    public static int m21261a() {
        return m21262b() >= 4 ? 2 : 1;
    }

    /* renamed from: b */
    public static int m21262b() {
        if (f24236e == 0) {
            f24236e = Math.min(4, AbstractC10190b.m21274a());
        }
        return f24236e;
    }

    /* renamed from: c */
    public static b m21263c() {
        return new b(true).m21272c(m21261a()).m21271b("animation");
    }

    /* renamed from: d */
    public static ExecutorServiceC10189a m21264d() {
        return m21263c().m21270a();
    }

    /* renamed from: e */
    public static b m21265e() {
        return new b(true).m21272c(1).m21271b("disk-cache");
    }

    /* renamed from: f */
    public static ExecutorServiceC10189a m21266f() {
        return m21265e().m21270a();
    }

    /* renamed from: g */
    public static b m21267g() {
        return new b(false).m21272c(m21262b()).m21271b("source");
    }

    /* renamed from: h */
    public static ExecutorServiceC10189a m21268h() {
        return m21267g().m21270a();
    }

    /* renamed from: i */
    public static ExecutorServiceC10189a m21269i() {
        return new ExecutorServiceC10189a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f24235d, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f24256d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f24237c.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f24237c.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f24237c.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f24237c.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f24237c.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f24237c.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f24237c.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f24237c.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f24237c.submit(runnable);
    }

    public String toString() {
        return this.f24237c.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f24237c.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f24237c.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f24237c.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f24237c.submit(callable);
    }

    /* renamed from: m0.a$e */
    public interface e {

        /* renamed from: a */
        public static final e f24253a = new a();

        /* renamed from: b */
        public static final e f24254b;

        /* renamed from: c */
        public static final e f24255c;

        /* renamed from: d */
        public static final e f24256d;

        /* renamed from: m0.a$e$b */
        public class b implements e {
            @Override // p242m0.ExecutorServiceC10189a.e
            /* renamed from: a */
            public void mo21273a(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        /* renamed from: m0.a$e$c */
        public class c implements e {
            @Override // p242m0.ExecutorServiceC10189a.e
            /* renamed from: a */
            public void mo21273a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f24254b = bVar;
            f24255c = new c();
            f24256d = bVar;
        }

        /* renamed from: a */
        void mo21273a(Throwable th);

        /* renamed from: m0.a$e$a */
        public class a implements e {
            @Override // p242m0.ExecutorServiceC10189a.e
            /* renamed from: a */
            public void mo21273a(Throwable th) {
            }
        }
    }
}
