package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.f */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2442f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1010a;

    /* renamed from: b */
    public final /* synthetic */ Executor f1011b;

    /* renamed from: c */
    public final /* synthetic */ int f1012c;

    /* renamed from: d */
    public final /* synthetic */ Object f1013d;

    public /* synthetic */ RunnableC2442f(Object obj, Executor executor, int i, int i8) {
        this.f1010a = i8;
        this.f1013d = obj;
        this.f1011b = executor;
        this.f1012c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1010a) {
            case 0:
                ((LocationManagerCompat.GnssMeasurementsTransport) this.f1013d).lambda$onStatusChanged$1(this.f1011b, this.f1012c);
                break;
            case 1:
                ((LocationManagerCompat.GpsStatusTransport) this.f1013d).lambda$onGpsStatusChanged$2(this.f1011b, this.f1012c);
                break;
            default:
                ((LocationManagerCompat.PreRGnssStatusTransport) this.f1013d).lambda$onFirstFix$2(this.f1011b, this.f1012c);
                break;
        }
    }
}
