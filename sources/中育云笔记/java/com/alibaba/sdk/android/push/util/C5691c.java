package com.alibaba.sdk.android.push.util;

import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.alibaba.sdk.android.push.util.c */
/* loaded from: classes3.dex */
public class C5691c {

    /* renamed from: c */
    public static final AmsLogger f4441c = AmsLogger.getLogger("MPS:SyncTool");

    /* renamed from: a */
    Lock f4442a;

    /* renamed from: b */
    Condition f4443b;

    public C5691c() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f4442a = reentrantLock;
        this.f4443b = reentrantLock.newCondition();
    }

    /* renamed from: a */
    public void m3827a() {
        this.f4442a.lock();
        try {
            this.f4443b.signal();
        } finally {
            this.f4442a.unlock();
        }
    }

    /* renamed from: a */
    public void m3828a(int i10) {
        this.f4442a.lock();
        try {
            try {
                this.f4443b.await(i10, TimeUnit.SECONDS);
            } catch (InterruptedException e10) {
                f4441c.m3421e("await error:", e10);
            }
        } finally {
            this.f4442a.unlock();
        }
    }
}
