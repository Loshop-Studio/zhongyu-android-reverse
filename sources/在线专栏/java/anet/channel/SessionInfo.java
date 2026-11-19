package anet.channel;

import anet.channel.heartbeat.IHeartbeat;

/* loaded from: classes.dex */
public class SessionInfo {
    public final IAuth auth;
    public final DataFrameCb dataFrameCb;
    public final IHeartbeat heartbeat;
    public final String host;
    public final boolean isAccs;
    public final boolean isKeepAlive;

    private SessionInfo(String str, boolean z3, boolean z4, IAuth iAuth, IHeartbeat iHeartbeat, DataFrameCb dataFrameCb) {
        this.host = str;
        this.isAccs = z4;
        this.auth = iAuth;
        this.isKeepAlive = z3;
        this.heartbeat = iHeartbeat;
        this.dataFrameCb = dataFrameCb;
    }

    public static SessionInfo create(String str, boolean z3, boolean z4, IAuth iAuth, IHeartbeat iHeartbeat, DataFrameCb dataFrameCb) {
        return new SessionInfo(str, z3, z4, iAuth, iHeartbeat, dataFrameCb);
    }
}
