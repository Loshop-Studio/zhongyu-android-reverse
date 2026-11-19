package anet.channel.strategy.utils;

import androidx.autofill.HintConstants;
import anet.channel.strategy.dispatch.C5061a;
import anet.channel.util.ALog;
import java.util.concurrent.ThreadFactory;

/* renamed from: anet.channel.strategy.utils.b */
/* loaded from: classes3.dex */
final class ThreadFactoryC5075b implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "AMDC" + C5074a.f2725a.incrementAndGet());
        ALog.m2530i(C5061a.TAG, "thread created!", null, HintConstants.AUTOFILL_HINT_NAME, thread.getName());
        thread.setPriority(5);
        return thread;
    }
}
