package p217r0;

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

/* renamed from: r0.a */
/* loaded from: classes3.dex */
public final class ExecutorServiceC8995a implements ExecutorService {

    /* renamed from: b */
    public static final long f15378b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    public static volatile int f15379c;

    /* renamed from: a */
    public final ExecutorService f15380a;

    /* renamed from: r0.a$b */
    public static final class b {

        /* renamed from: a */
        public final boolean f15381a;

        /* renamed from: b */
        public int f15382b;

        /* renamed from: c */
        public int f15383c;

        /* renamed from: d */
        public ThreadFactory f15384d = new c();

        /* renamed from: e */
        public e f15385e = e.f15399d;

        /* renamed from: f */
        public String f15386f;

        /* renamed from: g */
        public long f15387g;

        public b(boolean z9) {
            this.f15381a = z9;
        }

        /* renamed from: a */
        public ExecutorServiceC8995a m15108a() {
            if (TextUtils.isEmpty(this.f15386f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f15386f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f15382b, this.f15383c, this.f15387g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f15384d, this.f15386f, this.f15385e, this.f15381a));
            if (this.f15387g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new ExecutorServiceC8995a(threadPoolExecutor);
        }

        /* renamed from: b */
        public b m15109b(String str) {
            this.f15386f = str;
            return this;
        }

        /* renamed from: c */
        public b m15110c(int i10) {
            this.f15382b = i10;
            this.f15383c = i10;
            return this;
        }
    }

    /* renamed from: r0.a$c */
    public static final class c implements ThreadFactory {

        /* renamed from: r0.a$c$a */
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

    /* renamed from: r0.a$d */
    public static final class d implements ThreadFactory {

        /* renamed from: a */
        public final ThreadFactory f15389a;

        /* renamed from: b */
        public final String f15390b;

        /* renamed from: c */
        public final e f15391c;

        /* renamed from: d */
        public final boolean f15392d;

        /* renamed from: e */
        public final AtomicInteger f15393e = new AtomicInteger();

        /* renamed from: r0.a$d$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Runnable f15394a;

            public a(Runnable runnable) {
                this.f15394a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f15392d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f15394a.run();
                } catch (Throwable th) {
                    d.this.f15391c.mo15111a(th);
                }
            }
        }

        public d(ThreadFactory threadFactory, String str, e eVar, boolean z9) {
            this.f15389a = threadFactory;
            this.f15390b = str;
            this.f15391c = eVar;
            this.f15392d = z9;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f15389a.newThread(new a(runnable));
            threadNewThread.setName("glide-" + this.f15390b + "-thread-" + this.f15393e.getAndIncrement());
            return threadNewThread;
        }
    }

    public ExecutorServiceC8995a(ExecutorService executorService) {
        this.f15380a = executorService;
    }

    /* renamed from: a */
    public static int m15099a() {
        return m15100b() >= 4 ? 2 : 1;
    }

    /* renamed from: b */
    public static int m15100b() {
        if (f15379c == 0) {
            f15379c = Math.min(4, AbstractC8996b.m15112a());
        }
        return f15379c;
    }

    /* renamed from: c */
    public static b m15101c() {
        return new b(true).m15110c(m15099a()).m15109b("animation");
    }

    /* renamed from: d */
    public static ExecutorServiceC8995a m15102d() {
        return m15101c().m15108a();
    }

    /* renamed from: e */
    public static b m15103e() {
        return new b(true).m15110c(1).m15109b("disk-cache");
    }

    /* renamed from: f */
    public static ExecutorServiceC8995a m15104f() {
        return m15103e().m15108a();
    }

    /* renamed from: g */
    public static b m15105g() {
        return new b(false).m15110c(m15100b()).m15109b("source");
    }

    /* renamed from: h */
    public static ExecutorServiceC8995a m15106h() {
        return m15105g().m15108a();
    }

    /* renamed from: i */
    public static ExecutorServiceC8995a m15107i() {
        return new ExecutorServiceC8995a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f15378b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f15399d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f15380a.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f15380a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f15380a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f15380a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f15380a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f15380a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f15380a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f15380a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f15380a.submit(runnable);
    }

    public String toString() {
        return this.f15380a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f15380a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f15380a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f15380a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f15380a.submit(callable);
    }

    /* renamed from: r0.a$e */
    public interface e {

        /* renamed from: a */
        public static final e f15396a = new a();

        /* renamed from: b */
        public static final e f15397b;

        /* renamed from: c */
        public static final e f15398c;

        /* renamed from: d */
        public static final e f15399d;

        /* renamed from: r0.a$e$b */
        public class b implements e {
            @Override // p217r0.ExecutorServiceC8995a.e
            /* renamed from: a */
            public void mo15111a(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        /* renamed from: r0.a$e$c */
        public class c implements e {
            @Override // p217r0.ExecutorServiceC8995a.e
            /* renamed from: a */
            public void mo15111a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f15397b = bVar;
            f15398c = new c();
            f15399d = bVar;
        }

        /* renamed from: a */
        void mo15111a(Throwable th);

        /* renamed from: r0.a$e$a */
        public class a implements e {
            @Override // p217r0.ExecutorServiceC8995a.e
            /* renamed from: a */
            public void mo15111a(Throwable th) {
            }
        }
    }
}
