package anet.channel.detect;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.MtuDetectStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.android.netutil.PingEntry;
import org.android.netutil.PingResponse;
import org.android.netutil.PingTask;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;

/* renamed from: anet.channel.detect.k */
/* loaded from: classes.dex */
class C0877k {

    /* renamed from: a */
    private static HashMap<String, Long> f5112a = new HashMap<>();

    C0877k() {
    }

    /* renamed from: a */
    public void m4419a() {
        NetworkStatusHelper.addStatusChangeListener(new C0878l(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4418a(String str) throws ExecutionException, InterruptedException, SpdyErrorException, UnsatisfiedLinkError {
        PingResponse pingResponse;
        if (!AwcnConfig.isNetworkDetectEnable()) {
            ALog.m4639i("anet.MTUDetector", "network detect closed.", null, new Object[0]);
            return;
        }
        ALog.m4639i("anet.MTUDetector", "mtuDetectTask start", null, new Object[0]);
        SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l3 = f5112a.get(str);
        if (l3 == null || jCurrentTimeMillis >= l3.longValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext());
            long j4 = defaultSharedPreferences.getLong("sp_mtu_" + str, 0L);
            if (jCurrentTimeMillis < j4) {
                f5112a.put(str, Long.valueOf(j4));
                ALog.m4639i("anet.MTUDetector", "mtuDetectTask in period of validity", null, new Object[0]);
                return;
            }
            List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost("guide-acs.m.taobao.com");
            String ip = (connStrategyListByHost == null || connStrategyListByHost.isEmpty()) ? null : connStrategyListByHost.get(0).getIp();
            if (TextUtils.isEmpty(ip)) {
                return;
            }
            String str2 = ip;
            Future futureLaunch = new PingTask(str2, 1000, 3, 0, 0).launch();
            Future<PingResponse> futureLaunch2 = new PingTask(str2, 1000, 3, 1172, 0).launch();
            Future<PingResponse> futureLaunch3 = new PingTask(str2, 1000, 3, 1272, 0).launch();
            Future<PingResponse> futureLaunch4 = new PingTask(str2, 1000, 3, 1372, 0).launch();
            Future<PingResponse> futureLaunch5 = new PingTask(str2, 1000, 3, 1432, 0).launch();
            try {
                pingResponse = (PingResponse) futureLaunch.get();
            } catch (Exception unused) {
                pingResponse = null;
            }
            if (pingResponse == null) {
                return;
            }
            if (pingResponse.getSuccessCnt() < 2) {
                ALog.m4638e("anet.MTUDetector", "MTU detect preTask error", null, "errCode", Integer.valueOf(pingResponse.getErrcode()), "successCount", Integer.valueOf(pingResponse.getSuccessCnt()));
                return;
            }
            m4416a(1200, futureLaunch2);
            m4416a(1300, futureLaunch3);
            m4416a(1400, futureLaunch4);
            m4416a(1460, futureLaunch5);
            long j5 = jCurrentTimeMillis + 432000000;
            f5112a.put(str, Long.valueOf(j5));
            defaultSharedPreferences.edit().putLong("sp_mtu_" + str, j5).apply();
        }
    }

    /* renamed from: a */
    private void m4416a(int i4, Future<PingResponse> future) throws ExecutionException, InterruptedException {
        PingResponse pingResponse;
        try {
            pingResponse = future.get();
        } catch (Exception unused) {
            pingResponse = null;
        }
        if (pingResponse == null) {
            return;
        }
        int successCnt = pingResponse.getSuccessCnt();
        int i5 = 3 - successCnt;
        StringBuilder sb = new StringBuilder();
        PingEntry[] results = pingResponse.getResults();
        int length = results.length;
        for (int i6 = 0; i6 < length; i6++) {
            sb.append(results[i6].rtt);
            if (i6 != length - 1) {
                sb.append(",");
            }
        }
        ALog.m4639i("anet.MTUDetector", "MTU detect result", null, "mtu", Integer.valueOf(i4), "successCount", Integer.valueOf(successCnt), "timeoutCount", Integer.valueOf(i5));
        MtuDetectStat mtuDetectStat = new MtuDetectStat();
        mtuDetectStat.mtu = i4;
        mtuDetectStat.pingSuccessCount = successCnt;
        mtuDetectStat.pingTimeoutCount = i5;
        mtuDetectStat.rtt = sb.toString();
        mtuDetectStat.errCode = pingResponse.getErrcode();
        AppMonitor.getInstance().commitStat(mtuDetectStat);
    }
}
