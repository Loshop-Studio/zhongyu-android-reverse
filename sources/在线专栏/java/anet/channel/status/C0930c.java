package anet.channel.status;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import anet.channel.util.ALog;
import java.util.ArrayList;

/* renamed from: anet.channel.status.c */
/* loaded from: classes.dex */
final class C0930c extends ConnectivityManager.NetworkCallback {
    C0930c() {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        super.onAvailable(network);
        ALog.m4639i("awcn.NetworkStatusMonitor", "network onAvailable", null, new Object[0]);
        C0929b.f5319b = true;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        super.onLinkPropertiesChanged(network, linkProperties);
        C0929b.f5329l = new ArrayList(linkProperties.getDnsServers());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        super.onLost(network);
        ALog.m4639i("awcn.NetworkStatusMonitor", "network onLost", null, new Object[0]);
        C0929b.f5319b = false;
    }
}
