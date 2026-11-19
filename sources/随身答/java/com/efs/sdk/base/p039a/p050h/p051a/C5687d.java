package com.efs.sdk.base.p039a.p050h.p051a;

import androidx.annotation.NonNull;
import com.efs.sdk.base.p039a.p050h.C5697d;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.efs.sdk.base.a.h.a.d */
/* loaded from: classes3.dex */
public final class C5687d {

    /* renamed from: a */
    private static ThreadPoolExecutor f4740a = new ThreadPoolExecutor(2, 2, 10, TimeUnit.MINUTES, new LinkedBlockingQueue(Integer.MAX_VALUE), new ThreadPoolExecutor.DiscardOldestPolicy());

    /* renamed from: a */
    public static Future<?> m4146a(@NonNull Runnable runnable) {
        try {
            return f4740a.submit(runnable);
        } catch (Throwable th) {
            C5697d.m4183b("efs.util.concurrent", "submit task error!", th);
            return null;
        }
    }
}
