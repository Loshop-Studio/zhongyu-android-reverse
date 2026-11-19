package com.tencent.bugly.proguard;

/* renamed from: com.tencent.bugly.proguard.o0 */
/* loaded from: classes3.dex */
public final class RunnableC4128o0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3858a;

    /* renamed from: b */
    public final /* synthetic */ String f3859b;

    /* renamed from: c */
    public final /* synthetic */ String f3860c;

    /* renamed from: d */
    public final /* synthetic */ String f3861d;

    public /* synthetic */ RunnableC4128o0(String str, String str2, String str3, int i) {
        this.f3858a = i;
        this.f3859b = str;
        this.f3860c = str2;
        this.f3861d = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3858a) {
            case 0:
                C4058ao.m3045d(this.f3859b, this.f3860c, this.f3861d);
                break;
            default:
                C4058ao.m3046e(this.f3859b, this.f3860c, this.f3861d);
                break;
        }
    }
}
