package anet.channel;

import anet.channel.SessionRequest;
import anet.channel.entity.C0890b;
import anet.channel.entity.EventCb;
import anet.channel.util.ALog;

/* renamed from: anet.channel.f */
/* loaded from: classes.dex */
class C0892f implements EventCb {

    /* renamed from: a */
    final /* synthetic */ SessionRequest.IConnCb f5153a;

    /* renamed from: b */
    final /* synthetic */ long f5154b;

    /* renamed from: c */
    final /* synthetic */ SessionRequest f5155c;

    C0892f(SessionRequest sessionRequest, SessionRequest.IConnCb iConnCb, long j4) {
        this.f5155c = sessionRequest;
        this.f5153a = iConnCb;
        this.f5154b = j4;
    }

    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i4, C0890b c0890b) {
        if (session == null) {
            return;
        }
        int i5 = c0890b == null ? 0 : c0890b.f5148b;
        String str = c0890b == null ? "" : c0890b.f5149c;
        if (i4 == 2) {
            ALog.m4636d("awcn.SessionRequest", null, session.f5005p, "Session", session, "EventType", Integer.valueOf(i4), "Event", c0890b);
            this.f5155c.m4372a(session, i5, str);
            SessionRequest sessionRequest = this.f5155c;
            if (sessionRequest.f5029b.m4427c(sessionRequest, session)) {
                this.f5153a.onDisConnect(session, this.f5154b, i4);
                return;
            } else {
                this.f5153a.onFailed(session, this.f5154b, i4, i5);
                return;
            }
        }
        if (i4 == 256) {
            ALog.m4636d("awcn.SessionRequest", null, session.f5005p, "Session", session, "EventType", Integer.valueOf(i4), "Event", c0890b);
            this.f5153a.onFailed(session, this.f5154b, i4, i5);
        } else {
            if (i4 != 512) {
                return;
            }
            ALog.m4636d("awcn.SessionRequest", null, session.f5005p, "Session", session, "EventType", Integer.valueOf(i4), "Event", c0890b);
            this.f5155c.m4372a(session, 0, (String) null);
            this.f5153a.onSuccess(session, this.f5154b);
        }
    }
}
