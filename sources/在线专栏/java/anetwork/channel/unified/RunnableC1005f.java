package anetwork.channel.unified;

import anet.channel.thread.ThreadPoolExecutorFactory;

/* renamed from: anetwork.channel.unified.f */
/* loaded from: classes.dex */
class RunnableC1005f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1004e f5665a;

    RunnableC1005f(C1004e c1004e) {
        this.f5665a = c1004e;
    }

    @Override // java.lang.Runnable
    public void run() {
        ThreadPoolExecutorFactory.submitPriorityTask(this.f5665a, ThreadPoolExecutorFactory.Priority.HIGH);
    }
}
