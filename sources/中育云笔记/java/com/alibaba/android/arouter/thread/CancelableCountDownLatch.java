package com.alibaba.android.arouter.thread;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public class CancelableCountDownLatch extends CountDownLatch {
    public CancelableCountDownLatch(int i10) {
        super(i10);
    }

    public void cancel() {
        while (getCount() > 0) {
            countDown();
        }
    }
}
