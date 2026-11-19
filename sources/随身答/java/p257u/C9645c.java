package p257u;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* renamed from: u.c */
/* loaded from: classes3.dex */
public final class C9645c implements InterfaceC9644b {

    /* renamed from: c */
    public final ConnectivityManager f16987c;

    public C9645c(ConnectivityManager connectivityManager) {
        this.f16987c = connectivityManager;
    }

    @Override // p257u.InterfaceC9644b
    /* renamed from: c */
    public boolean mo15980c() {
        NetworkCapabilities networkCapabilities = this.f16987c.getNetworkCapabilities(this.f16987c.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
