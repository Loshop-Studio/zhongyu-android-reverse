package com.tencent.bugly.proguard;

/* renamed from: com.tencent.bugly.proguard.g1 */
/* loaded from: classes3.dex */
public final class RunnableC4109g1 implements Runnable {

    /* renamed from: a */
    public final long f3832a;

    /* renamed from: b */
    public final /* synthetic */ C4133r f3833b;

    public RunnableC4109g1(C4133r c4133r, long j7) {
        this.f3833b = c4133r;
        this.f3832a = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4133r c4133r = this.f3833b;
        c4133r.m3351b();
        c4133r.m3350a(this.f3832a);
    }
}
