package anetwork.channel.entity;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.detect.C5003n;
import anet.channel.fulltrace.C5016a;
import anet.channel.fulltrace.C5017b;
import anet.channel.statist.RequestMonitor;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.utils.C5076c;
import anet.channel.util.ALog;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.aidl.ParcelableNetworkListener;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.stat.NetworkStat;
import anetwork.channel.util.RequestConstant;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: anetwork.channel.entity.f */
/* loaded from: classes3.dex */
class RunnableC5120f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ DefaultFinishEvent f2900a;

    /* renamed from: b */
    final /* synthetic */ ParcelableNetworkListener f2901b;

    /* renamed from: c */
    final /* synthetic */ C5117c f2902c;

    public RunnableC5120f(C5117c c5117c, DefaultFinishEvent defaultFinishEvent, ParcelableNetworkListener parcelableNetworkListener) {
        this.f2902c = c5117c;
        this.f2900a = defaultFinishEvent;
        this.f2901b = parcelableNetworkListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        DefaultFinishEvent defaultFinishEvent = this.f2900a;
        String strOptString = null;
        if (defaultFinishEvent != null) {
            defaultFinishEvent.setContext(null);
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            RequestStatistic requestStatistic = this.f2900a.f2776rs;
            if (requestStatistic != null) {
                requestStatistic.rspCbStart = jCurrentTimeMillis;
                requestStatistic.lastProcessTime = jCurrentTimeMillis - requestStatistic.rspEnd;
                requestStatistic.oneWayTime = requestStatistic.retryCostTime + (jCurrentTimeMillis - requestStatistic.start);
                this.f2900a.getStatisticData().filledBy(requestStatistic);
            }
            this.f2901b.onFinished(this.f2900a);
            if (requestStatistic != null) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                requestStatistic.rspCbEnd = jCurrentTimeMillis2;
                requestStatistic.callbackTime = jCurrentTimeMillis2 - jCurrentTimeMillis;
                C5016a.m2345a().commitRequest(requestStatistic.traceId, requestStatistic);
            }
            if (this.f2902c.f2888c != null) {
                this.f2902c.f2888c.writeEnd();
            }
            if (requestStatistic != null) {
                ALog.m2529e("anet.Repeater", "[traceId:" + requestStatistic.traceId + "]end, " + requestStatistic.toString(), this.f2902c.f2887b, new Object[0]);
                CopyOnWriteArrayList<String> bucketInfo = GlobalAppRuntimeInfo.getBucketInfo();
                if (bucketInfo != null) {
                    int size = bucketInfo.size();
                    for (int i10 = 0; i10 < size - 1; i10 += 2) {
                        requestStatistic.putExtra(bucketInfo.get(i10), bucketInfo.get(i10 + 1));
                    }
                }
                if (GlobalAppRuntimeInfo.isAppBackground()) {
                    requestStatistic.putExtra("restrictBg", Integer.valueOf(NetworkStatusHelper.getRestrictBackgroundStatus()));
                }
                C5017b sceneInfo = C5016a.m2345a().getSceneInfo();
                if (sceneInfo != null) {
                    ALog.m2530i("anet.Repeater", sceneInfo.toString(), this.f2902c.f2887b, new Object[0]);
                    long j10 = requestStatistic.start;
                    long j11 = sceneInfo.f2439c;
                    requestStatistic.sinceInitTime = j10 - j11;
                    int i11 = sceneInfo.f2437a;
                    requestStatistic.startType = i11;
                    if (i11 != 1) {
                        requestStatistic.sinceLastLaunchTime = j11 - sceneInfo.f2440d;
                    }
                    requestStatistic.deviceLevel = sceneInfo.f2441e;
                    requestStatistic.isFromExternal = sceneInfo.f2438b ? 1 : 0;
                    requestStatistic.speedBucket = sceneInfo.f2442f;
                    requestStatistic.abTestBucket = sceneInfo.f2443g;
                }
                requestStatistic.serializeTransferTime = requestStatistic.reqServiceTransmissionEnd - requestStatistic.netReqStart;
                requestStatistic.userInfo = this.f2902c.f2890e.m2616a(RequestConstant.REQUEST_USER_INFO);
                AppMonitor.getInstance().commitStat(requestStatistic);
                if (NetworkConfigCenter.isRequestInMonitorList(requestStatistic)) {
                    AppMonitor.getInstance().commitStat(new RequestMonitor(requestStatistic));
                }
                try {
                    String str = requestStatistic.f2587ip;
                    JSONObject jSONObject = requestStatistic.extra;
                    if (jSONObject != null) {
                        strOptString = jSONObject.optString("firstIp");
                    }
                    if (C5076c.m2522b(str) || C5076c.m2522b(strOptString)) {
                        AppMonitor.getInstance().commitStat(new RequestMonitor(requestStatistic));
                    }
                } catch (Exception unused) {
                }
                NetworkStat.getNetworkStat().put(this.f2902c.f2890e.m2624g(), this.f2900a.getStatisticData());
                C5003n.m2312a(requestStatistic);
            }
        } catch (Throwable unused2) {
        }
    }
}
