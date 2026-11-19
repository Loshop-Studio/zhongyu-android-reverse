package anet.channel.util;

import anet.channel.statist.NetTypeStat;
import anet.channel.thread.ThreadPoolExecutorFactory;

/* renamed from: anet.channel.util.d */
/* loaded from: classes3.dex */
final class RunnableC5086d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f2757a;

    /* renamed from: b */
    final /* synthetic */ NetTypeStat f2758b;

    public RunnableC5086d(String str, NetTypeStat netTypeStat) {
        this.f2757a = str;
        this.f2758b = netTypeStat;
    }

    @Override // java.lang.Runnable
    public void run() {
        ThreadPoolExecutorFactory.submitPriorityTask(new RunnableC5087e(this), ThreadPoolExecutorFactory.Priority.LOW);
    }
}
