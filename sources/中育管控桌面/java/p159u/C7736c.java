package p159u;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* renamed from: u.c */
/* loaded from: classes3.dex */
public final class C7736c implements InterfaceC7735b {

    /* renamed from: c */
    public final ConnectivityManager f10227c;

    public C7736c(ConnectivityManager connectivityManager) {
        this.f10227c = connectivityManager;
    }

    @Override // p159u.InterfaceC7735b
    /* renamed from: c */
    public boolean mo9227c() {
        NetworkCapabilities networkCapabilities = this.f10227c.getNetworkCapabilities(this.f10227c.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
