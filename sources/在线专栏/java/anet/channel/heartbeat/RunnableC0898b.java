package anet.channel.heartbeat;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.Session;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.umeng.analytics.pro.C1851ai;
import com.umeng.analytics.pro.C1896c;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: anet.channel.heartbeat.b */
/* loaded from: classes.dex */
class RunnableC0898b implements IHeartbeat, Runnable {

    /* renamed from: a */
    private Session f5173a;

    /* renamed from: b */
    private volatile long f5174b = 0;

    /* renamed from: c */
    private volatile boolean f5175c = false;

    /* renamed from: d */
    private long f5176d = 0;

    RunnableC0898b() {
    }

    /* renamed from: a */
    private void m4458a(long j4) {
        try {
            this.f5174b = System.currentTimeMillis() + j4;
            ThreadPoolExecutorFactory.submitScheduledTask(this, j4 + 50, TimeUnit.MILLISECONDS);
        } catch (Exception e4) {
            ALog.m4637e("awcn.DefaultHeartbeatImpl", "Submit heartbeat task failed.", this.f5173a.f5005p, e4, new Object[0]);
        }
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void reSchedule() {
        this.f5174b = System.currentTimeMillis() + this.f5176d;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f5175c) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < this.f5174b - 1000) {
            m4458a(this.f5174b - jCurrentTimeMillis);
            return;
        }
        if (GlobalAppRuntimeInfo.isAppBackground()) {
            Session session = this.f5173a;
            ALog.m4638e("awcn.DefaultHeartbeatImpl", "close session in background", session.f5005p, C1896c.f8597aw, session);
            this.f5173a.close(false);
        } else {
            if (ALog.isPrintLog(1)) {
                Session session2 = this.f5173a;
                ALog.m4636d("awcn.DefaultHeartbeatImpl", "heartbeat", session2.f5005p, C1896c.f8597aw, session2);
            }
            this.f5173a.ping(true);
            m4458a(this.f5176d);
        }
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void start(Session session) {
        Objects.requireNonNull(session, "session is null");
        this.f5173a = session;
        long heartbeat = session.getConnStrategy().getHeartbeat();
        this.f5176d = heartbeat;
        if (heartbeat <= 0) {
            this.f5176d = 45000L;
        }
        ALog.m4639i("awcn.DefaultHeartbeatImpl", "heartbeat start", session.f5005p, C1896c.f8597aw, session, C1851ai.f8269aR, Long.valueOf(this.f5176d));
        m4458a(this.f5176d);
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void stop() {
        Session session = this.f5173a;
        if (session == null) {
            return;
        }
        ALog.m4639i("awcn.DefaultHeartbeatImpl", "heartbeat stop", session.f5005p, C1896c.f8597aw, session);
        this.f5175c = true;
    }
}
