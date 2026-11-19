package anet.channel.p020a;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.fulltrace.C5017b;
import anet.channel.fulltrace.IFullTraceAnalysis;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import com.taobao.analysis.abtest.ABTestCenter;
import com.taobao.analysis.fulltrace.FullTraceAnalysis;
import com.taobao.analysis.fulltrace.RequestInfo;
import com.taobao.analysis.scene.SceneIdentifier;

/* renamed from: anet.channel.a.a */
/* loaded from: classes3.dex */
public class C4974a implements IFullTraceAnalysis {

    /* renamed from: a */
    private boolean f2330a;

    public C4974a() throws ClassNotFoundException {
        try {
            Class.forName("com.taobao.analysis.fulltrace.FullTraceAnalysis");
            SceneIdentifier.setContext(GlobalAppRuntimeInfo.getContext());
            this.f2330a = true;
        } catch (Exception unused) {
            this.f2330a = false;
            ALog.m2529e("awcn.DefaultFullTraceAnalysis", "not supoort FullTraceAnalysis", null, new Object[0]);
        }
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysis
    public void commitRequest(String str, RequestStatistic requestStatistic) {
        if (!this.f2330a || requestStatistic == null || TextUtils.isEmpty(str)) {
            return;
        }
        RequestInfo requestInfo = new RequestInfo();
        requestInfo.host = requestStatistic.host;
        requestInfo.bizId = requestStatistic.bizId;
        requestInfo.url = requestStatistic.url;
        requestInfo.retryTimes = requestStatistic.retryTimes;
        requestInfo.netType = requestStatistic.netType;
        requestInfo.protocolType = requestStatistic.protocolType;
        requestInfo.ret = requestStatistic.ret;
        requestInfo.isCbMain = false;
        requestInfo.isReqMain = requestStatistic.isReqMain;
        requestInfo.isReqSync = requestStatistic.isReqSync;
        requestInfo.netErrorCode = String.valueOf(requestStatistic.statusCode);
        requestInfo.pTraceId = requestStatistic.pTraceId;
        requestInfo.netReqStart = requestStatistic.netReqStart;
        requestInfo.netReqServiceBindEnd = requestStatistic.reqServiceTransmissionEnd;
        requestInfo.netReqProcessStart = requestStatistic.reqStart;
        requestInfo.netReqSendStart = requestStatistic.sendStart;
        requestInfo.netRspRecvEnd = requestStatistic.rspEnd;
        requestInfo.netRspCbDispatch = requestStatistic.rspCbDispatch;
        requestInfo.netRspCbStart = requestStatistic.rspCbStart;
        requestInfo.netRspCbEnd = requestStatistic.rspCbEnd;
        requestInfo.reqDeflateSize = requestStatistic.reqHeadDeflateSize + requestStatistic.reqBodyDeflateSize;
        requestInfo.reqInflateSize = requestStatistic.reqHeadInflateSize + requestStatistic.reqBodyInflateSize;
        requestInfo.rspDeflateSize = requestStatistic.rspHeadDeflateSize + requestStatistic.rspBodyDeflateSize;
        requestInfo.rspInflateSize = requestStatistic.rspHeadInflateSize + requestStatistic.rspBodyInflateSize;
        requestInfo.serverRT = requestStatistic.serverRT;
        requestInfo.sendDataTime = requestStatistic.sendDataTime;
        requestInfo.firstDataTime = requestStatistic.firstDataTime;
        requestInfo.recvDataTime = requestStatistic.recDataTime;
        FullTraceAnalysis.getInstance().commitRequest(str, "network", requestInfo);
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysis
    public String createRequest() {
        if (this.f2330a) {
            return FullTraceAnalysis.getInstance().createRequest("network");
        }
        return null;
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysis
    public C5017b getSceneInfo() {
        if (!this.f2330a) {
            return null;
        }
        C5017b c5017b = new C5017b();
        c5017b.f2438b = SceneIdentifier.isUrlLaunch();
        c5017b.f2439c = SceneIdentifier.getAppLaunchTime();
        c5017b.f2440d = SceneIdentifier.getLastLaunchTime();
        c5017b.f2441e = SceneIdentifier.getDeviceLevel();
        c5017b.f2437a = SceneIdentifier.getStartType();
        c5017b.f2442f = SceneIdentifier.getBucketInfo();
        c5017b.f2443g = ABTestCenter.getUTABTestBucketId("networksdk");
        return c5017b;
    }
}
