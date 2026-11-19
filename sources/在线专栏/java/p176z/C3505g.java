package p176z;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p011b0.InterfaceC1018a;

/* renamed from: z.g */
/* loaded from: classes.dex */
class C3505g {

    /* renamed from: z.g$a */
    private static class a implements ThreadFactory {

        /* renamed from: a */
        private String f12279a;

        /* renamed from: b */
        private int f12280b;

        /* renamed from: z.g$a$a, reason: collision with other inner class name */
        private static class C3552a extends Thread {

            /* renamed from: a */
            private final int f12281a;

            C3552a(Runnable runnable, String str, int i4) {
                super(runnable, str);
                this.f12281a = i4;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(this.f12281a);
                super.run();
            }
        }

        a(String str, int i4) {
            this.f12279a = str;
            this.f12280b = i4;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C3552a(runnable, this.f12279a, this.f12280b);
        }
    }

    /* renamed from: z.g$b */
    private static class b<T> implements Runnable {

        /* renamed from: a */
        private Callable<T> f12282a;

        /* renamed from: b */
        private InterfaceC1018a<T> f12283b;

        /* renamed from: c */
        private Handler f12284c;

        /* renamed from: z.g$b$a */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ InterfaceC1018a f12285a;

            /* renamed from: b */
            final /* synthetic */ Object f12286b;

            a(InterfaceC1018a interfaceC1018a, Object obj) {
                this.f12285a = interfaceC1018a;
                this.f12286b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f12285a.accept(this.f12286b);
            }
        }

        b(Handler handler, Callable<T> callable, InterfaceC1018a<T> interfaceC1018a) {
            this.f12282a = callable;
            this.f12283b = interfaceC1018a;
            this.f12284c = handler;
        }

        @Override // java.lang.Runnable
        public void run() throws Exception {
            T tCall;
            try {
                tCall = this.f12282a.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f12284c.post(new a(this.f12283b, tCall));
        }
    }

    /* renamed from: a */
    static ThreadPoolExecutor m10677a(String str, int i4, int i5) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i5, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i4));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    static <T> void m10678b(Executor executor, Callable<T> callable, InterfaceC1018a<T> interfaceC1018a) {
        executor.execute(new b(C3500b.m10642a(), callable, interfaceC1018a));
    }

    /* renamed from: c */
    static <T> T m10679c(ExecutorService executorService, Callable<T> callable, int i4) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i4, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            throw e4;
        } catch (ExecutionException e5) {
            throw new RuntimeException(e5);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
