package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC9133u;

@RequiresApi(24)
/* loaded from: classes3.dex */
public final class NetworkApi24 {
    public static final void registerDefaultNetworkCallbackCompat(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        AbstractC9133u.m16133g(connectivityManager, "<this>");
        AbstractC9133u.m16133g(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
