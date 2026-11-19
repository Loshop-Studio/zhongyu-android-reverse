package androidx.work.impl.background.systemalarm;

/* renamed from: androidx.work.impl.background.systemalarm.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4763b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DelayMetCommandHandler f2260a;

    public /* synthetic */ RunnableC4763b(DelayMetCommandHandler delayMetCommandHandler) {
        this.f2260a = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2260a.startWork();
    }
}
