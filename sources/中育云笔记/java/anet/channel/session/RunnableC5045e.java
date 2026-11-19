package anet.channel.session;

import anet.channel.RequestCb;
import anet.channel.entity.C5013b;
import anet.channel.request.Request;

/* renamed from: anet.channel.session.e */
/* loaded from: classes3.dex */
class RunnableC5045e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Request f2573a;

    /* renamed from: b */
    final /* synthetic */ C5044d f2574b;

    public RunnableC5045e(C5044d c5044d, Request request) {
        this.f2574b = c5044d;
        this.f2573a = request;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10 = C5042b.m2431a(this.f2573a, (RequestCb) null).f2566a;
        if (i10 > 0) {
            this.f2574b.notifyStatus(4, new C5013b(1));
        } else {
            this.f2574b.handleCallbacks(256, new C5013b(256, i10, "Http connect fail"));
        }
    }
}
