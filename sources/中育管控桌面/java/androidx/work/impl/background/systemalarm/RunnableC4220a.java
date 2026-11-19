package androidx.work.impl.background.systemalarm;

/* renamed from: androidx.work.impl.background.systemalarm.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4220a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DelayMetCommandHandler f1153a;

    public /* synthetic */ RunnableC4220a(DelayMetCommandHandler delayMetCommandHandler) {
        this.f1153a = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1153a.stopWork();
    }
}
