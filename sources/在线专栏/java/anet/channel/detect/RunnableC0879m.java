package anet.channel.detect;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;

/* renamed from: anet.channel.detect.m */
/* loaded from: classes.dex */
class RunnableC0879m implements Runnable {

    /* renamed from: a */
    final /* synthetic */ NetworkStatusHelper.NetworkStatus f5114a;

    /* renamed from: b */
    final /* synthetic */ C0878l f5115b;

    RunnableC0879m(C0878l c0878l, NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f5115b = c0878l;
        this.f5114a = networkStatus;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            NetworkStatusHelper.NetworkStatus networkStatus = this.f5114a;
            if (networkStatus != NetworkStatusHelper.NetworkStatus.NO && networkStatus != NetworkStatusHelper.NetworkStatus.NONE) {
                this.f5115b.f5113a.m4418a(NetworkStatusHelper.getUniqueId(networkStatus));
            }
        } catch (Throwable th) {
            ALog.m4637e("anet.MTUDetector", "MTU detecet fail.", null, th, new Object[0]);
        }
    }
}
