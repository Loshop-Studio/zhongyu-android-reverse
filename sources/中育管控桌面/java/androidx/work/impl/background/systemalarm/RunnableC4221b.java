package androidx.work.impl.background.systemalarm;

/* renamed from: androidx.work.impl.background.systemalarm.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4221b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DelayMetCommandHandler f1154a;

    public /* synthetic */ RunnableC4221b(DelayMetCommandHandler delayMetCommandHandler) {
        this.f1154a = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1154a.startWork();
    }
}
