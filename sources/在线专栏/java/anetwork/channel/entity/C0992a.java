package anetwork.channel.entity;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: anetwork.channel.entity.a */
/* loaded from: classes.dex */
public class C0992a {

    /* renamed from: a */
    private static final ExecutorService[] f5606a = new ExecutorService[2];

    /* renamed from: b */
    private static AtomicInteger f5607b = new AtomicInteger(0);

    static {
        for (int i4 = 0; i4 < 2; i4++) {
            f5606a[i4] = Executors.newSingleThreadExecutor(new ThreadFactoryC0993b());
        }
    }

    /* renamed from: a */
    public static void m4713a(int i4, Runnable runnable) {
        f5606a[Math.abs(i4 % 2)].submit(runnable);
    }
}
