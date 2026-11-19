package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.e */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2441e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1006a;

    /* renamed from: b */
    public final /* synthetic */ Executor f1007b;

    /* renamed from: c */
    public final /* synthetic */ Object f1008c;

    /* renamed from: d */
    public final /* synthetic */ Object f1009d;

    public /* synthetic */ RunnableC2441e(Object obj, Executor executor, Object obj2, int i) {
        this.f1006a = i;
        this.f1008c = obj;
        this.f1007b = executor;
        this.f1009d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1006a) {
            case 0:
                ((LocationManagerCompat.GnssMeasurementsTransport) this.f1008c).lambda$onGnssMeasurementsReceived$0(this.f1007b, (GnssMeasurementsEvent) this.f1009d);
                break;
            case 1:
                ((LocationManagerCompat.GpsStatusTransport) this.f1008c).lambda$onGpsStatusChanged$3(this.f1007b, (GnssStatusCompat) this.f1009d);
                break;
            default:
                ((LocationManagerCompat.PreRGnssStatusTransport) this.f1008c).lambda$onSatelliteStatusChanged$3(this.f1007b, (GnssStatus) this.f1009d);
                break;
        }
    }
}
