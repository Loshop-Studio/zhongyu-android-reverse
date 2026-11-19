package com.efs.sdk.base.p035a.p046h.p047a;

import com.efs.sdk.base.p035a.p046h.C1329d;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.efs.sdk.base.a.h.a.d */
/* loaded from: classes.dex */
public final class C1319d {

    /* renamed from: a */
    private static ThreadPoolExecutor f7106a = new ThreadPoolExecutor(2, 2, 10, TimeUnit.MINUTES, new LinkedBlockingQueue(Integer.MAX_VALUE), new ThreadPoolExecutor.DiscardOldestPolicy());

    /* renamed from: a */
    public static Future<?> m5536a(Runnable runnable) {
        try {
            return f7106a.submit(runnable);
        } catch (Throwable th) {
            C1329d.m5573b("efs.util.concurrent", "submit task error!", th);
            return null;
        }
    }
}
