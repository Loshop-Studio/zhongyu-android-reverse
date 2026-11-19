package p401x4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: x4.a */
/* loaded from: classes5.dex */
public final class C11791a {

    /* renamed from: b */
    public static final C11791a f27965b = new C11791a();

    /* renamed from: c */
    public static final int f27966c;

    /* renamed from: d */
    public static final int f27967d;

    /* renamed from: e */
    public static final int f27968e;

    /* renamed from: a */
    public final Executor f27969a = new b();

    /* renamed from: x4.a$b */
    public static class b implements Executor {
        public b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f27966c = iAvailableProcessors;
        f27967d = iAvailableProcessors + 1;
        f27968e = (iAvailableProcessors * 2) + 1;
    }

    /* renamed from: a */
    public static ExecutorService m26019a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f27967d, f27968e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    public static Executor m26020b() {
        return f27965b.f27969a;
    }
}
