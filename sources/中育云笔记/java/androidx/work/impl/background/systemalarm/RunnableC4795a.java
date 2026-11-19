package androidx.work.impl.background.systemalarm;

/* renamed from: androidx.work.impl.background.systemalarm.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4795a implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ DelayMetCommandHandler f2133c;

    public /* synthetic */ RunnableC4795a(DelayMetCommandHandler delayMetCommandHandler) {
        this.f2133c = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2133c.stopWork();
    }
}
