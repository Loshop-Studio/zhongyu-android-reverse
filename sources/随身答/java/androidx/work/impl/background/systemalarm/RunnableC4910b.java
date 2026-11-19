package androidx.work.impl.background.systemalarm;

/* renamed from: androidx.work.impl.background.systemalarm.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4910b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DelayMetCommandHandler f2105a;

    public /* synthetic */ RunnableC4910b(DelayMetCommandHandler delayMetCommandHandler) {
        this.f2105a = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2105a.startWork();
    }
}
