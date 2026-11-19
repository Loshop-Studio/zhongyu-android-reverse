package anet.channel.detect;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;

/* renamed from: anet.channel.detect.m */
/* loaded from: classes3.dex */
class RunnableC5002m implements Runnable {

    /* renamed from: a */
    final /* synthetic */ NetworkStatusHelper.NetworkStatus f2392a;

    /* renamed from: b */
    final /* synthetic */ C5001l f2393b;

    public RunnableC5002m(C5001l c5001l, NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f2393b = c5001l;
        this.f2392a = networkStatus;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            NetworkStatusHelper.NetworkStatus networkStatus = this.f2392a;
            if (networkStatus != NetworkStatusHelper.NetworkStatus.NO && networkStatus != NetworkStatusHelper.NetworkStatus.NONE) {
                this.f2393b.f2391a.m2309a(NetworkStatusHelper.getUniqueId(networkStatus));
            }
        } catch (Throwable th) {
            ALog.m2528e("anet.MTUDetector", "MTU detecet fail.", null, th, new Object[0]);
        }
    }
}
