package p106p;

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

/* renamed from: p.a */
/* loaded from: classes2.dex */
public final class ExecutorServiceC4445a implements ExecutorService {

    /* renamed from: b */
    public static final long f5122b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    public static volatile int f5123c;

    /* renamed from: a */
    public final ExecutorService f5124a;

    /* renamed from: p.a$a */
    public static final class a {

        /* renamed from: a */
        public final boolean f5125a;

        /* renamed from: b */
        public int f5126b;

        /* renamed from: c */
        public int f5127c;

        /* renamed from: d */
        public c f5128d = c.f5139d;

        /* renamed from: e */
        public String f5129e;

        /* renamed from: f */
        public long f5130f;

        public a(boolean z3) {
            this.f5125a = z3;
        }

        /* renamed from: a */
        public ExecutorServiceC4445a m5662a() {
            if (TextUtils.isEmpty(this.f5129e)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f5129e);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f5126b, this.f5127c, this.f5130f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new b(this.f5129e, this.f5128d, this.f5125a));
            if (this.f5130f != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new ExecutorServiceC4445a(threadPoolExecutor);
        }

        /* renamed from: b */
        public a m5663b(String str) {
            this.f5129e = str;
            return this;
        }

        /* renamed from: c */
        public a m5664c(int i4) {
            this.f5126b = i4;
            this.f5127c = i4;
            return this;
        }
    }

    /* renamed from: p.a$b */
    public static final class b implements ThreadFactory {

        /* renamed from: a */
        public final String f5131a;

        /* renamed from: b */
        public final c f5132b;

        /* renamed from: c */
        public final boolean f5133c;

        /* renamed from: d */
        public int f5134d;

        /* renamed from: p.a$b$a */
        public class a extends Thread {
            public a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(9);
                if (b.this.f5133c) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    b.this.f5132b.mo5665a(th);
                }
            }
        }

        public b(String str, c cVar, boolean z3) {
            this.f5131a = str;
            this.f5132b = cVar;
            this.f5133c = z3;
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            a aVar;
            aVar = new a(runnable, "glide-" + this.f5131a + "-thread-" + this.f5134d);
            this.f5134d = this.f5134d + 1;
            return aVar;
        }
    }

    /* renamed from: p.a$c */
    public interface c {

        /* renamed from: a */
        public static final c f5136a = new a();

        /* renamed from: b */
        public static final c f5137b;

        /* renamed from: c */
        public static final c f5138c;

        /* renamed from: d */
        public static final c f5139d;

        /* renamed from: p.a$c$a */
        public class a implements c {
            @Override // p106p.ExecutorServiceC4445a.c
            /* renamed from: a */
            public void mo5665a(Throwable th) {
            }
        }

        /* renamed from: p.a$c$b */
        public class b implements c {
            @Override // p106p.ExecutorServiceC4445a.c
            /* renamed from: a */
            public void mo5665a(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        /* renamed from: p.a$c$c, reason: collision with other inner class name */
        public class C4763c implements c {
            @Override // p106p.ExecutorServiceC4445a.c
            /* renamed from: a */
            public void mo5665a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f5137b = bVar;
            f5138c = new C4763c();
            f5139d = bVar;
        }

        /* renamed from: a */
        void mo5665a(Throwable th);
    }

    public ExecutorServiceC4445a(ExecutorService executorService) {
        this.f5124a = executorService;
    }

    /* renamed from: a */
    public static int m5654a() {
        if (f5123c == 0) {
            f5123c = Math.min(4, AbstractC4446b.m5666a());
        }
        return f5123c;
    }

    /* renamed from: b */
    public static a m5655b() {
        return new a(true).m5664c(m5654a() >= 4 ? 2 : 1).m5663b("animation");
    }

    /* renamed from: c */
    public static ExecutorServiceC4445a m5656c() {
        return m5655b().m5662a();
    }

    /* renamed from: d */
    public static a m5657d() {
        return new a(true).m5664c(1).m5663b("disk-cache");
    }

    /* renamed from: e */
    public static ExecutorServiceC4445a m5658e() {
        return m5657d().m5662a();
    }

    /* renamed from: f */
    public static a m5659f() {
        return new a(false).m5664c(m5654a()).m5663b("source");
    }

    /* renamed from: g */
    public static ExecutorServiceC4445a m5660g() {
        return m5659f().m5662a();
    }

    /* renamed from: h */
    public static ExecutorServiceC4445a m5661h() {
        return new ExecutorServiceC4445a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f5122b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new b("source-unlimited", c.f5139d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j4, TimeUnit timeUnit) {
        return this.f5124a.awaitTermination(j4, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f5124a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f5124a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f5124a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f5124a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f5124a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f5124a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f5124a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f5124a.submit(runnable);
    }

    public String toString() {
        return this.f5124a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j4, TimeUnit timeUnit) {
        return this.f5124a.invokeAll(collection, j4, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j4, TimeUnit timeUnit) {
        return this.f5124a.invokeAny(collection, j4, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f5124a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f5124a.submit(callable);
    }
}
