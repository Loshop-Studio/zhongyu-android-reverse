package androidx.work.impl.background.systemalarm;

/* renamed from: androidx.work.impl.background.systemalarm.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4796b implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ DelayMetCommandHandler f2134c;

    public /* synthetic */ RunnableC4796b(DelayMetCommandHandler delayMetCommandHandler) {
        this.f2134c = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2134c.startWork();
    }
}
