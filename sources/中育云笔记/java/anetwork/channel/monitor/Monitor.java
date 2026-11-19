package anetwork.channel.monitor;

import android.content.Context;
import anet.channel.monitor.C5026a;
import anet.channel.monitor.C5027b;
import anet.channel.monitor.C5031f;
import anet.channel.monitor.INetworkQualityChangeListener;
import anet.channel.monitor.NetworkSpeed;
import anet.channel.util.ALog;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class Monitor {
    private static final String TAG = "anet.Monitor";
    static AtomicBoolean isInit = new AtomicBoolean(false);

    public static void addListener(INetworkQualityChangeListener iNetworkQualityChangeListener) {
        addListener(iNetworkQualityChangeListener, null);
    }

    public static NetworkSpeed getNetSpeed() {
        NetworkSpeed networkSpeed = NetworkSpeed.Fast;
        try {
            return NetworkSpeed.valueOfCode(C5027b.m2355a().m2361b());
        } catch (Throwable th) {
            ALog.m2528e(TAG, "getNetworkSpeed failed", null, th, new Object[0]);
            return networkSpeed;
        }
    }

    public static double getNetSpeedValue() {
        return C5027b.m2355a().m2362c();
    }

    @Deprecated
    public static anetwork.channel.monitor.speed.NetworkSpeed getNetworkSpeed() {
        return anetwork.channel.monitor.speed.NetworkSpeed.valueOfCode(getNetSpeed().getCode());
    }

    public static synchronized void init() {
        if (isInit.compareAndSet(false, true)) {
            C5027b.m2355a().m2363d();
        }
    }

    public static void removeListener(INetworkQualityChangeListener iNetworkQualityChangeListener) {
        C5026a.m2350a().m2352a(iNetworkQualityChangeListener);
    }

    public static void start() {
        try {
            C5027b.m2355a().m2363d();
        } catch (Throwable th) {
            ALog.m2528e(TAG, "start failed", null, th, new Object[0]);
        }
    }

    public static void stop() {
        try {
            C5027b.m2355a().m2364e();
        } catch (Throwable th) {
            ALog.m2528e(TAG, "stop failed", null, th, new Object[0]);
        }
    }

    public static void addListener(INetworkQualityChangeListener iNetworkQualityChangeListener, C5031f c5031f) {
        C5026a.m2350a().m2353a(iNetworkQualityChangeListener, c5031f);
    }

    @Deprecated
    public static synchronized void init(Context context) {
        init();
    }
}
