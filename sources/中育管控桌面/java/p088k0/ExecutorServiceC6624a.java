package p088k0;

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

/* renamed from: k0.a */
/* loaded from: classes3.dex */
public final class ExecutorServiceC6624a implements ExecutorService {

    /* renamed from: b */
    public static final long f8660b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    public static volatile int f8661c;

    /* renamed from: a */
    public final ExecutorService f8662a;

    /* renamed from: k0.a$b */
    public static final class b {

        /* renamed from: a */
        public final boolean f8663a;

        /* renamed from: b */
        public int f8664b;

        /* renamed from: c */
        public int f8665c;

        /* renamed from: d */
        public ThreadFactory f8666d = new c();

        /* renamed from: e */
        public e f8667e = e.f8681d;

        /* renamed from: f */
        public String f8668f;

        /* renamed from: g */
        public long f8669g;

        public b(boolean z6) {
            this.f8663a = z6;
        }

        /* renamed from: a */
        public ExecutorServiceC6624a m7598a() {
            if (TextUtils.isEmpty(this.f8668f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f8668f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f8664b, this.f8665c, this.f8669g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f8666d, this.f8668f, this.f8667e, this.f8663a));
            if (this.f8669g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new ExecutorServiceC6624a(threadPoolExecutor);
        }

        /* renamed from: b */
        public b m7599b(String str) {
            this.f8668f = str;
            return this;
        }

        /* renamed from: c */
        public b m7600c(int i6) {
            this.f8664b = i6;
            this.f8665c = i6;
            return this;
        }
    }

    /* renamed from: k0.a$c */
    public static final class c implements ThreadFactory {

        /* renamed from: k0.a$c$a */
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

    /* renamed from: k0.a$d */
    public static final class d implements ThreadFactory {

        /* renamed from: a */
        public final ThreadFactory f8671a;

        /* renamed from: b */
        public final String f8672b;

        /* renamed from: c */
        public final e f8673c;

        /* renamed from: d */
        public final boolean f8674d;

        /* renamed from: e */
        public final AtomicInteger f8675e = new AtomicInteger();

        /* renamed from: k0.a$d$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Runnable f8676a;

            public a(Runnable runnable) {
                this.f8676a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f8674d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f8676a.run();
                } catch (Throwable th) {
                    d.this.f8673c.mo7601a(th);
                }
            }
        }

        public d(ThreadFactory threadFactory, String str, e eVar, boolean z6) {
            this.f8671a = threadFactory;
            this.f8672b = str;
            this.f8673c = eVar;
            this.f8674d = z6;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f8671a.newThread(new a(runnable));
            threadNewThread.setName("glide-" + this.f8672b + "-thread-" + this.f8675e.getAndIncrement());
            return threadNewThread;
        }
    }

    public ExecutorServiceC6624a(ExecutorService executorService) {
        this.f8662a = executorService;
    }

    /* renamed from: a */
    public static int m7589a() {
        return m7590b() >= 4 ? 2 : 1;
    }

    /* renamed from: b */
    public static int m7590b() {
        if (f8661c == 0) {
            f8661c = Math.min(4, AbstractC6625b.m7602a());
        }
        return f8661c;
    }

    /* renamed from: c */
    public static b m7591c() {
        return new b(true).m7600c(m7589a()).m7599b("animation");
    }

    /* renamed from: d */
    public static ExecutorServiceC6624a m7592d() {
        return m7591c().m7598a();
    }

    /* renamed from: e */
    public static b m7593e() {
        return new b(true).m7600c(1).m7599b("disk-cache");
    }

    /* renamed from: f */
    public static ExecutorServiceC6624a m7594f() {
        return m7593e().m7598a();
    }

    /* renamed from: g */
    public static b m7595g() {
        return new b(false).m7600c(m7590b()).m7599b("source");
    }

    /* renamed from: h */
    public static ExecutorServiceC6624a m7596h() {
        return m7595g().m7598a();
    }

    /* renamed from: i */
    public static ExecutorServiceC6624a m7597i() {
        return new ExecutorServiceC6624a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f8660b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f8681d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j6, TimeUnit timeUnit) {
        return this.f8662a.awaitTermination(j6, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f8662a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f8662a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f8662a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f8662a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f8662a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f8662a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f8662a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f8662a.submit(runnable);
    }

    public String toString() {
        return this.f8662a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j6, TimeUnit timeUnit) {
        return this.f8662a.invokeAll(collection, j6, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j6, TimeUnit timeUnit) {
        return this.f8662a.invokeAny(collection, j6, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f8662a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f8662a.submit(callable);
    }

    /* renamed from: k0.a$e */
    public interface e {

        /* renamed from: a */
        public static final e f8678a = new a();

        /* renamed from: b */
        public static final e f8679b;

        /* renamed from: c */
        public static final e f8680c;

        /* renamed from: d */
        public static final e f8681d;

        /* renamed from: k0.a$e$b */
        public class b implements e {
            @Override // p088k0.ExecutorServiceC6624a.e
            /* renamed from: a */
            public void mo7601a(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        /* renamed from: k0.a$e$c */
        public class c implements e {
            @Override // p088k0.ExecutorServiceC6624a.e
            /* renamed from: a */
            public void mo7601a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f8679b = bVar;
            f8680c = new c();
            f8681d = bVar;
        }

        /* renamed from: a */
        void mo7601a(Throwable th);

        /* renamed from: k0.a$e$a */
        public class a implements e {
            @Override // p088k0.ExecutorServiceC6624a.e
            /* renamed from: a */
            public void mo7601a(Throwable th) {
            }
        }
    }
}
