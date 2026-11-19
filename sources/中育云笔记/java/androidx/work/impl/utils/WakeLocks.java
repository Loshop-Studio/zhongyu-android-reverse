package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.Logger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;

/* loaded from: classes3.dex */
public final class WakeLocks {
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WakeLocks");
        AbstractC9979u.m20293f(strTagWithPrefix, "tagWithPrefix(\"WakeLocks\")");
        TAG = strTagWithPrefix;
    }

    public static final void checkWakeLocks() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        WakeLocksHolder wakeLocksHolder = WakeLocksHolder.INSTANCE;
        synchronized (wakeLocksHolder) {
            linkedHashMap.putAll(wakeLocksHolder.getWakeLocks());
            C10786q c10786q = C10786q.f26013a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                Logger.get().warning(TAG, "WakeLock held for " + str);
            }
        }
    }

    public static final PowerManager.WakeLock newWakeLock(Context context, String tag) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        AbstractC9979u.m20292e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str = "WorkManager: " + tag;
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, str);
        WakeLocksHolder wakeLocksHolder = WakeLocksHolder.INSTANCE;
        synchronized (wakeLocksHolder) {
            wakeLocksHolder.getWakeLocks().put(wakeLock, str);
        }
        AbstractC9979u.m20293f(wakeLock, "wakeLock");
        return wakeLock;
    }
}
