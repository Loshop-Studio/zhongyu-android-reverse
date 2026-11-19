package androidx.work.impl.background.systemalarm;

/* renamed from: androidx.work.impl.background.systemalarm.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4909a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DelayMetCommandHandler f2104a;

    public /* synthetic */ RunnableC4909a(DelayMetCommandHandler delayMetCommandHandler) {
        this.f2104a = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2104a.stopWork();
    }
}
