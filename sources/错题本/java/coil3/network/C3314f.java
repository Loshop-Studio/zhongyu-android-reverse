package coil3.network;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* renamed from: coil3.network.f */
/* loaded from: classes2.dex */
public final class C3314f implements InterfaceC3313e {

    /* renamed from: b */
    public final ConnectivityManager f2003b;

    public C3314f(ConnectivityManager connectivityManager) {
        this.f2003b = connectivityManager;
    }

    @Override // coil3.network.InterfaceC3313e
    /* renamed from: a */
    public final boolean mo2232a() {
        ConnectivityManager connectivityManager = this.f2003b;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
