package androidx.work.impl.background.systemalarm;

/* renamed from: androidx.work.impl.background.systemalarm.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4762a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DelayMetCommandHandler f2259a;

    public /* synthetic */ RunnableC4762a(DelayMetCommandHandler delayMetCommandHandler) {
        this.f2259a = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2259a.stopWork();
    }
}
