package anetwork.channel.entity;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: anetwork.channel.entity.a */
/* loaded from: classes3.dex */
public class C5115a {

    /* renamed from: a */
    private static final ExecutorService[] f2884a = new ExecutorService[2];

    /* renamed from: b */
    private static AtomicInteger f2885b = new AtomicInteger(0);

    static {
        for (int i10 = 0; i10 < 2; i10++) {
            f2884a[i10] = Executors.newSingleThreadExecutor(new ThreadFactoryC5116b());
        }
    }

    /* renamed from: a */
    public static void m2604a(int i10, Runnable runnable) {
        f2884a[Math.abs(i10 % 2)].submit(runnable);
    }
}
