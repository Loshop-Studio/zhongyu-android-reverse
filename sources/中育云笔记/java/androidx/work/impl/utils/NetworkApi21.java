package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC9979u;

@RequiresApi(21)
/* loaded from: classes3.dex */
public final class NetworkApi21 {
    public static final NetworkCapabilities getNetworkCapabilitiesCompat(ConnectivityManager connectivityManager, Network network) {
        AbstractC9979u.m20294g(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    public static final boolean hasCapabilityCompat(NetworkCapabilities networkCapabilities, int i10) {
        AbstractC9979u.m20294g(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i10);
    }

    public static final void unregisterNetworkCallbackCompat(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        AbstractC9979u.m20294g(connectivityManager, "<this>");
        AbstractC9979u.m20294g(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
