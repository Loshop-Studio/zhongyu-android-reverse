package anet.channel.detect;

import android.text.TextUtils;
import android.util.Pair;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.taobao.accs.common.Constants;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.android.netutil.NetUtils;
import org.android.netutil.PingEntry;
import org.android.netutil.PingResponse;
import org.android.netutil.PingTask;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class ExceptionDetector {

    /* renamed from: a */
    long f5080a;

    /* renamed from: b */
    String f5081b;

    /* renamed from: c */
    String f5082c;

    /* renamed from: d */
    String f5083d;

    /* renamed from: e */
    LimitedQueue<Pair<String, Integer>> f5084e = new LimitedQueue<>(10);

    /* JADX INFO: Access modifiers changed from: private */
    class LimitedQueue<E> extends LinkedList<E> {

        /* renamed from: b */
        private int f5086b;

        public LimitedQueue(int i4) {
            this.f5086b = i4;
        }

        @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
        public boolean add(E e4) {
            boolean zAdd = super.add(e4);
            while (zAdd && size() > this.f5086b) {
                super.remove();
            }
            return zAdd;
        }
    }

    /* renamed from: anet.channel.detect.ExceptionDetector$a */
    private class C0866a {

        /* renamed from: a */
        String f5087a;

        /* renamed from: b */
        String f5088b;

        /* renamed from: c */
        String f5089c;

        /* renamed from: d */
        Future<PingResponse> f5090d;

        /* renamed from: e */
        Future<PingResponse> f5091e;

        /* renamed from: f */
        Future<PingResponse> f5092f;

        private C0866a() {
        }

        /* synthetic */ C0866a(ExceptionDetector exceptionDetector, C0867a c0867a) {
            this();
        }
    }

    ExceptionDetector() {
    }

    /* renamed from: a */
    public void m4404a() {
        NetworkStatusHelper.addStatusChangeListener(new C0867a(this));
    }

    /* renamed from: b */
    void m4406b() throws JSONException, SpdyErrorException, UnsatisfiedLinkError {
        ALog.m4638e("anet.ExceptionDetector", "network detect start.", null, new Object[0]);
        SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        jSONObject2.put("status", status.getType());
        jSONObject2.put("subType", NetworkStatusHelper.getNetworkSubType());
        if (status != NetworkStatusHelper.NetworkStatus.NO) {
            if (status.isMobile()) {
                jSONObject2.put("apn", NetworkStatusHelper.getApn());
                jSONObject2.put("carrier", NetworkStatusHelper.getCarrier());
            } else {
                jSONObject2.put(DispatchConstants.BSSID, NetworkStatusHelper.getWifiBSSID());
                jSONObject2.put("ssid", NetworkStatusHelper.getWifiSSID());
            }
            jSONObject2.put("proxy", NetworkStatusHelper.getProxyType());
        }
        jSONObject.put("NetworkInfo", jSONObject2);
        String defaultGateway = status.isWifi() ? NetUtils.getDefaultGateway("114.114.114.114") : NetUtils.getPreferNextHop("114.114.114.114", 2);
        Future<PingResponse> futureLaunch = !TextUtils.isEmpty(defaultGateway) ? new PingTask(defaultGateway, 1000, 3, 0, 0).launch() : null;
        C0866a c0866aM4400a = m4400a("guide-acs.m.taobao.com", this.f5081b);
        C0866a c0866aM4400a2 = m4400a("gw.alicdn.com", this.f5083d);
        C0866a c0866aM4400a3 = m4400a("msgacs.m.taobao.com", this.f5082c);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("nextHop", defaultGateway);
        jSONObject3.put("ping", m4403a(futureLaunch));
        jSONObject.put("LocalDetect", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(m4402a(c0866aM4400a));
        jSONArray.put(m4402a(c0866aM4400a2));
        jSONArray.put(m4402a(c0866aM4400a3));
        jSONObject.put("InternetDetect", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        Iterator<Pair<String, Integer>> it = this.f5084e.iterator();
        while (it.hasNext()) {
            Pair<String, Integer> next = it.next();
            jSONObject4.put((String) next.first, next.second);
        }
        jSONObject.put("BizDetect", jSONObject4);
        this.f5084e.clear();
        ALog.m4638e("anet.ExceptionDetector", "network detect result: " + jSONObject.toString(), null, new Object[0]);
    }

    /* renamed from: c */
    boolean m4407c() {
        if (this.f5084e.size() != 10) {
            return false;
        }
        if (NetworkStatusHelper.getStatus() == NetworkStatusHelper.NetworkStatus.NO) {
            ALog.m4638e("anet.ExceptionDetector", "no network", null, new Object[0]);
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < this.f5080a) {
            return false;
        }
        Iterator<Pair<String, Integer>> it = this.f5084e.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next().second).intValue();
            if (iIntValue == -202 || iIntValue == -400 || iIntValue == -401 || iIntValue == -405 || iIntValue == -406) {
                i4++;
            }
        }
        boolean z3 = i4 * 2 > 10;
        if (z3) {
            this.f5080a = jCurrentTimeMillis + 1800000;
        }
        return z3;
    }

    /* renamed from: a */
    public void m4405a(RequestStatistic requestStatistic) {
        if (AwcnConfig.isNetworkDetectEnable()) {
            ThreadPoolExecutorFactory.submitDetectTask(new RunnableC0869c(this, requestStatistic));
        } else {
            ALog.m4639i("anet.ExceptionDetector", "network detect closed.", null, new Object[0]);
        }
    }

    /* renamed from: a */
    private ArrayList<String> m4401a(String str, int i4) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        int i5 = 0;
        while (i5 < i4) {
            i5++;
            PingResponse pingResponse = null;
            try {
                pingResponse = (PingResponse) new PingTask(str, 0, 1, 0, i5).launch().get();
            } catch (Exception unused) {
            }
            StringBuilder sb = new StringBuilder();
            if (pingResponse != null) {
                String lastHopIPStr = pingResponse.getLastHopIPStr();
                double d4 = pingResponse.getResults()[0].rtt;
                int errcode = pingResponse.getErrcode();
                if (TextUtils.isEmpty(lastHopIPStr)) {
                    lastHopIPStr = "*";
                }
                sb.append("hop=");
                sb.append(lastHopIPStr);
                sb.append(",rtt=");
                sb.append(d4);
                sb.append(",errCode=");
                sb.append(errcode);
            }
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    /* renamed from: a */
    private C0866a m4400a(String str, String str2) {
        C0866a c0866a = new C0866a(this, null);
        c0866a.f5087a = str;
        try {
            c0866a.f5088b = InetAddress.getByName(str).getHostAddress();
        } catch (UnknownHostException unused) {
        }
        if (!TextUtils.isEmpty(str2)) {
            c0866a.f5089c = str2;
        } else {
            List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str);
            if (connStrategyListByHost != null && !connStrategyListByHost.isEmpty()) {
                c0866a.f5089c = connStrategyListByHost.get(0).getIp();
            }
        }
        String str3 = !TextUtils.isEmpty(c0866a.f5089c) ? c0866a.f5089c : c0866a.f5088b;
        if (!TextUtils.isEmpty(str3)) {
            String str4 = str3;
            c0866a.f5090d = new PingTask(str4, 1000, 3, 0, 0).launch();
            c0866a.f5091e = new PingTask(str4, 1000, 3, 1172, 0).launch();
            c0866a.f5092f = new PingTask(str4, 1000, 3, 1432, 0).launch();
        }
        return c0866a;
    }

    /* renamed from: a */
    private JSONObject m4402a(C0866a c0866a) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (c0866a != null && c0866a.f5090d != null) {
            jSONObject.put(Constants.KEY_HOST, c0866a.f5087a);
            jSONObject.put("currentIp", c0866a.f5089c);
            jSONObject.put("localIp", c0866a.f5088b);
            jSONObject.put("ping", m4403a(c0866a.f5090d));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("1200", m4403a(c0866a.f5091e));
            jSONObject2.put("1460", m4403a(c0866a.f5092f));
            jSONObject.put("MTU", jSONObject2);
            if ("guide-acs.m.taobao.com".equals(c0866a.f5087a)) {
                ArrayList<String> arrayListM4401a = m4401a(!TextUtils.isEmpty(c0866a.f5089c) ? c0866a.f5089c : c0866a.f5088b, 5);
                JSONObject jSONObject3 = new JSONObject();
                int i4 = 0;
                while (i4 < arrayListM4401a.size()) {
                    int i5 = i4 + 1;
                    jSONObject3.put(String.valueOf(i5), arrayListM4401a.get(i4));
                    i4 = i5;
                }
                jSONObject.put("traceRoute", jSONObject3);
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private JSONObject m4403a(Future<PingResponse> future) throws ExecutionException, JSONException, InterruptedException {
        JSONObject jSONObject = new JSONObject();
        if (future == null) {
            return jSONObject;
        }
        PingResponse pingResponse = null;
        try {
            pingResponse = future.get();
        } catch (Exception unused) {
        }
        if (pingResponse == null) {
            return jSONObject;
        }
        jSONObject.put("errCode", pingResponse.getErrcode());
        JSONArray jSONArray = new JSONArray();
        for (PingEntry pingEntry : pingResponse.getResults()) {
            jSONArray.put("seq=" + pingEntry.seq + ",hop=" + pingEntry.hop + ",rtt=" + pingEntry.rtt);
        }
        jSONObject.put("response", jSONArray);
        return jSONObject;
    }
}
