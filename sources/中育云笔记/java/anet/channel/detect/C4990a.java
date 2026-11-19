package anet.channel.detect;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;

/* renamed from: anet.channel.detect.a */
/* loaded from: classes3.dex */
class C4990a implements NetworkStatusHelper.INetworkStatusChangeListener {

    /* renamed from: a */
    final /* synthetic */ ExceptionDetector f2372a;

    public C4990a(ExceptionDetector exceptionDetector) {
        this.f2372a = exceptionDetector;
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        ThreadPoolExecutorFactory.submitDetectTask(new RunnableC4991b(this));
    }
}
