package anet.channel.detect;

import anet.channel.AwcnConfig;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;

/* renamed from: anet.channel.detect.f */
/* loaded from: classes3.dex */
class C4995f implements AppLifecycle.AppLifecycleListener {

    /* renamed from: a */
    final /* synthetic */ C4993d f2379a;

    public C4995f(C4993d c4993d) {
        this.f2379a = c4993d;
    }

    @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
    public void background() {
        ALog.m2530i("anet.HorseRaceDetector", "background", null, new Object[0]);
        if (AwcnConfig.isHorseRaceEnable()) {
            ThreadPoolExecutorFactory.submitHRTask(new RunnableC4996g(this));
        }
    }

    @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
    public void forground() {
    }
}
