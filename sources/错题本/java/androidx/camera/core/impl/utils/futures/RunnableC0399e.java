package androidx.camera.core.impl.utils.futures;

import java.util.concurrent.ScheduledFuture;

/* renamed from: androidx.camera.core.impl.utils.futures.e */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0399e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f481a;

    /* renamed from: b */
    public final /* synthetic */ ScheduledFuture f482b;

    public /* synthetic */ RunnableC0399e(ScheduledFuture scheduledFuture, int i) {
        this.f481a = i;
        this.f482b = scheduledFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f481a) {
            case 0:
                this.f482b.cancel(true);
                break;
            default:
                this.f482b.cancel(true);
                break;
        }
    }
}
