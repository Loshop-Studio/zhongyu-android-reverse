package p327s;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* renamed from: s.c */
/* loaded from: classes3.dex */
public final class C11010c implements InterfaceC11009b {

    /* renamed from: c */
    public final ConnectivityManager f26583c;

    public C11010c(ConnectivityManager connectivityManager) {
        this.f26583c = connectivityManager;
    }

    @Override // p327s.InterfaceC11009b
    /* renamed from: c */
    public boolean mo24325c() {
        NetworkCapabilities networkCapabilities = this.f26583c.getNetworkCapabilities(this.f26583c.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
