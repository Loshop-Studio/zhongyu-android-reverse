package anet.channel.util;

import anet.channel.statist.NetTypeStat;
import anet.channel.thread.ThreadPoolExecutorFactory;

/* renamed from: anet.channel.util.d */
/* loaded from: classes.dex */
final class RunnableC0963d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f5479a;

    /* renamed from: b */
    final /* synthetic */ NetTypeStat f5480b;

    RunnableC0963d(String str, NetTypeStat netTypeStat) {
        this.f5479a = str;
        this.f5480b = netTypeStat;
    }

    @Override // java.lang.Runnable
    public void run() {
        ThreadPoolExecutorFactory.submitPriorityTask(new RunnableC0964e(this), ThreadPoolExecutorFactory.Priority.LOW);
    }
}
