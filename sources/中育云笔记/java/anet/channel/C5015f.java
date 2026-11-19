package anet.channel;

import anet.channel.SessionRequest;
import anet.channel.entity.C5013b;
import anet.channel.entity.EventCb;
import anet.channel.util.ALog;

/* renamed from: anet.channel.f */
/* loaded from: classes3.dex */
class C5015f implements EventCb {

    /* renamed from: a */
    final /* synthetic */ SessionRequest.IConnCb f2431a;

    /* renamed from: b */
    final /* synthetic */ long f2432b;

    /* renamed from: c */
    final /* synthetic */ SessionRequest f2433c;

    public C5015f(SessionRequest sessionRequest, SessionRequest.IConnCb iConnCb, long j10) {
        this.f2433c = sessionRequest;
        this.f2431a = iConnCb;
        this.f2432b = j10;
    }

    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i10, C5013b c5013b) {
        if (session == null) {
            return;
        }
        int i11 = c5013b == null ? 0 : c5013b.f2426b;
        String str = c5013b == null ? "" : c5013b.f2427c;
        if (i10 == 2) {
            int i12 = i11;
            ALog.m2527d("awcn.SessionRequest", null, session.f2283p, "Session", session, "EventType", Integer.valueOf(i10), "Event", c5013b);
            this.f2433c.m2263a(session, i12, str);
            SessionRequest sessionRequest = this.f2433c;
            if (sessionRequest.f2307b.m2318c(sessionRequest, session)) {
                this.f2431a.onDisConnect(session, this.f2432b, i10);
                return;
            } else {
                this.f2431a.onFailed(session, this.f2432b, i10, i12);
                return;
            }
        }
        if (i10 == 256) {
            ALog.m2527d("awcn.SessionRequest", null, session.f2283p, "Session", session, "EventType", Integer.valueOf(i10), "Event", c5013b);
            this.f2431a.onFailed(session, this.f2432b, i10, i11);
        } else {
            if (i10 != 512) {
                return;
            }
            ALog.m2527d("awcn.SessionRequest", null, session.f2283p, "Session", session, "EventType", Integer.valueOf(i10), "Event", c5013b);
            this.f2433c.m2263a(session, 0, (String) null);
            this.f2431a.onSuccess(session, this.f2432b);
        }
    }
}
