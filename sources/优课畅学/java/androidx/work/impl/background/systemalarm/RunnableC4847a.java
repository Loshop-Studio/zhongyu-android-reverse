package androidx.work.impl.background.systemalarm;

/* renamed from: androidx.work.impl.background.systemalarm.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4847a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DelayMetCommandHandler f2019a;

    public /* synthetic */ RunnableC4847a(DelayMetCommandHandler delayMetCommandHandler) {
        this.f2019a = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2019a.stopWork();
    }
}
