package anet.channel.strategy.utils;

import anet.channel.strategy.dispatch.C5061a;
import anet.channel.util.ALog;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: anet.channel.strategy.utils.a */
/* loaded from: classes3.dex */
public class C5074a {

    /* renamed from: a */
    private static AtomicInteger f2725a = new AtomicInteger(0);

    /* renamed from: b */
    private static ScheduledThreadPoolExecutor f2726b = null;

    /* renamed from: a */
    public static ScheduledThreadPoolExecutor m2515a() {
        if (f2726b == null) {
            synchronized (C5074a.class) {
                try {
                    if (f2726b == null) {
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, new ThreadFactoryC5075b());
                        f2726b = scheduledThreadPoolExecutor;
                        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
                        f2726b.allowCoreThreadTimeOut(true);
                    }
                } finally {
                }
            }
        }
        return f2726b;
    }

    /* renamed from: a */
    public static void m2516a(Runnable runnable) {
        try {
            m2515a().submit(runnable);
        } catch (Exception e10) {
            ALog.m2528e(C5061a.TAG, "submit task failed", null, e10, new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m2517a(Runnable runnable, long j10) {
        try {
            m2515a().schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            ALog.m2528e(C5061a.TAG, "schedule task failed", null, e10, new Object[0]);
        }
    }
}
