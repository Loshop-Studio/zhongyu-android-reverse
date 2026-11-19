package p249u;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* renamed from: u.c */
/* loaded from: classes3.dex */
public final class C9517c implements InterfaceC9516b {

    /* renamed from: c */
    public final ConnectivityManager f16617c;

    public C9517c(ConnectivityManager connectivityManager) {
        this.f16617c = connectivityManager;
    }

    @Override // p249u.InterfaceC9516b
    /* renamed from: c */
    public boolean mo15877c() {
        NetworkCapabilities networkCapabilities = this.f16617c.getNetworkCapabilities(this.f16617c.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
