package anet.channel.detect;

import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.statist.HorseRaceStat;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import java.util.List;
import java.util.Map;

/* renamed from: anet.channel.detect.i */
/* loaded from: classes.dex */
class C0875i implements RequestCb {

    /* renamed from: a */
    final /* synthetic */ C0874h f5109a;

    C0875i(C0874h c0874h) {
        this.f5109a = c0874h;
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z3) {
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i4, String str, RequestStatistic requestStatistic) {
        ALog.m4639i("anet.HorseRaceDetector", "LongLinkTask request finish", this.f5109a.f5105c, "statusCode", Integer.valueOf(i4), "msg", str);
        if (this.f5109a.f5103a.reqErrorCode == 0) {
            this.f5109a.f5103a.reqErrorCode = i4;
        } else {
            HorseRaceStat horseRaceStat = this.f5109a.f5103a;
            horseRaceStat.reqRet = horseRaceStat.reqErrorCode == 200 ? 1 : 0;
        }
        HorseRaceStat horseRaceStat2 = this.f5109a.f5103a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0874h c0874h = this.f5109a;
        horseRaceStat2.reqTime = (jCurrentTimeMillis - c0874h.f5104b) + c0874h.f5103a.connTime;
        synchronized (this.f5109a.f5103a) {
            this.f5109a.f5103a.notify();
        }
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i4, Map<String, List<String>> map) {
        this.f5109a.f5103a.reqErrorCode = i4;
    }
}
