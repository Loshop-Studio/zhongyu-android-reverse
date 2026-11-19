package anet.channel.session;

import anet.channel.RequestCb;
import anet.channel.entity.C0890b;
import anet.channel.request.Request;

/* renamed from: anet.channel.session.e */
/* loaded from: classes.dex */
class RunnableC0922e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Request f5295a;

    /* renamed from: b */
    final /* synthetic */ C0921d f5296b;

    RunnableC0922e(C0921d c0921d, Request request) {
        this.f5296b = c0921d;
        this.f5295a = request;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i4 = C0919b.m4540a(this.f5295a, (RequestCb) null).f5288a;
        if (i4 > 0) {
            this.f5296b.notifyStatus(4, new C0890b(1));
        } else {
            this.f5296b.handleCallbacks(256, new C0890b(256, i4, "Http connect fail"));
        }
    }
}
