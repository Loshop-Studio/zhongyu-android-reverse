package anet.channel.detect;

import android.content.Context;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.RequestCb;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.C5012a;
import anet.channel.entity.ConnType;
import anet.channel.request.Request;
import anet.channel.session.C5042b;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.HorseRaceStat;
import anet.channel.strategy.C5070l;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.utils.C5076c;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.C5092j;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import com.taobao.accs.common.Constants;
import java.io.IOException;
import java.net.Socket;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.android.netutil.PingResponse;
import org.android.netutil.PingTask;
import org.json.JSONException;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* renamed from: anet.channel.detect.d */
/* loaded from: classes3.dex */
class C4993d {

    /* renamed from: a */
    TreeMap<String, C5070l.c> f2376a = new TreeMap<>();

    /* renamed from: b */
    private AtomicInteger f2377b = new AtomicInteger(1);

    /* renamed from: c */
    private void m2304c(String str, C5070l.e eVar) throws IOException {
        String str2 = "HR" + this.f2377b.getAndIncrement();
        ALog.m2530i("anet.HorseRaceDetector", "startTcpTask", str2, IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, eVar.f2718a, IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, Integer.valueOf(eVar.f2719b.f2688a));
        HorseRaceStat horseRaceStat = new HorseRaceStat(str, eVar);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Socket socket = new Socket(eVar.f2718a, eVar.f2719b.f2688a);
            int i10 = eVar.f2719b.f2690c;
            if (i10 == 0) {
                i10 = 10000;
            }
            socket.setSoTimeout(i10);
            ALog.m2530i("anet.HorseRaceDetector", "socket connect success", str2, new Object[0]);
            horseRaceStat.connRet = 1;
            horseRaceStat.connTime = System.currentTimeMillis() - jCurrentTimeMillis;
            socket.close();
        } catch (IOException unused) {
            horseRaceStat.connTime = System.currentTimeMillis() - jCurrentTimeMillis;
            horseRaceStat.connErrorCode = ErrorConstant.ERROR_IO_EXCEPTION;
        }
        AppMonitor.getInstance().commitStat(horseRaceStat);
    }

    /* renamed from: a */
    public void m2305a() {
        ALog.m2529e("anet.HorseRaceDetector", "network detect thread start", null, new Object[0]);
        while (true) {
            synchronized (this.f2376a) {
                try {
                    if (!AwcnConfig.isHorseRaceEnable()) {
                        this.f2376a.clear();
                        return;
                    }
                    Map.Entry<String, C5070l.c> entryPollFirstEntry = this.f2376a.pollFirstEntry();
                    if (entryPollFirstEntry == null) {
                        return;
                    }
                    try {
                        m2300a(entryPollFirstEntry.getValue());
                    } catch (Exception e10) {
                        ALog.m2528e("anet.HorseRaceDetector", "start hr task failed", null, e10, new Object[0]);
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: b */
    public void m2306b() {
        StrategyCenter.getInstance().registerListener(new C4994e(this));
        AppLifecycle.registerLifecycleListener(new C4995f(this));
    }

    /* renamed from: b */
    private void m2303b(String str, C5070l.e eVar) {
        ConnProtocol connProtocolValueOf = ConnProtocol.valueOf(eVar.f2719b);
        ConnType connTypeValueOf = ConnType.valueOf(connProtocolValueOf);
        if (connTypeValueOf == null) {
            return;
        }
        ALog.m2530i("anet.HorseRaceDetector", "startLongLinkTask", null, Constants.KEY_HOST, str, IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, eVar.f2718a, IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, Integer.valueOf(eVar.f2719b.f2688a), "protocol", connProtocolValueOf);
        String str2 = "HR" + this.f2377b.getAndIncrement();
        Context context = GlobalAppRuntimeInfo.getContext();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(connTypeValueOf.isSSL() ? "https://" : "http://");
        sb2.append(str);
        TnetSpdySession tnetSpdySession = new TnetSpdySession(context, new C5012a(sb2.toString(), str2, m2299a(connProtocolValueOf, eVar)));
        HorseRaceStat horseRaceStat = new HorseRaceStat(str, eVar);
        long jCurrentTimeMillis = System.currentTimeMillis();
        tnetSpdySession.registerEventcb(257, new C4997h(this, horseRaceStat, jCurrentTimeMillis, str2, eVar, tnetSpdySession));
        tnetSpdySession.connect();
        synchronized (horseRaceStat) {
            try {
                try {
                    int i10 = eVar.f2719b.f2690c;
                    if (i10 == 0) {
                        i10 = 10000;
                    }
                    horseRaceStat.wait(i10);
                    if (horseRaceStat.connTime == 0) {
                        horseRaceStat.connTime = System.currentTimeMillis() - jCurrentTimeMillis;
                    }
                    m2301a(eVar.f2718a, horseRaceStat);
                    AppMonitor.getInstance().commitStat(horseRaceStat);
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        tnetSpdySession.close(false);
    }

    /* renamed from: a */
    private void m2300a(C5070l.c cVar) throws JSONException, IOException {
        C5070l.e[] eVarArr = cVar.f2709b;
        if (eVarArr == null || eVarArr.length == 0) {
            return;
        }
        String str = cVar.f2708a;
        int i10 = 0;
        while (true) {
            C5070l.e[] eVarArr2 = cVar.f2709b;
            if (i10 >= eVarArr2.length) {
                return;
            }
            C5070l.e eVar = eVarArr2[i10];
            String str2 = eVar.f2719b.f2689b;
            if (!str2.equalsIgnoreCase(HttpConstant.HTTP) && !str2.equalsIgnoreCase("https")) {
                if (!str2.equalsIgnoreCase(ConnType.HTTP2) && !str2.equalsIgnoreCase(ConnType.SPDY) && !str2.equalsIgnoreCase(ConnType.QUIC)) {
                    if (str2.equalsIgnoreCase("tcp")) {
                        m2304c(str, eVar);
                    }
                } else {
                    m2303b(str, eVar);
                }
            } else {
                m2302a(str, eVar);
            }
            i10++;
        }
    }

    /* renamed from: a */
    private void m2302a(String str, C5070l.e eVar) throws JSONException {
        HttpUrl httpUrl = HttpUrl.parse(eVar.f2719b.f2689b + "://" + str + eVar.f2720c);
        if (httpUrl == null) {
            return;
        }
        ALog.m2530i("anet.HorseRaceDetector", "startShortLinkTask", null, "url", httpUrl);
        Request requestBuild = new Request.Builder().setUrl(httpUrl).addHeader("Connection", "close").setConnectTimeout(eVar.f2719b.f2690c).setReadTimeout(eVar.f2719b.f2691d).setRedirectEnable(false).setSslSocketFactory(new C5092j(str)).setSeq("HR" + this.f2377b.getAndIncrement()).build();
        requestBuild.setDnsOptimize(eVar.f2718a, eVar.f2719b.f2688a);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C5042b.a aVarM2431a = C5042b.m2431a(requestBuild, (RequestCb) null);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        HorseRaceStat horseRaceStat = new HorseRaceStat(str, eVar);
        horseRaceStat.connTime = jCurrentTimeMillis2;
        int i10 = aVarM2431a.f2566a;
        if (i10 <= 0) {
            horseRaceStat.connErrorCode = i10;
        } else {
            horseRaceStat.connRet = 1;
            horseRaceStat.reqRet = aVarM2431a.f2566a == 200 ? 1 : 0;
            horseRaceStat.reqErrorCode = aVarM2431a.f2566a;
            horseRaceStat.reqTime = horseRaceStat.connTime;
        }
        m2301a(eVar.f2718a, horseRaceStat);
        AppMonitor.getInstance().commitStat(horseRaceStat);
    }

    /* renamed from: a */
    private static IConnStrategy m2299a(ConnProtocol connProtocol, C5070l.e eVar) {
        return new C4999j(eVar, connProtocol);
    }

    /* renamed from: a */
    private void m2301a(String str, HorseRaceStat horseRaceStat) {
        if (AwcnConfig.isPing6Enable() && C5076c.m2522b(str)) {
            try {
                PingResponse pingResponse = (PingResponse) new PingTask(str, 1000, 3, 0, 0).launch().get();
                if (pingResponse == null) {
                    return;
                }
                horseRaceStat.pingSuccessCount = pingResponse.getSuccessCnt();
                horseRaceStat.pingTimeoutCount = 3 - horseRaceStat.pingSuccessCount;
                horseRaceStat.localIP = pingResponse.getLocalIPStr();
            } catch (Throwable th) {
                ALog.m2528e("anet.HorseRaceDetector", "ping6 task fail.", null, th, new Object[0]);
            }
        }
    }
}
