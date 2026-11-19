package anet.channel.detect;

import android.text.TextUtils;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
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
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class ExceptionDetector {

    /* renamed from: a */
    long f2358a;

    /* renamed from: b */
    String f2359b;

    /* renamed from: c */
    String f2360c;

    /* renamed from: d */
    String f2361d;

    /* renamed from: e */
    LimitedQueue<Pair<String, Integer>> f2362e = new LimitedQueue<>(10);

    public class LimitedQueue<E> extends LinkedList<E> {

        /* renamed from: b */
        private int f2364b;

        public LimitedQueue(int i10) {
            this.f2364b = i10;
        }

        @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
        public boolean add(E e10) {
            boolean zAdd = super.add(e10);
            while (zAdd && size() > this.f2364b) {
                super.remove();
            }
            return zAdd;
        }
    }

    /* renamed from: anet.channel.detect.ExceptionDetector$a */
    public class C4989a {

        /* renamed from: a */
        String f2365a;

        /* renamed from: b */
        String f2366b;

        /* renamed from: c */
        String f2367c;

        /* renamed from: d */
        Future<PingResponse> f2368d;

        /* renamed from: e */
        Future<PingResponse> f2369e;

        /* renamed from: f */
        Future<PingResponse> f2370f;

        private C4989a() {
        }

        public /* synthetic */ C4989a(ExceptionDetector exceptionDetector, C4990a c4990a) {
            this();
        }
    }

    /* renamed from: a */
    public void m2295a() {
        NetworkStatusHelper.addStatusChangeListener(new C4990a(this));
    }

    /* renamed from: b */
    public void m2297b() throws JSONException {
        ALog.m2529e("anet.ExceptionDetector", "network detect start.", null, new Object[0]);
        SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        jSONObject2.put(NotificationCompat.CATEGORY_STATUS, status.getType());
        jSONObject2.put("subType", NetworkStatusHelper.getNetworkSubType());
        if (status != NetworkStatusHelper.NetworkStatus.NO) {
            if (status.isMobile()) {
                jSONObject2.put("apn", NetworkStatusHelper.getApn());
                jSONObject2.put(DispatchConstants.CARRIER, NetworkStatusHelper.getCarrier());
            } else {
                jSONObject2.put(DispatchConstants.BSSID, NetworkStatusHelper.getWifiBSSID());
                jSONObject2.put("ssid", NetworkStatusHelper.getWifiSSID());
            }
            jSONObject2.put("proxy", NetworkStatusHelper.getProxyType());
        }
        jSONObject.put("NetworkInfo", jSONObject2);
        String defaultGateway = status.isWifi() ? NetUtils.getDefaultGateway("114.114.114.114") : NetUtils.getPreferNextHop("114.114.114.114", 2);
        Future<PingResponse> futureLaunch = !TextUtils.isEmpty(defaultGateway) ? new PingTask(defaultGateway, 1000, 3, 0, 0).launch() : null;
        C4989a c4989aM2291a = m2291a("guide-acs.m.taobao.com", this.f2359b);
        C4989a c4989aM2291a2 = m2291a("gw.alicdn.com", this.f2361d);
        C4989a c4989aM2291a3 = m2291a("msgacs.m.taobao.com", this.f2360c);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("nextHop", defaultGateway);
        jSONObject3.put("ping", m2294a(futureLaunch));
        jSONObject.put("LocalDetect", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(m2293a(c4989aM2291a));
        jSONArray.put(m2293a(c4989aM2291a2));
        jSONArray.put(m2293a(c4989aM2291a3));
        jSONObject.put("InternetDetect", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        Iterator<Pair<String, Integer>> it = this.f2362e.iterator();
        while (it.hasNext()) {
            Pair<String, Integer> next = it.next();
            jSONObject4.put((String) next.first, next.second);
        }
        jSONObject.put("BizDetect", jSONObject4);
        this.f2362e.clear();
        ALog.m2529e("anet.ExceptionDetector", "network detect result: " + jSONObject.toString(), null, new Object[0]);
    }

    /* renamed from: c */
    public boolean m2298c() {
        if (this.f2362e.size() != 10) {
            return false;
        }
        if (NetworkStatusHelper.getStatus() == NetworkStatusHelper.NetworkStatus.NO) {
            ALog.m2529e("anet.ExceptionDetector", "no network", null, new Object[0]);
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < this.f2358a) {
            return false;
        }
        Iterator<Pair<String, Integer>> it = this.f2362e.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next().second).intValue();
            if (iIntValue == -202 || iIntValue == -400 || iIntValue == -401 || iIntValue == -405 || iIntValue == -406) {
                i10++;
            }
        }
        boolean z10 = i10 * 2 > 10;
        if (z10) {
            this.f2358a = jCurrentTimeMillis + 1800000;
        }
        return z10;
    }

    /* renamed from: a */
    public void m2296a(RequestStatistic requestStatistic) {
        if (AwcnConfig.isNetworkDetectEnable()) {
            ThreadPoolExecutorFactory.submitDetectTask(new RunnableC4992c(this, requestStatistic));
        } else {
            ALog.m2530i("anet.ExceptionDetector", "network detect closed.", null, new Object[0]);
        }
    }

    /* renamed from: a */
    private ArrayList<String> m2292a(String str, int i10) {
        PingResponse pingResponse;
        ArrayList<String> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str)) {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                String str2 = str;
                try {
                    pingResponse = (PingResponse) new PingTask(str2, 0, 1, 0, i12).launch().get();
                } catch (Exception unused) {
                    pingResponse = null;
                }
                StringBuilder sb2 = new StringBuilder();
                if (pingResponse != null) {
                    String lastHopIPStr = pingResponse.getLastHopIPStr();
                    double d10 = pingResponse.getResults()[0].rtt;
                    int errcode = pingResponse.getErrcode();
                    if (TextUtils.isEmpty(lastHopIPStr)) {
                        lastHopIPStr = "*";
                    }
                    sb2.append("hop=");
                    sb2.append(lastHopIPStr);
                    sb2.append(",rtt=");
                    sb2.append(d10);
                    sb2.append(",errCode=");
                    sb2.append(errcode);
                }
                arrayList.add(sb2.toString());
                str = str2;
                i11 = i12;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private C4989a m2291a(String str, String str2) {
        C4989a c4989a = new C4989a(this, null);
        c4989a.f2365a = str;
        try {
            c4989a.f2366b = InetAddress.getByName(str).getHostAddress();
        } catch (UnknownHostException unused) {
        }
        if (!TextUtils.isEmpty(str2)) {
            c4989a.f2367c = str2;
        } else {
            List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str);
            if (connStrategyListByHost != null && !connStrategyListByHost.isEmpty()) {
                c4989a.f2367c = connStrategyListByHost.get(0).getIp();
            }
        }
        String str3 = !TextUtils.isEmpty(c4989a.f2367c) ? c4989a.f2367c : c4989a.f2366b;
        if (!TextUtils.isEmpty(str3)) {
            c4989a.f2368d = new PingTask(str3, 1000, 3, 0, 0).launch();
            c4989a.f2369e = new PingTask(str3, 1000, 3, 1172, 0).launch();
            c4989a.f2370f = new PingTask(str3, 1000, 3, 1432, 0).launch();
        }
        return c4989a;
    }

    /* renamed from: a */
    private JSONObject m2293a(C4989a c4989a) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (c4989a != null && c4989a.f2368d != null) {
            jSONObject.put(Constants.KEY_HOST, c4989a.f2365a);
            jSONObject.put("currentIp", c4989a.f2367c);
            jSONObject.put("localIp", c4989a.f2366b);
            jSONObject.put("ping", m2294a(c4989a.f2368d));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("1200", m2294a(c4989a.f2369e));
            jSONObject2.put("1460", m2294a(c4989a.f2370f));
            jSONObject.put("MTU", jSONObject2);
            if ("guide-acs.m.taobao.com".equals(c4989a.f2365a)) {
                ArrayList<String> arrayListM2292a = m2292a(!TextUtils.isEmpty(c4989a.f2367c) ? c4989a.f2367c : c4989a.f2366b, 5);
                JSONObject jSONObject3 = new JSONObject();
                int i10 = 0;
                while (i10 < arrayListM2292a.size()) {
                    int i11 = i10 + 1;
                    jSONObject3.put(String.valueOf(i11), arrayListM2292a.get(i10));
                    i10 = i11;
                }
                jSONObject.put("traceRoute", jSONObject3);
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private JSONObject m2294a(Future<PingResponse> future) throws ExecutionException, JSONException, InterruptedException {
        PingResponse pingResponse;
        JSONObject jSONObject = new JSONObject();
        if (future != null) {
            try {
                pingResponse = future.get();
            } catch (Exception unused) {
                pingResponse = null;
            }
            if (pingResponse != null) {
                jSONObject.put("errCode", pingResponse.getErrcode());
                JSONArray jSONArray = new JSONArray();
                for (PingEntry pingEntry : pingResponse.getResults()) {
                    jSONArray.put("seq=" + pingEntry.seq + ",hop=" + pingEntry.hop + ",rtt=" + pingEntry.rtt);
                }
                jSONObject.put("response", jSONArray);
                return jSONObject;
            }
        }
        return jSONObject;
    }
}
