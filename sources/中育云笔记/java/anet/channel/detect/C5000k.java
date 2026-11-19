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
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;

/* renamed from: anet.channel.detect.k */
/* loaded from: classes3.dex */
class C5000k {

    /* renamed from: a */
    private static HashMap<String, Long> f2390a = new HashMap<>();

    /* renamed from: a */
    public void m2310a() {
        NetworkStatusHelper.addStatusChangeListener(new C5001l(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m2309a(String str) throws ExecutionException, InterruptedException {
        PingResponse pingResponse;
        if (!AwcnConfig.isNetworkDetectEnable()) {
            ALog.m2530i("anet.MTUDetector", "network detect closed.", null, new Object[0]);
            return;
        }
        ALog.m2530i("anet.MTUDetector", "mtuDetectTask start", null, new Object[0]);
        SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l10 = f2390a.get(str);
        if (l10 == null || jCurrentTimeMillis >= l10.longValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext());
            long j10 = defaultSharedPreferences.getLong("sp_mtu_" + str, 0L);
            if (jCurrentTimeMillis < j10) {
                f2390a.put(str, Long.valueOf(j10));
                ALog.m2530i("anet.MTUDetector", "mtuDetectTask in period of validity", null, new Object[0]);
                return;
            }
            List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost("guide-acs.m.taobao.com");
            String ip = (connStrategyListByHost == null || connStrategyListByHost.isEmpty()) ? null : connStrategyListByHost.get(0).getIp();
            if (TextUtils.isEmpty(ip)) {
                return;
            }
            Future futureLaunch = new PingTask(ip, 1000, 3, 0, 0).launch();
            Future<PingResponse> futureLaunch2 = new PingTask(ip, 1000, 3, 1172, 0).launch();
            Future<PingResponse> futureLaunch3 = new PingTask(ip, 1000, 3, 1272, 0).launch();
            Future<PingResponse> futureLaunch4 = new PingTask(ip, 1000, 3, 1372, 0).launch();
            Future<PingResponse> futureLaunch5 = new PingTask(ip, 1000, 3, 1432, 0).launch();
            try {
                pingResponse = (PingResponse) futureLaunch.get();
            } catch (Exception unused) {
                pingResponse = null;
            }
            if (pingResponse == null) {
                return;
            }
            if (pingResponse.getSuccessCnt() < 2) {
                ALog.m2529e("anet.MTUDetector", "MTU detect preTask error", null, "errCode", Integer.valueOf(pingResponse.getErrcode()), "successCount", Integer.valueOf(pingResponse.getSuccessCnt()));
                return;
            }
            m2307a(1200, futureLaunch2);
            m2307a(1300, futureLaunch3);
            m2307a(1400, futureLaunch4);
            m2307a(1460, futureLaunch5);
            long j11 = jCurrentTimeMillis + 432000000;
            f2390a.put(str, Long.valueOf(j11));
            defaultSharedPreferences.edit().putLong("sp_mtu_" + str, j11).apply();
        }
    }

    /* renamed from: a */
    private void m2307a(int i10, Future<PingResponse> future) throws ExecutionException, InterruptedException {
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
        int i11 = 3 - successCnt;
        StringBuilder sb2 = new StringBuilder();
        PingEntry[] results = pingResponse.getResults();
        int length = results.length;
        for (int i12 = 0; i12 < length; i12++) {
            sb2.append(results[i12].rtt);
            if (i12 != length - 1) {
                sb2.append(",");
            }
        }
        ALog.m2530i("anet.MTUDetector", "MTU detect result", null, "mtu", Integer.valueOf(i10), "successCount", Integer.valueOf(successCnt), "timeoutCount", Integer.valueOf(i11));
        MtuDetectStat mtuDetectStat = new MtuDetectStat();
        mtuDetectStat.mtu = i10;
        mtuDetectStat.pingSuccessCount = successCnt;
        mtuDetectStat.pingTimeoutCount = i11;
        mtuDetectStat.rtt = sb2.toString();
        mtuDetectStat.errCode = pingResponse.getErrcode();
        AppMonitor.getInstance().commitStat(mtuDetectStat);
    }
}
