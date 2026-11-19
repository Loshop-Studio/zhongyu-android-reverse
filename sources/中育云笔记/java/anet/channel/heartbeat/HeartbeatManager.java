package anet.channel.heartbeat;

/* loaded from: classes3.dex */
public class HeartbeatManager {
    public static IHeartbeat getDefaultBackgroundAccsHeartbeat() {
        return new RunnableC5020a();
    }

    public static IHeartbeat getDefaultHeartbeat() {
        return new RunnableC5021b();
    }
}
