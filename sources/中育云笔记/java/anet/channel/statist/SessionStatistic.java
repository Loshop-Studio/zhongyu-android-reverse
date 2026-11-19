package anet.channel.statist;

import androidx.camera.video.AudioStats;
import anet.channel.AwcnConfig;
import anet.channel.entity.C5012a;
import anet.channel.fulltrace.C5016a;
import anet.channel.fulltrace.C5017b;
import anet.channel.p024e.C5005a;
import anet.channel.strategy.IConnStrategy;
import com.google.android.material.color.utilities.Contrast;
import com.huawei.hms.framework.common.BundleUtil;
import org.json.JSONObject;

@Monitor(module = "networkPrefer", monitorPoint = "session")
/* loaded from: classes3.dex */
public class SessionStatistic extends StatObject {
    public static int maxRetryTime;

    @Measure
    public long ackTime;

    @Measure(max = 15000.0d)
    public long authTime;

    @Measure
    public long cfRCount;

    @Dimension
    public String closeReason;

    @Dimension
    public int congControlKind;

    @Measure(max = 15000.0d, name = "connTime")
    public long connectionTime;

    @Dimension(name = "protocolType")
    public String conntype;

    @Dimension
    public String dcid;

    @Dimension
    public long errorCode;

    @Dimension
    public String host;

    @Measure
    public long inceptCount;

    /* renamed from: ip */
    @Dimension
    public String f2589ip;

    @Dimension
    public int ipRefer;

    @Dimension
    public int ipType;

    @Dimension
    public boolean isBackground;

    @Dimension
    public long isKL;

    @Dimension
    public String isTunnel;

    @Measure
    public int lastPingInterval;

    @Measure
    public double lossRate;

    @Dimension
    public String netType;

    @Measure
    public long pRate;

    @Dimension
    public int port;

    @Measure
    public long ppkgCount;

    @Measure
    public long recvSizeCount;

    @Dimension
    public int ret;

    @Measure
    public double retransmissionRate;

    @Dimension
    public long retryTimes;

    @Measure
    public int rtoCount;

    @Dimension
    public String scid;

    @Dimension
    public int sdkv;

    @Measure
    public long sendSizeCount;

    @Measure
    public long srtt;

    @Measure(max = 15000.0d)
    public long sslCalTime;

    @Measure(max = 15000.0d)
    public long sslTime;

    @Measure
    public int tlpCount;

    @Dimension
    public int xqc0RttStatus;

    @Dimension
    public String xqcConnEnv;

    @Dimension
    public int isProxy = 0;

    @Dimension
    public JSONObject extra = null;

    @Measure(max = 86400.0d)
    public long liveTime = 0;

    @Measure(constantValue = Contrast.RATIO_MIN)
    public long requestCount = 1;

    @Measure(constantValue = AudioStats.AUDIO_AMPLITUDE_NONE)
    public long stdRCount = 1;
    public boolean isCommitted = false;

    public SessionStatistic(C5012a c5012a) {
        this.ipRefer = 0;
        this.ipType = 1;
        if (c5012a == null) {
            return;
        }
        this.f2589ip = c5012a.m2337a();
        this.port = c5012a.m2338b();
        IConnStrategy iConnStrategy = c5012a.f2420a;
        if (iConnStrategy != null) {
            this.ipRefer = iConnStrategy.getIpSource();
            this.ipType = c5012a.f2420a.getIpType();
        }
        this.pRate = c5012a.m2343g();
        this.conntype = c5012a.m2339c().toString();
        this.retryTimes = c5012a.f2421b;
        maxRetryTime = c5012a.f2422c;
        C5017b sceneInfo = C5016a.m2345a().getSceneInfo();
        String str = sceneInfo != null ? sceneInfo.f2442f : null;
        boolean zM2326b = C5005a.m2326b();
        this.xqcConnEnv = AwcnConfig.isHttp3OrangeEnable() + BundleUtil.UNDERLINE_TAG + zM2326b + BundleUtil.UNDERLINE_TAG + str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r3 != (-2601)) goto L14;
     */
    @Override // anet.channel.statist.StatObject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean beforeCommit() {
        /*
            r7 = this;
            int r0 = r7.ret
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L46
            long r3 = r7.retryTimes
            int r0 = anet.channel.statist.SessionStatistic.maxRetryTime
            long r5 = (long) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L1d
            long r3 = r7.errorCode
            r5 = -2613(0xfffffffffffff5cb, double:NaN)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L1d
            r5 = -2601(0xfffffffffffff5d7, double:NaN)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L46
        L1d:
            boolean r0 = anet.channel.util.ALog.isPrintLog(r2)
            if (r0 == 0) goto L45
            long r2 = r7.retryTimes
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            int r2 = anet.channel.statist.SessionStatistic.maxRetryTime
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            long r3 = r7.errorCode
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "maxRetryTime"
            java.lang.String r5 = "errorCode"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r4, r2, r5, r3}
            java.lang.String r2 = "SessionStat no need commit"
            r3 = 0
            java.lang.String r4 = "retry:"
            anet.channel.util.ALog.m2527d(r2, r3, r4, r0)
        L45:
            return r1
        L46:
            boolean r0 = r7.isCommitted
            if (r0 == 0) goto L4b
            return r1
        L4b:
            r7.isCommitted = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.statist.SessionStatistic.beforeCommit():boolean");
    }

    public AlarmObject getAlarmObject() {
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "networkPrefer";
        alarmObject.modulePoint = "connect_succ_rate";
        boolean z10 = this.ret != 0;
        alarmObject.isSuccess = z10;
        if (z10) {
            alarmObject.arg = this.closeReason;
            return alarmObject;
        }
        alarmObject.errorCode = String.valueOf(this.errorCode);
        return alarmObject;
    }
}
