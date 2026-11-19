package p000a.p015c.p016a.p017a;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: a.c.a.a.b */
/* loaded from: classes.dex */
public class C0122b extends AbstractC0123c {

    /* renamed from: a */
    public final Object f881a = new Object();

    /* renamed from: b */
    public final ExecutorService f882b = Executors.newFixedThreadPool(4, new a(this));

    /* renamed from: a.c.a.a.b$a */
    public class a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f883a = new AtomicInteger(0);

        public a(C0122b c0122b) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f883a.getAndIncrement())));
            return thread;
        }
    }

    @Override // p000a.p015c.p016a.p017a.AbstractC0123c
    /* renamed from: a */
    public boolean mo461a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
