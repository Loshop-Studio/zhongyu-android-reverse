package anet.channel.detect;

import anet.channel.AwcnConfig;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;

/* renamed from: anet.channel.detect.f */
/* loaded from: classes.dex */
class C0872f implements AppLifecycle.AppLifecycleListener {

    /* renamed from: a */
    final /* synthetic */ C0870d f5101a;

    C0872f(C0870d c0870d) {
        this.f5101a = c0870d;
    }

    @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
    public void background() {
        ALog.m4639i("anet.HorseRaceDetector", "background", null, new Object[0]);
        if (AwcnConfig.isHorseRaceEnable()) {
            ThreadPoolExecutorFactory.submitHRTask(new RunnableC0873g(this));
        }
    }

    @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
    public void forground() {
    }
}
