package anet.channel.detect;

import android.content.Context;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.RequestCb;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.C0889a;
import anet.channel.entity.ConnType;
import anet.channel.request.Request;
import anet.channel.session.C0919b;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.HorseRaceStat;
import anet.channel.strategy.C0947l;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.utils.C0953c;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.C0969j;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import com.taobao.accs.common.Constants;
import java.io.IOException;
import java.net.Socket;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.android.agoo.common.AgooConstants;
import org.android.netutil.PingResponse;
import org.android.netutil.PingTask;
import org.json.JSONException;

/* renamed from: anet.channel.detect.d */
/* loaded from: classes.dex */
class C0870d {

    /* renamed from: a */
    TreeMap<String, C0947l.c> f5098a = new TreeMap<>();

    /* renamed from: b */
    private AtomicInteger f5099b = new AtomicInteger(1);

    C0870d() {
    }

    /* renamed from: c */
    private void m4413c(String str, C0947l.e eVar) throws IOException {
        String str2 = "HR" + this.f5099b.getAndIncrement();
        ALog.m4639i("anet.HorseRaceDetector", "startTcpTask", str2, "ip", eVar.f5440a, "port", Integer.valueOf(eVar.f5441b.f5410a));
        HorseRaceStat horseRaceStat = new HorseRaceStat(str, eVar);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Socket socket = new Socket(eVar.f5440a, eVar.f5441b.f5410a);
            int i4 = eVar.f5441b.f5412c;
            if (i4 == 0) {
                i4 = 10000;
            }
            socket.setSoTimeout(i4);
            ALog.m4639i("anet.HorseRaceDetector", "socket connect success", str2, new Object[0]);
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
    void m4414a() {
        ALog.m4638e("anet.HorseRaceDetector", "network detect thread start", null, new Object[0]);
        while (true) {
            synchronized (this.f5098a) {
                if (!AwcnConfig.isHorseRaceEnable()) {
                    this.f5098a.clear();
                    return;
                }
                Map.Entry<String, C0947l.c> entryPollFirstEntry = this.f5098a.pollFirstEntry();
                if (entryPollFirstEntry == null) {
                    return;
                }
                try {
                    m4409a(entryPollFirstEntry.getValue());
                } catch (Exception e4) {
                    ALog.m4637e("anet.HorseRaceDetector", "start hr task failed", null, e4, new Object[0]);
                }
            }
        }
    }

    /* renamed from: b */
    public void m4415b() {
        StrategyCenter.getInstance().registerListener(new C0871e(this));
        AppLifecycle.registerLifecycleListener(new C0872f(this));
    }

    /* renamed from: b */
    private void m4412b(String str, C0947l.e eVar) {
        ConnProtocol connProtocolValueOf = ConnProtocol.valueOf(eVar.f5441b);
        ConnType connTypeValueOf = ConnType.valueOf(connProtocolValueOf);
        if (connTypeValueOf == null) {
            return;
        }
        ALog.m4639i("anet.HorseRaceDetector", "startLongLinkTask", null, Constants.KEY_HOST, str, "ip", eVar.f5440a, "port", Integer.valueOf(eVar.f5441b.f5410a), "protocol", connProtocolValueOf);
        String str2 = "HR" + this.f5099b.getAndIncrement();
        Context context = GlobalAppRuntimeInfo.getContext();
        StringBuilder sb = new StringBuilder();
        sb.append(connTypeValueOf.isSSL() ? "https://" : "http://");
        sb.append(str);
        TnetSpdySession tnetSpdySession = new TnetSpdySession(context, new C0889a(sb.toString(), str2, m4408a(connProtocolValueOf, eVar)));
        HorseRaceStat horseRaceStat = new HorseRaceStat(str, eVar);
        long jCurrentTimeMillis = System.currentTimeMillis();
        tnetSpdySession.registerEventcb(257, new C0874h(this, horseRaceStat, jCurrentTimeMillis, str2, eVar, tnetSpdySession));
        tnetSpdySession.connect();
        synchronized (horseRaceStat) {
            try {
                int i4 = eVar.f5441b.f5412c;
                if (i4 == 0) {
                    i4 = 10000;
                }
                horseRaceStat.wait(i4);
                if (horseRaceStat.connTime == 0) {
                    horseRaceStat.connTime = System.currentTimeMillis() - jCurrentTimeMillis;
                }
                m4410a(eVar.f5440a, horseRaceStat);
                AppMonitor.getInstance().commitStat(horseRaceStat);
            } catch (InterruptedException unused) {
            }
        }
        tnetSpdySession.close(false);
    }

    /* renamed from: a */
    private void m4409a(C0947l.c cVar) throws JSONException, IOException {
        C0947l.e[] eVarArr = cVar.f5431b;
        if (eVarArr == null || eVarArr.length == 0) {
            return;
        }
        String str = cVar.f5430a;
        int i4 = 0;
        while (true) {
            C0947l.e[] eVarArr2 = cVar.f5431b;
            if (i4 >= eVarArr2.length) {
                return;
            }
            C0947l.e eVar = eVarArr2[i4];
            String str2 = eVar.f5441b.f5411b;
            if (!str2.equalsIgnoreCase(HttpConstant.HTTP) && !str2.equalsIgnoreCase(HttpConstant.HTTPS)) {
                if (!str2.equalsIgnoreCase(ConnType.HTTP2) && !str2.equalsIgnoreCase(ConnType.SPDY) && !str2.equalsIgnoreCase(ConnType.QUIC)) {
                    if (str2.equalsIgnoreCase("tcp")) {
                        m4413c(str, eVar);
                    }
                } else {
                    m4412b(str, eVar);
                }
            } else {
                m4411a(str, eVar);
            }
            i4++;
        }
    }

    /* renamed from: a */
    private void m4411a(String str, C0947l.e eVar) throws JSONException {
        HttpUrl httpUrl = HttpUrl.parse(eVar.f5441b.f5411b + HttpConstant.SCHEME_SPLIT + str + eVar.f5442c);
        if (httpUrl == null) {
            return;
        }
        ALog.m4639i("anet.HorseRaceDetector", "startShortLinkTask", null, AgooConstants.OPEN_URL, httpUrl);
        Request requestBuild = new Request.Builder().setUrl(httpUrl).addHeader("Connection", "close").setConnectTimeout(eVar.f5441b.f5412c).setReadTimeout(eVar.f5441b.f5413d).setRedirectEnable(false).setSslSocketFactory(new C0969j(str)).setSeq("HR" + this.f5099b.getAndIncrement()).build();
        requestBuild.setDnsOptimize(eVar.f5440a, eVar.f5441b.f5410a);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0919b.a aVarM4540a = C0919b.m4540a(requestBuild, (RequestCb) null);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        HorseRaceStat horseRaceStat = new HorseRaceStat(str, eVar);
        horseRaceStat.connTime = jCurrentTimeMillis2;
        int i4 = aVarM4540a.f5288a;
        if (i4 <= 0) {
            horseRaceStat.connErrorCode = i4;
        } else {
            horseRaceStat.connRet = 1;
            horseRaceStat.reqRet = aVarM4540a.f5288a == 200 ? 1 : 0;
            horseRaceStat.reqErrorCode = aVarM4540a.f5288a;
            horseRaceStat.reqTime = horseRaceStat.connTime;
        }
        m4410a(eVar.f5440a, horseRaceStat);
        AppMonitor.getInstance().commitStat(horseRaceStat);
    }

    /* renamed from: a */
    private static IConnStrategy m4408a(ConnProtocol connProtocol, C0947l.e eVar) {
        return new C0876j(eVar, connProtocol);
    }

    /* renamed from: a */
    private void m4410a(String str, HorseRaceStat horseRaceStat) {
        if (AwcnConfig.isPing6Enable() && C0953c.m4631b(str)) {
            try {
                PingResponse pingResponse = (PingResponse) new PingTask(str, 1000, 3, 0, 0).launch().get();
                if (pingResponse == null) {
                    return;
                }
                horseRaceStat.pingSuccessCount = pingResponse.getSuccessCnt();
                horseRaceStat.pingTimeoutCount = 3 - horseRaceStat.pingSuccessCount;
                horseRaceStat.localIP = pingResponse.getLocalIPStr();
            } catch (Throwable th) {
                ALog.m4637e("anet.HorseRaceDetector", "ping6 task fail.", null, th, new Object[0]);
            }
        }
    }
}
