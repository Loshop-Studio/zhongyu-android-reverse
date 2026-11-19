package anetwork.channel.monitor;

import android.content.Context;
import anet.channel.monitor.C0903a;
import anet.channel.monitor.C0904b;
import anet.channel.monitor.C0908f;
import anet.channel.monitor.INetworkQualityChangeListener;
import anet.channel.monitor.NetworkSpeed;
import anet.channel.util.ALog;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class Monitor {
    private static final String TAG = "anet.Monitor";
    static AtomicBoolean isInit = new AtomicBoolean(false);

    public static void addListener(INetworkQualityChangeListener iNetworkQualityChangeListener) {
        addListener(iNetworkQualityChangeListener, null);
    }

    public static NetworkSpeed getNetSpeed() {
        NetworkSpeed networkSpeed = NetworkSpeed.Fast;
        try {
            return NetworkSpeed.valueOfCode(C0904b.m4464a().m4470b());
        } catch (Throwable th) {
            ALog.m4637e(TAG, "getNetworkSpeed failed", null, th, new Object[0]);
            return networkSpeed;
        }
    }

    public static double getNetSpeedValue() {
        return C0904b.m4464a().m4471c();
    }

    @Deprecated
    public static anetwork.channel.monitor.speed.NetworkSpeed getNetworkSpeed() {
        return anetwork.channel.monitor.speed.NetworkSpeed.valueOfCode(getNetSpeed().getCode());
    }

    public static synchronized void init() {
        if (isInit.compareAndSet(false, true)) {
            C0904b.m4464a().m4472d();
        }
    }

    public static void removeListener(INetworkQualityChangeListener iNetworkQualityChangeListener) {
        C0903a.m4459a().m4461a(iNetworkQualityChangeListener);
    }

    public static void start() {
        try {
            C0904b.m4464a().m4472d();
        } catch (Throwable th) {
            ALog.m4637e(TAG, "start failed", null, th, new Object[0]);
        }
    }

    public static void stop() {
        try {
            C0904b.m4464a().m4473e();
        } catch (Throwable th) {
            ALog.m4637e(TAG, "stop failed", null, th, new Object[0]);
        }
    }

    public static void addListener(INetworkQualityChangeListener iNetworkQualityChangeListener, C0908f c0908f) {
        C0903a.m4459a().m4462a(iNetworkQualityChangeListener, c0908f);
    }

    @Deprecated
    public static synchronized void init(Context context) {
        init();
    }
}
