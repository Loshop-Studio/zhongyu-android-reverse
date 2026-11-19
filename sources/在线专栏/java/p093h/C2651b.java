package p093h;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: h.b */
/* loaded from: classes.dex */
public class C2651b extends AbstractC2652c {

    /* renamed from: a */
    private final Object f10477a = new Object();

    /* renamed from: b */
    private final ExecutorService f10478b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c */
    private volatile Handler f10479c;

    /* renamed from: h.b$a */
    class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f10480a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f10480a.getAndIncrement())));
            return thread;
        }
    }

    /* renamed from: e */
    private static Handler m8865e(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // p093h.AbstractC2652c
    /* renamed from: a */
    public void mo8862a(Runnable runnable) {
        this.f10478b.execute(runnable);
    }

    @Override // p093h.AbstractC2652c
    /* renamed from: c */
    public boolean mo8863c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p093h.AbstractC2652c
    /* renamed from: d */
    public void mo8864d(Runnable runnable) {
        if (this.f10479c == null) {
            synchronized (this.f10477a) {
                if (this.f10479c == null) {
                    this.f10479c = m8865e(Looper.getMainLooper());
                }
            }
        }
        this.f10479c.post(runnable);
    }
}
