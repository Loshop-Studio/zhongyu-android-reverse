package anet.channel.heartbeat;

import anet.channel.Session;
import anet.channel.thread.ThreadPoolExecutorFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: anet.channel.heartbeat.a */
/* loaded from: classes3.dex */
public class RunnableC5020a implements IHeartbeat, Runnable {

    /* renamed from: a */
    Session f2449a = null;

    /* renamed from: b */
    volatile boolean f2450b = false;

    @Override // anet.channel.heartbeat.IHeartbeat
    public void reSchedule() {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f2450b) {
            return;
        }
        this.f2449a.ping(true);
        ThreadPoolExecutorFactory.submitScheduledTask(this, 45000L, TimeUnit.MILLISECONDS);
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void start(Session session) {
        if (session == null) {
            throw new NullPointerException("session is null");
        }
        this.f2449a = session;
        run();
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void stop() {
        this.f2450b = true;
    }
}
