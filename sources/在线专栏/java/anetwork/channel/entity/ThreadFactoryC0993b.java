package anetwork.channel.entity;

import java.util.concurrent.ThreadFactory;

/* renamed from: anetwork.channel.entity.b */
/* loaded from: classes.dex */
final class ThreadFactoryC0993b implements ThreadFactory {
    ThreadFactoryC0993b() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, String.format("RepeaterThread:%d", Integer.valueOf(C0992a.f5607b.getAndIncrement())));
    }
}
