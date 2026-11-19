package anet.channel;

import anet.channel.SessionRequest;
import anet.channel.util.C5091i;

/* renamed from: anet.channel.i */
/* loaded from: classes3.dex */
class RunnableC5023i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Session f2458a;

    /* renamed from: b */
    final /* synthetic */ SessionRequest.C4970a f2459b;

    public RunnableC5023i(SessionRequest.C4970a c4970a, Session session) {
        this.f2459b = c4970a;
        this.f2458a = session;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            SessionRequest.C4970a c4970a = this.f2459b;
            SessionRequest.this.m2260a(c4970a.f2320c, this.f2458a.getConnType().getType(), C5091i.m2554a(SessionRequest.this.f2306a.f2297c), (SessionGetCallback) null, 0L);
        } catch (Exception unused) {
        }
    }
}
