package com.blankj.utilcode.util;

import android.support.v4.media.AbstractC0037f;
import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
final class ThreadUtils$UtilsThreadFactory extends AtomicLong implements ThreadFactory {

    /* renamed from: a */
    public static final AtomicInteger f2113a = new AtomicInteger(1);
    private static final long serialVersionUID = -9209200509960368598L;
    private final boolean isDaemon;
    private final String namePrefix;
    private final int priority;

    public ThreadUtils$UtilsThreadFactory(String str, int i) {
        this(str, i, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(@NonNull Runnable runnable) {
        C3394n c3394n = new C3394n(runnable, this.namePrefix + getAndIncrement(), 0);
        c3394n.setDaemon(this.isDaemon);
        c3394n.setUncaughtExceptionHandler(new C3395o());
        c3394n.setPriority(this.priority);
        return c3394n;
    }

    public ThreadUtils$UtilsThreadFactory(String str, int i, boolean z8) {
        StringBuilder sbM98w = AbstractC0037f.m98w(str, "-pool-");
        sbM98w.append(f2113a.getAndIncrement());
        sbM98w.append("-thread-");
        this.namePrefix = sbM98w.toString();
        this.priority = i;
        this.isDaemon = z8;
    }
}
