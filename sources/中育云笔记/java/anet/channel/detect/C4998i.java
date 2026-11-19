package anet.channel.detect;

import androidx.core.app.NotificationCompat;
import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.statist.HorseRaceStat;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.List;
import java.util.Map;

/* renamed from: anet.channel.detect.i */
/* loaded from: classes3.dex */
class C4998i implements RequestCb {

    /* renamed from: a */
    final /* synthetic */ C4997h f2387a;

    public C4998i(C4997h c4997h) {
        this.f2387a = c4997h;
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z10) {
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i10, String str, RequestStatistic requestStatistic) {
        ALog.m2530i("anet.HorseRaceDetector", "LongLinkTask request finish", this.f2387a.f2383c, HiAnalyticsConstant.HaKey.BI_KEY_RESULT, Integer.valueOf(i10), NotificationCompat.CATEGORY_MESSAGE, str);
        if (this.f2387a.f2381a.reqErrorCode == 0) {
            this.f2387a.f2381a.reqErrorCode = i10;
        } else {
            HorseRaceStat horseRaceStat = this.f2387a.f2381a;
            horseRaceStat.reqRet = horseRaceStat.reqErrorCode == 200 ? 1 : 0;
        }
        HorseRaceStat horseRaceStat2 = this.f2387a.f2381a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C4997h c4997h = this.f2387a;
        horseRaceStat2.reqTime = (jCurrentTimeMillis - c4997h.f2382b) + c4997h.f2381a.connTime;
        synchronized (this.f2387a.f2381a) {
            this.f2387a.f2381a.notify();
        }
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i10, Map<String, List<String>> map) {
        this.f2387a.f2381a.reqErrorCode = i10;
    }
}
