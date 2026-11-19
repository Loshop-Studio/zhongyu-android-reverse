package anet.channel.monitor;

import anet.channel.status.NetworkStatusHelper;

/* renamed from: anet.channel.monitor.c */
/* loaded from: classes.dex */
class C0905c implements NetworkStatusHelper.INetworkStatusChangeListener {

    /* renamed from: a */
    final /* synthetic */ C0904b f5203a;

    C0905c(C0904b c0904b) {
        this.f5203a = c0904b;
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f5203a.f5201n.m4475a();
        C0904b.f5193f = 0L;
        this.f5203a.m4472d();
    }
}
