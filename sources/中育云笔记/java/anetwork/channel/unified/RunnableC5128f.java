package anetwork.channel.unified;

import anet.channel.thread.ThreadPoolExecutorFactory;

/* renamed from: anetwork.channel.unified.f */
/* loaded from: classes3.dex */
class RunnableC5128f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C5127e f2943a;

    public RunnableC5128f(C5127e c5127e) {
        this.f2943a = c5127e;
    }

    @Override // java.lang.Runnable
    public void run() {
        ThreadPoolExecutorFactory.submitPriorityTask(this.f2943a, ThreadPoolExecutorFactory.Priority.HIGH);
    }
}
