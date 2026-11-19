package anet.channel.p009e;

import anet.channel.status.NetworkStatusHelper;

/* renamed from: anet.channel.e.d */
/* loaded from: classes.dex */
final class C0885d implements NetworkStatusHelper.INetworkStatusChangeListener {
    C0885d() {
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        C0882a.m4432a(networkStatus);
    }
}
