package anet.channel.status;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import java.util.Iterator;

/* renamed from: anet.channel.status.a */
/* loaded from: classes3.dex */
final class RunnableC5051a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ NetworkStatusHelper.NetworkStatus f2595a;

    public RunnableC5051a(NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f2595a = networkStatus;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Iterator<NetworkStatusHelper.INetworkStatusChangeListener> it = NetworkStatusHelper.listeners.iterator();
            while (it.hasNext()) {
                NetworkStatusHelper.INetworkStatusChangeListener next = it.next();
                long jCurrentTimeMillis = System.currentTimeMillis();
                next.onNetworkStatusChanged(this.f2595a);
                if (System.currentTimeMillis() - jCurrentTimeMillis > 500) {
                    ALog.m2529e("awcn.NetworkStatusHelper", "call back cost too much time", null, "listener", next);
                }
            }
        } catch (Exception unused) {
        }
    }
}
