package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC9133u;

@RequiresApi(23)
/* loaded from: classes3.dex */
public final class NetworkApi23 {
    public static final Network getActiveNetworkCompat(ConnectivityManager connectivityManager) {
        AbstractC9133u.m16133g(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
