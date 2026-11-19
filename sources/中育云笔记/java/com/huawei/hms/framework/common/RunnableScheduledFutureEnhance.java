package com.huawei.hms.framework.common;

import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class RunnableScheduledFutureEnhance<T> implements RunnableScheduledFuture<T> {

    /* renamed from: c */
    public RunnableScheduledFuture f11650c;

    /* renamed from: d */
    public String f11651d = Thread.currentThread().getName();

    public RunnableScheduledFutureEnhance(RunnableScheduledFuture<T> runnableScheduledFuture) {
        this.f11650c = runnableScheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f11650c.cancel(z10);
    }

    public boolean equals(Object obj) {
        return this.f11650c.equals(obj);
    }

    @Override // java.util.concurrent.Future
    public T get() {
        return (T) this.f11650c.get();
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f11650c.getDelay(timeUnit);
    }

    public String getParentName() {
        return this.f11651d;
    }

    public int hashCode() {
        return this.f11650c.hashCode();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f11650c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f11650c.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public boolean isPeriodic() {
        return this.f11650c.isPeriodic();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.f11650c.run();
    }

    @Override // java.lang.Comparable
    public int compareTo(Delayed delayed) {
        return this.f11650c.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public T get(long j10, TimeUnit timeUnit) {
        return (T) this.f11650c.get(j10, timeUnit);
    }
}
