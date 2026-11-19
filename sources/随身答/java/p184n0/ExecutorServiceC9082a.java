package p184n0;

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

/* renamed from: n0.a */
/* loaded from: classes3.dex */
public final class ExecutorServiceC9082a implements ExecutorService {

    /* renamed from: b */
    public static final long f15273b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    public static volatile int f15274c;

    /* renamed from: a */
    public final ExecutorService f15275a;

    /* renamed from: n0.a$a */
    public static final class a {

        /* renamed from: a */
        public final boolean f15276a;

        /* renamed from: b */
        public int f15277b;

        /* renamed from: c */
        public int f15278c;

        /* renamed from: d */
        public c f15279d = c.f15290d;

        /* renamed from: e */
        public String f15280e;

        /* renamed from: f */
        public long f15281f;

        public a(boolean z9) {
            this.f15276a = z9;
        }

        /* renamed from: a */
        public ExecutorServiceC9082a m14572a() {
            if (TextUtils.isEmpty(this.f15280e)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f15280e);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f15277b, this.f15278c, this.f15281f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new b(this.f15280e, this.f15279d, this.f15276a));
            if (this.f15281f != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new ExecutorServiceC9082a(threadPoolExecutor);
        }

        /* renamed from: b */
        public a m14573b(String str) {
            this.f15280e = str;
            return this;
        }

        /* renamed from: c */
        public a m14574c(int i9) {
            this.f15277b = i9;
            this.f15278c = i9;
            return this;
        }
    }

    /* renamed from: n0.a$b */
    public static final class b implements ThreadFactory {

        /* renamed from: a */
        public final String f15282a;

        /* renamed from: b */
        public final c f15283b;

        /* renamed from: c */
        public final boolean f15284c;

        /* renamed from: d */
        public int f15285d;

        /* renamed from: n0.a$b$a */
        public class a extends Thread {
            public a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(9);
                if (b.this.f15284c) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    b.this.f15283b.mo14575a(th);
                }
            }
        }

        public b(String str, c cVar, boolean z9) {
            this.f15282a = str;
            this.f15283b = cVar;
            this.f15284c = z9;
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            a aVar;
            aVar = new a(runnable, "glide-" + this.f15282a + "-thread-" + this.f15285d);
            this.f15285d = this.f15285d + 1;
            return aVar;
        }
    }

    public ExecutorServiceC9082a(ExecutorService executorService) {
        this.f15275a = executorService;
    }

    /* renamed from: a */
    public static int m14564a() {
        if (f15274c == 0) {
            f15274c = Math.min(4, AbstractC9083b.m14576a());
        }
        return f15274c;
    }

    /* renamed from: b */
    public static a m14565b() {
        return new a(true).m14574c(m14564a() >= 4 ? 2 : 1).m14573b("animation");
    }

    /* renamed from: c */
    public static ExecutorServiceC9082a m14566c() {
        return m14565b().m14572a();
    }

    /* renamed from: d */
    public static a m14567d() {
        return new a(true).m14574c(1).m14573b("disk-cache");
    }

    /* renamed from: e */
    public static ExecutorServiceC9082a m14568e() {
        return m14567d().m14572a();
    }

    /* renamed from: f */
    public static a m14569f() {
        return new a(false).m14574c(m14564a()).m14573b("source");
    }

    /* renamed from: g */
    public static ExecutorServiceC9082a m14570g() {
        return m14569f().m14572a();
    }

    /* renamed from: h */
    public static ExecutorServiceC9082a m14571h() {
        return new ExecutorServiceC9082a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f15273b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new b("source-unlimited", c.f15290d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j9, TimeUnit timeUnit) {
        return this.f15275a.awaitTermination(j9, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f15275a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f15275a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f15275a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f15275a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f15275a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f15275a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f15275a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f15275a.submit(runnable);
    }

    public String toString() {
        return this.f15275a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j9, TimeUnit timeUnit) {
        return this.f15275a.invokeAll(collection, j9, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j9, TimeUnit timeUnit) {
        return this.f15275a.invokeAny(collection, j9, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f15275a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f15275a.submit(callable);
    }

    /* renamed from: n0.a$c */
    public interface c {

        /* renamed from: a */
        public static final c f15287a = new a();

        /* renamed from: b */
        public static final c f15288b;

        /* renamed from: c */
        public static final c f15289c;

        /* renamed from: d */
        public static final c f15290d;

        /* renamed from: n0.a$c$b */
        public class b implements c {
            @Override // p184n0.ExecutorServiceC9082a.c
            /* renamed from: a */
            public void mo14575a(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        /* renamed from: n0.a$c$c, reason: collision with other inner class name */
        public class C10081c implements c {
            @Override // p184n0.ExecutorServiceC9082a.c
            /* renamed from: a */
            public void mo14575a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f15288b = bVar;
            f15289c = new C10081c();
            f15290d = bVar;
        }

        /* renamed from: a */
        void mo14575a(Throwable th);

        /* renamed from: n0.a$c$a */
        public class a implements c {
            @Override // p184n0.ExecutorServiceC9082a.c
            /* renamed from: a */
            public void mo14575a(Throwable th) {
            }
        }
    }
}
