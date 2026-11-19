package anet.channel.detect;

import anet.channel.Session;
import anet.channel.entity.C0890b;
import anet.channel.entity.EventCb;
import anet.channel.request.Request;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.HorseRaceStat;
import anet.channel.strategy.C0947l;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import org.json.JSONException;

/* renamed from: anet.channel.detect.h */
/* loaded from: classes.dex */
class C0874h implements EventCb {

    /* renamed from: a */
    final /* synthetic */ HorseRaceStat f5103a;

    /* renamed from: b */
    final /* synthetic */ long f5104b;

    /* renamed from: c */
    final /* synthetic */ String f5105c;

    /* renamed from: d */
    final /* synthetic */ C0947l.e f5106d;

    /* renamed from: e */
    final /* synthetic */ TnetSpdySession f5107e;

    /* renamed from: f */
    final /* synthetic */ C0870d f5108f;

    C0874h(C0870d c0870d, HorseRaceStat horseRaceStat, long j4, String str, C0947l.e eVar, TnetSpdySession tnetSpdySession) {
        this.f5108f = c0870d;
        this.f5103a = horseRaceStat;
        this.f5104b = j4;
        this.f5105c = str;
        this.f5106d = eVar;
        this.f5107e = tnetSpdySession;
    }

    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i4, C0890b c0890b) throws JSONException {
        if (this.f5103a.connTime != 0) {
            return;
        }
        this.f5103a.connTime = System.currentTimeMillis() - this.f5104b;
        if (i4 != 1) {
            this.f5103a.connErrorCode = c0890b.f5148b;
            synchronized (this.f5103a) {
                this.f5103a.notify();
            }
            return;
        }
        ALog.m4639i("anet.HorseRaceDetector", "tnetSpdySession connect success", this.f5105c, new Object[0]);
        this.f5103a.connRet = 1;
        HttpUrl httpUrl = HttpUrl.parse(session.getHost() + this.f5106d.f5442c);
        if (httpUrl == null) {
            return;
        }
        this.f5107e.request(new Request.Builder().setUrl(httpUrl).setReadTimeout(this.f5106d.f5441b.f5413d).setRedirectEnable(false).setSeq(this.f5105c).build(), new C0875i(this));
    }
}
