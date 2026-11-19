package com.blankj.utilcode.util;

import androidx.annotation.NonNull;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes2.dex */
final class ThreadUtils$LinkedBlockingQueue4Util extends LinkedBlockingQueue<Runnable> {
    private int mCapacity;
    private volatile C3393m mPool;

    public ThreadUtils$LinkedBlockingQueue4Util() {
        this.mCapacity = Integer.MAX_VALUE;
    }

    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(@NonNull Runnable runnable) {
        if (this.mCapacity > size() || this.mPool == null || this.mPool.getPoolSize() >= this.mPool.getMaximumPoolSize()) {
            return super.offer((ThreadUtils$LinkedBlockingQueue4Util) runnable);
        }
        return false;
    }

    public ThreadUtils$LinkedBlockingQueue4Util(boolean z8) {
        this.mCapacity = Integer.MAX_VALUE;
        if (z8) {
            this.mCapacity = 0;
        }
    }

    public ThreadUtils$LinkedBlockingQueue4Util(int i) {
        this.mCapacity = i;
    }
}
