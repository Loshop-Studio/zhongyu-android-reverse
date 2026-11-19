package anet.channel.strategy;

/* renamed from: anet.channel.strategy.e */
/* loaded from: classes3.dex */
class RunnableC5063e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f2672a;

    /* renamed from: b */
    final /* synthetic */ StrategyInfoHolder f2673b;

    public RunnableC5063e(StrategyInfoHolder strategyInfoHolder, String str) {
        this.f2673b = strategyInfoHolder;
        this.f2672a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2673b.m2474a(this.f2672a, true);
    }
}
