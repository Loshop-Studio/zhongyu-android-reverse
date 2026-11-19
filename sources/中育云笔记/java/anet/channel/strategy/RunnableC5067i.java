package anet.channel.strategy;

/* renamed from: anet.channel.strategy.i */
/* loaded from: classes3.dex */
class RunnableC5067i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C5065g f2682a;

    public RunnableC5067i(C5065g c5065g) {
        this.f2682a = c5065g;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f2682a.m2500a()) {
            return;
        }
        this.f2682a.f2677b.m2476c();
    }
}
