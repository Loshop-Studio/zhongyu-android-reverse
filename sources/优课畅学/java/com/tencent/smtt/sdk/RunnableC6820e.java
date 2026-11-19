package com.tencent.smtt.sdk;

/* renamed from: com.tencent.smtt.sdk.e */
/* loaded from: classes4.dex */
class RunnableC6820e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f6890a;

    /* renamed from: b */
    final /* synthetic */ C6819d f6891b;

    public RunnableC6820e(C6819d c6819d, boolean z10) {
        this.f6891b = c6819d;
        this.f6890a = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6891b.f6889c.onReceiveValue(Boolean.valueOf(this.f6890a));
    }
}
