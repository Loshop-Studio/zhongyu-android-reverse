package anet.channel;

import anet.channel.SessionRequest;
import anet.channel.util.C0968i;

/* renamed from: anet.channel.i */
/* loaded from: classes.dex */
class RunnableC0900i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Session f5180a;

    /* renamed from: b */
    final /* synthetic */ SessionRequest.C0847a f5181b;

    RunnableC0900i(SessionRequest.C0847a c0847a, Session session) {
        this.f5181b = c0847a;
        this.f5180a = session;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            SessionRequest.C0847a c0847a = this.f5181b;
            SessionRequest.this.m4369a(c0847a.f5042c, this.f5180a.getConnType().getType(), C0968i.m4663a(SessionRequest.this.f5028a.f5019c), (SessionGetCallback) null, 0L);
        } catch (Exception unused) {
        }
    }
}
