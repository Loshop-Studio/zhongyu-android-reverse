package com.efs.sdk.base.p020a.p031h.p032a;

import android.support.annotation.NonNull;
import com.efs.sdk.base.p020a.p031h.C2957d;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.efs.sdk.base.a.h.a.d */
/* loaded from: classes2.dex */
public final class C2947d {

    /* renamed from: a */
    private static ThreadPoolExecutor f1136a = new ThreadPoolExecutor(2, 2, 10, TimeUnit.MINUTES, new LinkedBlockingQueue(Integer.MAX_VALUE), new ThreadPoolExecutor.DiscardOldestPolicy());

    /* renamed from: a */
    public static Future<?> m2177a(@NonNull Runnable runnable) {
        try {
            return f1136a.submit(runnable);
        } catch (Throwable th) {
            C2957d.m2214b("efs.util.concurrent", "submit task error!", th);
            return null;
        }
    }
}
