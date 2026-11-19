package p344t5;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: t5.o */
/* loaded from: classes5.dex */
public abstract class AbstractC11241o {

    /* renamed from: a */
    public static final Object f26980a = new Object();

    /* renamed from: b */
    public static ThreadPoolExecutor f26981b = new ThreadPoolExecutor(1, 50, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: a */
    public static ThreadPoolExecutor m25070a() {
        ThreadPoolExecutor threadPoolExecutor;
        synchronized (f26980a) {
            threadPoolExecutor = f26981b;
        }
        return threadPoolExecutor;
    }
}
