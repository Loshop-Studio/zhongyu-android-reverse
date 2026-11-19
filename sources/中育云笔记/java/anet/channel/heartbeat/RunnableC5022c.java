package anet.channel.heartbeat;

import anet.channel.Session;
import anet.channel.thread.ThreadPoolExecutorFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: anet.channel.heartbeat.c */
/* loaded from: classes3.dex */
public class RunnableC5022c implements IHeartbeat, Runnable {

    /* renamed from: a */
    private Session f2455a = null;

    /* renamed from: b */
    private volatile boolean f2456b = false;

    /* renamed from: c */
    private volatile long f2457c = System.currentTimeMillis();

    @Override // anet.channel.heartbeat.IHeartbeat
    public void reSchedule() {
        this.f2457c = System.currentTimeMillis() + 45000;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f2456b) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < this.f2457c - 1000) {
            ThreadPoolExecutorFactory.submitScheduledTask(this, this.f2457c - jCurrentTimeMillis, TimeUnit.MILLISECONDS);
        } else {
            this.f2455a.close(false);
        }
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void start(Session session) {
        if (session == null) {
            throw new NullPointerException("session is null");
        }
        this.f2455a = session;
        this.f2457c = System.currentTimeMillis() + 45000;
        ThreadPoolExecutorFactory.submitScheduledTask(this, 45000L, TimeUnit.MILLISECONDS);
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void stop() {
        this.f2456b = true;
    }
}
