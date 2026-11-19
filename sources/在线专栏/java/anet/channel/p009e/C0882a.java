package anet.channel.p009e;

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
import org.android.agoo.common.AgooConstants;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: anet.channel.e.a */
/* loaded from: classes.dex */
public class C0882a {

    /* renamed from: a */
    private static b f5124a;

    /* renamed from: b */
    private static String f5125b;

    /* renamed from: f */
    private static SharedPreferences f5129f;

    /* renamed from: c */
    private static AtomicBoolean f5126c = new AtomicBoolean(false);

    /* renamed from: d */
    private static AtomicBoolean f5127d = new AtomicBoolean(false);

    /* renamed from: e */
    private static long f5128e = 21600000;

    /* renamed from: g */
    private static IStrategyFilter f5130g = new C0883b();

    /* renamed from: h */
    private static AtomicInteger f5131h = new AtomicInteger(1);

    /* renamed from: i */
    private static IStrategyListener f5132i = new C0884c();

    /* renamed from: j */
    private static NetworkStatusHelper.INetworkStatusChangeListener f5133j = new C0885d();

    /* renamed from: anet.channel.e.a$a */
    private static class a {

        /* renamed from: a */
        long f5134a;

        /* renamed from: b */
        boolean f5135b;

        private a() {
        }

        /* synthetic */ a(C0883b c0883b) {
            this();
        }
    }

    /* renamed from: b */
    public static boolean m4435b() {
        b bVar = f5124a;
        if (bVar != null) {
            return bVar.m4445b(NetworkStatusHelper.getUniqueId(NetworkStatusHelper.getStatus()));
        }
        return false;
    }

    /* renamed from: a */
    public static void m4432a(NetworkStatusHelper.NetworkStatus networkStatus) {
        if (!AwcnConfig.isHttp3Enable()) {
            ALog.m4639i("awcn.Http3ConnDetector", "startDetect", null, "http3 global config close.");
            return;
        }
        if (f5127d.get()) {
            ALog.m4638e("awcn.Http3ConnDetector", "tnet exception.", null, new Object[0]);
            return;
        }
        if (NetworkStatusHelper.isConnected()) {
            if (TextUtils.isEmpty(f5125b)) {
                ALog.m4638e("awcn.Http3ConnDetector", "startDetect", null, "host is null");
                return;
            }
            List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(f5125b, f5130g);
            if (connStrategyListByHost.isEmpty()) {
                ALog.m4638e("awcn.Http3ConnDetector", "startDetect", null, "http3 strategy is null.");
                return;
            }
            if (f5126c.compareAndSet(false, true)) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION).InitializeSecurityStuff();
                    ALog.m4638e("awcn.Http3ConnDetector", "tnet init http3.", null, "cost", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                } catch (Throwable th) {
                    ALog.m4637e("awcn.Http3ConnDetector", "tnet init http3 error.", null, th, new Object[0]);
                    f5127d.set(true);
                    return;
                }
            }
            if (f5124a == null) {
                f5124a = new b();
            }
            if (f5124a.m4444a(NetworkStatusHelper.getUniqueId(networkStatus))) {
                ThreadPoolExecutorFactory.submitDetectTask(new RunnableC0886e(connStrategyListByHost, networkStatus));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static IConnStrategy m4434b(IConnStrategy iConnStrategy) {
        return new C0888g(iConnStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: anet.channel.e.a$b */
    static class b {

        /* renamed from: a */
        private Map<String, a> f5136a = new ConcurrentHashMap();

        b() throws JSONException {
            m4441a();
        }

        /* renamed from: a */
        private void m4441a() throws JSONException {
            C0883b c0883b = null;
            String string = C0882a.f5129f.getString("networksdk_http3_history_records", null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i4);
                    a aVar = new a(c0883b);
                    String string2 = jSONObject.getString("networkUniqueId");
                    aVar.f5134a = jSONObject.getLong(AgooConstants.MESSAGE_TIME);
                    aVar.f5135b = jSONObject.getBoolean("enable");
                    if (m4442a(aVar.f5134a)) {
                        synchronized (this.f5136a) {
                            this.f5136a.put(string2, aVar);
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }

        /* renamed from: b */
        boolean m4445b(String str) {
            synchronized (this.f5136a) {
                a aVar = this.f5136a.get(str);
                if (aVar == null) {
                    return false;
                }
                return aVar.f5135b;
            }
        }

        /* renamed from: a */
        boolean m4444a(String str) {
            synchronized (this.f5136a) {
                a aVar = this.f5136a.get(str);
                boolean z3 = true;
                if (aVar == null) {
                    return true;
                }
                if (m4442a(aVar.f5134a)) {
                    z3 = false;
                }
                return z3;
            }
        }

        /* renamed from: a */
        private boolean m4442a(long j4) {
            return System.currentTimeMillis() - j4 < C0882a.f5128e;
        }

        /* renamed from: a */
        void m4443a(String str, boolean z3) {
            a aVar = new a(null);
            aVar.f5135b = z3;
            aVar.f5134a = System.currentTimeMillis();
            JSONArray jSONArray = new JSONArray();
            synchronized (this.f5136a) {
                this.f5136a.put(str, aVar);
                for (Map.Entry<String, a> entry : this.f5136a.entrySet()) {
                    String key = entry.getKey();
                    a value = entry.getValue();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("networkUniqueId", key);
                        jSONObject.put(AgooConstants.MESSAGE_TIME, value.f5134a);
                        jSONObject.put("enable", value.f5135b);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e4) {
                        e4.printStackTrace();
                    }
                }
            }
            C0882a.f5129f.edit().putString("networksdk_http3_history_records", jSONArray.toString()).apply();
        }
    }

    /* renamed from: a */
    public static void m4430a() {
        try {
            ALog.m4638e("awcn.Http3ConnDetector", "registerListener", null, "http3Enable", Boolean.valueOf(AwcnConfig.isHttp3Enable()));
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext());
            f5129f = defaultSharedPreferences;
            f5125b = defaultSharedPreferences.getString("http3_detector_host", "");
            m4432a(NetworkStatusHelper.getStatus());
            NetworkStatusHelper.addStatusChangeListener(f5133j);
            StrategyCenter.getInstance().registerListener(f5132i);
        } catch (Exception e4) {
            ALog.m4637e("awcn.Http3ConnDetector", "[registerListener]error", null, e4, new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m4431a(long j4) {
        if (j4 < 0) {
            return;
        }
        f5128e = j4;
    }

    /* renamed from: a */
    public static void m4433a(boolean z3) {
        b bVar = f5124a;
        if (bVar != null) {
            bVar.m4443a(NetworkStatusHelper.getUniqueId(NetworkStatusHelper.getStatus()), z3);
        }
    }
}
