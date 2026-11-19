package androidx.work.impl.background.systemalarm;

/* renamed from: androidx.work.impl.background.systemalarm.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4848b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DelayMetCommandHandler f2020a;

    public /* synthetic */ RunnableC4848b(DelayMetCommandHandler delayMetCommandHandler) {
        this.f2020a = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2020a.startWork();
    }
}
