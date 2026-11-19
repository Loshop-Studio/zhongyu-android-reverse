package p186w;

import java.util.concurrent.ThreadFactory;

/* renamed from: w.b */
/* loaded from: classes2.dex */
public final class ThreadFactoryC6687b implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final synchronized Thread newThread(Runnable runnable) {
        Thread thread;
        thread = new Thread(runnable, "glide-disk-lru-cache-thread");
        thread.setPriority(1);
        return thread;
    }
}
