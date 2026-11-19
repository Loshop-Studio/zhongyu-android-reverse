package anet.channel.heartbeat;

import anet.channel.Session;
import anet.channel.thread.ThreadPoolExecutorFactory;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: anet.channel.heartbeat.c */
/* loaded from: classes.dex */
public class RunnableC0899c implements IHeartbeat, Runnable {

    /* renamed from: a */
    private Session f5177a = null;

    /* renamed from: b */
    private volatile boolean f5178b = false;

    /* renamed from: c */
    private volatile long f5179c = System.currentTimeMillis();

    @Override // anet.channel.heartbeat.IHeartbeat
    public void reSchedule() {
        this.f5179c = System.currentTimeMillis() + 45000;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f5178b) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < this.f5179c - 1000) {
            ThreadPoolExecutorFactory.submitScheduledTask(this, this.f5179c - jCurrentTimeMillis, TimeUnit.MILLISECONDS);
        } else {
            this.f5177a.close(false);
        }
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void start(Session session) {
        Objects.requireNonNull(session, "session is null");
        this.f5177a = session;
        this.f5179c = System.currentTimeMillis() + 45000;
        ThreadPoolExecutorFactory.submitScheduledTask(this, 45000L, TimeUnit.MILLISECONDS);
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void stop() {
        this.f5178b = true;
    }
}
