package anet.channel.strategy;

/* renamed from: anet.channel.strategy.e */
/* loaded from: classes.dex */
class RunnableC0940e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f5394a;

    /* renamed from: b */
    final /* synthetic */ StrategyInfoHolder f5395b;

    RunnableC0940e(StrategyInfoHolder strategyInfoHolder, String str) {
        this.f5395b = strategyInfoHolder;
        this.f5394a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5395b.m4583a(this.f5394a, true);
    }
}
