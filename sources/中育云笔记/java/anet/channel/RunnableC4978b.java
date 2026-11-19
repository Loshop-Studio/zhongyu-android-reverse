package anet.channel;

import anet.channel.entity.C5013b;
import anet.channel.entity.EventCb;
import anet.channel.util.ALog;
import java.util.Map;

/* renamed from: anet.channel.b */
/* loaded from: classes3.dex */
class RunnableC4978b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f2339a;

    /* renamed from: b */
    final /* synthetic */ C5013b f2340b;

    /* renamed from: c */
    final /* synthetic */ Session f2341c;

    public RunnableC4978b(Session session, int i10, C5013b c5013b) {
        this.f2341c = session;
        this.f2339a = i10;
        this.f2340b = c5013b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Map<EventCb, Integer> map = this.f2341c.f2269b;
            if (map != null) {
                for (EventCb eventCb : map.keySet()) {
                    if (eventCb != null) {
                        int iIntValue = this.f2341c.f2269b.get(eventCb).intValue();
                        int i10 = this.f2339a;
                        if ((iIntValue & i10) != 0) {
                            try {
                                eventCb.onEvent(this.f2341c, i10, this.f2340b);
                            } catch (Exception e10) {
                                ALog.m2529e("awcn.Session", e10.toString(), this.f2341c.f2283p, new Object[0]);
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            ALog.m2528e("awcn.Session", "handleCallbacks", this.f2341c.f2283p, e11, new Object[0]);
        }
    }
}
