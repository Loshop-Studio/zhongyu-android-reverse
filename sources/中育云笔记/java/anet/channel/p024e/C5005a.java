package anet.channel.p024e;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyFilter;
import anet.channel.strategy.IStrategyListener;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: anet.channel.e.a */
/* loaded from: classes3.dex */
public class C5005a {

    /* renamed from: a */
    private static b f2402a;

    /* renamed from: b */
    private static String f2403b;

    /* renamed from: f */
    private static SharedPreferences f2407f;

    /* renamed from: c */
    private static AtomicBoolean f2404c = new AtomicBoolean(false);

    /* renamed from: d */
    private static AtomicBoolean f2405d = new AtomicBoolean(false);

    /* renamed from: e */
    private static long f2406e = 21600000;

    /* renamed from: g */
    private static IStrategyFilter f2408g = new C5006b();

    /* renamed from: h */
    private static AtomicInteger f2409h = new AtomicInteger(1);

    /* renamed from: i */
    private static IStrategyListener f2410i = new C5007c();

    /* renamed from: j */
    private static NetworkStatusHelper.INetworkStatusChangeListener f2411j = new C5008d();

    /* renamed from: anet.channel.e.a$a */
    public static class a {

        /* renamed from: a */
        long f2412a;

        /* renamed from: b */
        boolean f2413b;

        private a() {
        }

        public /* synthetic */ a(C5006b c5006b) {
            this();
        }
    }

    /* renamed from: b */
    public static boolean m2326b() {
        b bVar = f2402a;
        if (bVar != null) {
            return bVar.m2336b(NetworkStatusHelper.getUniqueId(NetworkStatusHelper.getStatus()));
        }
        return false;
    }

    /* renamed from: a */
    public static void m2323a(NetworkStatusHelper.NetworkStatus networkStatus) {
        if (!AwcnConfig.isHttp3Enable()) {
            ALog.m2530i("awcn.Http3ConnDetector", "startDetect", null, "http3 global config close.");
            return;
        }
        if (f2405d.get()) {
            ALog.m2529e("awcn.Http3ConnDetector", "tnet exception.", null, new Object[0]);
            return;
        }
        if (NetworkStatusHelper.isConnected()) {
            if (TextUtils.isEmpty(f2403b)) {
                ALog.m2529e("awcn.Http3ConnDetector", "startDetect", null, "host is null");
                return;
            }
            List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(f2403b, f2408g);
            if (connStrategyListByHost.isEmpty()) {
                ALog.m2529e("awcn.Http3ConnDetector", "startDetect", null, "http3 strategy is null.");
                return;
            }
            if (f2404c.compareAndSet(false, true)) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION).InitializeSecurityStuff();
                    ALog.m2529e("awcn.Http3ConnDetector", "tnet init http3.", null, "cost", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                } catch (Throwable th) {
                    ALog.m2528e("awcn.Http3ConnDetector", "tnet init http3 error.", null, th, new Object[0]);
                    f2405d.set(true);
                    return;
                }
            }
            if (f2402a == null) {
                f2402a = new b();
            }
            if (f2402a.m2335a(NetworkStatusHelper.getUniqueId(networkStatus))) {
                ThreadPoolExecutorFactory.submitDetectTask(new RunnableC5009e(connStrategyListByHost, networkStatus));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static IConnStrategy m2325b(IConnStrategy iConnStrategy) {
        return new C5011g(iConnStrategy);
    }

    /* renamed from: anet.channel.e.a$b */
    public static class b {

        /* renamed from: a */
        private Map<String, a> f2414a = new ConcurrentHashMap();

        public b() throws JSONException {
            m2332a();
        }

        /* renamed from: a */
        private void m2332a() throws JSONException {
            C5006b c5006b = null;
            String string = C5005a.f2407f.getString("networksdk_http3_history_records", null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i10);
                    a aVar = new a(c5006b);
                    String string2 = jSONObject.getString("networkUniqueId");
                    aVar.f2412a = jSONObject.getLong("time");
                    aVar.f2413b = jSONObject.getBoolean("enable");
                    if (m2333a(aVar.f2412a)) {
                        synchronized (this.f2414a) {
                            this.f2414a.put(string2, aVar);
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }

        /* renamed from: b */
        public boolean m2336b(String str) {
            synchronized (this.f2414a) {
                try {
                    a aVar = this.f2414a.get(str);
                    if (aVar == null) {
                        return false;
                    }
                    return aVar.f2413b;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* renamed from: a */
        public boolean m2335a(String str) {
            synchronized (this.f2414a) {
                try {
                    if (this.f2414a.get(str) == null) {
                        return true;
                    }
                    return !m2333a(r5.f2412a);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* renamed from: a */
        private boolean m2333a(long j10) {
            return System.currentTimeMillis() - j10 < C5005a.f2406e;
        }

        /* renamed from: a */
        public void m2334a(String str, boolean z10) {
            a aVar = new a(null);
            aVar.f2413b = z10;
            aVar.f2412a = System.currentTimeMillis();
            JSONArray jSONArray = new JSONArray();
            synchronized (this.f2414a) {
                this.f2414a.put(str, aVar);
                for (Map.Entry<String, a> entry : this.f2414a.entrySet()) {
                    String key = entry.getKey();
                    a value = entry.getValue();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("networkUniqueId", key);
                        jSONObject.put("time", value.f2412a);
                        jSONObject.put("enable", value.f2413b);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            C5005a.f2407f.edit().putString("networksdk_http3_history_records", jSONArray.toString()).apply();
        }
    }

    /* renamed from: a */
    public static void m2321a() {
        try {
            ALog.m2529e("awcn.Http3ConnDetector", "registerListener", null, "http3Enable", Boolean.valueOf(AwcnConfig.isHttp3Enable()));
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext());
            f2407f = defaultSharedPreferences;
            f2403b = defaultSharedPreferences.getString("http3_detector_host", "");
            m2323a(NetworkStatusHelper.getStatus());
            NetworkStatusHelper.addStatusChangeListener(f2411j);
            StrategyCenter.getInstance().registerListener(f2410i);
        } catch (Exception e10) {
            ALog.m2528e("awcn.Http3ConnDetector", "[registerListener]error", null, e10, new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m2322a(long j10) {
        if (j10 < 0) {
            return;
        }
        f2406e = j10;
    }

    /* renamed from: a */
    public static void m2324a(boolean z10) {
        b bVar = f2402a;
        if (bVar != null) {
            bVar.m2334a(NetworkStatusHelper.getUniqueId(NetworkStatusHelper.getStatus()), z10);
        }
    }
}
