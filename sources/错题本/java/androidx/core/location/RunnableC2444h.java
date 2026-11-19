package androidx.core.location;

import androidx.core.location.LocationManagerCompat;

/* renamed from: androidx.core.location.h */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2444h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1017a;

    /* renamed from: b */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f1018b;

    /* renamed from: c */
    public final /* synthetic */ String f1019c;

    public /* synthetic */ RunnableC2444h(LocationManagerCompat.LocationListenerTransport locationListenerTransport, String str, int i) {
        this.f1017a = i;
        this.f1018b = locationListenerTransport;
        this.f1019c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1017a) {
            case 0:
                this.f1018b.lambda$onProviderEnabled$4(this.f1019c);
                break;
            default:
                this.f1018b.lambda$onProviderDisabled$5(this.f1019c);
                break;
        }
    }
}
