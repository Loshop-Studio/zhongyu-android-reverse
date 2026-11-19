package anet.channel.monitor;

import anet.channel.status.NetworkStatusHelper;

/* renamed from: anet.channel.monitor.c */
/* loaded from: classes3.dex */
class C5028c implements NetworkStatusHelper.INetworkStatusChangeListener {

    /* renamed from: a */
    final /* synthetic */ C5027b f2481a;

    public C5028c(C5027b c5027b) {
        this.f2481a = c5027b;
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f2481a.f2479n.m2366a();
        C5027b.f2471f = 0L;
        this.f2481a.m2363d();
    }
}
