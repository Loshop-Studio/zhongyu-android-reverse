package anet.channel;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;
import anet.channel.Config;
import anet.channel.detect.C5003n;
import anet.channel.entity.C5014c;
import anet.channel.entity.ConnType;
import anet.channel.entity.ENV;
import anet.channel.p024e.C5005a;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.C5070l;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IStrategyListener;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.C5091i;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import anet.channel.util.Utils;
import anetwork.channel.util.RequestConstant;
import com.taobao.accs.common.Constants;
import java.net.ConnectException;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* loaded from: classes3.dex */
public class SessionCenter {
    public static final String TAG = "awcn.SessionCenter";

    /* renamed from: a */
    static Map<Config, SessionCenter> f2294a = new HashMap();

    /* renamed from: j */
    private static boolean f2295j = false;

    /* renamed from: b */
    Context f2296b;

    /* renamed from: c */
    String f2297c;

    /* renamed from: d */
    Config f2298d;

    /* renamed from: e */
    final C5004e f2299e = new C5004e();

    /* renamed from: f */
    final LruCache<String, SessionRequest> f2300f = new LruCache<>(32);

    /* renamed from: g */
    final C4984c f2301g = new C4984c();

    /* renamed from: h */
    final AccsSessionManager f2302h;

    /* renamed from: i */
    final C4969a f2303i;

    private SessionCenter(Config config) {
        C4969a c4969a = new C4969a(this, null);
        this.f2303i = c4969a;
        this.f2296b = GlobalAppRuntimeInfo.getContext();
        this.f2298d = config;
        this.f2297c = config.getAppkey();
        c4969a.m2249a();
        this.f2302h = new AccsSessionManager(this);
        if (config.getAppkey().equals("[default]")) {
            return;
        }
        AmdcRuntimeInfo.setSign(new C4987d(this, config.getAppkey(), config.getSecurity()));
    }

    public static void checkAndStartAccsSession() {
        Iterator<SessionCenter> it = f2294a.values().iterator();
        while (it.hasNext()) {
            it.next().f2302h.checkAndStartSession();
        }
    }

    public static synchronized SessionCenter getInstance(String str) {
        Config configByTag;
        configByTag = Config.getConfigByTag(str);
        if (configByTag == null) {
            throw new RuntimeException("tag not exist!");
        }
        return getInstance(configByTag);
    }

    public static synchronized void init(Context context) {
        try {
            if (context == null) {
                ALog.m2529e(TAG, "context is null!", null, new Object[0]);
                throw new NullPointerException("init failed. context is null");
            }
            GlobalAppRuntimeInfo.setContext(context.getApplicationContext());
            if (!f2295j) {
                Map<Config, SessionCenter> map = f2294a;
                Config config = Config.DEFAULT_CONFIG;
                map.put(config, new SessionCenter(config));
                AppLifecycle.initialize();
                NetworkStatusHelper.startListener(context);
                if (!AwcnConfig.isTbNextLaunch()) {
                    StrategyCenter.getInstance().initialize(GlobalAppRuntimeInfo.getContext());
                }
                if (GlobalAppRuntimeInfo.isTargetProcess()) {
                    C5003n.m2311a();
                    C5005a.m2321a();
                }
                f2295j = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void switchEnvironment(ENV env) {
        try {
            if (GlobalAppRuntimeInfo.getEnv() != env) {
                ALog.m2530i(TAG, "switch env", null, "old", GlobalAppRuntimeInfo.getEnv(), "new", env);
                GlobalAppRuntimeInfo.setEnv(env);
                StrategyCenter.getInstance().switchEnv();
                SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION).switchAccsServer(env == ENV.TEST ? 0 : 1);
            }
            Iterator<Map.Entry<Config, SessionCenter>> it = f2294a.entrySet().iterator();
            while (it.hasNext()) {
                SessionCenter value = it.next().getValue();
                if (value.f2298d.getEnv() != env) {
                    ALog.m2530i(TAG, "remove instance", value.f2297c, RequestConstant.ENVIRONMENT, value.f2298d.getEnv());
                    value.f2302h.forceCloseSession(false);
                    value.f2303i.m2250b();
                    it.remove();
                }
            }
        } finally {
        }
    }

    public void asyncGet(HttpUrl httpUrl, int i10, long j10, SessionGetCallback sessionGetCallback) {
        if (sessionGetCallback == null) {
            throw new NullPointerException("cb is null");
        }
        if (j10 <= 0) {
            throw new InvalidParameterException("timeout must > 0");
        }
        try {
            m2248b(httpUrl, i10, j10, sessionGetCallback);
        } catch (Exception unused) {
            sessionGetCallback.onSessionGetFail();
        }
    }

    /* renamed from: b */
    public void m2248b(HttpUrl httpUrl, int i10, long j10, SessionGetCallback sessionGetCallback) throws ConnectException {
        SessionInfo sessionInfoM2282b;
        if (!f2295j) {
            ALog.m2529e(TAG, "getInternal not inited!", this.f2297c, new Object[0]);
            throw new IllegalStateException("getInternal not inited");
        }
        if (httpUrl == null) {
            throw new InvalidParameterException("httpUrl is null");
        }
        if (sessionGetCallback == null) {
            throw new InvalidParameterException("sessionGetCallback is null");
        }
        ALog.m2527d(TAG, "getInternal", this.f2297c, "u", httpUrl.urlString(), "sessionType", i10 == C5014c.f2428a ? "LongLink" : "ShortLink", "timeout", Long.valueOf(j10));
        SessionRequest sessionRequestM2240a = m2240a(httpUrl);
        Session sessionM2313a = this.f2299e.m2313a(sessionRequestM2240a, i10);
        if (sessionM2313a != null) {
            ALog.m2527d(TAG, "get internal hit cache session", this.f2297c, "session", sessionM2313a);
            sessionGetCallback.onSessionGetSuccess(sessionM2313a);
            return;
        }
        if (this.f2298d == Config.DEFAULT_CONFIG && i10 != C5014c.f2429b) {
            sessionGetCallback.onSessionGetFail();
            return;
        }
        if (GlobalAppRuntimeInfo.isAppBackground() && i10 == C5014c.f2428a && AwcnConfig.isAccsSessionCreateForbiddenInBg() && (sessionInfoM2282b = this.f2301g.m2282b(httpUrl.host())) != null && sessionInfoM2282b.isAccs) {
            ALog.m2532w(TAG, "app background, forbid to create accs session", this.f2297c, new Object[0]);
            throw new ConnectException("accs session connecting forbidden in background");
        }
        sessionRequestM2240a.m2267b(this.f2296b, i10, C5091i.m2554a(this.f2297c), sessionGetCallback, j10);
    }

    @Deprecated
    public void enterBackground() {
        AppLifecycle.onBackground();
    }

    @Deprecated
    public void enterForeground() {
        AppLifecycle.onForeground();
    }

    public void forceRecreateAccsSession() {
        this.f2302h.forceCloseSession(true);
    }

    public Session get(String str, long j10) {
        return get(HttpUrl.parse(str), C5014c.f2430c, j10);
    }

    public Session getThrowsException(String str, long j10) {
        return m2246a(HttpUrl.parse(str), C5014c.f2430c, j10, null);
    }

    public void registerAccsSessionListener(ISessionListener iSessionListener) {
        this.f2302h.registerListener(iSessionListener);
    }

    public void registerPublicKey(String str, int i10) {
        this.f2301g.m2281a(str, i10);
    }

    public void registerSessionInfo(SessionInfo sessionInfo) {
        this.f2301g.m2280a(sessionInfo);
        if (sessionInfo.isKeepAlive) {
            this.f2302h.checkAndStartSession();
        }
    }

    @Deprecated
    public synchronized void switchEnv(ENV env) {
        switchEnvironment(env);
    }

    public void unregisterAccsSessionListener(ISessionListener iSessionListener) {
        this.f2302h.unregisterListener(iSessionListener);
    }

    public void unregisterSessionInfo(String str) {
        SessionInfo sessionInfoM2278a = this.f2301g.m2278a(str);
        if (sessionInfoM2278a == null || !sessionInfoM2278a.isKeepAlive) {
            return;
        }
        this.f2302h.checkAndStartSession();
    }

    /* renamed from: anet.channel.SessionCenter$a */
    public class C4969a implements NetworkStatusHelper.INetworkStatusChangeListener, IStrategyListener, AppLifecycle.AppLifecycleListener {

        /* renamed from: a */
        boolean f2304a;

        private C4969a() {
            this.f2304a = false;
        }

        /* renamed from: a */
        public void m2249a() {
            AppLifecycle.registerLifecycleListener(this);
            NetworkStatusHelper.addStatusChangeListener(this);
            StrategyCenter.getInstance().registerListener(this);
        }

        /* renamed from: b */
        public void m2250b() {
            StrategyCenter.getInstance().unregisterListener(this);
            AppLifecycle.unregisterLifecycleListener(this);
            NetworkStatusHelper.removeStatusChangeListener(this);
        }

        @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
        public void background() {
            ALog.m2530i(SessionCenter.TAG, "[background]", SessionCenter.this.f2297c, new Object[0]);
            if (!SessionCenter.f2295j) {
                ALog.m2529e(SessionCenter.TAG, "background not inited!", SessionCenter.this.f2297c, new Object[0]);
                return;
            }
            try {
                StrategyCenter.getInstance().saveData();
                if (AwcnConfig.isAccsSessionCreateForbiddenInBg() && "OPPO".equalsIgnoreCase(Build.BRAND)) {
                    ALog.m2530i(SessionCenter.TAG, "close session for OPPO", SessionCenter.this.f2297c, new Object[0]);
                    SessionCenter.this.f2302h.forceCloseSession(false);
                }
            } catch (Exception unused) {
            }
        }

        @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
        public void forground() {
            ALog.m2530i(SessionCenter.TAG, "[forground]", SessionCenter.this.f2297c, new Object[0]);
            if (SessionCenter.this.f2296b == null || this.f2304a) {
                return;
            }
            this.f2304a = true;
            try {
                if (!SessionCenter.f2295j) {
                    ALog.m2529e(SessionCenter.TAG, "forground not inited!", SessionCenter.this.f2297c, new Object[0]);
                    return;
                }
                try {
                    if (AppLifecycle.lastEnterBackgroundTime == 0 || System.currentTimeMillis() - AppLifecycle.lastEnterBackgroundTime <= 60000) {
                        SessionCenter.this.f2302h.checkAndStartSession();
                    } else {
                        SessionCenter.this.f2302h.forceCloseSession(true);
                    }
                } catch (Exception unused) {
                } catch (Throwable th) {
                    this.f2304a = false;
                    throw th;
                }
                this.f2304a = false;
            } catch (Exception unused2) {
            }
        }

        @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
        public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
            ALog.m2529e(SessionCenter.TAG, "onNetworkStatusChanged.", SessionCenter.this.f2297c, "networkStatus", networkStatus);
            List<SessionRequest> listM2314a = SessionCenter.this.f2299e.m2314a();
            if (!listM2314a.isEmpty()) {
                for (SessionRequest sessionRequest : listM2314a) {
                    ALog.m2527d(SessionCenter.TAG, "network change, try recreate session", SessionCenter.this.f2297c, new Object[0]);
                    sessionRequest.m2264a((String) null);
                }
            }
            SessionCenter.this.f2302h.checkAndStartSession();
        }

        @Override // anet.channel.strategy.IStrategyListener
        public void onStrategyUpdated(C5070l.d dVar) {
            SessionCenter.this.m2243a(dVar);
            SessionCenter.this.f2302h.checkAndStartSession();
        }

        public /* synthetic */ C4969a(SessionCenter sessionCenter, C4987d c4987d) {
            this();
        }
    }

    @Deprecated
    public Session get(String str, ConnType.TypeLevel typeLevel, long j10) {
        return get(HttpUrl.parse(str), typeLevel == ConnType.TypeLevel.SPDY ? C5014c.f2428a : C5014c.f2429b, j10);
    }

    @Deprecated
    public Session getThrowsException(String str, ConnType.TypeLevel typeLevel, long j10) {
        return m2246a(HttpUrl.parse(str), typeLevel == ConnType.TypeLevel.SPDY ? C5014c.f2428a : C5014c.f2429b, j10, null);
    }

    /* renamed from: a */
    private SessionRequest m2240a(HttpUrl httpUrl) {
        String cNameByHost = StrategyCenter.getInstance().getCNameByHost(httpUrl.host());
        if (cNameByHost == null) {
            cNameByHost = httpUrl.host();
        }
        String strScheme = httpUrl.scheme();
        if (!httpUrl.isSchemeLocked()) {
            strScheme = StrategyCenter.getInstance().getSchemeByHost(cNameByHost, strScheme);
        }
        return m2247a(StringUtils.concatString(strScheme, "://", cNameByHost));
    }

    @Deprecated
    public Session get(HttpUrl httpUrl, ConnType.TypeLevel typeLevel, long j10) {
        return get(httpUrl, typeLevel == ConnType.TypeLevel.SPDY ? C5014c.f2428a : C5014c.f2429b, j10);
    }

    public Session getThrowsException(HttpUrl httpUrl, int i10, long j10) {
        return m2246a(httpUrl, i10, j10, null);
    }

    public Session get(HttpUrl httpUrl, int i10, long j10) {
        try {
            return m2246a(httpUrl, i10, j10, null);
        } catch (NoAvailStrategyException e10) {
            ALog.m2530i(TAG, "[Get]" + e10.getMessage(), this.f2297c, null, "url", httpUrl.urlString());
            return null;
        } catch (ConnectException e11) {
            ALog.m2529e(TAG, "[Get]connect exception", this.f2297c, "errMsg", e11.getMessage(), "url", httpUrl.urlString());
            return null;
        } catch (InvalidParameterException e12) {
            ALog.m2528e(TAG, "[Get]param url is invalid", this.f2297c, e12, "url", httpUrl);
            return null;
        } catch (TimeoutException e13) {
            ALog.m2528e(TAG, "[Get]timeout exception", this.f2297c, e13, "url", httpUrl.urlString());
            return null;
        } catch (Exception e14) {
            ALog.m2528e(TAG, "[Get]" + e14.getMessage(), this.f2297c, null, "url", httpUrl.urlString());
            return null;
        }
    }

    @Deprecated
    public Session getThrowsException(HttpUrl httpUrl, ConnType.TypeLevel typeLevel, long j10) {
        return m2246a(httpUrl, typeLevel == ConnType.TypeLevel.SPDY ? C5014c.f2428a : C5014c.f2429b, j10, null);
    }

    public static synchronized SessionCenter getInstance(Config config) {
        SessionCenter sessionCenter;
        Context appContext;
        try {
            if (config != null) {
                if (!f2295j && (appContext = Utils.getAppContext()) != null) {
                    init(appContext);
                }
                sessionCenter = f2294a.get(config);
                if (sessionCenter == null) {
                    sessionCenter = new SessionCenter(config);
                    f2294a.put(config, sessionCenter);
                }
            } else {
                throw new NullPointerException("config is null!");
            }
        } catch (Throwable th) {
            throw th;
        }
        return sessionCenter;
    }

    /* renamed from: a */
    public Session m2246a(HttpUrl httpUrl, int i10, long j10, SessionGetCallback sessionGetCallback) throws ConnectException {
        SessionInfo sessionInfoM2282b;
        if (!f2295j) {
            ALog.m2529e(TAG, "getInternal not inited!", this.f2297c, new Object[0]);
            throw new IllegalStateException("getInternal not inited");
        }
        if (httpUrl != null) {
            ALog.m2527d(TAG, "getInternal", this.f2297c, "u", httpUrl.urlString(), "sessionType", i10 == C5014c.f2428a ? "LongLink" : "ShortLink", "timeout", Long.valueOf(j10));
            SessionRequest sessionRequestM2240a = m2240a(httpUrl);
            Session sessionM2313a = this.f2299e.m2313a(sessionRequestM2240a, i10);
            if (sessionM2313a != null) {
                ALog.m2527d(TAG, "get internal hit cache session", this.f2297c, "session", sessionM2313a);
                return sessionM2313a;
            }
            if (this.f2298d == Config.DEFAULT_CONFIG && i10 != C5014c.f2429b) {
                if (sessionGetCallback == null) {
                    return null;
                }
                sessionGetCallback.onSessionGetFail();
                return null;
            }
            if (GlobalAppRuntimeInfo.isAppBackground() && i10 == C5014c.f2428a && AwcnConfig.isAccsSessionCreateForbiddenInBg() && (sessionInfoM2282b = this.f2301g.m2282b(httpUrl.host())) != null && sessionInfoM2282b.isAccs) {
                ALog.m2532w(TAG, "app background, forbid to create accs session", this.f2297c, new Object[0]);
                throw new ConnectException("accs session connecting forbidden in background");
            }
            sessionRequestM2240a.m2260a(this.f2296b, i10, C5091i.m2554a(this.f2297c), sessionGetCallback, j10);
            if (sessionGetCallback != null || j10 <= 0 || (i10 != C5014c.f2430c && sessionRequestM2240a.m2266b() != i10)) {
                return sessionM2313a;
            }
            sessionRequestM2240a.m2259a(j10);
            Session sessionM2313a2 = this.f2299e.m2313a(sessionRequestM2240a, i10);
            if (sessionM2313a2 != null) {
                return sessionM2313a2;
            }
            throw new ConnectException("session connecting failed or timeout");
        }
        throw new InvalidParameterException("httpUrl is null");
    }

    @Deprecated
    public static synchronized SessionCenter getInstance() {
        Context appContext;
        try {
            if (!f2295j && (appContext = Utils.getAppContext()) != null) {
                init(appContext);
            }
            SessionCenter sessionCenter = null;
            for (Map.Entry<Config, SessionCenter> entry : f2294a.entrySet()) {
                SessionCenter value = entry.getValue();
                if (entry.getKey() != Config.DEFAULT_CONFIG) {
                    return value;
                }
                sessionCenter = value;
            }
            return sessionCenter;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Deprecated
    public static synchronized void init(Context context, String str) {
        init(context, str, GlobalAppRuntimeInfo.getEnv());
    }

    public static synchronized void init(Context context, String str, ENV env) {
        try {
            if (context != null) {
                Config config = Config.getConfig(str, env);
                if (config == null) {
                    config = new Config.Builder().setAppkey(str).setEnv(env).build();
                }
                init(context, config);
            } else {
                ALog.m2529e(TAG, "context is null!", null, new Object[0]);
                throw new NullPointerException("init failed. context is null");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    private void m2245b(C5070l.b bVar) {
        int i10;
        ALog.m2530i(TAG, "find effectNow", this.f2297c, Constants.KEY_HOST, bVar.f2696a);
        C5070l.a[] aVarArr = bVar.f2703h;
        String[] strArr = bVar.f2701f;
        for (Session session : this.f2299e.m2315a(m2247a(StringUtils.buildKey(bVar.f2698c, bVar.f2696a)))) {
            if (!session.getConnType().isHttpType()) {
                int i11 = 0;
                while (true) {
                    if (i11 < strArr.length) {
                        if (session.getIp().equals(strArr[i11])) {
                            while (true) {
                                if (i10 < aVarArr.length) {
                                    i10 = (session.getPort() == aVarArr[i10].f2688a && session.getConnType().equals(ConnType.valueOf(ConnProtocol.valueOf(aVarArr[i10])))) ? 0 : i10 + 1;
                                } else {
                                    if (ALog.isPrintLog(2)) {
                                        ALog.m2530i(TAG, "aisle not match", session.f2283p, IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, Integer.valueOf(session.getPort()), "connType", session.getConnType(), "aisle", Arrays.toString(aVarArr));
                                    }
                                    session.close(true);
                                }
                            }
                        } else {
                            i11++;
                        }
                    } else {
                        if (ALog.isPrintLog(2)) {
                            ALog.m2530i(TAG, "ip not match", session.f2283p, "session ip", session.getIp(), "ips", Arrays.toString(strArr));
                        }
                        session.close(true);
                    }
                }
            }
        }
    }

    public static synchronized void init(Context context, Config config) {
        if (context == null) {
            ALog.m2529e(TAG, "context is null!", null, new Object[0]);
            throw new NullPointerException("init failed. context is null");
        }
        if (config != null) {
            init(context);
            if (!f2294a.containsKey(config)) {
                f2294a.put(config, new SessionCenter(config));
            }
        } else {
            ALog.m2529e(TAG, "paramter config is null!", null, new Object[0]);
            throw new NullPointerException("init failed. config is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m2243a(C5070l.d dVar) {
        try {
            for (C5070l.b bVar : dVar.f2711b) {
                if (bVar.f2706k) {
                    m2245b(bVar);
                }
                if (bVar.f2700e != null) {
                    m2242a(bVar);
                }
            }
        } catch (Exception e10) {
            ALog.m2528e(TAG, "checkStrategy failed", this.f2297c, e10, new Object[0]);
        }
    }

    /* renamed from: a */
    private void m2242a(C5070l.b bVar) {
        for (Session session : this.f2299e.m2315a(m2247a(StringUtils.buildKey(bVar.f2698c, bVar.f2696a)))) {
            if (!StringUtils.isStringEqual(session.f2279l, bVar.f2700e)) {
                ALog.m2530i(TAG, "unit change", session.f2283p, "session unit", session.f2279l, "unit", bVar.f2700e);
                session.close(true);
            }
        }
    }

    /* renamed from: a */
    public SessionRequest m2247a(String str) {
        SessionRequest sessionRequest;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f2300f) {
            try {
                sessionRequest = this.f2300f.get(str);
                if (sessionRequest == null) {
                    sessionRequest = new SessionRequest(str, this);
                    this.f2300f.put(str, sessionRequest);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sessionRequest;
    }
}
