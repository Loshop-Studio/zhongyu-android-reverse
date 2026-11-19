package com.alibaba.sdk.android.push.util;

import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.alibaba.sdk.android.push.util.c */
/* loaded from: classes.dex */
public class C1192c {

    /* renamed from: c */
    public static final AmsLogger f6915c = AmsLogger.getLogger("MPS:SyncTool");

    /* renamed from: a */
    Lock f6916a;

    /* renamed from: b */
    Condition f6917b;

    public C1192c() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f6916a = reentrantLock;
        this.f6917b = reentrantLock.newCondition();
    }

    /* renamed from: a */
    public void m5375a() {
        this.f6916a.lock();
        try {
            this.f6917b.signal();
        } finally {
            this.f6916a.unlock();
        }
    }

    /* renamed from: a */
    public void m5376a(int i4) {
        this.f6916a.lock();
        try {
            try {
                this.f6917b.await(i4, TimeUnit.SECONDS);
            } catch (InterruptedException e4) {
                f6915c.m5020e("await error:", e4);
            }
        } finally {
            this.f6916a.unlock();
        }
    }
}
