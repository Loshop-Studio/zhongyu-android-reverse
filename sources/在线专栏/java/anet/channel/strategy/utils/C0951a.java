package anet.channel.strategy.utils;

import anet.channel.strategy.dispatch.C0938a;
import anet.channel.util.ALog;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: anet.channel.strategy.utils.a */
/* loaded from: classes.dex */
public class C0951a {

    /* renamed from: a */
    private static AtomicInteger f5447a = new AtomicInteger(0);

    /* renamed from: b */
    private static ScheduledThreadPoolExecutor f5448b = null;

    /* renamed from: a */
    static ScheduledThreadPoolExecutor m4624a() {
        if (f5448b == null) {
            synchronized (C0951a.class) {
                if (f5448b == null) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, new ThreadFactoryC0952b());
                    f5448b = scheduledThreadPoolExecutor;
                    scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
                    f5448b.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f5448b;
    }

    /* renamed from: a */
    public static void m4625a(Runnable runnable) {
        try {
            m4624a().submit(runnable);
        } catch (Exception e4) {
            ALog.m4637e(C0938a.TAG, "submit task failed", null, e4, new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m4626a(Runnable runnable, long j4) {
        try {
            m4624a().schedule(runnable, j4, TimeUnit.MILLISECONDS);
        } catch (Exception e4) {
            ALog.m4637e(C0938a.TAG, "schedule task failed", null, e4, new Object[0]);
        }
    }
}
