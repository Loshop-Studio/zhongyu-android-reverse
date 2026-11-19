package anetwork.channel.unified;

import anetwork.channel.unified.C1010k.a;

/* renamed from: anetwork.channel.unified.m */
/* loaded from: classes.dex */
class RunnableC1012m implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1010k f5694a;

    RunnableC1012m(C1010k c1010k) {
        this.f5694a = c1010k;
    }

    @Override // java.lang.Runnable
    public void run() {
        C1010k c1010k = this.f5694a;
        c1010k.new a(0, c1010k.f5688a.f5682a.m4724a(), this.f5694a.f5688a.f5683b).proceed(this.f5694a.f5688a.f5682a.m4724a(), this.f5694a.f5688a.f5683b);
    }
}
