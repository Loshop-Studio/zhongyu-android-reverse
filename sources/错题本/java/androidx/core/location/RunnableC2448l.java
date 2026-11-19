package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.l */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2448l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1029a;

    /* renamed from: b */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f1030b;

    /* renamed from: c */
    public final /* synthetic */ Executor f1031c;

    public /* synthetic */ RunnableC2448l(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, int i) {
        this.f1029a = i;
        this.f1030b = preRGnssStatusTransport;
        this.f1031c = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1029a) {
            case 0:
                this.f1030b.lambda$onStopped$1(this.f1031c);
                break;
            default:
                this.f1030b.lambda$onStarted$0(this.f1031c);
                break;
        }
    }
}
