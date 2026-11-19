package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC9979u;

@RequiresApi(24)
/* loaded from: classes3.dex */
public final class NetworkApi24 {
    public static final void registerDefaultNetworkCallbackCompat(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        AbstractC9979u.m20294g(connectivityManager, "<this>");
        AbstractC9979u.m20294g(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
