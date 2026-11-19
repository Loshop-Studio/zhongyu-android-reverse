package anet.channel.detect;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;

/* renamed from: anet.channel.detect.l */
/* loaded from: classes3.dex */
class C5001l implements NetworkStatusHelper.INetworkStatusChangeListener {

    /* renamed from: a */
    final /* synthetic */ C5000k f2391a;

    public C5001l(C5000k c5000k) {
        this.f2391a = c5000k;
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        ThreadPoolExecutorFactory.submitDetectTask(new RunnableC5002m(this, networkStatus));
    }
}
