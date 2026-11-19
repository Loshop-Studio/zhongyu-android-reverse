package anet.channel.heartbeat;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.Session;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import java.util.concurrent.TimeUnit;

/* renamed from: anet.channel.heartbeat.b */
/* loaded from: classes3.dex */
class RunnableC5021b implements IHeartbeat, Runnable {

    /* renamed from: a */
    private Session f2451a;

    /* renamed from: b */
    private volatile long f2452b = 0;

    /* renamed from: c */
    private volatile boolean f2453c = false;

    /* renamed from: d */
    private long f2454d = 0;

    /* renamed from: a */
    private void m2349a(long j10) {
        try {
            this.f2452b = System.currentTimeMillis() + j10;
            ThreadPoolExecutorFactory.submitScheduledTask(this, j10 + 50, TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            ALog.m2528e("awcn.DefaultHeartbeatImpl", "Submit heartbeat task failed.", this.f2451a.f2283p, e10, new Object[0]);
        }
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void reSchedule() {
        this.f2452b = System.currentTimeMillis() + this.f2454d;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f2453c) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < this.f2452b - 1000) {
            m2349a(this.f2452b - jCurrentTimeMillis);
            return;
        }
        if (GlobalAppRuntimeInfo.isAppBackground()) {
            Session session = this.f2451a;
            ALog.m2529e("awcn.DefaultHeartbeatImpl", "close session in background", session.f2283p, "session", session);
            this.f2451a.close(false);
        } else {
            if (ALog.isPrintLog(1)) {
                Session session2 = this.f2451a;
                ALog.m2527d("awcn.DefaultHeartbeatImpl", "heartbeat", session2.f2283p, "session", session2);
            }
            this.f2451a.ping(true);
            m2349a(this.f2454d);
        }
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void start(Session session) {
        if (session == null) {
            throw new NullPointerException("session is null");
        }
        this.f2451a = session;
        long heartbeat = session.getConnStrategy().getHeartbeat();
        this.f2454d = heartbeat;
        if (heartbeat <= 0) {
            this.f2454d = 45000L;
        }
        ALog.m2530i("awcn.DefaultHeartbeatImpl", "heartbeat start", session.f2283p, "session", session, "interval", Long.valueOf(this.f2454d));
        m2349a(this.f2454d);
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void stop() {
        Session session = this.f2451a;
        if (session == null) {
            return;
        }
        ALog.m2530i("awcn.DefaultHeartbeatImpl", "heartbeat stop", session.f2283p, "session", session);
        this.f2453c = true;
    }
}
