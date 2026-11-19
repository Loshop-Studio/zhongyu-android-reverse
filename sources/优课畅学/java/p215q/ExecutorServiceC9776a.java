package p215q;

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

/* renamed from: q.a */
/* loaded from: classes3.dex */
public final class ExecutorServiceC9776a implements ExecutorService {

    /* renamed from: b */
    public static final long f19538b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    public static volatile int f19539c;

    /* renamed from: a */
    public final ExecutorService f19540a;

    /* renamed from: q.a$b */
    public static final class b {

        /* renamed from: a */
        public final boolean f19541a;

        /* renamed from: b */
        public int f19542b;

        /* renamed from: c */
        public int f19543c;

        /* renamed from: d */
        public ThreadFactory f19544d = new c();

        /* renamed from: e */
        public e f19545e = e.f19559d;

        /* renamed from: f */
        public String f19546f;

        /* renamed from: g */
        public long f19547g;

        public b(boolean z10) {
            this.f19541a = z10;
        }

        /* renamed from: a */
        public ExecutorServiceC9776a m18336a() {
            if (TextUtils.isEmpty(this.f19546f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f19546f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f19542b, this.f19543c, this.f19547g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f19544d, this.f19546f, this.f19545e, this.f19541a));
            if (this.f19547g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new ExecutorServiceC9776a(threadPoolExecutor);
        }

        /* renamed from: b */
        public b m18337b(String str) {
            this.f19546f = str;
            return this;
        }

        /* renamed from: c */
        public b m18338c(int i10) {
            this.f19542b = i10;
            this.f19543c = i10;
            return this;
        }
    }

    /* renamed from: q.a$c */
    public static final class c implements ThreadFactory {

        /* renamed from: q.a$c$a */
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

    /* renamed from: q.a$d */
    public static final class d implements ThreadFactory {

        /* renamed from: a */
        public final ThreadFactory f19549a;

        /* renamed from: b */
        public final String f19550b;

        /* renamed from: c */
        public final e f19551c;

        /* renamed from: d */
        public final boolean f19552d;

        /* renamed from: e */
        public final AtomicInteger f19553e = new AtomicInteger();

        /* renamed from: q.a$d$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Runnable f19554a;

            public a(Runnable runnable) {
                this.f19554a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f19552d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f19554a.run();
                } catch (Throwable th) {
                    d.this.f19551c.mo18339a(th);
                }
            }
        }

        public d(ThreadFactory threadFactory, String str, e eVar, boolean z10) {
            this.f19549a = threadFactory;
            this.f19550b = str;
            this.f19551c = eVar;
            this.f19552d = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f19549a.newThread(new a(runnable));
            threadNewThread.setName("glide-" + this.f19550b + "-thread-" + this.f19553e.getAndIncrement());
            return threadNewThread;
        }
    }

    public ExecutorServiceC9776a(ExecutorService executorService) {
        this.f19540a = executorService;
    }

    /* renamed from: a */
    public static int m18327a() {
        return m18328b() >= 4 ? 2 : 1;
    }

    /* renamed from: b */
    public static int m18328b() {
        if (f19539c == 0) {
            f19539c = Math.min(4, AbstractC9777b.m18340a());
        }
        return f19539c;
    }

    /* renamed from: c */
    public static b m18329c() {
        return new b(true).m18338c(m18327a()).m18337b("animation");
    }

    /* renamed from: d */
    public static ExecutorServiceC9776a m18330d() {
        return m18329c().m18336a();
    }

    /* renamed from: e */
    public static b m18331e() {
        return new b(true).m18338c(1).m18337b("disk-cache");
    }

    /* renamed from: f */
    public static ExecutorServiceC9776a m18332f() {
        return m18331e().m18336a();
    }

    /* renamed from: g */
    public static b m18333g() {
        return new b(false).m18338c(m18328b()).m18337b("source");
    }

    /* renamed from: h */
    public static ExecutorServiceC9776a m18334h() {
        return m18333g().m18336a();
    }

    /* renamed from: i */
    public static ExecutorServiceC9776a m18335i() {
        return new ExecutorServiceC9776a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f19538b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f19559d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f19540a.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f19540a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f19540a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f19540a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f19540a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f19540a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f19540a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f19540a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f19540a.submit(runnable);
    }

    public String toString() {
        return this.f19540a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f19540a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f19540a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f19540a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f19540a.submit(callable);
    }

    /* renamed from: q.a$e */
    public interface e {

        /* renamed from: a */
        public static final e f19556a = new a();

        /* renamed from: b */
        public static final e f19557b;

        /* renamed from: c */
        public static final e f19558c;

        /* renamed from: d */
        public static final e f19559d;

        /* renamed from: q.a$e$b */
        public class b implements e {
            @Override // p215q.ExecutorServiceC9776a.e
            /* renamed from: a */
            public void mo18339a(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        /* renamed from: q.a$e$c */
        public class c implements e {
            @Override // p215q.ExecutorServiceC9776a.e
            /* renamed from: a */
            public void mo18339a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f19557b = bVar;
            f19558c = new c();
            f19559d = bVar;
        }

        /* renamed from: a */
        void mo18339a(Throwable th);

        /* renamed from: q.a$e$a */
        public class a implements e {
            @Override // p215q.ExecutorServiceC9776a.e
            /* renamed from: a */
            public void mo18339a(Throwable th) {
            }
        }
    }
}
