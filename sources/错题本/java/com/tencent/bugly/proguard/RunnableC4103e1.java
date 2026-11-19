package com.tencent.bugly.proguard;

import android.view.CoroutineLiveDataKt;

/* renamed from: com.tencent.bugly.proguard.e1 */
/* loaded from: classes3.dex */
public final class RunnableC4103e1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3812a;

    /* renamed from: b */
    public final /* synthetic */ C4133r f3813b;

    public /* synthetic */ RunnableC4103e1(C4133r c4133r, int i) {
        this.f3812a = i;
        this.f3813b = c4133r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3812a) {
            case 0:
                try {
                    this.f3813b.m3341a(false);
                    break;
                } catch (Throwable th) {
                    C4055al.m3022a(th);
                    return;
                }
            default:
                long jCurrentTimeMillis = System.currentTimeMillis();
                C4133r c4133r = this.f3813b;
                if (jCurrentTimeMillis >= c4133r.f3873b) {
                    c4133r.m3349a(3, false);
                    c4133r.m3348a();
                    break;
                } else {
                    C4054ak.m3012a().m3015a(new RunnableC4103e1(c4133r, 1), (c4133r.f3873b - jCurrentTimeMillis) + CoroutineLiveDataKt.DEFAULT_TIMEOUT);
                    break;
                }
        }
    }
}
