package androidx.documentfile.provider;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.documentfile.provider.b */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3758b {
    /* renamed from: a */
    public static /* synthetic */ void m1903a(ExecutorService executorService) throws InterruptedException {
        boolean zIsTerminated;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z9 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z9) {
                    executorService.shutdownNow();
                    z9 = true;
                }
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
    }
}
