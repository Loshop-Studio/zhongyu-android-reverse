package anetwork.channel.entity;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.detect.C0880n;
import anet.channel.fulltrace.C0893a;
import anet.channel.fulltrace.C0894b;
import anet.channel.statist.RequestMonitor;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.utils.C0953c;
import anet.channel.util.ALog;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.aidl.ParcelableNetworkListener;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.stat.NetworkStat;
import anetwork.channel.util.RequestConstant;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: anetwork.channel.entity.f */
/* loaded from: classes.dex */
class RunnableC0997f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ DefaultFinishEvent f5622a;

    /* renamed from: b */
    final /* synthetic */ ParcelableNetworkListener f5623b;

    /* renamed from: c */
    final /* synthetic */ C0994c f5624c;

    RunnableC0997f(C0994c c0994c, DefaultFinishEvent defaultFinishEvent, ParcelableNetworkListener parcelableNetworkListener) {
        this.f5624c = c0994c;
        this.f5622a = defaultFinishEvent;
        this.f5623b = parcelableNetworkListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        DefaultFinishEvent defaultFinishEvent = this.f5622a;
        String strOptString = null;
        if (defaultFinishEvent != null) {
            defaultFinishEvent.setContext(null);
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            RequestStatistic requestStatistic = this.f5622a.f5498rs;
            if (requestStatistic != null) {
                requestStatistic.rspCbStart = jCurrentTimeMillis;
                requestStatistic.lastProcessTime = jCurrentTimeMillis - requestStatistic.rspEnd;
                requestStatistic.oneWayTime = requestStatistic.retryCostTime + (jCurrentTimeMillis - requestStatistic.start);
                this.f5622a.getStatisticData().filledBy(requestStatistic);
            }
            this.f5623b.onFinished(this.f5622a);
            if (requestStatistic != null) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                requestStatistic.rspCbEnd = jCurrentTimeMillis2;
                requestStatistic.callbackTime = jCurrentTimeMillis2 - jCurrentTimeMillis;
                C0893a.m4454a().commitRequest(requestStatistic.traceId, requestStatistic);
            }
            if (this.f5624c.f5610c != null) {
                this.f5624c.f5610c.writeEnd();
            }
            if (requestStatistic != null) {
                ALog.m4638e("anet.Repeater", "[traceId:" + requestStatistic.traceId + "]end, " + requestStatistic.toString(), this.f5624c.f5609b, new Object[0]);
                CopyOnWriteArrayList<String> bucketInfo = GlobalAppRuntimeInfo.getBucketInfo();
                if (bucketInfo != null) {
                    int size = bucketInfo.size();
                    for (int i4 = 0; i4 < size - 1; i4 += 2) {
                        requestStatistic.putExtra(bucketInfo.get(i4), bucketInfo.get(i4 + 1));
                    }
                }
                if (GlobalAppRuntimeInfo.isAppBackground()) {
                    requestStatistic.putExtra("restrictBg", Integer.valueOf(NetworkStatusHelper.getRestrictBackgroundStatus()));
                }
                C0894b sceneInfo = C0893a.m4454a().getSceneInfo();
                if (sceneInfo != null) {
                    ALog.m4639i("anet.Repeater", sceneInfo.toString(), this.f5624c.f5609b, new Object[0]);
                    long j4 = requestStatistic.start;
                    long j5 = sceneInfo.f5161c;
                    requestStatistic.sinceInitTime = j4 - j5;
                    int i5 = sceneInfo.f5159a;
                    requestStatistic.startType = i5;
                    if (i5 != 1) {
                        requestStatistic.sinceLastLaunchTime = j5 - sceneInfo.f5162d;
                    }
                    requestStatistic.deviceLevel = sceneInfo.f5163e;
                    requestStatistic.isFromExternal = sceneInfo.f5160b ? 1 : 0;
                    requestStatistic.speedBucket = sceneInfo.f5164f;
                    requestStatistic.abTestBucket = sceneInfo.f5165g;
                }
                requestStatistic.serializeTransferTime = requestStatistic.reqServiceTransmissionEnd - requestStatistic.netReqStart;
                requestStatistic.userInfo = this.f5624c.f5612e.m4725a(RequestConstant.REQUEST_USER_INFO);
                AppMonitor.getInstance().commitStat(requestStatistic);
                if (NetworkConfigCenter.isRequestInMonitorList(requestStatistic)) {
                    AppMonitor.getInstance().commitStat(new RequestMonitor(requestStatistic));
                }
                try {
                    String str = requestStatistic.f5309ip;
                    JSONObject jSONObject = requestStatistic.extra;
                    if (jSONObject != null) {
                        strOptString = jSONObject.optString("firstIp");
                    }
                    if (C0953c.m4631b(str) || C0953c.m4631b(strOptString)) {
                        AppMonitor.getInstance().commitStat(new RequestMonitor(requestStatistic));
                    }
                } catch (Exception unused) {
                }
                NetworkStat.getNetworkStat().put(this.f5624c.f5612e.m4733g(), this.f5622a.getStatisticData());
                C0880n.m4421a(requestStatistic);
            }
        } catch (Throwable unused2) {
        }
    }
}
