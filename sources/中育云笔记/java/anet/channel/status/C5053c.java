package anet.channel.status;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import anet.channel.util.ALog;
import java.util.ArrayList;

/* renamed from: anet.channel.status.c */
/* loaded from: classes3.dex */
final class C5053c extends ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        super.onAvailable(network);
        ALog.m2530i("awcn.NetworkStatusMonitor", "network onAvailable", null, new Object[0]);
        C5052b.f2597b = true;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        super.onLinkPropertiesChanged(network, linkProperties);
        C5052b.f2607l = new ArrayList(linkProperties.getDnsServers());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        super.onLost(network);
        ALog.m2530i("awcn.NetworkStatusMonitor", "network onLost", null, new Object[0]);
        C5052b.f2597b = false;
    }
}
