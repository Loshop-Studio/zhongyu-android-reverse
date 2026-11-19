package androidx.core.location;

import android.location.Location;
import androidx.core.location.LocationManagerCompat;
import java.util.List;

/* renamed from: androidx.core.location.i */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2445i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1020a;

    /* renamed from: b */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f1021b;

    /* renamed from: c */
    public final /* synthetic */ Object f1022c;

    public /* synthetic */ RunnableC2445i(LocationManagerCompat.LocationListenerTransport locationListenerTransport, Object obj, int i) {
        this.f1020a = i;
        this.f1021b = locationListenerTransport;
        this.f1022c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1020a) {
            case 0:
                this.f1021b.lambda$onLocationChanged$1((List) this.f1022c);
                break;
            default:
                this.f1021b.lambda$onLocationChanged$0((Location) this.f1022c);
                break;
        }
    }
}
