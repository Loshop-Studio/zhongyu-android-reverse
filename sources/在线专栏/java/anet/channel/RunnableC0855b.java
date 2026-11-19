package anet.channel;

import anet.channel.entity.C0890b;
import anet.channel.entity.EventCb;
import anet.channel.util.ALog;
import java.util.Map;

/* renamed from: anet.channel.b */
/* loaded from: classes.dex */
class RunnableC0855b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f5061a;

    /* renamed from: b */
    final /* synthetic */ C0890b f5062b;

    /* renamed from: c */
    final /* synthetic */ Session f5063c;

    RunnableC0855b(Session session, int i4, C0890b c0890b) {
        this.f5063c = session;
        this.f5061a = i4;
        this.f5062b = c0890b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Map<EventCb, Integer> map = this.f5063c.f4991b;
            if (map != null) {
                for (EventCb eventCb : map.keySet()) {
                    if (eventCb != null) {
                        int iIntValue = this.f5063c.f4991b.get(eventCb).intValue();
                        int i4 = this.f5061a;
                        if ((iIntValue & i4) != 0) {
                            try {
                                eventCb.onEvent(this.f5063c, i4, this.f5062b);
                            } catch (Exception e4) {
                                ALog.m4638e("awcn.Session", e4.toString(), this.f5063c.f5005p, new Object[0]);
                            }
                        }
                    }
                }
            }
        } catch (Exception e5) {
            ALog.m4637e("awcn.Session", "handleCallbacks", this.f5063c.f5005p, e5, new Object[0]);
        }
    }
}
