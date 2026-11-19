package anetwork.channel.entity;

import java.util.concurrent.ThreadFactory;

/* renamed from: anetwork.channel.entity.b */
/* loaded from: classes3.dex */
final class ThreadFactoryC5116b implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, String.format("RepeaterThread:%d", Integer.valueOf(C5115a.f2885b.getAndIncrement())));
    }
}
