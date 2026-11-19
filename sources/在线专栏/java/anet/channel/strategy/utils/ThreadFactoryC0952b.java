package anet.channel.strategy.utils;

import anet.channel.strategy.dispatch.C0938a;
import anet.channel.util.ALog;
import java.util.concurrent.ThreadFactory;

/* renamed from: anet.channel.strategy.utils.b */
/* loaded from: classes.dex */
final class ThreadFactoryC0952b implements ThreadFactory {
    ThreadFactoryC0952b() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "AMDC" + C0951a.f5447a.incrementAndGet());
        ALog.m4639i(C0938a.TAG, "thread created!", null, "name", thread.getName());
        thread.setPriority(5);
        return thread;
    }
}
