package anet.channel.detect;

import anet.channel.Session;
import anet.channel.entity.C5013b;
import anet.channel.entity.EventCb;
import anet.channel.request.Request;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.HorseRaceStat;
import anet.channel.strategy.C5070l;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import org.json.JSONException;

/* renamed from: anet.channel.detect.h */
/* loaded from: classes3.dex */
class C4997h implements EventCb {

    /* renamed from: a */
    final /* synthetic */ HorseRaceStat f2381a;

    /* renamed from: b */
    final /* synthetic */ long f2382b;

    /* renamed from: c */
    final /* synthetic */ String f2383c;

    /* renamed from: d */
    final /* synthetic */ C5070l.e f2384d;

    /* renamed from: e */
    final /* synthetic */ TnetSpdySession f2385e;

    /* renamed from: f */
    final /* synthetic */ C4993d f2386f;

    public C4997h(C4993d c4993d, HorseRaceStat horseRaceStat, long j10, String str, C5070l.e eVar, TnetSpdySession tnetSpdySession) {
        this.f2386f = c4993d;
        this.f2381a = horseRaceStat;
        this.f2382b = j10;
        this.f2383c = str;
        this.f2384d = eVar;
        this.f2385e = tnetSpdySession;
    }

    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i10, C5013b c5013b) throws JSONException {
        if (this.f2381a.connTime != 0) {
            return;
        }
        this.f2381a.connTime = System.currentTimeMillis() - this.f2382b;
        if (i10 != 1) {
            this.f2381a.connErrorCode = c5013b.f2426b;
            synchronized (this.f2381a) {
                this.f2381a.notify();
            }
            return;
        }
        ALog.m2530i("anet.HorseRaceDetector", "tnetSpdySession connect success", this.f2383c, new Object[0]);
        this.f2381a.connRet = 1;
        HttpUrl httpUrl = HttpUrl.parse(session.getHost() + this.f2384d.f2720c);
        if (httpUrl == null) {
            return;
        }
        this.f2385e.request(new Request.Builder().setUrl(httpUrl).setReadTimeout(this.f2384d.f2719b.f2691d).setRedirectEnable(false).setSeq(this.f2383c).build(), new C4998i(this));
    }
}
